package Session7_1.Complete;

public abstract class Bird {

        private String kind;
        private boolean isFemale;
        public Bird(String kind, boolean isFemale){
            this.kind = kind;
            this.isFemale = isFemale;
        }

        public void layEggs(){
            if(isFemale) System.out.println(kind + " lays eggs.");
        }
}
