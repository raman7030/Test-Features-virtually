package p067l;

/* JADX INFO: renamed from: l.ܰ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15713 extends AbstractC15773 {

    /* JADX INFO: renamed from: ܽ */
    public final String f45529;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC15951 f45530;

    public C15713(int i, String str, AbstractC15773 abstractC15773, AbstractC15951 abstractC15951) {
        super(i, abstractC15773);
        this.f45529 = str;
        this.f45530 = abstractC15951;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 m35771(C15713 c15713) {
        return (c15713.f45667 == this.f45667 && c15713.f45668 == this.f45668 && c15713.f45530 == this.f45530) ? this : c15713;
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo22769(String str) {
        String str2 = this.f45529;
        AbstractC15951 abstractC15951 = this.f45530;
        if (str2 != null) {
            abstractC15951.getClass();
        }
        AbstractC15773 abstractC15773Mo22769 = super.mo22769(str);
        if (abstractC15773Mo22769 == null) {
            return null;
        }
        if (abstractC15773Mo22769 == this.f45668) {
            return this;
        }
        int i = this.f45667;
        return new C15713(i, null, abstractC15773Mo22769, abstractC15951).m35771(new C15713(i, null, abstractC15773Mo22769, abstractC15951));
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo22770(String str, String str2) {
        String str3 = this.f45529;
        AbstractC15951 abstractC15951 = this.f45530;
        if (str3 != null) {
            abstractC15951.getClass();
        }
        abstractC15951.getClass();
        AbstractC15773 abstractC15773Mo22770 = super.mo22770(str, AbstractC15951.m36202(str2));
        if (abstractC15773Mo22770 == null) {
            return null;
        }
        if (abstractC15773Mo22770 == this.f45668) {
            return this;
        }
        int i = this.f45667;
        return new C15713(i, str2, abstractC15773Mo22770, abstractC15951).m35771(new C15713(i, null, abstractC15773Mo22770, abstractC15951));
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22773(Object obj, String str) {
        String str2 = this.f45529;
        AbstractC15951 abstractC15951 = this.f45530;
        if (str2 != null) {
            abstractC15951.getClass();
        }
        abstractC15951.getClass();
        super.mo22773(AbstractC15951.m36201(obj), str);
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22774(String str, String str2, String str3) {
        String str4 = this.f45529;
        AbstractC15951 abstractC15951 = this.f45530;
        if (str4 != null) {
            abstractC15951.getClass();
        }
        abstractC15951.getClass();
        super.mo22774(str, AbstractC15951.m36202(str2), str3);
    }
}
