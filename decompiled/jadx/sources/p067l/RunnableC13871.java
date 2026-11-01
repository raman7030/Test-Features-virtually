package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13871 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f39185;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f39186;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f39187;

    public /* synthetic */ RunnableC13871(int i, Object obj, Object obj2) {
        this.f39186 = i;
        this.f39187 = obj;
        this.f39185 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l.᩸ۛ֫] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39186) {
            case 0:
                InterfaceC22097 interfaceC22097 = (InterfaceC22097) this.f39187;
                AbstractC17043 abstractC17043 = (AbstractC17043) this.f39185;
                try {
                    if (C18743.exists(interfaceC22097, new EnumC16060[0])) {
                        C24913.m54705(interfaceC22097);
                    }
                    abstractC17043.mo25503();
                    return;
                } catch (IOException e) {
                    throw new C15154(e);
                }
            default:
                C16658 c16658 = (C16658) this.f39187;
                this.f39185.mo23100(c16658.f48938, c16658.f48937);
                return;
        }
    }
}
