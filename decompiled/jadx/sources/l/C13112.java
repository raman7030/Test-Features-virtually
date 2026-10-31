package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13112 implements InterfaceC19410 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19410 f39252;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC19410
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7954(Object obj, AbstractC19036 abstractC19036) throws Throwable {
        C3235 c3235;
        Object next;
        if (abstractC19036 instanceof C3235) {
            c3235 = (C3235) abstractC19036;
            int i = c3235.f10179;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3235.f10179 = i - Integer.MIN_VALUE;
            } else {
                c3235 = new C3235(this, abstractC19036);
            }
        } else {
            c3235 = new C3235(this, abstractC19036);
        }
        Object obj2 = c3235.f10178;
        EnumC7041 enumC7041 = EnumC7041.COROUTINE_SUSPENDED;
        int i2 = c3235.f10179;
        if (i2 == 0) {
            C18642.m43236(obj2);
            Iterator it = ((C17473) obj).m40835().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC11397) next) instanceof InterfaceC14486));
            InterfaceC14486 interfaceC14486 = next instanceof InterfaceC14486 ? (InterfaceC14486) next : null;
            if (interfaceC14486 != null) {
                c3235.f10179 = 1;
                if (this.f39252.mo7954(interfaceC14486, c3235) == enumC7041) {
                    return enumC7041;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18642.m43236(obj2);
        }
        return C8058.f24861;
    }

    public C13112(InterfaceC19410 interfaceC19410, C6057 c6057) {
        this.f39252 = interfaceC19410;
    }
}
