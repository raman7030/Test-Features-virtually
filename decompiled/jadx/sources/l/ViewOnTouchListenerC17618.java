package l;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC17618 extends AbstractC3255 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ImageView f53829;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f53830;

    public ViewOnTouchListenerC17618(AbstractActivityC3346 abstractActivityC3346, View view) {
        super(view);
        C19890.m45741(view);
        this.f53830 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f53829 = imageView;
        Drawable drawableM3234 = C0881.m3234(abstractActivityC3346, R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM3234);
        Drawable drawableMutate = drawableM3234.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41179(C13900 c13900, C1556 c1556) {
        this.f53830.setText(c13900.f41424);
        this.f53829.setTag(c1556);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        Object tag = view.getTag();
        if (!(tag instanceof C1556)) {
            return false;
        }
        ((C1556) tag).m5326(this);
        return false;
    }
}
