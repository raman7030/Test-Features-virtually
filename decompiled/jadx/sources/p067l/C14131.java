package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14131 extends AbstractC11994 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C18310 f40124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14131(C18310 c18310) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f40124 = c18310;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        C18310.f54697 = new C17969("local", null);
        c18107.m41257();
        if (c18107.m41252().m41264()) {
            c18107.m41252().m41257();
        } else {
            C17127.m38756();
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f40124);
        AbstractC18422 abstractC18422M41270 = c18107.m41252().m41270();
        if (abstractC18422M41270 instanceof C18310) {
            arrayList.add((C18310) abstractC18422M41270);
        }
        C13746<AbstractC18422> c13746M26103 = c18107.m41242().m26103();
        c13746M26103.m31299();
        try {
            for (AbstractC18422 abstractC18422 : c13746M26103) {
                if (abstractC18422 instanceof C18310) {
                    arrayList.add((C18310) abstractC18422);
                }
            }
            c13746M26103.m31298();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C18310) it.next()).f55048.m29886();
            }
            c18107.m41242().m26101();
        } catch (Throwable th) {
            c13746M26103.m31298();
            throw th;
        }
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo11888() {
        return this.f40124.mo41741() && !C18310.f54697.f53664.isEmpty();
    }
}
