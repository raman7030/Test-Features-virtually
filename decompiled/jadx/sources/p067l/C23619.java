package p067l;

import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.᩹ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes.dex */
public final class C23619 implements InterfaceC17583 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ZipOutputStream f75172;

    public C23619(ZipOutputStream zipOutputStream) {
        this.f75172 = zipOutputStream;
    }

    @Override // p067l.InterfaceC17583
    public final AbstractC25102 create() {
        C9009 c9009 = new C9009(1);
        C13561 c13561 = new C13561(c9009);
        return new C22949(this, c13561, c13561, c9009);
    }
}
