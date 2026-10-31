.class public final Ll/ۘۙۢ;
.super Ljava/lang/Object;
.source "D6O1"


# direct methods
.method public static ֫(Ll/֡ܳ֡;Ll/֡ܳ֡;)Z
    .locals 6

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    .line 13
    :cond_0
    invoke-interface {p0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-interface {p1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v1

    .line 15
    new-instance v2, Ll/᩺᩶ۢ;

    new-instance v3, Ll/᩷ۤۢ;

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-direct {v3, v4}, Ll/᩷ۤۢ;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v2, v3}, Ll/᩺᩶ۢ;-><init>(Ll/᩷ۤۢ;)V

    .line 16
    invoke-virtual {v2}, Ll/ᩴܳ֡;->ۢ()V

    .line 17
    invoke-virtual {v2}, Ll/ܰ᩶ۢ;->nextToken()Ll/֡ܳ֡;

    move-result-object v3

    .line 18
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v4

    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result p0

    const/4 v5, 0x1

    if-ne v4, p0, :cond_2

    invoke-interface {v3}, Ll/֡ܳ֡;->ܿ()I

    move-result p0

    add-int/2addr p0, v5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eq p0, v3, :cond_1

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v2}, Ll/ܰ᩶ۢ;->nextToken()Ll/֡ܳ֡;

    move-result-object p0

    .line 20
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v2

    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result p1

    if-ne v2, p1, :cond_2

    invoke-interface {p0}, Ll/֡ܳ֡;->ᩳ()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne p1, v2, :cond_2

    .line 21
    invoke-interface {p0}, Ll/֡ܳ֡;->ܿ()I

    move-result p0

    add-int/2addr p0, v5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p1

    if-eq p0, v0, :cond_3

    :cond_2
    :goto_0
    return v5

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return p0
.end method
