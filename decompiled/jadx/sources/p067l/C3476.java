package p067l;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 24DT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3476 implements InterfaceC10182 {
    @Override // p067l.InterfaceC10182
    /* JADX INFO: renamed from: ֫ */
    public final List mo6207(String str) throws UnknownHostException {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
