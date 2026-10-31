package l;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: l.ۢۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 098W */
/* JADX INFO: loaded from: classes.dex */
public class C9327 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f28292;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f28293;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f28294;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f28295;

    static {
        ApplicationC12518.m30701(85);
    }

    public native C9327(boolean z);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private native void m24004();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24005(int i) {
        if (this.f28294) {
            return;
        }
        int i2 = this.f28295;
        int i3 = i2 + 1;
        this.f28295 = i3;
        byte[] bArr = this.f28293;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m24004();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24007(int i) {
        m24005((byte) (i & 255));
        m24005((byte) ((i >>> 8) & 255));
        m24005((byte) ((i >>> 16) & 255));
        m24005((byte) ((i >>> 24) & 255));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24008(int i) {
        m24005((byte) ((i >>> 24) & 255));
        m24005((byte) ((i >>> 16) & 255));
        m24005((byte) ((i >>> 8) & 255));
        m24005((byte) (i & 255));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m24006() {
        if (this.f28294) {
            throw new RuntimeException();
        }
        m24004();
        return this.f28292.toByteArray();
    }
}
