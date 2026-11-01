package p067l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5MU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnLongClickListenerC16250 extends AbstractC5462 implements View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ */
    public final TextView f47806;

    /* JADX INFO: renamed from: ۙ */
    public int f47807;

    /* JADX INFO: renamed from: ۫ */
    public final View f47808;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f47809;

    /* JADX INFO: renamed from: ᩶ */
    public final C12255 f47810;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f47811;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f47812;

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo31385() {
        return this instanceof C20275;
    }

    public AbstractViewOnLongClickListenerC16250(AbstractActivityC5549 abstractActivityC5549, View view) {
        super(view);
        this.f47807 = C23223.f73006;
        this.f47811 = abstractActivityC5549;
        C21272.m48052(view);
        view.setOnLongClickListener(this);
        this.f47808 = view.findViewById(R.id.MT_Protector);
        this.f47810 = (C12255) view.findViewById(R.id.icon);
        this.f47809 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f47806 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f47812 = imageView;
        if (imageView != null) {
            imageView.setOnTouchListener(this);
            imageView.setFocusable(true);
            imageView.setClickable(true);
            Drawable drawableM5548 = C0886.m5548(abstractActivityC5549, R.drawable.MT_Protector);
            C12826.requireNonNull(drawableM5548);
            Drawable drawableMutate = drawableM5548.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo34117(Resources.Theme theme) {
        C21272.m48052(this.itemView);
        this.f47809.setTextColor(C23223.f72986);
        TextView textView = this.f47806;
        if (textView != null) {
            textView.setTextColor(C23223.f72984);
        }
        ImageView imageView = this.f47812;
        if (imageView != null) {
            Drawable drawableM5548 = C0886.m5548(this.f47811, R.drawable.MT_Protector);
            C12826.requireNonNull(drawableM5548);
            Drawable drawableMutate = drawableM5548.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo31386(AbstractC5462 abstractC5462) {
        throw new RuntimeException("Don't support");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.f47812 || motionEvent.getActionMasked() != 0 || view.getVisibility() != 0) {
            return false;
        }
        AbstractC21283 bindingAdapter = getBindingAdapter();
        if (!(bindingAdapter instanceof C5522)) {
            return false;
        }
        ((C5522) bindingAdapter).m12188(this);
        return true;
    }
}
