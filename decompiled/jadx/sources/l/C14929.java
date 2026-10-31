package l;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܶ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14929 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f45511;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3612 f45512;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f45513;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16560 f45514;

    public C14929(C16560 c16560, List list) {
        boolean z;
        this.f45514 = c16560;
        this.f45513 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC17889) it.next()).isDirectory()) {
                z = true;
                this.f45511 = z;
            }
        }
        z = false;
        this.f45511 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35378(final RunnableC1000 runnableC1000) {
        List list = this.f45513;
        int size = list.size();
        C16560 c16560 = this.f45514;
        if (size == 1) {
            C9555 c9555 = (C9555) ((InterfaceC17889) list.get(0));
            C3612 c3612 = new C3612(c16560.m39056(), c9555.mo24428().m38843(), this.f45511, true, new Runnable() { // from class: l.ۚ֫᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C14929.m35374(this.f15884, runnableC1000);
                }
            });
            c3612.m11084();
            this.f45512 = c3612;
            return;
        }
        C3612 c3613 = new C3612(c16560.m39056(), SecP521R1Field.P16, this.f45511, true, new RunnableC3982(1, this, runnableC1000));
        c3613.m11084();
        this.f45512 = c3613;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35374(C14929 c14929, RunnableC1000 runnableC1000) {
        C16560 c16560 = c14929.f45514;
        if (c14929.f45512.m11085()) {
            try {
                C17721.m41503(c16560.m38991(), EnumC16309.MODIFY_DIRECTORY_LINKED);
                new C0818(c14929, c14929.f45512.m11083(), c14929.f45512.m11082(), runnableC1000).m20274();
            } catch (C1637 e) {
                c16560.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m35376(C14929 c14929, RunnableC1000 runnableC1000) {
        C16560 c16560 = c14929.f45514;
        try {
            C17721.m41503(c16560.m38991(), EnumC16309.MODIFY_DIRECTORY_LINKED);
            new C0818(c14929, c14929.f45512.m11083(), c14929.f45512.m11082(), runnableC1000).m20274();
        } catch (C1637 e) {
            c16560.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
