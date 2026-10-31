.class public final Ll/᩺۠᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ܽܶ᩻;


# instance fields
.field public bitField0_:I

.field public dataLength_:J

.field public dataOffset_:J

.field public dataSha256Hash_:Ll/ۛۜۖ;

.field public dstExtentsBuilder_:Ll/ܳۚۖ;

.field public dstExtents_:Ljava/util/List;

.field public dstLength_:J

.field public srcExtentsBuilder_:Ll/ܳۚۖ;

.field public srcExtents_:Ljava/util/List;

.field public srcLength_:J

.field public srcSha256Hash_:Ll/ۛۜۖ;

.field public type_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3935
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const/4 v0, 0x0

    .line 4255
    iput v0, p0, Ll/᩺۠᩻;->type_:I

    .line 4422
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4802
    iput-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 5105
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 5177
    iput-object v0, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺۠᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 3941
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const/4 p1, 0x0

    .line 4255
    iput p1, p0, Ll/᩺۠᩻;->type_:I

    .line 4422
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4802
    iput-object p1, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 5105
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object p1, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 5177
    iput-object p1, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩺۠᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/֫ܶ᩻;)V
    .locals 4

    .line 4023
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 4026
    iget v1, p0, Ll/᩺۠᩻;->type_:I

    invoke-static {v1, p1}, Ll/֫ܶ᩻;->-$$Nest$fputtype_(ILl/֫ܶ᩻;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 4030
    iget-wide v2, p0, Ll/᩺۠᩻;->dataOffset_:J

    invoke-static {p1, v2, v3}, Ll/֫ܶ᩻;->-$$Nest$fputdataOffset_(Ll/֫ܶ᩻;J)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    .line 4034
    iget-wide v2, p0, Ll/᩺۠᩻;->dataLength_:J

    invoke-static {p1, v2, v3}, Ll/֫ܶ᩻;->-$$Nest$fputdataLength_(Ll/֫ܶ᩻;J)V

    or-int/lit8 v1, v1, 0x4

    :cond_2
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_3

    .line 4038
    iget-wide v2, p0, Ll/᩺۠᩻;->srcLength_:J

    invoke-static {p1, v2, v3}, Ll/֫ܶ᩻;->-$$Nest$fputsrcLength_(Ll/֫ܶ᩻;J)V

    or-int/lit8 v1, v1, 0x8

    :cond_3
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_4

    .line 4042
    iget-wide v2, p0, Ll/᩺۠᩻;->dstLength_:J

    invoke-static {p1, v2, v3}, Ll/֫ܶ᩻;->-$$Nest$fputdstLength_(Ll/֫ܶ᩻;J)V

    or-int/lit8 v1, v1, 0x10

    :cond_4
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_5

    .line 4046
    iget-object v2, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    invoke-static {p1, v2}, Ll/֫ܶ᩻;->-$$Nest$fputdataSha256Hash_(Ll/֫ܶ᩻;Ll/ۛۜۖ;)V

    or-int/lit8 v1, v1, 0x20

    :cond_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_6

    .line 4050
    iget-object v0, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    invoke-static {p1, v0}, Ll/֫ܶ᩻;->-$$Nest$fputsrcSha256Hash_(Ll/֫ܶ᩻;Ll/ۛۜۖ;)V

    or-int/lit8 v1, v1, 0x40

    .line 4053
    :cond_6
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetbitField0_(Ll/֫ܶ᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {v0, p1}, Ll/֫ܶ᩻;->-$$Nest$fputbitField0_(ILl/֫ܶ᩻;)V

    return-void
.end method

.method private buildPartialRepeatedFields(Ll/֫ܶ᩻;)V
    .locals 1

    .line 4002
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 4003
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    .line 4004
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4005
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4007
    :cond_0
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/֫ܶ᩻;->-$$Nest$fputsrcExtents_(Ll/֫ܶ᩻;Ljava/util/List;)V

    goto :goto_0

    .line 4009
    :cond_1
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/֫ܶ᩻;->-$$Nest$fputsrcExtents_(Ll/֫ܶ᩻;Ljava/util/List;)V

    .line 4011
    :goto_0
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_3

    .line 4012
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_2

    .line 4013
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 4014
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4016
    :cond_2
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/֫ܶ᩻;->-$$Nest$fputdstExtents_(Ll/֫ܶ᩻;Ljava/util/List;)V

    return-void

    .line 4018
    :cond_3
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/֫ܶ᩻;->-$$Nest$fputdstExtents_(Ll/֫ܶ᩻;Ljava/util/List;)V

    return-void
.end method

.method private ensureDstExtentsIsMutable()V
    .locals 2

    .line 4804
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-nez v0, :cond_0

    .line 4805
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 4806
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method private ensureSrcExtentsIsMutable()V
    .locals 2

    .line 4424
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    .line 4425
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4426
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 3923
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method private getDstExtentsFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 5029
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 5030
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    iget v2, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 5034
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 5035
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 5036
    iput-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 5038
    :cond_1
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method

.method private getSrcExtentsFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 4721
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 4722
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    iget v2, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4726
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 4727
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 4728
    iput-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4730
    :cond_1
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method


# virtual methods
.method public addAllDstExtents(Ljava/lang/Iterable;)Ll/᩺۠᩻;
    .locals 1

    .line 4940
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4941
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4942
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 4944
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4946
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addAllSrcExtents(Ljava/lang/Iterable;)Ll/᩺۠᩻;
    .locals 1

    .line 4600
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4601
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4602
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 4604
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4606
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addDstExtents(ILl/۫۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4895
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4897
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4899
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4900
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 4901
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4903
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addDstExtents(ILl/۬۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4926
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4927
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4928
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 4929
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4931
    :cond_0
    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addDstExtents(Ll/۫۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4878
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4880
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4882
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4883
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4884
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4886
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addDstExtents(Ll/۬۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4912
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4913
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4914
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4915
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4917
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addDstExtentsBuilder()Ll/۬۠᩻;
    .locals 2

    .line 5008
    invoke-direct {p0}, Ll/᩺۠᩻;->getDstExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 5009
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    .line 5008
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public addDstExtentsBuilder(I)Ll/۬۠᩻;
    .locals 2

    .line 5016
    invoke-direct {p0}, Ll/᩺۠᩻;->getDstExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 5017
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    .line 5016
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/۬۠᩻;

    return-object p1
.end method

.method public addSrcExtents(ILl/۫۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4543
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4545
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4547
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4548
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 4549
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4551
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addSrcExtents(ILl/۬۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4582
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4583
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4584
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 4585
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4587
    :cond_0
    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addSrcExtents(Ll/۫۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4522
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4524
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4526
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4527
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4528
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4530
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addSrcExtents(Ll/۬۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4564
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4565
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4566
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4567
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4569
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addSrcExtentsBuilder()Ll/۬۠᩻;
    .locals 2

    .line 4692
    invoke-direct {p0}, Ll/᩺۠᩻;->getSrcExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 4693
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    .line 4692
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public addSrcExtentsBuilder(I)Ll/۬۠᩻;
    .locals 2

    .line 4704
    invoke-direct {p0}, Ll/᩺۠᩻;->getSrcExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 4705
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    .line 4704
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/۬۠᩻;

    return-object p1
.end method

.method public build()Ll/֫ܶ᩻;
    .locals 2

    .line 3985
    invoke-virtual {p0}, Ll/᩺۠᩻;->buildPartial()Ll/֫ܶ᩻;

    move-result-object v0

    .line 3986
    invoke-virtual {v0}, Ll/֫ܶ᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 3987
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/֫ܶ᩻;
    .locals 2

    .line 3994
    new-instance v0, Ll/֫ܶ᩻;

    invoke-direct {v0, p0}, Ll/֫ܶ᩻;-><init>(Ll/᩺۠᩻;)V

    .line 3995
    invoke-direct {p0, v0}, Ll/᩺۠᩻;->buildPartialRepeatedFields(Ll/֫ܶ᩻;)V

    .line 3996
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/᩺۠᩻;->buildPartial0(Ll/֫ܶ᩻;)V

    .line 3997
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->buildPartial()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->buildPartial()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->clear()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->clear()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->clear()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->clear()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/᩺۠᩻;
    .locals 4

    .line 3946
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 3947
    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 3948
    iput v0, p0, Ll/᩺۠᩻;->type_:I

    const-wide/16 v0, 0x0

    .line 3949
    iput-wide v0, p0, Ll/᩺۠᩻;->dataOffset_:J

    .line 3950
    iput-wide v0, p0, Ll/᩺۠᩻;->dataLength_:J

    .line 3951
    iget-object v2, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 3952
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    goto :goto_0

    .line 3954
    :cond_0
    iput-object v3, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 3955
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܽ()V

    .line 3957
    :goto_0
    iget v2, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, -0x9

    iput v2, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 3958
    iput-wide v0, p0, Ll/᩺۠᩻;->srcLength_:J

    .line 3959
    iget-object v2, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 3960
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    goto :goto_1

    .line 3962
    :cond_1
    iput-object v3, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 3963
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܽ()V

    .line 3965
    :goto_1
    iget v2, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 3966
    iput-wide v0, p0, Ll/᩺۠᩻;->dstLength_:J

    .line 3967
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 3968
    iput-object v0, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    return-object p0
.end method

.method public clearDataLength()Ll/᩺۠᩻;
    .locals 2

    .line 4415
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 4416
    iput-wide v0, p0, Ll/᩺۠᩻;->dataLength_:J

    .line 4417
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearDataOffset()Ll/᩺۠᩻;
    .locals 2

    .line 4359
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 4360
    iput-wide v0, p0, Ll/᩺۠᩻;->dataOffset_:J

    .line 4361
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearDataSha256Hash()Ll/᩺۠᩻;
    .locals 1

    .line 5171
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 5172
    invoke-static {}, Ll/֫ܶ᩻;->getDefaultInstance()Ll/֫ܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ܶ᩻;->getDataSha256Hash()Ll/ۛۜۖ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 5173
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearDstExtents()Ll/᩺۠᩻;
    .locals 1

    .line 4954
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4955
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 4956
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4957
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4959
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearDstLength()Ll/᩺۠᩻;
    .locals 2

    .line 5099
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 5100
    iput-wide v0, p0, Ll/᩺۠᩻;->dstLength_:J

    .line 5101
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSrcExtents()Ll/᩺۠᩻;
    .locals 1

    .line 4618
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4619
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4620
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4621
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4623
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearSrcLength()Ll/᩺۠᩻;
    .locals 2

    .line 4795
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 4796
    iput-wide v0, p0, Ll/᩺۠᩻;->srcLength_:J

    .line 4797
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSrcSha256Hash()Ll/᩺۠᩻;
    .locals 1

    .line 5235
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 5236
    invoke-static {}, Ll/֫ܶ᩻;->getDefaultInstance()Ll/֫ܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ܶ᩻;->getSrcSha256Hash()Ll/ۛۜۖ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    .line 5237
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearType()Ll/᩺۠᩻;
    .locals 1

    .line 4291
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 4292
    iput v0, p0, Ll/᩺۠᩻;->type_:I

    .line 4293
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getDataLength()J
    .locals 2

    .line 4388
    iget-wide v0, p0, Ll/᩺۠᩻;->dataLength_:J

    return-wide v0
.end method

.method public getDataOffset()J
    .locals 2

    .line 4326
    iget-wide v0, p0, Ll/᩺۠᩻;->dataOffset_:J

    return-wide v0
.end method

.method public getDataSha256Hash()Ll/ۛۜۖ;
    .locals 1

    .line 5136
    iget-object v0, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/֫ܶ᩻;
    .locals 1

    .line 3980
    invoke-static {}, Ll/֫ܶ᩻;->getDefaultInstance()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->getDefaultInstanceForType()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 3917
    invoke-virtual {p0}, Ll/᩺۠᩻;->getDefaultInstanceForType()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 3975
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getDstExtents(I)Ll/۫۠᩻;
    .locals 1

    .line 4837
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4838
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫۠᩻;

    return-object p1

    .line 4840
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/۫۠᩻;

    return-object p1
.end method

.method public getDstExtentsBuilder(I)Ll/۬۠᩻;
    .locals 1

    .line 4981
    invoke-direct {p0}, Ll/᩺۠᩻;->getDstExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/۬۠᩻;

    return-object p1
.end method

.method public getDstExtentsBuilderList()Ljava/util/List;
    .locals 1

    .line 5024
    invoke-direct {p0}, Ll/᩺۠᩻;->getDstExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getDstExtentsCount()I
    .locals 1

    .line 4827
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4828
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 4830
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getDstExtentsList()Ljava/util/List;
    .locals 1

    .line 4817
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4818
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 4820
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getDstExtentsOrBuilder(I)Ll/ۛ۠᩻;
    .locals 1

    .line 4988
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4989
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ۠᩻;

    return-object p1

    .line 4990
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/ۛ۠᩻;

    return-object p1
.end method

.method public getDstExtentsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 4998
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 4999
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 5001
    :cond_0
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getDstLength()J
    .locals 2

    .line 5068
    iget-wide v0, p0, Ll/᩺۠᩻;->dstLength_:J

    return-wide v0
.end method

.method public getSrcExtents(I)Ll/۫۠᩻;
    .locals 1

    .line 4469
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4470
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫۠᩻;

    return-object p1

    .line 4472
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/۫۠᩻;

    return-object p1
.end method

.method public getSrcExtentsBuilder(I)Ll/۬۠᩻;
    .locals 1

    .line 4653
    invoke-direct {p0}, Ll/᩺۠᩻;->getSrcExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/۬۠᩻;

    return-object p1
.end method

.method public getSrcExtentsBuilderList()Ljava/util/List;
    .locals 1

    .line 4716
    invoke-direct {p0}, Ll/᩺۠᩻;->getSrcExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSrcExtentsCount()I
    .locals 1

    .line 4455
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4456
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 4458
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getSrcExtentsList()Ljava/util/List;
    .locals 1

    .line 4441
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4442
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 4444
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSrcExtentsOrBuilder(I)Ll/ۛ۠᩻;
    .locals 1

    .line 4664
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4665
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ۠᩻;

    return-object p1

    .line 4666
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/ۛ۠᩻;

    return-object p1
.end method

.method public getSrcExtentsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 4678
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 4679
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 4681
    :cond_0
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSrcLength()J
    .locals 2

    .line 4762
    iget-wide v0, p0, Ll/᩺۠᩻;->srcLength_:J

    return-wide v0
.end method

.method public getSrcSha256Hash()Ll/ۛۜۖ;
    .locals 1

    .line 5204
    iget-object v0, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getType()Ll/۟۠᩻;
    .locals 1

    .line 4269
    iget v0, p0, Ll/᩺۠᩻;->type_:I

    invoke-static {v0}, Ll/۟۠᩻;->forNumber(I)Ll/۟۠᩻;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4270
    sget-object v0, Ll/۟۠᩻;->REPLACE:Ll/۟۠᩻;

    :cond_0
    return-object v0
.end method

.method public hasDataLength()Z
    .locals 1

    .line 4376
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasDataOffset()Z
    .locals 1

    .line 4311
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasDataSha256Hash()Z
    .locals 1

    .line 5120
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasDstLength()Z
    .locals 1

    .line 5054
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcLength()Z
    .locals 1

    .line 4747
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcSha256Hash()Z
    .locals 1

    .line 5190
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasType()Z
    .locals 2

    .line 4261
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 3929
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֫ܶ᩻;

    const-class v2, Ll/᩺۠᩻;

    .line 3930
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 4148
    invoke-virtual {p0}, Ll/᩺۠᩻;->hasType()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 3917
    invoke-virtual {p0, p1, p2}, Ll/᩺۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 3917
    invoke-virtual {p0, p1, p2}, Ll/᩺۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 3917
    invoke-virtual {p0, p1, p2}, Ll/᩺۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 3917
    invoke-virtual {p0, p1}, Ll/᩺۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 3917
    invoke-virtual {p0, p1, p2}, Ll/᩺۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 3917
    invoke-virtual {p0, p1}, Ll/᩺۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/֫ܶ᩻;)Ll/᩺۠᩻;
    .locals 4

    .line 4067
    invoke-static {}, Ll/֫ܶ᩻;->getDefaultInstance()Ll/֫ܶ᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 4068
    :cond_0
    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasType()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4069
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩺۠᩻;->setType(Ll/۟۠᩻;)Ll/᩺۠᩻;

    .line 4071
    :cond_1
    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDataOffset()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4072
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDataOffset()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/᩺۠᩻;->setDataOffset(J)Ll/᩺۠᩻;

    .line 4074
    :cond_2
    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDataLength()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4075
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/᩺۠᩻;->setDataLength(J)Ll/᩺۠᩻;

    .line 4077
    :cond_3
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    .line 4078
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetsrcExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 4079
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4080
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetsrcExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4081
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    goto :goto_0

    .line 4083
    :cond_4
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4084
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetsrcExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4086
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 4089
    :cond_5
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetsrcExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 4090
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 4091
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 4092
    iput-object v1, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    .line 4093
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetsrcExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    .line 4094
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4096
    invoke-static {}, Ll/֫ܶ᩻;->access$100()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4097
    invoke-direct {p0}, Ll/᩺۠᩻;->getSrcExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    goto :goto_1

    :cond_6
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    goto :goto_2

    .line 4099
    :cond_7
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetsrcExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 4103
    :cond_8
    :goto_2
    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasSrcLength()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 4104
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getSrcLength()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ll/᩺۠᩻;->setSrcLength(J)Ll/᩺۠᩻;

    .line 4106
    :cond_9
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_b

    .line 4107
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetdstExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 4108
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 4109
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetdstExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 4110
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    goto :goto_3

    .line 4112
    :cond_a
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4113
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetdstExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4115
    :goto_3
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_4

    .line 4118
    :cond_b
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetdstExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 4119
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 4120
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 4121
    iput-object v1, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    .line 4122
    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetdstExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    .line 4123
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4125
    invoke-static {}, Ll/֫ܶ᩻;->access$200()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 4126
    invoke-direct {p0}, Ll/᩺۠᩻;->getDstExtentsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v1

    :cond_c
    iput-object v1, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    goto :goto_4

    .line 4128
    :cond_d
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/֫ܶ᩻;->-$$Nest$fgetdstExtents_(Ll/֫ܶ᩻;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 4132
    :cond_e
    :goto_4
    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDstLength()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 4133
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDstLength()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/᩺۠᩻;->setDstLength(J)Ll/᩺۠᩻;

    .line 4135
    :cond_f
    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDataSha256Hash()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 4136
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDataSha256Hash()Ll/ۛۜۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩺۠᩻;->setDataSha256Hash(Ll/ۛۜۖ;)Ll/᩺۠᩻;

    .line 4138
    :cond_10
    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasSrcSha256Hash()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 4139
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getSrcSha256Hash()Ll/ۛۜۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩺۠᩻;->setSrcSha256Hash(Ll/ۛۜۖ;)Ll/᩺۠᩻;

    .line 4141
    :cond_11
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 4142
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩺۠᩻;
    .locals 5

    .line 4160
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_e

    .line 4165
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_d

    const/16 v3, 0x8

    if-eq v1, v3, :cond_b

    const/16 v2, 0x10

    if-eq v1, v2, :cond_a

    const/16 v3, 0x18

    if-eq v1, v3, :cond_9

    const/16 v3, 0x22

    if-eq v1, v3, :cond_7

    const/16 v3, 0x28

    if-eq v1, v3, :cond_6

    const/16 v2, 0x32

    if-eq v1, v2, :cond_4

    const/16 v2, 0x38

    if-eq v1, v2, :cond_3

    const/16 v2, 0x42

    if-eq v1, v2, :cond_2

    const/16 v2, 0x4a

    if-eq v1, v2, :cond_1

    .line 4239
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 4234
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    .line 4235
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x100

    iput v1, p0, Ll/᩺۠᩻;->bitField0_:I

    goto :goto_0

    .line 4229
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 4230
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x80

    iput v1, p0, Ll/᩺۠᩻;->bitField0_:I

    goto :goto_0

    .line 4224
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/᩺۠᩻;->dstLength_:J

    .line 4225
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Ll/᩺۠᩻;->bitField0_:I

    goto :goto_0

    .line 4213
    :cond_4
    invoke-static {}, Ll/۫۠᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 4212
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/۫۠᩻;

    .line 4215
    iget-object v2, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_5

    .line 4216
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4217
    iget-object v2, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4219
    :cond_5
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 4206
    :cond_6
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v3

    iput-wide v3, p0, Ll/᩺۠᩻;->srcLength_:J

    .line 4207
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Ll/᩺۠᩻;->bitField0_:I

    goto/16 :goto_0

    .line 4195
    :cond_7
    invoke-static {}, Ll/۫۠᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 4194
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/۫۠᩻;

    .line 4197
    iget-object v2, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_8

    .line 4198
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4199
    iget-object v2, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 4201
    :cond_8
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto/16 :goto_0

    .line 4188
    :cond_9
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/᩺۠᩻;->dataLength_:J

    .line 4189
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/᩺۠᩻;->bitField0_:I

    goto/16 :goto_0

    .line 4183
    :cond_a
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/᩺۠᩻;->dataOffset_:J

    .line 4184
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/᩺۠᩻;->bitField0_:I

    goto/16 :goto_0

    .line 4171
    :cond_b
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۜ()I

    move-result v1

    .line 4173
    invoke-static {v1}, Ll/۟۠᩻;->forNumber(I)Ll/۟۠᩻;

    move-result-object v3

    if-nez v3, :cond_c

    .line 4175
    invoke-virtual {p0, v2, v1}, Ll/᩶ۘۖ;->mergeUnknownVarintField(II)V

    goto/16 :goto_0

    .line 4177
    :cond_c
    iput v1, p0, Ll/᩺۠᩻;->type_:I

    .line 4178
    iget v1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Ll/᩺۠᩻;->bitField0_:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_d
    :goto_1
    const/4 v0, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 4247
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4249
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 4250
    throw p1

    .line 4249
    :cond_e
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/᩺۠᩻;
    .locals 1

    .line 4058
    instance-of v0, p1, Ll/֫ܶ᩻;

    if-eqz v0, :cond_0

    .line 4059
    check-cast p1, Ll/֫ܶ᩻;

    invoke-virtual {p0, p1}, Ll/᩺۠᩻;->mergeFrom(Ll/֫ܶ᩻;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1

    .line 4061
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public removeDstExtents(I)Ll/᩺۠᩻;
    .locals 1

    .line 4967
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4968
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4969
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 4970
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4972
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public removeSrcExtents(I)Ll/᩺۠᩻;
    .locals 1

    .line 4635
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4636
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4637
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 4638
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4640
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public setDataLength(J)Ll/᩺۠᩻;
    .locals 0

    .line 4401
    iput-wide p1, p0, Ll/᩺۠᩻;->dataLength_:J

    .line 4402
    iget p1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4403
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setDataOffset(J)Ll/᩺۠᩻;
    .locals 0

    .line 4342
    iput-wide p1, p0, Ll/᩺۠᩻;->dataOffset_:J

    .line 4343
    iget p1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4344
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setDataSha256Hash(Ll/ۛۜۖ;)Ll/᩺۠᩻;
    .locals 0

    .line 5152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5153
    iput-object p1, p0, Ll/᩺۠᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 5154
    iget p1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 5155
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setDstExtents(ILl/۫۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4848
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4850
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4852
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4853
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4854
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4856
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setDstExtents(ILl/۬۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4865
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4866
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureDstExtentsIsMutable()V

    .line 4867
    iget-object v0, p0, Ll/᩺۠᩻;->dstExtents_:Ljava/util/List;

    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4868
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4870
    :cond_0
    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setDstLength(J)Ll/᩺۠᩻;
    .locals 0

    .line 5083
    iput-wide p1, p0, Ll/᩺۠᩻;->dstLength_:J

    .line 5084
    iget p1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 5085
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSrcExtents(ILl/۫۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4484
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4486
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4488
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4489
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4490
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4492
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setSrcExtents(ILl/۬۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4505
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtentsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 4506
    invoke-direct {p0}, Ll/᩺۠᩻;->ensureSrcExtentsIsMutable()V

    .line 4507
    iget-object v0, p0, Ll/᩺۠᩻;->srcExtents_:Ljava/util/List;

    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4508
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 4510
    :cond_0
    invoke-virtual {p2}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setSrcLength(J)Ll/᩺۠᩻;
    .locals 0

    .line 4778
    iput-wide p1, p0, Ll/᩺۠᩻;->srcLength_:J

    .line 4779
    iget p1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4780
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSrcSha256Hash(Ll/ۛۜۖ;)Ll/᩺۠᩻;
    .locals 0

    .line 5218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5219
    iput-object p1, p0, Ll/᩺۠᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    .line 5220
    iget p1, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 5221
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setType(Ll/۟۠᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 4279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4281
    iget v0, p0, Ll/᩺۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩺۠᩻;->bitField0_:I

    .line 4282
    invoke-virtual {p1}, Ll/۟۠᩻;->getNumber()I

    move-result p1

    iput p1, p0, Ll/᩺۠᩻;->type_:I

    .line 4283
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
