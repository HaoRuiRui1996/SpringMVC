package com.test.entity;

<<<<<<< HEAD
=======
import org.springframework.web.multipart.MultipartFile;

>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
    @NotNull
<<<<<<< HEAD
=======
    @Size(min = 4)
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
    private String name;
    private Integer age;
    private String address;
    private String email;
<<<<<<< HEAD
    @Size(min = 5, max = 100)
    private String password;
=======
    @NotNull
    @Size(min = 5, max = 100 )
    private String password;
    private MultipartFile profilePicture;
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f

    public Person() {
    }

    public Person(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

<<<<<<< HEAD
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
=======
    public Person(String name, String email, String password, MultipartFile file) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.profilePicture = file;
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
    }

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

<<<<<<< HEAD
=======
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

    public MultipartFile getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(MultipartFile profilePicture) {
        this.profilePicture = profilePicture;
    }

>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
<<<<<<< HEAD
=======
                ", profilePicture=" + profilePicture +
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
                '}';
    }
}
