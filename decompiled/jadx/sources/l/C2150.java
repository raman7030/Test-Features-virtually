package l;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: renamed from: l.֫᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public class C2150 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        URL url = (URL) obj;
        c23525.m51984(url == null ? null : url.toExternalForm());
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String strM40399 = c17175.m40399();
        if (strM40399.equals("null")) {
            return null;
        }
        return new URL(strM40399);
    }
}
