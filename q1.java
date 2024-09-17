// write a java program to accept details of 'n' cricket player (pid,pname,totalruns, 
// inning played,notouttime).calculate the average of all the players. 
// display the details of players having maximum average (use aaray of object

import java.util.Scanner;
class q1{

    int pid;
    String pname;
    int totalruns;
    int inning_played;
    int notouttime;

    void accept(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the player id");
        pid=sc.nextInt();
        System.out.println("enter the player name");
        pname=sc.next();
        System.out.println("enter the player totalruns");
        totalruns=sc.nextInt();
        System.out.println("enter the player inning_played");
        inning_played=sc.nextInt();
        System.out.println("enter the player notouttime");
        notouttime=sc.nextInt();
    }
    int avg(){
        return (totalruns+inning_played+notouttime)/3;
    }
    void display(){
        System.out.println("the id of the player is "+pid);
        System.out.println("the name of the player is "+pname);
        System.out.println("the totalruns of the player is "+totalruns);
        System.out.println("the inning_played of the player is "+inning_played);
        System.out.println("the notouttime of the player is "+notouttime);
        System.out.println("the avg of the player is "+avg());
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students ");
        int n = sc.nextInt();
        q1 c[]=new q1[n];
        for (int i = 0; i < c.length; i++) {
            System.out.println("enter the information of student "+(i+1));
            c[i] = new q1();
            c[i].accept();
        }
        int max_avj=0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if (c[i].avg()>c[j].avg()) {
                    max_avj=c[i].avg();
                }
            }
        }
       for (int i = 0; i < c.length; i++) {
            if (c[i].avg()==max_avj) {
                c[i].display();
            }
        }
    }
}