.class public final Ll/֫ۡ;
.super Ljava/lang/Object;
.source "B4VX"


# static fields
.field public static ۠ۤۜ:Z


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V
    .locals 0

    if-eqz p0, :cond_1

    .line 28
    iget-object p0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez p0, :cond_1

    .line 31
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 32
    :goto_0
    instance-of p2, p0, Landroid/view/View;

    if-eqz p2, :cond_1

    .line 33
    instance-of p2, p0, Ll/᩶ᩴ;

    if-eqz p2, :cond_0

    .line 34
    check-cast p0, Ll/᩶ᩴ;

    invoke-interface {p0}, Ll/᩶ᩴ;->getHint()Ljava/lang/CharSequence;

    move-result-object p0

    iput-object p0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    return-void

    .line 37
    :cond_0
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫ܿۨ([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۖܽۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public static ۜۡ֫(I)V
    .locals 0

    invoke-static {p0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void
.end method

.method public static ۠ܺ᩻()Z
    .locals 1

    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    return v0
.end method

.method public static ۢܰܶ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;
    .locals 0

    check-cast p0, Landroid/animation/ObjectAnimator;

    invoke-virtual {p0, p1, p2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static ۧܺۖ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static ۬᩺֡(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0
.end method

.method public static ܰ᩷ܺ(Ljava/lang/Object;I)C
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    return p0
.end method

.method public static ܳۚۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/֡ܶۡ;

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/֡ܶۡ;->֫([Ljava/lang/String;)V

    return-void
.end method

.method public static ᩳܳۙ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    return-void
.end method

.method public static ᩸֫ۡ()I
    .locals 1

    const v0, 0x6e40b6be

    return v0
.end method

.method public static ᩸ۚ᩶(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    return p0
.end method

.method public static ᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;
    .locals 0

    check-cast p0, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Lbin/mt/plugin/api/PluginContext;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻ۨۖ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    move-result p0

    return p0
.end method

.method public static ᩻ܳܽ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0
.end method
