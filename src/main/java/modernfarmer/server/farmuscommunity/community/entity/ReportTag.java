package modernfarmer.server.farmuscommunity.community.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "report_tag")
public class ReportTag extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_tag_id", nullable = false)
    private Long id;

    @Size(max = 30)
    @NotNull
    @Column(name = "report_reason", nullable = false, length = 30)
    private String reportReason;

}