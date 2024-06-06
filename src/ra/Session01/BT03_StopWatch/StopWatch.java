package ra.Session01.BT03_StopWatch;

import java.time.LocalTime;
import java.util.Date;

public class StopWatch {

        private Date startTime;
        private Date endTime;
        public StopWatch() {
            this.startTime = new Date();
        }

        public Date getStartTime() {
            return startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getEndTime() {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public void start(){
            this.startTime = new Date();
        }
        public void stop(){
            this.endTime = new Date();
        }
        public long getElapsedTime(){

            return endTime.getTime()-startTime.getTime();
        }
    }

