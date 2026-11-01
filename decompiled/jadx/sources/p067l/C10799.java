package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4ZK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10799 {

    /* JADX INFO: renamed from: ֫ */
    public C17503 f29932;

    /* JADX INFO: renamed from: ۧ */
    public final C3422 f29933;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f29934 = new HashMap();

    public C10799(int i) {
        C3422 c3422 = new C3422(i);
        this.f29933 = c3422;
        this.f29932 = (C17503) c3422.f6815.get(0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C3422 m24890() {
        return this.f29933;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24882(String str) {
        HashMap map = this.f29934;
        C18845 c18845 = (C18845) map.get(str);
        if (c18845 != null) {
            if (c18845.m44349()) {
                throw new IllegalArgumentException("There is already a label with that name.");
            }
            ((C8787) this.f29932.m39880()).add(c18845);
        } else {
            C17503 c17503 = this.f29932;
            c17503.getClass();
            C18845 c18846 = new C18845();
            ((C8787) c17503.m39880()).add(c18846);
            map.put(str, c18846);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18845 m24887(String str) {
        HashMap map = this.f29934;
        C18845 c18845 = (C18845) map.get(str);
        if (c18845 != null) {
            return c18845;
        }
        C18845 c18846 = new C18845();
        map.put(str, c18846);
        return c18846;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24886(C24787 c24787, C18845 c18845, C18845 c18846, C18845 c18847) {
        this.f29933.m6067(c24787, c18845, c18846, c18847);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24885(C18845 c18845, C18845 c18846, C18845 c18847) {
        this.f29933.m6066(c18845, c18846, c18847);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24889(int i) {
        ((C8787) this.f29932.m39877()).add(new C23539(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24881(int i, C9384 c9384, C24787 c24787, C9384 c9385) {
        ((C8787) this.f29932.m39877()).add(new C14821(i, c9384, c24787, c9385));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24880(int i) {
        ((C8787) this.f29932.m39877()).add(new C16832(i));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24891(int i) {
        ((C8787) this.f29932.m39877()).add(new C6775(i));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24888() {
        ((C8787) this.f29932.m39877()).add(new C21528());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24879() {
        ((C8787) this.f29932.m39877()).add(new C22869());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24883(C9384 c9384) {
        ((C8787) this.f29932.m39877()).add(new C5434(c9384));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24884(AbstractC9476 abstractC9476) {
        C3422 c3422 = this.f29933;
        c3422.m6065(abstractC9476);
        this.f29932 = (C17503) C20013.m45383(c3422.f6815, 1);
    }
}
