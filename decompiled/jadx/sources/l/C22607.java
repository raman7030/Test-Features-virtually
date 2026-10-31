package l;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C4UM */
/* JADX INFO: loaded from: classes.dex */
public final class C22607 implements TransformationMethod {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Locale f73055;

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C22607(Context context) {
        this.f73055 = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f73055);
        }
        return null;
    }
}
