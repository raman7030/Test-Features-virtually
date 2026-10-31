package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19185 extends AbstractC5073 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C19185 f60439 = new C19185();

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ֫ */
    public final String mo1204() {
        return "Access Key ID";
    }

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ۧ */
    public final String mo1206() {
        return "Secret Access Key";
    }

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo1207() {
        return true;
    }

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ܽ */
    public final String mo1208() {
        return "Cloudflare R2";
    }

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ܿ */
    public final String mo1209() {
        return "r2";
    }

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ᩳ */
    public final int mo1210() {
        return 5;
    }

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ֫ */
    public final void mo14619(AbstractActivityC3346 abstractActivityC3346, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        if (AbstractC3577.m10939(editText, R.string.MT_Protector) && AbstractC3577.m10939(editText2, R.string.MT_Protector)) {
            C18479 c18479 = new C18479(abstractActivityC3346, Pattern.compile("^(https?://)?([a-z0-9]{32})\\.r2\\.cloudflarestorage\\.com").matcher(editText4.getText().toString()), abstractActivityC3346, editText3, editText4, editText5, editText, editText2);
            c18479.m31258(R.string.cloudflare_account_id);
            c18479.m31256(R.string.MT_Protector);
            c18479.m31285();
            c18479.m31244();
            c18479.m31266(true);
        }
    }

    @Override // l.AbstractC5073
    /* JADX INFO: renamed from: ֫ */
    public final List mo1205(String str, String str2) {
        throw new RuntimeException();
    }
}
