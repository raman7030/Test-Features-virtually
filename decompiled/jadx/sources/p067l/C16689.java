package p067l;

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
public final class C16689 extends AbstractC11581 {

    /* JADX INFO: renamed from: ۠ */
    public static final C9091 f49138 = new C9091();

    /* JADX INFO: renamed from: ֡ */
    public String f49139;

    /* JADX INFO: renamed from: ֨ */
    public final Set f49140;

    /* JADX INFO: renamed from: ۖ */
    public int f49141;

    /* JADX INFO: renamed from: ۘ */
    public boolean f49142;

    /* JADX INFO: renamed from: ۚ */
    public Callable f49143;

    /* JADX INFO: renamed from: ۜ */
    public final List f49144;

    /* JADX INFO: renamed from: ۡ */
    public final Map f49145;

    /* JADX INFO: renamed from: ۢ */
    public C23120 f49146;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC8644 f49147;

    /* JADX INFO: renamed from: ܺ */
    public final C9314 f49148;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f49149;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC18702 f49150;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f49151;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f49152;

    /* JADX INFO: renamed from: ᩵ */
    public final ArrayList f49153;

    /* JADX INFO: renamed from: ᩷ */
    public final C7026 f49154;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f49155;

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final C16689 mo26652() {
        return this;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        String str;
        c11996.mo15113(20224);
        c11996.m27456();
        c11996.m27459(this.f49139);
        Set set = this.f49140;
        c11996.mo15113(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c11996.m27459((String) it.next());
        }
        c11996.m27445(this.f49152);
        ArrayList<InterfaceC20636> arrayList = this.f49155;
        c11996.mo15113(arrayList.size());
        for (InterfaceC20636 interfaceC20636 : arrayList) {
            if (interfaceC20636 instanceof C2529) {
                C2529 c2529 = (C2529) interfaceC20636;
                c11996.writeByte(0);
                c11996.m27459(c2529.f4161);
                c11996.m27445(c2529.f4160);
                c11996.m27445(c2529.f4162);
            } else if (interfaceC20636 instanceof C7224) {
                C7224 c7224 = (C7224) interfaceC20636;
                c11996.writeByte(1);
                c11996.m27459(c7224.f18855);
                c11996.m27459(c7224.f18854);
                c11996.m27445(c7224.f18852);
                c11996.m27445(c7224.f18853);
            } else {
                throw new RuntimeException();
            }
        }
        int i = C9038.f24535;
        InterfaceC18702 interfaceC18702 = InterfaceC18702.f55862;
        String str2 = null;
        InterfaceC18702 interfaceC18703 = this.f49150;
        if (interfaceC18703 == interfaceC18702) {
            str = "#BUILT_IN_LUA_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55858) {
            str = "#BUILT_IN_PYTHON_FORMATTER#";
        } else if (interfaceC18703 == null) {
            str = null;
        } else if (interfaceC18703 == InterfaceC18702.f55867) {
            str = "#BUILT_IN_MTSX_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55857) {
            str = "#BUILT_IN_CSS_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55861) {
            str = "#BUILT_IN_HTML_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55865) {
            str = "#BUILT_IN_JS_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55860) {
            str = "#BUILT_IN_TS_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55864) {
            str = "#BUILT_IN_JSON_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55859) {
            str = "#BUILT_IN_XML_FORMATTER#";
        } else if (interfaceC18703 == InterfaceC18702.f55866) {
            str = "#BUILT_IN_SMALI_FORMATTER#";
        } else {
            if (interfaceC18703 != InterfaceC18702.f55863) {
                throw new RuntimeException(interfaceC18703.toString());
            }
            str = "#BUILT_IN_JAVA_FORMATTER#";
        }
        c11996.m27444(str);
        InterfaceC8644 interfaceC8644 = this.f49147;
        if (interfaceC8644 != null) {
            if (interfaceC8644 == InterfaceC8644.f23207) {
                str2 = "#BUILT_IN_CSS_SHRINKER#";
            } else if (interfaceC8644 == InterfaceC8644.f23208) {
                str2 = "#BUILT_IN_HTML_SHRINKER#";
            } else if (interfaceC8644 == InterfaceC8644.f23209) {
                str2 = "#BUILT_IN_JS_SHRINKER#";
            } else {
                if (interfaceC8644 != InterfaceC8644.f23210) {
                    throw new RuntimeException(interfaceC8644.toString());
                }
                str2 = "#BUILT_IN_JSON_SHRINKER#";
            }
        }
        c11996.m27444(str2);
        C7026 c7026 = this.f49154;
        c11996.mo15113(c7026.m16164());
        InterfaceC13833 it2 = c7026.m16163().iterator();
        while (it2.hasNext()) {
            InterfaceC13340 interfaceC13340 = (InterfaceC13340) it2.next();
            c11996.m27459(C7026.m16159(interfaceC13340.mo17550()));
            ((C23120) interfaceC13340.getValue()).m51555(c11996);
        }
        ArrayList<C9985> arrayList2 = this.f49153;
        c11996.mo15113(arrayList2.size());
        for (C9985 c9985 : arrayList2) {
            c11996.m27459(c9985.f27657.pattern());
            c11996.mo15113(c9985.f27657.flags());
            c9985.f27658.m51555(c11996);
        }
        List list = this.f49144;
        c11996.mo15113(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((AbstractC11581) it3.next()).mo3914(c11996);
        }
        Map map = this.f49145;
        c11996.mo15113(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c11996.m27459((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof AbstractC11581) {
                c11996.writeByte(0);
                ((AbstractC11581) value).mo3914(c11996);
            } else if (value instanceof String) {
                c11996.writeByte(1);
                c11996.m27459((String) value);
            } else if (value instanceof C9787) {
                c11996.writeByte(2);
                ((C9787) value).m22811(c11996);
            } else {
                throw new RuntimeException();
            }
        }
        ArrayList arrayList3 = this.f49149;
        if (arrayList3 == null) {
            c11996.mo15111((short) -1);
        } else {
            c11996.mo15111((short) arrayList3.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c11996.m27459((String) it4.next());
            }
        }
        c11996.m27438();
    }

    public C16689(C14677 c14677) throws IOException {
        super(null);
        this.f49154 = new C7026();
        this.f49153 = new ArrayList();
        this.f49155 = new ArrayList();
        this.f49150 = null;
        this.f49147 = null;
        this.f49148 = C9038.m20932();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        this.f49140 = C21562.unmodifiableSet(linkedHashSet);
        this.f49144 = C21562.unmodifiableList(arrayList);
        this.f49145 = C21562.unmodifiableMap(map);
        C23395.m52059(c14677, 20224);
        c14677.readInt();
        this.f49139 = c14677.m33593();
        int iM33581 = c14677.m33581();
        for (int i = 0; i < iM33581; i++) {
            linkedHashSet.add(c14677.m33593());
        }
        this.f49152 = c14677.m33585();
        int iM33582 = c14677.m33581();
        this.f49155.ensureCapacity(iM33582);
        for (int i2 = 0; i2 < iM33582; i2++) {
            byte b = c14677.readByte();
            if (b == 0) {
                this.f49155.add(new C2529(c14677.m33593(), c14677.m33585(), c14677.m33585()));
            } else {
                if (b != 1) {
                    throw new RuntimeException("Unknown comment type");
                }
                this.f49155.add(new C7224(c14677.m33593(), c14677.m33593(), c14677.m33585(), c14677.m33585()));
            }
        }
        this.f49150 = C9038.m20934(c14677.m33590());
        this.f49147 = C9038.m20938(c14677.m33590());
        int iM33583 = c14677.m33581();
        for (int i3 = 0; i3 < iM33583; i3++) {
            this.f49154.m16162(c14677.m33593(), C23120.m51550(c14677));
        }
        int iM33584 = c14677.m33581();
        this.f49153.ensureCapacity(iM33584);
        for (int i4 = 0; i4 < iM33584; i4++) {
            this.f49153.add(new C9985(C9038.m20911(c14677.m33581(), c14677.m33593()), C23120.m51550(c14677)));
        }
        int iM33585 = c14677.m33581();
        for (int i5 = 0; i5 < iM33585; i5++) {
            arrayList.add(AbstractC11581.m26651(this, c14677));
        }
        int iM33586 = c14677.m33581();
        for (int i6 = 0; i6 < iM33586; i6++) {
            String strM33593 = c14677.m33593();
            byte b2 = c14677.readByte();
            if (b2 == 0) {
                map.put(strM33593, AbstractC11581.m26651(this, c14677));
            } else if (b2 == 1) {
                map.put(strM33593, c14677.m33593());
            } else {
                if (b2 != 2) {
                    throw new IOException(C20778.m46922(b2, "Unknown syntax definition type: "));
                }
                map.put(strM33593, C9787.m22808(c14677));
            }
        }
        short s = c14677.readShort();
        if (s < 0) {
            this.f49149 = null;
            return;
        }
        this.f49149 = new ArrayList(s);
        for (int i7 = 0; i7 < s; i7++) {
            this.f49149.add(c14677.m33593());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16689(C14140 c14140) {
        Iterator it;
        ArrayList arrayList;
        Class<C9446> cls;
        Class<C6764> cls2;
        ArrayList arrayList2;
        Class<C4139> cls3;
        Class<C6764> cls4;
        C23120 c23120M51549;
        super(null);
        ArrayList arrayList3 = null;
        this.f49154 = new C7026();
        this.f49153 = new ArrayList();
        this.f49155 = new ArrayList();
        this.f49150 = null;
        this.f49147 = null;
        this.f49148 = C9038.m20932();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<AbstractC11581> arrayList4 = new ArrayList();
        HashMap map = new HashMap();
        this.f49140 = C21562.unmodifiableSet(linkedHashSet);
        this.f49144 = C21562.unmodifiableList(arrayList4);
        this.f49145 = C21562.unmodifiableMap(map);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = c14140.m25011(C12129.class).iterator();
        int i = 0;
        boolean zM37805 = false;
        while (true) {
            Class<C9446> cls5 = C9446.class;
            Class<C6764> cls6 = C6764.class;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    C12129 c12129 = (C12129) it3.next();
                    C6764 c6764 = (C6764) c12129.m25013(cls6, 0);
                    if (c6764 != null) {
                        C14810 c14810 = (C14810) c6764.m25013(C14810.class, 0);
                        C5423 c5423 = (C5423) c6764.m25013(C5423.class, 0);
                        C11775 c11775 = (C11775) c6764.m25013(C11775.class, 0);
                        C24869 c24869 = (C24869) c6764.m25013(C24869.class, 0);
                        String strM37807 = m37807(c14810.m25012(46, 0));
                        String strM37808 = c5423 == null ? null : m37807(c5423.m25012(46, 0));
                        boolean z = c11775 == null || m37805(c11775.m25012(48, 0));
                        boolean z2 = c24869 == null || m37805(c24869.m25012(48, 0));
                        C3673 c3673 = new C3673(this);
                        if (strM37808 == null) {
                            this.f49155.add(new C2529(strM37807, z, zM37805));
                            if (z2) {
                                c3673.m7085(C9038.m20911(zM37805 ? 2 : 0, C17588.m40053(C6112.m13905(strM37807), ".*")));
                            }
                            it = it3;
                        } else {
                            it = it3;
                            this.f49155.add(new C7224(strM37807, strM37808, z, zM37805));
                            if (z2) {
                                c3673.m7085(C9038.m20911(zM37805 ? 2 : 0, C21459.m48622("(?s)", C6112.m13905(strM37807), ".*?(", C6112.m13905(strM37808), "|$)")));
                            }
                        }
                        if (z2) {
                            c3673.m7083(C5685.m12667(0, "comment"));
                            arrayList4.add(c3673);
                        }
                    } else {
                        it = it3;
                        C9446 c9446 = (C9446) c12129.m25013(cls5, 0);
                        Class<C4139> cls7 = C4139.class;
                        if (c9446 != null) {
                            Iterator it4 = c9446.m25011(C15480.class).iterator();
                            while (it4.hasNext()) {
                                C15480 c15480 = (C15480) it4.next();
                                String strM37809 = m37807(c15480.m25012(46, 0));
                                if (map.containsKey(strM37809)) {
                                    throw new RuntimeException(C21466.m48631("Duplicate defines: ", strM37809));
                                }
                                Iterator it5 = it4;
                                C12857 c12857 = (C12857) c15480.m25013(C12857.class, 0);
                                Class<C9446> cls8 = cls5;
                                C16821 c16821 = (C16821) c15480.m25013(C16821.class, 0);
                                List listM25011 = c15480.m25011(C23844.class);
                                if (c12857 != null) {
                                    map.put(strM37809, m37798(this, c12857.m25011(cls7)));
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                } else if (c16821 != null) {
                                    List listM25012 = c16821.m25011(C10117.class);
                                    ArrayList arrayList6 = new ArrayList(listM25012.size());
                                    cls4 = cls6;
                                    ArrayList arrayList7 = new ArrayList(listM25012.size());
                                    Iterator it6 = listM25012.iterator();
                                    while (it6.hasNext()) {
                                        C10117 c10117 = (C10117) it6.next();
                                        Iterator it7 = it6;
                                        ArrayList arrayList8 = arrayList3;
                                        C22858 c22858 = (C22858) c10117.m25013(C22858.class, 0);
                                        Class<C4139> cls9 = cls7;
                                        InterfaceC6342 interfaceC6342M25012 = c22858.m25012(46, 0);
                                        if (interfaceC6342M25012 == null) {
                                            interfaceC6342M25012 = c22858.m25012(45, 0);
                                        }
                                        arrayList6.add(m37807(interfaceC6342M25012));
                                        arrayList7.add(m37807(c10117.m25012(46, 0)));
                                        it6 = it7;
                                        arrayList3 = arrayList8;
                                        cls7 = cls9;
                                    }
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    try {
                                        map.put(strM37809, C9787.m22807(arrayList6, arrayList7));
                                    } catch (IllegalArgumentException e) {
                                        Point pointM37796 = m37796(c16821);
                                        C5962 c5962 = new C5962(null, pointM37796.x, pointM37796.y, e.getMessage());
                                        c5962.initCause((Throwable) e);
                                        throw c5962;
                                    }
                                } else {
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                    if (listM25011 == null) {
                                        throw new RuntimeException();
                                    }
                                    if (listM25011.isEmpty()) {
                                        throw new RuntimeException("[Define " + c15480.m25012(46, 0).getText() + "]: Matchers cannot be empty");
                                    }
                                    if (listM25011.size() == 1) {
                                        AbstractC11581 abstractC11581M37801 = m37801(this, (C23844) listM25011.get(0), zM37805);
                                        m37804(abstractC11581M37801, strM37809);
                                        map.put(strM37809, abstractC11581M37801);
                                    } else {
                                        C4621 c4621 = new C4621(this);
                                        ArrayList arrayList9 = new ArrayList();
                                        Iterator it8 = listM25011.iterator();
                                        int i2 = 1;
                                        while (it8.hasNext()) {
                                            AbstractC11581 abstractC11581M37802 = m37801(c4621, (C23844) it8.next(), zM37805);
                                            StringBuilder sbM21133 = C9179.m21133(strM37809, "[");
                                            sbM21133.append(i2);
                                            sbM21133.append("]");
                                            m37804(abstractC11581M37802, sbM21133.toString());
                                            arrayList9.add(abstractC11581M37802);
                                            i2++;
                                        }
                                        c4621.m9746(arrayList9);
                                        map.put(strM37809, c4621);
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
                            C8105 c8105 = (C8105) c12129.m25013(C8105.class, 0);
                            if (c8105 != null) {
                                Iterator it9 = c8105.m25011(C23844.class).iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(m37801(this, (C23844) it9.next(), zM37805));
                                }
                            } else {
                                C17808 c17808 = (C17808) c12129.m25013(C17808.class, 0);
                                if (c17808 == null) {
                                    throw new RuntimeException(c12129.getText());
                                }
                                AbstractC11581 abstractC11581 = this.f32257;
                                List listM25013 = ((C12857) ((C5069) c17808.m25013(C5069.class, 0)).m25013(C12857.class, 0)).m25011(cls7);
                                try {
                                    this.f49153.add(new C9985(C9038.m20911(zM37805 ? 2 : 0, m37798(abstractC11581, listM25013)), m37809(C7026.m16158(m37807(((C18220) c17808.m25013(C18220.class, 0)).m25012(46, 0))))));
                                } catch (PatternSyntaxException e2) {
                                    throw new RuntimeException(m37797(((C10856) listM25013.get(0)).f30091) + " " + e2.getMessage());
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
                this.f49149 = arrayList3;
                mo3915(new C22310());
                ArrayList arrayList10 = new ArrayList();
                for (AbstractC11581 abstractC11582 : arrayList4) {
                    if (abstractC11582 instanceof C2608) {
                        arrayList10.addAll(m37800(abstractC11582, new HashSet()));
                    } else {
                        arrayList10.add(abstractC11582);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList10);
                return;
            }
            C12129 c121210 = (C12129) it2.next();
            C7751 c7751 = (C7751) c121210.m25013(C7751.class, i);
            if (c7751 != null) {
                List listM25016 = ((C9762) c7751.m25013(C9762.class, i)).m25016(46);
                this.f49139 = m37807((InterfaceC6342) listM25016.get(i));
                for (int i3 = 1; i3 < listM25016.size(); i3++) {
                    linkedHashSet.add(m37807((InterfaceC6342) listM25016.get(i3)));
                }
            } else {
                C16467 c16467 = (C16467) c121210.m25013(C16467.class, i);
                if (c16467 != null) {
                    this.f49152 = m37805(c16467.m25012(48, i));
                } else {
                    C13470 c13470 = (C13470) c121210.m25013(C13470.class, i);
                    if (c13470 != null) {
                        for (C24198 c24198 : c13470.m25011(C24198.class)) {
                            List listM25017 = c24198.m25016(46);
                            List listM25018 = c24198.m25016(49);
                            InterfaceC6342 interfaceC6342M25013 = c24198.m25012(51, i);
                            String strM378010 = m37807((InterfaceC6342) listM25017.get(i));
                            if (strM378010.startsWith("!!")) {
                                throw new RuntimeException("Illegal style name: " + listM25018);
                            }
                            if (listM25017.size() == 2) {
                                c23120M51549 = m37809(C7026.m16158(m37807((InterfaceC6342) listM25017.get(1))));
                                if (interfaceC6342M25013 != null) {
                                    c23120M51549 = c23120M51549.m51552(m37795(interfaceC6342M25013));
                                }
                            } else if (listM25018.size() == 2) {
                                int[] iArr = new int[2];
                                m37803(c24198.m25012(49, 0).getText(), iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                m37803(c24198.m25012(49, 1).getText(), iArr);
                                c23120M51549 = C23120.m51549(null, i4, i5, iArr[0], iArr[1], m37795(c24198.m25012(51, 0)));
                            } else {
                                c23120M51549 = C23120.m51549(null, 1447446, 1447446, 1447446, 1447446, m37795(interfaceC6342M25013));
                            }
                            this.f49154.m16162(strM378010, c23120M51549);
                            i = 0;
                        }
                    } else {
                        C23528 c23528 = (C23528) c121210.m25013(C23528.class, 0);
                        if (c23528 != null) {
                            this.f49150 = C9038.m20934(c23528.m25012(50, 0).getText());
                        } else {
                            C21517 c21517 = (C21517) c121210.m25013(C21517.class, 0);
                            if (c21517 != null) {
                                this.f49147 = C9038.m20938(c21517.m25012(50, 0).getText());
                            } else {
                                C8776 c8776 = (C8776) c121210.m25013(C8776.class, 0);
                                if (c8776 != null) {
                                    List<InterfaceC6342> listM25019 = c8776.m25016(46);
                                    ArrayList arrayList11 = new ArrayList(listM25019.size());
                                    for (InterfaceC6342 interfaceC6342 : listM25019) {
                                        String strM378011 = m37807(interfaceC6342);
                                        if (strM378011.length() != 2 || strM378011.charAt(0) == strM378011.charAt(1)) {
                                            throw new RuntimeException(m37797(interfaceC6342.mo14503()) + " Illegal bracket pair " + interfaceC6342.getText());
                                        }
                                        arrayList11.add(strM378011);
                                    }
                                    arrayList3 = arrayList11;
                                } else {
                                    C9092 c9092 = (C9092) c121210.m25013(C9092.class, 0);
                                    if (c9092 != null) {
                                        zM37805 = m37805(c9092.m25012(48, 0));
                                    } else if (((C6764) c121210.m25013(cls6, 0)) != null) {
                                        arrayList5.add(c121210);
                                    } else if (((C9446) c121210.m25013(cls5, 0)) != null) {
                                        arrayList5.add(c121210);
                                    } else if (((C8105) c121210.m25013(C8105.class, 0)) != null) {
                                        arrayList5.add(c121210);
                                    } else {
                                        if (((C17808) c121210.m25013(C17808.class, 0)) == null) {
                                            throw new RuntimeException(c121210.getText());
                                        }
                                        arrayList5.add(c121210);
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

    /* JADX INFO: renamed from: ֫ */
    public static Point m37796(C10856 c10856) {
        InterfaceC2808 interfaceC2808 = c10856.f30091;
        return new Point(interfaceC2808.getLine(), interfaceC2808.mo4429());
    }

    /* JADX INFO: renamed from: ֫ */
    private List m37800(AbstractC11581 abstractC11581, HashSet hashSet) {
        if (abstractC11581 instanceof C2608) {
            C2608 c2608 = (C2608) abstractC11581;
            if (hashSet.add(c2608.m3916())) {
                AbstractC11581 abstractC11581M37816 = m37816(c2608.m3916());
                if (abstractC11581M37816 instanceof C4621) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((C4621) abstractC11581M37816).m9745().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(m37800((AbstractC11581) it.next(), new HashSet(hashSet)));
                    }
                    return arrayList;
                }
                return m37800(abstractC11581M37816, new HashSet(hashSet));
            }
        }
        if (abstractC11581.f32257 != this) {
            return Collections.singletonList(abstractC11581.mo3910(this));
        }
        return Collections.singletonList(abstractC11581);
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
        Iterator it = this.f49144.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3915(c22310);
        }
        for (Map.Entry entry : this.f49145.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC11581) {
                AbstractC11581 abstractC11581 = (AbstractC11581) value;
                if (c22310.f70454.add((String) entry.getKey())) {
                    abstractC11581.mo3915(c22310);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37804(AbstractC11581 abstractC11581, String str) {
        if (abstractC11581 instanceof C3673) {
            C3673 c3673 = (C3673) abstractC11581;
            if (c3673.m7093() == null) {
                c3673.m7082(str);
                return;
            }
            return;
        }
        if (abstractC11581 instanceof C10379) {
            C10379 c10379 = (C10379) abstractC11581;
            if (c10379.m24050() == null) {
                c10379.m24052(str);
                return;
            }
            return;
        }
        if (abstractC11581 instanceof C6356) {
            C6356 c6356 = (C6356) abstractC11581;
            if (c6356.m14534() == null) {
                c6356.m14530(str);
                return;
            }
            return;
        }
        if (abstractC11581 instanceof C20715) {
            C20715 c20715 = (C20715) abstractC11581;
            if (c20715.m46797() == null) {
                c20715.m46790(str);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37798(AbstractC11581 abstractC11581, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4139 c4139 = (C4139) it.next();
            if (((C18891) c4139.m25013(C18891.class, 0)) != null) {
                Point pointM37796 = m37796(c4139);
                throw new C5962(null, pointM37796.x, pointM37796.y, "var() is not allowed in regex definitions or static match fields");
            }
            sb.append(m37799(abstractC11581, c4139));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37803(String str, int[] iArr) {
        boolean z;
        int iIndexOf = str.indexOf(35, 4);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(36, 4);
            z = true;
        } else {
            z = false;
        }
        if (iIndexOf == -1) {
            iArr[0] = m37806(str);
            iArr[1] = 1447446;
            return;
        }
        iArr[0] = m37806(str.substring(0, iIndexOf));
        if (z) {
            int iM37806 = m37806("#" + str.substring(iIndexOf + 1));
            iArr[1] = iM37806;
            iArr[1] = (iM37806 & 16777215) | 100663296;
            return;
        }
        iArr[1] = m37806(str.substring(iIndexOf));
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m37806(String str) {
        if (str.equalsIgnoreCase("#NULL")) {
            return 1447446;
        }
        C9091 c9091 = f49138;
        synchronized (c9091) {
            if (!C11774.m27006(str, c9091)) {
                return -65536;
            }
            return c9091.f24647;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37795(InterfaceC6342 interfaceC6342) {
        int i = 0;
        if (interfaceC6342 != null) {
            String text = interfaceC6342.getText();
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

    /* JADX INFO: renamed from: ܽ */
    public static String m37807(InterfaceC6342 interfaceC6342) {
        return C11905.f33152.m30298(C17073.m38720(1, 1, interfaceC6342.getText()));
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m37805(InterfaceC6342 interfaceC6342) {
        return interfaceC6342.getText().equals("true");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37797(InterfaceC2808 interfaceC2808) {
        int line = interfaceC2808.getLine();
        int iMo4429 = interfaceC2808.mo4429();
        StringBuilder sb = new StringBuilder();
        if (iMo4429 > 0) {
            sb.append('[');
            sb.append(line);
            sb.append(':');
            sb.append(iMo4429 + 1);
            sb.append(']');
        } else {
            sb.append("[line ");
            sb.append(line);
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܳ */
    public final C23120 m37819() {
        C23120 c23120 = this.f49146;
        if (c23120 != null) {
            return c23120;
        }
        C23120 c23120M37809 = m37809(C7026.f18308);
        this.f49146 = c23120M37809;
        return c23120M37809;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m37809(int i) {
        boolean z = i < 0;
        if (z) {
            i = -i;
        }
        C23120 c23120M16160 = this.f49154.m16160(i);
        if (c23120M16160 == null) {
            int i2 = C9038.f24535;
            C9314 c9314 = this.f49148;
            C23120 c23120M16161 = c9314.f25324.m16160(i);
            if (c23120M16161 == null) {
                c23120M16161 = c9314.f25325;
            }
            c23120M16160 = c23120M16161;
        }
        return z ? c23120M16160.m51559() : c23120M16160;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C9314 m37827() {
        return this.f49148;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m37815() {
        return this.f49139;
    }

    /* JADX INFO: renamed from: ܺ */
    public final Set m37820() {
        return this.f49140;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final List m37826() {
        return C21562.unmodifiableList(this.f49155);
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m37821() {
        return this.f49149;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18702 m37823() {
        InterfaceC18702 interfaceC18702 = this.f49150;
        return (interfaceC18702 == null && "MT-Syntax".equals(this.f49139)) ? InterfaceC18702.f55867 : interfaceC18702;
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC8644 m37822() {
        return this.f49147;
    }

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList m37813() {
        return this.f49153;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m37812() {
        return this.f49152;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        mo3912(sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC11581 m37816(String str) {
        Object obj = this.f49145.get(str);
        if (obj == null) {
            throw new RuntimeException(C21466.m48631("Definition not found: ", str));
        }
        if (obj instanceof AbstractC11581) {
            return (AbstractC11581) obj;
        }
        throw new RuntimeException(C21466.m48631("Not a matcher definition: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9787 m37808(String str) {
        Object obj = this.f49145.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(C21466.m48631("Definition not found: ", str));
        }
        if (obj instanceof C9787) {
            return (C9787) obj;
        }
        throw new IllegalArgumentException(C21466.m48631("Not a childrenSyntax mapping definition: ", str));
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(AbstractC11581 abstractC11581) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        sb.append("[Language]\n");
        sb.append("Name: ");
        sb.append(this.f49139);
        sb.append('\n');
        sb.append("Suffixes: ");
        sb.append(this.f49140);
        sb.append('\n');
        sb.append("Comment: ");
        sb.append(this.f49155);
        sb.append('\n');
        Map map = this.f49145;
        if (!map.isEmpty()) {
            sb.append("Defines: ");
            sb.append('\n');
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                Object value = entry.getValue();
                if (value instanceof AbstractC11581) {
                    ((AbstractC11581) value).mo3912(sb, 0);
                } else if (value instanceof C9787) {
                    ((C9787) value).m22809(sb);
                } else {
                    sb.append(value);
                    sb.append("\n");
                }
            }
        }
        sb.append("Contains: ");
        sb.append('\n');
        Iterator it = this.f49144.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3912(sb, 0);
        }
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3913(ArrayList arrayList) {
        Iterator it = this.f49144.iterator();
        while (it.hasNext()) {
            ((AbstractC11581) it.next()).mo3913(arrayList);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37817() {
        mo3913(new ArrayList());
        for (Object obj : this.f49145.values()) {
            if (obj instanceof AbstractC11581) {
                ((AbstractC11581) obj).mo3913(new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final List m37811() {
        return this.f49144;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37810(Callable callable) {
        this.f49143 = callable;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m37814() {
        return (String) this.f49143.call();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23120 m37802(C4753 c4753) {
        int[] iArr = new int[2];
        m37803(c4753.m25012(49, 0).getText(), iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        m37803(c4753.m25012(49, 1).getText(), iArr);
        return C23120.m51549(null, i, i2, iArr[0], iArr[1], m37795(c4753.m25012(51, 0)));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37818(int i) {
        if (this.f49142 && this.f49141 != i) {
            throw new IllegalStateException("Language semantic hash is already initialized");
        }
        this.f49141 = i;
        this.f49142 = true;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m37824() {
        this.f49151 = true;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m37825() {
        if (this.f49151) {
            throw new IllegalArgumentException("Cached language requires recompilation");
        }
    }

    public final int hashCode() {
        return this.f49141;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۢܺܿ, l.᩵ۜܿ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.֡ۜܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ۢܺܿ, l.ۨ᩻ܿ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [l.ۘ᩷ܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.۠᩷ܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.֨᩷ܿ, l.ۢܺܿ] */
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC11581 m37801(AbstractC11581 abstractC11581, C23844 c23844, boolean z) {
        ?? c20715;
        Class<C18220> cls;
        boolean z2;
        boolean z3;
        Iterator it;
        C3950 c3950M7866;
        C21833 c21833 = (C21833) c23844.m25013(C21833.class, 0);
        if (c21833 != null) {
            c20715 = new C3673(abstractC11581);
            C20492 c20492 = (C20492) c21833.m25013(C20492.class, 0);
            if (c20492 != null) {
                c20715.m7082(m37807(c20492.m25012(46, 0)));
            }
            List<C4139> listM25011 = ((C12857) ((C5069) c21833.m25013(C5069.class, 0)).m25013(C12857.class, 0)).m25011(C4139.class);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (C4139 c4139 : listM25011) {
                C18891 c18891 = (C18891) c4139.m25013(C18891.class, 0);
                if (c18891 == null) {
                    sb.append(m37799(abstractC11581, c4139));
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    arrayList2.add(m37807(c18891.m25012(46, 0)));
                }
            }
            arrayList.add(sb.toString());
            try {
                C7697 c7697M17822 = C7697.m17822(arrayList, arrayList2, z ? 2 : 0);
                c20715.m7084(c7697M17822);
                int iM17831 = c7697M17822.m17831();
                C12445 c12445 = (C12445) c21833.m25013(C12445.class, 0);
                if (c12445 != null) {
                    c20715.m7086(m37805(c12445.m25012(48, 0)));
                }
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (C6094 c6094 : c21833.m25011(C6094.class)) {
                    int i = Integer.parseInt(c6094.m25012(44, 0).getText());
                    String strM37807 = m37807(c6094.m25012(46, 0));
                    if (i > iM17831) {
                        Point pointM37796 = m37796(c6094);
                        throw new C5962(null, pointM37796.x, pointM37796.y, "No start capture group " + i + " for exported variable \"" + strM37807 + "\"");
                    }
                    if (!hashSet.add(Integer.valueOf(i))) {
                        Point pointM37797 = m37796(c6094);
                        throw new C5962(null, pointM37797.x, pointM37797.y, C19768.m44906(i, "Capture group ", " is exported more than once"));
                    }
                    if (!hashSet2.add(strM37807)) {
                        Point pointM37798 = m37796(c6094);
                        throw new C5962(null, pointM37798.x, pointM37798.y, C21466.m48631("Duplicate exported variable: ", strM37807));
                    }
                    arrayList3.add(new C24539(i, strM37807));
                }
                c20715.m7088(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i2 = 0;
                for (C8421 c8421 : c21833.m25011(C8421.class)) {
                    int i3 = Integer.parseInt(c8421.m25012(44, 0).getText());
                    if (i3 > iM17831) {
                        String text = c8421.getText();
                        int iIndexOf = text.indexOf(58);
                        if (iIndexOf >= 0 && iIndexOf < 10) {
                            text = "\n".concat(text);
                        }
                        throw new RuntimeException(m37797(c8421.f30091) + " No group " + i3 + ": " + text);
                    }
                    InterfaceC6342 interfaceC6342M25012 = c8421.m25012(46, 0);
                    if (interfaceC6342M25012 != null) {
                        String strM37808 = m37807(interfaceC6342M25012);
                        if (i3 == 0) {
                            arrayList4.add(i2, C5685.m12667(i3, strM37808));
                            i2++;
                        } else {
                            arrayList4.add(C5685.m12667(i3, strM37808));
                        }
                    } else {
                        arrayList5.add(new C10910(i3, m37801(c20715, (C23844) c8421.m25013(C23844.class, 0), z)));
                    }
                }
                c20715.m7091(arrayList4);
                c20715.m7094(arrayList5);
            } catch (IllegalArgumentException e) {
                Point pointM37799 = m37796((C10856) listM25011.get(0));
                C5962 c5962 = new C5962(null, pointM37799.x, pointM37799.y, e.getMessage());
                c5962.initCause((Throwable) e);
                throw c5962;
            }
        } else {
            C15126 c15126 = (C15126) c23844.m25013(C15126.class, 0);
            Class<C18220> cls2 = C18220.class;
            if (c15126 != null) {
                c20715 = new C10379(abstractC11581);
                C20492 c20493 = (C20492) c15126.m25013(C20492.class, 0);
                if (c20493 != null) {
                    c20715.m24052(m37807(c20493.m25012(46, 0)));
                }
                Iterator it2 = c15126.m25011(C14456.class).iterator();
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (it2.hasNext()) {
                    C14456 c14456 = (C14456) it2.next();
                    C13786 c13786 = (C13786) c14456.m25013(C13786.class, 0);
                    if (c13786 != null) {
                        c20715.m24059(m37801(c20715, (C23844) c13786.m25013(C23844.class, 0), z));
                    } else {
                        C4398 c4398 = (C4398) c14456.m25013(C4398.class, 0);
                        if (c4398 != null) {
                            c20715.m24053(m37801(c20715, (C23844) c4398.m25013(C23844.class, 0), z));
                        } else {
                            C13116 c13116 = (C13116) c14456.m25013(C13116.class, 0);
                            if (c13116 != null) {
                                c20715.m24041(Integer.parseInt(c13116.m25012(44, 0).getText()));
                                if (z6) {
                                    throw new RuntimeException(C10965.m25286(new StringBuilder(), m37797(c13116.f30091), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                }
                                z9 = true;
                            } else {
                                C6410 c6410 = (C6410) c14456.m25013(C6410.class, 0);
                                if (c6410 != null) {
                                    c20715.m24045(m37805(c6410.m25012(48, 0)));
                                    z5 = true;
                                } else {
                                    C3056 c3056 = (C3056) c14456.m25013(C3056.class, 0);
                                    if (c3056 != null) {
                                        it = it2;
                                        c20715.m24054(m37805(c3056.m25012(48, 0)));
                                    } else {
                                        it = it2;
                                        C18220 c18220 = (C18220) c14456.m25013(cls2, 0);
                                        if (c18220 != null) {
                                            c20715.m24062(m37807(c18220.m25012(46, 0)));
                                        } else {
                                            C20176 c20176 = (C20176) c14456.m25013(C20176.class, 0);
                                            if (c20176 != null) {
                                                c20715.m24042(m37807(c20176.m25012(46, 0)));
                                            } else {
                                                C7435 c7435 = (C7435) c14456.m25013(C7435.class, 0);
                                                if (c7435 == null) {
                                                    cls = cls2;
                                                    z3 = z6;
                                                    z2 = z8;
                                                    C21163 c21163 = (C21163) c14456.m25013(C21163.class, 0);
                                                    if (c21163 == null) {
                                                        C24514 c24514 = (C24514) c14456.m25013(C24514.class, 0);
                                                        if (c24514 == null) {
                                                            throw new RuntimeException(c14456.getText());
                                                        }
                                                        if (z4) {
                                                            Point pointM377910 = m37796(c24514);
                                                            throw new C5962(null, pointM377910.x, pointM377910.y, "childrenSyntax and contains cannot be used together");
                                                        }
                                                        z6 = z3;
                                                        for (C15796 c15796 : c24514.m25011(C15796.class)) {
                                                            if (c15796.m25012(42, 0) == null) {
                                                                c20715.m24044(m37801(c20715, (C23844) c15796.m25013(C23844.class, 0), z), c15796.m25012(52, 0) != null);
                                                            } else {
                                                                if (z9) {
                                                                    throw new RuntimeException(C10965.m25286(new StringBuilder(), m37797(c15796.f30091), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                                                }
                                                                if (z6) {
                                                                    throw new RuntimeException(C10965.m25286(new StringBuilder(), m37797(c15796.f30091), " Duplicate <EndMatcher>!"));
                                                                }
                                                                c20715.m24041(((ArrayList) c20715.m24060()).size());
                                                                z6 = true;
                                                            }
                                                        }
                                                        z8 = true;
                                                        it2 = it;
                                                    } else {
                                                        if (z7) {
                                                            Point pointM377911 = m37796(c21163);
                                                            throw new C5962(null, pointM377911.x, pointM377911.y, "Duplicate missingStyle");
                                                        }
                                                        c20715.m24058(m37807(c21163.m25012(46, 0)));
                                                        z7 = true;
                                                    }
                                                } else {
                                                    if (z4) {
                                                        Point pointM377912 = m37796(c7435);
                                                        throw new C5962(null, pointM377912.x, pointM377912.y, "Duplicate childrenSyntax");
                                                    }
                                                    if (z8) {
                                                        Point pointM377913 = m37796(c7435);
                                                        throw new C5962(null, pointM377913.x, pointM377913.y, "childrenSyntax and contains cannot be used together");
                                                    }
                                                    C20847 c20847 = (C20847) c7435.m25013(C20847.class, 0);
                                                    if (c20847 == null) {
                                                        c3950M7866 = C3950.m7867(m37807(c7435.m25012(46, 0)));
                                                        cls = cls2;
                                                        z3 = z6;
                                                        z2 = z8;
                                                    } else {
                                                        int i4 = Integer.parseInt(c20847.m25012(44, 0).getText());
                                                        C9092 c9092 = (C9092) c7435.m25013(C9092.class, 0);
                                                        boolean zM37805 = c9092 == null ? z : m37805(c9092.m25012(48, 0));
                                                        List listM25012 = c7435.m25011(C2740.class);
                                                        List listM25013 = c7435.m25011(C3411.class);
                                                        ArrayList arrayList6 = new ArrayList(listM25013.size());
                                                        HashSet hashSet3 = new HashSet();
                                                        Iterator it3 = listM25013.iterator();
                                                        while (it3.hasNext()) {
                                                            Iterator it4 = it3;
                                                            C3411 c3411 = (C3411) it3.next();
                                                            boolean z10 = z6;
                                                            String strM37809 = m37807(c3411.m25012(46, 0));
                                                            if (!hashSet3.add(strM37809)) {
                                                                Point pointM377914 = m37796(c3411);
                                                                throw new C5962(null, pointM377914.x, pointM377914.y, C21466.m48631("Duplicate childrenSyntax include: ", strM37809));
                                                            }
                                                            arrayList6.add(strM37809);
                                                            it3 = it4;
                                                            z6 = z10;
                                                        }
                                                        z3 = z6;
                                                        ArrayList arrayList7 = new ArrayList(listM25012.size());
                                                        ArrayList arrayList8 = new ArrayList(listM25012.size());
                                                        HashSet hashSet4 = new HashSet();
                                                        Iterator it5 = listM25012.iterator();
                                                        boolean z11 = false;
                                                        String strM378010 = null;
                                                        while (it5.hasNext()) {
                                                            z8 = z8;
                                                            C2740 c2740 = (C2740) it5.next();
                                                            it5 = it5;
                                                            if (c2740.m25012(14, 0) == null) {
                                                                C22858 c22858 = (C22858) c2740.m25013(C22858.class, 0);
                                                                Class<C18220> cls3 = cls2;
                                                                InterfaceC6342 interfaceC6342M25013 = c22858.m25012(46, 0);
                                                                if (interfaceC6342M25013 == null) {
                                                                    interfaceC6342M25013 = c22858.m25012(45, 0);
                                                                }
                                                                String strM378011 = m37807(interfaceC6342M25013);
                                                                if (!hashSet4.add(C3950.m7865(strM378011, zM37805))) {
                                                                    Point pointM377915 = m37796(c2740);
                                                                    throw new C5962(null, pointM377915.x, pointM377915.y, C21466.m48631("Duplicate childrenSyntax selector: ", strM378011));
                                                                }
                                                                arrayList7.add(strM378011);
                                                                arrayList8.add(m37807(c2740.m25012(46, 0)));
                                                                cls2 = cls3;
                                                            } else {
                                                                if (z11) {
                                                                    Point pointM377916 = m37796(c2740);
                                                                    throw new C5962(null, pointM377916.x, pointM377916.y, "Duplicate childrenSyntax default");
                                                                }
                                                                strM378010 = m37807(c2740.m25012(46, 0));
                                                                z11 = true;
                                                            }
                                                        }
                                                        cls = cls2;
                                                        z2 = z8;
                                                        c3950M7866 = C3950.m7866(i4, zM37805, arrayList6, arrayList7, arrayList8, strM378010);
                                                    }
                                                    c20715.m24043(c3950M7866);
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
                    c20715.m24045(true);
                }
                c20715.m24051();
            } else {
                Class<C18220> cls4 = cls2;
                C5739 c5739 = (C5739) c23844.m25013(C5739.class, 0);
                if (c5739 != null) {
                    c20715 = new C6356(abstractC11581);
                    C20492 c20494 = (C20492) c5739.m25013(C20492.class, 0);
                    if (c20494 != null) {
                        c20715.m14530(m37807(c20494.m25012(46, 0)));
                    }
                    String strM378012 = m37807(((C3727) c5739.m25013(C3727.class, 0)).m25012(46, 0));
                    String strM378013 = "";
                    String strM378014 = "";
                    for (C7080 c7080 : c5739.m25011(C7080.class)) {
                        C25185 c25185 = (C25185) c7080.m25013(C25185.class, 0);
                        if (c25185 != null) {
                            strM378013 = m37807(c25185.m25012(46, 0));
                        } else {
                            C18479 c18479 = (C18479) c7080.m25013(C18479.class, 0);
                            if (c18479 != null) {
                                strM378014 = m37807(c18479.m25012(46, 0));
                            } else {
                                Class<C18220> cls5 = cls4;
                                C18220 c18221 = (C18220) c7080.m25013(cls5, 0);
                                if (c18221 == null) {
                                    throw new RuntimeException(c7080.getText());
                                }
                                c20715.m14533(m37807(c18221.m25012(46, 0)));
                                cls4 = cls5;
                            }
                        }
                    }
                    c20715.m14531(new C5015(strM378012, strM378013, strM378014));
                } else {
                    C10433 c10433 = (C10433) c23844.m25013(C10433.class, 0);
                    if (c10433 != null) {
                        String text2 = ((C22188) c10433.m25013(C22188.class, 0)).m25012(50, 0).getText();
                        c20715 = new C13811(abstractC11581);
                        c20715.m31475(text2);
                    } else {
                        C23174 c23174 = (C23174) c23844.m25013(C23174.class, 0);
                        if (c23174 != null) {
                            String strM378015 = m37807(c23174.m25012(46, 0));
                            c20715 = new C2608(abstractC11581);
                            c20715.m3911(strM378015);
                        } else {
                            C17137 c17137 = (C17137) c23844.m25013(C17137.class, 0);
                            if (c17137 == null) {
                                throw new RuntimeException(c23844.getText());
                            }
                            c20715 = new C20715(abstractC11581);
                            C20492 c20495 = (C20492) c17137.m25013(C20492.class, 0);
                            if (c20495 != null) {
                                c20715.m46790(m37807(c20495.m25012(46, 0)));
                            }
                            c20715.m46795(((C19150) ((C19821) c17137.m25013(C19821.class, 0)).m25013(C19150.class, 0)).getText());
                            C18220 c18222 = (C18220) c17137.m25013(cls4, 0);
                            if (c18222 != null) {
                                c20715.m46792(m37807(c18222.m25012(46, 0)));
                            }
                            Iterator it6 = ((C8105) c17137.m25013(C8105.class, 0)).m25011(C23844.class).iterator();
                            while (it6.hasNext()) {
                                c20715.m46793(m37801(c20715, (C23844) it6.next(), z));
                            }
                        }
                    }
                }
            }
        }
        c20715.f32258 = m37796(c23844);
        return c20715;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37799(AbstractC11581 abstractC11581, C4139 c4139) {
        int i;
        int i2;
        int i3 = 0;
        InterfaceC6342 interfaceC6342M25012 = c4139.m25012(46, 0);
        InterfaceC6342 interfaceC6342M25013 = c4139.m25012(47, 0);
        C11104 c11104 = (C11104) c4139.m25013(C11104.class, 0);
        C22504 c22504 = (C22504) c4139.m25013(C22504.class, 0);
        if (interfaceC6342M25012 != null) {
            return m37807(interfaceC6342M25012);
        }
        int i4 = 1;
        if (interfaceC6342M25013 != null) {
            String text = interfaceC6342M25013.getText();
            return text.substring(1, text.length() - 1).replace("\\/", "/");
        }
        if (c11104 == null) {
            if (c22504 == null) {
                throw new IllegalArgumentException("Expected a static regex fragment");
            }
            C16689 c16689Mo26652 = abstractC11581 == null ? null : abstractC11581.mo26652();
            if (c16689Mo26652 == null) {
                throw new RuntimeException("Include regex is not supported here!");
            }
            String strM37807 = m37807(c22504.m25012(46, 0));
            Object obj = c16689Mo26652.f49145.get(strM37807);
            if (obj == null) {
                throw new RuntimeException(C21466.m48631("Definition not found: ", strM37807));
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new RuntimeException(C21466.m48631("Not a regex definition: ", strM37807));
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it = c11104.m25016(46).iterator();
        while (it.hasNext()) {
            Collections.addAll(hashSet, m37807((InterfaceC6342) it.next()).split("\\s+"));
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        C7303 c7303 = new C7303("Start", i3);
        C7303 c7304 = new C7303("End", i3);
        C7303 c7305 = new C7303("StartEnd", i3);
        C7303 c7306 = new C7303("None", i3);
        for (String str : hashSet) {
            if (!str.isEmpty()) {
                char cCharAt = str.charAt(i3);
                boolean z = cCharAt == '_' || Character.isLetterOrDigit(cCharAt);
                char cM21911 = C9417.m21911(i4, str);
                boolean z2 = cM21911 == '_' || Character.isLetterOrDigit(cM21911);
                ArrayList arrayList = new ArrayList(str.length() + i4);
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                boolean z3 = true;
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt2 = str.charAt(i5);
                    if (i5 == 0) {
                        arrayList.add(C6112.m13905(String.valueOf(cCharAt2)));
                    } else {
                        boolean zIsLetterOrDigit = Character.isLetterOrDigit(cCharAt2);
                        if (zIsLetterOrDigit != z3) {
                            if (sb.length() > 0) {
                                arrayList.add(C6112.m13905(sb.toString()));
                                sb.setLength(0);
                            }
                            z3 = zIsLetterOrDigit;
                        }
                        sb.append(cCharAt2);
                    }
                }
                if (sb.length() > 0) {
                    arrayList.add(C6112.m13905(sb.toString()));
                }
                arrayList.add("");
                if (z && z2) {
                    c7305.m16872(arrayList, 0);
                } else if (z) {
                    c7303.m16872(arrayList, 0);
                } else if (z2) {
                    c7304.m16872(arrayList, 0);
                } else {
                    c7306.m16872(arrayList, 0);
                }
                i3 = 0;
                i4 = 1;
            }
        }
        C7303 c7307 = new C7303("Root", 0);
        ArrayList arrayList2 = new ArrayList(3);
        if (c7303.f19115.isEmpty()) {
            i = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c7303.f19115.m5712());
            i = 0;
            c7307.m16872(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c7304.f19115.isEmpty()) {
            arrayList2.add(c7304.f19115.m5712());
            arrayList2.add("\\b");
            c7307.m16872(arrayList2, i);
            arrayList2.clear();
        }
        if (c7305.f19115.isEmpty()) {
            i2 = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c7305.f19115.m5712());
            arrayList2.add("\\b");
            i2 = 0;
            c7307.m16872(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c7306.f19115.isEmpty()) {
            arrayList2.add(c7306.f19115.m5712());
            c7307.m16872(arrayList2, i2);
            arrayList2.clear();
        }
        ArrayList<C7303> arrayList3 = new ArrayList(c7307.f19115.values());
        Collections.sort(arrayList3);
        StringBuilder sb2 = new StringBuilder("(?:");
        boolean z4 = true;
        for (C7303 c7308 : arrayList3) {
            if (z4) {
                z4 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(c7308.m16871());
        }
        sb2.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb2.toString();
    }
}
