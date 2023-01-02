public class Main {
    public static void  main(String args[]){
        Assingment8.Tree Teamlist  = new Assingment8.Tree();
        //National Cricket teams
        Assingment8.Team England = new Assingment8.Team("England",1739);//6
        Assingment8.Team SA = new Assingment8.Team("South Africa",1808);//4
        Assingment8.Team NZ = new Assingment8.Team("New Zealand",1894);//5
        Assingment8.Team WI = new Assingment8.Team("West Indies",1880); //9
        Assingment8.Team Australia = new Assingment8.Team("Australia",1877);//2
        Assingment8.Team India = new Assingment8.Team("India",1926);//1
        Assingment8.Team Pakistan = new Assingment8.Team("Pakistan",1952);//6
        Assingment8.Team Bangladesh = new Assingment8.Team("Bangladesh",1977);//7
        Assingment8.Team SL = new Assingment8.Team("Sri Lanka",1975);//8
        Assingment8.Team Afghanistan = new Assingment8.Team("Afghanistan",1995);//10

        //Root Node
        Assingment8.Node root = new Assingment8.Node(India.getName());                     //      1926
                                                                                            //         /\
        //level one                                                                        //     1877    1975
        root.left = new Assingment8.Node(Australia.getName());                      //       /\        /\
        root.right = new Assingment8.Node(SL.getName());                           //    1808  1894 1952  1977

        //level two                                                                     //      /      \     /       \
        root.left.left = new Assingment8.Node(SA.getName());                      //      1739   1880    1926    1995
        root.left.right = new Assingment8.Node(NZ.getName());
        root.right.right = new Assingment8.Node(Bangladesh.getName());
        root.right.left = new Assingment8.Node(Pakistan.getName());

        //level three
        root.left.left.left = new Assingment8.Node(England.getName());
        root.left.right.right = new Assingment8.Node(WI.getName());
        root.right.right.right = new Assingment8.Node(Afghanistan.getName());

        System.out.println("This is in the inorder sort");
        Teamlist.inorder(root);
        System.out.println("This is in the preorder sort");
        Teamlist.preorder(root);
        System.out.println("This is in the postorder sort");
        Teamlist.postorder(root);
        System.out.println("This is in the breadfirst");
        Teamlist.breadFirst(root);




    }
}
