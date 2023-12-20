#include<iostream>
#include<ctime>
#include<cstdlib>
#include<random>

class randomiser {
private:
	int repeat;
	int score;
public:
	void setRepeat(int m) {
		repeat = m;
	}
	void start() {
		score = 0;
		for (int i = repeat; i > 0; i--) {
			std::random_device ran;
			std::uniform_int_distribution<int> distr(1, 1000);
			srand(time(0));
			int a = distr(ran), b = distr(ran), c = rand() % 2, answer;
			char m;
			switch (c) {
			case 0:
				m = '+';
				break;
			case 1:
				m = '-';
				break;
			}
			std::cout << a << std::endl;
			std::cout << m << b << std::endl;
			std::cout << "------------" << std::endl;
			std::cin >> answer;
			if (m == '+'&&answer==a+b) {
				score++;
			}
			else if (m == '-' && answer == a - b) {
				score++;
			}
		}
		std::cout << "You scored " << score << " out of " << repeat;
	}
};
int main() {
	int repeat;
	std::cout << "Welcome to Math Practice!" << std::endl;
	std::cout << "Type the number of Arithmetic questions you wish to solve :" << std::endl;
	std::cin >> repeat;
	randomiser math;
	math.setRepeat(repeat);
	math.start();
}
