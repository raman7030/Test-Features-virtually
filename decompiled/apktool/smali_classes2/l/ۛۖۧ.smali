.class public final Ll/ۛۖۧ;
.super Ljava/lang/Object;
.source "27TW"


# direct methods
.method public static ֫(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 4

    .line 86
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۘۧ;

    .line 87
    iget-object v2, v2, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    iget-object v2, v2, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    iget-object v2, v2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 89
    invoke-static {v2}, Ll/ۢ᩵֫;->ۢ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string p0, "video/mp4"

    return-object p0

    .line 93
    :cond_1
    invoke-static {v2}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    .line 95
    :cond_2
    invoke-static {v2}, Ll/ۢ᩵֫;->ۜ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "image/heic"

    .line 96
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v1, "image/heif"

    goto :goto_0

    :cond_3
    const-string v3, "image/avif"

    .line 98
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    const-string p0, "audio/mp4"

    return-object p0

    :cond_5
    if-eqz v1, :cond_6

    return-object v1

    :cond_6
    const-string p0, "application/mp4"

    return-object p0
.end method
