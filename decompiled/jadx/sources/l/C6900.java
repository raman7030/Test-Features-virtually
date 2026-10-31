package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۜܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: QB0L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6900 extends C21012 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6900 m18681(ByteBuffer byteBuffer) {
        C6900 c6900 = new C6900();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        c6900.m47824(byteBuffer, byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()));
        return c6900;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18684() {
        int iM47823 = m47823(4);
        if (iM47823 != 0) {
            return this.f67831.getInt(iM47823 + this.f67832);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18683(C23833 c23833, int i) {
        int iM47823 = m47823(6);
        if (iM47823 != 0) {
            int i2 = iM47823 + this.f67832;
            int i3 = (i * 4) + this.f67831.getInt(i2) + i2 + 4;
            c23833.m47824(this.f67831, this.f67831.getInt(i3) + i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18682() {
        int iM47823 = m47823(6);
        if (iM47823 == 0) {
            return 0;
        }
        int i = iM47823 + this.f67832;
        return this.f67831.getInt(this.f67831.getInt(i) + i);
    }
}
