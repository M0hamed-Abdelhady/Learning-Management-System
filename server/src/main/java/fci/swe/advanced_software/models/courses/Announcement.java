package fci.swe.advanced_software.models.courses;

import fci.swe.advanced_software.models.AbstractEntity;
import fci.swe.advanced_software.models.users.AbstractUser;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class Announcement extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "posted_by", nullable = false)
    private AbstractUser postedBy;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private Timestamp postedAt;

    @OneToMany(mappedBy = "announcement_id", cascade = CascadeType.ALL)
    private List<Media> media;

    @OneToMany(mappedBy = "announcement_id", cascade = CascadeType.ALL)
    private List<AnnouncementComment> comments;
}
