//package com.example.demo;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.repository.CrudRepository;
//
//import com.example.demo.exceptions.ComplaintNotFoundException;
//import com.example.demo.model.FarmerComplaints;
//import com.example.demo.repository.farmerRepo;
//import com.example.demo.service.farmerService;
//
//@SpringBootTest
//public class TestCases {
//	@MockBean
//	farmerRepo repository;
//	@Autowired
//	farmerService servics;
//	@Test
//	public void getAllComplaints()
//	{
//		when(repository.findAll()).thenReturn(Stream.of(new FarmerComplaints(1,"seeds",8,"no complaints")).collect(Collectors.toList()));
//		assertEquals(1, servics.getAllComplaints().size());
//	}
//	
//	@Test
//	public void addComplaints()
//	{
//		FarmerComplaints complaints=new FarmerComplaints(5,"t",9,"efu");
//		when(repository.save(complaints)).thenReturn(complaints);
//		assertEquals(complaints, servics.addComlaints(complaints));
//	}
////	@Test
////	public void getComplaintsById() throws ComplaintNotFoundException {
////		
////		long id=402;
////		Optional<FarmerComplaints> complaints= repository.findById(id);
////		when(repository.findById(id)).thenReturn(complaints);
////		assertEquals(complaints, servics.getComplaintById(id));
////	}
//	
//	
////	@Test
////	public void deleteComplaints() throws ComplaintNotFoundException
////	{
////	long id=404;
////		FarmerComplaints complaints=new FarmerComplaints(5,"t",9,"efu");
////		servics.deleteComplaints(id);
////		((CrudRepository<FarmerComplaints, Long>) verify(repository.times(1))).delete(complaints);
////	}
////	
//
//	
////	@Test
////	public void updateComplaints() throws ComplaintNotFoundException
////	{
////		FarmerComplaints complaints=new FarmerComplaints(5,"t",9,"efu");
////		when(repository.save(complaints)).thenReturn(complaints);
////		assertEquals(complaints, servics.updateComplaints(complaints));
////	}
//
//}
