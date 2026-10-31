package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩻ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B0Q */
/* JADX INFO: loaded from: classes.dex */
public final class C23833 extends C21012 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52524() {
        int iM47823 = m47823(4);
        if (iM47823 != 0) {
            return this.f67831.getInt(iM47823 + this.f67832);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52520() {
        int iM47823 = m47823(6);
        return (iM47823 == 0 || this.f67831.get(iM47823 + this.f67832) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short m52523() {
        int iM47823 = m47823(8);
        if (iM47823 != 0) {
            return this.f67831.getShort(iM47823 + this.f67832);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final short m52521() {
        int iM47823 = m47823(12);
        if (iM47823 != 0) {
            return this.f67831.getShort(iM47823 + this.f67832);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short m52522() {
        int iM47823 = m47823(14);
        if (iM47823 != 0) {
            return this.f67831.getShort(iM47823 + this.f67832);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52519(int i) {
        int iM47823 = m47823(16);
        if (iM47823 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.f67831;
        int i2 = iM47823 + this.f67832;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52518() {
        int iM47823 = m47823(16);
        if (iM47823 == 0) {
            return 0;
        }
        int i = iM47823 + this.f67832;
        return this.f67831.getInt(this.f67831.getInt(i) + i);
    }
}
