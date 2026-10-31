.class public final Ll/ۗ᩸֨;
.super Ll/֨᩸֨;
.source "X43L"


# instance fields
.field public ᩶:Ll/ۖܶ۠;

.field public ᩸:Ljava/util/HashSet;

.field public final synthetic ᩹:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;Ll/ۖܶ۠;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 245
    iput-object p1, p0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    .line 243
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ۗ᩸֨;->᩸:Ljava/util/HashSet;

    .line 246
    iput-object p2, p0, Ll/ۗ᩸֨;->᩶:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 240
    check-cast p2, Ll/ۢ᩸֨;

    .line 285
    iget-object v0, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    .line 4900
    invoke-virtual {v0, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 286
    check-cast p2, Ll/ۙ֨֨;

    if-ne p2, v0, :cond_0

    return-object p1

    .line 289
    :cond_0
    sget-object v0, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    iget-object p1, p0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    iget-object p1, p1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object p1, p1, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    return-object p1

    .line 293
    :cond_1
    new-instance v0, Ll/᩹᩸֨;

    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p1, p1, Ll/ۙ֨֨;->᩸:Ll/᩷۠֨;

    invoke-direct {v0, p2, v1, p1}, Ll/ۚۚ֨;-><init>(Ll/ۙ֨֨;Ll/᩶֡֨;Ll/᩷۠֨;)V

    return-object v0
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 240
    check-cast p2, Ll/ۢ᩸֨;

    .line 304
    iget-object v0, p0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    iget-object v0, v0, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v1, p0, Ll/ۗ᩸֨;->᩶:Ll/ۖܶ۠;

    invoke-virtual {v1, p1}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 305
    iget-object v1, p0, Ll/ۗ᩸֨;->᩸:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 308
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 1693
    iget-object v2, p1, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    if-nez v2, :cond_2

    .line 314
    iget-object v2, v0, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    goto :goto_0

    .line 318
    :cond_0
    invoke-static {}, Ll/۫ۙ;->֫()V

    const/4 p2, 0x0

    throw p2

    .line 310
    :cond_1
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v2

    .line 321
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4900
    invoke-virtual {v2, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 318
    check-cast p2, Ll/ۙ֨֨;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 323
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 324
    throw p2

    .line 327
    :cond_3
    sget-object p1, Ll/ۢ᩸֨;->᩶:Ll/ۢ᩸֨;

    if-ne p2, p1, :cond_4

    .line 328
    iget-object p1, v0, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    return-object p1

    :cond_4
    iget-object p1, v0, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    :cond_5
    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 240
    check-cast p2, Ll/ۢ᩸֨;

    .line 251
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    iget-object v1, p0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    if-eqz v0, :cond_1

    .line 252
    invoke-virtual {v1, p1}, Ll/ۛ᩸֨;->᩻(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v0

    .line 253
    new-instance v2, Ll/ܶ᩸֨;

    invoke-direct {v2, p0, p2}, Ll/ܶ᩸֨;-><init>(Ll/ۗ᩸֨;Ll/ۢ᩸֨;)V

    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->֫(Ljava/util/function/Function;)Ll/ۖܶ۠;

    move-result-object p2

    if-ne v0, p2, :cond_0

    goto :goto_3

    .line 255
    :cond_0
    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ܳ(Ll/ۖܶ۠;)Ll/ۛۚ֨;

    move-result-object p1

    return-object p1

    .line 257
    :cond_1
    invoke-virtual {p1}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object v0

    .line 4900
    invoke-virtual {v0, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 258
    check-cast v2, Ll/ۙ֨֨;

    .line 259
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v3

    .line 260
    iget-object v4, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v4, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v4}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v4

    .line 261
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 263
    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙ֨֨;

    .line 264
    iget-object v8, v4, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v8, Ll/ۙ֨֨;

    invoke-virtual {v8}, Ll/ۙ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v8

    .line 336
    iget-object v9, p0, Ll/ۗ᩸֨;->᩶:Ll/ۖܶ۠;

    invoke-virtual {v7, v9}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 337
    new-instance v9, Ll/ۙ᩸֨;

    invoke-direct {v9, p0, p1, v8}, Ll/ۙ᩸֨;-><init>(Ll/ۗ᩸֨;Ll/᩶ۚ֨;Ll/ۙ֨֨;)V

    .line 4900
    invoke-virtual {v7, v9, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 318
    check-cast v8, Ll/ۙ֨֨;

    goto :goto_1

    :cond_2
    move-object v8, v7

    .line 265
    :goto_1
    sget-object v9, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {v8, v9}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 267
    iget-object p1, v1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object p1, p1, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    return-object p1

    .line 227
    :cond_3
    invoke-virtual {v5, v8}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    if-eq v7, v8, :cond_4

    const/4 v7, 0x1

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    :goto_2
    or-int/2addr v6, v7

    .line 271
    iget-object v4, v4, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_5
    if-ne v2, v0, :cond_6

    if-nez v6, :cond_6

    :goto_3
    return-object p1

    .line 274
    :cond_6
    new-instance p2, Ll/᩸᩸֨;

    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 92
    iget-object p1, p1, Ll/ۙ֨֨;->᩸:Ll/᩷۠֨;

    .line 274
    invoke-direct {p2, v2, v0, v1, p1}, Ll/᩶ۚ֨;-><init>(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;Ll/᩷۠֨;)V

    return-object p2
.end method
