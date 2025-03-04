public class LinearSearches {
    public static void main(String[] args) {
        
        int[] rollNos = {1001, 1002, 1005, 1007, 1000, 1008, 1009};
        int searchRollNo = 1007;

        int searchAtPosition = getSearchPosition(rollNos, searchRollNo);
        if (searchAtPosition != -1) {
            System.out.println("Found at position: " + searchAtPosition);
        } else {
            System.out.println("Value not found in single-dimensional array");
        }

        int[][] rollNosMulti = {{1001, 1002}, {1005, 1007}, {1000, 1008, 1009}};
        int searchRollNoMulti = 1000;
        int searchAtPositionMulti = getSearchPositionMulti(rollNosMulti, searchRollNoMulti);
        if (searchAtPositionMulti != -1) {
            System.out.println("Found at position: " + searchAtPositionMulti);
        } else {
            System.out.println("Value not found in multi-dimensional array");
        }

        
        String name1 = "rohan";
        String name2 = new String("rohan");
        System.out.println("String comparison using '==': " + (name1 == name2));
        System.out.println("String comparison using 'equals()': " + name1.equals(name2)); 

        
        String[] names = {"rohan", "mohan", "vishal", "jitendra", "aman", "raman"};
        String searchString = "vishal";
        int namePosition = getSearchPosition(names, searchString);
        if (namePosition != -1) {
            System.out.println("Name found at position: " + namePosition);
        } else {
            System.out.println("Name not found");
        }
    }

    
    public static int getSearchPosition(int[] rollNos, int searchRollNo) {
        int foundAtPosition = -1;
        for (int i = 0; i < rollNos.length; i++) {
            if (searchRollNo == rollNos[i]) {
                foundAtPosition = i + 1; 
                break;
            }
        }
        return foundAtPosition;
    }

    
    public static int getSearchPositionMulti(int[][] rollNosMulti, int searchRollNoMulti) {
        int foundAtPosition = -1;
        for (int i = 0; i < rollNosMulti.length; i++) {
            for (int j = 0; j < rollNosMulti[i].length; j++) {
                if (searchRollNoMulti == rollNosMulti[i][j]) {
                    foundAtPosition = (i * 10) + (j + 1);
                    break;
                }
            }
            if (foundAtPosition != -1) {
                break;
            }
        }
        return foundAtPosition;
    }

    
    public static int getSearchPosition(String[] names, String searchString) {
        int foundAtPosition = -1;
        for (int i = 0; i < names.length; i++) {
            if (searchString.equals(names[i])) {
                foundAtPosition = i + 1;
                break;
            }
        }
        return foundAtPosition;
    }
}