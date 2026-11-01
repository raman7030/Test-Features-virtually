package p067l;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܶ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16557 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f48626;

    /* JADX INFO: renamed from: ۧ */
    public C5801 f48627;

    /* JADX INFO: renamed from: ܽ */
    public final List f48628;

    /* JADX INFO: renamed from: ᩳ */
    public C18107 f48629;

    public C16557(C18107 c18107, List list) {
        boolean z;
        this.f48629 = c18107;
        this.f48628 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC19370) it.next()).isDirectory()) {
                z = true;
                this.f48626 = z;
            }
        }
        z = false;
        this.f48626 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37530(final RunnableC3319 runnableC3319) {
        List list = this.f48628;
        int size = list.size();
        C18107 c18107 = this.f48629;
        if (size == 1) {
            C11450 c11450 = (C11450) ((InterfaceC19370) list.get(0));
            C5801 c5801 = new C5801(c18107.m41282(), c11450.mo26440().m41069(), this.f48626, true, new Runnable() { // from class: l.ۚ֫᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C16557.m37526(this.f18720, runnableC3319);
                }
            });
            c5801.m13060();
            this.f48627 = c5801;
            return;
        }
        C5801 c5802 = new C5801(c18107.m41282(), SecP521R1Field.P16, this.f48626, true, new RunnableC6153(1, this, runnableC3319));
        c5802.m13060();
        this.f48627 = c5802;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37526(C16557 c16557, RunnableC3319 runnableC3319) {
        C18107 c18107 = c16557.f48629;
        if (c16557.f48627.m13061()) {
            try {
                C19210.m43749(c18107.m41217(), EnumC17868.MODIFY_DIRECTORY_LINKED);
                new C3146(c16557, c16557.f48627.m13059(), c16557.f48627.m13058(), runnableC3319).m22250();
            } catch (C3924 e) {
                c18107.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37528(C16557 c16557, RunnableC3319 runnableC3319) {
        C18107 c18107 = c16557.f48629;
        try {
            C19210.m43749(c18107.m41217(), EnumC17868.MODIFY_DIRECTORY_LINKED);
            new C3146(c16557, c16557.f48627.m13059(), c16557.f48627.m13058(), runnableC3319).m22250();
        } catch (C3924 e) {
            c18107.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
