.class public final Ll/ۚ᩵ۖ;
.super Ll/᩵ۜۖ;
.source "QCDS"

# interfaces
.implements Ll/ۨᩴۖ;
.implements Ljava/util/RandomAccess;
.implements Ll/ۤ֡ۖ;


# static fields
.field public static final ۙ:Ll/ۚ᩵ۖ;


# instance fields
.field public ᩶:I

.field public ᩹:[J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 25
    new-instance v0, Ll/ۚ᩵ۖ;

    const/4 v1, 0x0

    new-array v2, v1, [J

    invoke-direct {v0, v2, v1, v1}, Ll/ۚ᩵ۖ;-><init>([JIZ)V

    sput-object v0, Ll/ۚ᩵ۖ;->ۙ:Ll/ۚ᩵ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [J

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 42
    invoke-direct {p0, v0, v1, v2}, Ll/ۚ᩵ۖ;-><init>([JIZ)V

    return-void
.end method

.method public constructor <init>([JIZ)V
    .locals 0

    .line 49
    invoke-direct {p0, p3}, Ll/᩵ۜۖ;-><init>(Z)V

    .line 50
    iput-object p1, p0, Ll/ۚ᩵ۖ;->᩹:[J

    .line 51
    iput p2, p0, Ll/ۚ᩵ۖ;->᩶:I

    return-void
.end method

.method private ֫(I)V
    .locals 3

    if-ltz p1, :cond_0

    .line 264
    iget v0, p0, Ll/ۚ᩵ۖ;->᩶:I

    if-ge p1, v0, :cond_0

    return-void

    .line 265
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index:"

    const-string v2, ", Size:"

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 270
    iget v1, p0, Ll/ۚ᩵ۖ;->᩶:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 265
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ()Ll/ۚ᩵ۖ;
    .locals 1

    .line 28
    sget-object v0, Ll/ۚ᩵ۖ;->ۙ:Ll/ۚ᩵ۖ;

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 6

    .line 22
    check-cast p2, Ljava/lang/Long;

    .line 164
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 185
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    if-ltz p1, :cond_1

    .line 186
    iget p2, p0, Ll/ۚ᩵ۖ;->᩶:I

    if-gt p1, p2, :cond_1

    .line 190
    iget-object v2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    array-length v3, v2

    const/4 v4, 0x1

    if-ge p2, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr p2, p1

    .line 192
    invoke-static {v2, p1, v2, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    const/4 v5, 0x2

    .line 195
    invoke-static {p2, v3, v5, v4}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result p2

    .line 196
    new-array p2, p2, [J

    const/4 v3, 0x0

    .line 199
    invoke-static {v2, v3, p2, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 202
    iget-object v2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    add-int/lit8 v3, p1, 0x1

    iget v5, p0, Ll/ۚ᩵ۖ;->᩶:I

    sub-int/2addr v5, p1

    invoke-static {v2, p1, p2, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    iput-object p2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    .line 206
    :goto_0
    iget-object p2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    aput-wide v0, p2, p1

    .line 207
    iget p1, p0, Ll/ۚ᩵ۖ;->᩶:I

    add-int/2addr p1, v4

    iput p1, p0, Ll/ۚ᩵ۖ;->᩶:I

    .line 208
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/2addr p1, v4

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    .line 187
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Index:"

    const-string v1, ", Size:"

    .line 0
    invoke-static {p1, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 270
    iget v0, p0, Ll/ۚ᩵ۖ;->᩶:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 187
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 22
    check-cast p1, Ljava/lang/Long;

    .line 158
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۚ᩵ۖ;->֫(J)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 5

    .line 213
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 215
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    instance-of v0, p1, Ll/ۚ᩵ۖ;

    if-nez v0, :cond_0

    .line 219
    invoke-super {p0, p1}, Ll/᩵ۜۖ;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 222
    :cond_0
    check-cast p1, Ll/ۚ᩵ۖ;

    .line 223
    iget v0, p1, Ll/ۚ᩵ۖ;->᩶:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 227
    :cond_1
    iget v2, p0, Ll/ۚ᩵ۖ;->᩶:I

    const v3, 0x7fffffff

    sub-int/2addr v3, v2

    if-lt v3, v0, :cond_3

    add-int/2addr v2, v0

    .line 234
    iget-object v0, p0, Ll/ۚ᩵ۖ;->᩹:[J

    array-length v3, v0

    if-le v2, v3, :cond_2

    .line 235
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Ll/ۚ᩵ۖ;->᩹:[J

    .line 238
    :cond_2
    iget-object v0, p1, Ll/ۚ᩵ۖ;->᩹:[J

    iget-object v3, p0, Ll/ۚ᩵ۖ;->᩹:[J

    iget v4, p0, Ll/ۚ᩵ۖ;->᩶:I

    iget p1, p1, Ll/ۚ᩵ۖ;->᩶:I

    invoke-static {v0, v1, v3, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 239
    iput v2, p0, Ll/ۚ᩵ۖ;->᩶:I

    .line 240
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return v0

    .line 230
    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 134
    invoke-virtual {p0, p1}, Ll/ۚ᩵ۖ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 71
    :cond_0
    instance-of v1, p1, Ll/ۚ᩵ۖ;

    if-nez v1, :cond_1

    .line 72
    invoke-super {p0, p1}, Ll/᩵ۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 74
    :cond_1
    check-cast p1, Ll/ۚ᩵ۖ;

    .line 75
    iget v1, p0, Ll/ۚ᩵ۖ;->᩶:I

    iget v2, p1, Ll/ۚ᩵ۖ;->᩶:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 79
    :cond_2
    iget-object p1, p1, Ll/ۚ᩵ۖ;->᩹:[J

    const/4 v1, 0x0

    .line 80
    :goto_0
    iget v2, p0, Ll/ۚ᩵ۖ;->᩶:I

    if-ge v1, v2, :cond_4

    .line 81
    iget-object v2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    aget-wide v4, v2, v1

    aget-wide v6, p1, v1

    cmp-long v2, v4, v6

    if-eqz v2, :cond_3

    return v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 108
    invoke-virtual {p0, p1}, Ll/ۚ᩵ۖ;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final getLong(I)J
    .locals 3

    .line 113
    invoke-direct {p0, p1}, Ll/ۚ᩵ۖ;->֫(I)V

    .line 114
    iget-object v0, p0, Ll/ۚ᩵ۖ;->᩹:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final hashCode()I
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 92
    :goto_0
    iget v2, p0, Ll/ۚ᩵ۖ;->᩶:I

    if-ge v1, v2, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    .line 93
    iget-object v2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    aget-wide v3, v2, v1

    invoke-static {v3, v4}, Ll/ܰᩴۖ;->֫(J)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 7

    .line 119
    instance-of v0, p1, Ljava/lang/Long;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 122
    :cond_0
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 139
    iget p1, p0, Ll/ۚ᩵ۖ;->᩶:I

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    .line 125
    iget-object v4, p0, Ll/ۚ᩵ۖ;->᩹:[J

    aget-wide v5, v4, v0

    cmp-long v4, v5, v2

    if-nez v4, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 5

    .line 246
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 247
    invoke-direct {p0, p1}, Ll/ۚ᩵ۖ;->֫(I)V

    .line 248
    iget-object v0, p0, Ll/ۚ᩵ۖ;->᩹:[J

    aget-wide v1, v0, p1

    .line 249
    iget v3, p0, Ll/ۚ᩵ۖ;->᩶:I

    add-int/lit8 v4, v3, -0x1

    if-ge p1, v4, :cond_0

    add-int/lit8 v4, p1, 0x1

    sub-int/2addr v3, p1

    add-int/lit8 v3, v3, -0x1

    .line 250
    invoke-static {v0, v4, v0, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 252
    :cond_0
    iget p1, p0, Ll/ۚ᩵ۖ;->᩶:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۚ᩵ۖ;->᩶:I

    .line 253
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 254
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final removeRange(II)V
    .locals 2

    .line 56
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    if-lt p2, p1, :cond_0

    .line 61
    iget-object v0, p0, Ll/ۚ᩵ۖ;->᩹:[J

    iget v1, p0, Ll/ۚ᩵ۖ;->᩶:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 62
    iget v0, p0, Ll/ۚ᩵ۖ;->᩶:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/ۚ᩵ۖ;->᩶:I

    .line 63
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "toIndex < fromIndex"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 22
    check-cast p2, Ljava/lang/Long;

    .line 144
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 149
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 150
    invoke-direct {p0, p1}, Ll/ۚ᩵ۖ;->֫(I)V

    .line 151
    iget-object p2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    aget-wide v2, p2, p1

    .line 152
    aput-wide v0, p2, p1

    .line 144
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 139
    iget v0, p0, Ll/ۚ᩵ۖ;->᩶:I

    return v0
.end method

.method public final ֫(J)V
    .locals 5

    .line 170
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 171
    iget v0, p0, Ll/ۚ᩵ۖ;->᩶:I

    iget-object v1, p0, Ll/ۚ᩵ۖ;->᩹:[J

    array-length v2, v1

    if-ne v0, v2, :cond_0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    .line 173
    invoke-static {v0, v2, v3, v4}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v2

    .line 174
    new-array v2, v2, [J

    const/4 v3, 0x0

    .line 176
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 177
    iput-object v2, p0, Ll/ۚ᩵ۖ;->᩹:[J

    .line 180
    :cond_0
    iget-object v0, p0, Ll/ۚ᩵ۖ;->᩹:[J

    iget v1, p0, Ll/ۚ᩵ۖ;->᩶:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۚ᩵ۖ;->᩶:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public final ᩷(I)Ll/᩺ᩴۖ;
    .locals 3

    .line 100
    iget v0, p0, Ll/ۚ᩵ۖ;->᩶:I

    if-lt p1, v0, :cond_0

    .line 103
    new-instance v0, Ll/ۚ᩵ۖ;

    iget-object v1, p0, Ll/ۚ᩵ۖ;->᩹:[J

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iget v1, p0, Ll/ۚ᩵ۖ;->᩶:I

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Ll/ۚ᩵ۖ;-><init>([JIZ)V

    return-object v0

    .line 101
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
