package p067l;

/* JADX INFO: renamed from: l.ۛܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8157 extends AbstractC24250 {
    public final String toString() {
        return "big endian";
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ֫ */
    public final long mo18931(C12181 c12181) throws C14862 {
        c12181.getClass();
        byte[] bArr = new byte[8];
        c12181.m28112(8, bArr);
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
        return j;
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ֫ */
    public final void mo18933(C12181 c12181, String str) {
        byte[] bytes = str.getBytes(C10169.f28133);
        c12181.getClass();
        c12181.m28102(bytes.length, bytes);
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ۧ */
    public final long mo18934(C12181 c12181) throws C14862 {
        byte[] bArr = new byte[4];
        c12181.m28112(4, bArr);
        return (((long) bArr[3]) & 255) | (((long) (bArr[0] << 24)) & 4278190080L) | (((long) (bArr[1] << 16)) & 16711680) | (((long) (bArr[2] << 8)) & 65280);
    }

    @Override // p067l.AbstractC24250
    /* JADX INFO: renamed from: ֫ */
    public final void mo18932(C12181 c12181, long j) {
        c12181.m28102(8, new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
    }
}
