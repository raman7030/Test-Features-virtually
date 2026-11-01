package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5JT */
/* JADX INFO: loaded from: classes3.dex */
public class C12250 {

    /* JADX INFO: renamed from: ۗ */
    public final C6885 f34237;

    /* JADX INFO: renamed from: ۙ */
    public final long f34238;

    /* JADX INFO: renamed from: ۬ */
    public final long f34239;

    /* JADX INFO: renamed from: ᩶ */
    public final int f34240;

    /* JADX INFO: renamed from: ᩸ */
    public final long f34241;

    /* JADX INFO: renamed from: ᩹ */
    public final int f34242;

    public C12250(C6885 c6885, int i) {
        ByteBuffer byteBuffer = c6885.f17898;
        this.f34237 = c6885;
        this.f34240 = byteBuffer.getInt(i);
        byteBuffer.getInt(i + 4);
        if (c6885.f17899) {
            byteBuffer.getLong(i + 8);
            byteBuffer.getLong(i + 16);
            this.f34238 = byteBuffer.getLong(i + 24);
            this.f34239 = byteBuffer.getLong(i + 32);
            this.f34242 = byteBuffer.getInt(i + 40);
            byteBuffer.getInt(i + 44);
            byteBuffer.getLong(i + 48);
            this.f34241 = byteBuffer.getLong(i + 56);
            return;
        }
        byteBuffer.getInt(i + 8);
        byteBuffer.getInt(i + 12);
        this.f34238 = ((long) byteBuffer.getInt(i + 16)) & 4294967295L;
        this.f34239 = ((long) byteBuffer.getInt(i + 20)) & 4294967295L;
        this.f34242 = byteBuffer.getInt(i + 24);
        byteBuffer.getInt(i + 28);
        byteBuffer.getInt(i + 32);
        this.f34241 = byteBuffer.getInt(i + 36);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        C8226 c8226 = this.f34237.f17901;
        sb.append(c8226 == null ? null : c8226.m19000(this.f34240));
        sb.append(')');
        return sb.toString();
    }
}
