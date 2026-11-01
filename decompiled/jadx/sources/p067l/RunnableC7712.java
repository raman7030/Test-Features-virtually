package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7712 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20238;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f20239;

    public /* synthetic */ RunnableC7712(int i, Object obj) {
        this.f20238 = i;
        this.f20239 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20238) {
            case 0:
                ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723 = (ViewOnLayoutChangeListenerC9723) this.f20239;
                viewOnLayoutChangeListenerC9723.f26858.m31362(49, viewOnLayoutChangeListenerC9723.f26853.getHeight() - viewOnLayoutChangeListenerC9723.m12277(R.id.MT_Protector).getHeight(), true);
                break;
            case 1:
                ((C17869) this.f20239).m40592();
                break;
            case 2:
                C6061.m13660((C6061) this.f20239);
                break;
            default:
                ((InterfaceC19157) this.f20239).close();
                break;
        }
    }
}
