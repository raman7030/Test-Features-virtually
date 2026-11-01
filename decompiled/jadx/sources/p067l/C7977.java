package p067l;

import android.widget.EditText;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7977 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20966;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f20967;

    public /* synthetic */ C7977(int i, Object obj) {
        this.f20966 = i;
        this.f20967 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f20966) {
            case 0:
                return ((C13342) this.f20967).m30470((String) obj);
            case 1:
                String strSubstring = ((String) obj).substring(((String) this.f20967).length());
                int iIndexOf = strSubstring.indexOf(47);
                return iIndexOf == -1 ? strSubstring : strSubstring.substring(0, iIndexOf);
            case 2:
                EditText editText = (EditText) this.f20967;
                return editText.length() == 0 ? (CharSequence) obj : editText.getText();
            default:
                return ((MaterialDynamicColors) this.f20967).lambda$onSecondaryFixed$125((DynamicScheme) obj);
        }
    }
}
