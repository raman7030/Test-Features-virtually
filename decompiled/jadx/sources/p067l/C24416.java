package p067l;

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
public final class C24416 {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f77316 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f77317 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: ܽ */
    public static final Map f77318;

    /* JADX INFO: renamed from: ᩳ */
    public static final Map f77319;

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
        f77319 = C21562.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f77318 = C21562.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5641 m53875(C19203 c19203, ArrayList arrayList) {
        c19203.getClass();
        Charset charset = StandardCharsets.UTF_8;
        String strM43720 = c19203.m43720(charset);
        if (strM43720 != null) {
            Pattern pattern = f77316;
            Matcher matcher = pattern.matcher(strM43720);
            if (matcher.matches()) {
                return m53874(null, matcher, c19203, arrayList);
            }
            String strM43721 = c19203.m43720(charset);
            if (strM43721 != null) {
                Matcher matcher2 = pattern.matcher(strM43721);
                if (matcher2.matches()) {
                    return m53874(strM43720.trim(), matcher2, c19203, arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23207 m53876(String str) {
        C13688 c13688 = new C13688();
        m53878(str, c13688);
        return c13688.m31095();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX INFO: renamed from: ֫ */
    public static SpannedString m53872(String str, String str2, List list) {
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
                            C21334.m48351("ignoring unsupported entity: '&" + strSubstring + ";'");
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
                        C23877.m52957(!strTrim.isEmpty());
                        String str3 = C5792.f14228;
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
                                        C12347 c12347 = (C12347) arrayDeque.pop();
                                        m53877(str, c12347, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new C14358(c12347, spannableStringBuilder.length()));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (c12347.f34456.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else {
                                    if (!z2) {
                                        arrayDeque.push(C12347.m28433(spannableStringBuilder.length(), strSubstring2));
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
            m53877(str, (C12347) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m53877(str, C12347.m28432(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5641 m53874(String str, Matcher matcher, C19203 c19203, ArrayList arrayList) {
        C13688 c13688 = new C13688();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c13688.f38606 = C9664.m22539(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c13688.f38605 = C9664.m22539(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m53878(strGroup3, c13688);
            StringBuilder sb = new StringBuilder();
            c19203.getClass();
            while (true) {
                String strM43720 = c19203.m43720(StandardCharsets.UTF_8);
                if (!TextUtils.isEmpty(strM43720)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(strM43720.trim());
                } else {
                    c13688.f38614 = m53872(str, sb.toString(), arrayList);
                    return new C5641(c13688.m31095().m51720(), c13688.f38606, c13688.f38605);
                }
            }
        } catch (IllegalArgumentException unused) {
            C21334.m48351("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX INFO: renamed from: ֫ */
    public static void m53878(String str, C13688 c13688) {
        Matcher matcher = f77317.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m53880(strGroup2, c13688);
                } else {
                    if (!"align".equals(strGroup)) {
                        if (!"position".equals(strGroup)) {
                            if ("size".equals(strGroup)) {
                                c13688.f38615 = C9664.m22537(strGroup2);
                            } else if (!"vertical".equals(strGroup)) {
                                C21334.m48351("Unknown cue setting " + strGroup + ":" + strGroup2);
                            } else {
                                if (strGroup2.equals("lr")) {
                                    i = 2;
                                } else if (!strGroup2.equals("rl")) {
                                    C21334.m48351("Invalid 'vertical' value: ".concat(strGroup2));
                                    i = Integer.MIN_VALUE;
                                }
                                c13688.f38607 = i;
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
                                        C21334.m48351("Invalid anchor value: ".concat(strSubstring));
                                        i = Integer.MIN_VALUE;
                                        break;
                                }
                                c13688.f38610 = i;
                                strGroup2 = strGroup2.substring(0, iIndexOf);
                            }
                            c13688.f38612 = C9664.m22537(strGroup2);
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
                                C21334.m48351("Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        c13688.f38608 = i;
                    }
                }
            } catch (NumberFormatException unused) {
                C21334.m48351("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53880(String str, C13688 c13688) {
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
                    C21334.m48351("Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c13688.f38611 = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c13688.f38609 = C9664.m22537(str);
            c13688.f38613 = 0;
        } else {
            c13688.f38609 = Integer.parseInt(str);
            c13688.f38613 = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX INFO: renamed from: ֫ */
    public static void m53877(String str, C12347 c12347, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = c12347.f34457;
        int length = spannableStringBuilder.length();
        String str2 = c12347.f34456;
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
                for (String str3 : c12347.f34455) {
                    Map map = f77319;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f77318;
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
                spannableStringBuilder.setSpan(new C13149(c12347.f34458), i, length, 33);
                break;
            case "ruby":
                int iM53879 = m53879(list2, str, c12347);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C14358.f41046);
                int i3 = c12347.f34457;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((C14358) arrayList.get(i4)).f41048.f34456)) {
                        C14358 c14358 = (C14358) arrayList.get(i4);
                        int iM538710 = m53879(list2, str, c14358.f41048);
                        if (iM538710 == i2) {
                            iM538710 = iM53879 != i2 ? iM53879 : 1;
                        }
                        int i5 = c14358.f41048.f34457 - length2;
                        int i6 = c14358.f41047 - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new C11808(charSequenceSubSequence.toString(), iM538710), i3, i5, 33);
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
        ArrayList arrayListM53873 = m53873(list2, str, c12347);
        for (int i7 = 0; i7 < arrayListM53873.size(); i7++) {
            C6982 c6982 = ((C8323) arrayListM53873.get(i7)).f22265;
            if (c6982.m16015() != -1) {
                C8377.m19513(spannableStringBuilder, new StyleSpan(c6982.m16015()), i, length);
            }
            if (c6982.m16016()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (c6982.m16022()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (c6982.m16017()) {
                C8377.m19513(spannableStringBuilder, new ForegroundColorSpan(c6982.m16023()), i, length);
            }
            if (c6982.m16031()) {
                C8377.m19513(spannableStringBuilder, new BackgroundColorSpan(c6982.m16006()), i, length);
            }
            if (c6982.m16027() != null) {
                C8377.m19513(spannableStringBuilder, new TypefaceSpan(c6982.m16027()), i, length);
            }
            int iM16021 = c6982.m16021();
            if (iM16021 == 1) {
                C8377.m19513(spannableStringBuilder, new AbsoluteSizeSpan((int) c6982.m16026(), true), i, length);
            } else if (iM16021 == 2) {
                C8377.m19513(spannableStringBuilder, new RelativeSizeSpan(c6982.m16026()), i, length);
            } else if (iM16021 == 3) {
                C8377.m19513(spannableStringBuilder, new RelativeSizeSpan(c6982.m16026() / 100.0f), i, length);
            }
            if (c6982.m16020()) {
                spannableStringBuilder.setSpan(new C14489(), i, length, 33);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m53879(List list, String str, C12347 c12347) {
        ArrayList arrayListM53873 = m53873(list, str, c12347);
        for (int i = 0; i < arrayListM53873.size(); i++) {
            C6982 c6982 = ((C8323) arrayListM53873.get(i)).f22265;
            if (c6982.m16032() != -1) {
                return c6982.m16032();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m53873(List list, String str, C12347 c12347) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C6982 c6982 = (C6982) list.get(i);
            int iM16007 = c6982.m16007(str, c12347.f34456, c12347.f34455, c12347.f34458);
            if (iM16007 > 0) {
                arrayList.add(new C8323(iM16007, c6982));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
