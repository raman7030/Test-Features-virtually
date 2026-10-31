.class public final Ll/᩷᩵ۢ;
.super Ljava/lang/Object;
.source "87BW"


# direct methods
.method public static ֫(Ll/ᩳۜܳ;)Ljava/util/HashMap;
    .locals 5

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "name"

    .line 26
    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isFile"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    invoke-interface {p0}, Ll/ᩳۜܳ;->۬()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isLink"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    invoke-interface {p0}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ᩴ᩵ۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "recyclable"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    invoke-interface {p0}, Ll/ᩳۜܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "linkPath"

    .line 33
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    :cond_0
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v1

    const-string v2, "size"

    if-eqz v1, :cond_1

    .line 36
    invoke-interface {p0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :goto_0
    sget v1, Ll/ۜ᩵ۢ;->֫:I

    .line 72
    invoke-interface {p0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ll/ᩳۜܳ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const-string v2, "path"

    .line 40
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "mime"

    .line 41
    invoke-interface {p0}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    invoke-interface {p0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "time"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    invoke-interface {p0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 56
    sget-object v1, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    iget-object v1, v1, Ll/᩶ۖܳ;->ܿ:Ljava/lang/String;

    goto :goto_2

    .line 58
    :cond_3
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۤۧ()Ll/ۖ֨ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object v1

    iget-object v1, v1, Ll/᩶ۖܳ;->ܿ:Ljava/lang/String;

    :goto_2
    const-string v2, "typeIcon"

    .line 43
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-static {p0}, Ll/ۜ᩵ۢ;->֫(Ll/ᩳۜܳ;)Ll/ܳ᩵ۢ;

    move-result-object p0

    if-eqz p0, :cond_4

    const-string v1, "dynamicIconHint"

    .line 46
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v0
.end method
