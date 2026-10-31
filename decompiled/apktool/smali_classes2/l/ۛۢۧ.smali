.class public final Ll/ۛۢۧ;
.super Ljava/lang/Object;
.source "K8KP"


# instance fields
.field public final ֫:I

.field public final ۖ:Ll/ۤۢۧ;

.field public final ۘ:Ll/᩵ۢۧ;

.field public ۜ:J

.field public ۡ:[I

.field public ۢ:I

.field public ۧ:I

.field public ܳ:I

.field public ܺ:[J

.field public ܽ:I

.field public ܿ:I

.field public final ᩳ:I

.field public ᩷:I

.field public final ᩻:J


# direct methods
.method public constructor <init>(ILl/ۤۢۧ;Ll/᩵ۢۧ;)V
    .locals 11

    .line 80
    iget v0, p2, Ll/ۤۢۧ;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p2, p0, Ll/ۛۢۧ;->ۖ:Ll/ۤۢۧ;

    .line 82
    invoke-virtual {p2}, Ll/ۤۢۧ;->֫()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 83
    :cond_1
    :goto_0
    invoke-static {v3}, Ll/᩺֡֫;->֫(Z)V

    if-ne v1, v2, :cond_2

    const/high16 v3, 0x63640000

    goto :goto_1

    :cond_2
    const/high16 v3, 0x62770000

    .line 224
    :goto_1
    div-int/lit8 v4, p1, 0xa

    .line 225
    rem-int/lit8 p1, p1, 0xa

    add-int/lit8 p1, p1, 0x30

    shl-int/lit8 p1, p1, 0x8

    add-int/lit8 v4, v4, 0x30

    or-int/2addr p1, v4

    or-int/2addr v3, p1

    .line 86
    iput v3, p0, Ll/ۛۢۧ;->ᩳ:I

    int-to-long v4, v0

    .line 92
    iget v3, p2, Ll/ۤۢۧ;->ᩳ:I

    int-to-long v6, v3

    const-wide/32 v8, 0xf4240

    mul-long v6, v6, v8

    iget p2, p2, Ll/ۤۢۧ;->ۧ:I

    int-to-long v8, p2

    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v10, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-static/range {v4 .. v10}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    .line 87
    iput-wide v3, p0, Ll/ۛۢۧ;->᩻:J

    .line 88
    iput-object p3, p0, Ll/ۛۢۧ;->ۘ:Ll/᩵ۢۧ;

    if-ne v1, v2, :cond_3

    const/high16 p2, 0x62640000

    or-int/2addr p1, p2

    goto :goto_2

    :cond_3
    const/4 p1, -0x1

    .line 90
    :goto_2
    iput p1, p0, Ll/ۛۢۧ;->֫:I

    const-wide/16 p1, -0x1

    .line 91
    iput-wide p1, p0, Ll/ۛۢۧ;->ۜ:J

    const/16 p1, 0x200

    new-array p2, p1, [J

    .line 92
    iput-object p2, p0, Ll/ۛۢۧ;->ܺ:[J

    new-array p1, p1, [I

    .line 93
    iput-object p1, p0, Ll/ۛۢۧ;->ۡ:[I

    .line 94
    iput v0, p0, Ll/ۛۢۧ;->ܽ:I

    return-void
.end method

.method private ܽ(I)Ll/ۡۢۧ;
    .locals 7

    .line 219
    new-instance v0, Ll/ۡۢۧ;

    iget-object v1, p0, Ll/ۛۢۧ;->ۡ:[I

    aget v1, v1, p1

    int-to-long v1, v1

    .line 215
    iget-wide v3, p0, Ll/ۛۢۧ;->᩻:J

    const/4 v5, 0x1

    int-to-long v5, v5

    mul-long v3, v3, v5

    iget v5, p0, Ll/ۛۢۧ;->ܽ:I

    int-to-long v5, v5

    div-long/2addr v3, v5

    mul-long v3, v3, v1

    .line 220
    iget-object v1, p0, Ll/ۛۢۧ;->ܺ:[J

    aget-wide v5, v1, p1

    invoke-direct {v0, v3, v4, v5, v6}, Ll/ۡۢۧ;-><init>(JJ)V

    return-object v0
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 5

    .line 193
    iget v0, p0, Ll/ۛۢۧ;->ۢ:I

    if-nez v0, :cond_0

    .line 195
    new-instance p1, Ll/ۜۢۧ;

    new-instance p2, Ll/ۡۢۧ;

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Ll/ۛۢۧ;->ۜ:J

    invoke-direct {p2, v0, v1, v2, v3}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {p1, p2, p2}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1

    .line 215
    :cond_0
    iget-wide v0, p0, Ll/ۛۢۧ;->᩻:J

    const/4 v2, 0x1

    int-to-long v3, v2

    mul-long v0, v0, v3

    iget v3, p0, Ll/ۛۢۧ;->ܽ:I

    int-to-long v3, v3

    div-long/2addr v0, v3

    .line 198
    div-long/2addr p1, v0

    long-to-int p2, p1

    .line 199
    iget-object p1, p0, Ll/ۛۢۧ;->ۡ:[I

    .line 200
    invoke-static {p1, p2, v2, v2}, Ll/ۘ֨֫;->֫([IIZZ)I

    move-result p1

    .line 202
    iget-object v0, p0, Ll/ۛۢۧ;->ۡ:[I

    aget v0, v0, p1

    if-ne v0, p2, :cond_1

    .line 203
    new-instance p2, Ll/ۜۢۧ;

    invoke-direct {p0, p1}, Ll/ۛۢۧ;->ܽ(I)Ll/ۡۢۧ;

    move-result-object p1

    .line 83
    invoke-direct {p2, p1, p1}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p2

    .line 206
    :cond_1
    invoke-direct {p0, p1}, Ll/ۛۢۧ;->ܽ(I)Ll/ۡۢۧ;

    move-result-object p2

    add-int/2addr p1, v2

    .line 207
    iget-object v0, p0, Ll/ۛۢۧ;->ܺ:[J

    array-length v0, v0

    if-ge p1, v0, :cond_2

    .line 208
    new-instance v0, Ll/ۜۢۧ;

    invoke-direct {p0, p1}, Ll/ۛۢۧ;->ܽ(I)Ll/ۡۢۧ;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v0

    .line 210
    :cond_2
    new-instance p1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {p1, p2, p2}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    .line 126
    iget-object v0, p0, Ll/ۛۢۧ;->ܺ:[J

    iget v1, p0, Ll/ۛۢۧ;->ۢ:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Ll/ۛۢۧ;->ܺ:[J

    .line 127
    iget-object v0, p0, Ll/ۛۢۧ;->ۡ:[I

    iget v1, p0, Ll/ۛۢۧ;->ۢ:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۛۢۧ;->ۡ:[I

    .line 150
    iget v0, p0, Ll/ۛۢۧ;->ᩳ:I

    const/high16 v1, 0x62770000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    .line 128
    iget-object v0, p0, Ll/ۛۢۧ;->ۖ:Ll/ۤۢۧ;

    iget v0, v0, Ll/ۤۢۧ;->ܽ:I

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۛۢۧ;->ۢ:I

    if-lez v0, :cond_0

    .line 133
    iput v0, p0, Ll/ۛۢۧ;->ܽ:I

    :cond_0
    return-void
.end method

.method public final ֫(JZ)V
    .locals 5

    .line 98
    iget-wide v0, p0, Ll/ۛۢۧ;->ۜ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 99
    iput-wide p1, p0, Ll/ۛۢۧ;->ۜ:J

    :cond_0
    if-eqz p3, :cond_2

    .line 102
    iget p3, p0, Ll/ۛۢۧ;->ۢ:I

    iget-object v0, p0, Ll/ۛۢۧ;->ۡ:[I

    array-length v0, v0

    if-ne p3, v0, :cond_1

    .line 103
    iget-object p3, p0, Ll/ۛۢۧ;->ܺ:[J

    array-length v0, p3

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p3

    iput-object p3, p0, Ll/ۛۢۧ;->ܺ:[J

    .line 104
    iget-object p3, p0, Ll/ۛۢۧ;->ۡ:[I

    array-length v0, p3

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p3

    iput-object p3, p0, Ll/ۛۢۧ;->ۡ:[I

    .line 106
    :cond_1
    iget-object p3, p0, Ll/ۛۢۧ;->ܺ:[J

    iget v0, p0, Ll/ۛۢۧ;->ۢ:I

    aput-wide p1, p3, v0

    .line 107
    iget-object p1, p0, Ll/ۛۢۧ;->ۡ:[I

    iget p2, p0, Ll/ۛۢۧ;->᩷:I

    aput p2, p1, v0

    add-int/lit8 v0, v0, 0x1

    .line 108
    iput v0, p0, Ll/ۛۢۧ;->ۢ:I

    .line 110
    :cond_2
    iget p1, p0, Ll/ۛۢۧ;->᩷:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۛۢۧ;->᩷:I

    return-void
.end method

.method public final ֫(I)Z
    .locals 1

    .line 138
    iget v0, p0, Ll/ۛۢۧ;->ᩳ:I

    if-eq v0, p1, :cond_1

    iget v0, p0, Ll/ۛۢۧ;->֫:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 12

    .line 164
    iget v0, p0, Ll/ۛۢۧ;->ۧ:I

    .line 165
    iget-object v1, p0, Ll/ۛۢۧ;->ۘ:Ll/᩵ۢۧ;

    const/4 v2, 0x0

    invoke-interface {v1, p1, v0, v2}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result p1

    sub-int/2addr v0, p1

    iput v0, p0, Ll/ۛۢۧ;->ۧ:I

    if-nez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 168
    iget v0, p0, Ll/ۛۢۧ;->ܳ:I

    if-lez v0, :cond_2

    .line 118
    iget v0, p0, Ll/ۛۢۧ;->ܿ:I

    .line 215
    iget-wide v1, p0, Ll/ۛۢۧ;->᩻:J

    int-to-long v3, v0

    mul-long v1, v1, v3

    iget v3, p0, Ll/ۛۢۧ;->ܽ:I

    int-to-long v3, v3

    div-long v6, v1, v3

    .line 142
    iget-object v1, p0, Ll/ۛۢۧ;->ۡ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v8, 0x0

    .line 171
    :goto_1
    iget v9, p0, Ll/ۛۢۧ;->ܳ:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 169
    iget-object v5, p0, Ll/ۛۢۧ;->ۘ:Ll/᩵ۢۧ;

    invoke-interface/range {v5 .. v11}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 114
    :cond_2
    iget v0, p0, Ll/ۛۢۧ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۛۢۧ;->ܿ:I

    :cond_3
    return p1
.end method

.method public final ۧ(I)V
    .locals 0

    .line 155
    iput p1, p0, Ll/ۛۢۧ;->ܳ:I

    .line 156
    iput p1, p0, Ll/ۛۢۧ;->ۧ:I

    return-void
.end method

.method public final ۧ(J)V
    .locals 2

    .line 182
    iget v0, p0, Ll/ۛۢۧ;->ۢ:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 183
    iput p1, p0, Ll/ۛۢۧ;->ܿ:I

    return-void

    .line 185
    :cond_0
    iget-object v0, p0, Ll/ۛۢۧ;->ܺ:[J

    const/4 v1, 0x1

    .line 186
    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result p1

    .line 188
    iget-object p2, p0, Ll/ۛۢۧ;->ۡ:[I

    aget p1, p2, p1

    iput p1, p0, Ll/ۛۢۧ;->ܿ:I

    return-void
.end method
