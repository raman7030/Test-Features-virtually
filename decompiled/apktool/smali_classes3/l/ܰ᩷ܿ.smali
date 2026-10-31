.class public final Ll/ܰ᩷ܿ;
.super Ljava/lang/Object;
.source "N6ZQ"


# instance fields
.field public final ֫:[[J


# direct methods
.method public constructor <init>(I)V
    .locals 7

    .line 495
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-long v0, p1

    const-wide/16 v2, 0x3f

    add-long/2addr v0, v2

    const/4 p1, 0x6

    ushr-long/2addr v0, p1

    long-to-int v1, v0

    const/4 v0, 0x1

    const/4 v4, 0x1

    move v5, v1

    :goto_0
    if-le v5, v0, :cond_0

    int-to-long v5, v5

    add-long/2addr v5, v2

    ushr-long/2addr v5, p1

    long-to-int v5, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 501
    :cond_0
    new-array v0, v4, [[J

    iput-object v0, p0, Ll/ܰ᩷ܿ;->֫:[[J

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v4, :cond_1

    .line 503
    iget-object v5, p0, Ll/ܰ᩷ܿ;->֫:[[J

    new-array v6, v1, [J

    aput-object v6, v5, v0

    int-to-long v5, v1

    add-long/2addr v5, v2

    ushr-long/2addr v5, p1

    long-to-int v1, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ᩷ܿ;)[[J
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ᩷ܿ;->֫:[[J

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 510
    iget-object v0, p0, Ll/ܰ᩷ܿ;->֫:[[J

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    const-wide/16 v4, 0x0

    invoke-static {v3, v4, v5}, Ljava/util/Arrays;->fill([JJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 9

    .line 516
    iget-object v0, p0, Ll/ܰ᩷ܿ;->֫:[[J

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    ushr-int/lit8 v4, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    const-wide/16 v5, 0x1

    shl-long/2addr v5, p1

    .line 519
    aget-wide v7, v3, v4

    or-long/2addr v5, v7

    .line 520
    aput-wide v5, v3, v4

    const-wide/16 v5, 0x0

    cmp-long p1, v7, v5

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    move p1, v4

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۧ()I
    .locals 7

    .line 541
    iget-object v0, p0, Ll/ܰ᩷ܿ;->֫:[[J

    array-length v1, v0

    add-int/lit8 v2, v1, -0x1

    .line 542
    aget-object v2, v0, v2

    const/4 v3, 0x0

    aget-wide v3, v2, v3

    const-wide/16 v5, 0x0

    cmp-long v2, v3, v5

    if-nez v2, :cond_0

    const/4 v0, -0x1

    return v0

    .line 544
    :cond_0
    invoke-static {v3, v4}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x3f

    add-int/lit8 v1, v1, -0x2

    :goto_0
    if-ltz v1, :cond_1

    .line 546
    aget-object v3, v0, v1

    aget-wide v4, v3, v2

    shl-int/lit8 v2, v2, 0x6

    add-int/lit8 v2, v2, 0x3f

    .line 547
    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final ۧ(I)V
    .locals 9

    .line 529
    iget-object v0, p0, Ll/ܰ᩷ܿ;->֫:[[J

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    ushr-int/lit8 v4, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    const-wide/16 v5, 0x1

    shl-long/2addr v5, p1

    .line 532
    aget-wide v7, v3, v4

    not-long v5, v5

    and-long/2addr v5, v7

    .line 533
    aput-wide v5, v3, v4

    const-wide/16 v7, 0x0

    cmp-long p1, v5, v7

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    move p1, v4

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
