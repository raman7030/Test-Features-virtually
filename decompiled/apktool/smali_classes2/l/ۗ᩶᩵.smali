.class public final Ll/ۗ᩶᩵;
.super Ljava/lang/Object;
.source "CAXH"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ۙ:J

.field public ᩶:J

.field public final ᩸:J

.field public ᩹:Z


# direct methods
.method public constructor <init>(JJ)V
    .locals 6

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-wide p3, p0, Ll/ۗ᩶᩵;->ۙ:J

    .line 65
    iput-wide p1, p0, Ll/ۗ᩶᩵;->᩸:J

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x1

    const/4 v4, 0x0

    cmp-long v5, p3, v0

    cmp-long p3, v2, p1

    if-lez v5, :cond_0

    if-gtz p3, :cond_1

    goto :goto_0

    :cond_0
    if-ltz p3, :cond_1

    :goto_0
    const/4 v4, 0x1

    .line 66
    :cond_1
    iput-boolean v4, p0, Ll/ۗ᩶᩵;->᩹:Z

    if-eqz v4, :cond_2

    move-wide p1, v2

    .line 67
    :cond_2
    iput-wide p1, p0, Ll/ۗ᩶᩵;->᩶:J

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Ll/ۗ᩶᩵;->᩹:Z

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 72
    iget-wide v0, p0, Ll/ۗ᩶᩵;->᩶:J

    .line 73
    iget-wide v2, p0, Ll/ۗ᩶᩵;->᩸:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 74
    iget-boolean v2, p0, Ll/ۗ᩶᩵;->᩹:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 75
    iput-boolean v2, p0, Ll/ۗ᩶᩵;->᩹:Z

    goto :goto_0

    .line 74
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 78
    :cond_1
    iget-wide v2, p0, Ll/ۗ᩶᩵;->ۙ:J

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ۗ᩶᩵;->᩶:J

    .line 211
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
