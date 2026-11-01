package p067l;

import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5296 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f12454;

    /* JADX INFO: renamed from: ۧ */
    public C7978 f12455;

    /* JADX INFO: renamed from: ܽ */
    public List f12456;

    /* JADX INFO: renamed from: ᩳ */
    public C18107 f12457;

    public C5296(C18107 c18107, List list) {
        boolean z;
        this.f12457 = c18107;
        this.f12456 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory() && !interfaceC19370.mo39144()) {
                z = true;
                this.f12454 = z;
            }
        }
        z = false;
        this.f12454 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11455(final RunnableC22455 runnableC22455) {
        C18107 c18107 = this.f12457;
        final AbstractC5375 abstractC5375 = (AbstractC5375) c18107.m41270().mo8217();
        List list = this.f12456;
        if (list.size() == 1) {
            AbstractC18707 abstractC18707 = (AbstractC18707) list.get(0);
            C18028 c18028Mo26440 = abstractC18707.mo26440();
            C7978 c7978 = new C7978(c18107.m41282(), abstractC5375, c18028Mo26440.m41063(), c18028Mo26440.m41059(), this.f12454, new Runnable() { // from class: l.ܶۜ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C5296.m11451(this.f49169, abstractC5375, runnableC22455);
                }
            });
            c7978.m18480(abstractC18707.getName());
            this.f12455 = c7978;
            return;
        }
        C7978 c7979 = new C7978(c18107.m41282(), abstractC5375, null, null, this.f12454, new Runnable() { // from class: l.᩸ۜ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C5296.m11453(this.f71689, abstractC5375, runnableC22455);
            }
        });
        c7979.m18480(C7050.m16203(R.string.MT_Protector, Integer.valueOf(list.size())));
        this.f12455 = c7979;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11451(C5296 c5296, AbstractC5375 abstractC5375, RunnableC22455 runnableC22455) {
        if (c5296.f12455.m18486()) {
            new C6637(c5296, abstractC5375, c5296.f12455.m18484(), c5296.f12455.m18482(), runnableC22455).m22250();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m11453(C5296 c5296, AbstractC5375 abstractC5375, RunnableC22455 runnableC22455) {
        new C6637(c5296, abstractC5375, c5296.f12455.m18484(), c5296.f12455.m18482(), runnableC22455).m22250();
    }
}
