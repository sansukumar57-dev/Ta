package TaskManagerFinal;

public  class Utility {


    static int login(User[] arr,String username,String password){

        if(arr[0]!=null){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=null){
                    if(  arr[i].getUsername().equals(username)){
                        if(arr[i].getPassword().equals(password)){
                            return i;
                        }
                        else {
                            return -2;
                        }
                    }
                }
            }
        }
        return -1;
    }

}
