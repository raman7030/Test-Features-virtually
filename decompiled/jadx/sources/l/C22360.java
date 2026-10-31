package l;

import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.᩹ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes.dex */
public final class C22360 implements InterfaceC16009 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ZipOutputStream f72446;

    public C22360(ZipOutputStream zipOutputStream) {
        this.f72446 = zipOutputStream;
    }

    @Override // l.InterfaceC16009
    public final AbstractC23920 create() {
        C6987 c6987 = new C6987(1);
        C11777 c11777 = new C11777(c6987);
        return new C21655(this, c11777, c11777, c6987);
    }
}
