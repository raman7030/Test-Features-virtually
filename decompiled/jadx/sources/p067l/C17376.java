package p067l;

import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes4.dex */
public final class C17376 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f51853;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C4637 f51854;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f51855;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f51856;

    public C17376(C4637 c4637, boolean z, boolean z2, String str) {
        this.f51854 = c4637;
        this.f51853 = z;
        this.f51855 = z2;
        this.f51856 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f51854.f10409.m9965());
        this.f26234.m33952((Runnable) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        HashMap map = new HashMap();
        C4637 c4637 = this.f51854;
        Iterator it = c4637.f10404.iterator();
        do {
            boolean zHasNext = it.hasNext();
            boolean z = this.f51855;
            boolean z2 = this.f51853;
            if (zHasNext) {
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
                C24832 c24832 = (C24832) C15525.computeIfAbsent(map, interfaceC19370.getName(), new C4251(1));
                if (z2) {
                    c24832.f79325 = C20272.m45791(interfaceC19370.mo26445());
                }
                if (z) {
                    c24832.f79326 = C18833.m42896(new C9596(interfaceC19370.mo26445().mo29987(), 0));
                }
            } else {
                c4637.f10408 = map;
                if (z2) {
                    c4637.f10407 = true;
                }
                if (z) {
                    c4637.f10410 = true;
                    return;
                }
                return;
            }
        } while (!this.f26234.m33960());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            return;
        }
        this.f51854.m9787(this.f51856);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f51854.f10409.m9965().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
