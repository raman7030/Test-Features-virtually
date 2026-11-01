package p067l;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: renamed from: l.᩵ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20832 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C20832 f65460 = new C20832(1);

    @Override // p067l.InterfaceC17797
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        C13045.m29867(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
