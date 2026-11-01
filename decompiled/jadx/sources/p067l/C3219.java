package p067l;

/* JADX INFO: renamed from: l.֨ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3219 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC22666 f6240;

    public /* synthetic */ C3219(ViewOnClickListenerC22666 viewOnClickListenerC22666) {
        this.f6240 = viewOnClickListenerC22666;
    }

    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        ActivityC23336 activityC23336 = this.f6240.f71497;
        activityC23336.f73421 = ((AbstractC17043) obj).getName();
        ActivityC23336.m51973(activityC23336);
    }
}
