package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5MU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnLongClickListenerC14606 extends AbstractC3255 implements View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f44700;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44701;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f44702;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f44703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10402 f44704;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f44705;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f44706;

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo29330() {
        return this instanceof C18841;
    }

    public AbstractViewOnLongClickListenerC14606(AbstractActivityC3346 abstractActivityC3346, View view) {
        super(view);
        this.f44701 = C21943.f70295;
        this.f44705 = abstractActivityC3346;
        C19890.m45741(view);
        view.setOnLongClickListener(this);
        this.f44702 = view.findViewById(R.id.MT_Protector);
        this.f44704 = (C10402) view.findViewById(R.id.icon);
        this.f44703 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f44700 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f44706 = imageView;
        if (imageView != null) {
            imageView.setOnTouchListener(this);
            imageView.setFocusable(true);
            imageView.setClickable(true);
            Drawable drawableM3234 = C0881.m3234(abstractActivityC3346, R.drawable.MT_Protector);
            C11003.requireNonNull(drawableM3234);
            Drawable drawableMutate = drawableM3234.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo32019(Resources.Theme theme) {
        C19890.m45741(this.itemView);
        this.f44703.setTextColor(C21943.f70275);
        TextView textView = this.f44700;
        if (textView != null) {
            textView.setTextColor(C21943.f70273);
        }
        ImageView imageView = this.f44706;
        if (imageView != null) {
            Drawable drawableM3234 = C0881.m3234(this.f44705, R.drawable.MT_Protector);
            C11003.requireNonNull(drawableM3234);
            Drawable drawableMutate = drawableM3234.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo29331(AbstractC3255 abstractC3255) {
        throw new RuntimeException("Don't support");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.f44706 || motionEvent.getActionMasked() != 0 || view.getVisibility() != 0) {
            return false;
        }
        AbstractC19902 bindingAdapter = getBindingAdapter();
        if (!(bindingAdapter instanceof C3318)) {
            return false;
        }
        ((C3318) bindingAdapter).m10152(this);
        return true;
    }
}
