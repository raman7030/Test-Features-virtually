.class public final Ll/᩻᩵֡;
.super Ll/ܺ֨֡;
.source "J8YO"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 4

    .line 53
    invoke-virtual {p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result p2

    .line 54
    invoke-static {p1, p2}, Ll/ۜ᩵֡;->֫(Ll/᩵᩵֡;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    invoke-virtual {p1}, Ll/᩵᩵֡;->ۧ()I

    move-result v0

    invoke-virtual {p1}, Ll/᩵᩵֡;->ܽ()I

    move-result v1

    add-int/2addr v1, v0

    add-int/lit8 v0, v1, 0x1

    .line 57
    invoke-virtual {p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    const/4 v2, 0x1

    add-int/2addr p2, v2

    .line 47
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge p2, v3, :cond_1

    .line 48
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    const/16 p2, 0x9

    if-eq p1, p2, :cond_0

    const/16 p2, 0x20

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v1, 0x2

    .line 60
    :cond_1
    :goto_0
    new-instance p1, Ll/ۜ᩵֡;

    invoke-direct {p1}, Ll/ۜ᩵֡;-><init>()V

    new-array p2, v2, [Ll/ۖ֨֡;

    const/4 v1, 0x0

    aput-object p1, p2, v1

    .line 17
    new-instance p1, Ll/᩷᩵֡;

    invoke-direct {p1, p2}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 60
    invoke-virtual {p1, v0}, Ll/᩷᩵֡;->֫(I)Ll/᩷᩵֡;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
