package corp.testing.example.core.task;

public interface PortableTask {
    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);
}