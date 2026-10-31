package l;

/* JADX INFO: renamed from: l.ᩳ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B3ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18320 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 f56962;

    public C18320(C16719 c16719) {
        this.f56962 = c16719;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m42692(AbstractC12612 abstractC12612) {
        C16719 c16719 = this.f56962;
        C14397 c14397M39355 = c16719.m39355();
        long lineNumber = c16719.getLineNumber();
        long jM34392 = c14397M39355.m34392(abstractC12612.f16085);
        long jM34389 = c14397M39355.m34389(abstractC12612.f16085, false);
        if (jM34392 == lineNumber) {
            return String.valueOf(jM34389);
        }
        return jM34392 + ":" + jM34389;
    }
}
