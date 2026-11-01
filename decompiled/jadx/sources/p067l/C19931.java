package p067l;

import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ᩴۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19931 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ EditText f60502;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ AbstractActivityC5549 f60503;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ EditText f60504;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ EditText f60505;

    /* JADX INFO: renamed from: ܿ֫ */
    public final /* synthetic */ EditText f60506;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ EditText f60507;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19931(AbstractActivityC5549 abstractActivityC5549, Matcher matcher, AbstractActivityC5549 abstractActivityC55410, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        super(abstractActivityC5549, -1);
        this.f60503 = abstractActivityC55410;
        this.f60504 = editText;
        this.f60502 = editText2;
        this.f60506 = editText3;
        this.f60505 = editText4;
        this.f60507 = editText5;
        if (matcher.find()) {
            m33336((CharSequence) matcher.group(2));
        }
        TextView textViewM33341 = m33341();
        textViewM33341.setTextColor(C23223.f72984);
        textViewM33341.setLineSpacing(0.0f, 1.1f);
        textViewM33341.setTextSize(12.0f);
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (!strTrim.matches("[a-z0-9]{32}")) {
            m33349(R.string.MT_Protector);
            return;
        }
        m33348();
        new C24624(this.f60503, new C5849(this, strTrim), this.f60506, this.f60504, this.f60502).m22250();
    }
}
