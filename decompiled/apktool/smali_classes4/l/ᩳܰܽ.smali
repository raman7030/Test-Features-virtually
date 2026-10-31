.class public final Ll/ᩳܰܽ;
.super Ljava/lang/Object;
.source "592R"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/util/regex/Matcher;

.field public ܽ:Z

.field public ᩳ:Ljava/lang/String;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 71
    iget-boolean v0, p0, Ll/ᩳܰܽ;->֫:Z

    if-eqz v0, :cond_0

    const-string v0, "*"

    return-object v0

    .line 73
    :cond_0
    iget-boolean v0, p0, Ll/ᩳܰܽ;->ܽ:Z

    if-eqz v0, :cond_1

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 76
    :cond_1
    iget-object v0, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ᩳܰܽ;)V
    .locals 1

    .line 20
    iget-object v0, p1, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    iput-object v0, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    .line 21
    iget-boolean v0, p1, Ll/ᩳܰܽ;->֫:Z

    iput-boolean v0, p0, Ll/ᩳܰܽ;->֫:Z

    .line 22
    iget-boolean p1, p1, Ll/ᩳܰܽ;->ܽ:Z

    iput-boolean p1, p0, Ll/ᩳܰܽ;->ܽ:Z

    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    return-void
.end method

.method public final ֫(Lorg/json/JSONObject;C)V
    .locals 3

    add-int/lit8 v0, p2, 0x1

    int-to-char v0, v0

    .line 51
    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p2

    add-int/lit8 v1, v0, 0x1

    int-to-char v1, v1

    .line 52
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    .line 53
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    .line 54
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    instance-of v2, p2, Ljava/lang/String;

    if-eqz v2, :cond_0

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-object p2, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    .line 55
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    iput-boolean p2, p0, Ll/ᩳܰܽ;->ܽ:Z

    .line 56
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    iput-boolean v0, p0, Ll/ᩳܰܽ;->֫:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Ll/ᩳܰܽ;->֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Ll/ᩳܰܽ;->֫:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 36
    :cond_0
    iget-boolean v0, p0, Ll/ᩳܰܽ;->ܽ:Z

    if-eqz v0, :cond_1

    .line 37
    iget-object v0, p0, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1

    .line 39
    :cond_1
    iget-object v0, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 2

    .line 27
    iget-boolean v0, p0, Ll/ᩳܰܽ;->֫:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ᩳܰܽ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 28
    iget-object v0, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    :cond_0
    return-void
.end method

.method public final ۧ(Lorg/json/JSONObject;C)V
    .locals 3

    add-int/lit8 v0, p2, 0x1

    int-to-char v0, v0

    .line 60
    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p2

    add-int/lit8 v1, v0, 0x1

    int-to-char v1, v1

    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    .line 63
    iget-object v2, p0, Ll/ᩳܰܽ;->ᩳ:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p1, p2, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    iget-boolean p2, p0, Ll/ᩳܰܽ;->ܽ:Z

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 65
    iget-boolean p2, p0, Ll/ᩳܰܽ;->֫:Z

    invoke-virtual {p1, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return-void
.end method
