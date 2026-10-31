.class public final enum Ll/᩸ۗᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ll/ۘۗᩴ;


# static fields
.field public static final enum QUARTER_YEARS:Ll/᩸ۗᩴ;

.field public static final enum WEEK_BASED_YEARS:Ll/᩸ۗᩴ;

.field public static final synthetic c:[Ll/᩸ۗᩴ;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ll/ۖ᩹ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 659
    new-instance v0, Ll/᩸ۗᩴ;

    const-wide/32 v1, 0x1e18558

    invoke-static {v1, v2}, Ll/ۖ᩹ᩴ;->ofSeconds(J)Ll/ۖ᩹ᩴ;

    move-result-object v1

    const-string v2, "WEEK_BASED_YEARS"

    const/4 v3, 0x0

    const-string v4, "WeekBasedYears"

    invoke-direct {v0, v2, v3, v4, v1}, Ll/᩸ۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۖ᩹ᩴ;)V

    sput-object v0, Ll/᩸ۗᩴ;->WEEK_BASED_YEARS:Ll/᩸ۗᩴ;

    .line 663
    new-instance v1, Ll/᩸ۗᩴ;

    const-wide/32 v4, 0x786156

    invoke-static {v4, v5}, Ll/ۖ᩹ᩴ;->ofSeconds(J)Ll/ۖ᩹ᩴ;

    move-result-object v2

    const-string v4, "QUARTER_YEARS"

    const/4 v5, 0x1

    const-string v6, "QuarterYears"

    invoke-direct {v1, v4, v5, v6, v2}, Ll/᩸ۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۖ᩹ᩴ;)V

    sput-object v1, Ll/᩸ۗᩴ;->QUARTER_YEARS:Ll/᩸ۗᩴ;

    const/4 v2, 0x2

    new-array v2, v2, [Ll/᩸ۗᩴ;

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    .line 654
    sput-object v2, Ll/᩸ۗᩴ;->c:[Ll/᩸ۗᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ll/ۖ᩹ᩴ;)V
    .locals 0

    .line 668
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 669
    iput-object p3, p0, Ll/᩸ۗᩴ;->a:Ljava/lang/String;

    .line 670
    iput-object p4, p0, Ll/᩸ۗᩴ;->b:Ll/ۖ᩹ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩸ۗᩴ;
    .locals 1

    .line 654
    const-class v0, Ll/᩸ۗᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩸ۗᩴ;

    return-object p0
.end method

.method public static values()[Ll/᩸ۗᩴ;
    .locals 1

    .line 654
    sget-object v0, Ll/᩸ۗᩴ;->c:[Ll/᩸ۗᩴ;

    invoke-virtual {v0}, [Ll/᩸ۗᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸ۗᩴ;

    return-object v0
.end method


# virtual methods
.method public final getDuration()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 675
    iget-object v0, p0, Ll/᩸ۗᩴ;->b:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final isDurationEstimated()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J
    .locals 3

    .line 715
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 716
    invoke-interface {p1, p2, p0}, Ll/ܺۗᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide p1

    return-wide p1

    .line 718
    :cond_0
    sget-object v0, Ll/᩵ۗᩴ;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 723
    sget-object v0, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    invoke-interface {p1, p2, v0}, Ll/ܺۗᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x3

    div-long/2addr p1, v0

    return-wide p1

    .line 725
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unreachable"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 720
    :cond_2
    sget-object v0, Ll/᩹ۗᩴ;->c:Ll/ܶۗᩴ;

    invoke-interface {p2, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v1

    .line 721
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide p1

    .line 720
    invoke-static {v1, v2, p1, p2}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;
    .locals 5

    .line 701
    sget-object v0, Ll/᩵ۗᩴ;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-wide/16 v0, 0x4

    .line 706
    div-long v2, p2, v0

    sget-object v4, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    invoke-interface {p1, v2, v3, v4}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    rem-long/2addr p2, v0

    const-wide/16 v0, 0x3

    mul-long p2, p2, v0

    sget-object v0, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    .line 707
    invoke-interface {p1, p2, p3, v0}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1

    .line 709
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unreachable"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 703
    :cond_1
    sget-object v0, Ll/᩹ۗᩴ;->c:Ll/ܶۗᩴ;

    .line 704
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2, p2, p3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p2

    .line 703
    invoke-interface {p1, p2, p3, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 731
    iget-object v0, p0, Ll/᩸ۗᩴ;->a:Ljava/lang/String;

    return-object v0
.end method
