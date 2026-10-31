package l;

import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15791 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48714;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2387 f48715;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48716;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48717;

    public C15791(C2387 c2387, boolean z, boolean z2, String str) {
        this.f48715 = c2387;
        this.f48714 = z;
        this.f48716 = z2;
        this.f48717 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f48715.f7618.m7917());
        this.f23322.m31860((Runnable) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        HashMap map = new HashMap();
        C2387 c2387 = this.f48715;
        Iterator it = c2387.f7613.iterator();
        do {
            boolean zHasNext = it.hasNext();
            boolean z = this.f48716;
            boolean z2 = this.f48714;
            if (zHasNext) {
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
                C23636 c23636 = (C23636) C13843.computeIfAbsent(map, interfaceC17889.getName(), new C1981(1));
                if (z2) {
                    c23636.f76581 = C18838.m43525(interfaceC17889.mo24433());
                }
                if (z) {
                    c23636.f76582 = C17324.m40645(new C7605(interfaceC17889.mo24433().mo27926(), 0));
                }
            } else {
                c2387.f7617 = map;
                if (z2) {
                    c2387.f7616 = true;
                }
                if (z) {
                    c2387.f7619 = true;
                    return;
                }
                return;
            }
        } while (!this.f23322.m31868());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        this.f48715.m7726(this.f48717);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f48715.f7618.m7917().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
