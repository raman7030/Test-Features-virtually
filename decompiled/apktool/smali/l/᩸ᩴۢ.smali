.class public final Ll/᩸ᩴۢ;
.super Ljava/lang/Object;
.source "V7AU"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ll/ܶᩴۢ;

.field public final ܳ:Ll/֨ܳܳ;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(ZLl/֨ܳܳ;ILjava/lang/String;[Ljava/lang/Object;Ll/ܶᩴۢ;)V
    .locals 0

    .line 1980
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1981
    iput-boolean p1, p0, Ll/᩸ᩴۢ;->֫:Z

    .line 1982
    iput-object p2, p0, Ll/᩸ᩴۢ;->ܳ:Ll/֨ܳܳ;

    .line 1983
    iput p3, p0, Ll/᩸ᩴۢ;->ܿ:I

    .line 1984
    iput-object p4, p0, Ll/᩸ᩴۢ;->ܽ:Ljava/lang/String;

    .line 1985
    iput-object p5, p0, Ll/᩸ᩴۢ;->ᩳ:[Ljava/lang/Object;

    .line 1986
    iput-object p6, p0, Ll/᩸ᩴۢ;->ۧ:Ll/ܶᩴۢ;

    return-void
.end method

.method public static ֫()Ll/᩸ᩴۢ;
    .locals 8

    .line 2008
    new-instance v7, Ll/᩸ᩴۢ;

    sget-object v2, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    const/4 v1, 0x0

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v6, 0x0

    const v3, 0x7f12080f

    const-string v4, "auth_clock_skew"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/᩸ᩴۢ;-><init>(ZLl/֨ܳܳ;ILjava/lang/String;[Ljava/lang/Object;Ll/ܶᩴۢ;)V

    return-object v7
.end method

.method public static varargs ֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;
    .locals 8

    .line 2001
    new-instance v7, Ll/᩸ᩴۢ;

    const-string v4, ""

    const/4 v6, 0x0

    const/4 v1, 0x0

    move-object v0, v7

    move-object v2, p0

    move v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v6}, Ll/᩸ᩴۢ;-><init>(ZLl/֨ܳܳ;ILjava/lang/String;[Ljava/lang/Object;Ll/ܶᩴۢ;)V

    return-object v7
.end method

.method public static ֫(Ll/ܶᩴۢ;)Ll/᩸ᩴۢ;
    .locals 8

    .line 1990
    new-instance v7, Ll/᩸ᩴۢ;

    sget-object v2, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v3, 0x0

    const-string v4, ""

    move-object v0, v7

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Ll/᩸ᩴۢ;-><init>(ZLl/֨ܳܳ;ILjava/lang/String;[Ljava/lang/Object;Ll/ܶᩴۢ;)V

    return-object v7
.end method
