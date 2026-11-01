package p067l;

import com.umeng.analytics.pro.C0708d;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H78K */
/* JADX INFO: loaded from: classes2.dex */
public final class C9109 {

    /* JADX INFO: renamed from: ֫ */
    public final C10371 f24677;

    /* JADX INFO: renamed from: ֫ */
    public static C20350 m21049(C21021 c21021) {
        if (c21021 == null) {
            return new C20350(false, null);
        }
        try {
            C24538 c24538M47386 = c21021.m47386();
            c24538M47386.mo16866();
            for (InterfaceC6434 interfaceC6434 : c24538M47386.mo23906()) {
                interfaceC6434.mo14715();
                Iterator it = interfaceC6434.mo14714().iterator();
                while (it.hasNext()) {
                    ((InterfaceC3080) it.next()).mo5207();
                }
            }
            return new C20350(true, null);
        } catch (Exception e) {
            return new C20350(false, e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
        }
    }

    public C9109(C10371 c10371, C11792 c11792) {
        this.f24677 = c10371;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19838 m21048(C19561 c19561) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = c19561.getEntry("AndroidManifest.xml") != null;
        boolean z4 = c19561.getEntry("resources.arsc") != null;
        for (C5738 c5738 : c19561.m44453()) {
            if (!c5738.isDirectory()) {
                arrayList.add(C15554.m35355(c5738));
            }
        }
        try {
            z = !c19561.m44449(true).isEmpty();
        } catch (IOException unused) {
            z = false;
        }
        if (z3 && (z || z4)) {
            z2 = true;
        }
        return new C19838(arrayList, z2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0088: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:37:0x0088 */
    /* JADX INFO: renamed from: ֫ */
    public final C16484 m21055(AbstractC17043 abstractC17043, boolean z) {
        AbstractC17043 abstractC17043M24024;
        AbstractC17043 abstractC17044;
        String message;
        C10371 c10371 = this.f24677;
        AbstractC17043 abstractC17045 = null;
        int i = 0;
        try {
            try {
                C19561 c19561 = new C19561(abstractC17043);
                try {
                    C19838 c19838M21048 = m21048(c19561);
                    if (!c19838M21048.f60318) {
                        throw C5276.m11410("NOT_APK", "Not an APK");
                    }
                    try {
                        C21527 c21527M11941 = C5433.m11941(c19561);
                        C19515.m44346(c21527M11941.f67922);
                        abstractC17043M24024 = c10371.m24024();
                        try {
                            C2994 c2994M21046 = m21046(abstractC17043M24024, abstractC17043, C10371.m24009(c19561, abstractC17043M24024.m38684("original.apk")), z);
                            m21053(c19561, c2994M21046);
                            m21050(c19561, c2994M21046);
                            while (i < 100) {
                                String strM24026 = c10371.m24026();
                                C2994 c2994M21045 = m21045(c2994M21046, abstractC17043M24024, strM24026);
                                String str = c2994M21045.f5323;
                                C10371.m24013(abstractC17043M24024, c2994M21045);
                                if (c10371.m24025(abstractC17043M24024, strM24026)) {
                                    C2994 c2994M21047 = m21045(c2994M21045, c10371.m24029(str), str);
                                    C16484 c16484M21047 = m21047(c2994M21047, c19838M21048, c21527M11941);
                                    c16484M21047.f48421 = c2994M21047.f5322;
                                    try {
                                        c19561.close();
                                        return c16484M21047;
                                    } catch (Exception e) {
                                        e = e;
                                        i = 1;
                                        if (abstractC17043M24024 != null) {
                                            C10371.m24015(abstractC17043M24024);
                                            C17548.m39937();
                                        }
                                        if (i != 0) {
                                            if (e.getMessage() == null) {
                                                message = "Failed to create workspace.";
                                            } else {
                                                message = e.getMessage();
                                            }
                                            throw C5276.m11409(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                                        }
                                        throw C5276.m11410("NOT_APK", "Not an APK");
                                    }
                                }
                                i++;
                            }
                            throw new IOException("Unable to publish workspace");
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            c19561.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC17043M24024 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    abstractC17043M24024 = null;
                }
                try {
                    c19561.close();
                } catch (Throwable th4) {
                    try {
                        th.addSuppressed(th4);
                    } catch (Exception e2) {
                        e = e2;
                        if (abstractC17043M24024 != null) {
                            C10371.m24015(abstractC17043M24024);
                            C17548.m39937();
                        }
                        if (i != 0) {
                            if (e.getMessage() == null) {
                                message = "Failed to create workspace.";
                            } else {
                                message = e.getMessage();
                            }
                            throw C5276.m11409(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                        }
                        throw C5276.m11410("NOT_APK", "Not an APK");
                    }
                }
                throw th;
            } catch (C5276 e3) {
                e = e3;
                abstractC17045 = abstractC17044;
                if (abstractC17045 != null) {
                    C10371.m24015(abstractC17045);
                    C17548.m39937();
                }
                throw e;
            }
        } catch (C5276 e4) {
            e = e4;
            if (abstractC17045 != null) {
                C10371.m24015(abstractC17045);
                C17548.m39937();
            }
            throw e;
        } catch (Exception e5) {
            e = e5;
            abstractC17043M24024 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C2994 m21046(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, String str, boolean z) {
        C2994 c2994 = new C2994(abstractC17043, "");
        c2994.f5313 = z;
        c2994.f5319 = C14059.m31907(abstractC17044.mo25495(), "sourcePath");
        c2994.f5312 = abstractC17044.mo25101();
        c2994.f5315 = abstractC17044.mo25091();
        c2994.f5321 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c2994.f5311 = jCurrentTimeMillis;
        c2994.f5322 = jCurrentTimeMillis;
        return c2994;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2994 m21045(C2994 c2994, AbstractC17043 abstractC17043, String str) {
        C2994 c2995 = new C2994(abstractC17043, str);
        c2995.f5313 = c2994.f5313;
        c2995.f5319 = c2994.f5319;
        c2995.f5312 = c2994.f5312;
        c2995.f5315 = c2994.f5315;
        c2995.f5321 = c2994.f5321;
        c2995.f5311 = c2994.f5311;
        c2995.f5322 = c2994.f5322;
        c2995.f5317.addAll(c2994.f5317);
        c2995.f5316 = c2994.f5316;
        c2995.f5318 = c2994.f5318;
        c2995.f5324 = c2994.f5324;
        c2995.f5325 = c2994.f5325;
        c2995.f5314 = c2994.f5314;
        return c2995;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m21053(C19561 c19561, C2994 c2994) {
        C5738 entry = c19561.getEntry("resources.arsc");
        if (entry == null) {
            c2994.f5316 = "absent";
            c2994.f5318 = null;
            return;
        }
        AbstractC17043 abstractC17043 = c2994.f5320;
        int i = C10371.f28708;
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("entries").m38684("resources.arsc");
        try {
            abstractC17043M38684.m38651(c19561.m44448(entry));
            c2994.f5324 = C10371.m24016(abstractC17043M38684);
            long jMo25101 = abstractC17043M38684.mo25101();
            c2994.f5325 = jMo25101;
            c2994.f5314 = true;
            try {
                C20350 c20350M21049 = m21049(new C21021(jMo25101, abstractC17043M38684, c2994.f5324));
                if (c20350M21049.f62838) {
                    c2994.f5316 = "available";
                    c2994.f5318 = null;
                } else {
                    m21052(c2994);
                    c2994.f5316 = "parse_error";
                    c2994.f5318 = c20350M21049.f62839;
                }
            } catch (Exception e) {
                m21052(c2994);
                c2994.f5316 = "parse_error";
                c2994.f5318 = e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage();
            }
        } catch (Exception e2) {
            abstractC17043M38684.mo25503();
            m21052(c2994);
            c2994.f5316 = "extract_error";
            c2994.f5318 = e2.getMessage() == null ? "Failed to extract resources.arsc" : e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21050(C19561 c19561, C2994 c2994) {
        ArrayList arrayList = c2994.f5317;
        AbstractC17043 abstractC17043 = c2994.f5320;
        arrayList.clear();
        boolean z = false;
        for (C5738 c5738 : c19561.m44449(true)) {
            String name = c5738.getName();
            if (z) {
                arrayList.add(new C21101(name, "skipped", "Skipped after previous dex error", null));
            } else {
                int i = C10371.f28708;
                AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("entries").m38684(name);
                try {
                    abstractC17043M38684.m38651(c19561.m44448(c5738));
                    C16477.m37401(abstractC17043M38684, C10371.m24014(abstractC17043, name));
                    arrayList.add(new C21101(name, "available", null, "cache/dex/" + name + ".type_index"));
                } catch (Exception e) {
                    arrayList.add(new C21101(name, C0708d.f2599O, e.getMessage() == null ? "Failed to open dex" : e.getMessage(), null));
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16484 m21054(C2994 c2994) throws C5276 {
        try {
            C19561 c19561 = new C19561(c2994.f5320.m38684("original.apk"));
            try {
                C16484 c16484M21047 = m21047(c2994, m21048(c19561), C5433.m11941(c19561));
                c19561.close();
                return c16484M21047;
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            throw C19553.m44408(c2994.f5319, c2994.f5313);
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX INFO: renamed from: ֫ */
    private C16484 m21047(C2994 c2994, C19838 c19838, C21527 c21527) throws IOException {
        C21021 c21021;
        C20350 c20350;
        C20350 c20350M21049;
        boolean z;
        C16484 c16484;
        Iterator it;
        int i;
        DataInputStream dataInputStream;
        int i2;
        C15490 c15490;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList<C21101> arrayList2 = c2994.f5317;
        AbstractC17043 abstractC17043 = c2994.f5320;
        for (C21101 c21101 : arrayList2) {
            if ("available".equals(c21101.f66303) && (str = c21101.f66300) != null) {
                arrayList.add(str);
            }
        }
        C9456 c9456 = new C9456();
        for (C21101 c21102 : arrayList2) {
            String str2 = c21102.f66300;
            String str3 = c21102.f66303;
            if (str2 != null) {
                if (C0708d.f2599O.equals(str3)) {
                    C15490 c15491 = new C15490(str2);
                    c15491.f44213 = false;
                    c9456.m21959(c15491);
                } else if ("skipped".equals(str3)) {
                    C15490 c15492 = new C15490(str2);
                    c15492.f44213 = false;
                    c9456.m21959(c15492);
                } else if (arrayList.contains(str2)) {
                    try {
                        int i3 = C10371.f28708;
                        c9456.m21959(C15490.m35236(str2, m21051(abstractC17043.m38684("entries").m38684(str2))));
                    } catch (Exception e) {
                        if (e.getMessage() != null) {
                            e.getMessage();
                        }
                        C15490 c15493 = new C15490(str2);
                        c15493.f44213 = false;
                        c9456.m21959(c15493);
                    }
                }
            }
        }
        if (!"available".equals(c2994.f5316)) {
            m21052(c2994);
            if (c2994.f5314) {
                try {
                    c2994.f5314 = false;
                    C10371.m24013(abstractC17043, c2994);
                } catch (IOException unused) {
                }
            }
            c21021 = null;
        } else {
            int i4 = C10371.f28708;
            AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("entries").m38684("resources.arsc");
            if (c2994.f5324 == null) {
                c2994.f5324 = C10371.m24016(abstractC17043M38684);
                c2994.f5325 = abstractC17043M38684.mo25101();
                c2994.f5314 = true;
            }
            C21021 c21022 = new C21021(c2994.f5325, abstractC17043M38684, c2994.f5324);
            if (c2994.f5314) {
                try {
                    c2994.f5314 = false;
                    C10371.m24013(abstractC17043, c2994);
                } catch (IOException unused2) {
                }
            }
            c21021 = c21022;
        }
        if ("absent".equals(c2994.f5316) || "extract_error".equals(c2994.f5316)) {
            c20350 = new C20350(false, c2994.f5318);
        } else {
            if ("parse_error".equals(c2994.f5316)) {
                String str4 = c2994.f5318;
                if (str4 == null) {
                    str4 = "Failed to parse resources.arsc";
                }
                c20350 = new C20350(false, str4);
            } else {
                c20350M21049 = m21049(c21021);
            }
            if (!"available".equals(c2994.f5316) || "parse_error".equals(c2994.f5316)) {
                z = true;
            } else {
                z = false;
            }
            c16484 = new C16484(this.f24677, c2994.f5323, c2994.f5313, c2994.f5320, c2994.f5319, c2994.f5312, c2994.f5315, c19838.f60317, arrayList, z, c2994.f5316, c2994.f5318, c21527, c9456, c20350M21049, c21021);
            ArrayList arrayList3 = new ArrayList();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (String str5 : c16484.f48423) {
                it = c16484.f48431.f25794.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                        break;
                    }
                    c15490 = (C15490) it.next();
                    if (!c15490.f44213 && c15490.f44215.equals(str5)) {
                        i = c15490.f44214;
                        break;
                    }
                }
                c16484.f48410.getClass();
                AbstractC17043 abstractC17043M24014 = C10371.m24014(c16484.f48414, str5);
                dataInputStream = new DataInputStream(abstractC17043M24014.m38676());
                try {
                    if (dataInputStream.readInt() == 1296323657 || dataInputStream.readInt() != 2) {
                        throw new IOException("Invalid type index header");
                    }
                    int i5 = dataInputStream.readInt();
                    if (i5 < 0 || ((i >= 0 && i5 != i) || i5 > Math.max(0L, (abstractC17043M24014.mo25101() - 12) / 6))) {
                        throw new IOException("Invalid type index count");
                    }
                    ArrayList<C19160> arrayList4 = new ArrayList(Math.min(i5, 4096));
                    for (int i6 = 0; i6 < i5; i6++) {
                        String utf = dataInputStream.readUTF();
                        int i7 = dataInputStream.readInt();
                        if ((Integer.MIN_VALUE & i7) != 0) {
                            i7 &= Integer.MAX_VALUE;
                            i2 = dataInputStream.readInt();
                        } else {
                            i2 = 0;
                        }
                        arrayList4.add(new C19160(null, i7, i2, utf));
                    }
                    if (dataInputStream.read() != -1) {
                        throw new IOException("Trailing type index data");
                    }
                    dataInputStream.close();
                    for (C19160 c19160 : arrayList4) {
                        String str6 = c19160.f57226;
                        C15525.merge(map2, str6, 1, new C12535());
                        if (!map.containsKey(str6)) {
                            C19160 c19161 = new C19160(str5, c19160.f57225, c19160.f57228, str6);
                            map.put(str6, c19161);
                            arrayList3.add(c19161);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            c16484.f48424 = arrayList3;
            c16484.f48418 = map;
            c16484.f48422 = map2;
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C8150.sort(arrayList5, new C25202());
            c16484.f48430 = arrayList5;
            return c16484;
        }
        c20350M21049 = c20350;
        if ("available".equals(c2994.f5316)) {
            z = true;
        } else {
            z = true;
        }
        c16484 = new C16484(this.f24677, c2994.f5323, c2994.f5313, c2994.f5320, c2994.f5319, c2994.f5312, c2994.f5315, c19838.f60317, arrayList, z, c2994.f5316, c2994.f5318, c21527, c9456, c20350M21049, c21021);
        ArrayList arrayList6 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        while (r4.hasNext()) {
            it = c16484.f48431.f25794.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                c15490 = (C15490) it.next();
                if (!c15490.f44213) {
                }
            }
            c16484.f48410.getClass();
            AbstractC17043 abstractC17043M24015 = C10371.m24014(c16484.f48414, str5);
            dataInputStream = new DataInputStream(abstractC17043M24015.m38676());
            if (dataInputStream.readInt() == 1296323657) {
            }
            throw new IOException("Invalid type index header");
        }
        c16484.f48424 = arrayList6;
        c16484.f48418 = map3;
        c16484.f48422 = map4;
        ArrayList arrayList7 = new ArrayList(arrayList6);
        C8150.sort(arrayList7, new C25202());
        c16484.f48430 = arrayList7;
        return c16484;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m21052(C2994 c2994) {
        if (c2994.f5324 != null || c2994.f5325 != -1) {
            c2994.f5314 = true;
        }
        c2994.f5324 = null;
        c2994.f5325 = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m21051(AbstractC17043 abstractC17043) throws IOException {
        InputStream inputStreamMo29987 = abstractC17043.mo29987();
        try {
            int i = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            C2864 c2864 = new C2864(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            byte[] bArr = new byte[8192];
            while (i > 0) {
                int i2 = inputStreamMo29987.read(bArr, 0, Math.min(8192, i));
                if (i2 == -1) {
                    break;
                }
                c2864.write(bArr, 0, i2);
                i -= i2;
            }
            byte[] bArr2 = c2864.f4949;
            int length = bArr2.length;
            int i3 = c2864.f4950;
            if (length == i3) {
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
                return bArr2;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, i3);
            if (inputStreamMo29987 != null) {
                inputStreamMo29987.close();
            }
            return bArrCopyOf;
        } catch (Throwable th) {
            if (inputStreamMo29987 != null) {
                try {
                    inputStreamMo29987.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        if (inputStreamMo29987 != null) {
            inputStreamMo29987.close();
        }
        throw th;
    }
}
