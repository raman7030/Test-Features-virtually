package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: l.ۚ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7325 {

    /* JADX INFO: renamed from: ֫ */
    public final C7088 f19165;

    /* JADX INFO: renamed from: ۧ */
    public final InetSocketAddress f19166;

    /* JADX INFO: renamed from: ܽ */
    public final Proxy f19167;

    public C7325(C7088 c7088, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c7088 == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f19165 = c7088;
        this.f19167 = proxy;
        this.f19166 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7088 m16901() {
        return this.f19165;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Proxy m16902() {
        return this.f19167;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InetSocketAddress m16904() {
        return this.f19166;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m16903() {
        return this.f19165.f18473 != null && this.f19167.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7325)) {
            return false;
        }
        C7325 c7325 = (C7325) obj;
        return c7325.f19165.equals(this.f19165) && c7325.f19167.equals(this.f19167) && c7325.f19166.equals(this.f19166);
    }

    public final int hashCode() {
        return this.f19166.hashCode() + ((this.f19167.hashCode() + ((this.f19165.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f19166 + C0249l.f1198d;
    }
}
