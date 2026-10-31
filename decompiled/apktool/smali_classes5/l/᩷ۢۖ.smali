.class public final Ll/᩷ۢۖ;
.super Ll/ۗۘۖ;
.source "T9Q9"


# instance fields
.field public ۗ:Ll/ܺۚۖ;

.field public ۙ:Ljava/util/List;

.field public ۛ:I

.field public ۤ:Ljava/util/List;

.field public ۫:Ll/ܳۚۖ;

.field public ۬:Ll/ۛۢۖ;

.field public ᩶:Ll/ܳۚۖ;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11143
    invoke-direct {p0}, Ll/ۗۘۖ;-><init>()V

    .line 11426
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11666
    iput-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    const/4 v0, 0x1

    .line 12026
    iput v0, p0, Ll/᩷ۢۖ;->ۛ:I

    .line 11153
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 11155
    invoke-direct {p0}, Ll/᩷ۢۖ;->ܳ()Ll/ܳۚۖ;

    .line 11156
    invoke-direct {p0}, Ll/᩷ۢۖ;->ᩳ()Ll/ܳۚۖ;

    .line 11157
    invoke-direct {p0}, Ll/᩷ۢۖ;->ܿ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 11124
    invoke-direct {p0}, Ll/᩷ۢۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 1223
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 11426
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11666
    iput-object p1, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    const/4 p1, 0x1

    .line 12026
    iput p1, p0, Ll/᩷ۢۖ;->ۛ:I

    .line 11153
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 11155
    invoke-direct {p0}, Ll/᩷ۢۖ;->ܳ()Ll/ܳۚۖ;

    .line 11156
    invoke-direct {p0}, Ll/᩷ۢۖ;->ᩳ()Ll/ܳۚۖ;

    .line 11157
    invoke-direct {p0}, Ll/᩷ۢۖ;->ܿ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method private ܳ()Ll/ܳۚۖ;
    .locals 5

    .line 11653
    iget-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 11654
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    iget v2, p0, Ll/᩷ۢۖ;->᩹:I

    const/4 v3, 0x1

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 11658
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 11659
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v3, v2, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 11660
    iput-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11662
    :cond_1
    iget-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ܿ()Ll/ܺۚۖ;
    .locals 4

    .line 12015
    iget-object v0, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 12016
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 11921
    iget-object v0, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 11923
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 12019
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 12020
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 12021
    iput-object v0, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    .line 12023
    :cond_2
    iget-object v0, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܳۚۖ;
    .locals 5

    .line 11893
    iget-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 11894
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    iget v2, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 11898
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 11899
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 11900
    iput-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    .line 11902
    :cond_1
    iget-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 11200
    invoke-virtual {p0}, Ll/᩷ۢۖ;->buildPartial()Ll/ᩴۢۖ;

    move-result-object v0

    .line 11201
    invoke-virtual {v0}, Ll/ᩴۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 11202
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 11200
    invoke-virtual {p0}, Ll/᩷ۢۖ;->buildPartial()Ll/ᩴۢۖ;

    move-result-object v0

    .line 11201
    invoke-virtual {v0}, Ll/ᩴۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 11202
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 11124
    invoke-virtual {p0}, Ll/᩷ۢۖ;->buildPartial()Ll/ᩴۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/ᩴۢۖ;
    .locals 4

    .line 11209
    new-instance v0, Ll/ᩴۢۖ;

    invoke-direct {v0, p0}, Ll/ᩴۢۖ;-><init>(Ll/᩷ۢۖ;)V

    .line 11217
    iget-object v1, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    const/4 v2, 0x1

    if-nez v1, :cond_1

    .line 11218
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    .line 11219
    iget-object v1, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11220
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11222
    :cond_0
    iget-object v1, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;Ljava/util/List;)V

    goto :goto_0

    .line 11224
    :cond_1
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;Ljava/util/List;)V

    .line 11226
    :goto_0
    iget-object v1, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    if-nez v1, :cond_3

    .line 11227
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_2

    .line 11228
    iget-object v1, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    .line 11229
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11231
    :cond_2
    iget-object v1, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;Ljava/util/List;)V

    goto :goto_1

    .line 11233
    :cond_3
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;Ljava/util/List;)V

    .line 11211
    :goto_1
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    if-eqz v1, :cond_7

    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_5

    .line 11241
    iget-object v3, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v3, :cond_4

    .line 11242
    iget-object v3, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    goto :goto_2

    .line 11243
    :cond_4
    invoke-virtual {v3}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v3

    check-cast v3, Ll/ۛۢۖ;

    .line 11241
    :goto_2
    invoke-static {v0, v3}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;Ll/ۛۢۖ;)V

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_6

    .line 11247
    iget v1, p0, Ll/᩷ۢۖ;->ۛ:I

    invoke-static {v0, v1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;I)V

    or-int/lit8 v2, v2, 0x2

    .line 11250
    :cond_6
    invoke-static {v0, v2}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;I)V

    .line 11212
    :cond_7
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 11124
    invoke-virtual {p0}, Ll/᩷ۢۖ;->buildPartial()Ll/ᩴۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۗۘۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0}, Ll/᩷ۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0}, Ll/᩷ۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0}, Ll/᩷ۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0}, Ll/᩷ۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0}, Ll/᩷ۢۖ;->ܽ()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 11195
    invoke-static {}, Ll/ᩴۢۖ;->getDefaultInstance()Ll/ᩴۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 11195
    invoke-static {}, Ll/ᩴۢۖ;->getDefaultInstance()Ll/ᩴۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 11190
    invoke-static {}, Ll/ۧۖۖ;->֡֫()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 11137
    invoke-static {}, Ll/ۧۖۖ;->ۚ֫()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ᩴۢۖ;

    const-class v2, Ll/᩷ۢۖ;

    .line 11138
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 11451
    :goto_0
    iget-object v2, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    if-nez v2, :cond_0

    .line 11452
    iget-object v2, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_1

    .line 11454
    :cond_0
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܳ()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_3

    .line 11461
    iget-object v2, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 11462
    iget-object v2, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    goto :goto_2

    .line 11464
    :cond_1
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    .line 11332
    :goto_2
    invoke-virtual {v2}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11913
    :cond_3
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_6

    .line 11920
    iget-object v1, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v1, :cond_4

    .line 11921
    iget-object v1, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    if-nez v1, :cond_5

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v1

    goto :goto_3

    .line 11923
    :cond_4
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v1

    check-cast v1, Ll/ۛۢۖ;

    .line 11337
    :cond_5
    :goto_3
    invoke-virtual {v1}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    .line 11341
    :cond_6
    invoke-virtual {p0}, Ll/ۗۘۖ;->֫()Z

    move-result v1

    if-nez v1, :cond_7

    :goto_4
    return v0

    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0, p1, p2}, Ll/᩷ۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۢۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0, p1, p2}, Ll/᩷ۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۢۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0, p1, p2}, Ll/᩷ۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۢۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 11255
    instance-of v0, p1, Ll/ᩴۢۖ;

    if-eqz v0, :cond_0

    .line 11256
    check-cast p1, Ll/ᩴۢۖ;

    invoke-virtual {p0, p1}, Ll/᩷ۢۖ;->֫(Ll/ᩴۢۖ;)V

    return-object p0

    .line 11258
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 11124
    invoke-virtual {p0, p1, p2}, Ll/᩷ۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۢۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 11255
    instance-of v0, p1, Ll/ᩴۢۖ;

    if-eqz v0, :cond_0

    .line 11256
    check-cast p1, Ll/ᩴۢۖ;

    invoke-virtual {p0, p1}, Ll/᩷ۢۖ;->֫(Ll/ᩴۢۖ;)V

    return-object p0

    .line 11258
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۢۖ;
    .locals 4

    .line 11353
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_b

    .line 11358
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_a

    const/16 v2, 0x12

    if-eq v1, v2, :cond_7

    const/16 v2, 0x18

    if-eq v1, v2, :cond_5

    const/16 v2, 0x192

    if-eq v1, v2, :cond_4

    const/16 v2, 0x1f3a

    if-eq v1, v2, :cond_1

    .line 11409
    invoke-virtual {p0, p1, p2, v1}, Ll/ۗۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 11398
    :cond_1
    invoke-static {}, Ll/֫ۖۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 11397
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۖۖ;

    .line 11400
    iget-object v2, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 11428
    iget v2, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_2

    .line 11429
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11430
    iget v2, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11402
    :cond_2
    iget-object v2, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 11404
    :cond_3
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 11390
    :cond_4
    invoke-direct {p0}, Ll/᩷ۢۖ;->ܿ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 11389
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 11392
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/᩷ۢۖ;->᩹:I

    goto :goto_0

    .line 11377
    :cond_5
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۜ()I

    move-result v1

    .line 11379
    invoke-static {v1}, Ll/ۘۢۖ;->֫(I)Ll/ۘۢۖ;

    move-result-object v2

    if-nez v2, :cond_6

    const/4 v2, 0x3

    .line 11381
    invoke-virtual {p0, v2, v1}, Ll/᩶ۘۖ;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 11383
    :cond_6
    iput v1, p0, Ll/᩷ۢۖ;->ۛ:I

    .line 11384
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/᩷ۢۖ;->᩹:I

    goto :goto_0

    .line 11366
    :cond_7
    invoke-static {}, Ll/ܺۢۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 11365
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/ܺۢۖ;

    .line 11368
    iget-object v2, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    if-nez v2, :cond_9

    .line 11668
    iget v2, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_8

    .line 11669
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    .line 11670
    iget v2, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11370
    :cond_8
    iget-object v2, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 11372
    :cond_9
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_a
    :goto_1
    const/4 v0, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 11417
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11419
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 11420
    throw p1

    .line 11419
    :cond_b
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public final ֫(Ll/ᩴۢۖ;)V
    .locals 3

    .line 11264
    invoke-static {}, Ll/ᩴۢۖ;->getDefaultInstance()Ll/ᩴۢۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 11265
    :cond_0
    iget-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 11266
    invoke-static {p1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 11267
    iget-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11268
    invoke-static {p1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11269
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    goto :goto_0

    .line 11428
    :cond_1
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    .line 11429
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11430
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11272
    :cond_2
    iget-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    invoke-static {p1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11274
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 11277
    :cond_3
    invoke-static {p1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 11278
    iget-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11279
    iget-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 11280
    iput-object v1, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    .line 11281
    invoke-static {p1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11282
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11284
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_4

    .line 11285
    invoke-direct {p0}, Ll/᩷ۢۖ;->ܳ()Ll/ܳۚۖ;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    goto :goto_2

    .line 11287
    :cond_5
    iget-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ᩴۢۖ;->֫(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 11291
    :cond_6
    :goto_2
    iget-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    if-nez v0, :cond_9

    .line 11292
    invoke-static {p1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 11293
    iget-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 11294
    invoke-static {p1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    .line 11295
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    goto :goto_3

    .line 11668
    :cond_7
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_8

    .line 11669
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    .line 11670
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11298
    :cond_8
    iget-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    invoke-static {p1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11300
    :goto_3
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_4

    .line 11303
    :cond_9
    invoke-static {p1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 11304
    iget-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 11305
    iget-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 11306
    iput-object v1, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    .line 11307
    invoke-static {p1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    .line 11308
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11310
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_a

    .line 11311
    invoke-direct {p0}, Ll/᩷ۢۖ;->ᩳ()Ll/ܳۚۖ;

    move-result-object v1

    :cond_a
    iput-object v1, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    goto :goto_4

    .line 11313
    :cond_b
    iget-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ᩴۢۖ;->ۧ(Ll/ᩴۢۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 11317
    :cond_c
    :goto_4
    invoke-virtual {p1}, Ll/ᩴۢۖ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 11318
    invoke-virtual {p1}, Ll/ᩴۢۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v0

    .line 11960
    iget-object v1, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v1, :cond_e

    .line 11961
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_d

    iget-object v1, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    if-eqz v1, :cond_d

    .line 11963
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_d

    .line 11994
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11995
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 11996
    invoke-direct {p0}, Ll/᩷ۢۖ;->ܿ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/֡ۢۖ;

    .line 11964
    invoke-virtual {v1, v0}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    goto :goto_5

    .line 11966
    :cond_d
    iput-object v0, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    goto :goto_5

    .line 11969
    :cond_e
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 11971
    :goto_5
    iget-object v0, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    if-eqz v0, :cond_f

    .line 11972
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11973
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 11320
    :cond_f
    invoke-virtual {p1}, Ll/ᩴۢۖ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 11321
    invoke-virtual {p1}, Ll/ᩴۢۖ;->ܺ()Ll/ۘۢۖ;

    move-result-object v0

    .line 12050
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12052
    iget v1, p0, Ll/᩷ۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/᩷ۢۖ;->᩹:I

    .line 12053
    invoke-virtual {v0}, Ll/ۘۢۖ;->getNumber()I

    move-result v0

    iput v0, p0, Ll/᩷ۢۖ;->ۛ:I

    .line 12054
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 11323
    :cond_10
    invoke-virtual {p0, p1}, Ll/ۗۘۖ;->֫(Ll/۫ۘۖ;)V

    .line 11324
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 11325
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 11162
    invoke-super {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    const/4 v0, 0x0

    .line 11163
    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11164
    iget-object v0, p0, Ll/᩷ۢۖ;->۫:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 11165
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    goto :goto_0

    .line 11167
    :cond_0
    iput-object v1, p0, Ll/᩷ۢۖ;->ۤ:Ljava/util/List;

    .line 11168
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 11170
    :goto_0
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11171
    iget-object v0, p0, Ll/᩷ۢۖ;->᩶:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 11172
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    goto :goto_1

    .line 11174
    :cond_1
    iput-object v1, p0, Ll/᩷ۢۖ;->ۙ:Ljava/util/List;

    .line 11175
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 11177
    :goto_1
    iget v0, p0, Ll/᩷ۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/᩷ۢۖ;->᩹:I

    .line 11178
    iput-object v1, p0, Ll/᩷ۢۖ;->۬:Ll/ۛۢۖ;

    .line 11179
    iget-object v0, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    if-eqz v0, :cond_2

    .line 11180
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 11181
    iput-object v1, p0, Ll/᩷ۢۖ;->ۗ:Ll/ܺۚۖ;

    :cond_2
    const/4 v0, 0x1

    .line 11183
    iput v0, p0, Ll/᩷ۢۖ;->ۛ:I

    return-void
.end method
