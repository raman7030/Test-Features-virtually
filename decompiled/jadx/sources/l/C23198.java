package l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes.dex */
public final class C23198 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74573 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74574 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map f74575;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Map f74576;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f74576 = C20195.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f74575 = C20195.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3443 m51479(C17714 c17714, ArrayList arrayList) {
        c17714.getClass();
        Charset charset = StandardCharsets.UTF_8;
        String strM41474 = c17714.m41474(charset);
        if (strM41474 != null) {
            Pattern pattern = f74573;
            Matcher matcher = pattern.matcher(strM41474);
            if (matcher.matches()) {
                return m51478(null, matcher, c17714, arrayList);
            }
            String strM41475 = c17714.m41474(charset);
            if (strM41475 != null) {
                Matcher matcher2 = pattern.matcher(strM41475);
                if (matcher2.matches()) {
                    return m51478(strM41474.trim(), matcher2, c17714, arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21927 m51480(String str) {
        C11910 c11910 = new C11910();
        m51482(str, c11910);
        return c11910.m29043();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SpannedString m51476(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            C19956.m46037("ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim = strSubstring2.trim();
                        C22632.m50631(!strTrim.isEmpty());
                        String str3 = C3603.f11424;
                        String str4 = strTrim.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        C10499 c10499 = (C10499) arrayDeque.pop();
                                        m51481(str, c10499, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new C12615(c10499, spannableStringBuilder.length()));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (c10499.f31494.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else {
                                    if (!z2) {
                                        arrayDeque.push(C10499.m26400(spannableStringBuilder.length(), strSubstring2));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            } else {
                spannableStringBuilder.append(cCharAt);
                i++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m51481(str, (C10499) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m51481(str, C10499.m26399(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3443 m51478(String str, Matcher matcher, C17714 c17714, ArrayList arrayList) {
        C11910 c11910 = new C11910();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c11910.f35597 = C7676.m20559(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c11910.f35596 = C7676.m20559(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m51482(strGroup3, c11910);
            StringBuilder sb = new StringBuilder();
            c17714.getClass();
            while (true) {
                String strM41474 = c17714.m41474(StandardCharsets.UTF_8);
                if (!TextUtils.isEmpty(strM41474)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(strM41474.trim());
                } else {
                    c11910.f35605 = m51476(str, sb.toString(), arrayList);
                    return new C3443(c11910.m29043().m49383(), c11910.f35597, c11910.f35596);
                }
            }
        } catch (IllegalArgumentException unused) {
            C19956.m46037("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51482(String str, C11910 c11910) {
        Matcher matcher = f74574.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m51484(strGroup2, c11910);
                } else {
                    if (!"align".equals(strGroup)) {
                        if (!"position".equals(strGroup)) {
                            if ("size".equals(strGroup)) {
                                c11910.f35606 = C7676.m20557(strGroup2);
                            } else if (!"vertical".equals(strGroup)) {
                                C19956.m46037("Unknown cue setting " + strGroup + ":" + strGroup2);
                            } else {
                                if (strGroup2.equals("lr")) {
                                    i = 2;
                                } else if (!strGroup2.equals("rl")) {
                                    C19956.m46037("Invalid 'vertical' value: ".concat(strGroup2));
                                    i = Integer.MIN_VALUE;
                                }
                                c11910.f35598 = i;
                            }
                        } else {
                            int iIndexOf = strGroup2.indexOf(44);
                            if (iIndexOf != -1) {
                                String strSubstring = strGroup2.substring(iIndexOf + 1);
                                strSubstring.getClass();
                                switch (strSubstring) {
                                    case "line-left":
                                    case "start":
                                        i = 0;
                                        break;
                                    case "center":
                                    case "middle":
                                        break;
                                    case "line-right":
                                    case "end":
                                        i = 2;
                                        break;
                                    default:
                                        C19956.m46037("Invalid anchor value: ".concat(strSubstring));
                                        i = Integer.MIN_VALUE;
                                        break;
                                }
                                c11910.f35601 = i;
                                strGroup2 = strGroup2.substring(0, iIndexOf);
                            }
                            c11910.f35603 = C7676.m20557(strGroup2);
                        }
                    } else {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                break;
                            default:
                                C19956.m46037("Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        c11910.f35599 = i;
                    }
                }
            } catch (NumberFormatException unused) {
                C19956.m46037("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51484(String str, C11910 c11910) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    C19956.m46037("Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c11910.f35602 = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c11910.f35600 = C7676.m20557(str);
            c11910.f35604 = 0;
        } else {
            c11910.f35600 = Integer.parseInt(str);
            c11910.f35604 = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51481(String str, C10499 c10499, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = c10499.f31495;
        int length = spannableStringBuilder.length();
        String str2 = c10499.f31494;
        str2.getClass();
        int i2 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : c10499.f31493) {
                    Map map = f74576;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f74575;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new C11344(c10499.f31496), i, length, 33);
                break;
            case "ruby":
                int iM51483 = m51483(list2, str, c10499);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C12615.f38020);
                int i3 = c10499.f31495;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((C12615) arrayList.get(i4)).f38022.f31494)) {
                        C12615 c12615 = (C12615) arrayList.get(i4);
                        int iM51484 = m51483(list2, str, c12615.f38022);
                        if (iM51484 == i2) {
                            iM51484 = iM51483 != i2 ? iM51483 : 1;
                        }
                        int i5 = c12615.f38022.f31495 - length2;
                        int i6 = c12615.f38021 - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new C9933(charSequenceSubSequence.toString(), iM51484), i3, i5, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i3 = i5;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM51477 = m51477(list2, str, c10499);
        for (int i7 = 0; i7 < arrayListM51477.size(); i7++) {
            C4854 c4854 = ((C6265) arrayListM51477.get(i7)).f19402;
            if (c4854.m14134() != -1) {
                C6322.m17573(spannableStringBuilder, new StyleSpan(c4854.m14134()), i, length);
            }
            if (c4854.m14135()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (c4854.m14141()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (c4854.m14136()) {
                C6322.m17573(spannableStringBuilder, new ForegroundColorSpan(c4854.m14142()), i, length);
            }
            if (c4854.m14150()) {
                C6322.m17573(spannableStringBuilder, new BackgroundColorSpan(c4854.m14125()), i, length);
            }
            if (c4854.m14146() != null) {
                C6322.m17573(spannableStringBuilder, new TypefaceSpan(c4854.m14146()), i, length);
            }
            int iM14140 = c4854.m14140();
            if (iM14140 == 1) {
                C6322.m17573(spannableStringBuilder, new AbsoluteSizeSpan((int) c4854.m14145(), true), i, length);
            } else if (iM14140 == 2) {
                C6322.m17573(spannableStringBuilder, new RelativeSizeSpan(c4854.m14145()), i, length);
            } else if (iM14140 == 3) {
                C6322.m17573(spannableStringBuilder, new RelativeSizeSpan(c4854.m14145() / 100.0f), i, length);
            }
            if (c4854.m14139()) {
                spannableStringBuilder.setSpan(new C12754(), i, length, 33);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m51483(List list, String str, C10499 c10499) {
        ArrayList arrayListM51477 = m51477(list, str, c10499);
        for (int i = 0; i < arrayListM51477.size(); i++) {
            C4854 c4854 = ((C6265) arrayListM51477.get(i)).f19402;
            if (c4854.m14151() != -1) {
                return c4854.m14151();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m51477(List list, String str, C10499 c10499) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C4854 c4854 = (C4854) list.get(i);
            int iM14126 = c4854.m14126(str, c10499.f31494, c10499.f31493, c10499.f31496);
            if (iM14126 > 0) {
                arrayList.add(new C6265(iM14126, c4854));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
