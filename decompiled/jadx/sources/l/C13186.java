package l;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13186 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f39423;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f39424;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Uri f39425;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f39426;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f39427;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3104 f39428;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f39429;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f39430;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C3104 f39431;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f39432;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f39433 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f39434;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23064 f39435;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39436;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11776 f39437;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21654 f39438;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f39439;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f39440;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f39441;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19538 f39442;

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        interfaceC0486.getClass();
        this.f39434.mo5937(interfaceC0486);
        this.f39430.mo5937(interfaceC0486);
    }

    public C13186(InterfaceC21654 interfaceC21654, InterfaceC21449 interfaceC21449, InterfaceC21449 interfaceC214410, C4720 c4720, InterfaceC11776 interfaceC11776, int i, boolean z) {
        this.f39438 = interfaceC21654;
        this.f39434 = interfaceC214410;
        this.f39437 = interfaceC11776;
        this.f39439 = (i & 2) != 0;
        this.f39427 = false;
        this.f39440 = z;
        if (interfaceC21449 != null) {
            this.f39430 = interfaceC21449;
            this.f39442 = c4720 != null ? new C19538(interfaceC21449, c4720) : null;
        } else {
            this.f39430 = C16008.f49387;
            this.f39442 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21654 m32012() {
        return this.f39438;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC11776 m32013() {
        return this.f39437;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        try {
            String strMo12554 = this.f39437.mo12554(c3104);
            C4515 c4515M9467 = c3104.m9467();
            long j = c3104.f9718;
            long j2 = c3104.f9713;
            c4515M9467.m13282(strMo12554);
            C3104 c3104M13278 = c4515M9467.m13278();
            Uri uri = c3104M13278.f9711;
            this.f39428 = c3104M13278;
            boolean z = this.f39440;
            InterfaceC21654 interfaceC21654 = this.f39438;
            if (z) {
                String strM18997 = interfaceC21654.mo38139(strMo12554).m18997("exo_redir");
                Uri uri2 = strM18997 == null ? null : Uri.parse(strM18997);
                if (uri2 != null) {
                    uri = uri2;
                }
            }
            this.f39425 = uri;
            this.f39423 = j;
            boolean z2 = (this.f39439 && this.f39424) || (this.f39427 && j2 == -1);
            this.f39426 = z2;
            if (z2) {
                this.f39436 = -1L;
            } else {
                long jM32306 = C13325.m32306(interfaceC21654.mo38139(strMo12554));
                this.f39436 = jM32306;
                if (jM32306 != -1) {
                    long j3 = jM32306 - j;
                    this.f39436 = j3;
                    if (j3 < 0) {
                        throw new C22154(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.f39436;
                this.f39436 = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.f39436;
            if (j5 > 0 || j5 == -1) {
                m32010(c3104M13278, false);
            }
            return j2 != -1 ? j2 : this.f39436;
        } catch (Throwable th) {
            if (this.f39441 == this.f39434 || (th instanceof C8248)) {
                this.f39424 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:9:0x001f, B:11:0x0027, B:12:0x002a, B:14:0x003b, B:16:0x004c, B:18:0x0050, B:23:0x0059, B:25:0x005f, B:27:0x0065, B:31:0x0072, B:33:0x0082, B:39:0x0090), top: B:48:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        InterfaceC21449 interfaceC21449 = this.f39434;
        if (i2 == 0) {
            return 0;
        }
        if (this.f39436 == 0) {
            return -1;
        }
        C3104 c3104 = this.f39428;
        c3104.getClass();
        C3104 c3105 = this.f39431;
        c3105.getClass();
        try {
            if (this.f39423 >= this.f39429) {
                m32010(c3104, true);
            }
            InterfaceC21449 interfaceC214410 = this.f39441;
            interfaceC214410.getClass();
            int i3 = interfaceC214410.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = i3;
                this.f39423 += j2;
                this.f39432 += j2;
                long j3 = this.f39436;
                if (j3 != -1) {
                    this.f39436 = j3 - j2;
                    return i3;
                }
            } else {
                InterfaceC21449 interfaceC214411 = this.f39441;
                if (!(interfaceC214411 == interfaceC21449)) {
                    long j4 = c3105.f9713;
                    if (j4 == -1 || this.f39432 < j4) {
                        String str = c3104.f9715;
                        String str2 = C3603.f11424;
                        this.f39436 = 0L;
                        if (interfaceC214411 == this.f39442) {
                            C23959 c23959 = new C23959();
                            C23959.m52785(c23959, this.f39423);
                            this.f39438.mo38142(str, c23959);
                            return i3;
                        }
                    } else {
                        j = this.f39436;
                        if (j <= 0) {
                            if (j == -1) {
                            }
                        }
                        m32011();
                        m32010(c3104, false);
                        return read(bArr, i, i2);
                    }
                } else {
                    j = this.f39436;
                    if (j <= 0) {
                        if (j == -1) {
                        }
                    }
                    m32011();
                    m32010(c3104, false);
                    return read(bArr, i, i2);
                }
            }
            return i3;
        } catch (Throwable th) {
            if (this.f39441 == interfaceC21449 || (th instanceof C8248)) {
                this.f39424 = true;
            }
            throw th;
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f39425;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f39428 = null;
        this.f39425 = null;
        this.f39423 = 0L;
        try {
            m32011();
        } catch (Throwable th) {
            if (this.f39441 == this.f39434 || (th instanceof C8248)) {
                this.f39424 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32010(C3104 c3104, boolean z) throws InterruptedIOException {
        C23064 c23064Mo38151;
        InterfaceC21449 interfaceC21449;
        InterfaceC21449 interfaceC214410;
        long j;
        C3104 c3104M13278;
        InterfaceC21449 interfaceC214411;
        long j2;
        long jMo1620;
        C23959 c23959;
        Uri uriMo1621;
        Uri uri;
        boolean z2;
        String str = c3104.f9715;
        String str2 = C3603.f11424;
        boolean z3 = this.f39426;
        InterfaceC21654 interfaceC21654 = this.f39438;
        if (z3) {
            c23064Mo38151 = null;
        } else if (this.f39433) {
            try {
                c23064Mo38151 = interfaceC21654.mo38151(str, this.f39423, this.f39436);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c23064Mo38151 = interfaceC21654.mo38149(str, this.f39423, this.f39436);
        }
        C19538 c19538 = this.f39442;
        InterfaceC21449 interfaceC214412 = this.f39434;
        InterfaceC21449 interfaceC214413 = this.f39430;
        if (c23064Mo38151 != null) {
            long jMin = c23064Mo38151.f74188;
            if (c23064Mo38151.f74193) {
                Uri uriFromFile = Uri.fromFile(c23064Mo38151.f74192);
                long j3 = c23064Mo38151.f74190;
                long j4 = this.f39423 - j3;
                long jMin2 = jMin - j4;
                interfaceC21449 = interfaceC214412;
                interfaceC214410 = interfaceC214413;
                long j5 = this.f39436;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
                C4515 c4515M9467 = c3104.m9467();
                c4515M9467.m13281(uriFromFile);
                c4515M9467.m13288(j3);
                c4515M9467.m13286(j4);
                c4515M9467.m13280(jMin2);
                c3104M13278 = c4515M9467.m13278();
                j = -1;
                interfaceC214413 = interfaceC21449;
            } else {
                interfaceC21449 = interfaceC214412;
                interfaceC214410 = interfaceC214413;
                j = -1;
                if (jMin == -1) {
                    jMin = this.f39436;
                } else {
                    long j6 = this.f39436;
                    if (j6 != -1) {
                        jMin = Math.min(jMin, j6);
                    }
                }
                C4515 c4515M9468 = c3104.m9467();
                c4515M9468.m13286(this.f39423);
                c4515M9468.m13280(jMin);
                c3104M13278 = c4515M9468.m13278();
                if (c19538 != null) {
                    interfaceC214413 = c19538;
                } else {
                    interfaceC21654.mo38143(c23064Mo38151);
                    c23064Mo38151 = null;
                    interfaceC214413 = interfaceC214410;
                }
            }
        } else {
            C4515 c4515M9469 = c3104.m9467();
            c4515M9469.m13286(this.f39423);
            c4515M9469.m13280(this.f39436);
            c3104M13278 = c4515M9469.m13278();
            j = -1;
            interfaceC21449 = interfaceC214412;
            interfaceC214410 = interfaceC214413;
        }
        if (!this.f39426) {
            interfaceC214411 = interfaceC214410;
            if (interfaceC214413 == interfaceC214411) {
                j2 = this.f39423 + 102400;
            }
            this.f39429 = j2;
            if (z) {
                if (this.f39441 == interfaceC214411) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C22632.m50634(z2);
                if (interfaceC214413 == interfaceC214411) {
                    return;
                }
                try {
                    m32011();
                } catch (Throwable th) {
                    if (!c23064Mo38151.f74193) {
                        interfaceC21654.mo38143(c23064Mo38151);
                        throw th;
                    }
                    throw th;
                }
            }
            if (c23064Mo38151 != null && !c23064Mo38151.f74193) {
                this.f39435 = c23064Mo38151;
            }
            this.f39441 = interfaceC214413;
            this.f39431 = c3104M13278;
            this.f39432 = 0L;
            jMo1620 = interfaceC214413.mo1620(c3104M13278);
            c23959 = new C23959();
            if (c3104M13278.f9713 == j && jMo1620 != j) {
                this.f39436 = jMo1620;
                C23959.m52785(c23959, this.f39423 + jMo1620);
            }
            if (!(this.f39441 == interfaceC21449)) {
                uriMo1621 = interfaceC214413.mo1621();
                this.f39425 = uriMo1621;
                if (this.f39440) {
                    if (c3104.f9711.equals(uriMo1621)) {
                        uri = null;
                    } else {
                        uri = this.f39425;
                    }
                    C23959.m52786(c23959, uri);
                }
            }
            if (this.f39441 == c19538) {
                interfaceC21654.mo38142(str, c23959);
            }
        }
        interfaceC214411 = interfaceC214410;
        j2 = C13132.FOREVER_NS;
        this.f39429 = j2;
        if (z) {
            if (this.f39441 == interfaceC214411) {
                z2 = true;
            } else {
                z2 = false;
            }
            C22632.m50634(z2);
            if (interfaceC214413 == interfaceC214411) {
                return;
            } else {
                m32011();
            }
        }
        if (c23064Mo38151 != null) {
            this.f39435 = c23064Mo38151;
        }
        this.f39441 = interfaceC214413;
        this.f39431 = c3104M13278;
        this.f39432 = 0L;
        jMo1620 = interfaceC214413.mo1620(c3104M13278);
        c23959 = new C23959();
        if (c3104M13278.f9713 == j) {
            this.f39436 = jMo1620;
            C23959.m52785(c23959, this.f39423 + jMo1620);
        }
        if (!(this.f39441 == interfaceC21449)) {
            uriMo1621 = interfaceC214413.mo1621();
            this.f39425 = uriMo1621;
            if (this.f39440) {
                if (c3104.f9711.equals(uriMo1621)) {
                    uri = this.f39425;
                } else {
                    uri = null;
                }
                C23959.m52786(c23959, uri);
            }
        }
        if (this.f39441 == c19538) {
            interfaceC21654.mo38142(str, c23959);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        if (!(this.f39441 == this.f39434)) {
            return this.f39430.mo5936();
        }
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m32011() {
        InterfaceC21654 interfaceC21654 = this.f39438;
        InterfaceC21449 interfaceC21449 = this.f39441;
        if (interfaceC21449 == null) {
            return;
        }
        try {
            interfaceC21449.close();
        } finally {
            this.f39431 = null;
            this.f39441 = null;
            C23064 c23064 = this.f39435;
            if (c23064 != null) {
                interfaceC21654.mo38143(c23064);
                this.f39435 = null;
            }
        }
    }
}
