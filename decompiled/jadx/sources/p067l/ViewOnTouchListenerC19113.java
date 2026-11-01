package p067l;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC19113 extends AbstractC5462 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸ */
    public final ImageView f57023;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f57024;

    public ViewOnTouchListenerC19113(AbstractActivityC5549 abstractActivityC5549, View view) {
        super(view);
        C21272.m48052(view);
        this.f57024 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f57023 = imageView;
        Drawable drawableM5548 = C0886.m5548(abstractActivityC5549, R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM5548);
        Drawable drawableMutate = drawableM5548.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43425(C15579 c15579, C3847 c3847) {
        this.f57024.setText(c15579.f44505);
        this.f57023.setTag(c3847);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        Object tag = view.getTag();
        if (!(tag instanceof C3847)) {
            return false;
        }
        ((C3847) tag).m7555(this);
        return false;
    }
}
