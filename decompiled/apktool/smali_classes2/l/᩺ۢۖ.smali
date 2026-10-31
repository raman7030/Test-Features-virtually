.class public final Ll/᩺ۢۖ;
.super Ll/᩶ۘۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ᩶:Ljava/util/List;

.field public ᩸:I

.field public ᩹:Ll/ܳۚۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42115
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    .line 42325
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    const/4 v0, 0x0

    .line 42564
    iput v0, p0, Ll/᩺ۢۖ;->ۗ:I

    .line 42606
    iput v0, p0, Ll/᩺ۢۖ;->ۙ:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 42097
    invoke-direct {p0}, Ll/᩺ۢۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 42121
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 42325
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    const/4 p1, 0x0

    .line 42564
    iput p1, p0, Ll/᩺ۢۖ;->ۗ:I

    .line 42606
    iput p1, p0, Ll/᩺ۢۖ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 42153
    invoke-virtual {p0}, Ll/᩺ۢۖ;->buildPartial()Ll/ۧۡۖ;

    move-result-object v0

    .line 42154
    invoke-virtual {v0}, Ll/ۧۡۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 42155
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 42153
    invoke-virtual {p0}, Ll/᩺ۢۖ;->buildPartial()Ll/ۧۡۖ;

    move-result-object v0

    .line 42154
    invoke-virtual {v0}, Ll/ۧۡۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 42155
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 42097
    invoke-virtual {p0}, Ll/᩺ۢۖ;->buildPartial()Ll/ۧۡۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/ۧۡۖ;
    .locals 4

    .line 42162
    new-instance v0, Ll/ۧۡۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ۧۡۖ;-><init>(Ll/᩺ۢۖ;I)V

    .line 42170
    iget-object v2, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 42171
    iget v2, p0, Ll/᩺ۢۖ;->᩸:I

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    .line 42172
    iget-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    .line 42173
    iget v2, p0, Ll/᩺ۢۖ;->᩸:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42175
    :cond_0
    iget-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-static {v0, v2}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;Ljava/util/List;)V

    goto :goto_0

    .line 42177
    :cond_1
    invoke-virtual {v2}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;Ljava/util/List;)V

    .line 42164
    :goto_0
    iget v2, p0, Ll/᩺ۢۖ;->᩸:I

    if-eqz v2, :cond_4

    and-int/lit8 v3, v2, 0x2

    if-eqz v3, :cond_2

    .line 42185
    iget v1, p0, Ll/᩺ۢۖ;->ۗ:I

    invoke-static {v0, v1}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;I)V

    const/4 v1, 0x1

    :cond_2
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_3

    .line 42189
    iget v2, p0, Ll/᩺ۢۖ;->ۙ:I

    invoke-static {v0, v2}, Ll/ۧۡۖ;->ۧ(Ll/ۧۡۖ;I)V

    or-int/lit8 v1, v1, 0x2

    .line 42192
    :cond_3
    invoke-static {v0, v1}, Ll/ۧۡۖ;->ܽ(Ll/ۧۡۖ;I)V

    .line 42165
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 42097
    invoke-virtual {p0}, Ll/᩺ۢۖ;->buildPartial()Ll/ۧۡۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0}, Ll/᩺ۢۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0}, Ll/᩺ۢۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0}, Ll/᩺ۢۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0}, Ll/᩺ۢۖ;->֫()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 42148
    invoke-static {}, Ll/ۧۡۖ;->getDefaultInstance()Ll/ۧۡۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 42148
    invoke-static {}, Ll/ۧۡۖ;->getDefaultInstance()Ll/ۧۡۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 42143
    invoke-static {}, Ll/ۧۖۖ;->᩻֫()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 42109
    invoke-static {}, Ll/ۧۖۖ;->ۜ֫()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۧۡۖ;

    const-class v2, Ll/᩺ۢۖ;

    .line 42110
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 42350
    :goto_0
    iget-object v2, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_0

    .line 42351
    iget-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_1

    .line 42353
    :cond_0
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܳ()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_3

    .line 42360
    iget-object v2, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 42361
    iget-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۡۖ;

    goto :goto_2

    .line 42363
    :cond_1
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/֫ۡۖ;

    .line 42247
    :goto_2
    invoke-virtual {v2}, Ll/֫ۡۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0, p1, p2}, Ll/᩺ۢۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0, p1, p2}, Ll/᩺ۢۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0, p1, p2}, Ll/᩺ۢۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 42197
    instance-of v0, p1, Ll/ۧۡۖ;

    if-eqz v0, :cond_0

    .line 42198
    check-cast p1, Ll/ۧۡۖ;

    invoke-virtual {p0, p1}, Ll/᩺ۢۖ;->֫(Ll/ۧۡۖ;)V

    return-object p0

    .line 42200
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 42097
    invoke-virtual {p0, p1, p2}, Ll/᩺ۢۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 42197
    instance-of v0, p1, Ll/ۧۡۖ;

    if-eqz v0, :cond_0

    .line 42198
    check-cast p1, Ll/ۧۡۖ;

    invoke-virtual {p0, p1}, Ll/᩺ۢۖ;->֫(Ll/ۧۡۖ;)V

    return-object p0

    .line 42200
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫()V
    .locals 3

    .line 42126
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 42127
    iput v0, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42128
    iget-object v1, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    if-nez v1, :cond_0

    .line 42129
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 42131
    iput-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    .line 42132
    invoke-virtual {v1}, Ll/ܳۚۖ;->ܽ()V

    .line 42134
    :goto_0
    iget v1, p0, Ll/᩺ۢۖ;->᩸:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42135
    iput v0, p0, Ll/᩺ۢۖ;->ۗ:I

    .line 42136
    iput v0, p0, Ll/᩺ۢۖ;->ۙ:I

    return-void
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 4

    .line 42260
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 42265
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_8

    const/16 v2, 0xa

    if-eq v1, v2, :cond_5

    const/16 v2, 0x20

    const/4 v3, 0x4

    if-eq v1, v2, :cond_3

    const/16 v2, 0x28

    if-eq v1, v2, :cond_1

    .line 42308
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 42296
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۜ()I

    move-result v1

    .line 42298
    invoke-static {v1}, Ll/ۗ᩷ۖ;->֫(I)Ll/ۗ᩷ۖ;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v2, 0x5

    .line 42300
    invoke-virtual {p0, v2, v1}, Ll/᩶ۘۖ;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 42302
    :cond_2
    iput v1, p0, Ll/᩺ۢۖ;->ۙ:I

    .line 42303
    iget v1, p0, Ll/᩺ۢۖ;->᩸:I

    or-int/2addr v1, v3

    iput v1, p0, Ll/᩺ۢۖ;->᩸:I

    goto :goto_0

    .line 42284
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۜ()I

    move-result v1

    .line 42286
    invoke-static {v1}, Ll/ۗ᩷ۖ;->֫(I)Ll/ۗ᩷ۖ;

    move-result-object v2

    if-nez v2, :cond_4

    .line 42288
    invoke-virtual {p0, v3, v1}, Ll/᩶ۘۖ;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 42290
    :cond_4
    iput v1, p0, Ll/᩺ۢۖ;->ۗ:I

    .line 42291
    iget v1, p0, Ll/᩺ۢۖ;->᩸:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/᩺ۢۖ;->᩸:I

    goto :goto_0

    .line 42273
    :cond_5
    invoke-static {}, Ll/֫ۡۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 42272
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۡۖ;

    .line 42275
    iget-object v2, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_7

    .line 42327
    iget v2, p0, Ll/᩺ۢۖ;->᩸:I

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_6

    .line 42328
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    .line 42329
    iget v2, p0, Ll/᩺ۢۖ;->᩸:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42277
    :cond_6
    iget-object v2, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 42279
    :cond_7
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_8
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 42316
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42318
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 42319
    throw p1

    .line 42318
    :cond_9
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/ۧۡۖ;)V
    .locals 6

    .line 42206
    invoke-static {}, Ll/ۧۡۖ;->getDefaultInstance()Ll/ۧۡۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 42207
    :cond_0
    iget-object v0, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    if-nez v0, :cond_3

    .line 42208
    invoke-static {p1}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 42209
    iget-object v0, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 42210
    invoke-static {p1}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    .line 42211
    iget v0, p0, Ll/᩺ۢۖ;->᩸:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩺ۢۖ;->᩸:I

    goto :goto_0

    .line 42327
    :cond_1
    iget v0, p0, Ll/᩺ۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    .line 42328
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    .line 42329
    iget v0, p0, Ll/᩺ۢۖ;->᩸:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42214
    :cond_2
    iget-object v0, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    invoke-static {p1}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 42216
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_1

    .line 42219
    :cond_3
    invoke-static {p1}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 42220
    iget-object v0, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 42221
    iget-object v0, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 42222
    iput-object v0, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    .line 42223
    invoke-static {p1}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    .line 42224
    iget v2, p0, Ll/᩺ۢۖ;->᩸:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42226
    sget-boolean v2, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v2, :cond_5

    .line 42552
    iget-object v2, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_4

    .line 42553
    new-instance v2, Ll/ܳۚۖ;

    .line 42557
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 42558
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    const/4 v5, 0x0

    invoke-direct {v2, v1, v5, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v2, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    .line 42559
    iput-object v0, p0, Ll/᩺ۢۖ;->᩶:Ljava/util/List;

    .line 42561
    :cond_4
    iget-object v0, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    .line 42227
    :cond_5
    iput-object v0, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    goto :goto_1

    .line 42229
    :cond_6
    iget-object v0, p0, Ll/᩺ۢۖ;->᩹:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۧۡۖ;->֫(Ll/ۧۡۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 42233
    :cond_7
    :goto_1
    invoke-virtual {p1}, Ll/ۧۡۖ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 42234
    invoke-virtual {p1}, Ll/ۧۡۖ;->ۢ()Ll/ۗ᩷ۖ;

    move-result-object v0

    .line 42588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42590
    iget v1, p0, Ll/᩺ۢۖ;->᩸:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42591
    invoke-virtual {v0}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v0

    iput v0, p0, Ll/᩺ۢۖ;->ۗ:I

    .line 42592
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 42236
    :cond_8
    invoke-virtual {p1}, Ll/ۧۡۖ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 42237
    invoke-virtual {p1}, Ll/ۧۡۖ;->᩷()Ll/ۗ᩷ۖ;

    move-result-object v0

    .line 42630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42632
    iget v1, p0, Ll/᩺ۢۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/᩺ۢۖ;->᩸:I

    .line 42633
    invoke-virtual {v0}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v0

    iput v0, p0, Ll/᩺ۢۖ;->ۙ:I

    .line 42634
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 42239
    :cond_9
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 42240
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method
