package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5802 implements InterfaceC7213 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f17841 = new HashMap();

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16275() {
    }

    public C5802(C2002 c2002) {
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16278(C20515 c20515) {
        throw c20515;
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16277(C14163 c14163, InterfaceC6403 interfaceC6403) {
        this.f17841.put(c14163, new C13562(c14163, new C22735(interfaceC6403)));
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16276(C14163 c14163) {
        this.f17841.remove(c14163);
    }

    @Override // l.InterfaceC7213
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo16279() {
        HashMap map = this.f17841;
        C19846.forEach(map.values(), new C10036());
        map.clear();
    }
}
