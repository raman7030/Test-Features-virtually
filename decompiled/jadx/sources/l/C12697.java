package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7553 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12697 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final float[] f38216 = new float[0];

    /* JADX WARN: Code duplicated, block: B:110:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8 A[Catch: NumberFormatException -> 0x0113, TryCatch #0 {NumberFormatException -> 0x0113, blocks: (B:25:0x0054, B:27:0x0067, B:30:0x006f, B:32:0x0074, B:36:0x007c, B:37:0x0088, B:39:0x008e, B:45:0x009e, B:63:0x00c6, B:56:0x00b8, B:64:0x00cd, B:66:0x00d6, B:67:0x00e3, B:69:0x00e9, B:73:0x00f4, B:75:0x00f8, B:76:0x010d), top: B:95:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6 A[Catch: NumberFormatException -> 0x0113, TryCatch #0 {NumberFormatException -> 0x0113, blocks: (B:25:0x0054, B:27:0x0067, B:30:0x006f, B:32:0x0074, B:36:0x007c, B:37:0x0088, B:39:0x008e, B:45:0x009e, B:63:0x00c6, B:56:0x00b8, B:64:0x00cd, B:66:0x00d6, B:67:0x00e3, B:69:0x00e9, B:73:0x00f4, B:75:0x00f8, B:76:0x010d), top: B:95:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9 A[Catch: NumberFormatException -> 0x0113, TryCatch #0 {NumberFormatException -> 0x0113, blocks: (B:25:0x0054, B:27:0x0067, B:30:0x006f, B:32:0x0074, B:36:0x007c, B:37:0x0088, B:39:0x008e, B:45:0x009e, B:63:0x00c6, B:56:0x00b8, B:64:0x00cd, B:66:0x00d6, B:67:0x00e3, B:69:0x00e9, B:73:0x00f4, B:75:0x00f8, B:76:0x010d), top: B:95:0x0054 }] */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x009e. Please report as an issue. */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2757[] m30961(String str, EnumC13402 enumC13402) {
        int i;
        boolean z;
        char cCharAt;
        String strTrim = str.trim();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int length = strTrim.length();
            float[] fArrCopyOfRange = f38216;
            if (i2 >= length) {
                if (i2 - i3 == 1 && i3 < strTrim.length()) {
                    arrayList.add(new C2757(strTrim.charAt(i3), fArrCopyOfRange));
                }
                return (C2757[]) arrayList.toArray(new C2757[0]);
            }
            while (i2 < strTrim.length() && (('A' > (cCharAt = strTrim.charAt(i2)) || cCharAt > 'Z' || cCharAt == 'E') && ('a' > cCharAt || cCharAt > 'z' || cCharAt == 'e'))) {
                i2++;
            }
            String strSubstring = strTrim.substring(i3, i2);
            char cCharAt2 = strSubstring.charAt(z2 ? 1 : 0);
            char cCharAt3 = strSubstring.charAt(z2 ? 1 : 0);
            if (cCharAt3 != 'z' && cCharAt3 != 'Z') {
                boolean z3 = cCharAt3 == 'a' || cCharAt3 == 'A';
                try {
                    float[] fArr = new float[strSubstring.length()];
                    C3525 c3525 = new C3525();
                    int length2 = strSubstring.length();
                    int i4 = 1;
                    int i5 = 0;
                    while (i4 < length2) {
                        boolean z4 = enumC13402 == EnumC13402.SVG && z3 && (i5 % 7 == 3 || i5 % 7 == 4);
                        c3525.f11205 = z2;
                        boolean z5 = false;
                        boolean z6 = false;
                        int i6 = length2;
                        int i7 = i4;
                        boolean z7 = false;
                        while (i7 < strSubstring.length()) {
                            char cCharAt4 = strSubstring.charAt(i7);
                            if (cCharAt4 == ' ') {
                                c3525.f11205 = true;
                                z5 = false;
                            } else {
                                if (cCharAt4 != 'E' && cCharAt4 != 'e') {
                                    switch (cCharAt4) {
                                        case ',':
                                            c3525.f11205 = true;
                                            z5 = false;
                                            break;
                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                            z = (i7 == i4 || z5) ? z7 : true;
                                            z5 = false;
                                            break;
                                        case '.':
                                            if (z6) {
                                                z5 = false;
                                            } else {
                                                z5 = false;
                                                z6 = true;
                                            }
                                            break;
                                        default:
                                            z5 = false;
                                            break;
                                    }
                                } else {
                                    z5 = true;
                                }
                                z = z7;
                            }
                            if (!z && (!z4 || i7 <= i4)) {
                                i7++;
                                z7 = z;
                            }
                            c3525.f11204 = i7;
                            i = c3525.f11204;
                            if (i4 < i) {
                                fArr[i5] = Float.parseFloat(strSubstring.substring(i4, i));
                                i5++;
                            }
                            if (c3525.f11205) {
                                i++;
                            }
                            i4 = i;
                            z2 = false;
                            length2 = i6;
                        }
                        c3525.f11204 = i7;
                        i = c3525.f11204;
                        if (i4 < i) {
                            fArr[i5] = Float.parseFloat(strSubstring.substring(i4, i));
                            i5++;
                        }
                        if (c3525.f11205) {
                            i++;
                        }
                        i4 = i;
                        z2 = false;
                        length2 = i6;
                    }
                    if (z3) {
                        for (int i8 = 0; i8 < i5 - 1; i8 += 7) {
                            fArr[i8] = Math.abs(fArr[i8]);
                            int i9 = i8 + 1;
                            fArr[i9] = Math.abs(fArr[i9]);
                        }
                    }
                    fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, i5);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(C4860.m14172("Error in parsing \"", strSubstring, "\""), e);
                }
            }
            if (i3 == 0 && cCharAt2 != 'M' && cCharAt2 != 'm') {
                arrayList.add(new C2757('M', new float[2]));
            }
            arrayList.add(new C2757(cCharAt2, fArrCopyOfRange));
            i3 = i2;
            i2++;
            z2 = false;
        }
    }
}
