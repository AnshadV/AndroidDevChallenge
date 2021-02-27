/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.model.Puppy

object DataProvider {

    val puppy =
        Puppy(
            id = 1,
            title = "Ariel",
            sex = "Male",
            age = 14,
            puppyImageId = R.drawable.dog1
        )

    val puppyList = listOf(
        puppy,
        Puppy(
            id = 2,
            title = "Bambi",
            sex = "Female",
            age = 6,
            puppyImageId = R.drawable.dog2
        ),
        Puppy(
            id = 3,
            title = "Birdie",
            sex = "Male",
            age = 8,
            puppyImageId = R.drawable.dog3
        ),
        Puppy(
            id = 4,
            title = "Daphne",
            sex = "Male",
            age = 10,
            puppyImageId = R.drawable.dog4
        ),
        Puppy(
            id = 5,
            title = "Hadley",
            sex = "Female",
            age = 12,
            puppyImageId = R.drawable.dog5
        ),
        Puppy(
            id = 6,
            title = "Lucy",
            sex = "Female",
            age = 8,
            puppyImageId = R.drawable.dog6
        ),
        Puppy(
            id = 7,
            title = "Ida",
            sex = "Male",
            age = 10,
            puppyImageId = R.drawable.dog7
        ),
        Puppy(
            id = 8,
            title = "Koko",
            sex = "Female",
            age = 9,
            puppyImageId = R.drawable.dog8
        ),
        Puppy(
            id = 9,
            title = "Lulu",
            sex = "Male",
            age = 7,
            puppyImageId = R.drawable.dog9
        ),
    )
}
