package com.example.airbnb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		private String name;
		private String socialName;		
		private String email;
		private String password;
		private String dateBirth;
		private String gender;
		
		protected Users() {}
		
		public Users(String name, String socialName, String email, String password, String dtBirth, String gender) {
		    this.name = name;
		    this.socialName = socialName;
		    this.email = email;
		    this.password = password;
		    this.dateBirth = dtBirth;
		    this.gender = gender;
	    }
		
		@Override
		public String toString() {
			return String.format("Users[id=%d, name='%s', socialName='%s', email='%s', password='%s', dateBirth='%s', gender='%s']", id, name, socialName, email, password, dateBirth, gender);
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSocialName() {
			return socialName;
		}

		public void setSocialName(String socialName) {
			this.socialName = socialName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getDtNasc() {
			return dateBirth;
		}

		public void setDtNasc(String dtBirth) {
			this.dateBirth = dtBirth;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		
}
