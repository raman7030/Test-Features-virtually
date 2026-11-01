package p067l;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۧ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AI4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13067 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f36732;

    /* JADX INFO: renamed from: ۧ */
    public C5801 f36733;

    /* JADX INFO: renamed from: ܽ */
    public final List f36734;

    /* JADX INFO: renamed from: ᩳ */
    public C18107 f36735;

    public C13067(C18107 c18107, List list) {
        boolean z;
        this.f36735 = c18107;
        this.f36734 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC19370) it.next()).isDirectory()) {
                z = true;
                this.f36732 = z;
            }
        }
        z = false;
        this.f36732 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29919(final RunnableC22455 runnableC22455) {
        List list = this.f36734;
        int size = list.size();
        C18107 c18107 = this.f36735;
        if (size == 1) {
            AbstractC18707 abstractC18707 = (AbstractC18707) ((InterfaceC19370) list.get(0));
            C5801 c5801 = new C5801(c18107.m41282(), abstractC18707.mo26440().m41069(), this.f36732, false, new Runnable() { // from class: l.ۨۜ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C13067.m29914(this.f37469, runnableC22455);
                }
            });
            c5801.m13060();
            this.f36733 = c5801;
            return;
        }
        C5801 c5802 = new C5801(c18107.m41282(), SecP521R1Field.P16, this.f36732, false, new Runnable() { // from class: l.᩺ۜ᩻
            @Override // java.lang.Runnable
            public final void run() {
                this.f76440.m29917(runnableC22455);
            }
        });
        c5802.m13060();
        this.f36733 = c5802;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m29914(C13067 c13067, RunnableC22455 runnableC22455) {
        if (c13067.f36733.m13061()) {
            c13067.m29917(runnableC22455);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m29917(RunnableC22455 runnableC22455) {
        new C4349(this, (AbstractC5375) this.f36735.m41270().mo8217(), this.f36733.m13058(), this.f36733.m13059(), runnableC22455).m22250();
    }
}
