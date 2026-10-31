package l;

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
public class C23188 implements InterfaceC11487 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4844 f74532;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C9246 f74533;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BitSet f74534;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f74535;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f74536;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74537;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f74538;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9784 f74539;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f74540 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f74541;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f74542;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74543;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f74544;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet f74545;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16132 f74546;

    public C23188(C4844 c4844) {
        this.f74532 = c4844;
        ArrayList arrayList = new ArrayList(c4844.m14091());
        arrayList.add(new C2169());
        arrayList.add(new C18397());
        arrayList.add(new C0757());
        arrayList.add(new C8519());
        arrayList.add(new C14868());
        this.f74543 = arrayList;
        List listM14090 = c4844.m14090();
        HashMap map = new HashMap();
        Object[] objArr = {new C9225(), new C2875()};
        ArrayList arrayList2 = new ArrayList(2);
        int iM23073 = 0;
        while (iM23073 < 2) {
            Object obj = objArr[iM23073];
            iM23073 = C8954.m23073(obj, arrayList2, obj, iM23073, 1);
        }
        m51426(C20195.unmodifiableList(arrayList2), map);
        m51426(listM14090, map);
        this.f74538 = map;
        ArrayList arrayList3 = new ArrayList(c4844.m14094());
        arrayList3.add(new C0051());
        this.f74537 = arrayList3;
        Set setM14092 = c4844.m14092();
        BitSet bitSet = new BitSet();
        Iterator it = setM14092.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f74545 = bitSet;
        int iM14093 = c4844.m14093();
        this.f74536 = iM14093;
        this.f74535 = iM14093 != Integer.MAX_VALUE;
        Set setKeySet = this.f74538.keySet();
        ArrayList arrayList4 = this.f74543;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC14183) it3.next()).mo2897().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.f74534 = bitSet2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51426(List list, HashMap map) {
        C23335 c23335;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0072 interfaceC0072 = (InterfaceC0072) it.next();
            char cMo1023 = interfaceC0072.mo1023();
            char cMo1020 = interfaceC0072.mo1020();
            if (cMo1023 == cMo1020) {
                InterfaceC0072 interfaceC0073 = (InterfaceC0072) map.get(Character.valueOf(cMo1023));
                if (interfaceC0073 != null && interfaceC0073.mo1023() == interfaceC0073.mo1020()) {
                    if (interfaceC0073 instanceof C23335) {
                        c23335 = (C23335) interfaceC0073;
                    } else {
                        C23335 c23336 = new C23335(cMo1023);
                        c23336.m51737(interfaceC0073);
                        c23335 = c23336;
                    }
                    c23335.m51737(interfaceC0072);
                    map.put(Character.valueOf(cMo1023), c23335);
                } else {
                    m51425(cMo1023, interfaceC0072, map);
                }
            } else {
                m51425(cMo1023, interfaceC0072, map);
                m51425(cMo1020, interfaceC0072, map);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51425(char c, InterfaceC0072 interfaceC0072, HashMap map) {
        if (((InterfaceC0072) map.put(Character.valueOf(c), interfaceC0072)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9246 m51434() {
        return this.f74533;
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
    @Override // l.InterfaceC11487
    /* JADX INFO: renamed from: ֫ */
    public void mo28307(C17712 c17712, AbstractC0197 abstractC0197) {
        List listUnmodifiableList;
        ArrayList arrayList;
        Object obj;
        C6255 c6255;
        String strM41444;
        C11900 c11900;
        AbstractC0197 abstractC0197M45547;
        AbstractC0197 abstractC0197M51424;
        String strM29420;
        String strM29421;
        String strM41445;
        List list;
        InterfaceC0072 interfaceC0072;
        int iM23727;
        C20535 c20535M23724;
        ArrayList arrayList2;
        int iM23728;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C12605 c12605;
        C16132 c16132;
        C16132 c16133;
        C20535 c20535M23725;
        Iterator it;
        C4286 c4286Mo10955;
        AbstractC0197 abstractC0197M12868;
        this.f74533 = C9246.m23714(c17712);
        int i = 1;
        this.f74541 = !c17712.m41447().isEmpty();
        int i2 = 0;
        this.f74544 = 0;
        ArrayList arrayList3 = null;
        this.f74546 = null;
        this.f74539 = null;
        this.f74540.clear();
        HashMap map = new HashMap();
        for (InterfaceC14183 interfaceC14183 : this.f74543) {
            InterfaceC17006 interfaceC17006Create = interfaceC14183.create();
            Iterator it2 = interfaceC14183.mo2897().iterator();
            while (it2.hasNext()) {
                ((List) C13843.computeIfAbsent(map, (Character) it2.next(), new C3433(i2))).add(interfaceC17006Create);
            }
        }
        this.f74542 = map;
        while (true) {
            char cM23725 = this.f74533.m23725();
            if (cM23725 == 0) {
                listUnmodifiableList = null;
            } else if (cM23725 != '\n') {
                if (cM23725 == '[') {
                    C20535 c20535M23726 = this.f74533.m23724();
                    this.f74533.m23723();
                    C20535 c20535M23727 = this.f74533.m23724();
                    C12897 c12897M51424 = m51424(this.f74533.m23718(c20535M23726, c20535M23727));
                    C9784 c9784M24795 = C9784.m24795(c12897M51424, c20535M23726, c20535M23727, this.f74539, this.f74546);
                    C9784 c9784 = this.f74539;
                    if (c9784 != null) {
                        c9784.f29590 = true;
                    }
                    this.f74539 = c9784M24795;
                    Object[] objArr = {c12897M51424};
                    arrayList = new ArrayList(1);
                    obj = objArr[0];
                } else if (cM23725 == ']') {
                    C20535 c20535M23728 = this.f74533.m23724();
                    this.f74533.m23723();
                    C20535 c20535M23729 = this.f74533.m23724();
                    C9784 c9785 = this.f74539;
                    if (c9785 == null) {
                        abstractC0197M51424 = m51424(this.f74533.m23718(c20535M23728, c20535M23729));
                    } else {
                        C12897 c12897 = c9785.f29596;
                        C20535 c20535 = c9785.f29591;
                        if (c9785.f29587) {
                            C20535 c20535M237210 = this.f74533.m23724();
                            C9246 c9246 = this.f74533;
                            if (c9246.m23726('(')) {
                                c9246.m23729();
                                char cM23726 = c9246.m23725();
                                C20535 c20535M237211 = c9246.m23724();
                                if (C7746.m20775(c9246)) {
                                    if (cM23726 == '<') {
                                        c6255 = arrayList3;
                                        strM29420 = arrayList3;
                                        strM41445 = C15472.m36561(i, i, c9246.m23718(c20535M237211, c9246.m23724()).m41444());
                                    } else {
                                        c6255 = arrayList3;
                                        strM29420 = arrayList3;
                                        strM41445 = c9246.m23718(c20535M237211, c9246.m23724()).m41444();
                                    }
                                    strM29420 = C12047.m29420(strM41445);
                                }
                                if (strM29420 != 0) {
                                    if (c9246.m23729() >= i) {
                                        C20535 c20535M237212 = c9246.m23724();
                                        if (C7746.m20778(c9246)) {
                                            String strM41446 = c9246.m23718(c20535M237212, c9246.m23724()).m41444();
                                            strM29421 = C12047.m29420(strM41446.substring(i, strM41446.length() - i));
                                        } else {
                                            strM29421 = null;
                                        }
                                        c9246.m23729();
                                    } else {
                                        strM29421 = null;
                                    }
                                    if (c9246.m23726(')')) {
                                        c6255 = new C6255(strM29420, strM29421);
                                    } else {
                                        c6255 = 0;
                                    }
                                } else {
                                    c6255 = 0;
                                }
                            }
                            if (c6255 != 0) {
                                c11900 = new C11900(c9785.f29596, this.f74533.m23718(c20535, c20535M23728).m41444(), null, c6255.f19348, c6255.f19349);
                            } else {
                                this.f74533.m23719(c20535M237210);
                                C9246 c9247 = this.f74533;
                                if (c9247.m23726('[')) {
                                    C20535 c20535M237213 = c9247.m23724();
                                    if (C7746.m20777(c9247)) {
                                        C20535 c20535M237214 = c9247.m23724();
                                        if (c9247.m23726(']')) {
                                            strM41444 = c9247.m23718(c20535M237213, c20535M237214).m41444();
                                            if (strM41444.length() > 999) {
                                                strM41444 = null;
                                            }
                                        } else {
                                            strM41444 = null;
                                        }
                                    } else {
                                        strM41444 = null;
                                    }
                                } else {
                                    strM41444 = null;
                                }
                                String str = strM41444;
                                if (str == null) {
                                    this.f74533.m23719(c20535M237210);
                                }
                                c11900 = (c9785.f29590 && (str == null || str.isEmpty()) && c12897 == null) ? null : new C11900(c9785.f29596, this.f74533.m23718(c20535, c20535M23728).m41444(), str, null, null);
                            }
                            C20535 c20536 = c9785.f29594;
                            C20535 c20537 = c9785.f29588;
                            C16132 c16134 = c9785.f29589;
                            AbstractC0197 abstractC0198 = c9785.f29592;
                            if (c11900 != null) {
                                C20535 c20535M237215 = this.f74533.m23724();
                                Iterator it3 = this.f74537.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C19809 c19809Mo950 = ((InterfaceC6423) it3.next()).mo950(c11900, this.f74533, this.f74532);
                                        if (C12354.m29972(c19809Mo950)) {
                                            abstractC0197M45547 = c19809Mo950.m45547();
                                            C20535 c20535M45548 = c19809Mo950.m45548();
                                            boolean zM45550 = c19809Mo950.m45550();
                                            int i3 = C13310.f39844[c19809Mo950.m45549().ordinal()];
                                            if (i3 != 1) {
                                                if (i3 == 2) {
                                                    this.f74533.m23719(c20535M45548);
                                                    while (true) {
                                                        C16132 c16135 = this.f74546;
                                                        if (c16135 == null || c16135 == c16134) {
                                                            break;
                                                        } else {
                                                            m51432(c16135);
                                                        }
                                                    }
                                                    if (this.f74541) {
                                                        if (zM45550 && c20537 != null) {
                                                            c20536 = c20537;
                                                        }
                                                        C9246 c9248 = this.f74533;
                                                        abstractC0197M45547.m1342(c9248.m23718(c20536, c9248.m23724()).m41447());
                                                    }
                                                    m51433();
                                                    if (zM45550 && c12897 != null) {
                                                        abstractC0198 = c12897;
                                                    }
                                                    while (abstractC0198 != null) {
                                                        AbstractC0197 abstractC0197M1352 = abstractC0198.m1352();
                                                        abstractC0198.m1348();
                                                        abstractC0198 = abstractC0197M1352;
                                                    }
                                                    m51428(abstractC0197M45547, m51423(abstractC0197M45547.m1341(), (C12897) null) + 1);
                                                    if (c12897 != null && zM45550) {
                                                        break;
                                                    }
                                                    for (C9784 c9786 = this.f74539; c9786 != null; c9786 = c9786.f29595) {
                                                        if (c9786.f29596 == null) {
                                                            c9786.f29587 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else {
                                                this.f74533.m23719(c20535M45548);
                                                if (!this.f74535 || c9785.f29593 < this.f74536) {
                                                    AbstractC0197 abstractC0197M1353 = abstractC0198.m1352();
                                                    while (abstractC0197M1353 != null) {
                                                        AbstractC0197 abstractC0197M1354 = abstractC0197M1353.m1352();
                                                        abstractC0197M45547.m1343(abstractC0197M1353);
                                                        abstractC0197M1353 = abstractC0197M1354;
                                                    }
                                                    if (this.f74541) {
                                                        if (zM45550 && c20537 != null) {
                                                            c20536 = c20537;
                                                        }
                                                        C9246 c9249 = this.f74533;
                                                        abstractC0197M45547.m1342(c9249.m23718(c20536, c9249.m23724()).m41447());
                                                    }
                                                    m51430(c16134);
                                                    m51427(abstractC0197M45547);
                                                    if (zM45550 && c12897 != null) {
                                                        c12897.m1348();
                                                    }
                                                    abstractC0198.m1348();
                                                    m51433();
                                                    m51428(abstractC0197M45547, c9785.f29593 + 1);
                                                    if (c12897 != null) {
                                                        break;
                                                    }
                                                    for (C9784 c9787 = this.f74539; c9787 != null; c9787 = c9787.f29595) {
                                                        if (c9787.f29596 == null) {
                                                            c9787.f29587 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        } else {
                                            this.f74533.m23719(c20535M237215);
                                        }
                                        c11900 = c11900;
                                    }
                                    abstractC0197M45547 = null;
                                    break;
                                }
                            }
                            abstractC0197M45547 = null;
                            break;
                            if (abstractC0197M45547 != null) {
                                abstractC0197M51424 = abstractC0197M45547;
                            } else {
                                this.f74533.m23719(c20535M23729);
                                m51433();
                                abstractC0197M51424 = m51424(this.f74533.m23718(c20535M23728, c20535M23729));
                            }
                        } else {
                            m51433();
                            abstractC0197M51424 = m51424(this.f74533.m23718(c20535M23728, c20535M23729));
                        }
                    }
                    Object[] objArr2 = {abstractC0197M51424};
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    C11003.requireNonNull(obj2);
                    arrayList4.add(obj2);
                    listUnmodifiableList = C20195.unmodifiableList(arrayList4);
                } else if (this.f74545.get(cM23725)) {
                    C20535 c20535M237216 = this.f74533.m23724();
                    C20535 c20535M237217 = this.f74533.m23724();
                    this.f74533.m23723();
                    C20535 c20535M237218 = this.f74533.m23724();
                    if (this.f74533.m23726('[')) {
                        C20535 c20535M237219 = this.f74533.m23724();
                        C12897 c12897M51425 = m51424(this.f74533.m23718(c20535M237217, c20535M237218));
                        C12897 c12897M51426 = m51424(this.f74533.m23718(c20535M237218, c20535M237219));
                        C9784 c9784M24794 = C9784.m24794(c12897M51425, c20535M237217, c12897M51426, c20535M237218, c20535M237219, this.f74539, this.f74546);
                        C9784 c9788 = this.f74539;
                        if (c9788 != null) {
                            c9788.f29590 = i;
                        }
                        this.f74539 = c9784M24794;
                        Object[] objArr3 = new Object[2];
                        objArr3[i2] = c12897M51425;
                        objArr3[i] = c12897M51426;
                        ArrayList arrayList5 = new ArrayList(2);
                        int iM23073 = 0;
                        while (iM23073 < 2) {
                            Object obj3 = objArr3[iM23073];
                            iM23073 = C8954.m23073(obj3, arrayList5, obj3, iM23073, i);
                        }
                        listUnmodifiableList = C20195.unmodifiableList(arrayList5);
                    } else {
                        listUnmodifiableList = arrayList3;
                    }
                    if (listUnmodifiableList == null) {
                        this.f74533.m23719(c20535M237216);
                        if (this.f74534.get(cM23725)) {
                            list = (List) this.f74542.get(Character.valueOf(cM23725));
                            if (list != null) {
                                c20535M23725 = this.f74533.m23724();
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c4286Mo10955 = ((InterfaceC17006) it.next()).mo10955(this);
                                        if (c4286Mo10955 != null) {
                                            abstractC0197M12868 = c4286Mo10955.m12868();
                                            this.f74533.m23719(c4286Mo10955.m12869());
                                            if (this.f74541 && abstractC0197M12868.m1351().isEmpty()) {
                                                C9246 c92410 = this.f74533;
                                                abstractC0197M12868.m1342(c92410.m23718(c20535M23725, c92410.m23724()).m41447());
                                            }
                                            Object[] objArr4 = new Object[i];
                                            objArr4[i2] = abstractC0197M12868;
                                            arrayList = new ArrayList(i);
                                            obj = objArr4[i2];
                                        } else {
                                            this.f74533.m23719(c20535M23725);
                                        }
                                    } else {
                                        interfaceC0072 = (InterfaceC0072) this.f74538.get(Character.valueOf(cM23725));
                                        if (interfaceC0072 != null) {
                                            iM23727 = this.f74533.m23727();
                                            c20535M23724 = this.f74533.m23724();
                                            if (this.f74533.m23722(cM23725) < interfaceC0072.mo1022()) {
                                                this.f74533.m23719(c20535M23724);
                                                c12605 = arrayList3;
                                            } else {
                                                arrayList2 = new ArrayList();
                                                this.f74533.m23719(c20535M23724);
                                                while (this.f74533.m23726(cM23725)) {
                                                    C9246 c92411 = this.f74533;
                                                    arrayList2.add(m51424(c92411.m23718(c20535M23724, c92411.m23724())));
                                                    c20535M23724 = this.f74533.m23724();
                                                }
                                                iM23728 = this.f74533.m23728();
                                                if (iM23727 != 0 || C8751.m22644(iM23727)) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (iM23727 != 0 || C8751.m22650(iM23727)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (iM23728 != 0 || C8751.m22644(iM23728)) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (iM23728 != 0 || C8751.m22650(iM23728)) {
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
                                                if (cM23725 == '_') {
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
                                                    if (z5 || cM23725 != interfaceC0072.mo1023()) {
                                                        z7 = false;
                                                    } else {
                                                        z7 = true;
                                                    }
                                                    if (z6 || cM23725 != interfaceC0072.mo1020()) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    z9 = z7;
                                                }
                                                c12605 = new C12605(arrayList2, z9, z8);
                                            }
                                            if (c12605 != 0) {
                                                arrayList3 = c12605.f38006;
                                                c16132 = new C16132(arrayList3, cM23725, c12605.f38005, c12605.f38004, this.f74546);
                                                this.f74546 = c16132;
                                                c16133 = c16132.f49704;
                                                if (c16133 != null) {
                                                    c16133.f49702 = c16132;
                                                }
                                            }
                                            if (arrayList3 != null) {
                                                listUnmodifiableList = arrayList3;
                                            }
                                        }
                                        Object[] objArr5 = new Object[i];
                                        objArr5[i2] = m51431();
                                        arrayList = new ArrayList(i);
                                        obj = objArr5[i2];
                                    }
                                }
                            } else {
                                interfaceC0072 = (InterfaceC0072) this.f74538.get(Character.valueOf(cM23725));
                                if (interfaceC0072 != null) {
                                    iM23727 = this.f74533.m23727();
                                    c20535M23724 = this.f74533.m23724();
                                    if (this.f74533.m23722(cM23725) < interfaceC0072.mo1022()) {
                                        this.f74533.m23719(c20535M23724);
                                        c12605 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f74533.m23719(c20535M23724);
                                        while (this.f74533.m23726(cM23725)) {
                                            C9246 c92412 = this.f74533;
                                            arrayList2.add(m51424(c92412.m23718(c20535M23724, c92412.m23724())));
                                            c20535M23724 = this.f74533.m23724();
                                        }
                                        iM23728 = this.f74533.m23728();
                                        if (iM23727 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM23727 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM23728 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM23728 != 0) {
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
                                        if (cM23725 == '_') {
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
                                        c12605 = new C12605(arrayList2, z9, z8);
                                    }
                                    if (c12605 != 0) {
                                        arrayList3 = c12605.f38006;
                                        c16132 = new C16132(arrayList3, cM23725, c12605.f38005, c12605.f38004, this.f74546);
                                        this.f74546 = c16132;
                                        c16133 = c16132.f49704;
                                        if (c16133 != null) {
                                            c16133.f49702 = c16132;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listUnmodifiableList = arrayList3;
                                    }
                                }
                                Object[] objArr6 = new Object[i];
                                objArr6[i2] = m51431();
                                arrayList = new ArrayList(i);
                                obj = objArr6[i2];
                            }
                        } else {
                            Object[] objArr7 = new Object[i];
                            objArr7[i2] = m51431();
                            arrayList = new ArrayList(i);
                            obj = objArr7[i2];
                        }
                    }
                } else if (this.f74534.get(cM23725)) {
                    Object[] objArr8 = new Object[i];
                    objArr8[i2] = m51431();
                    arrayList = new ArrayList(i);
                    obj = objArr8[i2];
                } else {
                    list = (List) this.f74542.get(Character.valueOf(cM23725));
                    if (list != null) {
                        c20535M23725 = this.f74533.m23724();
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c4286Mo10955 = ((InterfaceC17006) it.next()).mo10955(this);
                                if (c4286Mo10955 != null) {
                                    abstractC0197M12868 = c4286Mo10955.m12868();
                                    this.f74533.m23719(c4286Mo10955.m12869());
                                    if (this.f74541) {
                                        C9246 c92413 = this.f74533;
                                        abstractC0197M12868.m1342(c92413.m23718(c20535M23725, c92413.m23724()).m41447());
                                    }
                                    Object[] objArr9 = new Object[i];
                                    objArr9[i2] = abstractC0197M12868;
                                    arrayList = new ArrayList(i);
                                    obj = objArr9[i2];
                                } else {
                                    this.f74533.m23719(c20535M23725);
                                }
                            } else {
                                interfaceC0072 = (InterfaceC0072) this.f74538.get(Character.valueOf(cM23725));
                                if (interfaceC0072 != null) {
                                    iM23727 = this.f74533.m23727();
                                    c20535M23724 = this.f74533.m23724();
                                    if (this.f74533.m23722(cM23725) < interfaceC0072.mo1022()) {
                                        this.f74533.m23719(c20535M23724);
                                        c12605 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f74533.m23719(c20535M23724);
                                        while (this.f74533.m23726(cM23725)) {
                                            C9246 c92414 = this.f74533;
                                            arrayList2.add(m51424(c92414.m23718(c20535M23724, c92414.m23724())));
                                            c20535M23724 = this.f74533.m23724();
                                        }
                                        iM23728 = this.f74533.m23728();
                                        if (iM23727 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM23727 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM23728 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM23728 != 0) {
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
                                        if (cM23725 == '_') {
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
                                        c12605 = new C12605(arrayList2, z9, z8);
                                    }
                                    if (c12605 != 0) {
                                        arrayList3 = c12605.f38006;
                                        c16132 = new C16132(arrayList3, cM23725, c12605.f38005, c12605.f38004, this.f74546);
                                        this.f74546 = c16132;
                                        c16133 = c16132.f49704;
                                        if (c16133 != null) {
                                            c16133.f49702 = c16132;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listUnmodifiableList = arrayList3;
                                    }
                                }
                                Object[] objArr10 = new Object[i];
                                objArr10[i2] = m51431();
                                arrayList = new ArrayList(i);
                                obj = objArr10[i2];
                            }
                        }
                    } else {
                        interfaceC0072 = (InterfaceC0072) this.f74538.get(Character.valueOf(cM23725));
                        if (interfaceC0072 != null) {
                            iM23727 = this.f74533.m23727();
                            c20535M23724 = this.f74533.m23724();
                            if (this.f74533.m23722(cM23725) < interfaceC0072.mo1022()) {
                                this.f74533.m23719(c20535M23724);
                                c12605 = arrayList3;
                            } else {
                                arrayList2 = new ArrayList();
                                this.f74533.m23719(c20535M23724);
                                while (this.f74533.m23726(cM23725)) {
                                    C9246 c92415 = this.f74533;
                                    arrayList2.add(m51424(c92415.m23718(c20535M23724, c92415.m23724())));
                                    c20535M23724 = this.f74533.m23724();
                                }
                                iM23728 = this.f74533.m23728();
                                if (iM23727 != 0) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                if (iM23727 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (iM23728 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (iM23728 != 0) {
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
                                if (cM23725 == '_') {
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
                                c12605 = new C12605(arrayList2, z9, z8);
                            }
                            if (c12605 != 0) {
                                arrayList3 = c12605.f38006;
                                c16132 = new C16132(arrayList3, cM23725, c12605.f38005, c12605.f38004, this.f74546);
                                this.f74546 = c16132;
                                c16133 = c16132.f49704;
                                if (c16133 != null) {
                                    c16133.f49702 = c16132;
                                }
                            }
                            if (arrayList3 != null) {
                                listUnmodifiableList = arrayList3;
                            }
                        }
                        Object[] objArr11 = new Object[i];
                        objArr11[i2] = m51431();
                        arrayList = new ArrayList(i);
                        obj = objArr11[i2];
                    }
                }
                C11003.requireNonNull(obj);
                arrayList.add(obj);
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
            } else {
                this.f74533.m23723();
                boolean z10 = this.f74544 >= 2;
                this.f74544 = 0;
                Object[] objArr12 = {z10 ? new C23481() : new C22070()};
                ArrayList arrayList6 = new ArrayList(1);
                Object obj4 = objArr12[0];
                C11003.requireNonNull(obj4);
                arrayList6.add(obj4);
                listUnmodifiableList = C20195.unmodifiableList(arrayList6);
            }
            if (listUnmodifiableList == null) {
                m51430((C16132) null);
                m51427(abstractC0197);
                return;
            }
            arrayList3 = null;
            Iterator it4 = listUnmodifiableList.iterator();
            while (it4.hasNext()) {
                abstractC0197.m1343((AbstractC0197) it4.next());
            }
            i2 = 0;
            i = 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12897 m51424(C17712 c17712) {
        C12897 c12897 = new C12897(c17712.m41444());
        c12897.m1342(c17712.m41447());
        return c12897;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51433() {
        int i;
        C9784 c9784 = this.f74539;
        C9784 c9785 = c9784.f29595;
        this.f74539 = c9785;
        if (c9785 == null || (i = c9784.f29593) <= c9785.f29593) {
            return;
        }
        c9785.f29593 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C12897 m51431() {
        char cM23725;
        C20535 c20535M23724 = this.f74533.m23724();
        this.f74533.m23723();
        while (true) {
            cM23725 = this.f74533.m23725();
            if (cM23725 == 0 || this.f74534.get(cM23725)) {
                break;
            }
            this.f74533.m23723();
        }
        C9246 c9246 = this.f74533;
        C17712 c17712M23718 = c9246.m23718(c20535M23724, c9246.m23724());
        String strM41444 = c17712M23718.m41444();
        if (cM23725 == '\n') {
            int length = strM41444.length();
            do {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
            } while (strM41444.charAt(length) == ' ');
            int i = length + 1;
            this.f74544 = strM41444.length() - i;
            strM41444 = strM41444.substring(0, i);
        } else if (cM23725 == 0) {
            strM41444 = strM41444.substring(0, C8751.m22646(strM41444.length() - 1, 0, strM41444) + 1);
        }
        C12897 c12897 = new C12897(strM41444);
        c12897.m1342(c17712M23718.m41447());
        return c12897;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51430(C16132 c16132) {
        int i;
        boolean z;
        AbstractC0197 abstractC0197M1352;
        HashMap map = new HashMap();
        C16132 c16133 = this.f74546;
        while (c16133 != null) {
            C16132 c16134 = c16133.f49704;
            if (c16134 == c16132) {
                break;
            } else {
                c16133 = c16134;
            }
        }
        while (c16133 != null) {
            ArrayList arrayList = c16133.f49701;
            char c = c16133.f49703;
            InterfaceC0072 interfaceC0072 = (InterfaceC0072) this.f74538.get(Character.valueOf(c));
            if (!c16133.m38040() || interfaceC0072 == null) {
                c16133 = c16133.f49702;
            } else {
                C10489 c10489 = new C10489(c, (c16133.m38044() % 3) + (c16133.m38042() ? 3 : 0));
                C16132 c16135 = (C16132) map.get(c10489);
                char cMo1023 = interfaceC0072.mo1023();
                C16132 c16136 = c16133.f49704;
                C12897 c12897 = (C12897) arrayList.get(0);
                int i2 = 0;
                int iMo1021 = 0;
                while (true) {
                    if (c16136 != null && c16136 != c16132 && c16136 != c16135) {
                        if (this.f74535) {
                            int iMax = Math.max(i2, m51423(c16136.m38043().m1352(), c12897));
                            C12897 c12897M38043 = c16136.m38043();
                            if (iMax < this.f74536) {
                                i2 = iMax;
                                c12897 = c12897M38043;
                            }
                        }
                        if (c16136.m38042() && c16136.f49703 == cMo1023 && (iMo1021 = interfaceC0072.mo1021(c16136, c16133)) > 0) {
                            i = i2 + 1;
                            abstractC0197M1352 = c16136.m38043().m1352();
                            z = true;
                            break;
                        }
                        c16136 = c16136.f49704;
                    }
                    abstractC0197M1352 = null;
                    z = false;
                    i = 0;
                    break;
                }
                if (z) {
                    for (int i3 = 0; i3 < iMo1021; i3++) {
                        ((C12897) C4248.m12790(c16136.f49701, 1)).m1348();
                    }
                    for (int i4 = 0; i4 < iMo1021; i4++) {
                        ((C12897) arrayList.remove(0)).m1348();
                    }
                    C16132 c16137 = c16133.f49704;
                    while (c16137 != null && c16137 != c16136) {
                        C16132 c16138 = c16137.f49704;
                        m51432(c16137);
                        c16137 = c16138;
                    }
                    if (abstractC0197M1352 != null) {
                        m51428(abstractC0197M1352, i);
                    }
                    if (c16136.f49701.size() == 0) {
                        m51432(c16136);
                    }
                    if (arrayList.size() == 0) {
                        C16132 c16139 = c16133.f49702;
                        m51432(c16133);
                        c16133 = c16139;
                    }
                } else {
                    map.put(c10489, c16133.f49704);
                    if (!c16133.m38042()) {
                        m51432(c16133);
                    }
                    c16133 = c16133.f49702;
                }
            }
        }
        while (true) {
            C16132 c161310 = this.f74546;
            if (c161310 == null || c161310 == c16132) {
                return;
            } else {
                m51432(c161310);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51428(AbstractC0197 abstractC0197, int i) {
        if (this.f74535) {
            this.f74540.put(abstractC0197, Integer.valueOf(i));
            C9784 c9784 = this.f74539;
            if (c9784 == null || i <= c9784.f29593) {
                return;
            }
            c9784.f29593 = i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m51423(AbstractC0197 abstractC0197, C12897 c12897) {
        int iIntValue = 0;
        while (abstractC0197 != null && abstractC0197 != c12897) {
            Integer num = (Integer) this.f74540.get(abstractC0197);
            if (num != null && num.intValue() > iIntValue) {
                iIntValue = num.intValue();
            }
            abstractC0197 = abstractC0197.m1352();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51432(C16132 c16132) {
        C16132 c16133 = c16132.f49704;
        if (c16133 != null) {
            c16133.f49702 = c16132.f49702;
        }
        C16132 c16134 = c16132.f49702;
        if (c16134 == null) {
            this.f74546 = c16133;
        } else {
            c16134.f49704 = c16133;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51427(AbstractC0197 abstractC0197) {
        if (abstractC0197.m1341() == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(abstractC0197);
        while (!arrayDeque.isEmpty()) {
            AbstractC0197 abstractC0198 = (AbstractC0197) arrayDeque.removeLast();
            AbstractC0197 abstractC0197M1349 = abstractC0198.m1349();
            int length = 0;
            C12897 c12897 = null;
            C12897 c12898 = null;
            for (AbstractC0197 abstractC0197M1341 = abstractC0198.m1341(); abstractC0197M1341 != null; abstractC0197M1341 = abstractC0197M1341.m1352()) {
                if (abstractC0197M1341 instanceof C12897) {
                    c12898 = (C12897) abstractC0197M1341;
                    if (c12897 == null) {
                        c12897 = c12898;
                    }
                    length = c12898.m31335().length() + length;
                } else {
                    m51429(c12897, c12898, length);
                    if (abstractC0197M1341.m1341() != null) {
                        arrayDeque.addLast(abstractC0197M1341);
                    }
                    length = 0;
                    c12897 = null;
                    c12898 = null;
                }
                if (abstractC0197M1341 == abstractC0197M1349) {
                    break;
                }
            }
            m51429(c12897, c12898, length);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51429(C12897 c12897, C12897 c12898, int i) {
        C4431 c4431;
        if (c12897 == null || c12898 == null || c12897 == c12898) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c12897.m31335());
        if (this.f74541) {
            c4431 = new C4431();
            c4431.m13152(c12897.m1351());
        } else {
            c4431 = null;
        }
        AbstractC0197 abstractC0197M1352 = c12897.m1352();
        AbstractC0197 abstractC0197M1353 = c12898.m1352();
        while (abstractC0197M1352 != abstractC0197M1353) {
            sb.append(((C12897) abstractC0197M1352).m31335());
            if (c4431 != null) {
                c4431.m13152(abstractC0197M1352.m1351());
            }
            AbstractC0197 abstractC0197M1354 = abstractC0197M1352.m1352();
            abstractC0197M1352.m1348();
            abstractC0197M1352 = abstractC0197M1354;
        }
        c12897.m31334(sb.toString());
        if (c4431 != null) {
            c12897.m1342(c4431.m13151());
        }
    }
}
