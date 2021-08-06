package io.confluent.demo.datamesh;

import io.confluent.demo.datamesh.cc.datacatalog.api.SubjectVersionService;
import io.confluent.demo.datamesh.cc.datacatalog.api.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DataMeshDemo {
	@Autowired
	SubjectVersionService svc;
	@Autowired
	TagService tsvc;

	public static void main(String[] args) {
		SpringApplication.run(DataMeshDemo.class, args);
	}

	@GetMapping("/testme")
	public String testMe() {
		return tsvc.getDataProductTagForSubjectVersion("lsrc-w8v85:.:users-value:1").toString();
		//return "no test function setup";
	}

	@GetMapping("/ruok")
	public String ruok() {
		return "imok";
	}
}