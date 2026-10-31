package l;

import java.util.Date;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18712 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f59162;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UUID f59163;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17196 f59164;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f59165;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC0803 f59166;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f59167;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Date f59168;

    public C18712() {
        throw null;
    }

    public C18712(AbstractC0803 abstractC0803, long j, UUID uuid, boolean z) {
        this.f59166 = abstractC0803;
        this.f59167 = j;
        this.f59163 = uuid;
        this.f59165 = z;
        this.f59168 = new Date();
        String strValueOf = String.valueOf(j);
        InterfaceC16490 interfaceC16490 = C10951.f32985;
        this.f59164 = new C17196(strValueOf);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m43333() {
        return this.f59162;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43335(long j) {
        this.f59162 = j;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17196 m43339() {
        return this.f59164;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m43338() {
        return this.f59167;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10847 m43334(InterfaceC1674 interfaceC1674) {
        C17196 c17196 = this.f59164;
        c17196.getClass();
        return new C10847(new C14373(c17196), interfaceC1674);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UUID m43336() {
        return this.f59163;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Date m43337() {
        return this.f59168;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC0803 m43340() {
        return this.f59166;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m43341() {
        return this.f59165;
    }
}
