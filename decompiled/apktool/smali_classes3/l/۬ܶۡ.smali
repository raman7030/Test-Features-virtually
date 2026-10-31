.class public final Ll/۬ܶۡ;
.super Ljava/lang/Object;
.source "37HW"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 33
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2794

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    .line 37
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    :cond_2
    add-int/lit8 v2, v1, 0x1

    const-string v3, "\ufffc"

    .line 39
    invoke-virtual {v0, v1, v2, v3}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 40
    new-instance v3, Ll/ۗܶۡ;

    invoke-direct {v3}, Ll/ۗܶۡ;-><init>()V

    const/16 v4, 0x21

    invoke-virtual {v0, v3, v1, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-nez v0, :cond_4

    return-object p0

    :cond_4
    return-object v0
.end method
