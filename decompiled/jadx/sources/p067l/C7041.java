package p067l;

import android.view.MenuItem;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7041 implements InterfaceC1583, InterfaceC11360 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f18340;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f18341;

    public /* synthetic */ C7041(Object obj, Object obj2) {
        this.f18340 = obj;
        this.f18341 = obj2;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnLayoutChangeListenerC9723.m22707((ViewOnLayoutChangeListenerC9723) this.f18340, (DialogInterfaceC2564) this.f18341, menuItem);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m16185(int i, byte[] bArr) {
        C10844 c10844 = (C10844) this.f18340;
        AtomicInteger atomicInteger = (AtomicInteger) this.f18341;
        synchronized (c10844) {
            c10844.m24986(C18010.m40987(atomicInteger.incrementAndGet()));
            c10844.write(bArr, 0, i);
        }
    }

    @Override // p067l.InterfaceC11360
    /* JADX INFO: renamed from: ֫ */
    public void mo3843(C25065 c25065) {
        C14853 c14853 = (C14853) this.f18340;
        DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) this.f18341;
        int i = ViewOnClickListenerC7928.f20793;
        C13045.m29867(c25065, "response");
        c14853.m33949();
        if (!c25065.m55016()) {
            C22682.m50795((CharSequence) C3865.m7621(c25065, R.string.MT_Protector));
        } else {
            C22682.m50793(R.string.MT_Protector);
            dialogInterfaceC2564.dismiss();
        }
    }
}
