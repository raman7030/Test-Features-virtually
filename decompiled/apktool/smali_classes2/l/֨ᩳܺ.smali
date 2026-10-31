.class public final Ll/֨ᩳܺ;
.super Ljava/lang/Object;
.source "L3S0"


# instance fields
.field public final ֫:Ll/۟ۘܺ;

.field public final ۧ:Ll/ۤܺܺ;


# direct methods
.method public constructor <init>(Ll/᩹ᩳܺ;II)V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 98
    invoke-virtual {p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    iput-object v0, p0, Ll/֨ᩳܺ;->ۧ:Ll/ۤܺܺ;

    .line 100
    invoke-virtual {p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object p1

    add-int/2addr p3, p2

    invoke-virtual {p1, p2, p3}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object p1

    .line 263
    new-instance p2, Ll/۟ۘܺ;

    .line 276
    new-instance p3, Ll/֫ᩴܺ;

    invoke-direct {p3, p1}, Ll/֫ᩴܺ;-><init>(Ll/ۧᩴܺ;)V

    .line 371
    invoke-direct {p2, p3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 101
    iput-object p2, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    return-void

    .line 94
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "cf == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(I)V
    .locals 2

    .line 454
    iget-object v0, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    if-lt v0, p1, :cond_0

    return-void

    .line 455
    :cond_0
    new-instance p1, Ll/᩺ᩳܺ;

    const-string v0, "truncated annotation attribute"

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 455
    throw p1
.end method

.method private ۧ()Ll/ܰۡܺ;
    .locals 2

    .line 434
    iget-object v0, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    .line 435
    iget-object v1, p0, Ll/֨ᩳܺ;->ۧ:Ll/ۤܺܺ;

    invoke-virtual {v1, v0}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v0

    return-object v0
.end method

.method private ܽ(Ll/ۨۢܺ;)Ll/ۛۢܺ;
    .locals 7

    const/4 v0, 0x4

    .line 254
    invoke-direct {p0, v0}, Ll/֨ᩳܺ;->֫(I)V

    .line 256
    iget-object v0, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v1

    .line 257
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    .line 258
    iget-object v3, p0, Ll/֨ᩳܺ;->ۧ:Ll/ۤܺܺ;

    invoke-virtual {v3, v1}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v1

    check-cast v1, Ll/۬ܺܺ;

    .line 259
    new-instance v4, Ll/۫ܺܺ;

    invoke-virtual {v1}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۟ܺܺ;->֫(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v1

    invoke-direct {v4, v1}, Ll/۫ܺܺ;-><init>(Ll/۟ܺܺ;)V

    .line 266
    new-instance v1, Ll/ۛۢܺ;

    invoke-direct {v1, v4, p1}, Ll/ۛۢܺ;-><init>(Ll/۫ܺܺ;Ll/ۨۢܺ;)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v2, :cond_0

    const/4 v4, 0x5

    .line 292
    invoke-direct {p0, v4}, Ll/֨ᩳܺ;->֫(I)V

    .line 294
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 295
    invoke-virtual {v3, v4}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v4

    check-cast v4, Ll/۬ܺܺ;

    .line 303
    invoke-direct {p0}, Ll/֨ᩳܺ;->ܽ()Ll/ܰۡܺ;

    move-result-object v5

    .line 309
    new-instance v6, Ll/۟ۢܺ;

    invoke-direct {v6, v4, v5}, Ll/۟ۢܺ;-><init>(Ll/۬ܺܺ;Ll/ܰۡܺ;)V

    .line 275
    invoke-virtual {v1, v6}, Ll/ۛۢܺ;->֫(Ll/۟ۢܺ;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 282
    :cond_0
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v1
.end method

.method private ܽ()Ll/ܰۡܺ;
    .locals 4

    .line 318
    iget-object v0, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    const/16 v2, 0x40

    if-eq v1, v2, :cond_b

    const/16 v2, 0x46

    if-eq v1, v2, :cond_a

    const/16 v2, 0x53

    if-eq v1, v2, :cond_9

    const/16 v2, 0x63

    .line 325
    iget-object v3, p0, Ll/֨ᩳܺ;->ۧ:Ll/ۤܺܺ;

    if-eq v1, v2, :cond_7

    const/16 v2, 0x65

    if-eq v1, v2, :cond_6

    const/16 v2, 0x73

    if-eq v1, v2, :cond_5

    const/16 v2, 0x49

    if-eq v1, v2, :cond_4

    const/16 v2, 0x4a

    if-eq v1, v2, :cond_3

    const/16 v2, 0x5a

    if-eq v1, v2, :cond_2

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    .line 421
    new-instance v0, Ll/᩺ᩳܺ;

    .line 422
    invoke-static {v1}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "unknown annotation tag: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 422
    throw v0

    .line 336
    :pswitch_0
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/᩷ܺܺ;

    return-object v0

    .line 331
    :pswitch_1
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 333
    invoke-static {v0}, Ll/ۜܺܺ;->֫(I)Ll/ۜܺܺ;

    move-result-object v0

    return-object v0

    .line 327
    :pswitch_2
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 328
    invoke-static {v0}, Ll/ܿܺܺ;->֫(I)Ll/ܿܺܺ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v1, 0x2

    .line 394
    invoke-direct {p0, v1}, Ll/֨ᩳܺ;->֫(I)V

    .line 396
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    .line 397
    new-instance v1, Ll/֫ܺܺ;

    .line 126
    invoke-direct {v1, v0}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 410
    invoke-direct {p0}, Ll/֨ᩳܺ;->ܽ()Ll/ܰۡܺ;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll/ܿᩴܺ;->֫(ILl/ܰۡܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 417
    :cond_1
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    .line 418
    new-instance v0, Ll/ۧܺܺ;

    invoke-direct {v0, v1}, Ll/ۧܺܺ;-><init>(Ll/֫ܺܺ;)V

    return-object v0

    .line 356
    :cond_2
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 357
    invoke-static {v0}, Ll/ᩳܺܺ;->֫(I)Ll/ᩳܺܺ;

    move-result-object v0

    return-object v0

    .line 348
    :cond_3
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/۠ܺܺ;

    return-object v0

    .line 344
    :cond_4
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۖܺܺ;

    return-object v0

    .line 371
    :cond_5
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    return-object v0

    :cond_6
    const/4 v1, 0x4

    .line 374
    invoke-direct {p0, v1}, Ll/֨ᩳܺ;->֫(I)V

    .line 376
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v1

    .line 377
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    .line 378
    invoke-virtual {v3, v1}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v1

    check-cast v1, Ll/۬ܺܺ;

    .line 379
    invoke-virtual {v3, v0}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/۬ܺܺ;

    .line 386
    new-instance v2, Ll/ۢܺܺ;

    new-instance v3, Ll/᩶ܺܺ;

    invoke-direct {v3, v0, v1}, Ll/᩶ܺܺ;-><init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V

    invoke-direct {v2, v3}, Ll/ۢܺܺ;-><init>(Ll/᩶ܺܺ;)V

    return-object v2

    .line 360
    :cond_7
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    .line 361
    invoke-virtual {v3, v0}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/۬ܺܺ;

    .line 362
    invoke-virtual {v0}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۟ܺܺ;->ۤ:Ll/۟ܺܺ;

    :try_start_0
    const-string v1, "V"

    .line 514
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 516
    sget-object v0, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 523
    :cond_8
    invoke-static {v0}, Ll/۟ܺܺ;->֫(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v0

    .line 368
    :goto_1
    new-instance v1, Ll/۫ܺܺ;

    invoke-direct {v1, v0}, Ll/۫ܺܺ;-><init>(Ll/۟ܺܺ;)V

    return-object v1

    .line 520
    :catch_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "descriptor == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 352
    :cond_9
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {v0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 353
    invoke-static {v0}, Ll/ۗܺܺ;->֫(I)Ll/ۗܺܺ;

    move-result-object v0

    return-object v0

    .line 340
    :cond_a
    invoke-direct {p0}, Ll/֨ᩳܺ;->ۧ()Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ܺܺܺ;

    return-object v0

    .line 389
    :cond_b
    sget-object v0, Ll/ۨۢܺ;->ۙ:Ll/ۨۢܺ;

    .line 390
    invoke-direct {p0, v0}, Ll/֨ᩳܺ;->ܽ(Ll/ۨۢܺ;)Ll/ۛۢܺ;

    move-result-object v0

    .line 391
    new-instance v1, Ll/۟ۡܺ;

    invoke-direct {v1, v0}, Ll/۟ۡܺ;-><init>(Ll/ۛۢܺ;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ֫()Ll/ܰۡܺ;
    .locals 3

    .line 114
    :try_start_0
    invoke-direct {p0}, Ll/֨ᩳܺ;->ܽ()Ll/ܰۡܺ;

    move-result-object v0

    .line 116
    iget-object v1, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 117
    :cond_0
    new-instance v0, Ll/᩺ᩳܺ;

    const-string v1, "extra data in attribute"

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 117
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 121
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "shouldn\'t happen"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ֫(Ll/ۨۢܺ;)Ll/᩺ۢܺ;
    .locals 5

    .line 163
    iget-object v0, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    .line 220
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v1

    .line 226
    new-instance v2, Ll/᩺ۢܺ;

    invoke-direct {v2}, Ll/᩺ۢܺ;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 234
    invoke-direct {p0, p1}, Ll/֨ᩳܺ;->ܽ(Ll/ۨۢܺ;)Ll/ۛۢܺ;

    move-result-object v4

    .line 235
    invoke-virtual {v2, v4}, Ll/᩺ۢܺ;->֫(Ll/ۛۢܺ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {v2}, Ll/ᩴᩴܺ;->ܺ()V

    .line 165
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result p1

    if-nez p1, :cond_1

    return-object v2

    .line 166
    :cond_1
    new-instance p1, Ll/᩺ᩳܺ;

    const-string v0, "extra data in attribute"

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 166
    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 170
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "shouldn\'t happen"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ۧ(Ll/ۨۢܺ;)Ll/ܰۢܺ;
    .locals 8

    .line 138
    iget-object v0, p0, Ll/֨ᩳܺ;->֫:Ll/۟ۘܺ;

    .line 185
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    .line 191
    new-instance v2, Ll/ܰۢܺ;

    .line 67
    invoke-direct {v2, v1}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 220
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 226
    new-instance v5, Ll/᩺ۢܺ;

    invoke-direct {v5}, Ll/᩺ۢܺ;-><init>()V

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_0

    .line 234
    invoke-direct {p0, p1}, Ll/֨ᩳܺ;->ܽ(Ll/ۨۢܺ;)Ll/ۛۢܺ;

    move-result-object v7

    .line 235
    invoke-virtual {v5, v7}, Ll/᩺ۢܺ;->֫(Ll/ۛۢܺ;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 242
    :cond_0
    invoke-virtual {v5}, Ll/ᩴᩴܺ;->ܺ()V

    .line 200
    invoke-virtual {v2, v3, v5}, Ll/ܰۢܺ;->֫(ILl/᩺ۢܺ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 207
    :cond_1
    invoke-virtual {v2}, Ll/ᩴᩴܺ;->ܺ()V

    .line 140
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result p1

    if-nez p1, :cond_2

    return-object v2

    .line 141
    :cond_2
    new-instance p1, Ll/᩺ᩳܺ;

    const-string v0, "extra data in attribute"

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 141
    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 145
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "shouldn\'t happen"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
