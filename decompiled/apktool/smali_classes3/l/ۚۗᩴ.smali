.class public final enum Ll/ۚۗᩴ;
.super Ll/ܶۗᩴ;
.source "N673"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "QUARTER_OF_YEAR"

    const/4 v1, 0x1

    .line 290
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final C(Ll/ۖۗᩴ;)J
    .locals 4

    .line 399
    invoke-virtual {p0, p1}, Ll/ۚۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    sget-object v0, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3

    .line 403
    div-long/2addr v0, v2

    return-wide v0

    .line 400
    :cond_0
    new-instance p1, Ll/ۨۗᩴ;

    const-string v0, "Unsupported field: QuarterOfYear"

    .line 88
    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 400
    throw p1
.end method

.method public final G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;
    .locals 5

    .line 415
    invoke-virtual {p0, p1}, Ll/ۚۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    .line 416
    invoke-virtual {p0}, Ll/ۚۗᩴ;->s()Ll/᩺ۗᩴ;

    move-result-object v2

    invoke-virtual {v2, p2, p3, p0}, Ll/᩺ۗᩴ;->b(JLl/ۤۗᩴ;)V

    .line 417
    sget-object v2, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v2}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v3

    sub-long/2addr p2, v0

    const-wide/16 v0, 0x3

    mul-long p2, p2, v0

    add-long/2addr p2, v3

    invoke-interface {p1, p2, p3, v2}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ll/ۖۗᩴ;)Z
    .locals 1

    .line 395
    sget-object v0, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

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

    .line 406
    invoke-virtual {p0, p1}, Ll/ۚۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 582
    invoke-virtual {p0}, Ll/ۚۗᩴ;->s()Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 407
    :cond_0
    new-instance p1, Ll/ۨۗᩴ;

    const-string v0, "Unsupported field: QuarterOfYear"

    .line 88
    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 407
    throw p1
.end method

.method public final s()Ll/᩺ۗᩴ;
    .locals 4

    const-wide/16 v0, 0x1

    const-wide/16 v2, 0x4

    .line 391
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "QuarterOfYear"

    return-object v0
.end method
