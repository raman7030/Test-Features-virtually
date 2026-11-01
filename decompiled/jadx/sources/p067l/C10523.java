package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10523 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f29126;

    /* JADX INFO: renamed from: ۧ */
    public C2475 f29127;

    /* JADX INFO: renamed from: ܽ */
    public List f29128;

    /* JADX INFO: renamed from: ᩳ */
    public C18107 f29129;

    public C10523(C18107 c18107, List list) {
        boolean z;
        this.f29129 = c18107;
        this.f29128 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory() && !interfaceC19370.mo39144()) {
                z = true;
                this.f29126 = z;
            }
        }
        z = false;
        this.f29126 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24263(final RunnableC3319 runnableC3319) {
        List list = this.f29128;
        int size = list.size();
        C18107 c18107 = this.f29129;
        if (size == 1) {
            C11450 c11450 = (C11450) list.get(0);
            C18028 c18028Mo26440 = c11450.mo26440();
            C2475 c2475 = new C2475(c18107.m41282(), c18028Mo26440.m41063(), c18028Mo26440.m41059(), this.f29126, new Runnable() { // from class: l.ۜ֫᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C10523.m24259(this.f22849, runnableC3319);
                }
            });
            c2475.m3506(c11450.getName());
            c2475.m3508();
            this.f29127 = c2475;
            return;
        }
        C2475 c2476 = new C2475(c18107.m41282(), null, null, this.f29126, new Runnable() { // from class: l.᩷֫᩻
            @Override // java.lang.Runnable
            public final void run() {
                C10523.m24261(this.f68935, runnableC3319);
            }
        });
        c2476.m3506(C7050.m16203(R.string.MT_Protector, Integer.valueOf(list.size())));
        c2476.m3508();
        this.f29127 = c2476;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24259(C10523 c10523, RunnableC3319 runnableC3319) {
        C18107 c18107 = c10523.f29129;
        if (c10523.f29127.m3510()) {
            try {
                C19210.m43749(c18107.m41217(), EnumC17868.MODIFY_DIRECTORY_LINKED);
                new C11194(c10523, c10523.f29127.m3511(), c10523.f29127.m3509(), runnableC3319).m22250();
            } catch (C3924 e) {
                c18107.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m24261(C10523 c10523, RunnableC3319 runnableC3319) {
        C18107 c18107 = c10523.f29129;
        try {
            C19210.m43749(c18107.m41217(), EnumC17868.MODIFY_DIRECTORY_LINKED);
            new C11194(c10523, c10523.f29127.m3511(), c10523.f29127.m3509(), runnableC3319).m22250();
        } catch (C3924 e) {
            c18107.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
