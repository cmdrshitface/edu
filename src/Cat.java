class Cat {
    int age;

    public Cat(int catAge) {
        age = catAge;
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void catchMice(int miceCaught) {
        System.out.println("Your cat caught " + miceCaught + " mice today!");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Cat Max = new Cat(3);
        Max.sayMeow();
        Max.catchMice(5);
        int MaxAge = Max.getAge();
        System.out.println(MaxAge);
    }
}


