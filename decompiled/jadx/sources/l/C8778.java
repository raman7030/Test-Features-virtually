package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8778 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f26750 = new C17714(4);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15853 f26749 = new C15853(-1, -1, "image/heif");

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) throws EOFException, InterruptedIOException {
        C16184 c16184 = (C16184) interfaceC8424;
        c16184.mo22067(4, false);
        C17714 c17714 = this.f26750;
        c17714.m41481(4);
        c16184.mo22068(false, 0, 4, c17714.m41482());
        if (c17714.m41479() == 1718909296) {
            c17714.m41481(4);
            c16184.mo22068(false, 0, 4, c17714.m41482());
            if (c17714.m41479() == 1751476579) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f26749.mo4840(interfaceC21830);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        return this.f26749.mo4837(interfaceC8424, c23615);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f26749.mo4839(j, j2);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }
}
