.class public final Ll/ܽۢۖ;
.super Ll/᩶ۘۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ۗ:Ll/᩻ۢۖ;

.field public ۙ:Ll/ܺۚۖ;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17917
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const-string v0, ""

    .line 18082
    iput-object v0, p0, Ll/ܽۢۖ;->᩹:Ljava/lang/Object;

    .line 17927
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 17929
    invoke-direct {p0}, Ll/ܽۢۖ;->ܽ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 17899
    invoke-direct {p0}, Ll/ܽۢۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 17923
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const-string p1, ""

    .line 18082
    iput-object p1, p0, Ll/ܽۢۖ;->᩹:Ljava/lang/Object;

    .line 17927
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 17929
    invoke-direct {p0}, Ll/ܽۢۖ;->ܽ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method private ܽ()Ll/ܺۚۖ;
    .locals 4

    .line 18312
    iget-object v0, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 18313
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 18218
    iget-object v0, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/᩻ۢۖ;->getDefaultInstance()Ll/᩻ۢۖ;

    move-result-object v0

    goto :goto_0

    .line 18220
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/᩻ۢۖ;

    .line 18316
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 18317
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 18318
    iput-object v0, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    .line 18320
    :cond_2
    iget-object v0, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 17959
    invoke-virtual {p0}, Ll/ܽۢۖ;->buildPartial()Ll/ᩳۢۖ;

    move-result-object v0

    .line 17960
    invoke-virtual {v0}, Ll/ᩳۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 17961
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 17959
    invoke-virtual {p0}, Ll/ܽۢۖ;->buildPartial()Ll/ᩳۢۖ;

    move-result-object v0

    .line 17960
    invoke-virtual {v0}, Ll/ᩳۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 17961
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 17899
    invoke-virtual {p0}, Ll/ܽۢۖ;->buildPartial()Ll/ᩳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/ᩳۢۖ;
    .locals 4

    .line 17968
    new-instance v0, Ll/ᩳۢۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ᩳۢۖ;-><init>(Ll/ܽۢۖ;I)V

    .line 17969
    iget v2, p0, Ll/ܽۢۖ;->᩸:I

    if-eqz v2, :cond_4

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    .line 17978
    iget-object v1, p0, Ll/ܽۢۖ;->᩹:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/ᩳۢۖ;->֫(Ll/ᩳۢۖ;Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_0
    and-int/lit8 v3, v2, 0x2

    if-eqz v3, :cond_1

    .line 17982
    iget v3, p0, Ll/ܽۢۖ;->᩶:I

    invoke-static {v0, v3}, Ll/ᩳۢۖ;->֫(Ll/ᩳۢۖ;I)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_3

    .line 17986
    iget-object v2, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v2, :cond_2

    .line 17987
    iget-object v2, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    goto :goto_0

    .line 17988
    :cond_2
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/᩻ۢۖ;

    .line 17986
    :goto_0
    invoke-static {v0, v2}, Ll/ᩳۢۖ;->֫(Ll/ᩳۢۖ;Ll/᩻ۢۖ;)V

    or-int/lit8 v1, v1, 0x4

    .line 17991
    :cond_3
    invoke-static {v0, v1}, Ll/ᩳۢۖ;->ۧ(Ll/ᩳۢۖ;I)V

    .line 17970
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 17899
    invoke-virtual {p0}, Ll/ܽۢۖ;->buildPartial()Ll/ᩳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0}, Ll/ܽۢۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0}, Ll/ܽۢۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0}, Ll/ܽۢۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0}, Ll/ܽۢۖ;->֫()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 17954
    invoke-static {}, Ll/ᩳۢۖ;->getDefaultInstance()Ll/ᩳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 17954
    invoke-static {}, Ll/ᩳۢۖ;->getDefaultInstance()Ll/ᩳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 17949
    invoke-static {}, Ll/ۧۖۖ;->ܿ()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 17911
    invoke-static {}, Ll/ۧۖۖ;->ܳ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ᩳۢۖ;

    const-class v2, Ll/ܽۢۖ;

    .line 17912
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 18210
    iget v0, p0, Ll/ܽۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    .line 18217
    iget-object v0, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 18218
    iget-object v0, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/᩻ۢۖ;->getDefaultInstance()Ll/᩻ۢۖ;

    move-result-object v0

    goto :goto_0

    .line 18220
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/᩻ۢۖ;

    .line 18025
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/᩻ۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0, p1, p2}, Ll/ܽۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܽۢۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0, p1, p2}, Ll/ܽۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܽۢۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0, p1, p2}, Ll/ܽۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܽۢۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 17996
    instance-of v0, p1, Ll/ᩳۢۖ;

    if-eqz v0, :cond_0

    .line 17997
    check-cast p1, Ll/ᩳۢۖ;

    invoke-virtual {p0, p1}, Ll/ܽۢۖ;->֫(Ll/ᩳۢۖ;)V

    return-object p0

    .line 17999
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܽۢۖ;
    .locals 3

    .line 18038
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_5

    .line 18043
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_4

    const/16 v2, 0xa

    if-eq v1, v2, :cond_3

    const/16 v2, 0x10

    if-eq v1, v2, :cond_2

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_1

    .line 18066
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 18060
    :cond_1
    invoke-direct {p0}, Ll/ܽۢۖ;->ܽ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 18059
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 18062
    iget v1, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ܽۢۖ;->᩸:I

    goto :goto_0

    .line 18054
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܺ()I

    move-result v1

    iput v1, p0, Ll/ܽۢۖ;->᩶:I

    .line 18055
    iget v1, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ܽۢۖ;->᩸:I

    goto :goto_0

    .line 18049
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ܽۢۖ;->᩹:Ljava/lang/Object;

    .line 18050
    iget v1, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܽۢۖ;->᩸:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_4
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 18074
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18076
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18077
    throw p1

    .line 18076
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 17899
    invoke-virtual {p0, p1, p2}, Ll/ܽۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܽۢۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 17996
    instance-of v0, p1, Ll/ᩳۢۖ;

    if-eqz v0, :cond_0

    .line 17997
    check-cast p1, Ll/ᩳۢۖ;

    invoke-virtual {p0, p1}, Ll/ܽۢۖ;->֫(Ll/ᩳۢۖ;)V

    return-object p0

    .line 17999
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫()V
    .locals 2

    .line 17934
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 17935
    iput v0, p0, Ll/ܽۢۖ;->᩸:I

    const-string v1, ""

    .line 17936
    iput-object v1, p0, Ll/ܽۢۖ;->᩹:Ljava/lang/Object;

    .line 17937
    iput v0, p0, Ll/ܽۢۖ;->᩶:I

    const/4 v0, 0x0

    .line 17938
    iput-object v0, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    .line 17939
    iget-object v1, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 17940
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 17941
    iput-object v0, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 18186
    iput p1, p0, Ll/ܽۢۖ;->᩶:I

    .line 18187
    iget p1, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ܽۢۖ;->᩸:I

    .line 18188
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 18132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18133
    iput-object p1, p0, Ll/ܽۢۖ;->᩹:Ljava/lang/Object;

    .line 18134
    iget p1, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܽۢۖ;->᩸:I

    .line 18135
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/ᩳۢۖ;)V
    .locals 3

    .line 18005
    invoke-static {}, Ll/ᩳۢۖ;->getDefaultInstance()Ll/ᩳۢۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 18006
    :cond_0
    invoke-virtual {p1}, Ll/ᩳۢۖ;->hasName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18007
    invoke-static {p1}, Ll/ᩳۢۖ;->֫(Ll/ᩳۢۖ;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢۖ;->᩹:Ljava/lang/Object;

    .line 18008
    iget v0, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽۢۖ;->᩸:I

    .line 18009
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18011
    :cond_1
    invoke-virtual {p1}, Ll/ᩳۢۖ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18012
    invoke-virtual {p1}, Ll/ᩳۢۖ;->ۜ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܽۢۖ;->֫(I)V

    .line 18014
    :cond_2
    invoke-virtual {p1}, Ll/ᩳۢۖ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 18015
    invoke-virtual {p1}, Ll/ᩳۢۖ;->᩷()Ll/᩻ۢۖ;

    move-result-object v0

    .line 18257
    iget-object v1, p0, Ll/ܽۢۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v1, :cond_4

    .line 18258
    iget v1, p0, Ll/ܽۢۖ;->᩸:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    if-eqz v1, :cond_3

    .line 18260
    invoke-static {}, Ll/᩻ۢۖ;->getDefaultInstance()Ll/᩻ۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_3

    .line 18291
    iget v1, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ܽۢۖ;->᩸:I

    .line 18292
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18293
    invoke-direct {p0}, Ll/ܽۢۖ;->ܽ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/ܳۢۖ;

    .line 18261
    invoke-virtual {v1, v0}, Ll/ܳۢۖ;->֫(Ll/᩻ۢۖ;)V

    goto :goto_0

    .line 18263
    :cond_3
    iput-object v0, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    goto :goto_0

    .line 18266
    :cond_4
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 18268
    :goto_0
    iget-object v0, p0, Ll/ܽۢۖ;->ۗ:Ll/᩻ۢۖ;

    if-eqz v0, :cond_5

    .line 18269
    iget v0, p0, Ll/ܽۢۖ;->᩸:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ܽۢۖ;->᩸:I

    .line 18270
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18017
    :cond_5
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 18018
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method
