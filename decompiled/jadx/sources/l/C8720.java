package l;

import android.graphics.Color;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.cb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۡۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 096Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8720 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f26547;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f26548;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f26549;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f26550;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f26541 = new AtomicInteger((int) (System.currentTimeMillis() / 1000));

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C11459 f26544 = C11459.m28259(2, "parseColor\\((\\d+|_|AUTO),(\\d+|_|AUTO),([A-Z]+)(?:,(.+))?\\)");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C12164 f26546 = C11459.m28259(2, "(?<![a-f0-9])[a-f0-9]{3,8}(?![a-z0-9])").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12164 f26545 = C11459.m28260("-?\\d+").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C12164 f26543 = C11459.m28260("-?\\d+(\\.\\d+)?%?").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final BigDecimal f26542 = BigDecimal.valueOf(255L);

    public C8720(int i, int i2, int i3, int i4) {
        this.f26549 = i;
        this.f26547 = i2;
        this.f26550 = i3;
        this.f26548 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8720)) {
            return false;
        }
        C8720 c8720 = (C8720) obj;
        return this.f26549 == c8720.f26549 && this.f26547 == c8720.f26547 && this.f26550 == c8720.f26550 && this.f26548 == c8720.f26548;
    }

    public final int hashCode() {
        return (((((this.f26549 * 31) + this.f26547) * 31) + this.f26550) * 31) + this.f26548;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f26549), Integer.valueOf(this.f26547), Integer.valueOf(this.f26550), Integer.valueOf(this.f26548)};
        String[] strArrSplit = "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".length() == 0 ? new String[0] : "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".split(l.b);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22535() {
        return this.f26547;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22537() {
        return this.f26550;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22538() {
        return this.f26548;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m22539() {
        return this.f26549;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8720 m22528(String str) {
        C12164 c12164Matcher = f26544.matcher((CharSequence) str);
        if (!c12164Matcher.matches()) {
            throw new RuntimeException(C20094.m46315("Parse failed: ", str));
        }
        String strGroup = c12164Matcher.group(1);
        C11003.requireNonNull(strGroup);
        int i = -2;
        byte b = -1;
        int i2 = strGroup.equals("_") ? -1 : strGroup.equalsIgnoreCase("auto") ? -2 : Integer.parseInt(strGroup);
        int i3 = 2;
        String strGroup2 = c12164Matcher.group(2);
        C11003.requireNonNull(strGroup2);
        if (strGroup2.equals("_")) {
            i = -1;
        } else if (!strGroup2.equalsIgnoreCase("auto")) {
            i = Integer.parseInt(strGroup2);
        }
        if (i2 < 0 && i < 0) {
            throw new RuntimeException(C20094.m46315("Illegal arguments: ", str));
        }
        String strGroup3 = c12164Matcher.group(3);
        C11003.requireNonNull(strGroup3);
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
                    b = cb.k;
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
                throw new RuntimeException(C20094.m46315("Illegal arguments: ", str));
        }
        return new C8720(i2, i, i3, C4900.m14261(c12164Matcher.group(4)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m22536(C21834 c21834, C21834 c21835, C12164 c12164, C2453 c2453) {
        try {
            return m22532(c21834, c21835, c12164, c2453);
        } catch (C9426 e) {
            throw e.f28602;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C21834 m22532(C21834 c21834, C21834 c21835, C12164 c12164, C2453 c2453) {
        int iM20005;
        int iM20006;
        boolean z;
        int iM22523;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String strConcat;
        int i6;
        C21834 c21834M18984;
        try {
            int i7 = this.f26549;
            int i8 = this.f26547;
            if (i7 > c12164.groupCount() || i8 > c12164.groupCount()) {
                return c21834;
            }
            boolean z2 = true;
            int i9 = this.f26550;
            int i10 = 0;
            if (i7 < 0) {
                iM20005 = 0;
                iM20006 = 0;
                z = false;
            } else {
                String strGroup = c12164.group(i7);
                if (strGroup == null) {
                    i7 = -1;
                    iM20005 = 0;
                    iM20006 = 0;
                    z = false;
                } else {
                    iM20005 = m22523(strGroup, i9, c2453);
                    if (iM20005 != 1447446) {
                        iM20006 = iM20005;
                        z = true;
                    } else {
                        i7 = -1;
                        iM20006 = iM20005;
                        z = false;
                    }
                }
            }
            if (i8 >= 0) {
                String strGroup2 = c12164.group(i8);
                if (strGroup2 != null) {
                    iM22523 = m22523(strGroup2, i9, c2453);
                    i = iM22523;
                    if (iM22523 != 1447446) {
                    }
                    if (i7 >= 0 && i8 < 0) {
                        return c21834;
                    }
                    if (i7 == -2) {
                        if (c21835 == null) {
                            c21834M18984 = C7017.m18984();
                        } else {
                            c21834M18984 = c21835;
                        }
                        iM20005 = C7466.m20005(iM22523, c21834M18984.m49210());
                        iM20006 = C7466.m20005(i, c21834M18984.m49212());
                        i7 = 0;
                    }
                    i2 = iM20005;
                    i3 = iM20006;
                    if (i8 == -2) {
                        if (C7466.m20002(i2) > 130) {
                            i6 = -16777216;
                        } else {
                            i6 = -1;
                        }
                        i4 = i6;
                        i5 = C7466.m20002(i3) > 130 ? -16777216 : -1;
                    } else {
                        i4 = iM22523;
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
                        return c21834.m49203(C21834.m49198(strConcat, i2, i4, i3, i5, 64));
                    }
                    if (i7 >= 0) {
                        return c21834.m49203(C21834.m49198(strConcat, i2, 1447446, i3, 1447446, 64));
                    }
                    return c21834.m49203(C21834.m49198(strConcat, 1447446, i4, 1447446, i5, 64));
                }
                iM22523 = 0;
                i = 0;
                i8 = -1;
            } else {
                iM22523 = 0;
                i = 0;
            }
            z2 = false;
            if (i7 >= 0) {
            }
            if (i7 == -2) {
                if (c21835 == null) {
                    c21834M18984 = C7017.m18984();
                } else {
                    c21834M18984 = c21835;
                }
                iM20005 = C7466.m20005(iM22523, c21834M18984.m49210());
                iM20006 = C7466.m20005(i, c21834M18984.m49212());
                i7 = 0;
            }
            i2 = iM20005;
            i3 = iM20006;
            if (i8 == -2) {
                if (C7466.m20002(i2) > 130) {
                    i6 = -16777216;
                } else {
                    i6 = -1;
                }
                i4 = i6;
                i5 = C7466.m20002(i3) > 130 ? -16777216 : -1;
            } else {
                i4 = iM22523;
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
                return c21834.m49203(C21834.m49198(strConcat, i2, 1447446, i3, 1447446, 64));
            }
            return c21834.m49203(C21834.m49198(strConcat, 1447446, i4, 1447446, i5, 64));
        } catch (Exception unused) {
            return c21834;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22525(int i, int i2, String str) {
        int iEnd;
        boolean z = true;
        int i3 = 0;
        switch (i) {
            case 0:
                String str2 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%08X", Integer.valueOf(i2));
                C12164 c12164 = f26546;
                synchronized (c12164) {
                    c12164.m29615reset((CharSequence) str);
                    if (!c12164.find()) {
                        return null;
                    }
                    return str.substring(0, c12164.start()) + str2 + str.substring(c12164.end());
                }
            case 1:
                C12164 c12165 = f26545;
                synchronized (c12165) {
                    StringBuilder sb = new StringBuilder();
                    c12165.m29615reset((CharSequence) str);
                    if (c12165.find()) {
                        sb.append((CharSequence) str, 0, c12165.start());
                        sb.append(Color.red(i2));
                        int iEnd2 = c12165.end();
                        if (c12165.find()) {
                            sb.append((CharSequence) str, iEnd2, c12165.start());
                            sb.append(Color.green(i2));
                            int iEnd3 = c12165.end();
                            if (c12165.find()) {
                                sb.append((CharSequence) str, iEnd3, c12165.start());
                                sb.append(Color.blue(i2));
                                sb.append((CharSequence) str, c12165.end(), str.length());
                                return sb.toString();
                            }
                        }
                    }
                    return null;
                }
            case 2:
                float[] fArr = new float[3];
                C7191.m19272(i2, fArr);
                C12164 c12166 = f26543;
                synchronized (c12166) {
                    StringBuilder sb2 = new StringBuilder();
                    c12166.m29615reset((CharSequence) str);
                    if (c12166.find()) {
                        sb2.append((CharSequence) str, 0, c12166.start());
                        sb2.append(m22526(c12166.group(), fArr[0]));
                        int iEnd4 = c12166.end();
                        if (c12166.find()) {
                            sb2.append((CharSequence) str, iEnd4, c12166.start());
                            sb2.append(m22526(c12166.group(), fArr[1]));
                            int iEnd5 = c12166.end();
                            if (c12166.find()) {
                                sb2.append((CharSequence) str, iEnd5, c12166.start());
                                sb2.append(m22526(c12166.group(), fArr[2]));
                                sb2.append((CharSequence) str, c12166.end(), str.length());
                                return sb2.toString();
                            }
                        }
                    }
                    return null;
                }
            case 3:
                float[] fArr2 = new float[3];
                C7466.m20004(i2, fArr2);
                C12164 c12167 = f26543;
                synchronized (c12167) {
                    StringBuilder sb3 = new StringBuilder();
                    c12167.m29615reset((CharSequence) str);
                    if (c12167.find()) {
                        sb3.append((CharSequence) str, 0, c12167.start());
                        sb3.append(m22526(c12167.group(), fArr2[0]));
                        int iEnd6 = c12167.end();
                        if (c12167.find()) {
                            sb3.append((CharSequence) str, iEnd6, c12167.start());
                            sb3.append(m22526(c12167.group(), fArr2[1]));
                            int iEnd7 = c12167.end();
                            if (c12167.find()) {
                                sb3.append((CharSequence) str, iEnd7, c12167.start());
                                sb3.append(m22526(c12167.group(), fArr2[2]));
                                sb3.append((CharSequence) str, c12167.end(), str.length());
                                return sb3.toString();
                            }
                        }
                    }
                    return null;
                }
            case 4:
                StringBuilder sb4 = new StringBuilder();
                C12164 c12168 = f26545;
                synchronized (c12168) {
                    c12168.m29615reset((CharSequence) str);
                    if (c12168.find()) {
                        sb4.append((CharSequence) str, 0, c12168.start());
                        sb4.append(Color.red(i2));
                        int iEnd8 = c12168.end();
                        if (c12168.find()) {
                            sb4.append((CharSequence) str, iEnd8, c12168.start());
                            sb4.append(Color.green(i2));
                            iEnd8 = c12168.end();
                            if (c12168.find()) {
                                sb4.append((CharSequence) str, iEnd8, c12168.start());
                                sb4.append(Color.blue(i2));
                                iEnd = c12168.end();
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
                    C12164 c12169 = f26543;
                    synchronized (c12169) {
                        c12169.m29615reset((CharSequence) str);
                        if (!c12169.find(iEnd)) {
                            return null;
                        }
                        sb4.append((CharSequence) str, iEnd, c12169.start());
                        sb4.append(m22533(Color.alpha(i2), c12169.group()));
                        sb4.append((CharSequence) str, c12169.end(), str.length());
                        return sb4.toString();
                    }
                }
                return null;
            case 5:
                float[] fArr3 = new float[3];
                C7191.m19272(i2, fArr3);
                C12164 c121610 = f26543;
                synchronized (c121610) {
                    StringBuilder sb5 = new StringBuilder();
                    c121610.m29615reset((CharSequence) str);
                    if (c121610.find()) {
                        sb5.append((CharSequence) str, 0, c121610.start());
                        sb5.append(m22526(c121610.group(), fArr3[0]));
                        int iEnd9 = c121610.end();
                        if (c121610.find()) {
                            sb5.append((CharSequence) str, iEnd9, c121610.start());
                            sb5.append(m22526(c121610.group(), fArr3[1]));
                            int iEnd10 = c121610.end();
                            if (c121610.find()) {
                                sb5.append((CharSequence) str, iEnd10, c121610.start());
                                sb5.append(m22526(c121610.group(), fArr3[2]));
                                int iEnd11 = c121610.end();
                                if (c121610.find()) {
                                    sb5.append((CharSequence) str, iEnd11, c121610.start());
                                    sb5.append(m22533(Color.alpha(i2), c121610.group()));
                                    sb5.append((CharSequence) str, c121610.end(), str.length());
                                    return sb5.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 6:
                float[] fArr4 = new float[3];
                C7466.m20004(i2, fArr4);
                C12164 c121611 = f26543;
                synchronized (c121611) {
                    StringBuilder sb6 = new StringBuilder();
                    c121611.m29615reset((CharSequence) str);
                    if (c121611.find()) {
                        sb6.append((CharSequence) str, 0, c121611.start());
                        sb6.append(m22526(c121611.group(), fArr4[0]));
                        int iEnd12 = c121611.end();
                        if (c121611.find()) {
                            sb6.append((CharSequence) str, iEnd12, c121611.start());
                            sb6.append(m22526(c121611.group(), fArr4[1]));
                            int iEnd13 = c121611.end();
                            if (c121611.find()) {
                                sb6.append((CharSequence) str, iEnd13, c121611.start());
                                sb6.append(m22526(c121611.group(), fArr4[2]));
                                int iEnd14 = c121611.end();
                                if (c121611.find()) {
                                    sb6.append((CharSequence) str, iEnd14, c121611.start());
                                    sb6.append(m22533(Color.alpha(i2), c121611.group()));
                                    sb6.append((CharSequence) str, c121611.end(), str.length());
                                    return sb6.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 7:
                C12164 c121612 = f26545;
                synchronized (c121612) {
                    StringBuilder sb7 = new StringBuilder();
                    c121612.m29615reset((CharSequence) str);
                    if (c121612.find()) {
                        sb7.append((CharSequence) str, 0, c121612.start());
                        sb7.append(Color.alpha(i2));
                        int iEnd15 = c121612.end();
                        if (c121612.find()) {
                            sb7.append((CharSequence) str, iEnd15, c121612.start());
                            sb7.append(Color.red(i2));
                            int iEnd16 = c121612.end();
                            if (c121612.find()) {
                                sb7.append((CharSequence) str, iEnd16, c121612.start());
                                sb7.append(Color.green(i2));
                                int iEnd17 = c121612.end();
                                if (c121612.find()) {
                                    sb7.append((CharSequence) str, iEnd17, c121612.start());
                                    sb7.append(Color.blue(i2));
                                    sb7.append((CharSequence) str, c121612.end(), str.length());
                                    return sb7.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 8:
                String str3 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%06X%02X", Integer.valueOf(i2 & 16777215), Integer.valueOf(i2 >>> 24));
                C12164 c121613 = f26546;
                synchronized (c121613) {
                    c121613.m29615reset((CharSequence) str);
                    if (!c121613.find()) {
                        return null;
                    }
                    return str.substring(0, c121613.start()) + str3 + str.substring(c121613.end());
                }
            case 9:
                C12164 c121614 = f26545;
                synchronized (c121614) {
                    StringBuilder sb8 = new StringBuilder();
                    c121614.m29615reset((CharSequence) str);
                    if (c121614.find()) {
                        sb8.append((CharSequence) str, 0, c121614.start());
                        sb8.append(Color.red(i2));
                        int iEnd18 = c121614.end();
                        if (c121614.find()) {
                            sb8.append((CharSequence) str, iEnd18, c121614.start());
                            sb8.append(Color.green(i2));
                            int iEnd19 = c121614.end();
                            if (c121614.find()) {
                                sb8.append((CharSequence) str, iEnd19, c121614.start());
                                sb8.append(Color.blue(i2));
                                int iEnd20 = c121614.end();
                                if (c121614.find()) {
                                    sb8.append((CharSequence) str, iEnd20, c121614.start());
                                    sb8.append(Color.alpha(i2));
                                    sb8.append((CharSequence) str, c121614.end(), str.length());
                                    return sb8.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 10:
                StringBuilder sb9 = new StringBuilder();
                C12164 c121615 = f26543;
                synchronized (c121615) {
                    c121615.m29615reset((CharSequence) str);
                    if (!c121615.find()) {
                        return null;
                    }
                    sb9.append((CharSequence) str, 0, c121615.start());
                    sb9.append(m22533(Color.alpha(i2), c121615.group()));
                    int iEnd21 = c121615.end();
                    C12164 c121616 = f26545;
                    synchronized (c121616) {
                        c121616.m29615reset((CharSequence) str);
                        if (c121616.find(iEnd21)) {
                            sb9.append((CharSequence) str, iEnd21, c121616.start());
                            sb9.append(Color.red(i2));
                            int iEnd22 = c121616.end();
                            if (c121616.find()) {
                                sb9.append((CharSequence) str, iEnd22, c121616.start());
                                sb9.append(Color.green(i2));
                                int iEnd23 = c121616.end();
                                if (c121616.find()) {
                                    sb9.append((CharSequence) str, iEnd23, c121616.start());
                                    sb9.append(Color.blue(i2));
                                    sb9.append((CharSequence) str, c121616.end(), str.length());
                                    return sb9.toString();
                                }
                            }
                        }
                        return null;
                    }
                }
            case 11:
                return m22527(str, Color.red(i2), Color.green(i2), Color.blue(i2));
            case 12:
                return m22527(str, Color.alpha(i2), Color.red(i2), Color.green(i2), Color.blue(i2));
            case 13:
                return m22527(str, Color.red(i2), Color.green(i2), Color.blue(i2), Color.alpha(i2));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22527(String str, int... iArr) {
        C12164 c12164 = f26543;
        synchronized (c12164) {
            StringBuilder sb = new StringBuilder();
            c12164.m29615reset((CharSequence) str);
            int iEnd = 0;
            for (int i : iArr) {
                if (!c12164.find()) {
                    return null;
                }
                sb.append((CharSequence) str, iEnd, c12164.start());
                sb.append(m22533(i, c12164.group()));
                iEnd = c12164.end();
            }
            sb.append((CharSequence) str, iEnd, str.length());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m22533(int i, String str) {
        boolean zEndsWith = str.endsWith("%");
        long j = i;
        if (zEndsWith) {
            j *= 100;
        }
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).divide(f26542, zEndsWith ? 2 : 3, RoundingMode.CEILING);
        String plainString = (bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C16014.m37867(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m22531(int i, String str) {
        return m22523(str, i, (C2453) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22523(String str, int i, C2453 c2453) {
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
                C12164 c12164 = f26546;
                synchronized (c12164) {
                    c12164.m29615reset((CharSequence) str);
                    boolean zFind = c12164.find();
                    m22529(c12164, zFind, c2453);
                    strGroup25 = zFind ? c12164.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                return C9896.m25001(strGroup25);
            case 1:
                C12164 c12165 = f26545;
                synchronized (c12165) {
                    c12165.m29615reset((CharSequence) str);
                    boolean zFind2 = c12165.find();
                    m22529(c12165, zFind2, c2453);
                    if (zFind2) {
                        strGroup = c12165.group();
                        boolean zFind3 = c12165.find();
                        m22529(c12165, zFind3, c2453);
                        if (zFind3) {
                            strGroup2 = c12165.group();
                            boolean zFind4 = c12165.find();
                            m22529(c12165, zFind4, c2453);
                            if (zFind4) {
                                strGroup25 = c12165.group();
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
                C12164 c12166 = f26543;
                synchronized (c12166) {
                    c12166.m29615reset((CharSequence) str);
                    boolean zFind5 = c12166.find();
                    m22529(c12166, zFind5, c2453);
                    if (zFind5) {
                        strGroup3 = c12166.group();
                        boolean zFind6 = c12166.find();
                        m22529(c12166, zFind6, c2453);
                        if (zFind6) {
                            strGroup4 = c12166.group();
                            boolean zFind7 = c12166.find();
                            m22529(c12166, zFind7, c2453);
                            if (zFind7) {
                                strGroup25 = c12166.group();
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
                float fM22530 = m22530(strGroup3);
                float fM22531 = m22530(strGroup4);
                float fM22532 = m22530(strGroup25);
                if (fM22530 == 360.0f) {
                    fM22530 = 0.0f;
                }
                if (fM22530 < 0.0f || fM22530 > 360.0f || fM22531 < 0.0f || fM22531 > 1.0f || fM22532 < 0.0f || fM22532 > 1.0f) {
                    return 1447446;
                }
                return C7191.m19269(new float[]{fM22530, fM22531, fM22532});
            case 3:
                C12164 c12167 = f26543;
                synchronized (c12167) {
                    c12167.m29615reset((CharSequence) str);
                    boolean zFind8 = c12167.find();
                    m22529(c12167, zFind8, c2453);
                    if (zFind8) {
                        strGroup5 = c12167.group();
                        boolean zFind9 = c12167.find();
                        m22529(c12167, zFind9, c2453);
                        if (zFind9) {
                            strGroup6 = c12167.group();
                            boolean zFind10 = c12167.find();
                            m22529(c12167, zFind10, c2453);
                            if (zFind10) {
                                strGroup25 = c12167.group();
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
                float fM22533 = m22530(strGroup5);
                float fM22534 = m22530(strGroup6);
                float fM22535 = m22530(strGroup25);
                if (fM22533 == 360.0f) {
                    fM22533 = 0.0f;
                }
                if (fM22533 < 0.0f || fM22533 > 360.0f || fM22534 < 0.0f || fM22534 > 1.0f || fM22535 < 0.0f || fM22535 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(new float[]{fM22533, fM22534, fM22535});
            case 4:
                C12164 c12168 = f26545;
                synchronized (c12168) {
                    c12168.m29615reset((CharSequence) str);
                    boolean zFind11 = c12168.find();
                    m22529(c12168, zFind11, c2453);
                    if (zFind11) {
                        strGroup7 = c12168.group();
                        boolean zFind12 = c12168.find();
                        m22529(c12168, zFind12, c2453);
                        if (zFind12) {
                            strGroup8 = c12168.group();
                            boolean zFind13 = c12168.find();
                            m22529(c12168, zFind13, c2453);
                            if (zFind13) {
                                strGroup9 = c12168.group();
                                iEnd = c12168.end();
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
                    C12164 c12169 = f26543;
                    synchronized (c12169) {
                        c12169.m29615reset((CharSequence) str);
                        boolean zFind14 = c12169.find(iEnd);
                        m22529(c12169, zFind14, c2453);
                        strGroup25 = zFind14 ? c12169.group() : null;
                        break;
                    }
                }
                if (strGroup25 == null || strGroup7.length() > 3 || strGroup8.length() > 3 || strGroup9.length() > 3) {
                    return 1447446;
                }
                int i5 = Integer.parseInt(strGroup7);
                int i6 = Integer.parseInt(strGroup8);
                int i7 = Integer.parseInt(strGroup9);
                float fM22536 = m22530(strGroup25);
                if (i5 < 0 || i5 > 255 || i6 < 0 || i6 > 255 || i7 < 0 || i7 > 255 || fM22536 < 0.0f || fM22536 > 1.0f) {
                    return 1447446;
                }
                return Color.argb((int) (fM22536 * 255.0f), i5, i6, i7);
            case 5:
                C12164 c121610 = f26543;
                synchronized (c121610) {
                    c121610.m29615reset((CharSequence) str);
                    boolean zFind15 = c121610.find();
                    m22529(c121610, zFind15, c2453);
                    if (zFind15) {
                        strGroup10 = c121610.group();
                        boolean zFind16 = c121610.find();
                        m22529(c121610, zFind16, c2453);
                        if (zFind16) {
                            strGroup11 = c121610.group();
                            boolean zFind17 = c121610.find();
                            m22529(c121610, zFind17, c2453);
                            if (zFind17) {
                                strGroup12 = c121610.group();
                                boolean zFind18 = c121610.find();
                                m22529(c121610, zFind18, c2453);
                                if (zFind18) {
                                    strGroup25 = c121610.group();
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
                float fM22537 = m22530(strGroup10);
                float fM22538 = m22530(strGroup11);
                float fM22539 = m22530(strGroup12);
                float fM225310 = m22530(strGroup25);
                if (fM22537 == 360.0f) {
                    fM22537 = 0.0f;
                }
                if (fM22537 < 0.0f || fM22537 > 360.0f || fM22538 < 0.0f || fM22538 > 1.0f || fM22539 < 0.0f || fM22539 > 1.0f || fM225310 < 0.0f || fM225310 > 1.0f) {
                    return 1447446;
                }
                return (C7191.m19269(new float[]{fM22537, fM22538, fM22539}) & 16777215) | ((((int) (fM225310 * 255.0f)) & 255) << 24);
            case 6:
                C12164 c121611 = f26543;
                synchronized (c121611) {
                    c121611.m29615reset((CharSequence) str);
                    boolean zFind19 = c121611.find();
                    m22529(c121611, zFind19, c2453);
                    if (zFind19) {
                        strGroup13 = c121611.group();
                        boolean zFind20 = c121611.find();
                        m22529(c121611, zFind20, c2453);
                        if (zFind20) {
                            strGroup14 = c121611.group();
                            boolean zFind21 = c121611.find();
                            m22529(c121611, zFind21, c2453);
                            if (zFind21) {
                                strGroup15 = c121611.group();
                                boolean zFind22 = c121611.find();
                                m22529(c121611, zFind22, c2453);
                                if (zFind22) {
                                    strGroup25 = c121611.group();
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
                float fM225311 = m22530(strGroup13);
                float fM225312 = m22530(strGroup14);
                float fM225313 = m22530(strGroup15);
                float fM225314 = m22530(strGroup25);
                if (fM225311 == 360.0f) {
                    fM225311 = 0.0f;
                }
                if (fM225311 < 0.0f || fM225311 > 360.0f || fM225312 < 0.0f || fM225312 > 1.0f || fM225313 < 0.0f || fM225313 > 1.0f || fM225314 < 0.0f || fM225314 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(((int) (fM225314 * 255.0f)) & 255, new float[]{fM225311, fM225312, fM225313});
            case 7:
                C12164 c121612 = f26545;
                synchronized (c121612) {
                    c121612.m29615reset((CharSequence) str);
                    boolean zFind23 = c121612.find();
                    m22529(c121612, zFind23, c2453);
                    if (zFind23) {
                        strGroup16 = c121612.group();
                        boolean zFind24 = c121612.find();
                        m22529(c121612, zFind24, c2453);
                        if (zFind24) {
                            strGroup17 = c121612.group();
                            boolean zFind25 = c121612.find();
                            m22529(c121612, zFind25, c2453);
                            if (zFind25) {
                                strGroup18 = c121612.group();
                                boolean zFind26 = c121612.find();
                                m22529(c121612, zFind26, c2453);
                                if (zFind26) {
                                    strGroup25 = c121612.group();
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
                C12164 c121613 = f26546;
                synchronized (c121613) {
                    c121613.m29615reset((CharSequence) str);
                    boolean zFind27 = c121613.find();
                    m22529(c121613, zFind27, c2453);
                    strGroup25 = zFind27 ? c121613.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                char[] charArray = strGroup25.toCharArray();
                int length = strGroup25.length();
                if (length == 3) {
                    return C9896.m24989(charArray[2]) | (C9896.m24989(charArray[0]) << 20) | (-16777216) | (C9896.m24989(charArray[0]) << 16) | (C9896.m24989(charArray[1]) << 12) | (C9896.m24989(charArray[1]) << 8) | (C9896.m24989(charArray[2]) << 4);
                }
                if (length == 4) {
                    return C9896.m24989(charArray[2]) | (C9896.m24989(charArray[3]) << 28) | (C9896.m24989(charArray[3]) << 24) | (C9896.m24989(charArray[0]) << 20) | (C9896.m24989(charArray[0]) << 16) | (C9896.m24989(charArray[1]) << 12) | (C9896.m24989(charArray[1]) << 8) | (C9896.m24989(charArray[2]) << 4);
                }
                if (length == 6) {
                    return C9896.m24989(charArray[5]) | (C9896.m24989(charArray[0]) << 20) | (-16777216) | (C9896.m24989(charArray[1]) << 16) | (C9896.m24989(charArray[2]) << 12) | (C9896.m24989(charArray[3]) << 8) | (C9896.m24989(charArray[4]) << 4);
                }
                if (length == 8) {
                    return C9896.m24989(charArray[5]) | (C9896.m24989(charArray[6]) << 28) | (C9896.m24989(charArray[7]) << 24) | (C9896.m24989(charArray[0]) << 20) | (C9896.m24989(charArray[1]) << 16) | (C9896.m24989(charArray[2]) << 12) | (C9896.m24989(charArray[3]) << 8) | (C9896.m24989(charArray[4]) << 4);
                }
                throw new RuntimeException("Hex color format error: " + ((Object) charArray));
            case 9:
                C12164 c121614 = f26545;
                synchronized (c121614) {
                    c121614.m29615reset((CharSequence) str);
                    boolean zFind28 = c121614.find();
                    m22529(c121614, zFind28, c2453);
                    if (zFind28) {
                        strGroup19 = c121614.group();
                        boolean zFind29 = c121614.find();
                        m22529(c121614, zFind29, c2453);
                        if (zFind29) {
                            strGroup20 = c121614.group();
                            boolean zFind30 = c121614.find();
                            m22529(c121614, zFind30, c2453);
                            if (zFind30) {
                                strGroup21 = c121614.group();
                                boolean zFind31 = c121614.find();
                                m22529(c121614, zFind31, c2453);
                                if (zFind31) {
                                    strGroup25 = c121614.group();
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
                C12164 c121615 = f26543;
                synchronized (c121615) {
                    c121615.m29615reset((CharSequence) str);
                    boolean zFind32 = c121615.find();
                    m22529(c121615, zFind32, c2453);
                    if (zFind32) {
                        strGroup22 = c121615.group();
                        iEnd2 = c121615.end();
                    } else {
                        strGroup22 = null;
                    }
                    break;
                }
                if (strGroup22 != null) {
                    C12164 c121616 = f26545;
                    synchronized (c121616) {
                        c121616.m29615reset((CharSequence) str);
                        boolean zFind33 = c121616.find(iEnd2);
                        m22529(c121616, zFind33, c2453);
                        if (zFind33) {
                            String strGroup26 = c121616.group();
                            boolean zFind34 = c121616.find();
                            m22529(c121616, zFind34, c2453);
                            if (zFind34) {
                                strGroup23 = c121616.group();
                                boolean zFind35 = c121616.find();
                                m22529(c121616, zFind35, c2453);
                                strGroup25 = strGroup26;
                                strGroup24 = zFind35 ? c121616.group() : null;
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
                float fM225315 = m22530(strGroup22);
                int i16 = Integer.parseInt(str2);
                int i17 = Integer.parseInt(strGroup23);
                int i18 = Integer.parseInt(strGroup25);
                if (fM225315 < 0.0f || fM225315 > 1.0f || i16 < 0 || i16 > 255 || i17 < 0 || i17 > 255 || i18 < 0 || i18 > 255) {
                    return 1447446;
                }
                return Color.argb((int) (fM225315 * 255.0f), i16, i17, i18);
            case 11:
            case 12:
            case 13:
                return m22524(str, i, (InterfaceC20715) c2453);
            default:
                return 1447446;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22524(String str, int i, InterfaceC20715 interfaceC20715) {
        int i2;
        float f;
        int i3;
        int i4 = i == 11 ? 3 : 4;
        float[] fArr = new float[i4];
        C12164 c12164 = f26543;
        synchronized (c12164) {
            c12164.m29615reset((CharSequence) str);
            while (i2 < i4) {
                boolean zFind = c12164.find();
                m22529(c12164, zFind, interfaceC20715);
                if (!zFind) {
                    return 1447446;
                }
                float fM22530 = m22530(c12164.group());
                fArr[i2] = fM22530;
                i2 = (fM22530 >= 0.0f && fM22530 <= 1.0f) ? i2 + 1 : 0;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22529(C12164 c12164, boolean z, InterfaceC20715 interfaceC20715) {
        if (interfaceC20715 != null) {
            try {
                C3158.m9611(((C2453) interfaceC20715).f7840, c12164);
            } catch (RuntimeException e) {
                throw new C9426(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m22530(String str) {
        boolean z = false;
        if (str.endsWith("%")) {
            str = C15472.m36561(1, 0, str);
            z = true;
        }
        float f = Float.parseFloat(str);
        return z ? f / 100.0f : f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22526(String str, float f) {
        boolean zEndsWith = str.endsWith("%");
        if (zEndsWith) {
            f *= 100.0f;
        }
        BigDecimal scale = new BigDecimal(Float.toString(f)).setScale(zEndsWith ? 2 : 3, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C16014.m37867(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m22534() {
        return Integer.toString(f26541.getAndIncrement(), 36);
    }
}
