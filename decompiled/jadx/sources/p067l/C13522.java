package p067l;

/* JADX INFO: renamed from: l.ۨܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13522 extends AbstractC24250 {
    public final String toString() {
        return "little endian";
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ֫ */
    public final void mo18933(C12181 c12181, String str) {
        byte[] bytes = str.getBytes(C10169.f28135);
        c12181.getClass();
        c12181.m28102(bytes.length, bytes);
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ֫ */
    public final long mo18931(C12181 c12181) throws C14862 {
        byte[] bArr = new byte[8];
        c12181.m28112(8, bArr);
        long j = 0;
        for (int i = 7; i >= 0; i--) {
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
        return j;
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ۧ */
    public final long mo18934(C12181 c12181) throws C14862 {
        byte[] bArr = new byte[4];
        c12181.m28112(4, bArr);
        return (((long) (bArr[3] << 24)) & 4278190080L) | (((long) bArr[0]) & 255) | (((long) (bArr[1] << 8)) & 65280) | (((long) (bArr[2] << 16)) & 16711680);
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ֫ */
    public final void mo18932(C12181 c12181, long j) {
        c12181.m28102(8, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)});
    }
}
