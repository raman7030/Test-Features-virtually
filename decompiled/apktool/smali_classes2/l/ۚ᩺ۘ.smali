.class public final Ll/ۚ᩺ۘ;
.super Ljava/lang/Object;
.source "81Q9"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 105
    sput-object v0, Ll/ۚ᩺ۘ;->֫:[B

    return-void
.end method

.method public static ֫(II[B)[B
    .locals 4

    .line 200
    array-length v0, p2

    if-le p0, v0, :cond_0

    .line 201
    array-length v0, p2

    int-to-long v0, v0

    array-length v2, p2

    shr-int/lit8 v2, v2, 0x1

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7ffffff7

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    int-to-long v2, p0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int p0, v0

    .line 202
    new-array p0, p0, [B

    const/4 v0, 0x0

    .line 203
    invoke-static {p2, v0, p0, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0

    :cond_0
    return-object p2
.end method
