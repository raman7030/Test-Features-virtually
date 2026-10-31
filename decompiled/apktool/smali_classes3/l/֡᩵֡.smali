.class public final Ll/֡᩵֡;
.super Ll/ܺ֨֡;
.source "F925"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 10

    .line 77
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܽ()I

    move-result p2

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-lt p2, v0, :cond_0

    goto/16 :goto_5

    .line 82
    :cond_0
    invoke-virtual {p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result v0

    .line 84
    invoke-virtual {p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    .line 99
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, v0

    :goto_0
    const/16 v7, 0x7e

    const/16 v8, 0x60

    if-ge v6, v2, :cond_3

    .line 102
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-eq v9, v8, :cond_2

    if-eq v9, v7, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    const/4 v2, 0x3

    if-lt v4, v2, :cond_5

    if-nez v5, :cond_5

    add-int v2, v0, v4

    .line 116
    invoke-static {v8, p1, v2}, Ll/ۡ۠ۘ;->֫(CLjava/lang/CharSequence;I)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_4

    goto :goto_3

    .line 119
    :cond_4
    new-instance p1, Ll/ۚ᩵֡;

    invoke-direct {p1, v8, v4, p2}, Ll/ۚ᩵֡;-><init>(CII)V

    goto :goto_4

    :cond_5
    if-lt v5, v2, :cond_6

    if-nez v4, :cond_6

    .line 122
    new-instance p1, Ll/ۚ᩵֡;

    invoke-direct {p1, v7, v5, p2}, Ll/ۚ᩵֡;-><init>(CII)V

    goto :goto_4

    :cond_6
    :goto_3
    move-object p1, v1

    :goto_4
    if-eqz p1, :cond_7

    const/4 p2, 0x1

    new-array p2, p2, [Ll/ۖ֨֡;

    aput-object p1, p2, v3

    .line 17
    new-instance v1, Ll/᩷᩵֡;

    invoke-direct {v1, p2}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 86
    invoke-static {p1}, Ll/ۚ᩵֡;->֫(Ll/ۚ᩵֡;)Ll/ܳۚ֡;

    move-result-object p1

    .line 87
    invoke-virtual {p1}, Ll/ܳۚ֡;->ܺ()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ll/᩷᩵֡;->ۧ(I)Ll/᩷᩵֡;

    :cond_7
    :goto_5
    return-object v1
.end method
