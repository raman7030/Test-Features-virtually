.class public abstract Ll/᩷ܿ۠;
.super Ljava/lang/Object;
.source "F43P"

# interfaces
.implements Ll/ۧ᩶۠;


# static fields
.field public static final ۟:Ljava/util/Set;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/util/HashMap;

.field public final ۛ:Ll/᩹ܳ۠;

.field public ۤ:J

.field public ۨ:Ll/᩹ܶ۠;

.field public ۫:Ljava/lang/String;

.field public ۬:J

.field public ܰ:Ll/ۨܶ۠;

.field public ᩶:Ljava/lang/String;

.field public final ᩸:Ll/᩻ܿ۠;

.field public ᩹:Ljava/nio/charset/Charset;

.field public ᩺:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 250
    invoke-static {}, Ll/֡ۖ۠;->֡()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/᩷ܿ۠;->۟:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/nio/charset/Charset;)V
    .locals 2

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ܿ۠;->ۤ:J

    const-wide/16 v0, 0x0

    .line 175
    iput-wide v0, p0, Ll/᩷ܿ۠;->۬:J

    .line 469
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩷ܿ۠;->ۙ:Ljava/util/HashMap;

    .line 75
    iput-object p1, p0, Ll/᩷ܿ۠;->᩹:Ljava/nio/charset/Charset;

    .line 76
    new-instance p1, Ll/᩻ܿ۠;

    .line 428
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Ll/᩷ܿ۠;->᩸:Ll/᩻ܿ۠;

    .line 116
    new-instance p1, Ll/᩹ܳ۠;

    invoke-direct {p1}, Ll/᩹ܳ۠;-><init>()V

    .line 77
    iput-object p1, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨܿ۠;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩷ܿ۠;->ۤ:J

    return-wide v0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ܽ᩶۠;
    .locals 2

    .line 495
    sget-object v0, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    iget-object v1, v0, Ll/ܽ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 497
    :cond_0
    sget-object v0, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    iget-object v1, v0, Ll/ܽ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 499
    :cond_1
    sget-object v0, Ll/ܽ᩶۠;->ۙ:Ll/ܽ᩶۠;

    iget-object v1, v0, Ll/ܽ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-object v0

    .line 502
    :cond_2
    sget-object p0, Ll/ܽ᩶۠;->ۗ:Ll/ܽ᩶۠;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)I
    .locals 1

    .line 254
    sget-object v0, Ll/᩷ܿ۠;->۟:Ljava/util/Set;

    invoke-static {p1, v0}, Ll/֡ۖ۠;->֫(Ljava/lang/String;Ljava/util/Set;)Ll/֡ۖ۠;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 255
    :cond_0
    invoke-virtual {p1}, Ll/֡ۖ۠;->᩷()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 313
    iget-object v0, p0, Ll/᩷ܿ۠;->۫:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 306
    :cond_0
    iget-object v0, p0, Ll/᩷ܿ۠;->ۗ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 307
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ܿ۠;->ۗ:Ljava/lang/String;

    .line 309
    :cond_1
    iget-object v0, p0, Ll/᩷ܿ۠;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
    .locals 5

    .line 402
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v0

    const/16 v1, 0x400

    if-ge v0, v1, :cond_0

    const/16 v0, 0x400

    .line 404
    :cond_0
    iget-object v1, p0, Ll/᩷ܿ۠;->᩸:Ll/᩻ܿ۠;

    invoke-virtual {v1, v0}, Ll/᩻ܿ۠;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x0

    .line 406
    :goto_0
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v3

    if-eqz v3, :cond_3

    if-lt v2, v0, :cond_1

    shl-int/lit8 v0, v0, 0x1

    .line 410
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 411
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 412
    :cond_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    sub-int v4, v0, v2

    invoke-virtual {p1, v3, v2, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-gez v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v2, v3

    .line 416
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    .line 418
    :cond_3
    :goto_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final ֫(Ljava/nio/ByteBuffer;Z)Ljava/nio/CharBuffer;
    .locals 12

    .line 317
    invoke-virtual {p0}, Ll/᩷ܿ۠;->֫()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "compiler"

    .line 376
    iget-object v3, p0, Ll/᩷ܿ۠;->᩹:Ljava/nio/charset/Charset;

    const/4 v4, 0x1

    if-nez v3, :cond_0

    .line 377
    :try_start_0
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v3

    .line 379
    :goto_0
    invoke-virtual {v5}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v5

    if-eqz p2, :cond_1

    .line 383
    sget-object p2, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    goto :goto_1

    .line 385
    :cond_1
    sget-object p2, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 388
    :goto_1
    invoke-virtual {v5, p2}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v5

    .line 389
    invoke-virtual {v5, p2}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p2
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 328
    invoke-virtual {p2}, Ljava/nio/charset/CharsetDecoder;->averageCharsPerByte()F

    move-result v5

    const v6, 0x3f4ccccd    # 0.8f

    mul-float v5, v5, v6

    .line 329
    invoke-virtual {p2}, Ljava/nio/charset/CharsetDecoder;->maxCharsPerByte()F

    move-result v6

    const v7, 0x3e4ccccd    # 0.2f

    mul-float v6, v6, v7

    add-float/2addr v6, v5

    .line 331
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    int-to-float v5, v5

    mul-float v5, v5, v6

    float-to-int v5, v5

    add-int/lit8 v5, v5, 0xa

    invoke-static {v5}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v5

    .line 334
    :goto_2
    invoke-virtual {p2, p1, v5, v4}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v6

    .line 335
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    .line 337
    invoke-virtual {v6}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 339
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result p1

    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result p2

    if-ne p1, p2, :cond_2

    .line 340
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    add-int/2addr p1, v4

    invoke-static {p1}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/nio/CharBuffer;->put(Ljava/nio/CharBuffer;)Ljava/nio/CharBuffer;

    move-result-object p1

    .line 341
    invoke-virtual {p1}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    return-object p1

    :cond_2
    return-object v5

    .line 344
    :cond_3
    invoke-virtual {v6}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 346
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result v6

    add-int/lit8 v6, v6, 0xa

    .line 347
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {p2}, Ljava/nio/charset/CharsetDecoder;->maxCharsPerByte()F

    move-result v8

    mul-float v8, v8, v7

    float-to-int v7, v8

    add-int/2addr v6, v7

    .line 348
    invoke-static {v6}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/nio/CharBuffer;->put(Ljava/nio/CharBuffer;)Ljava/nio/CharBuffer;

    move-result-object v5

    goto :goto_2

    .line 349
    :cond_4
    invoke-virtual {v6}, Ljava/nio/charset/CoderResult;->isMalformed()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v6}, Ljava/nio/charset/CoderResult;->isUnmappable()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_3

    .line 369
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, v6}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 351
    :cond_6
    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    invoke-virtual {v6}, Ljava/nio/charset/CoderResult;->length()I

    move-result v6

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v6, :cond_7

    .line 355
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v9

    new-array v10, v4, [Ljava/lang/Object;

    aput-object v9, v10, v1

    const-string v9, "%02X"

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_7
    if-nez v3, :cond_8

    move-object v6, v0

    goto :goto_5

    .line 358
    :cond_8
    invoke-virtual {v3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v6

    .line 360
    :goto_5
    iget-object v8, p0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v9

    .line 361
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v10, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1640
    new-instance v10, Ll/۫۠۠;

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v7, v11, v1

    aput-object v6, v11, v4

    const-string v6, "illegal.char.for.encoding"

    invoke-direct {v10, v2, v6, v11}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    invoke-virtual {v8, v9, v10}, Ll/ۖ֨۠;->֫(ILl/۫۠۠;)V

    .line 365
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    .line 366
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/nio/CharBuffer;->limit(I)Ljava/nio/Buffer;

    const v6, 0xfffd

    .line 367
    invoke-virtual {v5, v6}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    goto/16 :goto_2

    .line 322
    :catch_0
    iget-object p1, p0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    sget-object p2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3939
    new-instance p2, Ll/۫۠۠;

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v0, v3, v1

    const-string v0, "unsupported.encoding"

    invoke-direct {p2, v2, v0, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-virtual {p1, p2}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 323
    invoke-static {v4}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/CharBuffer;

    return-object p1
.end method

.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 422
    iget-object v0, p0, Ll/᩷ܿ۠;->᩸:Ll/᩻ܿ۠;

    invoke-virtual {v0, p1}, Ll/᩻ܿ۠;->֫(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public ֫(Ll/ۗ֨۠;)V
    .locals 3

    .line 85
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    .line 86
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ܿ۠;->ܰ:Ll/ۨܶ۠;

    const-string v1, "procloader"

    .line 87
    invoke-virtual {v0, v1}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ܿ۠;->᩶:Ljava/lang/String;

    .line 90
    iget-object v0, p0, Ll/᩷ܿ۠;->ܰ:Ll/ۨܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    sget-object v1, Ll/֡ۖ۠;->ܳܽ:Ll/֡ۖ۠;

    const-string v2, "path"

    .line 123
    invoke-virtual {v0, v1, v2}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Ll/֡ۖ۠;->ܿܽ:Ll/֡ۖ۠;

    .line 124
    invoke-virtual {v0, v2}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "all"

    invoke-virtual {v0, v1, v2}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const-string v2, "-path"

    invoke-virtual {v0, v1, v2}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 91
    :goto_1
    iget-object v1, p0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    .line 62
    const-class v2, Ll/ۖܿ۠;

    invoke-virtual {p1, v2}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܿ۠;

    if-nez p1, :cond_3

    .line 64
    new-instance p1, Ll/ۖܿ۠;

    invoke-direct {p1}, Ll/ۖܿ۠;-><init>()V

    .line 91
    :cond_3
    iget-object v2, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    invoke-virtual {v2, v1, v0, p1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܶ۠;ZLl/ۖܿ۠;)V

    .line 105
    iget-object p1, p0, Ll/᩷ܿ۠;->ܰ:Ll/ۨܶ۠;

    const-string v0, "fileManager.deferClose"

    invoke-virtual {p1, v0}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 108
    :try_start_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    int-to-long v0, p1

    iput-wide v0, p0, Ll/᩷ܿ۠;->۬:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-wide/32 v0, 0xea60

    .line 110
    iput-wide v0, p0, Ll/᩷ܿ۠;->۬:J

    :cond_4
    return-void
.end method

.method public final ֫(Ljava/util/Iterator;Ljava/lang/String;)Z
    .locals 2

    .line 213
    new-instance v0, Ll/ܿܿ۠;

    iget-object v1, p0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    invoke-direct {v0, p0, v1}, Ll/ܿܿ۠;-><init>(Ll/᩷ܿ۠;Ll/᩹ܶ۠;)V

    .line 235
    sget-object v1, Ll/᩷ܿ۠;->۟:Ljava/util/Set;

    invoke-static {p2, v1}, Ll/֡ۖ۠;->֫(Ljava/lang/String;Ljava/util/Set;)Ll/֡ۖ۠;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 241
    :cond_0
    :try_start_0
    invoke-virtual {v1, v0, p2, p1}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/util/Iterator;)V
    :try_end_0
    .catch Ll/ۖۖ۠; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 243
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 4

    .line 267
    sget-object v0, Ll/ܳܿ۠;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    iget-object v3, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    if-eq v0, v2, :cond_1

    .line 2119
    iget-object v0, v3, Ll/᩹ܳ۠;->ܳ:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧܳ۠;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2120
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ۧܳ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 273
    :cond_1
    iput-object p2, p0, Ll/᩷ܿ۠;->᩺:Ljava/lang/String;

    .line 274
    invoke-virtual {v3, p2}, Ll/᩹ܳ۠;->֫(Ljava/lang/String;)V

    return v1

    .line 269
    :cond_2
    iput-object p2, p0, Ll/᩷ܿ۠;->۫:Ljava/lang/String;

    return v1
.end method

.method public final declared-synchronized ܳ()V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 169
    :try_start_0
    iget-wide v1, p0, Ll/᩷ܿ۠;->۬:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 170
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Ll/᩷ܿ۠;->ۤ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ()Z
    .locals 2

    .line 203
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    sget-object v1, Ll/᩷᩶۠;->ۨ:Ll/᩷᩶۠;

    .line 185
    invoke-virtual {v0, v1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object v0

    check-cast v0, Ll/۟ܿ۠;

    .line 186
    invoke-virtual {v0}, Ll/۟ܿ۠;->ۜ()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 207
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    sget-object v1, Ll/᩷᩶۠;->۟:Ll/᩷᩶۠;

    .line 191
    invoke-virtual {v0, v1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object v0

    check-cast v0, Ll/᩸ܳ۠;

    .line 570
    iget-boolean v0, v0, Ll/ܰܿ۠;->֫:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
