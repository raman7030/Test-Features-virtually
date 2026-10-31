package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۗܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 954P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3341 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f10559;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f10560;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13923 f10561;

    public C3341(C4752 c4752, C12513 c12513, int i) {
        ByteBuffer byteBuffer = c4752.f15067;
        C10397 c10397 = c12513.f31272.f15069[c12513.f31277];
        long j = c12513.f31276;
        this.f10561 = (C13923) c10397;
        if (c4752.f15068) {
            byteBuffer.getLong(i);
            this.f10560 = byteBuffer.getLong(i + 8);
            this.f10559 = j >= 24 ? byteBuffer.getLong(i + 16) : 0L;
        } else {
            byteBuffer.getInt(i);
            this.f10560 = byteBuffer.getInt(i + 4);
            this.f10559 = j >= 12 ? byteBuffer.getInt(i + 8) : 0L;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f10560;
        C11808 c11808M33359 = this.f10561.m33359((int) (j >>> 32));
        C6163 c6163 = c11808M33359.f35220;
        sb.append(c6163 == null ? null : c6163.m17068(c11808M33359.f35219));
        sb.append('(');
        sb.append((int) j);
        sb.append(')');
        sb.append(this.f10559);
        return sb.toString();
    }
}
