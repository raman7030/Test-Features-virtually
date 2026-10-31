.class public final enum Ll/۠ۗᩴ;
.super Ll/ܶۗᩴ;
.source "N673"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "WEEK_BASED_YEAR"

    const/4 v1, 0x3

    .line 290
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final C(Ll/ۖۗᩴ;)J
    .locals 2

    .line 535
    invoke-virtual {p0, p1}, Ll/۠ۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 538
    invoke-static {p1}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    .line 0
    invoke-static {p1}, Ll/ܶۗᩴ;->V(Ll/ᩴ᩹ᩴ;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 536
    :cond_0
    new-instance p1, Ll/ۨۗᩴ;

    const-string v0, "Unsupported field: WeekBasedYear"

    .line 88
    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 536
    throw p1
.end method

.method public final G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;
    .locals 4

    .line 549
    invoke-virtual {p0, p1}, Ll/۠ۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 527
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object v0, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 552
    sget-object v1, Ll/ܶۗᩴ;->WEEK_BASED_YEAR:Ll/ܶۗᩴ;

    invoke-virtual {v0, p2, p3, v1}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p2

    .line 553
    invoke-static {p1}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p3

    .line 554
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-virtual {p3, v0}, Ll/ᩴ᩹ᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v1

    .line 555
    invoke-static {p3}, Ll/ܶۗᩴ;->T(Ll/ᩴ᩹ᩴ;)I

    move-result p3

    const/16 v2, 0x35

    if-ne p3, v2, :cond_0

    .line 0
    invoke-static {p2}, Ll/ܶۗᩴ;->W(I)I

    move-result v2

    const/16 v3, 0x34

    if-ne v2, v3, :cond_0

    const/16 p3, 0x34

    :cond_0
    const/4 v2, 0x4

    const/4 v3, 0x1

    .line 559
    invoke-static {p2, v3, v2}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p2

    .line 560
    invoke-virtual {p2, v0}, Ll/ᩴ᩹ᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v0

    sub-int/2addr v1, v0

    sub-int/2addr p3, v3

    mul-int/lit8 p3, p3, 0x7

    add-int/2addr p3, v1

    int-to-long v0, p3

    .line 561
    invoke-virtual {p2, v0, v1}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p2

    .line 562
    invoke-interface {p1, p2}, Ll/ܺۗᩴ;->m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1

    .line 550
    :cond_1
    new-instance p1, Ll/ۨۗᩴ;

    const-string p2, "Unsupported field: WeekBasedYear"

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 550
    throw p1
.end method

.method public final l(Ll/ۖۗᩴ;)Z
    .locals 1

    .line 531
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/᩹ۗᩴ;->a:Ll/ܶۗᩴ;

    .line 736
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object p1

    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    invoke-interface {p1, v0}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;
    .locals 1

    .line 541
    invoke-virtual {p0, p1}, Ll/۠ۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 582
    invoke-virtual {p0}, Ll/۠ۗᩴ;->s()Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 542
    :cond_0
    new-instance p1, Ll/ۨۗᩴ;

    const-string v0, "Unsupported field: WeekBasedYear"

    .line 88
    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 542
    throw p1
.end method

.method public final s()Ll/᩺ۗᩴ;
    .locals 1

    .line 527
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object v0, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WeekBasedYear"

    return-object v0
.end method
