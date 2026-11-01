package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes.dex */
public final class C25003 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m54912(InterfaceC22528 interfaceC22528) {
        C11996 c11996 = new C11996(256);
        c11996.writeInt(1);
        c11996.m27445(interfaceC22528.mo31474());
        c11996.m27445(interfaceC22528.mo31467());
        c11996.m27445(interfaceC22528.mo31473());
        c11996.m27445(interfaceC22528.mo31470());
        c11996.writeInt(interfaceC22528.getParent());
        ArrayList<InterfaceC3751> arrayList = new ArrayList(interfaceC22528.mo31471());
        Iterator it = interfaceC22528.values().iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC3751) it.next());
        }
        if (!interfaceC22528.mo31474() ? false : "style".equals(C4927.m10471(interfaceC22528.getType().getTypeName()))) {
            C8150.sort(arrayList, C10162.comparingInt(new C12934(0)));
        }
        c11996.writeInt(arrayList.size());
        for (InterfaceC3751 interfaceC3751 : arrayList) {
            c11996.writeInt(interfaceC3751.mo7249());
            c11996.writeInt(interfaceC3751.mo7247());
            if (interfaceC3751.mo7252() && interfaceC3751.mo7251() != null) {
                c11996.writeInt(0);
                c11996.m27445(true);
                InterfaceC5763 interfaceC5763Mo7251 = interfaceC3751.mo7251();
                c11996.m27443((CharSequence) interfaceC5763Mo7251.getValue());
                C23198[] c23198ArrMo12360 = interfaceC5763Mo7251.mo12360();
                c11996.writeInt(c23198ArrMo12360 == null ? 0 : c23198ArrMo12360.length);
                if (c23198ArrMo12360 != null) {
                    for (C23198 c23198 : c23198ArrMo12360) {
                        c11996.m27462(c23198.f72883);
                        c11996.writeInt(c23198.f72882);
                        c11996.writeInt(c23198.f72881);
                    }
                }
            } else {
                c11996.writeInt(interfaceC3751.getValue());
                c11996.writeByte(0);
            }
        }
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54909(byte[] bArr) {
        return C16111.m36665(C16111.m36666().digest(bArr)).substring(0, 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19639 m54910(InterfaceC9116 interfaceC9116, int i, byte[] bArr) throws C5276 {
        C18968 c18968;
        try {
            C14677 c14677 = new C14677(bArr);
            if (c14677.readInt() != 1) {
                throw new IOException("Unsupported resource entry payload version");
            }
            boolean zM33585 = c14677.m33585();
            boolean zM33586 = c14677.m33585();
            boolean zM33587 = c14677.m33585();
            boolean zM33588 = c14677.m33585();
            int i2 = c14677.readInt();
            int i3 = c14677.readInt();
            if (i3 >= 0) {
                int i4 = 100000;
                if (i3 <= 100000) {
                    ArrayList arrayList = new ArrayList(i3);
                    C19639 c19639 = new C19639(interfaceC9116, i, zM33585, zM33586, zM33587, zM33588, i2, arrayList);
                    int i5 = 0;
                    while (i5 < i3) {
                        int i6 = c14677.readInt();
                        int i7 = c14677.readInt();
                        int i8 = c14677.readInt();
                        if (c14677.m33585()) {
                            String strM33591 = c14677.m33591();
                            int i9 = c14677.readInt();
                            if (i9 < 0 || i9 > i4) {
                                throw new IOException("Invalid resource entry payload style count");
                            }
                            C23198[] c23198Arr = new C23198[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                c23198Arr[i10] = new C23198(c14677.m33586(), c14677.readInt(), c14677.readInt());
                            }
                            c18968 = new C18968(strM33591, c23198Arr);
                        } else {
                            c18968 = null;
                        }
                        arrayList.add(new C16285(c19639, i6, i7, i8, c18968));
                        i5++;
                        i4 = 100000;
                    }
                    if (c14677.available() == 0) {
                        return c19639;
                    }
                    throw new IOException("Trailing resource entry payload bytes");
                }
            }
            throw new IOException("Invalid resource entry payload value count");
        } catch (Exception e) {
            throw C5276.m11410("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54911(C10949 c10949, C6268 c6268) {
        boolean zM14234 = c6268.m14234();
        byte[] bArr = c6268.f15856;
        String str = c6268.f15853;
        int i = c6268.f15855;
        C10278 c10278 = null;
        C18297 c18297 = null;
        if (zM14234) {
            try {
                for (C10278 c10279 : c10949.mo23906()) {
                    if (c10279.mo14722() == (i >>> 24)) {
                        c10278 = c10279;
                        break;
                    }
                }
                if (c10278 == null) {
                    throw new IOException("Resource patch package is missing");
                }
                C21678 c21678M23895 = c10278.m23895((i >>> 16) & 255, c6268.f15859);
                int i2 = i & 65535;
                c21678M23895.m48934(i2, c6268.f15854, false);
                if ("default".equals(str)) {
                    str = "";
                }
                C4914 c4914M48931 = c21678M23895.m48931(C22999.m51348(str, c10278.mo14712()));
                if (c4914M48931.mo4718(i2)) {
                    throw new IOException("Added resource variant already exists");
                }
                c4914M48931.m10438(i2).m45911((InterfaceC22528) m54910(c4914M48931, i2, bArr));
                return;
            } catch (C5276 e) {
                throw e;
            } catch (Exception e2) {
                throw C5276.m11410("RESOURCE_PATCH_CORRUPT", e2.getMessage() == null ? "Resource patch is corrupt." : e2.getMessage());
            }
        }
        int i3 = (i >>> 24) & 255;
        int i4 = (i >>> 16) & 255;
        int i5 = i & 65535;
        loop0: for (C10278 c102710 : c10949.mo23906()) {
            if (c102710.mo14722() == i3) {
                for (C21678 c21678 : c102710.mo14714()) {
                    if (c21678.mo5199() == i4) {
                        for (C4914 c4914 : c21678.mo5201()) {
                            if (C4927.m10472(c4914).equals(str) && c4914.mo4718(i5)) {
                                c18297 = new C18297(c4914);
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        if (c18297 != null) {
            C4914 c4915 = c18297.f54634;
            C19639 c19639M54910 = m54910(c4915, i5, bArr);
            c4915.m10445(i5);
            c4915.m10438(i5).m45911((InterfaceC22528) c19639M54910);
            return;
        }
        throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
    }
}
