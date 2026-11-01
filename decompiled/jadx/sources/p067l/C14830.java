package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14830 implements InterfaceC20816 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC20816 f42304;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p067l.InterfaceC20816
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10002(Object obj, AbstractC20461 abstractC20461) throws Throwable {
        C5443 c5443;
        Object next;
        if (abstractC20461 instanceof C5443) {
            c5443 = (C5443) abstractC20461;
            int i = c5443.f12986;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5443.f12986 = i - Integer.MIN_VALUE;
            } else {
                c5443 = new C5443(this, abstractC20461);
            }
        } else {
            c5443 = new C5443(this, abstractC20461);
        }
        Object obj2 = c5443.f12985;
        EnumC9061 enumC9061 = EnumC9061.COROUTINE_SUSPENDED;
        int i2 = c5443.f12986;
        if (i2 == 0) {
            C20086.m45502(obj2);
            Iterator it = ((C18975) obj).m43093().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC13200) next) instanceof InterfaceC16136));
            InterfaceC16136 interfaceC16136 = next instanceof InterfaceC16136 ? (InterfaceC16136) next : null;
            if (interfaceC16136 != null) {
                c5443.f12986 = 1;
                if (this.f42304.mo10002(interfaceC16136, c5443) == enumC9061) {
                    return enumC9061;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C20086.m45502(obj2);
        }
        return C10027.f27775;
    }

    public C14830(InterfaceC20816 interfaceC20816, C8125 c8125) {
        this.f42304 = interfaceC20816;
    }
}
