package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܳۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T3M6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15887 extends AbstractC13578 {

    /* JADX INFO: renamed from: ֫ */
    public static final C15887 f45992 = new C15887();

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f45993;

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f45994;

    /* JADX INFO: renamed from: ᩳ */
    public static final int[][] f45995;

    static {
        HashMap map = new HashMap();
        f45993 = map;
        map.put("file", 0);
        map.put("cdir", 1);
        map.put("pdir", 1);
        map.put("dir", 1);
        f45994 = new int[]{0, 1, 2};
        f45995 = new int[][]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15887 m36015() {
        return f45992;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        SimpleDateFormat simpleDateFormat;
        boolean z;
        if (str.startsWith(" ")) {
            if (str.length() > 1) {
                C12237 c12237 = new C12237();
                c12237.m28227(str);
                c12237.m28223(str.substring(1));
                return c12237;
            }
        } else {
            String[] strArrSplit = str.split(" ", 2);
            if (strArrSplit.length == 2 && !strArrSplit[1].isEmpty()) {
                String str2 = strArrSplit[0];
                if (str2.endsWith(C0249l.f1196b)) {
                    C12237 c12238 = new C12237();
                    c12238.m28227(str);
                    c12238.m28223(strArrSplit[1]);
                    String[] strArrSplit2 = str2.split(C0249l.f1196b);
                    boolean zContains = strArrSplit[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
                    for (String str3 : strArrSplit2) {
                        String[] strArrSplit3 = str3.split("=", -1);
                        if (strArrSplit3.length == 2) {
                            String str4 = strArrSplit3[0];
                            Locale locale = Locale.ENGLISH;
                            String lowerCase = str4.toLowerCase(locale);
                            String str5 = strArrSplit3[1];
                            if (!str5.isEmpty()) {
                                String lowerCase2 = str5.toLowerCase(locale);
                                lowerCase.getClass();
                                switch (lowerCase) {
                                    case "modify":
                                        if (str5.contains(".")) {
                                            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
                                            z = true;
                                        } else {
                                            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                                            z = false;
                                        }
                                        TimeZone timeZone = C5468.getTimeZone("GMT");
                                        simpleDateFormat.setTimeZone(timeZone);
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                                        ParsePosition parsePosition = new ParsePosition(0);
                                        simpleDateFormat.setLenient(false);
                                        Date date = simpleDateFormat.parse(str5, parsePosition);
                                        if (parsePosition.getIndex() != str5.length()) {
                                            gregorianCalendar = null;
                                        } else {
                                            gregorianCalendar.setTime(date);
                                            if (!z) {
                                                gregorianCalendar.clear(14);
                                            }
                                        }
                                        if (gregorianCalendar == null) {
                                            return null;
                                        }
                                        c12238.m28214(gregorianCalendar);
                                        break;
                                        break;
                                    case "sizd":
                                    case "size":
                                        c12238.m28212(Long.parseLong(str5));
                                        break;
                                    case "type":
                                        Integer num = (Integer) f45993.get(lowerCase2);
                                        if (num == null) {
                                            c12238.m28210(3);
                                            break;
                                        } else {
                                            c12238.m28210(num.intValue());
                                            break;
                                        }
                                        break;
                                    default:
                                        if (lowerCase.startsWith("unix.")) {
                                            String lowerCase3 = lowerCase.substring(5).toLowerCase(locale);
                                            lowerCase3.getClass();
                                            switch (lowerCase3) {
                                                case "mode":
                                                    int length = str5.length() - 3;
                                                    int i = 0;
                                                    for (int i2 = 3; i < i2; i2 = 3) {
                                                        int iCharAt = str5.charAt(length + i) - '0';
                                                        if (iCharAt >= 0 && iCharAt <= 7) {
                                                            for (int i3 : f45995[iCharAt]) {
                                                                c12238.m28211(f45994[i], i3, true);
                                                            }
                                                        }
                                                        i++;
                                                    }
                                                    break;
                                                case "group":
                                                    c12238.m28213(str5);
                                                    break;
                                                case "owner":
                                                    c12238.m28225(str5);
                                                    break;
                                            }
                                        } else {
                                            if (!zContains && "perm".equals(lowerCase)) {
                                                for (char c : lowerCase2.toCharArray()) {
                                                    if (c == 'a') {
                                                        c12238.m28211(0, 1, true);
                                                    } else if (c == 'p') {
                                                        c12238.m28211(0, 1, true);
                                                    } else if (c == 'r') {
                                                        c12238.m28211(0, 0, true);
                                                    } else if (c == 'w') {
                                                        c12238.m28211(0, 1, true);
                                                    } else if (c == 'l') {
                                                        c12238.m28211(0, 2, true);
                                                    } else if (c != 'm') {
                                                        switch (c) {
                                                            case C0254q.f1216f /* 99 */:
                                                                c12238.m28211(0, 1, true);
                                                                break;
                                                            case 'd':
                                                                c12238.m28211(0, 1, true);
                                                                break;
                                                            case 'e':
                                                                c12238.m28211(0, 0, true);
                                                                break;
                                                        }
                                                    } else {
                                                        c12238.m28211(0, 1, true);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    return c12238;
                }
            }
        }
        return null;
    }
}
