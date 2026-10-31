package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22118 implements InterfaceC6403 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f71813;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2609 f71814;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0052 f71815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2609 f71816;

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    public C22118(C20002 c20002, C0052 c0052, C2609 c2609, C2609 c26010) {
        this.f71813 = c20002;
        this.f71815 = c0052;
        this.f71814 = c2609;
        this.f71816 = c26010;
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C20002 c20002;
        C18837 c18837 = new C18837();
        C0052 c0052 = this.f71815;
        c18837.addAll(c0052.f920);
        C18837 c18838 = new C18837();
        Iterator it = this.f71814.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c20002 = this.f71813;
            if (!zHasNext) {
                break;
            }
            C16112 c16112 = new C16112(c20002.f64770.m47260(c0052, ((C19297) it.next()).f60701));
            c18838.m43511(c16112);
            c18837.m43511(c16112);
        }
        c0052.f917 = c18838.m43517();
        C18837 c18839 = new C18837();
        for (C18591 c18591 : this.f71816) {
            C18837 c188310 = new C18837();
            Iterator it2 = c18591.f57668.iterator();
            while (it2.hasNext()) {
                c188310.m43511(c20002.f64770.m47260(c0052, (AbstractC10370) it2.next()));
            }
            C21053 c21053 = new C21053(c20002.f64770.m47260(c0052, c18591.f57669), c188310.m43517());
            c18839.m43511(c21053);
            c18837.m43511(c21053);
        }
        c0052.f925 = c18839.m43517();
        c0052.f920 = c18837.m43517();
    }
}
