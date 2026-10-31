package l;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ܽ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C16966 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        c23525.m51984(inetAddress == null ? null : inetAddress.getHostAddress());
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        return InetAddress.getByName(c17175.m40399());
    }
}
