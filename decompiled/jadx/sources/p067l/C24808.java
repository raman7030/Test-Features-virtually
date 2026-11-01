package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩻ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes.dex */
public final class C24808 {
    /* JADX INFO: renamed from: ֫ */
    public final InputStream m54505() throws IOException {
        C11349 c11349 = new C11349();
        c11349.m26292(C25165.m55227());
        C20066 c20066Execute = C7050.m16220().m42716(c11349.m26284()).execute();
        if (!c20066Execute.m45439()) {
            int iM45443 = c20066Execute.m45443();
            c20066Execute.close();
            throw new IOException(C20778.m46922(iM45443, "Boot hierarchy download failed with HTTP "));
        }
        AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
        if (abstractC2630M45436 != null) {
            return new C16090(abstractC2630M45436.m4011(), c20066Execute);
        }
        c20066Execute.close();
        throw new IOException("Boot hierarchy download body is null");
    }
}
