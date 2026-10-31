.class public final Ll/᩻ۢۖ;
.super Ll/۫ۘۖ;
.source "T9Q9"


# static fields
.field public static final serialVersionUID:J

.field public static final ۛ:Ll/᩻ۢۖ;

.field public static final ۨ:Ll/۫֡ۖ;


# instance fields
.field public ۗ:Ll/֨ۡۖ;

.field public ۙ:Z

.field public ۤ:Ljava/util/List;

.field public ۫:B

.field public ۬:Ll/ۛۢۖ;

.field public ᩶:Z

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 33248
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/᩻ۢۖ;

    .line 33254
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 33248
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 34502
    new-instance v0, Ll/᩻ۢۖ;

    invoke-direct {v0}, Ll/᩻ۢۖ;-><init>()V

    sput-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    .line 34510
    new-instance v0, Ll/ܿۢۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/᩻ۢۖ;->ۨ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33260
    invoke-direct {p0}, Ll/۫ۘۖ;-><init>()V

    const/4 v0, 0x0

    .line 33279
    iput-boolean v0, p0, Ll/᩻ۢۖ;->ۙ:Z

    .line 33324
    iput-boolean v0, p0, Ll/᩻ۢۖ;->᩶:Z

    const/4 v0, -0x1

    .line 33409
    iput-byte v0, p0, Ll/᩻ۢۖ;->۫:B

    .line 33261
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ܳۢۖ;)V
    .locals 0

    .line 33258
    invoke-direct {p0, p1}, Ll/۫ۘۖ;-><init>(Ll/ۗۘۖ;)V

    const/4 p1, 0x0

    .line 33279
    iput-boolean p1, p0, Ll/᩻ۢۖ;->ۙ:Z

    .line 33324
    iput-boolean p1, p0, Ll/᩻ۢۖ;->᩶:Z

    const/4 p1, -0x1

    .line 33409
    iput-byte p1, p0, Ll/᩻ۢۖ;->۫:B

    return-void
.end method

.method public static getDefaultInstance()Ll/᩻ۢۖ;
    .locals 1

    .line 34506
    sget-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/ܳۢۖ;
    .locals 1

    .line 33641
    sget-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    invoke-virtual {v0}, Ll/᩻ۢۖ;->toBuilder()Ll/ܳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ֫(Ll/᩻ۢۖ;)Ljava/util/List;
    .locals 0

    .line 33241
    iget-object p0, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩻ۢۖ;I)V
    .locals 1

    .line 33241
    iget v0, p0, Ll/᩻ۢۖ;->᩹:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/᩻ۢۖ;->᩹:I

    return-void
.end method

.method public static synthetic ֫(Ll/᩻ۢۖ;Ljava/util/List;)V
    .locals 0

    .line 33241
    iput-object p1, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻ۢۖ;Ll/֨ۡۖ;)V
    .locals 0

    .line 33241
    iput-object p1, p0, Ll/᩻ۢۖ;->ۗ:Ll/֨ۡۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻ۢۖ;Ll/ۛۢۖ;)V
    .locals 0

    .line 33241
    iput-object p1, p0, Ll/᩻ۢۖ;->۬:Ll/ۛۢۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻ۢۖ;Z)V
    .locals 0

    .line 33241
    iput-boolean p1, p0, Ll/᩻ۢۖ;->ۙ:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/᩻ۢۖ;Z)V
    .locals 0

    .line 33241
    iput-boolean p1, p0, Ll/᩻ۢۖ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 33498
    :cond_0
    instance-of v1, p1, Ll/᩻ۢۖ;

    if-nez v1, :cond_1

    .line 33499
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 33501
    :cond_1
    check-cast p1, Ll/᩻ۢۖ;

    .line 33503
    invoke-virtual {p0}, Ll/᩻ۢۖ;->᩵()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩻ۢۖ;->᩵()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 33504
    :cond_2
    invoke-virtual {p0}, Ll/᩻ۢۖ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 33294
    iget-boolean v1, p0, Ll/᩻ۢۖ;->ۙ:Z

    iget-boolean v2, p1, Ll/᩻ۢۖ;->ۙ:Z

    if-eq v1, v2, :cond_3

    return v3

    .line 33508
    :cond_3
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۚ()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩻ۢۖ;->ۚ()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 33509
    :cond_4
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 33510
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v1

    .line 33511
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v3

    .line 33513
    :cond_5
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ᩴ()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩻ۢۖ;->ᩴ()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 33514
    :cond_6
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 33339
    iget-boolean v1, p0, Ll/᩻ۢۖ;->᩶:Z

    iget-boolean v2, p1, Ll/᩻ۢۖ;->᩶:Z

    if-eq v1, v2, :cond_7

    return v3

    .line 33518
    :cond_7
    invoke-virtual {p0}, Ll/᩻ۢۖ;->֡()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩻ۢۖ;->֡()Z

    move-result v2

    if-eq v1, v2, :cond_8

    return v3

    .line 33519
    :cond_8
    invoke-virtual {p0}, Ll/᩻ۢۖ;->֡()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 33520
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۖ()Ll/֨ۡۖ;

    move-result-object v1

    .line 33521
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ۖ()Ll/֨ۡۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨ۡۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v3

    .line 33376
    :cond_9
    iget-object v1, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    iget-object v2, p1, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    .line 33524
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v3

    .line 33525
    :cond_a
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v3

    .line 33526
    :cond_b
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v3

    :cond_c
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 34542
    sget-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 34542
    sget-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 34537
    sget-object v0, Ll/᩻ۢۖ;->ۨ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 4

    .line 33463
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 33467
    :cond_0
    iget v0, p0, Ll/᩻ۢۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 33469
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 33471
    :goto_0
    iget v1, p0, Ll/᩻ۢۖ;->᩹:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    .line 33473
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 33475
    :cond_2
    iget v1, p0, Ll/᩻ۢۖ;->᩹:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 33477
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 33479
    :cond_3
    iget v1, p0, Ll/᩻ۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    .line 33481
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۖ()Ll/֨ۡۖ;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 33483
    :cond_4
    :goto_1
    iget-object v1, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_5

    .line 33484
    iget-object v1, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    .line 33485
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 33487
    :cond_5
    invoke-virtual {p0}, Ll/۫ۘۖ;->᩷()I

    move-result v1

    add-int/2addr v0, v1

    .line 33488
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 33489
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 33533
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 33266
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->ۗ()Ll/ᩳۖۖ;

    move-result-object v0

    .line 33537
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 33538
    invoke-virtual {p0}, Ll/᩻ۢۖ;->᩵()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 33539
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 33294
    iget-boolean v1, p0, Ll/᩻ۢۖ;->ۙ:Z

    .line 33540
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 33543
    :cond_1
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 33544
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 33545
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۢۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 33547
    :cond_2
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 33548
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 33339
    iget-boolean v1, p0, Ll/᩻ۢۖ;->᩶:Z

    .line 33549
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 33552
    :cond_3
    invoke-virtual {p0}, Ll/᩻ۢۖ;->֡()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    .line 33553
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 33554
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۖ()Ll/֨ۡۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۡۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 33391
    :cond_4
    iget-object v1, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    const/16 v1, 0x3e7

    .line 33557
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 33376
    iget-object v1, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    .line 33558
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 33560
    :cond_5
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡۜۖ;->֫(ILjava/util/Map;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1d

    .line 33561
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 33562
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 33272
    invoke-static {}, Ll/ۧۖۖ;->۬()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩻ۢۖ;

    const-class v2, Ll/ܳۢۖ;

    .line 33273
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 33412
    iget-byte v0, p0, Ll/᩻ۢۖ;->۫:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 33416
    :cond_1
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 33417
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    .line 33418
    iput-byte v2, p0, Ll/᩻ۢۖ;->۫:B

    return v2

    :cond_2
    const/4 v0, 0x0

    .line 33391
    :goto_0
    iget-object v3, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 33398
    iget-object v3, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    .line 33423
    invoke-virtual {v3}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_3

    .line 33424
    iput-byte v2, p0, Ll/᩻ۢۖ;->۫:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 33428
    :cond_4
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 33429
    iput-byte v2, p0, Ll/᩻ۢۖ;->۫:B

    return v2

    .line 33432
    :cond_5
    iput-byte v1, p0, Ll/᩻ۢۖ;->۫:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 33641
    sget-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    invoke-virtual {v0}, Ll/᩻ۢۖ;->toBuilder()Ll/ܳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 33641
    sget-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    invoke-virtual {v0}, Ll/᩻ۢۖ;->toBuilder()Ll/ܳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 33655
    new-instance v0, Ll/ܳۢۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܳۢۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 33241
    invoke-virtual {p0}, Ll/᩻ۢۖ;->toBuilder()Ll/ܳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 33241
    invoke-virtual {p0}, Ll/᩻ۢۖ;->toBuilder()Ll/ܳۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/ܳۢۖ;
    .locals 2

    .line 33648
    sget-object v0, Ll/᩻ۢۖ;->ۛ:Ll/᩻ۢۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 33649
    new-instance v0, Ll/ܳۢۖ;

    invoke-direct {v0, v1}, Ll/ܳۢۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ܳۢۖ;

    invoke-direct {v0, v1}, Ll/ܳۢۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ܳۢۖ;->֫(Ll/᩻ۢۖ;)V

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 1079
    new-instance v0, Ll/۬ۘۖ;

    invoke-direct {v0, p0}, Ll/۬ۘۖ;-><init>(Ll/۫ۘۖ;)V

    .line 33442
    iget v1, p0, Ll/᩻ۢۖ;->᩹:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    .line 33443
    iget-boolean v1, p0, Ll/᩻ۢۖ;->ۙ:Z

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 33445
    :cond_0
    iget v1, p0, Ll/᩻ۢۖ;->᩹:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    .line 33446
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 33448
    :cond_1
    iget v1, p0, Ll/᩻ۢۖ;->᩹:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    .line 33449
    iget-boolean v3, p0, Ll/᩻ۢۖ;->᩶:Z

    invoke-virtual {p1, v1, v3}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 33451
    :cond_2
    iget v1, p0, Ll/᩻ۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    .line 33452
    invoke-virtual {p0}, Ll/᩻ۢۖ;->ۖ()Ll/֨ۡۖ;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    :cond_3
    const/4 v1, 0x0

    .line 33454
    :goto_0
    iget-object v2, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 33455
    iget-object v2, p0, Ll/᩻ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/high16 v1, 0x20000000

    .line 33457
    invoke-virtual {v0, v1, p1}, Ll/۬ۘۖ;->֫(ILl/ܳ᩷ۖ;)V

    .line 33458
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֡()Z
    .locals 1

    .line 33350
    iget v0, p0, Ll/᩻ۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۖ()Ll/֨ۡۖ;
    .locals 1

    .line 33358
    iget-object v0, p0, Ll/᩻ۢۖ;->ۗ:Ll/֨ۡۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/֨ۡۖ;->getDefaultInstance()Ll/֨ۡۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۘ()Ll/ۛۢۖ;
    .locals 1

    .line 33313
    iget-object v0, p0, Ll/᩻ۢۖ;->۬:Ll/ۛۢۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 33305
    iget v0, p0, Ll/᩻ۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 33339
    iget-boolean v0, p0, Ll/᩻ۢۖ;->᩶:Z

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 33294
    iget-boolean v0, p0, Ll/᩻ۢۖ;->ۙ:Z

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 33331
    iget v0, p0, Ll/᩻ۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Z
    .locals 2

    .line 33286
    iget v0, p0, Ll/᩻ۢۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
