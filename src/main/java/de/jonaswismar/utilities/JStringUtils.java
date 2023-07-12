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

    String abbreviate(String str, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, maxWidth);
    }

    String abbreviateOffset(String str, Integer offset, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, offset, maxWidth);
    }

    String abbreviateMarker(String str, String abbrevMarker, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, abbrevMarker, maxWidth);
    }

    String abbreviateMarkerOffset(String str, String abbrevMarker, Integer offset, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, abbrevMarker, offset, maxWidth);
    }

    String abbreviateMiddle(String str, String middle, Integer length) {
        return org.apache.commons.lang3.StringUtils.abbreviateMiddle(str, middle, length);
    }

    String appendIfMissing(String str, String suffix, String... suffixes) {
        return org.apache.commons.lang3.StringUtils.appendIfMissing(str, suffix, suffixes);
    }

    String appendIfMissingIgnoreCase(String str, String suffix, String... suffixes) {
        return org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase(str, suffix, suffixes);
    }

    String capitalize(String str) {
        return org.apache.commons.lang3.StringUtils.capitalize(str);
    }

    String center(String str, Integer size) {
        return org.apache.commons.lang3.StringUtils.center(str, size);
    }

    String centerPad(String str, Integer size, String padStr) {
        return org.apache.commons.lang3.StringUtils.center(str, size, padStr);
    }

    String chomp(String str) {
        return org.apache.commons.lang3.StringUtils.chomp(str);
    }

    String chop(String str) {
        return org.apache.commons.lang3.StringUtils.chop(str);
    }

    Integer compare(String str, String str2) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2);
    }

    Integer compareLess(String str, String str2, Boolean less) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2, less);
    }

    Integer compareIgnoreCase(String str, String str2) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2);
    }

    Integer compareIgnoreCaseLess(String str, String str2, Boolean less) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2, less);
    }

    Boolean contains(String str, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.contains(str, searchSeq);
    }

    Boolean containsAny(String str, String... searchSeq) {
        return org.apache.commons.lang3.StringUtils.containsAny(str, searchSeq);
    }

    Boolean containsAnyIgnoreCase(String str, String... searchSeq) {
        return org.apache.commons.lang3.StringUtils.containsAnyIgnoreCase(str, searchSeq);
    }

    Boolean containsIgnoreCase(String str, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.containsIgnoreCase(str, searchSeq);
    }

    Boolean containsNone(String str, String invalidChars) {
        return org.apache.commons.lang3.StringUtils.containsNone(str, invalidChars);
    }

    Boolean containsOnly(String str, String validChars) {
        return org.apache.commons.lang3.StringUtils.containsOnly(str, validChars);
    }

    Boolean containsWhitespace(String str) {
        return org.apache.commons.lang3.StringUtils.containsWhitespace(str);
    }

    Integer countMatches(String str, String sub) {
        return org.apache.commons.lang3.StringUtils.countMatches(str, sub);
    }

    String defaultString(String str) {
        return org.apache.commons.lang3.StringUtils.defaultString(str);
    }

    String defaultStringWith(String str, String defaultStr) {
        return org.apache.commons.lang3.StringUtils.defaultString(str, defaultStr);
    }

    String deleteWhitespace(String str) {
        return org.apache.commons.lang3.StringUtils.deleteWhitespace(str);
    }

    String difference(String str1, String str2) {
        return org.apache.commons.lang3.StringUtils.difference(str1, str2);
    }

    Boolean endsWith(String str, String suffix) {
        return org.apache.commons.lang3.StringUtils.endsWith(str, suffix);
    }

    Boolean endsWithAny(String str, String... searchStrings) {
        return org.apache.commons.lang3.StringUtils.endsWithAny(str, searchStrings);
    }

    Boolean endsWithIgnoreCase(String str, CharSequence suffix) {
        return org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(str, suffix);
    }

    Boolean endsWithAnyIgnoreCase(String str, String... searchStrings) {
        if (isEmpty(str) || org.apache.commons.lang3.ArrayUtils.isEmpty(searchStrings)) {
            return false;
        }
        for (final CharSequence searchString : searchStrings) {
            if (endsWithIgnoreCase(str, searchString)) {
                return true;
            }
        }
        return false;
    }

    String ensureNotNullString(String value) {
        if (value == null) {
            return "";
        } else {
            return value;
        }
    }

    Boolean equals(String str1, String str2) {
        return org.apache.commons.lang3.StringUtils.equals(str1, str2);
    }

    Boolean equalsAny(String string, String... searchStrings) {
        return org.apache.commons.lang3.StringUtils.equalsAny(string, searchStrings);
    }

    Boolean equalsAnyIgnoreCase(String string, String... searchStrings) {
        return org.apache.commons.lang3.StringUtils.equalsAnyIgnoreCase(string, searchStrings);
    }

    Boolean equalsIgnoreCase(String str1, String str2) {
        return org.apache.commons.lang3.StringUtils.equalsIgnoreCase(str1, str2);
    }

    String firstNonBlank(String... values) {
        return org.apache.commons.lang3.StringUtils.firstNonBlank(values);
    }

    String firstNonEmpty(String... values) {
        return org.apache.commons.lang3.StringUtils.firstNonEmpty(values);
    }

    String getCommonPrefix(String... strs) {
        return org.apache.commons.lang3.StringUtils.getCommonPrefix(strs);
    }

    String getDigits(String str) {
        return org.apache.commons.lang3.StringUtils.getDigits(str);
    }

    Integer indexOf(String seq, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.indexOf(seq, searchSeq);
    }

    Integer indexOfStart(String seq, String searchSeq, Integer startPos) {
        return org.apache.commons.lang3.StringUtils.indexOf(seq, searchSeq, startPos);
    }

    Integer indexOfAny(String seq, String... searchStrs) {
        return org.apache.commons.lang3.StringUtils.indexOfAny(seq, searchStrs);
    }

    Integer indexOfAnyBut(String seq, char... searchStrs) {
        return org.apache.commons.lang3.StringUtils.indexOfAnyBut(seq, searchStrs);
    }

    Integer indexOfDifference(String cs1, String cs2) {
        return org.apache.commons.lang3.StringUtils.indexOfDifference(cs1, cs2);
    }

    Integer indexOfDifferenceMulti(String... css) {
        return org.apache.commons.lang3.StringUtils.indexOfDifference(css);
    }

    Integer indexOfIgnoreCase(String seq, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(seq, searchSeq);
    }

    Integer indexOfIgnoreCaseStart(String seq, String searchSeq, Integer startPos) {
        return org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(seq, searchSeq, startPos);
    }

    Boolean isAllBlank(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAllBlank(strs);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    Boolean isAllEmpty(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAllEmpty(strs);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isAllLowerCase(String str) {
        return org.apache.commons.lang3.StringUtils.isAllLowerCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isAllUpperCase(String str) {
        return org.apache.commons.lang3.StringUtils.isAllUpperCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isAlpha(String str) {
        return org.apache.commons.lang3.StringUtils.isAlpha(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isAlphanumeric(String str) {
        return org.apache.commons.lang3.StringUtils.isAlphanumeric(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isAlphanumericSpace(String str) {
        return org.apache.commons.lang3.StringUtils.isAlphanumericSpace(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isAlphaSpace(String str) {
        return org.apache.commons.lang3.StringUtils.isAlphaSpace(str);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    Boolean isAnyBlank(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAnyBlank(strs);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    Boolean isAnyEmpty(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAnyEmpty(strs);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isAsciiPrintable(String str) {
        return org.apache.commons.lang3.StringUtils.isAsciiPrintable(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isBlank(String str) {
        return org.apache.commons.lang3.StringUtils.isBlank(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isEmpty(String str) {
        return org.apache.commons.lang3.StringUtils.isEmpty(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isMixedCase(String str) {
        return org.apache.commons.lang3.StringUtils.isMixedCase(str);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    Boolean isNoneBlank(String... strs) {
        return org.apache.commons.lang3.StringUtils.isNoneBlank(strs);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    Boolean isNoneEmpty(String... strs) {
        return org.apache.commons.lang3.StringUtils.isNoneEmpty(strs);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isNotBlank(String str) {
        return org.apache.commons.lang3.StringUtils.isNotBlank(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isNumeric(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isNumericSpace(String str) {
        return org.apache.commons.lang3.StringUtils.isNumericSpace(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Boolean isWhitespace(String str) {
        return org.apache.commons.lang3.StringUtils.isWhitespace(str);
    }

    /**
     *
     *
     * @param elements
     *
     * @return
     */
    String join(Object... elements) {
        return org.apache.commons.lang3.StringUtils.join(elements);
    }

    /**
     *
     *
     * @param delimiter
     * @param array
     *
     * @return
     */
    String joinWith(String delimiter, Object... array) {
        return org.apache.commons.lang3.StringUtils.joinWith(delimiter, array);
    }

    /**
     *
     *
     * @param seq
     * @param searchSeq
     *
     * @return
     */
    Integer lastIndexOf(String seq, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.lastIndexOf(seq, searchSeq);
    }

    /**
     *
     *
     * @param seq
     * @param searchSeq
     * @param startPos
     *
     * @return
     */
    Integer lastIndexOfStart(String seq, String searchSeq, Integer startPos) {
        return org.apache.commons.lang3.StringUtils.lastIndexOf(seq, searchSeq, startPos);
    }

    /**
     *
     *
     * @param seq
     * @param searchStrs
     *
     * @return
     */
    Integer lastIndexOfAny(String seq, String... searchStrs) {
        return org.apache.commons.lang3.StringUtils.lastIndexOfAny(seq, searchStrs);
    }

    /**
     *
     *
     * @param seq
     * @param searchSeq
     *
     * @return
     */
    Integer lastIndexOfIgnoreCase(String seq, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(seq, searchSeq);
    }

    /**
     *
     *
     * @param seq
     * @param searchSeq
     * @param startPos
     *
     * @return
     */
    Integer lastIndexOfIgnoreCaseStart(String seq, String searchSeq, Integer startPos) {
        return org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(seq, searchSeq, startPos);
    }

    /**
     *
     *
     * @param seq
     * @param searchSeq
     * @param ordinal
     *
     * @return
     */
    Integer lastOrdinalIndexOf(String seq, String searchSeq, Integer ordinal) {
        return org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(seq, searchSeq, ordinal);
    }

    /**
     *
     *
     * @param str
     * @param len
     *
     * @return
     */
    String left(String str, Integer len) {
        return org.apache.commons.lang3.StringUtils.left(str, len);
    }

    /**
     *
     *
     * @param str
     * @param size
     *
     * @return
     */
    String leftPad(String str, Integer size) {
        return org.apache.commons.lang3.StringUtils.leftPad(str, size);
    }

    /**
     *
     *
     * @param str
     * @param size
     * @param padStr
     *
     * @return
     */
    String leftPadString(String str, Integer size, String padStr) {
        return org.apache.commons.lang3.StringUtils.leftPad(str, size, padStr);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    Integer length(String str) {
        return org.apache.commons.lang3.StringUtils.length(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String lowerCase(String str) {
        return org.apache.commons.lang3.StringUtils.lowerCase(str);
    }

    /**
     *
     *
     * @param str
     * @param pos
     * @param len
     *
     * @return
     */
    String mid(String str, Integer pos, Integer len) {
        return org.apache.commons.lang3.StringUtils.mid(str, pos, len);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String normalizeSpace(String str) {
        return org.apache.commons.lang3.StringUtils.normalizeSpace(str);
    }

    public static Integer nthIndexOf(final CharSequence seq, final CharSequence searchSeq, Integer n) {
        return nthIndexOfIgnoreCase(seq, searchSeq, n, false);
    }

    public static Integer nthIndexOfIgnoreCase(final CharSequence seq, final CharSequence searchSeq, Integer n, boolean ignoreCase) {
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

    public static Integer nthLastIndexOf(final CharSequence seq, final CharSequence searchSeq, Integer n) {
        return nthLastIndexOfIgnoreCase(seq, searchSeq, n, false);
    }

    public static Integer nthLastIndexOfIgnoreCase(final CharSequence seq, final CharSequence searchSeq, Integer n, boolean ignoreCase) {
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

    /**
     *
     *
     * @param seq
     * @param searchSeq
     * @param ordinal
     *
     * @return
     */
    Integer ordinalIndexOf(String seq, String searchSeq, Integer ordinal) {
        return org.apache.commons.lang3.StringUtils.ordinalIndexOf(seq, searchSeq, ordinal);
    }

    /**
     *
     *
     * @param str
     * @param overlay
     * @param start
     * @param end
     *
     * @return
     */
    String overlay(String str, String overlay, Integer start, Integer end) {
        return org.apache.commons.lang3.StringUtils.overlay(str, overlay, start, end);
    }

    /**
     *
     *
     * @param str
     * @param prefix
     * @param prefixes
     *
     * @return
     */
    String prependIfMissing(String str, String prefix, String... prefixes) {
        return org.apache.commons.lang3.StringUtils.prependIfMissing(str, prefix, prefixes);
    }

    /**
     *
     *
     * @param str
     * @param prefix
     * @param prefixes
     *
     * @return
     */
    String prependIfMissingIgnoreCase(String str, String prefix, String... prefixes) {
        return org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase(str, prefix, prefixes);
    }

    /**
     *
     *
     * @param str
     * @param remove
     *
     * @return
     */
    String remove(String str, String remove) {
        return org.apache.commons.lang3.StringUtils.remove(str, remove);
    }

    /**
     *
     *
     * @param str
     * @param remove
     *
     * @return
     */
    String removeEnd(String str, String remove) {
        return org.apache.commons.lang3.StringUtils.removeEnd(str, remove);
    }

    /**
     *
     *
     * @param str
     * @param remove
     *
     * @return
     */
    String removeEndIgnoreCase(String str, String remove) {
        return org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(str, remove);
    }

    /**
     *
     *
     * @param str
     * @param remove
     *
     * @return
     */
    String removeIgnoreCase(String str, String remove) {
        return org.apache.commons.lang3.StringUtils.removeIgnoreCase(str, remove);
    }

    /**
     *
     *
     * @param str
     * @param remove
     *
     * @return
     */
    String removeStart(String str, String remove) {
        return org.apache.commons.lang3.StringUtils.removeStart(str, remove);
    }

    /**
     *
     *
     * @param str
     * @param remove
     *
     * @return
     */
    String removeStartIgnoreCase(String str, String remove) {
        return org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(str, remove);
    }

    /**
     *
     *
     * @param str
     * @param repeat
     *
     * @return
     */
    String repeat(String str, Integer repeat) {
        return org.apache.commons.lang3.StringUtils.repeat(str, repeat);
    }

    /**
     *
     *
     * @param str
     * @param separator
     * @param repeat
     *
     * @return
     */
    String repeatSeperated(String str, String separator, Integer repeat) {
        return org.apache.commons.lang3.StringUtils.repeat(str, separator, repeat);
    }

    /**
     *
     *
     * @param text
     * @param searchString
     * @param replacement
     *
     * @return
     */
    String replace(String text, String searchString, String replacement) {
        return org.apache.commons.lang3.StringUtils.replace(text, searchString, replacement);
    }

    /**
     *
     *
     * @param text
     * @param searchString
     * @param replacement
     * @param max
     *
     * @return
     */
    String replaceMax(String text, String searchString, String replacement, Integer max) {
        return org.apache.commons.lang3.StringUtils.replace(text, searchString, replacement, max);
    }

    /**
     *
     *
     * @param str
     * @param searchChars
     * @param replaceChars
     *
     * @return
     */
    String replaceChars(String str, String searchChars, String replaceChars) {
        return org.apache.commons.lang3.StringUtils.replaceChars(str, searchChars, replaceChars);
    }

    /**
     *
     *
     * @param text
     * @param searchList
     * @param replacementList
     *
     * @return
     */
    String replaceEach(String text, String[] searchList, String... replacementList) {
        return org.apache.commons.lang3.StringUtils.replaceEach(text, searchList, replacementList);
    }

    /**
     *
     *
     * @param text
     * @param searchList
     * @param replacementList
     *
     * @return
     */
    String replaceEachRepeatedly(String text, String[] searchList, String... replacementList) {
        return org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(text, searchList, replacementList);
    }

    /**
     *
     *
     * @param text
     * @param searchString
     * @param replacement
     *
     * @return
     */
    String replaceIgnoreCase(String text, String searchString, String replacement) {
        return org.apache.commons.lang3.StringUtils.replaceIgnoreCase(text, searchString, replacement);
    }

    /**
     *
     *
     * @param text
     * @param searchString
     * @param replacement
     * @param max
     *
     * @return
     */
    String replaceIgnoreCaseMax(String text, String searchString, String replacement, Integer max) {
        return org.apache.commons.lang3.StringUtils.replaceIgnoreCase(text, searchString, replacement, max);
    }

    /**
     *
     *
     * @param text
     * @param searchString
     * @param replacement
     *
     * @return
     */
    String replaceOnce(String text, String searchString, String replacement) {
        return org.apache.commons.lang3.StringUtils.replaceOnce(text, searchString, replacement);
    }

    /**
     *
     *
     * @param text
     * @param searchString
     * @param replacement
     *
     * @return
     */
    String replaceOnceIgnoreCase(String text, String searchString, String replacement) {
        return org.apache.commons.lang3.StringUtils.replaceOnceIgnoreCase(text, searchString, replacement);
    }

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     *
     *
     * @param str
     * @param separatorChar
     *
     * @return
     */
    String reverseDelimited(String str, char separatorChar) {
        return org.apache.commons.lang3.StringUtils.reverseDelimited(str, separatorChar);
    }

    /**
     *
     *
     * @param str
     * @param len
     *
     * @return
     */
    String right(String str, Integer len) {
        return org.apache.commons.lang3.StringUtils.right(str, len);
    }

    /**
     *
     *
     * @param str
     * @param size
     *
     * @return
     */
    String rightPad(String str, Integer size) {
        return org.apache.commons.lang3.StringUtils.rightPad(str, size);
    }

    /**
     *
     *
     * @param str
     * @param size
     * @param padStr
     *
     * @return
     */
    String rightPadString(String str, Integer size, String padStr) {
        return org.apache.commons.lang3.StringUtils.rightPad(str, size, padStr);
    }

    /**
     *
     *
     * @param str
     * @param shift
     *
     * @return
     */
    String rotate(String str, Integer shift) {
        return org.apache.commons.lang3.StringUtils.rotate(str, shift);
    }

    /**
     *
     *
     * @param str
     * @param prefix
     *
     * @return
     */
    Boolean startsWith(CharSequence str, CharSequence prefix) {
        return org.apache.commons.lang3.StringUtils.startsWith(str, prefix);
    }

    /**
     *
     *
     * @param str
     * @param searchStrings
     *
     * @return
     */
    Boolean startsWithAny(CharSequence str, CharSequence... searchStrings) {
        return org.apache.commons.lang3.StringUtils.startsWithAny(str, searchStrings);
    }

    /**
     *
     *
     * @param str
     * @param searchStrings
     *
     * @return
     */
    Boolean startsWithAnyIgnoreCase(String str, String... searchStrings) {
        if (isEmpty(str) || org.apache.commons.lang3.ArrayUtils.isEmpty(searchStrings)) {
            return false;
        }
        for (final CharSequence searchString : searchStrings) {
            if (startsWith(str, searchString)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     *
     * @param str
     * @param prefix
     *
     * @return
     */
    Boolean startsWithIgnoreCase(String str, String prefix) {
        return org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(str, prefix);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String strip(String str) {
        return org.apache.commons.lang3.StringUtils.strip(str);
    }

    /**
     *
     *
     * @param str
     * @param stripChars
     *
     * @return
     */
    String stripChars(String str, String stripChars) {
        return org.apache.commons.lang3.StringUtils.strip(str, stripChars);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String stripAccents(String str) {
        return org.apache.commons.lang3.StringUtils.stripAccents(str);
    }

    /**
     *
     *
     * @param str
     * @param stripChars
     *
     * @return
     */
    String stripEnd(String str, String stripChars) {
        return org.apache.commons.lang3.StringUtils.stripEnd(str, stripChars);
    }

    /**
     *
     *
     * @param str
     * @param stripChars
     *
     * @return
     */
    String stripStart(String str, String stripChars) {
        return org.apache.commons.lang3.StringUtils.stripStart(str, stripChars);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String stripToEmpty(String str) {
        return org.apache.commons.lang3.StringUtils.stripToEmpty(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String stripToNull(String str) {
        return org.apache.commons.lang3.StringUtils.stripToNull(str);
    }

    /**
     *
     *
     * @param str
     * @param start
     *
     * @return
     */
    String substring(String str, Integer start) {
        return org.apache.commons.lang3.StringUtils.substring(str, start);
    }

    /**
     *
     *
     * @param str
     * @param start
     * @param end
     *
     * @return
     */
    String substring2(String str, Integer start, Integer end) {
        return org.apache.commons.lang3.StringUtils.substring(str, start, end);
    }

    /**
     *
     *
     * @param str
     * @param separator
     *
     * @return
     */
    String substringAfter(String str, String separator) {
        return org.apache.commons.lang3.StringUtils.substringAfter(str, separator);
    }

    /**
     *
     *
     * @param str
     * @param separator
     *
     * @return
     */
    String substringAfterLast(String str, String separator) {
        return org.apache.commons.lang3.StringUtils.substringAfterLast(str, separator);
    }

    /**
     *
     *
     * @param str
     * @param separator
     *
     * @return
     */
    String substringBefore(String str, String separator) {
        return org.apache.commons.lang3.StringUtils.substringBefore(str, separator);
    }

    /**
     *
     *
     * @param str
     * @param separator
     *
     * @return
     */
    String substringBeforeLast(String str, String separator) {
        return org.apache.commons.lang3.StringUtils.substringBeforeLast(str, separator);
    }

    /**
     *
     *
     * @param str
     * @param open
     * @param close
     *
     * @return
     */
    String substringBetween(String str, String open, String close) {
        return org.apache.commons.lang3.StringUtils.substringBetween(str, open, close);
    }

    /**
     *
     *
     * @param str
     * @param tag
     *
     * @return
     */
    String substringBetweenTag(String str, String tag) {
        return org.apache.commons.lang3.StringUtils.substringBetween(str, tag);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String swapCase(String str) {
        return org.apache.commons.lang3.StringUtils.swapCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String toRootLowerCase(String str) {
        return org.apache.commons.lang3.StringUtils.toRootLowerCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String toRootUpperCase(String str) {
        return org.apache.commons.lang3.StringUtils.toRootUpperCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String trim(String str) {
        return org.apache.commons.lang3.StringUtils.trim(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String trimToEmpty(String str) {
        return org.apache.commons.lang3.StringUtils.trimToEmpty(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String trimToNull(String str) {
        return org.apache.commons.lang3.StringUtils.trimToNull(str);
    }

    /**
     *
     *
     * @param str
     * @param maxWidth
     *
     * @return
     */
    String truncate(String str, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.truncate(str, maxWidth);
    }

    /**
     *
     *
     * @param str
     * @param offset
     * @param maxWidth
     *
     * @return
     */
    String truncateOffset(String str, Integer offset, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.truncate(str, offset, maxWidth);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String uncapitalize(String str) {
        return org.apache.commons.lang3.StringUtils.uncapitalize(str);
    }

    /**
     *
     *
     * @param str
     * @param wrapToken
     *
     * @return
     */
    String unwrap(String str, String wrapToken) {
        return org.apache.commons.lang3.StringUtils.unwrap(str, wrapToken);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    String upperCase(String str) {
        return org.apache.commons.lang3.StringUtils.upperCase(str);
    }

    /**
     *
     *
     * @param str
     * @param wrapWith
     *
     * @return
     */
    String wrap(String str, String wrapWith) {
        return org.apache.commons.lang3.StringUtils.wrap(str, wrapWith);
    }

    /**
     *
     *
     * @param str
     * @param wrapWith
     *
     * @return
     */
    String wrapIfMissing(String str, String wrapWith) {
        return org.apache.commons.lang3.StringUtils.wrapIfMissing(str, wrapWith);
    }

}
