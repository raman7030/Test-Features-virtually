.class public final Ll/۬֫ۜ;
.super Ljava/lang/Object;
.source "1761"


# instance fields
.field public final ֫:Z

.field public final ۜ:J

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:J

.field public final ܽ:Z

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:J

.field public final ᩷:J

.field public final ᩻:Z


# direct methods
.method public constructor <init>(ZZZLjava/lang/String;Ljava/lang/String;JJJJ)V
    .locals 0

    .line 2455
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2456
    iput-boolean p1, p0, Ll/۬֫ۜ;->᩻:Z

    .line 2457
    iput-boolean p2, p0, Ll/۬֫ۜ;->֫:Z

    .line 2458
    iput-boolean p3, p0, Ll/۬֫ۜ;->ܽ:Z

    .line 2459
    iput-object p4, p0, Ll/۬֫ۜ;->ܿ:Ljava/lang/String;

    .line 2460
    iput-object p5, p0, Ll/۬֫ۜ;->ۧ:Ljava/lang/String;

    .line 2461
    iput-wide p6, p0, Ll/۬֫ۜ;->᩷:J

    .line 2462
    iput-wide p8, p0, Ll/۬֫ۜ;->ᩳ:J

    .line 2463
    iput-wide p10, p0, Ll/۬֫ۜ;->ܳ:J

    .line 2464
    iput-wide p12, p0, Ll/۬֫ۜ;->ۜ:J

    return-void
.end method

.method public static ֫(Ll/ۖܺۢ;JZ)Ll/۬֫ۜ;
    .locals 15

    move-object v0, p0

    .line 2479
    new-instance v14, Ll/۬֫ۜ;

    iget-object v4, v0, Ll/ۖܺۢ;->ᩳ:Ljava/lang/String;

    iget-object v5, v0, Ll/ۖܺۢ;->֫:Ljava/lang/String;

    iget-wide v6, v0, Ll/ۖܺۢ;->ۜ:J

    iget-wide v10, v0, Ll/ۖܺۢ;->ܿ:J

    iget-wide v12, v0, Ll/ۖܺۢ;->ܳ:J

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object v0, v14

    move/from16 v3, p3

    move-wide/from16 v8, p1

    invoke-direct/range {v0 .. v13}, Ll/۬֫ۜ;-><init>(ZZZLjava/lang/String;Ljava/lang/String;JJJJ)V

    return-object v14
.end method

.method public static ֫(Z)Ll/۬֫ۜ;
    .locals 15

    .line 2471
    new-instance v14, Ll/۬֫ۜ;

    const-wide/16 v10, -0x1

    const-wide/16 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    const-string v5, ""

    const-wide/16 v6, -0x1

    const-wide/16 v8, -0x1

    move-object v0, v14

    move v1, p0

    invoke-direct/range {v0 .. v13}, Ll/۬֫ۜ;-><init>(ZZZLjava/lang/String;Ljava/lang/String;JJJJ)V

    return-object v14
.end method
