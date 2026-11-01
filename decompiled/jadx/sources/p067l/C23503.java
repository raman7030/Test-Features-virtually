package p067l;

/* JADX INFO: renamed from: l.᩹ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23503 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC4377 f74895;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC16192 f74896;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6194.m14036(!m52274());
        return this.f74895.compareTo(((C23503) obj).f74895);
    }

    public C23503(AbstractC16192 abstractC16192, EnumC4377 enumC4377) {
        this.f74896 = abstractC16192;
        this.f74895 = enumC4377;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m52274() {
        return this.f74896.isEmpty() || this.f74895 == null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC4377 m52273() {
        return this.f74895;
    }

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC16192 m52269() {
        return this.f74896;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m52270() {
        return ((C22578) ((InterfaceC22743) this.f74896.get(0)).mo50894()).getPosition();
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC16192 m52272() {
        return ((InterfaceC22743) this.f74896.get(0)).mo50895();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52268() {
        AbstractC16192 abstractC16192 = this.f74896;
        return ((C22578) ((InterfaceC22743) C10810.m24926(abstractC16192)).mo50894()).getText().length() + ((C22578) ((InterfaceC22743) C10810.m24926(abstractC16192)).mo50894()).getPosition();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 m52271() {
        return ((InterfaceC22743) C10810.m24926(this.f74896)).mo50896();
    }
}
