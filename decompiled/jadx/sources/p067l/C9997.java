package p067l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.۠۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes3.dex */
public final class C9997 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3669 f27678;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3962 f27679;

    /* JADX INFO: renamed from: ܽ */
    public final Uri f27680;

    public C9997(InterfaceC3669 interfaceC3669, InterfaceC3962 interfaceC3962, Uri uri) {
        this.f27678 = interfaceC3669;
        this.f27679 = interfaceC3962;
        this.f27680 = uri;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        return this.f27678.mo7079(interfaceC10375);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return this.f27678.mo7080();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f27678.mo7078(new C3291(interfaceC23116, this.f27679, this.f27680));
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        return this.f27678.mo7075(interfaceC10375, c24812);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f27678.mo7077(j, j2);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
        this.f27678.mo7076();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this.f27678.mo7081();
    }
}
