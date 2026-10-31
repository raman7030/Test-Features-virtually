package l;

import android.graphics.Path;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 7553 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14533 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float[] m34678(int i, float[] fArr) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Path m34681(String str) {
        Path path = new Path();
        try {
            m34676(m34679(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099 A[Catch: NumberFormatException -> 0x00ba, LOOP:3: B:25:0x0069->B:45:0x0099, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:22:0x0056, B:25:0x0069, B:27:0x006f, B:32:0x007d, B:45:0x0099, B:47:0x009e, B:50:0x00ae, B:52:0x00b2), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x009e A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:22:0x0056, B:25:0x0069, B:27:0x006f, B:32:0x007d, B:45:0x0099, B:47:0x009e, B:50:0x00ae, B:52:0x00b2), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:22:0x0056, B:25:0x0069, B:27:0x006f, B:32:0x007d, B:45:0x0099, B:47:0x009e, B:50:0x00ae, B:52:0x00b2), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0098 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17356[] m34679(String str) {
        int i;
        String strTrim;
        float[] fArrM34678;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i5, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArrM34678 = new float[i3];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i6 = 0;
                                    for (int i7 = 1; i7 < length; i7 = i2) {
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        i2 = i7;
                                        while (i2 < strTrim.length()) {
                                            char cCharAt2 = strTrim.charAt(i2);
                                            if (cCharAt2 != ' ') {
                                                if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                    switch (cCharAt2) {
                                                        case ',':
                                                            break;
                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                            if (i2 == i7 || z) {
                                                                z = false;
                                                            } else {
                                                                z = false;
                                                                z3 = true;
                                                                z4 = true;
                                                            }
                                                            break;
                                                        case '.':
                                                            if (z2) {
                                                                z = false;
                                                                z3 = true;
                                                                z4 = true;
                                                            } else {
                                                                z = false;
                                                                z2 = true;
                                                            }
                                                            break;
                                                        default:
                                                            z = false;
                                                            break;
                                                    }
                                                } else {
                                                    z = true;
                                                }
                                                if (z3) {
                                                    if (i7 < i2) {
                                                        fArr[i6] = Float.parseFloat(strTrim.substring(i7, i2));
                                                        i6++;
                                                    }
                                                    if (!z4) {
                                                        i2++;
                                                    }
                                                } else {
                                                    i2++;
                                                }
                                            }
                                            z = false;
                                            z3 = true;
                                            if (z3) {
                                                if (i7 < i2) {
                                                    fArr[i6] = Float.parseFloat(strTrim.substring(i7, i2));
                                                    i6++;
                                                }
                                                if (!z4) {
                                                    i2++;
                                                }
                                            } else {
                                                i2++;
                                            }
                                        }
                                        if (i7 < i2) {
                                            fArr[i6] = Float.parseFloat(strTrim.substring(i7, i2));
                                            i6++;
                                        }
                                        if (!z4) {
                                            i2++;
                                        }
                                    }
                                    fArrM34678 = m34678(i6, fArr);
                                    i3 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(C4860.m14172("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new C17356(strTrim.charAt(i3), fArrM34678));
                        }
                        i5 = i4;
                        i4++;
                        i3 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i5, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    fArrM34678 = new float[i3];
                } else {
                    fArrM34678 = new float[i3];
                }
                arrayList.add(new C17356(strTrim.charAt(i3), fArrM34678));
            }
            i5 = i4;
            i4++;
            i3 = 0;
        }
        if (i4 - i5 != 1 || i5 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C17356(str.charAt(i5), new float[0]));
        }
        return (C17356[]) arrayList.toArray(new C17356[i]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17356[] m34680(C17356[] c17356Arr) {
        C17356[] c17356Arr2 = new C17356[c17356Arr.length];
        for (int i = 0; i < c17356Arr.length; i++) {
            c17356Arr2[i] = new C17356(c17356Arr[i]);
        }
        return c17356Arr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34677(C17356[] c17356Arr, C17356[] c17356Arr2) {
        if (c17356Arr == null || c17356Arr2 == null || c17356Arr.length != c17356Arr2.length) {
            return false;
        }
        for (int i = 0; i < c17356Arr.length; i++) {
            if (c17356Arr[i].f53162 != c17356Arr2[i].f53162 || c17356Arr[i].f53161.length != c17356Arr2[i].f53161.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34682(C17356[] c17356Arr, C17356[] c17356Arr2) {
        for (int i = 0; i < c17356Arr2.length; i++) {
            c17356Arr[i].f53162 = c17356Arr2[i].f53162;
            for (int i2 = 0; i2 < c17356Arr2[i].f53161.length; i2++) {
                c17356Arr[i].f53161[i2] = c17356Arr2[i].f53161[i2];
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34676(C17356[] c17356Arr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (C17356 c17356 : c17356Arr) {
            C17356.m40683(path, fArr, c, c17356.f53162, c17356.f53161);
            c = c17356.f53162;
        }
    }
}
