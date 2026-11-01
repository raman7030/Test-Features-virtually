package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩻ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B0Q */
/* JADX INFO: loaded from: classes.dex */
public final class C25019 extends C22338 {
    /* JADX INFO: renamed from: ᩳ */
    public final int m54933() {
        int iM50153 = m50153(4);
        if (iM50153 != 0) {
            return this.f70516.getInt(iM50153 + this.f70517);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m54929() {
        int iM50153 = m50153(6);
        return (iM50153 == 0 || this.f70516.get(iM50153 + this.f70517) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final short m54932() {
        int iM50153 = m50153(8);
        if (iM50153 != 0) {
            return this.f70516.getShort(iM50153 + this.f70517);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final short m54930() {
        int iM50153 = m50153(12);
        if (iM50153 != 0) {
            return this.f70516.getShort(iM50153 + this.f70517);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final short m54931() {
        int iM50153 = m50153(14);
        if (iM50153 != 0) {
            return this.f70516.getShort(iM50153 + this.f70517);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m54928(int i) {
        int iM50153 = m50153(16);
        if (iM50153 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.f70516;
        int i2 = iM50153 + this.f70517;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54927() {
        int iM50153 = m50153(16);
        if (iM50153 == 0) {
            return 0;
        }
        int i = iM50153 + this.f70517;
        return this.f70516.getInt(this.f70516.getInt(i) + i);
    }
}
