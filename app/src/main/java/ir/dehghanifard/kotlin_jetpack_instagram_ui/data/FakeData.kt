package ir.dehghanifard.kotlin_jetpack_instagram_ui.data

import ir.dehghanifard.kotlin_jetpack_instagram_ui.model.Story

object FakeData {
    val stories = ArrayList<Story>()

    private fun initialStory() {
        stories.add(
            Story(
                "John Smith",
                "https://holosen.net/wp-content/uploads/2021/09/story-01.jpg",
                true
            )
        )
        stories.add(
            Story(
                "Mehrad",
                "https://holosen.net/wp-content/uploads/2021/09/story-06.jpeg",
                false
            )
        )
        stories.add(
            Story(
                "Lucy Baker",
                "https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg",
                false
            )
        )
        stories.add(
            Story(
                "Tony",
                "https://holosen.net/wp-content/uploads/2021/09/story-03.jpeg",
                false
            )
        )
        stories.add(
            Story(
                "Anna Stark",
                "https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg",
                false
            )
        )
        stories.add(
            Story(
                "Brayan",
                "https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg",
                false
            )
        )
    }

    init {
        initialStory()
    }
}