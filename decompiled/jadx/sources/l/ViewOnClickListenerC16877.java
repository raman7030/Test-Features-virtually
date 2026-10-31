package l;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܽ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16877 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21236 f51785;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14760 f51786;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12002 f51787;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f51788;

    public /* synthetic */ ViewOnClickListenerC16877(C12002 c12002, ImageView imageView, InterfaceC14760 interfaceC14760, C21236 c21236) {
        this.f51787 = c12002;
        this.f51788 = imageView;
        this.f51786 = interfaceC14760;
        this.f51785 = c21236;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ColorStateList imageTintList = ((ImageView) view).getImageTintList();
        C11003.requireNonNull(imageTintList);
        int defaultColor = imageTintList.getDefaultColor();
        EnumC6357 enumC6357 = EnumC6357.IMMUTABLE;
        C12002 c12002 = this.f51787;
        c12002.f35932 = defaultColor;
        c12002.f35934 = enumC6357;
        this.f51788.setImageBitmap(this.f51786.mo32433(c12002));
        C21236 c21236 = this.f51785;
        if (c21236.mo48205()) {
            c21236.m48206();
            ((DialogInterfaceC0206) c21236.mo15808()).m1441(false);
        }
    }
}
