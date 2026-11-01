package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9796 {
    /* JADX INFO: renamed from: ֫ */
    public static void m22863(AbstractC10645 abstractC10645, Map map, AbstractC16402 abstractC16402) {
        boolean zM41616 = abstractC10645.getDescriptorForType().m43838().m41616();
        for (Map.Entry entry : map.entrySet()) {
            C2479 c2479 = (C2479) entry.getKey();
            Object value = entry.getValue();
            if (zM41616 && c2479.m3527() && c2479.getType() == EnumC20586.f63631 && !c2479.mo3530()) {
                abstractC16402.mo37255(c2479.getNumber(), (InterfaceC24548) value);
            } else {
                C20625.m46592(c2479, value, abstractC16402);
            }
        }
        C11158 unknownFields = abstractC10645.getUnknownFields();
        if (zM41616) {
            unknownFields.m25744(abstractC16402);
        } else {
            unknownFields.writeTo(abstractC16402);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22858(AbstractC10645 abstractC10645, Map map) {
        int serializedSize;
        boolean zM41616 = abstractC10645.getDescriptorForType().m43838().m41616();
        int iM46600 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C2479 c2479 = (C2479) entry.getKey();
            Object value = entry.getValue();
            if (zM41616 && c2479.m3527() && c2479.getType() == EnumC20586.f63631 && !c2479.mo3530()) {
                int number = c2479.getNumber();
                iM46600 += AbstractC16402.m37229(3, (InterfaceC24548) value) + AbstractC16402.m37231(2, number) + (AbstractC16402.m37220(1) * 2);
            } else {
                iM46600 += C20625.m46600(c2479, value);
            }
        }
        C11158 unknownFields = abstractC10645.getUnknownFields();
        if (zM41616) {
            serializedSize = unknownFields.m25746();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return serializedSize + iM46600;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22860(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22859(String str, C2479 c2479, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (c2479.m3527()) {
            sb.append('(');
            sb.append(c2479.mo3542());
            sb.append(')');
        } else {
            sb.append(c2479.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22862(InterfaceC5773 interfaceC5773, String str, ArrayList arrayList) {
        for (C2479 c2479 : interfaceC5773.getDescriptorForType().getFields()) {
            if (c2479.m3529() && !interfaceC5773.hasField(c2479)) {
                StringBuilder sbM17248 = C7470.m17248(str);
                sbM17248.append(c2479.getName());
                arrayList.add(sbM17248.toString());
            }
        }
        for (Map.Entry entry : interfaceC5773.getAllFields().entrySet()) {
            C2479 c24710 = (C2479) entry.getKey();
            Object value = entry.getValue();
            if (c24710.m3539() == EnumC19915.MESSAGE) {
                if (c24710.mo3530()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m22862((InterfaceC5773) it.next(), m22859(str, c24710, i), arrayList);
                        i++;
                    }
                } else if (interfaceC5773.hasField(c24710)) {
                    m22862((InterfaceC5773) value, m22859(str, c24710, -1), arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m22861(InterfaceC5773 interfaceC5773) {
        ArrayList arrayList = new ArrayList();
        m22862(interfaceC5773, "", arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m22864(AbstractC9303 abstractC9303, C15850 c15850, C19283 c19283, C19244 c19244, InterfaceC3090 interfaceC3090, int i) {
        InterfaceC24548 interfaceC24548;
        boolean z;
        Object objM25862;
        C9186 c9186Mo3363;
        int iMo21545 = 0;
        C2479 c2479M43835 = null;
        AbstractC7962 abstractC7962Mo21534 = null;
        if (!c19244.m43838().m41616() || i != 11) {
            int i2 = i & 7;
            int i3 = i >>> 3;
            if (c19244.m43839(i3)) {
                if (!(c19283 instanceof C3860) || (c9186Mo3363 = interfaceC3090.mo3363((C3860) c19283, c19244, i3)) == null) {
                    interfaceC24548 = null;
                } else {
                    c2479M43835 = c9186Mo3363.f24852;
                    interfaceC24548 = c9186Mo3363.f24851;
                    if (interfaceC24548 == null && c2479M43835.m3539() == EnumC19915.MESSAGE) {
                        throw new IllegalStateException("Message-typed extension lacked default instance: " + c2479M43835.mo3542());
                    }
                }
            } else if (interfaceC3090.mo3362() == EnumC7114.MESSAGE) {
                c2479M43835 = c19244.m43835(i3);
                interfaceC24548 = null;
            } else {
                interfaceC24548 = null;
            }
            if (c2479M43835 == null) {
                z = false;
                iMo21545 = 1;
            } else {
                EnumC9146 enumC9146Mo3543 = c2479M43835.mo3543();
                int i4 = C20625.f63707;
                if (i2 == enumC9146Mo3543.m21090()) {
                    z = false;
                } else if (c2479M43835.m3534()) {
                    c2479M43835.mo3543();
                    if (i2 == 2) {
                        z = true;
                    } else {
                        z = false;
                        iMo21545 = 1;
                    }
                } else {
                    z = false;
                    iMo21545 = 1;
                }
            }
            if (iMo21545 != 0) {
                if (c15850 != null) {
                    return c15850.m35975(i, abstractC9303);
                }
                return abstractC9303.mo21541(i);
            }
            if (z) {
                int iMo21538 = abstractC9303.mo21538(abstractC9303.mo21526());
                if (c2479M43835.mo3543() == EnumC9146.f24775) {
                    while (abstractC9303.mo21532() > 0) {
                        int iMo21528 = abstractC9303.mo21528();
                        if (c2479M43835.m3536()) {
                            C4492 c4492M25860 = c2479M43835.m3528().m25860(iMo21528);
                            if (c4492M25860 != null) {
                                interfaceC3090.addRepeatedField(c2479M43835, c4492M25860);
                            } else if (c15850 != null) {
                                c15850.m35970(i3, iMo21528);
                            }
                        } else {
                            interfaceC3090.addRepeatedField(c2479M43835, c2479M43835.m3528().m25862(iMo21528));
                        }
                    }
                } else {
                    while (abstractC9303.mo21532() > 0) {
                        interfaceC3090.addRepeatedField(c2479M43835, C16047.m36517(abstractC9303, c2479M43835.mo3543(), interfaceC3090.mo3364(c2479M43835)));
                    }
                }
                abstractC9303.mo21533(iMo21538);
                return true;
            }
            int i5 = C19855.f60355[c2479M43835.getType().ordinal()];
            if (i5 == 1) {
                interfaceC3090.mo3367(abstractC9303, c19283, c2479M43835, interfaceC24548);
                return true;
            }
            if (i5 == 2) {
                interfaceC3090.mo3366(abstractC9303, c19283, c2479M43835, interfaceC24548);
                return true;
            }
            if (i5 == 3) {
                int iMo21529 = abstractC9303.mo21528();
                if (c2479M43835.m3536()) {
                    C4492 c4492M25861 = c2479M43835.m3528().m25860(iMo21529);
                    if (c4492M25861 != null) {
                        objM25862 = c4492M25861;
                    } else if (c15850 != null) {
                        c15850.m35970(i3, iMo21529);
                    }
                } else {
                    objM25862 = c2479M43835.m3528().m25862(iMo21529);
                }
            } else {
                objM25862 = C16047.m36517(abstractC9303, c2479M43835.mo3543(), interfaceC3090.mo3364(c2479M43835));
            }
            if (c2479M43835.mo3530()) {
                interfaceC3090.addRepeatedField(c2479M43835, objM25862);
                return true;
            }
            interfaceC3090.setField(c2479M43835, objM25862);
            return true;
        }
        C9186 c9186Mo3364 = null;
        while (true) {
            int iMo21535 = abstractC9303.mo21535();
            if (iMo21535 == 0) {
                break;
            }
            if (iMo21535 == 16) {
                iMo21545 = abstractC9303.mo21545();
                if (iMo21545 != 0 && (c19283 instanceof C3860)) {
                    c9186Mo3364 = interfaceC3090.mo3363((C3860) c19283, c19244, iMo21545);
                }
            } else if (iMo21535 == 26) {
                if (iMo21545 != 0 && c9186Mo3364 != null) {
                    C19283 c19284 = C19283.f57615;
                }
                abstractC7962Mo21534 = abstractC9303.mo21534();
            } else if (!abstractC9303.mo21541(iMo21535)) {
                break;
            }
        }
        abstractC9303.mo21522(12);
        if (abstractC7962Mo21534 != null && iMo21545 != 0) {
            if (c9186Mo3364 != null) {
                C2479 c2479 = c9186Mo3364.f24852;
                InterfaceC24548 interfaceC24549 = c9186Mo3364.f24851;
                if (!interfaceC3090.hasField(c2479)) {
                    C19283 c19285 = C19283.f57615;
                    interfaceC3090.setField(c2479, new C10999(interfaceC24549, c19283, abstractC7962Mo21534));
                    return true;
                }
                interfaceC3090.setField(c2479, interfaceC3090.mo3365(abstractC7962Mo21534, c19283, c2479, interfaceC24549));
                return true;
            }
            if (c15850 != null) {
                int i6 = C8475.f22740;
                C24568 c24568M54167 = C24568.m54167();
                c24568M54167.m54171(abstractC7962Mo21534);
                c15850.m35972(iMo21545, c24568M54167.m54168());
                return true;
            }
        }
        return true;
    }
}
