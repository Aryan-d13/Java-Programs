int triplet;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i] == arr[i+1]) == arr[i+2])
                System.out.println(arr[i] + "is a triplet");
        }