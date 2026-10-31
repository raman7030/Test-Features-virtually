package l;

import com.umeng.analytics.pro.d;
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
public final class C7092 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8420 f21796;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18920 m19091(C19626 c19626) {
        if (c19626 == null) {
            return new C18920(false, null);
        }
        try {
            C23326 c23326M45090 = c19626.m45090();
            c23326M45090.mo14956();
            for (InterfaceC4277 interfaceC4277 : c23326M45090.mo21936()) {
                interfaceC4277.mo12851();
                Iterator it = interfaceC4277.mo12850().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0748) it.next()).mo2878();
                }
            }
            return new C18920(true, null);
        } catch (Exception e) {
            return new C18920(false, e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
        }
    }

    public C7092(C8420 c8420, C9915 c9915) {
        this.f21796 = c8420;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18381 m19090(C18090 c18090) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = c18090.getEntry("AndroidManifest.xml") != null;
        boolean z4 = c18090.getEntry("resources.arsc") != null;
        for (C3545 c3545 : c18090.m42194()) {
            if (!c3545.isDirectory()) {
                arrayList.add(C13874.m33236(c3545));
            }
        }
        try {
            z = !c18090.m42190(true).isEmpty();
        } catch (IOException unused) {
            z = false;
        }
        if (z3 && (z || z4)) {
            z2 = true;
        }
        return new C18381(arrayList, z2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0088: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:37:0x0088 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14852 m19097(AbstractC15440 abstractC15440, boolean z) {
        AbstractC15440 abstractC15440M22054;
        AbstractC15440 abstractC15441;
        String message;
        C8420 c8420 = this.f21796;
        AbstractC15440 abstractC15442 = null;
        int i = 0;
        try {
            try {
                C18090 c18090 = new C18090(abstractC15440);
                try {
                    C18381 c18381M19090 = m19090(c18090);
                    if (!c18381M19090.f57098) {
                        throw C3059.m9368("NOT_APK", "Not an APK");
                    }
                    try {
                        C20158 c20158M9893 = C3224.m9893(c18090);
                        C18041.m42095(c20158M9893.f65279);
                        abstractC15440M22054 = c8420.m22054();
                        try {
                            C0658 c0658M19088 = m19088(abstractC15440M22054, abstractC15440, C8420.m22039(c18090, abstractC15440M22054.m36526("original.apk")), z);
                            m19095(c18090, c0658M19088);
                            m19092(c18090, c0658M19088);
                            while (i < 100) {
                                String strM22056 = c8420.m22056();
                                C0658 c0658M19087 = m19087(c0658M19088, abstractC15440M22054, strM22056);
                                String str = c0658M19087.f2550;
                                C8420.m22043(abstractC15440M22054, c0658M19087);
                                if (c8420.m22055(abstractC15440M22054, strM22056)) {
                                    C0658 c0658M19089 = m19087(c0658M19087, c8420.m22059(str), str);
                                    C14852 c14852M19089 = m19089(c0658M19089, c18381M19090, c20158M9893);
                                    c14852M19089.f45305 = c0658M19089.f2549;
                                    try {
                                        c18090.close();
                                        return c14852M19089;
                                    } catch (Exception e) {
                                        e = e;
                                        i = 1;
                                        if (abstractC15440M22054 != null) {
                                            C8420.m22045(abstractC15440M22054);
                                            C15972.m37753();
                                        }
                                        if (i != 0) {
                                            if (e.getMessage() == null) {
                                                message = "Failed to create workspace.";
                                            } else {
                                                message = e.getMessage();
                                            }
                                            throw C3059.m9367(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                                        }
                                        throw C3059.m9368("NOT_APK", "Not an APK");
                                    }
                                }
                                i++;
                            }
                            throw new IOException("Unable to publish workspace");
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            c18090.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC15440M22054 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    abstractC15440M22054 = null;
                }
                try {
                    c18090.close();
                } catch (Throwable th4) {
                    try {
                        th.addSuppressed(th4);
                    } catch (Exception e2) {
                        e = e2;
                        if (abstractC15440M22054 != null) {
                            C8420.m22045(abstractC15440M22054);
                            C15972.m37753();
                        }
                        if (i != 0) {
                            if (e.getMessage() == null) {
                                message = "Failed to create workspace.";
                            } else {
                                message = e.getMessage();
                            }
                            throw C3059.m9367(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                        }
                        throw C3059.m9368("NOT_APK", "Not an APK");
                    }
                }
                throw th;
            } catch (C3059 e3) {
                e = e3;
                abstractC15442 = abstractC15441;
                if (abstractC15442 != null) {
                    C8420.m22045(abstractC15442);
                    C15972.m37753();
                }
                throw e;
            }
        } catch (C3059 e4) {
            e = e4;
            if (abstractC15442 != null) {
                C8420.m22045(abstractC15442);
                C15972.m37753();
            }
            throw e;
        } catch (Exception e5) {
            e = e5;
            abstractC15440M22054 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0658 m19088(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, String str, boolean z) {
        C0658 c0658 = new C0658(abstractC15440, "");
        c0658.f2540 = z;
        c0658.f2546 = C12301.m29847(abstractC15441.mo23544(), "sourcePath");
        c0658.f2539 = abstractC15441.mo23127();
        c0658.f2542 = abstractC15441.mo23117();
        c0658.f2548 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0658.f2538 = jCurrentTimeMillis;
        c0658.f2549 = jCurrentTimeMillis;
        return c0658;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0658 m19087(C0658 c0658, AbstractC15440 abstractC15440, String str) {
        C0658 c0659 = new C0658(abstractC15440, str);
        c0659.f2540 = c0658.f2540;
        c0659.f2546 = c0658.f2546;
        c0659.f2539 = c0658.f2539;
        c0659.f2542 = c0658.f2542;
        c0659.f2548 = c0658.f2548;
        c0659.f2538 = c0658.f2538;
        c0659.f2549 = c0658.f2549;
        c0659.f2544.addAll(c0658.f2544);
        c0659.f2543 = c0658.f2543;
        c0659.f2545 = c0658.f2545;
        c0659.f2551 = c0658.f2551;
        c0659.f2552 = c0658.f2552;
        c0659.f2541 = c0658.f2541;
        return c0659;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19095(C18090 c18090, C0658 c0658) {
        C3545 entry = c18090.getEntry("resources.arsc");
        if (entry == null) {
            c0658.f2543 = "absent";
            c0658.f2545 = null;
            return;
        }
        AbstractC15440 abstractC15440 = c0658.f2547;
        int i = C8420.f25794;
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("entries").m36526("resources.arsc");
        try {
            abstractC15440M36526.m36493(c18090.m42189(entry));
            c0658.f2551 = C8420.m22046(abstractC15440M36526);
            long jMo23127 = abstractC15440M36526.mo23127();
            c0658.f2552 = jMo23127;
            c0658.f2541 = true;
            try {
                C18920 c18920M19091 = m19091(new C19626(jMo23127, abstractC15440M36526, c0658.f2551));
                if (c18920M19091.f59607) {
                    c0658.f2543 = "available";
                    c0658.f2545 = null;
                } else {
                    m19094(c0658);
                    c0658.f2543 = "parse_error";
                    c0658.f2545 = c18920M19091.f59608;
                }
            } catch (Exception e) {
                m19094(c0658);
                c0658.f2543 = "parse_error";
                c0658.f2545 = e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage();
            }
        } catch (Exception e2) {
            abstractC15440M36526.mo23552();
            m19094(c0658);
            c0658.f2543 = "extract_error";
            c0658.f2545 = e2.getMessage() == null ? "Failed to extract resources.arsc" : e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19092(C18090 c18090, C0658 c0658) {
        ArrayList arrayList = c0658.f2544;
        AbstractC15440 abstractC15440 = c0658.f2547;
        arrayList.clear();
        boolean z = false;
        for (C3545 c3545 : c18090.m42190(true)) {
            String name = c3545.getName();
            if (z) {
                arrayList.add(new C19710(name, "skipped", "Skipped after previous dex error", null));
            } else {
                int i = C8420.f25794;
                AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("entries").m36526(name);
                try {
                    abstractC15440M36526.m36493(c18090.m42189(c3545));
                    C14844.m35245(abstractC15440M36526, C8420.m22044(abstractC15440, name));
                    arrayList.add(new C19710(name, "available", null, "cache/dex/" + name + ".type_index"));
                } catch (Exception e) {
                    arrayList.add(new C19710(name, d.O, e.getMessage() == null ? "Failed to open dex" : e.getMessage(), null));
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14852 m19096(C0658 c0658) throws C3059 {
        try {
            C18090 c18090 = new C18090(c0658.f2547.m36526("original.apk"));
            try {
                C14852 c14852M19089 = m19089(c0658, m19090(c18090), C3224.m9893(c18090));
                c18090.close();
                return c14852M19089;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14852 m19089(C0658 c0658, C18381 c18381, C20158 c20158) throws IOException {
        C19626 c19626;
        C18920 c18920;
        C18920 c18920M19091;
        boolean z;
        C14852 c14852;
        Iterator it;
        int i;
        DataInputStream dataInputStream;
        int i2;
        C13806 c13806;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList<C19710> arrayList2 = c0658.f2544;
        AbstractC15440 abstractC15440 = c0658.f2547;
        for (C19710 c19710 : arrayList2) {
            if ("available".equals(c19710.f63672) && (str = c19710.f63669) != null) {
                arrayList.add(str);
            }
        }
        C7457 c7457 = new C7457();
        for (C19710 c19711 : arrayList2) {
            String str2 = c19711.f63669;
            String str3 = c19711.f63672;
            if (str2 != null) {
                if (d.O.equals(str3)) {
                    C13806 c13807 = new C13806(str2);
                    c13807.f41135 = false;
                    c7457.m19984(c13807);
                } else if ("skipped".equals(str3)) {
                    C13806 c13808 = new C13806(str2);
                    c13808.f41135 = false;
                    c7457.m19984(c13808);
                } else if (arrayList.contains(str2)) {
                    try {
                        int i3 = C8420.f25794;
                        c7457.m19984(C13806.m33119(str2, m19093(abstractC15440.m36526("entries").m36526(str2))));
                    } catch (Exception e) {
                        if (e.getMessage() != null) {
                            e.getMessage();
                        }
                        C13806 c13809 = new C13806(str2);
                        c13809.f41135 = false;
                        c7457.m19984(c13809);
                    }
                }
            }
        }
        if (!"available".equals(c0658.f2543)) {
            m19094(c0658);
            if (c0658.f2541) {
                try {
                    c0658.f2541 = false;
                    C8420.m22043(abstractC15440, c0658);
                } catch (IOException unused) {
                }
            }
            c19626 = null;
        } else {
            int i4 = C8420.f25794;
            AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("entries").m36526("resources.arsc");
            if (c0658.f2551 == null) {
                c0658.f2551 = C8420.m22046(abstractC15440M36526);
                c0658.f2552 = abstractC15440M36526.mo23127();
                c0658.f2541 = true;
            }
            C19626 c19627 = new C19626(c0658.f2552, abstractC15440M36526, c0658.f2551);
            if (c0658.f2541) {
                try {
                    c0658.f2541 = false;
                    C8420.m22043(abstractC15440, c0658);
                } catch (IOException unused2) {
                }
            }
            c19626 = c19627;
        }
        if ("absent".equals(c0658.f2543) || "extract_error".equals(c0658.f2543)) {
            c18920 = new C18920(false, c0658.f2545);
        } else {
            if ("parse_error".equals(c0658.f2543)) {
                String str4 = c0658.f2545;
                if (str4 == null) {
                    str4 = "Failed to parse resources.arsc";
                }
                c18920 = new C18920(false, str4);
            } else {
                c18920M19091 = m19091(c19626);
            }
            if (!"available".equals(c0658.f2543) || "parse_error".equals(c0658.f2543)) {
                z = true;
            } else {
                z = false;
            }
            c14852 = new C14852(this.f21796, c0658.f2550, c0658.f2540, c0658.f2547, c0658.f2546, c0658.f2539, c0658.f2542, c18381.f57097, arrayList, z, c0658.f2543, c0658.f2545, c20158, c7457, c18920M19091, c19626);
            ArrayList arrayList3 = new ArrayList();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (String str5 : c14852.f45307) {
                it = c14852.f45315.f22881.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                        break;
                    }
                    c13806 = (C13806) it.next();
                    if (!c13806.f41135 && c13806.f41137.equals(str5)) {
                        i = c13806.f41136;
                        break;
                    }
                }
                c14852.f45294.getClass();
                AbstractC15440 abstractC15440M22044 = C8420.m22044(c14852.f45298, str5);
                dataInputStream = new DataInputStream(abstractC15440M22044.m36518());
                try {
                    if (dataInputStream.readInt() == 1296323657 || dataInputStream.readInt() != 2) {
                        throw new IOException("Invalid type index header");
                    }
                    int i5 = dataInputStream.readInt();
                    if (i5 < 0 || ((i >= 0 && i5 != i) || i5 > Math.max(0L, (abstractC15440M22044.mo23127() - 12) / 6))) {
                        throw new IOException("Invalid type index count");
                    }
                    ArrayList<C17667> arrayList4 = new ArrayList(Math.min(i5, 4096));
                    for (int i6 = 0; i6 < i5; i6++) {
                        String utf = dataInputStream.readUTF();
                        int i7 = dataInputStream.readInt();
                        if ((Integer.MIN_VALUE & i7) != 0) {
                            i7 &= Integer.MAX_VALUE;
                            i2 = dataInputStream.readInt();
                        } else {
                            i2 = 0;
                        }
                        arrayList4.add(new C17667(null, i7, i2, utf));
                    }
                    if (dataInputStream.read() != -1) {
                        throw new IOException("Trailing type index data");
                    }
                    dataInputStream.close();
                    for (C17667 c17667 : arrayList4) {
                        String str6 = c17667.f54033;
                        C13843.merge(map2, str6, 1, new C10697());
                        if (!map.containsKey(str6)) {
                            C17667 c17668 = new C17667(str5, c17667.f54032, c17667.f54035, str6);
                            map.put(str6, c17668);
                            arrayList3.add(c17668);
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
            c14852.f45308 = arrayList3;
            c14852.f45302 = map;
            c14852.f45306 = map2;
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C6083.sort(arrayList5, new C24025());
            c14852.f45314 = arrayList5;
            return c14852;
        }
        c18920M19091 = c18920;
        if ("available".equals(c0658.f2543)) {
            z = true;
        } else {
            z = true;
        }
        c14852 = new C14852(this.f21796, c0658.f2550, c0658.f2540, c0658.f2547, c0658.f2546, c0658.f2539, c0658.f2542, c18381.f57097, arrayList, z, c0658.f2543, c0658.f2545, c20158, c7457, c18920M19091, c19626);
        ArrayList arrayList6 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        while (r4.hasNext()) {
            it = c14852.f45315.f22881.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                c13806 = (C13806) it.next();
                if (!c13806.f41135) {
                }
            }
            c14852.f45294.getClass();
            AbstractC15440 abstractC15440M22045 = C8420.m22044(c14852.f45298, str5);
            dataInputStream = new DataInputStream(abstractC15440M22045.m36518());
            if (dataInputStream.readInt() == 1296323657) {
            }
            throw new IOException("Invalid type index header");
        }
        c14852.f45308 = arrayList6;
        c14852.f45302 = map3;
        c14852.f45306 = map4;
        ArrayList arrayList7 = new ArrayList(arrayList6);
        C6083.sort(arrayList7, new C24025());
        c14852.f45314 = arrayList7;
        return c14852;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19094(C0658 c0658) {
        if (c0658.f2551 != null || c0658.f2552 != -1) {
            c0658.f2541 = true;
        }
        c0658.f2551 = null;
        c0658.f2552 = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m19093(AbstractC15440 abstractC15440) throws IOException {
        InputStream inputStreamMo27926 = abstractC15440.mo27926();
        try {
            int i = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            C0521 c0521 = new C0521(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            byte[] bArr = new byte[8192];
            while (i > 0) {
                int i2 = inputStreamMo27926.read(bArr, 0, Math.min(8192, i));
                if (i2 == -1) {
                    break;
                }
                c0521.write(bArr, 0, i2);
                i -= i2;
            }
            byte[] bArr2 = c0521.f2176;
            int length = bArr2.length;
            int i3 = c0521.f2177;
            if (length == i3) {
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
                return bArr2;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, i3);
            if (inputStreamMo27926 != null) {
                inputStreamMo27926.close();
            }
            return bArrCopyOf;
        } catch (Throwable th) {
            if (inputStreamMo27926 != null) {
                try {
                    inputStreamMo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        if (inputStreamMo27926 != null) {
            inputStreamMo27926.close();
        }
        throw th;
    }
}
