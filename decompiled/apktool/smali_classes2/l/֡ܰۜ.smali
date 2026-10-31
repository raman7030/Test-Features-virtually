.class public final Ll/֡ܰۜ;
.super Ljava/lang/Object;
.source "S6MQ"


# instance fields
.field public ֫:Z

.field public ۜ:I

.field public ۡ:J

.field public ۢ:Ll/ۗۨۜ;

.field public ۧ:I

.field public final ܳ:Landroid/graphics/Matrix;

.field public final ܺ:Ll/ۨܰۜ;

.field public final ܽ:J

.field public final ܿ:[F

.field public ᩳ:J

.field public ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(JIJ)V
    .locals 2

    .line 866
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 857
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/֡ܰۜ;->ᩳ:J

    .line 858
    new-instance v0, Ll/ۨܰۜ;

    invoke-direct {v0}, Ll/ۨܰۜ;-><init>()V

    iput-object v0, p0, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    .line 859
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/֡ܰۜ;->ܳ:Landroid/graphics/Matrix;

    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 860
    iput-object v0, p0, Ll/֡ܰۜ;->ܿ:[F

    .line 867
    iput p3, p0, Ll/֡ܰۜ;->᩻:I

    .line 868
    iput-wide p1, p0, Ll/֡ܰۜ;->ܽ:J

    .line 869
    iput-wide p4, p0, Ll/֡ܰۜ;->ۡ:J

    return-void
.end method
