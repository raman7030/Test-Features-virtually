package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10975 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ boolean f30396;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ AbstractC15599 f30397;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C17679 f30398;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ List f30399;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f30400;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ boolean f30402;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractActivityC5549 f30403;

    /* JADX INFO: renamed from: ᩻ */
    public StringBuilder f30404 = new StringBuilder();

    /* JADX INFO: renamed from: ܳ */
    public C10748 f30401 = C10748.m24760();

    public C10975(C17679 c17679, Main main, List list, boolean z, boolean z2, boolean z3, AbstractC15599 abstractC15599) {
        this.f30398 = c17679;
        this.f30403 = main;
        this.f30399 = list;
        this.f30402 = z;
        this.f30400 = z2;
        this.f30396 = z3;
        this.f30397 = abstractC15599;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f30403);
        this.f26234.m33957().setSingleLine(false);
        this.f26234.m33957().setMaxLines(3);
        this.f26234.m33952((Runnable) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f30401.m24761();
        Iterator it = this.f30399.iterator();
        while (it.hasNext()) {
            m25329((InterfaceC19370) it.next(), "");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25329(InterfaceC19370 interfaceC19370, String str) {
        if (interfaceC19370.mo39147() || this.f26234.m33960()) {
            return;
        }
        boolean z = this.f30402;
        StringBuilder sb = this.f30404;
        if (z) {
            sb.append(str);
            sb.append(interfaceC19370.getName());
        } else {
            sb.append(interfaceC19370.getPath());
        }
        if (this.f30400 && interfaceC19370.isDirectory()) {
            sb.append('/');
        }
        sb.append('\n');
        if (this.f30396 && interfaceC19370.isDirectory()) {
            if (this.f30401.m24761()) {
                C14853 c14853 = this.f26234;
                StringBuilder sbM17248 = C7470.m17248(str);
                sbM17248.append(interfaceC19370.getName());
                c14853.m33953(sbM17248.toString());
            }
            StringBuilder sbM17249 = C7470.m17248(str);
            sbM17249.append(interfaceC19370.getName());
            sbM17249.append("/");
            String string = sbM17249.toString();
            ArrayList arrayListMo9708 = this.f30397.mo9708(interfaceC19370.getPath(), true);
            C9486.m22095(arrayListMo9708, 0, false);
            Iterator it = arrayListMo9708.iterator();
            while (it.hasNext()) {
                m25329((InterfaceC19370) it.next(), string);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            return;
        }
        StringBuilder sb = this.f30404;
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        ActivityC16573.m37551(this.f30403, sb.toString(), C7050.m16224(this.f30398.m7840()), null, null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f30403.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
