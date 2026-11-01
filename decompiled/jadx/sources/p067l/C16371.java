package p067l;

/* JADX INFO: renamed from: l.ܳ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16371 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC19054 f48110;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC19054 f48111;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16371)) {
            return false;
        }
        C16371 c16371 = (C16371) obj;
        return this.f48111.equals(c16371.f48111) && this.f48110.equals(c16371.f48110);
    }

    public final int hashCode() {
        return this.f48110.hashCode() + (this.f48111.hashCode() * 31);
    }

    public C16371(AbstractC19054 abstractC19054, String str) {
        this.f48111 = abstractC19054;
        this.f48110 = abstractC19054.mo29840(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37187() {
        return this.f48111.mo29841() == EnumC19725.METHOD;
    }

    public final String toString() {
        return this.f48111.toString() + " -> " + this.f48110.f56854;
    }
}
