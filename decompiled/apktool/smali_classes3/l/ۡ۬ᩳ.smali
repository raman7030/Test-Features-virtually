.class public final Ll/ۡ۬ᩳ;
.super Ljava/lang/Object;
.source "06TH"


# instance fields
.field public final ֫:Ll/ܺۙᩳ;

.field public final ۧ:J

.field public final ܳ:J

.field public final ܽ:Ll/ܰ᩶ᩳ;

.field public ܿ:Ll/᩸۬ᩳ;

.field public volatile ᩳ:J


# direct methods
.method public constructor <init>(JJLl/ܰ᩶ᩳ;Ll/ܺۙᩳ;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 11
    iput-wide v0, p0, Ll/ۡ۬ᩳ;->ᩳ:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    .line 15
    invoke-virtual {p6}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    if-eq p5, v0, :cond_0

    sget-object v0, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    if-ne p5, v0, :cond_1

    .line 18
    :cond_0
    iput-wide p1, p0, Ll/ۡ۬ᩳ;->ۧ:J

    .line 19
    iput-wide p3, p0, Ll/ۡ۬ᩳ;->ܳ:J

    .line 20
    iput-object p5, p0, Ll/ۡ۬ᩳ;->ܽ:Ll/ܰ᩶ᩳ;

    .line 21
    iput-object p6, p0, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    return-void

    .line 16
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid undo record"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
