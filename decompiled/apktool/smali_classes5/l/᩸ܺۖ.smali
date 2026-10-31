.class public final Ll/᩸ܺۖ;
.super Ll/ۗۘۖ;
.source "T9Q9"


# instance fields
.field public ۗ:Ll/ۛۢۖ;

.field public ۙ:Ll/ܺۚۖ;

.field public ۫:Ljava/util/List;

.field public ۬:Ll/ܳۚۖ;

.field public ᩶:Z

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34966
    invoke-direct {p0}, Ll/ۗۘۖ;-><init>()V

    .line 35347
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 34976
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 34978
    invoke-direct {p0}, Ll/᩸ܺۖ;->ᩳ()Ll/ܺۚۖ;

    .line 34979
    invoke-direct {p0}, Ll/᩸ܺۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 34947
    invoke-direct {p0}, Ll/᩸ܺۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 1223
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 35347
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 34976
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 34978
    invoke-direct {p0}, Ll/᩸ܺۖ;->ᩳ()Ll/ܺۚۖ;

    .line 34979
    invoke-direct {p0}, Ll/᩸ܺۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method private ܿ()Ll/ܳۚۖ;
    .locals 5

    .line 35574
    iget-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 35575
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    iget v2, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 35579
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 35580
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 35581
    iput-object v0, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 35583
    :cond_1
    iget-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܺۚۖ;
    .locals 4

    .line 35295
    iget-object v0, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 35296
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 35201
    iget-object v0, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 35203
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 35299
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 35300
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 35301
    iput-object v0, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    .line 35303
    :cond_2
    iget-object v0, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 35015
    invoke-virtual {p0}, Ll/᩸ܺۖ;->buildPartial()Ll/᩹ܺۖ;

    move-result-object v0

    .line 35016
    invoke-virtual {v0}, Ll/᩹ܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 35017
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 35015
    invoke-virtual {p0}, Ll/᩸ܺۖ;->buildPartial()Ll/᩹ܺۖ;

    move-result-object v0

    .line 35016
    invoke-virtual {v0}, Ll/᩹ܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 35017
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 34947
    invoke-virtual {p0}, Ll/᩸ܺۖ;->buildPartial()Ll/᩹ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/᩹ܺۖ;
    .locals 3

    .line 35024
    new-instance v0, Ll/᩹ܺۖ;

    invoke-direct {v0, p0}, Ll/᩹ܺۖ;-><init>(Ll/᩸ܺۖ;)V

    .line 35032
    iget-object v1, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 35033
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_0

    .line 35034
    iget-object v1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 35035
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Ll/᩸ܺۖ;->᩹:I

    .line 35037
    :cond_0
    iget-object v1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-static {v0, v1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;Ljava/util/List;)V

    goto :goto_0

    .line 35039
    :cond_1
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;Ljava/util/List;)V

    .line 35026
    :goto_0
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    if-eqz v1, :cond_5

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_3

    .line 35047
    iget-object v2, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v2, :cond_2

    .line 35048
    iget-object v2, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    goto :goto_1

    .line 35049
    :cond_2
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/ۛۢۖ;

    .line 35047
    :goto_1
    invoke-static {v0, v2}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;Ll/ۛۢۖ;)V

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_4

    .line 35053
    iget-boolean v1, p0, Ll/᩸ܺۖ;->᩶:Z

    invoke-static {v0, v1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;Z)V

    or-int/lit8 v2, v2, 0x2

    .line 35056
    :cond_4
    invoke-static {v0, v2}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;I)V

    .line 35027
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 34947
    invoke-virtual {p0}, Ll/᩸ܺۖ;->buildPartial()Ll/᩹ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۗۘۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0}, Ll/᩸ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0}, Ll/᩸ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0}, Ll/᩸ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0}, Ll/᩸ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0}, Ll/᩸ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 35010
    invoke-static {}, Ll/᩹ܺۖ;->getDefaultInstance()Ll/᩹ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 35010
    invoke-static {}, Ll/᩹ܺۖ;->getDefaultInstance()Ll/᩹ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 35005
    invoke-static {}, Ll/ۧۖۖ;->ۤ()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 34960
    invoke-static {}, Ll/ۧۖۖ;->ۛ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩹ܺۖ;

    const-class v2, Ll/᩸ܺۖ;

    .line 34961
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 35193
    iget v0, p0, Ll/᩸ܺۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 35200
    iget-object v0, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 35201
    iget-object v0, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 35203
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 35112
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    .line 35372
    :goto_1
    iget-object v3, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    if-nez v3, :cond_3

    .line 35373
    iget-object v3, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_2

    .line 35375
    :cond_3
    invoke-virtual {v3}, Ll/ܳۚۖ;->ܳ()I

    move-result v3

    :goto_2
    if-ge v0, v3, :cond_6

    .line 35382
    iget-object v3, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    if-nez v3, :cond_4

    .line 35383
    iget-object v3, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    goto :goto_3

    .line 35385
    :cond_4
    invoke-virtual {v3, v0}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    .line 35117
    :goto_3
    invoke-virtual {v3}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 35121
    :cond_6
    invoke-virtual {p0}, Ll/ۗۘۖ;->֫()Z

    move-result v0

    if-nez v0, :cond_7

    :goto_4
    return v2

    :cond_7
    return v1
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0, p1, p2}, Ll/᩸ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0, p1, p2}, Ll/᩸ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0, p1, p2}, Ll/᩸ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 35061
    instance-of v0, p1, Ll/᩹ܺۖ;

    if-eqz v0, :cond_0

    .line 35062
    check-cast p1, Ll/᩹ܺۖ;

    invoke-virtual {p0, p1}, Ll/᩸ܺۖ;->֫(Ll/᩹ܺۖ;)V

    return-object p0

    .line 35064
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 34947
    invoke-virtual {p0, p1, p2}, Ll/᩸ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 35061
    instance-of v0, p1, Ll/᩹ܺۖ;

    if-eqz v0, :cond_0

    .line 35062
    check-cast p1, Ll/᩹ܺۖ;

    invoke-virtual {p0, p1}, Ll/᩸ܺۖ;->֫(Ll/᩹ܺۖ;)V

    return-object p0

    .line 35064
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 4

    .line 35133
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_7

    .line 35138
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_6

    const/16 v2, 0x108

    if-eq v1, v2, :cond_5

    const/16 v2, 0x112

    if-eq v1, v2, :cond_4

    const/16 v2, 0x1f3a

    if-eq v1, v2, :cond_1

    .line 35169
    invoke-virtual {p0, p1, p2, v1}, Ll/ۗۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 35158
    :cond_1
    invoke-static {}, Ll/֫ۖۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 35157
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۖۖ;

    .line 35160
    iget-object v2, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 35349
    iget v2, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v2, v2, 0x4

    if-nez v2, :cond_2

    .line 35350
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 35351
    iget v2, p0, Ll/᩸ܺۖ;->᩹:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Ll/᩸ܺۖ;->᩹:I

    .line 35162
    :cond_2
    iget-object v2, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35164
    :cond_3
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 35150
    :cond_4
    invoke-direct {p0}, Ll/᩸ܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 35149
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 35152
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩸ܺۖ;->᩹:I

    goto :goto_0

    .line 35144
    :cond_5
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/᩸ܺۖ;->᩶:Z

    .line 35145
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/᩸ܺۖ;->᩹:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_6
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 35177
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35179
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 35180
    throw p1

    .line 35179
    :cond_7
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/᩹ܺۖ;)V
    .locals 3

    .line 35070
    invoke-static {}, Ll/᩹ܺۖ;->getDefaultInstance()Ll/᩹ܺۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 35071
    :cond_0
    invoke-virtual {p1}, Ll/᩹ܺۖ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 35072
    invoke-virtual {p1}, Ll/᩹ܺۖ;->ܺ()Ll/ۛۢۖ;

    move-result-object v0

    .line 35240
    iget-object v1, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v1, :cond_2

    .line 35241
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    if-eqz v1, :cond_1

    .line 35243
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_1

    .line 35274
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩸ܺۖ;->᩹:I

    .line 35275
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 35276
    invoke-direct {p0}, Ll/᩸ܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/֡ۢۖ;

    .line 35244
    invoke-virtual {v1, v0}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    goto :goto_0

    .line 35246
    :cond_1
    iput-object v0, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    goto :goto_0

    .line 35249
    :cond_2
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 35251
    :goto_0
    iget-object v0, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    if-eqz v0, :cond_3

    .line 35252
    iget v0, p0, Ll/᩸ܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩸ܺۖ;->᩹:I

    .line 35253
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 35074
    :cond_3
    invoke-virtual {p1}, Ll/᩹ܺۖ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 35075
    invoke-virtual {p1}, Ll/᩹ܺۖ;->ۡ()Z

    move-result v0

    .line 35330
    iput-boolean v0, p0, Ll/᩸ܺۖ;->᩶:Z

    .line 35331
    iget v0, p0, Ll/᩸ܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/᩸ܺۖ;->᩹:I

    .line 35332
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 35077
    :cond_4
    iget-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    if-nez v0, :cond_7

    .line 35078
    invoke-static {p1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 35079
    iget-object v0, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35080
    invoke-static {p1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 35081
    iget v0, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/᩸ܺۖ;->᩹:I

    goto :goto_1

    .line 35349
    :cond_5
    iget v0, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_6

    .line 35350
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 35351
    iget v0, p0, Ll/᩸ܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/᩸ܺۖ;->᩹:I

    .line 35084
    :cond_6
    iget-object v0, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    invoke-static {p1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35086
    :goto_1
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 35089
    :cond_7
    invoke-static {p1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 35090
    iget-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 35091
    iget-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 35092
    iput-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    .line 35093
    invoke-static {p1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 35094
    iget v1, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Ll/᩸ܺۖ;->᩹:I

    .line 35096
    sget-boolean v1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v1, :cond_8

    .line 35097
    invoke-direct {p0}, Ll/᩸ܺۖ;->ܿ()Ll/ܳۚۖ;

    move-result-object v0

    :cond_8
    iput-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    goto :goto_2

    .line 35099
    :cond_9
    iget-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/᩹ܺۖ;->֫(Ll/᩹ܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 35103
    :cond_a
    :goto_2
    invoke-virtual {p0, p1}, Ll/ۗۘۖ;->֫(Ll/۫ۘۖ;)V

    .line 35104
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 35105
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ܽ()V
    .locals 3

    .line 34984
    invoke-super {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    const/4 v0, 0x0

    .line 34985
    iput v0, p0, Ll/᩸ܺۖ;->᩹:I

    const/4 v1, 0x0

    .line 34986
    iput-object v1, p0, Ll/᩸ܺۖ;->ۗ:Ll/ۛۢۖ;

    .line 34987
    iget-object v2, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    if-eqz v2, :cond_0

    .line 34988
    invoke-virtual {v2}, Ll/ܺۚۖ;->ܽ()V

    .line 34989
    iput-object v1, p0, Ll/᩸ܺۖ;->ۙ:Ll/ܺۚۖ;

    .line 34991
    :cond_0
    iput-boolean v0, p0, Ll/᩸ܺۖ;->᩶:Z

    .line 34992
    iget-object v0, p0, Ll/᩸ܺۖ;->۬:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 34993
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    goto :goto_0

    .line 34995
    :cond_1
    iput-object v1, p0, Ll/᩸ܺۖ;->۫:Ljava/util/List;

    .line 34996
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 34998
    :goto_0
    iget v0, p0, Ll/᩸ܺۖ;->᩹:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/᩸ܺۖ;->᩹:I

    return-void
.end method
