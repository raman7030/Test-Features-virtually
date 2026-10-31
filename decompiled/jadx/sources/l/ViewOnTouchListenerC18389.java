package l;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC18389 extends AbstractC21212 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f57103;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9923 f57104;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f57105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f57106;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC18389(ActivityC9923 activityC9923, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC9923).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f57104 = activityC9923;
        this.f57105 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f57103 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f57106 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // l.AbstractC21212
    /* JADX INFO: renamed from: ֫ */
    public final void mo19102(AbstractC13882 abstractC13882) {
        abstractC13882.getClass();
        if (abstractC13882 instanceof C7533) {
            C7533 c7533Mo20218 = abstractC13882.mo20218();
            Drawable drawable = c7533Mo20218.f23178;
            AbstractC2867 abstractC2867 = c7533Mo20218.f23177;
            this.f57105.setImageDrawable(drawable);
            this.f57103.setText(c7533Mo20218.f23179);
            String strMo8778 = abstractC2867.mo8778();
            strMo8778.getClass();
            boolean zEquals = strMo8778.equals("builtin:systemTranslate");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f57106;
            if (zEquals) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.֫᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayList = (ArrayList) C14714.m35009();
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        String string = ApplicationC20075.f65008.getString("stid", null);
                        int[] iArr = {0};
                        if (!TextUtils.isEmpty(string)) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (((InterfaceC16831) arrayList.get(i)).mo39604().equals(string)) {
                                    iArr[0] = i;
                                    break;
                                }
                            }
                        }
                        PackageManager packageManagerM14320 = C4925.m14320();
                        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            charSequenceArr[i2] = ((InterfaceC16831) arrayList.get(i2)).mo39605(packageManagerM14320);
                        }
                        C19258 c19258BuildDialog = this.f7150.f57104.buildDialog();
                        c19258BuildDialog.m44433(R.string.MT_Protector);
                        c19258BuildDialog.m44429(charSequenceArr, iArr[0], new DialogInterfaceOnClickListenerC8534(1, iArr));
                        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC16474(1, arrayList, iArr));
                        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c19258BuildDialog.m44438();
                    }
                });
            } else if (strMo8778.equals("builtin:function")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C19258 c19258BuildDialog = this.f33911.f57104.buildDialog();
                        c19258BuildDialog.m44433(R.string.MT_Protector);
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
                onLongClickListener = new View.OnLongClickListener() { // from class: l.ܽ᩻ܿ
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
                        C19258 c19258BuildDialog = this.f52088.f57104.buildDialog();
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
        this.f57104.f29998.m5326(this);
        return false;
    }
}
