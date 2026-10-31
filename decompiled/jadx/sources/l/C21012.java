package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩷ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S3IR */
/* JADX INFO: loaded from: classes4.dex */
public class C21012 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f67831;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67832;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67833;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f67834;

    public C21012() {
        C9723.m24715();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47823(int i) {
        if (i < this.f67833) {
            return this.f67831.getShort(this.f67834 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47824(ByteBuffer byteBuffer, int i) {
        this.f67831 = byteBuffer;
        if (byteBuffer != null) {
            this.f67832 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f67834 = i2;
            this.f67833 = this.f67831.getShort(i2);
            return;
        }
        this.f67832 = 0;
        this.f67834 = 0;
        this.f67833 = 0;
    }
}
