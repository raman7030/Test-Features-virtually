package p067l;

/* JADX INFO: renamed from: l.ۤۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12073 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f33635;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC17043 f33636;

    /* JADX INFO: renamed from: ܳ */
    public final String f33637;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC19370 f33638;

    /* JADX INFO: renamed from: ܿ */
    public final String f33639;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f33640;

    public C12073(InterfaceC19370 interfaceC19370) {
        this(interfaceC19370.getName(), interfaceC19370.getParent(), true, false);
        this.f33638 = interfaceC19370;
    }

    public C12073(String str, String str2, boolean z, boolean z2) {
        this.f33639 = str;
        this.f33637 = str2;
        this.f33640 = z;
        this.f33635 = z2;
        if (str.contains("/") || !str2.startsWith("/") || !str2.endsWith("/")) {
            throw new IllegalArgumentException(C20865.m47154("name: ", str, " parent: ", str2));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m27648() {
        return this.f33639;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m27650() {
        String strReplaceAll = this.f33639.replaceAll("[:\\\\*?<>\"|]", "_");
        if (strReplaceAll.length() <= 200) {
            return strReplaceAll;
        }
        String strM38645 = AbstractC17043.m38645(strReplaceAll);
        String strSubstring = strReplaceAll.substring(0, strReplaceAll.length() - strM38645.length());
        if (strSubstring.length() > 50) {
            strSubstring = strSubstring.substring(0, 50);
        }
        if (strM38645.length() > 50) {
            strM38645 = strM38645.substring(0, 50);
        }
        return C17588.m40053(strSubstring, strM38645);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m27647() {
        return this.f33637;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m27645() {
        return this.f33637 + this.f33639;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m27643() {
        return this.f33635;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m27649() {
        return this.f33640;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27641() {
        if (this.f33640 && this.f33636 == null) {
            throw new RuntimeException("Failed to get file: " + this.f33639);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27642(AbstractC17043 abstractC17043) {
        this.f33636 = abstractC17043;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 m27644() {
        return this.f33636;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC19370 m27646() {
        return this.f33638;
    }
}
