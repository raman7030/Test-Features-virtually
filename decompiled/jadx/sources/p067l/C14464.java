package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14464 implements InterfaceC19221 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9770 f41322;

    public C14464(C9770 c9770) {
        this.f41322 = c9770;
    }

    @Override // p067l.InterfaceC19221
    /* JADX INFO: renamed from: ۧ */
    public final C20066 mo33103(C10678 c10678) {
        C9770 c9770 = this.f41322;
        try {
            C3798 c3798M28839 = c9770.f26977.m28839(C13598.m30949(c10678.f29566.toString()).mo4705().mo4703());
            if (c3798M28839 != null) {
                try {
                    C15804 c15804 = new C15804(c3798M28839.m7411(0));
                    C20066 c20066M35878 = c15804.m35878(c3798M28839);
                    if (c15804.m35880(c10678, c20066M35878)) {
                        return c20066M35878;
                    }
                    C21407.m48495(c20066M35878.f60968);
                    return null;
                } catch (IOException unused) {
                    C21407.m48495(c3798M28839);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // p067l.InterfaceC19221
    /* JADX INFO: renamed from: ֫ */
    public final void mo33100(C10678 c10678) {
        this.f41322.f26977.m28843(C13598.m30949(c10678.f29566.toString()).mo4705().mo4703());
    }

    @Override // p067l.InterfaceC19221
    /* JADX INFO: renamed from: ֫ */
    public final void mo33099() {
        synchronized (this.f41322) {
        }
    }

    @Override // p067l.InterfaceC19221
    /* JADX INFO: renamed from: ֫ */
    public final void mo33101(C12019 c12019) {
        synchronized (this.f41322) {
        }
    }

    @Override // p067l.InterfaceC19221
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14700 mo33098(C20066 c20066) {
        C15370 c15370M28835;
        C9770 c9770 = this.f41322;
        C12516 c12516 = c9770.f26977;
        C10678 c10678 = c20066.f60966;
        String str = c10678.f29569;
        C13535 c13535 = c10678.f29566;
        try {
            if (!C5595.m12398(str)) {
                if (str.equals("GET")) {
                    int i = C3127.f5696;
                    if (!C3127.m5331(c20066.f60965).contains("*")) {
                        C15804 c15804 = new C15804(c20066);
                        try {
                            c15370M28835 = c12516.m28835(C13598.m30949(c13535.toString()).mo4705().mo4703());
                            if (c15370M28835 != null) {
                                try {
                                    c15804.m35879(c15370M28835);
                                    return new C8429(c9770, c15370M28835);
                                } catch (IOException unused) {
                                    if (c15370M28835 != null) {
                                        c15370M28835.m35033();
                                    }
                                    return null;
                                }
                            }
                        } catch (IOException unused2) {
                            c15370M28835 = null;
                        }
                    }
                }
                return null;
            }
            c12516.m28843(C13598.m30949(c13535.toString()).mo4705().mo4703());
            return null;
        } catch (IOException unused3) {
        }
    }

    @Override // p067l.InterfaceC19221
    /* JADX INFO: renamed from: ֫ */
    public final void mo33102(C20066 c20066, C20066 c20067) {
        C15370 c15370M7412;
        C15804 c15804 = new C15804(c20067);
        try {
            c15370M7412 = ((C24522) c20066.f60968).f77671.m7412();
            if (c15370M7412 != null) {
                try {
                    c15804.m35879(c15370M7412);
                    c15370M7412.m35034();
                } catch (IOException unused) {
                    if (c15370M7412 != null) {
                        try {
                            c15370M7412.m35033();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (IOException unused3) {
            c15370M7412 = null;
        }
    }
}
