package com.rachitmishra.c137.data

import com.google.gson.Gson

val response = """
    {
      "page": 1,
      "teams": [
  {
    "id": 0,
    "points": 671.7,
    "name": "Leta Barry XI",
    "rank": 834,
    "rankChange": "INC",
    "winning": 88,
    "splitCount": 0,
    "user": {
      "id": 0,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 1,
    "points": 206.7,
    "name": "Catherine Carroll XI",
    "rank": 1778,
    "rankChange": "INC",
    "winning": 92,
    "splitCount": 0,
    "user": {
      "id": 1,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 2,
    "points": 1086.2,
    "name": "Jane Price XI",
    "rank": 1045,
    "rankChange": "NONE",
    "winning": 92,
    "splitCount": 0,
    "user": {
      "id": 2,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 3,
    "points": 756.2,
    "name": "Welch Patterson XI",
    "rank": 1939,
    "rankChange": "NONE",
    "winning": 21,
    "splitCount": 1,
    "user": {
      "id": 3,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 4,
    "points": 183.3,
    "name": "Lesa Conley XI",
    "rank": 1444,
    "rankChange": "DEC",
    "winning": 70,
    "splitCount": 0,
    "user": {
      "id": 4,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 5,
    "points": 595.5,
    "name": "Ochoa Finley XI",
    "rank": 117,
    "rankChange": "DEC",
    "winning": 55,
    "splitCount": 0,
    "user": {
      "id": 5,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 6,
    "points": 1445.4,
    "name": "Molina Brewer XI",
    "rank": 1845,
    "rankChange": "INC",
    "winning": 20,
    "splitCount": 0,
    "user": {
      "id": 6,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 7,
    "points": 251.3,
    "name": "Jacquelyn Allison XI",
    "rank": 1095,
    "rankChange": "DEC",
    "winning": 99,
    "splitCount": 1,
    "user": {
      "id": 7,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 8,
    "points": 507.5,
    "name": "Miranda Rocha XI",
    "rank": 1553,
    "rankChange": "NONE",
    "winning": 91,
    "splitCount": 1,
    "user": {
      "id": 8,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 9,
    "points": 943,
    "name": "Courtney Mcclain XI",
    "rank": 1512,
    "rankChange": "NONE",
    "winning": 46,
    "splitCount": 0,
    "user": {
      "id": 9,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 10,
    "points": 701.4,
    "name": "Tisha Sims XI",
    "rank": 1743,
    "rankChange": "INC",
    "winning": 41,
    "splitCount": 0,
    "user": {
      "id": 10,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 11,
    "points": 1113.6,
    "name": "Ayala Reed XI",
    "rank": 1027,
    "rankChange": "NONE",
    "winning": 26,
    "splitCount": 0,
    "user": {
      "id": 11,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 12,
    "points": 1265.7,
    "name": "Jenny Crosby XI",
    "rank": 1178,
    "rankChange": "DEC",
    "winning": 95,
    "splitCount": 0,
    "user": {
      "id": 12,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 13,
    "points": 839,
    "name": "Yvonne Campbell XI",
    "rank": 887,
    "rankChange": "DEC",
    "winning": 74,
    "splitCount": 1,
    "user": {
      "id": 13,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 14,
    "points": 1357.9,
    "name": "Avis Clark XI",
    "rank": 1295,
    "rankChange": "INC",
    "winning": 61,
    "splitCount": 1,
    "user": {
      "id": 14,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 15,
    "points": 971.9,
    "name": "Minerva Herring XI",
    "rank": 875,
    "rankChange": "DEC",
    "winning": 84,
    "splitCount": 0,
    "user": {
      "id": 15,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 16,
    "points": 737.5,
    "name": "Trina Fernandez XI",
    "rank": 1708,
    "rankChange": "INC",
    "winning": 25,
    "splitCount": 0,
    "user": {
      "id": 16,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 17,
    "points": 1125.8,
    "name": "Jeannie Mcmillan XI",
    "rank": 1924,
    "rankChange": "NONE",
    "winning": 82,
    "splitCount": 0,
    "user": {
      "id": 17,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 18,
    "points": 2.2,
    "name": "Jennie Hamilton XI",
    "rank": 1656,
    "rankChange": "INC",
    "winning": 15,
    "splitCount": 0,
    "user": {
      "id": 18,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 19,
    "points": 1180.1,
    "name": "Cora Munoz XI",
    "rank": 1739,
    "rankChange": "DEC",
    "winning": 20,
    "splitCount": 1,
    "user": {
      "id": 19,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 20,
    "points": 164.8,
    "name": "Lynn Rowland XI",
    "rank": 1437,
    "rankChange": "DEC",
    "winning": 62,
    "splitCount": 1,
    "user": {
      "id": 20,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 21,
    "points": 413.4,
    "name": "Adela Underwood XI",
    "rank": 346,
    "rankChange": "NONE",
    "winning": 90,
    "splitCount": 1,
    "user": {
      "id": 21,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 22,
    "points": 971.9,
    "name": "Robles Velazquez XI",
    "rank": 741,
    "rankChange": "INC",
    "winning": 93,
    "splitCount": 1,
    "user": {
      "id": 22,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 23,
    "points": 1259.1,
    "name": "Francis Barnett XI",
    "rank": 429,
    "rankChange": "NONE",
    "winning": 80,
    "splitCount": 0,
    "user": {
      "id": 23,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 24,
    "points": 267.3,
    "name": "Dodson Pittman XI",
    "rank": 1315,
    "rankChange": "INC",
    "winning": 74,
    "splitCount": 1,
    "user": {
      "id": 24,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 25,
    "points": 985.3,
    "name": "Mack Guerra XI",
    "rank": 334,
    "rankChange": "NONE",
    "winning": 17,
    "splitCount": 1,
    "user": {
      "id": 25,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 26,
    "points": 1132.8,
    "name": "Patrice Oconnor XI",
    "rank": 1258,
    "rankChange": "INC",
    "winning": 99,
    "splitCount": 1,
    "user": {
      "id": 26,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 27,
    "points": 1493.2,
    "name": "Cassie Sweeney XI",
    "rank": 745,
    "rankChange": "INC",
    "winning": 90,
    "splitCount": 1,
    "user": {
      "id": 27,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 28,
    "points": 292.1,
    "name": "Banks English XI",
    "rank": 1738,
    "rankChange": "NONE",
    "winning": 62,
    "splitCount": 1,
    "user": {
      "id": 28,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 29,
    "points": 345.1,
    "name": "Rodriguez Frank XI",
    "rank": 925,
    "rankChange": "NONE",
    "winning": 90,
    "splitCount": 1,
    "user": {
      "id": 29,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 30,
    "points": 1359,
    "name": "Jocelyn Cline XI",
    "rank": 48,
    "rankChange": "DEC",
    "winning": 70,
    "splitCount": 1,
    "user": {
      "id": 30,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 31,
    "points": 218.1,
    "name": "Villarreal Langley XI",
    "rank": 1180,
    "rankChange": "DEC",
    "winning": 12,
    "splitCount": 1,
    "user": {
      "id": 31,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 32,
    "points": 320.7,
    "name": "Kristi Durham XI",
    "rank": 1029,
    "rankChange": "NONE",
    "winning": 87,
    "splitCount": 1,
    "user": {
      "id": 32,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 33,
    "points": 1231.3,
    "name": "Briana Mcgowan XI",
    "rank": 552,
    "rankChange": "DEC",
    "winning": 63,
    "splitCount": 0,
    "user": {
      "id": 33,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 34,
    "points": 117.1,
    "name": "Delgado Decker XI",
    "rank": 285,
    "rankChange": "NONE",
    "winning": 76,
    "splitCount": 0,
    "user": {
      "id": 34,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 35,
    "points": 89.8,
    "name": "Jayne Navarro XI",
    "rank": 396,
    "rankChange": "DEC",
    "winning": 24,
    "splitCount": 0,
    "user": {
      "id": 35,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 36,
    "points": 318.7,
    "name": "Marian Kline XI",
    "rank": 1006,
    "rankChange": "DEC",
    "winning": 65,
    "splitCount": 0,
    "user": {
      "id": 36,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 37,
    "points": 1006.1,
    "name": "Janice Klein XI",
    "rank": 46,
    "rankChange": "INC",
    "winning": 56,
    "splitCount": 1,
    "user": {
      "id": 37,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 38,
    "points": 525.3,
    "name": "Pollard Torres XI",
    "rank": 1214,
    "rankChange": "INC",
    "winning": 22,
    "splitCount": 0,
    "user": {
      "id": 38,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 39,
    "points": 1130,
    "name": "Amalia Hudson XI",
    "rank": 1502,
    "rankChange": "DEC",
    "winning": 53,
    "splitCount": 0,
    "user": {
      "id": 39,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  }
]
    }
""".trimIndent()

val response2 = """
    {
      "page": 2,
      "teams": [
  {
    "id": 0,
    "points": 1056.3,
    "name": "Doyle Lewis XI",
    "rank": 1041,
    "rankChange": "INC",
    "winning": 54,
    "splitCount": 0,
    "user": {
      "id": 0,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 1,
    "points": 623.2,
    "name": "Macias Barrett XI",
    "rank": 1457,
    "rankChange": "DEC",
    "winning": 47,
    "splitCount": 0,
    "user": {
      "id": 1,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 2,
    "points": 1245.5,
    "name": "Armstrong Molina XI",
    "rank": 1799,
    "rankChange": "INC",
    "winning": 50,
    "splitCount": 1,
    "user": {
      "id": 2,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 3,
    "points": 573.1,
    "name": "Farley Hubbard XI",
    "rank": 1521,
    "rankChange": "NONE",
    "winning": 97,
    "splitCount": 0,
    "user": {
      "id": 3,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 4,
    "points": 36,
    "name": "Donovan Farley XI",
    "rank": 1934,
    "rankChange": "DEC",
    "winning": 19,
    "splitCount": 1,
    "user": {
      "id": 4,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 5,
    "points": 1445.4,
    "name": "Schneider Cannon XI",
    "rank": 674,
    "rankChange": "NONE",
    "winning": 29,
    "splitCount": 1,
    "user": {
      "id": 5,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 6,
    "points": 876.6,
    "name": "Odom Justice XI",
    "rank": 1806,
    "rankChange": "DEC",
    "winning": 68,
    "splitCount": 1,
    "user": {
      "id": 6,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 7,
    "points": 1251,
    "name": "Traci Davenport XI",
    "rank": 1006,
    "rankChange": "INC",
    "winning": 53,
    "splitCount": 1,
    "user": {
      "id": 7,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  },
  {
    "id": 8,
    "points": 509.3,
    "name": "Marquez Mccoy XI",
    "rank": 1746,
    "rankChange": "NONE",
    "winning": 94,
    "splitCount": 0,
    "user": {
      "id": 8,
      "profilePic": "https://xsgames.co/randomusers/avatar.php?g=male"
    }
  }
]
    }
""".trimIndent()

class TeamsRepo {

    fun getTeams(nextPage: Int, limit: Int): TeamResponse {
        if (nextPage == 2) {
            return Gson().fromJson(response2, TeamResponse::class.java)
        }
        if (nextPage == 3) {
            return TeamResponse(listOf(), 3)
        }
        return Gson().fromJson(response, TeamResponse::class.java)
    }
}

data class TeamResponse(val teams: List<Team>, val page: Int = 0)
