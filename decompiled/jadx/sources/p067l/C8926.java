package p067l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۜܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: QB0L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8926 extends C22338 {
    /* JADX INFO: renamed from: ֫ */
    public static C8926 m20630(ByteBuffer byteBuffer) {
        C8926 c8926 = new C8926();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        c8926.m50154(byteBuffer, byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()));
        return c8926;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m20633() {
        int iM50153 = m50153(4);
        if (iM50153 != 0) {
            return this.f70516.getInt(iM50153 + this.f70517);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20632(C25019 c25019, int i) {
        int iM50153 = m50153(6);
        if (iM50153 != 0) {
            int i2 = iM50153 + this.f70517;
            int i3 = (i * 4) + this.f70516.getInt(i2) + i2 + 4;
            c25019.m50154(this.f70516, this.f70516.getInt(i3) + i3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20631() {
        int iM50153 = m50153(6);
        if (iM50153 == 0) {
            return 0;
        }
        int i = iM50153 + this.f70517;
        return this.f70516.getInt(this.f70516.getInt(i) + i);
    }
}
