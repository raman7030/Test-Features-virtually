.class public final Ll/ܶ᩵֡;
.super Ll/ܺ֨֡;
.source "Y90G"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 8

    .line 116
    invoke-virtual {p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result v0

    .line 117
    invoke-virtual {p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    .line 119
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܽ()I

    move-result v2

    const/4 v3, 0x4

    if-ge v2, v3, :cond_2

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    const/4 v3, 0x1

    :goto_0
    const/4 v4, 0x7

    if-gt v3, v4, :cond_2

    if-ne v3, v4, :cond_0

    .line 123
    move-object v4, p2

    check-cast v4, Ll/ۘ᩵֡;

    invoke-virtual {v4}, Ll/ۘ᩵֡;->֫()Ll/ۖ֨֡;

    move-result-object v4

    invoke-interface {v4}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v4

    instance-of v4, v4, Ll/᩸ۚ֡;

    if-nez v4, :cond_1

    .line 125
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܿ()Ll/ۖ֨֡;

    move-result-object v4

    .line 126
    invoke-interface {v4}, Ll/ۖ֨֡;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 129
    :cond_0
    invoke-static {}, Ll/᩸᩵֡;->֫()[[Ljava/util/regex/Pattern;

    move-result-object v4

    aget-object v4, v4, v3

    const/4 v5, 0x0

    aget-object v4, v4, v5

    .line 130
    invoke-static {}, Ll/᩸᩵֡;->֫()[[Ljava/util/regex/Pattern;

    move-result-object v6

    aget-object v6, v6, v3

    aget-object v6, v6, v2

    .line 132
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-interface {v1, v0, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 134
    new-instance p2, Ll/᩸᩵֡;

    invoke-direct {p2, v6}, Ll/᩸᩵֡;-><init>(Ljava/util/regex/Pattern;)V

    new-array v0, v2, [Ll/ۖ֨֡;

    aput-object p2, v0, v5

    .line 17
    new-instance p2, Ll/᩷᩵֡;

    invoke-direct {p2, v0}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 134
    invoke-virtual {p1}, Ll/᩵᩵֡;->getIndex()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/᩷᩵֡;->ۧ(I)Ll/᩷᩵֡;

    return-object p2

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
