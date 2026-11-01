package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.۠ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T3ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10312 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f28567;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f28568;

    /* JADX INFO: renamed from: ܽ */
    public final Set f28569;

    public C10312(boolean z, boolean z2, Set set, C3606 c3606) {
        this.f28568 = z;
        this.f28567 = z2;
        this.f28569 = set;
        EnumC12477.f34980.m28726(c3606.f7410);
    }

    public final String toString() {
        return String.format("[errorRaised=%b, rootElements=%s, processingOver=%b]", Boolean.valueOf(this.f28567), this.f28569, Boolean.valueOf(this.f28568));
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m23932() {
        return this.f28569;
    }
}
