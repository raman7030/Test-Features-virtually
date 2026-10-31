package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8580 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f26209;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0112 f26210;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f26211;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16560 f26212;

    public C8580(C16560 c16560, List list) {
        boolean z;
        this.f26212 = c16560;
        this.f26211 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                z = true;
                this.f26209 = z;
            }
        }
        z = false;
        this.f26209 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22294(final RunnableC1000 runnableC1000) {
        List list = this.f26211;
        int size = list.size();
        C16560 c16560 = this.f26212;
        if (size == 1) {
            C9555 c9555 = (C9555) list.get(0);
            C16477 c16477Mo24428 = c9555.mo24428();
            C0112 c0112 = new C0112(c16560.m39056(), c16477Mo24428.m38837(), c16477Mo24428.m38833(), this.f26209, new Runnable() { // from class: l.ۜ֫᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C8580.m22290(this.f19974, runnableC1000);
                }
            });
            c0112.m1105(c9555.getName());
            c0112.m1107();
            this.f26210 = c0112;
            return;
        }
        C0112 c0113 = new C0112(c16560.m39056(), null, null, this.f26209, new Runnable() { // from class: l.᩷֫᩻
            @Override // java.lang.Runnable
            public final void run() {
                C8580.m22292(this.f66254, runnableC1000);
            }
        });
        c0113.m1105(C4925.m14306(R.string.MT_Protector, Integer.valueOf(list.size())));
        c0113.m1107();
        this.f26210 = c0113;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22290(C8580 c8580, RunnableC1000 runnableC1000) {
        C16560 c16560 = c8580.f26212;
        if (c8580.f26210.m1109()) {
            try {
                C17721.m41503(c16560.m38991(), EnumC16309.MODIFY_DIRECTORY_LINKED);
                new C9286(c8580, c8580.f26210.m1110(), c8580.f26210.m1108(), runnableC1000).m20274();
            } catch (C1637 e) {
                c16560.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22292(C8580 c8580, RunnableC1000 runnableC1000) {
        C16560 c16560 = c8580.f26212;
        try {
            C17721.m41503(c16560.m38991(), EnumC16309.MODIFY_DIRECTORY_LINKED);
            new C9286(c8580, c8580.f26210.m1110(), c8580.f26210.m1108(), runnableC1000).m20274();
        } catch (C1637 e) {
            c16560.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
