.class public final Ll/᩷᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/util/regex/Pattern;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 296
    iget-object v0, p0, Ll/᩷᩸ۚ;->֫:Ljava/lang/String;

    iget-object v1, p0, Ll/᩷᩸ۚ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "~="

    const-string v3, "]"

    const-string v4, "["

    .line 0
    invoke-static {v4, v0, v2, v1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    .line 291
    iget-object p1, p0, Ll/᩷᩸ۚ;->֫:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ll/ۨ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷᩸ۚ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {p2, p1}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
