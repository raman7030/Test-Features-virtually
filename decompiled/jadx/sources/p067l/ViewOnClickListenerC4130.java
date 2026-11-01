package p067l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4130 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public C22198 f9111;

    /* JADX INFO: renamed from: ۙ */
    public final TextView f9112;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C12848 f9113;

    /* JADX INFO: renamed from: ᩸ */
    public final int f9114;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f9115;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC4130(C12848 c12848, View view) {
        super(view);
        this.f9113 = c12848;
        this.f9112 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f9115 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f9114 = C12848.m29428(view);
        view.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8364(C22198 c22198) {
        CharSequence charSequence;
        this.f9111 = c22198;
        String str = c22198.f70208;
        C12848 c12848 = this.f9113;
        TextView textView = this.f9112;
        if (str != null) {
            textView.setText(str);
            textView.setTextColor(C0886.m5542(c12848.f36141, R.color.MT_Protector));
        } else {
            String str2 = c22198.f70204;
            boolean z = c22198.f70211;
            String string = c12848.f36141.getString(R.string.MT_Protector);
            if (z) {
                charSequence = str2;
                SpannableString spannableString = new SpannableString(C17588.m40053(str2, string));
                spannableString.setSpan(new ForegroundColorSpan(C23223.f72980), str2.length(), spannableString.length(), 33);
                charSequence = spannableString;
            }
            charSequence = str2;
            textView.setText(charSequence);
            textView.setTextColor(this.f9114);
        }
        this.f9115.setText(c12848.f36141.getString(R.string.MT_Protector, C24158.m53419(c22198.f70210), C18794.m42823(c22198.f70209)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C22198 c22198 = this.f9111;
        if (c22198 != null) {
            C12848.m29425(this.f9113, c22198);
        }
    }
}
