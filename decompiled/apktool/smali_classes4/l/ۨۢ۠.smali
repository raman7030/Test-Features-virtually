.class public abstract Ll/ۨۢ۠;
.super Ll/֫ۡ۠;
.source "G7LX"


# direct methods
.method public static ֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 7

    .line 264
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 270
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 271
    invoke-virtual {p0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚۚ۠;

    .line 272
    iget-object v4, v3, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v4}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v4

    sget-object v5, Ll/ۢ۠֨;->ᩳ֫:Ll/ۢ۠֨;

    if-eq v4, v5, :cond_1

    iget-object v4, v3, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v4}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v4

    sget-object v5, Ll/ۢ۠֨;->ܰ:Ll/ۢ۠֨;

    if-ne v4, v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x2

    :goto_2
    add-int v5, v2, v4

    const/16 v6, 0xc8

    if-lt v5, v6, :cond_2

    .line 274
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v2

    .line 227
    invoke-virtual {v0, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 275
    invoke-virtual {v1}, Ll/ᩴܶ۠;->clear()V

    const/4 v2, 0x0

    .line 227
    :cond_2
    invoke-virtual {v1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/2addr v2, v4

    goto :goto_0

    .line 283
    :cond_3
    invoke-virtual {v1}, Ll/ᩴܶ۠;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_4

    .line 284
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p0

    .line 227
    invoke-virtual {v0, p0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 287
    :cond_4
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۡ᩵۠;)Ll/۟᩷۠;
    .locals 3

    .line 255
    iget-object v0, p1, Ll/ۡ᩵۠;->۫:Ll/۫᩵۠;

    iget-object v1, p1, Ll/ۡ᩵۠;->ۤ:Ll/۫᩵۠;

    .line 127
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 128
    invoke-static {v0}, Ll/֫ۡ۠;->֫(Ll/ۚۚ۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 129
    invoke-static {v1}, Ll/֫ۡ۠;->֫(Ll/ۚۚ۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    const/4 v1, 0x1

    .line 256
    iget-object v2, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {p0, p1, v0, v1, v2}, Ll/ۨۢ۠;->֫(Ll/֨֡۠;Ll/ۖܶ۠;ZLl/ۙ֨֨;)V

    .line 257
    iget-object p1, p0, Ll/֫ۡ۠;->֫:Ll/۬᩷۠;

    invoke-virtual {p1}, Ll/۬᩷۠;->ܳ()Ll/ܳۢ۠;

    move-result-object p1

    iget-object v0, p0, Ll/֫ۡ۠;->ܳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    invoke-virtual {p1, v0}, Ll/ܳۢ۠;->֫(Ll/ۙ֨֨;)Ll/۟᩷۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۢ᩵۠;)Ll/۟᩷۠;
    .locals 4

    .line 245
    iget-object v0, p1, Ll/ۢ᩵۠;->۫:Ll/۫᩵۠;

    iget-object v1, p1, Ll/ۢ᩵۠;->ۤ:Ll/۫᩵۠;

    .line 127
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 128
    invoke-static {v0}, Ll/֫ۡ۠;->֫(Ll/ۚۚ۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 129
    invoke-static {v1}, Ll/֫ۡ۠;->֫(Ll/ۚۚ۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 246
    iget-object v1, p1, Ll/ۢ᩵۠;->۫:Ll/۫᩵۠;

    iget-object v2, v1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v3, p0, Ll/֫ۡ۠;->֫:Ll/۬᩷۠;

    invoke-virtual {v3, v2, v1}, Ll/۬᩷۠;->֫(Ll/ۙ֨֨;Ll/ۚۚ۠;)Ll/۟᩷۠;

    move-result-object v1

    .line 247
    invoke-virtual {v1}, Ll/۟᩷۠;->ۧ()V

    .line 248
    invoke-virtual {v1}, Ll/۟᩷۠;->ᩳ()Ll/۟᩷۠;

    const/4 v2, 0x0

    .line 249
    iget-object v3, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {p0, p1, v0, v2, v3}, Ll/ۨۢ۠;->֫(Ll/֨֡۠;Ll/ۖܶ۠;ZLl/ۙ֨֨;)V

    return-object v1
.end method

.method public abstract ֫(Ll/֨֡۠;Ll/ۖܶ۠;ZLl/ۙ֨֨;)V
.end method
