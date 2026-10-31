package l;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: renamed from: l.᩵ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19427 extends AbstractC16876 implements InterfaceC16233 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C19427 f62847 = new C19427(1);

    @Override // l.InterfaceC16233
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        C11233.m27805(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
