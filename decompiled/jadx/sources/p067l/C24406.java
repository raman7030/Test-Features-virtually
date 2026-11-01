package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes.dex */
public class C24406 implements InterfaceC13285 {

    /* JADX INFO: renamed from: ֫ */
    public final C6972 f77275;

    /* JADX INFO: renamed from: ۖ */
    public C11155 f77276;

    /* JADX INFO: renamed from: ۘ */
    public final BitSet f77277;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f77278;

    /* JADX INFO: renamed from: ۡ */
    public final int f77279;

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f77280;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f77281;

    /* JADX INFO: renamed from: ܳ */
    public C11667 f77282;

    /* JADX INFO: renamed from: ܺ */
    public final IdentityHashMap f77283 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܽ */
    public boolean f77284;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f77285;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f77286;

    /* JADX INFO: renamed from: ᩴ */
    public int f77287;

    /* JADX INFO: renamed from: ᩷ */
    public final BitSet f77288;

    /* JADX INFO: renamed from: ᩻ */
    public C17700 f77289;

    public C24406(C6972 c6972) {
        this.f77275 = c6972;
        ArrayList arrayList = new ArrayList(c6972.m15971());
        arrayList.add(new C4429());
        arrayList.add(new C19852());
        arrayList.add(new C3087());
        arrayList.add(new C10464());
        arrayList.add(new C16498());
        this.f77286 = arrayList;
        List listM15970 = c6972.m15970();
        HashMap map = new HashMap();
        Object[] objArr = {new C11135(), new C5100()};
        ArrayList arrayList2 = new ArrayList(2);
        int iM25047 = 0;
        while (iM25047 < 2) {
            Object obj = objArr[iM25047];
            iM25047 = C10878.m25047(obj, arrayList2, obj, iM25047, 1);
        }
        m53822(C21562.unmodifiableList(arrayList2), map);
        m53822(listM15970, map);
        this.f77281 = map;
        ArrayList arrayList3 = new ArrayList(c6972.m15974());
        arrayList3.add(new C2416());
        this.f77280 = arrayList3;
        Set setM15972 = c6972.m15972();
        BitSet bitSet = new BitSet();
        Iterator it = setM15972.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f77288 = bitSet;
        int iM15973 = c6972.m15973();
        this.f77279 = iM15973;
        this.f77278 = iM15973 != Integer.MAX_VALUE;
        Set setKeySet = this.f77281.keySet();
        ArrayList arrayList4 = this.f77286;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC15847) it3.next()).mo5226().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.f77277 = bitSet2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53822(List list, HashMap map) {
        C24545 c24545;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2436 interfaceC2436 = (InterfaceC2436) it.next();
            char cMo3419 = interfaceC2436.mo3419();
            char cMo3416 = interfaceC2436.mo3416();
            if (cMo3419 == cMo3416) {
                InterfaceC2436 interfaceC2437 = (InterfaceC2436) map.get(Character.valueOf(cMo3419));
                if (interfaceC2437 != null && interfaceC2437.mo3419() == interfaceC2437.mo3416()) {
                    if (interfaceC2437 instanceof C24545) {
                        c24545 = (C24545) interfaceC2437;
                    } else {
                        C24545 c24546 = new C24545(cMo3419);
                        c24546.m54134(interfaceC2437);
                        c24545 = c24546;
                    }
                    c24545.m54134(interfaceC2436);
                    map.put(Character.valueOf(cMo3419), c24545);
                } else {
                    m53821(cMo3419, interfaceC2436, map);
                }
            } else {
                m53821(cMo3419, interfaceC2436, map);
                m53821(cMo3416, interfaceC2436, map);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53821(char c, InterfaceC2436 interfaceC2436, HashMap map) {
        if (((InterfaceC2436) map.put(Character.valueOf(c), interfaceC2436)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11155 m53830() {
        return this.f77276;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x022c  */
    /* JADX WARN: Code duplicated, block: B:105:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0235  */
    /* JADX WARN: Code duplicated, block: B:109:0x0237  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:113:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0244  */
    /* JADX WARN: Code duplicated, block: B:118:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0258  */
    /* JADX WARN: Code duplicated, block: B:125:0x026d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0271  */
    /* JADX WARN: Code duplicated, block: B:158:0x0341  */
    /* JADX WARN: Code duplicated, block: B:173:0x0398  */
    /* JADX WARN: Code duplicated, block: B:287:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x0122  */
    /* JADX WARN: Code duplicated, block: B:42:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x0176 A[LOOP:5: B:40:0x012c->B:50:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x017c  */
    /* JADX WARN: Code duplicated, block: B:53:0x018a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc A[LOOP:6: B:57:0x01b4->B:59:0x01bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0200  */
    /* JADX WARN: Code duplicated, block: B:84:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x021f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0224  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // p067l.InterfaceC13285
    /* JADX INFO: renamed from: ֫ */
    public void mo30351(C19201 c19201, AbstractC2555 abstractC2555) {
        List listUnmodifiableList;
        ArrayList arrayList;
        Object obj;
        C8313 c8313;
        String strM43690;
        C13678 c13678;
        AbstractC2555 abstractC2555M47858;
        AbstractC2555 abstractC2555M53820;
        String strM31482;
        String strM31483;
        String strM43691;
        List list;
        InterfaceC2436 interfaceC2436;
        int iM25728;
        C21884 c21884M25725;
        ArrayList arrayList2;
        int iM25729;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C14348 c14348;
        C17700 c17700;
        C17700 c17701;
        C21884 c21884M25726;
        Iterator it;
        C6441 c6441Mo12931;
        AbstractC2555 abstractC2555M14732;
        this.f77276 = C11155.m25715(c19201);
        int i = 1;
        this.f77284 = !c19201.m43693().isEmpty();
        int i2 = 0;
        this.f77287 = 0;
        ArrayList arrayList3 = null;
        this.f77289 = null;
        this.f77282 = null;
        this.f77283.clear();
        HashMap map = new HashMap();
        for (InterfaceC15847 interfaceC15847 : this.f77286) {
            InterfaceC18530 interfaceC18530Create = interfaceC15847.create();
            Iterator it2 = interfaceC15847.mo5226().iterator();
            while (it2.hasNext()) {
                ((List) C15525.computeIfAbsent(map, (Character) it2.next(), new C5631(i2))).add(interfaceC18530Create);
            }
        }
        this.f77285 = map;
        while (true) {
            char cM25726 = this.f77276.m25726();
            if (cM25726 == 0) {
                listUnmodifiableList = null;
            } else if (cM25726 != '\n') {
                if (cM25726 == '[') {
                    C21884 c21884M25727 = this.f77276.m25725();
                    this.f77276.m25724();
                    C21884 c21884M25728 = this.f77276.m25725();
                    C14625 c14625M53820 = m53820(this.f77276.m25719(c21884M25727, c21884M25728));
                    C11667 c11667M26809 = C11667.m26809(c14625M53820, c21884M25727, c21884M25728, this.f77282, this.f77289);
                    C11667 c11667 = this.f77282;
                    if (c11667 != null) {
                        c11667.f32542 = true;
                    }
                    this.f77282 = c11667M26809;
                    Object[] objArr = {c14625M53820};
                    arrayList = new ArrayList(1);
                    obj = objArr[0];
                } else if (cM25726 == ']') {
                    C21884 c21884M25729 = this.f77276.m25725();
                    this.f77276.m25724();
                    C21884 c21884M257210 = this.f77276.m25725();
                    C11667 c11668 = this.f77282;
                    if (c11668 == null) {
                        abstractC2555M53820 = m53820(this.f77276.m25719(c21884M25729, c21884M257210));
                    } else {
                        C14625 c14625 = c11668.f32548;
                        C21884 c21884 = c11668.f32543;
                        if (c11668.f32539) {
                            C21884 c21884M257211 = this.f77276.m25725();
                            C11155 c11155 = this.f77276;
                            if (c11155.m25727('(')) {
                                c11155.m25730();
                                char cM25727 = c11155.m25726();
                                C21884 c21884M257212 = c11155.m25725();
                                if (C9731.m22756(c11155)) {
                                    if (cM25727 == '<') {
                                        c8313 = arrayList3;
                                        strM31482 = arrayList3;
                                        strM43691 = C17073.m38720(i, i, c11155.m25719(c21884M257212, c11155.m25725()).m43690());
                                    } else {
                                        c8313 = arrayList3;
                                        strM31482 = arrayList3;
                                        strM43691 = c11155.m25719(c21884M257212, c11155.m25725()).m43690();
                                    }
                                    strM31482 = C13817.m31482(strM43691);
                                }
                                if (strM31482 != 0) {
                                    if (c11155.m25730() >= i) {
                                        C21884 c21884M257213 = c11155.m25725();
                                        if (C9731.m22759(c11155)) {
                                            String strM43692 = c11155.m25719(c21884M257213, c11155.m25725()).m43690();
                                            strM31483 = C13817.m31482(strM43692.substring(i, strM43692.length() - i));
                                        } else {
                                            strM31483 = null;
                                        }
                                        c11155.m25730();
                                    } else {
                                        strM31483 = null;
                                    }
                                    if (c11155.m25727(')')) {
                                        c8313 = new C8313(strM31482, strM31483);
                                    } else {
                                        c8313 = 0;
                                    }
                                } else {
                                    c8313 = 0;
                                }
                            }
                            if (c8313 != 0) {
                                c13678 = new C13678(c11668.f32548, this.f77276.m25719(c21884, c21884M25729).m43690(), null, c8313.f22212, c8313.f22213);
                            } else {
                                this.f77276.m25720(c21884M257211);
                                C11155 c11156 = this.f77276;
                                if (c11156.m25727('[')) {
                                    C21884 c21884M257214 = c11156.m25725();
                                    if (C9731.m22758(c11156)) {
                                        C21884 c21884M257215 = c11156.m25725();
                                        if (c11156.m25727(']')) {
                                            strM43690 = c11156.m25719(c21884M257214, c21884M257215).m43690();
                                            if (strM43690.length() > 999) {
                                                strM43690 = null;
                                            }
                                        } else {
                                            strM43690 = null;
                                        }
                                    } else {
                                        strM43690 = null;
                                    }
                                } else {
                                    strM43690 = null;
                                }
                                String str = strM43690;
                                if (str == null) {
                                    this.f77276.m25720(c21884M257211);
                                }
                                c13678 = (c11668.f32542 && (str == null || str.isEmpty()) && c14625 == null) ? null : new C13678(c11668.f32548, this.f77276.m25719(c21884, c21884M25729).m43690(), str, null, null);
                            }
                            C21884 c21885 = c11668.f32546;
                            C21884 c21886 = c11668.f32540;
                            C17700 c17702 = c11668.f32541;
                            AbstractC2555 abstractC2556 = c11668.f32544;
                            if (c13678 != null) {
                                C21884 c21884M257216 = this.f77276.m25725();
                                Iterator it3 = this.f77280.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C21194 c21194Mo3345 = ((InterfaceC8472) it3.next()).mo3345(c13678, this.f77276, this.f77275);
                                        if (C14110.m32033(c21194Mo3345)) {
                                            abstractC2555M47858 = c21194Mo3345.m47858();
                                            C21884 c21884M47859 = c21194Mo3345.m47859();
                                            boolean zM47861 = c21194Mo3345.m47861();
                                            int i3 = C15018.f42911[c21194Mo3345.m47860().ordinal()];
                                            if (i3 != 1) {
                                                if (i3 == 2) {
                                                    this.f77276.m25720(c21884M47859);
                                                    while (true) {
                                                        C17700 c17703 = this.f77289;
                                                        if (c17703 == null || c17703 == c17702) {
                                                            break;
                                                        } else {
                                                            m53828(c17703);
                                                        }
                                                    }
                                                    if (this.f77284) {
                                                        if (zM47861 && c21886 != null) {
                                                            c21885 = c21886;
                                                        }
                                                        C11155 c11157 = this.f77276;
                                                        abstractC2555M47858.m3755(c11157.m25719(c21885, c11157.m25725()).m43693());
                                                    }
                                                    m53829();
                                                    if (zM47861 && c14625 != null) {
                                                        abstractC2556 = c14625;
                                                    }
                                                    while (abstractC2556 != null) {
                                                        AbstractC2555 abstractC2555M3765 = abstractC2556.m3765();
                                                        abstractC2556.m3761();
                                                        abstractC2556 = abstractC2555M3765;
                                                    }
                                                    m53824(abstractC2555M47858, m53819(abstractC2555M47858.m3754(), (C14625) null) + 1);
                                                    if (c14625 != null && zM47861) {
                                                        break;
                                                    }
                                                    for (C11667 c11669 = this.f77282; c11669 != null; c11669 = c11669.f32547) {
                                                        if (c11669.f32548 == null) {
                                                            c11669.f32539 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else {
                                                this.f77276.m25720(c21884M47859);
                                                if (!this.f77278 || c11668.f32545 < this.f77279) {
                                                    AbstractC2555 abstractC2555M3766 = abstractC2556.m3765();
                                                    while (abstractC2555M3766 != null) {
                                                        AbstractC2555 abstractC2555M3767 = abstractC2555M3766.m3765();
                                                        abstractC2555M47858.m3756(abstractC2555M3766);
                                                        abstractC2555M3766 = abstractC2555M3767;
                                                    }
                                                    if (this.f77284) {
                                                        if (zM47861 && c21886 != null) {
                                                            c21885 = c21886;
                                                        }
                                                        C11155 c11158 = this.f77276;
                                                        abstractC2555M47858.m3755(c11158.m25719(c21885, c11158.m25725()).m43693());
                                                    }
                                                    m53826(c17702);
                                                    m53823(abstractC2555M47858);
                                                    if (zM47861 && c14625 != null) {
                                                        c14625.m3761();
                                                    }
                                                    abstractC2556.m3761();
                                                    m53829();
                                                    m53824(abstractC2555M47858, c11668.f32545 + 1);
                                                    if (c14625 != null) {
                                                        break;
                                                    }
                                                    for (C11667 c116610 = this.f77282; c116610 != null; c116610 = c116610.f32547) {
                                                        if (c116610.f32548 == null) {
                                                            c116610.f32539 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        } else {
                                            this.f77276.m25720(c21884M257216);
                                        }
                                        c13678 = c13678;
                                    }
                                    abstractC2555M47858 = null;
                                    break;
                                }
                            }
                            abstractC2555M47858 = null;
                            break;
                            if (abstractC2555M47858 != null) {
                                abstractC2555M53820 = abstractC2555M47858;
                            } else {
                                this.f77276.m25720(c21884M257210);
                                m53829();
                                abstractC2555M53820 = m53820(this.f77276.m25719(c21884M25729, c21884M257210));
                            }
                        } else {
                            m53829();
                            abstractC2555M53820 = m53820(this.f77276.m25719(c21884M25729, c21884M257210));
                        }
                    }
                    Object[] objArr2 = {abstractC2555M53820};
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    C12826.requireNonNull(obj2);
                    arrayList4.add(obj2);
                    listUnmodifiableList = C21562.unmodifiableList(arrayList4);
                } else if (this.f77288.get(cM25726)) {
                    C21884 c21884M257217 = this.f77276.m25725();
                    C21884 c21884M257218 = this.f77276.m25725();
                    this.f77276.m25724();
                    C21884 c21884M257219 = this.f77276.m25725();
                    if (this.f77276.m25727('[')) {
                        C21884 c21884M257220 = this.f77276.m25725();
                        C14625 c14625M53821 = m53820(this.f77276.m25719(c21884M257218, c21884M257219));
                        C14625 c14625M53822 = m53820(this.f77276.m25719(c21884M257219, c21884M257220));
                        C11667 c11667M26808 = C11667.m26808(c14625M53821, c21884M257218, c14625M53822, c21884M257219, c21884M257220, this.f77282, this.f77289);
                        C11667 c116611 = this.f77282;
                        if (c116611 != null) {
                            c116611.f32542 = i;
                        }
                        this.f77282 = c11667M26808;
                        Object[] objArr3 = new Object[2];
                        objArr3[i2] = c14625M53821;
                        objArr3[i] = c14625M53822;
                        ArrayList arrayList5 = new ArrayList(2);
                        int iM25047 = 0;
                        while (iM25047 < 2) {
                            Object obj3 = objArr3[iM25047];
                            iM25047 = C10878.m25047(obj3, arrayList5, obj3, iM25047, i);
                        }
                        listUnmodifiableList = C21562.unmodifiableList(arrayList5);
                    } else {
                        listUnmodifiableList = arrayList3;
                    }
                    if (listUnmodifiableList == null) {
                        this.f77276.m25720(c21884M257217);
                        if (this.f77277.get(cM25726)) {
                            list = (List) this.f77285.get(Character.valueOf(cM25726));
                            if (list != null) {
                                c21884M25726 = this.f77276.m25725();
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c6441Mo12931 = ((InterfaceC18530) it.next()).mo12931(this);
                                        if (c6441Mo12931 != null) {
                                            abstractC2555M14732 = c6441Mo12931.m14732();
                                            this.f77276.m25720(c6441Mo12931.m14733());
                                            if (this.f77284 && abstractC2555M14732.m3764().isEmpty()) {
                                                C11155 c11159 = this.f77276;
                                                abstractC2555M14732.m3755(c11159.m25719(c21884M25726, c11159.m25725()).m43693());
                                            }
                                            Object[] objArr4 = new Object[i];
                                            objArr4[i2] = abstractC2555M14732;
                                            arrayList = new ArrayList(i);
                                            obj = objArr4[i2];
                                        } else {
                                            this.f77276.m25720(c21884M25726);
                                        }
                                    } else {
                                        interfaceC2436 = (InterfaceC2436) this.f77281.get(Character.valueOf(cM25726));
                                        if (interfaceC2436 != null) {
                                            iM25728 = this.f77276.m25728();
                                            c21884M25725 = this.f77276.m25725();
                                            if (this.f77276.m25723(cM25726) < interfaceC2436.mo3418()) {
                                                this.f77276.m25720(c21884M25725);
                                                c14348 = arrayList3;
                                            } else {
                                                arrayList2 = new ArrayList();
                                                this.f77276.m25720(c21884M25725);
                                                while (this.f77276.m25727(cM25726)) {
                                                    C11155 c111510 = this.f77276;
                                                    arrayList2.add(m53820(c111510.m25719(c21884M25725, c111510.m25725())));
                                                    c21884M25725 = this.f77276.m25725();
                                                }
                                                iM25729 = this.f77276.m25729();
                                                if (iM25728 != 0 || C10685.m24614(iM25728)) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (iM25728 != 0 || C10685.m24620(iM25728)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (iM25729 != 0 || C10685.m24614(iM25729)) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (iM25729 != 0 || C10685.m24620(iM25729)) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4 && (!z3 || z2 || z)) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z2 && (!z || z4 || z3)) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (cM25726 == '_') {
                                                    if (z5 || (z6 && !z)) {
                                                        z9 = false;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    if (z6 || (z5 && !z3)) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                } else {
                                                    if (z5 || cM25726 != interfaceC2436.mo3419()) {
                                                        z7 = false;
                                                    } else {
                                                        z7 = true;
                                                    }
                                                    if (z6 || cM25726 != interfaceC2436.mo3416()) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    z9 = z7;
                                                }
                                                c14348 = new C14348(arrayList2, z9, z8);
                                            }
                                            if (c14348 != 0) {
                                                arrayList3 = c14348.f41033;
                                                c17700 = new C17700(arrayList3, cM25726, c14348.f41032, c14348.f41031, this.f77289);
                                                this.f77289 = c17700;
                                                c17701 = c17700.f52870;
                                                if (c17701 != null) {
                                                    c17701.f52868 = c17700;
                                                }
                                            }
                                            if (arrayList3 != null) {
                                                listUnmodifiableList = arrayList3;
                                            }
                                        }
                                        Object[] objArr5 = new Object[i];
                                        objArr5[i2] = m53827();
                                        arrayList = new ArrayList(i);
                                        obj = objArr5[i2];
                                    }
                                }
                            } else {
                                interfaceC2436 = (InterfaceC2436) this.f77281.get(Character.valueOf(cM25726));
                                if (interfaceC2436 != null) {
                                    iM25728 = this.f77276.m25728();
                                    c21884M25725 = this.f77276.m25725();
                                    if (this.f77276.m25723(cM25726) < interfaceC2436.mo3418()) {
                                        this.f77276.m25720(c21884M25725);
                                        c14348 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f77276.m25720(c21884M25725);
                                        while (this.f77276.m25727(cM25726)) {
                                            C11155 c111511 = this.f77276;
                                            arrayList2.add(m53820(c111511.m25719(c21884M25725, c111511.m25725())));
                                            c21884M25725 = this.f77276.m25725();
                                        }
                                        iM25729 = this.f77276.m25729();
                                        if (iM25728 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM25728 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM25729 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM25729 != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z2) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (cM25726 == '_') {
                                            if (z5) {
                                                z9 = false;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                        } else {
                                            if (z5) {
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            z9 = z7;
                                        }
                                        c14348 = new C14348(arrayList2, z9, z8);
                                    }
                                    if (c14348 != 0) {
                                        arrayList3 = c14348.f41033;
                                        c17700 = new C17700(arrayList3, cM25726, c14348.f41032, c14348.f41031, this.f77289);
                                        this.f77289 = c17700;
                                        c17701 = c17700.f52870;
                                        if (c17701 != null) {
                                            c17701.f52868 = c17700;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listUnmodifiableList = arrayList3;
                                    }
                                }
                                Object[] objArr6 = new Object[i];
                                objArr6[i2] = m53827();
                                arrayList = new ArrayList(i);
                                obj = objArr6[i2];
                            }
                        } else {
                            Object[] objArr7 = new Object[i];
                            objArr7[i2] = m53827();
                            arrayList = new ArrayList(i);
                            obj = objArr7[i2];
                        }
                    }
                } else if (this.f77277.get(cM25726)) {
                    Object[] objArr8 = new Object[i];
                    objArr8[i2] = m53827();
                    arrayList = new ArrayList(i);
                    obj = objArr8[i2];
                } else {
                    list = (List) this.f77285.get(Character.valueOf(cM25726));
                    if (list != null) {
                        c21884M25726 = this.f77276.m25725();
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c6441Mo12931 = ((InterfaceC18530) it.next()).mo12931(this);
                                if (c6441Mo12931 != null) {
                                    abstractC2555M14732 = c6441Mo12931.m14732();
                                    this.f77276.m25720(c6441Mo12931.m14733());
                                    if (this.f77284) {
                                        C11155 c111512 = this.f77276;
                                        abstractC2555M14732.m3755(c111512.m25719(c21884M25726, c111512.m25725()).m43693());
                                    }
                                    Object[] objArr9 = new Object[i];
                                    objArr9[i2] = abstractC2555M14732;
                                    arrayList = new ArrayList(i);
                                    obj = objArr9[i2];
                                } else {
                                    this.f77276.m25720(c21884M25726);
                                }
                            } else {
                                interfaceC2436 = (InterfaceC2436) this.f77281.get(Character.valueOf(cM25726));
                                if (interfaceC2436 != null) {
                                    iM25728 = this.f77276.m25728();
                                    c21884M25725 = this.f77276.m25725();
                                    if (this.f77276.m25723(cM25726) < interfaceC2436.mo3418()) {
                                        this.f77276.m25720(c21884M25725);
                                        c14348 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f77276.m25720(c21884M25725);
                                        while (this.f77276.m25727(cM25726)) {
                                            C11155 c111513 = this.f77276;
                                            arrayList2.add(m53820(c111513.m25719(c21884M25725, c111513.m25725())));
                                            c21884M25725 = this.f77276.m25725();
                                        }
                                        iM25729 = this.f77276.m25729();
                                        if (iM25728 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM25728 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM25729 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM25729 != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z2) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (cM25726 == '_') {
                                            if (z5) {
                                                z9 = false;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                        } else {
                                            if (z5) {
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            z9 = z7;
                                        }
                                        c14348 = new C14348(arrayList2, z9, z8);
                                    }
                                    if (c14348 != 0) {
                                        arrayList3 = c14348.f41033;
                                        c17700 = new C17700(arrayList3, cM25726, c14348.f41032, c14348.f41031, this.f77289);
                                        this.f77289 = c17700;
                                        c17701 = c17700.f52870;
                                        if (c17701 != null) {
                                            c17701.f52868 = c17700;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listUnmodifiableList = arrayList3;
                                    }
                                }
                                Object[] objArr10 = new Object[i];
                                objArr10[i2] = m53827();
                                arrayList = new ArrayList(i);
                                obj = objArr10[i2];
                            }
                        }
                    } else {
                        interfaceC2436 = (InterfaceC2436) this.f77281.get(Character.valueOf(cM25726));
                        if (interfaceC2436 != null) {
                            iM25728 = this.f77276.m25728();
                            c21884M25725 = this.f77276.m25725();
                            if (this.f77276.m25723(cM25726) < interfaceC2436.mo3418()) {
                                this.f77276.m25720(c21884M25725);
                                c14348 = arrayList3;
                            } else {
                                arrayList2 = new ArrayList();
                                this.f77276.m25720(c21884M25725);
                                while (this.f77276.m25727(cM25726)) {
                                    C11155 c111514 = this.f77276;
                                    arrayList2.add(m53820(c111514.m25719(c21884M25725, c111514.m25725())));
                                    c21884M25725 = this.f77276.m25725();
                                }
                                iM25729 = this.f77276.m25729();
                                if (iM25728 != 0) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                if (iM25728 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (iM25729 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (iM25729 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z4) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z2) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                if (cM25726 == '_') {
                                    if (z5) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    if (z6) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                } else {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z6) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z7;
                                }
                                c14348 = new C14348(arrayList2, z9, z8);
                            }
                            if (c14348 != 0) {
                                arrayList3 = c14348.f41033;
                                c17700 = new C17700(arrayList3, cM25726, c14348.f41032, c14348.f41031, this.f77289);
                                this.f77289 = c17700;
                                c17701 = c17700.f52870;
                                if (c17701 != null) {
                                    c17701.f52868 = c17700;
                                }
                            }
                            if (arrayList3 != null) {
                                listUnmodifiableList = arrayList3;
                            }
                        }
                        Object[] objArr11 = new Object[i];
                        objArr11[i2] = m53827();
                        arrayList = new ArrayList(i);
                        obj = objArr11[i2];
                    }
                }
                C12826.requireNonNull(obj);
                arrayList.add(obj);
                listUnmodifiableList = C21562.unmodifiableList(arrayList);
            } else {
                this.f77276.m25724();
                boolean z10 = this.f77287 >= 2;
                this.f77287 = 0;
                Object[] objArr12 = {z10 ? new C24684() : new C23343()};
                ArrayList arrayList6 = new ArrayList(1);
                Object obj4 = objArr12[0];
                C12826.requireNonNull(obj4);
                arrayList6.add(obj4);
                listUnmodifiableList = C21562.unmodifiableList(arrayList6);
            }
            if (listUnmodifiableList == null) {
                m53826((C17700) null);
                m53823(abstractC2555);
                return;
            }
            arrayList3 = null;
            Iterator it4 = listUnmodifiableList.iterator();
            while (it4.hasNext()) {
                abstractC2555.m3756((AbstractC2555) it4.next());
            }
            i2 = 0;
            i = 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14625 m53820(C19201 c19201) {
        C14625 c14625 = new C14625(c19201.m43690());
        c14625.m3755(c19201.m43693());
        return c14625;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m53829() {
        int i;
        C11667 c11667 = this.f77282;
        C11667 c11668 = c11667.f32547;
        this.f77282 = c11668;
        if (c11668 == null || (i = c11667.f32545) <= c11668.f32545) {
            return;
        }
        c11668.f32545 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    private C14625 m53827() {
        char cM25726;
        C21884 c21884M25725 = this.f77276.m25725();
        this.f77276.m25724();
        while (true) {
            cM25726 = this.f77276.m25726();
            if (cM25726 == 0 || this.f77277.get(cM25726)) {
                break;
            }
            this.f77276.m25724();
        }
        C11155 c11155 = this.f77276;
        C19201 c19201M25719 = c11155.m25719(c21884M25725, c11155.m25725());
        String strM43690 = c19201M25719.m43690();
        if (cM25726 == '\n') {
            int length = strM43690.length();
            do {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
            } while (strM43690.charAt(length) == ' ');
            int i = length + 1;
            this.f77287 = strM43690.length() - i;
            strM43690 = strM43690.substring(0, i);
        } else if (cM25726 == 0) {
            strM43690 = strM43690.substring(0, C10685.m24616(strM43690.length() - 1, 0, strM43690) + 1);
        }
        C14625 c14625 = new C14625(strM43690);
        c14625.m3755(c19201M25719.m43693());
        return c14625;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53826(C17700 c17700) {
        int i;
        boolean z;
        AbstractC2555 abstractC2555M3765;
        HashMap map = new HashMap();
        C17700 c17701 = this.f77289;
        while (c17701 != null) {
            C17700 c17702 = c17701.f52870;
            if (c17702 == c17700) {
                break;
            } else {
                c17701 = c17702;
            }
        }
        while (c17701 != null) {
            ArrayList arrayList = c17701.f52867;
            char c = c17701.f52869;
            InterfaceC2436 interfaceC2436 = (InterfaceC2436) this.f77281.get(Character.valueOf(c));
            if (!c17701.m40232() || interfaceC2436 == null) {
                c17701 = c17701.f52868;
            } else {
                C12337 c12337 = new C12337(c, (c17701.m40236() % 3) + (c17701.m40234() ? 3 : 0));
                C17700 c17703 = (C17700) map.get(c12337);
                char cMo3419 = interfaceC2436.mo3419();
                C17700 c17704 = c17701.f52870;
                C14625 c14625 = (C14625) arrayList.get(0);
                int i2 = 0;
                int iMo3417 = 0;
                while (true) {
                    if (c17704 != null && c17704 != c17700 && c17704 != c17703) {
                        if (this.f77278) {
                            int iMax = Math.max(i2, m53819(c17704.m40235().m3765(), c14625));
                            C14625 c14625M40235 = c17704.m40235();
                            if (iMax < this.f77279) {
                                i2 = iMax;
                                c14625 = c14625M40235;
                            }
                        }
                        if (c17704.m40234() && c17704.f52869 == cMo3419 && (iMo3417 = interfaceC2436.mo3417(c17704, c17701)) > 0) {
                            i = i2 + 1;
                            abstractC2555M3765 = c17704.m40235().m3765();
                            z = true;
                            break;
                        }
                        c17704 = c17704.f52870;
                    }
                    abstractC2555M3765 = null;
                    z = false;
                    i = 0;
                    break;
                }
                if (z) {
                    for (int i3 = 0; i3 < iMo3417; i3++) {
                        ((C14625) C6406.m14670(c17704.f52867, 1)).m3761();
                    }
                    for (int i4 = 0; i4 < iMo3417; i4++) {
                        ((C14625) arrayList.remove(0)).m3761();
                    }
                    C17700 c17705 = c17701.f52870;
                    while (c17705 != null && c17705 != c17704) {
                        C17700 c17706 = c17705.f52870;
                        m53828(c17705);
                        c17705 = c17706;
                    }
                    if (abstractC2555M3765 != null) {
                        m53824(abstractC2555M3765, i);
                    }
                    if (c17704.f52867.size() == 0) {
                        m53828(c17704);
                    }
                    if (arrayList.size() == 0) {
                        C17700 c17707 = c17701.f52868;
                        m53828(c17701);
                        c17701 = c17707;
                    }
                } else {
                    map.put(c12337, c17701.f52870);
                    if (!c17701.m40234()) {
                        m53828(c17701);
                    }
                    c17701 = c17701.f52868;
                }
            }
        }
        while (true) {
            C17700 c17708 = this.f77289;
            if (c17708 == null || c17708 == c17700) {
                return;
            } else {
                m53828(c17708);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53824(AbstractC2555 abstractC2555, int i) {
        if (this.f77278) {
            this.f77283.put(abstractC2555, Integer.valueOf(i));
            C11667 c11667 = this.f77282;
            if (c11667 == null || i <= c11667.f32545) {
                return;
            }
            c11667.f32545 = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m53819(AbstractC2555 abstractC2555, C14625 c14625) {
        int iIntValue = 0;
        while (abstractC2555 != null && abstractC2555 != c14625) {
            Integer num = (Integer) this.f77283.get(abstractC2555);
            if (num != null && num.intValue() > iIntValue) {
                iIntValue = num.intValue();
            }
            abstractC2555 = abstractC2555.m3765();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53828(C17700 c17700) {
        C17700 c17701 = c17700.f52870;
        if (c17701 != null) {
            c17701.f52868 = c17700.f52868;
        }
        C17700 c17702 = c17700.f52868;
        if (c17702 == null) {
            this.f77289 = c17701;
        } else {
            c17702.f52870 = c17701;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53823(AbstractC2555 abstractC2555) {
        if (abstractC2555.m3754() == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(abstractC2555);
        while (!arrayDeque.isEmpty()) {
            AbstractC2555 abstractC2556 = (AbstractC2555) arrayDeque.removeLast();
            AbstractC2555 abstractC2555M3762 = abstractC2556.m3762();
            int length = 0;
            C14625 c14625 = null;
            C14625 c14626 = null;
            for (AbstractC2555 abstractC2555M3754 = abstractC2556.m3754(); abstractC2555M3754 != null; abstractC2555M3754 = abstractC2555M3754.m3765()) {
                if (abstractC2555M3754 instanceof C14625) {
                    c14626 = (C14625) abstractC2555M3754;
                    if (c14625 == null) {
                        c14625 = c14626;
                    }
                    length = c14626.m33421().length() + length;
                } else {
                    m53825(c14625, c14626, length);
                    if (abstractC2555M3754.m3754() != null) {
                        arrayDeque.addLast(abstractC2555M3754);
                    }
                    length = 0;
                    c14625 = null;
                    c14626 = null;
                }
                if (abstractC2555M3754 == abstractC2555M3762) {
                    break;
                }
            }
            m53825(c14625, c14626, length);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53825(C14625 c14625, C14625 c14626, int i) {
        C6579 c6579;
        if (c14625 == null || c14626 == null || c14625 == c14626) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c14625.m33421());
        if (this.f77284) {
            c6579 = new C6579();
            c6579.m15033(c14625.m3764());
        } else {
            c6579 = null;
        }
        AbstractC2555 abstractC2555M3765 = c14625.m3765();
        AbstractC2555 abstractC2555M3766 = c14626.m3765();
        while (abstractC2555M3765 != abstractC2555M3766) {
            sb.append(((C14625) abstractC2555M3765).m33421());
            if (c6579 != null) {
                c6579.m15033(abstractC2555M3765.m3764());
            }
            AbstractC2555 abstractC2555M3767 = abstractC2555M3765.m3765();
            abstractC2555M3765.m3761();
            abstractC2555M3765 = abstractC2555M3767;
        }
        c14625.m33420(sb.toString());
        if (c6579 != null) {
            c14625.m3755(c6579.m15032());
        }
    }
}
