package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6521 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f20152;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f20153;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20154;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20155;

    public /* synthetic */ C6521(Object obj, View view, View view2, int i) {
        this.f20154 = i;
        this.f20155 = obj;
        this.f20153 = view;
        this.f20152 = view2;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f20154) {
            case 0:
                C9344 c9344 = (C9344) this.f20155;
                ((C12392) this.f20153).m30314(this.f20152, ((Boolean) obj).booleanValue() && !c9344.f28373, c9344.f28368);
                break;
            default:
                AbstractC12488.m30653((AbstractC12488) this.f20155, (TextView) this.f20153, (TextView) this.f20152);
                break;
        }
    }
}
