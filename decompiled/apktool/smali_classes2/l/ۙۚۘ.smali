.class public abstract Ll/ۙۚۘ;
.super Ljava/lang/Object;
.source "88A4"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Ll/ۗۚۘ;


# direct methods
.method public constructor <init>(Ll/ۗۚۘ;)V
    .locals 0

    .line 298
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۚۘ;->ۧ:Ll/ۗۚۘ;

    .line 300
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۙۚۘ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/Long;)Ll/ۤۚۘ;
.end method

.method public final ֫()V
    .locals 10

    .line 314
    new-instance v0, Ll/ܺܺ֡;

    invoke-direct {v0}, Ll/ܺܺ֡;-><init>()V

    .line 317
    :goto_0
    invoke-virtual {v0}, Ll/ܺܺ֡;->getValue()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۙۚۘ;->֫(Ljava/lang/Long;)Ll/ۤۚۘ;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ll/᩹ۚۘ;

    .line 319
    sget-object v3, Ll/᩹ۚۘ;->ۧ֡:Ll/᩹ۚۘ;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Ll/᩹ۚۘ;->ۛۙ:Ll/᩹ۚۘ;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    iget-object v3, p0, Ll/ۙۚۘ;->ۧ:Ll/ۗۚۘ;

    invoke-static {v3, v1, v2}, Ll/ۗۚۘ;->֫(Ll/ۗۚۘ;Ll/ۤۚۘ;[Ll/᩹ۚۘ;)Ll/ۨۚۘ;

    move-result-object v1

    .line 321
    invoke-virtual {v1}, Ll/᩺ۚۘ;->ᩳ()Ll/֫֨ۘ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 323
    invoke-virtual {v2}, Ll/֫֨ۘ;->֫()Ll/ܿ֨ۘ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 325
    invoke-virtual {v2}, Ll/ܳ֨ۘ;->ۧ()[Ll/ᩳ֨ۘ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 327
    array-length v3, v2

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 177
    check-cast v5, Ll/ܽ֨ۘ;

    const/4 v6, 0x0

    if-nez v5, :cond_0

    goto :goto_4

    .line 354
    :cond_0
    new-instance v7, Ll/۬ۚۘ;

    invoke-virtual {v5}, Ll/ᩳ֨ۘ;->֫()Ll/᩻֨ۘ;

    move-result-object v8

    if-nez v8, :cond_1

    move-object v8, v6

    goto :goto_2

    .line 180
    :cond_1
    invoke-virtual {v8}, Ll/ۜ֨ۘ;->֫()Ljava/lang/String;

    move-result-object v8

    .line 354
    :goto_2
    invoke-virtual {v5}, Ll/ܽ֨ۘ;->ܽ()I

    move-result v9

    invoke-virtual {v5}, Ll/ܽ֨ۘ;->ۧ()Ll/᩻֨ۘ;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_3

    .line 180
    :cond_2
    invoke-virtual {v5}, Ll/ۜ֨ۘ;->֫()Ljava/lang/String;

    move-result-object v6

    .line 354
    :goto_3
    invoke-direct {v7, v8, v9, v6}, Ll/۬ۚۘ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move-object v6, v7

    .line 328
    :goto_4
    iget-object v5, p0, Ll/ۙۚۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 332
    :cond_3
    sget-object v2, Ll/᩹ۚۘ;->ۛۙ:Ll/᩹ۚۘ;

    invoke-virtual {v1}, Ll/ܶۚۘ;->֫()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/᩹ۚۘ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_4

    return-void

    .line 334
    :cond_4
    invoke-virtual {v1}, Ll/᩺ۚۘ;->ܽ()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 337
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0}, Ll/ܺܺ֡;->getValue()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-eqz v6, :cond_5

    .line 340
    invoke-virtual {v0, v1}, Ll/ܺܺ֡;->֫(Ljava/lang/Long;)V

    goto/16 :goto_0

    .line 338
    :cond_5
    new-instance v0, Ll/ۖ۟ۖ;

    const-string v1, "NetrShareEnum resume handle not updated."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 338
    throw v0

    .line 336
    :cond_6
    new-instance v0, Ll/ۖ۟ۖ;

    const-string v1, "NetrShareEnum resume handle null."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 336
    throw v0
.end method

.method public final ۧ()Ljava/util/ArrayList;
    .locals 1

    .line 304
    iget-object v0, p0, Ll/ۙۚۘ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method
