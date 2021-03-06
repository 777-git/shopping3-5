package utils;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import logic.User;

public class UserEntryValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object command, Errors errors) {

		User user = (User) command;

		if (!StringUtils.hasLength(user.getUserId())) {
			errors.rejectValue("userId", "error.required");
		}

		if (!StringUtils.hasLength(user.getPassword())) {
			errors.rejectValue("password", "error.required");
		}

		if (!StringUtils.hasLength(user.getUserName())) {
			errors.rejectValue("userName", "error.required");
		}

		if (!StringUtils.hasText(user.getPostCode())) {
			errors.rejectValue("postCode", "error.required");
		}

		if (!StringUtils.hasText(user.getAddress())) {
			errors.rejectValue("address", "error.required");
		}

		if (!StringUtils.hasText(user.getEmail())) {
			errors.rejectValue("email", "error.required");
		}

		if (!StringUtils.hasText(user.getHobby())) {
			errors.rejectValue("hobby", "error.required");
		}

		if (errors.hasErrors()) {
			// エラーが存在する場合メッセージ入力エラーメッセージ追加
			errors.reject("error.input.user");
		}
	}
}
