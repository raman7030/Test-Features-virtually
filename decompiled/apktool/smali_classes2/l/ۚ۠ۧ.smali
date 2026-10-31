.class public final Ll/ۚ۠ۧ;
.super Ljava/lang/Object;
.source "28G5"


# direct methods
.method public static ֫(Ll/᩹֡֫;)V
    .locals 5

    const v0, -0x800001

    const/high16 v1, -0x80000000

    .line 85
    invoke-virtual {p0, v0, v1}, Ll/᩹֡֫;->ۧ(FI)V

    .line 86
    invoke-virtual {p0}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-eqz v0, :cond_3

    .line 87
    invoke-virtual {p0}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spannable;

    if-nez v0, :cond_0

    .line 88
    invoke-virtual {p0}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    .line 91
    :cond_0
    invoke-virtual {p0}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    check-cast p0, Landroid/text/Spannable;

    .line 97
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p0, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 98
    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    .line 92
    instance-of v4, v3, Landroid/text/style/AbsoluteSizeSpan;

    if-nez v4, :cond_1

    instance-of v4, v3, Landroid/text/style/RelativeSizeSpan;

    if-eqz v4, :cond_2

    .line 100
    :cond_1
    invoke-interface {p0, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
