.class public final Ll/ܰۡ;
.super Ljava/lang/Object;
.source "S566"


# direct methods
.method public static ֫(Landroid/widget/TextView;)I
    .locals 0

    .line 746
    invoke-virtual {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/widget/TextView;IIII)V
    .locals 0

    .line 753
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;[II)V
    .locals 0

    .line 760
    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Ljava/lang/String;)Z
    .locals 0

    .line 741
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
