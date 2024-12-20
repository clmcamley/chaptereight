//Listing 8.3

public class SortStudentsByGrade {
    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] studentScores = new int[2][8];

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }

            studentScores[0][i] = i;
            studentScores[1][i] = correctCount;
        }

        for (int i = 0; i < studentScores[0].length - 1; i++) {
            for (int j = i + 1; j < studentScores[0].length; j++) {
                if (studentScores[1][j] < studentScores[1][i]) {
                    int tempStudent = studentScores[0][j];
                    int tempScore = studentScores[1][j];
                    studentScores[0][j] = studentScores[0][i];
                    studentScores[1][j] = studentScores[1][i];
                    studentScores[0][i] = tempStudent;
                    studentScores[1][i] = tempScore;
                }
            }
        }

        for (int i = 0; i < studentScores[0].length; i++) {
            System.out.println("Student " + studentScores[0][i] + "'s correct count is " + studentScores[1][i]);
        }
    }
}
