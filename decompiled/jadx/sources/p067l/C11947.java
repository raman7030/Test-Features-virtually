package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class C11947 {

    /* JADX INFO: renamed from: ܽ */
    public static final C11947 f33325;

    /* JADX INFO: renamed from: ֫ */
    public final C19283 f33326;

    /* JADX INFO: renamed from: ۧ */
    public final C17862 f33327;

    static {
        int i = C17862.f53314;
        f33325 = new C11947(C12499.f35040, C19283.m43977());
    }

    public C11947(C17862 c17862, C19283 c19283) {
        this.f33327 = c17862;
        this.f33326 = c19283;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27348(InterfaceC5773 interfaceC5773, C7923 c7923) {
        if (interfaceC5773.getDescriptorForType().mo3542().equals("google.protobuf.Any")) {
            C19244 descriptorForType = interfaceC5773.getDescriptorForType();
            C2479 c2479M43835 = descriptorForType.m43835(1);
            C2479 c2479M43836 = descriptorForType.m43835(2);
            if (c2479M43835 != null && c2479M43835.getType() == EnumC20586.f63640 && c2479M43836 != null && c2479M43836.getType() == EnumC20586.f63628) {
                String str = (String) interfaceC5773.getField(c2479M43835);
                if (!str.isEmpty()) {
                    Object field = interfaceC5773.getField(c2479M43836);
                    try {
                        this.f33327.getClass();
                        String[] strArrSplit = str.split("/");
                        if (strArrSplit.length <= 1) {
                            throw new C4293("Invalid type url found: ".concat(str));
                        }
                        C19244 c19244 = (C19244) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
                        if (c19244 != null) {
                            C14550 c14550NewBuilderForType = C13880.m31582(c19244).newBuilderForType();
                            c14550NewBuilderForType.mergeFrom((AbstractC7962) field, this.f33326);
                            c7923.m18294("[");
                            c7923.m18294(str);
                            c7923.m18294("] {");
                            c7923.m18293();
                            c7923.m18295();
                            m27348(c14550NewBuilderForType, c7923);
                            c7923.m18296();
                            c7923.m18294(C0249l.f1198d);
                            c7923.m18293();
                            return;
                        }
                    } catch (C4293 unused) {
                    }
                }
            }
        }
        for (Map.Entry entry : interfaceC5773.getAllFields().entrySet()) {
            C2479 c2479 = (C2479) entry.getKey();
            Object value = entry.getValue();
            if (c2479.m3538()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C13958(c2479, it.next()));
                }
                Collections.sort(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m27347(c2479, ((C13958) it2.next()).m31728(), c7923);
                }
            } else if (c2479.mo3530()) {
                Iterator it3 = ((List) value).iterator();
                while (it3.hasNext()) {
                    m27347(c2479, it3.next(), c7923);
                }
            } else {
                m27347(c2479, value, c7923);
            }
        }
        m27349(interfaceC5773.getUnknownFields(), c7923);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27350(InterfaceC5773 interfaceC5773) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C13288.f37300;
            m27348(interfaceC5773, new C7923(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m27344(C11158 c11158) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C13288.f37300;
            m27349(c11158, new C7923(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27347(C2479 c2479, Object obj, C7923 c7923) {
        String string;
        String string2;
        if (c2479.m3527()) {
            c7923.m18294("[");
            if (c2479.m3545().m43838().m41616() && c2479.getType() == EnumC20586.f63631 && c2479.m3537() && c2479.m3524() == c2479.m3548()) {
                c7923.m18294(c2479.m3548().mo3542());
            } else {
                c7923.m18294(c2479.mo3542());
            }
            c7923.m18294("]");
        } else if (c2479.m3526()) {
            c7923.m18294(c2479.m3548().getName());
        } else {
            c7923.m18294(c2479.getName());
        }
        EnumC19915 enumC19915M3539 = c2479.m3539();
        EnumC19915 enumC19915 = EnumC19915.MESSAGE;
        if (enumC19915M3539 == enumC19915) {
            c7923.m18294(" {");
            c7923.m18293();
            c7923.m18295();
        } else {
            c7923.m18294(": ");
        }
        switch (C6582.f16996[c2479.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                c7923.m18294(((Integer) obj).toString());
                break;
            case 4:
            case 5:
            case 6:
                c7923.m18294(((Long) obj).toString());
                break;
            case 7:
                c7923.m18294(((Boolean) obj).toString());
                break;
            case 8:
                c7923.m18294(((Float) obj).toString());
                break;
            case 9:
                c7923.m18294(((Double) obj).toString());
                break;
            case 10:
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                int i = C13288.f37300;
                if (iIntValue >= 0) {
                    string = Integer.toString(iIntValue);
                } else {
                    string = Long.toString(((long) iIntValue) & 4294967295L);
                }
                c7923.m18294(string);
                break;
            case 12:
            case 13:
                long jLongValue = ((Long) obj).longValue();
                int i2 = C13288.f37300;
                if (jLongValue >= 0) {
                    string2 = Long.toString(jLongValue);
                } else {
                    string2 = BigInteger.valueOf(jLongValue & C14849.FOREVER_NS).setBit(63).toString();
                }
                c7923.m18294(string2);
                break;
            case 14:
                c7923.m18294("\"");
                c7923.m18294(C3781.m7389(AbstractC7962.m18417((String) obj)));
                c7923.m18294("\"");
                break;
            case 15:
                c7923.m18294("\"");
                if (obj instanceof AbstractC7962) {
                    int i3 = C13288.f37300;
                    c7923.m18294(C3781.m7389((AbstractC7962) obj));
                } else {
                    int i4 = C13288.f37300;
                    c7923.m18294(C3781.m7390(new C15298((byte[]) obj)));
                }
                c7923.m18294("\"");
                break;
            case 16:
                c7923.m18294(((C4492) obj).getName());
                break;
            case 17:
            case 18:
                m27348((InterfaceC5773) obj, c7923);
                break;
        }
        if (c2479.m3539() == enumC19915) {
            c7923.m18296();
            c7923.m18294(C0249l.f1198d);
        }
        c7923.m18293();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27349(C11158 c11158, C7923 c7923) {
        for (Map.Entry entry : c11158.m25742().entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C8475 c8475 = (C8475) entry.getValue();
            m27346(iIntValue, 0, c8475.m19732(), c7923);
            m27346(iIntValue, 5, c8475.m19725(), c7923);
            m27346(iIntValue, 1, c8475.m19729(), c7923);
            m27346(iIntValue, 2, c8475.m19733(), c7923);
            for (C11158 c11159 : c8475.m19731()) {
                c7923.m18294(((Integer) entry.getKey()).toString());
                c7923.m18294(" {");
                c7923.m18293();
                c7923.m18295();
                m27349(c11159, c7923);
                c7923.m18296();
                c7923.m18294(C0249l.f1198d);
                c7923.m18293();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27346(int i, int i2, List list, C7923 c7923) {
        for (Object obj : list) {
            c7923.m18294(String.valueOf(i));
            c7923.m18294(": ");
            int i3 = i2 & 7;
            if (i3 == 0) {
                long jLongValue = ((Long) obj).longValue();
                int i4 = C13288.f37300;
                c7923.m18294(jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & C14849.FOREVER_NS).setBit(63).toString());
            } else if (i3 == 1) {
                c7923.m18294(String.format(null, "0x%016x", (Long) obj));
            } else if (i3 == 2) {
                try {
                    AbstractC7962 abstractC7962 = (AbstractC7962) obj;
                    int i5 = C11158.f30970;
                    C15850 c15850M35968 = C15850.m35968();
                    try {
                        AbstractC9303 abstractC9303Mo18428 = abstractC7962.mo18428();
                        c15850M35968.m35973(abstractC9303Mo18428);
                        abstractC9303Mo18428.mo21522(0);
                        C11158 c11158Build = c15850M35968.build();
                        c7923.m18294("{");
                        c7923.m18293();
                        c7923.m18295();
                        m27349(c11158Build, c7923);
                        c7923.m18296();
                        c7923.m18294(C0249l.f1198d);
                    } catch (C4293 e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
                    }
                } catch (C4293 unused) {
                    c7923.m18294("\"");
                    int i6 = C13288.f37300;
                    c7923.m18294(C3781.m7389((AbstractC7962) obj));
                    c7923.m18294("\"");
                }
            } else if (i3 == 3) {
                m27349((C11158) obj, c7923);
            } else {
                if (i3 != 5) {
                    throw new IllegalArgumentException(C20778.m46922(i2, "Bad tag: "));
                }
                c7923.m18294(String.format(null, "0x%08x", (Integer) obj));
            }
            c7923.m18293();
        }
    }
}
