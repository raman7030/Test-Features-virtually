package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9055 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f27458;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13921 f27459;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16109 f27460;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f27461;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f27462;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f27464;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f27465;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public StringBuilder f27466 = new StringBuilder();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8817 f27463 = C8817.m22790();

    public C9055(C16109 c16109, Main main, List list, boolean z, boolean z2, boolean z3, AbstractC13921 abstractC13921) {
        this.f27460 = c16109;
        this.f27465 = main;
        this.f27461 = list;
        this.f27464 = z;
        this.f27462 = z2;
        this.f27458 = z3;
        this.f27459 = abstractC13921;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f27465);
        this.f23322.m31865().setSingleLine(false);
        this.f23322.m31865().setMaxLines(3);
        this.f23322.m31860((Runnable) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f27463.m22791();
        Iterator it = this.f27461.iterator();
        while (it.hasNext()) {
            m23384((InterfaceC17889) it.next(), "");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23384(InterfaceC17889 interfaceC17889, String str) {
        if (interfaceC17889.mo36981() || this.f23322.m31868()) {
            return;
        }
        boolean z = this.f27464;
        StringBuilder sb = this.f27466;
        if (z) {
            sb.append(str);
            sb.append(interfaceC17889.getName());
        } else {
            sb.append(interfaceC17889.getPath());
        }
        if (this.f27462 && interfaceC17889.isDirectory()) {
            sb.append('/');
        }
        sb.append('\n');
        if (this.f27458 && interfaceC17889.isDirectory()) {
            if (this.f27463.m22791()) {
                C13136 c13136 = this.f23322;
                StringBuilder sbM15339 = C5368.m15339(str);
                sbM15339.append(interfaceC17889.getName());
                c13136.m31861(sbM15339.toString());
            }
            StringBuilder sbM153310 = C5368.m15339(str);
            sbM153310.append(interfaceC17889.getName());
            sbM153310.append("/");
            String string = sbM153310.toString();
            ArrayList arrayListMo7637 = this.f27459.mo7637(interfaceC17889.getPath(), true);
            C7489.m20119(arrayListMo7637, 0, false);
            Iterator it = arrayListMo7637.iterator();
            while (it.hasNext()) {
                m23384((InterfaceC17889) it.next(), string);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        StringBuilder sb = this.f27466;
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        ActivityC14946.m35399(this.f27465, sb.toString(), C4925.m14327(this.f27460.m5610()), null, null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f27465.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
