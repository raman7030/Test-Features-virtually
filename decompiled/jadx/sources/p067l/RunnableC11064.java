package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11064 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f30631;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30632;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30633;

    public /* synthetic */ RunnableC11064(int i, Object obj, Object obj2) {
        this.f30632 = i;
        this.f30633 = obj;
        this.f30631 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30632) {
            case 0:
                ((InterfaceC5029) this.f30633).mo10704((IOException) this.f30631);
                break;
            case 1:
                C12474.m28712((C12474) this.f30633, (Class) this.f30631);
                break;
            case 2:
                C7996.m18517((C7996) this.f30633, (C18498) this.f30631);
                break;
            default:
                ViewOnClickListenerC9523.m22171((ViewOnClickListenerC9523) this.f30633, (Runnable) this.f30631);
                break;
        }
    }
}
