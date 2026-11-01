package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11753 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32847;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32848;

    public /* synthetic */ C11753(int i, Object obj) {
        this.f32847 = i;
        this.f32848 = obj;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f32847) {
            case 0:
                ((TextView) this.f32848).setText(C22422.m50361(((Integer) obj).intValue()));
                break;
            default:
                C22285.m50102((C22285) this.f32848, (Iterable) obj);
                break;
        }
    }
}
