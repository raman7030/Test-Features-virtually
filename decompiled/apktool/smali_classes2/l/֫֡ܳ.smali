.class public final Ll/֫֡ܳ;
.super Ll/۬ᩴܺ;
.source "473S"


# instance fields
.field public final ֫:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 922
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫֡ܳ;->֫:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 922
    instance-of v0, p1, Ll/֫֡ܳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫֡ܳ;

    iget-object v0, p0, Ll/֫֡ܳ;->֫:Ljava/util/Map;

    iget-object p1, p1, Ll/֫֡ܳ;->֫:Ljava/util/Map;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 922
    iget-object v0, p0, Ll/֫֡ܳ;->֫:Ljava/util/Map;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 922
    iget-object v3, p0, Ll/֫֡ܳ;->֫:Ljava/util/Map;

    aput-object v3, v1, v2

    const-string v3, "files"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v3, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/֫֡ܳ;

    invoke-static {v6, v4, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 922
    :goto_1
    array-length v5, v3

    if-ge v2, v5, :cond_2

    aget-object v5, v3, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v3

    sub-int/2addr v5, v0

    if-eq v2, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܰܺܳ;)Z
    .locals 12

    .line 926
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Ll/֫֡ܳ;->֫:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 927
    instance-of v1, p1, Ll/ۖۛܳ;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Ll/ۖۛܳ;

    .line 929
    invoke-virtual {v1}, Ll/ۖۛܳ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡۛܳ;

    .line 930
    invoke-virtual {v2}, Ll/ۡۛܳ;->ܽ()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 933
    :cond_0
    invoke-virtual {v2}, Ll/ۡۛܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 934
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    new-instance v11, Ll/۫᩵ܳ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    .line 935
    invoke-virtual {v2}, Ll/ۡۛܳ;->length()J

    move-result-wide v7

    invoke-virtual {v2}, Ll/ۡۛܳ;->ۚ()J

    move-result-wide v9

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Ll/۫᩵ܳ;-><init>(Ljava/lang/String;JJ)V

    .line 934
    invoke-static {v0, v4, v11}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 939
    :cond_1
    invoke-static {p1}, Ll/ܿ֡ܳ;->֫(Ll/ܰܺܳ;)Ljava/util/LinkedHashMap;

    move-result-object p1

    .line 940
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 943
    :cond_2
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 944
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫᩵ܳ;

    invoke-static {v1}, Ll/ܿ֡ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܳ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/۫᩵ܳ;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_3

    goto :goto_1

    :cond_4
    const/4 p1, 0x1

    return p1

    :catch_0
    :goto_1
    const/4 p1, 0x0

    return p1
.end method
