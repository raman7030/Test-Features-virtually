.class public final Ll/ܽ᩵֡;
.super Ll/ۛ֡֡;
.source "O6MN"


# virtual methods
.method public final ֫(Ll/᩵ۚ֡;)V
    .locals 5

    .line 25
    invoke-virtual {p1}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object v0

    .line 26
    instance-of v1, v0, Ll/᩸ۚ֡;

    if-eqz v1, :cond_2

    .line 27
    invoke-virtual {v0}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object v0

    .line 28
    instance-of v1, v0, Ll/۬ۚ֡;

    if-eqz v1, :cond_2

    .line 29
    check-cast v0, Ll/۬ۚ֡;

    .line 30
    invoke-static {}, Ll/ᩳ᩵֡;->֫()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v0}, Ll/۬ۚ֡;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "X"

    .line 34
    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "x"

    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 37
    :cond_1
    :goto_0
    new-instance v3, Ll/ܰᩴ֡;

    invoke-direct {v3, v2}, Ll/ܰᩴ֡;-><init>(Z)V

    invoke-virtual {p1, v3}, Ll/֡ۚ֡;->֫(Ll/ܰᩴ֡;)V

    const/4 v2, 0x2

    .line 43
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۬ۚ֡;->֫(Ljava/lang/String;)V

    .line 47
    :cond_2
    invoke-virtual {p0, p1}, Ll/ۛ֡֡;->ۧ(Ll/֡ۚ֡;)V

    return-void
.end method
