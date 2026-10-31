package l;

import android.view.MenuItem;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4916 implements InterfaceC14930, InterfaceC9461 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15507;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15508;

    public /* synthetic */ C4916(Object obj, Object obj2) {
        this.f15507 = obj;
        this.f15508 = obj2;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnLayoutChangeListenerC7738.m20727((ViewOnLayoutChangeListenerC7738) this.f15507, (DialogInterfaceC0206) this.f15508, menuItem);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m14288(int i, byte[] bArr) {
        C8918 c8918 = (C8918) this.f15507;
        AtomicInteger atomicInteger = (AtomicInteger) this.f15508;
        synchronized (c8918) {
            c8918.m23012(C16458.m38762(atomicInteger.incrementAndGet()));
            c8918.write(bArr, 0, i);
        }
    }

    @Override // l.InterfaceC9461
    /* JADX INFO: renamed from: ֫ */
    public void mo1430(C23881 c23881) {
        C13136 c13136 = (C13136) this.f15507;
        DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) this.f15508;
        int i = ViewOnClickListenerC5850.f17941;
        C11233.m27805(c23881, "response");
        c13136.m31857();
        if (!c23881.m52607()) {
            C21374.m48459((CharSequence) C1575.m5392(c23881, R.string.MT_Protector));
        } else {
            C21374.m48457(R.string.MT_Protector);
            dialogInterfaceC0206.dismiss();
        }
    }
}
