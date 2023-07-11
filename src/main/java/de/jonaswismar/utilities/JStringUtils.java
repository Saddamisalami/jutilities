/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jonaswismar.utilities;

/**
 *
 * @author jonas
 */
/**
 * <p>
 * Operations on {@link java.lang.String} that are {@code null} safe.</p>
 *
 * <ul>
 * <li><b>nthIndexOf/nthIndexOfIgnoreCase</b>
 * - nth index-of a String</li>
 * <li><b>nthLastIndexOf/nthLastIndexOfIgnoreCase</b>
 * - nth last index-of a String</li>
 * </ul>
 *
 * <p>
 * {@code JStringUtils} handles {@code null} input Strings quietly. That is to
 * say that a {@code null} input will return {@code null}. Where a
 * {@code boolean} or {@code int} is being returned details vary by method.</p>
 *
 * <p>
 * A side effect of the {@code null} handling is that a
 * {@code NullPointerException} should be considered a bug in
 * {@code JStringUtils}.</p>
 *
 * <p>
 * Methods in this class include sample code in their Javadoc comments to
 * explain their operation. The symbol {@code *} is used to indicate any input
 * including {@code null}.</p>
 *
 * <p>
 * #ThreadSafe#</p>
 *
 * @see java.lang.String
 * @since 1.0
 */
//@Immutable
public class JStringUtils {

    public static int nthIndexOf(final CharSequence seq, final CharSequence searchSeq, int n) {
        return nthIndexOfIgnoreCase(seq, searchSeq, n, false);
    }

    public static int nthIndexOfIgnoreCase(final CharSequence seq, final CharSequence searchSeq, int n, boolean ignoreCase) {
        String str1 = seq.toString();
        String str2 = searchSeq.toString();

        if (ignoreCase) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
        }

        String tempStr = str1;
        int tempIndex = -1;
        int finalIndex = 0;
        for (int occurrence = 0; occurrence < n; ++occurrence) {
            tempIndex = tempStr.indexOf(str2);
            if (tempIndex == -1) {
                finalIndex = 0;
                break;
            }
            tempStr = tempStr.substring(++tempIndex);
            finalIndex += tempIndex;
        }
        return --finalIndex;
    }

    public static int nthLastIndexOf(final CharSequence seq, final CharSequence searchSeq, int n) {
        return nthLastIndexOfIgnoreCase(seq, searchSeq, n, false);
    }

    public static int nthLastIndexOfIgnoreCase(final CharSequence seq, final CharSequence searchSeq, int n, boolean ignoreCase) {
        String str1 = reverse(seq.toString());
        String str2 = reverse(searchSeq.toString());

        if (ignoreCase) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
        }

        String tempStr = str1;
        int tempIndex = -1;
        int finalIndex = 0;
        for (int occurrence = 0; occurrence < n; ++occurrence) {
            tempIndex = tempStr.indexOf(str2);
            if (tempIndex == -1) {
                finalIndex = 0;
                break;
            }
            tempStr = tempStr.substring(++tempIndex);
            finalIndex += tempIndex;
        }
        return --finalIndex;
    }

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
