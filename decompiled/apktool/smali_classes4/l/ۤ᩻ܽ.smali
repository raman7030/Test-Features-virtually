.class public final Ll/ۤ᩻ܽ;
.super Ll/᩷ܿܽ;
.source "L99C"


# instance fields
.field public ۖ:I

.field public ۘ:I

.field public final ۜ:Ll/᩻ۖܽ;

.field public ۡ:I

.field public ۢ:[Ll/᩷ۜܽ;

.field public ܳ:I

.field public ܺ:[I

.field public ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public ᩴ:[I

.field public ᩷:I

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩻ۖܽ;)V
    .locals 12

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ۤ᩻ܽ;->ۜ:Ll/᩻ۖܽ;

    .line 35
    invoke-virtual {p1}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_10

    iput v2, p0, Ll/ۤ᩻ܽ;->ܽ:I

    .line 37
    invoke-static {p1}, Ll/֫ᩳܽ;->֫(Ll/᩻ۖܽ;)Ll/֫ᩳܽ;

    move-result-object v0

    .line 38
    iget-short v1, v0, Ll/֫ᩳܽ;->ᩳ:S

    if-nez v1, :cond_1

    .line 39
    iget v0, v0, Ll/֫ᩳܽ;->֫:I

    add-int/lit8 v0, v0, -0x8

    invoke-virtual {p1, v0}, Ll/᩻ۖܽ;->skipBytes(I)I

    .line 40
    invoke-virtual {p1}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    iput v2, p0, Ll/ۤ᩻ܽ;->ܽ:I

    .line 41
    invoke-static {p1}, Ll/֫ᩳܽ;->֫(Ll/᩻ۖܽ;)Ll/֫ᩳܽ;

    move-result-object v0

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 43
    :cond_1
    :goto_0
    iget v1, v0, Ll/֫ᩳܽ;->֫:I

    iget v2, v0, Ll/֫ᩳܽ;->ۧ:I

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ll/֫ᩳܽ;->֫(I)V

    .line 45
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    .line 46
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v4

    iput v4, p0, Ll/ۤ᩻ܽ;->ۖ:I

    .line 47
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v5

    iput v5, p0, Ll/ۤ᩻ܽ;->ܳ:I

    .line 48
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v5

    .line 49
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v6

    iput v6, p0, Ll/ۤ᩻ܽ;->ۘ:I

    const/16 v7, 0x1c

    if-le v2, v7, :cond_2

    add-int/lit8 v7, v2, -0x1c

    .line 51
    invoke-virtual {p1, v7}, Ll/᩻ۖܽ;->skipBytes(I)I

    :cond_2
    if-ge v5, v2, :cond_3

    move v5, v2

    :cond_3
    const/4 v7, 0x0

    if-eqz v4, :cond_4

    if-nez v6, :cond_6

    :cond_4
    if-ltz v0, :cond_5

    mul-int/lit8 v4, v0, 0x4

    add-int/2addr v4, v2

    if-le v4, v5, :cond_6

    .line 59
    :cond_5
    iput v7, p0, Ll/ۤ᩻ܽ;->ۖ:I

    .line 60
    iput v7, p0, Ll/ۤ᩻ܽ;->ۘ:I

    sub-int v0, v5, v2

    .line 61
    div-int/lit8 v0, v0, 0x4

    .line 65
    :cond_6
    iput v0, p0, Ll/ۤ᩻ܽ;->᩷:I

    .line 66
    iput v5, p0, Ll/ۤ᩻ܽ;->ۡ:I

    .line 68
    iget v4, p0, Ll/ۤ᩻ܽ;->ۖ:I

    if-nez v4, :cond_7

    .line 69
    iput v7, p0, Ll/ۤ᩻ܽ;->ۘ:I

    :cond_7
    const/high16 v6, 0x1000000

    if-gt v0, v6, :cond_f

    if-le v4, v0, :cond_8

    .line 76
    iput v0, p0, Ll/ۤ᩻ܽ;->ۖ:I

    .line 79
    :cond_8
    iget v4, p0, Ll/ۤ᩻ܽ;->ܽ:I

    add-int/2addr v2, v4

    iput v2, p0, Ll/ۤ᩻ܽ;->ܿ:I

    .line 80
    iget v2, p0, Ll/ۤ᩻ܽ;->ۘ:I

    invoke-virtual {p1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v6, v8, v10

    if-gtz v6, :cond_9

    const/4 v6, 0x0

    goto :goto_1

    :cond_9
    const-wide/32 v10, 0x7fffffff

    cmp-long v6, v8, v10

    if-ltz v6, :cond_a

    const v6, 0x7fffffff

    goto :goto_1

    :cond_a
    long-to-int v6, v8

    :goto_1
    invoke-static {v4, v5, v2, v1, v6}, Ll/᩷ܿܽ;->֫(IIIII)I

    move-result v2

    iput v2, p0, Ll/ۤ᩻ܽ;->ᩳ:I

    .line 82
    new-array v2, v0, [I

    iput-object v2, p0, Ll/ۤ᩻ܽ;->ܺ:[I

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_b

    .line 84
    iget-object v4, p0, Ll/ۤ᩻ܽ;->ܺ:[I

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v5

    aput v5, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 87
    :cond_b
    iget v2, p0, Ll/ۤ᩻ܽ;->ۖ:I

    if-eqz v2, :cond_c

    .line 88
    new-array v2, v2, [I

    iput-object v2, p0, Ll/ۤ᩻ܽ;->ᩴ:[I

    const/4 v2, 0x0

    .line 89
    :goto_3
    iget v4, p0, Ll/ۤ᩻ܽ;->ۖ:I

    if-ge v2, v4, :cond_d

    .line 90
    iget-object v4, p0, Ll/ۤ᩻ܽ;->ᩴ:[I

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result v5

    aput v5, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_c
    new-array v2, v7, [I

    .line 93
    iput-object v2, p0, Ll/ۤ᩻ܽ;->ᩴ:[I

    .line 96
    :cond_d
    new-array v0, v0, [Ll/᩷ۜܽ;

    iput-object v0, p0, Ll/ۤ᩻ܽ;->ۢ:[Ll/᩷ۜܽ;

    .line 97
    iget v0, p0, Ll/ۤ᩻ܽ;->ܳ:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_e

    goto :goto_4

    :cond_e
    const/4 v3, 0x0

    :goto_4
    iput-boolean v3, p0, Ll/ۤ᩻ܽ;->᩻:Z

    .line 99
    iget v0, p0, Ll/ۤ᩻ܽ;->ܽ:I

    add-int/2addr v0, v1

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    return-void

    .line 72
    :cond_f
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Too many strings"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 0
    :cond_10
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method private declared-synchronized ܽ(I)I
    .locals 6

    const-string v1, "new offset "

    const-string v2, "getPreviousStringEndOffset "

    move-object v0, p0

    .line 5
    monitor-enter v0

    .line 167
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩹ܽܽ;->֫(Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 169
    iget p1, p0, Ll/ۤ᩻ܽ;->ܽ:I

    iget v1, p0, Ll/ۤ᩻ܽ;->ۡ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr p1, v1

    monitor-exit v0

    return p1

    .line 171
    :cond_0
    :try_start_1
    iget v2, p0, Ll/ۤ᩻ܽ;->ܽ:I

    iget v3, p0, Ll/ۤ᩻ܽ;->ۡ:I

    add-int/2addr v2, v3

    iget-object v3, p0, Ll/ۤ᩻ܽ;->ܺ:[I

    add-int/lit8 p1, p1, -0x1

    aget v3, v3, p1

    add-int/2addr v2, v3

    .line 172
    iget-object v3, p0, Ll/ۤ᩻ܽ;->ۜ:Ll/᩻ۖܽ;

    iget-boolean v4, p0, Ll/ۤ᩻ܽ;->᩻:Z

    iget v5, p0, Ll/ۤ᩻ܽ;->ᩳ:I

    invoke-static {v3, v2, v4, v5}, Ll/᩷ܿܽ;->ۧ(Ll/᩻ۖܽ;IZI)I

    move-result v2

    .line 173
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩹ܽܽ;->֫(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, -0x1

    if-eq v2, v1, :cond_1

    .line 175
    monitor-exit v0

    return v2

    .line 177
    :cond_1
    :try_start_2
    invoke-direct {p0, p1}, Ll/ۤ᩻ܽ;->ܽ(I)I

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v1, :cond_2

    .line 179
    monitor-exit v0

    return v1

    .line 180
    :cond_2
    :try_start_3
    iget-object v1, p0, Ll/ۤ᩻ܽ;->ۜ:Ll/᩻ۖܽ;

    iget-boolean v2, p0, Ll/ۤ᩻ܽ;->᩻:Z

    iget v3, p0, Ll/ۤ᩻ܽ;->ᩳ:I

    invoke-static {v1, p1, v2, v3}, Ll/᩷ܿܽ;->ۧ(Ll/᩻ۖܽ;IZI)I

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method private declared-synchronized ܿ(I)[I
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    if-ltz p1, :cond_2

    .line 185
    :try_start_0
    iget v2, p0, Ll/ۤ᩻ܽ;->ۖ:I

    if-lt p1, v2, :cond_0

    goto :goto_2

    .line 187
    :cond_0
    iget v2, p0, Ll/ۤ᩻ܽ;->ܽ:I

    iget v3, p0, Ll/ۤ᩻ܽ;->ۘ:I

    add-int/2addr v2, v3

    iget-object v3, p0, Ll/ۤ᩻ܽ;->ᩴ:[I

    aget p1, v3, p1

    add-int/2addr v2, p1

    .line 188
    iget-object p1, p0, Ll/ۤ᩻ܽ;->ۜ:Ll/᩻ۖܽ;

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    .line 189
    new-instance p1, Ll/ܺۢᩴ;

    invoke-direct {p1}, Ll/ܺۢᩴ;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    :goto_0
    :try_start_1
    iget-object v2, p0, Ll/ۤ᩻ܽ;->ۜ:Ll/᩻ۖܽ;

    invoke-virtual {v2}, Ll/᩻ۖܽ;->readInt()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 193
    invoke-virtual {p1, v2}, Ll/ܺۢᩴ;->add(I)Z
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 198
    :cond_1
    :try_start_2
    invoke-virtual {p1}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p1

    .line 196
    :catch_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 200
    :try_start_3
    new-instance v1, Ll/۟ܽܽ;

    .line 8
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 200
    throw v1

    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    .line 186
    :cond_2
    :goto_2
    monitor-exit v0

    return-object v1
.end method

.method private declared-synchronized ᩳ(I)Ljava/lang/String;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-ltz p1, :cond_6

    .line 137
    :try_start_0
    iget v1, p0, Ll/ۤ᩻ܽ;->᩷:I

    if-lt p1, v1, :cond_0

    goto :goto_1

    .line 140
    :cond_0
    iget v1, p0, Ll/ۤ᩻ܽ;->ܽ:I

    iget v2, p0, Ll/ۤ᩻ܽ;->ۡ:I

    add-int/2addr v1, v2

    iget-object v2, p0, Ll/ۤ᩻ܽ;->ܺ:[I

    aget v2, v2, p1

    add-int/2addr v1, v2

    .line 141
    iget v2, p0, Ll/ۤ᩻ܽ;->ܿ:I

    if-lt v1, v2, :cond_5

    iget v2, p0, Ll/ۤ᩻ܽ;->ᩳ:I

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 144
    :cond_1
    iget-object v3, p0, Ll/ۤ᩻ܽ;->ۜ:Ll/᩻ۖܽ;

    iget-boolean v4, p0, Ll/ۤ᩻ܽ;->᩻:Z

    invoke-virtual {p0, v3, v1, v4, v2}, Ll/᩷ܿܽ;->֫(Ll/᩻ۖܽ;IZI)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    .line 148
    invoke-direct {p0, p1}, Ll/ۤ᩻ܽ;->ܽ(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 150
    iget-object v1, p0, Ll/ۤ᩻ܽ;->ۜ:Ll/᩻ۖܽ;

    iget-boolean v3, p0, Ll/ۤ᩻ܽ;->᩻:Z

    iget v4, p0, Ll/ۤ᩻ܽ;->ᩳ:I

    invoke-virtual {p0, v1, v2, v3, v4}, Ll/᩷ܿܽ;->֫(Ll/᩻ۖܽ;IZI)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 153
    iget-object v3, p0, Ll/ۤ᩻ܽ;->ܺ:[I

    iget v4, p0, Ll/ۤ᩻ܽ;->ܽ:I

    sub-int/2addr v2, v4

    iget v4, p0, Ll/ۤ᩻ܽ;->ۡ:I

    sub-int/2addr v2, v4

    aput v2, v3, p1

    :cond_2
    if-nez v1, :cond_3

    const-string v1, ""

    .line 160
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v2, 0x2710

    if-le p1, v2, :cond_4

    .line 161
    sget-object v1, Ll/۫᩻ܽ;->֫:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    :cond_4
    monitor-exit v0

    return-object v1

    .line 142
    :cond_5
    :goto_0
    :try_start_1
    sget-object p1, Ll/۫᩻ܽ;->֫:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    .line 138
    :cond_6
    :goto_1
    :try_start_2
    iget v1, p0, Ll/ۤ᩻ܽ;->᩷:I

    .line 47
    invoke-static {p1, v1}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method


# virtual methods
.method public final bridge synthetic getItem(I)Ll/ۗ᩻ܽ;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Ll/ۤ᩻ܽ;->getItem(I)Ll/᩷ۜܽ;

    move-result-object p1

    return-object p1
.end method

.method public final getItem(I)Ll/᩷ۜܽ;
    .locals 4

    .line 109
    iget-object v0, p0, Ll/ۤ᩻ܽ;->ۢ:[Ll/᩷ۜܽ;

    if-eqz v0, :cond_1

    if-ltz p1, :cond_1

    iget v1, p0, Ll/ۤ᩻ܽ;->᩷:I

    if-ge p1, v1, :cond_1

    .line 110
    aget-object v1, v0, p1

    if-eqz v1, :cond_0

    return-object v1

    .line 113
    :cond_0
    invoke-direct {p0, p1}, Ll/ۤ᩻ܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-direct {p0, p1}, Ll/ۤ᩻ܽ;->ܿ(I)[I

    move-result-object v2

    .line 115
    new-instance v3, Ll/᩷ۜܽ;

    invoke-direct {v3, p0, v1, v2}, Ll/᩷ۜܽ;-><init>(Ll/᩷ܿܽ;Ljava/lang/String;[I)V

    aput-object v3, v0, p1

    return-object v3

    .line 117
    :cond_1
    invoke-direct {p0, p1}, Ll/ۤ᩻ܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    .line 118
    invoke-direct {p0, p1}, Ll/ۤ᩻ܽ;->ܿ(I)[I

    move-result-object p1

    .line 119
    new-instance v1, Ll/᩷ۜܽ;

    invoke-direct {v1, p0, v0, p1}, Ll/᩷ۜܽ;-><init>(Ll/᩷ܿܽ;Ljava/lang/String;[I)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 104
    iget v0, p0, Ll/ۤ᩻ܽ;->᩷:I

    return v0
.end method

.method public final ֫(I)Ll/ۗ᩻ܽ;
    .locals 1

    .line 125
    iget v0, p0, Ll/ۤ᩻ܽ;->᩷:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 128
    invoke-virtual {p0, p1}, Ll/ۤ᩻ܽ;->getItem(I)Ll/᩷ۜܽ;

    move-result-object p1

    return-object p1

    .line 126
    :cond_0
    invoke-static {p1, v0}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 133
    iget-boolean v0, p0, Ll/ۤ᩻ܽ;->᩻:Z

    return v0
.end method
