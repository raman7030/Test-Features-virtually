package p067l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21492 {
    /* JADX INFO: renamed from: ֫ */
    public static C21237 m48692(C21237 c21237, Collection collection) throws C19895 {
        if (!c21237.m47978().isEmpty()) {
            final C23531 c23531M47970 = c21237.m47970(collection);
            AbstractC6767 abstractC6767ListIterator = c21237.m47978().listIterator(0);
            C6097 c6097M13879 = C6097.m13879();
            while (abstractC6767ListIterator.hasNext()) {
                C23503 c23503M48693 = m48693(abstractC6767ListIterator);
                if (!c23503M48693.m52274() && C7480.stream(c23503M48693.m52269()).allMatch(new Predicate() { // from class: l.ܶۧۖ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m38062or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return c23531M47970.mo6048(Integer.valueOf(((C22578) ((InterfaceC22743) obj).mo50894()).getIndex()));
                    }
                })) {
                    ArrayList arrayList = new ArrayList();
                    int iM52270 = c23503M48693.m52270();
                    arrayList.add(c23503M48693);
                    int iM52268 = -1;
                    while (abstractC6767ListIterator.hasNext()) {
                        C23503 c23503M48694 = m48693(abstractC6767ListIterator);
                        if (c23503M48694.m52274()) {
                            break;
                        }
                        arrayList.add(c23503M48694);
                        iM52268 = c23503M48694.m52268();
                    }
                    AbstractC12093 abstractC12093M27883 = AbstractC12093.m27883();
                    abstractC12093M27883.getClass();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            if (abstractC12093M27883.compare(next, next2) > 0) {
                                ArrayList arrayListM27886 = AbstractC12093.m27883().m27886(arrayList);
                                StringBuilder sb = new StringBuilder();
                                for (int i = 0; i < arrayListM27886.size(); i++) {
                                    if (i > 0) {
                                        AbstractC6767 abstractC6767ListIterator2 = ((C23503) arrayList.get(i)).m52272().listIterator(0);
                                        while (abstractC6767ListIterator2.hasNext()) {
                                            sb.append(((InterfaceC16706) abstractC6767ListIterator2.next()).getText());
                                        }
                                    }
                                    sb.append(((C23503) arrayListM27886.get(i)).m52273());
                                    if (i < arrayListM27886.size() - 1) {
                                        AbstractC6767 abstractC6767ListIterator3 = ((C23503) arrayList.get(i)).m52271().listIterator(0);
                                        while (abstractC6767ListIterator3.hasNext()) {
                                            sb.append(((InterfaceC16706) abstractC6767ListIterator3.next()).getText());
                                        }
                                    }
                                }
                                c6097M13879.m13882(C15444.m35182(Integer.valueOf(iM52270), Integer.valueOf(iM52268)), sb.toString());
                                break;
                            }
                            next = next2;
                        }
                    }
                }
            }
            Map mapM13883 = c6097M13879.m13883();
            if (!((AbstractMap) mapM13883).isEmpty()) {
                StringBuilder sb2 = new StringBuilder(c21237.m47974());
                for (Map.Entry entry : mapM13883.entrySet()) {
                    C15444 c15444 = (C15444) entry.getKey();
                    sb2.replace(((Integer) c15444.m35190()).intValue(), ((Integer) c15444.m35192()).intValue(), (String) entry.getValue());
                }
                return new C21237(sb2.toString());
            }
        }
        return c21237;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23503 m48693(Iterator it) {
        InterfaceC22743 interfaceC22743 = (InterfaceC22743) it.next();
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        c4123.m18184(interfaceC22743);
        if (!((C22578) interfaceC22743.mo50894()).getText().equals("non")) {
            AbstractC16192 abstractC16192M8329 = c4123.m8329();
            return new C23503(abstractC16192M8329, m48690(abstractC16192M8329));
        }
        if (!it.hasNext()) {
            return new C23503(AbstractC16192.m36872of(), null);
        }
        InterfaceC22743 interfaceC22744 = (InterfaceC22743) it.next();
        c4123.m18184(interfaceC22744);
        if (!((C22578) interfaceC22744.mo50894()).getText().equals("-") || !it.hasNext()) {
            return new C23503(AbstractC16192.m36872of(), null);
        }
        c4123.m18184((InterfaceC22743) it.next());
        AbstractC16192 abstractC16192M83210 = c4123.m8329();
        return new C23503(abstractC16192M83210, m48690(abstractC16192M83210));
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC4377 m48690(AbstractC16192 abstractC16192) {
        if (abstractC16192.size() == 1) {
            return m48691((InterfaceC22743) abstractC16192.get(0));
        }
        EnumC4377 enumC4377M48691 = m48691((InterfaceC22743) C10810.m24926(abstractC16192));
        if (enumC4377M48691 == null) {
            return null;
        }
        return EnumC4377.valueOf("NON_" + enumC4377M48691.name());
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC4377 m48691(InterfaceC22743 interfaceC22743) {
        EnumC21300 enumC21300M50614 = ((C22578) interfaceC22743.mo50894()).m50614();
        if (enumC21300M50614 != null) {
            switch (C22833.f71913[enumC21300M50614.ordinal()]) {
                case 1:
                    return EnumC4377.f9835;
                case 2:
                    return EnumC4377.f9837;
                case 3:
                    return EnumC4377.f9840;
                case 4:
                    return EnumC4377.f9845;
                case 5:
                    return EnumC4377.f9846;
                case 6:
                    return EnumC4377.f9843;
                case 7:
                    return EnumC4377.f9834;
                case 8:
                    return EnumC4377.f9832;
                case 9:
                    return EnumC4377.f9838;
                case 10:
                    return EnumC4377.f9836;
                case 11:
                    return EnumC4377.f9833;
                case 12:
                    return EnumC4377.f9842;
            }
        }
        String text = ((C22578) interfaceC22743.mo50894()).getText();
        text.getClass();
        if (text.equals("sealed")) {
            return EnumC4377.valueOf("SEALED");
        }
        return null;
    }
}
