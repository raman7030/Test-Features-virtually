package p067l;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AVI */
/* JADX INFO: loaded from: classes.dex */
public final class C24079 implements InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public final Class f76459;

    /* JADX INFO: renamed from: ۧ */
    public long[] f76460;

    /* JADX INFO: renamed from: ܽ */
    public final Enum[] f76461;

    /* JADX INFO: renamed from: ᩳ */
    public final Enum[] f76462;

    public C24079(Class cls) {
        this.f76459 = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f76462 = enumArr;
        int length = enumArr.length;
        long[] jArr = new long[length];
        this.f76460 = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f76462;
            if (i >= enumArr2.length) {
                break;
            }
            String strName = enumArr2[i].name();
            long jCharAt = -3750763034362895579L;
            for (int i2 = 0; i2 < strName.length(); i2++) {
                jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
            }
            jArr[i] = jCharAt;
            this.f76460[i] = jCharAt;
            i++;
        }
        Arrays.sort(this.f76460);
        this.f76461 = new Enum[this.f76462.length];
        for (int i3 = 0; i3 < this.f76460.length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                if (this.f76460[i3] == jArr[i4]) {
                    this.f76461[i3] = this.f76462[i4];
                    break;
                }
            }
        }
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        try {
            C9327 c9327 = c13351.f37485;
            int i = c9327.f25382;
            Class cls = this.f76459;
            if (i == 2) {
                int iM21619 = c9327.m21619();
                c9327.m21609(16);
                if (iM21619 >= 0) {
                    Enum[] enumArr = this.f76462;
                    if (iM21619 <= enumArr.length) {
                        return enumArr[iM21619];
                    }
                }
                throw new C16702("parse enum " + cls.getName() + " error, value : " + iM21619);
            }
            if (i != 4) {
                if (i == 8) {
                    c9327.m21609(16);
                    return null;
                }
                throw new C16702("parse enum " + cls.getName() + " error, value : " + c13351.m30480((Object) null));
            }
            String strM21602 = c9327.m21602();
            c9327.m21609(16);
            if (strM21602.length() != 0) {
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strM21602.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strM21602.charAt(i2))) * 1099511628211L;
                }
                int iBinarySearch = Arrays.binarySearch(this.f76460, jCharAt);
                if (iBinarySearch >= 0) {
                    return this.f76461[iBinarySearch];
                }
            }
            return null;
        } catch (C16702 e) {
            throw e;
        } catch (Exception e2) {
            throw new C16702(e2.getMessage(), (Throwable) e2);
        }
    }
}
