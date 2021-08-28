package com.github.ainul.core.utils

object Endpoint {
    const val header = "X-ListenAPI-Key"

    object Search {
        /**
         * required param
         * - search?q={String}
         *
         * Optional Parameters
         * - sort_by_date: 0,
         * - type: 'episode',
         * - offset: 0,
         * - len_min: 10,
         * - len_max: 30,
         * - genre_ids: '68,82',
         * - published_before: 1580172454000,
         * - published_after: 0,
         * - only_in: 'title,description',
         * - language: 'English',
         * - safe_mode: 0,
         *
         * value: 0 = false, 1 = true
        }
         */
        const val search = "search/"
    }

    object Directory {
        /**
         * Optional params
         * - genre_id: '93',
         * - page: 2,
         * - region: 'us',
         * - safe_mode: 0,
         */
        const val bestPodcastByGenre = "best_podcast/"

        /**
         * Required params
         * - id: '4d3fe717742d4963a85562e9f84d8c79'
         *
         * Optional params
         * - next_episode_pub_date: 1479154463000
         * - sort: 'recent_first' or 'oldest_first'
         */
        const val podcastById = "podcasts/"

        /**
         * Required params
         * - id: '6b6d65930c5a4f71b254465871fed370'
         */
        const val episodeById = "episodes/"

        /**
         * returns random podcast
         */
        const val random = "just_listen/"

        const val genres = "genres/"
        const val languages = "languages/"
    }

    // 200 - success
    // 400 - something wrong on your end (client side errors), e.g., missing required parameters
    // 401 - wrong api key or your account is suspended
    // 404 - endpoint not exist, or podcast / episode not exist
    // 429 - you are using FREE plan and you exceed the quota limit
    // 500 - something wrong on our end (unexpected server errors)
}