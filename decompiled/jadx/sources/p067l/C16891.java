package p067l;

/* JADX INFO: renamed from: l.ܶܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public class C16891 {

    /* JADX INFO: renamed from: ֫ */
    public final C7014 f50007;

    /* JADX INFO: renamed from: ۧ */
    public final C2017 f50008;

    public C16891(C7014 c7014, C2017 c2017) {
        this.f50007 = c7014;
        this.f50008 = c2017;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7014 m38449() {
        return this.f50007;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C2017 m38450() {
        return this.f50008;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m38451() {
        C7014 c7014 = this.f50007;
        EnumC21767 enumC21767M49055 = EnumC21767.m49055(c7014.m16145().mView);
        EnumC21767 enumC21767M16143 = c7014.m16143();
        if (enumC21767M49055 == enumC21767M16143) {
            return true;
        }
        EnumC21767 enumC21767 = EnumC21767.VISIBLE;
        return (enumC21767M49055 == enumC21767 || enumC21767M16143 == enumC21767) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38448() {
        this.f50007.m16138(this.f50008);
    }
}
