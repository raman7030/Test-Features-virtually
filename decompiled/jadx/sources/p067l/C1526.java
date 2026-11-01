package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1526 {
    /* JADX INFO: renamed from: ֫ */
    public static void m35211(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static View.AccessibilityDelegate m35210(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35212(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m35215(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: ۧ */
    public static ContentCaptureSession m35214(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35213(View view, C1905 c1905) {
        view.setContentCaptureSession(null);
    }
}
