package l;

/* JADX INFO: renamed from: l.ۨܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11736 extends AbstractC23024 {
    public final String toString() {
        return "little endian";
    }

    @Override // l.AbstractC23024
    /* JADX INFO: renamed from: ֫ */
    public final void mo17002(C10325 c10325, String str) {
        byte[] bytes = str.getBytes(C8208.f25225);
        c10325.getClass();
        c10325.m26077(bytes.length, bytes);
    }

    @Override // l.AbstractC23024
    /* JADX INFO: renamed from: ֫ */
    public final long mo17000(C10325 c10325) throws C13146 {
        byte[] bArr = new byte[8];
        c10325.m26087(8, bArr);
        long j = 0;
        for (int i = 7; i >= 0; i--) {
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
        return j;
    }

    @Override // l.AbstractC23024
    /* JADX INFO: renamed from: ۧ */
    public final long mo17003(C10325 c10325) throws C13146 {
        byte[] bArr = new byte[4];
        c10325.m26087(4, bArr);
        return (((long) (bArr[3] << 24)) & 4278190080L) | (((long) bArr[0]) & 255) | (((long) (bArr[1] << 8)) & 65280) | (((long) (bArr[2] << 16)) & 16711680);
    }

    @Override // l.AbstractC23024
    /* JADX INFO: renamed from: ֫ */
    public final void mo17001(C10325 c10325, long j) {
        c10325.m26077(8, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)});
    }
}
