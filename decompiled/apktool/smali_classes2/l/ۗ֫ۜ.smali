.class public final Ll/ۗ֫ۜ;
.super Ljava/lang/Object;
.source "1761"


# instance fields
.field public final ֫:[B

.field public final ۜ:Z

.field public final ۧ:[B

.field public final ܳ:J

.field public final ܽ:J

.field public final ܿ:Ll/ۘܺۢ;

.field public final ᩳ:I

.field public final ᩻:Ll/ܶ۟᩻;


# direct methods
.method public constructor <init>(Ll/ܶ۟᩻;JLl/ۘܺۢ;J[B[BIZ)V
    .locals 0

    .line 2551
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2552
    iput-object p1, p0, Ll/ۗ֫ۜ;->᩻:Ll/ܶ۟᩻;

    .line 2553
    iput-wide p2, p0, Ll/ۗ֫ۜ;->ܽ:J

    .line 2554
    iput-object p4, p0, Ll/ۗ֫ۜ;->ܿ:Ll/ۘܺۢ;

    .line 2555
    iput-wide p5, p0, Ll/ۗ֫ۜ;->ܳ:J

    .line 2556
    invoke-virtual {p7}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Ll/ۗ֫ۜ;->ۧ:[B

    .line 2557
    invoke-virtual {p8}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Ll/ۗ֫ۜ;->֫:[B

    .line 2558
    iput p9, p0, Ll/ۗ֫ۜ;->ᩳ:I

    .line 2559
    iput-boolean p10, p0, Ll/ۗ֫ۜ;->ۜ:Z

    return-void
.end method
