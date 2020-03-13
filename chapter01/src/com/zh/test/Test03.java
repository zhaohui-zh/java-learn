package com.zh.test;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 测试类03
 * Created by zhaohui on 2020/3/12
 */
public class Test03 {

    /**
     * 递归地列出指定目录下的所有文件名
     * @param dir
     */
    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    public static void copyFile(String src, String dist) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);

        byte[] buffer = new byte[20 * 1024];
        int cnt;

        // read()最多读取buffer.length个字节
        // 返回实际读取的字节数
        // 返回-1的时候表示读到文件未
        while ((cnt = in.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, cnt);
        }

        in.close();
        out.close();
    }

    public static int[] twoSum(int[] a, int target) {
        if (a == null) {
            return null;
        }
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] + a[j] == target) {
                return new int[] {a[i], a[j]};
            } else if(a[i] + a[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void testString() throws Exception {
        String str1 = "中文";
        byte[] bytes = str1.getBytes("UTF-8");
        String str2 = new String(bytes, "UTF-8");
        System.out.println(str2);

    }

    public static void readFileContents(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }

    public static boolean judgeSquareSum(int target) {
        if (target < 0) {
            return false;
        }
        int i = 0;
        int j = (int) Math.sqrt(target);
        int powerSum = 0;
        while (i <= j) {
            powerSum = i * i + j * j;
            if (powerSum == target) {
                System.out.println(i);
                System.out.println(j);
                return true;
            } else if (powerSum < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static final Set<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        int i = 0;
        int j = s.length() - 1;
        char ci = '0';
        char cj = '0';
        char[] result = new char[s.length()];
        while (i <= j) {
            ci = s.charAt(i);
            cj = s.charAt(j);
//            if (!vowels.contains(ci)) {
//                result[i++] = ci;
//            } else if (!vowels.contains(cj)) {
//                result[j--] = cj;
//            } else {
//                result[i++] = cj;
//                result[j--] = ci;
//            }
            if (!vowels.contains(ci))
                result[i++] = ci;
            if (!vowels.contains(cj))
                result[j--] = cj;
            if (vowels.contains(ci) && vowels.contains(cj)) {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    public static boolean validatePalindrome(String s) {
        if (s == null) {
            return false;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))  {
                return isPalindrome(s, i, j + 1) || isPalindrome(s, i - 1, j);
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
//        File dir = new File("C:/D/常用软件");
//        listAllFiles(dir);
//        copyFile("C:/D/常用软件/elasticsearch-6.2.2.zip", "C:/D/常用软件/elasticsearch-6.2.2.zip2.zip");
//        int[] a = {2, 7, 11, 15};
//        int target = 9;
//        int[] b = twoSum(a, target);
//        for (int i : b) {
//            System.out.println(i);
//        }
//        testString();
//        readFileContents("C:/D/Test.txt");
//        System.out.println(judgeSquareSum(82));
//        System.out.println(reverseVowels("leetcode"));
        System.out.println(validatePalindrome("abcba"));

    }

}
