package dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@ToString
@Setter
@Getter
public class WarDTO implements Serializable {

        private String warName;
        private LocalDate startDate;
        private LocalDate endDate;
        private String location;
        private List<String> countriesInvolved;
        private int casualties;
        private String outcome;
        private int durationDays;
        private String commander;
        private String reason;

        public String getWarName() {
                return warName;
        }

        public void setWarName(String warName) {
                this.warName = warName;
        }

        public LocalDate getStartDate() {
                return startDate;
        }

        public void setStartDate(LocalDate startDate) {
                this.startDate = startDate;
        }

        public LocalDate getEndDate() {
                return endDate;
        }

        public void setEndDate(LocalDate endDate) {
                this.endDate = endDate;
        }

        public String getLocation() {
                return location;
        }

        public void setLocation(String location) {
                this.location = location;
        }

        public List<String> getCountriesInvolved() {
                return countriesInvolved;
        }

        public void setCountriesInvolved(List<String> countriesInvolved) {
                this.countriesInvolved = countriesInvolved;
        }

        public int getCasualties() {
                return casualties;
        }

        public void setCasualties(int casualties) {
                this.casualties = casualties;
        }

        public String getOutcome() {
                return outcome;
        }

        public void setOutcome(String outcome) {
                this.outcome = outcome;
        }

        public int getDurationDays() {
                return durationDays;
        }

        public void setDurationDays(int durationDays) {
                this.durationDays = durationDays;
        }

        public String getCommander() {
                return commander;
        }

        public void setCommander(String commander) {
                this.commander = commander;
        }

        public String getReason() {
                return reason;
        }

        public void setReason(String reason) {
                this.reason = reason;
        }

        @Override
        public String toString() {
                return "WarDTO{" +
                        "warName='" + warName + '\'' +
                        ", startDate=" + startDate +
                        ", endDate=" + endDate +
                        ", location='" + location + '\'' +
                        ", countriesInvolved=" + countriesInvolved +
                        ", casualties=" + casualties +
                        ", outcome='" + outcome + '\'' +
                        ", durationDays=" + durationDays +
                        ", commander='" + commander + '\'' +
                        ", reason='" + reason + '\'' +
                        '}';
        }
}
