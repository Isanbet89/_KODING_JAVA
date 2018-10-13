package VASILYEV_SAMOUCHITEL_JAVA.static_nethods.example1;

public class static1 {
        public static void main(String args[]){

            //При обращении к статическому методу, объявленному и в родительском и дочернем классе
            //метод будет вызван исходя из типа поля (переменной). Car в дочернем или Vehicle в родительском
            Vehicle v = new Car();
            v.kmToMiles(10);
        }
}


