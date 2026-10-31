package l;

import java.util.Set;

/* JADX INFO: renamed from: l.۠ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T3ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8358 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f25653;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f25654;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set f25655;

    public C8358(boolean z, boolean z2, Set set, C1302 c1302) {
        this.f25654 = z;
        this.f25653 = z2;
        this.f25655 = set;
        EnumC10637.f32009.m26686(c1302.f4638);
    }

    public final String toString() {
        return String.format("[errorRaised=%b, rootElements=%s, processingOver=%b]", Boolean.valueOf(this.f25653), this.f25655, Boolean.valueOf(this.f25654));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m21962() {
        return this.f25655;
    }
}
