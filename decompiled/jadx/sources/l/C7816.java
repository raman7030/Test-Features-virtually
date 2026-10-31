package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7816 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20898(AbstractC8709 abstractC8709, Map map, AbstractC14766 abstractC14766) {
        boolean zM39380 = abstractC8709.getDescriptorForType().m41593().m39380();
        for (Map.Entry entry : map.entrySet()) {
            C0117 c0117 = (C0117) entry.getKey();
            Object value = entry.getValue();
            if (zM39380 && c0117.m1126() && c0117.getType() == EnumC19169.f60400 && !c0117.mo1129()) {
                abstractC14766.mo35108(c0117.getNumber(), (InterfaceC23338) value);
            } else {
                C19210.m44297(c0117, value, abstractC14766);
            }
        }
        C9249 unknownFields = abstractC8709.getUnknownFields();
        if (zM39380) {
            unknownFields.m23743(abstractC14766);
        } else {
            unknownFields.writeTo(abstractC14766);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20893(AbstractC8709 abstractC8709, Map map) {
        int serializedSize;
        boolean zM39380 = abstractC8709.getDescriptorForType().m41593().m39380();
        int iM44305 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C0117 c0117 = (C0117) entry.getKey();
            Object value = entry.getValue();
            if (zM39380 && c0117.m1126() && c0117.getType() == EnumC19169.f60400 && !c0117.mo1129()) {
                int number = c0117.getNumber();
                iM44305 += AbstractC14766.m35082(3, (InterfaceC23338) value) + AbstractC14766.m35084(2, number) + (AbstractC14766.m35073(1) * 2);
            } else {
                iM44305 += C19210.m44305(c0117, value);
            }
        }
        C9249 unknownFields = abstractC8709.getUnknownFields();
        if (zM39380) {
            serializedSize = unknownFields.m23745();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return serializedSize + iM44305;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20895(List list) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20894(String str, C0117 c0117, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (c0117.m1126()) {
            sb.append('(');
            sb.append(c0117.mo1141());
            sb.append(')');
        } else {
            sb.append(c0117.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20897(InterfaceC3583 interfaceC3583, String str, ArrayList arrayList) {
        for (C0117 c0117 : interfaceC3583.getDescriptorForType().getFields()) {
            if (c0117.m1128() && !interfaceC3583.hasField(c0117)) {
                StringBuilder sbM15339 = C5368.m15339(str);
                sbM15339.append(c0117.getName());
                arrayList.add(sbM15339.toString());
            }
        }
        for (Map.Entry entry : interfaceC3583.getAllFields().entrySet()) {
            C0117 c0118 = (C0117) entry.getKey();
            Object value = entry.getValue();
            if (c0118.m1138() == EnumC18463.MESSAGE) {
                if (c0118.mo1129()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m20897((InterfaceC3583) it.next(), m20894(str, c0118, i), arrayList);
                        i++;
                    }
                } else if (interfaceC3583.hasField(c0118)) {
                    m20897((InterfaceC3583) value, m20894(str, c0118, -1), arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m20896(InterfaceC3583 interfaceC3583) {
        ArrayList arrayList = new ArrayList();
        m20897(interfaceC3583, "", arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20899(AbstractC7297 abstractC7297, C14186 c14186, C17798 c17798, C17757 c17757, InterfaceC0760 interfaceC0760, int i) {
        InterfaceC23338 interfaceC23338;
        boolean z;
        Object objM23853;
        C7174 c7174Mo968;
        int iMo19577 = 0;
        C0117 c0117M41590 = null;
        AbstractC5886 abstractC5886Mo19566 = null;
        if (!c17757.m41593().m39380() || i != 11) {
            int i2 = i & 7;
            int i3 = i >>> 3;
            if (c17757.m41594(i3)) {
                if (!(c17798 instanceof C1570) || (c7174Mo968 = interfaceC0760.mo968((C1570) c17798, c17757, i3)) == null) {
                    interfaceC23338 = null;
                } else {
                    c0117M41590 = c7174Mo968.f21972;
                    interfaceC23338 = c7174Mo968.f21971;
                    if (interfaceC23338 == null && c0117M41590.m1138() == EnumC18463.MESSAGE) {
                        throw new IllegalStateException("Message-typed extension lacked default instance: " + c0117M41590.mo1141());
                    }
                }
            } else if (interfaceC0760.mo967() == EnumC4994.MESSAGE) {
                c0117M41590 = c17757.m41590(i3);
                interfaceC23338 = null;
            } else {
                interfaceC23338 = null;
            }
            if (c0117M41590 == null) {
                z = false;
                iMo19577 = 1;
            } else {
                EnumC7132 enumC7132Mo1142 = c0117M41590.mo1142();
                int i4 = C19210.f60476;
                if (i2 == enumC7132Mo1142.m19147()) {
                    z = false;
                } else if (c0117M41590.m1133()) {
                    c0117M41590.mo1142();
                    if (i2 == 2) {
                        z = true;
                    } else {
                        z = false;
                        iMo19577 = 1;
                    }
                } else {
                    z = false;
                    iMo19577 = 1;
                }
            }
            if (iMo19577 != 0) {
                if (c14186 != null) {
                    return c14186.m33843(i, abstractC7297);
                }
                return abstractC7297.mo19573(i);
            }
            if (z) {
                int iMo19570 = abstractC7297.mo19570(abstractC7297.mo19558());
                if (c0117M41590.mo1142() == EnumC7132.f21896) {
                    while (abstractC7297.mo19564() > 0) {
                        int iMo19560 = abstractC7297.mo19560();
                        if (c0117M41590.m1135()) {
                            C2235 c2235M23851 = c0117M41590.m1127().m23851(iMo19560);
                            if (c2235M23851 != null) {
                                interfaceC0760.addRepeatedField(c0117M41590, c2235M23851);
                            } else if (c14186 != null) {
                                c14186.m33838(i3, iMo19560);
                            }
                        } else {
                            interfaceC0760.addRepeatedField(c0117M41590, c0117M41590.m1127().m23853(iMo19560));
                        }
                    }
                } else {
                    while (abstractC7297.mo19564() > 0) {
                        interfaceC0760.addRepeatedField(c0117M41590, C14393.m34383(abstractC7297, c0117M41590.mo1142(), interfaceC0760.mo969(c0117M41590)));
                    }
                }
                abstractC7297.mo19565(iMo19570);
                return true;
            }
            int i5 = C18400.f57135[c0117M41590.getType().ordinal()];
            if (i5 == 1) {
                interfaceC0760.mo972(abstractC7297, c17798, c0117M41590, interfaceC23338);
                return true;
            }
            if (i5 == 2) {
                interfaceC0760.mo971(abstractC7297, c17798, c0117M41590, interfaceC23338);
                return true;
            }
            if (i5 == 3) {
                int iMo19561 = abstractC7297.mo19560();
                if (c0117M41590.m1135()) {
                    C2235 c2235M23852 = c0117M41590.m1127().m23851(iMo19561);
                    if (c2235M23852 != null) {
                        objM23853 = c2235M23852;
                    } else if (c14186 != null) {
                        c14186.m33838(i3, iMo19561);
                    }
                } else {
                    objM23853 = c0117M41590.m1127().m23853(iMo19561);
                }
            } else {
                objM23853 = C14393.m34383(abstractC7297, c0117M41590.mo1142(), interfaceC0760.mo969(c0117M41590));
            }
            if (c0117M41590.mo1129()) {
                interfaceC0760.addRepeatedField(c0117M41590, objM23853);
                return true;
            }
            interfaceC0760.setField(c0117M41590, objM23853);
            return true;
        }
        C7174 c7174Mo969 = null;
        while (true) {
            int iMo19567 = abstractC7297.mo19567();
            if (iMo19567 == 0) {
                break;
            }
            if (iMo19567 == 16) {
                iMo19577 = abstractC7297.mo19577();
                if (iMo19577 != 0 && (c17798 instanceof C1570)) {
                    c7174Mo969 = interfaceC0760.mo968((C1570) c17798, c17757, iMo19577);
                }
            } else if (iMo19567 == 26) {
                if (iMo19577 != 0 && c7174Mo969 != null) {
                    C17798 c17799 = C17798.f54419;
                }
                abstractC5886Mo19566 = abstractC7297.mo19566();
            } else if (!abstractC7297.mo19573(iMo19567)) {
                break;
            }
        }
        abstractC7297.mo19554(12);
        if (abstractC5886Mo19566 != null && iMo19577 != 0) {
            if (c7174Mo969 != null) {
                C0117 c0117 = c7174Mo969.f21972;
                InterfaceC23338 interfaceC23339 = c7174Mo969.f21971;
                if (!interfaceC0760.hasField(c0117)) {
                    C17798 c177910 = C17798.f54419;
                    interfaceC0760.setField(c0117, new C9081(interfaceC23339, c17798, abstractC5886Mo19566));
                    return true;
                }
                interfaceC0760.setField(c0117, interfaceC0760.mo970(abstractC5886Mo19566, c17798, c0117, interfaceC23339));
                return true;
            }
            if (c14186 != null) {
                int i6 = C6426.f19868;
                C23359 c23359M51769 = C23359.m51769();
                c23359M51769.m51773(abstractC5886Mo19566);
                c14186.m33840(iMo19577, c23359M51769.m51770());
                return true;
            }
        }
        return true;
    }
}
