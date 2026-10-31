package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10079 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C10079 f30364;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17798 f30365;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16303 f30366;

    static {
        int i = C16303.f50147;
        f30364 = new C10079(C10660.f32069, C17798.m41731());
    }

    public C10079(C16303 c16303, C17798 c17798) {
        this.f30366 = c16303;
        this.f30365 = c17798;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25329(InterfaceC3583 interfaceC3583, C5845 c5845) {
        if (interfaceC3583.getDescriptorForType().mo1141().equals("google.protobuf.Any")) {
            C17757 descriptorForType = interfaceC3583.getDescriptorForType();
            C0117 c0117M41590 = descriptorForType.m41590(1);
            C0117 c0117M41591 = descriptorForType.m41590(2);
            if (c0117M41590 != null && c0117M41590.getType() == EnumC19169.f60409 && c0117M41591 != null && c0117M41591.getType() == EnumC19169.f60397) {
                String str = (String) interfaceC3583.getField(c0117M41590);
                if (!str.isEmpty()) {
                    Object field = interfaceC3583.getField(c0117M41591);
                    try {
                        this.f30366.getClass();
                        String[] strArrSplit = str.split("/");
                        if (strArrSplit.length <= 1) {
                            throw new C2025("Invalid type url found: ".concat(str));
                        }
                        C17757 c17757 = (C17757) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
                        if (c17757 != null) {
                            C12818 c12818NewBuilderForType = C12113.m29517(c17757).newBuilderForType();
                            c12818NewBuilderForType.mergeFrom((AbstractC5886) field, this.f30365);
                            c5845.m16369("[");
                            c5845.m16369(str);
                            c5845.m16369("] {");
                            c5845.m16368();
                            c5845.m16370();
                            m25329(c12818NewBuilderForType, c5845);
                            c5845.m16371();
                            c5845.m16369(l.d);
                            c5845.m16368();
                            return;
                        }
                    } catch (C2025 unused) {
                    }
                }
            }
        }
        for (Map.Entry entry : interfaceC3583.getAllFields().entrySet()) {
            C0117 c0117 = (C0117) entry.getKey();
            Object value = entry.getValue();
            if (c0117.m1137()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C12195(c0117, it.next()));
                }
                Collections.sort(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m25328(c0117, ((C12195) it2.next()).m29666(), c5845);
                }
            } else if (c0117.mo1129()) {
                Iterator it3 = ((List) value).iterator();
                while (it3.hasNext()) {
                    m25328(c0117, it3.next(), c5845);
                }
            } else {
                m25328(c0117, value, c5845);
            }
        }
        m25330(interfaceC3583.getUnknownFields(), c5845);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25331(InterfaceC3583 interfaceC3583) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C11490.f34303;
            m25329(interfaceC3583, new C5845(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25325(C9249 c9249) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C11490.f34303;
            m25330(c9249, new C5845(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25328(C0117 c0117, Object obj, C5845 c5845) {
        String string;
        String string2;
        if (c0117.m1126()) {
            c5845.m16369("[");
            if (c0117.m1144().m41593().m39380() && c0117.getType() == EnumC19169.f60400 && c0117.m1136() && c0117.m1123() == c0117.m1147()) {
                c5845.m16369(c0117.m1147().mo1141());
            } else {
                c5845.m16369(c0117.mo1141());
            }
            c5845.m16369("]");
        } else if (c0117.m1125()) {
            c5845.m16369(c0117.m1147().getName());
        } else {
            c5845.m16369(c0117.getName());
        }
        EnumC18463 enumC18463M1138 = c0117.m1138();
        EnumC18463 enumC18463 = EnumC18463.MESSAGE;
        if (enumC18463M1138 == enumC18463) {
            c5845.m16369(" {");
            c5845.m16368();
            c5845.m16370();
        } else {
            c5845.m16369(": ");
        }
        switch (C4434.f14171[c0117.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                c5845.m16369(((Integer) obj).toString());
                break;
            case 4:
            case 5:
            case 6:
                c5845.m16369(((Long) obj).toString());
                break;
            case 7:
                c5845.m16369(((Boolean) obj).toString());
                break;
            case 8:
                c5845.m16369(((Float) obj).toString());
                break;
            case 9:
                c5845.m16369(((Double) obj).toString());
                break;
            case 10:
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                int i = C11490.f34303;
                if (iIntValue >= 0) {
                    string = Integer.toString(iIntValue);
                } else {
                    string = Long.toString(((long) iIntValue) & 4294967295L);
                }
                c5845.m16369(string);
                break;
            case 12:
            case 13:
                long jLongValue = ((Long) obj).longValue();
                int i2 = C11490.f34303;
                if (jLongValue >= 0) {
                    string2 = Long.toString(jLongValue);
                } else {
                    string2 = BigInteger.valueOf(jLongValue & C13132.FOREVER_NS).setBit(63).toString();
                }
                c5845.m16369(string2);
                break;
            case 14:
                c5845.m16369("\"");
                c5845.m16369(C1487.m5147(AbstractC5886.m16491((String) obj)));
                c5845.m16369("\"");
                break;
            case 15:
                c5845.m16369("\"");
                if (obj instanceof AbstractC5886) {
                    int i3 = C11490.f34303;
                    c5845.m16369(C1487.m5147((AbstractC5886) obj));
                } else {
                    int i4 = C11490.f34303;
                    c5845.m16369(C1487.m5148(new C13605((byte[]) obj)));
                }
                c5845.m16369("\"");
                break;
            case 16:
                c5845.m16369(((C2235) obj).getName());
                break;
            case 17:
            case 18:
                m25329((InterfaceC3583) obj, c5845);
                break;
        }
        if (c0117.m1138() == enumC18463) {
            c5845.m16371();
            c5845.m16369(l.d);
        }
        c5845.m16368();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25330(C9249 c9249, C5845 c5845) {
        for (Map.Entry entry : c9249.m23741().entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C6426 c6426 = (C6426) entry.getValue();
            m25327(iIntValue, 0, c6426.m17785(), c5845);
            m25327(iIntValue, 5, c6426.m17778(), c5845);
            m25327(iIntValue, 1, c6426.m17782(), c5845);
            m25327(iIntValue, 2, c6426.m17786(), c5845);
            for (C9249 c92410 : c6426.m17784()) {
                c5845.m16369(((Integer) entry.getKey()).toString());
                c5845.m16369(" {");
                c5845.m16368();
                c5845.m16370();
                m25330(c92410, c5845);
                c5845.m16371();
                c5845.m16369(l.d);
                c5845.m16368();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25327(int i, int i2, List list, C5845 c5845) {
        for (Object obj : list) {
            c5845.m16369(String.valueOf(i));
            c5845.m16369(": ");
            int i3 = i2 & 7;
            if (i3 == 0) {
                long jLongValue = ((Long) obj).longValue();
                int i4 = C11490.f34303;
                c5845.m16369(jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & C13132.FOREVER_NS).setBit(63).toString());
            } else if (i3 == 1) {
                c5845.m16369(String.format(null, "0x%016x", (Long) obj));
            } else if (i3 == 2) {
                try {
                    AbstractC5886 abstractC5886 = (AbstractC5886) obj;
                    int i5 = C9249.f28024;
                    C14186 c14186M33836 = C14186.m33836();
                    try {
                        AbstractC7297 abstractC7297Mo16502 = abstractC5886.mo16502();
                        c14186M33836.m33841(abstractC7297Mo16502);
                        abstractC7297Mo16502.mo19554(0);
                        C9249 c9249Build = c14186M33836.build();
                        c5845.m16369("{");
                        c5845.m16368();
                        c5845.m16370();
                        m25330(c9249Build, c5845);
                        c5845.m16371();
                        c5845.m16369(l.d);
                    } catch (C2025 e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
                    }
                } catch (C2025 unused) {
                    c5845.m16369("\"");
                    int i6 = C11490.f34303;
                    c5845.m16369(C1487.m5147((AbstractC5886) obj));
                    c5845.m16369("\"");
                }
            } else if (i3 == 3) {
                m25330((C9249) obj, c5845);
            } else {
                if (i3 != 5) {
                    throw new IllegalArgumentException(C19370.m44628(i2, "Bad tag: "));
                }
                c5845.m16369(String.format(null, "0x%08x", (Integer) obj));
            }
            c5845.m16368();
        }
    }
}
