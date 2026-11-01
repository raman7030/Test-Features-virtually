package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹᩻ */
/* JADX INFO: compiled from: C4UM */
/* JADX INFO: loaded from: classes.dex */
public final class C1963 implements TransformationMethod {

    /* JADX INFO: renamed from: ᩸ */
    public Locale f75783;

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C1963(Context context) {
        this.f75783 = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f75783);
        }
        return null;
    }
}
