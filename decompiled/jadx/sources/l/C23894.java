package l;

/* JADX INFO: renamed from: l.᩻᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes.dex */
public final class C23894 extends AbstractC15594 {
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        char cCharAt;
        int iMo44153 = c19662.mo44153();
        if (!C6961.m18802((InterfaceC19124) c19662, iMo44153)) {
            return null;
        }
        int iMo44151 = c19662.mo44151() + c19662.mo44150();
        int i = iMo44151 + 1;
        CharSequence charSequenceM38335 = c19662.getLine().m38335();
        int i2 = iMo44153 + 1;
        if (i2 < charSequenceM38335.length() && ((cCharAt = charSequenceM38335.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo44151 + 2;
        }
        C21073 c21073 = new C21073(new C6961());
        c21073.m47971(i);
        return c21073;
    }
}
