package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13787 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33095(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m33094(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33096(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m33099(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ContentCaptureSession m33098(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33097(View view, C21426 c21426) {
        view.setContentCaptureSession(null);
    }
}
