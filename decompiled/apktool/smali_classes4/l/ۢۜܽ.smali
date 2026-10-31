.class public final Ll/ۢۜܽ;
.super Ll/᩷ܿܽ;
.source "X4NP"


# instance fields
.field public ۖ:I

.field public final ۘ:I

.field public ۜ:Z

.field public ۡ:I

.field public ۢ:[Ll/᩷ۜܽ;

.field public final ܳ:I

.field public final ܺ:I

.field public ܽ:I

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:Ll/ۗۜܽ;

.field public ᩴ:I

.field public ᩵:[I

.field public ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۛۜܽ;)V
    .locals 12

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۢۜܽ;->ܿ:Ljava/lang/Object;

    .line 45
    iget-object v0, p1, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iput-object v0, p0, Ll/ۢۜܽ;->ᩳ:Ll/ۗۜܽ;

    .line 46
    invoke-virtual {p1}, Ll/ۛۜܽ;->ۧ()I

    move-result v1

    iput v1, p0, Ll/ۢۜܽ;->ܽ:I

    .line 48
    invoke-static {p1}, Ll/֫ᩳܽ;->֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;

    move-result-object v1

    .line 49
    iget-short v2, v1, Ll/֫ᩳܽ;->ᩳ:S

    if-nez v2, :cond_0

    .line 50
    iget v1, v1, Ll/֫ᩳܽ;->֫:I

    add-int/lit8 v1, v1, -0x8

    invoke-virtual {p1, v1}, Ll/ۛۜܽ;->ᩳ(I)V

    .line 51
    invoke-virtual {p1}, Ll/ۛۜܽ;->ۧ()I

    move-result v1

    iput v1, p0, Ll/ۢۜܽ;->ܽ:I

    .line 52
    invoke-static {p1}, Ll/֫ᩳܽ;->֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;

    move-result-object v1

    .line 54
    :cond_0
    iget v2, v1, Ll/֫ᩳܽ;->ۧ:I

    iget v3, v1, Ll/֫ᩳܽ;->֫:I

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ll/֫ᩳܽ;->֫(I)V

    .line 56
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v1

    .line 57
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v5

    iput v5, p0, Ll/ۢۜܽ;->ۖ:I

    .line 58
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v6

    .line 59
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v7

    .line 60
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v8

    iput v8, p0, Ll/ۢۜܽ;->ᩴ:I

    const/16 v9, 0x1c

    if-le v2, v9, :cond_1

    add-int/lit8 v9, v2, -0x1c

    .line 62
    invoke-virtual {p1, v9}, Ll/ۛۜܽ;->ᩳ(I)V

    :cond_1
    if-ge v7, v2, :cond_2

    move v7, v2

    :cond_2
    const/4 v9, 0x0

    if-eqz v5, :cond_3

    if-nez v8, :cond_5

    :cond_3
    if-ltz v1, :cond_4

    mul-int/lit8 v5, v1, 0x4

    add-int/2addr v5, v2

    if-le v5, v7, :cond_5

    .line 70
    :cond_4
    iput v9, p0, Ll/ۢۜܽ;->ۖ:I

    .line 71
    iput v9, p0, Ll/ۢۜܽ;->ᩴ:I

    sub-int v1, v7, v2

    .line 72
    div-int/lit8 v1, v1, 0x4

    .line 76
    :cond_5
    iput v1, p0, Ll/ۢۜܽ;->᩷:I

    .line 77
    iput v7, p0, Ll/ۢۜܽ;->ۡ:I

    .line 79
    iget v5, p0, Ll/ۢۜܽ;->ۖ:I

    if-nez v5, :cond_6

    .line 80
    iput v9, p0, Ll/ۢۜܽ;->ᩴ:I

    :cond_6
    const/high16 v8, 0x1000000

    if-gt v1, v8, :cond_a

    if-le v5, v1, :cond_7

    .line 87
    iput v1, p0, Ll/ۢۜܽ;->ۖ:I

    .line 90
    :cond_7
    iget v5, p0, Ll/ۢۜܽ;->ܽ:I

    add-int/2addr v2, v5

    iput v2, p0, Ll/ۢۜܽ;->᩻:I

    .line 91
    iget v2, p0, Ll/ۢۜܽ;->ᩴ:I

    invoke-virtual {v0}, Ll/ۗۜܽ;->֫()[B

    move-result-object v8

    array-length v8, v8

    invoke-static {v5, v7, v2, v3, v8}, Ll/᩷ܿܽ;->֫(IIIII)I

    move-result v2

    iput v2, p0, Ll/ۢۜܽ;->ܳ:I

    .line 92
    iget v2, p0, Ll/ۢۜܽ;->ܽ:I

    int-to-long v7, v2

    int-to-long v10, v3

    add-long/2addr v7, v10

    invoke-virtual {v0}, Ll/ۗۜܽ;->֫()[B

    move-result-object v0

    array-length v0, v0

    int-to-long v10, v0

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v0, v7

    iput v0, p0, Ll/ۢۜܽ;->ۘ:I

    .line 94
    invoke-virtual {p1}, Ll/ۛۜܽ;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ۢۜܽ;->ܺ:I

    mul-int/lit8 v0, v1, 0x4

    .line 95
    invoke-virtual {p1, v0}, Ll/ۛۜܽ;->ᩳ(I)V

    .line 97
    iget v0, p0, Ll/ۢۜܽ;->ۖ:I

    if-eqz v0, :cond_8

    .line 98
    invoke-virtual {p1, v0}, Ll/ۛۜܽ;->֫(I)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۢۜܽ;->᩵:[I

    goto :goto_0

    :cond_8
    new-array v0, v9, [I

    .line 100
    iput-object v0, p0, Ll/ۢۜܽ;->᩵:[I

    .line 102
    :goto_0
    new-array v0, v1, [Ll/᩷ۜܽ;

    iput-object v0, p0, Ll/ۢۜܽ;->ۢ:[Ll/᩷ۜܽ;

    and-int/lit16 v0, v6, 0x100

    if-eqz v0, :cond_9

    goto :goto_1

    :cond_9
    const/4 v4, 0x0

    .line 103
    :goto_1
    iput-boolean v4, p0, Ll/ۢۜܽ;->ۜ:Z

    .line 105
    iget v0, p0, Ll/ۢۜܽ;->ܽ:I

    add-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ll/ۛۜܽ;->ܽ(I)V

    return-void

    .line 83
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Too many strings"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ۢۜܽ;
    .locals 4

    .line 38
    new-instance v0, Ll/ۗۜܽ;

    iget-object v1, p0, Ll/۬ۜܽ;->᩸:[B

    invoke-direct {v0, v1}, Ll/ۗۜܽ;-><init>([B)V

    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->᩻(I)Ll/ۛۜܽ;

    move-result-object v0

    .line 39
    new-instance v1, Ll/ۢۜܽ;

    invoke-direct {v1, v0}, Ll/ۢۜܽ;-><init>(Ll/ۛۜܽ;)V

    .line 40
    invoke-virtual {v0}, Ll/ۛۜܽ;->ۧ()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {p0, v2, v3}, Ll/۬ۜܽ;->seek(J)V

    return-object v1
.end method

.method private ܽ(I)I
    .locals 6

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getPreviousStringEndOffset "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩹ܽܽ;->֫(Ljava/lang/String;)V

    .line 189
    iget v0, p0, Ll/ۢۜܽ;->ۡ:I

    iget v1, p0, Ll/ۢۜܽ;->ܽ:I

    add-int/2addr v1, v0

    if-nez p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    mul-int/lit8 v0, p1, 0x4

    .line 205
    iget v2, p0, Ll/ۢۜܽ;->ܺ:I

    add-int/2addr v0, v2

    iget-object v2, p0, Ll/ۢۜܽ;->ᩳ:Ll/ۗۜܽ;

    invoke-virtual {v2, v0}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v0

    add-int/2addr v0, v1

    .line 193
    iget-boolean v1, p0, Ll/ۢۜܽ;->ۜ:Z

    iget v3, p0, Ll/ۢۜܽ;->ܳ:I

    invoke-static {v2, v0, v1, v3}, Ll/᩷ܿܽ;->ۧ(Ll/ۗۜܽ;IZI)I

    move-result v0

    .line 194
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "new offset "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩹ܽܽ;->֫(Ljava/lang/String;)V

    const/4 v4, -0x1

    if-eq v0, v4, :cond_1

    return v0

    .line 198
    :cond_1
    invoke-direct {p0, p1}, Ll/ۢۜܽ;->ܽ(I)I

    move-result p1

    if-ne p1, v4, :cond_2

    return v4

    .line 201
    :cond_2
    invoke-static {v2, p1, v1, v3}, Ll/᩷ܿܽ;->ۧ(Ll/ۗۜܽ;IZI)I

    move-result p1

    return p1
.end method

.method private ܿ(I)[I
    .locals 8

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    .line 213
    iget v1, p0, Ll/ۢۜܽ;->ۖ:I

    if-ge p1, v1, :cond_4

    iget v1, p0, Ll/ۢۜܽ;->ᩴ:I

    if-lez v1, :cond_4

    iget v2, p0, Ll/ۢۜܽ;->ۡ:I

    if-ge v1, v2, :cond_0

    goto :goto_1

    .line 215
    :cond_0
    iget v2, p0, Ll/ۢۜܽ;->ܽ:I

    int-to-long v2, v2

    int-to-long v4, v1

    add-long/2addr v2, v4

    .line 216
    iget-object v1, p0, Ll/ۢۜܽ;->᩵:[I

    aget p1, v1, p1

    int-to-long v4, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    add-long/2addr v4, v2

    .line 217
    iget p1, p0, Ll/ۢۜܽ;->᩻:I

    int-to-long v6, p1

    cmp-long p1, v2, v6

    if-ltz p1, :cond_4

    iget p1, p0, Ll/ۢۜܽ;->ۘ:I

    int-to-long v1, p1

    const-wide/16 v6, 0x4

    sub-long/2addr v1, v6

    cmp-long v3, v4, v1

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    long-to-int v1, v4

    .line 220
    new-instance v2, Ll/ܺۢᩴ;

    invoke-direct {v2}, Ll/ܺۢᩴ;-><init>()V

    :goto_0
    add-int/lit8 v3, p1, -0x4

    if-gt v1, v3, :cond_4

    .line 222
    iget-object v3, p0, Ll/ۢۜܽ;->ᩳ:Ll/ۗۜܽ;

    invoke-virtual {v3, v1}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v4

    add-int/lit8 v5, v1, 0x4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_2

    .line 226
    invoke-virtual {v2}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object p1

    return-object p1

    :cond_2
    add-int/lit8 v6, p1, -0x8

    if-le v5, v6, :cond_3

    return-object v0

    .line 230
    :cond_3
    invoke-virtual {v2, v4}, Ll/ܺۢᩴ;->add(I)Z

    .line 231
    invoke-virtual {v3, v5}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v4

    invoke-virtual {v2, v4}, Ll/ܺۢᩴ;->add(I)Z

    add-int/lit8 v4, v1, 0x8

    .line 232
    invoke-virtual {v3, v4}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܺۢᩴ;->add(I)Z

    add-int/lit8 v1, v1, 0xc

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method private ᩳ(I)Ljava/lang/String;
    .locals 5

    if-ltz p1, :cond_6

    .line 155
    iget v0, p0, Ll/ۢۜܽ;->᩷:I

    if-lt p1, v0, :cond_0

    goto :goto_1

    .line 159
    :cond_0
    iget-object v0, p0, Ll/ۢۜܽ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 161
    :try_start_0
    iget v1, p0, Ll/ۢۜܽ;->ܽ:I

    iget v2, p0, Ll/ۢۜܽ;->ۡ:I

    add-int/2addr v1, v2

    .line 205
    iget-object v2, p0, Ll/ۢۜܽ;->ᩳ:Ll/ۗۜܽ;

    iget v3, p0, Ll/ۢۜܽ;->ܺ:I

    mul-int/lit8 v4, p1, 0x4

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v2

    add-int/2addr v1, v2

    .line 162
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 163
    iget v0, p0, Ll/ۢۜܽ;->᩻:I

    if-lt v1, v0, :cond_5

    iget v0, p0, Ll/ۢۜܽ;->ܳ:I

    if-lt v1, v0, :cond_1

    goto :goto_0

    .line 166
    :cond_1
    iget-object v2, p0, Ll/ۢۜܽ;->ᩳ:Ll/ۗۜܽ;

    iget-boolean v3, p0, Ll/ۢۜܽ;->ۜ:Z

    invoke-virtual {p0, v2, v1, v3, v0}, Ll/᩷ܿܽ;->֫(Ll/ۗۜܽ;IZI)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    .line 170
    iget-object v0, p0, Ll/ۢۜܽ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 171
    :try_start_1
    invoke-direct {p0, p1}, Ll/ۢۜܽ;->ܽ(I)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_2

    .line 173
    iget-object v1, p0, Ll/ۢۜܽ;->ᩳ:Ll/ۗۜܽ;

    iget-boolean v2, p0, Ll/ۢۜܽ;->ۜ:Z

    iget v3, p0, Ll/ۢۜܽ;->ܳ:I

    invoke-virtual {p0, v1, p1, v2, v3}, Ll/᩷ܿܽ;->֫(Ll/ۗۜܽ;IZI)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 176
    iget v2, p0, Ll/ۢۜܽ;->ܽ:I

    sub-int/2addr p1, v2

    iget v2, p0, Ll/ۢۜܽ;->ۡ:I

    sub-int/2addr p1, v2

    .line 209
    iget-object v2, p0, Ll/ۢۜܽ;->ᩳ:Ll/ۗۜܽ;

    invoke-virtual {v2}, Ll/ۗۜܽ;->֫()[B

    move-result-object v2

    iget v3, p0, Ll/ۢۜܽ;->ܺ:I

    add-int/2addr v4, v3

    invoke-static {v4, p1, v2}, Ll/ܺܰۡ;->֫(II[B)V

    .line 179
    :cond_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_3

    const-string p1, ""

    return-object p1

    :cond_3
    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    return-object v1

    :cond_5
    :goto_0
    const-string p1, ""

    return-object p1

    :catchall_1
    move-exception p1

    .line 162
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    .line 156
    :cond_6
    :goto_1
    iget v0, p0, Ll/ۢۜܽ;->᩷:I

    .line 47
    invoke-static {p1, v0}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final bridge synthetic getItem(I)Ll/ۗ᩻ܽ;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Ll/ۢۜܽ;->getItem(I)Ll/᩷ۜܽ;

    move-result-object p1

    return-object p1
.end method

.method public final getItem(I)Ll/᩷ۜܽ;
    .locals 4

    if-ltz p1, :cond_3

    .line 121
    iget v0, p0, Ll/ۢۜܽ;->᩷:I

    if-ge p1, v0, :cond_3

    .line 122
    iget-object v0, p0, Ll/ۢۜܽ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 123
    :try_start_0
    iget-object v1, p0, Ll/ۢۜܽ;->ۢ:[Ll/᩷ۜܽ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    aget-object v1, v1, p1

    :goto_0
    if-eqz v1, :cond_1

    .line 125
    monitor-exit v0

    return-object v1

    .line 126
    :cond_1
    invoke-direct {p0, p1}, Ll/ۢۜܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v1

    .line 127
    invoke-direct {p0, p1}, Ll/ۢۜܽ;->ܿ(I)[I

    move-result-object v2

    .line 128
    new-instance v3, Ll/᩷ۜܽ;

    invoke-direct {v3, p0, v1, v2}, Ll/᩷ۜܽ;-><init>(Ll/᩷ܿܽ;Ljava/lang/String;[I)V

    .line 129
    iget-object v1, p0, Ll/ۢۜܽ;->ۢ:[Ll/᩷ۜܽ;

    if-eqz v1, :cond_2

    .line 130
    aput-object v3, v1, p1

    .line 132
    :cond_2
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception p1

    .line 133
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 135
    :cond_3
    invoke-direct {p0, p1}, Ll/ۢۜܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    .line 136
    invoke-direct {p0, p1}, Ll/ۢۜܽ;->ܿ(I)[I

    move-result-object p1

    .line 137
    new-instance v1, Ll/᩷ۜܽ;

    invoke-direct {v1, p0, v0, p1}, Ll/᩷ۜܽ;-><init>(Ll/᩷ܿܽ;Ljava/lang/String;[I)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 110
    iget v0, p0, Ll/ۢۜܽ;->᩷:I

    return v0
.end method

.method public final ֫(I)Ll/ۗ᩻ܽ;
    .locals 1

    .line 143
    iget v0, p0, Ll/ۢۜܽ;->᩷:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 146
    invoke-virtual {p0, p1}, Ll/ۢۜܽ;->getItem(I)Ll/᩷ۜܽ;

    move-result-object p1

    return-object p1

    .line 144
    :cond_0
    invoke-static {p1, v0}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 151
    iget-boolean v0, p0, Ll/ۢۜܽ;->ۜ:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 114
    iget-object v0, p0, Ll/ۢۜܽ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 115
    :try_start_0
    iput-object v1, p0, Ll/ۢۜܽ;->ۢ:[Ll/᩷ۜܽ;

    .line 116
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
