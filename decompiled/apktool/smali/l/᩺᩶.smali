.class public final Ll/᩺᩶;
.super Ljava/lang/Object;
.source "374"


# direct methods
.method public static ֫(Ll/ܰ᩶;)Landroid/app/Person;
    .locals 3

    .line 425
    new-instance v0, Landroid/app/Person$Builder;

    invoke-direct {v0}, Landroid/app/Person$Builder;-><init>()V

    .line 161
    iget-object v1, p0, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    .line 426
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setName(Ljava/lang/CharSequence;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 167
    iget-object v1, p0, Ll/ܰ᩶;->֫:Ll/ۙ۬;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 517
    invoke-virtual {v1, v2}, Ll/ۙ۬;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    .line 427
    :cond_0
    invoke-virtual {v0, v2}, Landroid/app/Person$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 185
    iget-object v1, p0, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    .line 428
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setUri(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 194
    iget-object v1, p0, Ll/ܰ᩶;->ᩳ:Ljava/lang/String;

    .line 429
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setKey(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 202
    iget-boolean v1, p0, Ll/ܰ᩶;->ۧ:Z

    .line 430
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setBot(Z)Landroid/app/Person$Builder;

    move-result-object v0

    .line 210
    iget-boolean p0, p0, Ll/ܰ᩶;->ܽ:Z

    .line 431
    invoke-virtual {v0, p0}, Landroid/app/Person$Builder;->setImportant(Z)Landroid/app/Person$Builder;

    move-result-object p0

    .line 432
    invoke-virtual {p0}, Landroid/app/Person$Builder;->build()Landroid/app/Person;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/app/Person;)Ll/ܰ᩶;
    .locals 6

    .line 410
    invoke-virtual {p0}, Landroid/app/Person;->getName()Ljava/lang/CharSequence;

    move-result-object v0

    .line 412
    invoke-virtual {p0}, Landroid/app/Person;->getIcon()Landroid/graphics/drawable/Icon;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 413
    invoke-virtual {p0}, Landroid/app/Person;->getIcon()Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ۬;->֫(Landroid/graphics/drawable/Icon;)Ll/ۙ۬;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 415
    :goto_0
    invoke-virtual {p0}, Landroid/app/Person;->getUri()Ljava/lang/String;

    move-result-object v2

    .line 416
    invoke-virtual {p0}, Landroid/app/Person;->getKey()Ljava/lang/String;

    move-result-object v3

    .line 417
    invoke-virtual {p0}, Landroid/app/Person;->isBot()Z

    move-result v4

    .line 418
    invoke-virtual {p0}, Landroid/app/Person;->isImportant()Z

    move-result p0

    .line 368
    new-instance v5, Ll/ܰ᩶;

    .line 100
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object v0, v5, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    .line 102
    iput-object v1, v5, Ll/ܰ᩶;->֫:Ll/ۙ۬;

    .line 103
    iput-object v2, v5, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    .line 104
    iput-object v3, v5, Ll/ܰ᩶;->ᩳ:Ljava/lang/String;

    .line 105
    iput-boolean v4, v5, Ll/ܰ᩶;->ۧ:Z

    .line 106
    iput-boolean p0, v5, Ll/ܰ᩶;->ܽ:Z

    return-object v5
.end method
