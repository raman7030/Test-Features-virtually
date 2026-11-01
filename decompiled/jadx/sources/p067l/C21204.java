package p067l;

import java.util.Collections;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩶֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8LE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21204 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֡ */
    public int f66666;

    /* JADX INFO: renamed from: ֨ */
    public int f66667;

    /* JADX INFO: renamed from: ֫ */
    public int f66668;

    /* JADX INFO: renamed from: ۖ */
    public final int f66669;

    /* JADX INFO: renamed from: ۘ */
    public final C17861 f66670;

    /* JADX INFO: renamed from: ۚ */
    public int f66671;

    /* JADX INFO: renamed from: ۜ */
    public final String f66672;

    /* JADX INFO: renamed from: ۠ */
    public int f66673;

    /* JADX INFO: renamed from: ۡ */
    public boolean f66674;

    /* JADX INFO: renamed from: ۢ */
    public long f66675;

    /* JADX INFO: renamed from: ۧ */
    public int f66676;

    /* JADX INFO: renamed from: ܳ */
    public String f66677;

    /* JADX INFO: renamed from: ܶ */
    public boolean f66678;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC20790 f66679;

    /* JADX INFO: renamed from: ܽ */
    public int f66680;

    /* JADX INFO: renamed from: ܿ */
    public C10307 f66681;

    /* JADX INFO: renamed from: ᩳ */
    public String f66682;

    /* JADX INFO: renamed from: ᩴ */
    public final C19203 f66683;

    /* JADX INFO: renamed from: ᩵ */
    public long f66684;

    /* JADX INFO: renamed from: ᩷ */
    public int f66685;

    /* JADX INFO: renamed from: ᩸ */
    public long f66686;

    /* JADX INFO: renamed from: ᩻ */
    public int f66687;

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
    }

    public C21204(String str, int i) {
        this.f66672 = str;
        this.f66669 = i;
        C19203 c19203 = new C19203(1024);
        this.f66683 = c19203;
        byte[] bArrM43728 = c19203.m43728();
        this.f66670 = new C17861(bArrM43728, bArrM43728.length);
        this.f66686 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f66673 = 0;
        this.f66686 = -9223372036854775807L;
        this.f66678 = false;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f66679 = interfaceC23116.mo5732(c20672.m46739(), 1);
        this.f66677 = c20672.m46738();
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f66686 = j;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) throws C10998 {
        int iM40558;
        boolean zM40567;
        C23877.m52958(this.f66679);
        while (c19203.m43703() > 0) {
            int i = this.f66673;
            if (i != 0) {
                if (i != 1) {
                    C19203 c19204 = this.f66683;
                    C17861 c17861 = this.f66670;
                    if (i == 2) {
                        int iM43702 = ((this.f66667 & (-225)) << 8) | c19203.m43702();
                        this.f66671 = iM43702;
                        if (iM43702 > c19204.m43728().length) {
                            c19204.m43727(this.f66671);
                            byte[] bArrM43728 = c19204.m43728();
                            c17861.getClass();
                            c17861.m40565(bArrM43728.length, bArrM43728);
                        }
                        this.f66676 = 0;
                        this.f66673 = 3;
                    } else if (i == 3) {
                        int iMin = Math.min(c19203.m43703(), this.f66671 - this.f66676);
                        c19203.m43707(this.f66676, iMin, c17861.f53313);
                        int i2 = this.f66676 + iMin;
                        this.f66676 = i2;
                        if (i2 == this.f66671) {
                            c17861.m40569(0);
                            if (!c17861.m40567()) {
                                this.f66678 = true;
                                int iM40559 = c17861.m40558(1);
                                int iM405510 = iM40559 == 1 ? c17861.m40558(1) : 0;
                                this.f66668 = iM405510;
                                if (iM405510 == 0) {
                                    if (iM40559 == 1) {
                                        c17861.m40558((c17861.m40558(2) + 1) * 8);
                                    }
                                    if (!c17861.m40567()) {
                                        throw C10998.m25387((String) null, (Throwable) null);
                                    }
                                    this.f66685 = c17861.m40558(6);
                                    int iM405511 = c17861.m40558(4);
                                    int iM405512 = c17861.m40558(3);
                                    if (iM405511 != 0 || iM405512 != 0) {
                                        throw C10998.m25387((String) null, (Throwable) null);
                                    }
                                    if (iM40559 == 0) {
                                        int iM40568 = c17861.m40568();
                                        int iM40554 = c17861.m40554();
                                        C14674 c14674M31803 = C14004.m31803(c17861, true);
                                        this.f66682 = c14674M31803.f41889;
                                        this.f66666 = c14674M31803.f41890;
                                        this.f66680 = c14674M31803.f41888;
                                        int iM40555 = iM40554 - c17861.m40554();
                                        c17861.m40569(iM40568);
                                        byte[] bArr = new byte[(iM40555 + 7) / 8];
                                        c17861.m40556(iM40555, bArr);
                                        C3601 c3601 = new C3601();
                                        c3601.m6701(this.f66677);
                                        c3601.m6694("video/mp2t");
                                        c3601.m6697("audio/mp4a-latm");
                                        c3601.m6677(this.f66682);
                                        c3601.m6704(this.f66680);
                                        c3601.m6688(this.f66666);
                                        c3601.m6678(Collections.singletonList(bArr));
                                        c3601.m6703(this.f66672);
                                        c3601.m6686(this.f66669);
                                        C10307 c10307M6672 = c3601.m6672();
                                        if (!c10307M6672.equals(this.f66681)) {
                                            this.f66681 = c10307M6672;
                                            this.f66684 = 1024000000 / ((long) c10307M6672.f28538);
                                            this.f66679.mo10503(c10307M6672);
                                        }
                                    } else {
                                        int iM405513 = c17861.m40558((c17861.m40558(2) + 1) * 8);
                                        int iM40556 = c17861.m40554();
                                        C14674 c14674M31804 = C14004.m31803(c17861, true);
                                        this.f66682 = c14674M31804.f41889;
                                        this.f66666 = c14674M31804.f41890;
                                        this.f66680 = c14674M31804.f41888;
                                        c17861.m40566(iM405513 - (iM40556 - c17861.m40554()));
                                    }
                                    int iM405514 = c17861.m40558(3);
                                    this.f66687 = iM405514;
                                    if (iM405514 == 0) {
                                        c17861.m40566(8);
                                    } else if (iM405514 == 1) {
                                        c17861.m40566(9);
                                    } else if (iM405514 == 3 || iM405514 == 4 || iM405514 == 5) {
                                        c17861.m40566(6);
                                    } else if (iM405514 == 6 || iM405514 == 7) {
                                        c17861.m40566(1);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                    boolean zM40568 = c17861.m40567();
                                    this.f66674 = zM40568;
                                    this.f66675 = 0L;
                                    if (zM40568) {
                                        if (iM40559 == 1) {
                                            this.f66675 = c17861.m40558((c17861.m40558(2) + 1) * 8);
                                        } else {
                                            do {
                                                zM40567 = c17861.m40567();
                                                this.f66675 = (this.f66675 << 8) + ((long) c17861.m40558(8));
                                            } while (zM40567);
                                        }
                                    }
                                    if (c17861.m40567()) {
                                        c17861.m40566(8);
                                    }
                                } else {
                                    throw C10998.m25387((String) null, (Throwable) null);
                                }
                            } else {
                                if (this.f66678) {
                                }
                                this.f66673 = 0;
                            }
                            if (this.f66668 == 0) {
                                if (this.f66685 != 0) {
                                    throw C10998.m25387((String) null, (Throwable) null);
                                }
                                if (this.f66687 != 0) {
                                    throw C10998.m25387((String) null, (Throwable) null);
                                }
                                int i3 = 0;
                                do {
                                    iM40558 = c17861.m40558(8);
                                    i3 += iM40558;
                                } while (iM40558 == 255);
                                int iM40569 = c17861.m40568();
                                if ((iM40569 & 7) == 0) {
                                    c19204.m43730(iM40569 >> 3);
                                } else {
                                    c17861.m40556(i3 * 8, c19204.m43728());
                                    c19204.m43730(0);
                                }
                                this.f66679.mo10500(i3, c19204);
                                C23877.m52960(this.f66686 != -9223372036854775807L);
                                this.f66679.mo10502(this.f66686, 1, i3, 0, null);
                                this.f66686 += this.f66684;
                                if (this.f66674) {
                                    c17861.m40566((int) this.f66675);
                                }
                                this.f66673 = 0;
                            } else {
                                throw C10998.m25387((String) null, (Throwable) null);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int iM43703 = c19203.m43702();
                    if ((iM43703 & BERTags.FLAGS) == 224) {
                        this.f66667 = iM43703;
                        this.f66673 = 2;
                    } else if (iM43703 != 86) {
                        this.f66673 = 0;
                    }
                }
            } else if (c19203.m43702() == 86) {
                this.f66673 = 1;
            }
        }
    }
}
