package l;

/* JADX INFO: renamed from: l.ܰ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14041 extends AbstractC14104 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f42446;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14292 f42447;

    public C14041(int i, String str, AbstractC14104 abstractC14104, AbstractC14292 abstractC14292) {
        super(i, abstractC14104);
        this.f42446 = str;
        this.f42447 = abstractC14292;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 m33651(C14041 c14041) {
        return (c14041.f42581 == this.f42581 && c14041.f42582 == this.f42582 && c14041.f42447 == this.f42447) ? this : c14041;
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo20788(String str) {
        String str2 = this.f42446;
        AbstractC14292 abstractC14292 = this.f42447;
        if (str2 != null) {
            abstractC14292.getClass();
        }
        AbstractC14104 abstractC14104Mo20788 = super.mo20788(str);
        if (abstractC14104Mo20788 == null) {
            return null;
        }
        if (abstractC14104Mo20788 == this.f42582) {
            return this;
        }
        int i = this.f42581;
        return new C14041(i, null, abstractC14104Mo20788, abstractC14292).m33651(new C14041(i, null, abstractC14104Mo20788, abstractC14292));
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo20789(String str, String str2) {
        String str3 = this.f42446;
        AbstractC14292 abstractC14292 = this.f42447;
        if (str3 != null) {
            abstractC14292.getClass();
        }
        abstractC14292.getClass();
        AbstractC14104 abstractC14104Mo20789 = super.mo20789(str, AbstractC14292.m34069(str2));
        if (abstractC14104Mo20789 == null) {
            return null;
        }
        if (abstractC14104Mo20789 == this.f42582) {
            return this;
        }
        int i = this.f42581;
        return new C14041(i, str2, abstractC14104Mo20789, abstractC14292).m33651(new C14041(i, null, abstractC14104Mo20789, abstractC14292));
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final void mo20792(Object obj, String str) {
        String str2 = this.f42446;
        AbstractC14292 abstractC14292 = this.f42447;
        if (str2 != null) {
            abstractC14292.getClass();
        }
        abstractC14292.getClass();
        super.mo20792(AbstractC14292.m34068(obj), str);
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final void mo20793(String str, String str2, String str3) {
        String str4 = this.f42446;
        AbstractC14292 abstractC14292 = this.f42447;
        if (str4 != null) {
            abstractC14292.getClass();
        }
        abstractC14292.getClass();
        super.mo20793(str, AbstractC14292.m34069(str2), str3);
    }
}
