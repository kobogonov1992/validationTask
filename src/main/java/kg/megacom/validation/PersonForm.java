package kg.megacom.validation;

import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;




public class PersonForm {

    @NotNull
    @Pattern(regexp = "[A-Za-z]{1,12}",message = "Name must have from 2 - 30 letters")
    private String name;

    @NotNull(message = "Age can't be negative")
    @Min(value = 18,message = "Minimal age 18")
    @Max(value = 120,message = "Maximal age 120")
    private Integer age;

    @AssertTrue
    private boolean providedInfo;

    @NotEmpty
    @Email(message = "Example: name@gmail.com")
    private String email;

    @Min(1)
    @Max(5)
    @Positive
    private int experience;

    @PastOrPresent
    @NotNull
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date carierStart;

    @Future
    @NotNull
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date endContract;

    @Past
    @NotNull
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCarierStart() {
        return carierStart;
    }

    public void setCarierStart(Date carierStart) {
        this.carierStart = carierStart;
    }

    public Date getEndContract() {
        return endContract;
    }

    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }


//    @PastOrPresent
//    @NotNull
//    @DateTimeFormat(pattern="yyyy/MM/dd")
//    private LocalDate carierStart;
//
//    @Future
//    @NotNull
//    @DateTimeFormat(pattern="yyyy/MM/dd")
//    private LocalDate endContract;
//
//    @Past
//    @NotNull
//    @DateTimeFormat(pattern="yyyy/MM/dd")
//    private LocalDate birthday;
//
//    public LocalDate getCarierStart() {
//        return carierStart;
//    }
//
//    public void setCarierStart(LocalDate carierStart) {
//        this.carierStart = carierStart;
//    }
//
//    public LocalDate getEndContract() {
//        return endContract;
//    }
//
//    public void setEndContract(LocalDate endContract) {
//        this.endContract = endContract;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday = birthday;
//    }



    @NotBlank
    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$",message = "Пример IP: 11.12.23.432")
    private String ipAddress;

    public String getName() {
        return this.name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isProvidedInfo() {
        return providedInfo;
    }

    public void setProvidedInfo(boolean providedInfo) {
        this.providedInfo = providedInfo;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonForm() {
    }
}
