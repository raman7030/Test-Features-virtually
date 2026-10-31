package l;

import android.app.Activity;

/* JADX INFO: renamed from: l.ۤ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AM8 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC0690(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
public final class C10291 extends AbstractC21858 implements InterfaceC19763 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f30996;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6057 f30997;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f30998;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10291(C6057 c6057, Activity activity, InterfaceC11791 interfaceC11791) {
        super(interfaceC11791);
        this.f30997 = c6057;
        this.f30996 = activity;
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11791 mo8682(Object obj, InterfaceC11791 interfaceC11791) {
        return new C10291(this.f30997, this.f30996, interfaceC11791);
    }

    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        return ((C10291) mo8682(obj, (InterfaceC11791) obj2)).mo8684(C8058.f24861);
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    public final Object mo8684(Object obj) throws Throwable {
        EnumC7041 enumC7041 = EnumC7041.COROUTINE_SUSPENDED;
        int i = this.f30998;
        if (i == 0) {
            C18642.m43236(obj);
            C6057 c6057 = this.f30997;
            InterfaceC18704 interfaceC18704M1798 = C0358.m1798(new C12407(((C18179) c6057.f18558).m42401(this.f30996), c6057));
            C4646 c4646 = new C4646(c6057);
            this.f30998 = 1;
            if (interfaceC18704M1798.mo11750(c4646, this) == enumC7041) {
                return enumC7041;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18642.m43236(obj);
        }
        return C8058.f24861;
    }
}
