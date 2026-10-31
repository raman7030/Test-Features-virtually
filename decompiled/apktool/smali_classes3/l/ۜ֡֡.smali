.class public final Ll/ۜ֡֡;
.super Ll/ܺ֨֡;
.source "48Z0"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 8

    .line 30
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܽ()I

    move-result p2

    const/4 v0, 0x4

    if-lt p2, v0, :cond_0

    goto/16 :goto_2

    .line 33
    :cond_0
    invoke-virtual {p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result p2

    .line 34
    invoke-virtual {p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    .line 51
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge p2, v1, :cond_5

    .line 53
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x9

    if-eq v6, v7, :cond_4

    const/16 v7, 0x20

    if-eq v6, v7, :cond_4

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_3

    const/16 v7, 0x2d

    if-eq v6, v7, :cond_2

    const/16 v7, 0x5f

    if-eq v6, v7, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    :cond_4
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_5
    const/4 p2, 0x3

    if-lt v3, p2, :cond_6

    if-nez v4, :cond_6

    if-eqz v5, :cond_8

    :cond_6
    if-lt v4, p2, :cond_7

    if-nez v3, :cond_7

    if-eqz v5, :cond_8

    :cond_7
    if-lt v5, p2, :cond_9

    if-nez v3, :cond_9

    if-nez v4, :cond_9

    .line 36
    :cond_8
    invoke-virtual {p1}, Ll/᩵᩵֡;->getIndex()I

    move-result p1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    new-instance p1, Ll/᩷֡֡;

    invoke-direct {p1}, Ll/᩷֡֡;-><init>()V

    const/4 p2, 0x1

    new-array p2, p2, [Ll/ۖ֨֡;

    aput-object p1, p2, v2

    .line 17
    new-instance p1, Ll/᩷᩵֡;

    invoke-direct {p1, p2}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 37
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩷᩵֡;->ۧ(I)Ll/᩷᩵֡;

    return-object p1

    :cond_9
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method
