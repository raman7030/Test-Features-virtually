package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩶ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20142 extends AbstractC11163 {

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f65213 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17449 f65214;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f65215;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C17714 f65216;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC4619 f65217;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f65218;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22258 f65219;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65220;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f65221;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f65222;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f65223;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C3104 f65224;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f65225;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17651 f65226;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f65227;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri f65228;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65229;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f65230;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f65231;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f65232;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19643 f65233;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C9248 f65234;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f65235;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f65236;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f65237;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f65238;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f65239;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f65240;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC4619 f65241;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20142 m46388(InterfaceC22258 interfaceC22258, InterfaceC21449 interfaceC21449, C8353 c8353, long j, C4951 c4951, C8147 c8147, Uri uri, List list, int i, Object obj, boolean z, C21180 c21180, C20142 c20142, byte[] bArr, byte[] bArr2, boolean z2, boolean z3, C13830 c13830) {
        byte[] bArrM46391;
        InterfaceC21449 c9559;
        C3104 c3104M13278;
        InterfaceC21449 interfaceC214410;
        boolean z4;
        C17449 c17449;
        InterfaceC4619 interfaceC4619;
        C17714 c17714;
        byte[] bArrM46392;
        InterfaceC21449 c95510 = interfaceC21449;
        C22590 c22590 = c8147.f25138;
        C4515 c4515 = new C4515();
        String str = c4951.f31806;
        c4515.m13281(C8542.m22231(str, c22590.f73022));
        c4515.m13286(c22590.f73021);
        c4515.m13280(c22590.f73020);
        boolean z5 = c8147.f25135;
        c4515.m13279(z5 ? 8 : 0);
        C3104 c3104M13279 = c4515.m13278();
        boolean z6 = bArr != null;
        if (z6) {
            String str2 = c22590.f73012;
            str2.getClass();
            bArrM46391 = m46391(str2);
        } else {
            bArrM46391 = null;
        }
        if (bArr != null) {
            bArrM46391.getClass();
            c9559 = new C9559(c95510, bArr, bArrM46391);
        } else {
            c9559 = c95510;
        }
        C21885 c21885 = c22590.f73015;
        if (c21885 != null) {
            boolean z7 = bArr2 != null;
            if (z7) {
                String str3 = c21885.f73012;
                str3.getClass();
                bArrM46392 = m46391(str3);
            } else {
                bArrM46392 = null;
            }
            Uri uriM22231 = C8542.m22231(str, c21885.f73022);
            C4515 c4516 = new C4515();
            c4516.m13281(uriM22231);
            boolean z8 = z7;
            c4516.m13286(c21885.f73021);
            c4516.m13280(c21885.f73020);
            c3104M13278 = c4516.m13278();
            if (bArr2 != null) {
                bArrM46392.getClass();
                c95510 = new C9559(c95510, bArr2, bArrM46392);
            }
            z4 = z8;
            interfaceC214410 = c95510;
        } else {
            c3104M13278 = null;
            interfaceC214410 = null;
            z4 = false;
        }
        long j2 = j + c22590.f73016;
        long j3 = j2 + c22590.f73013;
        int i2 = c4951.f15606 + c22590.f73014;
        if (c20142 != null) {
            C3104 c3104 = c20142.f65224;
            boolean z9 = c3104M13278 == c3104 || (c3104M13278 != null && c3104 != null && c3104M13278.f9711.equals(c3104.f9711) && c3104M13278.f9718 == c3104.f9718);
            boolean z10 = uri.equals(c20142.f65228) && c20142.f65220;
            C17449 c174410 = c20142.f65214;
            C17714 c17715 = c20142.f65216;
            interfaceC4619 = (z9 && z10 && !c20142.f65236 && c20142.f65225 == i2) ? c20142.f65217 : null;
            c17449 = c174410;
            c17714 = c17715;
        } else {
            c17449 = new C17449(null);
            interfaceC4619 = null;
            c17714 = new C17714(10);
        }
        return new C20142(interfaceC22258, c9559, c3104M13279, c8353, z6, interfaceC214410, c3104M13278, z4, uri, list, i, obj, j2, j3, c8147.f25136, c8147.f25137, !z5, i2, c22590.f73017, z, c21180.m48129(i2), c22590.f73019, interfaceC4619, c17449, c17714, z2, z3, c13830);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46390(C20142 c20142, long j, Uri uri, boolean z, C8147 c8147, long j2) {
        if (c20142 == null) {
            return false;
        }
        if (uri.equals(c20142.f65228) && c20142.f65220) {
            return false;
        }
        return !z || j2 + c8147.f25138.f73016 < j;
    }

    public C20142(InterfaceC22258 interfaceC22258, InterfaceC21449 interfaceC21449, C3104 c3104, C8353 c8353, boolean z, InterfaceC21449 interfaceC214410, C3104 c3105, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C9248 c9248, C19643 c19643, InterfaceC4619 interfaceC4619, C17449 c17449, C17714 c17714, boolean z6, boolean z7, C13830 c13830) {
        super(interfaceC21449, c3104, c8353, i, obj, j, j2, j3);
        this.f65218 = z;
        this.f65222 = i2;
        this.f65231 = z3 ? j2 - j : -9223372036854775807L;
        this.f65225 = i3;
        this.f65224 = c3105;
        this.f65215 = interfaceC214410;
        this.f65221 = c3105 != null;
        this.f65232 = z2;
        this.f65228 = uri;
        this.f65240 = z5;
        this.f65234 = c9248;
        this.f65237 = z4;
        this.f65219 = interfaceC22258;
        this.f65230 = list;
        this.f65233 = c19643;
        this.f65241 = interfaceC4619;
        this.f65214 = c17449;
        this.f65216 = c17714;
        this.f65227 = z6;
        this.f65239 = z7;
        this.f65223 = AbstractC14545.of();
        this.f65235 = f65213.getAndIncrement();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46394(C17651 c17651, AbstractC14545 abstractC14545) {
        this.f65226 = c17651;
        this.f65223 = abstractC14545;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46392(int i) {
        C22632.m50634(!this.f65227);
        if (i >= this.f65223.size()) {
            return 0;
        }
        return ((Integer) this.f65223.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m46395() {
        this.f65236 = true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m46396() {
        return this.f65227;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m46398() {
        this.f65227 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46399() {
        return this.f65220;
    }

    @Override // l.InterfaceC23757
    /* JADX INFO: renamed from: ۧ */
    public final void mo6511() {
        this.f65238 = true;
    }

    @Override // l.InterfaceC23757
    /* JADX INFO: renamed from: ֫ */
    public final void mo6509() {
        InterfaceC4619 interfaceC4619;
        this.f65226.getClass();
        if (this.f65217 == null && (interfaceC4619 = this.f65241) != null) {
            InterfaceC1368 interfaceC1368Mo4843 = ((C8853) interfaceC4619).f26952.mo4843();
            if ((interfaceC1368Mo4843 instanceof C15729) || (interfaceC1368Mo4843 instanceof C12825)) {
                this.f65217 = this.f65241;
                this.f65221 = false;
            }
        }
        C3104 c3104 = this.f65224;
        InterfaceC21449 interfaceC21449 = this.f65215;
        if (this.f65221) {
            interfaceC21449.getClass();
            c3104.getClass();
            m46389(interfaceC21449, c3104, this.f65232, false);
            this.f65229 = 0;
            this.f65221 = false;
        }
        if (this.f65238) {
            return;
        }
        if (!this.f65237) {
            m46389(this.f23465, this.f23467, this.f65218, true);
        }
        this.f65220 = !this.f65238;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m46397() {
        return this.f65231 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m46400() {
        long j = this.f65231;
        if (j != -9223372036854775807L) {
            return this.f23470 + j;
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46393(long j) {
        this.f65231 = j;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46389(InterfaceC21449 interfaceC21449, C3104 c3104, boolean z, boolean z2) {
        C3104 c3104M9466;
        boolean z3;
        if (z) {
            z3 = this.f65229 != 0;
            c3104M9466 = c3104;
        } else {
            long j = this.f65229;
            long j2 = c3104.f9713;
            c3104M9466 = c3104.m9466(j, j2 != -1 ? j2 - j : -1L);
            z3 = false;
        }
        try {
            C16184 c16184M46387 = m46387(interfaceC21449, c3104M9466, z2);
            if (z3) {
                c16184M46387.mo22062(this.f65229, false);
            }
            while (!this.f65238 && ((C8853) this.f65217).m22871(c16184M46387)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.f23468.f25608 & 16384) != 0) {
                            ((C8853) this.f65217).f26952.mo4839(0L, 0L);
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.f65229 = (int) (c16184M46387.getPosition() - c3104.f9718);
                    throw th;
                }
            }
            this.f65229 = (int) (c16184M46387.getPosition() - c3104.f9718);
            C8751.m22643(interfaceC21449);
        } catch (Throwable th2) {
            C8751.m22643(interfaceC21449);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16184 m46387(InterfaceC21449 interfaceC21449, C3104 c3104, boolean z) throws IOException {
        C16184 c16184;
        long jM41487;
        C8853 c8853M8004;
        long jMo1620 = interfaceC21449.mo1620(c3104);
        long jM23734 = this.f23470;
        C9248 c9248 = this.f65234;
        if (z) {
            try {
                c9248.m23732(jM23734, this.f65240);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C16184 c16185 = new C16184(interfaceC21449, c3104.f9718, jMo1620);
        if (this.f65217 == null) {
            C17714 c17714 = this.f65216;
            c16185.mo22066();
            try {
                c17714.m41481(10);
                c16185.mo22068(false, 0, 10, c17714.m41482());
                if (c17714.m41491() == 4801587) {
                    c17714.m41478(3);
                    int iM41467 = c17714.m41467();
                    int i = iM41467 + 10;
                    if (i > c17714.m41472()) {
                        byte[] bArrM41482 = c17714.m41482();
                        c17714.m41481(i);
                        System.arraycopy(bArrM41482, 0, c17714.m41482(), 0, 10);
                    }
                    c16185.mo22068(false, 10, iM41467, c17714.m41482());
                    C23896 c23896M40822 = this.f65214.m40822(iM41467, c17714.m41482());
                    if (c23896M40822 != null) {
                        int iM52639 = c23896M40822.m52639();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= iM52639) {
                                jM41487 = -9223372036854775807L;
                                break;
                            }
                            InterfaceC14723 interfaceC14723M52640 = c23896M40822.m52640(i2);
                            if (interfaceC14723M52640 instanceof C9689) {
                                C9689 c9689 = (C9689) interfaceC14723M52640;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(c9689.f29300)) {
                                    System.arraycopy(c9689.f29301, 0, c17714.m41482(), 0, 8);
                                    c17714.m41484(0);
                                    c17714.m41486(8);
                                    jM41487 = c17714.m41487() & 8589934591L;
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else {
                        jM41487 = -9223372036854775807L;
                        break;
                    }
                } else {
                    jM41487 = -9223372036854775807L;
                    break;
                }
            } catch (EOFException unused2) {
            }
            c16185.mo22066();
            InterfaceC4619 interfaceC4619 = this.f65241;
            if (interfaceC4619 != null) {
                c8853M8004 = ((C8853) interfaceC4619).m22870();
                c16184 = c16185;
            } else {
                c16184 = c16185;
                c8853M8004 = ((C2503) this.f65219).m8004(c3104.f9711, this.f23468, this.f65230, this.f65234, interfaceC21449.mo5936(), c16184);
            }
            this.f65217 = c8853M8004;
            InterfaceC1368 interfaceC1368Mo4843 = c8853M8004.f26952.mo4843();
            if ((interfaceC1368Mo4843 instanceof C23345) || (interfaceC1368Mo4843 instanceof C16289) || (interfaceC1368Mo4843 instanceof C16995) || (interfaceC1368Mo4843 instanceof C17058)) {
                C17651 c17651 = this.f65226;
                if (jM41487 != -9223372036854775807L) {
                    jM23734 = c9248.m23734(jM41487);
                }
                c17651.m41375(jM23734);
            } else {
                this.f65226.m41375(0L);
            }
            this.f65226.m41367();
            ((C8853) this.f65217).f26952.mo4840(this.f65226);
        } else {
            c16184 = c16185;
        }
        this.f65226.m41362(this.f65233);
        return c16184;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m46391(String str) {
        if (C15107.m35799(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }
}
