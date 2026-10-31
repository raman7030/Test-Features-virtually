package l;

/* JADX INFO: renamed from: l.᩹ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final class C22092 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f71744;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f71745;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC3042 f71746;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f71747;

    public C22092(C6735 c6735, EnumC3042 enumC3042, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        this.f71747 = c6735;
        this.f71746 = enumC3042;
        this.f71744 = abstractC4308;
        this.f71745 = abstractC4309;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22092)) {
            return false;
        }
        C22092 c22092 = (C22092) obj;
        if (this.f71746 != c22092.f71746) {
            return false;
        }
        C6735 c6735 = this.f71747;
        return c6735.f20923.m17550(this.f71744, c22092.f71744) && c6735.f20923.m17550(this.f71745, c22092.f71745);
    }

    public final int hashCode() {
        int iHashCode = this.f71746.hashCode() * 127;
        C6319 c6319 = this.f71747.f20923;
        c6319.getClass();
        int iM17468 = (C6319.m17468(this.f71744) + iHashCode) * 127;
        c6319.getClass();
        return C6319.m17468(this.f71745) + iM17468;
    }
}
