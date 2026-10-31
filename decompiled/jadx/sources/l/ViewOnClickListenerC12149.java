package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12149 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36255;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36256;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36257;

    public /* synthetic */ ViewOnClickListenerC12149(Object obj, Object obj2, Object obj3, int i) {
        this.f36256 = i;
        this.f36257 = obj;
        this.f36255 = obj2;
        this.f36254 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36256) {
            case 0:
                C11026.m27368((C11026) this.f36257, (C20864) this.f36255, (DialogInterfaceC0206) this.f36254);
                break;
            default:
                C13412.m32430((C13412) this.f36257, (AbstractActivityC3346) this.f36255, (C12002) this.f36254);
                break;
        }
    }
}
