package mate.academy.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import java.util.List;

public class ShoppingCart {
    @MapsId
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    public ShoppingCart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
