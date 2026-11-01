package p067l;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12858 extends SingleLineTransformationMethod {

    /* JADX INFO: renamed from: ᩸ */
    public Locale f36171;

    public C12858(Context context) {
        this.f36171 = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f36171);
        }
        return null;
    }
}
