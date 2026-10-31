package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;

/* JADX INFO: renamed from: l.֫֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C1490 extends EnumC16306 {
    public /* synthetic */ C1490() {
        this("HTTP", 0);
    }

    @Override // l.EnumC16306
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long mo5158() {
        return 2L;
    }

    public C1490(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC16306
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo5160(String str) {
        return str.startsWith("http:");
    }

    @Override // l.EnumC16306
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo5159(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return (scheme.equalsIgnoreCase(a.s) || scheme.equalsIgnoreCase(b.a)) && uri.getHost() != null;
        }
        return false;
    }
}
