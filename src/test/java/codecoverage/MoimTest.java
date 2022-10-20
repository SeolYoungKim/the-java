package codecoverage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MoimTest {

    @Test
    public void isFull() {
        Moim moim = new Moim();

        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 10;

        assertThat(moim.isEnrollmentFull()).isFalse();
    }

}