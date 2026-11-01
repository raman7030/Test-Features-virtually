package p067l;

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
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC19846 extends AbstractC22529 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ */
    public TextView f60323;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ActivityC11800 f60324;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f60325;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView f60326;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC19846(ActivityC11800 activityC11800, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC11800).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f60324 = activityC11800;
        this.f60325 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f60323 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f60326 = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // p067l.AbstractC22529
    /* JADX INFO: renamed from: ֫ */
    public final void mo21060(AbstractC15562 abstractC15562) {
        abstractC15562.getClass();
        if (abstractC15562 instanceof C9528) {
            C9528 c9528Mo22194 = abstractC15562.mo22194();
            Drawable drawable = c9528Mo22194.f26091;
            AbstractC5094 abstractC5094 = c9528Mo22194.f26090;
            this.f60325.setImageDrawable(drawable);
            this.f60323.setText(c9528Mo22194.f26092);
            String strMo10845 = abstractC5094.mo10845();
            strMo10845.getClass();
            boolean zEquals = strMo10845.equals("builtin:systemTranslate");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f60326;
            if (zEquals) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.֫᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayList = (ArrayList) C16353.m37156();
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        String string = ApplicationC21448.f67649.getString("stid", null);
                        int[] iArr = {0};
                        if (!TextUtils.isEmpty(string)) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (((InterfaceC18365) arrayList.get(i)).mo41840().equals(string)) {
                                    iArr[0] = i;
                                    break;
                                }
                            }
                        }
                        PackageManager packageManagerM16217 = C7050.m16217();
                        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            charSequenceArr[i2] = ((InterfaceC18365) arrayList.get(i2)).mo41841(packageManagerM16217);
                        }
                        C20671 c20671BuildDialog = this.f9936.f60324.buildDialog();
                        c20671BuildDialog.m46727(R.string.MT_Protector);
                        c20671BuildDialog.m46723(charSequenceArr, iArr[0], new DialogInterfaceOnClickListenerC10479(1, iArr));
                        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18025(1, arrayList, iArr));
                        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c20671BuildDialog.m46732();
                    }
                });
            } else if (strMo10845.equals("builtin:function")) {
                imageView.setImageResource(R.drawable.MT_Protector);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C20671 c20671BuildDialog = this.f36910.f60324.buildDialog();
                        c20671BuildDialog.m46727(R.string.MT_Protector);
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
                onLongClickListener = new View.OnLongClickListener() { // from class: l.ܽ᩻ܿ
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
                        C20671 c20671BuildDialog = this.f55268.f60324.buildDialog();
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
        this.f60324.f32956.m7555(this);
        return false;
    }
}
