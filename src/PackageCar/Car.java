package PackageCar;

    public class Car {
      private  int yar;
      private  String color;
    //non
      public Car(){
          this.yar=2004;
          this.color=color;
      }
      // one
      public Car(int yar){
          this.yar=2006;
          this.color=color;
      }
      //Two
      public Car(int yar,String color){
          this.yar=2008;
          this.color=color;

      }

        public int getYar() {
            return yar;
        }

        public void setYar(int yar) {
            this.yar = yar;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

