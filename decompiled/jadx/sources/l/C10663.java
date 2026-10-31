package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۧ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10663 extends EnumC16306 {
    public /* synthetic */ C10663() {
        this("VISITOR", 1);
    }

    @Override // l.EnumC16306
    /* JADX INFO: renamed from: ֫ */
    public long mo5158() {
        return 1L;
    }

    public C10663(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC16306
    /* JADX INFO: renamed from: ֫ */
    public boolean mo5160(String str) {
        return str.startsWith("visitor:");
    }

    @Override // l.EnumC16306
    /* JADX INFO: renamed from: ֫ */
    public boolean mo5159(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("mt_media") && uri.getAuthority() == null;
    }
}
