package p067l;

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
public final class C21055 implements InterfaceC20543 {

    /* JADX INFO: renamed from: ᩶ */
    public static final Map f66116;

    /* JADX INFO: renamed from: ᩹ */
    public static final LinkedHashSet f66117;

    /* JADX INFO: renamed from: ֡ */
    public final List f66118;

    /* JADX INFO: renamed from: ֨ */
    public final int f66119;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f66120;

    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC24013 f66121;

    /* JADX INFO: renamed from: ۘ */
    public C17859 f66122;

    /* JADX INFO: renamed from: ۚ */
    public final int f66123;

    /* JADX INFO: renamed from: ۜ */
    public final C4961 f66124;

    /* JADX INFO: renamed from: ۧ */
    public boolean f66128;

    /* JADX INFO: renamed from: ܺ */
    public final List f66131;

    /* JADX INFO: renamed from: ܽ */
    public final List f66132;

    /* JADX INFO: renamed from: ܿ */
    public boolean f66133;

    /* JADX INFO: renamed from: ᩵ */
    public final Set f66136;

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC7920 f66137;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f66138;

    /* JADX INFO: renamed from: ᩻ */
    public final List f66139;

    /* JADX INFO: renamed from: ᩴ */
    public int f66135 = -1;

    /* JADX INFO: renamed from: ۡ */
    public int f66126 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f66134 = 0;

    /* JADX INFO: renamed from: ۠ */
    public int f66125 = 0;

    /* JADX INFO: renamed from: ܶ */
    public int f66130 = 0;

    /* JADX INFO: renamed from: ۢ */
    public int f66127 = 0;

    /* JADX INFO: renamed from: ܳ */
    public final C10996 f66129 = new C10996(0);

    /* JADX INFO: renamed from: ֫ */
    public final C19320 m47507(String str) {
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
            m47498(i, str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (!str.isEmpty() && (i == 0 || i < str.length())) {
            m47498(i, str.substring(i));
        }
        m47497(this.f66138.size());
        InterfaceC13285 interfaceC13285Mo34265 = this.f66121.mo34265(new C6972(this.f66131, this.f66139, this.f66118, this.f66136, this.f66123, this.f66129));
        Iterator it = this.f66120.iterator();
        while (it.hasNext()) {
            ((InterfaceC4449) it.next()).mo9296(interfaceC13285Mo34265);
        }
        return this.f66124.mo9302();
    }

    static {
        int iM25047 = 0;
        Object[] objArr = {C23875.class, C8591.class, C15966.class, C22003.class, C13955.class, AbstractC19991.class, C17307.class};
        ArrayList arrayList = new ArrayList(7);
        while (iM25047 < 7) {
            Object obj = objArr[iM25047];
            iM25047 = C10878.m25047(obj, arrayList, obj, iM25047, 1);
        }
        f66117 = new LinkedHashSet(C21562.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(C23875.class, new C25077());
        map.put(C8591.class, new C3619());
        map.put(C15966.class, new C2948());
        map.put(C22003.class, new C17029());
        map.put(C13955.class, new C8452());
        map.put(AbstractC19991.class, new C3758());
        map.put(C17307.class, new C23736());
        f66116 = C21562.unmodifiableMap(map);
    }

    public C21055(ArrayList arrayList, InterfaceC24013 interfaceC24013, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, EnumC7920 enumC7920, int i, int i2) {
        ArrayList arrayList5 = new ArrayList();
        this.f66138 = arrayList5;
        this.f66120 = new ArrayList();
        this.f66132 = arrayList;
        this.f66121 = interfaceC24013;
        this.f66131 = arrayList2;
        this.f66139 = arrayList3;
        this.f66118 = arrayList4;
        this.f66136 = hashSet;
        this.f66137 = enumC7920;
        this.f66119 = i;
        this.f66123 = i2;
        C4961 c4961 = new C4961();
        this.f66124 = c4961;
        arrayList5.add(new C20384(c4961, 0));
    }

    /* JADX INFO: renamed from: ۢ */
    public static LinkedHashSet m47501() {
        return f66117;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m47496(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC5790) f66116.get((Class) it.next()));
        }
        return arrayList2;
    }

    @Override // p067l.InterfaceC20543
    public final C17859 getLine() {
        return this.f66122;
    }

    @Override // p067l.InterfaceC20543
    public final int getIndex() {
        return this.f66126;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ᩳ */
    public final int mo46447() {
        return this.f66125;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ۧ */
    public final int mo46444() {
        return this.f66134;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ܽ */
    public final int mo46445() {
        return this.f66127;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo46443() {
        return this.f66128;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC4449 mo46446() {
        return ((C20384) C20013.m45383(this.f66138, 1)).f63016;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX INFO: renamed from: ֫ */
    private void m47498(int i, String str) {
        ArrayList arrayList;
        C22396 c22396Mo4844;
        List listM35932;
        this.f66135++;
        this.f66126 = 0;
        this.f66134 = 0;
        this.f66133 = false;
        if (str.indexOf(0) != -1) {
            str = str.replace((char) 0, (char) 65533);
        }
        this.f66122 = C17859.m40549(str, this.f66137 != EnumC7920.NONE ? C21332.m48336(this.f66135, 0, i, str.length()) : null);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            arrayList = this.f66138;
            if (i2 >= arrayList.size()) {
                break;
            }
            C20384 c20384 = (C20384) arrayList.get(i2);
            InterfaceC4449 interfaceC4449 = c20384.f63016;
            m47505();
            C16359 c16359Mo9295 = interfaceC4449.mo9295(this);
            if (!C14110.m32033(c16359Mo9295)) {
                break;
            }
            c20384.f63017 = this.f66126;
            if (c16359Mo9295.m37172()) {
                m47506();
                m47497(arrayList.size() - i2);
                return;
            }
            if (c16359Mo9295.m37171() != -1) {
                m47504(c16359Mo9295.m37171());
            } else if (c16359Mo9295.m37170() != -1) {
                m47502(c16359Mo9295.m37170());
            }
            i3++;
            i2++;
        }
        int size = arrayList.size() - i3;
        interfaceC4449 = ((C20384) arrayList.get(i3 - 1)).f63016;
        int i4 = this.f66126;
        boolean zMo9301 = (interfaceC4449.mo9302() instanceof C22673) || interfaceC4449.mo9301();
        boolean z = false;
        while (zMo9301) {
            i4 = this.f66126;
            m47505();
            if (this.f66128 || (this.f66127 < 4 && Character.isLetter(Character.codePointAt(this.f66122.m40550(), this.f66125)))) {
                m47504(this.f66125);
                break;
            }
            if (arrayList.size() > this.f66119) {
                c22396Mo4844 = null;
                break;
            }
            C6302 c6302 = new C6302(interfaceC4449);
            Iterator it = this.f66132.iterator();
            do {
                if (!it.hasNext()) {
                    c22396Mo4844 = null;
                    break;
                }
                c22396Mo4844 = ((InterfaceC5790) it.next()).mo4844(this, c6302);
            } while (!C14110.m32033(c22396Mo4844));
            if (c22396Mo4844 == null) {
                m47504(this.f66125);
                break;
            }
            int i5 = this.f66126;
            if (size > 0) {
                m47497(size);
                size = 0;
            }
            if (c22396Mo4844.m50305() != -1) {
                m47504(c22396Mo4844.m50305());
            } else if (c22396Mo4844.m50303() != -1) {
                m47502(c22396Mo4844.m50303());
            }
            if (c22396Mo4844.m50307() < 1) {
                listM35932 = null;
            } else {
                InterfaceC4449 interfaceC4449Mo46446 = mo46446();
                if (interfaceC4449Mo46446 instanceof C15827) {
                    listM35932 = ((C15827) interfaceC4449Mo46446).m35932(c22396Mo4844.m50307());
                    m47497(1);
                } else {
                    listM35932 = null;
                }
            }
            for (InterfaceC4449 interfaceC44410 : c22396Mo4844.m50302()) {
                m47499(new C20384(interfaceC44410, i5));
                if (listM35932 != null) {
                    interfaceC44410.mo9302().m3755(listM35932);
                }
                zMo9301 = interfaceC44410.mo9301();
            }
            z = true;
        }
        if (!z && !this.f66128 && mo46446().mo9304()) {
            ((C20384) C20013.m45383(arrayList, 1)).f63017 = i4;
            m47503();
            return;
        }
        if (size > 0) {
            m47497(size);
        }
        if (!interfaceC44410.mo9301()) {
            m47503();
        } else if (this.f66128) {
            m47506();
        } else {
            m47499(new C20384(new C15827(), i4));
            m47503();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m47505() {
        int i = this.f66126;
        int i2 = this.f66134;
        this.f66128 = true;
        int length = this.f66122.m40550().length();
        while (i < length) {
            char cCharAt = this.f66122.m40550().charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f66128 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f66125 = i;
        this.f66130 = i2;
        this.f66127 = i2 - this.f66134;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m47504(int i) {
        int i2 = this.f66125;
        if (i >= i2) {
            this.f66126 = i2;
            this.f66134 = this.f66130;
        }
        int length = this.f66122.m40550().length();
        while (true) {
            int i3 = this.f66126;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m47500();
            }
        }
        this.f66133 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m47502(int i) {
        int i2;
        int i3 = this.f66130;
        if (i >= i3) {
            this.f66126 = this.f66125;
            this.f66134 = i3;
        }
        int length = this.f66122.m40550().length();
        while (true) {
            i2 = this.f66134;
            if (i2 >= i || this.f66126 == length) {
                break;
            } else {
                m47500();
            }
        }
        if (i2 > i) {
            this.f66126--;
            this.f66134 = i;
            this.f66133 = true;
            return;
        }
        this.f66133 = false;
    }

    /* JADX INFO: renamed from: ۜ */
    private void m47500() {
        char cCharAt = this.f66122.m40550().charAt(this.f66126);
        this.f66126++;
        if (cCharAt == '\t') {
            int i = this.f66134;
            this.f66134 = (4 - (i % 4)) + i;
        } else {
            this.f66134++;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m47503() {
        CharSequence charSequenceSubSequence;
        if (this.f66133) {
            CharSequence charSequenceSubSequence2 = this.f66122.m40550().subSequence(this.f66126 + 1, this.f66122.m40550().length());
            int i = 4 - (this.f66134 % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else if (this.f66126 == 0) {
            charSequenceSubSequence = this.f66122.m40550();
        } else {
            charSequenceSubSequence = this.f66122.m40550().subSequence(this.f66126, this.f66122.m40550().length());
        }
        mo46446().mo9297(C17859.m40549(charSequenceSubSequence, (this.f66137 != EnumC7920.BLOCKS_AND_INLINES || this.f66126 >= this.f66122.m40552().m48341()) ? null : this.f66122.m40552().m48338(this.f66126)));
        m47506();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m47506() {
        if (this.f66137 == EnumC7920.NONE) {
            return;
        }
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f66138;
            if (i >= arrayList.size()) {
                return;
            }
            C20384 c20384 = (C20384) arrayList.get(i);
            int iMin = Math.min(c20384.f63017, this.f66126);
            if (this.f66122.m40550().length() - iMin != 0) {
                c20384.f63016.mo9298(this.f66122.m40552().m48338(iMin));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47499(C20384 c20384) {
        while (!mo46446().mo9299(c20384.f63016.mo9302())) {
            m47497(1);
        }
        mo46446().mo9302().m3756(c20384.f63016.mo9302());
        this.f66138.add(c20384);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47497(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC4449 interfaceC4449 = ((C20384) C6406.m14670(this.f66138, 1)).f63016;
            Iterator it = interfaceC4449.mo9303().iterator();
            while (it.hasNext()) {
                this.f66129.m25381((C17978) it.next());
            }
            interfaceC4449.mo9300();
            this.f66120.add(interfaceC4449);
        }
    }
}
