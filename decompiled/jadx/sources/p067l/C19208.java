package p067l;

/* JADX INFO: renamed from: l.ᩳ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19208 implements InterfaceC11235 {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC14355 f57397 = null;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18537 f57398;

    public C19208(C18537 c18537) {
        this.f57398 = c18537;
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26029(C19281 c19281) {
        this.f57397 = this.f57398.m42187(c19281.f29256.mo5577(), c19281.f57613);
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26025(C12576 c12576) {
        AbstractC6462 abstractC6462 = c12576.f35337;
        C18537 c18537 = this.f57398;
        C8320 c8320M42154 = c18537.m42154(c18537.m42208(abstractC6462), new C13818(25L, c18537.f55350.f21752, abstractC6462, abstractC6462.f16705));
        c8320M42154.f18925 = c18537.f55354.f69196;
        this.f57397 = c8320M42154;
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26028(C18610 c18610) {
        this.f57397 = this.f57398.m42197(c18610.f55580);
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26026(C15927 c15927) {
        boolean z = c15927 instanceof C21964;
        C18537 c18537 = this.f57398;
        if (z) {
            C13956 c13956 = ((C21964) c15927).f69020;
            C8320 c8320M42154 = c18537.m42154(c18537.m42208(c13956), new C13818(25L, c18537.f55350.f21752, c13956, c13956.f16705));
            c8320M42154.f18925 = c18537.f55354.f69196;
            this.f57397 = c8320M42154;
            return;
        }
        this.f57397 = c18537.m42191();
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26027(C17939 c17939) {
        if (c17939 instanceof C8552) {
            this.f57397 = m43742((C8552) c17939);
        } else {
            this.f57397 = m43743(c17939);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19049 m43743(C17939 c17939) {
        C20271 c20271 = new C20271();
        C4848 c4848 = c17939.f53589;
        while (true) {
            boolean zM10293 = c4848.m10293();
            C18537 c18537 = this.f57398;
            if (zM10293) {
                C24293 c24293 = (C24293) c4848.f11034;
                ((AbstractC10564) c24293.f76953).mo7611(this);
                AbstractC14355 abstractC14355 = this.f57397;
                C22403 c22403M42184 = c18537.m42184((AbstractC14355) c18537.m42157((AbstractC7783) c24293.f76952), abstractC14355);
                c22403M42184.f18925 = abstractC14355.f18925;
                c20271.m45777(c22403M42184);
                c4848 = c4848.f11035;
            } else {
                return c18537.m42175((AbstractC7257) c18537.m42208(c17939.f29256), c20271.m45783());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19049 m43742(C8552 c8552) {
        C20271 c20271 = new C20271();
        C4848 c4848 = c8552.f53589;
        while (true) {
            boolean zM10293 = c4848.m10293();
            C18537 c18537 = this.f57398;
            if (zM10293) {
                C24293 c24293 = (C24293) c4848.f11034;
                ((AbstractC10564) c24293.f76953).mo7611(this);
                AbstractC14355 abstractC14355 = this.f57397;
                C22403 c22403M42184 = c18537.m42184((AbstractC14355) c18537.m42157((AbstractC7783) c24293.f76952), abstractC14355);
                c22403M42184.f18925 = abstractC14355.f18925;
                c20271.m45777(c22403M42184);
                c4848 = c4848.f11035;
            } else {
                return c18537.m42209((AbstractC7257) c18537.m42208(c8552.f29256), c20271.m45783());
            }
        }
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26024(C3858 c3858) {
        C20271 c20271 = new C20271();
        int i = 0;
        while (true) {
            AbstractC10564[] abstractC10564Arr = c3858.f8345;
            if (i >= abstractC10564Arr.length) {
                C19859 c19859M42201 = this.f57398.m42201(null, C4848.m10283(), c20271.m45783());
                c19859M42201.f18925 = c3858.f29256;
                this.f57397 = c19859M42201;
                return;
            }
            abstractC10564Arr[i].mo7611(this);
            c20271.m45777(this.f57397);
            i++;
        }
    }
}
