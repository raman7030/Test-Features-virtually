package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ᩴ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes5.dex */
public final class C20396 extends C21226 {
    /* JADX INFO: renamed from: ۧ */
    public static int m46066(int i) {
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

    public C20396(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m46069() {
        int i;
        int i2;
        boolean zM47955 = m47955();
        String str = this.f66737;
        if (zM47955) {
            i2 = this.f66740;
        } else {
            int i3 = this.f66740;
            int iCharAt = str.charAt(i3);
            if (iCharAt == 45) {
                iCharAt = m47948();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i3;
            } else {
                int iM47948 = m47948();
                while (true) {
                    if ((iM47948 < 65 || iM47948 > 90) && ((iM47948 < 97 || iM47948 > 122) && !((iM47948 >= 48 && iM47948 <= 57) || iM47948 == 45 || iM47948 == 95))) {
                        break;
                    }
                    iM47948 = m47948();
                }
                i = this.f66740;
            }
            this.f66740 = i3;
            i2 = i;
        }
        int i4 = this.f66740;
        if (i2 == i4) {
            return null;
        }
        String strSubstring = str.substring(i4, i2);
        this.f66740 = i2;
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
    /* JADX INFO: renamed from: ۘ */
    public ArrayList m46065() throws C11008 {
        ArrayList arrayList;
        ?? r7;
        ?? r5;
        ?? c8325;
        ?? r11;
        EnumC4973 enumC4973;
        EnumC4973 enumC4974;
        ?? r12;
        String strM47956;
        ?? M46069;
        EnumC4973 enumC4975;
        int i;
        int i2;
        C15700 c15700M35762;
        C15700 c15700;
        C6314 c6314;
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? arrayList4 = 0;
        if (m47955()) {
            return null;
        }
        int i3 = 1;
        ArrayList arrayList5 = new ArrayList(1);
        boolean z = false;
        C12349 c12349 = new C12349(0);
        while (!m47955() && !m47955()) {
            int i4 = this.f66740;
            ArrayList arrayList6 = c12349.f34460;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                r7 = arrayList4;
            } else if (m47951('>')) {
                EnumC21067 enumC21067 = EnumC21067.CHILD;
                m47954();
                r7 = enumC21067;
            } else if (m47951('+')) {
                EnumC21067 enumC21068 = EnumC21067.FOLLOWS;
                m47954();
                r7 = enumC21068;
            } else {
                r7 = arrayList4;
            }
            if (m47951('*')) {
                c8325 = new C8325(r7, arrayList4);
                r5 = i3;
            } else {
                String strM46069 = m46069();
                if (strM46069 != null) {
                    C8325 c8326 = new C8325(r7, strM46069);
                    c12349.f34461 += i3;
                    r5 = i3;
                    c8325 = c8326;
                } else {
                    r5 = i3;
                    c8325 = arrayList4;
                }
            }
            while (!m47955()) {
                if (m47951('.')) {
                    if (c8325 == 0) {
                        c8325 = new C8325(r7, arrayList4);
                    }
                    String strM460610 = m46069();
                    if (strM460610 == null) {
                        throw new C11008("Invalid \".class\" simpleSelectors");
                    }
                    c8325.m19215(Name.LABEL, EnumC4973.EQUALS, strM460610);
                    c12349.m28435();
                } else if (m47951('#')) {
                    if (c8325 == 0) {
                        c8325 = new C8325(r7, arrayList4);
                    }
                    String strM460611 = m46069();
                    if (strM460611 == null) {
                        throw new C11008("Invalid \"#id\" simpleSelectors");
                    }
                    c8325.m19215("id", EnumC4973.EQUALS, strM460611);
                    c12349.f34461 += BasicLabelFormatter.MILLION;
                } else if (m47951('[')) {
                    if (c8325 == 0) {
                        c8325 = new C8325(r7, arrayList4);
                    }
                    m47954();
                    String strM460612 = m46069();
                    if (strM460612 == null) {
                        throw new C11008("Invalid attribute simpleSelectors");
                    }
                    m47954();
                    if (m47951(C0184a.f880h)) {
                        enumC4975 = EnumC4973.EQUALS;
                    } else if (m47952("~=")) {
                        enumC4974 = EnumC4973.INCLUDES;
                    } else if (m47952("|=")) {
                        enumC4973 = EnumC4973.DASHMATCH;
                    } else {
                        r11 = arrayList4;
                    }
                    if (r11 != 0) {
                        r11 = enumC4973;
                        r11 = enumC4974;
                        m47954();
                        if (m47955()) {
                            M46069 = arrayList4;
                        } else {
                            strM47956 = m47956();
                            if (strM47956 == null) {
                                r11 = enumC4975;
                                M46069 = strM47956;
                                M46069 = m46069();
                            }
                        }
                        if (M46069 == 0) {
                            r11 = enumC4975;
                            throw new C11008("Invalid attribute simpleSelectors");
                        }
                        r11 = enumC4975;
                        m47954();
                        r12 = M46069;
                    } else {
                        r11 = enumC4973;
                        r11 = enumC4974;
                        r11 = enumC4975;
                        r12 = arrayList4;
                    }
                    ?? r13 = r11;
                    if (!m47951(']')) {
                        throw new C11008("Invalid attribute simpleSelectors");
                    }
                    if (r11 == 0) {
                        r13 = EnumC4973.EXISTS;
                    }
                    c8325.m19215(strM460612, r13, r12);
                    c12349.m28435();
                } else {
                    c8325 = c8325;
                    if (m47951(':')) {
                        if (c8325 == 0) {
                            c8325 = new C8325(r7, arrayList4);
                        }
                        String strM460613 = m46069();
                        if (strM460613 == null) {
                            throw new C11008("Invalid pseudo class");
                        }
                        EnumC17041 enumC17041M38643 = EnumC17041.m38643(strM460613);
                        switch (enumC17041M38643.ordinal()) {
                            case 0:
                                C5643 c5643 = new C5643();
                                c12349.m28435();
                                obj2 = c5643;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 1:
                                C6984 c6984 = new C6984();
                                c12349.m28435();
                                obj2 = c6984;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z2 = enumC17041M38643 == EnumC17041.nth_child || enumC17041M38643 == EnumC17041.nth_of_type;
                                boolean z3 = enumC17041M38643 == EnumC17041.nth_of_type || enumC17041M38643 == EnumC17041.nth_last_of_type;
                                ?? r3 = arrayList4;
                                if (!m47955()) {
                                    int i5 = this.f66740;
                                    if (m47951('(')) {
                                        m47954();
                                        if (m47952("odd")) {
                                            r3 = arrayList4;
                                            c6314 = new C6314(2, r5 == true ? 1 : 0);
                                        } else if (m47952("even")) {
                                            r3 = arrayList4;
                                            c6314 = new C6314(2, z ? 1 : 0);
                                        } else {
                                            if (!m47951('+') && m47951('-')) {
                                                r3 = arrayList4;
                                                i = -1;
                                            } else {
                                                r3 = arrayList4;
                                                r3 = arrayList4;
                                                i = 1;
                                            }
                                            int i6 = this.f66740;
                                            int i7 = this.f66738;
                                            String str = this.f66737;
                                            C15700 c15700M35763 = C15700.m35762(i6, i7, str);
                                            if (c15700M35763 != null) {
                                                this.f66740 = c15700M35763.m35763();
                                            }
                                            if (m47951('n') || m47951('N')) {
                                                if (c15700M35763 == null) {
                                                    c15700M35763 = new C15700(this.f66740, 1L);
                                                }
                                                m47954();
                                                boolean zM47951 = m47951('+');
                                                i2 = (zM47951 || !(zM47951 = m47951('-'))) ? 1 : -1;
                                                if (zM47951) {
                                                    m47954();
                                                    c15700M35762 = C15700.m35762(this.f66740, i7, str);
                                                    if (c15700M35762 != null) {
                                                        this.f66740 = c15700M35762.m35763();
                                                    } else {
                                                        this.f66740 = i5;
                                                    }
                                                    r3 = 0;
                                                } else {
                                                    c15700M35762 = null;
                                                }
                                                C15700 c15701 = c15700M35762;
                                                c15700 = c15700M35763;
                                                c15700M35763 = c15701;
                                            } else {
                                                c15700 = null;
                                                i2 = i;
                                                i = 1;
                                            }
                                            c6314 = new C6314(c15700 == null ? 0 : i * c15700.m35764(), c15700M35763 == null ? 0 : c15700M35763.m35764() * i2);
                                        }
                                        m47954();
                                        r3 = c6314;
                                        if (!m47951(')')) {
                                            this.f66740 = i5;
                                            r3 = 0;
                                        }
                                    }
                                }
                                if (r3 == 0) {
                                    throw new C11008("Invalid or missing parameter section for pseudo class: ".concat(strM460613));
                                }
                                C3631 c3631 = new C3631(c8325.f22272, r3.f16371, r3.f16372, z2, z3);
                                c12349.m28435();
                                obj = c3631;
                                obj2 = obj;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 6:
                                C3631 c3632 = new C3631(null, 0, 1, true, false);
                                c12349.m28435();
                                obj2 = c3632;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 7:
                                C3631 c3633 = new C3631(null, 0, 1, false, false);
                                c12349.m28435();
                                obj2 = c3633;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 8:
                                C3631 c3634 = new C3631(c8325.f22272, 0, 1, true, true);
                                c12349.m28435();
                                obj2 = c3634;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 9:
                                C3631 c3635 = new C3631(c8325.f22272, 0, 1, false, true);
                                c12349.m28435();
                                obj2 = c3635;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 10:
                                C21737 c21737 = new C21737(z, arrayList4);
                                c12349.m28435();
                                obj = c21737;
                                obj2 = obj;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 11:
                                C21737 c21738 = new C21737(r5, c8325.f22272);
                                c12349.m28435();
                                obj2 = c21738;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 12:
                                C10337 c10337 = new C10337();
                                c12349.m28435();
                                obj2 = c10337;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 13:
                                if (!m47955()) {
                                    int i8 = this.f66740;
                                    if (m47951('(')) {
                                        m47954();
                                        ArrayList arrayListM46065 = m46065();
                                        if (arrayListM46065 != null && m47951(')')) {
                                            Iterator it = arrayListM46065.iterator();
                                            while (true) {
                                                if (!it.hasNext() || (arrayList2 = ((C12349) it.next()).f34460) == null) {
                                                    arrayList4 = arrayListM46065;
                                                } else {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext() && (arrayList3 = ((C8325) it2.next()).f22271) != null) {
                                                            Iterator it3 = arrayList3.iterator();
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    if (((InterfaceC7655) it3.next()) instanceof C23078) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f66740 = i8;
                                        }
                                    }
                                }
                                if (arrayList4 == 0) {
                                    throw new C11008("Invalid or missing parameter section for pseudo class: ".concat(strM460613));
                                }
                                C23078 c23078 = new C23078(arrayList4);
                                c12349.f34461 = c23078.m51477();
                                obj = c23078;
                                obj2 = obj;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 14:
                                if (!m47955()) {
                                    int i9 = this.f66740;
                                    if (m47951('(')) {
                                        m47954();
                                        while (true) {
                                            String strM460614 = m46069();
                                            arrayList4 = arrayList4;
                                            if (strM460614 == null) {
                                                this.f66740 = i9;
                                            } else {
                                                if (arrayList4 == 0) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(strM460614);
                                                m47954();
                                                if (!m47960()) {
                                                    if (!m47951(')')) {
                                                        this.f66740 = i9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C23748 c23748 = new C23748(strM460613);
                                c12349.m28435();
                                obj2 = c23748;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
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
                                C23748 c23749 = new C23748(strM460613);
                                c12349.m28435();
                                obj2 = c23749;
                                if (c8325.f22271 == null) {
                                    c8325.f22271 = new ArrayList();
                                }
                                c8325.f22271.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            default:
                                throw new C11008("Unsupported pseudo class: ".concat(strM460613));
                        }
                    } else {
                        if (c8325 != 0) {
                            this.f66740 = i4;
                            arrayList = c12349.f34460;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList5.add(c12349);
                            }
                            return arrayList5;
                        }
                        if (c12349.f34460 == null) {
                            c12349.f34460 = new ArrayList();
                        }
                        c12349.f34460.add(c8325);
                        if (!m47960()) {
                            arrayList5.add(c12349);
                            c12349 = new C12349(0);
                        }
                        arrayList4 = 0;
                        i3 = 1;
                        z = false;
                    }
                }
            }
            if (c8325 != 0) {
                this.f66740 = i4;
                arrayList = c12349.f34460;
                if (arrayList != null) {
                    arrayList5.add(c12349);
                }
                return arrayList5;
            }
            if (c12349.f34460 == null) {
                c12349.f34460 = new ArrayList();
            }
            c12349.f34460.add(c8325);
            if (!m47960()) {
                arrayList5.add(c12349);
                c12349 = new C12349(0);
            }
            arrayList4 = 0;
            i3 = 1;
            z = false;
        }
        arrayList = c12349.f34460;
        if (arrayList != null) {
            arrayList5.add(c12349);
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m46068() {
        int iM46066;
        if (m47955()) {
            return null;
        }
        char cCharAt = this.f66737.charAt(this.f66740);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.f66740++;
        int iIntValue = m47957().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = m47957().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = m47957().intValue();
                    } else {
                        int iM46067 = m46066(iIntValue);
                        if (iM46067 != -1) {
                            for (int i = 1; i <= 5 && (iM46066 = m46066((iIntValue = m47957().intValue()))) != -1; i++) {
                                iM46067 = (iM46067 * 16) + iM46066;
                            }
                            sb.append((char) iM46067);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = m47957().intValue();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m46067() {
        int iM46066;
        if (!m47955()) {
            int i = this.f66740;
            if (m47952("url(")) {
                m47954();
                String strM46068 = m46068();
                if (strM46068 == null) {
                    StringBuilder sb = new StringBuilder();
                    while (!m47955()) {
                        int i2 = this.f66740;
                        String str = this.f66737;
                        char cCharAt = str.charAt(i2);
                        if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || C21226.m47946((int) cCharAt) || Character.isISOControl((int) cCharAt)) {
                            break;
                        }
                        this.f66740++;
                        if (cCharAt == '\\') {
                            if (!m47955()) {
                                int i3 = this.f66740;
                                this.f66740 = i3 + 1;
                                cCharAt = str.charAt(i3);
                                if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                    int iM46067 = m46066(cCharAt);
                                    if (iM46067 != -1) {
                                        for (int i4 = 1; i4 <= 5 && !m47955() && (iM46066 = m46066(str.charAt(this.f66740))) != -1; i4++) {
                                            this.f66740++;
                                            iM46067 = (iM46067 * 16) + iM46066;
                                        }
                                        sb.append((char) iM46067);
                                    }
                                }
                            }
                        }
                        sb.append(cCharAt);
                    }
                    strM46068 = sb.length() == 0 ? null : sb.toString();
                }
                if (strM46068 == null) {
                    this.f66740 = i;
                    return null;
                }
                m47954();
                if (m47955() || m47952(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    return strM46068;
                }
                this.f66740 = i;
                return null;
            }
        }
        return null;
    }
}
