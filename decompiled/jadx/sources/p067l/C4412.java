package p067l;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: renamed from: l.֫᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public class C4412 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        URL url = (URL) obj;
        c24726.m54386(url == null ? null : url.toExternalForm());
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        String strM42644 = c18691.m42644();
        if (strM42644.equals("null")) {
            return null;
        }
        return new URL(strM42644);
    }
}
