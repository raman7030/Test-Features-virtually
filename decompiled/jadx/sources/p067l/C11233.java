package p067l;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: l.ۢۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 098W */
/* JADX INFO: loaded from: classes.dex */
public class C11233 {

    /* JADX INFO: renamed from: ֫ */
    public final ByteArrayOutputStream f31242;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f31243;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f31244;

    /* JADX INFO: renamed from: ᩳ */
    public int f31245;

    static {
        ApplicationC14266.m56479(85);
    }

    public native C11233(boolean z);

    /* JADX INFO: renamed from: ۧ */
    private native void m26013();

    /* JADX INFO: renamed from: ֫ */
    public final void m26014(int i) {
        if (this.f31244) {
            return;
        }
        int i2 = this.f31245;
        int i3 = i2 + 1;
        this.f31245 = i3;
        byte[] bArr = this.f31243;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m26013();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26016(int i) {
        m26014((byte) (i & 255));
        m26014((byte) ((i >>> 8) & 255));
        m26014((byte) ((i >>> 16) & 255));
        m26014((byte) ((i >>> 24) & 255));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26017(int i) {
        m26014((byte) ((i >>> 24) & 255));
        m26014((byte) ((i >>> 16) & 255));
        m26014((byte) ((i >>> 8) & 255));
        m26014((byte) (i & 255));
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m26015() {
        if (this.f31244) {
            throw new RuntimeException();
        }
        m26013();
        return this.f31242.toByteArray();
    }
}
