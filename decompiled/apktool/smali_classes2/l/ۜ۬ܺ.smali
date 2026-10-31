.class public Ll/ۜ۬ܺ;
.super Ljava/lang/Object;
.source "866M"


# instance fields
.field public ֫:[Ljava/lang/Object;

.field public ۧ:Ll/᩻۬ܺ;

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 453
    invoke-direct {p0, v0}, Ll/ۜ۬ܺ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 457
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 p1, p1, 0x2

    .line 458
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/ۜ۬ܺ;->֫:[Ljava/lang/Object;

    const/4 p1, 0x0

    .line 459
    iput p1, p0, Ll/ۜ۬ܺ;->ܽ:I

    return-void
.end method

.method private ֫(Z)Ll/ۢ۬ܺ;
    .locals 2

    if-eqz p1, :cond_1

    .line 564
    iget-object v0, p0, Ll/ۜ۬ܺ;->ۧ:Ll/᩻۬ܺ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 565
    :cond_0
    invoke-virtual {v0}, Ll/᩻۬ܺ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 577
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۜ۬ܺ;->ܽ:I

    .line 579
    iget-object v1, p0, Ll/ۜ۬ܺ;->֫:[Ljava/lang/Object;

    .line 597
    invoke-static {v0, v1, p0}, Ll/ۜۛܺ;->֫(I[Ljava/lang/Object;Ll/ۜ۬ܺ;)Ll/ۜۛܺ;

    move-result-object v0

    if-eqz p1, :cond_3

    .line 598
    iget-object p1, p0, Ll/ۜ۬ܺ;->ۧ:Ll/᩻۬ܺ;

    if-nez p1, :cond_2

    goto :goto_1

    .line 599
    :cond_2
    invoke-virtual {p1}, Ll/᩻۬ܺ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_3
    :goto_1
    return-object v0
.end method


# virtual methods
.method public ֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;
    .locals 3

    .line 481
    iget v0, p0, Ll/ۜ۬ܺ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x2

    .line 464
    iget-object v1, p0, Ll/ۜ۬ܺ;->֫:[Ljava/lang/Object;

    array-length v2, v1

    if-le v0, v2, :cond_0

    .line 465
    array-length v2, v1

    .line 468
    invoke-static {v2, v0}, Ll/ۨۗܺ;->֫(II)I

    move-result v0

    .line 466
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۜ۬ܺ;->֫:[Ljava/lang/Object;

    .line 482
    :cond_0
    invoke-static {p1, p2}, Ll/᩹ۙܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 483
    iget-object v0, p0, Ll/ۜ۬ܺ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ۜ۬ܺ;->ܽ:I

    mul-int/lit8 v2, v1, 0x2

    aput-object p1, v0, v2

    add-int/lit8 v2, v2, 0x1

    .line 484
    aput-object p2, v0, v2

    add-int/lit8 v1, v1, 0x1

    .line 485
    iput v1, p0, Ll/ۜ۬ܺ;->ܽ:I

    return-object p0
.end method

.method public ֫()Ll/ۢ۬ܺ;
    .locals 1

    const/4 v0, 0x1

    .line 629
    invoke-direct {p0, v0}, Ll/ۜ۬ܺ;->֫(Z)Ll/ۢ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public ۧ()Ll/ۢ۬ܺ;
    .locals 1

    const/4 v0, 0x1

    .line 629
    invoke-direct {p0, v0}, Ll/ۜ۬ܺ;->֫(Z)Ll/ۢ۬ܺ;

    move-result-object v0

    return-object v0
.end method
