.class public final Ll/ۛ۠ۧ;
.super Ljava/lang/Object;
.source "V2SC"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public ۧ:I

.field public final ܳ:I

.field public ܽ:Z

.field public ܿ:[F

.field public final ᩳ:I

.field public ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 454
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 455
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iput v0, p0, Ll/ۛ۠ۧ;->᩻:I

    .line 456
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    iput v0, p0, Ll/ۛ۠ۧ;->ᩳ:I

    .line 457
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    iput v0, p0, Ll/ۛ۠ۧ;->֫:I

    .line 458
    iput p1, p0, Ll/ۛ۠ۧ;->ۜ:I

    .line 459
    iput p2, p0, Ll/ۛ۠ۧ;->ܳ:I

    return-void
.end method

.method private ᩳ()V
    .locals 8

    .line 526
    iget-boolean v0, p0, Ll/ۛ۠ۧ;->ܽ:Z

    if-nez v0, :cond_4

    const/4 v0, -0x1

    const/high16 v1, 0x40900000    # 4.5f

    .line 528
    iget v2, p0, Ll/ۛ۠ۧ;->ۜ:I

    invoke-static {v0, v1, v2}, Ll/۟ۗ;->֫(IFI)I

    move-result v3

    const/high16 v4, 0x40400000    # 3.0f

    .line 530
    invoke-static {v0, v4, v2}, Ll/۟ۗ;->֫(IFI)I

    move-result v5

    const/4 v6, 0x1

    if-eq v3, v0, :cond_0

    if-eq v5, v0, :cond_0

    .line 535
    invoke-static {v0, v3}, Ll/۟ۗ;->ܽ(II)I

    move-result v1

    iput v1, p0, Ll/ۛ۠ۧ;->ۧ:I

    .line 536
    invoke-static {v0, v5}, Ll/۟ۗ;->ܽ(II)I

    move-result v0

    iput v0, p0, Ll/ۛ۠ۧ;->᩷:I

    .line 537
    iput-boolean v6, p0, Ll/ۛ۠ۧ;->ܽ:Z

    return-void

    :cond_0
    const/high16 v7, -0x1000000

    .line 541
    invoke-static {v7, v1, v2}, Ll/۟ۗ;->֫(IFI)I

    move-result v1

    .line 543
    invoke-static {v7, v4, v2}, Ll/۟ۗ;->֫(IFI)I

    move-result v2

    if-eq v1, v0, :cond_1

    if-eq v2, v0, :cond_1

    .line 548
    invoke-static {v7, v1}, Ll/۟ۗ;->ܽ(II)I

    move-result v0

    iput v0, p0, Ll/ۛ۠ۧ;->ۧ:I

    .line 549
    invoke-static {v7, v2}, Ll/۟ۗ;->ܽ(II)I

    move-result v0

    iput v0, p0, Ll/ۛ۠ۧ;->᩷:I

    .line 550
    iput-boolean v6, p0, Ll/ۛ۠ۧ;->ܽ:Z

    return-void

    :cond_1
    if-eq v3, v0, :cond_2

    .line 557
    invoke-static {v0, v3}, Ll/۟ۗ;->ܽ(II)I

    move-result v1

    goto :goto_0

    .line 558
    :cond_2
    invoke-static {v7, v1}, Ll/۟ۗ;->ܽ(II)I

    move-result v1

    :goto_0
    iput v1, p0, Ll/ۛ۠ۧ;->ۧ:I

    if-eq v5, v0, :cond_3

    .line 560
    invoke-static {v0, v5}, Ll/۟ۗ;->ܽ(II)I

    move-result v0

    goto :goto_1

    .line 561
    :cond_3
    invoke-static {v7, v2}, Ll/۟ۗ;->ܽ(II)I

    move-result v0

    :goto_1
    iput v0, p0, Ll/ۛ۠ۧ;->᩷:I

    .line 562
    iput-boolean v6, p0, Ll/ۛ۠ۧ;->ܽ:Z

    :cond_4
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 583
    const-class v2, Ll/ۛ۠ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 587
    :cond_1
    check-cast p1, Ll/ۛ۠ۧ;

    .line 588
    iget v2, p0, Ll/ۛ۠ۧ;->ܳ:I

    iget v3, p1, Ll/ۛ۠ۧ;->ܳ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ۛ۠ۧ;->ۜ:I

    iget p1, p1, Ll/ۛ۠ۧ;->ۜ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 593
    iget v0, p0, Ll/ۛ۠ۧ;->ۜ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۛ۠ۧ;->ܳ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 568
    new-instance v0, Ljava/lang/StringBuilder;

    const-class v1, Ll/ۛ۠ۧ;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " [RGB: #"

    .line 569
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    iget v1, p0, Ll/ۛ۠ۧ;->ۜ:I

    .line 569
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] [HSL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    invoke-virtual {p0}, Ll/ۛ۠ۧ;->֫()[F

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] [Population: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    iget v1, p0, Ll/ۛ۠ۧ;->ܳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] [Title Text: #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    invoke-direct {p0}, Ll/ۛ۠ۧ;->ᩳ()V

    .line 512
    iget v1, p0, Ll/ۛ۠ۧ;->᩷:I

    .line 572
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] [Body Text: #"

    .line 573
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    invoke-direct {p0}, Ll/ۛ۠ۧ;->ᩳ()V

    .line 522
    iget v1, p0, Ll/ۛ۠ۧ;->ۧ:I

    .line 574
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()[F
    .locals 4

    .line 491
    iget-object v0, p0, Ll/ۛ۠ۧ;->ܿ:[F

    if-nez v0, :cond_0

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 492
    iput-object v0, p0, Ll/ۛ۠ۧ;->ܿ:[F

    .line 494
    :cond_0
    iget v0, p0, Ll/ۛ۠ۧ;->֫:I

    iget-object v1, p0, Ll/ۛ۠ۧ;->ܿ:[F

    iget v2, p0, Ll/ۛ۠ۧ;->᩻:I

    iget v3, p0, Ll/ۛ۠ۧ;->ᩳ:I

    invoke-static {v2, v3, v0, v1}, Ll/۟ۗ;->֫(III[F)V

    .line 495
    iget-object v0, p0, Ll/ۛ۠ۧ;->ܿ:[F

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 502
    iget v0, p0, Ll/ۛ۠ۧ;->ܳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 480
    iget v0, p0, Ll/ۛ۠ۧ;->ۜ:I

    return v0
.end method
