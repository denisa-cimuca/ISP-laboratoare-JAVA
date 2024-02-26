package isp.lab7.safehome;

import java.time.LocalDateTime;

public class AccessLog {
        private String tenantName;
        private LocalDateTime dateTime;
        private String operator;
        private DoorStatus doorStatus;
        private String errorMessage;

        public AccessLog ( String tenantName , LocalDateTime dateTime , DoorStatus doorStatus ) {
            this.tenantName = tenantName;
            this.dateTime = dateTime;
            this.doorStatus = doorStatus;
        }

        public String getTenantName ( ) {
            return tenantName;
        }

        public LocalDateTime getDateTime ( ) {
            return dateTime;
        }

        public DoorStatus getDoorStatus ( ) {
            return doorStatus;
        }

        public String toString(){
            return String.format("%s %s %S %s %S", tenantName,dateTime.toString(),operator,doorStatus,errorMessage);
        }
    }

