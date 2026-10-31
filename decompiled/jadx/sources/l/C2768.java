package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V8BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C2768 implements InterfaceC23094 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8918 f8598;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f8599;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18996 f8600;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException[] f8601;

    public C2768(C18996 c18996, HashMap map, C8918 c8918, IOException[] iOExceptionArr) {
        this.f8600 = c18996;
        this.f8599 = map;
        this.f8598 = c8918;
        this.f8601 = iOExceptionArr;
    }

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8530(InterfaceC17889 interfaceC17889, InputStream inputStream) throws IOException {
        C18996 c18996 = this.f8600;
        c18996.f59873.m47715();
        if (inputStream == null) {
            return;
        }
        C5373 c5373 = (C5373) this.f8599.get(interfaceC17889);
        C11003.requireNonNull(c5373);
        InterfaceC4179 interfaceC4179 = c18996.f59872;
        c18996.f59873.m47714();
        c18996.f59873.getClass();
        interfaceC4179.mo12627(c5373);
        c18996.f59872.getClass();
        c18996.f59872.setProgress(c18996.f59873.m47712());
        C3545 c3545 = new C3545(c5373.m3900());
        c3545.setTime(c5373.m3887());
        C18996.m43833(c3545, c5373);
        C8918 c8918 = this.f8598;
        c8918.m23013(c3545);
        try {
            C14176.m33825(inputStream, c8918.m23007(), interfaceC17889.getSize(), new C16172(this));
            inputStream.close();
            if (c18996.f59872.mo1526()) {
                return;
            }
            c18996.f59873.m47708(c5373.m3913());
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8531(IOException iOException) {
        System.out.println("onError");
        this.f8601[0] = iOException;
        return false;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f8600.f59872.mo1526();
    }
}
