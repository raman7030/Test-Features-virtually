.class public Ll/֨۫֨;
.super Ll/ۙ֨֨;
.source "W7SR"


# instance fields
.field public ۛ:Ll/ܰ۬֨;

.field public ۟:Ll/۫᩵۠;

.field public ۤ:Ll/֫ۤ֨;

.field public ۨ:Ljava/util/HashSet;

.field public final synthetic ܰ:Ll/۫۫֨;

.field public ᩺:Ll/ۚ۫֨;


# direct methods
.method public constructor <init>(Ll/۫۫֨;Ll/۫᩵۠;Ll/֫ۤ֨;)V
    .locals 2

    .line 223
    iput-object p1, p0, Ll/֨۫֨;->ܰ:Ll/۫۫֨;

    const/4 v0, 0x0

    .line 224
    sget-object v1, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    invoke-direct {p0, v0, v1}, Ll/ۙ֨֨;-><init>(Ll/᩶֡֨;Ll/᩷۠֨;)V

    .line 220
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֨۫֨;->ۨ:Ljava/util/HashSet;

    .line 225
    iput-object p2, p0, Ll/֨۫֨;->۟:Ll/۫᩵۠;

    .line 226
    iget-object p1, p1, Ll/۫۫֨;->ܽ:Ll/ۢۗ֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Ll/ۢۗ֨;->ۧ(Ll/֫ۤ֨;)Ll/֫ۤ֨;

    move-result-object p1

    iput-object p1, p0, Ll/֨۫֨;->ۤ:Ll/֫ۤ֨;

    .line 227
    new-instance p1, Ll/ۚ۫֨;

    invoke-direct {p1}, Ll/ۚ۫֨;-><init>()V

    iput-object p1, p0, Ll/֨۫֨;->᩺:Ll/ۚ۫֨;

    return-void
.end method

.method private ֫(Ll/᩻ۗ֨;Ll/᩵۫֨;)Ll/ۙ֨֨;
    .locals 2

    .line 347
    iget-object v0, p1, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    .line 348
    invoke-interface {v0}, Ll/ۘ۬֨;->ۧ()Ll/ۜ۫֨;

    move-result-object v0

    .line 349
    iget-object v1, p0, Ll/֨۫֨;->ܰ:Ll/۫۫֨;

    iget-object v1, v1, Ll/۫۫֨;->᩷:Ll/۬۬֨;

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 350
    invoke-interface {p2}, Ll/᩵۫֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 351
    invoke-virtual {v0, p0, p1, p2}, Ll/ۜ۫֨;->֫(Ll/֨۫֨;Ll/᩻ۗ֨;Ll/᩵۫֨;)V

    .line 352
    iget-object p1, v0, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    sget-object p2, Ll/ܰ۬֨;->᩶:Ll/ܰ۬֨;

    if-ne p1, p2, :cond_1

    .line 353
    iget-object p1, p0, Ll/֨۫֨;->ۨ:Ljava/util/HashSet;

    iget-object v0, v0, Ll/ۜ۫֨;->ᩳ:Ll/ۛ֡֨;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 354
    iput-object p2, p0, Ll/֨۫֨;->ۛ:Ll/ܰ۬֨;

    .line 356
    :cond_1
    sget-object p1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    return-object p1

    .line 359
    :cond_2
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ll/֨۫֨;->֫(Ll/᩻ۗ֨;Ll/ۜ۫֨;)Ll/ۙ֨֨;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 361
    iget-object p2, v0, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    iput-object p2, p0, Ll/֨۫֨;->ۛ:Ll/ܰ۬֨;

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, v0, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    iput-object p2, p0, Ll/֨۫֨;->ۛ:Ll/ܰ۬֨;

    .line 362
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/֨۫֨;Ll/᩻ۗ֨;Ll/ۨ۬֨;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/֨۫֨;->֫(Ll/᩻ۗ֨;Ll/᩵۫֨;)Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DeferredType"

    return-object v0
.end method

.method public ֫(Ll/ۛ֡֨;Ll/ܽܽ۠;)Ll/ۙ֨֨;
    .locals 1

    .line 300
    iget-object v0, p0, Ll/֨۫֨;->᩺:Ll/ۚ۫֨;

    invoke-virtual {v0, p1, p2}, Ll/ۚ۫֨;->֫(Ll/ۛ֡֨;Ll/ܽܽ۠;)Ll/֡۫֨;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 301
    iget-object p1, p1, Ll/֡۫֨;->ۧ:Ll/ۚۚ۠;

    iget-object p1, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    return-object p1

    :cond_0
    sget-object p1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    return-object p1
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 1

    .line 232
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot add metadata to a deferred type"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫(Ll/᩻ۗ֨;)Ll/ۙ֨֨;
    .locals 4

    .line 335
    iget-object v0, p1, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    iget-object v1, p1, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    sget-object v2, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    invoke-virtual {v0, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    iget-object v2, p0, Ll/֨۫֨;->ܰ:Ll/۫۫֨;

    if-nez v0, :cond_3

    iget-object v0, p1, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 337
    :cond_0
    invoke-interface {v1}, Ll/ۘ۬֨;->ۧ()Ll/ۜ۫֨;

    move-result-object v0

    iget-object v0, v0, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    sget-object v3, Ll/ܰ۬֨;->᩶:Ll/ܰ۬֨;

    if-eq v0, v3, :cond_2

    .line 338
    invoke-interface {v1}, Ll/ۘ۬֨;->ۧ()Ll/ۜ۫֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜ۫֨;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 341
    :cond_1
    new-instance v0, Ll/ܽ۫֨;

    invoke-direct {v0, v2, p1, p0}, Ll/ܽ۫֨;-><init>(Ll/۫۫֨;Ll/᩻ۗ֨;Ll/֨۫֨;)V

    goto :goto_2

    .line 339
    :cond_2
    :goto_0
    new-instance v0, Ll/᩹۫֨;

    .line 1309
    invoke-direct {v0, v2, p1, p0}, Ll/ܽ۫֨;-><init>(Ll/۫۫֨;Ll/᩻ۗ֨;Ll/֨۫֨;)V

    goto :goto_2

    .line 336
    :cond_3
    :goto_1
    iget-object v0, v2, Ll/۫۫֨;->ۜ:Ll/ۨ۬֨;

    .line 343
    :goto_2
    invoke-direct {p0, p1, v0}, Ll/֨۫֨;->֫(Ll/᩻ۗ֨;Ll/᩵۫֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/᩻ۗ֨;Ll/ۜ۫֨;)Ll/ۙ֨֨;
    .locals 8

    .line 310
    iget-object p2, p2, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    iget-object v2, p0, Ll/֨۫֨;->ۤ:Ll/֫ۤ֨;

    iget-object v1, p0, Ll/֨۫֨;->۟:Ll/۫᩵۠;

    iget-object v0, p0, Ll/֨۫֨;->ܰ:Ll/۫۫֨;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p2, :cond_2

    if-ne p2, v4, :cond_1

    .line 319
    iget-object p2, p0, Ll/֨۫֨;->ۛ:Ll/ܰ۬֨;

    if-eqz p2, :cond_0

    const/4 v3, 0x1

    :cond_0
    invoke-static {v3}, Ll/۫ۙ;->֫(Z)V

    .line 320
    iget-object p2, v0, Ll/۫۫֨;->ܽ:Ll/ۢۗ֨;

    invoke-virtual {p2, v1, v2, p1}, Ll/ۢۗ֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Ll/᩻ۗ֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 322
    :cond_1
    invoke-static {}, Ll/۫ۙ;->֫()V

    const/4 p1, 0x0

    throw p1

    .line 314
    :cond_2
    iget-object p2, p0, Ll/֨۫֨;->ۛ:Ll/ܰ۬֨;

    if-eqz p2, :cond_3

    sget-object v4, Ll/ܰ۬֨;->᩶:Ll/ܰ۬֨;

    if-ne p2, v4, :cond_4

    :cond_3
    const/4 v3, 0x1

    :cond_4
    invoke-static {v3}, Ll/۫ۙ;->֫(Z)V

    .line 467
    iget-object v4, v0, Ll/۫۫֨;->֡:Ll/᩶ۚ۠;

    sget-object v6, Ll/۟۬֨;->۫:Ll/۟۬֨;

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-virtual/range {v0 .. v7}, Ll/۫۫֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Ll/᩻ۗ֨;Ll/᩶ۚ۠;Ll/ۨ᩸֨;Ll/۟۬֨;Ll/᩷᩶֨;)Ll/ۚۚ۠;

    move-result-object p2

    .line 316
    iget-object v0, p0, Ll/֨۫֨;->᩺:Ll/ۚ۫֨;

    invoke-virtual {v0, p2, p1}, Ll/ۚ۫֨;->֫(Ll/ۚۚ۠;Ll/᩻ۗ֨;)V

    .line 317
    iget-object p1, p2, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    return-object p1
.end method

.method public ֫(Ll/ۜ۫֨;)Ll/ۚۚ۠;
    .locals 2

    .line 305
    iget-object v0, p1, Ll/ۜ۫֨;->ᩳ:Ll/ۛ֡֨;

    iget-object p1, p1, Ll/ۜ۫֨;->ܳ:Ll/ܽܽ۠;

    iget-object v1, p0, Ll/֨۫֨;->᩺:Ll/ۚ۫֨;

    invoke-virtual {v1, v0, p1}, Ll/ۚ۫֨;->֫(Ll/ۛ֡֨;Ll/ܽܽ۠;)Ll/֡۫֨;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 306
    iget-object p1, p1, Ll/֡۫֨;->ۧ:Ll/ۚۚ۠;

    return-object p1

    :cond_0
    iget-object p1, p0, Ll/֨۫֨;->ܰ:Ll/۫۫֨;

    iget-object p1, p1, Ll/۫۫֨;->᩵:Ll/۟᩵۠;

    return-object p1
.end method

.method public final ֫֫()Ll/ۢ۠֨;
    .locals 1

    .line 237
    sget-object v0, Ll/ۢ۠֨;->᩺:Ll/ۢ۠֨;

    return-object v0
.end method
