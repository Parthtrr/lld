Entities
Game
Player
game inputs
game dimension

functionalities
size - n*n
how many players can play - 2 players
types of players - Humans vs Humans and Human vs Bot
attr of the players
Player - 
    Name 
    Ranking
Bot 
    Difficulty 
how will a player win the game
    n same inputs in a row, or column or diagonal
```mermaid
classDiagram
    class Game{
        <<abstract>>
        +Board board
        +Player A
        +Player B
        player turnPlayer()*
        void makeMove()*
        Player checkWinner()*
    }
    class Board{
        +int length
        +int width
        Cell board[][]
    }
    class Player{
        +String name
        +String ranking
    }
    Game --* Board
    Game --o Player
    
    class TicToeConventional{
        
    }
    Game --|> TicToeConventional
    class Bot{
        
    }
    class HumanPlayer{
        
    }
    Player --|> Bot
    Player --|> HumanPlayer
    class Input{
        X
        O
    }
    Game --o Input
    class cell{
        + Input input
    }
    Board --* cell
    
    
```