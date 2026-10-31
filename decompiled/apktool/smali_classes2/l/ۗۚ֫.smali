.class public final Ll/ۗۚ֫;
.super Ljava/lang/Object;
.source "W8HW"


# instance fields
.field public ֫:[J

.field public ۧ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/16 v0, 0xf

    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/2addr v0, v2

    :cond_0
    const/4 v1, 0x0

    .line 58
    iput v1, p0, Ll/ۗۚ֫;->ۧ:I

    const/4 v3, -0x1

    .line 59
    iput v3, p0, Ll/ۗۚ֫;->ᩳ:I

    .line 60
    iput v1, p0, Ll/ۗۚ֫;->ܽ:I

    .line 61
    new-array v1, v0, [J

    iput-object v1, p0, Ll/ۗۚ֫;->֫:[J

    sub-int/2addr v0, v2

    .line 62
    iput v0, p0, Ll/ۗۚ֫;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 118
    iput v0, p0, Ll/ۗۚ֫;->ۧ:I

    const/4 v1, -0x1

    .line 119
    iput v1, p0, Ll/ۗۚ֫;->ᩳ:I

    .line 120
    iput v0, p0, Ll/ۗۚ֫;->ܽ:I

    return-void
.end method

.method public final ֫(J)V
    .locals 6

    .line 67
    iget v0, p0, Ll/ۗۚ֫;->ܽ:I

    iget-object v1, p0, Ll/ۗۚ֫;->֫:[J

    array-length v2, v1

    if-ne v0, v2, :cond_1

    .line 130
    array-length v0, v1

    shl-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_0

    .line 135
    new-array v2, v0, [J

    .line 136
    array-length v3, v1

    iget v4, p0, Ll/ۗۚ֫;->ۧ:I

    sub-int/2addr v3, v4

    const/4 v5, 0x0

    .line 138
    invoke-static {v1, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    iget-object v1, p0, Ll/ۗۚ֫;->֫:[J

    invoke-static {v1, v5, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    iput v5, p0, Ll/ۗۚ֫;->ۧ:I

    .line 142
    iget v1, p0, Ll/ۗۚ֫;->ܽ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۗۚ֫;->ᩳ:I

    .line 143
    iput-object v2, p0, Ll/ۗۚ֫;->֫:[J

    add-int/lit8 v0, v0, -0x1

    .line 144
    iput v0, p0, Ll/ۗۚ֫;->ܿ:I

    goto :goto_0

    .line 132
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 71
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۗۚ֫;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ll/ۗۚ֫;->ܿ:I

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۗۚ֫;->ᩳ:I

    .line 72
    iget-object v1, p0, Ll/ۗۚ֫;->֫:[J

    aput-wide p1, v1, v0

    .line 73
    iget p1, p0, Ll/ۗۚ֫;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۗۚ֫;->ܽ:I

    return-void
.end method

.method public final ۧ()J
    .locals 3

    .line 99
    iget v0, p0, Ll/ۗۚ֫;->ܽ:I

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Ll/ۗۚ֫;->֫:[J

    iget v1, p0, Ll/ۗۚ֫;->ۧ:I

    aget-wide v1, v0, v1

    return-wide v1

    .line 100
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 113
    iget v0, p0, Ll/ۗۚ֫;->ܽ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()J
    .locals 5

    .line 82
    iget v0, p0, Ll/ۗۚ֫;->ܽ:I

    if-eqz v0, :cond_0

    .line 86
    iget-object v1, p0, Ll/ۗۚ֫;->֫:[J

    iget v2, p0, Ll/ۗۚ֫;->ۧ:I

    aget-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    .line 87
    iget v1, p0, Ll/ۗۚ֫;->ܿ:I

    and-int/2addr v1, v2

    iput v1, p0, Ll/ۗۚ֫;->ۧ:I

    add-int/lit8 v0, v0, -0x1

    .line 88
    iput v0, p0, Ll/ۗۚ֫;->ܽ:I

    return-wide v3

    .line 83
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
