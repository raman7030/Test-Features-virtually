package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N43O */
/* JADX INFO: loaded from: classes4.dex */
public final class C17647 extends C4908 {

    /* JADX INFO: renamed from: ܽ */
    public final ConcurrentMapC12768 f52716 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f52715 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩳ */
    public final ConcurrentMapC12768 f52717 = new ConcurrentMapC12768();

    @Override // p067l.C4908
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22097 mo10413(InterfaceC22097 interfaceC22097) {
        return (InterfaceC22097) C19473.computeIfAbsent(this.f52716, interfaceC22097, new C21659(1, this));
    }

    @Override // p067l.C4908
    /* JADX INFO: renamed from: ܽ */
    public final List mo10414(InterfaceC22097 interfaceC22097) {
        List listMo10414;
        synchronized (this.f52717) {
            listMo10414 = (List) this.f52717.get(interfaceC22097);
            if (listMo10414 == null) {
                listMo10414 = super.mo10414(interfaceC22097);
                this.f52717.put(interfaceC22097, listMo10414);
            }
        }
        return listMo10414;
    }

    @Override // p067l.C4908
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10412(InterfaceC22097 interfaceC22097) {
        return ((C18189) C19473.computeIfAbsent(this.f52715, interfaceC22097, new C10943(0, this))).isPresent();
    }

    @Override // p067l.C4908
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo10415(InterfaceC22097 interfaceC22097) {
        return ((Boolean) ((C18189) C19473.computeIfAbsent(this.f52715, interfaceC22097, new C10943(0, this))).map(new C20002(9)).orElse(Boolean.FALSE)).booleanValue();
    }
}
