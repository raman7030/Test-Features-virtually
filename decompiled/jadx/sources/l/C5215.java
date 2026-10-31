package l;

import com.alipay.sdk.m.y.l;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: l.ۚ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5215 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4965 f16325;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress f16326;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Proxy f16327;

    public C5215(C4965 c4965, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c4965 == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f16325 = c4965;
        this.f16327 = proxy;
        this.f16326 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4965 m14991() {
        return this.f16325;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Proxy m14992() {
        return this.f16327;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress m14994() {
        return this.f16326;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m14993() {
        return this.f16325.f15639 != null && this.f16327.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5215)) {
            return false;
        }
        C5215 c5215 = (C5215) obj;
        return c5215.f16325.equals(this.f16325) && c5215.f16327.equals(this.f16327) && c5215.f16326.equals(this.f16326);
    }

    public final int hashCode() {
        return this.f16326.hashCode() + ((this.f16327.hashCode() + ((this.f16325.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f16326 + l.d;
    }
}
