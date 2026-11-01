package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.֨֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAUU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3139 implements InterfaceC18147 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18147 f5726;

    /* JADX INFO: renamed from: ۧ */
    public final Class f5727;

    public C3139(Class cls, InterfaceC18147 interfaceC18147) {
        this.f5727 = cls;
        this.f5726 = interfaceC18147;
    }

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        if (obj == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullListAsEmpty.f70155) != 0) {
                c8760.write("[]");
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c8760.write(91);
            while (i < zArr.length) {
                if (i != 0) {
                    c8760.write(44);
                }
                c8760.write(zArr[i] ? "true" : "false");
                i++;
            }
            c8760.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c8760.getClass();
            int length = bArr.length;
            boolean z = (c8760.f23752 & EnumC22172.UseSingleQuotes.f70155) != 0;
            char c = z ? '\'' : '\"';
            if (length == 0) {
                c8760.write(z ? "''" : "\"\"");
                return;
            }
            char[] cArr = C9327.f25371;
            int i2 = (length / 3) * 3;
            int i3 = length - 1;
            int i4 = c8760.f23754;
            int i5 = (((i3 / 3) + 1) << 2) + i4;
            int i6 = i5 + 2;
            if (i6 > c8760.f23753.length) {
                c8760.m20248(i6);
            }
            c8760.f23754 = i6;
            int i7 = i4 + 1;
            c8760.f23753[i4] = c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i8 + 2;
                int i10 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
                i8 += 3;
                int i11 = i10 | (bArr[i9] & 255);
                char[] cArr2 = c8760.f23753;
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
                char[] cArr3 = c8760.f23753;
                cArr3[i5 - 3] = cArr[i14 >> 12];
                cArr3[i5 - 2] = cArr[(i14 >>> 6) & 63];
                cArr3[i5 - 1] = i13 == 2 ? cArr[i14 & 63] : C0184a.f880h;
                cArr3[i5] = C0184a.f880h;
            }
            c8760.f23753[i5 + 1] = c;
            return;
        }
        if (obj instanceof char[]) {
            c8760.m20245(new String((char[]) obj));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length - 1;
            if (length2 == -1) {
                c8760.append((CharSequence) "[]");
                return;
            }
            c8760.write(91);
            while (i < length2) {
                double d = dArr[i];
                if (Double.isNaN(d)) {
                    c8760.m20244();
                } else {
                    c8760.append((CharSequence) Double.toString(d));
                }
                c8760.write(44);
                i++;
            }
            double d2 = dArr[length2];
            if (Double.isNaN(d2)) {
                c8760.m20244();
            } else {
                c8760.append((CharSequence) Double.toString(d2));
            }
            c8760.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length3 = fArr.length - 1;
            if (length3 == -1) {
                c8760.append((CharSequence) "[]");
                return;
            }
            c8760.write(91);
            while (i < length3) {
                float f = fArr[i];
                if (Float.isNaN(f)) {
                    c8760.m20244();
                } else {
                    c8760.append((CharSequence) Float.toString(f));
                }
                c8760.write(44);
                i++;
            }
            float f2 = fArr[length3];
            if (Float.isNaN(f2)) {
                c8760.m20244();
            } else {
                c8760.append((CharSequence) Float.toString(f2));
            }
            c8760.write(93);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c8760.write(91);
            while (i < iArr.length) {
                if (i != 0) {
                    c8760.write(44);
                }
                c8760.writeInt(iArr[i]);
                i++;
            }
            c8760.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c8760.write(91);
            while (i < jArr.length) {
                if (i != 0) {
                    c8760.write(44);
                }
                c8760.m20249(jArr[i]);
                i++;
            }
            c8760.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c8760.write(91);
            while (i < sArr.length) {
                if (i != 0) {
                    c8760.write(44);
                }
                c8760.writeInt(sArr[i]);
                i++;
            }
            c8760.write(93);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length4 = objArr.length;
        C16135 c16135 = c7834.f20549;
        c7834.m18109(c16135, obj, obj2);
        try {
            c8760.write(91);
            for (int i15 = 0; i15 < length4; i15++) {
                if (i15 != 0) {
                    c8760.write(44);
                }
                Object obj3 = objArr[i15];
                if (obj3 == null) {
                    if (((EnumC22172.WriteNullStringAsEmpty.f70155 & c8760.f23752) != 0) && (obj instanceof String[])) {
                        c8760.m20245("");
                    } else {
                        c8760.append((CharSequence) "null");
                    }
                } else if (obj3.getClass() == this.f5727) {
                    this.f5726.mo5359(c7834, obj3, Integer.valueOf(i15), null);
                } else {
                    c7834.f20547.m54590(obj3.getClass()).mo5359(c7834, obj3, Integer.valueOf(i15), null);
                }
            }
            c8760.write(93);
        } finally {
            c7834.f20549 = c16135;
        }
    }
}
