package p067l;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC20591 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public int f63652;

    /* JADX INFO: renamed from: ۙ */
    public int f63653;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C7179 f63654;

    /* JADX INFO: renamed from: ۫ */
    public final TextView f63655;

    /* JADX INFO: renamed from: ۬ */
    public String f63656;

    /* JADX INFO: renamed from: ᩶ */
    public final ImageView f63657;

    /* JADX INFO: renamed from: ᩸ */
    public final View f63658;

    /* JADX INFO: renamed from: ᩹ */
    public C9562 f63659;

    public ViewOnClickListenerC20591(C7179 c7179, View view) {
        this.f63654 = c7179;
        this.f63655 = (TextView) view.findViewById(R.id.textView1);
        View viewFindViewById = view.findViewById(R.id.MT_Protector);
        this.f63658 = viewFindViewById;
        this.f63657 = (ImageView) view.findViewById(R.id.MT_Protector);
        viewFindViewById.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46550(int i, String str) {
        this.f63653 = 0;
        this.f63652 = i;
        this.f63656 = str;
        ImageView imageView = this.f63657;
        imageView.setImageResource(R.drawable.MT_Protector);
        View view = this.f63658;
        view.setVisibility(0);
        view.setClickable(true);
        if (str.length() > 200) {
            str = str.substring(0, 200);
        }
        TextView textView = this.f63655;
        textView.setText(str);
        textView.setTextColor(C23223.f72986);
        imageView.setColorFilter(C23223.f72995);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46549(int i) {
        this.f63653 = i;
        TextView textView = this.f63655;
        ImageView imageView = this.f63657;
        if (i == 3) {
            imageView.setImageResource(R.drawable.MT_Protector);
            SpannableString spannableString = new SpannableString(C7050.m16224(R.string.MT_Protector));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setTextColor(C23223.f72986);
            imageView.setColorFilter(C23223.f72995);
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            textView.setTextColor(C23223.f72969);
            imageView.setColorFilter(C23223.f72969);
        } else if (i == 5) {
            imageView.setImageResource(R.drawable.MT_Protector);
            textView.setText(R.string.MT_Protector);
            textView.setTextColor(C23223.f72975);
            imageView.setColorFilter(C23223.f72975);
        } else {
            throw new IllegalArgumentException();
        }
        View view = this.f63658;
        view.setVisibility(0);
        view.setClickable(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f63653 == 0) {
            C7179 c7179 = this.f63654;
            c7179.f18755.m5404(this.f63652);
            c7179.f18755.m5408();
            C7179.m16503(c7179);
            c7179.m16520();
        }
    }
}
