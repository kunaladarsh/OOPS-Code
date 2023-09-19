// Word Search
public static Node segregateEvenOdd(Node head)

    {
        ArrayList<Integer>arr = new ArrayList<>();
        Node temp=head;

        while(temp!=null)

        {

            arr.add(temp.data);

            temp=temp.next;

        }

        temp=head;

        for(int a : arr)

        {

            if(a%2==0)

            {

                temp.data=a;

                temp=temp.next;

            }

        }

        for(int a : arr)

        {

            if(a%2!=0)

            {
                temp.data=a;
                temp=temp.next;

            }

        }

        return head;

    }

}

