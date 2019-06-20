class alphabet {
    char alpha;

    void validate() {
        if ((alpha >= 'a')&&(alpha < 'z')) {
            System.out.println("the given alphabet is in small letter");
        } else {
            System.out.println("the given alpahabet is in Capital letters");
        }
    }

    public static void main(String args[]) {
        alphabet a = new alphabet();
        a.alpha = 'H';
        a.validate();
        alphabet b = new alphabet();
        b.alpha = 'k';
        b.validate();


    }
}