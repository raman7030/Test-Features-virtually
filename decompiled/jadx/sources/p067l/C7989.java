package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7989 implements InterfaceC24317 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ HashMap f21003;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9330 f21004;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ IOException[] f21005;

    public C7989(C9330 c9330, HashMap map, IOException[] iOExceptionArr) {
        this.f21004 = c9330;
        this.f21003 = map;
        this.f21005 = iOExceptionArr;
    }

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final void mo10593(InterfaceC19370 interfaceC19370, InputStream inputStream) throws IOException {
        C7475 c7475 = (C7475) this.f21003.get(interfaceC19370);
        C12826.requireNonNull(c7475);
        C9330 c9330 = this.f21004;
        if (inputStream == null) {
            c9330.f25399.m50045();
            return;
        }
        try {
            c9330.m21638(c7475);
            if (!c9330.m21635(c7475, interfaceC19370)) {
                if (!((C12447) c9330.f25395).f34795.mo3924()) {
                    c9330.m21630(inputStream, interfaceC19370.getSize(), true);
                    if (!((C12447) c9330.f25395).f34795.mo3924()) {
                        c9330.f25399.m50038(c7475.m6154());
                    }
                }
                inputStream.close();
                return;
            }
            AbstractC17043 abstractC17043M6133 = c7475.m6133();
            abstractC17043M6133.m38652(inputStream, interfaceC19370.getSize(), new C12013(this));
            if (((C12447) c9330.f25395).f34795.mo3924()) {
                abstractC17043M6133.mo29990();
                inputStream.close();
                return;
            }
            if (c7475.m6145() != null) {
                C19056 c19056 = new C19056();
                c19056.m43294(c7475.m6145());
                c19056.m43298(abstractC17043M6133);
            }
            c9330.f25403.m4280(c7475.m6139(), abstractC17043M6133.getName());
            c9330.f25399.m50038(c7475.m6154());
            C16114.m36688(c7475.m6141(), true);
            if (c7475.m6134() != null) {
                c9330.f25400.add((String) c7475.m6134());
            }
            if (c9330.f25396 && c7475.m6128() > 0 && abstractC17043M6133.mo29973()) {
                c9330.f25402.m35004(abstractC17043M6133, c7475.m6128());
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10594(IOException iOException) {
        this.f21005[0] = iOException;
        return false;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return ((C12447) this.f21004.f25395).mo3924();
    }
}
