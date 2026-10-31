.class public final Ll/ۙ֫֫;
.super Ljava/lang/Object;
.source "L5YG"


# direct methods
.method public static ֫(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 2

    .line 445
    instance-of v0, p0, Ll/᩶֫֫;

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 446
    check-cast p0, Ll/᩶֫֫;

    invoke-virtual {p0}, Ll/᩶֫֫;->֫()Landroid/view/ActionMode$Callback;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;
    .locals 2

    .line 424
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_1

    instance-of v0, p0, Ll/᩶֫֫;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 434
    :cond_0
    new-instance v0, Ll/᩶֫֫;

    invoke-direct {v0, p0, p1}, Ll/᩶֫֫;-><init>(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static ֫(Ll/ܳܺ;)Ll/֨ۤ;
    .locals 5

    .line 769
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 770
    new-instance v0, Ll/֨ۤ;

    invoke-static {p0}, Ll/᩸֫֫;->֫(Landroid/widget/TextView;)Landroid/text/PrecomputedText$Params;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/֨ۤ;-><init>(Landroid/text/PrecomputedText$Params;)V

    return-object v0

    .line 772
    :cond_0
    new-instance v2, Ll/ۚۤ;

    new-instance v3, Landroid/text/TextPaint;

    .line 773
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    invoke-direct {v2, v3}, Ll/ۚۤ;-><init>(Landroid/text/TextPaint;)V

    const/16 v3, 0x17

    if-lt v0, v3, :cond_1

    .line 775
    invoke-static {p0}, Ll/۠֫֫;->֫(Landroid/widget/TextView;)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۚۤ;->֫(I)V

    .line 776
    invoke-static {p0}, Ll/۠֫֫;->ᩳ(Landroid/widget/TextView;)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۚۤ;->ۧ(I)V

    .line 856
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v3

    instance-of v3, v3, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v3, :cond_2

    .line 858
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    :cond_2
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lt v0, v1, :cond_5

    .line 862
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    and-int/lit8 v0, v0, 0xf

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 868
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;

    move-result-object p0

    invoke-static {p0}, Ll/ܶ֫֫;->֫(Ljava/util/Locale;)Landroid/icu/text/DecimalFormatSymbols;

    move-result-object p0

    .line 869
    invoke-static {p0}, Ll/᩸֫֫;->֫(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;

    move-result-object p0

    aget-object p0, p0, v4

    .line 872
    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    .line 873
    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result p0

    if-eq p0, v3, :cond_4

    const/4 v0, 0x2

    if-ne p0, v0, :cond_3

    goto :goto_0

    .line 878
    :cond_3
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 876
    :cond_4
    :goto_0
    sget-object p0, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 885
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    if-ne v0, v3, :cond_6

    goto :goto_1

    :cond_6
    const/4 v3, 0x0

    .line 888
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getTextDirection()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    if-eqz v3, :cond_7

    .line 891
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 904
    :pswitch_0
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 902
    :pswitch_1
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 900
    :pswitch_2
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 898
    :pswitch_3
    sget-object p0, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 896
    :pswitch_4
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 894
    :pswitch_5
    sget-object p0, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 892
    :cond_7
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 778
    :goto_2
    invoke-virtual {v2, p0}, Ll/ۚۤ;->֫(Landroid/text/TextDirectionHeuristic;)V

    .line 779
    invoke-virtual {v2}, Ll/ۚۤ;->֫()Ll/֨ۤ;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Landroid/widget/TextView;I)V
    .locals 3

    .line 619
    invoke-static {p1}, Ll/ܰۤ;->֫(I)V

    .line 620
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 621
    invoke-static {p0, p1}, Ll/᩸֫֫;->֫(Landroid/widget/TextView;I)V

    return-void

    .line 625
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    .line 627
    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 628
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    goto :goto_0

    .line 630
    :cond_1
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 636
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_2

    add-int/2addr p1, v0

    .line 638
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 639
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    .line 638
    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_2
    return-void
.end method

.method public static ֫(Landroid/widget/TextView;IF)V
    .locals 2

    .line 748
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 749
    invoke-static {p0, p1, p2}, Ll/᩹֫֫;->֫(Landroid/widget/TextView;IF)V

    return-void

    .line 754
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 751
    invoke-static {p1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    .line 756
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p0, p1}, Ll/ۙ֫֫;->ܽ(Landroid/widget/TextView;I)V

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 943
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 944
    invoke-static {p0, p1}, Ll/۠֫֫;->֫(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    return-void

    .line 945
    :cond_0
    instance-of v0, p0, Ll/۫֫֫;

    if-eqz v0, :cond_1

    .line 946
    check-cast p0, Ll/۫֫֫;

    invoke-interface {p0, p1}, Ll/۫֫֫;->setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 977
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 978
    invoke-static {p0, p1}, Ll/۠֫֫;->֫(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    return-void

    .line 979
    :cond_0
    instance-of v0, p0, Ll/۫֫֫;

    if-eqz v0, :cond_1

    .line 980
    check-cast p0, Ll/۫֫֫;

    invoke-interface {p0, p1}, Ll/۫֫֫;->setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ܳܺ;Ll/֨ۤ;)V
    .locals 5

    .line 794
    invoke-virtual {p1}, Ll/֨ۤ;->ܽ()Landroid/text/TextDirectionHeuristic;

    move-result-object v0

    .line 912
    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 914
    :cond_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v3, :cond_1

    goto :goto_0

    .line 916
    :cond_1
    sget-object v4, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_2

    const/4 v2, 0x2

    goto :goto_0

    .line 918
    :cond_2
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_3

    const/4 v2, 0x3

    goto :goto_0

    .line 920
    :cond_3
    sget-object v4, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_4

    const/4 v2, 0x4

    goto :goto_0

    .line 922
    :cond_4
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_5

    const/4 v2, 0x5

    goto :goto_0

    :cond_5
    if-ne v0, v3, :cond_6

    const/4 v2, 0x6

    goto :goto_0

    :cond_6
    if-ne v0, v1, :cond_7

    const/4 v2, 0x7

    .line 794
    :cond_7
    :goto_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setTextDirection(I)V

    .line 796
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_9

    .line 797
    invoke-virtual {p1}, Ll/֨ۤ;->ᩳ()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v0

    .line 800
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {p1}, Ll/֨ۤ;->ᩳ()Landroid/text/TextPaint;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 803
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextScaleX()F

    move-result p1

    cmpl-float p1, v0, p1

    if-nez p1, :cond_8

    const/high16 p1, 0x40000000    # 2.0f

    div-float p1, v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr p1, v1

    .line 806
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextScaleX(F)V

    .line 808
    :cond_8
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextScaleX(F)V

    return-void

    .line 812
    :cond_9
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {p1}, Ll/֨ۤ;->ᩳ()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 816
    invoke-virtual {p1}, Ll/֨ۤ;->֫()I

    move-result v0

    invoke-static {p0, v0}, Ll/۠֫֫;->֫(Landroid/widget/TextView;I)V

    .line 817
    invoke-virtual {p1}, Ll/֨ۤ;->ۧ()I

    move-result p1

    invoke-static {p0, p1}, Ll/۠֫֫;->ۧ(Landroid/widget/TextView;I)V

    return-void
.end method

.method public static ֫(Ll/ܳܺ;Ll/۠ۤ;)V
    .locals 3

    .line 834
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    .line 837
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ll/᩸֫֫;->֫(Landroid/text/PrecomputedText;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 839
    :cond_0
    invoke-static {p0}, Ll/ۙ֫֫;->֫(Ll/ܳܺ;)Ll/֨ۤ;

    move-result-object v0

    .line 840
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ll/֨ۤ;->֫(Ll/֨ۤ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 843
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 841
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Given text can not be applied to TextView."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Landroid/widget/TextView;I)V
    .locals 3

    .line 662
    invoke-static {p1}, Ll/ܰۤ;->֫(I)V

    .line 664
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    .line 666
    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 667
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto :goto_0

    .line 669
    :cond_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 675
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_1

    sub-int/2addr p1, v0

    .line 677
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 678
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 677
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_1
    return-void
.end method

.method public static ܽ(Landroid/widget/TextView;I)V
    .locals 2

    .line 718
    invoke-static {p1}, Ll/ܰۤ;->֫(I)V

    .line 720
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 724
    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public static ᩳ(Landroid/widget/TextView;I)V
    .locals 2

    .line 201
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 202
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    return-void

    .line 204
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    return-void
.end method
