package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۫ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12152 implements InterfaceC7213 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f36258 = new HashMap();

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫ */
    public final void mo16278(C20515 c20515) {
    }

    public C12152(C2002 c2002) {
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫ */
    public final void mo16275() {
        C19846.forEach(this.f36258.values(), new C4391());
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫ */
    public final void mo16277(C14163 c14163, InterfaceC6403 interfaceC6403) {
        this.f36258.put(c14163, new C13562(c14163, new C12857(this, interfaceC6403)));
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫ */
    public final void mo16276(C14163 c14163) {
        this.f36258.remove(c14163);
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ۧ */
    public final void mo16279() {
        C19846.forEach(this.f36258.values(), new C2980());
    }
}
