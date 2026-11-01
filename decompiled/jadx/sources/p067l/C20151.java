package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57O6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20151 extends AbstractC3801 {

    /* JADX INFO: renamed from: ۜ */
    public final C21237 f62376;

    /* JADX INFO: renamed from: ܳ */
    public final C2459 f62379;

    /* JADX INFO: renamed from: ܺ */
    public final String f62380;

    /* JADX INFO: renamed from: ᩷ */
    public final int f62384;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f62381 = new HashMap();

    /* JADX INFO: renamed from: ᩴ */
    public final C23531 f62382 = C23531.m52316();

    /* JADX INFO: renamed from: ۖ */
    public final ArrayList f62374 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public int f62385 = 0;

    /* JADX INFO: renamed from: ۢ */
    public int f62378 = -1;

    /* JADX INFO: renamed from: ۘ */
    public int f62375 = 0;

    /* JADX INFO: renamed from: ۡ */
    public StringBuilder f62377 = new StringBuilder();

    /* JADX INFO: renamed from: ᩵ */
    public StringBuilder f62383 = new StringBuilder();

    public C20151(String str, C21237 c21237, C2459 c2459) {
        this.f62380 = str;
        this.f62376 = c21237;
        this.f62379 = c2459;
        this.f62384 = c21237.m47975();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45594(int i, AbstractC24083 abstractC24083) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f62381;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), ((AbstractC24083) map.get(Integer.valueOf(i))).mo18501(abstractC24083));
        } else {
            map.put(Integer.valueOf(i), abstractC24083);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45596(InterfaceC22743 interfaceC22743, InterfaceC22743 interfaceC22744) {
        this.f62382.mo6046(C15444.m35178(Integer.valueOf(m45592(interfaceC22743).getIndex()), Integer.valueOf(m45591(interfaceC22744).getIndex())));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45595(C15444 c15444, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!c15444.m35187()) {
            C21237 c21237 = this.f62376;
            int iM48472 = c21237.m48472();
            boolean z = false;
            while (true) {
                int i = this.f62385;
                if (i >= iM48472 || (!c21237.m48475(i).m35187() && ((Integer) c21237.m48475(this.f62385).m35192()).intValue() > ((Integer) c15444.m35190()).intValue())) {
                    break;
                }
                if (c21237.m48475(this.f62385).m35187()) {
                    z = true;
                }
                this.f62385++;
            }
            AbstractC24083 abstractC24083 = (AbstractC24083) C15525.getOrDefault(this.f62381, Integer.valueOf(this.f62378), AbstractC24083.f76466);
            if ((z && (str.startsWith("//") || str.startsWith("/*"))) || ((Boolean) abstractC24083.mo18500().orElse(Boolean.valueOf(z))).booleanValue()) {
                this.f62375++;
            }
        }
        if (C14695.m33620(str)) {
            int i2 = this.f62375;
            if (i2 == 0) {
                this.f62375 = i2 + 1;
            }
            this.f62383 = new StringBuilder();
        } else {
            int length = str.length();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '\t') {
                    this.f62383.append('\t');
                } else if (cCharAt == '\n') {
                    this.f62383 = new StringBuilder();
                    this.f62375++;
                } else if (cCharAt == '\r') {
                    int i4 = i3 + 1;
                    if (i4 < str.length() && str.charAt(i4) == '\n') {
                        i3 = i4;
                    }
                    this.f62383 = new StringBuilder();
                    this.f62375++;
                } else if (cCharAt == ' ') {
                    this.f62383.append(' ');
                } else {
                    while (true) {
                        int i5 = this.f62375;
                        arrayList = this.f62374;
                        if (i5 <= 0) {
                            break;
                        }
                        if (!arrayList.isEmpty() || this.f62377.length() > 0) {
                            arrayList.add(this.f62377.toString());
                        }
                        this.f62377 = new StringBuilder();
                        this.f62375--;
                        z2 = false;
                    }
                    if (this.f62383.length() > 0) {
                        this.f62377.append((CharSequence) this.f62383);
                        this.f62383 = new StringBuilder();
                    }
                    this.f62377.append(cCharAt);
                    if (!c15444.m35187() && !z2) {
                        while (true) {
                            arrayList2 = this.f67494;
                            if (arrayList2.size() > arrayList.size()) {
                                break;
                            } else {
                                arrayList2.add(C5813.f14278);
                            }
                        }
                        int size = arrayList.size();
                        C15444 c15444M35186 = (C15444) arrayList2.get(arrayList.size());
                        if (c15444M35186.m35187()) {
                            c15444M35186 = c15444;
                        } else if (!c15444.m35187()) {
                            c15444M35186 = c15444M35186.m35194(c15444).m35186(AbstractC20614.m46566());
                        }
                        arrayList2.set(size, c15444M35186);
                        z2 = true;
                    }
                }
                i3++;
            }
        }
        if (c15444.m35187()) {
            return;
        }
        this.f62378 = ((Integer) c15444.m35192()).intValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45599(int i) {
        this.f62383.append(C12229.m28206(i, " "));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45597() {
        String string = this.f62377.toString();
        boolean zMo27550 = AbstractC13375.m30519().mo27550(string);
        ArrayList arrayList = this.f62374;
        if (!zMo27550) {
            arrayList.add(string);
        }
        int size = arrayList.size();
        int i = this.f62384;
        C15444 c15444M35182 = C15444.m35182(Integer.valueOf(i), Integer.valueOf(i + 1));
        while (true) {
            ArrayList arrayList2 = this.f67494;
            if (arrayList2.size() < size) {
                arrayList2.add(C5813.f14278);
            } else {
                arrayList2.add(c15444M35182);
                m48476(AbstractC16192.copyOf((Collection) arrayList));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12685 m45598() {
        return this.f62379;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 m45593(C23531 c23531) {
        String str;
        C15444 c15444M35182;
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        HashMap mapM48471 = AbstractC21402.m48471(this);
        C23531 c23531M52316 = C23531.m52316();
        C21237 c21237 = this.f62376;
        Iterator it = ((C23531) c23531.mo6047(C15444.m35178((Integer) 0, Integer.valueOf(c21237.m47975())))).mo7746().iterator();
        while (it.hasNext()) {
            C15444 c15444M35186 = ((C15444) it.next()).m35186(AbstractC20614.m46566());
            Integer num = (Integer) c15444M35186.m35190();
            num.getClass();
            int iIntValue = ((Integer) c15444M35186.m35192()).intValue() - 1;
            C23531 c23532 = this.f62382;
            boolean zMo6048 = c23532.mo6048(num);
            C15444 c15444 = AbstractC21402.f67491;
            if (zMo6048 && c23532.mo6048(Integer.valueOf(iIntValue))) {
                Integer num2 = (Integer) c23532.mo6045(num).m35190();
                num2.getClass();
                c15444M35182 = C15444.m35182(num2, Integer.valueOf(((Integer) c23532.mo6045(Integer.valueOf(iIntValue)).m35192()).intValue() + 1));
            } else {
                c15444M35182 = c15444;
            }
            if (!c15444M35182.equals(c15444)) {
                c23531M52316.mo6046(c15444M35182);
            }
        }
        for (C15444 c15445 : (AbstractC23296) c23531M52316.mo7746()) {
            InterfaceC16706 interfaceC16706M45592 = m45592(c21237.m47976(((Integer) c15445.m35190()).intValue()));
            InterfaceC16706 interfaceC16706M45591 = m45591(c21237.m47976(((Integer) c15445.m35192()).intValue() - 1));
            StringBuilder sb = new StringBuilder();
            int position = interfaceC16706M45592.getPosition();
            while (position > 0) {
                if (!AbstractC13375.m30519().mo15183(c21237.m47974().charAt(position - 1))) {
                    break;
                }
                position--;
            }
            int iIntValue2 = ((Integer) ((C15444) mapM48471.get(Integer.valueOf(interfaceC16706M45592.getIndex()))).m35190()).intValue();
            while (iIntValue2 > 0 && m48473(iIntValue2 - 1).isEmpty()) {
                iIntValue2--;
            }
            while (true) {
                int iIntValue3 = ((Integer) ((C15444) mapM48471.get(Integer.valueOf(interfaceC16706M45591.getIndex()))).m35192()).intValue();
                str = this.f62380;
                if (iIntValue2 >= iIntValue3) {
                    break;
                }
                if (iIntValue2 < m48472()) {
                    if (iIntValue2 > 0) {
                        sb.append(str);
                    }
                    sb.append(m48473(iIntValue2));
                }
                iIntValue2++;
            }
            int iMin = Math.min(interfaceC16706M45591.length() + interfaceC16706M45591.getPosition(), c21237.m47974().length());
            if (interfaceC16706M45591.getIndex() == c21237.m47975() - 1) {
                iMin = c21237.m47974().length();
            }
            int i2 = -1;
            while (iMin < c21237.m47974().length()) {
                if (!AbstractC13375.m30519().mo15183(c21237.m47974().charAt(iMin))) {
                    break;
                }
                int iM33617 = C14695.m33617(iMin, c21237.m47974());
                if (iM33617 != -1) {
                    i2 = iMin;
                    iMin = iM33617 + iMin;
                } else {
                    iMin++;
                }
            }
            if (i2 != -1) {
                iMin = i2;
            }
            if (i2 == -1) {
                sb.append(str);
            }
            while (iIntValue2 < m48472()) {
                String strM48473 = m48473(iIntValue2);
                int iMo27549 = AbstractC13375.m30519().mo15182().mo27549(strM48473);
                if (iMo27549 != -1) {
                    if (i2 != -1) {
                        break;
                    }
                    sb.append((CharSequence) strM48473, 0, iMo27549);
                    break;
                }
                sb.append(str);
                iIntValue2++;
            }
            c4123.m18184(C6739.m15398(position, iMin, sb.toString()));
        }
        return c4123.m8329();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45590(String str, List list) {
        ArrayList<C6739> arrayList = new ArrayList(list);
        C8150.sort(arrayList, C16866.reversed(C10162.comparing(new C12809(7))));
        StringBuilder sb = new StringBuilder(str);
        for (C6739 c6739 : arrayList) {
            sb.replace(((Integer) c6739.m15399().m35190()).intValue(), ((Integer) c6739.m15399().m35192()).intValue(), c6739.m15400());
        }
        if (!str.endsWith("\n")) {
            while (sb.length() != 0 && sb.charAt(sb.length() - 1) == '\n') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC16706 m45592(InterfaceC22743 interfaceC22743) {
        AbstractC6767 abstractC6767ListIterator = interfaceC22743.mo50895().listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            InterfaceC16706 interfaceC16706 = (InterfaceC16706) abstractC6767ListIterator.next();
            if (interfaceC16706.getIndex() >= 0) {
                return interfaceC16706;
            }
        }
        return interfaceC22743.mo50894();
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC16706 m45591(InterfaceC22743 interfaceC22743) {
        InterfaceC16706 interfaceC16706;
        int size = interfaceC22743.mo50896().size();
        do {
            size--;
            if (size >= 0) {
                interfaceC16706 = (InterfaceC16706) interfaceC22743.mo50896().get(size);
            } else {
                return interfaceC22743.mo50894();
            }
        } while (interfaceC16706.getIndex() < 0);
        return interfaceC16706;
    }

    @Override // p067l.AbstractC3801, p067l.AbstractC21402
    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25085("iLine", this.f62385);
        c10888M40057.m25085("lastK", this.f62378);
        c10888M40057.m25084((Object) this.f62383.toString().replace("\t", "\\t"), "spacesPending");
        c10888M40057.m25085("newlinesPending", this.f62375);
        c10888M40057.m25084(this.f62381, "blankLines");
        c10888M40057.m25084((Object) super.toString(), "super");
        return c10888M40057.toString();
    }
}
