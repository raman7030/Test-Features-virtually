package p067l;

import java.util.Date;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20152 {

    /* JADX INFO: renamed from: ֫ */
    public long f62386;

    /* JADX INFO: renamed from: ۧ */
    public final UUID f62387;

    /* JADX INFO: renamed from: ܳ */
    public final C18711 f62388;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f62389;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC3131 f62390;

    /* JADX INFO: renamed from: ᩳ */
    public final long f62391;

    /* JADX INFO: renamed from: ᩻ */
    public final Date f62392;

    public C20152() {
        throw null;
    }

    public C20152(AbstractC3131 abstractC3131, long j, UUID uuid, boolean z) {
        this.f62390 = abstractC3131;
        this.f62391 = j;
        this.f62387 = uuid;
        this.f62389 = z;
        this.f62392 = new Date();
        String strValueOf = String.valueOf(j);
        InterfaceC18040 interfaceC18040 = C12776.f35977;
        this.f62388 = new C18711(strValueOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m45600() {
        return this.f62386;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45602(long j) {
        this.f62386 = j;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C18711 m45606() {
        return this.f62388;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m45605() {
        return this.f62391;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12677 m45601(InterfaceC3959 interfaceC3959) {
        C18711 c18711 = this.f62388;
        c18711.getClass();
        return new C12677(new C16028(c18711), interfaceC3959);
    }

    /* JADX INFO: renamed from: ۧ */
    public final UUID m45603() {
        return this.f62387;
    }

    /* JADX INFO: renamed from: ܳ */
    public final Date m45604() {
        return this.f62392;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC3131 m45607() {
        return this.f62390;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m45608() {
        return this.f62389;
    }
}
