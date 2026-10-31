.class public final Ll/ۚ᩵ۘ;
.super Ljava/lang/Object;
.source "48BN"


# instance fields
.field public ֫:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-long v0, v0

    .line 51
    iput-wide v0, p0, Ll/ۚ᩵ۘ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()D
    .locals 4

    .line 80
    iget-wide v0, p0, Ll/ۚ᩵ۘ;->֫:J

    const-wide v2, 0x5851f42d4c957f2dL    # 2.8296655102636685E117

    mul-long v0, v0, v2

    const-wide v2, 0x14057b7ef767814fL    # 3.190626645921225E-212

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۚ᩵ۘ;->֫:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v1, v0

    int-to-double v0, v1

    const-wide/high16 v2, 0x3e00000000000000L    # 4.6566128730773926E-10

    mul-double v0, v0, v2

    return-wide v0
.end method
