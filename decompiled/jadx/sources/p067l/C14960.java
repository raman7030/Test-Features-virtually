package p067l;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: l.۬ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: BB1T */
/* JADX INFO: loaded from: classes3.dex */
public final class C14960 implements TransformationMethod {

    /* JADX INFO: renamed from: ᩸ */
    public final TransformationMethod f42741;

    public C14960(TransformationMethod transformationMethod) {
        this.f42741 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f42741;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C8946.m20666().m20667() != 1) {
            return charSequence;
        }
        C8946 c8946M20666 = C8946.m20666();
        c8946M20666.getClass();
        return c8946M20666.m20668(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f42741;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final TransformationMethod m34256() {
        return this.f42741;
    }
}
