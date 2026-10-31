.class public final Ll/ۨ᩶;
.super Ljava/lang/Object;
.source "374"


# direct methods
.method public static ֫(Ll/ܰ᩶;)Landroid/os/PersistableBundle;
    .locals 3

    .line 391
    new-instance v0, Landroid/os/PersistableBundle;

    invoke-direct {v0}, Landroid/os/PersistableBundle;-><init>()V

    .line 392
    iget-object v1, p0, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "uri"

    .line 393
    iget-object v2, p0, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "key"

    .line 394
    iget-object v2, p0, Ll/ܰ᩶;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "isBot"

    .line 395
    iget-boolean v2, p0, Ll/ܰ᩶;->ۧ:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/PersistableBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "isImportant"

    .line 396
    iget-boolean p0, p0, Ll/ܰ᩶;->ܽ:Z

    invoke-virtual {v0, v1, p0}, Landroid/os/PersistableBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static ֫(Landroid/os/PersistableBundle;)Ll/ܰ᩶;
    .locals 5

    const-string v0, "name"

    .line 381
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "uri"

    .line 382
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key"

    .line 383
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "isBot"

    .line 384
    invoke-virtual {p0, v3}, Landroid/os/PersistableBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "isImportant"

    .line 385
    invoke-virtual {p0, v4}, Landroid/os/PersistableBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    .line 368
    new-instance v4, Ll/ܰ᩶;

    .line 100
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object v0, v4, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    .line 102
    iput-object v0, v4, Ll/ܰ᩶;->֫:Ll/ۙ۬;

    .line 103
    iput-object v1, v4, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    .line 104
    iput-object v2, v4, Ll/ܰ᩶;->ᩳ:Ljava/lang/String;

    .line 105
    iput-boolean v3, v4, Ll/ܰ᩶;->ۧ:Z

    .line 106
    iput-boolean p0, v4, Ll/ܰ᩶;->ܽ:Z

    return-object v4
.end method
