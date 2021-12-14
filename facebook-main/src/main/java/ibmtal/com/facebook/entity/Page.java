package ibmtal.com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pages")

public class Page {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="websites")
private String websites;
@Column(name="aboutus")
private String aboutus;
@Column (name="photo")
private String photo;
public Page() {
	super();
}
public Page(int id, String name, String websites, String aboutus, String photo) {
	super();
	this.id = id;
	this.name = name;
	this.websites = websites;
	this.aboutus = aboutus;
	this.photo = photo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getWebsites() {
	return websites;
}
public void setWebsites(String websites) {
	this.websites = websites;
}
public String getAboutus() {
	return aboutus;
}
public void setAboutus(String aboutus) {
	this.aboutus = aboutus;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}


}
