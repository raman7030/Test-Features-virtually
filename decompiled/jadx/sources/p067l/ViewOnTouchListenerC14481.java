package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC14481 extends AbstractC12470 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ */
    public TextView f41354;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ActivityC8446 f41355;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f41356;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView f41357;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC14481(ActivityC8446 activityC8446, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC8446).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f41355 = activityC8446;
        this.f41356 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f41354 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f41357 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // p067l.AbstractC12470
    /* JADX INFO: renamed from: ֫ */
    public final void mo28698(AbstractC21858 abstractC21858) {
        abstractC21858.getClass();
        if (abstractC21858 instanceof C7105) {
            final C7105 c7105Mo16374 = abstractC21858.mo16374();
            Drawable drawable = c7105Mo16374.f18534;
            AbstractC5094 abstractC5094 = c7105Mo16374.f18533;
            this.f41356.setImageDrawable(drawable);
            this.f41354.setText(c7105Mo16374.f18535);
            String strMo10845 = abstractC5094.mo10845();
            boolean zEquals = strMo10845.equals("builtin:toggleComment");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f41357;
            if (zEquals || strMo10845.equals("builtin:shrinkCode") || strMo10845.equals("builtin:formatCode")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C20671 c20671BuildDialog = this.f14130.f41355.buildDialog();
                        c20671BuildDialog.m46730(c7105Mo16374.f18535);
                        c20671BuildDialog.m46710(R.string.MT_Protector);
                        c20671BuildDialog.m46736(R.string.MT_Protector, null);
                        c20671BuildDialog.m46732();
                    }
                });
            } else if (abstractC5094 instanceof C6435) {
                final C6435 c6435 = (C6435) abstractC5094;
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new ViewOnClickListenerC2534(1, c6435));
                onLongClickListener = new View.OnLongClickListener() { // from class: l.۬᩻ܿ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        String strM16224;
                        C6435 c6436 = c6435;
                        C18249 c18249M34318 = C14976.m34318(c6436.m14726());
                        if (c18249M34318 != null) {
                            strM16224 = c18249M34318.m41538();
                        } else {
                            strM16224 = C7050.m16224(R.string.MT_Protector);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c6436.m14726()).append((CharSequence) "\n");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) c6436.m14727());
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), length, length2, 18);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 18);
                        C20671 c20671BuildDialog = this.f43244.f41355.buildDialog();
                        c20671BuildDialog.m46730(strM16224);
                        c20671BuildDialog.m46718(spannableStringBuilder);
                        c20671BuildDialog.m46736(R.string.MT_Protector, null);
                        C10884.m25069(c20671BuildDialog.m46732());
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
        this.f41355.f22666.m7555(this);
        return false;
    }
}
