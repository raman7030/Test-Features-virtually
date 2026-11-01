package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M89X */
/* JADX INFO: loaded from: classes2.dex */
public final class C5794 extends IOException {

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f14232 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC24688 f14233;

    /* JADX INFO: renamed from: ᩹ */
    public final int f14234;

    public C5794(int i) {
        this.f14234 = i;
        this.f14233 = EnumC24688.m54337(i);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format("Fault: %s (0x%08X)", this.f14233, Integer.valueOf(this.f14234));
    }
}
