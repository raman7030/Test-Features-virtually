package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩹᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes.dex */
public final class C22523 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21818 m50499(AbstractC15440 abstractC15440, boolean z) {
        C21818 c21818 = new C21818(abstractC15440);
        if (z) {
            c21818.f69894 = C16293.f50111.m36527();
        } else {
            c21818.f69894 = c21818.f69893.m36520(".tmp");
        }
        c21818.f69895 = new C8918(c21818.f69894);
        return c21818;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50504(C21818 c21818) {
        c21818.f69894 = c21818.f69893.m36520(".tmp");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m50496(Collection collection) {
        Iterator it = collection.iterator();
        long jM10793 = 0;
        while (it.hasNext()) {
            C3545 c3545 = (C3545) it.next();
            if (!c3545.isDirectory()) {
                jM10793 += c3545.m10793();
            }
        }
        return jM10793;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50505(C3545 c3545) {
        return c3545.m10808() && c3545.m10792() && c3545.m10767() == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m50498(C18090 c18090, C3545 c3545, InterfaceC17066 interfaceC17066) {
        List<C12511> listM26223 = C10395.m26223();
        if (!m50505(c3545)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String strM42208 = c18090.m42208();
        try {
            for (C12511 c12511 : listM26223) {
                if (interfaceC17066.mo1526()) {
                    break;
                }
                c18090.m42192(c12511.f37581);
                try {
                    InputStream inputStreamM42189 = c18090.m42189(c3545);
                    try {
                        arrayList.add(c12511);
                        inputStreamM42189.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM42189.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C3979 unused) {
                }
            }
            c18090.m42192(strM42208);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C11003.requireNonNull(obj);
                arrayList2.add(obj);
            }
            return C20195.unmodifiableList(arrayList2);
        } catch (Throwable th3) {
            c18090.m42192(strM42208);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009f A[Catch: all -> 0x0080, TryCatch #1 {all -> 0x0080, blocks: (B:8:0x001b, B:51:0x0096, B:53:0x009f, B:54:0x00a2, B:56:0x00ac), top: B:136:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0 A[LOOP:0: B:136:0x001b->B:58:0x00b0, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.InputStream, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.OutputStream, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.AutoCloseable] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50502(String str, C18090 c18090, C3545 c3545, AbstractC15440 abstractC15440, boolean z, InterfaceC15466 interfaceC15466) throws Throwable {
        ?? M10808;
        ?? M42189;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        ?? Mo23555;
        ?? r16;
        int i = 4096;
        boolean z2 = false;
        if (!m50505(c3545)) {
            if (c3545.m10808() && !interfaceC15466.mo16358()) {
                interfaceC15466.cancel();
                return;
            }
            try {
                M10808 = c3545.m10808();
                try {
                    if (M10808 != 0) {
                        while (true) {
                            boolean zM50506 = true;
                            try {
                                M42189 = new BufferedInputStream(c18090.m42189(c3545));
                                try {
                                    try {
                                        zM50506 = true ^ m50506(c3545, (BufferedInputStream) M42189);
                                        M42189 = M42189;
                                    } catch (Throwable th) {
                                        th = th;
                                        M10808 = 0;
                                        C0349.m1793(M42189);
                                        C0349.m1793(M10808);
                                        throw th;
                                    }
                                } catch (C3979 unused) {
                                    M42189 = M42189;
                                }
                            } catch (C3979 unused2) {
                                M42189 = 0;
                            }
                            if (zM50506) {
                                C0349.m1793(M42189);
                                if (interfaceC15466.mo16357()) {
                                    m50500();
                                }
                                c18090.m42192((String) null);
                                if (!interfaceC15466.mo16358()) {
                                    interfaceC15466.cancel();
                                    return;
                                }
                            } else {
                                M10808 = 0;
                                try {
                                    M42189 = M42189;
                                    if (!interfaceC15466.mo16359()) {
                                        break;
                                    }
                                    m50501(c18090.m42208(), str);
                                    M42189 = M42189;
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    C0349.m1793(M42189);
                                    C0349.m1793(M10808);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        M42189 = c18090.m42189(c3545);
                    }
                    OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
                    try {
                        byte[] bArr = new byte[4096];
                        long size = c3545.getSize();
                        long j = 0;
                        do {
                            int i2 = M42189.read(bArr);
                            if (i2 > 0) {
                                outputStreamMo23555.write(bArr, 0, i2);
                                j += (long) i2;
                                if (size > 0) {
                                    interfaceC15466.mo16356(j, size);
                                }
                            } else {
                                outputStreamMo23555.close();
                                if (!z && C4925.m14321()) {
                                    abstractC15440.mo18537(c3545.getTime());
                                }
                                C0349.m1793(M42189);
                                return;
                            }
                        } while (!interfaceC15466.mo1526());
                        C0349.m1793(outputStreamMo23555);
                        abstractC15440.mo23552();
                        C0349.m1793(M42189);
                    } catch (Throwable th3) {
                        th = th3;
                        M10808 = outputStreamMo23555;
                        C0349.m1793(M42189);
                        C0349.m1793(M10808);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    M42189 = M10808;
                    C0349.m1793(M42189);
                    C0349.m1793(M10808);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                M10808 = 0;
            }
        } else {
            if (!interfaceC15466.mo16358()) {
                interfaceC15466.cancel();
                return;
            }
            while (true) {
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(c18090.m42189(c3545));
                        try {
                            try {
                                if (!m50506(c3545, bufferedInputStream)) {
                                    throw new C3979(c3545.getName());
                                }
                                Mo23555 = abstractC15440.mo23555(z2);
                                try {
                                    byte[] bArr2 = new byte[i];
                                    long size2 = c3545.getSize();
                                    long j2 = 0;
                                    ?? r6 = z2;
                                    while (true) {
                                        int i3 = bufferedInputStream.read(bArr2);
                                        if (i3 > 0) {
                                            Mo23555.write(bArr2, r6, i3);
                                            j2 += (long) i3;
                                            if (size2 > 0) {
                                                interfaceC15466.mo16356(j2, size2);
                                            }
                                            if (interfaceC15466.mo1526()) {
                                                C0349.m1793(Mo23555);
                                                abstractC15440.mo23552();
                                                break;
                                            }
                                            r6 = 0;
                                        } else {
                                            Mo23555.close();
                                            if (z || !C4925.m14321()) {
                                                break;
                                                break;
                                            } else {
                                                abstractC15440.mo18537(c3545.getTime());
                                                break;
                                            }
                                        }
                                    }
                                    C0349.m1793(bufferedInputStream);
                                    return;
                                } catch (C3979 unused3) {
                                    try {
                                        C0349.m1793(bufferedInputStream);
                                        try {
                                            C0349.m1793(Mo23555);
                                            abstractC15440.mo23552();
                                            if (interfaceC15466.mo16357()) {
                                                m50500();
                                            }
                                            c18090.m42192((String) null);
                                            if (!interfaceC15466.mo16358()) {
                                                interfaceC15466.cancel();
                                                return;
                                            } else {
                                                i = 4096;
                                                z2 = false;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r16 = Mo23555;
                                            bufferedInputStream2 = null;
                                            C0349.m1793(bufferedInputStream2);
                                            C0349.m1793(r16);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        bufferedInputStream2 = bufferedInputStream;
                                        r16 = Mo23555;
                                    }
                                    r16 = 0;
                                    C0349.m1793(bufferedInputStream2);
                                    C0349.m1793(r16);
                                    throw th;
                                } catch (IOException e) {
                                    e = e;
                                    C0349.m1793(Mo23555);
                                    abstractC15440.mo23552();
                                    throw e;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                bufferedInputStream2 = bufferedInputStream;
                                r16 = 0;
                                C0349.m1793(bufferedInputStream2);
                                C0349.m1793(r16);
                                throw th;
                            }
                        } catch (C3979 unused4) {
                            Mo23555 = 0;
                            C0349.m1793(bufferedInputStream);
                            C0349.m1793(Mo23555);
                            abstractC15440.mo23552();
                            if (interfaceC15466.mo16357()) {
                                m50500();
                            }
                            c18090.m42192((String) null);
                            if (!interfaceC15466.mo16358()) {
                                interfaceC15466.cancel();
                                return;
                            } else {
                                i = 4096;
                                z2 = false;
                            }
                            r16 = 0;
                            C0349.m1793(bufferedInputStream2);
                            C0349.m1793(r16);
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            Mo23555 = 0;
                            C0349.m1793(Mo23555);
                            abstractC15440.mo23552();
                            throw e;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        bufferedInputStream2 = null;
                    }
                } catch (C3979 unused5) {
                    bufferedInputStream = null;
                } catch (IOException e3) {
                    e = e3;
                }
                i = 4096;
                z2 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50503(C3545 c3545, C18090 c18090, C8918 c8918, InterfaceC8412 interfaceC8412) {
        C12445 c12445M42206;
        if (c8918.m23024(c3545)) {
            return;
        }
        c8918.m23020(c3545);
        byte[] bArr = new byte[4096];
        try {
            c12445M42206 = c18090.m42206(c3545);
            long j = 0;
            do {
                try {
                    int i = c12445M42206.read(bArr);
                    if (i <= 0) {
                        C0349.m1793(c12445M42206);
                        return;
                    } else {
                        c8918.m23010(i, bArr);
                        j += (long) i;
                        interfaceC8412.mo21265(j, c3545.getSize());
                    }
                } catch (Throwable th) {
                    th = th;
                    C0349.m1793(c12445M42206);
                    throw th;
                }
            } while (!interfaceC8412.mo1526());
            C0349.m1793(c12445M42206);
        } catch (Throwable th2) {
            th = th2;
            c12445M42206 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m50497(C3545 c3545, AbstractC15440 abstractC15440, byte[] bArr, String str, C0225 c0225) throws IOException {
        C18090 c18090M42168;
        if (c0225 == null || (c18090M42168 = (C18090) c0225.m1479()) == null) {
            c18090M42168 = C18090.m42168(abstractC15440, bArr);
        }
        c18090M42168.m42192(str);
        try {
            InputStream inputStreamM42189 = c18090M42168.m42189(c3545);
            return c0225 == null ? inputStreamM42189 : new C1356(inputStreamM42189, c0225, c18090M42168);
        } catch (IOException e) {
            C0349.m1793(c18090M42168);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50506(C3545 c3545, BufferedInputStream bufferedInputStream) throws IOException {
        try {
            bufferedInputStream.mark(1024);
            bufferedInputStream.read(new byte[1024]);
            bufferedInputStream.reset();
            return true;
        } catch (ZipException e) {
            if (c3545.m10792()) {
                return false;
            }
            throw e;
        } catch (C3979 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50500() {
        C4925.m14315(new RunnableC0650());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50501(String str, String str2) {
        ActivityC3339.m10197(str, str2);
        C4925.m14315(new RunnableC5590());
    }
}
