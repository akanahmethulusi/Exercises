public class Exercise {
    int a;

    public int transform(int a){
        return a*3+4;
    }

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        // new object created
        // Comment
        //new comment
        exercise.a = exercise.transform(5);// die zahl wird geändert.
        exercise.a = exercise.transform(exercise.a);
        System.out.println(" Transforming a: "+exercise.a);
    }

}
