package l;

import android.graphics.Point;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܶۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15068 extends AbstractC9693 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C7073 f46020 = new C7073();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f46021;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Set f46022;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f46023;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f46024;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Callable f46025;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f46026;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Map f46027;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21834 f46028;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6603 f46029;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7308 f46030;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46031;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC17186 f46032;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f46033;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f46034;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f46035;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4900 f46036;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f46037;

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final C15068 mo24638() {
        return this;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        String str;
        c10130.mo13231(20224);
        c10130.m25436();
        c10130.m25439(this.f46021);
        Set set = this.f46022;
        c10130.mo13231(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10130.m25439((String) it.next());
        }
        c10130.m25425(this.f46034);
        ArrayList<InterfaceC19221> arrayList = this.f46037;
        c10130.mo13231(arrayList.size());
        for (InterfaceC19221 interfaceC19221 : arrayList) {
            if (interfaceC19221 instanceof C0169) {
                C0169 c0169 = (C0169) interfaceC19221;
                c10130.writeByte(0);
                c10130.m25439(c0169.f1387);
                c10130.m25425(c0169.f1386);
                c10130.m25425(c0169.f1388);
            } else if (interfaceC19221 instanceof C5109) {
                C5109 c5109 = (C5109) interfaceC19221;
                c10130.writeByte(1);
                c10130.m25439(c5109.f16021);
                c10130.m25439(c5109.f16020);
                c10130.m25425(c5109.f16018);
                c10130.m25425(c5109.f16019);
            } else {
                throw new RuntimeException();
            }
        }
        int i = C7017.f21654;
        InterfaceC17186 interfaceC17186 = InterfaceC17186.f52681;
        String str2 = null;
        InterfaceC17186 interfaceC17187 = this.f46032;
        if (interfaceC17187 == interfaceC17186) {
            str = "#BUILT_IN_LUA_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52677) {
            str = "#BUILT_IN_PYTHON_FORMATTER#";
        } else if (interfaceC17187 == null) {
            str = null;
        } else if (interfaceC17187 == InterfaceC17186.f52686) {
            str = "#BUILT_IN_MTSX_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52676) {
            str = "#BUILT_IN_CSS_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52680) {
            str = "#BUILT_IN_HTML_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52684) {
            str = "#BUILT_IN_JS_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52679) {
            str = "#BUILT_IN_TS_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52683) {
            str = "#BUILT_IN_JSON_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52678) {
            str = "#BUILT_IN_XML_FORMATTER#";
        } else if (interfaceC17187 == InterfaceC17186.f52685) {
            str = "#BUILT_IN_SMALI_FORMATTER#";
        } else {
            if (interfaceC17187 != InterfaceC17186.f52682) {
                throw new RuntimeException(interfaceC17187.toString());
            }
            str = "#BUILT_IN_JAVA_FORMATTER#";
        }
        c10130.m25424(str);
        InterfaceC6603 interfaceC6603 = this.f46029;
        if (interfaceC6603 != null) {
            if (interfaceC6603 == InterfaceC6603.f20330) {
                str2 = "#BUILT_IN_CSS_SHRINKER#";
            } else if (interfaceC6603 == InterfaceC6603.f20331) {
                str2 = "#BUILT_IN_HTML_SHRINKER#";
            } else if (interfaceC6603 == InterfaceC6603.f20332) {
                str2 = "#BUILT_IN_JS_SHRINKER#";
            } else {
                if (interfaceC6603 != InterfaceC6603.f20333) {
                    throw new RuntimeException(interfaceC6603.toString());
                }
                str2 = "#BUILT_IN_JSON_SHRINKER#";
            }
        }
        c10130.m25424(str2);
        C4900 c4900 = this.f46036;
        c10130.mo13231(c4900.m14267());
        InterfaceC12063 it2 = c4900.m14266().iterator();
        while (it2.hasNext()) {
            InterfaceC11544 interfaceC11544 = (InterfaceC11544) it2.next();
            c10130.m25439(C4900.m14262(interfaceC11544.mo15639()));
            ((C21834) interfaceC11544.getValue()).m49204(c10130);
        }
        ArrayList<C8014> arrayList2 = this.f46035;
        c10130.mo13231(arrayList2.size());
        for (C8014 c8014 : arrayList2) {
            c10130.m25439(c8014.f24743.pattern());
            c10130.mo13231(c8014.f24743.flags());
            c8014.f24744.m49204(c10130);
        }
        List list = this.f46026;
        c10130.mo13231(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((AbstractC9693) it3.next()).mo1516(c10130);
        }
        Map map = this.f46027;
        c10130.mo13231(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c10130.m25439((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof AbstractC9693) {
                c10130.writeByte(0);
                ((AbstractC9693) value).mo1516(c10130);
            } else if (value instanceof String) {
                c10130.writeByte(1);
                c10130.m25439((String) value);
            } else if (value instanceof C7805) {
                c10130.writeByte(2);
                ((C7805) value).m20830(c10130);
            } else {
                throw new RuntimeException();
            }
        }
        ArrayList arrayList3 = this.f46031;
        if (arrayList3 == null) {
            c10130.mo13229((short) -1);
        } else {
            c10130.mo13229((short) arrayList3.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c10130.m25439((String) it4.next());
            }
        }
        c10130.m25418();
    }

    public C15068(C12951 c12951) throws IOException {
        super(null);
        this.f46036 = new C4900();
        this.f46035 = new ArrayList();
        this.f46037 = new ArrayList();
        this.f46032 = null;
        this.f46029 = null;
        this.f46030 = C7017.m18975();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        this.f46022 = C20195.unmodifiableSet(linkedHashSet);
        this.f46026 = C20195.unmodifiableList(arrayList);
        this.f46027 = C20195.unmodifiableMap(map);
        C22124.m49721(c12951, 20224);
        c12951.readInt();
        this.f46021 = c12951.m31506();
        int iM31494 = c12951.m31494();
        for (int i = 0; i < iM31494; i++) {
            linkedHashSet.add(c12951.m31506());
        }
        this.f46034 = c12951.m31498();
        int iM31495 = c12951.m31494();
        this.f46037.ensureCapacity(iM31495);
        for (int i2 = 0; i2 < iM31495; i2++) {
            byte b = c12951.readByte();
            if (b == 0) {
                this.f46037.add(new C0169(c12951.m31506(), c12951.m31498(), c12951.m31498()));
            } else {
                if (b != 1) {
                    throw new RuntimeException("Unknown comment type");
                }
                this.f46037.add(new C5109(c12951.m31506(), c12951.m31506(), c12951.m31498(), c12951.m31498()));
            }
        }
        this.f46032 = C7017.m18977(c12951.m31503());
        this.f46029 = C7017.m18981(c12951.m31503());
        int iM31496 = c12951.m31494();
        for (int i3 = 0; i3 < iM31496; i3++) {
            this.f46036.m14265(c12951.m31506(), C21834.m49199(c12951));
        }
        int iM31497 = c12951.m31494();
        this.f46035.ensureCapacity(iM31497);
        for (int i4 = 0; i4 < iM31497; i4++) {
            this.f46035.add(new C8014(C7017.m18954(c12951.m31494(), c12951.m31506()), C21834.m49199(c12951)));
        }
        int iM31498 = c12951.m31494();
        for (int i5 = 0; i5 < iM31498; i5++) {
            arrayList.add(AbstractC9693.m24637(this, c12951));
        }
        int iM31499 = c12951.m31494();
        for (int i6 = 0; i6 < iM31499; i6++) {
            String strM31506 = c12951.m31506();
            byte b2 = c12951.readByte();
            if (b2 == 0) {
                map.put(strM31506, AbstractC9693.m24637(this, c12951));
            } else if (b2 == 1) {
                map.put(strM31506, c12951.m31506());
            } else {
                if (b2 != 2) {
                    throw new IOException(C19370.m44628(b2, "Unknown syntax definition type: "));
                }
                map.put(strM31506, C7805.m20827(c12951));
            }
        }
        short s = c12951.readShort();
        if (s < 0) {
            this.f46031 = null;
            return;
        }
        this.f46031 = new ArrayList(s);
        for (int i7 = 0; i7 < s; i7++) {
            this.f46031.add(c12951.m31506());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15068(C12386 c12386) {
        Iterator it;
        ArrayList arrayList;
        Class<C7447> cls;
        Class<C4625> cls2;
        ArrayList arrayList2;
        Class<C1863> cls3;
        Class<C4625> cls4;
        C21834 c21834M49198;
        super(null);
        ArrayList arrayList3 = null;
        this.f46036 = new C4900();
        this.f46035 = new ArrayList();
        this.f46037 = new ArrayList();
        this.f46032 = null;
        this.f46029 = null;
        this.f46030 = C7017.m18975();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<AbstractC9693> arrayList4 = new ArrayList();
        HashMap map = new HashMap();
        this.f46022 = C20195.unmodifiableSet(linkedHashSet);
        this.f46026 = C20195.unmodifiableList(arrayList4);
        this.f46027 = C20195.unmodifiableMap(map);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = c12386.m23037(C10270.class).iterator();
        int i = 0;
        boolean zM35647 = false;
        while (true) {
            Class<C7447> cls5 = C7447.class;
            Class<C4625> cls6 = C4625.class;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    C10270 c10270 = (C10270) it3.next();
                    C4625 c4625 = (C4625) c10270.m23039(cls6, 0);
                    if (c4625 != null) {
                        C13091 c13091 = (C13091) c4625.m23039(C13091.class, 0);
                        C3214 c3214 = (C3214) c4625.m23039(C3214.class, 0);
                        C9897 c9897 = (C9897) c4625.m23039(C9897.class, 0);
                        C23675 c23675 = (C23675) c4625.m23039(C23675.class, 0);
                        String strM35649 = m35649(c13091.m23038(46, 0));
                        String strM356410 = c3214 == null ? null : m35649(c3214.m23038(46, 0));
                        boolean z = c9897 == null || m35647(c9897.m23038(48, 0));
                        boolean z2 = c23675 == null || m35647(c23675.m23038(48, 0));
                        C1372 c1372 = new C1372(this);
                        if (strM356410 == null) {
                            this.f46037.add(new C0169(strM35649, z, zM35647));
                            if (z2) {
                                c1372.m4847(C7017.m18954(zM35647 ? 2 : 0, C16014.m37867(C3939.m11985(strM35649), ".*")));
                            }
                            it = it3;
                        } else {
                            it = it3;
                            this.f46037.add(new C5109(strM35649, strM356410, z, zM35647));
                            if (z2) {
                                c1372.m4847(C7017.m18954(zM35647 ? 2 : 0, C20087.m46306("(?s)", C3939.m11985(strM35649), ".*?(", C3939.m11985(strM356410), "|$)")));
                            }
                        }
                        if (z2) {
                            c1372.m4845(C3489.m10672(0, "comment"));
                            arrayList4.add(c1372);
                        }
                    } else {
                        it = it3;
                        C7447 c7447 = (C7447) c10270.m23039(cls5, 0);
                        Class<C1863> cls7 = C1863.class;
                        if (c7447 != null) {
                            Iterator it4 = c7447.m23037(C13796.class).iterator();
                            while (it4.hasNext()) {
                                C13796 c13796 = (C13796) it4.next();
                                String strM356411 = m35649(c13796.m23038(46, 0));
                                if (map.containsKey(strM356411)) {
                                    throw new RuntimeException(C20094.m46315("Duplicate defines: ", strM356411));
                                }
                                Iterator it5 = it4;
                                C11036 c11036 = (C11036) c13796.m23039(C11036.class, 0);
                                Class<C7447> cls8 = cls5;
                                C15207 c15207 = (C15207) c13796.m23039(C15207.class, 0);
                                List listM23037 = c13796.m23037(C22596.class);
                                if (c11036 != null) {
                                    map.put(strM356411, m35640(this, c11036.m23037(cls7)));
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                } else if (c15207 != null) {
                                    List listM23038 = c15207.m23037(C8153.class);
                                    ArrayList arrayList6 = new ArrayList(listM23038.size());
                                    cls4 = cls6;
                                    ArrayList arrayList7 = new ArrayList(listM23038.size());
                                    Iterator it6 = listM23038.iterator();
                                    while (it6.hasNext()) {
                                        C8153 c8153 = (C8153) it6.next();
                                        Iterator it7 = it6;
                                        ArrayList arrayList8 = arrayList3;
                                        C21559 c21559 = (C21559) c8153.m23039(C21559.class, 0);
                                        Class<C1863> cls9 = cls7;
                                        InterfaceC4181 interfaceC4181M23038 = c21559.m23038(46, 0);
                                        if (interfaceC4181M23038 == null) {
                                            interfaceC4181M23038 = c21559.m23038(45, 0);
                                        }
                                        arrayList6.add(m35649(interfaceC4181M23038));
                                        arrayList7.add(m35649(c8153.m23038(46, 0)));
                                        it6 = it7;
                                        arrayList3 = arrayList8;
                                        cls7 = cls9;
                                    }
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    try {
                                        map.put(strM356411, C7805.m20826(arrayList6, arrayList7));
                                    } catch (IllegalArgumentException e) {
                                        Point pointM35638 = m35638(c15207);
                                        C3781 c3781 = new C3781(null, pointM35638.x, pointM35638.y, e.getMessage());
                                        c3781.initCause((Throwable) e);
                                        throw c3781;
                                    }
                                } else {
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                    if (listM23037 == null) {
                                        throw new RuntimeException();
                                    }
                                    if (listM23037.isEmpty()) {
                                        throw new RuntimeException("[Define " + c13796.m23038(46, 0).getText() + "]: Matchers cannot be empty");
                                    }
                                    if (listM23037.size() == 1) {
                                        AbstractC9693 abstractC9693M35643 = m35643(this, (C22596) listM23037.get(0), zM35647);
                                        m35646(abstractC9693M35643, strM356411);
                                        map.put(strM356411, abstractC9693M35643);
                                    } else {
                                        C2370 c2370 = new C2370(this);
                                        ArrayList arrayList9 = new ArrayList();
                                        Iterator it8 = listM23037.iterator();
                                        int i2 = 1;
                                        while (it8.hasNext()) {
                                            AbstractC9693 abstractC9693M35644 = m35643(c2370, (C22596) it8.next(), zM35647);
                                            StringBuilder sbM19190 = C7166.m19190(strM356411, "[");
                                            sbM19190.append(i2);
                                            sbM19190.append("]");
                                            m35646(abstractC9693M35644, sbM19190.toString());
                                            arrayList9.add(abstractC9693M35644);
                                            i2++;
                                        }
                                        c2370.m7685(arrayList9);
                                        map.put(strM356411, c2370);
                                    }
                                }
                                cls5 = cls8;
                                it4 = it5;
                                cls6 = cls4;
                                arrayList3 = arrayList2;
                                cls7 = cls3;
                            }
                        } else {
                            arrayList = arrayList3;
                            cls = cls5;
                            cls2 = cls6;
                            C6036 c6036 = (C6036) c10270.m23039(C6036.class, 0);
                            if (c6036 != null) {
                                Iterator it9 = c6036.m23037(C22596.class).iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(m35643(this, (C22596) it9.next(), zM35647));
                                }
                            } else {
                                C16245 c16245 = (C16245) c10270.m23039(C16245.class, 0);
                                if (c16245 == null) {
                                    throw new RuntimeException(c10270.getText());
                                }
                                AbstractC9693 abstractC9693 = this.f29307;
                                List listM23039 = ((C11036) ((C2841) c16245.m23039(C2841.class, 0)).m23039(C11036.class, 0)).m23037(cls7);
                                try {
                                    this.f46035.add(new C8014(C7017.m18954(zM35647 ? 2 : 0, m35640(abstractC9693, listM23039)), m35651(C4900.m14261(m35649(((C16679) c16245.m23039(C16679.class, 0)).m23038(46, 0))))));
                                } catch (PatternSyntaxException e2) {
                                    throw new RuntimeException(m35639(((C8931) listM23039.get(0)).f27156) + " " + e2.getMessage());
                                }
                            }
                        }
                        it3 = it;
                        cls5 = cls;
                        cls6 = cls2;
                        arrayList3 = arrayList;
                    }
                    arrayList = arrayList3;
                    cls = cls5;
                    cls2 = cls6;
                    it3 = it;
                    cls5 = cls;
                    cls6 = cls2;
                    arrayList3 = arrayList;
                }
                this.f46031 = arrayList3;
                mo1517(new C20982());
                ArrayList arrayList10 = new ArrayList();
                for (AbstractC9693 abstractC9694 : arrayList4) {
                    if (abstractC9694 instanceof C0252) {
                        arrayList10.addAll(m35642(abstractC9694, new HashSet()));
                    } else {
                        arrayList10.add(abstractC9694);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList10);
                return;
            }
            C10270 c10271 = (C10270) it2.next();
            C5663 c5663 = (C5663) c10271.m23039(C5663.class, i);
            if (c5663 != null) {
                List listM23042 = ((C7779) c5663.m23039(C7779.class, i)).m23042(46);
                this.f46021 = m35649((InterfaceC4181) listM23042.get(i));
                for (int i3 = 1; i3 < listM23042.size(); i3++) {
                    linkedHashSet.add(m35649((InterfaceC4181) listM23042.get(i3)));
                }
            } else {
                C14834 c14834 = (C14834) c10271.m23039(C14834.class, i);
                if (c14834 != null) {
                    this.f46034 = m35647(c14834.m23038(48, i));
                } else {
                    C11681 c11681 = (C11681) c10271.m23039(C11681.class, i);
                    if (c11681 != null) {
                        for (C22969 c22969 : c11681.m23037(C22969.class)) {
                            List listM23043 = c22969.m23042(46);
                            List listM23044 = c22969.m23042(49);
                            InterfaceC4181 interfaceC4181M23039 = c22969.m23038(51, i);
                            String strM356412 = m35649((InterfaceC4181) listM23043.get(i));
                            if (strM356412.startsWith("!!")) {
                                throw new RuntimeException("Illegal style name: " + listM23044);
                            }
                            if (listM23043.size() == 2) {
                                c21834M49198 = m35651(C4900.m14261(m35649((InterfaceC4181) listM23043.get(1))));
                                if (interfaceC4181M23039 != null) {
                                    c21834M49198 = c21834M49198.m49201(m35637(interfaceC4181M23039));
                                }
                            } else if (listM23044.size() == 2) {
                                int[] iArr = new int[2];
                                m35645(c22969.m23038(49, 0).getText(), iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                m35645(c22969.m23038(49, 1).getText(), iArr);
                                c21834M49198 = C21834.m49198(null, i4, i5, iArr[0], iArr[1], m35637(c22969.m23038(51, 0)));
                            } else {
                                c21834M49198 = C21834.m49198(null, 1447446, 1447446, 1447446, 1447446, m35637(interfaceC4181M23039));
                            }
                            this.f46036.m14265(strM356412, c21834M49198);
                            i = 0;
                        }
                    } else {
                        C22264 c22264 = (C22264) c10271.m23039(C22264.class, 0);
                        if (c22264 != null) {
                            this.f46032 = C7017.m18977(c22264.m23038(50, 0).getText());
                        } else {
                            C20148 c20148 = (C20148) c10271.m23039(C20148.class, 0);
                            if (c20148 != null) {
                                this.f46029 = C7017.m18981(c20148.m23038(50, 0).getText());
                            } else {
                                C6742 c6742 = (C6742) c10271.m23039(C6742.class, 0);
                                if (c6742 != null) {
                                    List<InterfaceC4181> listM23045 = c6742.m23042(46);
                                    ArrayList arrayList11 = new ArrayList(listM23045.size());
                                    for (InterfaceC4181 interfaceC4181 : listM23045) {
                                        String strM356413 = m35649(interfaceC4181);
                                        if (strM356413.length() != 2 || strM356413.charAt(0) == strM356413.charAt(1)) {
                                            throw new RuntimeException(m35639(interfaceC4181.mo12628()) + " Illegal bracket pair " + interfaceC4181.getText());
                                        }
                                        arrayList11.add(strM356413);
                                    }
                                    arrayList3 = arrayList11;
                                } else {
                                    C7074 c7074 = (C7074) c10271.m23039(C7074.class, 0);
                                    if (c7074 != null) {
                                        zM35647 = m35647(c7074.m23038(48, 0));
                                    } else if (((C4625) c10271.m23039(cls6, 0)) != null) {
                                        arrayList5.add(c10271);
                                    } else if (((C7447) c10271.m23039(cls5, 0)) != null) {
                                        arrayList5.add(c10271);
                                    } else if (((C6036) c10271.m23039(C6036.class, 0)) != null) {
                                        arrayList5.add(c10271);
                                    } else {
                                        if (((C16245) c10271.m23039(C16245.class, 0)) == null) {
                                            throw new RuntimeException(c10271.getText());
                                        }
                                        arrayList5.add(c10271);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Point m35638(C8931 c8931) {
        InterfaceC0463 interfaceC0463 = c8931.f27156;
        return new Point(interfaceC0463.getLine(), interfaceC0463.mo2049());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m35642(AbstractC9693 abstractC9693, HashSet hashSet) {
        if (abstractC9693 instanceof C0252) {
            C0252 c0252 = (C0252) abstractC9693;
            if (hashSet.add(c0252.m1518())) {
                AbstractC9693 abstractC9693M35658 = m35658(c0252.m1518());
                if (abstractC9693M35658 instanceof C2370) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((C2370) abstractC9693M35658).m7684().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(m35642((AbstractC9693) it.next(), new HashSet(hashSet)));
                    }
                    return arrayList;
                }
                return m35642(abstractC9693M35658, new HashSet(hashSet));
            }
        }
        if (abstractC9693.f29307 != this) {
            return Collections.singletonList(abstractC9693.mo1512(this));
        }
        return Collections.singletonList(abstractC9693);
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
        Iterator it = this.f46026.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1517(c20982);
        }
        for (Map.Entry entry : this.f46027.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC9693) {
                AbstractC9693 abstractC9693 = (AbstractC9693) value;
                if (c20982.f67769.add((String) entry.getKey())) {
                    abstractC9693.mo1517(c20982);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35646(AbstractC9693 abstractC9693, String str) {
        if (abstractC9693 instanceof C1372) {
            C1372 c1372 = (C1372) abstractC9693;
            if (c1372.m4855() == null) {
                c1372.m4844(str);
                return;
            }
            return;
        }
        if (abstractC9693 instanceof C8428) {
            C8428 c8428 = (C8428) abstractC9693;
            if (c8428.m22080() == null) {
                c8428.m22082(str);
                return;
            }
            return;
        }
        if (abstractC9693 instanceof C4195) {
            C4195 c4195 = (C4195) abstractC9693;
            if (c4195.m12658() == null) {
                c4195.m12654(str);
                return;
            }
            return;
        }
        if (abstractC9693 instanceof C19304) {
            C19304 c19304 = (C19304) abstractC9693;
            if (c19304.m44503() == null) {
                c19304.m44496(str);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35640(AbstractC9693 abstractC9693, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1863 c1863 = (C1863) it.next();
            if (((C17385) c1863.m23039(C17385.class, 0)) != null) {
                Point pointM35638 = m35638(c1863);
                throw new C3781(null, pointM35638.x, pointM35638.y, "var() is not allowed in regex definitions or static match fields");
            }
            sb.append(m35641(abstractC9693, c1863));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35645(String str, int[] iArr) {
        boolean z;
        int iIndexOf = str.indexOf(35, 4);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(36, 4);
            z = true;
        } else {
            z = false;
        }
        if (iIndexOf == -1) {
            iArr[0] = m35648(str);
            iArr[1] = 1447446;
            return;
        }
        iArr[0] = m35648(str.substring(0, iIndexOf));
        if (z) {
            int iM35648 = m35648("#" + str.substring(iIndexOf + 1));
            iArr[1] = iM35648;
            iArr[1] = (iM35648 & 16777215) | 100663296;
            return;
        }
        iArr[1] = m35648(str.substring(iIndexOf));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m35648(String str) {
        if (str.equalsIgnoreCase("#NULL")) {
            return 1447446;
        }
        C7073 c7073 = f46020;
        synchronized (c7073) {
            if (!C9896.m24991(str, c7073)) {
                return -65536;
            }
            return c7073.f21766;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35637(InterfaceC4181 interfaceC4181) {
        int i = 0;
        if (interfaceC4181 != null) {
            String text = interfaceC4181.getText();
            i = text.indexOf(66) != -1 ? 1 : 0;
            if (text.indexOf(73) != -1) {
                i |= 2;
            }
            if (text.indexOf(85) != -1) {
                i |= 4;
            }
            if (text.indexOf(83) != -1) {
                return i | 8;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m35649(InterfaceC4181 interfaceC4181) {
        return C10035.f30194.m28254(C15472.m36561(1, 1, interfaceC4181.getText()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m35647(InterfaceC4181 interfaceC4181) {
        return interfaceC4181.getText().equals("true");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35639(InterfaceC0463 interfaceC0463) {
        int line = interfaceC0463.getLine();
        int iMo2049 = interfaceC0463.mo2049();
        StringBuilder sb = new StringBuilder();
        if (iMo2049 > 0) {
            sb.append('[');
            sb.append(line);
            sb.append(':');
            sb.append(iMo2049 + 1);
            sb.append(']');
        } else {
            sb.append("[line ");
            sb.append(line);
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21834 m35661() {
        C21834 c21834 = this.f46028;
        if (c21834 != null) {
            return c21834;
        }
        C21834 c21834M35651 = m35651(C4900.f15475);
        this.f46028 = c21834M35651;
        return c21834M35651;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m35651(int i) {
        boolean z = i < 0;
        if (z) {
            i = -i;
        }
        C21834 c21834M14263 = this.f46036.m14263(i);
        if (c21834M14263 == null) {
            int i2 = C7017.f21654;
            C7308 c7308 = this.f46030;
            C21834 c21834M14264 = c7308.f22433.m14263(i);
            if (c21834M14264 == null) {
                c21834M14264 = c7308.f22434;
            }
            c21834M14263 = c21834M14264;
        }
        return z ? c21834M14263.m49208() : c21834M14263;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7308 m35669() {
        return this.f46030;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m35657() {
        return this.f46021;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set m35662() {
        return this.f46022;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m35668() {
        return C20195.unmodifiableList(this.f46037);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m35663() {
        return this.f46031;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17186 m35665() {
        InterfaceC17186 interfaceC17186 = this.f46032;
        return (interfaceC17186 == null && "MT-Syntax".equals(this.f46021)) ? InterfaceC17186.f52686 : interfaceC17186;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6603 m35664() {
        return this.f46029;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m35655() {
        return this.f46035;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m35654() {
        return this.f46034;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        mo1514(sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 m35658(String str) {
        Object obj = this.f46027.get(str);
        if (obj == null) {
            throw new RuntimeException(C20094.m46315("Definition not found: ", str));
        }
        if (obj instanceof AbstractC9693) {
            return (AbstractC9693) obj;
        }
        throw new RuntimeException(C20094.m46315("Not a matcher definition: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7805 m35650(String str) {
        Object obj = this.f46027.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(C20094.m46315("Definition not found: ", str));
        }
        if (obj instanceof C7805) {
            return (C7805) obj;
        }
        throw new IllegalArgumentException(C20094.m46315("Not a childrenSyntax mapping definition: ", str));
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        sb.append("[Language]\n");
        sb.append("Name: ");
        sb.append(this.f46021);
        sb.append('\n');
        sb.append("Suffixes: ");
        sb.append(this.f46022);
        sb.append('\n');
        sb.append("Comment: ");
        sb.append(this.f46037);
        sb.append('\n');
        Map map = this.f46027;
        if (!map.isEmpty()) {
            sb.append("Defines: ");
            sb.append('\n');
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                Object value = entry.getValue();
                if (value instanceof AbstractC9693) {
                    ((AbstractC9693) value).mo1514(sb, 0);
                } else if (value instanceof C7805) {
                    ((C7805) value).m20828(sb);
                } else {
                    sb.append(value);
                    sb.append("\n");
                }
            }
        }
        sb.append("Contains: ");
        sb.append('\n');
        Iterator it = this.f46026.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1514(sb, 0);
        }
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1515(ArrayList arrayList) {
        Iterator it = this.f46026.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1515(arrayList);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35659() {
        mo1515(new ArrayList());
        for (Object obj : this.f46027.values()) {
            if (obj instanceof AbstractC9693) {
                ((AbstractC9693) obj).mo1515(new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m35653() {
        return this.f46026;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35652(Callable callable) {
        this.f46025 = callable;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m35656() {
        return (String) this.f46025.call();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21834 m35644(C2509 c2509) {
        int[] iArr = new int[2];
        m35645(c2509.m23038(49, 0).getText(), iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        m35645(c2509.m23038(49, 1).getText(), iArr);
        return C21834.m49198(null, i, i2, iArr[0], iArr[1], m35637(c2509.m23038(51, 0)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35660(int i) {
        if (this.f46024 && this.f46023 != i) {
            throw new IllegalStateException("Language semantic hash is already initialized");
        }
        this.f46023 = i;
        this.f46024 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m35666() {
        this.f46033 = true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m35667() {
        if (this.f46033) {
            throw new IllegalArgumentException("Cached language requires recompilation");
        }
    }

    public final int hashCode() {
        return this.f46023;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۢܺܿ, l.᩵ۜܿ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.֡ۜܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ۢܺܿ, l.ۨ᩻ܿ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [l.ۘ᩷ܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.۠᩷ܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.֨᩷ܿ, l.ۢܺܿ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC9693 m35643(AbstractC9693 abstractC9693, C22596 c22596, boolean z) {
        ?? c19304;
        Class<C16679> cls;
        boolean z2;
        boolean z3;
        Iterator it;
        C1664 c1664M5636;
        C20480 c20480 = (C20480) c22596.m23039(C20480.class, 0);
        if (c20480 != null) {
            c19304 = new C1372(abstractC9693);
            C19069 c19069 = (C19069) c20480.m23039(C19069.class, 0);
            if (c19069 != null) {
                c19304.m4844(m35649(c19069.m23038(46, 0)));
            }
            List<C1863> listM23037 = ((C11036) ((C2841) c20480.m23039(C2841.class, 0)).m23039(C11036.class, 0)).m23037(C1863.class);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (C1863 c1863 : listM23037) {
                C17385 c17385 = (C17385) c1863.m23039(C17385.class, 0);
                if (c17385 == null) {
                    sb.append(m35641(abstractC9693, c1863));
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    arrayList2.add(m35649(c17385.m23038(46, 0)));
                }
            }
            arrayList.add(sb.toString());
            try {
                C5606 c5606M15901 = C5606.m15901(arrayList, arrayList2, z ? 2 : 0);
                c19304.m4846(c5606M15901);
                int iM15910 = c5606M15901.m15910();
                C10602 c10602 = (C10602) c20480.m23039(C10602.class, 0);
                if (c10602 != null) {
                    c19304.m4848(m35647(c10602.m23038(48, 0)));
                }
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (C3920 c3920 : c20480.m23037(C3920.class)) {
                    int i = Integer.parseInt(c3920.m23038(44, 0).getText());
                    String strM35649 = m35649(c3920.m23038(46, 0));
                    if (i > iM15910) {
                        Point pointM35638 = m35638(c3920);
                        throw new C3781(null, pointM35638.x, pointM35638.y, "No start capture group " + i + " for exported variable \"" + strM35649 + "\"");
                    }
                    if (!hashSet.add(Integer.valueOf(i))) {
                        Point pointM35639 = m35638(c3920);
                        throw new C3781(null, pointM35639.x, pointM35639.y, C18307.m42645(i, "Capture group ", " is exported more than once"));
                    }
                    if (!hashSet2.add(strM35649)) {
                        Point pointM356310 = m35638(c3920);
                        throw new C3781(null, pointM356310.x, pointM356310.y, C20094.m46315("Duplicate exported variable: ", strM35649));
                    }
                    arrayList3.add(new C23327(i, strM35649));
                }
                c19304.m4850(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i2 = 0;
                for (C6368 c6368 : c20480.m23037(C6368.class)) {
                    int i3 = Integer.parseInt(c6368.m23038(44, 0).getText());
                    if (i3 > iM15910) {
                        String text = c6368.getText();
                        int iIndexOf = text.indexOf(58);
                        if (iIndexOf >= 0 && iIndexOf < 10) {
                            text = "\n".concat(text);
                        }
                        throw new RuntimeException(m35639(c6368.f27156) + " No group " + i3 + ": " + text);
                    }
                    InterfaceC4181 interfaceC4181M23038 = c6368.m23038(46, 0);
                    if (interfaceC4181M23038 != null) {
                        String strM356410 = m35649(interfaceC4181M23038);
                        if (i3 == 0) {
                            arrayList4.add(i2, C3489.m10672(i3, strM356410));
                            i2++;
                        } else {
                            arrayList4.add(C3489.m10672(i3, strM356410));
                        }
                    } else {
                        arrayList5.add(new C8987(i3, m35643(c19304, (C22596) c6368.m23039(C22596.class, 0), z)));
                    }
                }
                c19304.m4853(arrayList4);
                c19304.m4856(arrayList5);
            } catch (IllegalArgumentException e) {
                Point pointM356311 = m35638((C8931) listM23037.get(0));
                C3781 c3781 = new C3781(null, pointM356311.x, pointM356311.y, e.getMessage());
                c3781.initCause((Throwable) e);
                throw c3781;
            }
        } else {
            C13423 c13423 = (C13423) c22596.m23039(C13423.class, 0);
            Class<C16679> cls2 = C16679.class;
            if (c13423 != null) {
                c19304 = new C8428(abstractC9693);
                C19069 c190610 = (C19069) c13423.m23039(C19069.class, 0);
                if (c190610 != null) {
                    c19304.m22082(m35649(c190610.m23038(46, 0)));
                }
                Iterator it2 = c13423.m23037(C12718.class).iterator();
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (it2.hasNext()) {
                    C12718 c12718 = (C12718) it2.next();
                    C12013 c12013 = (C12013) c12718.m23039(C12013.class, 0);
                    if (c12013 != null) {
                        c19304.m22089(m35643(c19304, (C22596) c12013.m23039(C22596.class, 0), z));
                    } else {
                        C2135 c2135 = (C2135) c12718.m23039(C2135.class, 0);
                        if (c2135 != null) {
                            c19304.m22083(m35643(c19304, (C22596) c2135.m23039(C22596.class, 0), z));
                        } else {
                            C11308 c11308 = (C11308) c12718.m23039(C11308.class, 0);
                            if (c11308 != null) {
                                c19304.m22071(Integer.parseInt(c11308.m23038(44, 0).getText()));
                                if (z6) {
                                    throw new RuntimeException(C9045.m23341(new StringBuilder(), m35639(c11308.f27156), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                }
                                z9 = true;
                            } else {
                                C4252 c4252 = (C4252) c12718.m23039(C4252.class, 0);
                                if (c4252 != null) {
                                    c19304.m22075(m35647(c4252.m23038(48, 0)));
                                    z5 = true;
                                } else {
                                    C0723 c0723 = (C0723) c12718.m23039(C0723.class, 0);
                                    if (c0723 != null) {
                                        it = it2;
                                        c19304.m22084(m35647(c0723.m23038(48, 0)));
                                    } else {
                                        it = it2;
                                        C16679 c16679 = (C16679) c12718.m23039(cls2, 0);
                                        if (c16679 != null) {
                                            c19304.m22092(m35649(c16679.m23038(46, 0)));
                                        } else {
                                            C18737 c18737 = (C18737) c12718.m23039(C18737.class, 0);
                                            if (c18737 != null) {
                                                c19304.m22072(m35649(c18737.m23038(46, 0)));
                                            } else {
                                                C5331 c5331 = (C5331) c12718.m23039(C5331.class, 0);
                                                if (c5331 == null) {
                                                    cls = cls2;
                                                    z3 = z6;
                                                    z2 = z8;
                                                    C19775 c19775 = (C19775) c12718.m23039(C19775.class, 0);
                                                    if (c19775 == null) {
                                                        C23301 c23301 = (C23301) c12718.m23039(C23301.class, 0);
                                                        if (c23301 == null) {
                                                            throw new RuntimeException(c12718.getText());
                                                        }
                                                        if (z4) {
                                                            Point pointM356312 = m35638(c23301);
                                                            throw new C3781(null, pointM356312.x, pointM356312.y, "childrenSyntax and contains cannot be used together");
                                                        }
                                                        z6 = z3;
                                                        for (C14128 c14128 : c23301.m23037(C14128.class)) {
                                                            if (c14128.m23038(42, 0) == null) {
                                                                c19304.m22074(m35643(c19304, (C22596) c14128.m23039(C22596.class, 0), z), c14128.m23038(52, 0) != null);
                                                            } else {
                                                                if (z9) {
                                                                    throw new RuntimeException(C9045.m23341(new StringBuilder(), m35639(c14128.f27156), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                                                }
                                                                if (z6) {
                                                                    throw new RuntimeException(C9045.m23341(new StringBuilder(), m35639(c14128.f27156), " Duplicate <EndMatcher>!"));
                                                                }
                                                                c19304.m22071(((ArrayList) c19304.m22090()).size());
                                                                z6 = true;
                                                            }
                                                        }
                                                        z8 = true;
                                                        it2 = it;
                                                    } else {
                                                        if (z7) {
                                                            Point pointM356313 = m35638(c19775);
                                                            throw new C3781(null, pointM356313.x, pointM356313.y, "Duplicate missingStyle");
                                                        }
                                                        c19304.m22088(m35649(c19775.m23038(46, 0)));
                                                        z7 = true;
                                                    }
                                                } else {
                                                    if (z4) {
                                                        Point pointM356314 = m35638(c5331);
                                                        throw new C3781(null, pointM356314.x, pointM356314.y, "Duplicate childrenSyntax");
                                                    }
                                                    if (z8) {
                                                        Point pointM356315 = m35638(c5331);
                                                        throw new C3781(null, pointM356315.x, pointM356315.y, "childrenSyntax and contains cannot be used together");
                                                    }
                                                    C19443 c19443 = (C19443) c5331.m23039(C19443.class, 0);
                                                    if (c19443 == null) {
                                                        c1664M5636 = C1664.m5637(m35649(c5331.m23038(46, 0)));
                                                        cls = cls2;
                                                        z3 = z6;
                                                        z2 = z8;
                                                    } else {
                                                        int i4 = Integer.parseInt(c19443.m23038(44, 0).getText());
                                                        C7074 c7074 = (C7074) c5331.m23039(C7074.class, 0);
                                                        boolean zM35647 = c7074 == null ? z : m35647(c7074.m23038(48, 0));
                                                        List listM23038 = c5331.m23037(C0391.class);
                                                        List listM23039 = c5331.m23037(C1097.class);
                                                        ArrayList arrayList6 = new ArrayList(listM23039.size());
                                                        HashSet hashSet3 = new HashSet();
                                                        Iterator it3 = listM23039.iterator();
                                                        while (it3.hasNext()) {
                                                            Iterator it4 = it3;
                                                            C1097 c1097 = (C1097) it3.next();
                                                            boolean z10 = z6;
                                                            String strM356411 = m35649(c1097.m23038(46, 0));
                                                            if (!hashSet3.add(strM356411)) {
                                                                Point pointM356316 = m35638(c1097);
                                                                throw new C3781(null, pointM356316.x, pointM356316.y, C20094.m46315("Duplicate childrenSyntax include: ", strM356411));
                                                            }
                                                            arrayList6.add(strM356411);
                                                            it3 = it4;
                                                            z6 = z10;
                                                        }
                                                        z3 = z6;
                                                        ArrayList arrayList7 = new ArrayList(listM23038.size());
                                                        ArrayList arrayList8 = new ArrayList(listM23038.size());
                                                        HashSet hashSet4 = new HashSet();
                                                        Iterator it5 = listM23038.iterator();
                                                        boolean z11 = false;
                                                        String strM356412 = null;
                                                        while (it5.hasNext()) {
                                                            z8 = z8;
                                                            C0391 c0391 = (C0391) it5.next();
                                                            it5 = it5;
                                                            if (c0391.m23038(14, 0) == null) {
                                                                C21559 c21559 = (C21559) c0391.m23039(C21559.class, 0);
                                                                Class<C16679> cls3 = cls2;
                                                                InterfaceC4181 interfaceC4181M23039 = c21559.m23038(46, 0);
                                                                if (interfaceC4181M23039 == null) {
                                                                    interfaceC4181M23039 = c21559.m23038(45, 0);
                                                                }
                                                                String strM356413 = m35649(interfaceC4181M23039);
                                                                if (!hashSet4.add(C1664.m5635(strM356413, zM35647))) {
                                                                    Point pointM356317 = m35638(c0391);
                                                                    throw new C3781(null, pointM356317.x, pointM356317.y, C20094.m46315("Duplicate childrenSyntax selector: ", strM356413));
                                                                }
                                                                arrayList7.add(strM356413);
                                                                arrayList8.add(m35649(c0391.m23038(46, 0)));
                                                                cls2 = cls3;
                                                            } else {
                                                                if (z11) {
                                                                    Point pointM356318 = m35638(c0391);
                                                                    throw new C3781(null, pointM356318.x, pointM356318.y, "Duplicate childrenSyntax default");
                                                                }
                                                                strM356412 = m35649(c0391.m23038(46, 0));
                                                                z11 = true;
                                                            }
                                                        }
                                                        cls = cls2;
                                                        z2 = z8;
                                                        c1664M5636 = C1664.m5636(i4, zM35647, arrayList6, arrayList7, arrayList8, strM356412);
                                                    }
                                                    c19304.m22073(c1664M5636);
                                                    z4 = true;
                                                }
                                                z8 = z2;
                                                it2 = it;
                                                z6 = z3;
                                            }
                                        }
                                    }
                                    cls = cls2;
                                    z3 = z6;
                                    z2 = z8;
                                    z8 = z2;
                                    it2 = it;
                                    z6 = z3;
                                }
                                cls2 = cls;
                            }
                        }
                    }
                    it = it2;
                    cls = cls2;
                    z3 = z6;
                    z2 = z8;
                    z8 = z2;
                    it2 = it;
                    z6 = z3;
                    cls2 = cls;
                }
                if (z4 && !z5) {
                    c19304.m22075(true);
                }
                c19304.m22081();
            } else {
                Class<C16679> cls4 = cls2;
                C3546 c3546 = (C3546) c22596.m23039(C3546.class, 0);
                if (c3546 != null) {
                    c19304 = new C4195(abstractC9693);
                    C19069 c190611 = (C19069) c3546.m23039(C19069.class, 0);
                    if (c190611 != null) {
                        c19304.m12654(m35649(c190611.m23038(46, 0)));
                    }
                    String strM356414 = m35649(((C1429) c3546.m23039(C1429.class, 0)).m23038(46, 0));
                    String strM356415 = "";
                    String strM356416 = "";
                    for (C4957 c4957 : c3546.m23037(C4957.class)) {
                        C24007 c24007 = (C24007) c4957.m23039(C24007.class, 0);
                        if (c24007 != null) {
                            strM356415 = m35649(c24007.m23038(46, 0));
                        } else {
                            C16951 c16951 = (C16951) c4957.m23039(C16951.class, 0);
                            if (c16951 != null) {
                                strM356416 = m35649(c16951.m23038(46, 0));
                            } else {
                                Class<C16679> cls5 = cls4;
                                C16679 c166710 = (C16679) c4957.m23039(cls5, 0);
                                if (c166710 == null) {
                                    throw new RuntimeException(c4957.getText());
                                }
                                c19304.m12657(m35649(c166710.m23038(46, 0)));
                                cls4 = cls5;
                            }
                        }
                    }
                    c19304.m12655(new C2784(strM356414, strM356415, strM356416));
                } else {
                    C8485 c8485 = (C8485) c22596.m23039(C8485.class, 0);
                    if (c8485 != null) {
                        String text2 = ((C20854) c8485.m23039(C20854.class, 0)).m23038(50, 0).getText();
                        c19304 = new C12039(abstractC9693);
                        c19304.m29413(text2);
                    } else {
                        C21891 c21891 = (C21891) c22596.m23039(C21891.class, 0);
                        if (c21891 != null) {
                            String strM356417 = m35649(c21891.m23038(46, 0));
                            c19304 = new C0252(abstractC9693);
                            c19304.m1513(strM356417);
                        } else {
                            C15539 c15539 = (C15539) c22596.m23039(C15539.class, 0);
                            if (c15539 == null) {
                                throw new RuntimeException(c22596.getText());
                            }
                            c19304 = new C19304(abstractC9693);
                            C19069 c190612 = (C19069) c15539.m23039(C19069.class, 0);
                            if (c190612 != null) {
                                c19304.m44496(m35649(c190612.m23038(46, 0)));
                            }
                            c19304.m44501(((C17657) ((C18363) c15539.m23039(C18363.class, 0)).m23039(C17657.class, 0)).getText());
                            C16679 c166711 = (C16679) c15539.m23039(cls4, 0);
                            if (c166711 != null) {
                                c19304.m44498(m35649(c166711.m23038(46, 0)));
                            }
                            Iterator it6 = ((C6036) c15539.m23039(C6036.class, 0)).m23037(C22596.class).iterator();
                            while (it6.hasNext()) {
                                c19304.m44499(m35643(c19304, (C22596) it6.next(), z));
                            }
                        }
                    }
                }
            }
        }
        c19304.f29308 = m35638(c22596);
        return c19304;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35641(AbstractC9693 abstractC9693, C1863 c1863) {
        int i;
        int i2;
        int i3 = 0;
        InterfaceC4181 interfaceC4181M23038 = c1863.m23038(46, 0);
        InterfaceC4181 interfaceC4181M23039 = c1863.m23038(47, 0);
        C9191 c9191 = (C9191) c1863.m23039(C9191.class, 0);
        C21186 c21186 = (C21186) c1863.m23039(C21186.class, 0);
        if (interfaceC4181M23038 != null) {
            return m35649(interfaceC4181M23038);
        }
        int i4 = 1;
        if (interfaceC4181M23039 != null) {
            String text = interfaceC4181M23039.getText();
            return text.substring(1, text.length() - 1).replace("\\/", "/");
        }
        if (c9191 == null) {
            if (c21186 == null) {
                throw new IllegalArgumentException("Expected a static regex fragment");
            }
            C15068 c15068Mo24638 = abstractC9693 == null ? null : abstractC9693.mo24638();
            if (c15068Mo24638 == null) {
                throw new RuntimeException("Include regex is not supported here!");
            }
            String strM35649 = m35649(c21186.m23038(46, 0));
            Object obj = c15068Mo24638.f46027.get(strM35649);
            if (obj == null) {
                throw new RuntimeException(C20094.m46315("Definition not found: ", strM35649));
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new RuntimeException(C20094.m46315("Not a regex definition: ", strM35649));
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it = c9191.m23042(46).iterator();
        while (it.hasNext()) {
            Collections.addAll(hashSet, m35649((InterfaceC4181) it.next()).split("\\s+"));
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        C5192 c5192 = new C5192("Start", i3);
        C5192 c5193 = new C5192("End", i3);
        C5192 c5194 = new C5192("StartEnd", i3);
        C5192 c5195 = new C5192("None", i3);
        for (String str : hashSet) {
            if (!str.isEmpty()) {
                char cCharAt = str.charAt(i3);
                boolean z = cCharAt == '_' || Character.isLetterOrDigit(cCharAt);
                char cM19937 = C7416.m19937(i4, str);
                boolean z2 = cM19937 == '_' || Character.isLetterOrDigit(cM19937);
                ArrayList arrayList = new ArrayList(str.length() + i4);
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                boolean z3 = true;
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt2 = str.charAt(i5);
                    if (i5 == 0) {
                        arrayList.add(C3939.m11985(String.valueOf(cCharAt2)));
                    } else {
                        boolean zIsLetterOrDigit = Character.isLetterOrDigit(cCharAt2);
                        if (zIsLetterOrDigit != z3) {
                            if (sb.length() > 0) {
                                arrayList.add(C3939.m11985(sb.toString()));
                                sb.setLength(0);
                            }
                            z3 = zIsLetterOrDigit;
                        }
                        sb.append(cCharAt2);
                    }
                }
                if (sb.length() > 0) {
                    arrayList.add(C3939.m11985(sb.toString()));
                }
                arrayList.add("");
                if (z && z2) {
                    c5194.m14962(arrayList, 0);
                } else if (z) {
                    c5192.m14962(arrayList, 0);
                } else if (z2) {
                    c5193.m14962(arrayList, 0);
                } else {
                    c5195.m14962(arrayList, 0);
                }
                i3 = 0;
                i4 = 1;
            }
        }
        C5192 c5196 = new C5192("Root", 0);
        ArrayList arrayList2 = new ArrayList(3);
        if (c5192.f16274.isEmpty()) {
            i = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c5192.f16274.m3393());
            i = 0;
            c5196.m14962(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c5193.f16274.isEmpty()) {
            arrayList2.add(c5193.f16274.m3393());
            arrayList2.add("\\b");
            c5196.m14962(arrayList2, i);
            arrayList2.clear();
        }
        if (c5194.f16274.isEmpty()) {
            i2 = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c5194.f16274.m3393());
            arrayList2.add("\\b");
            i2 = 0;
            c5196.m14962(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c5195.f16274.isEmpty()) {
            arrayList2.add(c5195.f16274.m3393());
            c5196.m14962(arrayList2, i2);
            arrayList2.clear();
        }
        ArrayList<C5192> arrayList3 = new ArrayList(c5196.f16274.values());
        Collections.sort(arrayList3);
        StringBuilder sb2 = new StringBuilder("(?:");
        boolean z4 = true;
        for (C5192 c5197 : arrayList3) {
            if (z4) {
                z4 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(c5197.m14961());
        }
        sb2.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb2.toString();
    }
}
