package com.example.reactProject.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.reactProject.entity.UserA;
import com.example.reactProject.entity.User;
import com.example.reactProject.service.UserAService;
import com.example.reactProject.service.UserService;

import lombok.RequiredArgsConstructor;



@RestController			// rendering 하지 않고, 데이터를 보내는 컨트롤러 (=ResponseBody 느낌)
@RequestMapping("/react")
@RequiredArgsConstructor
public class ReactController {
	private final UserAService useraService;
	private final UserService userService;
	@GetMapping("/data")
	public String data() {
		return "스프링부트에서 보낸 데이터";
	}
	
//	@GetMapping("/json")
//	public String json() {
//		JSONObject jObj = new JSONObject();
//		jObj.put("uid", "james");
//		jObj.put("uname", "제임스");
//		return jObj.toString();
//	}
	
	@GetMapping("/json")
	public String json() {
		JSONArray jArr = new JSONArray();
		List<UserA> userList = useraService.getUserAList();
		
		for(UserA user : userList) {
			JSONObject jObj = new JSONObject();	
			jObj.put("uid", user.getUid());
			jObj.put("uname", user.getUname());
			jObj.put("email", user.getEmail());
			jObj.put("regDate", user.getRegDate());
			
			jArr.add(jObj);
		}
		
		return jArr.toJSONString();
	}
	
	@PostMapping("/form")
	public String form(String uid, String uname) {
		System.out.println("uid=" + uid + ", uname=" + uname);
		return "uid=" + uid + ", uname=" + uname;
	}
	
	@PostMapping("/multi")
	public String form(String uid, String uname, MultipartFile file) {
		String msg = "uid=" + uid + ", uname=" + uname + ", fname=" + file.getOriginalFilename();
		System.out.println(msg);
		return msg;
	}
	
	@GetMapping("/users")
	public String users() {
		List<User> list =userService.getUserList(1);
		JSONObject jObj = new JSONObject();
		JSONArray jArr = new JSONArray();
		for (User user:list) {
			JSONObject jUser = new JSONObject();
			jUser.put("uid", user.getUid());
			jUser.put("pwd", user.getPwd());
			jUser.put("uname", user.getUname());
			jUser.put("email", user.getEmail());
			jUser.put("regDate", user.getRegDate().toString());
			jUser.put("isDeleted", user.getIsDeleted());
			jUser.put("profile", user.getProfile());
			jUser.put("github", user.getGithub());
			jUser.put("insta", user.getInsta());
			jUser.put("location", user.getLocation());
			jArr.add(jUser);
			
		}
		System.out.println(jArr);
		return jArr.toString();
			
	}
	
}
