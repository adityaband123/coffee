package multithreding;
/*

Life Cycle Of Thread:


                                                               in combination these both stages are called as ACTIVE stage
                                                              /
                                                            /
                   start()              __________________/______________________       run method exit or stop()
                                      /                                        /
                    RUN      -->>   /     RUNNABLE    -->>        RUNNING    /   -->>    TERMINATED 
                                  /           ^                       /     /
                                /_____________\____________________/_____/
                                               \                 /
                                                \              /
                                                 \           / 
                                                  \        /  
                                                   \     /
                                                    \  /
                                                       
                                                NON_RUNNABLE
                                                (blocked)


steps in which a thread is go with all its life from start to end:
     
1)first of all the when we create the object of the class ,thread is in new phase  

2)then afrer calling the start it will go to the runnable stage;
     - runnable is the stage called as the waiting stage all the upcoming threads wait till the thread scheduler doesen't call the  perticular thread ....at the same time their may be any  of the thred  is in the running stage . 
3)when this thread finishes its task then the thread schedulear will alocate the place to the thread which is waiting in the runable     
     stage (waiting) in the running stage.
4)but any of the reason if the the thread which is working in the running stage get suspanded ...then this thread will go to the   
     NON_RUNNABLE stage and will wait till it come out of the suspanded stage (the reason may be it go in the sleep stage or any other ) as it come out of suspanded stage it will not go directally to the runnign stage from which it come...but it will go to the runable and wait till the next thred complets it work . 
5)then the thread go to the running stage and complets its work and finally get terminat.
                                                
 */

public class Life_cycle_of_thread {
    public static void main(String[] args) {
        
    }
    
}
