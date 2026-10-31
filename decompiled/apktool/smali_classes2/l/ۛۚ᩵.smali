.class public Ll/ۛۚ᩵;
.super Ljava/io/OutputStream;
.source "H9UP"


# static fields
.field public static final ܽ֫:Ll/֫᩻֨;


# instance fields
.field public ֫֫:I

.field public ۗ:I

.field public ۙ:Ll/۫ۚ᩵;

.field public ۛ:Ll/ۛۘ᩵;

.field public ۟:Z

.field public ۤ:Ll/ۨۘ᩵;

.field public ۧ֫:I

.field public ۨ:I

.field public ۫:Ll/ۤۘ᩵;

.field public ۬:Ll/۫ۘ᩵;

.field public ܰ:[B

.field public ᩶:J

.field public ᩸:I

.field public ᩹:Ll/۬ۚ᩵;

.field public final ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    const-class v0, Ll/ۛۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۛۚ᩵;->ܽ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ۨۚ᩵;Ll/ۘ֨᩵;)V
    .locals 1

    .line 130
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 52
    iput-object v0, p0, Ll/ۛۚ᩵;->ܰ:[B

    .line 131
    iput-object p1, p0, Ll/ۛۚ᩵;->᩹:Ll/۬ۚ᩵;

    const/4 p1, 0x0

    .line 132
    iput-object p1, p0, Ll/ۛۚ᩵;->ۙ:Ll/۫ۚ᩵;

    const/4 p1, 0x0

    .line 133
    iput p1, p0, Ll/ۛۚ᩵;->ۗ:I

    .line 134
    iput p1, p0, Ll/ۛۚ᩵;->᩸:I

    .line 135
    iput p1, p0, Ll/ۛۚ᩵;->ۨ:I

    .line 137
    invoke-virtual {p2}, Ll/ۘ֨᩵;->᩸()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۛۚ᩵;->᩺:Z

    .line 138
    invoke-virtual {p0, p2}, Ll/ۛۚ᩵;->֫(Ll/ۘ֨᩵;)V

    return-void
.end method

.method public constructor <init>(Ll/۬ۚ᩵;)V
    .locals 5

    .line 102
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    new-array v1, v0, [B

    .line 52
    iput-object v1, p0, Ll/ۛۚ᩵;->ܰ:[B

    .line 103
    iput-object p1, p0, Ll/ۛۚ᩵;->᩹:Ll/۬ۚ᩵;

    const/16 v1, 0x52

    .line 105
    iput v1, p0, Ll/ۛۚ᩵;->ۗ:I

    const/4 v1, 0x7

    .line 106
    iput v1, p0, Ll/ۛۚ᩵;->ۨ:I

    const/4 v1, 0x2

    .line 107
    iput v1, p0, Ll/ۛۚ᩵;->᩸:I

    .line 109
    :try_start_0
    invoke-virtual {p1}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object p1
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :try_start_1
    invoke-virtual {p1}, Ll/ۘ֨᩵;->᩸()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۛۚ᩵;->᩺:Z

    .line 111
    invoke-virtual {p0}, Ll/ۛۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 115
    :try_start_2
    invoke-virtual {p0, p1}, Ll/ۛۚ᩵;->֫(Ll/ۘ֨᩵;)V

    if-eqz v1, :cond_0

    .line 118
    new-instance v1, Ll/᩻᩵᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v2}, Ll/۫ۚ᩵;->ܳ()[B

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ll/᩻᩵᩵;-><init>(Ll/֨ۡ᩵;[B)V

    .line 119
    new-instance v3, Ll/۠ۖ᩵;

    invoke-direct {v3}, Ll/۠ۖ᩵;-><init>()V

    invoke-virtual {v1, v3}, Ll/᩻᩵᩵;->֫(Ll/᩹ۖ᩵;)V

    new-array v0, v0, [Ll/֡ۚ᩵;

    .line 120
    sget-object v3, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    const/4 v3, 0x0

    .line 115
    invoke-virtual {p1, v1, v3, v0}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 227
    :cond_0
    :try_start_3
    invoke-virtual {v2}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    :try_start_4
    invoke-virtual {p1}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception v0

    .line 227
    :try_start_5
    invoke-virtual {v2}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 111
    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz p1, :cond_1

    .line 109
    :try_start_7
    invoke-virtual {p1}, Ll/ۘ֨᩵;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    :try_start_8
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw v0
    :try_end_8
    .catch Ll/᩵ۡ᩵; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    move-exception p1

    .line 124
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 206
    iget-object v0, p0, Ll/ۛۚ᩵;->᩹:Ll/۬ۚ᩵;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Ll/ۛۚ᩵;->ۙ:Ll/۫ۚ᩵;

    invoke-virtual {v2}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 207
    iget-object v2, p0, Ll/ۛۚ᩵;->ۙ:Ll/۫ۚ᩵;

    .line 227
    invoke-virtual {v2}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    :cond_0
    invoke-virtual {v0}, Ll/۬ۚ᩵;->ܽ()V

    .line 211
    iput-object v1, p0, Ll/ۛۚ᩵;->ܰ:[B

    return-void

    :catchall_0
    move-exception v2

    .line 210
    invoke-virtual {v0}, Ll/۬ۚ᩵;->ܽ()V

    .line 211
    iput-object v1, p0, Ll/ۛۚ᩵;->ܰ:[B

    .line 212
    throw v2
.end method

.method public isOpen()Z
    .locals 1

    .line 246
    iget-object v0, p0, Ll/ۛۚ᩵;->ۙ:Ll/۫ۚ᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final write(I)V
    .locals 2

    .line 224
    iget-object v0, p0, Ll/ۛۚ᩵;->ܰ:[B

    int-to-byte p1, p1

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 283
    invoke-virtual {p0, v1, v0, p1, v1}, Ll/ۛۚ᩵;->ۧ(I[BII)V

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 238
    array-length v1, p1

    .line 283
    invoke-virtual {p0, v0, p1, v1, v0}, Ll/ۛۚ᩵;->ۧ(I[BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    const/4 v0, 0x0

    .line 283
    invoke-virtual {p0, p2, p1, p3, v0}, Ll/ۛۚ᩵;->ۧ(I[BII)V

    return-void
.end method

.method public declared-synchronized ֫()Ll/۫ۚ᩵;
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 251
    :try_start_0
    invoke-virtual {p0}, Ll/ۛۚ᩵;->isOpen()Z

    move-result v1

    if-nez v1, :cond_0

    .line 253
    iget-object v2, p0, Ll/ۛۚ᩵;->᩹:Ll/۬ۚ᩵;

    iget v3, p0, Ll/ۛۚ᩵;->ۗ:I

    iget v4, p0, Ll/ۛۚ᩵;->᩸:I

    iget v5, p0, Ll/ۛۚ᩵;->ۨ:I

    const/16 v6, 0x80

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Ll/۬ۚ᩵;->֫(IIIII)Ll/۫ۚ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V

    iput-object v1, p0, Ll/ۛۚ᩵;->ۙ:Ll/۫ۚ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    monitor-exit v0

    return-object v1

    .line 263
    :cond_0
    :try_start_1
    sget-object v1, Ll/ۛۚ᩵;->ܽ֫:Ll/֫᩻֨;

    const-string v2, "File already open"

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 264
    iget-object v1, p0, Ll/ۛۚ᩵;->ۙ:Ll/۫ۚ᩵;

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V
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

.method public final ֫(Ll/ۘ֨᩵;)V
    .locals 3

    .line 147
    invoke-virtual {p1}, Ll/ۘ֨᩵;->getSendBufferSize()I

    move-result v0

    .line 148
    iget-boolean v1, p0, Ll/ۛۚ᩵;->᩺:Z

    if-eqz v1, :cond_0

    .line 149
    iput v0, p0, Ll/ۛۚ᩵;->֫֫:I

    .line 150
    iput v0, p0, Ll/ۛۚ᩵;->ۧ֫:I

    return-void

    .line 154
    :cond_0
    iget v1, p0, Ll/ۛۚ᩵;->ۗ:I

    and-int/lit8 v1, v1, -0x51

    iput v1, p0, Ll/ۛۚ᩵;->ۗ:I

    add-int/lit8 v0, v0, -0x46

    .line 155
    iput v0, p0, Ll/ۛۚ᩵;->֫֫:I

    const/16 v0, 0x10

    .line 157
    invoke-virtual {p1, v0}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛۚ᩵;->۟:Z

    .line 158
    sget-object v1, Ll/ۛۚ᩵;->ܽ֫:Ll/֫᩻֨;

    if-nez v0, :cond_1

    const-string v0, "No support for NT SMBs"

    .line 159
    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_1
    const v0, 0x8000

    .line 164
    invoke-virtual {p1, v0}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 165
    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ܰ()I

    move-result v0

    add-int/lit8 v0, v0, -0x46

    const v2, 0xffb9

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ۛۚ᩵;->ۧ֫:I

    goto :goto_0

    :cond_2
    const-string v0, "No support or SMB signing is enabled, not enabling large writes"

    .line 167
    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 168
    iget v0, p0, Ll/ۛۚ᩵;->֫֫:I

    iput v0, p0, Ll/ۛۚ᩵;->ۧ֫:I

    .line 171
    :goto_0
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Negotiated file write size is "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۛۚ᩵;->ۧ֫:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 175
    :cond_3
    iget-boolean v0, p0, Ll/ۛۚ᩵;->۟:Z

    if-eqz v0, :cond_4

    .line 176
    new-instance v0, Ll/ۤۘ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    iput-object v0, p0, Ll/ۛۚ᩵;->۫:Ll/ۤۘ᩵;

    .line 177
    new-instance v0, Ll/ۛۘ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۛۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    iput-object v0, p0, Ll/ۛۚ᩵;->ۛ:Ll/ۛۘ᩵;

    return-void

    .line 179
    :cond_4
    new-instance v0, Ll/۫ۘ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۫ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    iput-object v0, p0, Ll/ۛۚ᩵;->۬:Ll/۫ۘ᩵;

    .line 180
    new-instance v0, Ll/ۨۘ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۨۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    iput-object v0, p0, Ll/ۛۚ᩵;->ۤ:Ll/ۨۘ᩵;

    return-void
.end method

.method public final ۧ(I[BII)V
    .locals 20

    move-object/from16 v1, p0

    move/from16 v0, p3

    .line 297
    sget-object v2, Ll/ۛۚ᩵;->ܽ֫:Ll/֫᩻֨;

    const-string v3, "write: fid="

    if-gtz v0, :cond_0

    return-void

    .line 301
    :cond_0
    iget-object v4, v1, Ll/ۛۚ᩵;->ܰ:[B

    if-eqz v4, :cond_b

    .line 305
    invoke-virtual/range {p0 .. p0}, Ll/ۛۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v4

    .line 306
    :try_start_0
    invoke-virtual {v4}, Ll/۫ۚ᩵;->᩻()Ll/ۘ֨᩵;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 307
    :try_start_1
    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 308
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ",off="

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v3, p1

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ",len="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ",fp="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v7, v1, Ll/ۛۚ᩵;->᩶:J

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move/from16 v3, p1

    .line 313
    :cond_2
    :goto_0
    iget-object v6, v1, Ll/ۛۚ᩵;->᩹:Ll/۬ۚ᩵;

    invoke-virtual {v6}, Ll/۬ۚ᩵;->᩻()I

    move-result v6

    const/4 v15, 0x1

    if-ne v6, v15, :cond_3

    iget v6, v1, Ll/ۛۚ᩵;->ۧ֫:I

    goto :goto_1

    :cond_3
    iget v6, v1, Ll/ۛۚ᩵;->֫֫:I

    :goto_1
    if-le v0, v6, :cond_4

    goto :goto_2

    :cond_4
    move v6, v0

    .line 316
    :goto_2
    iget-boolean v7, v1, Ll/ۛۚ᩵;->᩺:Z

    const/4 v14, 0x0

    if-eqz v7, :cond_5

    .line 317
    new-instance v7, Ll/ۡ᩵᩵;

    invoke-virtual {v5}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v8

    invoke-virtual {v4}, Ll/۫ۚ᩵;->ܳ()[B

    move-result-object v9

    invoke-direct {v7, v8, v9}, Ll/ۡ᩵᩵;-><init>(Ll/֨ۡ᩵;[B)V

    .line 318
    iget-wide v8, v1, Ll/ۛۚ᩵;->᩶:J

    invoke-virtual {v7, v8, v9}, Ll/ۡ᩵᩵;->ᩳ(J)V

    move-object/from16 v13, p2

    .line 319
    invoke-virtual {v7, v3, v6, v13}, Ll/ۡ᩵᩵;->ۧ(II[B)V

    new-array v6, v15, [Ll/֡ۚ᩵;

    .line 321
    sget-object v8, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v8, v6, v14

    const/4 v8, 0x0

    .line 115
    invoke-virtual {v5, v7, v8, v6}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v6

    .line 321
    check-cast v6, Ll/ܺ᩵᩵;

    .line 322
    invoke-virtual {v6}, Ll/ܺ᩵᩵;->᩵֫()I

    move-result v6

    int-to-long v6, v6

    .line 323
    iget-wide v8, v1, Ll/ۛۚ᩵;->᩶:J

    add-long/2addr v8, v6

    iput-wide v8, v1, Ll/ۛۚ᩵;->᩶:J

    goto :goto_4

    :cond_5
    move-object/from16 v13, p2

    .line 326
    iget-boolean v7, v1, Ll/ۛۚ᩵;->۟:Z

    if-eqz v7, :cond_7

    .line 327
    iget-object v7, v1, Ll/ۛۚ᩵;->۫:Ll/ۤۘ᩵;

    invoke-virtual {v4}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v8

    iget-wide v9, v1, Ll/ۛۚ᩵;->᩶:J

    sub-int v11, v0, v6

    move-object/from16 v12, p2

    move v13, v3

    const/4 v15, 0x0

    move v14, v6

    invoke-virtual/range {v7 .. v14}, Ll/ۤۘ᩵;->֫(IJI[BII)V

    and-int/lit8 v7, p4, 0x1

    if-eqz v7, :cond_6

    .line 329
    iget-object v7, v1, Ll/ۛۚ᩵;->۫:Ll/ۤۘ᩵;

    invoke-virtual {v4}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v8

    iget-wide v9, v1, Ll/ۛۚ᩵;->᩶:J

    move v11, v0

    move-object/from16 v12, p2

    move v13, v3

    move v14, v6

    invoke-virtual/range {v7 .. v14}, Ll/ۤۘ᩵;->֫(IJI[BII)V

    .line 330
    iget-object v6, v1, Ll/ۛۚ᩵;->۫:Ll/ۤۘ᩵;

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, Ll/ۤۘ᩵;->ۢ(I)V

    goto :goto_3

    .line 332
    :cond_6
    iget-object v6, v1, Ll/ۛۚ᩵;->۫:Ll/ۤۘ᩵;

    invoke-virtual {v6, v15}, Ll/ۤۘ᩵;->ۢ(I)V

    .line 335
    :goto_3
    iget-object v6, v1, Ll/ۛۚ᩵;->۫:Ll/ۤۘ᩵;

    iget-object v7, v1, Ll/ۛۚ᩵;->ۛ:Ll/ۛۘ᩵;

    const/4 v8, 0x1

    new-array v8, v8, [Ll/֡ۚ᩵;

    sget-object v9, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v9, v8, v15

    invoke-virtual {v5, v6, v7, v8}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 336
    iget-object v6, v1, Ll/ۛۚ᩵;->ۛ:Ll/ۛۘ᩵;

    invoke-virtual {v6}, Ll/ۛۘ᩵;->ܺ֫()J

    move-result-wide v6

    .line 337
    iget-wide v8, v1, Ll/ۛۚ᩵;->᩶:J

    add-long/2addr v8, v6

    iput-wide v8, v1, Ll/ۛۚ᩵;->᩶:J

    :goto_4
    int-to-long v8, v0

    sub-long/2addr v8, v6

    long-to-int v0, v8

    int-to-long v8, v3

    add-long/2addr v8, v6

    long-to-int v3, v8

    goto/16 :goto_5

    :cond_7
    const/4 v15, 0x0

    .line 341
    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v16, 0x3

    const/16 v17, 0x2

    const/4 v8, 0x4

    const-string v14, "Wrote at %d remain %d off %d len %d"

    if-eqz v7, :cond_8

    .line 342
    :try_start_2
    iget-wide v9, v1, Ll/ۛۚ᩵;->᩶:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    sub-int v9, v0, v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v7, v8, v15

    const/4 v7, 0x1

    aput-object v9, v8, v7

    aput-object v10, v8, v17

    aput-object v11, v8, v16

    invoke-static {v14, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v7}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_8
    const/4 v13, 0x4

    .line 344
    iget-object v7, v1, Ll/ۛۚ᩵;->۬:Ll/۫ۘ᩵;

    invoke-virtual {v4}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v8

    iget-wide v9, v1, Ll/ۛۚ᩵;->᩶:J

    sub-int v11, v0, v6

    const/16 v18, 0x1

    move-object/from16 v12, p2

    move v13, v3

    move-object/from16 v19, v14

    move v14, v6

    invoke-virtual/range {v7 .. v14}, Ll/۫ۘ᩵;->֫(IJI[BII)V

    .line 345
    iget-object v7, v1, Ll/ۛۚ᩵;->۬:Ll/۫ۘ᩵;

    iget-object v8, v1, Ll/ۛۚ᩵;->ۤ:Ll/ۨۘ᩵;

    new-array v9, v15, [Ll/֡ۚ᩵;

    invoke-virtual {v5, v7, v8, v9}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 346
    iget-object v7, v1, Ll/ۛۚ᩵;->ۤ:Ll/ۨۘ᩵;

    invoke-virtual {v7}, Ll/ۨۘ᩵;->ۡ֫()J

    move-result-wide v7

    .line 347
    iget-wide v9, v1, Ll/ۛۚ᩵;->᩶:J

    add-long/2addr v9, v7

    iput-wide v9, v1, Ll/ۛۚ᩵;->᩶:J

    int-to-long v9, v0

    sub-long/2addr v9, v7

    long-to-int v0, v9

    int-to-long v9, v3

    add-long/2addr v9, v7

    long-to-int v3, v9

    .line 350
    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 351
    iget-wide v7, v1, Ll/ۛۚ᩵;->᩶:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    sub-int v8, v0, v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v7, v10, v15

    aput-object v8, v10, v18

    aput-object v9, v10, v17

    aput-object v6, v10, v16

    move-object/from16 v6, v19

    invoke-static {v6, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_9
    :goto_5
    if-gtz v0, :cond_2

    .line 357
    :try_start_3
    invoke-virtual {v5}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 227
    invoke-virtual {v4}, Ll/۫ۚ᩵;->ۘ()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 305
    :try_start_4
    invoke-virtual {v5}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    if-eqz v4, :cond_a

    .line 227
    :try_start_6
    invoke-virtual {v4}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v3, v0

    .line 305
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_7
    throw v2

    .line 302
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Bad file descriptor"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
