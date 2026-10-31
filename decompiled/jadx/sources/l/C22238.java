package l;

/* JADX INFO: renamed from: l.᩹ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22238 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC2113 f72170;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f72171;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4025.m12116(!m49946());
        return this.f72170.compareTo(((C22238) obj).f72170);
    }

    public C22238(AbstractC14545 abstractC14545, EnumC2113 enumC2113) {
        this.f72171 = abstractC14545;
        this.f72170 = enumC2113;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m49946() {
        return this.f72171.isEmpty() || this.f72170 == null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC2113 m49945() {
        return this.f72170;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m49941() {
        return this.f72171;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m49942() {
        return ((C21265) ((InterfaceC21438) this.f72171.get(0)).mo48557()).getPosition();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m49944() {
        return ((InterfaceC21438) this.f72171.get(0)).mo48558();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49940() {
        AbstractC14545 abstractC14545 = this.f72171;
        return ((C21265) ((InterfaceC21438) C8882.m22955(abstractC14545)).mo48557()).getText().length() + ((C21265) ((InterfaceC21438) C8882.m22955(abstractC14545)).mo48557()).getPosition();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m49943() {
        return ((InterfaceC21438) C8882.m22955(this.f72171)).mo48559();
    }
}
