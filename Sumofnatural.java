class Sumofnatural {
    int sum(int n) {
        if (n <= 10) {
            return n;
            sum(n+1);
        } 
        else{
            return 0;
        }
    }

    public static void main(String args[]) {
        Sumofnatural ob = new Sumofnatural();
        ob.sum(1);
        System.out.println("start!");
    }
}

//5+add(5-1)
//5+4+add(4-1)
//5+4+3+add(3-1)
//5+4+3+2+add(2-1)
//5+4+3+2+1+add(1-1)
//5+4+3+2+1+ returns 0