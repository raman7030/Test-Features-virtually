.class public final Ll/᩸֫֫;
.super Ljava/lang/Object;
.source "L5YG"


# direct methods
.method public static ֫(Landroid/widget/TextView;)Landroid/text/PrecomputedText$Params;
    .locals 0

    .line 1066
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextMetricsParams()Landroid/text/PrecomputedText$Params;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/text/PrecomputedText;)Ljava/lang/CharSequence;
    .locals 0

    .line 1076
    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static ֫(Landroid/widget/TextView;I)V
    .locals 0

    .line 1061
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method public static ֫(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;
    .locals 0

    .line 1071
    invoke-virtual {p0}, Landroid/icu/text/DecimalFormatSymbols;->getDigitStrings()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
