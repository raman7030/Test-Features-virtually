package l;

import java.util.Collections;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩶֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8LE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19819 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f64029;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f64030;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f64031;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f64032;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C16302 f64033;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f64034;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f64035;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f64036;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f64037;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f64038;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f64039;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f64040;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f64041;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f64042;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f64043;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8353 f64044;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f64045;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17714 f64046;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f64047;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f64048;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f64049;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f64050;

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    public C19819(String str, int i) {
        this.f64035 = str;
        this.f64032 = i;
        C17714 c17714 = new C17714(1024);
        this.f64046 = c17714;
        byte[] bArrM41482 = c17714.m41482();
        this.f64033 = new C16302(bArrM41482, bArrM41482.length);
        this.f64049 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f64036 = 0;
        this.f64049 = -9223372036854775807L;
        this.f64041 = false;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f64042 = interfaceC21830.mo3429(c19259.m44445(), 1);
        this.f64040 = c19259.m44444();
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f64049 = j;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) throws C9080 {
        int iM38343;
        boolean zM38352;
        C22632.m50632(this.f64042);
        while (c17714.m41457() > 0) {
            int i = this.f64036;
            if (i != 0) {
                if (i != 1) {
                    C17714 c17715 = this.f64046;
                    C16302 c16302 = this.f64033;
                    if (i == 2) {
                        int iM41456 = ((this.f64030 & (-225)) << 8) | c17714.m41456();
                        this.f64034 = iM41456;
                        if (iM41456 > c17715.m41482().length) {
                            c17715.m41481(this.f64034);
                            byte[] bArrM41482 = c17715.m41482();
                            c16302.getClass();
                            c16302.m38350(bArrM41482.length, bArrM41482);
                        }
                        this.f64039 = 0;
                        this.f64036 = 3;
                    } else if (i == 3) {
                        int iMin = Math.min(c17714.m41457(), this.f64034 - this.f64039);
                        c17714.m41461(this.f64039, iMin, c16302.f50146);
                        int i2 = this.f64039 + iMin;
                        this.f64039 = i2;
                        if (i2 == this.f64034) {
                            c16302.m38354(0);
                            if (!c16302.m38352()) {
                                this.f64041 = true;
                                int iM38344 = c16302.m38343(1);
                                int iM38345 = iM38344 == 1 ? c16302.m38343(1) : 0;
                                this.f64031 = iM38345;
                                if (iM38345 == 0) {
                                    if (iM38344 == 1) {
                                        c16302.m38343((c16302.m38343(2) + 1) * 8);
                                    }
                                    if (!c16302.m38352()) {
                                        throw C9080.m23440((String) null, (Throwable) null);
                                    }
                                    this.f64048 = c16302.m38343(6);
                                    int iM38346 = c16302.m38343(4);
                                    int iM38347 = c16302.m38343(3);
                                    if (iM38346 != 0 || iM38347 != 0) {
                                        throw C9080.m23440((String) null, (Throwable) null);
                                    }
                                    if (iM38344 == 0) {
                                        int iM38353 = c16302.m38353();
                                        int iM38339 = c16302.m38339();
                                        C12948 c12948M29741 = C12243.m29741(c16302, true);
                                        this.f64045 = c12948M29741.f38845;
                                        this.f64029 = c12948M29741.f38846;
                                        this.f64043 = c12948M29741.f38844;
                                        int iM383310 = iM38339 - c16302.m38339();
                                        c16302.m38354(iM38353);
                                        byte[] bArr = new byte[(iM383310 + 7) / 8];
                                        c16302.m38341(iM383310, bArr);
                                        C1297 c1297 = new C1297();
                                        c1297.m4469(this.f64040);
                                        c1297.m4462("video/mp2t");
                                        c1297.m4465("audio/mp4a-latm");
                                        c1297.m4445(this.f64045);
                                        c1297.m4472(this.f64043);
                                        c1297.m4456(this.f64029);
                                        c1297.m4446(Collections.singletonList(bArr));
                                        c1297.m4471(this.f64035);
                                        c1297.m4454(this.f64032);
                                        C8353 c8353M4440 = c1297.m4440();
                                        if (!c8353M4440.equals(this.f64044)) {
                                            this.f64044 = c8353M4440;
                                            this.f64047 = 1024000000 / ((long) c8353M4440.f25624);
                                            this.f64042.mo8456(c8353M4440);
                                        }
                                    } else {
                                        int iM38348 = c16302.m38343((c16302.m38343(2) + 1) * 8);
                                        int iM383311 = c16302.m38339();
                                        C12948 c12948M29742 = C12243.m29741(c16302, true);
                                        this.f64045 = c12948M29742.f38845;
                                        this.f64029 = c12948M29742.f38846;
                                        this.f64043 = c12948M29742.f38844;
                                        c16302.m38351(iM38348 - (iM383311 - c16302.m38339()));
                                    }
                                    int iM38349 = c16302.m38343(3);
                                    this.f64050 = iM38349;
                                    if (iM38349 == 0) {
                                        c16302.m38351(8);
                                    } else if (iM38349 == 1) {
                                        c16302.m38351(9);
                                    } else if (iM38349 == 3 || iM38349 == 4 || iM38349 == 5) {
                                        c16302.m38351(6);
                                    } else if (iM38349 == 6 || iM38349 == 7) {
                                        c16302.m38351(1);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                    boolean zM38353 = c16302.m38352();
                                    this.f64037 = zM38353;
                                    this.f64038 = 0L;
                                    if (zM38353) {
                                        if (iM38344 == 1) {
                                            this.f64038 = c16302.m38343((c16302.m38343(2) + 1) * 8);
                                        } else {
                                            do {
                                                zM38352 = c16302.m38352();
                                                this.f64038 = (this.f64038 << 8) + ((long) c16302.m38343(8));
                                            } while (zM38352);
                                        }
                                    }
                                    if (c16302.m38352()) {
                                        c16302.m38351(8);
                                    }
                                } else {
                                    throw C9080.m23440((String) null, (Throwable) null);
                                }
                            } else {
                                if (this.f64041) {
                                }
                                this.f64036 = 0;
                            }
                            if (this.f64031 == 0) {
                                if (this.f64048 != 0) {
                                    throw C9080.m23440((String) null, (Throwable) null);
                                }
                                if (this.f64050 != 0) {
                                    throw C9080.m23440((String) null, (Throwable) null);
                                }
                                int i3 = 0;
                                do {
                                    iM38343 = c16302.m38343(8);
                                    i3 += iM38343;
                                } while (iM38343 == 255);
                                int iM38354 = c16302.m38353();
                                if ((iM38354 & 7) == 0) {
                                    c17715.m41484(iM38354 >> 3);
                                } else {
                                    c16302.m38341(i3 * 8, c17715.m41482());
                                    c17715.m41484(0);
                                }
                                this.f64042.mo8453(i3, c17715);
                                C22632.m50634(this.f64049 != -9223372036854775807L);
                                this.f64042.mo8455(this.f64049, 1, i3, 0, null);
                                this.f64049 += this.f64047;
                                if (this.f64037) {
                                    c16302.m38351((int) this.f64038);
                                }
                                this.f64036 = 0;
                            } else {
                                throw C9080.m23440((String) null, (Throwable) null);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int iM41457 = c17714.m41456();
                    if ((iM41457 & BERTags.FLAGS) == 224) {
                        this.f64030 = iM41457;
                        this.f64036 = 2;
                    } else if (iM41457 != 86) {
                        this.f64036 = 0;
                    }
                }
            } else if (c17714.m41456() == 86) {
                this.f64036 = 1;
            }
        }
    }
}
