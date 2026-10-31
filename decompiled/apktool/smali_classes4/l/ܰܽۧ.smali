.class public abstract Ll/ܰܽۧ;
.super Ljava/lang/Object;
.source "67MK"

# interfaces
.implements Ll/ᩳᩳۧ;


# instance fields
.field public ۧ:J

.field public final ܽ:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-wide p1, p0, Ll/ܰܽۧ;->ܽ:J

    const-wide/16 p1, -0x1

    .line 59
    iput-wide p1, p0, Ll/ܰܽۧ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final next()Z
    .locals 5

    .line 53
    iget-wide v0, p0, Ll/ܰܽۧ;->ۧ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܰܽۧ;->ۧ:J

    .line 48
    iget-wide v2, p0, Ll/ܰܽۧ;->ܽ:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܽ()V
    .locals 5

    .line 68
    iget-wide v0, p0, Ll/ܰܽۧ;->ۧ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-wide v2, p0, Ll/ܰܽۧ;->ܽ:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 69
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 75
    iget-wide v0, p0, Ll/ܰܽۧ;->ۧ:J

    return-wide v0
.end method
