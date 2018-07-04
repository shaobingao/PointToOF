 public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean found = false;
        int temp;
        if(numbers == null || numbers.length == 0)
        {
            return  found;
        }
        else{
            for(int i = 0; i < numbers.length; i++)
            {
                while(numbers[i] != i)
                {
                    if(numbers[i] == numbers[numbers[i]])
                    {
                        found = true;
                    }
                    else{
                        temp = numbers[i];
                        numbers[i] = numbers[numbers[i]];
                        numbers[numbers[i]] = temp;

                    }
                }
            }
        }
        return found;

    }
