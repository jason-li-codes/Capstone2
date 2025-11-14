package com.pluralsight.utilizedclasses;

public class PrintColumns {

    public PrintColumns() {}

    public static void TwoColumns(String leftBlock, String rightBlock) {

        int totalWidth = 180;

        int columnWidth = (totalWidth - 5) / 3; // borders + spacing

        // Clean and split into lines
        String[] leftLines = leftBlock.stripIndent().trim().split("\n");
        String[] rightLines = rightBlock.stripIndent().trim().split("\n");

        int maxLines = Math.max(leftLines.length, rightLines.length);

        // Compute top padding for bottom alignment
        int leftPad = maxLines - leftLines.length;
        int rightPad = maxLines - rightLines.length;

        // Top border
        printLine(2, '╔', '═', '╦', '╗', columnWidth);

        // Main contents
        for (int i = 0; i < maxLines; i++) {
            String left = (i < leftPad) ? "" : leftLines[i - leftPad];
            String right = (i < rightPad) ? "" : rightLines[i - rightPad];

            System.out.printf("║ %-"+columnWidth+"s ║ %-"+columnWidth*2+"s ║\n",
                    left, right);
        }

        // Bottom border
        printLine(2, '╚', '═', '╩', '╝', columnWidth);
    }

    private static void printLine(int numColumns, char left, char fill, char mid, char right, int width) {
            System.out.print(left);
            for (int i = 0; i < width + 2; i++) System.out.print(fill);
            System.out.print(mid);
            for (int i = 0; i < width * 2 + 2; i++) System.out.print(fill);
        if (numColumns == 3) {
            System.out.print(mid);
            for (int i = 0; i < width + 2; i++) System.out.print(fill);
        }
            System.out.println(right);
    }

    private static void threeColumns(String leftBlock, String midBlock, String rightBlock) {

        int totalWidth = 120;

        int columnWidth = (totalWidth - 5) / 3; // borders + spacing

        // Clean and split into lines
        String[] leftLines = leftBlock.stripIndent().trim().split("\n");
        String[] midLines = midBlock.stripIndent().trim().split("\n");
        String[] rightLines = rightBlock.stripIndent().trim().split("\n");

        int maxLines = Math.max(leftLines.length, Math.max(midLines.length, rightLines.length));

        int leftPad = maxLines - leftLines.length;
        int midPad = maxLines - midLines.length;
        int rightPad = maxLines - rightLines.length;

        // Top border
        printLine(3, '╔', '═', '╦', '╗', columnWidth);

        // Contents
        for (int i = 0; i < maxLines; i++) {
            String left  = (i < leftPad)  ? "" : leftLines[i - leftPad];
            String mid   = (i < midPad)   ? "" : midLines[i - midPad];
            String right = (i < rightPad) ? "" : rightLines[i - rightPad];

            System.out.printf("║ %-"+columnWidth+"s ║ %-"+columnWidth+"s ║ %-"+columnWidth+"s ║\n",
                    left, mid, right);
        }
    }
}
