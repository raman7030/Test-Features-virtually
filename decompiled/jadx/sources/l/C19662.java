package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O8YX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19662 implements InterfaceC19124 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Map f63494;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final LinkedHashSet f63495;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List f63496;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f63497;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f63498;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22775 f63499;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16300 f63500;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f63501;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2728 f63502;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63506;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f63509;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f63510;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f63511;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set f63514;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC5842 f63515;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f63516;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f63517;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f63513 = -1;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f63504 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f63512 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f63503 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f63508 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f63505 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9078 f63507 = new C9078(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17837 m45210(String str) {
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            m45201(i, str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (!str.isEmpty() && (i == 0 || i < str.length())) {
            m45201(i, str.substring(i));
        }
        m45200(this.f63516.size());
        InterfaceC11487 interfaceC11487Mo32166 = this.f63499.mo32166(new C4844(this.f63509, this.f63517, this.f63496, this.f63514, this.f63501, this.f63507));
        Iterator it = this.f63498.iterator();
        while (it.hasNext()) {
            ((InterfaceC2190) it.next()).mo7217(interfaceC11487Mo32166);
        }
        return this.f63502.mo7223();
    }

    static {
        int iM23073 = 0;
        Object[] objArr = {C22630.class, C6548.class, C14308.class, C20660.class, C12192.class, AbstractC18543.class, C15719.class};
        ArrayList arrayList = new ArrayList(7);
        while (iM23073 < 7) {
            Object obj = objArr[iM23073];
            iM23073 = C8954.m23073(obj, arrayList, obj, iM23073, 1);
        }
        f63495 = new LinkedHashSet(C20195.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(C22630.class, new C23894());
        map.put(C6548.class, new C1316());
        map.put(C14308.class, new C0610());
        map.put(C20660.class, new C15426());
        map.put(C12192.class, new C6402());
        map.put(AbstractC18543.class, new C1463());
        map.put(C15719.class, new C22483());
        f63494 = C20195.unmodifiableMap(map);
    }

    public C19662(ArrayList arrayList, InterfaceC22775 interfaceC22775, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, EnumC5842 enumC5842, int i, int i2) {
        ArrayList arrayList5 = new ArrayList();
        this.f63516 = arrayList5;
        this.f63498 = new ArrayList();
        this.f63510 = arrayList;
        this.f63499 = interfaceC22775;
        this.f63509 = arrayList2;
        this.f63517 = arrayList3;
        this.f63496 = arrayList4;
        this.f63514 = hashSet;
        this.f63515 = enumC5842;
        this.f63497 = i;
        this.f63501 = i2;
        C2728 c2728 = new C2728();
        this.f63502 = c2728;
        arrayList5.add(new C18956(c2728, 0));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m45204() {
        return f63495;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m45199(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC3601) f63494.get((Class) it.next()));
        }
        return arrayList2;
    }

    @Override // l.InterfaceC19124
    public final C16300 getLine() {
        return this.f63500;
    }

    @Override // l.InterfaceC19124
    public final int getIndex() {
        return this.f63504;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ᩳ */
    public final int mo44153() {
        return this.f63503;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ۧ */
    public final int mo44150() {
        return this.f63512;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ܽ */
    public final int mo44151() {
        return this.f63505;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo44149() {
        return this.f63506;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC2190 mo44152() {
        return ((C18956) C18566.m43105(this.f63516, 1)).f59787;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45201(int i, String str) {
        ArrayList arrayList;
        C21073 c21073Mo2488;
        List listM33800;
        this.f63513++;
        this.f63504 = 0;
        this.f63512 = 0;
        this.f63511 = false;
        if (str.indexOf(0) != -1) {
            str = str.replace((char) 0, (char) 65533);
        }
        this.f63500 = C16300.m38334(str, this.f63515 != EnumC5842.NONE ? C19954.m46022(this.f63513, 0, i, str.length()) : null);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            arrayList = this.f63516;
            if (i2 >= arrayList.size()) {
                break;
            }
            C18956 c18956 = (C18956) arrayList.get(i2);
            InterfaceC2190 interfaceC2190 = c18956.f59787;
            m45208();
            C14721 c14721Mo7216 = interfaceC2190.mo7216(this);
            if (!C12354.m29972(c14721Mo7216)) {
                break;
            }
            c18956.f59788 = this.f63504;
            if (c14721Mo7216.m35025()) {
                m45209();
                m45200(arrayList.size() - i2);
                return;
            }
            if (c14721Mo7216.m35024() != -1) {
                m45207(c14721Mo7216.m35024());
            } else if (c14721Mo7216.m35023() != -1) {
                m45205(c14721Mo7216.m35023());
            }
            i3++;
            i2++;
        }
        int size = arrayList.size() - i3;
        interfaceC2190 = ((C18956) arrayList.get(i3 - 1)).f59787;
        int i4 = this.f63504;
        boolean zMo7222 = (interfaceC2190.mo7223() instanceof C21365) || interfaceC2190.mo7222();
        boolean z = false;
        while (zMo7222) {
            i4 = this.f63504;
            m45208();
            if (this.f63506 || (this.f63505 < 4 && Character.isLetter(Character.codePointAt(this.f63500.m38335(), this.f63503)))) {
                m45207(this.f63503);
                break;
            }
            if (arrayList.size() > this.f63497) {
                c21073Mo2488 = null;
                break;
            }
            C4139 c4139 = new C4139(interfaceC2190);
            Iterator it = this.f63510.iterator();
            do {
                if (!it.hasNext()) {
                    c21073Mo2488 = null;
                    break;
                }
                c21073Mo2488 = ((InterfaceC3601) it.next()).mo2488(this, c4139);
            } while (!C12354.m29972(c21073Mo2488));
            if (c21073Mo2488 == null) {
                m45207(this.f63503);
                break;
            }
            int i5 = this.f63504;
            if (size > 0) {
                m45200(size);
                size = 0;
            }
            if (c21073Mo2488.m47975() != -1) {
                m45207(c21073Mo2488.m47975());
            } else if (c21073Mo2488.m47973() != -1) {
                m45205(c21073Mo2488.m47973());
            }
            if (c21073Mo2488.m47977() < 1) {
                listM33800 = null;
            } else {
                InterfaceC2190 interfaceC2190Mo44152 = mo44152();
                if (interfaceC2190Mo44152 instanceof C14162) {
                    listM33800 = ((C14162) interfaceC2190Mo44152).m33800(c21073Mo2488.m47977());
                    m45200(1);
                } else {
                    listM33800 = null;
                }
            }
            for (InterfaceC2190 interfaceC2191 : c21073Mo2488.m47972()) {
                m45202(new C18956(interfaceC2191, i5));
                if (listM33800 != null) {
                    interfaceC2191.mo7223().m1342(listM33800);
                }
                zMo7222 = interfaceC2191.mo7222();
            }
            z = true;
        }
        if (!z && !this.f63506 && mo44152().mo7225()) {
            ((C18956) C18566.m43105(arrayList, 1)).f59788 = i4;
            m45206();
            return;
        }
        if (size > 0) {
            m45200(size);
        }
        if (!interfaceC2191.mo7222()) {
            m45206();
        } else if (this.f63506) {
            m45209();
        } else {
            m45202(new C18956(new C14162(), i4));
            m45206();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45208() {
        int i = this.f63504;
        int i2 = this.f63512;
        this.f63506 = true;
        int length = this.f63500.m38335().length();
        while (i < length) {
            char cCharAt = this.f63500.m38335().charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f63506 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f63503 = i;
        this.f63508 = i2;
        this.f63505 = i2 - this.f63512;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45207(int i) {
        int i2 = this.f63503;
        if (i >= i2) {
            this.f63504 = i2;
            this.f63512 = this.f63508;
        }
        int length = this.f63500.m38335().length();
        while (true) {
            int i3 = this.f63504;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m45203();
            }
        }
        this.f63511 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45205(int i) {
        int i2;
        int i3 = this.f63508;
        if (i >= i3) {
            this.f63504 = this.f63503;
            this.f63512 = i3;
        }
        int length = this.f63500.m38335().length();
        while (true) {
            i2 = this.f63512;
            if (i2 >= i || this.f63504 == length) {
                break;
            } else {
                m45203();
            }
        }
        if (i2 > i) {
            this.f63504--;
            this.f63512 = i;
            this.f63511 = true;
            return;
        }
        this.f63511 = false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m45203() {
        char cCharAt = this.f63500.m38335().charAt(this.f63504);
        this.f63504++;
        if (cCharAt == '\t') {
            int i = this.f63512;
            this.f63512 = (4 - (i % 4)) + i;
        } else {
            this.f63512++;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m45206() {
        CharSequence charSequenceSubSequence;
        if (this.f63511) {
            CharSequence charSequenceSubSequence2 = this.f63500.m38335().subSequence(this.f63504 + 1, this.f63500.m38335().length());
            int i = 4 - (this.f63512 % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else if (this.f63504 == 0) {
            charSequenceSubSequence = this.f63500.m38335();
        } else {
            charSequenceSubSequence = this.f63500.m38335().subSequence(this.f63504, this.f63500.m38335().length());
        }
        mo44152().mo7218(C16300.m38334(charSequenceSubSequence, (this.f63515 != EnumC5842.BLOCKS_AND_INLINES || this.f63504 >= this.f63500.m38337().m46027()) ? null : this.f63500.m38337().m46024(this.f63504)));
        m45209();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m45209() {
        if (this.f63515 == EnumC5842.NONE) {
            return;
        }
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f63516;
            if (i >= arrayList.size()) {
                return;
            }
            C18956 c18956 = (C18956) arrayList.get(i);
            int iMin = Math.min(c18956.f59788, this.f63504);
            if (this.f63500.m38335().length() - iMin != 0) {
                c18956.f59787.mo7219(this.f63500.m38337().m46024(iMin));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45202(C18956 c18956) {
        while (!mo44152().mo7220(c18956.f59787.mo7223())) {
            m45200(1);
        }
        mo44152().mo7223().m1343(c18956.f59787.mo7223());
        this.f63516.add(c18956);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45200(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC2190 interfaceC2190 = ((C18956) C4248.m12790(this.f63516, 1)).f59787;
            Iterator it = interfaceC2190.mo7224().iterator();
            while (it.hasNext()) {
                this.f63507.m23435((C16425) it.next());
            }
            interfaceC2190.mo7221();
            this.f63498.add(interfaceC2190);
        }
    }
}
