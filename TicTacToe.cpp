// TicTacToe

#include<iostream>
using std::cout;
using std::cin;
using std::string;
using std::endl;

class tictactoe {
private:
	char board[3][3] = { {'1','2','3'}, {'4','5','6'}, {'7','8','9'} };
	int play;
	int turn = 2;
	char winner;
public:
	char p1sign;
	char p2sign;
	void start() {
		arena();
		while (turn<=11) {
			do {
				checkWinner();
				cout << "Enter numbers 1-9 where you want to make your move.\n";
				if (turn % 2 == 0) {
					cout << "Player 1 turn : \n";
				}
				else if(turn%2!=0){
					cout << "Player 2 turn: \n";
				}
				cin >> play;
			} while (play <=0 || play >= 10);
			if (play == 1 && board[0][0] == '1') {
				if (turn % 2 == 0) {
					board[0][0] = p1sign;
				}
				else {
					board[0][0] = p2sign;
				}
			}
			else if (play == 2 && board[0][1] == '2') {
				if (turn % 2 == 0) {
					board[0][1] = p1sign;
				}
				else {
					board[0][1] = p2sign;
				}
			}
			else if (play == 3 && board[0][2] == '3') {
				if (turn % 2 == 0) {
					board[0][2] = p1sign;
				}
				else {
					board[0][2] = p2sign;
				}
			}
			else if (play == 4 && board[1][0] == '4') {
				if (turn % 2 == 0) {
					board[1][0] = p1sign;
				}
				else {
					board[1][0] = p2sign;
				}
			}
			else if (play == 5 && board[1][1] == '5') {
				if (turn % 2 == 0) {
					board[1][1] = p1sign;
				}
				else {
					board[1][1] = p2sign;
				}
			}
			else if (play == 6 && board[1][2] == '6') {
				if (turn % 2 == 0) {
					board[1][2] = p1sign;
				}
				else {
					board[1][2] = p2sign;
				}
			}
			else if (play == 7 && board[2][0] == '7') {
				if (turn % 2 == 0) {
					board[2][0] = p1sign;
				}
				else {
					board[2][0] = p2sign;
				}
			}
			else if (play == 8 && board[2][1] == '8') {
				if (turn % 2 == 0) {
					board[2][1] = p1sign;
				}
				else {
					board[2][1] = p2sign;
				}
			}
			else if (play == 9 && board[2][2] == '9') {
				if (turn % 2 == 0) {
					board[2][2] = p1sign;
				}
				else {
					board[2][2] = p2sign;
				}
			}
			turn++;
			arena();
			if (turn == 11) {
				cout << "This is a Draw!";
				exit(0);
			}
		}
	}
	void arena() {
		cout << "\n     |   " << "   |    \n";
		printf("   %c |   %c  |  %c   \n", board[0][0], board[0][1], board[0][2]);
		cout << "--------------------" << endl;
		cout << "     |   " << "   |    \n";
		printf("   %c |   %c  |  %c   \n", board[1][0], board[1][1], board[1][2]);
		cout << "--------------------" << endl;
		cout << "     |   " << "   |    \n";
		printf("   %c |   %c  |  %c   \n", board[2][0], board[2][1], board[2][2]);
	}
	void checkWinner() {
		if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
			winner = board[0][0];
			if (winner == p1sign) {
				cout << "The winner is Player 1";
			}
			else {
				cout << "The winner is Player 2";
			}
			exit(0);
		}
		else if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
			winner = board[1][0];
			if (winner == p1sign) {
				cout << "The winner is Player 2";
			}
			else {
				cout << "The winner is Player 1";
			}
			exit(0);
		}
		else if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
			winner = board[2][0];
			if (winner == p1sign) {
				cout << "The winner is Player 2";
			}
			else {
				cout << "The winner is Player 1";
			}
			exit(0);
		}
		else if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
			winner = board[0][0];
			if (winner == p1sign) {
				cout << "The winner is Player 2";
			}
			else {
				cout << "The winner is Player 1";
			}
			exit(0);
		}
		else if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
			winner = board[0][1];
			if (winner == p1sign) {
				cout << "The winner is Player 2";
			}
			else {
				cout << "The winner is Player 1";
			}
			exit(0);
		}
		else if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
			winner = board[0][2];
			if (winner == p1sign) {
				cout << "The winner is Player 2";
			}
			else {
				cout << "The winner is Player 1";
			}
			exit(0);
		}
		else if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			winner = board[0][0];
			if (winner == p1sign) {
				cout << "The winner is Player 2";
			}
			else {
				cout << "The winner is Player 1";
			}
			exit(0);
		}
		else if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			winner = board[0][2];
			if (winner == p1sign) {
				cout << "The winner is Player 2";
			}
			else {
				cout << "The winner is Player 1";
			}
			exit(0);
		}
	}
};
int main() {
	char p1;
	cout << "Welcome to tictactoe!\n";
	tictactoe newgame;
	cout << "Player 1, pick your sign x or o: \n";
	cin >> p1;
	if (p1 == 'x') {
		newgame.p1sign = 'x';
		newgame.p2sign = 'o';
	}
	else {
		newgame.p1sign = 'o';
		newgame.p2sign = 'x';
	}
	cout << "Player 2 your sign is: "<<newgame.p2sign;
	newgame.start();
}
