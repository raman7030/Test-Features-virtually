.class public abstract Ll/֫۠۠;
.super Ll/ۢ۠۠;
.source "G3L1"

# interfaces
.implements Ll/ۖ۠۠;


# instance fields
.field public ᩹:Ljava/util/EnumMap;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 205
    instance-of v0, p1, Ll/֫۠۠;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫۠۠;

    iget-object v0, p0, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܳ֡֨;

    iget-object p1, p1, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

    .line 210
    iget-object v0, p0, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܳ֡֨;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 239
    iget-object v0, p0, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܳ֡֨;

    .line 1370
    iget-object v0, v0, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    .line 239
    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۡ۠۠;)Ljava/util/Collection;
    .locals 1

    .line 220
    iget-object v0, p0, Ll/֫۠۠;->᩹:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public ֫()Ljava/util/Properties;
    .locals 4

    .line 225
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 226
    invoke-virtual {p0}, Ll/֫۠۠;->toString()Ljava/lang/String;

    move-result-object v1

    .line 259
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\n"

    const-string v3, ""

    .line 260
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "label"

    .line 226
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫(Ll/ۖ۠۠;Ll/ۡ۠۠;)Ljava/util/Properties;
    .locals 1

    .line 181
    check-cast p1, Ll/֫۠۠;

    .line 232
    new-instance p1, Ljava/util/Properties;

    invoke-direct {p1}, Ljava/util/Properties;-><init>()V

    const-string v0, "label"

    .line 233
    invoke-virtual {p1, v0, p2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final ۧ()[Ll/ۡ۠۠;
    .locals 1

    .line 215
    invoke-static {}, Ll/۫֨۠;->values()[Ll/۫֨۠;

    move-result-object v0

    return-object v0
.end method
