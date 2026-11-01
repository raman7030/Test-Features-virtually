package p067l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܶۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16781 extends C20539 {
    public C16781(Object[] objArr) {
        super(objArr, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38027(int i, C10077 c10077, C10077 c10078) {
        Object[] objArr;
        m44783(i);
        int i2 = this.f63464;
        Object[] objArr2 = this.f63463;
        int i3 = i2 + 2;
        if (i3 > objArr2.length) {
            if (i3 > objArr2.length) {
                int iMax = (int) Math.max(Math.min(((long) objArr2.length) + ((long) (objArr2.length >> 1)), 2147483639L), i3);
                Class<?> cls = objArr2.getClass();
                if (cls == Object[].class) {
                    objArr = iMax == 0 ? C9809.f27145 : new Object[iMax];
                } else {
                    objArr = (Object[]) Array.newInstance(cls.getComponentType(), iMax);
                }
                System.arraycopy(objArr2, 0, objArr, 0, i2);
                objArr2 = objArr;
            }
            this.f63463 = objArr2;
        }
        System.arraycopy(objArr2, i, objArr2, i + 2, i2 - i);
        objArr2[i] = c10077;
        objArr2[i + 1] = c10078;
        this.f63464 = i3;
    }
}
