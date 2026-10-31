package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5JT */
/* JADX INFO: loaded from: classes3.dex */
public class C10397 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C4752 f31272;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f31273;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f31274;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f31275;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f31276;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f31277;

    public C10397(C4752 c4752, int i) {
        ByteBuffer byteBuffer = c4752.f15067;
        this.f31272 = c4752;
        this.f31275 = byteBuffer.getInt(i);
        byteBuffer.getInt(i + 4);
        if (c4752.f15068) {
            byteBuffer.getLong(i + 8);
            byteBuffer.getLong(i + 16);
            this.f31273 = byteBuffer.getLong(i + 24);
            this.f31274 = byteBuffer.getLong(i + 32);
            this.f31277 = byteBuffer.getInt(i + 40);
            byteBuffer.getInt(i + 44);
            byteBuffer.getLong(i + 48);
            this.f31276 = byteBuffer.getLong(i + 56);
            return;
        }
        byteBuffer.getInt(i + 8);
        byteBuffer.getInt(i + 12);
        this.f31273 = ((long) byteBuffer.getInt(i + 16)) & 4294967295L;
        this.f31274 = ((long) byteBuffer.getInt(i + 20)) & 4294967295L;
        this.f31277 = byteBuffer.getInt(i + 24);
        byteBuffer.getInt(i + 28);
        byteBuffer.getInt(i + 32);
        this.f31276 = byteBuffer.getInt(i + 36);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        C6163 c6163 = this.f31272.f15070;
        sb.append(c6163 == null ? null : c6163.m17068(this.f31275));
        sb.append(')');
        return sb.toString();
    }
}
