package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ۙ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4863 implements InterfaceC2188, InterfaceC16982 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Set f15369 = C20195.unmodifiableSet(EnumSet.of(EnumC6737.FILE_SHARE_READ, EnumC6737.FILE_SHARE_WRITE, EnumC6737.FILE_SHARE_DELETE));

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12066 f15370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21239 f15372;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10508 f15373;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f15371 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f15374 = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public synchronized void m14195() {
        if (!this.f15371 && !this.f15374) {
            this.f15374 = true;
            C10508 c10508 = this.f15373;
            C19828 c19828 = this.f15372.f68457;
            C12066 c12066 = c19828.f64061;
            C1482.m5136(c10508);
            boolean zM26412 = c10508.m26412();
            int i = C12771.f38365;
            if (zM26412) {
                c19828.f64059 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public synchronized void m14206() {
        try {
            C21239 c21239 = this.f15372;
            this.f15373 = c21239.f68456.m31068(c21239.f68457, c21239.f68458);
            this.f15371 = false;
            this.f15374 = false;
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public synchronized void m14215() {
        if (!this.f15371 && !this.f15374) {
            this.f15371 = true;
            this.f15372.m48212(this.f15373);
        }
    }

    public C4863(C12066 c12066, C10508 c10508, C21239 c21239) {
        this.f15370 = c12066;
        this.f15372 = c21239;
        this.f15373 = c10508;
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final List mo7209(final String str) {
        try {
            return (List) m14190(new InterfaceC22502() { // from class: l.᩶ᩴ᩻
                @Override // l.InterfaceC22502
                public final Object call() {
                    return C4863.m14191(this.f65739, str);
                }
            });
        } finally {
            m14215();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m14191(C4863 c4863, String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (str.equals("/")) {
            for (C12901 c12901 : new C3024(EnumC2194.f7203.m7248(c4863.f15373.f31521)).m9272(c4863.f15370.f36083)) {
                int iM31342 = c12901.m31342() & Mod.M30;
                if (iM31342 == 0 || iM31342 == 33554432 || iM31342 == 67108864 || iM31342 == 134217728) {
                    if (!c12901.m31340().endsWith("$")) {
                        arrayList.add(new C3452(c12901));
                    }
                }
            }
        } else {
            C21797 c21797M14205 = c4863.m14205(str, true);
            for (C2463 c2463 : c21797M14205.f69819.m33375(c21797M14205.f69818)) {
                String strM47624 = c2463.m47624();
                if (!strM47624.equals(".") && !strM47624.equals("..")) {
                    arrayList.add(new C3452(c2463));
                }
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ܽ */
    public final void mo7214(final long j, final String str) {
        try {
            m14190(new InterfaceC22502() { // from class: l.ۛᩴ᩻
                @Override // l.InterfaceC22502
                public final Object call() throws IOException {
                    C4863.m14209(this.f19345, str, j);
                    return null;
                }
            });
        } finally {
            m14215();
        }
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final void mo7210(String str, String str2) {
        String[] strArrM14211 = m14211(str);
        String[] strArrM14212 = m14211(str2);
        try {
            if (!strArrM14211[0].equals(strArrM14212[0])) {
                throw new IOException("Cannot rename between different shares");
            }
            if (!strArrM14211[1].equals(strArrM14212[1])) {
                try {
                    m14196(strArrM14211[0], strArrM14211[1], strArrM14212[1]);
                } catch (C1092 e) {
                    throw new IOException(e.getMessage(), e);
                } catch (C10951 e2) {
                    if (!m14203((Exception) e2)) {
                        throw m14186(e2);
                    }
                    IOException iOExceptionM14186 = m14186(e2);
                    try {
                        try {
                            m14206();
                            m14201(this, strArrM14211, strArrM14212);
                        } catch (C1092 e3) {
                            throw m14183(iOExceptionM14186, new IOException(e3.getMessage(), e3));
                        }
                    } catch (IOException e4) {
                        throw m14183(iOExceptionM14186, e4);
                    } catch (C10951 e5) {
                        throw m14183(iOExceptionM14186, m14186(e5));
                    }
                }
                m14215();
                return;
            }
            m14215();
        } catch (Throwable th) {
            m14215();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14201(C4863 c4863, String[] strArr, String[] strArr2) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr2[1];
        C13935 c13935 = (C13935) c4863.f15373.f31521.m36376(str);
        if (c13935.m33371(str2) || c13935.m33373(str2) || !(c13935.m33371(str3) || c13935.m33373(str3))) {
            c4863.m14196(strArr[0], strArr[1], strArr2[1]);
        }
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ܽ */
    public final void mo7215(String str) {
        try {
            try {
                m14220(str);
            } catch (C1092 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C10951 e2) {
                if (!m14203((Exception) e2)) {
                    throw m14186(e2);
                }
                IOException iOExceptionM14186 = m14186(e2);
                try {
                    try {
                        try {
                            m14206();
                            m14208(this, str);
                        } catch (C1092 e3) {
                            throw m14183(iOExceptionM14186, new IOException(e3.getMessage(), e3));
                        }
                    } catch (C10951 e4) {
                        throw m14183(iOExceptionM14186, m14186(e4));
                    }
                } catch (IOException e5) {
                    throw m14183(iOExceptionM14186, e5);
                }
            }
            m14215();
        } catch (Throwable th) {
            m14215();
            throw th;
        }
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1377 mo7213(final String str) throws IOException {
        try {
            return new C0629(new C14740(this, (C7586) m14190(new InterfaceC22502() { // from class: l.ۤᩴ᩻
                @Override // l.InterfaceC22502
                public final Object call() {
                    return this.f31459.m14216(str);
                }
            })), new C2041(this), new C3431(this, str), new C14013(this));
        } catch (IOException e) {
            try {
                m14215();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo7212(long j, String str) {
        return m14187(str, j, -1L, new C22481(), false);
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7207(String str, long j, long j2) {
        final long j3 = C13132.FOREVER_NS;
        if (j2 >= 0 && C13132.FOREVER_NS - j >= j2) {
            j3 = j + j2;
        }
        return m14187(str, j, j2, new LongSupplier() { // from class: l.۬ᩴ᩻
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return j3;
            }
        }, true);
    }

    @Override // l.InterfaceC16982
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream mo14222(String str, long j, long j2, C9928 c9928) {
        return m14187(str, j, j2, c9928, true);
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo7208(long j, final String str) throws IOException {
        try {
            C21092 c21092 = new C21092((C7586) m14190(new InterfaceC22502() { // from class: l.ۨᩴ᩻
                @Override // l.InterfaceC22502
                public final Object call() {
                    return this.f35533.m14212(str, true);
                }
            }));
            int iM20340 = c21092.f68017.m20340();
            return new C6980(iM20340, m14182(iM20340, this.f15373.f31519.m52164()), new C17563(this, c21092, str, iM20340), new C23186(this, c21092), new C14013(this), new C7664(this), new C20177());
        } catch (IOException e) {
            try {
                m14215();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14200(C4863 c4863, C21092 c21092) throws IOException {
        IOException iOExceptionM14185 = c4863.m14185(c21092.f68017, (IOException) null);
        if (iOExceptionM14185 != null) {
            throw iOExceptionM14185;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private IOException m14186(C10951 c10951) {
        m14195();
        return new IOException(c10951.getMessage(), c10951);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m14190(InterfaceC22502 interfaceC22502) throws IOException {
        try {
            return interfaceC22502.call();
        } catch (C1092 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C10951 e2) {
            if (!m14203((Exception) e2)) {
                throw m14186(e2);
            }
            IOException iOExceptionM14186 = m14186(e2);
            try {
                m14206();
                return interfaceC22502.call();
            } catch (IOException e3) {
                throw m14183(iOExceptionM14186, e3);
            } catch (C1092 e4) {
                throw m14183(iOExceptionM14186, new IOException(e4.getMessage(), e4));
            } catch (C10951 e5) {
                throw m14183(iOExceptionM14186, m14186(e5));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m14189(C4863 c4863, C10951 c10951, InterfaceC16151 interfaceC16151) throws IOException {
        if (!m14203((Exception) c10951)) {
            throw c4863.m14186(c10951);
        }
        IOException iOExceptionM14186 = c4863.m14186(c10951);
        try {
            c4863.m14206();
            return interfaceC16151.get();
        } catch (IOException e) {
            throw m14183(iOExceptionM14186, e);
        } catch (C1092 e2) {
            throw m14183(iOExceptionM14186, new IOException(e2.getMessage(), e2));
        } catch (C10951 e3) {
            throw m14183(iOExceptionM14186, c4863.m14186(e3));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m14188(C4863 c4863, IOException iOException, C5569 c5569) throws IOException {
        if (!m14203((Exception) iOException)) {
            c4863.m14195();
            throw iOException;
        }
        c4863.m14195();
        try {
            c4863.m14206();
            return c5569.get();
        } catch (IOException e) {
            c4863.m14195();
            throw m14183(iOException, e);
        } catch (C1092 e2) {
            throw m14183(iOException, new IOException(e2.getMessage(), e2));
        } catch (C10951 e3) {
            throw m14183(iOException, c4863.m14186(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public IOException m14185(C7586 c7586, IOException iOException) {
        if (c7586 == null) {
            return iOException;
        }
        try {
            c7586.close();
            return iOException;
        } catch (C1092 e) {
            return m14183(iOException, new IOException(e.getMessage(), e));
        } catch (C10951 e2) {
            return m14183(iOException, m14186(e2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m14183(IOException iOException, IOException iOException2) {
        if (iOException == null) {
            return iOException2;
        }
        if (iOException == iOException2) {
            return iOException;
        }
        iOException.addSuppressed(iOException2);
        return iOException;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InputStream m14187(final String str, long j, long j2, LongSupplier longSupplier, boolean z) throws IOException {
        try {
            C15445 c15445M14194 = m14194((C7586) m14190(new InterfaceC22502() { // from class: l.ۙᩴ᩻
                @Override // l.InterfaceC22502
                public final Object call() {
                    return this.f15298.m14216(str);
                }
            }), j, j2, z);
            if (z) {
                return new C1335(c15445M14194, j, longSupplier, new C2041(this), new InterfaceC9803() { // from class: l.ۧ᩵᩻
                    @Override // l.InterfaceC9803
                    /* JADX INFO: renamed from: ֫ */
                    public final Object mo24841(IOException iOException, C5569 c5569) {
                        return C4863.m14188(this.f33647, iOException, c5569);
                    }
                }, new InterfaceC2747() { // from class: l.ܽ᩵᩻
                    @Override // l.InterfaceC2747
                    /* JADX INFO: renamed from: ֫ */
                    public final Object mo8492(long j3, long j4) {
                        return C4863.m14193(this.f51734, str, j3, j4);
                    }
                }, new C14013(this), new C7664(this), true);
            }
            return new C1335(c15445M14194, j, new C22481(), new C2041(this), new InterfaceC9803() { // from class: l.ۧ᩵᩻
                @Override // l.InterfaceC9803
                /* JADX INFO: renamed from: ֫ */
                public final Object mo24841(IOException iOException, C5569 c5569) {
                    return C4863.m14188(this.f33647, iOException, c5569);
                }
            }, new InterfaceC2747() { // from class: l.ᩳ᩵᩻
                @Override // l.InterfaceC2747
                /* JADX INFO: renamed from: ֫ */
                public final Object mo8492(long j3, long j4) {
                    return C4863.m14192(this.f56807, str, j3);
                }
            }, new C14013(this), new C14013(this), false);
        } catch (IOException e) {
            try {
                m14215();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15445 m14192(C4863 c4863, String str, long j) throws IOException {
        try {
            return c4863.m14194(c4863.m14216(str), j, -1L, false);
        } catch (C1092 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15445 m14193(C4863 c4863, String str, long j, long j2) throws IOException {
        try {
            return c4863.m14194(c4863.m14216(str), j, j2, true);
        } catch (C1092 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15445 m14194(C7586 c7586, long j, long j2, boolean z) {
        InputStream inputStreamM20341;
        int iM20339 = c7586.m20339();
        int iMax = (!z || iM20339 <= 0) ? 1 : Math.max(1, Math.min(4, 1048576 / iM20339));
        if (z) {
            inputStreamM20341 = c7586.m20337(j, iMax, j2);
        } else {
            inputStreamM20341 = c7586.m20341(j);
        }
        return new C15445(inputStreamM20341, new C12603(this, c7586, inputStreamM20341));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C14740 m14210(C4863 c4863, String str) throws IOException {
        try {
            return new C14740(c4863, c4863.m14216(str));
        } catch (C1092 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14199(C4863 c4863, C7586 c7586, InputStream inputStream) throws IOException {
        try {
            inputStream.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        IOException iOExceptionM14185 = c4863.m14185(c7586, e);
        if (iOExceptionM14185 != null) {
            throw iOExceptionM14185;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m14182(int i, int i2) {
        int iMax = i <= 0 ? 1 : Math.max(1, Math.min(4, 4194304 / i));
        if (i <= 0 || i2 <= 0) {
            return 1;
        }
        return Math.min(iMax, Math.max(1, i2 / (((i - 1) / 65536) + 1)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14203(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof EOFException) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14198(C4863 c4863, String str, boolean z) throws IOException {
        C21797 c21797M14205 = c4863.m14205(str, false);
        C13935 c13935 = c21797M14205.f69819;
        String str2 = c21797M14205.f69818;
        if (z ? c13935.m33373(str2) : c13935.m33371(str2)) {
            C21797 c21797M14206 = c4863.m14205(str, false);
            if (z) {
                c21797M14206.f69819.m33370(c21797M14206.f69818, true);
            } else {
                c21797M14206.f69819.m33374(c21797M14206.f69818);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14208(C4863 c4863, String str) throws IOException {
        C21797 c21797M14205 = c4863.m14205(str, false);
        if (c21797M14205.f69819.m33373(c21797M14205.f69818)) {
            return;
        }
        c4863.m14220(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14209(C4863 c4863, String str, long j) throws IOException {
        C21797 c21797M14205 = c4863.m14205(str, false);
        C22984 c22984 = new C22984((TimeUnit.NANOSECONDS.convert(j, TimeUnit.MILLISECONDS) / 100) + 116444736000000000L);
        C13935 c13935 = c21797M14205.f69819;
        String str2 = c21797M14205.f69818;
        C22984 c22985 = C14456.f44298;
        C14456 c14456 = new C14456(c22985, c22985, c22984, c22984, 0L);
        AbstractC3353 abstractC3353M33368 = c13935.m33368(str2, (Set) EnumSet.of(EnumC11696.FILE_WRITE_ATTRIBUTES, EnumC11696.FILE_WRITE_EA), (EnumSet) null, EnumC6737.f20938, EnumC7983.FILE_OPEN, (EnumSet) null);
        try {
            abstractC3353M33368.m10252(c14456);
            abstractC3353M33368.close();
        } catch (Throwable th) {
            try {
                abstractC3353M33368.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7586 m14212(String str, boolean z) throws IOException {
        C21797 c21797M14205 = m14205(str, false);
        return c21797M14205.f69819.m33372(c21797M14205.f69818, EnumSet.of(EnumC11696.GENERIC_WRITE), EnumSet.of(EnumC1757.FILE_ATTRIBUTE_NORMAL), EnumSet.of(EnumC6737.FILE_SHARE_WRITE), z ? EnumC7983.FILE_OVERWRITE_IF : EnumC7983.FILE_OPEN, EnumSet.noneOf(EnumC15037.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7586 m14216(String str) throws IOException {
        C21797 c21797M14205 = m14205(str, false);
        return c21797M14205.f69819.m33372(c21797M14205.f69818, EnumSet.of(EnumC11696.GENERIC_READ), EnumSet.of(EnumC1757.FILE_ATTRIBUTE_NORMAL), f15369, EnumC7983.FILE_OPEN, EnumSet.noneOf(EnumC15037.class));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m14220(String str) throws IOException {
        C21797 c21797M14205 = m14205(str, false);
        c21797M14205.f69819.m33369(c21797M14205.f69818, EnumSet.of(EnumC11696.FILE_LIST_DIRECTORY, EnumC11696.FILE_ADD_SUBDIRECTORY), EnumSet.of(EnumC1757.FILE_ATTRIBUTE_DIRECTORY), EnumC6737.f20938, EnumC7983.FILE_CREATE, EnumSet.of(EnumC15037.FILE_DIRECTORY_FILE)).close();
    }

    @Override // l.InterfaceC2188
    /* JADX INFO: renamed from: ֫ */
    public final void mo7211(String str, boolean z) {
        try {
            try {
                try {
                    C21797 c21797M14205 = m14205(str, false);
                    if (z) {
                        c21797M14205.f69819.m33370(c21797M14205.f69818, true);
                    } else {
                        c21797M14205.f69819.m33374(c21797M14205.f69818);
                    }
                } catch (C1092 e) {
                    throw new IOException(e.getMessage(), e);
                }
            } catch (C10951 e2) {
                if (!m14203((Exception) e2)) {
                    throw m14186(e2);
                }
                IOException iOExceptionM14186 = m14186(e2);
                try {
                    try {
                        try {
                            m14206();
                            m14198(this, str, z);
                        } catch (IOException e3) {
                            throw m14183(iOExceptionM14186, e3);
                        }
                    } catch (C1092 e4) {
                        throw m14183(iOExceptionM14186, new IOException(e4.getMessage(), e4));
                    }
                } catch (C10951 e5) {
                    throw m14183(iOExceptionM14186, m14186(e5));
                }
            }
            m14215();
        } catch (Throwable th) {
            m14215();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C21797 m14205(String str, boolean z) throws IOException {
        String[] strArrM14211 = m14211(str);
        if (!z && strArrM14211[1].isEmpty()) {
            throw new IOException("Operation not supported!");
        }
        return new C21797((C13935) this.f15373.f31521.m36376(strArrM14211[0]), strArrM14211[1]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14196(String str, String str2, String str3) {
        AbstractC3353 abstractC3353M33368 = ((C13935) this.f15373.f31521.m36376(str)).m33368(str2, (Set) EnumSet.of(EnumC11696.DELETE, EnumC11696.GENERIC_WRITE, EnumC11696.GENERIC_READ), (EnumSet) null, (Set) EnumSet.of(EnumC6737.FILE_SHARE_DELETE, EnumC6737.FILE_SHARE_READ, EnumC6737.FILE_SHARE_WRITE), EnumC7983.FILE_OPEN, (EnumSet) null);
        try {
            abstractC3353M33368.m10252(new C9395(str3));
            abstractC3353M33368.close();
        } catch (Throwable th) {
            try {
                abstractC3353M33368.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String[] m14211(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf == -1 ? new String[]{str, ""} : new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + 1).replace('/', '\\')};
    }
}
