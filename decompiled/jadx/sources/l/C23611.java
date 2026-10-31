package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩻ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes.dex */
public final class C23611 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m52102() throws IOException {
        C9449 c9449 = new C9449();
        c9449.m24282(C23986.m52821());
        C18621 c18621Execute = C4925.m14323().m40469(c9449.m24274()).execute();
        if (!c18621Execute.m43173()) {
            int iM43177 = c18621Execute.m43177();
            c18621Execute.close();
            throw new IOException(C19370.m44628(iM43177, "Boot hierarchy download failed with HTTP "));
        }
        AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
        if (abstractC0275M43170 != null) {
            return new C14438(abstractC0275M43170.m1611(), c18621Execute);
        }
        c18621Execute.close();
        throw new IOException("Boot hierarchy download body is null");
    }
}
