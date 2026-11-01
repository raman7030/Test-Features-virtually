package p067l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes2.dex */
public final class C5741 extends AbstractC10214 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f14086;

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10914(View view) {
        return true;
    }

    public C5741(AbstractC17043 abstractC17043) {
        this.f14086 = abstractC17043;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final View mo10912(Main main) {
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        String[] strArr = {this.f14086.getName()};
        int i = C15128.f43179;
        textView.setText(C7050.m16203(R.string.MT_Protector, strArr));
        return viewM12252;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final void mo12797(DialogInterfaceC2564 dialogInterfaceC2564) {
        Button buttonM3860 = dialogInterfaceC2564.m3860();
        buttonM3860.setEnabled(false);
        C7050.m16206(800L, new RunnableC8487(3, buttonM3860));
    }
}
