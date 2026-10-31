package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12376 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f37107;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12376(C16773 c16773) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f37107 = c16773;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        C16773.f51514 = new C16415("local", null);
        c16560.m39031();
        if (c16560.m39026().m39038()) {
            c16560.m39026().m39031();
        } else {
            C15528.m36596();
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f37107);
        AbstractC16891 abstractC16891M39044 = c16560.m39026().m39044();
        if (abstractC16891M39044 instanceof C16773) {
            arrayList.add((C16773) abstractC16891M39044);
        }
        C11971<AbstractC16891> c11971M24094 = c16560.m39016().m24094();
        c11971M24094.m29245();
        try {
            for (AbstractC16891 abstractC16891 : c11971M24094) {
                if (abstractC16891 instanceof C16773) {
                    arrayList.add((C16773) abstractC16891);
                }
            }
            c11971M24094.m29244();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C16773) it.next()).f51868.m27824();
            }
            c16560.m39016().m24092();
        } catch (Throwable th) {
            c11971M24094.m29244();
            throw th;
        }
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9841() {
        return this.f37107.mo39505() && !C16773.f51514.f50492.isEmpty();
    }
}
