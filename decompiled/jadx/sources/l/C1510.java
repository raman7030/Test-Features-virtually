package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 465J */
/* JADX INFO: loaded from: classes3.dex */
public final class C1510 extends AbstractC12418 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f5361;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f5362;

    public C1510(C12918 c12918, C18729 c18729, int i) {
        this.f5361 = c12918;
        this.f5362 = c18729.m43380(i + 1);
    }

    @Override // l.InterfaceC17507
    public final String getValue() {
        return this.f5361.m31422(this.f5362);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5192() {
        return this.f5362;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5194(C22706 c22706) {
        this.f5361.m31385(this.f5362, c22706, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5193(C3438 c3438) throws IOException {
        c3438.write(34);
        this.f5361.m31406(this.f5362, c3438, true);
        c3438.write(34);
    }
}
