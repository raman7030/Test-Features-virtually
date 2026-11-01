package p067l;

/* JADX INFO: renamed from: l.ۙܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BAP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6884 extends AbstractC8225 {

    /* JADX INFO: renamed from: ᩸ */
    public final C24318 f17897;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "proto";
    }

    public C6884(C24318 c24318) {
        this.f17897 = c24318;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6884) {
            return this.f17897.equals(((C6884) obj).f17897);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17897.hashCode();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        return this.f17897.compareTo(((C6884) abstractC15405).f17897);
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f17897.m53651();
    }

    public final String toString() {
        return "proto{" + this.f17897.m53651() + '}';
    }

    /* JADX INFO: renamed from: ܺ */
    public final C24318 m15778() {
        return this.f17897;
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26311;
    }
}
