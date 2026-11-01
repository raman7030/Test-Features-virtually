package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;

/* JADX INFO: renamed from: l.֫֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3784 extends EnumC17865 {
    public /* synthetic */ C3784() {
        this("HTTP", 0);
    }

    @Override // p067l.EnumC17865
    /* JADX INFO: renamed from: ֫ */
    public long mo7400() {
        return 2L;
    }

    public C3784(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC17865
    /* JADX INFO: renamed from: ֫ */
    public boolean mo7402(String str) {
        return str.startsWith("http:");
    }

    @Override // p067l.EnumC17865
    /* JADX INFO: renamed from: ֫ */
    public boolean mo7401(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return (scheme.equalsIgnoreCase(C0170a.f680s) || scheme.equalsIgnoreCase(C0171b.f688a)) && uri.getHost() != null;
        }
        return false;
    }
}
