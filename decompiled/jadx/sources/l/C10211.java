package l;

/* JADX INFO: renamed from: l.ۤۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10211 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f30674;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f30675;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f30676;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 f30677;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f30678;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f30679;

    public C10211(InterfaceC17889 interfaceC17889) {
        this(interfaceC17889.getName(), interfaceC17889.getParent(), true, false);
        this.f30677 = interfaceC17889;
    }

    public C10211(String str, String str2, boolean z, boolean z2) {
        this.f30678 = str;
        this.f30676 = str2;
        this.f30679 = z;
        this.f30674 = z2;
        if (str.contains("/") || !str2.startsWith("/") || !str2.endsWith("/")) {
            throw new IllegalArgumentException(C19462.m44858("name: ", str, " parent: ", str2));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m25626() {
        return this.f30678;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m25628() {
        String strReplaceAll = this.f30678.replaceAll("[:\\\\*?<>\"|]", "_");
        if (strReplaceAll.length() <= 200) {
            return strReplaceAll;
        }
        String strM36487 = AbstractC15440.m36487(strReplaceAll);
        String strSubstring = strReplaceAll.substring(0, strReplaceAll.length() - strM36487.length());
        if (strSubstring.length() > 50) {
            strSubstring = strSubstring.substring(0, 50);
        }
        if (strM36487.length() > 50) {
            strM36487 = strM36487.substring(0, 50);
        }
        return C16014.m37867(strSubstring, strM36487);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m25625() {
        return this.f30676;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m25623() {
        return this.f30676 + this.f30678;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m25621() {
        return this.f30674;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25627() {
        return this.f30679;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25619() {
        if (this.f30679 && this.f30675 == null) {
            throw new RuntimeException("Failed to get file: " + this.f30678);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25620(AbstractC15440 abstractC15440) {
        this.f30675 = abstractC15440;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m25622() {
        return this.f30675;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m25624() {
        return this.f30677;
    }
}
