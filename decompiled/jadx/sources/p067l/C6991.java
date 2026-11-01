package p067l;

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
public final class C6991 implements InterfaceC4448, InterfaceC18509 {

    /* JADX INFO: renamed from: ۬ */
    public static final Set f18200 = C21562.unmodifiableSet(EnumSet.of(EnumC8771.FILE_SHARE_READ, EnumC8771.FILE_SHARE_WRITE, EnumC8771.FILE_SHARE_DELETE));

    /* JADX INFO: renamed from: ۗ */
    public final C13836 f18201;

    /* JADX INFO: renamed from: ᩶ */
    public final C22554 f18203;

    /* JADX INFO: renamed from: ᩸ */
    public C12356 f18204;

    /* JADX INFO: renamed from: ۙ */
    public boolean f18202 = false;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f18205 = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public synchronized void m16076() {
        if (!this.f18202 && !this.f18205) {
            this.f18205 = true;
            C12356 c12356 = this.f18204;
            C21213 c21213 = this.f18203.f71139;
            C13836 c13836 = c21213.f66698;
            C3777.m7378(c12356);
            boolean zM28445 = c12356.m28445();
            int i = C14506.f41405;
            if (zM28445) {
                c21213.f66696 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public synchronized void m16087() {
        try {
            C22554 c22554 = this.f18203;
            this.f18204 = c22554.f71138.m33152(c22554.f71139, c22554.f71140);
            this.f18202 = false;
            this.f18205 = false;
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public synchronized void m16096() {
        if (!this.f18202 && !this.f18205) {
            this.f18202 = true;
            this.f18203.m50543(this.f18204);
        }
    }

    public C6991(C13836 c13836, C12356 c12356, C22554 c22554) {
        this.f18201 = c13836;
        this.f18203 = c22554;
        this.f18204 = c12356;
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final List mo9288(final String str) {
        try {
            return (List) m16071(new InterfaceC23755() { // from class: l.᩶ᩴ᩻
                @Override // p067l.InterfaceC23755
                public final Object call() {
                    return C6991.m16072(this.f68415, str);
                }
            });
        } finally {
            m16096();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m16072(C6991 c6991, String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (str.equals("/")) {
            for (C14629 c14629 : new C5242(EnumC4453.f9988.m9327(c6991.f18204.f34483)).m11314(c6991.f18201.f39094)) {
                int iM33428 = c14629.m33428() & Mod.M30;
                if (iM33428 == 0 || iM33428 == 33554432 || iM33428 == 67108864 || iM33428 == 134217728) {
                    if (!c14629.m33426().endsWith("$")) {
                        arrayList.add(new C5650(c14629));
                    }
                }
            }
        } else {
            C23085 c23085M16086 = c6991.m16086(str, true);
            for (C4709 c4709 : c23085M16086.f72527.m35494(c23085M16086.f72526)) {
                String strM49952 = c4709.m49952();
                if (!strM49952.equals(".") && !strM49952.equals("..")) {
                    arrayList.add(new C5650(c4709));
                }
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ܽ */
    public final void mo9293(final long j, final String str) {
        try {
            m16071(new InterfaceC23755() { // from class: l.ۛᩴ᩻
                @Override // p067l.InterfaceC23755
                public final Object call() throws IOException {
                    C6991.m16090(this.f22209, str, j);
                    return null;
                }
            });
        } finally {
            m16096();
        }
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final void mo9289(String str, String str2) {
        String[] strArrM16092 = m16092(str);
        String[] strArrM16093 = m16092(str2);
        try {
            if (!strArrM16092[0].equals(strArrM16093[0])) {
                throw new IOException("Cannot rename between different shares");
            }
            if (!strArrM16092[1].equals(strArrM16093[1])) {
                try {
                    m16077(strArrM16092[0], strArrM16092[1], strArrM16093[1]);
                } catch (C3406 e) {
                    throw new IOException(e.getMessage(), e);
                } catch (C12776 e2) {
                    if (!m16084((Exception) e2)) {
                        throw m16067(e2);
                    }
                    IOException iOExceptionM16067 = m16067(e2);
                    try {
                        try {
                            m16087();
                            m16082(this, strArrM16092, strArrM16093);
                        } catch (C3406 e3) {
                            throw m16064(iOExceptionM16067, new IOException(e3.getMessage(), e3));
                        }
                    } catch (IOException e4) {
                        throw m16064(iOExceptionM16067, e4);
                    } catch (C12776 e5) {
                        throw m16064(iOExceptionM16067, m16067(e5));
                    }
                }
                m16096();
                return;
            }
            m16096();
        } catch (Throwable th) {
            m16096();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16082(C6991 c6991, String[] strArr, String[] strArr2) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr2[1];
        C15612 c15612 = (C15612) c6991.f18204.f34483.m38534(str);
        if (c15612.m35490(str2) || c15612.m35492(str2) || !(c15612.m35490(str3) || c15612.m35492(str3))) {
            c6991.m16077(strArr[0], strArr[1], strArr2[1]);
        }
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ܽ */
    public final void mo9294(String str) {
        try {
            try {
                m16101(str);
            } catch (C3406 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C12776 e2) {
                if (!m16084((Exception) e2)) {
                    throw m16067(e2);
                }
                IOException iOExceptionM16067 = m16067(e2);
                try {
                    try {
                        try {
                            m16087();
                            m16089(this, str);
                        } catch (C3406 e3) {
                            throw m16064(iOExceptionM16067, new IOException(e3.getMessage(), e3));
                        }
                    } catch (C12776 e4) {
                        throw m16064(iOExceptionM16067, m16067(e4));
                    }
                } catch (IOException e5) {
                    throw m16064(iOExceptionM16067, e5);
                }
            }
            m16096();
        } catch (Throwable th) {
            m16096();
            throw th;
        }
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3678 mo9292(final String str) throws IOException {
        try {
            return new C2967(new C16378(this, (C9578) m16071(new InterfaceC23755() { // from class: l.ۤᩴ᩻
                @Override // p067l.InterfaceC23755
                public final Object call() {
                    return this.f34422.m16097(str);
                }
            })), new C4309(this), new C5630(this, str), new C15687(this));
        } catch (IOException e) {
            try {
                m16096();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo9291(long j, String str) {
        return m16068(str, j, -1L, new C23735(), false);
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9286(String str, long j, long j2) {
        final long j3 = C14849.FOREVER_NS;
        if (j2 >= 0 && C14849.FOREVER_NS - j >= j2) {
            j3 = j + j2;
        }
        return m16068(str, j, j2, new LongSupplier() { // from class: l.۬ᩴ᩻
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return j3;
            }
        }, true);
    }

    @Override // p067l.InterfaceC18509
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo16103(String str, long j, long j2, C11805 c11805) {
        return m16068(str, j, j2, c11805, true);
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo9287(long j, final String str) throws IOException {
        try {
            C22415 c22415 = new C22415((C9578) m16071(new InterfaceC23755() { // from class: l.ۨᩴ᩻
                @Override // p067l.InterfaceC23755
                public final Object call() {
                    return this.f38543.m16093(str, true);
                }
            }));
            int iM22317 = c22415.f70699.m22317();
            return new C9003(iM22317, m16063(iM22317, this.f18204.f34481.m54567()), new C19061(this, c22415, str, iM22317), new C24405(this, c22415), new C15687(this), new C9653(this), new C21545());
        } catch (IOException e) {
            try {
                m16096();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16081(C6991 c6991, C22415 c22415) throws IOException {
        IOException iOExceptionM16066 = c6991.m16066(c22415.f70699, (IOException) null);
        if (iOExceptionM16066 != null) {
            throw iOExceptionM16066;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private IOException m16067(C12776 c12776) {
        m16076();
        return new IOException(c12776.getMessage(), c12776);
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m16071(InterfaceC23755 interfaceC23755) throws IOException {
        try {
            return interfaceC23755.call();
        } catch (C3406 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C12776 e2) {
            if (!m16084((Exception) e2)) {
                throw m16067(e2);
            }
            IOException iOExceptionM16067 = m16067(e2);
            try {
                m16087();
                return interfaceC23755.call();
            } catch (IOException e3) {
                throw m16064(iOExceptionM16067, e3);
            } catch (C3406 e4) {
                throw m16064(iOExceptionM16067, new IOException(e4.getMessage(), e4));
            } catch (C12776 e5) {
                throw m16064(iOExceptionM16067, m16067(e5));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m16070(C6991 c6991, C12776 c12776, InterfaceC17719 interfaceC17719) throws IOException {
        if (!m16084((Exception) c12776)) {
            throw c6991.m16067(c12776);
        }
        IOException iOExceptionM16067 = c6991.m16067(c12776);
        try {
            c6991.m16087();
            return interfaceC17719.get();
        } catch (IOException e) {
            throw m16064(iOExceptionM16067, e);
        } catch (C3406 e2) {
            throw m16064(iOExceptionM16067, new IOException(e2.getMessage(), e2));
        } catch (C12776 e3) {
            throw m16064(iOExceptionM16067, c6991.m16067(e3));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m16069(C6991 c6991, IOException iOException, C7662 c7662) throws IOException {
        if (!m16084((Exception) iOException)) {
            c6991.m16076();
            throw iOException;
        }
        c6991.m16076();
        try {
            c6991.m16087();
            return c7662.get();
        } catch (IOException e) {
            c6991.m16076();
            throw m16064(iOException, e);
        } catch (C3406 e2) {
            throw m16064(iOException, new IOException(e2.getMessage(), e2));
        } catch (C12776 e3) {
            throw m16064(iOException, c6991.m16067(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public IOException m16066(C9578 c9578, IOException iOException) {
        if (c9578 == null) {
            return iOException;
        }
        try {
            c9578.close();
            return iOException;
        } catch (C3406 e) {
            return m16064(iOException, new IOException(e.getMessage(), e));
        } catch (C12776 e2) {
            return m16064(iOException, m16067(e2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static IOException m16064(IOException iOException, IOException iOException2) {
        if (iOException == null) {
            return iOException2;
        }
        if (iOException == iOException2) {
            return iOException;
        }
        iOException.addSuppressed(iOException2);
        return iOException;
    }

    /* JADX INFO: renamed from: ֫ */
    private InputStream m16068(final String str, long j, long j2, LongSupplier longSupplier, boolean z) throws IOException {
        try {
            C17048 c17048M16075 = m16075((C9578) m16071(new InterfaceC23755() { // from class: l.ۙᩴ᩻
                @Override // p067l.InterfaceC23755
                public final Object call() {
                    return this.f18130.m16097(str);
                }
            }), j, j2, z);
            if (z) {
                return new C3638(c17048M16075, j, longSupplier, new C4309(this), new InterfaceC11686() { // from class: l.ۧ᩵᩻
                    @Override // p067l.InterfaceC11686
                    /* JADX INFO: renamed from: ֫ */
                    public final Object mo26856(IOException iOException, C7662 c7662) {
                        return C6991.m16069(this.f36646, iOException, c7662);
                    }
                }, new InterfaceC4980() { // from class: l.ܽ᩵᩻
                    @Override // p067l.InterfaceC4980
                    /* JADX INFO: renamed from: ֫ */
                    public final Object mo10539(long j3, long j4) {
                        return C6991.m16074(this.f54914, str, j3, j4);
                    }
                }, new C15687(this), new C9653(this), true);
            }
            return new C3638(c17048M16075, j, new C23735(), new C4309(this), new InterfaceC11686() { // from class: l.ۧ᩵᩻
                @Override // p067l.InterfaceC11686
                /* JADX INFO: renamed from: ֫ */
                public final Object mo26856(IOException iOException, C7662 c7662) {
                    return C6991.m16069(this.f36646, iOException, c7662);
                }
            }, new InterfaceC4980() { // from class: l.ᩳ᩵᩻
                @Override // p067l.InterfaceC4980
                /* JADX INFO: renamed from: ֫ */
                public final Object mo10539(long j3, long j4) {
                    return C6991.m16073(this.f60024, str, j3);
                }
            }, new C15687(this), new C15687(this), false);
        } catch (IOException e) {
            try {
                m16096();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17048 m16073(C6991 c6991, String str, long j) throws IOException {
        try {
            return c6991.m16075(c6991.m16097(str), j, -1L, false);
        } catch (C3406 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17048 m16074(C6991 c6991, String str, long j, long j2) throws IOException {
        try {
            return c6991.m16075(c6991.m16097(str), j, j2, true);
        } catch (C3406 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C17048 m16075(C9578 c9578, long j, long j2, boolean z) {
        InputStream inputStreamM22318;
        int iM22316 = c9578.m22316();
        int iMax = (!z || iM22316 <= 0) ? 1 : Math.max(1, Math.min(4, 1048576 / iM22316));
        if (z) {
            inputStreamM22318 = c9578.m22314(j, iMax, j2);
        } else {
            inputStreamM22318 = c9578.m22318(j);
        }
        return new C17048(inputStreamM22318, new C14347(this, c9578, inputStreamM22318));
    }

    /* JADX INFO: renamed from: ܳ */
    public static C16378 m16091(C6991 c6991, String str) throws IOException {
        try {
            return new C16378(c6991, c6991.m16097(str));
        } catch (C3406 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16080(C6991 c6991, C9578 c9578, InputStream inputStream) throws IOException {
        try {
            inputStream.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        IOException iOExceptionM16066 = c6991.m16066(c9578, e);
        if (iOExceptionM16066 != null) {
            throw iOExceptionM16066;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16063(int i, int i2) {
        int iMax = i <= 0 ? 1 : Math.max(1, Math.min(4, 4194304 / i));
        if (i <= 0 || i2 <= 0) {
            return 1;
        }
        return Math.min(iMax, Math.max(1, i2 / (((i - 1) / 65536) + 1)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16084(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof EOFException) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16079(C6991 c6991, String str, boolean z) throws IOException {
        C23085 c23085M16086 = c6991.m16086(str, false);
        C15612 c15612 = c23085M16086.f72527;
        String str2 = c23085M16086.f72526;
        if (z ? c15612.m35492(str2) : c15612.m35490(str2)) {
            C23085 c23085M16087 = c6991.m16086(str, false);
            if (z) {
                c23085M16087.f72527.m35489(c23085M16087.f72526, true);
            } else {
                c23085M16087.f72527.m35493(c23085M16087.f72526);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m16089(C6991 c6991, String str) throws IOException {
        C23085 c23085M16086 = c6991.m16086(str, false);
        if (c23085M16086.f72527.m35492(c23085M16086.f72526)) {
            return;
        }
        c6991.m16101(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m16090(C6991 c6991, String str, long j) throws IOException {
        C23085 c23085M16086 = c6991.m16086(str, false);
        C24212 c24212 = new C24212((TimeUnit.NANOSECONDS.convert(j, TimeUnit.MILLISECONDS) / 100) + 116444736000000000L);
        C15612 c15612 = c23085M16086.f72527;
        String str2 = c23085M16086.f72526;
        C24212 c24213 = C16107.f47392;
        C16107 c16107 = new C16107(c24213, c24213, c24212, c24212, 0L);
        AbstractC5555 abstractC5555M35487 = c15612.m35487(str2, (Set) EnumSet.of(EnumC13484.FILE_WRITE_ATTRIBUTES, EnumC13484.FILE_WRITE_EA), (EnumSet) null, EnumC8771.f23812, EnumC9955.FILE_OPEN, (EnumSet) null);
        try {
            abstractC5555M35487.m12288(c16107);
            abstractC5555M35487.close();
        } catch (Throwable th) {
            try {
                abstractC5555M35487.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public C9578 m16093(String str, boolean z) throws IOException {
        C23085 c23085M16086 = m16086(str, false);
        return c23085M16086.f72527.m35491(c23085M16086.f72526, EnumSet.of(EnumC13484.GENERIC_WRITE), EnumSet.of(EnumC4038.FILE_ATTRIBUTE_NORMAL), EnumSet.of(EnumC8771.FILE_SHARE_WRITE), z ? EnumC9955.FILE_OVERWRITE_IF : EnumC9955.FILE_OPEN, EnumSet.noneOf(EnumC16659.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public C9578 m16097(String str) throws IOException {
        C23085 c23085M16086 = m16086(str, false);
        return c23085M16086.f72527.m35491(c23085M16086.f72526, EnumSet.of(EnumC13484.GENERIC_READ), EnumSet.of(EnumC4038.FILE_ATTRIBUTE_NORMAL), f18200, EnumC9955.FILE_OPEN, EnumSet.noneOf(EnumC16659.class));
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m16101(String str) throws IOException {
        C23085 c23085M16086 = m16086(str, false);
        c23085M16086.f72527.m35488(c23085M16086.f72526, EnumSet.of(EnumC13484.FILE_LIST_DIRECTORY, EnumC13484.FILE_ADD_SUBDIRECTORY), EnumSet.of(EnumC4038.FILE_ATTRIBUTE_DIRECTORY), EnumC8771.f23812, EnumC9955.FILE_CREATE, EnumSet.of(EnumC16659.FILE_DIRECTORY_FILE)).close();
    }

    @Override // p067l.InterfaceC4448
    /* JADX INFO: renamed from: ֫ */
    public final void mo9290(String str, boolean z) {
        try {
            try {
                try {
                    C23085 c23085M16086 = m16086(str, false);
                    if (z) {
                        c23085M16086.f72527.m35489(c23085M16086.f72526, true);
                    } else {
                        c23085M16086.f72527.m35493(c23085M16086.f72526);
                    }
                } catch (C3406 e) {
                    throw new IOException(e.getMessage(), e);
                }
            } catch (C12776 e2) {
                if (!m16084((Exception) e2)) {
                    throw m16067(e2);
                }
                IOException iOExceptionM16067 = m16067(e2);
                try {
                    try {
                        try {
                            m16087();
                            m16079(this, str, z);
                        } catch (IOException e3) {
                            throw m16064(iOExceptionM16067, e3);
                        }
                    } catch (C3406 e4) {
                        throw m16064(iOExceptionM16067, new IOException(e4.getMessage(), e4));
                    }
                } catch (C12776 e5) {
                    throw m16064(iOExceptionM16067, m16067(e5));
                }
            }
            m16096();
        } catch (Throwable th) {
            m16096();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C23085 m16086(String str, boolean z) throws IOException {
        String[] strArrM16092 = m16092(str);
        if (!z && strArrM16092[1].isEmpty()) {
            throw new IOException("Operation not supported!");
        }
        return new C23085((C15612) this.f18204.f34483.m38534(strArrM16092[0]), strArrM16092[1]);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16077(String str, String str2, String str3) {
        AbstractC5555 abstractC5555M35487 = ((C15612) this.f18204.f34483.m38534(str)).m35487(str2, (Set) EnumSet.of(EnumC13484.DELETE, EnumC13484.GENERIC_WRITE, EnumC13484.GENERIC_READ), (EnumSet) null, (Set) EnumSet.of(EnumC8771.FILE_SHARE_DELETE, EnumC8771.FILE_SHARE_READ, EnumC8771.FILE_SHARE_WRITE), EnumC9955.FILE_OPEN, (EnumSet) null);
        try {
            abstractC5555M35487.m12288(new C11297(str3));
            abstractC5555M35487.close();
        } catch (Throwable th) {
            try {
                abstractC5555M35487.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static String[] m16092(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf == -1 ? new String[]{str, ""} : new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + 1).replace('/', '\\')};
    }
}
