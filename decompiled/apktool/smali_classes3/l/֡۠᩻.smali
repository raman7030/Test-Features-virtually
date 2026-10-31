.class public final Ll/֡۠᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/۠۠᩻;


# instance fields
.field public bitField0_:I

.field public name_:Ljava/lang/Object;

.field public partitionNames_:Ll/ۖ᩵ۖ;

.field public size_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12588
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const-string v0, ""

    .line 12746
    iput-object v0, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12911
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֡۠᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 12594
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const-string p1, ""

    .line 12746
    iput-object p1, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12911
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object p1

    iput-object p1, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֡۠᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/ۚ۠᩻;)V
    .locals 4

    .line 12637
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 12640
    iget-object v1, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    invoke-static {p1, v1}, Ll/ۚ۠᩻;->-$$Nest$fputname_(Ll/ۚ۠᩻;Ljava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 12644
    iget-wide v2, p0, Ll/֡۠᩻;->size_:J

    invoke-static {p1, v2, v3}, Ll/ۚ۠᩻;->-$$Nest$fputsize_(Ll/ۚ۠᩻;J)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    .line 12648
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/᩵ۜۖ;->᩶()V

    .line 12649
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-static {p1, v0}, Ll/ۚ۠᩻;->-$$Nest$fputpartitionNames_(Ll/ۚ۠᩻;Ll/ۖ᩵ۖ;)V

    .line 12651
    :cond_2
    invoke-static {p1}, Ll/ۚ۠᩻;->-$$Nest$fgetbitField0_(Ll/ۚ۠᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {v0, p1}, Ll/ۚ۠᩻;->-$$Nest$fputbitField0_(ILl/ۚ۠᩻;)V

    return-void
.end method

.method private ensurePartitionNamesIsMutable()V
    .locals 2

    .line 12913
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/᩵ۜۖ;->ۤ֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 12914
    new-instance v0, Ll/ۖ᩵ۖ;

    iget-object v1, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-direct {v0, v1}, Ll/ۖ᩵ۖ;-><init>(Ll/ۘ᩵ۖ;)V

    iput-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    .line 12916
    :cond_0
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/֡۠᩻;->bitField0_:I

    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 12576
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addAllPartitionNames(Ljava/lang/Iterable;)Ll/֡۠᩻;
    .locals 1

    .line 13015
    invoke-direct {p0}, Ll/֡۠᩻;->ensurePartitionNamesIsMutable()V

    .line 13016
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 13018
    iget p1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/֡۠᩻;->bitField0_:I

    .line 13019
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public addPartitionNames(Ljava/lang/String;)Ll/֡۠᩻;
    .locals 1

    .line 12997
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12998
    invoke-direct {p0}, Ll/֡۠᩻;->ensurePartitionNamesIsMutable()V

    .line 12999
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/᩵ۜۖ;->add(Ljava/lang/Object;)Z

    .line 13000
    iget p1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/֡۠᩻;->bitField0_:I

    .line 13001
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public addPartitionNamesBytes(Ll/ۛۜۖ;)Ll/֡۠᩻;
    .locals 1

    .line 13048
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13049
    invoke-direct {p0}, Ll/֡۠᩻;->ensurePartitionNamesIsMutable()V

    .line 13050
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/ۖ᩵ۖ;->֫(Ll/ۛۜۖ;)V

    .line 13051
    iget p1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/֡۠᩻;->bitField0_:I

    .line 13052
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public build()Ll/ۚ۠᩻;
    .locals 2

    .line 12621
    invoke-virtual {p0}, Ll/֡۠᩻;->buildPartial()Ll/ۚ۠᩻;

    move-result-object v0

    .line 12622
    invoke-virtual {v0}, Ll/ۚ۠᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 12623
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/ۚ۠᩻;
    .locals 2

    .line 12630
    new-instance v0, Ll/ۚ۠᩻;

    invoke-direct {v0, p0}, Ll/ۚ۠᩻;-><init>(Ll/֡۠᩻;)V

    .line 12631
    iget v1, p0, Ll/֡۠᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/֡۠᩻;->buildPartial0(Ll/ۚ۠᩻;)V

    .line 12632
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->buildPartial()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->buildPartial()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/֡۠᩻;
    .locals 2

    .line 12599
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 12600
    iput v0, p0, Ll/֡۠᩻;->bitField0_:I

    const-string v0, ""

    .line 12601
    iput-object v0, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 12602
    iput-wide v0, p0, Ll/֡۠᩻;->size_:J

    .line 12604
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-object p0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->clear()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->clear()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->clear()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->clear()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearName()Ll/֡۠᩻;
    .locals 1

    .line 12827
    invoke-static {}, Ll/ۚ۠᩻;->getDefaultInstance()Ll/ۚ۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚ۠᩻;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12828
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/֡۠᩻;->bitField0_:I

    .line 12829
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearPartitionNames()Ll/֡۠᩻;
    .locals 1

    .line 13032
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    .line 13033
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/֡۠᩻;->bitField0_:I

    .line 13034
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSize()Ll/֡۠᩻;
    .locals 2

    .line 12904
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/֡۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 12905
    iput-wide v0, p0, Ll/֡۠᩻;->size_:J

    .line 12906
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getDefaultInstanceForType()Ll/ۚ۠᩻;
    .locals 1

    .line 12616
    invoke-static {}, Ll/ۚ۠᩻;->getDefaultInstance()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->getDefaultInstanceForType()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->getDefaultInstanceForType()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 12611
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 12767
    iget-object v0, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12768
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 12769
    check-cast v0, Ll/ۛۜۖ;

    .line 12771
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 12772
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12773
    iput-object v1, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 12777
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getNameBytes()Ll/ۛۜۖ;
    .locals 2

    .line 12790
    iget-object v0, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12791
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 12792
    check-cast v0, Ljava/lang/String;

    .line 12793
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 12795
    iput-object v0, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    return-object v0

    .line 12798
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getPartitionNames(I)Ljava/lang/String;
    .locals 1

    .line 12952
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/ۖ᩵ۖ;->get(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPartitionNamesBytes(I)Ll/ۛۜۖ;
    .locals 1

    .line 12965
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/ۖ᩵ۖ;->֫(I)Ll/ۛۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public getPartitionNamesCount()I
    .locals 1

    .line 12940
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/ۖ᩵ۖ;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getPartitionNamesList()Ljava/util/List;
    .locals 1

    .line 12570
    invoke-virtual {p0}, Ll/֡۠᩻;->getPartitionNamesList()Ll/۟֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public getPartitionNamesList()Ll/۟֡ۖ;
    .locals 1

    .line 12928
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/᩵ۜۖ;->᩶()V

    .line 12929
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    .line 12875
    iget-wide v0, p0, Ll/֡۠᩻;->size_:J

    return-wide v0
.end method

.method public hasName()Z
    .locals 2

    .line 12756
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSize()Z
    .locals 1

    .line 12862
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 12582
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۚ۠᩻;

    const-class v2, Ll/֡۠᩻;

    .line 12583
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 12691
    invoke-virtual {p0}, Ll/֡۠᩻;->hasName()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public mergeFrom(Ll/ۚ۠᩻;)Ll/֡۠᩻;
    .locals 2

    .line 12665
    invoke-static {}, Ll/ۚ۠᩻;->getDefaultInstance()Ll/ۚ۠᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 12666
    :cond_0
    invoke-virtual {p1}, Ll/ۚ۠᩻;->hasName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12667
    invoke-static {p1}, Ll/ۚ۠᩻;->-$$Nest$fgetname_(Ll/ۚ۠᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12668
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֡۠᩻;->bitField0_:I

    .line 12669
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 12671
    :cond_1
    invoke-virtual {p1}, Ll/ۚ۠᩻;->hasSize()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12672
    invoke-virtual {p1}, Ll/ۚ۠᩻;->getSize()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/֡۠᩻;->setSize(J)Ll/֡۠᩻;

    .line 12674
    :cond_2
    invoke-static {p1}, Ll/ۚ۠᩻;->-$$Nest$fgetpartitionNames_(Ll/ۚ۠᩻;)Ll/ۖ᩵ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 12675
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12676
    invoke-static {p1}, Ll/ۚ۠᩻;->-$$Nest$fgetpartitionNames_(Ll/ۚ۠᩻;)Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    .line 12677
    iget v0, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/֡۠᩻;->bitField0_:I

    goto :goto_0

    .line 12679
    :cond_3
    invoke-direct {p0}, Ll/֡۠᩻;->ensurePartitionNamesIsMutable()V

    .line 12680
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-static {p1}, Ll/ۚ۠᩻;->-$$Nest$fgetpartitionNames_(Ll/ۚ۠᩻;)Ll/ۖ᩵ۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۖ᩵ۖ;->addAll(Ljava/util/Collection;)Z

    .line 12682
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 12684
    :cond_4
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 12685
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֡۠᩻;
    .locals 3

    .line 12703
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_5

    .line 12708
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

    .line 12730
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 12724
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    .line 12725
    invoke-direct {p0}, Ll/֡۠᩻;->ensurePartitionNamesIsMutable()V

    .line 12726
    iget-object v2, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v2, v1}, Ll/ۖ᩵ۖ;->֫(Ll/ۛۜۖ;)V

    goto :goto_0

    .line 12719
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/֡۠᩻;->size_:J

    .line 12720
    iget v1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/֡۠᩻;->bitField0_:I

    goto :goto_0

    .line 12714
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12715
    iget v1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֡۠᩻;->bitField0_:I
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

    .line 12738
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12740
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 12741
    throw p1

    .line 12740
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/֡۠᩻;
    .locals 1

    .line 12656
    instance-of v0, p1, Ll/ۚ۠᩻;

    if-eqz v0, :cond_0

    .line 12657
    check-cast p1, Ll/ۚ۠᩻;

    invoke-virtual {p0, p1}, Ll/֡۠᩻;->mergeFrom(Ll/ۚ۠᩻;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1

    .line 12659
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 12570
    invoke-virtual {p0, p1, p2}, Ll/֡۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 12570
    invoke-virtual {p0, p1, p2}, Ll/֡۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 12570
    invoke-virtual {p0, p1, p2}, Ll/֡۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 12570
    invoke-virtual {p0, p1}, Ll/֡۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 12570
    invoke-virtual {p0, p1, p2}, Ll/֡۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 12570
    invoke-virtual {p0, p1}, Ll/֡۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public setName(Ljava/lang/String;)Ll/֡۠᩻;
    .locals 0

    .line 12812
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12813
    iput-object p1, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12814
    iget p1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֡۠᩻;->bitField0_:I

    .line 12815
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setNameBytes(Ll/ۛۜۖ;)Ll/֡۠᩻;
    .locals 0

    .line 12843
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12844
    iput-object p1, p0, Ll/֡۠᩻;->name_:Ljava/lang/Object;

    .line 12845
    iget p1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֡۠᩻;->bitField0_:I

    .line 12846
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPartitionNames(ILjava/lang/String;)Ll/֡۠᩻;
    .locals 1

    .line 12979
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12980
    invoke-direct {p0}, Ll/֡۠᩻;->ensurePartitionNamesIsMutable()V

    .line 12981
    iget-object v0, p0, Ll/֡۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۖ᩵ۖ;->֫(ILjava/lang/String;)Ljava/lang/String;

    .line 12982
    iget p1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/֡۠᩻;->bitField0_:I

    .line 12983
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSize(J)Ll/֡۠᩻;
    .locals 0

    .line 12889
    iput-wide p1, p0, Ll/֡۠᩻;->size_:J

    .line 12890
    iget p1, p0, Ll/֡۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/֡۠᩻;->bitField0_:I

    .line 12891
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
