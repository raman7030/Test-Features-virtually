package p067l;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ᩳܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19643 implements InterfaceC11441, InterfaceC23116, InterfaceC19583, InterfaceC8854, InterfaceC4891 {

    /* JADX INFO: renamed from: ۛ֫ */
    public static final C10307 f59700;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final /* synthetic */ int f59701 = 0;

    /* JADX INFO: renamed from: ۨ֫ */
    public static final Map f59702;

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f59703;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f59704;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f59705;

    /* JADX INFO: renamed from: ۖ֫ */
    public final RunnableC8087 f59706;

    /* JADX INFO: renamed from: ۗ */
    public int f59707;

    /* JADX INFO: renamed from: ۗ֫ */
    public final C10307 f59708;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f59709;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22753 f59710;

    /* JADX INFO: renamed from: ۙ֫ */
    public final long f59711;

    /* JADX INFO: renamed from: ۚ֫ */
    public final C17218 f59712;

    /* JADX INFO: renamed from: ۛ */
    public int f59713;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C10866 f59714;

    /* JADX INFO: renamed from: ۟ */
    public C12052 f59715;

    /* JADX INFO: renamed from: ۠֫ */
    public C12938[] f59716;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C10099 f59717;

    /* JADX INFO: renamed from: ۢ֫ */
    public final RunnableC12111 f59718;

    /* JADX INFO: renamed from: ۤ */
    public long f59719;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f59720;

    /* JADX INFO: renamed from: ۨ */
    public int f59721;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC6601 f59722;

    /* JADX INFO: renamed from: ۫֫ */
    public final Uri f59723;

    /* JADX INFO: renamed from: ۬ */
    public final C16658 f59724;

    /* JADX INFO: renamed from: ۬֫ */
    public C18301 f59725;

    /* JADX INFO: renamed from: ܰ */
    public boolean f59726;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C15968 f59727;

    /* JADX INFO: renamed from: ܶ֫ */
    public C6232[] f59728;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f59729;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f59730;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C25007 f59731;

    /* JADX INFO: renamed from: ᩳ֫ */
    public long f59732;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f59733;

    /* JADX INFO: renamed from: ᩵֫ */
    public long f59734;

    /* JADX INFO: renamed from: ᩶ */
    public final long f59735;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f59736;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f59737;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23016 f59738;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f59739;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC22170 f59740;

    /* JADX INFO: renamed from: ᩹֫ */
    public InterfaceC11402 f59741;

    /* JADX INFO: renamed from: ᩺ */
    public final Handler f59742;

    /* JADX INFO: renamed from: ᩻֫ */
    public final InterfaceC12878 f59743;

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final C18912 mo14657(InterfaceC24947 interfaceC24947, long j, long j2, IOException iOException, int i) {
        C18912 c18912M25032;
        InterfaceC11402 interfaceC11402;
        C9428 c9428 = (C9428) interfaceC24947;
        C20266 c20266 = c9428.f25733;
        long unused = c9428.f25746;
        C5318 unused2 = c9428.f25739;
        c20266.getClass();
        C12782 c12782 = new C12782(j2, c20266.m45773());
        C5792.m13013(c9428.f25737);
        C5792.m13013(this.f59719);
        long jMo29503 = this.f59743.mo29503(new C4160(iOException, i));
        if (jMo29503 == -9223372036854775807L) {
            c18912M25032 = C10866.f30116;
        } else {
            int iM44550 = m44550();
            boolean z = iM44550 > this.f59721;
            if (this.f59705 || ((interfaceC11402 = this.f59741) != null && interfaceC11402.mo8953() != -9223372036854775807L)) {
                this.f59721 = iM44550;
            } else if (this.f59703 && !m44530()) {
                this.f59709 = true;
                c18912M25032 = C10866.f30117;
            } else {
                this.f59729 = this.f59703;
                this.f59732 = 0L;
                this.f59721 = 0;
                for (C6232 c6232 : this.f59728) {
                    c6232.m14130(false);
                }
                C9428.m21935(c9428, 0L, 0L);
            }
            c18912M25032 = C10866.m25032(jMo29503, z);
        }
        boolean zM43018 = c18912M25032.m43018();
        this.f59717.m23561(c12782, 1, -1, null, 0, null, c9428.f25737, this.f59719, iOException, !zM43018);
        if (!zM43018) {
            long unused3 = c9428.f25746;
        }
        return c18912M25032;
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14658(InterfaceC24947 interfaceC24947, long j, long j2) {
        C9428 c9428 = (C9428) interfaceC24947;
        if (this.f59719 == -9223372036854775807L && this.f59741 != null) {
            long jM44531 = m44531(true);
            long j3 = jM44531 == Long.MIN_VALUE ? 0L : jM44531 + 10000;
            this.f59719 = j3;
            this.f59731.m54921(j3, this.f59741, this.f59720);
        }
        C20266 c20266 = c9428.f25733;
        long unused = c9428.f25746;
        C5318 unused2 = c9428.f25739;
        c20266.getClass();
        C12782 c12782 = new C12782(j2, c20266.m45773());
        long unused3 = c9428.f25746;
        this.f59743.getClass();
        this.f59717.m23564(c12782, 1, -1, null, 0, null, c9428.f25737, this.f59719);
        this.f59737 = true;
        InterfaceC22170 interfaceC22170 = this.f59740;
        interfaceC22170.getClass();
        interfaceC22170.mo13095((InterfaceC2878) this);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14659(InterfaceC24947 interfaceC24947, long j, long j2, int i) {
        C12782 c12782;
        C9428 c9428 = (C9428) interfaceC24947;
        C20266 c20266 = c9428.f25733;
        if (i == 0) {
            long unused = c9428.f25746;
            c12782 = new C12782(c9428.f25739);
        } else {
            long unused2 = c9428.f25746;
            C5318 unused3 = c9428.f25739;
            c20266.getClass();
            c12782 = new C12782(j2, c20266.m45773());
        }
        this.f59717.m23560(c12782, 1, -1, null, 0, null, c9428.f25737, this.f59719, i);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14660(InterfaceC24947 interfaceC24947, long j, long j2, boolean z) {
        C9428 c9428 = (C9428) interfaceC24947;
        C20266 c20266 = c9428.f25733;
        long unused = c9428.f25746;
        C5318 unused2 = c9428.f25739;
        c20266.getClass();
        C12782 c12782 = new C12782(j2, c20266.m45773());
        long unused3 = c9428.f25746;
        this.f59743.getClass();
        this.f59717.m23559(c12782, 1, -1, null, 0, null, c9428.f25737, this.f59719);
        if (z) {
            return;
        }
        for (C6232 c6232 : this.f59728) {
            c6232.m14130(false);
        }
        if (this.f59713 > 0) {
            InterfaceC22170 interfaceC22170 = this.f59740;
            interfaceC22170.getClass();
            interfaceC22170.mo13095((InterfaceC2878) this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [l.ۤۧۧ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ۛۧۧ] */
    public C19643(Uri uri, InterfaceC22753 interfaceC22753, C17218 c17218, InterfaceC6601 interfaceC6601, C16658 c16658, InterfaceC12878 interfaceC12878, C10099 c10099, C25007 c25007, InterfaceC23016 interfaceC23016, int i, C10307 c10307, long j, InterfaceExecutorC10195 interfaceExecutorC10195) {
        C10866 c10866;
        this.f59723 = uri;
        this.f59710 = interfaceC22753;
        this.f59722 = interfaceC6601;
        this.f59724 = c16658;
        this.f59743 = interfaceC12878;
        this.f59717 = c10099;
        this.f59731 = c25007;
        this.f59738 = interfaceC23016;
        this.f59735 = i;
        this.f59708 = c10307;
        if (interfaceExecutorC10195 != null) {
            c10866 = new C10866(interfaceExecutorC10195);
        } else {
            c10866 = new C10866("ProgressiveMediaPeriod");
        }
        this.f59714 = c10866;
        this.f59712 = c17218;
        this.f59711 = j;
        this.f59727 = new C15968();
        this.f59718 = new Runnable() { // from class: l.ۤۧۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f33855.m44529();
            }
        };
        this.f59706 = new Runnable() { // from class: l.ۛۧۧ
            @Override // java.lang.Runnable
            public final void run() {
                C19643.m44533(this.f21320);
            }
        };
        this.f59742 = C5792.m12995((Handler.Callback) null);
        this.f59716 = new C12938[0];
        this.f59728 = new C6232[0];
        this.f59734 = -9223372036854775807L;
        this.f59707 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44533(C19643 c19643) {
        if (c19643.f59704) {
            return;
        }
        InterfaceC22170 interfaceC22170 = c19643.f59740;
        interfaceC22170.getClass();
        interfaceC22170.mo13095((InterfaceC2878) c19643);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m44557() {
        if (this.f59703) {
            for (C6232 c6232 : this.f59728) {
                c6232.m14122();
            }
        }
        this.f59714.m25038(this);
        this.f59742.removeCallbacksAndMessages(null);
        this.f59740 = null;
        this.f59704 = true;
    }

    @Override // p067l.InterfaceC8854
    /* JADX INFO: renamed from: ᩳ */
    public final void mo20461() {
        for (C6232 c6232 : this.f59728) {
            c6232.m14123();
        }
        this.f59712.m38992();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13097(InterfaceC22170 interfaceC22170, long j) {
        this.f59740 = interfaceC22170;
        C10307 c10307 = this.f59708;
        if (c10307 != null) {
            mo5732(0, 3).mo10503(c10307);
            m44541(new C19448(-9223372036854775807L, new long[]{0}, new long[]{0}));
            mo5734();
            this.f59734 = j;
            return;
        }
        this.f59727.m36284();
        m44538();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ᩻ */
    public final C8243 mo13102() {
        m44537();
        return this.f59725.f54649;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13092(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j) {
        InterfaceC11617 interfaceC11617;
        m44537();
        C18301 c18301 = this.f59725;
        C8243 c8243 = c18301.f54649;
        boolean[] zArr3 = c18301.f54646;
        int i = this.f59713;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC11617Arr.length; i3++) {
            InterfaceC20314 interfaceC20314 = interfaceC20314Arr[i3];
            if (interfaceC20314 != null && (interfaceC11617Arr[i3] == null || !zArr[i3])) {
                int i4 = ((C4220) interfaceC20314).f9278;
                C23877.m52960(zArr3[i4]);
                this.f59713--;
                zArr3[i4] = false;
                interfaceC20314Arr[i3] = null;
            }
        }
        boolean z = !this.f59736 ? j == 0 || this.f59730 : i != 0;
        for (int i5 = 0; i5 < interfaceC11617Arr.length; i5++) {
            if (interfaceC20314Arr[i5] == null && (interfaceC11617 = interfaceC11617Arr[i5]) != null) {
                C23877.m52960(interfaceC11617.length() == 1);
                C23877.m52960(interfaceC11617.mo4755(0) == 0);
                int iM19033 = c8243.m19033(interfaceC11617.mo4759());
                C23877.m52960(!zArr3[iM19033]);
                this.f59713++;
                zArr3[iM19033] = true;
                this.f59733 = interfaceC11617.mo4753().f28518 | this.f59733;
                interfaceC20314Arr[i5] = new C4220(this, iM19033);
                zArr2[i5] = true;
                if (!z) {
                    C6232 c6232 = this.f59728[iM19033];
                    z = (c6232.m14133() == 0 || c6232.m14132(j, true)) ? false : true;
                }
            }
        }
        if (this.f59713 == 0) {
            this.f59709 = false;
            this.f59729 = false;
            this.f59733 = false;
            C10866 c10866 = this.f59714;
            if (c10866.m25042()) {
                C6232[] c6232Arr = this.f59728;
                int length = c6232Arr.length;
                while (i2 < length) {
                    c6232Arr[i2].m14117();
                    i2++;
                }
                c10866.m25036();
            } else {
                this.f59737 = false;
                for (C6232 c6233 : this.f59728) {
                    c6233.m14130(false);
                }
            }
        } else if (z) {
            j = mo13090(j);
            while (i2 < interfaceC20314Arr.length) {
                if (interfaceC20314Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f59736 = true;
        return j;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13093(long j, boolean z) {
        if (this.f59730) {
            return;
        }
        m44537();
        if (m44551()) {
            return;
        }
        boolean[] zArr = this.f59725.f54646;
        int length = this.f59728.length;
        for (int i = 0; i < length; i++) {
            this.f59728[i].m14119(j, z, zArr[i]);
        }
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        if (this.f59737) {
            return false;
        }
        C10866 c10866 = this.f59714;
        if (c10866.m25041() || this.f59709) {
            return false;
        }
        if ((this.f59703 || this.f59708 != null) && this.f59713 == 0) {
            return false;
        }
        boolean zM36284 = this.f59727.m36284();
        if (c10866.m25042()) {
            return zM36284;
        }
        m44538();
        return true;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f59714.m25042() && this.f59727.m36285();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        return mo4633();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܽ */
    public final long mo13098() {
        if (this.f59733) {
            this.f59733 = false;
            return this.f59732;
        }
        if (!this.f59729) {
            return -9223372036854775807L;
        }
        if (!this.f59737 && m44550() <= this.f59721) {
            return -9223372036854775807L;
        }
        this.f59729 = false;
        return this.f59732;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        long jM44531;
        m44537();
        if (this.f59737 || this.f59713 == 0) {
            return Long.MIN_VALUE;
        }
        if (m44551()) {
            return this.f59734;
        }
        if (this.f59726) {
            int length = this.f59728.length;
            jM44531 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C18301 c18301 = this.f59725;
                if (c18301.f54647[i] && c18301.f54646[i] && !this.f59728[i].m14126()) {
                    jM44531 = Math.min(jM44531, this.f59728[i].m14139());
                }
            }
        } else {
            jM44531 = Long.MAX_VALUE;
        }
        if (jM44531 == C14849.FOREVER_NS) {
            jM44531 = m44531(false);
        }
        return jM44531 == Long.MIN_VALUE ? this.f59732 : jM44531;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086 A[LOOP:1: B:42:0x0084->B:43:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b A[LOOP:2: B:47:0x0099->B:48:0x009b, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0081, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0092, please report this as an issue */
    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13090(long j) {
        int i;
        boolean zM14132;
        m44537();
        boolean[] zArr = this.f59725.f54647;
        if (!this.f59741.mo8955()) {
            j = 0;
        }
        this.f59729 = false;
        boolean z = true;
        boolean z2 = this.f59732 == j;
        this.f59732 = j;
        if (m44551()) {
            this.f59734 = j;
            return j;
        }
        int i2 = this.f59707;
        C10866 c10866 = this.f59714;
        if (i2 == 7 || (!this.f59737 && !c10866.m25042())) {
            this.f59709 = false;
            this.f59734 = j;
            this.f59737 = false;
            this.f59733 = false;
            if (c10866.m25042()) {
                for (C6232 c6232 : this.f59728) {
                    c6232.m14117();
                }
                c10866.m25036();
                return j;
            }
            c10866.m25040();
            for (C6232 c6233 : this.f59728) {
                c6233.m14130(false);
            }
        } else {
            int length = this.f59728.length;
            for (int i3 = 0; i3 < length; i3++) {
                C6232 c6234 = this.f59728[i3];
                if (c6234.m14133() != 0 || !z2) {
                    if (this.f59730) {
                        zM14132 = c6234.m14131(c6234.m14135());
                    } else {
                        zM14132 = c6234.m14132(j, this.f59737);
                    }
                    if (!zM14132 && (zArr[i3] || !this.f59726)) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z) {
                this.f59709 = false;
                this.f59734 = j;
                this.f59737 = false;
                this.f59733 = false;
                if (c10866.m25042()) {
                    while (i < r2) {
                        c6232.m14117();
                    }
                    c10866.m25036();
                    return j;
                }
                c10866.m25040();
                while (i < r2) {
                    c6233.m14130(false);
                }
            }
        }
        return j;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13091(long j, C11491 c11491) {
        m44537();
        if (!this.f59741.mo8955()) {
            return 0L;
        }
        C8719 c8719Mo4119 = this.f59741.mo4119(j);
        return c11491.m26546(j, c8719Mo4119.f23641.f29729, c8719Mo4119.f23642.f29729);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44556(int i) {
        return !m44530() && this.f59728[i].m14121(this.f59737);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44559(int i) {
        this.f59728[i].m14125();
        this.f59714.m25037(this.f59743.mo29502(this.f59707));
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܿ */
    public final void mo13100() throws IOException {
        this.f59714.m25037(this.f59743.mo29502(this.f59707));
        if (this.f59737 && !this.f59703) {
            throw C10998.m25387("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44555(int i, C5221 c5221, C23128 c23128, int i2) {
        if (m44530()) {
            return -3;
        }
        m44545(i);
        int iM14116 = this.f59728[i].m14116(c5221, c23128, i2, this.f59737);
        if (iM14116 == -3) {
            m44549(i);
        }
        return iM14116;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44554(int i, long j) {
        if (m44530()) {
            return 0;
        }
        m44545(i);
        C6232 c6232 = this.f59728[i];
        int iM14115 = c6232.m14115(j, this.f59737);
        c6232.m14136(iM14115);
        if (iM14115 == 0) {
            m44549(i);
        }
        return iM14115;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m44545(int i) {
        m44537();
        C18301 c18301 = this.f59725;
        boolean[] zArr = c18301.f54648;
        if (zArr[i]) {
            return;
        }
        C10307 c10307M34395 = c18301.f54649.m19034(i).m34395(0);
        C8758 c8758 = new C8758(1, C11669.m26822(c10307M34395.f28528), c10307M34395, 0, null, C5792.m13013(this.f59732), -9223372036854775807L);
        C10099 c10099 = this.f59717;
        c10099.m23563(new C14496(c10099, c8758));
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m44549(int i) {
        m44537();
        if (this.f59709) {
            if ((!this.f59726 || this.f59725.f54647[i]) && !this.f59728[i].m14121(false)) {
                this.f59734 = 0L;
                this.f59709 = false;
                this.f59729 = true;
                this.f59732 = 0L;
                this.f59721 = 0;
                for (C6232 c6232 : this.f59728) {
                    c6232.m14130(false);
                }
                InterfaceC22170 interfaceC22170 = this.f59740;
                interfaceC22170.getClass();
                interfaceC22170.mo13095((InterfaceC2878) this);
            }
        }
    }

    /* JADX INFO: renamed from: ֨ */
    private boolean m44530() {
        return this.f59729 || m44551();
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20790 mo5732(int i, int i2) {
        return m44532(new C12938(i, false));
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ܳ */
    public final void mo5734() {
        this.f59739 = true;
        this.f59742.post(this.f59718);
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final void mo5733(final InterfaceC11402 interfaceC11402) {
        this.f59742.post(new Runnable() { // from class: l.ۨۧۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f37763.m44541(interfaceC11402);
            }
        });
    }

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC20790 m44558() {
        return m44532(new C12938(0, true));
    }

    @Override // p067l.InterfaceC4891
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10365() {
        this.f59742.post(this.f59718);
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m44540(final C19643 c19643) {
        c19643.f59742.post(new Runnable() { // from class: l.᩺ۧۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f76662.f59705 = true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC20790 m44532(C12938 c12938) {
        int length = this.f59728.length;
        for (int i = 0; i < length; i++) {
            if (c12938.equals(this.f59716[i])) {
                return this.f59728[i];
            }
        }
        if (!this.f59739) {
            InterfaceC6601 interfaceC6601 = this.f59722;
            interfaceC6601.getClass();
            C6232 c6232 = new C6232(this.f59738, interfaceC6601, this.f59724);
            c6232.m14120(this);
            int i2 = length + 1;
            C12938[] c12938Arr = (C12938[]) Arrays.copyOf(this.f59716, i2);
            c12938Arr[length] = c12938;
            String str = C5792.f14228;
            this.f59716 = c12938Arr;
            C6232[] c6232Arr = (C6232[]) Arrays.copyOf(this.f59728, i2);
            c6232Arr[length] = c6232;
            this.f59728 = c6232Arr;
            return c6232;
        }
        C21334.m48351("Extractor added new track (id=" + c12938.f36360 + ") after finishing tracks.");
        return new C21105();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m44541(InterfaceC11402 interfaceC11402) {
        this.f59741 = this.f59715 == null ? interfaceC11402 : new C22131(-9223372036854775807L);
        this.f59719 = interfaceC11402.mo8953();
        boolean z = !this.f59705 && interfaceC11402.mo8953() == -9223372036854775807L;
        this.f59720 = z;
        this.f59707 = z ? 7 : 1;
        if (this.f59703) {
            this.f59731.m54921(this.f59719, interfaceC11402, z);
        } else {
            m44529();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֡ */
    public void m44529() {
        long j;
        C25079 c25079M55052;
        if (this.f59704 || this.f59703 || !this.f59739 || this.f59741 == null) {
            return;
        }
        for (C6232 c6232 : this.f59728) {
            if (c6232.m14143() == null) {
                return;
            }
        }
        this.f59727.m36283();
        int length = this.f59728.length;
        C15020[] c15020Arr = new C15020[length];
        boolean[] zArr = new boolean[length];
        int i = 0;
        while (true) {
            j = this.f59711;
            if (i >= length) {
                break;
            }
            C10307 c10307M14143 = this.f59728[i].m14143();
            c10307M14143.getClass();
            String str = c10307M14143.f28528;
            boolean zM26825 = C11669.m26825(str);
            boolean z = zM26825 || C11669.m26816(str);
            zArr[i] = z;
            this.f59726 = z | this.f59726;
            this.f59730 = j != -9223372036854775807L && length == 1 && C11669.m26814(str);
            C12052 c12052 = this.f59715;
            if (c12052 != null) {
                int i2 = c12052.f33575;
                if (zM26825 || this.f59716[i].f36361) {
                    C25079 c25079 = c10307M14143.f28526;
                    if (c25079 == null) {
                        c25079M55052 = new C25079(c12052);
                    } else {
                        c25079M55052 = c25079.m55052(c12052);
                    }
                    C3601 c3601M23918 = c10307M14143.m23918();
                    c3601M23918.m6681(c25079M55052);
                    c10307M14143 = c3601M23918.m6672();
                }
                if (zM26825 && c10307M14143.f28537 == -1 && c10307M14143.f28529 == -1 && i2 != -1) {
                    C3601 c3601M23919 = c10307M14143.m23918();
                    c3601M23919.m6700(i2);
                    c10307M14143 = c3601M23919.m6672();
                }
            }
            C10307 c10307M23919 = c10307M14143.m23919(this.f59722.mo9695(c10307M14143));
            c15020Arr[i] = new C15020(Integer.toString(i), c10307M23919);
            this.f59733 = c10307M23919.f28518 | this.f59733;
            i++;
        }
        this.f59725 = new C18301(new C8243(c15020Arr), zArr);
        if (this.f59730 && this.f59719 == -9223372036854775807L) {
            this.f59719 = j;
            this.f59741 = new C15462(this, this.f59741);
        }
        this.f59731.m54921(this.f59719, this.f59741, this.f59720);
        this.f59703 = true;
        InterfaceC22170 interfaceC22170 = this.f59740;
        interfaceC22170.getClass();
        interfaceC22170.mo13096((InterfaceC11441) this);
    }

    /* JADX INFO: renamed from: ۚ */
    private void m44538() {
        C9428 c9428 = new C9428(this, this.f59723, this.f59710, this.f59712, this, this.f59727);
        if (this.f59703) {
            C23877.m52960(m44551());
            long j = this.f59719;
            if (j != -9223372036854775807L && this.f59734 > j) {
                this.f59737 = true;
                this.f59734 = -9223372036854775807L;
                return;
            }
            InterfaceC11402 interfaceC11402 = this.f59741;
            interfaceC11402.getClass();
            C9428.m21935(c9428, interfaceC11402.mo4119(this.f59734).f23641.f29728, this.f59734);
            for (C6232 c6232 : this.f59728) {
                c6232.m14137(this.f59734);
            }
            this.f59734 = -9223372036854775807L;
        }
        this.f59721 = m44550();
        this.f59714.m25039(c9428, this, this.f59743.mo29502(this.f59707));
    }

    /* JADX INFO: renamed from: ᩴ */
    private int m44550() {
        int iM14124 = 0;
        for (C6232 c6232 : this.f59728) {
            iM14124 += c6232.m14124();
        }
        return iM14124;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: ֫ */
    public long m44531(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f59728.length; i++) {
            if (!z) {
                C18301 c18301 = this.f59725;
                c18301.getClass();
                if (c18301.f54646[i]) {
                    jMax = Math.max(jMax, this.f59728[i].m14139());
                }
            } else {
                jMax = Math.max(jMax, this.f59728[i].m14139());
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: ᩵ */
    private boolean m44551() {
        return this.f59734 != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* JADX INFO: renamed from: ۘ */
    private void m44537() {
        C23877.m52960(this.f59703);
        this.f59725.getClass();
        this.f59741.getClass();
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f59702 = C21562.unmodifiableMap(map);
        C3601 c3601 = new C3601();
        c3601.m6701("icy");
        c3601.m6697("application/x-icy");
        f59700 = c3601.m6672();
    }
}
