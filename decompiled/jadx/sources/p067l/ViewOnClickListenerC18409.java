package p067l;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܽ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18409 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C22551 f54966;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC16397 f54967;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13776 f54968;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ImageView f54969;

    public /* synthetic */ ViewOnClickListenerC18409(C13776 c13776, ImageView imageView, InterfaceC16397 interfaceC16397, C22551 c22551) {
        this.f54968 = c13776;
        this.f54969 = imageView;
        this.f54967 = interfaceC16397;
        this.f54966 = c22551;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ColorStateList imageTintList = ((ImageView) view).getImageTintList();
        C12826.requireNonNull(imageTintList);
        int defaultColor = imageTintList.getDefaultColor();
        EnumC8411 enumC8411 = EnumC8411.IMMUTABLE;
        C13776 c13776 = this.f54968;
        c13776.f38942 = defaultColor;
        c13776.f38944 = enumC8411;
        this.f54969.setImageBitmap(this.f54967.mo34535(c13776));
        C22551 c22551 = this.f54966;
        if (c22551.mo50536()) {
            c22551.m50537();
            ((DialogInterfaceC2564) c22551.mo17723()).m3854(false);
        }
    }
}
