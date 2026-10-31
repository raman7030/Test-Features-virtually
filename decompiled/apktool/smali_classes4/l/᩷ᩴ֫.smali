.class public final Ll/᩷ᩴ֫;
.super Ljava/lang/Object;
.source "18KP"


# static fields
.field public static final ۜ:Ll/᩷ᩴ֫;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:[B

.field public final ܽ:I

.field public ܿ:I

.field public final ᩳ:I

.field public final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 158
    new-instance v0, Ll/ۜᩴ֫;

    invoke-direct {v0}, Ll/ۜᩴ֫;-><init>()V

    const/4 v1, 0x1

    .line 160
    invoke-virtual {v0, v1}, Ll/ۜᩴ֫;->ܽ(I)V

    const/4 v2, 0x2

    .line 161
    invoke-virtual {v0, v2}, Ll/ۜᩴ֫;->ۧ(I)V

    const/4 v3, 0x3

    .line 162
    invoke-virtual {v0, v3}, Ll/ۜᩴ֫;->ᩳ(I)V

    .line 163
    invoke-virtual {v0}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v0

    sput-object v0, Ll/᩷ᩴ֫;->ۜ:Ll/᩷ᩴ֫;

    .line 169
    new-instance v0, Ll/ۜᩴ֫;

    invoke-direct {v0}, Ll/ۜᩴ֫;-><init>()V

    .line 171
    invoke-virtual {v0, v1}, Ll/ۜᩴ֫;->ܽ(I)V

    .line 172
    invoke-virtual {v0, v1}, Ll/ۜᩴ֫;->ۧ(I)V

    .line 173
    invoke-virtual {v0, v2}, Ll/ۜᩴ֫;->ᩳ(I)V

    .line 174
    invoke-virtual {v0}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    const/4 v0, 0x0

    .line 531
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    .line 532
    invoke-static {v1}, Ll/ۘ֨֫;->᩻(I)V

    .line 533
    invoke-static {v2}, Ll/ۘ֨֫;->᩻(I)V

    .line 534
    invoke-static {v3}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x4

    .line 535
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x5

    .line 536
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(III[BII)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 359
    iput p1, p0, Ll/᩷ᩴ֫;->ܽ:I

    .line 360
    iput p2, p0, Ll/᩷ᩴ֫;->ۧ:I

    .line 361
    iput p3, p0, Ll/᩷ᩴ֫;->ᩳ:I

    .line 362
    iput-object p4, p0, Ll/᩷ᩴ֫;->ܳ:[B

    .line 363
    iput p5, p0, Ll/᩷ᩴ֫;->᩻:I

    .line 364
    iput p6, p0, Ll/᩷ᩴ֫;->֫:I

    return-void
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string v0, "Undefined color range "

    .line 0
    invoke-static {p0, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "Limited range"

    return-object p0

    :cond_1
    const-string p0, "Full range"

    return-object p0

    :cond_2
    const-string p0, "Unset color range"

    return-object p0
.end method

.method public static ֫(Ll/᩷ᩴ֫;)Z
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#1"
        }
        result = false
    .end annotation

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    .line 192
    :cond_0
    iget v1, p0, Ll/᩷ᩴ֫;->ܽ:I

    const/4 v2, 0x2

    const/4 v3, -0x1

    if-eq v1, v3, :cond_1

    if-eq v1, v0, :cond_1

    if-ne v1, v2, :cond_6

    :cond_1
    iget v1, p0, Ll/᩷ᩴ֫;->ۧ:I

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_6

    :cond_2
    iget v1, p0, Ll/᩷ᩴ֫;->ᩳ:I

    if-eq v1, v3, :cond_3

    const/4 v2, 0x3

    if-ne v1, v2, :cond_6

    :cond_3
    iget-object v1, p0, Ll/᩷ᩴ֫;->ܳ:[B

    if-nez v1, :cond_6

    iget v1, p0, Ll/᩷ᩴ֫;->֫:I

    const/16 v2, 0x8

    if-eq v1, v3, :cond_4

    if-ne v1, v2, :cond_6

    :cond_4
    iget p0, p0, Ll/᩷ᩴ֫;->᩻:I

    if-eq p0, v3, :cond_5

    if-ne p0, v2, :cond_6

    :cond_5
    return v0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x6

    if-eq p0, v0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string v0, "Undefined color space "

    .line 0
    invoke-static {p0, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "BT601"

    return-object p0

    :cond_1
    const-string p0, "BT709"

    return-object p0

    :cond_2
    const-string p0, "BT2020"

    return-object p0

    :cond_3
    const-string p0, "Unset color space"

    return-object p0
.end method

.method public static ܽ(I)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_6

    const/16 v0, 0xa

    if-eq p0, v0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    const-string v0, "Undefined color transfer "

    .line 0
    invoke-static {p0, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "HLG"

    return-object p0

    :cond_1
    const-string p0, "ST2084 PQ"

    return-object p0

    :cond_2
    const-string p0, "SDR SMPTE 170M"

    return-object p0

    :cond_3
    const-string p0, "sRGB"

    return-object p0

    :cond_4
    const-string p0, "Linear"

    return-object p0

    :cond_5
    const-string p0, "Gamma 2.2"

    return-object p0

    :cond_6
    const-string p0, "Unset color transfer"

    return-object p0
.end method

.method public static ܿ(I)I
    .locals 3
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_3

    const/16 v0, 0xd

    if-eq p0, v0, :cond_2

    const/16 v0, 0x10

    const/4 v1, 0x6

    if-eq p0, v0, :cond_1

    const/16 v0, 0x12

    const/4 v2, 0x7

    if-eq p0, v0, :cond_0

    if-eq p0, v1, :cond_4

    if-eq p0, v2, :cond_4

    const/4 p0, -0x1

    return p0

    :cond_0
    return v2

    :cond_1
    return v1

    :cond_2
    const/4 p0, 0x2

    return p0

    :cond_3
    const/16 p0, 0xa

    return p0

    :cond_4
    const/4 p0, 0x3

    return p0
.end method

.method public static ᩳ(I)I
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/16 v0, 0x9

    const/4 v1, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    if-eq p0, v1, :cond_0

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    return v1

    :cond_2
    return v0
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

    .line 424
    const-class v2, Ll/᩷ᩴ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 427
    :cond_1
    check-cast p1, Ll/᩷ᩴ֫;

    .line 428
    iget v2, p0, Ll/᩷ᩴ֫;->ܽ:I

    iget v3, p1, Ll/᩷ᩴ֫;->ܽ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩷ᩴ֫;->ۧ:I

    iget v3, p1, Ll/᩷ᩴ֫;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩷ᩴ֫;->ᩳ:I

    iget v3, p1, Ll/᩷ᩴ֫;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩷ᩴ֫;->ܳ:[B

    iget-object v3, p1, Ll/᩷ᩴ֫;->ܳ:[B

    .line 431
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ll/᩷ᩴ֫;->᩻:I

    iget v3, p1, Ll/᩷ᩴ֫;->᩻:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩷ᩴ֫;->֫:I

    iget p1, p1, Ll/᩷ᩴ֫;->֫:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 438
    iget v0, p0, Ll/᩷ᩴ֫;->ܿ:I

    if-nez v0, :cond_0

    .line 440
    iget v0, p0, Ll/᩷ᩴ֫;->ܽ:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 441
    iget v1, p0, Ll/᩷ᩴ֫;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 442
    iget v1, p0, Ll/᩷ᩴ֫;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 443
    iget-object v1, p0, Ll/᩷ᩴ֫;->ܳ:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 444
    iget v0, p0, Ll/᩷ᩴ֫;->᩻:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 445
    iget v0, p0, Ll/᩷ᩴ֫;->֫:I

    add-int/2addr v1, v0

    .line 446
    iput v1, p0, Ll/᩷ᩴ֫;->ܿ:I

    .line 448
    :cond_0
    iget v0, p0, Ll/᩷ᩴ֫;->ܿ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 453
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ColorInfo("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩷ᩴ֫;->ܽ:I

    .line 454
    invoke-static {v1}, Ll/᩷ᩴ֫;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩷ᩴ֫;->ۧ:I

    .line 456
    invoke-static {v2}, Ll/᩷ᩴ֫;->֫(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩷ᩴ֫;->ᩳ:I

    .line 458
    invoke-static {v2}, Ll/᩷ᩴ֫;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩷ᩴ֫;->ܳ:[B

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "NA"

    const/4 v3, -0x1

    .line 469
    iget v4, p0, Ll/᩷ᩴ֫;->᩻:I

    if-eq v4, v3, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "bit Luma"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v2

    .line 462
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    iget v1, p0, Ll/᩷ᩴ֫;->֫:I

    if-eq v1, v3, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "bit Chroma"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    const-string v1, ")"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۜᩴ֫;
    .locals 1

    .line 369
    new-instance v0, Ll/ۜᩴ֫;

    invoke-direct {v0, p0}, Ll/ۜᩴ֫;-><init>(Ll/᩷ᩴ֫;)V

    return-object v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 396
    iget v0, p0, Ll/᩷ᩴ֫;->ܽ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Ll/᩷ᩴ֫;->ۧ:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Ll/᩷ᩴ֫;->ᩳ:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 5

    .line 408
    invoke-virtual {p0}, Ll/᩷ᩴ֫;->ۧ()Z

    move-result v0

    const-string v1, "/"

    if-eqz v0, :cond_0

    .line 409
    iget v0, p0, Ll/᩷ᩴ֫;->ܽ:I

    .line 411
    invoke-static {v0}, Ll/᩷ᩴ֫;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Ll/᩷ᩴ֫;->ۧ:I

    .line 412
    invoke-static {v2}, Ll/᩷ᩴ֫;->֫(I)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Ll/᩷ᩴ֫;->ᩳ:I

    .line 413
    invoke-static {v3}, Ll/᩷ᩴ֫;->ܽ(I)Ljava/lang/String;

    move-result-object v3

    .line 1126
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "NA/NA/NA"

    .line 387
    :goto_0
    iget v2, p0, Ll/᩷ᩴ֫;->᩻:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    iget v4, p0, Ll/᩷ᩴ֫;->֫:I

    if-eq v4, v3, :cond_1

    .line 415
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, "NA/NA"

    .line 0
    :goto_1
    invoke-static {v0, v1, v2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
