package p067l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۜ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9022 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f24487;

    public ViewOnClickListenerC9022(Context context) {
        super(new C1732(context));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C13076.m29939(32.0f));
        int iM29939 = C13076.m29939(12.0f);
        marginLayoutParams.bottomMargin = iM29939;
        marginLayoutParams.topMargin = iM29939;
        marginLayoutParams.rightMargin = iM29939;
        marginLayoutParams.leftMargin = iM29939;
        this.itemView.setLayoutParams(marginLayoutParams);
        this.itemView.setBackground(C21272.m48053(context));
        this.itemView.setOnClickListener(this);
        ImageView imageView = (ImageView) this.itemView;
        this.f24487 = imageView;
        imageView.setImageTintList(C23223.f72984);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC21283 bindingAdapter = getBindingAdapter();
        if (bindingAdapter instanceof C25115) {
            C25115 c25115 = (C25115) bindingAdapter;
            ((C19751) c25115.f80365).accept((EnumC23276) c25115.f80366.get(getBindingAdapterPosition()));
        }
    }
}
