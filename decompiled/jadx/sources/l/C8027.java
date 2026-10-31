package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.۠۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes3.dex */
public final class C8027 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1368 f24764;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1677 f24765;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Uri f24766;

    public C8027(InterfaceC1368 interfaceC1368, InterfaceC1677 interfaceC1677, Uri uri) {
        this.f24764 = interfaceC1368;
        this.f24765 = interfaceC1677;
        this.f24766 = uri;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return this.f24764.mo4841(interfaceC8424);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return this.f24764.mo4842();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f24764.mo4840(new C0971(interfaceC21830, this.f24765, this.f24766));
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        return this.f24764.mo4837(interfaceC8424, c23615);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f24764.mo4839(j, j2);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
        this.f24764.mo4838();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this.f24764.mo4843();
    }
}
