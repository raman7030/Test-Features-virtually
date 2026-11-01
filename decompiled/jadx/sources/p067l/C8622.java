package p067l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۜۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8622 extends AbstractC11500 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ */
    public static final AbstractC11500 f23161 = new C8622(null, new Object[0], 0);

    /* JADX INFO: renamed from: ۗ */
    public final transient Object[] f23162;

    /* JADX INFO: renamed from: ۫ */
    public final transient int f23163;

    /* JADX INFO: renamed from: ۬ */
    public final transient Object f23164;

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo20047() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8622 m20042(int i, Object[] objArr, C8817 c8817) {
        if (i == 0) {
            return (C8622) f23161;
        }
        if (i == 1) {
            C12826.requireNonNull(objArr[0]);
            C12826.requireNonNull(objArr[1]);
            return new C8622(null, objArr, 1);
        }
        C6194.m14032(i, objArr.length >> 1);
        Object objM20040 = m20040(i, AbstractC8146.m18917(i), 0, objArr);
        if (objM20040 instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM20040;
            C24910 c24910 = (C24910) objArr2[2];
            if (c8817 == null) {
                throw c24910.m54694();
            }
            c8817.f23934 = c24910;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM20040 = obj;
            i = iIntValue;
        }
        return new C8622(objM20040, objArr, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m20040(int i, int i2, int i3, Object[] objArr) {
        C24910 c24910 = null;
        int i4 = 1;
        if (i == 1) {
            C12826.requireNonNull(objArr[i3]);
            C12826.requireNonNull(objArr[i3 ^ 1]);
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
                C12826.requireNonNull(obj);
                Object obj2 = objArr[i8 ^ 1];
                C12826.requireNonNull(obj2);
                int iM11131 = C5191.m11131(obj.hashCode());
                while (true) {
                    int i10 = iM11131 & i5;
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
                        C12826.requireNonNull(obj3);
                        c24910 = new C24910(obj, obj2, obj3);
                        objArr[i12] = obj2;
                        break;
                    }
                    iM11131 = i10 + 1;
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c24910};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj4 = objArr[i15];
                C12826.requireNonNull(obj4);
                Object obj5 = objArr[i15 ^ 1];
                C12826.requireNonNull(obj5);
                int iM11132 = C5191.m11131(obj4.hashCode());
                while (true) {
                    int i17 = iM11132 & i5;
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
                        C12826.requireNonNull(obj6);
                        c24910 = new C24910(obj4, obj5, obj6);
                        objArr[i19] = obj5;
                        break;
                    }
                    iM11132 = i17 + 1;
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c24910};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj7 = objArr[i22];
            C12826.requireNonNull(obj7);
            Object obj8 = objArr[i4 ^ i22];
            C12826.requireNonNull(obj8);
            int iM11133 = C5191.m11131(obj7.hashCode());
            while (true) {
                int i24 = iM11133 & i5;
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
                    C12826.requireNonNull(obj9);
                    c24910 = new C24910(obj7, obj8, obj9);
                    objArr[i26] = obj8;
                    break;
                }
                iM11133 = i24 + 1;
            }
            i20++;
            i4 = 1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c24910};
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m20043(int i, int i2, int i3, Object[] objArr) {
        Object objM20040 = m20040(i, i2, i3, objArr);
        if (objM20040 instanceof Object[]) {
            throw ((C24910) ((Object[]) objM20040)[2]).m54694();
        }
        return objM20040;
    }

    public C8622(Object obj, Object[] objArr, int i) {
        this.f23164 = obj;
        this.f23162 = objArr;
        this.f23163 = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f23163;
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final Object get(Object obj) {
        Object objM20041 = m20041(this.f23164, this.f23162, this.f23163, 0, obj);
        if (objM20041 == null) {
            return null;
        }
        return objM20041;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m20041(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            C12826.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            C12826.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM11131 = C5191.m11131(obj2.hashCode());
            while (true) {
                int i3 = iM11131 & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iM11131 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM11132 = C5191.m11131(obj2.hashCode());
            while (true) {
                int i5 = iM11132 & length2;
                int i6 = sArr[i5] & HPKE.aead_EXPORT_ONLY;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iM11132 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM11133 = C5191.m11131(obj2.hashCode());
            while (true) {
                int i7 = iM11133 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iM11133 = i7 + 1;
            }
        }
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8146 mo20044() {
        return new C18680(this, this.f23162, 0, this.f23163);
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8146 mo20045() {
        return new C15997(this, new C24715(0, this.f23163, this.f23162));
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC23966 mo20046() {
        return new C24715(1, this.f23163, this.f23162);
    }

    @Override // p067l.AbstractC11500
    public Object writeReplace() {
        return super.writeReplace();
    }
}
