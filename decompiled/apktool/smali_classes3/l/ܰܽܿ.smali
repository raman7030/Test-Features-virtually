.class public final Ll/ܰܽܿ;
.super Ljava/lang/Object;
.source "V7S3"


# direct methods
.method public static ֫(Landroid/text/TextWatcher;Ljava/lang/CharSequence;III)V
    .locals 4

    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p4

    add-int/2addr v0, p3

    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const v2, 0x186a0

    .line 17
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lt p2, v2, :cond_0

    goto :goto_0

    :cond_0
    sub-int v3, v0, p2

    .line 26
    invoke-static {p3, v3}, Ljava/lang/Math;->min(II)I

    move-result p3

    sub-int/2addr v2, p2

    .line 27
    invoke-static {p4, v2}, Ljava/lang/Math;->min(II)I

    move-result p4

    sub-int/2addr v0, p3

    add-int/2addr v0, p4

    .line 30
    new-instance v2, Ll/᩺ܽܿ;

    invoke-direct {v2, v0, p1}, Ll/᩺ܽܿ;-><init>(ILjava/lang/CharSequence;)V

    check-cast p0, Ll/ۙܽܿ;

    invoke-virtual {p0, v2, p2, p3, p4}, Ll/ۙܽܿ;->onTextChanged(Ljava/lang/CharSequence;III)V

    if-ne v1, v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 p2, 0x0

    if-le v1, v0, :cond_2

    .line 37
    new-instance p3, Ll/᩺ܽܿ;

    invoke-direct {p3, v1, p1}, Ll/᩺ܽܿ;-><init>(ILjava/lang/CharSequence;)V

    sub-int/2addr v1, v0

    invoke-interface {p0, p3, v0, p2, v1}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    return-void

    .line 39
    :cond_2
    new-instance p3, Ll/᩺ܽܿ;

    invoke-direct {p3, v1, p1}, Ll/᩺ܽܿ;-><init>(ILjava/lang/CharSequence;)V

    sub-int/2addr v0, v1

    invoke-interface {p0, p3, v1, v0, p2}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    return-void
.end method
