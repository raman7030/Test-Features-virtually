.class public Ll/ۤۚ᩵;
.super Ljava/io/InputStream;
.source "79WK"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field public static final ۟:Ll/֫᩻֨;


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/۫ۚ᩵;

.field public ۛ:I

.field public ۤ:I

.field public ۨ:Z

.field public ۫:I

.field public ۬:I

.field public final ܰ:Z

.field public ᩶:J

.field public ᩸:I

.field public ᩹:Ll/۬ۚ᩵;

.field public ᩺:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    const-class v0, Ll/ۤۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۤۚ᩵;->۟:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ۨۚ᩵;Ll/ۘ֨᩵;)V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 51
    iput-object v0, p0, Ll/ۤۚ᩵;->᩺:[B

    .line 114
    iput-object p1, p0, Ll/ۤۚ᩵;->᩹:Ll/۬ۚ᩵;

    const/4 p1, 0x0

    .line 115
    iput-object p1, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    const/4 p1, 0x0

    .line 116
    iput-boolean p1, p0, Ll/ۤۚ᩵;->ܰ:Z

    .line 117
    invoke-virtual {p2}, Ll/ۘ֨᩵;->᩸()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۤۚ᩵;->ۨ:Z

    .line 119
    :try_start_0
    invoke-direct {p0, p2}, Ll/ۤۚ᩵;->֫(Ll/ᩴ֨᩵;)V
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 121
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object p1

    throw p1
.end method

.method public constructor <init>(Ll/۬ۚ᩵;)V
    .locals 3

    .line 88
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    new-array v1, v0, [B

    .line 51
    iput-object v1, p0, Ll/ۤۚ᩵;->᩺:[B

    .line 89
    iput-object p1, p0, Ll/ۤۚ᩵;->᩹:Ll/۬ۚ᩵;

    const/4 v1, 0x0

    .line 90
    iput-boolean v1, p0, Ll/ۤۚ᩵;->ܰ:Z

    .line 91
    iput v1, p0, Ll/ۤۚ᩵;->۬:I

    .line 92
    iput v0, p0, Ll/ۤۚ᩵;->᩸:I

    const/4 v0, 0x7

    .line 93
    iput v0, p0, Ll/ۤۚ᩵;->ۛ:I

    .line 95
    :try_start_0
    invoke-virtual {p1}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v0
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    :try_start_1
    invoke-virtual {v0}, Ll/ۘ֨᩵;->᩸()Z

    move-result v2

    iput-boolean v2, p0, Ll/ۤۚ᩵;->ۨ:Z

    .line 97
    invoke-virtual {p1}, Ll/۬ۚ᩵;->᩻()I

    move-result p1

    const/16 v2, 0x10

    if-eq p1, v2, :cond_1

    .line 98
    invoke-virtual {p0}, Ll/ۤۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 227
    invoke-virtual {p1}, Ll/۫ۚ᩵;->ۘ()V

    .line 100
    :cond_0
    iput v1, p0, Ll/ۤۚ᩵;->۬:I

    .line 103
    :cond_1
    invoke-direct {p0, v0}, Ll/ۤۚ᩵;->֫(Ll/ᩴ֨᩵;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    :try_start_2
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_2
    .catch Ll/᩵ۡ᩵; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_2

    .line 95
    :try_start_3
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw p1
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 105
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object p1

    throw p1
.end method

.method public static ֫(Ll/ۗۚ᩵;)Ljava/io/IOException;
    .locals 2

    .line 193
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 194
    instance-of v1, v0, Ll/֫۠᩵;

    if-eqz v1, :cond_0

    .line 195
    move-object p0, v0

    check-cast p0, Ll/֫۠᩵;

    .line 196
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 198
    :cond_0
    instance-of v1, v0, Ljava/lang/InterruptedException;

    if-eqz v1, :cond_1

    .line 199
    new-instance p0, Ljava/io/InterruptedIOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 200
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_1
    return-object p0
.end method

.method private ֫(Ll/ᩴ֨᩵;)V
    .locals 2

    .line 132
    iget-boolean v0, p0, Ll/ۤۚ᩵;->ۨ:Z

    if-eqz v0, :cond_0

    .line 133
    check-cast p1, Ll/ۘ֨᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ۖ()I

    move-result v0

    iput v0, p0, Ll/ۤۚ᩵;->۫:I

    .line 134
    invoke-virtual {p1}, Ll/ۘ֨᩵;->ۖ()I

    move-result p1

    iput p1, p0, Ll/ۤۚ᩵;->ۤ:I

    return-void

    .line 138
    :cond_0
    check-cast p1, Ll/ۘ֨᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ۖ()I

    move-result v0

    add-int/lit8 v0, v0, -0x46

    invoke-virtual {p1}, Ll/ۘ֨᩵;->᩻()I

    move-result v1

    add-int/lit8 v1, v1, -0x46

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ۤۚ᩵;->۫:I

    const/16 v0, 0x4000

    .line 140
    invoke-virtual {p1, v0}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v0

    sget-object v1, Ll/ۤۚ᩵;->۟:Ll/֫᩻֨;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 141
    iput-boolean v0, p0, Ll/ۤۚ᩵;->ۗ:Z

    .line 142
    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۛ()I

    move-result v0

    add-int/lit8 v0, v0, -0x46

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0xffb9

    goto :goto_0

    :cond_1
    const p1, 0xffffb9

    :goto_0
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ۤۚ᩵;->ۤ:I

    .line 143
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Enabling LARGE_READX with "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Ll/ۤۚ᩵;->ۤ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string p1, "LARGE_READX disabled"

    .line 145
    invoke-interface {v1, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 146
    iget p1, p0, Ll/ۤۚ᩵;->۫:I

    iput p1, p0, Ll/ۤۚ᩵;->ۤ:I

    .line 149
    :goto_1
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 150
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Negotiated file read size is "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Ll/ۤۚ᩵;->ۤ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public available()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public close()V
    .locals 4

    .line 215
    iget-object v0, p0, Ll/ۤۚ᩵;->᩹:Ll/۬ۚ᩵;

    iget-boolean v1, p0, Ll/ۤۚ᩵;->ܰ:Z

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    if-eqz v3, :cond_0

    .line 227
    invoke-virtual {v3}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    :cond_0
    iput-object v2, p0, Ll/ۤۚ᩵;->᩺:[B

    .line 223
    iput-object v2, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    if-eqz v1, :cond_1

    .line 225
    invoke-virtual {v0}, Ll/۬ۚ᩵;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception v3

    goto :goto_0

    :catch_0
    move-exception v3

    .line 220
    :try_start_1
    invoke-static {v3}, Ll/ۤۚ᩵;->֫(Ll/ۗۚ᩵;)Ljava/io/IOException;

    move-result-object v3

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    :goto_0
    iput-object v2, p0, Ll/ۤۚ᩵;->᩺:[B

    .line 223
    iput-object v2, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    if-eqz v1, :cond_2

    .line 225
    invoke-virtual {v0}, Ll/۬ۚ᩵;->close()V

    .line 227
    :cond_2
    throw v3
.end method

.method public final read()I
    .locals 3

    .line 240
    iget-object v0, p0, Ll/ۤۚ᩵;->᩺:[B

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 267
    invoke-virtual {p0, v2, v1, v0}, Ll/ۤۚ᩵;->ܿ(II[B)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 243
    :cond_0
    iget-object v0, p0, Ll/ۤۚ᩵;->᩺:[B

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 255
    array-length v1, p1

    .line 267
    invoke-virtual {p0, v0, v1, p1}, Ll/ۤۚ᩵;->ܿ(II[B)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 0

    .line 267
    invoke-virtual {p0, p2, p3, p1}, Ll/ۤۚ᩵;->ܿ(II[B)I

    move-result p1

    return p1
.end method

.method public final skip(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 397
    iget-wide v0, p0, Ll/ۤۚ᩵;->᩶:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۤۚ᩵;->᩶:J

    return-wide p1

    :cond_0
    return-wide v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public declared-synchronized ֫()Ll/۫ۚ᩵;
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 173
    :try_start_0
    iget-object v1, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 187
    :cond_0
    iget-object v1, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 175
    :cond_1
    :goto_0
    :try_start_1
    iget-object v2, p0, Ll/ۤۚ᩵;->᩹:Ll/۬ۚ᩵;

    instance-of v1, v2, Ll/ۨۚ᩵;

    if-eqz v1, :cond_2

    .line 176
    move-object v1, v2

    check-cast v1, Ll/ۨۚ᩵;

    .line 178
    invoke-virtual {v1}, Ll/ۨۚ᩵;->ᩴ()I

    move-result v1

    const/high16 v3, 0xff0000

    and-int v4, v1, v3

    iget v5, p0, Ll/ۤۚ᩵;->ۛ:I

    const/16 v6, 0x80

    const/4 v7, 0x0

    const/16 v3, 0x20

    .line 176
    invoke-virtual/range {v2 .. v7}, Ll/۬ۚ᩵;->֫(IIIII)Ll/۫ۚ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    goto :goto_1

    .line 183
    :cond_2
    iget v3, p0, Ll/ۤۚ᩵;->۬:I

    iget v4, p0, Ll/ۤۚ᩵;->᩸:I

    iget v5, p0, Ll/ۤۚ᩵;->ۛ:I

    const/16 v6, 0x80

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Ll/۬ۚ᩵;->֫(IIIII)Ll/۫ۚ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V

    iput-object v1, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;

    .line 185
    :goto_1
    iget-object v1, p0, Ll/ۤۚ᩵;->ۙ:Ll/۫ۚ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ܿ(II[B)I
    .locals 25

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    .line 281
    sget-object v4, Ll/ۤۚ᩵;->۟:Ll/֫᩻֨;

    const-string v5, "read: fid="

    const/4 v6, 0x0

    if-gtz v2, :cond_0

    return v6

    .line 284
    :cond_0
    iget-wide v6, v1, Ll/ۤۚ᩵;->᩶:J

    .line 286
    iget-object v8, v1, Ll/ۤۚ᩵;->᩺:[B

    if-eqz v8, :cond_12

    .line 290
    invoke-virtual/range {p0 .. p0}, Ll/ۤۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v8

    .line 291
    :try_start_0
    invoke-virtual {v8}, Ll/۫ۚ᩵;->᩻()Ll/ۘ֨᩵;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 297
    :try_start_1
    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v10

    if-eqz v10, :cond_1

    .line 298
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ",off="

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",len="

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 301
    :cond_1
    new-instance v5, Ll/֡ۘ᩵;

    invoke-virtual {v9}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v10

    invoke-direct {v5, v0, v10, v3}, Ll/֡ۘ᩵;-><init>(ILl/֨ۡ᩵;[B)V

    .line 303
    iget-object v10, v1, Ll/ۤۚ᩵;->᩹:Ll/۬ۚ᩵;

    invoke-virtual {v10}, Ll/۬ۚ᩵;->᩻()I

    move-result v10

    const/4 v11, 0x1

    if-ne v10, v11, :cond_2

    .line 305
    iget v11, v1, Ll/ۤۚ᩵;->ۤ:I

    goto :goto_0

    :cond_2
    iget v11, v1, Ll/ۤۚ᩵;->۫:I

    :goto_0
    move v12, v2

    move v2, v0

    :goto_1
    if-le v12, v11, :cond_3

    move v15, v11

    goto :goto_2

    :cond_3
    move v15, v12

    .line 309
    :goto_2
    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 310
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "read: len="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, ",r="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, ",fp="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v13, v1, Ll/ۤۚ᩵;->᩶:J

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v13, ",b.length="

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v13, v3

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :cond_4
    const/4 v13, 0x0

    :goto_3
    const/4 v0, 0x0

    .line 315
    :try_start_2
    invoke-virtual {v9}, Ll/ۘ֨᩵;->᩸()Z

    move-result v14

    const-wide/16 v19, -0x1

    const-wide/16 v21, 0x0

    if-eqz v14, :cond_9

    .line 316
    new-instance v14, Ll/᩷᩵᩵;

    invoke-virtual {v9}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v13
    :try_end_2
    .catch Ll/ۗۚ᩵; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/16 v16, -0x1

    move/from16 v23, v11

    :try_start_3
    invoke-virtual {v8}, Ll/۫ۚ᩵;->ܳ()[B

    move-result-object v11

    invoke-direct {v14, v13, v11, v3, v2}, Ll/᩷᩵᩵;-><init>(Ll/֨ۡ᩵;[B[BI)V
    :try_end_3
    .catch Ll/ۗۚ᩵; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v11, 0x10

    if-ne v10, v11, :cond_5

    move/from16 v24, v10

    move-wide/from16 v10, v21

    goto :goto_4

    :cond_5
    move/from16 v24, v10

    .line 317
    :try_start_4
    iget-wide v10, v1, Ll/ۤۚ᩵;->᩶:J

    :goto_4
    invoke-virtual {v14, v10, v11}, Ll/᩷᩵᩵;->ᩳ(J)V

    .line 318
    invoke-virtual {v14, v15}, Ll/᩷᩵᩵;->ܺ(I)V

    sub-int v10, v12, v15

    .line 319
    invoke-virtual {v14, v10}, Ll/᩷᩵᩵;->ۖ(I)V
    :try_end_4
    .catch Ll/ۗۚ᩵; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v10, 0x1

    :try_start_5
    new-array v10, v10, [Ll/֡ۚ᩵;

    .line 322
    sget-object v11, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v11, v10, v0

    const/4 v0, 0x0

    .line 115
    invoke-virtual {v9, v14, v0, v10}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v0

    .line 322
    check-cast v0, Ll/ۢ᩵᩵;

    .line 323
    invoke-virtual {v0}, Ll/ۢ᩵᩵;->᩵֫()I

    move-result v0
    :try_end_5
    .catch Ll/ۗۚ᩵; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 325
    :try_start_6
    invoke-virtual {v0}, Ll/ۗۚ᩵;->֫()I

    move-result v10

    const v11, -0x3fffffef    # -2.000004f

    if-ne v10, v11, :cond_8

    const-string v10, "Reached end of file"

    .line 326
    invoke-interface {v4, v10, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 v0, -0x1

    :goto_5
    if-gtz v0, :cond_7

    .line 333
    iget-wide v2, v1, Ll/ۤۚ᩵;->᩶:J
    :try_end_6
    .catch Ll/ۗۚ᩵; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    sub-long/2addr v2, v6

    cmp-long v0, v2, v21

    if-lez v0, :cond_6

    goto :goto_6

    :cond_6
    move-wide/from16 v2, v19

    :goto_6
    long-to-int v0, v2

    .line 371
    :try_start_7
    invoke-virtual {v9}, Ll/ۘ֨᩵;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 227
    invoke-virtual {v8}, Ll/۫ۚ᩵;->ۘ()V

    return v0

    .line 335
    :cond_7
    :try_start_8
    iget-wide v10, v1, Ll/ۤۚ᩵;->᩶:J

    int-to-long v13, v0

    add-long/2addr v10, v13

    iput-wide v10, v1, Ll/ۤۚ᩵;->᩶:J

    add-int/2addr v2, v0

    sub-int/2addr v12, v0

    move v13, v15

    move/from16 v3, v24

    goto/16 :goto_a

    .line 329
    :cond_8
    throw v0
    :try_end_8
    .catch Ll/ۗۚ᩵; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catch_1
    move-exception v0

    move/from16 v3, v24

    goto/16 :goto_d

    :catch_2
    move-exception v0

    move v3, v10

    goto/16 :goto_d

    :cond_9
    move/from16 v24, v10

    move/from16 v23, v11

    const/4 v10, -0x1

    .line 341
    :try_start_9
    new-instance v11, Ll/᩵ۘ᩵;

    invoke-virtual {v9}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v14

    invoke-virtual {v8}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v16

    move/from16 p1, v2

    iget-wide v2, v1, Ll/ۤۚ᩵;->᩶:J

    move-object v13, v11

    move/from16 p2, v15

    move/from16 v15, v16

    move-wide/from16 v16, v2

    move/from16 v18, p2

    invoke-direct/range {v13 .. v18}, Ll/᩵ۘ᩵;-><init>(Ll/֨ۡ᩵;IJI)V
    :try_end_9
    .catch Ll/ۗۚ᩵; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const/16 v2, 0x10

    move/from16 v3, v24

    if-ne v3, v2, :cond_a

    .line 343
    :try_start_a
    invoke-virtual {v11}, Ll/᩵ۘ᩵;->ܺ֫()V

    const/16 v2, 0x400

    .line 344
    invoke-virtual {v11, v2}, Ll/᩵ۘ᩵;->ۢ(I)V

    .line 345
    invoke-virtual {v11}, Ll/᩵ۘ᩵;->ۖ֫()V

    goto :goto_7

    .line 346
    :cond_a
    iget-boolean v2, v1, Ll/ۤۚ᩵;->ۗ:Z

    if-eqz v2, :cond_b

    const v2, 0xffff

    move/from16 v13, p2

    and-int v14, v13, v2

    .line 347
    invoke-virtual {v11, v14}, Ll/᩵ۘ᩵;->ۢ(I)V

    shr-int/lit8 v14, v13, 0x10

    and-int/2addr v2, v14

    .line 348
    invoke-virtual {v11, v2}, Ll/᩵ۘ᩵;->ۡ(I)V

    goto :goto_8

    :cond_b
    :goto_7
    move/from16 v13, p2

    :goto_8
    const/4 v2, 0x1

    new-array v2, v2, [Ll/֡ۚ᩵;

    .line 350
    sget-object v14, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v14, v2, v0

    invoke-virtual {v9, v11, v5, v2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 351
    invoke-virtual {v5}, Ll/֡ۘ᩵;->ۖ֫()I

    move-result v0
    :try_end_a
    .catch Ll/ۗۚ᩵; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-gtz v0, :cond_d

    .line 359
    :try_start_b
    iget-wide v2, v1, Ll/ۤۚ᩵;->᩶:J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    sub-long/2addr v2, v6

    cmp-long v0, v2, v21

    if-lez v0, :cond_c

    goto :goto_9

    :cond_c
    move-wide/from16 v2, v19

    :goto_9
    long-to-int v0, v2

    .line 371
    :try_start_c
    invoke-virtual {v9}, Ll/ۘ֨᩵;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 227
    invoke-virtual {v8}, Ll/۫ۚ᩵;->ۘ()V

    return v0

    .line 361
    :cond_d
    :try_start_d
    iget-wide v10, v1, Ll/ۤۚ᩵;->᩶:J

    int-to-long v14, v0

    add-long/2addr v10, v14

    iput-wide v10, v1, Ll/ۤۚ᩵;->᩶:J

    sub-int/2addr v12, v0

    .line 363
    invoke-virtual {v5, v0}, Ll/֡ۘ᩵;->ۢ(I)V

    move/from16 v2, p1

    :goto_a
    move/from16 v11, v23

    if-le v12, v11, :cond_f

    if-eq v0, v13, :cond_e

    goto :goto_b

    :cond_e
    move v10, v3

    move-object/from16 v3, p3

    goto/16 :goto_1

    .line 370
    :cond_f
    :goto_b
    iget-wide v2, v1, Ll/ۤۚ᩵;->᩶:J
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    sub-long/2addr v2, v6

    long-to-int v0, v2

    .line 371
    :try_start_e
    invoke-virtual {v9}, Ll/ۘ֨᩵;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 227
    invoke-virtual {v8}, Ll/۫ۚ᩵;->ۘ()V

    return v0

    :catch_3
    move-exception v0

    goto :goto_c

    :catch_4
    move-exception v0

    move/from16 v3, v24

    goto :goto_c

    :catch_5
    move-exception v0

    move v3, v10

    :goto_c
    const/16 v16, -0x1

    :goto_d
    const/16 v2, 0x10

    if-ne v3, v2, :cond_10

    .line 353
    :try_start_f
    invoke-virtual {v0}, Ll/ۗۚ᩵;->֫()I

    move-result v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    const v3, -0x3ffffeb5    # -2.000079f

    if-ne v2, v3, :cond_10

    .line 371
    :try_start_10
    invoke-virtual {v9}, Ll/ۘ֨᩵;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 227
    invoke-virtual {v8}, Ll/۫ۚ᩵;->ۘ()V

    return v16

    .line 356
    :cond_10
    :try_start_11
    invoke-static {v0}, Ll/ۤۚ᩵;->֫(Ll/ۗۚ᩵;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 290
    :try_start_12
    invoke-virtual {v9}, Ll/ۘ֨᩵;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    goto :goto_e

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_13
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    if-eqz v8, :cond_11

    .line 227
    :try_start_14
    invoke-virtual {v8}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    goto :goto_f

    :catchall_3
    move-exception v0

    move-object v3, v0

    .line 290
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_11
    :goto_f
    throw v2

    .line 287
    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Bad file descriptor"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
