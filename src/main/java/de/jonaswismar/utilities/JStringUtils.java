/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jonaswismar.utilities;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public JStringUtils() {
    }

    public String abbreviate(String str, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, maxWidth);
    }

    public String abbreviateOffset(String str, Integer offset, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, offset, maxWidth);
    }

    public String abbreviateMarker(String str, String abbrevMarker, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, abbrevMarker, maxWidth);
    }

    public String abbreviateMarkerOffset(String str, String abbrevMarker, Integer offset, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.abbreviate(str, abbrevMarker, offset, maxWidth);
    }

    public String abbreviateMiddle(String str, String middle, Integer length) {
        return org.apache.commons.lang3.StringUtils.abbreviateMiddle(str, middle, length);
    }

    public String appendIfMissing(String str, String suffix, String... suffixes) {
        return org.apache.commons.lang3.StringUtils.appendIfMissing(str, suffix, suffixes);
    }

    public String appendIfMissingIgnoreCase(String str, String suffix, String... suffixes) {
        return org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase(str, suffix, suffixes);
    }

    public String capitalize(String str) {
        return org.apache.commons.lang3.StringUtils.capitalize(str);
    }

    public String center(String str, Integer size) {
        return org.apache.commons.lang3.StringUtils.center(str, size);
    }

    public String centerPad(String str, Integer size, String padStr) {
        return org.apache.commons.lang3.StringUtils.center(str, size, padStr);
    }

    public String chomp(String str) {
        return org.apache.commons.lang3.StringUtils.chomp(str);
    }

    public String chop(String str) {
        return org.apache.commons.lang3.StringUtils.chop(str);
    }

    public Integer compare(String str, String str2) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2);
    }

    public Integer compareLess(String str, String str2, Boolean less) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2, less);
    }

    public Integer compareIgnoreCase(String str, String str2) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2);
    }

    public Integer compareIgnoreCaseLess(String str, String str2, Boolean less) {
        return org.apache.commons.lang3.StringUtils.compare(str, str2, less);
    }

    public Boolean contains(String str, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.contains(str, searchSeq);
    }

    public Boolean containsAny(String str, String... searchSeq) {
        return org.apache.commons.lang3.StringUtils.containsAny(str, searchSeq);
    }

    public Boolean containsAnyIgnoreCase(String str, String... searchSeq) {
        return org.apache.commons.lang3.StringUtils.containsAnyIgnoreCase(str, searchSeq);
    }

    public Boolean containsIgnoreCase(String str, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.containsIgnoreCase(str, searchSeq);
    }

    public Boolean containsNone(String str, String invalidChars) {
        return org.apache.commons.lang3.StringUtils.containsNone(str, invalidChars);
    }

    public Boolean containsOnly(String str, String validChars) {
        return org.apache.commons.lang3.StringUtils.containsOnly(str, validChars);
    }

    public Boolean containsWhitespace(String str) {
        return org.apache.commons.lang3.StringUtils.containsWhitespace(str);
    }

    public Integer countMatches(String str, String sub) {
        return org.apache.commons.lang3.StringUtils.countMatches(str, sub);
    }

    public String defaultString(String str) {
        return org.apache.commons.lang3.StringUtils.defaultString(str);
    }

    public String defaultStringWith(String str, String defaultStr) {
        return org.apache.commons.lang3.StringUtils.defaultString(str, defaultStr);
    }

    public String deleteWhitespace(String str) {
        return org.apache.commons.lang3.StringUtils.deleteWhitespace(str);
    }

    public String difference(String str1, String str2) {
        return org.apache.commons.lang3.StringUtils.difference(str1, str2);
    }

    public Boolean endsWith(String str, String suffix) {
        return org.apache.commons.lang3.StringUtils.endsWith(str, suffix);
    }

    public Boolean endsWithAny(String str, String... searchStrings) {
        return org.apache.commons.lang3.StringUtils.endsWithAny(str, searchStrings);
    }

    public Boolean endsWithIgnoreCase(String str, CharSequence suffix) {
        return org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(str, suffix);
    }

    public Boolean endsWithAnyIgnoreCase(String str, String... searchStrings) {
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

    public String ensureNotNullString(String value) {
        if (value == null) {
            return "";
        } else {
            return value;
        }
    }

    public Boolean equals(String str1, String str2) {
        return org.apache.commons.lang3.StringUtils.equals(str1, str2);
    }

    public Boolean equalsAny(String string, String... searchStrings) {
        return org.apache.commons.lang3.StringUtils.equalsAny(string, searchStrings);
    }

    public Boolean equalsAnyIgnoreCase(String string, String... searchStrings) {
        return org.apache.commons.lang3.StringUtils.equalsAnyIgnoreCase(string, searchStrings);
    }

    public Boolean equalsIgnoreCase(String str1, String str2) {
        return org.apache.commons.lang3.StringUtils.equalsIgnoreCase(str1, str2);
    }

    public String firstNonBlank(String... values) {
        return org.apache.commons.lang3.StringUtils.firstNonBlank(values);
    }

    public String firstNonEmpty(String... values) {
        return org.apache.commons.lang3.StringUtils.firstNonEmpty(values);
    }

    public String getCommonPrefix(String... strs) {
        return org.apache.commons.lang3.StringUtils.getCommonPrefix(strs);
    }

    public String getDigits(String str) {
        return org.apache.commons.lang3.StringUtils.getDigits(str);
    }

    public Integer indexOf(String seq, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.indexOf(seq, searchSeq);
    }

    public Integer indexOfStart(String seq, String searchSeq, Integer startPos) {
        return org.apache.commons.lang3.StringUtils.indexOf(seq, searchSeq, startPos);
    }

    public Integer indexOfAny(String seq, String... searchStrs) {
        return org.apache.commons.lang3.StringUtils.indexOfAny(seq, searchStrs);
    }

    public Integer indexOfAnyBut(String seq, char... searchStrs) {
        return org.apache.commons.lang3.StringUtils.indexOfAnyBut(seq, searchStrs);
    }

    public Integer indexOfDifference(String cs1, String cs2) {
        return org.apache.commons.lang3.StringUtils.indexOfDifference(cs1, cs2);
    }

    public Integer indexOfDifferenceMulti(String... css) {
        return org.apache.commons.lang3.StringUtils.indexOfDifference(css);
    }

    public Integer indexOfIgnoreCase(String seq, String searchSeq) {
        return org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(seq, searchSeq);
    }

    public Integer indexOfIgnoreCaseStart(String seq, String searchSeq, Integer startPos) {
        return org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(seq, searchSeq, startPos);
    }

    public Boolean isAllBlank(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAllBlank(strs);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    public Boolean isAllEmpty(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAllEmpty(strs);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isAllLowerCase(String str) {
        return org.apache.commons.lang3.StringUtils.isAllLowerCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isAllUpperCase(String str) {
        return org.apache.commons.lang3.StringUtils.isAllUpperCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isAlpha(String str) {
        return org.apache.commons.lang3.StringUtils.isAlpha(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isAlphanumeric(String str) {
        return org.apache.commons.lang3.StringUtils.isAlphanumeric(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isAlphanumericSpace(String str) {
        return org.apache.commons.lang3.StringUtils.isAlphanumericSpace(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isAlphaSpace(String str) {
        return org.apache.commons.lang3.StringUtils.isAlphaSpace(str);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    public Boolean isAnyBlank(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAnyBlank(strs);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    public Boolean isAnyEmpty(String... strs) {
        return org.apache.commons.lang3.StringUtils.isAnyEmpty(strs);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isAsciiPrintable(String str) {
        return org.apache.commons.lang3.StringUtils.isAsciiPrintable(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isBlank(String str) {
        return org.apache.commons.lang3.StringUtils.isBlank(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isEmpty(String str) {
        return org.apache.commons.lang3.StringUtils.isEmpty(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isMixedCase(String str) {
        return org.apache.commons.lang3.StringUtils.isMixedCase(str);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    public Boolean isNoneBlank(String... strs) {
        return org.apache.commons.lang3.StringUtils.isNoneBlank(strs);
    }

    /**
     *
     *
     * @param strs
     *
     * @return
     */
    public Boolean isNoneEmpty(String... strs) {
        return org.apache.commons.lang3.StringUtils.isNoneEmpty(strs);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isNotBlank(String str) {
        return org.apache.commons.lang3.StringUtils.isNotBlank(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isNumeric(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isNumericSpace(String str) {
        return org.apache.commons.lang3.StringUtils.isNumericSpace(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Boolean isWhitespace(String str) {
        return org.apache.commons.lang3.StringUtils.isWhitespace(str);
    }

    /**
     *
     *
     * @param elements
     *
     * @return
     */
    public String join(Object... elements) {
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
    public String joinWith(String delimiter, Object... array) {
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
    public Integer lastIndexOf(String seq, String searchSeq) {
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
    public Integer lastIndexOfStart(String seq, String searchSeq, Integer startPos) {
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
    public Integer lastIndexOfAny(String seq, String... searchStrs) {
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
    public Integer lastIndexOfIgnoreCase(String seq, String searchSeq) {
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
    public Integer lastIndexOfIgnoreCaseStart(String seq, String searchSeq, Integer startPos) {
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
    public Integer lastOrdinalIndexOf(String seq, String searchSeq, Integer ordinal) {
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
    public String left(String str, Integer len) {
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
    public String leftPad(String str, Integer size) {
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
    public String leftPadString(String str, Integer size, String padStr) {
        return org.apache.commons.lang3.StringUtils.leftPad(str, size, padStr);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public Integer length(String str) {
        return org.apache.commons.lang3.StringUtils.length(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String lowerCase(String str) {
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
    public String mid(String str, Integer pos, Integer len) {
        return org.apache.commons.lang3.StringUtils.mid(str, pos, len);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String normalizeSpace(String str) {
        return org.apache.commons.lang3.StringUtils.normalizeSpace(str);
    }

    public Integer nthIndexOf(final CharSequence seq, final CharSequence searchSeq, Integer n) {
        return nthIndexOfIgnoreCase(seq, searchSeq, n, false);
    }

    public Integer nthIndexOfIgnoreCase(final CharSequence seq, final CharSequence searchSeq, Integer n, boolean ignoreCase) {
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

    public Integer nthLastIndexOf(final CharSequence seq, final CharSequence searchSeq, Integer n) {
        return nthLastIndexOfIgnoreCase(seq, searchSeq, n, false);
    }

    public Integer nthLastIndexOfIgnoreCase(final CharSequence seq, final CharSequence searchSeq, Integer n, boolean ignoreCase) {
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
    public Integer ordinalIndexOf(String seq, String searchSeq, Integer ordinal) {
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
    public String overlay(String str, String overlay, Integer start, Integer end) {
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
    public String prependIfMissing(String str, String prefix, String... prefixes) {
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
    public String prependIfMissingIgnoreCase(String str, String prefix, String... prefixes) {
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
    public String remove(String str, String remove) {
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
    public String removeEnd(String str, String remove) {
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
    public String removeEndIgnoreCase(String str, String remove) {
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
    public String removeIgnoreCase(String str, String remove) {
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
    public String removeStart(String str, String remove) {
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
    public String removeStartIgnoreCase(String str, String remove) {
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
    public String repeat(String str, Integer repeat) {
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
    public String repeatSeperated(String str, String separator, Integer repeat) {
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
    public String replace(String text, String searchString, String replacement) {
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
    public String replaceMax(String text, String searchString, String replacement, Integer max) {
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
    public String replaceChars(String str, String searchChars, String replaceChars) {
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
    public String replaceEach(String text, String[] searchList, String... replacementList) {
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
    public String replaceEachRepeatedly(String text, String[] searchList, String... replacementList) {
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
    public String replaceIgnoreCase(String text, String searchString, String replacement) {
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
    public String replaceIgnoreCaseMax(String text, String searchString, String replacement, Integer max) {
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
    public String replaceOnce(String text, String searchString, String replacement) {
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
    public String replaceOnceIgnoreCase(String text, String searchString, String replacement) {
        return org.apache.commons.lang3.StringUtils.replaceOnceIgnoreCase(text, searchString, replacement);
    }

    public String reverse(String str) {
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
    public String reverseDelimited(String str, char separatorChar) {
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
    public String right(String str, Integer len) {
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
    public String rightPad(String str, Integer size) {
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
    public String rightPadString(String str, Integer size, String padStr) {
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
    public String rotate(String str, Integer shift) {
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
    public Boolean startsWith(CharSequence str, CharSequence prefix) {
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
    public Boolean startsWithAny(CharSequence str, CharSequence... searchStrings) {
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
    public Boolean startsWithAnyIgnoreCase(String str, String... searchStrings) {
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
    public Boolean startsWithIgnoreCase(String str, String prefix) {
        return org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(str, prefix);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String strip(String str) {
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
    public String stripChars(String str, String stripChars) {
        return org.apache.commons.lang3.StringUtils.strip(str, stripChars);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String stripAccents(String str) {
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
    public String stripEnd(String str, String stripChars) {
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
    public String stripStart(String str, String stripChars) {
        return org.apache.commons.lang3.StringUtils.stripStart(str, stripChars);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String stripToEmpty(String str) {
        return org.apache.commons.lang3.StringUtils.stripToEmpty(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String stripToNull(String str) {
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
    public String substring(String str, Integer start) {
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
    public String substring2(String str, Integer start, Integer end) {
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
    public String substringAfter(String str, String separator) {
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
    public String substringAfterLast(String str, String separator) {
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
    public String substringBefore(String str, String separator) {
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
    public String substringBeforeLast(String str, String separator) {
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
    public String substringBetween(String str, String open, String close) {
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
    public String substringBetweenTag(String str, String tag) {
        return org.apache.commons.lang3.StringUtils.substringBetween(str, tag);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String swapCase(String str) {
        return org.apache.commons.lang3.StringUtils.swapCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String toRootLowerCase(String str) {
        return org.apache.commons.lang3.StringUtils.toRootLowerCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String toRootUpperCase(String str) {
        return org.apache.commons.lang3.StringUtils.toRootUpperCase(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String trim(String str) {
        return org.apache.commons.lang3.StringUtils.trim(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String trimToEmpty(String str) {
        return org.apache.commons.lang3.StringUtils.trimToEmpty(str);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String trimToNull(String str) {
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
    public String truncate(String str, Integer maxWidth) {
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
    public String truncateOffset(String str, Integer offset, Integer maxWidth) {
        return org.apache.commons.lang3.StringUtils.truncate(str, offset, maxWidth);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String uncapitalize(String str) {
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
    public String unwrap(String str, String wrapToken) {
        return org.apache.commons.lang3.StringUtils.unwrap(str, wrapToken);
    }

    /**
     *
     *
     * @param str
     *
     * @return
     */
    public String upperCase(String str) {
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
    public String wrap(String str, String wrapWith) {
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
    public String wrapIfMissing(String str, String wrapWith) {
        return org.apache.commons.lang3.StringUtils.wrapIfMissing(str, wrapWith);
    }

    /**
     * Removes all illegal filename characters from a given String
     *
     * @param name removed.
     * @return String
     * @see
     * "http://en.wikipedia.org/wiki/Filename#Reserved_characters_and_words"
     */
    public String removeIllegalCharacters(String str) {
        return removeIllegalCharacters(str, true);
    }

    /**
     * Removes all illegal filename characters from a given String
     *
     * @param str
     * @param singleSpaces if true, no double spaces are allowed; they get
     * removed.
     * @return String
     * @see
     * "http://en.wikipedia.org/wiki/Filename#Reserved_characters_and_words"
     */
    public String removeIllegalCharacters(String str, boolean singleSpaces) {
        // remove illegal characters and replace with a more friendly char ;)
        String safe = str.trim();

        // remove illegal characters
        safe = safe.replaceAll(
                "[\\/|\\\\|\\*|\\:|\\||\"|\'|\\<|\\>|\\{|\\}|\\?|\\%|,]",
                "");

        // replace . dots with _ and remove the _ if at the end
        safe = safe.replaceAll("\\.", "_");
        if (safe.endsWith("_")) {
            safe = safe.substring(0, safe.length() - 1);
        }

        // replace whitespace characters with _
        safe = safe.replaceAll("\\s+", "_");

        // replace double or more spaces with a single one
        if (singleSpaces) {
            safe = safe.replaceAll("_{2,}", "_");
        }

        return safe;
    }

    public String removeIllegalURLCharacters(String str) {

        try {
            str = URLEncoder.encode(str, StandardCharsets.UTF_8.toString());
            str = str.replace("%", "%25");
            str = str.replace("+", "%20");
            str = str.replace("€", "%80");
            str = str.replace("", "%81");
            str = str.replace("‚", "%82");
            str = str.replace("ƒ", "%83");
            str = str.replace("„", "%84");
            str = str.replace("…", "%85");
            str = str.replace("†", "%86");
            str = str.replace("‡", "%87");
            str = str.replace("ˆ", "%88");
            str = str.replace("‰", "%89");
            str = str.replace("Š", "%8a");
            str = str.replace("‹", "%8b");
            str = str.replace("Œ", "%8c");
            str = str.replace("", "%8d");
            str = str.replace("Ž", "%8e");
            str = str.replace("", "%8f");
            str = str.replace("", "%90");
            str = str.replace("‘", "%91");
            str = str.replace("’", "%92");
            str = str.replace("“", "%93");
            str = str.replace("”", "%94");
            str = str.replace("•", "%95");
            str = str.replace("–", "%96");
            str = str.replace("—", "%97");
            str = str.replace("™", "%99");
            str = str.replace("š", "%9a");
            str = str.replace("›", "%9b");
            str = str.replace("œ", "%9c");
            str = str.replace("", "%9d");
            str = str.replace("ž", "%9e");
            str = str.replace("Ÿ", "%9f");
            str = str.replace("¡", "%a1");
            str = str.replace("¢", "%a2");
            str = str.replace("£", "%a3");
            str = str.replace("¤", "%a4");
            str = str.replace("¥", "%a5");
            str = str.replace("¦", "%a6");
            str = str.replace("§", "%a7");
            str = str.replace("¨", "%a8");
            str = str.replace("©", "%a9");
            str = str.replace("ª", "%aa");
            str = str.replace("«", "%ab");
            str = str.replace("¬", "%ac");
            str = str.replace("®", "%ae");
            str = str.replace("¯", "%af");
            str = str.replace("°", "%b0");
            str = str.replace("±", "%b1");
            str = str.replace("²", "%b2");
            str = str.replace("³", "%b3");
            str = str.replace("´", "%b4");
            str = str.replace("µ", "%b5");
            str = str.replace("¶", "%b6");
            str = str.replace("·", "%b7");
            str = str.replace("¸", "%b8");
            str = str.replace("¹", "%b9");
            str = str.replace("º", "%ba");
            str = str.replace("»", "%bb");
            str = str.replace("¼", "%bc");
            str = str.replace("½", "%bd");
            str = str.replace("¾", "%be");
            str = str.replace("¿", "%bf");
            str = str.replace("À", "%c0");
            str = str.replace("Á", "%c1");
            str = str.replace("Â", "%c2");
            str = str.replace("Ã", "%c3");
            str = str.replace("Ä", "%c4");
            str = str.replace("Å", "%c5");
            str = str.replace("Æ", "%v6");
            str = str.replace("Ç", "%c7");
            str = str.replace("È", "%c8");
            str = str.replace("É", "%c9");
            str = str.replace("Ê", "%ca");
            str = str.replace("Ë", "%cb");
            str = str.replace("Ì", "%cc");
            str = str.replace("Í", "%cd");
            str = str.replace("Î", "%ce");
            str = str.replace("Ï", "%cf");
            str = str.replace("Ð", "%d0");
            str = str.replace("Ñ", "%d1");
            str = str.replace("Ò", "%d2");
            str = str.replace("Ó", "%d3");
            str = str.replace("Ô", "%d4");
            str = str.replace("Õ", "%d5");
            str = str.replace("Ö", "%d6");
            str = str.replace("×", "%d7");
            str = str.replace("Ø", "%d8");
            str = str.replace("Ù", "%d9");
            str = str.replace("Ú", "%da");
            str = str.replace("Û", "%db");
            str = str.replace("Ü", "%dc");
            str = str.replace("Ý", "%dd");
            str = str.replace("Þ", "%de");
            str = str.replace("ß", "%df");
            str = str.replace("à", "%e0");
            str = str.replace("á", "%e1");
            str = str.replace("â", "%e2");
            str = str.replace("ã", "%e3");
            str = str.replace("ä", "%e4");
            str = str.replace("å", "%e5");
            str = str.replace("æ", "%e6");
            str = str.replace("ç", "%e7");
            str = str.replace("è", "%e8");
            str = str.replace("é", "%e9");
            str = str.replace("ê", "%ea");
            str = str.replace("ë", "%eb");
            str = str.replace("ì", "%ec");
            str = str.replace("í", "%ed");
            str = str.replace("î", "%ee");
            str = str.replace("ï", "%ef");
            str = str.replace("ð", "%f0");
            str = str.replace("ñ", "%f1");
            str = str.replace("ò", "%f2");
            str = str.replace("ó", "%f3");
            str = str.replace("ô", "%f4");
            str = str.replace("õ", "%f5");
            str = str.replace("ö", "%f6");
            str = str.replace("÷", "%f7");
            str = str.replace("ø", "%f8");
            str = str.replace("ù", "%f9");
            str = str.replace("ú", "%fa");
            str = str.replace("û", "%fb");
            str = str.replace("ü", "%fc");
            str = str.replace("ý", "%fd");
            str = str.replace("þ", "%fe");
            str = str.replace("ÿ", "%ff");
            str = str.replace("$", "%24");
            str = str.replace("&", "%26");
            str = str.replace("+", "%2b");
            str = str.replace(",", "%2c");
            str = str.replace("/", "%2f");
            str = str.replace(":", "%3a");
            str = str.replace(";", "%3b");
            str = str.replace("=", "%3d");
            str = str.replace("?", "%3f");
            str = str.replace("@", "%40");
            str = str.replace("space", "%20");
            str = str.replace("\"", "%22");
            str = str.replace("<", "%3c");
            str = str.replace(">", "%3e");
            str = str.replace("#", "%23");
            str = str.replace("{", "%7b");
            str = str.replace("}", "%7d");
            str = str.replace("|", "%7c");
            str = str.replace("\\", "%5c");
            str = str.replace("^", "%5e");
            str = str.replace("~", "%7e");
            str = str.replace("[", "%5b");
            str = str.replace("]", "%5d");
            str = str.replace("`", "%60");
            str = str.replace(" ", "%20");
            str = str.replace("!", "%21");
            str = str.replace("#", "%23");
            str = str.replace("$", "%24");
            str = str.replace("&", "%26");
            str = str.replace("'", "%27");
            str = str.replace("(", "%28");
            str = str.replace(")", "%29");
            str = str.replace("*", "%2A");
            str = str.replace("+", "%2B");
            str = str.replace(",", "%2C");
            str = str.replace(".", "%2E");
            str = str.replace("/", "%2F");
            str = str.replace(":", "%3A");
            str = str.replace(";", "%3B");
            str = str.replace("=", "%3D");
            str = str.replace("?", "%3F");
            str = str.replace("@", "%40");
            str = str.replace("[", "%5B");
            str = str.replace("]", "%5D");
            str = str.replace("Ä", "%C3%84");
            str = str.replace("Ö", "%C3%96");
            str = str.replace("Ü", "%C3%9C");
            str = str.replace("ß", "%C3%9F");
            str = str.replace("ä", "%C3%A4");
            str = str.replace("ö", "%C3%B6");
            str = str.replace("ü", "%C3%BC");
            str = str.replace("ẞ", "%E1%BA%9E");
            return str;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JStringUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String replaceGermanCharacters(String str) {
        str = str.replace("Ä", "Ae");
        str = str.replace("Ö", "Oe");
        str = str.replace("Ü", "Ue");
        str = str.replace("ß", "ss");
        str = str.replace("ä", "ae");
        str = str.replace("ö", "oe");
        str = str.replace("ü", "ue");
        str = str.replace("ẞ", "ss");
        return str;
    }
}
