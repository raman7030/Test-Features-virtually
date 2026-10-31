package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M89X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3605 extends IOException {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11428 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC23485 f11429;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11430;

    public C3605(int i) {
        this.f11430 = i;
        this.f11429 = EnumC23485.m51935(i);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format("Fault: %s (0x%08X)", this.f11429, Integer.valueOf(this.f11430));
    }
}
