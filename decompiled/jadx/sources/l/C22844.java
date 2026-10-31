package l;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AVI */
/* JADX INFO: loaded from: classes.dex */
public final class C22844 implements InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class f73727;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long[] f73728;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Enum[] f73729;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Enum[] f73730;

    public C22844(Class cls) {
        this.f73727 = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f73730 = enumArr;
        int length = enumArr.length;
        long[] jArr = new long[length];
        this.f73728 = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f73730;
            if (i >= enumArr2.length) {
                break;
            }
            String strName = enumArr2[i].name();
            long jCharAt = -3750763034362895579L;
            for (int i2 = 0; i2 < strName.length(); i2++) {
                jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
            }
            jArr[i] = jCharAt;
            this.f73728[i] = jCharAt;
            i++;
        }
        Arrays.sort(this.f73728);
        this.f73729 = new Enum[this.f73730.length];
        for (int i3 = 0; i3 < this.f73728.length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                if (this.f73728[i3] == jArr[i4]) {
                    this.f73729[i3] = this.f73730[i4];
                    break;
                }
            }
        }
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        try {
            C7322 c7322 = c11556.f34488;
            int i = c7322.f22491;
            Class cls = this.f73727;
            if (i == 2) {
                int iM19651 = c7322.m19651();
                c7322.m19641(16);
                if (iM19651 >= 0) {
                    Enum[] enumArr = this.f73730;
                    if (iM19651 <= enumArr.length) {
                        return enumArr[iM19651];
                    }
                }
                throw new C15082("parse enum " + cls.getName() + " error, value : " + iM19651);
            }
            if (i != 4) {
                if (i == 8) {
                    c7322.m19641(16);
                    return null;
                }
                throw new C15082("parse enum " + cls.getName() + " error, value : " + c11556.m28434((Object) null));
            }
            String strM19634 = c7322.m19634();
            c7322.m19641(16);
            if (strM19634.length() != 0) {
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strM19634.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strM19634.charAt(i2))) * 1099511628211L;
                }
                int iBinarySearch = Arrays.binarySearch(this.f73728, jCharAt);
                if (iBinarySearch >= 0) {
                    return this.f73729[iBinarySearch];
                }
            }
            return null;
        } catch (C15082 e) {
            throw e;
        } catch (Exception e2) {
            throw new C15082(e2.getMessage(), (Throwable) e2);
        }
    }
}
