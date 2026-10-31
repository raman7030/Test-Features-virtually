.class public final Ll/ۙ۠ܿ;
.super Ljava/lang/Object;
.source "WB05"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܽ:J


# direct methods
.method public constructor <init>(JJZ)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-boolean p5, p0, Ll/ۙ۠ܿ;->֫:Z

    .line 52
    iput-wide p3, p0, Ll/ۙ۠ܿ;->ۧ:J

    const-wide/16 p3, 0x0

    cmp-long p5, p1, p3

    if-gez p5, :cond_0

    const-wide/16 p1, -0x1

    .line 54
    :cond_0
    iput-wide p1, p0, Ll/ۙ۠ܿ;->ܽ:J

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 52
    iget-wide v0, p0, Ll/ۙ۠ܿ;->ۧ:J

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 54
    iget-wide v0, p0, Ll/ۙ۠ܿ;->ܽ:J

    return-wide v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Ll/ۙ۠ܿ;->֫:Z

    return v0
.end method
