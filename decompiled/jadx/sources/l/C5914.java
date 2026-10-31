package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C5914 implements InterfaceC23094 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f18148;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7325 f18149;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException[] f18150;

    public C5914(C7325 c7325, HashMap map, IOException[] iOExceptionArr) {
        this.f18149 = c7325;
        this.f18148 = map;
        this.f18150 = iOExceptionArr;
    }

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫ */
    public final void mo8530(InterfaceC17889 interfaceC17889, InputStream inputStream) throws IOException {
        C5373 c5373 = (C5373) this.f18148.get(interfaceC17889);
        C11003.requireNonNull(c5373);
        C7325 c7325 = this.f18149;
        if (inputStream == null) {
            c7325.f22508.m47715();
            return;
        }
        try {
            c7325.m19670(c5373);
            if (!c7325.m19667(c5373, interfaceC17889)) {
                if (!((C10604) c7325.f22504).f31824.mo1526()) {
                    c7325.m19662(inputStream, interfaceC17889.getSize(), true);
                    if (!((C10604) c7325.f22504).f31824.mo1526()) {
                        c7325.f22508.m47708(c5373.m3913());
                    }
                }
                inputStream.close();
                return;
            }
            AbstractC15440 abstractC15440M3892 = c5373.m3892();
            abstractC15440M3892.m36494(inputStream, interfaceC17889.getSize(), new C10148(this));
            if (((C10604) c7325.f22504).f31824.mo1526()) {
                abstractC15440M3892.mo27929();
                inputStream.close();
                return;
            }
            if (c5373.m3904() != null) {
                C17558 c17558 = new C17558();
                c17558.m41048(c5373.m3904());
                c17558.m41052(abstractC15440M3892);
            }
            c7325.f22512.m1888(c5373.m3898(), abstractC15440M3892.getName());
            c7325.f22508.m47708(c5373.m3913());
            C14463.m34554(c5373.m3900(), true);
            if (c5373.m3893() != null) {
                c7325.f22509.add((String) c5373.m3893());
            }
            if (c7325.f22505 && c5373.m3887() > 0 && abstractC15440M3892.mo27912()) {
                c7325.f22511.m32889(abstractC15440M3892, c5373.m3887());
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

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8531(IOException iOException) {
        this.f18150[0] = iOException;
        return false;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return ((C10604) this.f18149.f22504).mo1526();
    }
}
