package p067l;

import android.app.Activity;

/* JADX INFO: renamed from: l.ۤ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AM8 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC3025(m5117c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", m5118f = "FoldingFeatureObserver.kt", m5119l = {97}, m5120m = "invokeSuspend")
public final class C12149 extends AbstractC23143 implements InterfaceC21152 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Activity f33959;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C8125 f33960;

    /* JADX INFO: renamed from: ۬ */
    public int f33961;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12149(C8125 c8125, Activity activity, InterfaceC13575 interfaceC13575) {
        super(interfaceC13575);
        this.f33960 = c8125;
        this.f33959 = activity;
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13575 mo10743(Object obj, InterfaceC13575 interfaceC13575) {
        return new C12149(this.f33960, this.f33959, interfaceC13575);
    }

    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        return ((C12149) mo10743(obj, (InterfaceC13575) obj2)).mo10745(C10027.f27775);
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ۧ */
    public final Object mo10745(Object obj) throws Throwable {
        EnumC9061 enumC9061 = EnumC9061.COROUTINE_SUSPENDED;
        int i = this.f33961;
        if (i == 0) {
            C20086.m45502(obj);
            C8125 c8125 = this.f33960;
            InterfaceC20145 interfaceC20145M4198 = C2709.m4198(new C14160(((C19646) c8125.f21414).m44662(this.f33959), c8125));
            C6784 c6784 = new C6784(c8125);
            this.f33961 = 1;
            if (interfaceC20145M4198.mo13686(c6784, this) == enumC9061) {
                return enumC9061;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C20086.m45502(obj);
        }
        return C10027.f27775;
    }
}
