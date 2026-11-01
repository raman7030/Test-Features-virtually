package p067l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8566 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ View f23030;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ View f23031;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23032;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f23033;

    public /* synthetic */ C8566(Object obj, View view, View view2, int i) {
        this.f23032 = i;
        this.f23033 = obj;
        this.f23031 = view;
        this.f23030 = view2;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f23032) {
            case 0:
                C11249 c11249 = (C11249) this.f23033;
                ((C14146) this.f23031).m32378(this.f23030, ((Boolean) obj).booleanValue() && !c11249.f31322, c11249.f31317);
                break;
            default:
                AbstractC14237.m32718((AbstractC14237) this.f23033, (TextView) this.f23031, (TextView) this.f23030);
                break;
        }
    }
}
