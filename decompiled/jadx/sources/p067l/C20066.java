package p067l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ᩴ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O5QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20066 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final C14875 f60958;

    /* JADX INFO: renamed from: ۙ */
    public final int f60959;

    /* JADX INFO: renamed from: ۛ */
    public final C20066 f60960;

    /* JADX INFO: renamed from: ۟ */
    public final long f60961;

    /* JADX INFO: renamed from: ۤ */
    public final C20066 f60962;

    /* JADX INFO: renamed from: ۨ */
    public final EnumC16041 f60963;

    /* JADX INFO: renamed from: ۫ */
    public final String f60964;

    /* JADX INFO: renamed from: ۬ */
    public final C12194 f60965;

    /* JADX INFO: renamed from: ܰ */
    public final C10678 f60966;

    /* JADX INFO: renamed from: ᩶ */
    public final C20066 f60967;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC2630 f60968;

    /* JADX INFO: renamed from: ᩹ */
    public volatile C12865 f60969;

    /* JADX INFO: renamed from: ᩺ */
    public final long f60970;

    public C20066(C5984 c5984) {
        this.f60966 = c5984.f14801;
        this.f60963 = c5984.f14809;
        this.f60959 = c5984.f14806;
        this.f60964 = c5984.f14804;
        this.f60958 = c5984.f14808;
        C14205 c14205 = c5984.f14807;
        c14205.getClass();
        this.f60965 = new C12194(c14205);
        this.f60968 = c5984.f14799;
        this.f60962 = c5984.f14810;
        this.f60967 = c5984.f14803;
        this.f60960 = c5984.f14800;
        this.f60961 = c5984.f14805;
        this.f60970 = c5984.f14802;
    }

    /* JADX INFO: renamed from: ֡ */
    public final C10678 m45434() {
        return this.f60966;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m45443() {
        return this.f60959;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m45439() {
        int i = this.f60959;
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m45437() {
        return this.f60964;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C14875 m45440() {
        return this.f60958;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m45435(String str) {
        String strM28162 = this.f60965.m28162(str);
        if (strM28162 != null) {
            return strM28162;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C12194 m45446() {
        return this.f60965;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2630 m45436() {
        return this.f60968;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C5984 m45438() {
        C5984 c5984 = new C5984();
        c5984.f14801 = this.f60966;
        c5984.f14809 = this.f60963;
        c5984.f14806 = this.f60959;
        c5984.f14804 = this.f60964;
        c5984.f14808 = this.f60958;
        c5984.f14807 = this.f60965.m28163();
        c5984.f14799 = this.f60968;
        c5984.f14810 = this.f60962;
        c5984.f14803 = this.f60967;
        c5984.f14800 = this.f60960;
        c5984.f14805 = this.f60961;
        c5984.f14802 = this.f60970;
        return c5984;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C20066 m45444() {
        return this.f60960;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C12865 m45442() {
        C12865 c12865 = this.f60969;
        if (c12865 != null) {
            return c12865;
        }
        C12865 c12865M29484 = C12865.m29484(this.f60965);
        this.f60969 = c12865M29484;
        return c12865M29484;
    }

    /* JADX INFO: renamed from: ܶ */
    public final long m45441() {
        return this.f60961;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final long m45445() {
        return this.f60970;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC2630 abstractC2630 = this.f60968;
        if (abstractC2630 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC2630.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f60963 + ", code=" + this.f60959 + ", message=" + this.f60964 + ", url=" + this.f60966.f29566 + '}';
    }
}
