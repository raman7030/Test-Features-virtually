.class public final Ll/֫ᩴܳ;
.super Ljava/lang/Object;
.source "OAYY"


# direct methods
.method public static ֫(Ll/۬ۜܽ;)Ll/ܽᩴܳ;
    .locals 8

    .line 915
    new-instance v0, Ll/ܽᩴܳ;

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ܽᩴܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 916
    invoke-virtual {p0}, Ll/۬ۜܽ;->getPosition()J

    move-result-wide v1

    .line 917
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    const-wide/16 v5, 0xa

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Ll/۬ۜܽ;->ۧ(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 918
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v4

    const-string v5, "["

    .line 449
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "]"

    .line 486
    invoke-static {v4, v5, v3}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 920
    new-instance p0, Ll/ܿᩴܳ;

    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1, v4}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Ll/ܿᩴܳ;-><init>(Lbin/mt/json/JSONArray;)V

    invoke-virtual {v0, p0}, Ll/ܽᩴܳ;->֫(Ll/ܿᩴܳ;)V

    return-object v0

    .line 922
    :cond_0
    invoke-virtual {p0, v1, v2}, Ll/۬ۜܽ;->seek(J)V

    :cond_1
    return-object v0
.end method
