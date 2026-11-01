package p067l;

/* JADX INFO: renamed from: l.ۛ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7990 extends AbstractC24083 {

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC16192 f21006;

    public C7990(Iterable iterable) {
        this.f21006 = AbstractC16192.m36879(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC24083
    /* JADX INFO: renamed from: ֫ */
    public final C18189 mo18500() {
        AbstractC6767 abstractC6767ListIterator = this.f21006.listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            if (((Boolean) ((C9331) abstractC6767ListIterator.next()).f25406.orElse(Boolean.FALSE)).booleanValue()) {
                return C18189.m41402of(Boolean.TRUE);
            }
        }
        return C18189.empty();
    }

    @Override // p067l.AbstractC24083
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC24083 mo18501(AbstractC24083 abstractC24083) {
        if (!(abstractC24083 instanceof C7990)) {
            return abstractC24083;
        }
        return new C7990(C10810.m24919(this.f21006, ((C7990) abstractC24083).f21006));
    }
}
