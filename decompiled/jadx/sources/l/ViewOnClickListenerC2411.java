package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2411 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f7683;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3822 f7684;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8761 f7685;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f7686;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC2411(C3822 c3822, View view) {
        super(view);
        this.f7684 = c3822;
        this.f7683 = (TextView) view.findViewById(R.id.textView1);
        this.f7686 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3822 c3822 = this.f7684;
        InterfaceC15815 interfaceC15815 = c3822.f12241;
        C5732 c5732 = c3822.f12236;
        C8761 c8761 = this.f7685;
        interfaceC15815.mo5716(c5732, c8761.f26709, c8761.f26710);
        c3822.f12238.dismiss();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C3822 c3822 = this.f7684;
        InterfaceC15815 interfaceC15815 = c3822.f12241;
        C5732 c5732 = c3822.f12236;
        C8761 c8761 = this.f7685;
        interfaceC15815.mo5715(view, c5732, c8761.f26709, c8761.f26710);
        return true;
    }
}
