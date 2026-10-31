.class public abstract Ll/᩶ۘۖ;
.super Ll/᩷ۜۖ;
.source "X93U"


# instance fields
.field public builderParent:Ll/ۢۜۖ;

.field public isClean:Z

.field public meAsParent:Ll/᩹ۘۖ;

.field public unknownFieldsOrBuilder:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 493
    invoke-direct {p0, v0}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 1

    .line 496
    invoke-direct {p0}, Ll/᩷ۜۖ;-><init>()V

    .line 490
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    .line 497
    iput-object p1, p0, Ll/᩶ۘۖ;->builderParent:Ll/ۢۜۖ;

    return-void
.end method

.method private ֫()Ljava/util/Map;
    .locals 6

    .line 566
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 567
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v1

    .line 568
    invoke-static {v1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;)Ll/ᩳۖۖ;

    move-result-object v1

    .line 569
    invoke-virtual {v1}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    .line 571
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 572
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖۖ;

    .line 573
    invoke-virtual {v3}, Ll/֡ۖۖ;->ܺ()Ll/ܶۖۖ;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 581
    invoke-virtual {v4}, Ll/ܶۖۖ;->ᩴ()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    add-int/2addr v2, v3

    .line 582
    invoke-virtual {p0, v4}, Ll/᩶ۘۖ;->hasOneof(Ll/ܶۖۖ;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    .line 587
    :cond_0
    invoke-virtual {p0, v4}, Ll/᩶ۘۖ;->getOneofFieldDescriptor(Ll/ܶۖۖ;)Ll/֡ۖۖ;

    move-result-object v3

    goto :goto_1

    .line 590
    :cond_1
    invoke-virtual {v3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 591
    invoke-virtual {p0, v3}, Ll/᩶ۘۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 592
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    .line 593
    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 597
    :cond_2
    invoke-virtual {p0, v3}, Ll/᩶ۘۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    .line 602
    :cond_3
    :goto_1
    invoke-virtual {p0, v3}, Ll/᩶ۘۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method public static synthetic ֫(Ll/᩶ۘۖ;)Ljava/util/Map;
    .locals 0

    .line 468
    invoke-direct {p0}, Ll/᩶ۘۖ;->֫()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;
    .locals 0

    .line 691
    iput-object p1, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    .line 692
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1, p2}, Ll/᩶ۘۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;
    .locals 1

    .line 686
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Ll/ۛۘۖ;->ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-object p0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/᩶ۘۖ;
    .locals 1

    .line 543
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    .line 544
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->clearField(Ll/֡ۖۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Ll/֡ۖۖ;)Ll/᩶ۘۖ;
    .locals 1

    .line 657
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->֫(Ll/᩶ۘۖ;)V

    return-object p0
.end method

.method public bridge synthetic clearOneof(Ll/ܶۖۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->clearOneof(Ll/ܶۖۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Ll/ܶۖۖ;)Ll/᩶ۘۖ;
    .locals 1

    .line 663
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/ܶۖۖ;)Ll/᩺ۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/᩺ۘۖ;->֫(Ll/᩶ۘۖ;)V

    return-object p0
.end method

.method public bridge synthetic clearOneof(Ll/ܶۖۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->clearOneof(Ll/ܶۖۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clone()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ۖۜۖ;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clone()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ۢ֡ۖ;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clone()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ܳ֡ۖ;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clone()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/᩶ۘۖ;
    .locals 2

    .line 532
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDefaultInstanceForType()Ll/᩻֡ۖ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/᩶ۘۖ;

    .line 533
    invoke-interface {p0}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object v0
.end method

.method public bridge synthetic clone()Ll/᩷ۜۖ;
    .locals 1

    .line 467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->clone()Ll/᩶ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    .line 502
    iput-object v0, p0, Ll/᩶ۘۖ;->builderParent:Ll/ۢۜۖ;

    return-void
.end method

.method public getAllFields()Ljava/util/Map;
    .locals 1

    .line 561
    invoke-direct {p0}, Ll/᩶ۘۖ;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 556
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;)Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getField(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 1

    .line 639
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object v0

    invoke-interface {v0, p0}, Ll/ۛۘۖ;->ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;

    move-result-object v0

    .line 640
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 643
    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public getFieldBuilder(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 614
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->ᩳ(Ll/᩶ۘۖ;)Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public getOneofFieldDescriptor(Ll/ܶۖۖ;)Ll/֡ۖۖ;
    .locals 1

    .line 629
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/ܶۖۖ;)Ll/᩺ۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/᩺ۘۖ;->ۧ(Ll/᩶ۘۖ;)Ll/֡ۖۖ;

    move-result-object p1

    return-object p1
.end method

.method public getParentForChildren()Ll/ۢۜۖ;
    .locals 1

    .line 820
    iget-object v0, p0, Ll/᩶ۘۖ;->meAsParent:Ll/᩹ۘۖ;

    if-nez v0, :cond_0

    .line 821
    new-instance v0, Ll/᩹ۘۖ;

    invoke-direct {v0, p0}, Ll/᩹ۘۖ;-><init>(Ll/᩶ۘۖ;)V

    iput-object v0, p0, Ll/᩶ۘۖ;->meAsParent:Ll/᩹ۘۖ;

    .line 823
    :cond_0
    iget-object v0, p0, Ll/᩶ۘۖ;->meAsParent:Ll/᩹ۘۖ;

    return-object v0
.end method

.method public getRepeatedField(Ll/֡ۖۖ;I)Ljava/lang/Object;
    .locals 1

    .line 674
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Ll/ۛۘۖ;->ۧ(Ll/᩶ۘۖ;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getRepeatedFieldBuilder(Ll/֡ۖۖ;I)Ll/ܳ֡ۖ;
    .locals 1

    .line 619
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Ll/ۛۘۖ;->֫(Ll/᩶ۘۖ;I)Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public getRepeatedFieldCount(Ll/֡ۖۖ;)I
    .locals 1

    .line 669
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->ܿ(Ll/᩶ۘۖ;)I

    move-result p1

    return p1
.end method

.method public getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;
    .locals 2

    .line 789
    iget-object v0, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    instance-of v1, v0, Ll/ۢ֨ۖ;

    if-eqz v1, :cond_0

    .line 790
    check-cast v0, Ll/ۢ֨ۖ;

    .line 48
    invoke-static {}, Ll/ܳ֨ۖ;->֫()Ll/ܳ֨ۖ;

    move-result-object v1

    .line 266
    invoke-virtual {v1, v0}, Ll/ܳ֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    .line 790
    iput-object v1, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    .line 792
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 793
    iget-object v0, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    check-cast v0, Ll/ܳ֨ۖ;

    return-object v0
.end method

.method public final getUnknownFields()Ll/ۢ֨ۖ;
    .locals 2

    .line 756
    iget-object v0, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    instance-of v1, v0, Ll/ۢ֨ۖ;

    if-eqz v1, :cond_0

    .line 757
    check-cast v0, Ll/ۢ֨ۖ;

    return-object v0

    .line 759
    :cond_0
    check-cast v0, Ll/ܳ֨ۖ;

    .line 327
    invoke-virtual {v0}, Ll/ܳ֨ۖ;->build()Ll/ۢ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public hasField(Ll/֡ۖۖ;)Z
    .locals 1

    .line 634
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->ܽ(Ll/᩶ۘۖ;)Z

    move-result p1

    return p1
.end method

.method public hasOneof(Ll/ܶۖۖ;)Z
    .locals 1

    .line 624
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/ܶۖۖ;)Ll/᩺ۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/᩺ۘۖ;->ܽ(Ll/᩶ۘۖ;)Z

    move-result p1

    return p1
.end method

.method public abstract internalGetFieldAccessorTable()Ll/ۢᩴۖ;
.end method

.method public internalGetMapField(I)Ll/ܰ᩵ۖ;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 859
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "No map fields found in "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public internalGetMapFieldReflection(I)Ll/֫֡ۖ;
    .locals 0

    .line 850
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->internalGetMapField(I)Ll/ܰ᩵ۖ;

    move-result-object p1

    return-object p1
.end method

.method public internalGetMutableMapField(I)Ll/ܰ᩵ۖ;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 874
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "No map fields found in "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public internalGetMutableMapFieldReflection(I)Ll/֫֡ۖ;
    .locals 0

    .line 865
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->internalGetMutableMapField(I)Ll/ܰ᩵ۖ;

    move-result-object p1

    return-object p1
.end method

.method public isClean()Z
    .locals 1

    .line 527
    iget-boolean v0, p0, Ll/᩶ۘۖ;->isClean:Z

    return v0
.end method

.method public isInitialized()Z
    .locals 5

    .line 727
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 729
    invoke-virtual {v1}, Ll/֡ۖۖ;->ۛ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 730
    invoke-virtual {p0, v1}, Ll/᩶ۘۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v2

    if-nez v2, :cond_1

    return v3

    .line 735
    :cond_1
    invoke-virtual {v1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v2

    sget-object v4, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v2, v4, :cond_0

    .line 736
    invoke-virtual {v1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 738
    invoke-virtual {p0, v1}, Ll/᩶ۘۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 739
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֡ۖ;

    .line 740
    invoke-interface {v2}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_2

    return v3

    .line 745
    :cond_3
    invoke-virtual {p0, v1}, Ll/᩶ۘۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ll/᩶ۘۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֡ۖ;

    invoke-interface {v1}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_0

    return v3

    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public markClean()V
    .locals 1

    const/4 v0, 0x1

    .line 518
    iput-boolean v0, p0, Ll/᩶ۘۖ;->isClean:Z

    return-void
.end method

.method public bridge synthetic mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;
    .locals 2

    .line 710
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 714
    :cond_0
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 715
    iput-object p1, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    .line 716
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 720
    :cond_1
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳ֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    .line 721
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownLengthDelimitedField(ILl/ۛۜۖ;)V
    .locals 1

    .line 779
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ܳ֨ۖ;->֫(ILl/ۛۜۖ;)V

    return-void
.end method

.method public final mergeUnknownVarintField(II)V
    .locals 1

    .line 784
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ܳ֨ۖ;->֫(II)V

    return-void
.end method

.method public newBuilderForField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 609
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۛۘۖ;->֫()Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public onBuilt()V
    .locals 1

    .line 507
    iget-object v0, p0, Ll/᩶ۘۖ;->builderParent:Ll/ۢۜۖ;

    if-eqz v0, :cond_0

    .line 508
    invoke-virtual {p0}, Ll/᩶ۘۖ;->markClean()V

    :cond_0
    return-void
.end method

.method public final onChanged()V
    .locals 1

    .line 831
    iget-boolean v0, p0, Ll/᩶ۘۖ;->isClean:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩶ۘۖ;->builderParent:Ll/ۢۜۖ;

    if-eqz v0, :cond_0

    .line 832
    invoke-interface {v0}, Ll/ۢۜۖ;->֫()V

    const/4 v0, 0x0

    .line 835
    iput-boolean v0, p0, Ll/᩶ۘۖ;->isClean:Z

    :cond_0
    return-void
.end method

.method public parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z
    .locals 0

    .line 771
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;

    move-result-object p2

    invoke-virtual {p2, p3, p1}, Ll/ܳ֨ۖ;->֫(ILl/۟ۜۖ;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1, p2}, Ll/᩶ۘۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;
    .locals 1

    .line 651
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Ll/ۛۘۖ;->֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Ll/֡ۖۖ;ILjava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1, p2, p3}, Ll/᩶ۘۖ;->setRepeatedField(Ll/֡ۖۖ;ILjava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Ll/֡ۖۖ;ILjava/lang/Object;)Ll/᩶ۘۖ;
    .locals 1

    .line 680
    invoke-virtual {p0}, Ll/᩶ۘۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0, p2, p3}, Ll/ۛۘۖ;->֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V

    return-object p0
.end method

.method public setUnknownFieldSetBuilder(Ll/ܳ֨ۖ;)V
    .locals 0

    .line 798
    iput-object p1, p0, Ll/᩶ۘۖ;->unknownFieldsOrBuilder:Ljava/lang/Object;

    .line 799
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public bridge synthetic setUnknownFields(Ll/ۢ֨ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 467
    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->setUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public setUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;
    .locals 0

    .line 698
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;->֫(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public setUnknownFieldsProto3(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;
    .locals 0

    .line 705
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;->֫(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method
