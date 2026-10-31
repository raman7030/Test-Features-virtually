package l;

import com.alipay.sdk.m.p.a;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.֨֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAUU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0811 implements InterfaceC16602 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16602 f2955;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class f2956;

    public C0811(Class cls, InterfaceC16602 interfaceC16602) {
        this.f2956 = cls;
        this.f2955 = interfaceC16602;
    }

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if (obj == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullListAsEmpty.f67472) != 0) {
                c6725.write("[]");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c6725.write(91);
            while (i < zArr.length) {
                if (i != 0) {
                    c6725.write(44);
                }
                c6725.write(zArr[i] ? "true" : "false");
                i++;
            }
            c6725.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c6725.getClass();
            int length = bArr.length;
            boolean z = (c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0;
            char c = z ? '\'' : '\"';
            if (length == 0) {
                c6725.write(z ? "''" : "\"\"");
                return;
            }
            char[] cArr = C7322.f22480;
            int i2 = (length / 3) * 3;
            int i3 = length - 1;
            int i4 = c6725.f20880;
            int i5 = (((i3 / 3) + 1) << 2) + i4;
            int i6 = i5 + 2;
            if (i6 > c6725.f20879.length) {
                c6725.m18300(i6);
            }
            c6725.f20880 = i6;
            int i7 = i4 + 1;
            c6725.f20879[i4] = c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i8 + 2;
                int i10 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
                i8 += 3;
                int i11 = i10 | (bArr[i9] & 255);
                char[] cArr2 = c6725.f20879;
                cArr2[i7] = cArr[(i11 >>> 18) & 63];
                cArr2[i7 + 1] = cArr[(i11 >>> 12) & 63];
                int i12 = i7 + 3;
                cArr2[i7 + 2] = cArr[(i11 >>> 6) & 63];
                i7 += 4;
                cArr2[i12] = cArr[i11 & 63];
            }
            int i13 = length - i2;
            if (i13 > 0) {
                int i14 = ((bArr[i2] & 255) << 10) | (i13 == 2 ? (bArr[i3] & 255) << 2 : 0);
                char[] cArr3 = c6725.f20879;
                cArr3[i5 - 3] = cArr[i14 >> 12];
                cArr3[i5 - 2] = cArr[(i14 >>> 6) & 63];
                cArr3[i5 - 1] = i13 == 2 ? cArr[i14 & 63] : a.h;
                cArr3[i5] = a.h;
            }
            c6725.f20879[i5 + 1] = c;
            return;
        }
        if (obj instanceof char[]) {
            c6725.m18297(new String((char[]) obj));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length - 1;
            if (length2 == -1) {
                c6725.append((CharSequence) "[]");
                return;
            }
            c6725.write(91);
            while (i < length2) {
                double d = dArr[i];
                if (Double.isNaN(d)) {
                    c6725.m18296();
                } else {
                    c6725.append((CharSequence) Double.toString(d));
                }
                c6725.write(44);
                i++;
            }
            double d2 = dArr[length2];
            if (Double.isNaN(d2)) {
                c6725.m18296();
            } else {
                c6725.append((CharSequence) Double.toString(d2));
            }
            c6725.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length3 = fArr.length - 1;
            if (length3 == -1) {
                c6725.append((CharSequence) "[]");
                return;
            }
            c6725.write(91);
            while (i < length3) {
                float f = fArr[i];
                if (Float.isNaN(f)) {
                    c6725.m18296();
                } else {
                    c6725.append((CharSequence) Float.toString(f));
                }
                c6725.write(44);
                i++;
            }
            float f2 = fArr[length3];
            if (Float.isNaN(f2)) {
                c6725.m18296();
            } else {
                c6725.append((CharSequence) Float.toString(f2));
            }
            c6725.write(93);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c6725.write(91);
            while (i < iArr.length) {
                if (i != 0) {
                    c6725.write(44);
                }
                c6725.writeInt(iArr[i]);
                i++;
            }
            c6725.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c6725.write(91);
            while (i < jArr.length) {
                if (i != 0) {
                    c6725.write(44);
                }
                c6725.m18301(jArr[i]);
                i++;
            }
            c6725.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c6725.write(91);
            while (i < sArr.length) {
                if (i != 0) {
                    c6725.write(44);
                }
                c6725.writeInt(sArr[i]);
                i++;
            }
            c6725.write(93);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length4 = objArr.length;
        C14485 c14485 = c5751.f17704;
        c5751.m16190(c14485, obj, obj2);
        try {
            c6725.write(91);
            for (int i15 = 0; i15 < length4; i15++) {
                if (i15 != 0) {
                    c6725.write(44);
                }
                Object obj3 = objArr[i15];
                if (obj3 == null) {
                    if (((EnumC20837.WriteNullStringAsEmpty.f67472 & c6725.f20878) != 0) && (obj instanceof String[])) {
                        c6725.m18297("");
                    } else {
                        c6725.append((CharSequence) "null");
                    }
                } else if (obj3.getClass() == this.f2956) {
                    this.f2955.mo3046(c5751, obj3, Integer.valueOf(i15), null);
                } else {
                    c5751.f17702.m52187(obj3.getClass()).mo3046(c5751, obj3, Integer.valueOf(i15), null);
                }
            }
            c6725.write(93);
        } finally {
            c5751.f17704 = c14485;
        }
    }
}
