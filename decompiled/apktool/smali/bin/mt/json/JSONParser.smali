.class public Lbin/mt/json/JSONParser;
.super Ljava/lang/Object;
.source "JSONParser.java"


# static fields
.field public static final DEFAULT_BUFFER_SIZE:I = 0x400

.field public static final MAX_NESTING_LEVEL:I = 0x3e8

.field public static final MIN_BUFFER_SIZE:I = 0xa


# instance fields
.field public buffer:[C

.field public bufferOffset:I

.field public captureBuffer:Ljava/lang/StringBuilder;

.field public captureStart:I

.field public current:I

.field public fill:I

.field public final handler:Lbin/mt/json/JSONHandler;

.field public index:I

.field public line:I

.field public lineOffset:I

.field public nestingLevel:I

.field public reader:Ljava/io/Reader;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONHandler;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 70
    iput-object p1, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    .line 71
    iput-object p0, p1, Lbin/mt/json/JSONHandler;->parser:Lbin/mt/json/JSONParser;

    return-void

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "handler is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private endCapture()Ljava/lang/String;
    .locals 4

    .line 506
    iget v0, p0, Lbin/mt/json/JSONParser;->captureStart:I

    .line 507
    iget v1, p0, Lbin/mt/json/JSONParser;->index:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, -0x1

    .line 508
    iput v2, p0, Lbin/mt/json/JSONParser;->captureStart:I

    .line 509
    iget-object v2, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 510
    iget-object v2, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbin/mt/json/JSONParser;->buffer:[C

    sub-int/2addr v1, v0

    invoke-virtual {v2, v3, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 511
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 512
    iget-object v1, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    return-object v0

    .line 515
    :cond_0
    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lbin/mt/json/JSONParser;->buffer:[C

    sub-int/2addr v1, v0

    invoke-direct {v2, v3, v0, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v2
.end method

.method private endParse()V
    .locals 1

    .line 187
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    .line 188
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->isEndOfText()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Unexpected character"

    .line 189
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->error(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0
.end method

.method private error(Ljava/lang/String;)Lbin/mt/json/JSONParseException;
    .locals 2

    .line 532
    new-instance v0, Lbin/mt/json/JSONParseException;

    invoke-virtual {p0}, Lbin/mt/json/JSONParser;->getLocation()Lbin/mt/json/Location;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lbin/mt/json/JSONParseException;-><init>(Ljava/lang/String;Lbin/mt/json/Location;)V

    return-object v0
.end method

.method private expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;
    .locals 1

    .line 525
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->isEndOfText()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Unexpected end of input"

    .line 526
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->error(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Expected "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 528
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->error(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    return-object p1
.end method

.method private isDigit()Z
    .locals 2

    .line 540
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0x30

    if-lt v0, v1, :cond_0

    const/16 v1, 0x39

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private isEndOfText()Z
    .locals 2

    .line 550
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private isHexDigit()Z
    .locals 2

    .line 544
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0x30

    if-lt v0, v1, :cond_0

    const/16 v1, 0x39

    if-le v0, v1, :cond_2

    :cond_0
    const/16 v1, 0x61

    if-lt v0, v1, :cond_1

    const/16 v1, 0x66

    if-le v0, v1, :cond_2

    :cond_1
    const/16 v1, 0x41

    if-lt v0, v1, :cond_3

    const/16 v1, 0x46

    if-gt v0, v1, :cond_3

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private isWhiteSpace()Z
    .locals 2

    .line 536
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private pauseCapture()V
    .locals 5

    .line 500
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lbin/mt/json/JSONParser;->index:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lbin/mt/json/JSONParser;->index:I

    add-int/lit8 v0, v0, -0x1

    .line 501
    :goto_0
    iget-object v2, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbin/mt/json/JSONParser;->buffer:[C

    iget v4, p0, Lbin/mt/json/JSONParser;->captureStart:I

    sub-int/2addr v0, v4

    invoke-virtual {v2, v3, v4, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 502
    iput v1, p0, Lbin/mt/json/JSONParser;->captureStart:I

    return-void
.end method

.method private read()V
    .locals 7

    .line 471
    iget v0, p0, Lbin/mt/json/JSONParser;->index:I

    iget v1, p0, Lbin/mt/json/JSONParser;->fill:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    .line 472
    iget v0, p0, Lbin/mt/json/JSONParser;->captureStart:I

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-eq v0, v4, :cond_0

    .line 473
    iget-object v5, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    iget-object v6, p0, Lbin/mt/json/JSONParser;->buffer:[C

    sub-int/2addr v1, v0

    invoke-virtual {v5, v6, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 474
    iput v3, p0, Lbin/mt/json/JSONParser;->captureStart:I

    .line 476
    :cond_0
    iget v0, p0, Lbin/mt/json/JSONParser;->bufferOffset:I

    iget v1, p0, Lbin/mt/json/JSONParser;->fill:I

    add-int/2addr v0, v1

    iput v0, p0, Lbin/mt/json/JSONParser;->bufferOffset:I

    .line 477
    iget-object v0, p0, Lbin/mt/json/JSONParser;->reader:Ljava/io/Reader;

    iget-object v1, p0, Lbin/mt/json/JSONParser;->buffer:[C

    array-length v5, v1

    invoke-virtual {v0, v1, v3, v5}, Ljava/io/Reader;->read([CII)I

    move-result v0

    iput v0, p0, Lbin/mt/json/JSONParser;->fill:I

    .line 478
    iput v3, p0, Lbin/mt/json/JSONParser;->index:I

    if-ne v0, v4, :cond_1

    .line 480
    iput v4, p0, Lbin/mt/json/JSONParser;->current:I

    .line 481
    iput v2, p0, Lbin/mt/json/JSONParser;->index:I

    return-void

    .line 485
    :cond_1
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    .line 486
    iget v0, p0, Lbin/mt/json/JSONParser;->line:I

    add-int/2addr v0, v2

    iput v0, p0, Lbin/mt/json/JSONParser;->line:I

    .line 487
    iget v0, p0, Lbin/mt/json/JSONParser;->bufferOffset:I

    iget v1, p0, Lbin/mt/json/JSONParser;->index:I

    add-int/2addr v0, v1

    iput v0, p0, Lbin/mt/json/JSONParser;->lineOffset:I

    .line 489
    :cond_2
    iget-object v0, p0, Lbin/mt/json/JSONParser;->buffer:[C

    iget v1, p0, Lbin/mt/json/JSONParser;->index:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lbin/mt/json/JSONParser;->index:I

    aget-char v0, v0, v1

    iput v0, p0, Lbin/mt/json/JSONParser;->current:I

    return-void
.end method

.method private readArray()V
    .locals 2

    .line 232
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->startArray()Ljava/lang/Object;

    move-result-object v0

    .line 233
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readArray(Ljava/lang/Object;)V

    .line 234
    iget-object v1, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v1, v0}, Lbin/mt/json/JSONHandler;->endArray(Ljava/lang/Object;)V

    return-void
.end method

.method private readArray(Ljava/lang/Object;)V
    .locals 2

    .line 238
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    .line 239
    iget v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    const/16 v1, 0x3e8

    if-gt v0, v1, :cond_2

    .line 242
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    const/16 v0, 0x5d

    .line 243
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 244
    iget v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    .line 245
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0, p1}, Lbin/mt/json/JSONHandler;->endArray(Ljava/lang/Object;)V

    return-void

    .line 249
    :cond_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    .line 250
    iget-object v1, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v1, p1}, Lbin/mt/json/JSONHandler;->startArrayValue(Ljava/lang/Object;)V

    .line 251
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readValue()V

    .line 252
    iget-object v1, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v1, p1}, Lbin/mt/json/JSONHandler;->endArrayValue(Ljava/lang/Object;)V

    .line 253
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    const/16 v1, 0x2c

    .line 254
    invoke-direct {p0, v1}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v1

    if-nez v1, :cond_0

    .line 255
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 258
    iget p1, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    return-void

    :cond_1
    const-string p1, "\',\' or \']\'"

    .line 256
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1

    :cond_2
    const-string p1, "Nesting too deep"

    .line 240
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->error(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1
.end method

.method private readChar(C)Z
    .locals 1

    .line 449
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 452
    :cond_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    const/4 p1, 0x1

    return p1
.end method

.method private readDigit()Z
    .locals 1

    .line 457
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->isDigit()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 460
    :cond_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    const/4 v0, 0x1

    return v0
.end method

.method private readEscape()V
    .locals 4

    .line 365
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    .line 366
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0x22

    if-eq v0, v1, :cond_8

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_8

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_8

    const/16 v1, 0x62

    if-eq v0, v1, :cond_7

    const/16 v1, 0x66

    if-eq v0, v1, :cond_6

    const/16 v1, 0x6e

    if-eq v0, v1, :cond_5

    const/16 v1, 0x72

    if-eq v0, v1, :cond_4

    const/16 v1, 0x74

    if-eq v0, v1, :cond_3

    const/16 v1, 0x75

    if-ne v0, v1, :cond_2

    const/4 v0, 0x4

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 390
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    .line 391
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->isHexDigit()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 394
    iget v3, p0, Lbin/mt/json/JSONParser;->current:I

    int-to-char v3, v3

    aput-char v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "hexadecimal digit"

    .line 392
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0

    .line 396
    :cond_1
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V

    const/16 v1, 0x10

    invoke-static {v2, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v0, "valid escape sequence"

    .line 399
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0

    .line 385
    :cond_3
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 382
    :cond_4
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 379
    :cond_5
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 376
    :cond_6
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 373
    :cond_7
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 370
    :cond_8
    iget-object v1, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 401
    :goto_1
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    return-void
.end method

.method private readExponent()Z
    .locals 1

    const/16 v0, 0x65

    .line 434
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x45

    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v0, 0x2b

    .line 437
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x2d

    .line 438
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    .line 440
    :cond_1
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readDigit()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 443
    :goto_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readDigit()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    const-string v0, "digit"

    .line 441
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0
.end method

.method private readFalse()V
    .locals 2

    .line 325
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->startBoolean()V

    .line 326
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    const/16 v0, 0x61

    .line 327
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    const/16 v0, 0x6c

    .line 328
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    const/16 v0, 0x73

    .line 329
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    const/16 v0, 0x65

    .line 330
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    .line 331
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONHandler;->endBoolean(Z)V

    return-void
.end method

.method private readFraction()Z
    .locals 1

    const/16 v0, 0x2e

    .line 422
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 425
    :cond_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readDigit()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 428
    :goto_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readDigit()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const-string v0, "digit"

    .line 426
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0
.end method

.method private readName()Ljava/lang/String;
    .locals 2

    .line 300
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    .line 303
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readStringInternal()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "name"

    .line 301
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0
.end method

.method private readNull()V
    .locals 1

    .line 307
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->startNull()V

    .line 308
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    const/16 v0, 0x75

    .line 309
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    const/16 v0, 0x6c

    .line 310
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    .line 311
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    .line 312
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->endNull()V

    return-void
.end method

.method private readNumber()V
    .locals 2

    .line 405
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->startNumber()V

    .line 406
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->startCapture()V

    const/16 v0, 0x2d

    .line 407
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    .line 408
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    .line 409
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readDigit()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x30

    if-eq v0, v1, :cond_0

    .line 413
    :goto_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readDigit()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 416
    :cond_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readFraction()Z

    .line 417
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readExponent()Z

    .line 418
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-direct {p0}, Lbin/mt/json/JSONParser;->endCapture()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONHandler;->endNumber(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "digit"

    .line 410
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0
.end method

.method private readObject()V
    .locals 2

    .line 262
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->startObject()Ljava/lang/Object;

    move-result-object v0

    .line 263
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readObject(Ljava/lang/Object;)V

    .line 264
    iget-object v1, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v1, v0}, Lbin/mt/json/JSONHandler;->endObject(Ljava/lang/Object;)V

    return-void
.end method

.method private readObject(Ljava/lang/Object;)V
    .locals 3

    .line 268
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    .line 269
    iget v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    const/16 v1, 0x3e8

    if-gt v0, v1, :cond_3

    .line 272
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    const/16 v0, 0x7d

    .line 273
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 274
    iget v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    .line 275
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0, p1}, Lbin/mt/json/JSONHandler;->endObject(Ljava/lang/Object;)V

    return-void

    .line 279
    :cond_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    .line 280
    iget-object v1, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v1, p1}, Lbin/mt/json/JSONHandler;->startObjectName(Ljava/lang/Object;)V

    .line 281
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readName()Ljava/lang/String;

    move-result-object v1

    .line 282
    iget-object v2, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v2, p1, v1}, Lbin/mt/json/JSONHandler;->endObjectName(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    const/16 v2, 0x3a

    .line 284
    invoke-direct {p0, v2}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 287
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    .line 288
    iget-object v2, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v2, p1, v1}, Lbin/mt/json/JSONHandler;->startObjectValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readValue()V

    .line 290
    iget-object v2, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v2, p1, v1}, Lbin/mt/json/JSONHandler;->endObjectValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    const/16 v1, 0x2c

    .line 292
    invoke-direct {p0, v1}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v1

    if-nez v1, :cond_0

    .line 293
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 296
    iget p1, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lbin/mt/json/JSONParser;->nestingLevel:I

    return-void

    :cond_1
    const-string p1, "\',\' or \'}\'"

    .line 294
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1

    :cond_2
    const-string p1, "\':\'"

    .line 285
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1

    :cond_3
    const-string p1, "Nesting too deep"

    .line 270
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->error(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1
.end method

.method private readRequiredChar(C)V
    .locals 2

    .line 335
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->readChar(C)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 336
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1
.end method

.method private readString()V
    .locals 2

    .line 341
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->startString()V

    .line 342
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readStringInternal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONHandler;->endString(Ljava/lang/String;)V

    return-void
.end method

.method private readStringInternal()Ljava/lang/String;
    .locals 2

    .line 346
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    .line 347
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->startCapture()V

    .line 348
    :goto_0
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0x22

    if-eq v0, v1, :cond_2

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_0

    .line 350
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->pauseCapture()V

    .line 351
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readEscape()V

    .line 352
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->startCapture()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x20

    if-lt v0, v1, :cond_1

    .line 356
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    goto :goto_0

    :cond_1
    const-string v0, "valid string character"

    .line 354
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0

    .line 359
    :cond_2
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->endCapture()Ljava/lang/String;

    move-result-object v0

    .line 360
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    return-object v0
.end method

.method private readTrue()V
    .locals 2

    .line 316
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    invoke-virtual {v0}, Lbin/mt/json/JSONHandler;->startBoolean()V

    .line 317
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    const/16 v0, 0x72

    .line 318
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    const/16 v0, 0x75

    .line 319
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    const/16 v0, 0x65

    .line 320
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->readRequiredChar(C)V

    .line 321
    iget-object v0, p0, Lbin/mt/json/JSONParser;->handler:Lbin/mt/json/JSONHandler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONHandler;->endBoolean(Z)V

    return-void
.end method

.method private readValue()V
    .locals 2

    .line 194
    iget v0, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v1, 0x22

    if-eq v0, v1, :cond_6

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_5

    const/16 v1, 0x5b

    if-eq v0, v1, :cond_4

    const/16 v1, 0x66

    if-eq v0, v1, :cond_3

    const/16 v1, 0x6e

    if-eq v0, v1, :cond_2

    const/16 v1, 0x74

    if-eq v0, v1, :cond_1

    const/16 v1, 0x7b

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const-string v0, "value"

    .line 227
    invoke-direct {p0, v0}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object v0

    throw v0

    .line 211
    :cond_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readObject()V

    return-void

    .line 199
    :cond_1
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readTrue()V

    return-void

    .line 196
    :cond_2
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readNull()V

    return-void

    .line 202
    :cond_3
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readFalse()V

    return-void

    .line 208
    :cond_4
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readArray()V

    return-void

    .line 224
    :cond_5
    :pswitch_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readNumber()V

    return-void

    .line 205
    :cond_6
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readString()V

    return-void

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private skipWhiteSpace()V
    .locals 1

    .line 465
    :goto_0
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->isWhiteSpace()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 466
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private startCapture()V
    .locals 1

    .line 493
    iget-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lbin/mt/json/JSONParser;->captureBuffer:Ljava/lang/StringBuilder;

    .line 496
    :cond_0
    iget v0, p0, Lbin/mt/json/JSONParser;->index:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lbin/mt/json/JSONParser;->captureStart:I

    return-void
.end method

.method private startParse(Ljava/io/Reader;I)V
    .locals 0

    if-eqz p1, :cond_1

    if-lez p2, :cond_0

    .line 173
    iput-object p1, p0, Lbin/mt/json/JSONParser;->reader:Ljava/io/Reader;

    .line 174
    new-array p1, p2, [C

    iput-object p1, p0, Lbin/mt/json/JSONParser;->buffer:[C

    const/4 p1, 0x0

    .line 175
    iput p1, p0, Lbin/mt/json/JSONParser;->bufferOffset:I

    .line 176
    iput p1, p0, Lbin/mt/json/JSONParser;->index:I

    .line 177
    iput p1, p0, Lbin/mt/json/JSONParser;->fill:I

    const/4 p2, 0x1

    .line 178
    iput p2, p0, Lbin/mt/json/JSONParser;->line:I

    .line 179
    iput p1, p0, Lbin/mt/json/JSONParser;->lineOffset:I

    .line 180
    iput p1, p0, Lbin/mt/json/JSONParser;->current:I

    const/4 p1, -0x1

    .line 181
    iput p1, p0, Lbin/mt/json/JSONParser;->captureStart:I

    .line 182
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->read()V

    .line 183
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->skipWhiteSpace()V

    return-void

    .line 171
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "buffersize is zero or negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 168
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "reader is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getLocation()Lbin/mt/json/Location;
    .locals 4

    .line 519
    iget v0, p0, Lbin/mt/json/JSONParser;->bufferOffset:I

    iget v1, p0, Lbin/mt/json/JSONParser;->index:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    .line 520
    iget v1, p0, Lbin/mt/json/JSONParser;->lineOffset:I

    sub-int v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 521
    new-instance v2, Lbin/mt/json/Location;

    iget v3, p0, Lbin/mt/json/JSONParser;->line:I

    invoke-direct {v2, v0, v3, v1}, Lbin/mt/json/Location;-><init>(III)V

    return-object v2
.end method

.method public parse(Ljava/io/Reader;)V
    .locals 1

    const/16 v0, 0x400

    .line 106
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONParser;->parse(Ljava/io/Reader;I)V

    return-void
.end method

.method public parse(Ljava/io/Reader;I)V
    .locals 0

    .line 123
    invoke-direct {p0, p1, p2}, Lbin/mt/json/JSONParser;->startParse(Ljava/io/Reader;I)V

    .line 124
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->readValue()V

    .line 125
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->endParse()V

    return-void
.end method

.method public parse(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    const/16 v0, 0x400

    .line 84
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 86
    :try_start_0
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONParser;->parse(Ljava/io/Reader;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 89
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "source is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public parseArray(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 151
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x400

    .line 152
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/16 v1, 0xa

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 154
    :try_start_0
    invoke-direct {p0, v0, p2}, Lbin/mt/json/JSONParser;->startParse(Ljava/io/Reader;I)V

    .line 155
    iget p2, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v0, 0x5b

    if-ne p2, v0, :cond_0

    .line 158
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->readArray(Ljava/lang/Object;)V

    .line 159
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->endParse()V

    return-void

    :cond_0
    const-string p1, "\'[\'"

    .line 156
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 162
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 149
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "source is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public parseObject(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 132
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x400

    .line 133
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/16 v1, 0xa

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 135
    :try_start_0
    invoke-direct {p0, v0, p2}, Lbin/mt/json/JSONParser;->startParse(Ljava/io/Reader;I)V

    .line 136
    iget p2, p0, Lbin/mt/json/JSONParser;->current:I

    const/16 v0, 0x7b

    if-ne p2, v0, :cond_0

    .line 139
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->readObject(Ljava/lang/Object;)V

    .line 140
    invoke-direct {p0}, Lbin/mt/json/JSONParser;->endParse()V

    return-void

    :cond_0
    const-string p1, "\'{\'"

    .line 137
    invoke-direct {p0, p1}, Lbin/mt/json/JSONParser;->expected(Ljava/lang/String;)Lbin/mt/json/JSONParseException;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 143
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 130
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "source is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
