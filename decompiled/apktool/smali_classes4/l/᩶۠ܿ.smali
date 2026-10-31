.class public final Ll/᩶۠ܿ;
.super Ljava/lang/Object;
.source "WB05"


# direct methods
.method public static final ֫(Ljava/lang/String;)V
    .locals 2

    .line 2
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 841
    invoke-static {}, Ll/۬۠ܿ;->ۛۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ll/۬۠ܿ;->۬ۧ()Ll/ۡۤۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 842
    :cond_1
    :goto_0
    invoke-static {p0}, Ll/۬۠ܿ;->ۘ(Ljava/lang/String;)V

    .line 843
    invoke-static {}, Ll/۬۠ܿ;->ۤۧ()Ll/ۚۡ֫;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "primaryPath"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 799
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_2

    .line 800
    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Android/data"

    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Android/obb"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 809
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android/data/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 810
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android/obb/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0

    .line 815
    :cond_2
    sget-object v0, Ll/۬۠ܿ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 2

    const-string v0, "value"

    .line 6
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 761
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-static {p0}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 762
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 761
    :cond_0
    invoke-static {p0}, Ll/۬۠ܿ;->ۖ(Ljava/lang/String;)V

    return-void
.end method
