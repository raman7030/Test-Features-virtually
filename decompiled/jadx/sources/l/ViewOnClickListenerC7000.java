package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۜ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7000 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f21606;

    public ViewOnClickListenerC7000(Context context) {
        super(new C17939(context));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C11266.m27878(32.0f));
        int iM27878 = C11266.m27878(12.0f);
        marginLayoutParams.bottomMargin = iM27878;
        marginLayoutParams.topMargin = iM27878;
        marginLayoutParams.rightMargin = iM27878;
        marginLayoutParams.leftMargin = iM27878;
        this.itemView.setLayoutParams(marginLayoutParams);
        this.itemView.setBackground(C19890.m45742(context));
        this.itemView.setOnClickListener(this);
        ImageView imageView = (ImageView) this.itemView;
        this.f21606 = imageView;
        imageView.setImageTintList(C21943.f70273);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC19902 bindingAdapter = getBindingAdapter();
        if (bindingAdapter instanceof C23933) {
            C23933 c23933 = (C23933) bindingAdapter;
            ((C18289) c23933.f77613).accept((EnumC21999) c23933.f77614.get(getBindingAdapterPosition()));
        }
    }
}
