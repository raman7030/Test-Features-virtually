.class public final Ll/ܰۨ;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ֫(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .locals 0

    .line 5435
    invoke-virtual {p0}, Landroid/view/View;->getAccessibilityDelegate()Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    .locals 0

    .line 5429
    invoke-virtual/range {p0 .. p6}, Landroid/view/View;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/util/List;)V
    .locals 0

    .line 5440
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemGestureExclusionRects(Ljava/util/List;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/᩸۟;)V
    .locals 0

    const/4 p1, 0x0

    .line 5456
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentCaptureSession(Landroid/view/contentcapture/ContentCaptureSession;)V

    return-void
.end method

.method public static ۧ(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;
    .locals 0

    .line 5450
    invoke-virtual {p0}, Landroid/view/View;->getContentCaptureSession()Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Landroid/view/View;)Ljava/util/List;
    .locals 0

    .line 5445
    invoke-virtual {p0}, Landroid/view/View;->getSystemGestureExclusionRects()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
