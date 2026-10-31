package l;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1442 extends C4265 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19788 f5148 = new C19788();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19788 f5149 = new C19788();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m4952(C19788 c19788, int i) {
        C0736 c0736;
        Object obj;
        if (i < 32768) {
            return null;
        }
        synchronized (c19788) {
            c0736 = (C0736) c19788.get(Integer.valueOf(i));
        }
        if (c0736 == null) {
            return null;
        }
        do {
            Reference reference = (Reference) c0736.m2839();
            if (reference == null) {
                return null;
            }
            obj = reference.get();
        } while (obj == null);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4953(C19788 c19788, Object obj, int i) {
        C0736 c0736;
        if (i < 32768) {
            return;
        }
        synchronized (c19788) {
            c0736 = (C0736) c19788.get(Integer.valueOf(i));
            if (c0736 == null) {
                c0736 = new C0736(0);
                c19788.put(Integer.valueOf(i), c0736);
            }
        }
        c0736.m2840(new SoftReference(obj));
    }

    @Override // l.C4265
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo4956(int i) {
        byte[] bArr = (byte[]) m4952(this.f5148, i);
        return bArr == null ? new byte[i] : bArr;
    }

    @Override // l.C4265
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4954(byte[] bArr) {
        m4953(this.f5148, bArr, bArr.length);
    }

    @Override // l.C4265
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] mo4957(int i, boolean z) {
        int[] iArr = (int[]) m4952(this.f5149, i);
        if (iArr == null) {
            return new int[i];
        }
        if (z) {
            Arrays.fill(iArr, 0);
        }
        return iArr;
    }

    @Override // l.C4265
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4955(int[] iArr) {
        m4953(this.f5149, iArr, iArr.length);
    }
}
