package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.᩵᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8HW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21105 implements InterfaceC20790 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f66344 = new byte[4096];

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo10501(long j) {
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10502(long j, int i, int i2, int i3, C20119 c20119) {
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10503(C10307 c10307) {
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ۧ */
    public final int mo10505(InterfaceC11649 interfaceC11649, int i, boolean z) throws EOFException {
        byte[] bArr = this.f66344;
        int i2 = interfaceC11649.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10500(int i, C19203 c19203) {
        c19203.m43724(i);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10504(C19203 c19203, int i, int i2) {
        c19203.m43724(i);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final int mo10498(InterfaceC11649 interfaceC11649, int i, boolean z) {
        return mo10505(interfaceC11649, i, z);
    }
}
