package p067l;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: renamed from: l.ۚۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7420 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C7420 f19405 = new C7420(1);

    @Override // p067l.InterfaceC17797
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        C13045.m29867(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
