.class public final Ll/ۧ᩷᩵;
.super Ll/ᩳ᩷᩵;
.source "J9YE"


# static fields
.field public static final ۖ:[C

.field public static ۘ:Ll/֫᩻֨;

.field public static ܺ:Z


# instance fields
.field public final ۜ:Ll/֫᩷᩵;

.field public ۡ:I

.field public final ۢ:J

.field public final ᩷:Ljava/net/DatagramPacket;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Ll/ۧ᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۧ᩷᩵;->ۘ:Ll/֫᩻֨;

    const/4 v0, 0x1

    .line 34
    sput-boolean v0, Ll/ۧ᩷᩵;->ܺ:Z

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 615
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۧ᩷᩵;->ۖ:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(IIZLjava/net/DatagramPacket;J)V
    .locals 0

    .line 282
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳ᩷᩵;-><init>(IIZ)V

    .line 283
    iput-object p4, p0, Ll/ۧ᩷᩵;->᩷:Ljava/net/DatagramPacket;

    .line 284
    new-instance p1, Ll/֫᩷᩵;

    invoke-virtual {p4}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object p2

    invoke-virtual {p4}, Ljava/net/DatagramPacket;->getLength()I

    move-result p3

    invoke-direct {p1, p2, p3}, Ll/֫᩷᩵;-><init>([BI)V

    iput-object p1, p0, Ll/ۧ᩷᩵;->ۜ:Ll/֫᩷᩵;

    .line 285
    iput-wide p5, p0, Ll/ۧ᩷᩵;->ۢ:J

    return-void
.end method

.method public constructor <init>(Ljava/net/DatagramPacket;)V
    .locals 18

    move-object/from16 v1, p0

    const-string v2, "MessageInputStream close error"

    .line 193
    sget-object v3, Ll/ۧ᩷᩵;->ۘ:Ll/֫᩻֨;

    const-string v0, "questions:"

    invoke-virtual/range {p1 .. p1}, Ljava/net/DatagramPacket;->getPort()I

    move-result v4

    sget v5, Ll/۬ۢ᩵;->ܿ:I

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-direct {v1, v6, v6, v4}, Ll/ᩳ᩷᩵;-><init>(IIZ)V

    move-object/from16 v4, p1

    .line 194
    iput-object v4, v1, Ll/ۧ᩷᩵;->᩷:Ljava/net/DatagramPacket;

    .line 195
    invoke-virtual/range {p1 .. p1}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v5

    .line 196
    new-instance v7, Ll/֫᩷᩵;

    invoke-virtual/range {p1 .. p1}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v9

    invoke-direct {v7, v8, v9}, Ll/֫᩷᩵;-><init>([BI)V

    iput-object v7, v1, Ll/ۧ᩷᩵;->ۜ:Ll/֫᩷᩵;

    .line 197
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iput-wide v8, v1, Ll/ۧ᩷᩵;->ۢ:J

    const/16 v8, 0x5b4

    .line 198
    iput v8, v1, Ll/ۧ᩷᩵;->ۡ:I

    .line 201
    :try_start_0
    invoke-virtual {v7}, Ll/֫᩷᩵;->ᩳ()I

    move-result v8

    invoke-virtual {v1, v8}, Ll/ᩳ᩷᩵;->ۧ(I)V

    .line 202
    invoke-virtual {v7}, Ll/֫᩷᩵;->ᩳ()I

    move-result v8

    invoke-virtual {v1, v8}, Ll/ᩳ᩷᩵;->֫(I)V

    .line 203
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ᩷᩵;->ܿ()I

    move-result v8

    if-gtz v8, :cond_a

    .line 206
    invoke-virtual {v7}, Ll/֫᩷᩵;->ᩳ()I

    move-result v8

    .line 207
    invoke-virtual {v7}, Ll/֫᩷᩵;->ᩳ()I

    move-result v9

    .line 208
    invoke-virtual {v7}, Ll/֫᩷᩵;->ᩳ()I

    move-result v10

    .line 209
    invoke-virtual {v7}, Ll/֫᩷᩵;->ᩳ()I

    move-result v7

    const-string v11, "DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}"

    .line 212
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 213
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 214
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 215
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x1

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v12, v6, v17

    aput-object v13, v6, v16

    const/4 v12, 0x2

    aput-object v14, v6, v12

    const/4 v12, 0x3

    aput-object v15, v6, v12

    .line 211
    invoke-interface {v3, v11, v6}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    mul-int/lit8 v6, v8, 0x5

    add-int v11, v9, v10

    add-int/2addr v11, v7

    mul-int/lit8 v11, v11, 0xb

    add-int/2addr v11, v6

    .line 221
    invoke-virtual/range {p1 .. p1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v4

    if-gt v11, v4, :cond_9

    if-lez v8, :cond_1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v8, :cond_1

    .line 228
    iget-object v4, v1, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    invoke-direct/range {p0 .. p0}, Ll/ۧ᩷᩵;->֡()Ll/ᩴ᩷᩵;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    if-lez v9, :cond_3

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v9, :cond_3

    .line 235
    invoke-direct {v1, v5}, Ll/ۧ᩷᩵;->֫(Ljava/net/InetAddress;)Ll/᩹᩷᩵;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 238
    iget-object v6, v1, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    if-lez v10, :cond_5

    const/4 v0, 0x0

    :goto_3
    if-ge v0, v10, :cond_5

    .line 245
    invoke-direct {v1, v5}, Ll/ۧ᩷᩵;->֫(Ljava/net/InetAddress;)Ll/᩹᩷᩵;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 248
    iget-object v6, v1, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    if-lez v7, :cond_7

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v7, :cond_7

    .line 255
    invoke-direct {v1, v5}, Ll/ۧ᩷᩵;->֫(Ljava/net/InetAddress;)Ll/᩹᩷᩵;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 258
    iget-object v4, v1, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 263
    :cond_7
    iget-object v0, v1, Ll/ۧ᩷᩵;->ۜ:Ll/֫᩷᩵;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v0, :cond_8

    .line 274
    :try_start_1
    iget-object v0, v1, Ll/ۧ᩷᩵;->ۜ:Ll/֫᩷᩵;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 276
    :catch_0
    invoke-interface {v3, v2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    return-void

    .line 264
    :cond_8
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Received a message with the wrong length."

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 222
    :cond_9
    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " answers:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " authorities:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " additionals:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 204
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Received a message with a non standard operation code. Currently unsupported in the specification."

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    .line 267
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "DNSIncoming() dump "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Ll/ۧ᩷᩵;->᩵()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\n exception "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    new-instance v4, Ljava/io/IOException;

    const-string v5, "DNSIncoming corrupted message"

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 270
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 271
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 274
    :goto_5
    :try_start_4
    iget-object v4, v1, Ll/ۧ᩷᩵;->ۜ:Ll/֫᩷᩵;

    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_6

    .line 276
    :catch_2
    invoke-interface {v3, v2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 278
    :goto_6
    throw v0
.end method

.method private ֡()Ll/ᩴ᩷᩵;
    .locals 6

    .line 304
    iget-object v0, p0, Ll/ۧ᩷᩵;->ۜ:Ll/֫᩷᩵;

    invoke-virtual {v0}, Ll/֫᩷᩵;->֫()Ljava/lang/String;

    move-result-object v1

    .line 305
    invoke-virtual {v0}, Ll/֫᩷᩵;->ᩳ()I

    move-result v2

    invoke-static {v2}, Ll/ۨۢ᩵;->֫(I)Ll/ۨۢ᩵;

    move-result-object v2

    .line 306
    sget-object v3, Ll/ۨۢ᩵;->ۜ֫:Ll/ۨۢ᩵;

    if-ne v2, v3, :cond_0

    const-string v3, "Could not find record type: {}"

    .line 307
    invoke-virtual {p0}, Ll/ۧ᩷᩵;->᩵()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۧ᩷᩵;->ۘ:Ll/֫᩻֨;

    invoke-interface {v5, v4, v3}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    :cond_0
    invoke-virtual {v0}, Ll/֫᩷᩵;->ᩳ()I

    move-result v0

    .line 310
    invoke-static {v0}, Ll/ۛۢ᩵;->ۧ(I)Ll/ۛۢ᩵;

    move-result-object v3

    .line 311
    invoke-virtual {v3, v0}, Ll/ۛۢ᩵;->֫(I)Z

    move-result v0

    .line 312
    invoke-static {v1, v2, v3, v0}, Ll/ᩴ᩷᩵;->֫(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)Ll/ᩴ᩷᩵;

    move-result-object v0

    return-object v0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 5

    .line 625
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 627
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    .line 628
    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    .line 629
    div-int/lit8 v3, v2, 0x10

    sget-object v4, Ll/ۧ᩷᩵;->ۖ:[C

    aget-char v3, v4, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 630
    rem-int/lit8 v2, v2, 0x10

    aget-char v2, v4, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 633
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/net/InetAddress;)Ll/᩹᩷᩵;
    .locals 25

    move-object/from16 v0, p0

    .line 316
    iget-object v1, v0, Ll/ۧ᩷᩵;->ۜ:Ll/֫᩷᩵;

    invoke-virtual {v1}, Ll/֫᩷᩵;->֫()Ljava/lang/String;

    move-result-object v3

    .line 317
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v2

    invoke-static {v2}, Ll/ۨۢ᩵;->֫(I)Ll/ۨۢ᩵;

    move-result-object v2

    .line 318
    sget-object v4, Ll/ۨۢ᩵;->ۜ֫:Ll/ۨۢ᩵;

    sget-object v5, Ll/ۧ᩷᩵;->ۘ:Ll/֫᩻֨;

    if-ne v2, v4, :cond_0

    const-string v4, "Could not find record type. domain: {}\n{}"

    .line 319
    invoke-virtual/range {p0 .. p0}, Ll/ۧ᩷᩵;->᩵()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v4, v3, v6}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 321
    :cond_0
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v4

    .line 322
    sget-object v6, Ll/ۨۢ᩵;->ۨ֫:Ll/ۨۢ᩵;

    if-ne v2, v6, :cond_1

    sget-object v7, Ll/ۛۢ᩵;->ܰ:Ll/ۛۢ᩵;

    goto :goto_0

    :cond_1
    invoke-static {v4}, Ll/ۛۢ᩵;->ۧ(I)Ll/ۛۢ᩵;

    move-result-object v7

    .line 323
    :goto_0
    sget-object v8, Ll/ۛۢ᩵;->ܰ:Ll/ۛۢ᩵;

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-ne v7, v8, :cond_2

    if-eq v2, v6, :cond_2

    .line 324
    invoke-virtual/range {p0 .. p0}, Ll/ۧ᩷᩵;->᩵()Ljava/lang/String;

    move-result-object v6

    new-array v8, v9, [Ljava/lang/Object;

    aput-object v3, v8, v11

    aput-object v2, v8, v12

    aput-object v6, v8, v10

    const-string v6, "Could not find record class. domain: {} type: {}\n{}"

    invoke-interface {v5, v6, v8}, Ll/֫᩻֨;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    :cond_2
    invoke-virtual {v7, v4}, Ll/ۛۢ᩵;->֫(I)Z

    move-result v6

    .line 68
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v8

    shl-int/lit8 v8, v8, 0x10

    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v13

    or-int/2addr v8, v13

    .line 328
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v13

    .line 331
    sget-object v14, Ll/۟ۜ᩵;->ܽ:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v14, v14, v15

    const/16 v15, 0xb

    const/16 v16, 0xa

    const/16 v17, 0x9

    const/16 v18, 0x10

    const/16 v19, 0x7

    const/16 v20, 0x0

    const-string v21, ""

    const/4 v9, 0x4

    packed-switch v14, :pswitch_data_0

    const-string v3, "DNSIncoming() unknown type: {}"

    .line 477
    invoke-interface {v5, v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v2, v13

    .line 478
    invoke-virtual {v1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    goto/16 :goto_11

    .line 380
    :pswitch_0
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v2

    invoke-static {v2, v8}, Ll/᩺ۢ᩵;->ۧ(II)Ll/᩺ۢ᩵;

    move-result-object v2

    const/high16 v3, 0xff0000

    and-int/2addr v3, v8

    shr-int/lit8 v3, v3, 0x10

    if-nez v3, :cond_12

    .line 383
    iput v4, v0, Ll/ۧ᩷᩵;->ۡ:I

    const/4 v2, 0x3

    .line 384
    :goto_1
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v3

    if-lez v3, :cond_18

    .line 388
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v3

    const-string v4, "There was a problem reading the OPT record. Ignoring."

    if-lt v3, v10, :cond_11

    .line 389
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v3

    .line 390
    invoke-static {v3}, Ll/ۤۢ᩵;->֫(I)Ll/ۤۢ᩵;

    move-result-object v6

    .line 396
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v7

    if-lt v7, v10, :cond_10

    .line 397
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v4

    new-array v7, v11, [B

    .line 403
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v8

    if-lt v8, v4, :cond_3

    .line 72
    new-array v7, v4, [B

    .line 73
    invoke-virtual {v1, v7, v11, v4}, Ljava/io/InputStream;->read([BII)I

    .line 408
    :cond_3
    sget-object v4, Ll/۟ۜ᩵;->ۧ:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v4, v4, v8

    if-eq v4, v12, :cond_7

    if-eq v4, v10, :cond_6

    if-eq v4, v2, :cond_6

    if-eq v4, v9, :cond_6

    const/4 v2, 0x5

    if-eq v4, v2, :cond_4

    goto/16 :goto_e

    :cond_4
    const v2, 0xfde9

    if-lt v3, v2, :cond_5

    const v2, 0xfffe

    if-gt v3, v2, :cond_5

    .line 462
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v7}, Ll/ۧ᩷᩵;->֫([B)Ljava/lang/String;

    move-result-object v3

    const-string v4, "There was an OPT answer using an experimental/local option code: {} data: {}"

    invoke-interface {v5, v4, v2, v3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_e

    .line 464
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v7}, Ll/ۧ᩷᩵;->֫([B)Ljava/lang/String;

    move-result-object v3

    const-string v4, "There was an OPT answer. Not currently handled. Option code: {} data: {}"

    invoke-interface {v5, v4, v2, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_e

    .line 455
    :cond_6
    invoke-interface {v5}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "There was an OPT answer. Option code: {} data: {}"

    .line 456
    invoke-static {v7}, Ll/ۧ᩷᩵;->֫([B)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v5, v2, v6, v3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_e

    .line 421
    :cond_7
    :try_start_0
    aget-byte v3, v7, v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 422
    :try_start_1
    aget-byte v4, v7, v12
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    const/4 v6, 0x6

    :try_start_2
    new-array v6, v6, [B

    .line 423
    aget-byte v8, v7, v10

    aput-byte v8, v6, v11

    aget-byte v8, v7, v2

    aput-byte v8, v6, v12

    aget-byte v8, v7, v9

    aput-byte v8, v6, v10

    const/4 v8, 0x5

    aget-byte v13, v7, v8

    aput-byte v13, v6, v2

    const/4 v13, 0x6

    aget-byte v14, v7, v13

    aput-byte v14, v6, v9

    aget-byte v14, v7, v19

    aput-byte v14, v6, v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 425
    :try_start_3
    array-length v8, v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    const/16 v14, 0x8

    if-le v8, v14, :cond_8

    :try_start_4
    new-array v8, v13, [B

    .line 427
    aget-byte v13, v7, v14

    aput-byte v13, v8, v11

    aget-byte v13, v7, v17

    aput-byte v13, v8, v12

    aget-byte v13, v7, v16

    aput-byte v13, v8, v10

    aget-byte v13, v7, v15

    aput-byte v13, v8, v2

    const/16 v2, 0xc

    aget-byte v2, v7, v2

    aput-byte v2, v8, v9

    const/16 v2, 0xd

    aget-byte v2, v7, v2

    const/4 v13, 0x5

    aput-byte v2, v8, v13
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_0
    const/4 v2, 0x3

    move-object v8, v6

    move-object/from16 v2, v20

    const/16 v23, 0x3

    goto :goto_4

    :cond_8
    move-object v8, v6

    .line 429
    :goto_2
    :try_start_5
    array-length v2, v7
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const/16 v13, 0x11

    const/16 v14, 0xf

    const/16 v22, 0xe

    const/16 v23, 0x3

    const/16 v15, 0x12

    if-ne v2, v15, :cond_9

    :try_start_6
    new-array v2, v9, [B

    .line 431
    aget-byte v15, v7, v22

    aput-byte v15, v2, v11

    aget-byte v15, v7, v14

    aput-byte v15, v2, v12

    aget-byte v15, v7, v18

    aput-byte v15, v2, v10

    aget-byte v10, v7, v13

    aput-byte v10, v2, v23
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_3

    :catch_1
    move-object/from16 v2, v20

    goto :goto_4

    :cond_9
    move-object/from16 v2, v20

    :goto_3
    const/16 v10, 0x12

    .line 433
    :try_start_7
    array-length v15, v7
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    const/16 v24, 0x2

    const/16 v9, 0x16

    if-ne v15, v9, :cond_a

    const/16 v9, 0x8

    :try_start_8
    new-array v9, v9, [B

    .line 435
    aget-byte v15, v7, v22

    aput-byte v15, v9, v11

    aget-byte v14, v7, v14

    aput-byte v14, v9, v12

    aget-byte v14, v7, v18

    aput-byte v14, v9, v24

    aget-byte v13, v7, v13

    aput-byte v13, v9, v23

    aget-byte v10, v7, v10

    const/4 v13, 0x4

    aput-byte v10, v9, v13

    const/16 v10, 0x13

    aget-byte v10, v7, v10

    const/4 v13, 0x5

    aput-byte v10, v9, v13

    const/16 v10, 0x14

    aget-byte v10, v7, v10

    const/4 v13, 0x6

    aput-byte v10, v9, v13

    const/16 v10, 0x15

    aget-byte v10, v7, v10

    aput-byte v10, v9, v19
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    move-object v2, v9

    goto :goto_9

    :catch_2
    :goto_4
    const/16 v24, 0x2

    goto :goto_8

    :catch_3
    const/4 v2, 0x3

    const/4 v9, 0x2

    goto :goto_5

    :catch_4
    const/4 v2, 0x3

    const/4 v8, 0x2

    move-object v8, v6

    :goto_5
    const/16 v23, 0x3

    const/16 v24, 0x2

    move-object/from16 v2, v20

    goto :goto_8

    :catch_5
    const/16 v23, 0x3

    const/16 v24, 0x2

    goto :goto_7

    :catch_6
    const/4 v2, 0x3

    const/4 v4, 0x2

    goto :goto_6

    :catch_7
    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x0

    :goto_6
    const/16 v23, 0x3

    const/16 v24, 0x2

    const/4 v4, 0x0

    :goto_7
    move-object/from16 v2, v20

    move-object v6, v2

    move-object v8, v6

    :catch_8
    :goto_8
    const-string v9, "Malformed OPT answer. Option code: Owner data: {}"

    .line 438
    invoke-static {v7}, Ll/ۧ᩷᩵;->֫([B)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v9}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    :cond_a
    :goto_9
    invoke-interface {v5}, Ll/֫᩻֨;->֫()Z

    move-result v7

    if-eqz v7, :cond_f

    .line 442
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 443
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 444
    invoke-static {v6}, Ll/ۧ᩷᩵;->֫([B)Ljava/lang/String;

    move-result-object v7

    if-eq v8, v6, :cond_b

    const-string v9, " wakeup MAC address: "

    goto :goto_a

    :cond_b
    move-object/from16 v9, v21

    :goto_a
    if-eq v8, v6, :cond_c

    .line 446
    invoke-static {v8}, Ll/ۧ᩷᩵;->֫([B)Ljava/lang/String;

    move-result-object v6

    goto :goto_b

    :cond_c
    move-object/from16 v6, v21

    :goto_b
    if-eqz v2, :cond_d

    const-string v8, " password: "

    goto :goto_c

    :cond_d
    move-object/from16 v8, v21

    :goto_c
    if-eqz v2, :cond_e

    .line 448
    invoke-static {v2}, Ll/ۧ᩷᩵;->֫([B)Ljava/lang/String;

    move-result-object v2

    goto :goto_d

    :cond_e
    move-object/from16 v2, v21

    :goto_d
    const/4 v10, 0x7

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v3, v10, v11

    aput-object v4, v10, v12

    aput-object v7, v10, v24

    aput-object v9, v10, v23

    const/4 v3, 0x4

    aput-object v6, v10, v3

    const/4 v3, 0x5

    aput-object v8, v10, v3

    const/4 v3, 0x6

    aput-object v2, v10, v3

    const-string v2, "Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}"

    .line 441
    invoke-interface {v5, v2, v10}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_f
    :goto_e
    const/4 v2, 0x3

    const/4 v10, 0x2

    const/16 v19, 0x7

    const/4 v9, 0x4

    const/16 v15, 0xb

    goto/16 :goto_1

    .line 399
    :cond_10
    invoke-interface {v5, v4}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_11

    .line 392
    :cond_11
    invoke-interface {v5, v4}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_11

    :cond_12
    const-string v1, "There was an OPT answer. Wrong version number: {} result code: {}"

    .line 473
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v1, v3, v2}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_11

    .line 372
    :pswitch_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 373
    invoke-virtual {v1, v13}, Ll/֫᩷᩵;->֫(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    .line 374
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_13

    .line 375
    invoke-virtual {v2, v11, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_f

    :cond_13
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_f
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    if-lez v1, :cond_14

    add-int/2addr v1, v12

    .line 376
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v21

    :cond_14
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 377
    new-instance v10, Ll/֡᩷᩵;

    .line 915
    sget-object v4, Ll/ۨۢ᩵;->᩻֫:Ll/ۨۢ᩵;

    move-object v2, v10

    move-object v5, v7

    move v7, v8

    invoke-direct/range {v2 .. v7}, Ll/᩹᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI)V

    .line 916
    iput-object v9, v10, Ll/֡᩷᩵;->ۘ:Ljava/lang/String;

    .line 917
    iput-object v1, v10, Ll/֡᩷᩵;->ᩴ:Ljava/lang/String;

    goto/16 :goto_12

    .line 357
    :pswitch_2
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v9

    .line 358
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v10

    .line 359
    invoke-virtual {v1}, Ll/֫᩷᩵;->ᩳ()I

    move-result v11

    .line 363
    sget-boolean v2, Ll/ۧ᩷᩵;->ܺ:Z

    if-eqz v2, :cond_15

    .line 364
    invoke-virtual {v1}, Ll/֫᩷᩵;->֫()Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    .line 172
    :cond_15
    invoke-virtual {v1}, Ll/֫᩷᩵;->ܽ()I

    move-result v2

    .line 173
    invoke-virtual {v1, v2}, Ll/֫᩷᩵;->֫(I)Ljava/lang/String;

    move-result-object v1

    .line 369
    :goto_10
    new-instance v20, Ll/ܶ᩷᩵;

    move-object/from16 v2, v20

    move-object v4, v7

    move v5, v6

    move v6, v8

    move v7, v9

    move v8, v10

    move v9, v11

    move-object v10, v1

    invoke-direct/range {v2 .. v10}, Ll/ܶ᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZIIIILjava/lang/String;)V

    goto/16 :goto_11

    .line 354
    :pswitch_3
    new-instance v20, Ll/᩸᩷᩵;

    .line 72
    new-array v9, v13, [B

    .line 73
    invoke-virtual {v1, v9, v11, v13}, Ljava/io/InputStream;->read([BII)I

    move-object/from16 v2, v20

    move-object v4, v7

    move v5, v6

    move v6, v8

    move-object v7, v9

    .line 354
    invoke-direct/range {v2 .. v7}, Ll/᩸᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZI[B)V

    goto/16 :goto_11

    .line 346
    :pswitch_4
    invoke-virtual {v1}, Ll/֫᩷᩵;->֫()Ljava/lang/String;

    move-result-object v1

    .line 347
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_16

    .line 348
    new-instance v20, Ll/۠᩷᩵;

    move-object/from16 v2, v20

    move-object v4, v7

    move v5, v6

    move v6, v8

    move-object v7, v1

    invoke-direct/range {v2 .. v7}, Ll/۠᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V

    goto/16 :goto_11

    :cond_16
    const-string v1, "PTR record of class: {}, there was a problem reading the service name of the answer for domain: {}"

    .line 350
    invoke-interface {v5, v1, v7, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_5
    const/4 v2, 0x3

    const/4 v4, 0x2

    .line 72
    new-array v9, v13, [B

    .line 73
    invoke-virtual {v1, v9, v11, v13}, Ljava/io/InputStream;->read([BII)I

    .line 488
    aget-byte v1, v9, v11

    if-nez v1, :cond_17

    aget-byte v1, v9, v12

    if-nez v1, :cond_17

    aget-byte v1, v9, v4

    if-nez v1, :cond_17

    aget-byte v1, v9, v2

    if-nez v1, :cond_17

    const/4 v1, 0x4

    aget-byte v1, v9, v1

    if-nez v1, :cond_17

    const/4 v1, 0x5

    aget-byte v1, v9, v1

    if-nez v1, :cond_17

    const/4 v1, 0x6

    aget-byte v1, v9, v1

    if-nez v1, :cond_17

    const/4 v1, 0x7

    aget-byte v1, v9, v1

    if-nez v1, :cond_17

    const/16 v1, 0x8

    aget-byte v1, v9, v1

    if-nez v1, :cond_17

    aget-byte v1, v9, v17

    if-nez v1, :cond_17

    aget-byte v1, v9, v16

    const/4 v2, -0x1

    if-ne v1, v2, :cond_17

    const/16 v1, 0xb

    aget-byte v1, v9, v1

    if-ne v1, v2, :cond_17

    const-string v1, "AAAA record with IPv4-mapped address for {}"

    .line 338
    invoke-interface {v5, v3, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_11

    .line 340
    :cond_17
    new-instance v20, Ll/֨᩷᩵;

    .line 252
    sget-object v4, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    move-object/from16 v2, v20

    move-object v5, v7

    move v7, v8

    move-object v8, v9

    invoke-direct/range {v2 .. v8}, Ll/᩵᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI[B)V

    goto :goto_11

    .line 333
    :pswitch_6
    new-instance v20, Ll/ۚ᩷᩵;

    .line 72
    new-array v9, v13, [B

    .line 73
    invoke-virtual {v1, v9, v11, v13}, Ljava/io/InputStream;->read([BII)I

    .line 210
    sget-object v4, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    move-object/from16 v2, v20

    move-object v5, v7

    move v7, v8

    move-object v8, v9

    invoke-direct/range {v2 .. v8}, Ll/᩵᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI[B)V

    :cond_18
    :goto_11
    move-object/from16 v10, v20

    :goto_12
    if-eqz v10, :cond_19

    move-object/from16 v1, p1

    .line 482
    invoke-virtual {v10, v1}, Ll/᩹᩷᩵;->֫(Ljava/net/InetAddress;)V

    :cond_19
    return-object v10

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/ۧ᩷᩵;->clone()Ll/ۧ᩷᩵;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ۧ᩷᩵;
    .locals 8

    .line 294
    new-instance v7, Ll/ۧ᩷᩵;

    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v2

    iget-object v4, p0, Ll/ۧ᩷᩵;->᩷:Ljava/net/DatagramPacket;

    iget-wide v5, p0, Ll/ۧ᩷᩵;->ۢ:J

    iget-boolean v3, p0, Ll/ᩳ᩷᩵;->ܳ:Z

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ۧ᩷᩵;-><init>(IIZLjava/net/DatagramPacket;J)V

    .line 295
    iget v0, p0, Ll/ۧ᩷᩵;->ۡ:I

    iput v0, v7, Ll/ۧ᩷᩵;->ۡ:I

    .line 296
    iget-object v0, v7, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    iget-object v1, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 297
    iget-object v0, v7, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    iget-object v1, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 298
    iget-object v0, v7, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    iget-object v1, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 299
    iget-object v0, v7, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    iget-object v1, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v7
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 513
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 514
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "dns[query,"

    goto :goto_0

    :cond_0
    const-string v1, "dns[response,"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    iget-object v1, p0, Ll/ۧ᩷᩵;->᩷:Ljava/net/DatagramPacket;

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 516
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v2, 0x3a

    .line 518
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 519
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getPort()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", length="

    .line 520
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", id=0x"

    .line 522
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, ", flags=0x"

    .line 525
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    const v2, 0x8000

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    const-string v1, ":r"

    .line 528
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    :cond_2
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_3

    const-string v1, ":aa"

    .line 531
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    :cond_3
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v1

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_4

    const-string v1, ":tc"

    .line 534
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    :cond_4
    iget-object v1, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    if-lez v2, :cond_5

    const-string v2, ", questions="

    .line 538
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    .line 539
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    :cond_5
    iget-object v2, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    if-lez v3, :cond_6

    const-string v3, ", answers="

    .line 542
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    .line 543
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    :cond_6
    iget-object v3, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    if-lez v4, :cond_7

    const-string v4, ", authorities="

    .line 546
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    .line 547
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    :cond_7
    iget-object v4, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    if-lez v5, :cond_8

    const-string v5, ", additionals="

    .line 550
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    .line 551
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    :cond_8
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v5

    const-string v6, "\n\t"

    if-lez v5, :cond_9

    const-string v5, "\nquestions:"

    .line 554
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴ᩷᩵;

    .line 556
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 151
    :cond_9
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_a

    const-string v1, "\nanswers:"

    .line 561
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 563
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 165
    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_b

    const-string v1, "\nauthorities:"

    .line 568
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 570
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 179
    :cond_b
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_c

    const-string v1, "\nadditionals:"

    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 577
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_c
    const/16 v1, 0x5d

    .line 581
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 583
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۧ᩷᩵;)V
    .locals 2

    .line 592
    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ᩳ᩷᩵;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 593
    iget-object v0, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    .line 122
    iget-object v1, p1, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    .line 593
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 594
    iget-object v0, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    .line 144
    iget-object v1, p1, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    .line 594
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 595
    iget-object v0, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    .line 158
    iget-object v1, p1, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    .line 595
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 596
    iget-object v0, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    .line 172
    iget-object p1, p1, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    .line 596
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 598
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۘ()I
    .locals 4

    .line 603
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۧ᩷᩵;->ۢ:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public final ᩴ()I
    .locals 1

    .line 612
    iget v0, p0, Ll/ۧ᩷᩵;->ۡ:I

    return v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 11

    .line 501
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0xc8

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 251
    invoke-virtual {p0}, Ll/ۧ᩷᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 252
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    iget-object v3, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴ᩷᩵;

    const-string v5, "\tquestion:      "

    .line 254
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 258
    :cond_0
    iget-object v3, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    const-string v5, "\tanswer:        "

    .line 259
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 263
    :cond_1
    iget-object v3, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    const-string v5, "\tauthoritative: "

    .line 264
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 268
    :cond_2
    iget-object v3, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    const-string v5, "\tadditional:    "

    .line 269
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 273
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 502
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    iget-object v1, p0, Ll/ۧ᩷᩵;->᩷:Ljava/net/DatagramPacket;

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v3

    new-array v4, v3, [B

    .line 505
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v1, v5, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 283
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v5, 0xfa0

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v5, 0x0

    :cond_4
    if-ge v5, v3, :cond_f

    sub-int v6, v3, v5

    const/16 v7, 0x20

    .line 285
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/16 v8, 0x10

    if-ge v5, v8, :cond_5

    .line 287
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    const/16 v8, 0x100

    if-ge v5, v8, :cond_6

    .line 290
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    const/16 v8, 0x1000

    if-ge v5, v8, :cond_7

    .line 293
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 295
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x3a

    .line 296
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v6, :cond_9

    .line 299
    rem-int/lit8 v9, v8, 0x8

    if-nez v9, :cond_8

    .line 300
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_8
    add-int v9, v5, v8

    .line 302
    aget-byte v10, v4, v9

    and-int/lit16 v10, v10, 0xf0

    shr-int/lit8 v10, v10, 0x4

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    aget-byte v9, v4, v9

    and-int/lit8 v9, v9, 0xf

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_9
    if-ge v8, v7, :cond_b

    :goto_5
    if-ge v8, v7, :cond_b

    .line 308
    rem-int/lit8 v9, v8, 0x8

    if-nez v9, :cond_a

    .line 309
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_a
    const-string v9, "  "

    .line 311
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_b
    const-string v8, "    "

    .line 314
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v6, :cond_e

    .line 316
    rem-int/lit8 v9, v8, 0x8

    if-nez v9, :cond_c

    .line 317
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_c
    add-int v9, v5, v8

    .line 319
    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    if-le v9, v7, :cond_d

    const/16 v10, 0x7f

    if-ge v9, v10, :cond_d

    int-to-char v9, v9

    goto :goto_7

    :cond_d
    const/16 v9, 0x2e

    .line 320
    :goto_7
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    .line 322
    :cond_e
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x20

    const/16 v6, 0x800

    if-lt v5, v6, :cond_4

    const-string v2, "....\n"

    .line 326
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    :cond_f
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 506
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
