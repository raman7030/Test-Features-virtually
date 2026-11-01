package p067l;

import android.net.Uri;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9428 implements InterfaceC24947, InterfaceC9173 {

    /* JADX INFO: renamed from: ֫ */
    public final C20266 f25733;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C19643 f25734;

    /* JADX INFO: renamed from: ۘ */
    public final Uri f25735;

    /* JADX INFO: renamed from: ۡ */
    public long f25737;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC14122 f25738;

    /* JADX INFO: renamed from: ܳ */
    public final C15968 f25740;

    /* JADX INFO: renamed from: ܺ */
    public boolean f25741;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC23116 f25742;

    /* JADX INFO: renamed from: ܿ */
    public volatile boolean f25743;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC20790 f25744;

    /* JADX INFO: renamed from: ᩷ */
    public final C24812 f25745 = new C24812();

    /* JADX INFO: renamed from: ۜ */
    public boolean f25736 = true;

    /* JADX INFO: renamed from: ᩻ */
    public final long f25746 = C12782.m29334();

    /* JADX INFO: renamed from: ۧ */
    public C5318 f25739 = m21933(0);

    public C9428(C19643 c19643, Uri uri, InterfaceC22753 interfaceC22753, C17218 c17218, InterfaceC23116 interfaceC23116, C15968 c15968) {
        this.f25734 = c19643;
        this.f25735 = uri;
        this.f25733 = new C20266(interfaceC22753);
        this.f25738 = c17218;
        this.f25742 = interfaceC23116;
        this.f25740 = c15968;
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ۧ */
    public final void mo8653() {
        this.f25743 = true;
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ֫ */
    public final void mo8651() {
        int iM38987 = 0;
        while (iM38987 == 0 && !this.f25743) {
            try {
                long j = this.f25745.f79276;
                C5318 c5318M21933 = m21933(j);
                this.f25739 = c5318M21933;
                long jMo4020 = this.f25733.mo4020(c5318M21933);
                if (!this.f25743) {
                    if (jMo4020 != -1) {
                        jMo4020 += j;
                        C19643.m44540(this.f25734);
                    }
                    long j2 = jMo4020;
                    this.f25734.f59715 = C12052.m27609(this.f25733.mo8131());
                    InterfaceC22753 c4064 = this.f25733;
                    if (this.f25734.f59715 != null && this.f25734.f59715.f33580 != -1) {
                        c4064 = new C4064(this.f25733, this.f25734.f59715.f33580, this);
                        InterfaceC20790 interfaceC20790M44558 = this.f25734.m44558();
                        this.f25744 = interfaceC20790M44558;
                        interfaceC20790M44558.mo10503(C19643.f59700);
                    }
                    InterfaceC22753 interfaceC22753 = c4064;
                    long jM38991 = j;
                    ((C17218) this.f25738).m38990(interfaceC22753, this.f25735, this.f25733.mo8131(), j, j2, this.f25742);
                    if (this.f25734.f59715 != null) {
                        ((C17218) this.f25738).m38988();
                    }
                    if (this.f25736) {
                        ((C17218) this.f25738).m38989(jM38991, this.f25737);
                        this.f25736 = false;
                    }
                    while (true) {
                        long j3 = jM38991;
                        while (true) {
                            if (iM38987 != 0 || this.f25743) {
                                break;
                            }
                            try {
                                this.f25740.m36280();
                                iM38987 = ((C17218) this.f25738).m38987(this.f25745);
                                jM38991 = ((C17218) this.f25738).m38991();
                                if (jM38991 > this.f25734.f59735 + j3) {
                                    this.f25740.m36283();
                                    this.f25734.f59742.post(this.f25734.f59706);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iM38987 == 1) {
                        iM38987 = 0;
                    } else if (((C17218) this.f25738).m38991() != -1) {
                        this.f25745.f79276 = ((C17218) this.f25738).m38991();
                    }
                    C10685.m24613(this.f25733);
                } else {
                    if (iM38987 != 1 && ((C17218) this.f25738).m38991() != -1) {
                        this.f25745.f79276 = ((C17218) this.f25738).m38991();
                    }
                    C10685.m24613(this.f25733);
                    return;
                }
            } catch (Throwable th) {
                if (iM38987 != 1 && ((C17218) this.f25738).m38991() != -1) {
                    this.f25745.f79276 = ((C17218) this.f25738).m38991();
                }
                C10685.m24613(this.f25733);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21939(C19203 c19203) {
        long jMax;
        if (!this.f25741) {
            jMax = this.f25737;
        } else {
            jMax = Math.max(this.f25734.m44531(true), this.f25737);
        }
        int iM43703 = c19203.m43703();
        InterfaceC20790 interfaceC20790 = this.f25744;
        interfaceC20790.getClass();
        interfaceC20790.mo10500(iM43703, c19203);
        interfaceC20790.mo10502(jMax, 1, iM43703, 0, null);
        this.f25741 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private C5318 m21933(long j) {
        C6659 c6659 = new C6659();
        c6659.m15164(this.f25735);
        c6659.m15169(j);
        int i = C19643.f59701;
        c6659.m15165((String) null);
        c6659.m15162(6);
        c6659.m15166(C19643.f59702);
        return c6659.m15161();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21935(C9428 c9428, long j, long j2) {
        c9428.f25745.f79276 = j;
        c9428.f25737 = j2;
        c9428.f25736 = true;
        c9428.f25741 = false;
    }
}
