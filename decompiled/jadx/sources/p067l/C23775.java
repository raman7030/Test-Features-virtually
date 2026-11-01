package p067l;

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
public final class C23775 {
    /* JADX INFO: renamed from: ֫ */
    public static C23105 m52841(AbstractC17043 abstractC17043, boolean z) {
        C23105 c23105 = new C23105(abstractC17043);
        if (z) {
            c23105.f72603 = C17853.f53278.m38685();
        } else {
            c23105.f72603 = c23105.f72602.m38678(".tmp");
        }
        c23105.f72604 = new C10844(c23105.f72603);
        return c23105;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52846(C23105 c23105) {
        c23105.f72603 = c23105.f72602.m38678(".tmp");
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m52838(Collection collection) {
        Iterator it = collection.iterator();
        long jM12774 = 0;
        while (it.hasNext()) {
            C5738 c5738 = (C5738) it.next();
            if (!c5738.isDirectory()) {
                jM12774 += c5738.m12774();
            }
        }
        return jM12774;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52847(C5738 c5738) {
        return c5738.m12789() && c5738.m12773() && c5738.m12748() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m52840(C19561 c19561, C5738 c5738, InterfaceC18588 interfaceC18588) {
        List<C14259> listM28252 = C12248.m28252();
        if (!m52847(c5738)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String strM44467 = c19561.m44467();
        try {
            for (C14259 c14259 : listM28252) {
                if (interfaceC18588.mo3924()) {
                    break;
                }
                c19561.m44451(c14259.f40605);
                try {
                    InputStream inputStreamM44448 = c19561.m44448(c5738);
                    try {
                        arrayList.add(c14259);
                        inputStreamM44448.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM44448.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C6150 unused) {
                }
            }
            c19561.m44451(strM44467);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C12826.requireNonNull(obj);
                arrayList2.add(obj);
            }
            return C21562.unmodifiableList(arrayList2);
        } catch (Throwable th3) {
            c19561.m44451(strM44467);
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
    /* JADX INFO: renamed from: ֫ */
    public static void m52844(String str, C19561 c19561, C5738 c5738, AbstractC17043 abstractC17043, boolean z, InterfaceC17068 interfaceC17068) throws Throwable {
        ?? M12789;
        ?? M44448;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        ?? Mo25506;
        ?? r16;
        int i = 4096;
        boolean z2 = false;
        if (!m52847(c5738)) {
            if (c5738.m12789() && !interfaceC17068.mo18283()) {
                interfaceC17068.cancel();
                return;
            }
            try {
                M12789 = c5738.m12789();
                try {
                    if (M12789 != 0) {
                        while (true) {
                            boolean zM52848 = true;
                            try {
                                M44448 = new BufferedInputStream(c19561.m44448(c5738));
                                try {
                                    try {
                                        zM52848 = true ^ m52848(c5738, (BufferedInputStream) M44448);
                                        M44448 = M44448;
                                    } catch (Throwable th) {
                                        th = th;
                                        M12789 = 0;
                                        C2700.m4192(M44448);
                                        C2700.m4192(M12789);
                                        throw th;
                                    }
                                } catch (C6150 unused) {
                                    M44448 = M44448;
                                }
                            } catch (C6150 unused2) {
                                M44448 = 0;
                            }
                            if (zM52848) {
                                C2700.m4192(M44448);
                                if (interfaceC17068.mo18282()) {
                                    m52842();
                                }
                                c19561.m44451((String) null);
                                if (!interfaceC17068.mo18283()) {
                                    interfaceC17068.cancel();
                                    return;
                                }
                            } else {
                                M12789 = 0;
                                try {
                                    M44448 = M44448;
                                    if (!interfaceC17068.mo18284()) {
                                        break;
                                    }
                                    m52843(c19561.m44467(), str);
                                    M44448 = M44448;
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    C2700.m4192(M44448);
                                    C2700.m4192(M12789);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        M44448 = c19561.m44448(c5738);
                    }
                    OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
                    try {
                        byte[] bArr = new byte[4096];
                        long size = c5738.getSize();
                        long j = 0;
                        do {
                            int i2 = M44448.read(bArr);
                            if (i2 > 0) {
                                outputStreamMo25506.write(bArr, 0, i2);
                                j += (long) i2;
                                if (size > 0) {
                                    interfaceC17068.mo18281(j, size);
                                }
                            } else {
                                outputStreamMo25506.close();
                                if (!z && C7050.m16218()) {
                                    abstractC17043.mo20486(c5738.getTime());
                                }
                                C2700.m4192(M44448);
                                return;
                            }
                        } while (!interfaceC17068.mo3924());
                        C2700.m4192(outputStreamMo25506);
                        abstractC17043.mo25503();
                        C2700.m4192(M44448);
                    } catch (Throwable th3) {
                        th = th3;
                        M12789 = outputStreamMo25506;
                        C2700.m4192(M44448);
                        C2700.m4192(M12789);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    M44448 = M12789;
                    C2700.m4192(M44448);
                    C2700.m4192(M12789);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                M12789 = 0;
            }
        } else {
            if (!interfaceC17068.mo18283()) {
                interfaceC17068.cancel();
                return;
            }
            while (true) {
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(c19561.m44448(c5738));
                        try {
                            try {
                                if (!m52848(c5738, bufferedInputStream)) {
                                    throw new C6150(c5738.getName());
                                }
                                Mo25506 = abstractC17043.mo25506(z2);
                                try {
                                    byte[] bArr2 = new byte[i];
                                    long size2 = c5738.getSize();
                                    long j2 = 0;
                                    ?? r6 = z2;
                                    while (true) {
                                        int i3 = bufferedInputStream.read(bArr2);
                                        if (i3 > 0) {
                                            Mo25506.write(bArr2, r6, i3);
                                            j2 += (long) i3;
                                            if (size2 > 0) {
                                                interfaceC17068.mo18281(j2, size2);
                                            }
                                            if (interfaceC17068.mo3924()) {
                                                C2700.m4192(Mo25506);
                                                abstractC17043.mo25503();
                                                break;
                                            }
                                            r6 = 0;
                                        } else {
                                            Mo25506.close();
                                            if (z || !C7050.m16218()) {
                                                break;
                                                break;
                                            } else {
                                                abstractC17043.mo20486(c5738.getTime());
                                                break;
                                            }
                                        }
                                    }
                                    C2700.m4192(bufferedInputStream);
                                    return;
                                } catch (C6150 unused3) {
                                    try {
                                        C2700.m4192(bufferedInputStream);
                                        try {
                                            C2700.m4192(Mo25506);
                                            abstractC17043.mo25503();
                                            if (interfaceC17068.mo18282()) {
                                                m52842();
                                            }
                                            c19561.m44451((String) null);
                                            if (!interfaceC17068.mo18283()) {
                                                interfaceC17068.cancel();
                                                return;
                                            } else {
                                                i = 4096;
                                                z2 = false;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r16 = Mo25506;
                                            bufferedInputStream2 = null;
                                            C2700.m4192(bufferedInputStream2);
                                            C2700.m4192(r16);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        bufferedInputStream2 = bufferedInputStream;
                                        r16 = Mo25506;
                                    }
                                    r16 = 0;
                                    C2700.m4192(bufferedInputStream2);
                                    C2700.m4192(r16);
                                    throw th;
                                } catch (IOException e) {
                                    e = e;
                                    C2700.m4192(Mo25506);
                                    abstractC17043.mo25503();
                                    throw e;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                bufferedInputStream2 = bufferedInputStream;
                                r16 = 0;
                                C2700.m4192(bufferedInputStream2);
                                C2700.m4192(r16);
                                throw th;
                            }
                        } catch (C6150 unused4) {
                            Mo25506 = 0;
                            C2700.m4192(bufferedInputStream);
                            C2700.m4192(Mo25506);
                            abstractC17043.mo25503();
                            if (interfaceC17068.mo18282()) {
                                m52842();
                            }
                            c19561.m44451((String) null);
                            if (!interfaceC17068.mo18283()) {
                                interfaceC17068.cancel();
                                return;
                            } else {
                                i = 4096;
                                z2 = false;
                            }
                            r16 = 0;
                            C2700.m4192(bufferedInputStream2);
                            C2700.m4192(r16);
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            Mo25506 = 0;
                            C2700.m4192(Mo25506);
                            abstractC17043.mo25503();
                            throw e;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        bufferedInputStream2 = null;
                    }
                } catch (C6150 unused5) {
                    bufferedInputStream = null;
                } catch (IOException e3) {
                    e = e3;
                }
                i = 4096;
                z2 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52845(C5738 c5738, C19561 c19561, C10844 c10844, InterfaceC10364 interfaceC10364) {
        C14196 c14196M44465;
        if (c10844.m24998(c5738)) {
            return;
        }
        c10844.m24994(c5738);
        byte[] bArr = new byte[4096];
        try {
            c14196M44465 = c19561.m44465(c5738);
            long j = 0;
            do {
                try {
                    int i = c14196M44465.read(bArr);
                    if (i <= 0) {
                        C2700.m4192(c14196M44465);
                        return;
                    } else {
                        c10844.m24984(i, bArr);
                        j += (long) i;
                        interfaceC10364.mo23231(j, c5738.getSize());
                    }
                } catch (Throwable th) {
                    th = th;
                    C2700.m4192(c14196M44465);
                    throw th;
                }
            } while (!interfaceC10364.mo3924());
            C2700.m4192(c14196M44465);
        } catch (Throwable th2) {
            th = th2;
            c14196M44465 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m52839(C5738 c5738, AbstractC17043 abstractC17043, byte[] bArr, String str, C2582 c2582) throws IOException {
        C19561 c19561M44427;
        if (c2582 == null || (c19561M44427 = (C19561) c2582.m3892()) == null) {
            c19561M44427 = C19561.m44427(abstractC17043, bArr);
        }
        c19561M44427.m44451(str);
        try {
            InputStream inputStreamM44448 = c19561M44427.m44448(c5738);
            return c2582 == null ? inputStreamM44448 : new C3658(inputStreamM44448, c2582, c19561M44427);
        } catch (IOException e) {
            C2700.m4192(c19561M44427);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52848(C5738 c5738, BufferedInputStream bufferedInputStream) throws IOException {
        try {
            bufferedInputStream.mark(1024);
            bufferedInputStream.read(new byte[1024]);
            bufferedInputStream.reset();
            return true;
        } catch (ZipException e) {
            if (c5738.m12773()) {
                return false;
            }
            throw e;
        } catch (C6150 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52842() {
        C7050.m16212(new RunnableC2987());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52843(String str, String str2) {
        ActivityC5542.m12233(str, str2);
        C7050.m16212(new RunnableC7682());
    }
}
