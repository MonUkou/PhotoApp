package thanhdnh.ueh.edu.article_app;

public class UserData {

    public static UserList createUserList() {

        UserList userList = new UserList();

        // =====================================================
        // USER 1 - DORAEMON
        // =====================================================

        userList.addUser(
                new UserProfile(
                        "U001",

                        "User 1",

                        "user1@gmail.com",

                        "Một người bạn vui vẻ, yêu thích khám phá "
                                + "những điều mới mẻ và luôn sẵn sàng giúp đỡ mọi người.",

                        "drawable/avatar_user1",

                        "Adventure, Technology, Friendship"
                )
        );

        // =====================================================
        // USER 2 - NOBITA
        // =====================================================

        userList.addUser(
                new UserProfile(
                        "U002",

                        "User 2",

                        "user2@gmail.com",

                        "Một người thân thiện, thích vui chơi cùng bạn bè "
                                + "và luôn tò mò về những điều thú vị trong cuộc sống.",

                        "drawable/avatar_user2",

                        "Friends, Gaming, Adventure"
                )
        );

        // =====================================================
        // USER 3
        // =====================================================

        userList.addUser(
                new UserProfile(
                        "U003",

                        "User 3",

                        "user3@gmail.com",

                        "Một cô gái đáng yêu, năng động và yêu thích "
                                + "thời trang, âm nhạc cùng những hoạt động vui vẻ.",

                        "drawable/avatar_user3",

                        "Fashion, Music, Lifestyle"
                )
        );

        // =====================================================
        // USER 4
        // =====================================================

        userList.addUser(
                new UserProfile(
                        "U004",

                        "User 4",

                        "user4@gmail.com",

                        "Một nhân vật vui vẻ và đáng yêu, yêu thích "
                                + "khám phá, giao lưu và chia sẻ những khoảnh khắc thú vị.",

                        "drawable/avatar_user4",

                        "Travel, Music, Entertainment"
                )
        );

        return userList;
    }
}