.class public final Ll/ܺ᩺ܽ;
.super Ljava/lang/Object;
.source "I16G"


# static fields
.field public static ֫:Z = true


# direct methods
.method public static ֫()Ll/ܶ᩵ܿ;
    .locals 2

    .line 18
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "injectionSchemes"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 2

    .line 71
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".json"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 57
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".json"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const/4 p1, 0x0

    .line 516
    invoke-virtual {v1, p0, p1, p1}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V

    return-void
.end method

.method public static ֫(Ll/ۡ᩺ܽ;)V
    .locals 3

    .line 88
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ۡ᩺ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".json"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 89
    invoke-virtual {p0}, Ll/ۡ᩺ܽ;->ܽ()Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ()Ljava/util/ArrayList;
    .locals 7

    .line 22
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 417
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܰ֫()Ljava/util/List;

    move-result-object v1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, ".json"

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 27
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x5

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :cond_1
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 31
    sget-boolean v1, Ll/ܺ᩺ܽ;->֫:Z

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x7f1208e9

    .line 32
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "{\"a\":[{\"b\":{\"a\":\"\",\"b\":0,\"c\":1,\"d\":\"\",\"e\":0,\"f\":1,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"Ljava\\/lang\\/String;\",\"k\":0,\"l\":0,\"m\":0,\"n\":0,\"o\":1},\"c\":0,\"d\":0},{\"b\":{\"a\":\"Ljava\\/lang\\/String;\",\"b\":0,\"c\":0,\"d\":\"<init>\",\"e\":0,\"f\":0,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"V\",\"k\":0,\"l\":0,\"m\":0,\"n\":1,\"o\":0},\"c\":1,\"d\":1}]}"

    .line 35
    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    :catch_0
    :cond_2
    sput-boolean v4, Ll/ܺ᩺ܽ;->֫:Z

    return-object v2
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 2

    .line 76
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".json"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 46
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".json"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 47
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, ".tmp"

    .line 899
    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 52
    :cond_1
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ۡ᩺ܽ;
    .locals 3

    .line 81
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".json"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 82
    new-instance v1, Ll/ۡ᩺ܽ;

    invoke-direct {v1, p0}, Ll/ۡ᩺ܽ;-><init>(Ljava/lang/String;)V

    .line 83
    new-instance p0, Lorg/json/JSONObject;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ll/ۡ᩺ܽ;->֫(Lorg/json/JSONObject;)V

    return-object v1
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 64
    invoke-static {}, Ll/ܺ᩺ܽ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, ".json"

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const/4 v0, 0x1

    .line 1147
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x5

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
