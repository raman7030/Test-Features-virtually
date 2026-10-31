package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9823 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2767 f29679;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f29680;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f29681;

    public C9823(C2767 c2767, C13132 c13132, TextView textView) {
        this.f29679 = c2767;
        this.f29681 = c13132;
        this.f29680 = textView;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        int size = this.f29679.f8597.size();
        TextView textView = this.f29680;
        C13132 c13132 = this.f29681;
        if (size == 0) {
            c13132.setVisibility(8);
            textView.setVisibility(0);
        } else {
            c13132.setVisibility(0);
            textView.setVisibility(8);
        }
    }
}
