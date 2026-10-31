.class public final Ll/ۗᩳᩳ;
.super Ljava/lang/Object;
.source "8B7K"


# instance fields
.field public final ֫:Ll/ۨᩳᩳ;

.field public final ۜ:Z

.field public final ۧ:Ll/֫ܿᩳ;

.field public final ܳ:Ljava/lang/reflect/Field;

.field public final ܽ:I

.field public final ܿ:Ll/֫ܿᩳ;

.field public final ᩳ:I

.field public final ᩷:Ll/۟ᩳᩳ;

.field public final ᩻:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Field;Ll/ۨᩳᩳ;)V
    .locals 3

    .line 357
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    iput-object p1, p0, Ll/ۗᩳᩳ;->᩻:Ljava/lang/Object;

    .line 359
    iput-object p2, p0, Ll/ۗᩳᩳ;->ܳ:Ljava/lang/reflect/Field;

    .line 360
    iput-object p3, p0, Ll/ۗᩳᩳ;->֫:Ll/ۨᩳᩳ;

    .line 361
    invoke-interface {p3}, Ll/ۨᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗᩳᩳ;->ۧ:Ll/֫ܿᩳ;

    .line 362
    invoke-interface {p3}, Ll/ۨᩳᩳ;->elementType()Ll/֫ܿᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/ۗᩳᩳ;->ܿ:Ll/֫ܿᩳ;

    .line 364
    invoke-interface {p3}, Ll/ۨᩳᩳ;->cls()Ll/ܰᩳᩳ;

    move-result-object p2

    .line 365
    sget-object v0, Ll/ܰᩳᩳ;->᩶:Ll/ܰᩳᩳ;

    const/4 v1, -0x1

    if-ne p2, v0, :cond_1

    .line 366
    invoke-interface {p3}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result p2

    if-eq p2, v1, :cond_0

    .line 367
    sget-object p2, Ll/ܰᩳᩳ;->ۙ:Ll/ܰᩳᩳ;

    goto :goto_0

    .line 369
    :cond_0
    sget-object p2, Ll/ܰᩳᩳ;->۬:Ll/ܰᩳᩳ;

    .line 128
    :cond_1
    :goto_0
    sget-object v0, Ll/ۧܿᩳ;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_3

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    .line 138
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported tag class: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 373
    :cond_3
    :goto_1
    iput v2, p0, Ll/ۗᩳᩳ;->ܽ:I

    .line 376
    invoke-interface {p3}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result p2

    if-eq p2, v1, :cond_4

    .line 377
    invoke-interface {p3}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result p1

    goto :goto_3

    .line 378
    :cond_4
    sget-object p2, Ll/֫ܿᩳ;->ۗ:Ll/֫ܿᩳ;

    if-eq p1, p2, :cond_6

    sget-object p2, Ll/֫ܿᩳ;->᩹:Ll/֫ܿᩳ;

    if-ne p1, p2, :cond_5

    goto :goto_2

    .line 381
    :cond_5
    invoke-static {p1}, Ll/ܽܿᩳ;->֫(Ll/֫ܿᩳ;)I

    move-result p1

    goto :goto_3

    :cond_6
    :goto_2
    const/4 p1, -0x1

    .line 383
    :goto_3
    iput p1, p0, Ll/ۗᩳᩳ;->ᩳ:I

    .line 385
    invoke-interface {p3}, Ll/ۨᩳᩳ;->tagging()Ll/۟ᩳᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗᩳᩳ;->᩷:Ll/۟ᩳᩳ;

    .line 386
    sget-object p2, Ll/۟ᩳᩳ;->᩹:Ll/۟ᩳᩳ;

    if-eq p1, p2, :cond_7

    sget-object p2, Ll/۟ᩳᩳ;->᩶:Ll/۟ᩳᩳ;

    if-ne p1, p2, :cond_8

    .line 387
    :cond_7
    invoke-interface {p3}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result p2

    if-eq p2, v1, :cond_9

    .line 392
    :cond_8
    invoke-interface {p3}, Ll/ۨᩳᩳ;->optional()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۗᩳᩳ;->ۜ:Z

    return-void

    .line 388
    :cond_9
    new-instance p2, Ll/ۛᩳᩳ;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Tag number must be specified when tagging mode is "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 388
    throw p2
.end method


# virtual methods
.method public final ֫()Ll/ۨᩳᩳ;
    .locals 1

    .line 400
    iget-object v0, p0, Ll/ۗᩳᩳ;->֫:Ll/ۨᩳᩳ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/reflect/Field;
    .locals 1

    .line 396
    iget-object v0, p0, Ll/ۗᩳᩳ;->ܳ:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final ܽ()[B
    .locals 8

    .line 404
    iget-object v0, p0, Ll/ۗᩳᩳ;->᩻:Ljava/lang/Object;

    iget-object v1, p0, Ll/ۗᩳᩳ;->ܳ:Ljava/lang/reflect/Field;

    invoke-static {v1, v0}, Ll/ۤᩳᩳ;->֫(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 406
    iget-boolean v0, p0, Ll/ۗᩳᩳ;->ۜ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 409
    :cond_0
    new-instance v0, Ll/ۛᩳᩳ;

    const-string v1, "Required field not set"

    .line 26
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 409
    throw v0

    .line 412
    :cond_1
    iget-object v1, p0, Ll/ۗᩳᩳ;->ۧ:Ll/֫ܿᩳ;

    iget-object v2, p0, Ll/ۗᩳᩳ;->ܿ:Ll/֫ܿᩳ;

    invoke-static {v0, v1, v2}, Ll/۫ᩳᩳ;->֫(Ljava/lang/Object;Ll/֫ܿᩳ;Ll/֫ܿᩳ;)[B

    move-result-object v0

    .line 413
    sget-object v1, Ll/ۙᩳᩳ;->֫:[I

    iget-object v2, p0, Ll/ۗᩳᩳ;->᩷:Ll/۟ᩳᩳ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    const/4 v3, 0x1

    if-eq v1, v3, :cond_6

    const/4 v4, 0x2

    iget v5, p0, Ll/ۗᩳᩳ;->ܽ:I

    iget v6, p0, Ll/ۗᩳᩳ;->ᩳ:I

    const/4 v7, 0x0

    if-eq v1, v4, :cond_5

    const/4 v3, 0x3

    if-ne v1, v3, :cond_4

    .line 419
    aget-byte v1, v0, v7

    and-int/lit8 v2, v1, 0x1f

    const/16 v3, 0x1f

    if-eq v2, v3, :cond_3

    if-ge v6, v3, :cond_2

    and-int/lit8 v1, v1, -0x20

    or-int/2addr v1, v6

    int-to-byte v1, v1

    .line 427
    aput-byte v1, v0, v7

    and-int/lit8 v1, v1, 0x3f

    shl-int/lit8 v2, v5, 0x6

    or-int/2addr v1, v2

    int-to-byte v1, v1

    .line 428
    aput-byte v1, v0, v7

    return-object v0

    .line 424
    :cond_2
    new-instance v0, Ll/ۛᩳᩳ;

    const-string v1, "Unsupported high tag number: "

    .line 0
    invoke-static {v6, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 424
    throw v0

    .line 421
    :cond_3
    new-instance v0, Ll/ۛᩳᩳ;

    const-string v1, "High-tag-number form not supported"

    .line 26
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 421
    throw v0

    .line 431
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unknown tagging mode: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-array v1, v3, [[B

    aput-object v0, v1, v7

    .line 417
    invoke-static {v5, v3, v6, v1}, Ll/ۤᩳᩳ;->֫(IZI[[B)[B

    move-result-object v0

    :cond_6
    return-object v0
.end method
