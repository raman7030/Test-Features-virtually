package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۗۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5361 extends C18416 implements InterfaceC11988 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f12642;

    /* JADX INFO: renamed from: ֫ */
    public final C24787 m11616(InterfaceC7568 interfaceC7568) {
        return ((C14078) interfaceC7568).f39888;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C14078 m11617(Object obj) {
        return ((C3349) obj).f6545;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9384 m11618(InterfaceC7568 interfaceC7568) {
        return ((C14078) interfaceC7568).f39887;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ܳ */
    public final int mo10638(Object obj) {
        return ((C14078) obj).f39889;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14748 m11619(InterfaceC7568 interfaceC7568) {
        return ((C14078) interfaceC7568).f39886;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C14748 m11621(Object obj) {
        return ((C3349) obj).f6545.f39886;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m11622(Object obj) {
        return ((C3349) obj).f6545.f39889;
    }

    public C5361(C20765 c20765) {
        super(c20765);
        this.f12642 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C14078 m11620(InterfaceC7568 interfaceC7568) {
        String string = interfaceC7568.toString();
        ConcurrentMapC12768 concurrentMapC12768 = this.f12642;
        C14078 c14078 = (C14078) concurrentMapC12768.get(string);
        if (c14078 != null) {
            return c14078;
        }
        C20765 c20765 = this.f55000;
        C24787 c24787M36581 = c20765.f71655.m36581(interfaceC7568.mo5853());
        C9384 c9384M35146 = ((C15418) c20765.f71646).m35146(interfaceC7568.getName());
        C8043 c8043 = c20765.f71626;
        c8043.getClass();
        C14078 c14079 = new C14078(c24787M36581, c9384M35146, c8043.m18660(new C5596(interfaceC7568.mo5855(), interfaceC7568.mo5852())));
        C14078 c140710 = (C14078) concurrentMapC12768.putIfAbsent(string, c14079);
        return c140710 == null ? c14079 : c140710;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C21455(this.f12642.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f12642.size();
    }
}
