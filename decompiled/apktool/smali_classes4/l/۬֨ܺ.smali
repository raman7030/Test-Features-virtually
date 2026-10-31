.class public final Ll/۬֨ܺ;
.super Ll/ܽ֨ܺ;
.source "V8GS"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "style"

    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    new-instance p0, Ll/᩵֡ܺ;

    invoke-direct {p0}, Ll/᩵֡ܺ;-><init>()V

    const/4 v0, 0x1

    .line 31
    invoke-static {p0, p1, v0}, Ll/ۗ֨ܺ;->֫(Ll/᩵ۚܺ;Ljava/lang/String;Z)V

    .line 32
    iget-object p0, p0, Ll/᩵ۚܺ;->᩻:Ll/᩷ۚܺ;

    goto :goto_0

    :cond_0
    const-string v0, "url("

    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p0}, Ll/ۗ֨ܺ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 36
    :cond_1
    new-instance v0, Ll/᩷ۚܺ;

    invoke-direct {v0}, Ll/᩷ۚܺ;-><init>()V

    .line 37
    invoke-static {v0, p0, p1}, Ll/ۗ֨ܺ;->֫(Ll/᩷ۚܺ;Ljava/lang/String;Ljava/lang/String;)V

    move-object p0, v0

    :goto_0
    if-nez p0, :cond_2

    goto :goto_1

    .line 40
    :cond_2
    iget-object p1, p0, Ll/᩷ۚܺ;->۫:Ll/֨ۚܺ;

    instance-of v0, p1, Ll/᩶֡ܺ;

    if-eqz v0, :cond_3

    check-cast p1, Ll/᩶֡ܺ;

    iget-object p1, p1, Ll/᩶֡ܺ;->᩹:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 41
    :cond_3
    iget-object p1, p0, Ll/᩷ۚܺ;->ۖ֫:Ll/֨ۚܺ;

    instance-of v0, p1, Ll/᩶֡ܺ;

    if-eqz v0, :cond_4

    check-cast p1, Ll/᩶֡ܺ;

    iget-object p1, p1, Ll/᩶֡ܺ;->᩹:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 42
    :cond_4
    iget-object p1, p0, Ll/᩷ۚܺ;->᩹:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 43
    iget-object p1, p0, Ll/᩷ۚܺ;->ܿ֫:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 44
    iget-object p1, p0, Ll/᩷ۚܺ;->ᩳ֫:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 45
    iget-object p1, p0, Ll/᩷ۚܺ;->ܽ֫:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 46
    iget-object p0, p0, Ll/᩷ۚܺ;->ۧ֫:Ljava/lang/String;

    invoke-static {p0, p2}, Ll/۬֨ܺ;->֫(Ljava/lang/String;Ljava/util/List;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 17
    invoke-static {p0}, Ll/ܽ֨ܺ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 50
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܽ֨ܺ;)Z
    .locals 4

    .line 55
    invoke-virtual {p0}, Ll/ܽ֨ܺ;->ܿ()Ll/ۢۚܺ;

    move-result-object p0

    .line 56
    iget-object v0, p0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_0

    goto :goto_1

    .line 58
    :cond_0
    iget-object p0, p0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۚܺ;

    .line 59
    instance-of v3, v2, Ll/ۙ֡ܺ;

    if-eqz v3, :cond_2

    check-cast v2, Ll/ۙ֡ܺ;

    .line 61
    iget-object v2, v2, Ll/ۙ֡ܺ;->ᩴ:Ll/ۗ֡ܺ;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll/ۗ֡ܺ;->֫()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    :cond_3
    :goto_0
    const/16 v2, 0x1f4

    if-lt v1, v2, :cond_1

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_4
    return v0
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 1

    .line 12
    invoke-static {p0}, Ll/᩹֨ܺ;->֫(Ljava/lang/String;)Ll/᩹֨ܺ;

    move-result-object p0

    sget-object v0, Ll/᩹֨ܺ;->᩶:Ll/᩹֨ܺ;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܿ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 17
    invoke-static {p0}, Ll/ܽ֨ܺ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 3

    .line 22
    new-instance v0, Ll/۟᩵ܺ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    .line 54
    invoke-virtual {v0, v2, v1, v2, p0}, Ll/۟᩵ܺ;->֫(IIILjava/lang/String;)F

    move-result p0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v2
.end method
