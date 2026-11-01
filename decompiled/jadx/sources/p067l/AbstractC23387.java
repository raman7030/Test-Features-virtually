package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4Q2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23387 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24728 f74519;

    /* JADX INFO: renamed from: ۜ */
    public final C17351 f74520;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21376 f74521;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC9305 f74522;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC13999 f74523;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC15339 f74524;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC11988 f74525;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC13053 f74526;

    public AbstractC23387(C17351 c17351, InterfaceC9305 interfaceC9305, C16069 c16069, C6032 c6032, C5361 c5361, C8043 c8043, C16759 c16759, InterfaceC24728 interfaceC24728) {
        this.f74520 = c17351;
        this.f74522 = interfaceC9305;
        this.f74526 = c16069;
        this.f74521 = c6032;
        this.f74525 = c5361;
        this.f74524 = c8043;
        this.f74523 = c16759;
        this.f74519 = interfaceC24728;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52055(C24787 c24787, Set set) {
        C17351 c17351 = this.f74520;
        c17351.m39348(29, 0);
        C17351.m39338(c17351, ((C16069) this.f74526).mo10638(c24787));
        C17351.m39338(c17351, set.size());
        AbstractC6767 abstractC6767ListIterator = AbstractC16192.m36880(AbstractC12093.m27884(AbstractC16181.f47633), set).listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            InterfaceC11180 interfaceC11180 = (InterfaceC11180) abstractC6767ListIterator.next();
            InterfaceC9305 interfaceC9305 = this.f74522;
            InterfaceC24728 interfaceC24728 = this.f74519;
            C17351.m39338(c17351, interfaceC9305.mo10638(interfaceC24728.mo54396(interfaceC11180)));
            C3270 c3270 = (C3270) this;
            c3270.f6351.mo46908(c3270, interfaceC24728.mo54393(interfaceC11180));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52048(List list) {
        C17351 c17351 = this.f74520;
        c17351.m39348(28, 0);
        C17351.m39338(c17351, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3270 c3270 = (C3270) this;
            c3270.f6351.mo46908(c3270, it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52056(boolean z) {
        this.f74520.m39348(31, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52042(byte b) {
        this.f74520.m39343(0, b);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52043(char c) {
        this.f74520.m39346(3, c);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52044(double d) {
        this.f74520.m39340(d);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52052(C20114 c20114) {
        this.f74520.m39346(27, ((C6032) this.f74521).mo10638(c20114));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52058(C20114 c20114) {
        this.f74520.m39346(25, ((C6032) this.f74521).mo10638(c20114));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52045(float f) {
        this.f74520.m39341(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52046(int i) {
        this.f74520.m39343(4, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52047(long j) {
        this.f74520.m39347(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52050(C14078 c14078) {
        this.f74520.m39346(26, ((C5361) this.f74525).mo10638(c14078));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52041() {
        this.f74520.write(30);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52057(int i) {
        this.f74520.m39343(2, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52049(C9384 c9384) {
        this.f74520.m39346(23, this.f74522.mo10638(c9384));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52054(C24787 c24787) {
        this.f74520.m39346(24, ((C16069) this.f74526).mo10638(c24787));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52051(C14748 c14748) {
        this.f74520.m39346(21, ((C8043) this.f74524).mo10638(c14748));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52053(C22796 c22796) {
        this.f74520.m39346(22, ((C16759) this.f74523).mo10638(c22796));
    }
}
