package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes.dex */
public final class C23816 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m52503(InterfaceC21211 interfaceC21211) {
        C10130 c10130 = new C10130(256);
        c10130.writeInt(1);
        c10130.m25425(interfaceC21211.mo29412());
        c10130.m25425(interfaceC21211.mo29405());
        c10130.m25425(interfaceC21211.mo29411());
        c10130.m25425(interfaceC21211.mo29408());
        c10130.writeInt(interfaceC21211.getParent());
        ArrayList<InterfaceC1454> arrayList = new ArrayList(interfaceC21211.mo29409());
        Iterator it = interfaceC21211.values().iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC1454) it.next());
        }
        if (!interfaceC21211.mo29412() ? false : "style".equals(C2692.m8425(interfaceC21211.getType().getTypeName()))) {
            C6083.sort(arrayList, C8200.comparingInt(new C11117(0)));
        }
        c10130.writeInt(arrayList.size());
        for (InterfaceC1454 interfaceC1454 : arrayList) {
            c10130.writeInt(interfaceC1454.mo5006());
            c10130.writeInt(interfaceC1454.mo5004());
            if (interfaceC1454.mo5009() && interfaceC1454.mo5008() != null) {
                c10130.writeInt(0);
                c10130.m25425(true);
                InterfaceC3571 interfaceC3571Mo5008 = interfaceC1454.mo5008();
                c10130.m25423((CharSequence) interfaceC3571Mo5008.getValue());
                C21916[] c21916ArrMo10322 = interfaceC3571Mo5008.mo10322();
                c10130.writeInt(c21916ArrMo10322 == null ? 0 : c21916ArrMo10322.length);
                if (c21916ArrMo10322 != null) {
                    for (C21916 c21916 : c21916ArrMo10322) {
                        c10130.m25442(c21916.f70169);
                        c10130.writeInt(c21916.f70168);
                        c10130.writeInt(c21916.f70167);
                    }
                }
            } else {
                c10130.writeInt(interfaceC1454.getValue());
                c10130.writeByte(0);
            }
        }
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52500(byte[] bArr) {
        return C14460.m34531(C14460.m34532().digest(bArr)).substring(0, 16);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18172 m52501(InterfaceC7099 interfaceC7099, int i, byte[] bArr) throws C3059 {
        C17466 c17466;
        try {
            C12951 c12951 = new C12951(bArr);
            if (c12951.readInt() != 1) {
                throw new IOException("Unsupported resource entry payload version");
            }
            boolean zM31498 = c12951.m31498();
            boolean zM31499 = c12951.m31498();
            boolean zM314910 = c12951.m31498();
            boolean zM314911 = c12951.m31498();
            int i2 = c12951.readInt();
            int i3 = c12951.readInt();
            if (i3 >= 0) {
                int i4 = 100000;
                if (i3 <= 100000) {
                    ArrayList arrayList = new ArrayList(i3);
                    C18172 c18172 = new C18172(interfaceC7099, i, zM31498, zM31499, zM314910, zM314911, i2, arrayList);
                    int i5 = 0;
                    while (i5 < i3) {
                        int i6 = c12951.readInt();
                        int i7 = c12951.readInt();
                        int i8 = c12951.readInt();
                        if (c12951.m31498()) {
                            String strM31504 = c12951.m31504();
                            int i9 = c12951.readInt();
                            if (i9 < 0 || i9 > i4) {
                                throw new IOException("Invalid resource entry payload style count");
                            }
                            C21916[] c21916Arr = new C21916[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                c21916Arr[i10] = new C21916(c12951.m31499(), c12951.readInt(), c12951.readInt());
                            }
                            c17466 = new C17466(strM31504, c21916Arr);
                        } else {
                            c17466 = null;
                        }
                        arrayList.add(new C14643(c18172, i6, i7, i8, c17466));
                        i5++;
                        i4 = 100000;
                    }
                    if (c12951.available() == 0) {
                        return c18172;
                    }
                    throw new IOException("Trailing resource entry payload bytes");
                }
            }
            throw new IOException("Invalid resource entry payload value count");
        } catch (Exception e) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52502(C9028 c9028, C4103 c4103) {
        boolean zM12329 = c4103.m12329();
        byte[] bArr = c4103.f13042;
        String str = c4103.f13039;
        int i = c4103.f13041;
        C8322 c8322 = null;
        C16760 c16760 = null;
        if (zM12329) {
            try {
                for (C8322 c8323 : c9028.mo21936()) {
                    if (c8323.mo12858() == (i >>> 24)) {
                        c8322 = c8323;
                        break;
                    }
                }
                if (c8322 == null) {
                    throw new IOException("Resource patch package is missing");
                }
                C20317 c20317M21925 = c8322.m21925((i >>> 16) & 255, c4103.f13045);
                int i2 = i & 65535;
                c20317M21925.m46611(i2, c4103.f13040, false);
                if ("default".equals(str)) {
                    str = "";
                }
                C2678 c2678M46608 = c20317M21925.m46608(C21707.m48999(str, c8322.mo12848()));
                if (c2678M46608.mo2347(i2)) {
                    throw new IOException("Added resource variant already exists");
                }
                c2678M46608.m8392(i2).m43645((InterfaceC21211) m52501(c2678M46608, i2, bArr));
                return;
            } catch (C3059 e) {
                throw e;
            } catch (Exception e2) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", e2.getMessage() == null ? "Resource patch is corrupt." : e2.getMessage());
            }
        }
        int i3 = (i >>> 24) & 255;
        int i4 = (i >>> 16) & 255;
        int i5 = i & 65535;
        loop0: for (C8322 c8324 : c9028.mo21936()) {
            if (c8324.mo12858() == i3) {
                for (C20317 c20317 : c8324.mo12850()) {
                    if (c20317.mo2870() == i4) {
                        for (C2678 c2678 : c20317.mo2872()) {
                            if (C2692.m8426(c2678).equals(str) && c2678.mo2347(i5)) {
                                c16760 = new C16760(c2678);
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        if (c16760 != null) {
            C2678 c2679 = c16760.f51452;
            C18172 c18172M52501 = m52501(c2679, i5, bArr);
            c2679.m8399(i5);
            c2679.m8392(i5).m43645((InterfaceC21211) c18172M52501);
            return;
        }
        throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
    }
}
