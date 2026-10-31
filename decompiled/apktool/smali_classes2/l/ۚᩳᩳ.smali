.class public final Ll/ۚᩳᩳ;
.super Ljava/lang/Object;
.source "MB8H"


# instance fields
.field public final ֫:Ll/ۨᩳᩳ;

.field public final ۧ:I

.field public final ܳ:Z

.field public final ܽ:I

.field public final ܿ:Ljava/lang/reflect/Field;

.field public final ᩳ:Ll/֫ܿᩳ;

.field public final ᩻:Ll/۟ᩳᩳ;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Ll/ۨᩳᩳ;)V
    .locals 3

    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 343
    iput-object p1, p0, Ll/ۚᩳᩳ;->ܿ:Ljava/lang/reflect/Field;

    .line 344
    iput-object p2, p0, Ll/ۚᩳᩳ;->֫:Ll/ۨᩳᩳ;

    .line 345
    invoke-interface {p2}, Ll/ۨᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۚᩳᩳ;->ᩳ:Ll/֫ܿᩳ;

    .line 347
    invoke-interface {p2}, Ll/ۨᩳᩳ;->cls()Ll/ܰᩳᩳ;

    move-result-object v0

    .line 348
    sget-object v1, Ll/ܰᩳᩳ;->᩶:Ll/ܰᩳᩳ;

    const/4 v2, -0x1

    if-ne v0, v1, :cond_1

    .line 349
    invoke-interface {p2}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 350
    sget-object v0, Ll/ܰᩳᩳ;->ۙ:Ll/ܰᩳᩳ;

    goto :goto_0

    .line 352
    :cond_0
    sget-object v0, Ll/ܰᩳᩳ;->۬:Ll/ܰᩳᩳ;

    .line 356
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/ۜܿᩳ;->֫(Ll/ܰᩳᩳ;)I

    move-result v0

    iput v0, p0, Ll/ۚᩳᩳ;->ۧ:I

    .line 359
    invoke-interface {p2}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result v0

    if-eq v0, v2, :cond_2

    .line 360
    invoke-interface {p2}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result p1

    goto :goto_2

    .line 361
    :cond_2
    sget-object v0, Ll/֫ܿᩳ;->ۗ:Ll/֫ܿᩳ;

    if-eq p1, v0, :cond_4

    sget-object v0, Ll/֫ܿᩳ;->᩹:Ll/֫ܿᩳ;

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 364
    :cond_3
    invoke-static {p1}, Ll/ۜܿᩳ;->֫(Ll/֫ܿᩳ;)I

    move-result p1

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, -0x1

    .line 366
    :goto_2
    iput p1, p0, Ll/ۚᩳᩳ;->ܽ:I

    .line 368
    invoke-interface {p2}, Ll/ۨᩳᩳ;->tagging()Ll/۟ᩳᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۚᩳᩳ;->᩻:Ll/۟ᩳᩳ;

    .line 369
    sget-object v0, Ll/۟ᩳᩳ;->᩹:Ll/۟ᩳᩳ;

    if-eq p1, v0, :cond_5

    sget-object v0, Ll/۟ᩳᩳ;->᩶:Ll/۟ᩳᩳ;

    if-ne p1, v0, :cond_6

    .line 370
    :cond_5
    invoke-interface {p2}, Ll/ۨᩳᩳ;->tagNumber()I

    move-result v0

    if-eq v0, v2, :cond_7

    .line 375
    :cond_6
    invoke-interface {p2}, Ll/ۨᩳᩳ;->optional()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۚᩳᩳ;->ܳ:Z

    return-void

    .line 371
    :cond_7
    new-instance p2, Ll/᩹ᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Tag number must be specified when tagging mode is "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 371
    throw p2
.end method


# virtual methods
.method public final ֫()Ll/ۨᩳᩳ;
    .locals 1

    .line 383
    iget-object v0, p0, Ll/ۚᩳᩳ;->֫:Ll/ۨᩳᩳ;

    return-object v0
.end method

.method public final ֫(Ll/ܿܿᩳ;Ljava/lang/Object;)V
    .locals 6

    .line 399
    invoke-virtual {p1}, Ll/ܿܿᩳ;->ᩳ()I

    move-result v0

    const/4 v1, -0x1

    const-string v2, ", but found "

    .line 400
    iget v3, p0, Ll/ۚᩳᩳ;->ۧ:I

    iget v4, p0, Ll/ۚᩳᩳ;->ܽ:I

    if-eq v4, v1, :cond_1

    .line 401
    invoke-virtual {p1}, Ll/ܿܿᩳ;->ܿ()I

    move-result v1

    if-ne v0, v3, :cond_0

    if-ne v1, v4, :cond_0

    goto :goto_0

    .line 403
    :cond_0
    new-instance p1, Ll/֨ᩳᩳ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v5, "Tag mismatch. Expected: "

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    invoke-static {v3, v4}, Ll/ۜܿᩳ;->֫(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    invoke-static {v0, v1}, Ll/ۜܿᩳ;->֫(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 26
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 407
    throw p1

    :cond_1
    if-ne v0, v3, :cond_6

    .line 419
    :goto_0
    iget-object v0, p0, Ll/ۚᩳᩳ;->᩻:Ll/۟ᩳᩳ;

    sget-object v1, Ll/۟ᩳᩳ;->᩹:Ll/۟ᩳᩳ;

    if-ne v0, v1, :cond_2

    .line 421
    :try_start_0
    invoke-virtual {p1}, Ll/ܿܿᩳ;->֫()Ll/᩷ܿᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷ܿᩳ;->֫()Ll/ܿܿᩳ;

    move-result-object p1
    :try_end_0
    .catch Ll/ܳܿᩳ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 423
    new-instance p2, Ll/᩹ᩳᩳ;

    const-string v0, "Failed to read contents of EXPLICIT data value"

    .line 30
    invoke-direct {p2, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 423
    throw p2

    .line 428
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/ۚᩳᩳ;->ܿ:Ljava/lang/reflect/Field;

    iget-object v1, p0, Ll/ۚᩳᩳ;->֫:Ll/ۨᩳᩳ;

    iget-object v2, p0, Ll/ۚᩳᩳ;->ᩳ:Ll/֫ܿᩳ;

    .line 547
    :try_start_1
    sget-object v3, Ll/֡ᩳᩳ;->֫:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x4

    if-eq v3, v4, :cond_3

    const/4 v4, 0x5

    if-eq v3, v4, :cond_3

    .line 560
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v2, p1, v1}, Ll/۠ᩳᩳ;->֫(Ll/֫ܿᩳ;Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 550
    :cond_3
    const-class v3, Ll/᩺ᩳᩳ;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 551
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v2, p1, v1}, Ll/۠ᩳᩳ;->֫(Ll/֫ܿᩳ;Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 553
    :cond_4
    invoke-interface {v1}, Ll/ۨᩳᩳ;->listElementType()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/lang/Object;

    if-eq v2, v3, :cond_5

    .line 556
    invoke-interface {v1}, Ll/ۨᩳᩳ;->listElementType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܶᩳᩳ;->ܽ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 554
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    move-exception p1

    .line 564
    new-instance v1, Ll/᩹ᩳᩳ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to set value of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 565
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 30
    invoke-direct {v1, p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 566
    throw v1

    .line 411
    :cond_6
    new-instance p1, Ll/֨ᩳᩳ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Tag mismatch. Expected class: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 413
    invoke-static {v3}, Ll/ۜܿᩳ;->֫(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    invoke-static {v0}, Ll/ۜܿᩳ;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 26
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 415
    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 391
    iget v0, p0, Ll/ۚᩳᩳ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 395
    iget v0, p0, Ll/ۚᩳᩳ;->ܽ:I

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 387
    iget-boolean v0, p0, Ll/ۚᩳᩳ;->ܳ:Z

    return v0
.end method

.method public final ᩳ()Ljava/lang/reflect/Field;
    .locals 1

    .line 379
    iget-object v0, p0, Ll/ۚᩳᩳ;->ܿ:Ljava/lang/reflect/Field;

    return-object v0
.end method
