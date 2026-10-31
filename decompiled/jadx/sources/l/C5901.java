package l;

import android.widget.EditText;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5901 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18111;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18112;

    public /* synthetic */ C5901(int i, Object obj) {
        this.f18111 = i;
        this.f18112 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f18111) {
            case 0:
                return ((C11546) this.f18112).m28424((String) obj);
            case 1:
                String strSubstring = ((String) obj).substring(((String) this.f18112).length());
                int iIndexOf = strSubstring.indexOf(47);
                return iIndexOf == -1 ? strSubstring : strSubstring.substring(0, iIndexOf);
            case 2:
                EditText editText = (EditText) this.f18112;
                return editText.length() == 0 ? (CharSequence) obj : editText.getText();
            default:
                return ((MaterialDynamicColors) this.f18112).lambda$onSecondaryFixed$125((DynamicScheme) obj);
        }
    }
}
