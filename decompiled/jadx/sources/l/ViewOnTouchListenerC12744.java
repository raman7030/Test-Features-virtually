package l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC12744 extends AbstractC10628 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f38314;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6394 f38315;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f38316;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f38317;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC12744(ActivityC6394 activityC6394, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC6394).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f38315 = activityC6394;
        this.f38316 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f38314 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f38317 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // l.AbstractC10628
    /* JADX INFO: renamed from: ֫ */
    public final void mo26658(AbstractC20506 abstractC20506) {
        abstractC20506.getClass();
        if (abstractC20506 instanceof C4983) {
            final C4983 c4983Mo14470 = abstractC20506.mo14470();
            Drawable drawable = c4983Mo14470.f15700;
            AbstractC2867 abstractC2867 = c4983Mo14470.f15699;
            this.f38316.setImageDrawable(drawable);
            this.f38314.setText(c4983Mo14470.f15701);
            String strMo8778 = abstractC2867.mo8778();
            boolean zEquals = strMo8778.equals("builtin:toggleComment");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f38317;
            if (zEquals || strMo8778.equals("builtin:shrinkCode") || strMo8778.equals("builtin:formatCode")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C19258 c19258BuildDialog = this.f11324.f38315.buildDialog();
                        c19258BuildDialog.m44436(c4983Mo14470.f15701);
                        c19258BuildDialog.m44416(R.string.MT_Protector);
                        c19258BuildDialog.m44442(R.string.MT_Protector, null);
                        c19258BuildDialog.m44438();
                    }
                });
            } else if (abstractC2867 instanceof C4278) {
                final C4278 c4278 = (C4278) abstractC2867;
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new ViewOnClickListenerC0174(1, c4278));
                onLongClickListener = new View.OnLongClickListener() { // from class: l.۬᩻ܿ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        String strM14327;
                        C4278 c4279 = c4278;
                        C16709 c16709M32219 = C13265.m32219(c4279.m12862());
                        if (c16709M32219 != null) {
                            strM14327 = c16709M32219.m39302();
                        } else {
                            strM14327 = C4925.m14327(R.string.MT_Protector);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c4279.m12862()).append((CharSequence) "\n");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) c4279.m12863());
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length, length2, 18);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 18);
                        C19258 c19258BuildDialog = this.f40173.f38315.buildDialog();
                        c19258BuildDialog.m44436(strM14327);
                        c19258BuildDialog.m44424(spannableStringBuilder);
                        c19258BuildDialog.m44442(R.string.MT_Protector, null);
                        C8960.m23095(c19258BuildDialog.m44438());
                        return true;
                    }
                };
            } else {
                imageView.setVisibility(8);
                imageView.setOnClickListener(null);
            }
            this.itemView.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f38315.f19793.m5326(this);
        return false;
    }
}
