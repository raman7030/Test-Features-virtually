package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ᩴ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes5.dex */
public final class C18968 extends C19842 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43799(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public C18968(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m43802() {
        int i;
        int i2;
        boolean zM45644 = m45644();
        String str = this.f64100;
        if (zM45644) {
            i2 = this.f64103;
        } else {
            int i3 = this.f64103;
            int iCharAt = str.charAt(i3);
            if (iCharAt == 45) {
                iCharAt = m45637();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i3;
            } else {
                int iM45637 = m45637();
                while (true) {
                    if ((iM45637 < 65 || iM45637 > 90) && ((iM45637 < 97 || iM45637 > 122) && !((iM45637 >= 48 && iM45637 <= 57) || iM45637 == 45 || iM45637 == 95))) {
                        break;
                    }
                    iM45637 = m45637();
                }
                i = this.f64103;
            }
            this.f64103 = i3;
            i2 = i;
        }
        int i4 = this.f64103;
        if (i2 == i4) {
            return null;
        }
        String strSubstring = str.substring(i4, i2);
        this.f64103 = i2;
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:245:0x040d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0411  */
    /* JADX WARN: Code duplicated, block: B:251:0x0424  */
    /* JADX WARN: Code duplicated, block: B:256:0x0439  */
    /* JADX WARN: Code duplicated, block: B:272:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x042e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [l.ۖ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v16, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v17, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v18, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v19, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [l.ۘ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.᩵᩵ܺ] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList m43798() throws C9090 {
        ArrayList arrayList;
        ?? r7;
        ?? r5;
        ?? c6267;
        ?? r11;
        EnumC2740 enumC2740;
        EnumC2740 enumC2741;
        ?? r12;
        String strM45645;
        ?? M43802;
        EnumC2740 enumC2742;
        int i;
        int i2;
        C14027 c14027M33642;
        C14027 c14027;
        C4151 c4151;
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? arrayList4 = 0;
        if (m45644()) {
            return null;
        }
        int i3 = 1;
        ArrayList arrayList5 = new ArrayList(1);
        boolean z = false;
        C10501 c10501 = new C10501(0);
        while (!m45644() && !m45644()) {
            int i4 = this.f64103;
            ArrayList arrayList6 = c10501.f31498;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                r7 = arrayList4;
            } else if (m45640('>')) {
                EnumC19674 enumC19674 = EnumC19674.CHILD;
                m45643();
                r7 = enumC19674;
            } else if (m45640('+')) {
                EnumC19674 enumC19675 = EnumC19674.FOLLOWS;
                m45643();
                r7 = enumC19675;
            } else {
                r7 = arrayList4;
            }
            if (m45640('*')) {
                c6267 = new C6267(r7, arrayList4);
                r5 = i3;
            } else {
                String strM43802 = m43802();
                if (strM43802 != null) {
                    C6267 c6268 = new C6267(r7, strM43802);
                    c10501.f31499 += i3;
                    r5 = i3;
                    c6267 = c6268;
                } else {
                    r5 = i3;
                    c6267 = arrayList4;
                }
            }
            while (!m45644()) {
                if (m45640('.')) {
                    if (c6267 == 0) {
                        c6267 = new C6267(r7, arrayList4);
                    }
                    String strM43803 = m43802();
                    if (strM43803 == null) {
                        throw new C9090("Invalid \".class\" simpleSelectors");
                    }
                    c6267.m17277(Name.LABEL, EnumC2740.EQUALS, strM43803);
                    c10501.m26402();
                } else if (m45640('#')) {
                    if (c6267 == 0) {
                        c6267 = new C6267(r7, arrayList4);
                    }
                    String strM43804 = m43802();
                    if (strM43804 == null) {
                        throw new C9090("Invalid \"#id\" simpleSelectors");
                    }
                    c6267.m17277("id", EnumC2740.EQUALS, strM43804);
                    c10501.f31499 += BasicLabelFormatter.MILLION;
                } else if (m45640('[')) {
                    if (c6267 == 0) {
                        c6267 = new C6267(r7, arrayList4);
                    }
                    m45643();
                    String strM43805 = m43802();
                    if (strM43805 == null) {
                        throw new C9090("Invalid attribute simpleSelectors");
                    }
                    m45643();
                    if (m45640(a.h)) {
                        enumC2742 = EnumC2740.EQUALS;
                    } else if (m45641("~=")) {
                        enumC2741 = EnumC2740.INCLUDES;
                    } else if (m45641("|=")) {
                        enumC2740 = EnumC2740.DASHMATCH;
                    } else {
                        r11 = arrayList4;
                    }
                    if (r11 != 0) {
                        r11 = enumC2740;
                        r11 = enumC2741;
                        m45643();
                        if (m45644()) {
                            M43802 = arrayList4;
                        } else {
                            strM45645 = m45645();
                            if (strM45645 == null) {
                                r11 = enumC2742;
                                M43802 = strM45645;
                                M43802 = m43802();
                            }
                        }
                        if (M43802 == 0) {
                            r11 = enumC2742;
                            throw new C9090("Invalid attribute simpleSelectors");
                        }
                        r11 = enumC2742;
                        m45643();
                        r12 = M43802;
                    } else {
                        r11 = enumC2740;
                        r11 = enumC2741;
                        r11 = enumC2742;
                        r12 = arrayList4;
                    }
                    ?? r13 = r11;
                    if (!m45640(']')) {
                        throw new C9090("Invalid attribute simpleSelectors");
                    }
                    if (r11 == 0) {
                        r13 = EnumC2740.EXISTS;
                    }
                    c6267.m17277(strM43805, r13, r12);
                    c10501.m26402();
                } else {
                    c6267 = c6267;
                    if (m45640(':')) {
                        if (c6267 == 0) {
                            c6267 = new C6267(r7, arrayList4);
                        }
                        String strM43806 = m43802();
                        if (strM43806 == null) {
                            throw new C9090("Invalid pseudo class");
                        }
                        EnumC15438 enumC15438M36485 = EnumC15438.m36485(strM43806);
                        switch (enumC15438M36485.ordinal()) {
                            case 0:
                                C3445 c3445 = new C3445();
                                c10501.m26402();
                                obj2 = c3445;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 1:
                                C4856 c4856 = new C4856();
                                c10501.m26402();
                                obj2 = c4856;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z2 = enumC15438M36485 == EnumC15438.nth_child || enumC15438M36485 == EnumC15438.nth_of_type;
                                boolean z3 = enumC15438M36485 == EnumC15438.nth_of_type || enumC15438M36485 == EnumC15438.nth_last_of_type;
                                ?? r3 = arrayList4;
                                if (!m45644()) {
                                    int i5 = this.f64103;
                                    if (m45640('(')) {
                                        m45643();
                                        if (m45641("odd")) {
                                            r3 = arrayList4;
                                            c4151 = new C4151(2, r5 == true ? 1 : 0);
                                        } else if (m45641("even")) {
                                            r3 = arrayList4;
                                            c4151 = new C4151(2, z ? 1 : 0);
                                        } else {
                                            if (!m45640('+') && m45640('-')) {
                                                r3 = arrayList4;
                                                i = -1;
                                            } else {
                                                r3 = arrayList4;
                                                r3 = arrayList4;
                                                i = 1;
                                            }
                                            int i6 = this.f64103;
                                            int i7 = this.f64101;
                                            String str = this.f64100;
                                            C14027 c14027M33643 = C14027.m33642(i6, i7, str);
                                            if (c14027M33643 != null) {
                                                this.f64103 = c14027M33643.m33643();
                                            }
                                            if (m45640('n') || m45640('N')) {
                                                if (c14027M33643 == null) {
                                                    c14027M33643 = new C14027(this.f64103, 1L);
                                                }
                                                m45643();
                                                boolean zM45640 = m45640('+');
                                                i2 = (zM45640 || !(zM45640 = m45640('-'))) ? 1 : -1;
                                                if (zM45640) {
                                                    m45643();
                                                    c14027M33642 = C14027.m33642(this.f64103, i7, str);
                                                    if (c14027M33642 != null) {
                                                        this.f64103 = c14027M33642.m33643();
                                                    } else {
                                                        this.f64103 = i5;
                                                    }
                                                    r3 = 0;
                                                } else {
                                                    c14027M33642 = null;
                                                }
                                                C14027 c14028 = c14027M33642;
                                                c14027 = c14027M33643;
                                                c14027M33643 = c14028;
                                            } else {
                                                c14027 = null;
                                                i2 = i;
                                                i = 1;
                                            }
                                            c4151 = new C4151(c14027 == null ? 0 : i * c14027.m33644(), c14027M33643 == null ? 0 : c14027M33643.m33644() * i2);
                                        }
                                        m45643();
                                        r3 = c4151;
                                        if (!m45640(')')) {
                                            this.f64103 = i5;
                                            r3 = 0;
                                        }
                                    }
                                }
                                if (r3 == 0) {
                                    throw new C9090("Invalid or missing parameter section for pseudo class: ".concat(strM43806));
                                }
                                C1328 c1328 = new C1328(c6267.f19409, r3.f13557, r3.f13558, z2, z3);
                                c10501.m26402();
                                obj = c1328;
                                obj2 = obj;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 6:
                                C1328 c1329 = new C1328(null, 0, 1, true, false);
                                c10501.m26402();
                                obj2 = c1329;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 7:
                                C1328 c13210 = new C1328(null, 0, 1, false, false);
                                c10501.m26402();
                                obj2 = c13210;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 8:
                                C1328 c13211 = new C1328(c6267.f19409, 0, 1, true, true);
                                c10501.m26402();
                                obj2 = c13211;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 9:
                                C1328 c13212 = new C1328(c6267.f19409, 0, 1, false, true);
                                c10501.m26402();
                                obj2 = c13212;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 10:
                                C20379 c20379 = new C20379(z, arrayList4);
                                c10501.m26402();
                                obj = c20379;
                                obj2 = obj;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 11:
                                C20379 c203710 = new C20379(r5, c6267.f19409);
                                c10501.m26402();
                                obj2 = c203710;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 12:
                                C8384 c8384 = new C8384();
                                c10501.m26402();
                                obj2 = c8384;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 13:
                                if (!m45644()) {
                                    int i8 = this.f64103;
                                    if (m45640('(')) {
                                        m45643();
                                        ArrayList arrayListM43798 = m43798();
                                        if (arrayListM43798 != null && m45640(')')) {
                                            Iterator it = arrayListM43798.iterator();
                                            while (true) {
                                                if (!it.hasNext() || (arrayList2 = ((C10501) it.next()).f31498) == null) {
                                                    arrayList4 = arrayListM43798;
                                                } else {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext() && (arrayList3 = ((C6267) it2.next()).f19408) != null) {
                                                            Iterator it3 = arrayList3.iterator();
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    if (((InterfaceC5562) it3.next()) instanceof C21790) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f64103 = i8;
                                        }
                                    }
                                }
                                if (arrayList4 == 0) {
                                    throw new C9090("Invalid or missing parameter section for pseudo class: ".concat(strM43806));
                                }
                                C21790 c21790 = new C21790(arrayList4);
                                c10501.f31499 = c21790.m49127();
                                obj = c21790;
                                obj2 = obj;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 14:
                                if (!m45644()) {
                                    int i9 = this.f64103;
                                    if (m45640('(')) {
                                        m45643();
                                        while (true) {
                                            String strM43807 = m43802();
                                            arrayList4 = arrayList4;
                                            if (strM43807 == null) {
                                                this.f64103 = i9;
                                            } else {
                                                if (arrayList4 == 0) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(strM43807);
                                                m45643();
                                                if (!m45649()) {
                                                    if (!m45640(')')) {
                                                        this.f64103 = i9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C22495 c22495 = new C22495(strM43806);
                                c10501.m26402();
                                obj2 = c22495;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                C22495 c22496 = new C22495(strM43806);
                                c10501.m26402();
                                obj2 = c22496;
                                if (c6267.f19408 == null) {
                                    c6267.f19408 = new ArrayList();
                                }
                                c6267.f19408.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            default:
                                throw new C9090("Unsupported pseudo class: ".concat(strM43806));
                        }
                    } else {
                        if (c6267 != 0) {
                            this.f64103 = i4;
                            arrayList = c10501.f31498;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList5.add(c10501);
                            }
                            return arrayList5;
                        }
                        if (c10501.f31498 == null) {
                            c10501.f31498 = new ArrayList();
                        }
                        c10501.f31498.add(c6267);
                        if (!m45649()) {
                            arrayList5.add(c10501);
                            c10501 = new C10501(0);
                        }
                        arrayList4 = 0;
                        i3 = 1;
                        z = false;
                    }
                }
            }
            if (c6267 != 0) {
                this.f64103 = i4;
                arrayList = c10501.f31498;
                if (arrayList != null) {
                    arrayList5.add(c10501);
                }
                return arrayList5;
            }
            if (c10501.f31498 == null) {
                c10501.f31498 = new ArrayList();
            }
            c10501.f31498.add(c6267);
            if (!m45649()) {
                arrayList5.add(c10501);
                c10501 = new C10501(0);
            }
            arrayList4 = 0;
            i3 = 1;
            z = false;
        }
        arrayList = c10501.f31498;
        if (arrayList != null) {
            arrayList5.add(c10501);
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m43801() {
        int iM43799;
        if (m45644()) {
            return null;
        }
        char cCharAt = this.f64100.charAt(this.f64103);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.f64103++;
        int iIntValue = m45646().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = m45646().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = m45646().intValue();
                    } else {
                        int iM437910 = m43799(iIntValue);
                        if (iM437910 != -1) {
                            for (int i = 1; i <= 5 && (iM43799 = m43799((iIntValue = m45646().intValue()))) != -1; i++) {
                                iM437910 = (iM437910 * 16) + iM43799;
                            }
                            sb.append((char) iM437910);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = m45646().intValue();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m43800() {
        int iM43799;
        if (!m45644()) {
            int i = this.f64103;
            if (m45641("url(")) {
                m45643();
                String strM43801 = m43801();
                if (strM43801 == null) {
                    StringBuilder sb = new StringBuilder();
                    while (!m45644()) {
                        int i2 = this.f64103;
                        String str = this.f64100;
                        char cCharAt = str.charAt(i2);
                        if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || C19842.m45635((int) cCharAt) || Character.isISOControl((int) cCharAt)) {
                            break;
                        }
                        this.f64103++;
                        if (cCharAt == '\\') {
                            if (!m45644()) {
                                int i3 = this.f64103;
                                this.f64103 = i3 + 1;
                                cCharAt = str.charAt(i3);
                                if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                    int iM437910 = m43799(cCharAt);
                                    if (iM437910 != -1) {
                                        for (int i4 = 1; i4 <= 5 && !m45644() && (iM43799 = m43799(str.charAt(this.f64103))) != -1; i4++) {
                                            this.f64103++;
                                            iM437910 = (iM437910 * 16) + iM43799;
                                        }
                                        sb.append((char) iM437910);
                                    }
                                }
                            }
                        }
                        sb.append(cCharAt);
                    }
                    strM43801 = sb.length() == 0 ? null : sb.toString();
                }
                if (strM43801 == null) {
                    this.f64103 = i;
                    return null;
                }
                m45643();
                if (m45644() || m45641(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    return strM43801;
                }
                this.f64103 = i;
                return null;
            }
        }
        return null;
    }
}
