package com.task1.Serives;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task1.Entity.FacebookUsersEntity;
import com.task1.Repostry.UserRepository;
import com.task1.dto.UserReigtserDto;


@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public String userRegistration(UserReigtserDto userReigtserDto) {

		// convert dto to entity object
				FacebookUsersEntity user = new FacebookUsersEntity();
				user.setContact(userReigtserDto.getContact());
				user.setEmailId(userReigtserDto.getEmailId());
				user.setName(userReigtserDto.getName());
				user.setPassword(userReigtserDto.getPassword());

				// before save , we need verify in database is email existed or not
				Optional<FacebookUsersEntity> obj = repository.findById(user.getEmailId());
				if (obj.isPresent()) {
					return "Email Already In Use.  Please Try with New Email ID..";
				} else {
			repository.save(user);
		}

		return "User Registration Successfull.";
	}

	public String validateUser(String emailId, String password) {

		// Verify in data base
		List<FacebookUsersEntity> users = repository.findByEmailIdAndPassword(emailId, password);

		if (users.size() == 0) {
			return "Invalid Credentilas. Please Try again";
		} else {
			return "Welcome to FaceBook, " + emailId;
		}

	}

}