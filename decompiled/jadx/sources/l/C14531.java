package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14531 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44523;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f44524;

    public /* synthetic */ C14531(int i, View view) {
        this.f44523 = i;
        this.f44524 = view;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f44523) {
            case 0:
                ((C9762) this.f44524).setTitle((String) obj);
                break;
            default:
                ((TextView) this.f44524).setText((String) obj);
                break;
        }
    }
}
