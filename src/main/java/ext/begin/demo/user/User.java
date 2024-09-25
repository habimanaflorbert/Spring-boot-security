package ext.begin.demo.user;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
public class User {
 
    
    
    @Id
    @SequenceGenerator(name="user_sequence",sequenceName = "user_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String fullName;
    
    @Column(nullable = false, unique = true)
    private String username;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
        
    @Column(nullable = false)
    private Boolean isActive=false;

            
    @Column(nullable = false)
    private Boolean isFirstLogin=false;
    
    @Column(nullable = false)
    private Boolean isAdmin=false;
    
    @Column(nullable = false)
    private Boolean isShopper=false;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    





    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Boolean getIsFirstLogin() {
        return isFirstLogin;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public Boolean getIsShopper() {
        return isShopper;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsFirstLogin(Boolean isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setIsShopper(Boolean isShopper) {
        this.isShopper = isShopper;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", fullName=" + fullName + ", username=" + username + ", email=" + email
                + ", password=" + password + ", isActive=" + isActive + ", isFirstLogin=" + isFirstLogin + ", isAdmin="
                + isAdmin + ", isShopper=" + isShopper + ", dateOfBirth=" + dateOfBirth + ", createdAt=" + createdAt
                + "]";
    }
    
    
    public User(){

    }
    

    public User(String fullName, String username, String email, String password, Boolean isActive, Boolean isFirstLogin,
            Boolean isAdmin, Boolean isShopper, LocalDate dateOfBirth, LocalDateTime createdAt) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.isFirstLogin = isFirstLogin;
        this.isAdmin = isAdmin;
        this.isShopper = isShopper;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
    }

    public User(Long id, String fullName, String username, String email, String password, Boolean isActive,
            Boolean isFirstLogin, Boolean isAdmin, Boolean isShopper, LocalDate dateOfBirth, LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.isFirstLogin = isFirstLogin;
        this.isAdmin = isAdmin;
        this.isShopper = isShopper;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
    }
  


    
    
}
