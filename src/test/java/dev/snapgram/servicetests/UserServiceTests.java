//package dev.snapgram.servicetests;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.mockito.Mockito;
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;
//
//import dev.snapgram.entities.User;
//import dev.snapgram.exceptions.InvalidLoginException;
//import dev.snapgram.repositories.UserRepository;
//import dev.snapgram.services.UserService;
//import dev.snapgram.services.UserServiceImpl;
//
//@TestMethodOrder(OrderAnnotation.class) 
//class UserServiceTests {
//	
//	@Test
//	@Order(1)
//	void createUser() {
//		User bob = new User(1,"bobbyboy69@email.com","securepassword","bob","boberson");
//		
//		UserRepository uDao = Mockito.mock(UserRepository.class);
//		
//		Mockito.when(uDao.save(bob)).thenReturn(bob);
//		UserService uServ = new UserServiceImpl(uDao);
//		
//		Assertions.assertEquals(1, uServ.createUser(bob).getUserId());
//		
//	}
//	
//	@Test
//	@Order(2)
//	void getUserById() {
//		User bob = new User(1,"bobbyboy69@email.com","securepassword","bob","boberson");
//		
//		UserRepository uDao = Mockito.mock(UserRepository.class);
//		
//		Mockito.when(uDao.findById(1).get()).thenReturn(bob);
//		UserService uServ = new UserServiceImpl(uDao);
//		
//		Assertions.assertEquals(1, uServ.getUserById(1).getUserId());
//		
//	}
//	
//	@Test
//	@Order(3)
//	void getUserByUsername() {
//		// another dao method or, scrap the search feature?
//	}
//	
////	@Test
////	@Order(4)
////	void getUserByLogin() throws InvalidLoginException {
////		User bob = new User(1,"bobbyboy69@email.com","securepassword","bob","boberson");
////		
////		UserRepository uDao = Mockito.mock(UserRepository.class);
////		
////		Mockito.when(uDao.getByLogin("bobbyboy69@email.com","securepassword")).thenReturn(bob);
////		UserService uServ = new UserServiceImpl(uDao);
////		
////		Assertions.assertEquals("bob", uServ.getUserByLogin(bob.getUsername(), bob.getPassword()).getfName());
////	}
//
//}
