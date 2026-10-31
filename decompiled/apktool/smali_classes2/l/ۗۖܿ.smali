.class public final Ll/ۗۖܿ;
.super Ljava/lang/Object;
.source "2708"


# instance fields
.field public ֫:Z

.field public ۜ:[I

.field public ۡ:[I

.field public ۢ:I

.field public ۧ:[Z

.field public ܳ:[I

.field public ܺ:[Ll/᩸᩷ܿ;

.field public ܽ:I

.field public ܿ:[I

.field public ᩳ:[J

.field public ᩷:[I

.field public ᩻:[Ll/ۙۖܿ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [I

    .line 11
    iput-object v1, p0, Ll/ۗۖܿ;->ۡ:[I

    new-array v1, v0, [I

    .line 12
    iput-object v1, p0, Ll/ۗۖܿ;->ܿ:[I

    new-array v1, v0, [I

    .line 13
    iput-object v1, p0, Ll/ۗۖܿ;->ܳ:[I

    const/4 v1, -0x1

    .line 17
    iput v1, p0, Ll/ۗۖܿ;->ܽ:I

    new-array v0, v0, [Ll/᩸᩷ܿ;

    .line 18
    iput-object v0, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    return-void
.end method

.method private ֫(IILl/᩸᩷ܿ;Z)I
    .locals 5

    if-ltz p1, :cond_8

    if-lt p2, p1, :cond_8

    const-string v0, "style"

    .line 83
    invoke-static {p3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    sget-object v0, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    const/4 v1, -0x1

    if-eq p3, v0, :cond_7

    if-ne p1, p2, :cond_0

    goto :goto_1

    .line 87
    :cond_0
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    iget-object v2, p0, Ll/ۗۖܿ;->ۡ:[I

    array-length v2, v2

    if-ne v0, v2, :cond_1

    .line 88
    invoke-direct {p0}, Ll/ۗۖܿ;->ܳ()V

    .line 90
    :cond_1
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۗۖܿ;->ۢ:I

    .line 91
    iget-object v2, p0, Ll/ۗۖܿ;->ۡ:[I

    aput p1, v2, v0

    .line 92
    iget-object p1, p0, Ll/ۗۖܿ;->ܿ:[I

    aput p2, p1, v0

    .line 93
    iget-object p1, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    aput-object p3, p1, v0

    .line 94
    iget-object p1, p0, Ll/ۗۖܿ;->ᩳ:[J

    if-eqz p1, :cond_2

    const-wide/16 v3, 0x0

    aput-wide v3, p1, v0

    .line 95
    :cond_2
    iget-object p1, p0, Ll/ۗۖܿ;->ܳ:[I

    aput v1, p1, v0

    if-eqz p4, :cond_4

    .line 97
    iget-object p1, p0, Ll/ۗۖܿ;->ۧ:[Z

    if-eqz p1, :cond_3

    const/4 p3, 0x0

    aput-boolean p3, p1, v0

    .line 98
    :cond_3
    invoke-virtual {p0, p2}, Ll/ۗۖܿ;->᩻(I)V

    goto :goto_0

    .line 100
    :cond_4
    iget-object p1, p0, Ll/ۗۖܿ;->ۧ:[Z

    if-nez p1, :cond_5

    .line 101
    array-length p1, v2

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ۗۖܿ;->ۧ:[Z

    .line 103
    :cond_5
    iget-object p1, p0, Ll/ۗۖܿ;->ۧ:[Z

    const/4 p2, 0x1

    aput-boolean p2, p1, v0

    .line 105
    :goto_0
    iget-object p1, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll/ۗۖܿ;->᩷:[I

    aput v1, p1, v0

    :cond_6
    return v0

    :cond_7
    :goto_1
    return v1

    .line 81
    :cond_8
    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string p4, "Invalid style range: "

    const-string v0, ".."

    .line 0
    invoke-static {p4, p1, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 81
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method private ۢ(I)V
    .locals 3

    if-ltz p1, :cond_2

    .line 236
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    if-gt p1, v0, :cond_2

    .line 239
    iget-object v1, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 240
    iget-object v0, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/ۗۖܿ;->ۢ:I

    invoke-static {v0, p1, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 241
    :cond_0
    iget-object v0, p0, Ll/ۗۖܿ;->ۧ:[Z

    if-eqz v0, :cond_1

    .line 242
    iget v1, p0, Ll/ۗۖܿ;->ۢ:I

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 244
    :cond_1
    iput p1, p0, Ll/ۗۖܿ;->ۢ:I

    return-void

    .line 237
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid style journal mark: "

    const-string v2, ", size="

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 237
    iget v1, p0, Ll/ۗۖܿ;->ۢ:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܳ()V
    .locals 5

    .line 255
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    int-to-long v1, v0

    shr-int/lit8 v0, v0, 0x1

    int-to-long v3, v0

    add-long/2addr v1, v3

    const-wide/32 v3, 0x7fffffff

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 256
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    if-le v1, v0, :cond_3

    .line 259
    iget-object v0, p0, Ll/ۗۖܿ;->ۡ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۗۖܿ;->ۡ:[I

    .line 260
    iget-object v0, p0, Ll/ۗۖܿ;->ܿ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۗۖܿ;->ܿ:[I

    .line 261
    iget-object v0, p0, Ll/ۗۖܿ;->ܳ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۗۖܿ;->ܳ:[I

    .line 262
    iget-object v0, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸᩷ܿ;

    iput-object v0, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    .line 263
    iget-object v0, p0, Ll/ۗۖܿ;->ᩳ:[J

    if-eqz v0, :cond_0

    .line 264
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Ll/ۗۖܿ;->ᩳ:[J

    .line 266
    :cond_0
    iget-object v0, p0, Ll/ۗۖܿ;->ۧ:[Z

    if-eqz v0, :cond_1

    .line 267
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v0

    iput-object v0, p0, Ll/ۗۖܿ;->ۧ:[Z

    .line 269
    :cond_1
    iget-object v0, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    if-eqz v0, :cond_2

    .line 270
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۙۖܿ;

    iput-object v0, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    .line 271
    iget-object v0, p0, Ll/ۗۖܿ;->ۜ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۗۖܿ;->ۜ:[I

    .line 272
    iget-object v0, p0, Ll/ۗۖܿ;->᩷:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۗۖܿ;->᩷:[I

    :cond_2
    return-void

    .line 257
    :cond_3
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "Syntax style journal capacity exceeded"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ۗۖܿ;->ܿ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(IILl/᩸᩷ܿ;)I
    .locals 1

    const/4 v0, 0x1

    .line 69
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۗۖܿ;->֫(IILl/᩸᩷ܿ;Z)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/᩸ۢܿ;)I
    .locals 4

    .line 112
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    iget-object v1, p0, Ll/ۗۖܿ;->ۡ:[I

    array-length v1, v1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Ll/ۗۖܿ;->ܳ()V

    .line 113
    :cond_0
    iget-object v0, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    if-nez v0, :cond_1

    .line 114
    iget-object v0, p0, Ll/ۗۖܿ;->ۡ:[I

    array-length v1, v0

    new-array v1, v1, [Ll/ۙۖܿ;

    iput-object v1, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    .line 115
    array-length v1, v0

    new-array v1, v1, [I

    iput-object v1, p0, Ll/ۗۖܿ;->ۜ:[I

    .line 116
    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۗۖܿ;->᩷:[I

    .line 118
    :cond_1
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۗۖܿ;->ۢ:I

    .line 119
    iget-object v1, p0, Ll/ۗۖܿ;->ۧ:[Z

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    aput-boolean v2, v1, v0

    .line 120
    :cond_2
    iget-object v1, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    .line 121
    iget-object v1, p0, Ll/ۗۖܿ;->ᩳ:[J

    if-eqz v1, :cond_3

    const-wide/16 v2, 0x0

    aput-wide v2, v1, v0

    .line 122
    :cond_3
    iget-object v1, p0, Ll/ۗۖܿ;->ܳ:[I

    const/4 v2, -0x1

    aput v2, v1, v0

    .line 123
    iget-object v1, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    aput-object p1, v1, v0

    .line 124
    iget-object p1, p0, Ll/ۗۖܿ;->ۜ:[I

    aput v2, p1, v0

    .line 125
    iget-object p1, p0, Ll/ۗۖܿ;->᩷:[I

    aput v2, p1, v0

    return v0
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 249
    invoke-direct {p0, v0}, Ll/ۗۖܿ;->ۢ(I)V

    const/4 v0, -0x1

    .line 250
    iput v0, p0, Ll/ۗۖܿ;->ܽ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ۗۖܿ;->ܳ:[I

    aput p2, v0, p1

    return-void
.end method

.method public final ֫(III)V
    .locals 5

    .line 194
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 195
    iget-object v0, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    aget-object v0, v0, p1

    if-nez v0, :cond_0

    return-void

    .line 196
    :cond_0
    invoke-virtual {v0}, Ll/᩸᩷ܿ;->֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 197
    iget-object v0, p0, Ll/ۗۖܿ;->ᩳ:[J

    const-wide/16 v1, 0x0

    if-nez v0, :cond_1

    move-wide v3, v1

    goto :goto_0

    :cond_1
    aget-wide v3, v0, p1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    .line 198
    iget-object v1, p0, Ll/ۗۖܿ;->ۡ:[I

    aget v1, v1, p1

    goto :goto_1

    :cond_2
    const/16 v1, 0x20

    ushr-long v1, v3, v1

    long-to-int v1, v1

    :goto_1
    if-nez v0, :cond_3

    .line 199
    iget-object v0, p0, Ll/ۗۖܿ;->ܿ:[I

    aget v0, v0, p1

    goto :goto_2

    :cond_3
    long-to-int v0, v3

    :goto_2
    if-lt v1, p2, :cond_4

    if-le v0, p3, :cond_5

    .line 201
    :cond_4
    iget-object v0, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    aget-object v1, v0, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;)Ll/᩸᩷ܿ;

    move-result-object v1

    aput-object v1, v0, p1

    .line 204
    :cond_5
    iget-object v0, p0, Ll/ۗۖܿ;->ۡ:[I

    aget v0, v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 205
    iget-object v0, p0, Ll/ۗۖܿ;->ۡ:[I

    aput p2, v0, p1

    .line 206
    iget-object v0, p0, Ll/ۗۖܿ;->ܿ:[I

    aget v1, v0, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    aput p2, v0, p1

    return-void
.end method

.method public final ֫(J)V
    .locals 2

    long-to-int v0, p1

    const/16 v1, 0x20

    shr-long/2addr p1, v1

    long-to-int p2, p1

    .line 230
    invoke-direct {p0, v0}, Ll/ۗۖܿ;->ۢ(I)V

    .line 231
    iput p2, p0, Ll/ۗۖܿ;->ܽ:I

    return-void
.end method

.method public final ۜ(I)I
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ۗۖܿ;->ۡ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 33
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    return v0
.end method

.method public final ۧ(IILl/᩸᩷ܿ;)I
    .locals 1

    .line 75
    iget-boolean v0, p0, Ll/ۗۖܿ;->֫:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۗۖܿ;->֫(IILl/᩸᩷ܿ;Z)I

    move-result p1

    return p1
.end method

.method public final ۧ(II)V
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ۗۖܿ;->ۜ:[I

    aput p2, v0, p1

    return-void
.end method

.method public final ۧ(III)V
    .locals 5

    .line 186
    iget v0, p0, Ll/ۗۖܿ;->ۢ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 187
    iget-object v0, p0, Ll/ۗۖܿ;->ۡ:[I

    aget v1, v0, p1

    if-ne p2, v1, :cond_0

    iget-object v1, p0, Ll/ۗۖܿ;->ܿ:[I

    aget v1, v1, p1

    if-ne p3, v1, :cond_0

    return-void

    .line 188
    :cond_0
    iget-object v1, p0, Ll/ۗۖܿ;->ᩳ:[J

    if-nez v1, :cond_1

    array-length v0, v0

    new-array v0, v0, [J

    iput-object v0, p0, Ll/ۗۖܿ;->ᩳ:[J

    .line 189
    :cond_1
    iget-object v0, p0, Ll/ۗۖܿ;->ᩳ:[J

    int-to-long v1, p2

    const/16 p2, 0x20

    shl-long/2addr v1, p2

    int-to-long p2, p3

    const-wide v3, 0xffffffffL

    and-long/2addr p2, v3

    or-long/2addr p2, v1

    aput-wide p2, v0, p1

    return-void
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 149
    iget-boolean v0, p0, Ll/ۗۖܿ;->֫:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۗۖܿ;->ܽ:I

    if-le v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ(I)I
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ۗۖܿ;->ۜ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Ll/ۗۖܿ;->֫:Z

    const/4 v0, -0x1

    .line 50
    iput v0, p0, Ll/ۗۖܿ;->ܽ:I

    return-void
.end method

.method public final ܽ(I)Z
    .locals 2

    const/4 v0, 0x0

    if-ltz p1, :cond_2

    .line 140
    iget-object v1, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    if-ltz p1, :cond_2

    .line 142
    iget-object v1, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    aget-object v1, v1, p1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 141
    :cond_1
    iget-object v1, p0, Ll/ۗۖܿ;->ۜ:[I

    aget p1, v1, p1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method public final ܿ(I)I
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۗۖܿ;->ܳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܿ()J
    .locals 6

    .line 38
    iget v0, p0, Ll/ۗۖܿ;->ܽ:I

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    iget v2, p0, Ll/ۗۖܿ;->ۢ:I

    int-to-long v2, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ᩳ(I)I
    .locals 2

    .line 154
    iget-object v0, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    .line 156
    invoke-interface {v0}, Ll/ۙۖܿ;->֫()I

    move-result v0

    .line 157
    iget-object v1, p0, Ll/ۗۖܿ;->᩷:[I

    aput v0, v1, p1

    .line 158
    iget-object v0, p0, Ll/ۗۖܿ;->᩻:[Ll/ۙۖܿ;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    .line 160
    :cond_0
    iget-object v0, p0, Ll/ۗۖܿ;->᩷:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Ll/ۗۖܿ;->֫:Z

    const/4 v0, -0x1

    .line 44
    iput v0, p0, Ll/ۗۖܿ;->ܽ:I

    return-void
.end method

.method public final ᩷(I)Ll/᩸᩷ܿ;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۗۖܿ;->ܺ:[Ll/᩸᩷ܿ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ᩻(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 59
    iget-boolean v0, p0, Ll/ۗۖܿ;->֫:Z

    if-eqz v0, :cond_0

    .line 60
    iget v0, p0, Ll/ۗۖܿ;->ܽ:I

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ۗۖܿ;->ܽ:I

    :cond_0
    return-void

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative syntax effect end"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
