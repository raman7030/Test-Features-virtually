package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۜۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6580 extends AbstractC9608 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f20283 = new C6580(null, new Object[0], 0);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f20284;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f20285;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient Object f20286;

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo18096() {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6580 m18091(int i, Object[] objArr, C6785 c6785) {
        if (i == 0) {
            return (C6580) f20283;
        }
        if (i == 1) {
            C11003.requireNonNull(objArr[0]);
            C11003.requireNonNull(objArr[1]);
            return new C6580(null, objArr, 1);
        }
        C4025.m12112(i, objArr.length >> 1);
        Object objM18089 = m18089(i, AbstractC6079.m16986(i), 0, objArr);
        if (objM18089 instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM18089;
            C23718 c23718 = (C23718) objArr2[2];
            if (c6785 == null) {
                throw c23718.m52291();
            }
            c6785.f21060 = c23718;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM18089 = obj;
            i = iIntValue;
        }
        return new C6580(objM18089, objArr, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m18089(int i, int i2, int i3, Object[] objArr) {
        C23718 c23718 = null;
        int i4 = 1;
        if (i == 1) {
            C11003.requireNonNull(objArr[i3]);
            C11003.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i5 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj = objArr[i8];
                C11003.requireNonNull(obj);
                Object obj2 = objArr[i8 ^ 1];
                C11003.requireNonNull(obj2);
                int iM9079 = C2970.m9079(obj.hashCode());
                while (true) {
                    int i10 = iM9079 & i5;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj;
                            objArr[i9 ^ 1] = obj2;
                        }
                        i6++;
                        break;
                    }
                    if (obj.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        Object obj3 = objArr[i12];
                        C11003.requireNonNull(obj3);
                        c23718 = new C23718(obj, obj2, obj3);
                        objArr[i12] = obj2;
                        break;
                    }
                    iM9079 = i10 + 1;
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c23718};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj4 = objArr[i15];
                C11003.requireNonNull(obj4);
                Object obj5 = objArr[i15 ^ 1];
                C11003.requireNonNull(obj5);
                int iM90710 = C2970.m9079(obj4.hashCode());
                while (true) {
                    int i17 = iM90710 & i5;
                    int i18 = sArr[i17] & HPKE.aead_EXPORT_ONLY;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj4;
                            objArr[i16 ^ 1] = obj5;
                        }
                        i13++;
                        break;
                    }
                    if (obj4.equals(objArr[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj6 = objArr[i19];
                        C11003.requireNonNull(obj6);
                        c23718 = new C23718(obj4, obj5, obj6);
                        objArr[i19] = obj5;
                        break;
                    }
                    iM90710 = i17 + 1;
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c23718};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj7 = objArr[i22];
            C11003.requireNonNull(obj7);
            Object obj8 = objArr[i4 ^ i22];
            C11003.requireNonNull(obj8);
            int iM90711 = C2970.m9079(obj7.hashCode());
            while (true) {
                int i24 = iM90711 & i5;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj7;
                        objArr[i23 ^ 1] = obj8;
                    }
                    i21++;
                    break;
                }
                if (obj7.equals(objArr[i25])) {
                    int i26 = i25 ^ 1;
                    Object obj9 = objArr[i26];
                    C11003.requireNonNull(obj9);
                    c23718 = new C23718(obj7, obj8, obj9);
                    objArr[i26] = obj8;
                    break;
                }
                iM90711 = i24 + 1;
            }
            i20++;
            i4 = 1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c23718};
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m18092(int i, int i2, int i3, Object[] objArr) {
        Object objM18089 = m18089(i, i2, i3, objArr);
        if (objM18089 instanceof Object[]) {
            throw ((C23718) ((Object[]) objM18089)[2]).m52291();
        }
        return objM18089;
    }

    public C6580(Object obj, Object[] objArr, int i) {
        this.f20286 = obj;
        this.f20284 = objArr;
        this.f20285 = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20285;
    }

    @Override // l.AbstractC9608, java.util.Map
    public final Object get(Object obj) {
        Object objM18090 = m18090(this.f20286, this.f20284, this.f20285, 0, obj);
        if (objM18090 == null) {
            return null;
        }
        return objM18090;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m18090(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            C11003.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            C11003.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM9079 = C2970.m9079(obj2.hashCode());
            while (true) {
                int i3 = iM9079 & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iM9079 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM90710 = C2970.m9079(obj2.hashCode());
            while (true) {
                int i5 = iM90710 & length2;
                int i6 = sArr[i5] & HPKE.aead_EXPORT_ONLY;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iM90710 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM90711 = C2970.m9079(obj2.hashCode());
            while (true) {
                int i7 = iM90711 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iM90711 = i7 + 1;
            }
        }
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 mo18093() {
        return new C17163(this, this.f20284, 0, this.f20285);
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 mo18094() {
        return new C14340(this, new C23513(0, this.f20285, this.f20284));
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC22725 mo18095() {
        return new C23513(1, this.f20285, this.f20284);
    }

    @Override // l.AbstractC9608
    public Object writeReplace() {
        return super.writeReplace();
    }
}
