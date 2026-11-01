package p067l;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC18457 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C19799 f55172;

    /* JADX INFO: renamed from: ᩶ */
    public final ImageView f55173;

    /* JADX INFO: renamed from: ᩸ */
    public final Animatable f55174;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f55175;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public final void m42013(int i) {
        C19799 c19799 = this.f55172;
        String str = ((C13010) c19799.get(i)).f36613;
        TextView textView = this.f55175;
        textView.setText(str);
        int iMo18261 = c19799.mo18261();
        ImageView imageView = this.f55173;
        Animatable animatable = this.f55174;
        if (i == iMo18261) {
            textView.setTextColor(C23223.f72969);
            imageView.setVisibility(0);
            if (C22422.f70726.m4060() == Boolean.TRUE) {
                if (animatable.isRunning()) {
                    return;
                }
                animatable.start();
                return;
            } else {
                if (animatable.isRunning()) {
                    animatable.stop();
                    return;
                }
                return;
            }
        }
        textView.setTextColor(C23223.f72986);
        imageView.setVisibility(8);
        if (animatable.isRunning()) {
            animatable.stop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC18457(C19799 c19799, View view) {
        super(view);
        this.f55172 = c19799;
        this.f55175 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        this.f55173 = imageView;
        this.f55174 = (Animatable) imageView.getDrawable();
        view.setOnClickListener(this);
        C21272.m48055(view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        C19799 c19799 = this.f55172;
        int iMo18261 = c19799.mo18261();
        if (bindingAdapterPosition != iMo18261) {
            if (c19799.f60215.m20868(bindingAdapterPosition)) {
                this.f55173.setVisibility(0);
                AbstractC21283 bindingAdapter = getBindingAdapter();
                C12826.requireNonNull(bindingAdapter);
                bindingAdapter.notifyItemChanged(iMo18261);
                return;
            }
            return;
        }
        c19799.f60215.m20870();
    }
}
