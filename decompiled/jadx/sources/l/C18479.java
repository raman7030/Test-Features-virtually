package l;

import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ᩴۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes5.dex */
public final class C18479 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f57283;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f57284;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f57285;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f57286;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f57287;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f57288;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18479(AbstractActivityC3346 abstractActivityC3346, Matcher matcher, AbstractActivityC3346 abstractActivityC3347, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        super(abstractActivityC3346, -1);
        this.f57284 = abstractActivityC3347;
        this.f57285 = editText;
        this.f57283 = editText2;
        this.f57287 = editText3;
        this.f57286 = editText4;
        this.f57288 = editText5;
        if (matcher.find()) {
            m31250((CharSequence) matcher.group(2));
        }
        TextView textViewM31255 = m31255();
        textViewM31255.setTextColor(C21943.f70273);
        textViewM31255.setLineSpacing(0.0f, 1.1f);
        textViewM31255.setTextSize(12.0f);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        if (!strTrim.matches("[a-z0-9]{32}")) {
            m31263(R.string.MT_Protector);
            return;
        }
        m31262();
        new C23417(this.f57284, new C3662(this, strTrim), this.f57287, this.f57285, this.f57283).m20274();
    }
}
