.class public final Ll/᩸۬ۡ;
.super Ljava/lang/Object;
.source "Z4GT"


# direct methods
.method public static ֫(Ll/ۤۨۡ;[ILl/۫ܽܽ;)Ll/ܶ۬ۡ;
    .locals 11

    .line 23
    new-instance v0, Ll/ܶ۬ۡ;

    array-length v1, p1

    invoke-direct {v0, p0, v1}, Ll/ܶ۬ۡ;-><init>(Ll/ۤۨۡ;I)V

    .line 24
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v1

    .line 25
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    .line 26
    aget v4, p1, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v1, :cond_3

    .line 28
    invoke-virtual {p0, v5}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v6

    if-ne v6, v4, :cond_2

    mul-int/lit8 v4, v3, 0x2

    .line 30
    invoke-virtual {p0, v5}, Ll/ۤۨۡ;->᩻(I)I

    move-result v6

    .line 31
    invoke-virtual {p0, v5}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    .line 33
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 34
    invoke-virtual {p2, v5, v6, v7}, Ll/۫ܽܽ;->֫(ILandroid/util/TypedValue;Z)V

    .line 35
    iget v5, v6, Landroid/util/TypedValue;->type:I

    .line 36
    iget v8, v6, Landroid/util/TypedValue;->data:I

    const/4 v9, 0x3

    if-ne v5, v9, :cond_0

    .line 38
    invoke-virtual {p0}, Ll/ۤۨۡ;->ܽ()Ll/۬ܿܽ;

    move-result-object v8

    iget-object v6, v6, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ll/۬ܿܽ;->ᩳ(Ljava/lang/String;)Ll/ۗܿܽ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۗܿܽ;->ܳ()I

    move-result v6

    move v10, v6

    move v6, v5

    move v5, v10

    goto :goto_2

    :cond_0
    move v6, v5

    move v5, v8

    .line 41
    :cond_1
    :goto_2
    iget-object v8, v0, Ll/ܶ۬ۡ;->֫:[I

    aput v6, v8, v4

    add-int/2addr v4, v7

    .line 42
    aput v5, v8, v4

    goto :goto_3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public static ֫(Ll/ܶ۬ۡ;Ll/ۤۨۡ;Ljava/lang/String;I)Ll/᩻ۗ;
    .locals 1

    const-string v0, "http://schemas.android.com/apk/res/android"

    .line 96
    invoke-virtual {p1, v0, p2}, Ll/ۤۨۡ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 104
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 105
    invoke-virtual {p0, p3, p1}, Ll/ܶ۬ۡ;->֫(ILandroid/util/TypedValue;)V

    .line 106
    iget p0, p1, Landroid/util/TypedValue;->type:I

    const/16 p2, 0x1c

    if-lt p0, p2, :cond_0

    const/16 p2, 0x1f

    if-gt p0, p2, :cond_0

    .line 108
    iget p0, p1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Ll/ᩴۗ;->֫(I)Ll/᩻ۗ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_2

    :cond_1
    const/high16 p0, -0x1000000

    .line 110
    invoke-static {p0}, Ll/ᩴۗ;->֫(I)Ll/᩻ۗ;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    .line 113
    invoke-static {p0}, Ll/ᩴۗ;->֫(I)Ll/᩻ۗ;

    move-result-object p0

    return-object p0
.end method
