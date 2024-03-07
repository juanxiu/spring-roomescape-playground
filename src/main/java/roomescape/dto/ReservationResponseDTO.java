package roomescape.dto;

import roomescape.domain.Time;

public record ReservationResponseDTO(
        Long id,
        String name,
        String date,
        Time time
) {
}
