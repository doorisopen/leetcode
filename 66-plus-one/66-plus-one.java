class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int addOne = 0;
        int pos = length - 1;
        boolean isAdd = true;
        while (isAdd) {
            addOne = (digits[pos] += 1);
            if (addOne > 9) {
                if (pos == 0) {
                    break;
                }
                digits[pos--] = addOne % 10;
            } else {
                digits[pos] = addOne;
                isAdd = false;
            }
        }
        
        //result
        int[] answer;
        if (addOne > 9) {
            answer = new int[length + 1];
            answer[0] = addOne / 10;
            for (int i = 1; i < length; i++) {
                answer[i] = digits[i];
            }
            return answer;
        }
        answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = digits[i];
        }
        return answer;
    }
}