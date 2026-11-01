package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ۘۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T2R9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6054 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f15203 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C2582 f15204 = new C2582(5);

    /* JADX INFO: renamed from: ܽ */
    public static final C2582 f15205 = new C2582(5);

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m13641(int i, final byte[] bArr) {
        if (i <= 131072) {
            return m13640(0, i, bArr);
        }
        C11996 c11996 = new C11996();
        c11996.mo15113(10847);
        c11996.writeInt(i);
        ArrayList arrayList = new ArrayList((i / 10847) + 1);
        final int i2 = 0;
        while (i > 0) {
            final int iMin = Math.min(i, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
            arrayList.add(new Callable() { // from class: l.ۖۤۡ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6054.m13640(i2, iMin, bArr);
                }
            });
            i2 += iMin;
            i -= iMin;
        }
        try {
            List listInvokeAll = C4081.f8986.invokeAll(arrayList);
            c11996.mo15113(listInvokeAll.size());
            Iterator it = listInvokeAll.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) ((Future) it.next()).get();
                c11996.m27461(bArr2.length);
                c11996.write(bArr2, 0, bArr2.length);
            }
            return c11996.m27464();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m13642(String str) {
        C2864 c2864M13638 = m13638();
        C2582 c2582 = f15205;
        byte[] bArr = (byte[]) c2582.m3892();
        if (bArr == null) {
            bArr = new byte[8192];
        }
        try {
            C5173 c5173 = new C5173(bArr, new GZIPOutputStream(c2864M13638));
            try {
                C7855.m18155(c5173, str);
                c5173.close();
                byte[] bArrCopyOf = Arrays.copyOf(c2864M13638.f4949, c2864M13638.f4950);
                m13639(c2864M13638);
                c2582.m3890(bArr);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c5173.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m13639(c2864M13638);
            c2582.m3890(bArr);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m13643(byte[] bArr, int i) {
        C2864 c2864M13638 = m13638();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c2864M13638);
            try {
                gZIPOutputStream.write(bArr, 0, i);
                gZIPOutputStream.close();
                byte[] bArrCopyOf = Arrays.copyOf(c2864M13638.f4949, c2864M13638.f4950);
                m13639(c2864M13638);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m13639(c2864M13638);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m13640(int i, int i2, byte[] bArr) {
        C2864 c2864M13638 = m13638();
        try {
            C11879 c11879 = new C11879(c2864M13638);
            try {
                c11879.write(bArr, i, i2);
                c11879.close();
                byte[] bArrCopyOf = Arrays.copyOf(c2864M13638.f4949, c2864M13638.f4950);
                m13639(c2864M13638);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c11879.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m13639(c2864M13638);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m13637(byte[] bArr) {
        int length = bArr.length;
        C2864 c2864M13638 = m13638();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, length));
                try {
                    C23461.m52179(gZIPInputStream, c2864M13638);
                    String str = new String(c2864M13638.f4949, 0, c2864M13638.f4950, StandardCharsets.UTF_8);
                    gZIPInputStream.close();
                    m13639(c2864M13638);
                    return str;
                } catch (Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th3) {
            m13639(c2864M13638);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m13644(byte[] bArr, int i) {
        C2864 c2864M13638 = m13638();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, i));
                try {
                    C23461.m52179(gZIPInputStream, c2864M13638);
                    byte[] bArrCopyOf = Arrays.copyOf(c2864M13638.f4949, c2864M13638.f4950);
                    gZIPInputStream.close();
                    m13639(c2864M13638);
                    return bArrCopyOf;
                } catch (Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th3) {
            m13639(c2864M13638);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2864 m13638() {
        C2864 c2864 = (C2864) f15204.m3892();
        return c2864 == null ? new C2864() : c2864;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13639(C2864 c2864) {
        if (c2864.f4949.length < 2097152) {
            c2864.m4599();
            f15204.m3890(c2864);
        }
    }
}
