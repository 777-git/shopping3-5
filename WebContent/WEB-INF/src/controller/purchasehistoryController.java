package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import exception.LoginRequiredException;
import logic.Data;
import logic.Shop;
import logic.User;
import utils.WebConstants;

	@Controller
	public class purchasehistoryController {

		@Autowired
		private Shop shopService;

		@RequestMapping
		public ModelAndView index(HttpSession session) {

			// ログインを確認
			User loginUser = (User) session.getAttribute(WebConstants.USER_KEY);
			if (loginUser == null) {
				throw new LoginRequiredException("ログインしていません。");
			}

			// 購買履歴画面表示
			List<Data> datalist = this.shopService.getData(loginUser.getUserId());

			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("loginUser", loginUser);
			modelAndView.addObject("allHistory", datalist);
			return modelAndView;
		}
	}

