package com.example.demo.Chat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

	private static final String template = "Hello, %s!";

	@GetMapping(value = "/chat", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Chat getChat(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("GOOCHIE");
		//return new ResponseEntity<Chat>(new Chat("Stefan", "Hey there, how are you?", "Fri 10:23pm"), HttpStatus.OK);
		Chat outChat = new Chat("Stefan", "Hey there, how are you?", "Fri 10:23pm");

		System.out.println(outChat.toString());

		return outChat;
    }

	//@PostMapping("/chat")
	//ResponseEntity<?> submitChat(@RequestBody Chat chat) {

  		//EntityModel<Chat> entityModel = assembler.toModel(repository.save(submitChat));

  		//return ResponseEntity //
      //		.created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
      	//	.body(entityModel);
	//}
}