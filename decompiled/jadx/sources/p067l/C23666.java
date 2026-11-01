package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23666 implements InterfaceC11441, InterfaceC19583 {

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f75343;

    /* JADX INFO: renamed from: ۗ */
    public final C10307 f75344;

    /* JADX INFO: renamed from: ۙ */
    public final C10099 f75345;

    /* JADX INFO: renamed from: ۛ */
    public byte[] f75346;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC2830 f75347;

    /* JADX INFO: renamed from: ۤ */
    public boolean f75348;

    /* JADX INFO: renamed from: ۨ */
    public int f75349;

    /* JADX INFO: renamed from: ۫ */
    public final C10866 f75350;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC12878 f75351;

    /* JADX INFO: renamed from: ܰ */
    public final C8243 f75352;

    /* JADX INFO: renamed from: ᩶ */
    public final long f75353;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC16716 f75354;

    /* JADX INFO: renamed from: ᩹ */
    public final C5318 f75355;

    /* JADX INFO: renamed from: ᩺ */
    public final ArrayList f75356 = new ArrayList();

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13091(long j, C11491 c11491) {
        return j;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13093(long j, boolean z) {
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܽ */
    public final long mo13098() {
        return -9223372036854775807L;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܿ */
    public final void mo13100() {
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final C18912 mo14657(InterfaceC24947 interfaceC24947, long j, long j2, IOException iOException, int i) {
        C18912 c18912M25032;
        C20266 c20266 = ((C22996) interfaceC24947).f72321;
        c20266.getClass();
        C12782 c12782 = new C12782(j2, c20266.m45773());
        C5792.m13013(this.f75353);
        C4160 c4160 = new C4160(iOException, i);
        InterfaceC12878 interfaceC12878 = this.f75351;
        long jMo29503 = interfaceC12878.mo29503(c4160);
        boolean z = jMo29503 == -9223372036854775807L || i >= interfaceC12878.mo29502(1);
        if (this.f75343 && z) {
            C21334.m48350("Loading failed, treating as end-of-stream.", iOException);
            this.f75348 = true;
            c18912M25032 = C10866.f30117;
        } else if (jMo29503 != -9223372036854775807L) {
            c18912M25032 = C10866.m25032(jMo29503, false);
        } else {
            c18912M25032 = C10866.f30116;
        }
        C18912 c18912 = c18912M25032;
        this.f75345.m23561(c12782, 1, -1, this.f75344, 0, null, 0L, this.f75353, iOException, !c18912.m43018());
        return c18912;
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14658(InterfaceC24947 interfaceC24947, long j, long j2) {
        C22996 c22996 = (C22996) interfaceC24947;
        this.f75349 = (int) c22996.f72321.m45774();
        byte[] bArr = c22996.f72323;
        bArr.getClass();
        this.f75346 = bArr;
        this.f75348 = true;
        C20266 c20266 = c22996.f72321;
        c20266.getClass();
        C12782 c12782 = new C12782(j2, c20266.m45773());
        this.f75351.getClass();
        this.f75345.m23564(c12782, 1, -1, this.f75344, 0, null, 0L, this.f75353);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14659(InterfaceC24947 interfaceC24947, long j, long j2, int i) {
        C12782 c12782;
        C22996 c22996 = (C22996) interfaceC24947;
        C20266 c20266 = c22996.f72321;
        if (i == 0) {
            c12782 = new C12782(c22996.f72322);
        } else {
            c20266.getClass();
            c12782 = new C12782(j2, c20266.m45773());
        }
        this.f75345.m23560(c12782, 1, -1, this.f75344, 0, null, 0L, this.f75353, i);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14660(InterfaceC24947 interfaceC24947, long j, long j2, boolean z) {
        C20266 c20266 = ((C22996) interfaceC24947).f72321;
        c20266.getClass();
        C12782 c12782 = new C12782(j2, c20266.m45773());
        this.f75351.getClass();
        this.f75345.m23559(c12782, 1, -1, null, 0, null, 0L, this.f75353);
    }

    public C23666(C5318 c5318, InterfaceC16716 interfaceC16716, InterfaceC2830 interfaceC2830, C10307 c10307, long j, InterfaceC12878 interfaceC12878, C10099 c10099, boolean z, InterfaceExecutorC10195 interfaceExecutorC10195) {
        C10866 c10866;
        this.f75355 = c5318;
        this.f75354 = interfaceC16716;
        this.f75347 = interfaceC2830;
        this.f75344 = c10307;
        this.f75353 = j;
        this.f75351 = interfaceC12878;
        this.f75345 = c10099;
        this.f75343 = z;
        this.f75352 = new C8243(new C15020("", c10307));
        if (interfaceExecutorC10195 != null) {
            c10866 = new C10866(interfaceExecutorC10195);
        } else {
            c10866 = new C10866("SingleSampleMediaPeriod");
        }
        this.f75350 = c10866;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13097(InterfaceC22170 interfaceC22170, long j) {
        interfaceC22170.mo13096((InterfaceC11441) this);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ᩻ */
    public final C8243 mo13102() {
        return this.f75352;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13092(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC11617Arr.length; i++) {
            InterfaceC20314 interfaceC20314 = interfaceC20314Arr[i];
            ArrayList arrayList = this.f75356;
            if (interfaceC20314 != null && (interfaceC11617Arr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC20314);
                interfaceC20314Arr[i] = null;
            }
            if (interfaceC20314Arr[i] == null && interfaceC11617Arr[i] != null) {
                C16959 c16959 = new C16959(this);
                arrayList.add(c16959);
                interfaceC20314Arr[i] = c16959;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        if (this.f75348) {
            return false;
        }
        C10866 c10866 = this.f75350;
        if (c10866.m25042() || c10866.m25041()) {
            return false;
        }
        InterfaceC22753 interfaceC22753Mo8449 = this.f75354.mo8449();
        InterfaceC2830 interfaceC2830 = this.f75347;
        if (interfaceC2830 != null) {
            interfaceC22753Mo8449.mo8132(interfaceC2830);
        }
        c10866.m25039(new C22996(interfaceC22753Mo8449, this.f75355), this, this.f75351.mo29502(1));
        return true;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f75350.m25042();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        return (this.f75348 || this.f75350.m25042()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        return this.f75348 ? Long.MIN_VALUE : 0L;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13090(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f75356;
            if (i >= arrayList.size()) {
                return j;
            }
            ((C16959) arrayList.get(i)).m38546();
            i++;
        }
    }
}
