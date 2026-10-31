package l;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: renamed from: l.֨ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1081 extends AbstractC16876 implements InterfaceC16233 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C1081 f3948 = new C1081(1);

    @Override // l.InterfaceC16233
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        C11233.m27805(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
