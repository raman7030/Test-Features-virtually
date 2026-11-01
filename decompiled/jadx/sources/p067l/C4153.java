package p067l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7SQ */
/* JADX INFO: loaded from: classes2.dex */
public class C4153 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public static final C4153 f9169 = new C4153();

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo5174(C24726 c24726, Object obj) throws IOException {
        m8418((AbstractC24329) obj, c24726);
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC24329 m8419(C18691 c18691, EnumC16008 enumC16008) throws IOException {
        int i = C9597.f26456[enumC16008.ordinal()];
        if (i == 1) {
            c18691.m42636();
            return new C8236();
        }
        if (i != 2) {
            return null;
        }
        c18691.m42647();
        return new C4253();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24329 m8417(C18691 c18691, EnumC16008 enumC16008) {
        int i = C9597.f26456[enumC16008.ordinal()];
        if (i == 3) {
            return new C19676(c18691.m42644());
        }
        if (i == 4) {
            return new C19676(new C15651(c18691.m42644()));
        }
        if (i == 5) {
            return new C19676(Boolean.valueOf(c18691.m42646()));
        }
        if (i == 6) {
            c18691.m42639();
            return C9577.f26370;
        }
        throw new IllegalStateException("Unexpected token: " + enumC16008);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691 instanceof C12871) {
            ((C12871) c18691).getClass();
            throw null;
        }
        EnumC16008 enumC16008M42643 = c18691.m42643();
        AbstractC24329 abstractC24329M8419 = m8419(c18691, enumC16008M42643);
        if (abstractC24329M8419 == null) {
            return m8417(c18691, enumC16008M42643);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c18691.m42649()) {
                String strM42641 = abstractC24329M8419 instanceof C4253 ? c18691.m42641() : null;
                EnumC16008 enumC16008M42644 = c18691.m42643();
                AbstractC24329 abstractC24329M84110 = m8419(c18691, enumC16008M42644);
                boolean z = abstractC24329M84110 != null;
                AbstractC24329 abstractC24329M8417 = abstractC24329M84110 == null ? m8417(c18691, enumC16008M42644) : abstractC24329M84110;
                if (abstractC24329M8419 instanceof C8236) {
                    ((C8236) abstractC24329M8419).m19012(abstractC24329M8417);
                } else {
                    ((C4253) abstractC24329M8419).m8639(strM42641, abstractC24329M8417);
                }
                if (z) {
                    arrayDeque.addLast(abstractC24329M8419);
                    abstractC24329M8419 = abstractC24329M8417;
                }
            } else {
                if (abstractC24329M8419 instanceof C8236) {
                    c18691.m42645();
                } else {
                    c18691.m42655();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC24329M8419;
                }
                abstractC24329M8419 = (AbstractC24329) arrayDeque.removeLast();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8418(AbstractC24329 abstractC24329, C24726 c24726) throws IOException {
        if (abstractC24329 != null && !(abstractC24329 instanceof C9577)) {
            if (!(abstractC24329 instanceof C19676)) {
                boolean z = abstractC24329 instanceof C8236;
                if (!z) {
                    boolean z2 = abstractC24329 instanceof C4253;
                    if (z2) {
                        c24726.m54389();
                        if (z2) {
                            for (Map.Entry entry : ((C4253) abstractC24329).m8640()) {
                                c24726.m54378((String) entry.getKey());
                                m8418((AbstractC24329) entry.getValue(), c24726);
                            }
                            c24726.m54388();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Object: " + abstractC24329);
                    }
                    throw new IllegalArgumentException("Couldn't write " + abstractC24329.getClass());
                }
                c24726.m54374();
                if (z) {
                    Iterator it = ((C8236) abstractC24329).iterator();
                    while (it.hasNext()) {
                        m8418((AbstractC24329) it.next(), c24726);
                    }
                    c24726.m54391();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + abstractC24329);
            }
            C19676 c19676M53689 = abstractC24329.m53689();
            if (c19676M53689.m44694()) {
                c24726.m54377(c19676M53689.m44695());
                return;
            } else if (c19676M53689.m44689()) {
                c24726.m54390(c19676M53689.m44692());
                return;
            } else {
                c24726.m54386(c19676M53689.mo19013());
                return;
            }
        }
        c24726.m54383();
    }
}
