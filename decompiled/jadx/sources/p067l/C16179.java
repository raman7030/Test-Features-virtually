package p067l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16179 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f47629;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f47630;

    public /* synthetic */ C16179(int i, View view) {
        this.f47629 = i;
        this.f47630 = view;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f47629) {
            case 0:
                ((C1326) this.f47630).setTitle((String) obj);
                break;
            default:
                ((TextView) this.f47630).setText((String) obj);
                break;
        }
    }
}
