package p067l;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3739 extends C6422 {

    /* JADX INFO: renamed from: ۧ */
    public final C21175 f7921 = new C21175();

    /* JADX INFO: renamed from: ܽ */
    public final C21175 f7922 = new C21175();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static Object m7195(C21175 c21175, int i) {
        C3068 c3068;
        Object obj;
        if (i < 32768) {
            return null;
        }
        synchronized (c21175) {
            c3068 = (C3068) c21175.get(Integer.valueOf(i));
        }
        if (c3068 == null) {
            return null;
        }
        do {
            Reference reference = (Reference) c3068.m5168();
            if (reference == null) {
                return null;
            }
            obj = reference.get();
        } while (obj == null);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m7196(C21175 c21175, Object obj, int i) {
        C3068 c3068;
        if (i < 32768) {
            return;
        }
        synchronized (c21175) {
            c3068 = (C3068) c21175.get(Integer.valueOf(i));
            if (c3068 == null) {
                c3068 = new C3068(0);
                c21175.put(Integer.valueOf(i), c3068);
            }
        }
        c3068.m5169(new SoftReference(obj));
    }

    @Override // p067l.C6422
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo7199(int i) {
        byte[] bArr = (byte[]) m7195(this.f7921, i);
        return bArr == null ? new byte[i] : bArr;
    }

    @Override // p067l.C6422
    /* JADX INFO: renamed from: ֫ */
    public final void mo7197(byte[] bArr) {
        m7196(this.f7921, bArr, bArr.length);
    }

    @Override // p067l.C6422
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo7200(int i, boolean z) {
        int[] iArr = (int[]) m7195(this.f7922, i);
        if (iArr == null) {
            return new int[i];
        }
        if (z) {
            Arrays.fill(iArr, 0);
        }
        return iArr;
    }

    @Override // p067l.C6422
    /* JADX INFO: renamed from: ֫ */
    public final void mo7198(int[] iArr) {
        m7196(this.f7922, iArr, iArr.length);
    }
}
