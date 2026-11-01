package p067l;

import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes5.dex */
public final class C20602 extends AbstractC7190 {

    /* JADX INFO: renamed from: ֫ */
    public static final C20602 f63669 = new C20602();

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ֫ */
    public final String mo3606() {
        return "Access Key ID";
    }

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ۧ */
    public final String mo3608() {
        return "Secret Access Key";
    }

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3609() {
        return true;
    }

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ܽ */
    public final String mo3610() {
        return "Cloudflare R2";
    }

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ܿ */
    public final String mo3611() {
        return "r2";
    }

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3612() {
        return 5;
    }

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ֫ */
    public final void mo16527(AbstractActivityC5549 abstractActivityC5549, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        if (AbstractC5769.m12916(editText, R.string.MT_Protector) && AbstractC5769.m12916(editText2, R.string.MT_Protector)) {
            C19931 c19931 = new C19931(abstractActivityC5549, Pattern.compile("^(https?://)?([a-z0-9]{32})\\.r2\\.cloudflarestorage\\.com").matcher(editText4.getText().toString()), abstractActivityC5549, editText3, editText4, editText5, editText, editText2);
            c19931.m33344(R.string.cloudflare_account_id);
            c19931.m33342(R.string.MT_Protector);
            c19931.m33371();
            c19931.m33330();
            c19931.m33352(true);
        }
    }

    @Override // p067l.AbstractC7190
    /* JADX INFO: renamed from: ֫ */
    public final List mo3607(String str, String str2) {
        throw new RuntimeException();
    }
}
