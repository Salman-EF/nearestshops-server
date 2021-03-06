/**
 * Build By SALMAN EL FADILI
 **/
package com.nearbyshops.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document("users")
public class AppUser {

    @Id
    private String id;
    private String email;
    private String password;
    private boolean enabled;
    @DBRef
    Set<Role> roles;
    @DBRef
    List<Shop> preferredShops = new ArrayList<>();
    HashMap<String, Date> dislikedShops = new HashMap<>();

    public AppUser(){}
    public AppUser(String id) { this.id = id; }
    public AppUser(String id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    public AppUser(String email, String password, Set<Role> roles) {
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public Set<Role> getRoles() { return roles; }
    public void setRoles(Set<Role> roles) { this.roles = roles; }

    public List<Shop> getPreferredShops() { return preferredShops; }
    public void setPreferredShops(List<Shop> preferredShops) { this.preferredShops = preferredShops; }

    public HashMap<String, Date> getDislikedShops() { return dislikedShops; }
    public void setDislikedShops(HashMap<String, Date> dislikedShops) { this.dislikedShops = dislikedShops; }

    @Override
    public String toString() {
        return "AppUser{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", roles=" + roles +
                '}';
    }
}
