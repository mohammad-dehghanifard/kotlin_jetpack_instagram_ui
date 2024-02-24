package ir.dehghanifard.kotlin_jetpack_instagram_ui.data

import ir.dehghanifard.kotlin_jetpack_instagram_ui.model.Post
import ir.dehghanifard.kotlin_jetpack_instagram_ui.model.Story
import ir.dehghanifard.kotlin_jetpack_instagram_ui.model.User

object FakeData {
    val stories = ArrayList<Story>()
    val users = ArrayList<User>()
    val posts = ArrayList<Post>()
    private fun initialStory() {
        stories.add(
            Story(
                1,
                "John Smith",
                "https://holosen.net/wp-content/uploads/2021/09/story-01.jpg",
                true
            )
        )
        stories.add(
            Story(
                2,
                "Mehrad",
                "https://holosen.net/wp-content/uploads/2021/09/story-06.jpeg",
                false
            )
        )
        stories.add(
            Story(
                3,
                "Lucy Baker",
                "https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg",
                false
            )
        )
        stories.add(
            Story(
                4,
                "Tony",
                "https://holosen.net/wp-content/uploads/2021/09/story-03.jpeg",
                false
            )
        )
        stories.add(
            Story(
                5,
                "Anna Stark",
                "https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg",
                false
            )
        )
        stories.add(
            Story(
                6,
                "Brayan",
                "https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg",
                false
            )
        )
    }

    private fun initialUser() {
        users.add(
            User(
                "NullDevelopr",
                "Hossein Badrnezhad",
                "https://holosen.net/wp-content/uploads/2021/09/Hossein.jpeg"
            )
        )
        users.add(
            User(
                "Anna",
                "Anna Stark",
                "https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg"
            )
        )
        users.add(
            User(
                "Lucy",
                "Lucy Baker",
                "https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg"
            )
        )

    }

    private fun initialPost() {

        posts.add(
            Post(
                users[0],
                "Tehran, Iran",
                "https://holosen.net/wp-content/uploads/2021/09/violet.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
        )
        posts.add(
            Post(
                users[1],
                "Los Angeles",
                "https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
        )
        posts.add(
            Post(
                users[2],
                "NewYork City",
                "https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
        )

    }

    init {
        initialStory()
        initialUser()
        initialPost()
    }
}