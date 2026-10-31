.class public abstract Ll/ܿ۬ۘ;
.super Ljava/lang/Object;
.source "C8ZQ"


# direct methods
.method public static ֫(Landroid/widget/TextView;)V
    .locals 4

    .line 77
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    .line 78
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    instance-of v0, p0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    .line 79
    move-object v0, p0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    const-class v3, Ll/֫۬ۘ;

    invoke-interface {v0, v2, p0, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    .line 66
    array-length v0, p0

    if-lez v0, :cond_1

    .line 68
    array-length v0, p0

    :goto_1
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 69
    check-cast v3, Ll/֫۬ۘ;

    invoke-virtual {v3, v1}, Ll/֫۬ۘ;->֫(Ll/۟ۗۘ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
