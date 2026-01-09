fun rps(p1: String, p2: String): String{
    return when
    {
        p1==p2 -> "Draw!"
        p1=="paper" && p2=="rock" -> "Player 1 won!"
        p1=="rock" && p2=="scissors" -> "Player 1 won!"
        p1=="scissors" && p2=="paper" -> "Player 1 won!"
        else -> "Player 2 won!"
    }
}






/*
Rules of the "Rock, Paper, Scissors" game are:

Rock beats Scissors,
Scissors beat Paper,
Paper beats Rock,
Two identical moves are a draw.
Let's play! You will be given valid moves of two Rock, Paper, Scissors players, and have to return
which player won: "Player 1 won!" for player 1, and "Player 2 won!" for player 2. In case of a draw return Draw!.

Examples:
"scissors",     "paper"     --> "Player 1 won!"
"scissors",     "rock"      --> "Player 2 won!"
"paper",        "paper"     --> "Draw!"*/
