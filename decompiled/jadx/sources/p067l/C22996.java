package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22996 implements InterfaceC24947 {

    /* JADX INFO: renamed from: ֫ */
    public final C20266 f72321;

    /* JADX INFO: renamed from: ۧ */
    public final C5318 f72322;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f72323;

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ۧ */
    public final void mo8653() {
    }

    public C22996(InterfaceC22753 interfaceC22753, C5318 c5318) {
        C12782.m29334();
        this.f72322 = c5318;
        this.f72321 = new C20266(interfaceC22753);
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ֫ */
    public final void mo8651() {
        C20266 c20266 = this.f72321;
        c20266.m45775();
        try {
            c20266.mo4020(this.f72322);
            int i = 0;
            while (i != -1) {
                int iM45774 = (int) c20266.m45774();
                byte[] bArr = this.f72323;
                if (bArr == null) {
                    this.f72323 = new byte[1024];
                } else if (iM45774 == bArr.length) {
                    this.f72323 = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f72323;
                i = c20266.read(bArr2, iM45774, bArr2.length - iM45774);
            }
        } finally {
            C10685.m24613(c20266);
        }
    }
}
