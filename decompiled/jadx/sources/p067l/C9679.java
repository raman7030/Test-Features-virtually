package p067l;

/* JADX INFO: renamed from: l.۟᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9CC */
/* JADX INFO: loaded from: classes3.dex */
public class C9679 extends AbstractC25102 {

    /* JADX INFO: renamed from: ܽ */
    public String f26673;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC15951 f26674;

    public C9679(C9009 c9009, AbstractC15951 abstractC15951) {
        super(c9009);
        this.f26674 = abstractC15951;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20837(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f26673 = str;
        AbstractC15951 abstractC15951 = this.f26674;
        abstractC15951.getClass();
        super.mo20837(i, i2, AbstractC15951.m36206(str), abstractC15951.m36207(str2, false), AbstractC15951.m36206(str3), strArr == null ? null : AbstractC15951.m36204(strArr));
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23761 mo20835(int i, String str, String str2) {
        AbstractC15951 abstractC15951 = this.f26674;
        abstractC15951.getClass();
        AbstractC23761 abstractC23761Mo20835 = super.mo20835(i, str, str2);
        if (abstractC23761Mo20835 == null) {
            return null;
        }
        return new C19305(this.f80341, abstractC23761Mo20835, abstractC15951);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo20833(String str, boolean z) {
        AbstractC15951 abstractC15951 = this.f26674;
        abstractC15951.getClass();
        AbstractC15773 abstractC15773Mo20833 = super.mo20833(AbstractC15951.m36202(str), z);
        if (abstractC15773Mo20833 == null) {
            return null;
        }
        int i = this.f80341;
        return new C15713(i, str, abstractC15773Mo20833, abstractC15951).m35771(new C15713(i, null, abstractC15773Mo20833, abstractC15951));
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo20832(int i, C24431 c24431, String str, boolean z) {
        AbstractC15951 abstractC15951 = this.f26674;
        abstractC15951.getClass();
        AbstractC15773 abstractC15773Mo20832 = super.mo20832(i, c24431, AbstractC15951.m36202(str), z);
        if (abstractC15773Mo20832 == null) {
            return null;
        }
        int i2 = this.f80341;
        return new C15713(i2, str, abstractC15773Mo20832, abstractC15951).m35771(new C15713(i2, null, abstractC15773Mo20832, abstractC15951));
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20842(C18396 c18396) {
        if (c18396 instanceof C17963) {
            throw null;
        }
        super.mo20842(c18396);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6997 mo20843(String str, String str2, String str3) {
        AbstractC15951 abstractC15951 = this.f26674;
        abstractC15951.getClass();
        AbstractC6997 abstractC6997Mo20843 = super.mo20843(str, AbstractC15951.m36202(str2), abstractC15951.m36207(str3, true));
        if (abstractC6997Mo20843 == null) {
            return null;
        }
        return new C18634(this.f80341, abstractC6997Mo20843, abstractC15951);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6327 mo20831(int i, String str, String str2, String str3, Object obj) {
        AbstractC15951 abstractC15951 = this.f26674;
        abstractC15951.getClass();
        AbstractC6327 abstractC6327Mo20831 = super.mo20831(i, str, AbstractC15951.m36202(str2), abstractC15951.m36207(str3, true), obj == null ? null : AbstractC15951.m36201(obj));
        if (abstractC6327Mo20831 == null) {
            return null;
        }
        return new C3882(this.f80341, abstractC6327Mo20831, abstractC15951);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17054 mo20834(int i, String str, String str2, String str3, String[] strArr) {
        AbstractC15951 abstractC15951 = this.f26674;
        abstractC15951.getClass();
        AbstractC17054 abstractC17054Mo20834 = super.mo20834(i, str, AbstractC15951.m36205(str2), abstractC15951.m36207(str3, false), strArr == null ? null : AbstractC15951.m36204(strArr));
        if (abstractC17054Mo20834 == null) {
            return null;
        }
        return new C12600(this.f80341, abstractC17054Mo20834, abstractC15951);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20839(String str, int i, String str2, String str3) {
        this.f26674.getClass();
        String strM36206 = AbstractC15951.m36206(str);
        String str4 = null;
        String strM36207 = str2 == null ? null : AbstractC15951.m36206(str2);
        if (str3 != null) {
            String strM36208 = AbstractC15951.m36206(str);
            if (!strM36208.equals(str)) {
                int iLastIndexOf = str.lastIndexOf(47);
                int iLastIndexOf2 = strM36208.lastIndexOf(47);
                if ((iLastIndexOf == -1 || iLastIndexOf2 == -1 || !str.substring(iLastIndexOf).equals(strM36208.substring(iLastIndexOf2))) && strM36208.contains("$")) {
                    int iLastIndexOf3 = strM36208.lastIndexOf(36);
                    do {
                        iLastIndexOf3++;
                        if (iLastIndexOf3 >= strM36208.length()) {
                            break;
                        }
                    } while (Character.isDigit(strM36208.charAt(iLastIndexOf3)));
                    str3 = strM36208.substring(iLastIndexOf3);
                }
            }
            str4 = str3;
        }
        super.mo20839(strM36206, i, strM36207, str4);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20841(String str, String str2, String str3) {
        this.f26674.getClass();
        String strM36206 = AbstractC15951.m36206(str);
        if (str2 == null) {
            str2 = null;
        }
        super.mo20841(strM36206, str2, str3 != null ? AbstractC15951.m36205(str3) : null);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20838(String str) {
        this.f26674.getClass();
        super.mo20838(AbstractC15951.m36206(str));
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ۧ */
    public final void mo20844(String str) {
        this.f26674.getClass();
        super.mo20844(AbstractC15951.m36206(str));
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ܽ */
    public final void mo20846(String str) {
        this.f26674.getClass();
        super.mo20846(AbstractC15951.m36206(str));
    }
}
