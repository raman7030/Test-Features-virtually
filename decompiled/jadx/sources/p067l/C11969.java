package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11969 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩸ */
    public int f33367;

    /* JADX INFO: renamed from: ᩹ */
    public C17450 f33368;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 2;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C17450 c17450 = this.f33368;
        if (this.f33367 == -1) {
            this.f33367 = c17450.f23817;
        }
        int i = this.f33367;
        if (i == -1) {
            throw new IOException(C6988.m16053("a file due to implementation issue:\n\t\t \"Can't retrieve CP Index for ", c17450 == null ? "null" : c17450.toString(), "\""));
        }
        ((C8121) interfaceC2756).m18818(i);
    }
}
