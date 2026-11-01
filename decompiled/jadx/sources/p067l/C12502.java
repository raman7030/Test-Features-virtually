package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۧ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12502 extends EnumC17865 {
    public /* synthetic */ C12502() {
        this("VISITOR", 1);
    }

    @Override // p067l.EnumC17865
    /* JADX INFO: renamed from: ֫ */
    public long mo7400() {
        return 1L;
    }

    public C12502(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC17865
    /* JADX INFO: renamed from: ֫ */
    public boolean mo7402(String str) {
        return str.startsWith("visitor:");
    }

    @Override // p067l.EnumC17865
    /* JADX INFO: renamed from: ֫ */
    public boolean mo7401(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("mt_media") && uri.getAuthority() == null;
    }
}
