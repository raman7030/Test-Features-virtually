.class public final Ll/᩹᩵֡;
.super Ll/ܺ֨֡;
.source "C8XW"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 3

    .line 64
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܽ()I

    move-result p2

    const/4 v0, 0x4

    if-lt p2, v0, :cond_0

    .line 65
    invoke-virtual {p1}, Ll/᩵᩵֡;->֫()Z

    move-result p2

    if-nez p2, :cond_0

    .line 66
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܿ()Ll/ۖ֨֡;

    move-result-object p2

    invoke-interface {p2}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object p2

    instance-of p2, p2, Ll/᩸ۚ֡;

    if-nez p2, :cond_0

    .line 67
    new-instance p2, Ll/᩶᩵֡;

    invoke-direct {p2}, Ll/᩶᩵֡;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ۖ֨֡;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    .line 17
    new-instance p2, Ll/᩷᩵֡;

    invoke-direct {p2, v1}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 68
    invoke-virtual {p1}, Ll/᩵᩵֡;->ۧ()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ll/᩷᩵֡;->֫(I)Ll/᩷᩵֡;

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
