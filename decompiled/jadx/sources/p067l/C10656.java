package p067l;

import android.graphics.Color;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.umeng.analytics.pro.C0698cb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۡۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 096Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10656 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f29472;

    /* JADX INFO: renamed from: ۧ */
    public final int f29473;

    /* JADX INFO: renamed from: ܽ */
    public final int f29474;

    /* JADX INFO: renamed from: ᩳ */
    public final int f29475;

    /* JADX INFO: renamed from: ۜ */
    public static final AtomicInteger f29466 = new AtomicInteger((int) (System.currentTimeMillis() / 1000));

    /* JADX INFO: renamed from: ܿ */
    public static final C13259 f29469 = C13259.m30303(2, "parseColor\\((\\d+|_|AUTO),(\\d+|_|AUTO),([A-Z]+)(?:,(.+))?\\)");

    /* JADX INFO: renamed from: ᩻ */
    public static final C13929 f29471 = C13259.m30303(2, "(?<![a-f0-9])[a-f0-9]{3,8}(?![a-z0-9])").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ᩷ */
    public static final C13929 f29470 = C13259.m30304("-?\\d+").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ܳ */
    public static final C13929 f29468 = C13259.m30304("-?\\d+(\\.\\d+)?%?").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ۢ */
    public static final BigDecimal f29467 = BigDecimal.valueOf(255L);

    public C10656(int i, int i2, int i3, int i4) {
        this.f29474 = i;
        this.f29472 = i2;
        this.f29475 = i3;
        this.f29473 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10656)) {
            return false;
        }
        C10656 c10656 = (C10656) obj;
        return this.f29474 == c10656.f29474 && this.f29472 == c10656.f29472 && this.f29475 == c10656.f29475 && this.f29473 == c10656.f29473;
    }

    public final int hashCode() {
        return (((((this.f29474 * 31) + this.f29472) * 31) + this.f29475) * 31) + this.f29473;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f29474), Integer.valueOf(this.f29472), Integer.valueOf(this.f29475), Integer.valueOf(this.f29473)};
        String[] strArrSplit = "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".length() == 0 ? new String[0] : "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("ColorParser[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m24504() {
        return this.f29472;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m24506() {
        return this.f29475;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24507() {
        return this.f29473;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m24508() {
        return this.f29474;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public static C10656 m24497(String str) {
        C13929 c13929Matcher = f29469.matcher((CharSequence) str);
        if (!c13929Matcher.matches()) {
            throw new RuntimeException(C21466.m48631("Parse failed: ", str));
        }
        String strGroup = c13929Matcher.group(1);
        C12826.requireNonNull(strGroup);
        int i = -2;
        byte b = -1;
        int i2 = strGroup.equals("_") ? -1 : strGroup.equalsIgnoreCase("auto") ? -2 : Integer.parseInt(strGroup);
        int i3 = 2;
        String strGroup2 = c13929Matcher.group(2);
        C12826.requireNonNull(strGroup2);
        if (strGroup2.equals("_")) {
            i = -1;
        } else if (!strGroup2.equalsIgnoreCase("auto")) {
            i = Integer.parseInt(strGroup2);
        }
        if (i2 < 0 && i < 0) {
            throw new RuntimeException(C21466.m48631("Illegal arguments: ", str));
        }
        String strGroup3 = c13929Matcher.group(3);
        C12826.requireNonNull(strGroup3);
        String upperCase = strGroup3.toUpperCase();
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case 71419:
                if (upperCase.equals("HEX")) {
                    b = 0;
                }
                break;
            case 71841:
                if (upperCase.equals("HSL")) {
                    b = 1;
                }
                break;
            case 71851:
                if (upperCase.equals("HSV")) {
                    b = 2;
                }
                break;
            case 81069:
                if (upperCase.equals("RGB")) {
                    b = 3;
                }
                break;
            case 2017484:
                if (upperCase.equals("ARGB")) {
                    b = 4;
                }
                break;
            case 2214054:
                if (upperCase.equals("HEXA")) {
                    b = 5;
                }
                break;
            case 2227136:
                if (upperCase.equals("HSLA")) {
                    b = 6;
                }
                break;
            case 2227446:
                if (upperCase.equals("HSVA")) {
                    b = 7;
                }
                break;
            case 2513204:
                if (upperCase.equals("RGBA")) {
                    b = 8;
                }
                break;
            case 2513209:
                if (upperCase.equals("RGBF")) {
                    b = 9;
                }
                break;
            case 2513227:
                if (upperCase.equals("RGBX")) {
                    b = 10;
                }
                break;
            case 2702677:
                if (upperCase.equals("XRGB")) {
                    b = 11;
                }
                break;
            case 62542074:
                if (upperCase.equals("ARGBF")) {
                    b = 12;
                }
                break;
            case 77909394:
                if (upperCase.equals("RGBAF")) {
                    b = C0698cb.f2569k;
                }
                break;
        }
        switch (b) {
            case 0:
                i3 = 0;
                break;
            case 1:
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 1;
                break;
            case 4:
                i3 = 10;
                break;
            case 5:
                i3 = 8;
                break;
            case 6:
                i3 = 5;
                break;
            case 7:
                i3 = 6;
                break;
            case 8:
                i3 = 4;
                break;
            case 9:
                i3 = 11;
                break;
            case 10:
                i3 = 9;
                break;
            case 11:
                i3 = 7;
                break;
            case 12:
                i3 = 12;
                break;
            case 13:
                i3 = 13;
                break;
            default:
                throw new RuntimeException(C21466.m48631("Illegal arguments: ", str));
        }
        return new C10656(i2, i, i3, C7026.m16158(c13929Matcher.group(4)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m24505(C23120 c23120, C23120 c23121, C13929 c13929, C4700 c4700) {
        try {
            return m24501(c23120, c23121, c13929, c4700);
        } catch (C11327 e) {
            throw e.f31549;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6 A[Catch: Exception -> 0x00e6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX INFO: renamed from: ۧ */
    private C23120 m24501(C23120 c23120, C23120 c23121, C13929 c13929, C4700 c4700) {
        int iM21980;
        int iM21981;
        boolean z;
        int iM24492;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String strConcat;
        int i6;
        C23120 c23120M20941;
        try {
            int i7 = this.f29474;
            int i8 = this.f29472;
            if (i7 > c13929.groupCount() || i8 > c13929.groupCount()) {
                return c23120;
            }
            boolean z2 = true;
            int i9 = this.f29475;
            int i10 = 0;
            if (i7 < 0) {
                iM21980 = 0;
                iM21981 = 0;
                z = false;
            } else {
                String strGroup = c13929.group(i7);
                if (strGroup == null) {
                    i7 = -1;
                    iM21980 = 0;
                    iM21981 = 0;
                    z = false;
                } else {
                    iM21980 = m24492(strGroup, i9, c4700);
                    if (iM21980 != 1447446) {
                        iM21981 = iM21980;
                        z = true;
                    } else {
                        i7 = -1;
                        iM21981 = iM21980;
                        z = false;
                    }
                }
            }
            if (i8 >= 0) {
                String strGroup2 = c13929.group(i8);
                if (strGroup2 != null) {
                    iM24492 = m24492(strGroup2, i9, c4700);
                    i = iM24492;
                    if (iM24492 != 1447446) {
                    }
                    if (i7 >= 0 && i8 < 0) {
                        return c23120;
                    }
                    if (i7 == -2) {
                        if (c23121 == null) {
                            c23120M20941 = C9038.m20941();
                        } else {
                            c23120M20941 = c23121;
                        }
                        iM21980 = C9464.m21980(iM24492, c23120M20941.m51561());
                        iM21981 = C9464.m21980(i, c23120M20941.m51563());
                        i7 = 0;
                    }
                    i2 = iM21980;
                    i3 = iM21981;
                    if (i8 == -2) {
                        if (C9464.m21977(i2) > 130) {
                            i6 = -16777216;
                        } else {
                            i6 = -1;
                        }
                        i4 = i6;
                        i5 = C9464.m21977(i3) > 130 ? -16777216 : -1;
                    } else {
                        i4 = iM24492;
                        i5 = i;
                        i10 = i8;
                    }
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    strConcat = str.concat(z2 ? "1" : "0");
                    if (i7 < 0 && i10 >= 0) {
                        return c23120.m51554(C23120.m51549(strConcat, i2, i4, i3, i5, 64));
                    }
                    if (i7 >= 0) {
                        return c23120.m51554(C23120.m51549(strConcat, i2, 1447446, i3, 1447446, 64));
                    }
                    return c23120.m51554(C23120.m51549(strConcat, 1447446, i4, 1447446, i5, 64));
                }
                iM24492 = 0;
                i = 0;
                i8 = -1;
            } else {
                iM24492 = 0;
                i = 0;
            }
            z2 = false;
            if (i7 >= 0) {
            }
            if (i7 == -2) {
                if (c23121 == null) {
                    c23120M20941 = C9038.m20941();
                } else {
                    c23120M20941 = c23121;
                }
                iM21980 = C9464.m21980(iM24492, c23120M20941.m51561());
                iM21981 = C9464.m21980(i, c23120M20941.m51563());
                i7 = 0;
            }
            i2 = iM21980;
            i3 = iM21981;
            if (i8 == -2) {
                if (C9464.m21977(i2) > 130) {
                    i6 = -16777216;
                } else {
                    i6 = -1;
                }
                i4 = i6;
                i5 = C9464.m21977(i3) > 130 ? -16777216 : -1;
            } else {
                i4 = iM24492;
                i5 = i;
                i10 = i8;
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            strConcat = str.concat(z2 ? "1" : "0");
            if (i7 < 0) {
            }
            if (i7 >= 0) {
                return c23120.m51554(C23120.m51549(strConcat, i2, 1447446, i3, 1447446, 64));
            }
            return c23120.m51554(C23120.m51549(strConcat, 1447446, i4, 1447446, i5, 64));
        } catch (Exception unused) {
            return c23120;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫ */
    public static String m24494(int i, int i2, String str) {
        int iEnd;
        boolean z = true;
        int i3 = 0;
        switch (i) {
            case 0:
                String str2 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%08X", Integer.valueOf(i2));
                C13929 c13929 = f29471;
                synchronized (c13929) {
                    c13929.m56473reset((CharSequence) str);
                    if (!c13929.find()) {
                        return null;
                    }
                    return str.substring(0, c13929.start()) + str2 + str.substring(c13929.end());
                }
            case 1:
                C13929 c139210 = f29470;
                synchronized (c139210) {
                    StringBuilder sb = new StringBuilder();
                    c139210.m56473reset((CharSequence) str);
                    if (c139210.find()) {
                        sb.append((CharSequence) str, 0, c139210.start());
                        sb.append(Color.red(i2));
                        int iEnd2 = c139210.end();
                        if (c139210.find()) {
                            sb.append((CharSequence) str, iEnd2, c139210.start());
                            sb.append(Color.green(i2));
                            int iEnd3 = c139210.end();
                            if (c139210.find()) {
                                sb.append((CharSequence) str, iEnd3, c139210.start());
                                sb.append(Color.blue(i2));
                                sb.append((CharSequence) str, c139210.end(), str.length());
                                return sb.toString();
                            }
                        }
                    }
                    return null;
                }
            case 2:
                float[] fArr = new float[3];
                C1199.m21219(i2, fArr);
                C13929 c139211 = f29468;
                synchronized (c139211) {
                    StringBuilder sb2 = new StringBuilder();
                    c139211.m56473reset((CharSequence) str);
                    if (c139211.find()) {
                        sb2.append((CharSequence) str, 0, c139211.start());
                        sb2.append(m24495(c139211.group(), fArr[0]));
                        int iEnd4 = c139211.end();
                        if (c139211.find()) {
                            sb2.append((CharSequence) str, iEnd4, c139211.start());
                            sb2.append(m24495(c139211.group(), fArr[1]));
                            int iEnd5 = c139211.end();
                            if (c139211.find()) {
                                sb2.append((CharSequence) str, iEnd5, c139211.start());
                                sb2.append(m24495(c139211.group(), fArr[2]));
                                sb2.append((CharSequence) str, c139211.end(), str.length());
                                return sb2.toString();
                            }
                        }
                    }
                    return null;
                }
            case 3:
                float[] fArr2 = new float[3];
                C9464.m21979(i2, fArr2);
                C13929 c139212 = f29468;
                synchronized (c139212) {
                    StringBuilder sb3 = new StringBuilder();
                    c139212.m56473reset((CharSequence) str);
                    if (c139212.find()) {
                        sb3.append((CharSequence) str, 0, c139212.start());
                        sb3.append(m24495(c139212.group(), fArr2[0]));
                        int iEnd6 = c139212.end();
                        if (c139212.find()) {
                            sb3.append((CharSequence) str, iEnd6, c139212.start());
                            sb3.append(m24495(c139212.group(), fArr2[1]));
                            int iEnd7 = c139212.end();
                            if (c139212.find()) {
                                sb3.append((CharSequence) str, iEnd7, c139212.start());
                                sb3.append(m24495(c139212.group(), fArr2[2]));
                                sb3.append((CharSequence) str, c139212.end(), str.length());
                                return sb3.toString();
                            }
                        }
                    }
                    return null;
                }
            case 4:
                StringBuilder sb4 = new StringBuilder();
                C13929 c139213 = f29470;
                synchronized (c139213) {
                    c139213.m56473reset((CharSequence) str);
                    if (c139213.find()) {
                        sb4.append((CharSequence) str, 0, c139213.start());
                        sb4.append(Color.red(i2));
                        int iEnd8 = c139213.end();
                        if (c139213.find()) {
                            sb4.append((CharSequence) str, iEnd8, c139213.start());
                            sb4.append(Color.green(i2));
                            iEnd8 = c139213.end();
                            if (c139213.find()) {
                                sb4.append((CharSequence) str, iEnd8, c139213.start());
                                sb4.append(Color.blue(i2));
                                iEnd = c139213.end();
                            }
                        }
                        i3 = iEnd8;
                        z = false;
                        iEnd = i3;
                    } else {
                        z = false;
                        iEnd = i3;
                    }
                    break;
                }
                if (z) {
                    C13929 c139214 = f29468;
                    synchronized (c139214) {
                        c139214.m56473reset((CharSequence) str);
                        if (!c139214.find(iEnd)) {
                            return null;
                        }
                        sb4.append((CharSequence) str, iEnd, c139214.start());
                        sb4.append(m24502(Color.alpha(i2), c139214.group()));
                        sb4.append((CharSequence) str, c139214.end(), str.length());
                        return sb4.toString();
                    }
                }
                return null;
            case 5:
                float[] fArr3 = new float[3];
                C1199.m21219(i2, fArr3);
                C13929 c139215 = f29468;
                synchronized (c139215) {
                    StringBuilder sb5 = new StringBuilder();
                    c139215.m56473reset((CharSequence) str);
                    if (c139215.find()) {
                        sb5.append((CharSequence) str, 0, c139215.start());
                        sb5.append(m24495(c139215.group(), fArr3[0]));
                        int iEnd9 = c139215.end();
                        if (c139215.find()) {
                            sb5.append((CharSequence) str, iEnd9, c139215.start());
                            sb5.append(m24495(c139215.group(), fArr3[1]));
                            int iEnd10 = c139215.end();
                            if (c139215.find()) {
                                sb5.append((CharSequence) str, iEnd10, c139215.start());
                                sb5.append(m24495(c139215.group(), fArr3[2]));
                                int iEnd11 = c139215.end();
                                if (c139215.find()) {
                                    sb5.append((CharSequence) str, iEnd11, c139215.start());
                                    sb5.append(m24502(Color.alpha(i2), c139215.group()));
                                    sb5.append((CharSequence) str, c139215.end(), str.length());
                                    return sb5.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 6:
                float[] fArr4 = new float[3];
                C9464.m21979(i2, fArr4);
                C13929 c139216 = f29468;
                synchronized (c139216) {
                    StringBuilder sb6 = new StringBuilder();
                    c139216.m56473reset((CharSequence) str);
                    if (c139216.find()) {
                        sb6.append((CharSequence) str, 0, c139216.start());
                        sb6.append(m24495(c139216.group(), fArr4[0]));
                        int iEnd12 = c139216.end();
                        if (c139216.find()) {
                            sb6.append((CharSequence) str, iEnd12, c139216.start());
                            sb6.append(m24495(c139216.group(), fArr4[1]));
                            int iEnd13 = c139216.end();
                            if (c139216.find()) {
                                sb6.append((CharSequence) str, iEnd13, c139216.start());
                                sb6.append(m24495(c139216.group(), fArr4[2]));
                                int iEnd14 = c139216.end();
                                if (c139216.find()) {
                                    sb6.append((CharSequence) str, iEnd14, c139216.start());
                                    sb6.append(m24502(Color.alpha(i2), c139216.group()));
                                    sb6.append((CharSequence) str, c139216.end(), str.length());
                                    return sb6.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 7:
                C13929 c139217 = f29470;
                synchronized (c139217) {
                    StringBuilder sb7 = new StringBuilder();
                    c139217.m56473reset((CharSequence) str);
                    if (c139217.find()) {
                        sb7.append((CharSequence) str, 0, c139217.start());
                        sb7.append(Color.alpha(i2));
                        int iEnd15 = c139217.end();
                        if (c139217.find()) {
                            sb7.append((CharSequence) str, iEnd15, c139217.start());
                            sb7.append(Color.red(i2));
                            int iEnd16 = c139217.end();
                            if (c139217.find()) {
                                sb7.append((CharSequence) str, iEnd16, c139217.start());
                                sb7.append(Color.green(i2));
                                int iEnd17 = c139217.end();
                                if (c139217.find()) {
                                    sb7.append((CharSequence) str, iEnd17, c139217.start());
                                    sb7.append(Color.blue(i2));
                                    sb7.append((CharSequence) str, c139217.end(), str.length());
                                    return sb7.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 8:
                String str3 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%06X%02X", Integer.valueOf(i2 & 16777215), Integer.valueOf(i2 >>> 24));
                C13929 c139218 = f29471;
                synchronized (c139218) {
                    c139218.m56473reset((CharSequence) str);
                    if (!c139218.find()) {
                        return null;
                    }
                    return str.substring(0, c139218.start()) + str3 + str.substring(c139218.end());
                }
            case 9:
                C13929 c139219 = f29470;
                synchronized (c139219) {
                    StringBuilder sb8 = new StringBuilder();
                    c139219.m56473reset((CharSequence) str);
                    if (c139219.find()) {
                        sb8.append((CharSequence) str, 0, c139219.start());
                        sb8.append(Color.red(i2));
                        int iEnd18 = c139219.end();
                        if (c139219.find()) {
                            sb8.append((CharSequence) str, iEnd18, c139219.start());
                            sb8.append(Color.green(i2));
                            int iEnd19 = c139219.end();
                            if (c139219.find()) {
                                sb8.append((CharSequence) str, iEnd19, c139219.start());
                                sb8.append(Color.blue(i2));
                                int iEnd20 = c139219.end();
                                if (c139219.find()) {
                                    sb8.append((CharSequence) str, iEnd20, c139219.start());
                                    sb8.append(Color.alpha(i2));
                                    sb8.append((CharSequence) str, c139219.end(), str.length());
                                    return sb8.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 10:
                StringBuilder sb9 = new StringBuilder();
                C13929 c139220 = f29468;
                synchronized (c139220) {
                    c139220.m56473reset((CharSequence) str);
                    if (!c139220.find()) {
                        return null;
                    }
                    sb9.append((CharSequence) str, 0, c139220.start());
                    sb9.append(m24502(Color.alpha(i2), c139220.group()));
                    int iEnd21 = c139220.end();
                    C13929 c139221 = f29470;
                    synchronized (c139221) {
                        c139221.m56473reset((CharSequence) str);
                        if (c139221.find(iEnd21)) {
                            sb9.append((CharSequence) str, iEnd21, c139221.start());
                            sb9.append(Color.red(i2));
                            int iEnd22 = c139221.end();
                            if (c139221.find()) {
                                sb9.append((CharSequence) str, iEnd22, c139221.start());
                                sb9.append(Color.green(i2));
                                int iEnd23 = c139221.end();
                                if (c139221.find()) {
                                    sb9.append((CharSequence) str, iEnd23, c139221.start());
                                    sb9.append(Color.blue(i2));
                                    sb9.append((CharSequence) str, c139221.end(), str.length());
                                    return sb9.toString();
                                }
                            }
                        }
                        return null;
                    }
                }
            case 11:
                return m24496(str, Color.red(i2), Color.green(i2), Color.blue(i2));
            case 12:
                return m24496(str, Color.alpha(i2), Color.red(i2), Color.green(i2), Color.blue(i2));
            case 13:
                return m24496(str, Color.red(i2), Color.green(i2), Color.blue(i2), Color.alpha(i2));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m24496(String str, int... iArr) {
        C13929 c13929 = f29468;
        synchronized (c13929) {
            StringBuilder sb = new StringBuilder();
            c13929.m56473reset((CharSequence) str);
            int iEnd = 0;
            for (int i : iArr) {
                if (!c13929.find()) {
                    return null;
                }
                sb.append((CharSequence) str, iEnd, c13929.start());
                sb.append(m24502(i, c13929.group()));
                iEnd = c13929.end();
            }
            sb.append((CharSequence) str, iEnd, str.length());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m24502(int i, String str) {
        boolean zEndsWith = str.endsWith("%");
        long j = i;
        if (zEndsWith) {
            j *= 100;
        }
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).divide(f29467, zEndsWith ? 2 : 3, RoundingMode.CEILING);
        String plainString = (bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C17588.m40053(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m24500(int i, String str) {
        return m24492(str, i, (C4700) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24492(String str, int i, C4700 c4700) {
        String strGroup;
        String strGroup2;
        String strGroup3;
        String strGroup4;
        String strGroup5;
        String strGroup6;
        String strGroup7;
        String strGroup8;
        String strGroup9;
        int iEnd;
        String strGroup10;
        String strGroup11;
        String strGroup12;
        String strGroup13;
        String strGroup14;
        String strGroup15;
        String strGroup16;
        String strGroup17;
        String strGroup18;
        String strGroup19;
        String strGroup20;
        String strGroup21;
        String strGroup22;
        String str2;
        String strGroup23;
        String strGroup24;
        int iEnd2 = -1;
        String strGroup25 = null;
        switch (i) {
            case 0:
                C13929 c13929 = f29471;
                synchronized (c13929) {
                    c13929.m56473reset((CharSequence) str);
                    boolean zFind = c13929.find();
                    m24498(c13929, zFind, c4700);
                    strGroup25 = zFind ? c13929.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                return C11774.m27016(strGroup25);
            case 1:
                C13929 c139210 = f29470;
                synchronized (c139210) {
                    c139210.m56473reset((CharSequence) str);
                    boolean zFind2 = c139210.find();
                    m24498(c139210, zFind2, c4700);
                    if (zFind2) {
                        strGroup = c139210.group();
                        boolean zFind3 = c139210.find();
                        m24498(c139210, zFind3, c4700);
                        if (zFind3) {
                            strGroup2 = c139210.group();
                            boolean zFind4 = c139210.find();
                            m24498(c139210, zFind4, c4700);
                            if (zFind4) {
                                strGroup25 = c139210.group();
                            }
                        } else {
                            strGroup2 = null;
                        }
                    } else {
                        strGroup = null;
                        strGroup2 = null;
                    }
                    break;
                }
                if (strGroup25 == null || strGroup.length() > 3 || strGroup2.length() > 3 || strGroup25.length() > 3) {
                    return 1447446;
                }
                int i2 = Integer.parseInt(strGroup);
                int i3 = Integer.parseInt(strGroup2);
                int i4 = Integer.parseInt(strGroup25);
                if (i2 < 0 || i2 > 255 || i3 < 0 || i3 > 255 || i4 < 0 || i4 > 255) {
                    return 1447446;
                }
                return Color.rgb(i2, i3, i4);
            case 2:
                C13929 c139211 = f29468;
                synchronized (c139211) {
                    c139211.m56473reset((CharSequence) str);
                    boolean zFind5 = c139211.find();
                    m24498(c139211, zFind5, c4700);
                    if (zFind5) {
                        strGroup3 = c139211.group();
                        boolean zFind6 = c139211.find();
                        m24498(c139211, zFind6, c4700);
                        if (zFind6) {
                            strGroup4 = c139211.group();
                            boolean zFind7 = c139211.find();
                            m24498(c139211, zFind7, c4700);
                            if (zFind7) {
                                strGroup25 = c139211.group();
                            }
                        } else {
                            strGroup4 = null;
                        }
                    } else {
                        strGroup3 = null;
                        strGroup4 = null;
                    }
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM24499 = m24499(strGroup3);
                float fM244910 = m24499(strGroup4);
                float fM244911 = m24499(strGroup25);
                if (fM24499 == 360.0f) {
                    fM24499 = 0.0f;
                }
                if (fM24499 < 0.0f || fM24499 > 360.0f || fM244910 < 0.0f || fM244910 > 1.0f || fM244911 < 0.0f || fM244911 > 1.0f) {
                    return 1447446;
                }
                return C1199.m21216(new float[]{fM24499, fM244910, fM244911});
            case 3:
                C13929 c139212 = f29468;
                synchronized (c139212) {
                    c139212.m56473reset((CharSequence) str);
                    boolean zFind8 = c139212.find();
                    m24498(c139212, zFind8, c4700);
                    if (zFind8) {
                        strGroup5 = c139212.group();
                        boolean zFind9 = c139212.find();
                        m24498(c139212, zFind9, c4700);
                        if (zFind9) {
                            strGroup6 = c139212.group();
                            boolean zFind10 = c139212.find();
                            m24498(c139212, zFind10, c4700);
                            if (zFind10) {
                                strGroup25 = c139212.group();
                            }
                        } else {
                            strGroup6 = null;
                        }
                    } else {
                        strGroup5 = null;
                        strGroup6 = null;
                    }
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM244912 = m24499(strGroup5);
                float fM244913 = m24499(strGroup6);
                float fM244914 = m24499(strGroup25);
                if (fM244912 == 360.0f) {
                    fM244912 = 0.0f;
                }
                if (fM244912 < 0.0f || fM244912 > 360.0f || fM244913 < 0.0f || fM244913 > 1.0f || fM244914 < 0.0f || fM244914 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(new float[]{fM244912, fM244913, fM244914});
            case 4:
                C13929 c139213 = f29470;
                synchronized (c139213) {
                    c139213.m56473reset((CharSequence) str);
                    boolean zFind11 = c139213.find();
                    m24498(c139213, zFind11, c4700);
                    if (zFind11) {
                        strGroup7 = c139213.group();
                        boolean zFind12 = c139213.find();
                        m24498(c139213, zFind12, c4700);
                        if (zFind12) {
                            strGroup8 = c139213.group();
                            boolean zFind13 = c139213.find();
                            m24498(c139213, zFind13, c4700);
                            if (zFind13) {
                                strGroup9 = c139213.group();
                                iEnd = c139213.end();
                            } else {
                                strGroup9 = null;
                            }
                        }
                        iEnd = -1;
                    } else {
                        strGroup7 = null;
                    }
                    strGroup8 = null;
                    strGroup9 = null;
                    iEnd = -1;
                    break;
                }
                if (strGroup9 != null) {
                    C13929 c139214 = f29468;
                    synchronized (c139214) {
                        c139214.m56473reset((CharSequence) str);
                        boolean zFind14 = c139214.find(iEnd);
                        m24498(c139214, zFind14, c4700);
                        strGroup25 = zFind14 ? c139214.group() : null;
                        break;
                    }
                }
                if (strGroup25 == null || strGroup7.length() > 3 || strGroup8.length() > 3 || strGroup9.length() > 3) {
                    return 1447446;
                }
                int i5 = Integer.parseInt(strGroup7);
                int i6 = Integer.parseInt(strGroup8);
                int i7 = Integer.parseInt(strGroup9);
                float fM244915 = m24499(strGroup25);
                if (i5 < 0 || i5 > 255 || i6 < 0 || i6 > 255 || i7 < 0 || i7 > 255 || fM244915 < 0.0f || fM244915 > 1.0f) {
                    return 1447446;
                }
                return Color.argb((int) (fM244915 * 255.0f), i5, i6, i7);
            case 5:
                C13929 c139215 = f29468;
                synchronized (c139215) {
                    c139215.m56473reset((CharSequence) str);
                    boolean zFind15 = c139215.find();
                    m24498(c139215, zFind15, c4700);
                    if (zFind15) {
                        strGroup10 = c139215.group();
                        boolean zFind16 = c139215.find();
                        m24498(c139215, zFind16, c4700);
                        if (zFind16) {
                            strGroup11 = c139215.group();
                            boolean zFind17 = c139215.find();
                            m24498(c139215, zFind17, c4700);
                            if (zFind17) {
                                strGroup12 = c139215.group();
                                boolean zFind18 = c139215.find();
                                m24498(c139215, zFind18, c4700);
                                if (zFind18) {
                                    strGroup25 = c139215.group();
                                }
                            } else {
                                strGroup12 = null;
                            }
                        }
                    } else {
                        strGroup10 = null;
                    }
                    strGroup11 = null;
                    strGroup12 = null;
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM244916 = m24499(strGroup10);
                float fM244917 = m24499(strGroup11);
                float fM244918 = m24499(strGroup12);
                float fM244919 = m24499(strGroup25);
                if (fM244916 == 360.0f) {
                    fM244916 = 0.0f;
                }
                if (fM244916 < 0.0f || fM244916 > 360.0f || fM244917 < 0.0f || fM244917 > 1.0f || fM244918 < 0.0f || fM244918 > 1.0f || fM244919 < 0.0f || fM244919 > 1.0f) {
                    return 1447446;
                }
                return (C1199.m21216(new float[]{fM244916, fM244917, fM244918}) & 16777215) | ((((int) (fM244919 * 255.0f)) & 255) << 24);
            case 6:
                C13929 c139216 = f29468;
                synchronized (c139216) {
                    c139216.m56473reset((CharSequence) str);
                    boolean zFind19 = c139216.find();
                    m24498(c139216, zFind19, c4700);
                    if (zFind19) {
                        strGroup13 = c139216.group();
                        boolean zFind20 = c139216.find();
                        m24498(c139216, zFind20, c4700);
                        if (zFind20) {
                            strGroup14 = c139216.group();
                            boolean zFind21 = c139216.find();
                            m24498(c139216, zFind21, c4700);
                            if (zFind21) {
                                strGroup15 = c139216.group();
                                boolean zFind22 = c139216.find();
                                m24498(c139216, zFind22, c4700);
                                if (zFind22) {
                                    strGroup25 = c139216.group();
                                }
                            } else {
                                strGroup15 = null;
                            }
                        }
                    } else {
                        strGroup13 = null;
                    }
                    strGroup14 = null;
                    strGroup15 = null;
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM244920 = m24499(strGroup13);
                float fM244921 = m24499(strGroup14);
                float fM244922 = m24499(strGroup15);
                float fM244923 = m24499(strGroup25);
                if (fM244920 == 360.0f) {
                    fM244920 = 0.0f;
                }
                if (fM244920 < 0.0f || fM244920 > 360.0f || fM244921 < 0.0f || fM244921 > 1.0f || fM244922 < 0.0f || fM244922 > 1.0f || fM244923 < 0.0f || fM244923 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(((int) (fM244923 * 255.0f)) & 255, new float[]{fM244920, fM244921, fM244922});
            case 7:
                C13929 c139217 = f29470;
                synchronized (c139217) {
                    c139217.m56473reset((CharSequence) str);
                    boolean zFind23 = c139217.find();
                    m24498(c139217, zFind23, c4700);
                    if (zFind23) {
                        strGroup16 = c139217.group();
                        boolean zFind24 = c139217.find();
                        m24498(c139217, zFind24, c4700);
                        if (zFind24) {
                            strGroup17 = c139217.group();
                            boolean zFind25 = c139217.find();
                            m24498(c139217, zFind25, c4700);
                            if (zFind25) {
                                strGroup18 = c139217.group();
                                boolean zFind26 = c139217.find();
                                m24498(c139217, zFind26, c4700);
                                if (zFind26) {
                                    strGroup25 = c139217.group();
                                }
                            } else {
                                strGroup18 = null;
                            }
                        }
                    } else {
                        strGroup16 = null;
                    }
                    strGroup17 = null;
                    strGroup18 = null;
                    break;
                }
                if (strGroup25 == null || strGroup16.length() > 3 || strGroup17.length() > 3 || strGroup18.length() > 3 || strGroup25.length() > 3) {
                    return 1447446;
                }
                int i8 = Integer.parseInt(strGroup16);
                int i9 = Integer.parseInt(strGroup17);
                int i10 = Integer.parseInt(strGroup18);
                int i11 = Integer.parseInt(strGroup25);
                if (i8 < 0 || i8 > 255 || i9 < 0 || i9 > 255 || i10 < 0 || i10 > 255 || i11 < 0 || i11 > 255) {
                    return 1447446;
                }
                return Color.argb(i8, i9, i10, i11);
            case 8:
                C13929 c139218 = f29471;
                synchronized (c139218) {
                    c139218.m56473reset((CharSequence) str);
                    boolean zFind27 = c139218.find();
                    m24498(c139218, zFind27, c4700);
                    strGroup25 = zFind27 ? c139218.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                char[] charArray = strGroup25.toCharArray();
                int length = strGroup25.length();
                if (length == 3) {
                    return C11774.m27004(charArray[2]) | (C11774.m27004(charArray[0]) << 20) | (-16777216) | (C11774.m27004(charArray[0]) << 16) | (C11774.m27004(charArray[1]) << 12) | (C11774.m27004(charArray[1]) << 8) | (C11774.m27004(charArray[2]) << 4);
                }
                if (length == 4) {
                    return C11774.m27004(charArray[2]) | (C11774.m27004(charArray[3]) << 28) | (C11774.m27004(charArray[3]) << 24) | (C11774.m27004(charArray[0]) << 20) | (C11774.m27004(charArray[0]) << 16) | (C11774.m27004(charArray[1]) << 12) | (C11774.m27004(charArray[1]) << 8) | (C11774.m27004(charArray[2]) << 4);
                }
                if (length == 6) {
                    return C11774.m27004(charArray[5]) | (C11774.m27004(charArray[0]) << 20) | (-16777216) | (C11774.m27004(charArray[1]) << 16) | (C11774.m27004(charArray[2]) << 12) | (C11774.m27004(charArray[3]) << 8) | (C11774.m27004(charArray[4]) << 4);
                }
                if (length == 8) {
                    return C11774.m27004(charArray[5]) | (C11774.m27004(charArray[6]) << 28) | (C11774.m27004(charArray[7]) << 24) | (C11774.m27004(charArray[0]) << 20) | (C11774.m27004(charArray[1]) << 16) | (C11774.m27004(charArray[2]) << 12) | (C11774.m27004(charArray[3]) << 8) | (C11774.m27004(charArray[4]) << 4);
                }
                throw new RuntimeException("Hex color format error: " + ((Object) charArray));
            case 9:
                C13929 c139219 = f29470;
                synchronized (c139219) {
                    c139219.m56473reset((CharSequence) str);
                    boolean zFind28 = c139219.find();
                    m24498(c139219, zFind28, c4700);
                    if (zFind28) {
                        strGroup19 = c139219.group();
                        boolean zFind29 = c139219.find();
                        m24498(c139219, zFind29, c4700);
                        if (zFind29) {
                            strGroup20 = c139219.group();
                            boolean zFind30 = c139219.find();
                            m24498(c139219, zFind30, c4700);
                            if (zFind30) {
                                strGroup21 = c139219.group();
                                boolean zFind31 = c139219.find();
                                m24498(c139219, zFind31, c4700);
                                if (zFind31) {
                                    strGroup25 = c139219.group();
                                }
                            } else {
                                strGroup21 = null;
                            }
                        }
                    } else {
                        strGroup19 = null;
                    }
                    strGroup20 = null;
                    strGroup21 = null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() > 3 || strGroup19.length() > 3 || strGroup20.length() > 3 || strGroup21.length() > 3) {
                    return 1447446;
                }
                int i12 = Integer.parseInt(strGroup25);
                int i13 = Integer.parseInt(strGroup19);
                int i14 = Integer.parseInt(strGroup20);
                int i15 = Integer.parseInt(strGroup21);
                if (i12 < 0 || i12 > 255 || i13 < 0 || i13 > 255 || i14 < 0 || i14 > 255 || i15 < 0 || i15 > 255) {
                    return 1447446;
                }
                return Color.argb(i12, i13, i14, i15);
            case 10:
                C13929 c139220 = f29468;
                synchronized (c139220) {
                    c139220.m56473reset((CharSequence) str);
                    boolean zFind32 = c139220.find();
                    m24498(c139220, zFind32, c4700);
                    if (zFind32) {
                        strGroup22 = c139220.group();
                        iEnd2 = c139220.end();
                    } else {
                        strGroup22 = null;
                    }
                    break;
                }
                if (strGroup22 != null) {
                    C13929 c139221 = f29470;
                    synchronized (c139221) {
                        c139221.m56473reset((CharSequence) str);
                        boolean zFind33 = c139221.find(iEnd2);
                        m24498(c139221, zFind33, c4700);
                        if (zFind33) {
                            String strGroup26 = c139221.group();
                            boolean zFind34 = c139221.find();
                            m24498(c139221, zFind34, c4700);
                            if (zFind34) {
                                strGroup23 = c139221.group();
                                boolean zFind35 = c139221.find();
                                m24498(c139221, zFind35, c4700);
                                strGroup25 = strGroup26;
                                strGroup24 = zFind35 ? c139221.group() : null;
                            } else {
                                strGroup23 = null;
                                strGroup25 = strGroup26;
                                strGroup24 = null;
                            }
                        } else {
                            strGroup24 = null;
                            strGroup23 = null;
                        }
                        break;
                    }
                    String str3 = strGroup25;
                    strGroup25 = strGroup24;
                    str2 = str3;
                } else {
                    str2 = null;
                    strGroup23 = null;
                }
                if (strGroup25 == null || str2.length() > 3 || strGroup23.length() > 3 || strGroup25.length() > 3) {
                    return 1447446;
                }
                float fM244924 = m24499(strGroup22);
                int i16 = Integer.parseInt(str2);
                int i17 = Integer.parseInt(strGroup23);
                int i18 = Integer.parseInt(strGroup25);
                if (fM244924 < 0.0f || fM244924 > 1.0f || i16 < 0 || i16 > 255 || i17 < 0 || i17 > 255 || i18 < 0 || i18 > 255) {
                    return 1447446;
                }
                return Color.argb((int) (fM244924 * 255.0f), i16, i17, i18);
            case 11:
            case 12:
            case 13:
                return m24493(str, i, (InterfaceC22056) c4700);
            default:
                return 1447446;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24493(String str, int i, InterfaceC22056 interfaceC22056) {
        int i2;
        float f;
        int i3;
        int i4 = i == 11 ? 3 : 4;
        float[] fArr = new float[i4];
        C13929 c13929 = f29468;
        synchronized (c13929) {
            c13929.m56473reset((CharSequence) str);
            while (i2 < i4) {
                boolean zFind = c13929.find();
                m24498(c13929, zFind, interfaceC22056);
                if (!zFind) {
                    return 1447446;
                }
                float fM24499 = m24499(c13929.group());
                fArr[i2] = fM24499;
                i2 = (fM24499 >= 0.0f && fM24499 <= 1.0f) ? i2 + 1 : 0;
                return 1447446;
            }
            int i5 = i == 12 ? 1 : 0;
            if (i == 12) {
                f = fArr[0];
            } else {
                if (i != 13) {
                    i3 = 255;
                } else {
                    f = fArr[3];
                }
                return Color.argb(i3, (int) (fArr[i5] * 255.0f), (int) (fArr[i5 + 1] * 255.0f), (int) (fArr[i5 + 2] * 255.0f));
            }
            i3 = (int) (f * 255.0f);
            return Color.argb(i3, (int) (fArr[i5] * 255.0f), (int) (fArr[i5 + 1] * 255.0f), (int) (fArr[i5 + 2] * 255.0f));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24498(C13929 c13929, boolean z, InterfaceC22056 interfaceC22056) {
        if (interfaceC22056 != null) {
            try {
                C5370.m11655(((C4700) interfaceC22056).f10629, c13929);
            } catch (RuntimeException e) {
                throw new C11327(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static float m24499(String str) {
        boolean z = false;
        if (str.endsWith("%")) {
            str = C17073.m38720(1, 0, str);
            z = true;
        }
        float f = Float.parseFloat(str);
        return z ? f / 100.0f : f;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m24495(String str, float f) {
        boolean zEndsWith = str.endsWith("%");
        if (zEndsWith) {
            f *= 100.0f;
        }
        BigDecimal scale = new BigDecimal(Float.toString(f)).setScale(zEndsWith ? 2 : 3, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C17588.m40053(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m24503() {
        return Integer.toString(f29466.getAndIncrement(), 36);
    }
}
