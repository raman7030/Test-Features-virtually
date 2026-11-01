package p067l;

/* JADX INFO: renamed from: l.۠ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9KT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10054 {

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC23465 f27812;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f27813 = new byte[4];

    /* JADX INFO: renamed from: ۧ */
    public C17823 f27814;

    /* JADX INFO: renamed from: ֫ */
    public static void m23424(InterfaceC23465 interfaceC23465) {
        f27812 = interfaceC23465;
    }

    public C10054(C17823 c17823) {
        this.f27814 = c17823;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23425() {
        this.f27814.f53186 = 5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23426(int i, boolean z) {
        C17823 c17823 = this.f27814;
        int i2 = c17823.f53186;
        if (!z) {
            i2 -= 4;
        }
        int i3 = (-i2) & (i - 1);
        if (i3 < i) {
            i3 += i;
        }
        int i4 = i2 + i3;
        if (z) {
            i4 -= 4;
        }
        byte[] bArr = this.f27813;
        bArr[0] = (byte) (i4 >>> 24);
        bArr[1] = (byte) (i4 >>> 16);
        bArr[2] = (byte) (i4 >>> 8);
        bArr[3] = (byte) i4;
        System.arraycopy(bArr, 0, c17823.f53185, 0, 4);
        this.f27814.f53185[4] = (byte) i3;
        synchronized (f27812) {
            InterfaceC23465 interfaceC23465 = f27812;
            C17823 c17824 = this.f27814;
            interfaceC23465.mo5385(c17824.f53186, i3, c17824.f53185);
        }
        this.f27814.m40465(i3);
    }
}
