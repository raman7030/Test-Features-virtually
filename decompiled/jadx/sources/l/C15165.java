package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܶۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15165 extends C19119 {
    public C15165(Object[] objArr) {
        super(objArr, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35869(int i, C8111 c8111, C8111 c8112) {
        Object[] objArr;
        m42524(i);
        int i2 = this.f60232;
        Object[] objArr2 = this.f60231;
        int i3 = i2 + 2;
        if (i3 > objArr2.length) {
            if (i3 > objArr2.length) {
                int iMax = (int) Math.max(Math.min(((long) objArr2.length) + ((long) (objArr2.length >> 1)), 2147483639L), i3);
                Class<?> cls = objArr2.getClass();
                if (cls == Object[].class) {
                    objArr = iMax == 0 ? C7829.f24229 : new Object[iMax];
                } else {
                    objArr = (Object[]) Array.newInstance(cls.getComponentType(), iMax);
                }
                System.arraycopy(objArr2, 0, objArr, 0, i2);
                objArr2 = objArr;
            }
            this.f60231 = objArr2;
        }
        System.arraycopy(objArr2, i, objArr2, i + 2, i2 - i);
        objArr2[i] = c8111;
        objArr2[i + 1] = c8112;
        this.f60232 = i3;
    }
}
