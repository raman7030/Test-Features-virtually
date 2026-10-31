.class public final Ll/᩻ܳۡ;
.super Ll/֫ܳۡ;
.source "TBJG"


# instance fields
.field public ܽ:Z

.field public ᩳ:Z


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 337
    iput-boolean v0, p0, Ll/᩻ܳۡ;->ܽ:Z

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 6

    .line 363
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    :goto_0
    iget-boolean v1, p0, Ll/᩻ܳۡ;->ܽ:Z

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 367
    iget-object v1, p0, Ll/֫ܳۡ;->֫:Ljava/io/StringReader;

    invoke-virtual {v1, v2}, Ljava/io/Reader;->mark(I)V

    .line 368
    iget-object v1, p0, Ll/֫ܳۡ;->֫:Ljava/io/StringReader;

    invoke-virtual {v1}, Ljava/io/Reader;->read()I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    int-to-char v1, v1

    const/16 v3, 0x3c

    if-ne v1, v3, :cond_1

    .line 374
    iget-object v1, p0, Ll/֫ܳۡ;->֫:Ljava/io/StringReader;

    invoke-virtual {v1}, Ljava/io/Reader;->reset()V

    .line 375
    iput-boolean v2, p0, Ll/᩻ܳۡ;->ܽ:Z

    goto :goto_0

    .line 377
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 383
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v3, 0x0

    if-ge v1, v2, :cond_3

    .line 384
    iput-boolean v3, p0, Ll/᩻ܳۡ;->ᩳ:Z

    goto :goto_3

    .line 386
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_7

    .line 387
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 388
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    .line 389
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_6

    .line 390
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xa

    if-eq v4, v5, :cond_4

    const/16 v5, 0xd

    if-ne v4, v5, :cond_5

    .line 392
    :cond_4
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 395
    :cond_6
    iput-boolean v3, p0, Ll/᩻ܳۡ;->ᩳ:Z

    move-object v0, v1

    goto :goto_3

    .line 398
    :cond_7
    iput-boolean v2, p0, Ll/᩻ܳۡ;->ᩳ:Z

    .line 400
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 357
    iget-boolean v0, p0, Ll/᩻ܳۡ;->ᩳ:Z

    return v0
.end method
