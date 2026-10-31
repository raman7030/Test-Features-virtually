.class public final Ll/֡᩶ۡ;
.super Ljava/lang/Object;
.source "OBK5"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x127891154ad5ff62L

.field public static final ۛ:[I


# instance fields
.field public ۗ:D

.field public ۙ:D

.field public transient ۤ:I

.field public transient ۫:I

.field public ۬:D

.field public ᩶:D

.field public ᩸:D

.field public ᩹:D


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [I

    .line 1340
    fill-array-data v0, :array_0

    sput-object v0, Ll/֡᩶ۡ;->ۛ:[I

    return-void

    :array_0
    .array-data 4
        0x4
        0x5
        0x4
        0x5
        0x2
        0x3
        0x6
        0x7
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 468
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 469
    iput-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    iput-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 560
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 561
    iput-wide p1, p0, Ll/֡᩶ۡ;->᩸:D

    const-wide/16 p1, 0x0

    .line 562
    iput-wide p1, p0, Ll/֡᩶ۡ;->ۙ:D

    .line 563
    iput-wide p1, p0, Ll/֡᩶ۡ;->᩹:D

    .line 564
    iput-wide p3, p0, Ll/֡᩶ۡ;->ۗ:D

    .line 565
    iput-wide p1, p0, Ll/֡᩶ۡ;->᩶:D

    .line 566
    iput-wide p1, p0, Ll/֡᩶ۡ;->۬:D

    .line 567
    invoke-virtual {p0}, Ll/֡᩶ۡ;->ܳ()V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 4

    .line 509
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v0, v0

    .line 510
    iput-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    const/4 v2, 0x0

    float-to-double v2, v2

    .line 511
    iput-wide v2, p0, Ll/֡᩶ۡ;->ۙ:D

    .line 512
    iput-wide v2, p0, Ll/֡᩶ۡ;->᩹:D

    .line 513
    iput-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    float-to-double v0, p1

    .line 514
    iput-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    float-to-double p1, p2

    .line 515
    iput-wide p1, p0, Ll/֡᩶ۡ;->۬:D

    .line 516
    invoke-virtual {p0}, Ll/֡᩶ۡ;->ܳ()V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 4050
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 4051
    invoke-virtual {p0}, Ll/֡᩶ۡ;->ܳ()V

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0

    .line 4045
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    return-void
.end method

.method public static ֫(D)D
    .locals 2

    const-wide v0, 0x430c6bf526340000L    # 1.0E15

    mul-double p0, p0, v0

    .line 3944
    invoke-static {p0, p1}, Ljava/lang/Math;->rint(D)D

    move-result-wide p0

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static ۜ()V
    .locals 2

    .line 1130
    new-instance v0, Ljava/lang/InternalError;

    const-string v1, "missing case in transform state switch"

    invoke-direct {v0, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 3986
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3989
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 4021
    instance-of v0, p1, Ll/֡᩶ۡ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 4025
    :cond_0
    check-cast p1, Ll/֡᩶ۡ;

    .line 4027
    iget-wide v2, p0, Ll/֡᩶ۡ;->᩸:D

    iget-wide v4, p1, Ll/֡᩶ۡ;->᩸:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/֡᩶ۡ;->᩹:D

    iget-wide v4, p1, Ll/֡᩶ۡ;->᩹:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/֡᩶ۡ;->᩶:D

    iget-wide v4, p1, Ll/֡᩶ۡ;->᩶:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/֡᩶ۡ;->ۙ:D

    iget-wide v4, p1, Ll/֡᩶ۡ;->ۙ:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/֡᩶ۡ;->ۗ:D

    iget-wide v4, p1, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/֡᩶ۡ;->۬:D

    iget-wide v4, p1, Ll/֡᩶ۡ;->۬:D

    cmpl-double p1, v2, v4

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 4000
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    const-wide/16 v2, 0x1f

    mul-long v0, v0, v2

    .line 4001
    iget-wide v4, p0, Ll/֡᩶ۡ;->᩹:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    add-long/2addr v4, v0

    mul-long v4, v4, v2

    .line 4002
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    add-long/2addr v0, v4

    mul-long v0, v0, v2

    .line 4003
    iget-wide v4, p0, Ll/֡᩶ۡ;->ۙ:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    add-long/2addr v4, v0

    mul-long v4, v4, v2

    .line 4004
    iget-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    add-long/2addr v0, v4

    mul-long v0, v0, v2

    .line 4005
    iget-wide v2, p0, Ll/֡᩶ۡ;->۬:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    add-long/2addr v2, v0

    long-to-int v0, v2

    const/16 v1, 0x20

    shr-long v1, v2, v1

    long-to-int v2, v1

    xor-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 3956
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AffineTransform[["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/֡᩶ۡ;->᩸:D

    .line 3957
    invoke-static {v1, v2}, Ll/֡᩶ۡ;->֫(D)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/֡᩶ۡ;->᩹:D

    .line 3958
    invoke-static {v2, v3}, Ll/֡᩶ۡ;->֫(D)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/֡᩶ۡ;->᩶:D

    .line 3959
    invoke-static {v2, v3}, Ll/֡᩶ۡ;->֫(D)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, "], ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/֡᩶ۡ;->ۙ:D

    .line 3960
    invoke-static {v2, v3}, Ll/֡᩶ۡ;->֫(D)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/֡᩶ۡ;->ۗ:D

    .line 3961
    invoke-static {v2, v3}, Ll/֡᩶ۡ;->֫(D)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/֡᩶ۡ;->۬:D

    .line 3962
    invoke-static {v1, v2}, Ll/֡᩶ۡ;->֫(D)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()D
    .locals 6

    .line 1044
    iget v0, p0, Ll/֡᩶ۡ;->۫:I

    packed-switch v0, :pswitch_data_0

    .line 1046
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v0, 0x0

    throw v0

    .line 1050
    :pswitch_0
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    iget-wide v2, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v0, v0, v2

    iget-wide v2, p0, Ll/֡᩶ۡ;->᩹:D

    iget-wide v4, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v2, v2, v4

    sub-double/2addr v0, v2

    return-wide v0

    .line 1053
    :pswitch_1
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩹:D

    iget-wide v2, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v0, v0, v2

    neg-double v0, v0

    return-wide v0

    .line 1056
    :pswitch_2
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    iget-wide v2, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v0, v0, v2

    return-wide v0

    :pswitch_3
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/۠᩶ۡ;)Ll/᩸᩶ۡ;
    .locals 9

    .line 2921
    new-instance v0, Ll/۠᩶ۡ;

    .line 178
    invoke-direct {v0}, Ll/᩸᩶ۡ;-><init>()V

    .line 202
    iget-wide v1, p1, Ll/۠᩶ۡ;->᩸:D

    .line 211
    iget-wide v3, p1, Ll/۠᩶ۡ;->᩹:D

    .line 2929
    iget p1, p0, Ll/֡᩶ۡ;->۫:I

    packed-switch p1, :pswitch_data_0

    .line 2931
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 2935
    :pswitch_0
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v5, v5, v1

    iget-wide v7, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v7, v7, v3

    add-double/2addr v7, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr v7, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v1, v1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v3, v3, v5

    add-double/2addr v3, v1

    iget-wide v1, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr v3, v1

    invoke-virtual {v0, v7, v8, v3, v4}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    .line 2939
    :pswitch_1
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v5, v5, v1

    iget-wide v7, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v7, v7, v3

    add-double/2addr v7, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v1, v1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v3, v3, v5

    add-double/2addr v3, v1

    invoke-virtual {v0, v7, v8, v3, v4}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    .line 2942
    :pswitch_2
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v3, v3, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr v3, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v1, v1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr v1, v5

    invoke-virtual {v0, v3, v4, v1, v2}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    .line 2945
    :pswitch_3
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v3, v3, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v1, v1, v5

    invoke-virtual {v0, v3, v4, v1, v2}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    .line 2948
    :pswitch_4
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v1, v1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr v1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v3, v3, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr v3, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    .line 2951
    :pswitch_5
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v1, v1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v3, v3, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    .line 2954
    :pswitch_6
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr v1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr v3, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    .line 2957
    :pswitch_7
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/۠᩶ۡ;->֫(DD)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(DD)V
    .locals 8

    .line 1649
    iget v0, p0, Ll/֡᩶ۡ;->۫:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    packed-switch v0, :pswitch_data_0

    .line 1652
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 1656
    :pswitch_0
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v5, v5, p1

    iput-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    .line 1657
    iget-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v5, v5, p3

    iput-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    .line 1661
    :pswitch_1
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v5, v5, p3

    iput-wide v5, p0, Ll/֡᩶ۡ;->᩹:D

    .line 1662
    iget-wide p3, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double p3, p3, p1

    iput-wide p3, p0, Ll/֡᩶ۡ;->ۙ:D

    const-wide/16 p1, 0x0

    cmpl-double v7, v5, p1

    if-nez v7, :cond_4

    cmpl-double v5, p3, p1

    if-nez v5, :cond_4

    and-int/lit8 p1, v0, 0x1

    .line 1665
    iget-wide p2, p0, Ll/֡᩶ۡ;->᩸:D

    cmpl-double p4, p2, v3

    if-nez p4, :cond_1

    iget-wide p2, p0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double p4, p2, v3

    if-nez p4, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 1668
    :goto_0
    iput v1, p0, Ll/֡᩶ۡ;->ۤ:I

    goto :goto_1

    :cond_1
    or-int/lit8 p1, p1, 0x2

    .line 1671
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    .line 1673
    :goto_1
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    return-void

    .line 1678
    :pswitch_2
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v5, v5, p1

    iput-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    .line 1679
    iget-wide p1, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double p1, p1, p3

    iput-wide p1, p0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double p3, v5, v3

    if-nez p3, :cond_3

    cmpl-double p3, p1, v3

    if-nez p3, :cond_3

    and-int/lit8 p1, v0, 0x1

    .line 1681
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    .line 1684
    :goto_2
    iput v1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1686
    :cond_3
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1691
    :pswitch_3
    iput-wide p1, p0, Ll/֡᩶ۡ;->᩸:D

    .line 1692
    iput-wide p3, p0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double v1, p1, v3

    if-nez v1, :cond_5

    cmpl-double p1, p3, v3

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    return-void

    :cond_5
    :goto_3
    or-int/lit8 p1, v0, 0x2

    .line 1694
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1695
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(DDD)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    move-wide/from16 v3, p5

    .line 1475
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/֡᩶ۡ;->ܽ(DD)V

    .line 1423
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    .line 1424
    sget-object v7, Ll/֡᩶ۡ;->ۛ:[I

    const/4 v8, -0x1

    const/4 v9, 0x2

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    cmpl-double v12, v5, v10

    if-nez v12, :cond_1

    .line 1352
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 1353
    iget-wide v12, v0, Ll/֡᩶ۡ;->᩹:D

    iput-wide v12, v0, Ll/֡᩶ۡ;->᩸:D

    neg-double v5, v5

    .line 1354
    iput-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 1355
    iget-wide v5, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 1356
    iget-wide v14, v0, Ll/֡᩶ۡ;->ۗ:D

    iput-wide v14, v0, Ll/֡᩶ۡ;->ۙ:D

    neg-double v5, v5

    .line 1357
    iput-wide v5, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 1358
    iget v14, v0, Ll/֡᩶ۡ;->۫:I

    aget v7, v7, v14

    and-int/lit8 v14, v7, 0x6

    if-ne v14, v9, :cond_0

    cmpl-double v9, v12, v10

    if-nez v9, :cond_0

    cmpl-double v9, v5, v10

    if-nez v9, :cond_0

    add-int/lit8 v7, v7, -0x2

    .line 1363
    :cond_0
    iput v7, v0, Ll/֡᩶ۡ;->۫:I

    .line 1364
    iput v8, v0, Ll/֡᩶ۡ;->ۤ:I

    goto/16 :goto_1

    :cond_1
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    cmpl-double v14, v5, v12

    if-nez v14, :cond_3

    .line 1389
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 1390
    iget-wide v12, v0, Ll/֡᩶ۡ;->᩹:D

    neg-double v12, v12

    iput-wide v12, v0, Ll/֡᩶ۡ;->᩸:D

    .line 1391
    iput-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 1392
    iget-wide v5, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 1393
    iget-wide v14, v0, Ll/֡᩶ۡ;->ۗ:D

    neg-double v14, v14

    iput-wide v14, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 1394
    iput-wide v5, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 1395
    iget v14, v0, Ll/֡᩶ۡ;->۫:I

    aget v7, v7, v14

    and-int/lit8 v14, v7, 0x6

    if-ne v14, v9, :cond_2

    cmpl-double v9, v12, v10

    if-nez v9, :cond_2

    cmpl-double v9, v5, v10

    if-nez v9, :cond_2

    add-int/lit8 v7, v7, -0x2

    .line 1400
    :cond_2
    iput v7, v0, Ll/֡᩶ۡ;->۫:I

    .line 1401
    iput v8, v0, Ll/֡᩶ۡ;->ۤ:I

    goto :goto_1

    .line 1429
    :cond_3
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    cmpl-double v7, v14, v12

    if-nez v7, :cond_6

    .line 1368
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    neg-double v5, v5

    iput-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 1369
    iget-wide v12, v0, Ll/֡᩶ۡ;->ۗ:D

    neg-double v12, v12

    iput-wide v12, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 1370
    iget v7, v0, Ll/֡᩶ۡ;->۫:I

    and-int/lit8 v9, v7, 0x4

    if-eqz v9, :cond_4

    .line 1374
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    neg-double v5, v5

    iput-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 1375
    iget-wide v5, v0, Ll/֡᩶ۡ;->ۙ:D

    neg-double v5, v5

    iput-wide v5, v0, Ll/֡᩶ۡ;->ۙ:D

    goto :goto_0

    :cond_4
    cmpl-double v9, v5, v10

    if-nez v9, :cond_5

    cmpl-double v5, v12, v10

    if-nez v5, :cond_5

    and-int/lit8 v5, v7, -0x3

    .line 1380
    iput v5, v0, Ll/֡᩶ۡ;->۫:I

    goto :goto_0

    :cond_5
    or-int/lit8 v5, v7, 0x2

    .line 1382
    iput v5, v0, Ll/֡᩶ۡ;->۫:I

    .line 1385
    :goto_0
    iput v8, v0, Ll/֡᩶ۡ;->ۤ:I

    goto :goto_1

    :cond_6
    cmpl-double v7, v14, v10

    if-eqz v7, :cond_7

    .line 1434
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩸:D

    .line 1435
    iget-wide v9, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v11, v14, v7

    mul-double v16, v5, v9

    add-double v11, v16, v11

    .line 1436
    iput-wide v11, v0, Ll/֡᩶ۡ;->᩸:D

    neg-double v11, v5

    mul-double v7, v7, v11

    mul-double v9, v9, v14

    add-double/2addr v9, v7

    .line 1437
    iput-wide v9, v0, Ll/֡᩶ۡ;->᩹:D

    .line 1438
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 1439
    iget-wide v9, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v16, v14, v7

    mul-double v5, v5, v9

    add-double v5, v5, v16

    .line 1440
    iput-wide v5, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v11, v11, v7

    mul-double v14, v14, v9

    add-double/2addr v14, v11

    .line 1441
    iput-wide v14, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 1442
    invoke-virtual/range {p0 .. p0}, Ll/֡᩶ۡ;->ܳ()V

    :cond_7
    :goto_1
    neg-double v1, v1

    neg-double v3, v3

    .line 1477
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/֡᩶ۡ;->ܽ(DD)V

    return-void
.end method

.method public final ֫(DDDDDD)V
    .locals 0

    .line 2218
    iput-wide p1, p0, Ll/֡᩶ۡ;->᩸:D

    .line 2219
    iput-wide p3, p0, Ll/֡᩶ۡ;->ۙ:D

    .line 2220
    iput-wide p5, p0, Ll/֡᩶ۡ;->᩹:D

    .line 2221
    iput-wide p7, p0, Ll/֡᩶ۡ;->ۗ:D

    .line 2222
    iput-wide p9, p0, Ll/֡᩶ۡ;->᩶:D

    .line 2223
    iput-wide p11, p0, Ll/֡᩶ۡ;->۬:D

    .line 2224
    invoke-virtual {p0}, Ll/֡᩶ۡ;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/֡᩶ۡ;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 2254
    iget v2, v0, Ll/֡᩶ۡ;->۫:I

    .line 2255
    iget v3, v1, Ll/֡᩶ۡ;->۫:I

    shl-int/lit8 v4, v3, 0x3

    or-int/2addr v4, v2

    const/16 v5, 0x30

    if-eq v4, v5, :cond_1

    const/16 v5, 0x38

    if-eq v4, v5, :cond_0

    packed-switch v4, :pswitch_data_0

    const-wide/16 v5, 0x0

    packed-switch v4, :pswitch_data_1

    .line 2370
    iget-wide v4, v1, Ll/֡᩶ۡ;->᩸:D

    .line 2371
    iget-wide v6, v1, Ll/֡᩶ۡ;->᩹:D

    .line 2372
    iget-wide v8, v1, Ll/֡᩶ۡ;->᩶:D

    .line 2373
    iget-wide v10, v1, Ll/֡᩶ۡ;->ۙ:D

    .line 2374
    iget-wide v12, v1, Ll/֡᩶ۡ;->ۗ:D

    .line 2375
    iget-wide v14, v1, Ll/֡᩶ۡ;->۬:D

    packed-switch v2, :pswitch_data_2

    .line 2378
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v1, 0x0

    throw v1

    .line 2325
    :pswitch_0
    iget-wide v2, v1, Ll/֡᩶ۡ;->᩸:D

    iget-wide v4, v1, Ll/֡᩶ۡ;->ۗ:D

    invoke-virtual {v0, v2, v3, v4, v5}, Ll/֡᩶ۡ;->֫(DD)V

    return-void

    .line 2314
    :pswitch_1
    iget-wide v2, v1, Ll/֡᩶ۡ;->᩶:D

    iget-wide v4, v1, Ll/֡᩶ۡ;->۬:D

    invoke-virtual {v0, v2, v3, v4, v5}, Ll/֡᩶ۡ;->ܽ(DD)V

    :pswitch_2
    return-void

    .line 2295
    :pswitch_3
    iget-wide v7, v1, Ll/֡᩶ۡ;->᩶:D

    iput-wide v7, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2296
    iget-wide v7, v1, Ll/֡᩶ۡ;->۬:D

    iput-wide v7, v0, Ll/֡᩶ۡ;->۬:D

    goto :goto_0

    .line 2331
    :pswitch_4
    iget-wide v2, v1, Ll/֡᩶ۡ;->᩹:D

    .line 2332
    iget-wide v4, v1, Ll/֡᩶ۡ;->ۙ:D

    .line 2333
    iget-wide v6, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2334
    iget-wide v8, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v8, v8, v4

    iput-wide v8, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v6, v6, v2

    .line 2335
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2336
    iget-wide v6, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2337
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v8, v8, v4

    iput-wide v8, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v6, v6, v2

    .line 2338
    iput-wide v6, v0, Ll/֡᩶ۡ;->ۗ:D

    const/4 v1, -0x1

    .line 2339
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 2343
    :pswitch_5
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩹:D

    iget-wide v7, v1, Ll/֡᩶ۡ;->ۙ:D

    mul-double v3, v3, v7

    iput-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2344
    iput-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2345
    iget-wide v3, v0, Ll/֡᩶ۡ;->ۙ:D

    iget-wide v7, v1, Ll/֡᩶ۡ;->᩹:D

    mul-double v3, v3, v7

    iput-wide v3, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2346
    iput-wide v5, v0, Ll/֡᩶ۡ;->ۙ:D

    xor-int/lit8 v1, v2, 0x6

    .line 2347
    iput v1, v0, Ll/֡᩶ۡ;->۫:I

    const/4 v1, -0x1

    .line 2348
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 2352
    :pswitch_6
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    iget-wide v7, v1, Ll/֡᩶ۡ;->᩹:D

    mul-double v3, v3, v7

    iput-wide v3, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2353
    iput-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2354
    iget-wide v3, v0, Ll/֡᩶ۡ;->ۗ:D

    iget-wide v7, v1, Ll/֡᩶ۡ;->ۙ:D

    mul-double v3, v3, v7

    iput-wide v3, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2355
    iput-wide v5, v0, Ll/֡᩶ۡ;->ۗ:D

    xor-int/lit8 v1, v2, 0x6

    .line 2356
    iput v1, v0, Ll/֡᩶ۡ;->۫:I

    const/4 v1, -0x1

    .line 2357
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :pswitch_7
    const/4 v2, -0x1

    .line 2360
    iput-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2361
    iget-wide v3, v1, Ll/֡᩶ۡ;->᩹:D

    iput-wide v3, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2362
    iget-wide v3, v1, Ll/֡᩶ۡ;->ۙ:D

    iput-wide v3, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2363
    iput-wide v5, v0, Ll/֡᩶ۡ;->ۗ:D

    const/4 v1, 0x5

    .line 2364
    iput v1, v0, Ll/֡᩶ۡ;->۫:I

    .line 2365
    iput v2, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 2299
    :goto_0
    :pswitch_8
    iget-wide v7, v1, Ll/֡᩶ۡ;->᩹:D

    iput-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2300
    iget-wide v7, v1, Ll/֡᩶ۡ;->ۙ:D

    iput-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2301
    iput-wide v5, v0, Ll/֡᩶ۡ;->ۗ:D

    iput-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2302
    iput v3, v0, Ll/֡᩶ۡ;->۫:I

    .line 2303
    iget v1, v1, Ll/֡᩶ۡ;->ۤ:I

    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :pswitch_9
    or-int v1, v2, v3

    .line 2381
    iput v1, v0, Ll/֡᩶ۡ;->۫:I

    .line 2384
    :pswitch_a
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩸:D

    move-wide/from16 v16, v14

    .line 2385
    iget-wide v14, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v18, v4, v1

    mul-double v20, v10, v14

    move-wide/from16 v22, v10

    add-double v10, v20, v18

    .line 2386
    iput-wide v10, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v10, v6, v1

    mul-double v18, v12, v14

    add-double v10, v18, v10

    .line 2387
    iput-wide v10, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2388
    iget-wide v10, v0, Ll/֡᩶ۡ;->᩶:D

    mul-double v1, v1, v8

    mul-double v14, v14, v16

    add-double/2addr v14, v1

    add-double/2addr v14, v10

    iput-wide v14, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2390
    iget-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2391
    iget-wide v10, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v4, v4, v1

    mul-double v14, v22, v10

    add-double/2addr v14, v4

    .line 2392
    iput-wide v14, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v6, v6, v1

    mul-double v12, v12, v10

    add-double/2addr v12, v6

    .line 2393
    iput-wide v12, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2394
    iget-wide v3, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v8, v8, v1

    mul-double v14, v16, v10

    add-double/2addr v14, v8

    add-double/2addr v14, v3

    iput-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    const/4 v1, -0x1

    .line 2395
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :pswitch_b
    move-wide/from16 v22, v10

    move-wide/from16 v16, v14

    .line 2400
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v10, v22, v1

    .line 2401
    iput-wide v10, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v12, v12, v1

    .line 2402
    iput-wide v12, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2403
    iget-wide v10, v0, Ll/֡᩶ۡ;->᩶:D

    mul-double v14, v16, v1

    add-double/2addr v14, v10

    iput-wide v14, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2405
    iget-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v4, v4, v1

    .line 2406
    iput-wide v4, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v6, v6, v1

    .line 2407
    iput-wide v6, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2408
    iget-wide v3, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v8, v8, v1

    add-double/2addr v8, v3

    iput-wide v8, v0, Ll/֡᩶ۡ;->۬:D

    goto :goto_1

    :pswitch_c
    move-wide/from16 v22, v10

    move-wide/from16 v16, v14

    .line 2413
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v4, v4, v1

    .line 2414
    iput-wide v4, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v6, v6, v1

    .line 2415
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2416
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩶:D

    mul-double v8, v8, v1

    add-double/2addr v8, v3

    iput-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2418
    iget-wide v1, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v10, v22, v1

    .line 2419
    iput-wide v10, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v12, v12, v1

    .line 2420
    iput-wide v12, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2421
    iget-wide v3, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v14, v16, v1

    add-double/2addr v14, v3

    iput-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    .line 2436
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ll/֡᩶ۡ;->ܳ()V

    return-void

    :pswitch_d
    move-wide/from16 v22, v10

    move-wide/from16 v16, v14

    .line 2425
    iput-wide v4, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2426
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2427
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr v1, v8

    iput-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    move-wide/from16 v1, v22

    .line 2429
    iput-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2430
    iput-wide v12, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2431
    iget-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    add-double v1, v1, v16

    iput-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    or-int/lit8 v1, v3, 0x1

    .line 2432
    iput v1, v0, Ll/֡᩶ۡ;->۫:I

    const/4 v1, -0x1

    .line 2433
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 2271
    :cond_0
    iget-wide v4, v1, Ll/֡᩶ۡ;->᩹:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2272
    iget-wide v4, v1, Ll/֡᩶ۡ;->ۙ:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2275
    :pswitch_e
    iget-wide v4, v1, Ll/֡᩶ۡ;->᩸:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2276
    iget-wide v4, v1, Ll/֡᩶ۡ;->ۗ:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2279
    :pswitch_f
    iget-wide v4, v1, Ll/֡᩶ۡ;->᩶:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2280
    iget-wide v4, v1, Ll/֡᩶ۡ;->۬:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->۬:D

    .line 2281
    iput v3, v0, Ll/֡᩶ۡ;->۫:I

    .line 2282
    iget v1, v1, Ll/֡᩶ۡ;->ۤ:I

    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 2285
    :cond_1
    iget-wide v4, v1, Ll/֡᩶ۡ;->᩹:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2286
    iget-wide v4, v1, Ll/֡᩶ۡ;->ۙ:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2289
    :pswitch_10
    iget-wide v4, v1, Ll/֡᩶ۡ;->᩸:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2290
    iget-wide v4, v1, Ll/֡᩶ۡ;->ۗ:D

    iput-wide v4, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2291
    iput v3, v0, Ll/֡᩶ۡ;->۫:I

    .line 2292
    iget v1, v1, Ll/֡᩶ۡ;->ۤ:I

    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_f
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_e
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public final ֫(Ll/۠᩶ۡ;Ll/۠᩶ۡ;)V
    .locals 8

    .line 202
    iget-wide v0, p1, Ll/۠᩶ۡ;->᩸:D

    .line 211
    iget-wide v2, p1, Ll/۠᩶ۡ;->᩹:D

    .line 3799
    iget p1, p0, Ll/֡᩶ۡ;->۫:I

    packed-switch p1, :pswitch_data_0

    .line 3801
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 3806
    :pswitch_0
    iget-wide v4, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v4, v4, v0

    iget-wide v6, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v6, v6, v2

    add-double/2addr v6, v4

    iget-wide v4, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v0, v0, v4

    iget-wide v4, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v2, v2, v4

    add-double/2addr v2, v0

    invoke-virtual {p2, v6, v7, v2, v3}, Ll/۠᩶ۡ;->֫(DD)V

    return-void

    .line 3810
    :pswitch_1
    iget-wide v4, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v2, v2, v4

    iget-wide v4, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v0, v0, v4

    invoke-virtual {p2, v2, v3, v0, v1}, Ll/۠᩶ۡ;->֫(DD)V

    return-void

    .line 3814
    :pswitch_2
    iget-wide v4, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v0, v0, v4

    iget-wide v4, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v2, v2, v4

    invoke-virtual {p2, v0, v1, v2, v3}, Ll/۠᩶ۡ;->֫(DD)V

    return-void

    .line 3818
    :pswitch_3
    invoke-virtual {p2, v0, v1, v2, v3}, Ll/۠᩶ۡ;->֫(DD)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫([D[DI)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 3875
    iget v3, v0, Ll/֡᩶ۡ;->۫:I

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    .line 3877
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v1, 0x0

    throw v1

    .line 3882
    :pswitch_0
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3883
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3884
    iget-wide v9, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 3885
    iget-wide v11, v0, Ll/֡᩶ۡ;->ۗ:D

    const/4 v3, 0x0

    move/from16 v3, p3

    const/4 v4, 0x0

    const/4 v13, 0x0

    :goto_0
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_0

    add-int/lit8 v14, v13, 0x1

    .line 3887
    aget-wide v15, v1, v13

    add-int/lit8 v13, v13, 0x2

    .line 3888
    aget-wide v17, v1, v14

    add-int/lit8 v14, v4, 0x1

    mul-double v19, v15, v5

    mul-double v21, v17, v7

    add-double v21, v21, v19

    .line 3889
    aput-wide v21, v2, v4

    add-int/lit8 v4, v4, 0x2

    mul-double v15, v15, v9

    mul-double v17, v17, v11

    add-double v17, v17, v15

    .line 3890
    aput-wide v17, v2, v14

    goto :goto_0

    .line 3895
    :pswitch_1
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3896
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    const/4 v3, 0x0

    move/from16 v3, p3

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_1
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_0

    add-int/lit8 v10, v9, 0x1

    .line 3898
    aget-wide v11, v1, v9

    add-int/lit8 v13, v4, 0x1

    add-int/lit8 v9, v9, 0x2

    .line 3899
    aget-wide v14, v1, v10

    mul-double v14, v14, v5

    aput-wide v14, v2, v4

    add-int/lit8 v4, v4, 0x2

    mul-double v11, v11, v7

    .line 3900
    aput-wide v11, v2, v13

    goto :goto_1

    .line 3905
    :pswitch_2
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3906
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    const/4 v3, 0x0

    move/from16 v3, p3

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_2
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_0

    add-int/lit8 v10, v9, 0x1

    add-int/lit8 v11, v4, 0x1

    .line 3908
    aget-wide v12, v1, v4

    mul-double v12, v12, v5

    aput-wide v12, v2, v9

    add-int/lit8 v9, v9, 0x2

    add-int/lit8 v4, v4, 0x2

    .line 3909
    aget-wide v11, v1, v11

    mul-double v11, v11, v7

    aput-wide v11, v2, v10

    goto :goto_2

    :pswitch_3
    if-ne v1, v2, :cond_1

    :cond_0
    return-void

    :cond_1
    mul-int/lit8 v3, p3, 0x2

    .line 3915
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫([FI[FII)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    if-ne v3, v1, :cond_0

    if-le v4, v2, :cond_0

    mul-int/lit8 v5, p5, 0x2

    add-int v6, v2, v5

    if-ge v4, v6, :cond_0

    .line 3086
    invoke-static {v1, v2, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v2, v4

    .line 3090
    :cond_0
    iget v5, v0, Ll/֡᩶ۡ;->۫:I

    packed-switch v5, :pswitch_data_0

    .line 3092
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v1, 0x0

    throw v1

    .line 3096
    :pswitch_0
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3097
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3098
    iget-wide v9, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3099
    iget-wide v11, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 3100
    iget-wide v13, v0, Ll/֡᩶ۡ;->ۗ:D

    move-wide v15, v13

    .line 3101
    iget-wide v13, v0, Ll/֡᩶ۡ;->۬:D

    move/from16 v17, v2

    move/from16 v2, p5

    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    add-int/lit8 v18, v17, 0x1

    move/from16 p2, v2

    .line 3103
    aget v2, v1, v17

    move-wide/from16 v19, v13

    float-to-double v13, v2

    add-int/lit8 v17, v17, 0x2

    .line 3104
    aget v2, v1, v18

    float-to-double v1, v2

    add-int/lit8 v18, v4, 0x1

    mul-double v21, v5, v13

    mul-double v23, v7, v1

    add-double v23, v23, v21

    move-wide/from16 v21, v5

    add-double v5, v23, v9

    double-to-float v5, v5

    .line 3105
    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x2

    mul-double v13, v13, v11

    mul-double v1, v1, v15

    add-double/2addr v1, v13

    add-double v1, v1, v19

    double-to-float v1, v1

    .line 3106
    aput v1, v3, v18

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v13, v19

    move-wide/from16 v5, v21

    goto :goto_0

    .line 3110
    :pswitch_1
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3111
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3112
    iget-wide v9, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 3113
    iget-wide v11, v0, Ll/֡᩶ۡ;->ۗ:D

    move/from16 v1, p5

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    add-int/lit8 v13, v2, 0x1

    move-object/from16 v14, p1

    .line 3115
    aget v15, v14, v2

    move/from16 p2, v1

    float-to-double v0, v15

    add-int/lit8 v2, v2, 0x2

    .line 3116
    aget v13, v14, v13

    float-to-double v13, v13

    add-int/lit8 v15, v4, 0x1

    mul-double v16, v5, v0

    mul-double v18, v7, v13

    move-wide/from16 v20, v5

    add-double v5, v18, v16

    double-to-float v5, v5

    .line 3117
    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x2

    mul-double v0, v0, v9

    mul-double v13, v13, v11

    add-double/2addr v13, v0

    double-to-float v0, v13

    .line 3118
    aput v0, v3, v15

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-wide/from16 v5, v20

    goto :goto_1

    .line 3122
    :pswitch_2
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3123
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3124
    iget-wide v9, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 3125
    iget-wide v11, v0, Ll/֡᩶ۡ;->۬:D

    move/from16 v1, p5

    :goto_2
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    add-int/lit8 v13, v2, 0x1

    move-object/from16 v14, p1

    .line 3127
    aget v15, v14, v2

    move/from16 p2, v1

    float-to-double v0, v15

    add-int/lit8 v15, v4, 0x1

    add-int/lit8 v2, v2, 0x2

    .line 3128
    aget v13, v14, v13

    float-to-double v13, v13

    mul-double v13, v13, v5

    add-double/2addr v13, v7

    double-to-float v13, v13

    aput v13, v3, v4

    add-int/lit8 v4, v4, 0x2

    mul-double v0, v0, v9

    add-double/2addr v0, v11

    double-to-float v0, v0

    .line 3129
    aput v0, v3, v15

    move-object/from16 v0, p0

    move/from16 v1, p2

    goto :goto_2

    .line 3133
    :pswitch_3
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3134
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    move/from16 v1, p5

    :goto_3
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    add-int/lit8 v9, v2, 0x1

    move-object/from16 v10, p1

    .line 3136
    aget v11, v10, v2

    float-to-double v11, v11

    add-int/lit8 v13, v4, 0x1

    add-int/lit8 v2, v2, 0x2

    .line 3137
    aget v9, v10, v9

    float-to-double v14, v9

    mul-double v14, v14, v5

    double-to-float v9, v14

    aput v9, v3, v4

    add-int/lit8 v4, v4, 0x2

    mul-double v11, v11, v7

    double-to-float v9, v11

    .line 3138
    aput v9, v3, v13

    goto :goto_3

    :pswitch_4
    move-object v10, v1

    .line 3142
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3143
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3144
    iget-wide v11, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 3145
    iget-wide v13, v0, Ll/֡᩶ۡ;->۬:D

    move/from16 v1, p5

    :goto_4
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    add-int/lit8 v9, v4, 0x1

    add-int/lit8 v15, v2, 0x1

    move/from16 p2, v1

    .line 3147
    aget v1, v10, v2

    float-to-double v0, v1

    mul-double v0, v0, v5

    add-double/2addr v0, v7

    double-to-float v0, v0

    aput v0, v3, v4

    add-int/lit8 v4, v4, 0x2

    add-int/lit8 v2, v2, 0x2

    .line 3148
    aget v0, v10, v15

    float-to-double v0, v0

    mul-double v0, v0, v11

    add-double/2addr v0, v13

    double-to-float v0, v0

    aput v0, v3, v9

    move-object/from16 v0, p0

    move/from16 v1, p2

    goto :goto_4

    :cond_1
    move-object/from16 v0, p0

    goto :goto_7

    :pswitch_5
    move-object v10, v1

    .line 3152
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3153
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    move/from16 v1, p5

    :goto_5
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    add-int/lit8 v9, v4, 0x1

    add-int/lit8 v11, v2, 0x1

    .line 3155
    aget v12, v10, v2

    float-to-double v12, v12

    mul-double v12, v12, v5

    double-to-float v12, v12

    aput v12, v3, v4

    add-int/lit8 v4, v4, 0x2

    add-int/lit8 v2, v2, 0x2

    .line 3156
    aget v11, v10, v11

    float-to-double v11, v11

    mul-double v11, v11, v7

    double-to-float v11, v11

    aput v11, v3, v9

    goto :goto_5

    :pswitch_6
    move-object v10, v1

    .line 3160
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3161
    iget-wide v7, v0, Ll/֡᩶ۡ;->۬:D

    move/from16 v1, p5

    :goto_6
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    add-int/lit8 v9, v4, 0x1

    add-int/lit8 v11, v2, 0x1

    .line 3163
    aget v12, v10, v2

    float-to-double v12, v12

    add-double/2addr v12, v5

    double-to-float v12, v12

    aput v12, v3, v4

    add-int/lit8 v4, v4, 0x2

    add-int/lit8 v2, v2, 0x2

    .line 3164
    aget v11, v10, v11

    float-to-double v11, v11

    add-double/2addr v11, v7

    double-to-float v11, v11

    aput v11, v3, v9

    goto :goto_6

    :pswitch_7
    move-object v10, v1

    if-ne v10, v3, :cond_3

    if-eq v2, v4, :cond_2

    goto :goto_8

    :cond_2
    :goto_7
    return-void

    :cond_3
    :goto_8
    mul-int/lit8 v1, p5, 0x2

    .line 3169
    invoke-static {v10, v2, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(DD)V
    .locals 6

    .line 1718
    iget v0, p0, Ll/֡᩶ۡ;->۫:I

    const/4 v1, -0x1

    const-wide/16 v2, 0x0

    packed-switch v0, :pswitch_data_0

    .line 1721
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 1727
    :pswitch_0
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    .line 1728
    iget-wide v2, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v4, v2, p3

    add-double/2addr v4, v0

    .line 1729
    iput-wide v4, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v0, v0, p1

    add-double/2addr v0, v2

    .line 1730
    iput-wide v0, p0, Ll/֡᩶ۡ;->᩹:D

    .line 1732
    iget-wide v0, p0, Ll/֡᩶ۡ;->ۙ:D

    .line 1733
    iget-wide v2, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double p3, p3, v2

    add-double/2addr p3, v0

    .line 1734
    iput-wide p3, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v0, v0, p1

    add-double/2addr v0, v2

    .line 1735
    iput-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    .line 1736
    invoke-virtual {p0}, Ll/֡᩶ۡ;->ܳ()V

    return-void

    .line 1740
    :pswitch_1
    iget-wide v4, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v4, v4, p3

    iput-wide v4, p0, Ll/֡᩶ۡ;->᩸:D

    .line 1741
    iget-wide p3, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double p3, p3, p1

    iput-wide p3, p0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double p1, v4, v2

    if-nez p1, :cond_0

    cmpl-double p1, p3, v2

    if-eqz p1, :cond_1

    :cond_0
    or-int/lit8 p1, v0, 0x2

    .line 1743
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1745
    :cond_1
    iput v1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1749
    :pswitch_2
    iget-wide v4, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v4, v4, p1

    iput-wide v4, p0, Ll/֡᩶ۡ;->᩹:D

    .line 1750
    iget-wide p1, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double p1, p1, p3

    iput-wide p1, p0, Ll/֡᩶ۡ;->ۙ:D

    cmpl-double p3, v4, v2

    if-nez p3, :cond_2

    cmpl-double p3, p1, v2

    if-eqz p3, :cond_3

    :cond_2
    or-int/lit8 p1, v0, 0x4

    .line 1752
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1754
    :cond_3
    iput v1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1758
    :pswitch_3
    iput-wide p1, p0, Ll/֡᩶ۡ;->᩹:D

    .line 1759
    iput-wide p3, p0, Ll/֡᩶ۡ;->ۙ:D

    cmpl-double v4, p1, v2

    if-nez v4, :cond_5

    cmpl-double p1, p3, v2

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    :goto_0
    or-int/lit8 p1, v0, 0x6

    .line 1761
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1762
    iput v1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(Ll/֡᩶ۡ;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 2469
    iget v2, v0, Ll/֡᩶ۡ;->۫:I

    .line 2470
    iget v3, v1, Ll/֡᩶ۡ;->۫:I

    shl-int/lit8 v4, v3, 0x3

    or-int/2addr v4, v2

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    .line 2566
    iget-wide v4, v1, Ll/֡᩶ۡ;->᩸:D

    .line 2567
    iget-wide v6, v1, Ll/֡᩶ۡ;->᩹:D

    .line 2568
    iget-wide v8, v1, Ll/֡᩶ۡ;->᩶:D

    .line 2569
    iget-wide v10, v1, Ll/֡᩶ۡ;->ۙ:D

    .line 2570
    iget-wide v12, v1, Ll/֡᩶ۡ;->ۗ:D

    .line 2571
    iget-wide v14, v1, Ll/֡᩶ۡ;->۬:D

    packed-switch v2, :pswitch_data_2

    .line 2574
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v1, 0x0

    throw v1

    :pswitch_0
    or-int/lit8 v3, v2, 0x2

    .line 2506
    iput v3, v0, Ll/֡᩶ۡ;->۫:I

    .line 2515
    :pswitch_1
    iget-wide v3, v1, Ll/֡᩶ۡ;->᩸:D

    .line 2516
    iget-wide v5, v1, Ll/֡᩶ۡ;->ۗ:D

    and-int/lit8 v1, v2, 0x4

    if-eqz v1, :cond_0

    .line 2518
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v7, v7, v3

    iput-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2519
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v7, v7, v5

    iput-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    and-int/lit8 v1, v2, 0x2

    if-eqz v1, :cond_1

    .line 2521
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v7, v7, v3

    iput-wide v7, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2522
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v7, v7, v5

    iput-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    goto :goto_0

    .line 2525
    :cond_0
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v7, v7, v3

    iput-wide v7, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2526
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v7, v7, v5

    iput-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    :cond_1
    :goto_0
    and-int/lit8 v1, v2, 0x1

    if-eqz v1, :cond_2

    .line 2529
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    mul-double v1, v1, v3

    iput-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2530
    iget-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v1, v1, v5

    iput-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    :cond_2
    const/4 v1, -0x1

    .line 2532
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 2499
    :pswitch_2
    iget-wide v2, v0, Ll/֡᩶ۡ;->᩶:D

    iget-wide v4, v1, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr v2, v4

    iput-wide v2, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2500
    iget-wide v2, v0, Ll/֡᩶ۡ;->۬:D

    iget-wide v4, v1, Ll/֡᩶ۡ;->۬:D

    add-double/2addr v2, v4

    iput-wide v2, v0, Ll/֡᩶ۡ;->۬:D

    return-void

    .line 2488
    :pswitch_3
    iget-wide v3, v1, Ll/֡᩶ۡ;->᩶:D

    iput-wide v3, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2489
    iget-wide v3, v1, Ll/֡᩶ۡ;->۬:D

    iput-wide v3, v0, Ll/֡᩶ۡ;->۬:D

    or-int/lit8 v1, v2, 0x1

    .line 2490
    iput v1, v0, Ll/֡᩶ۡ;->۫:I

    .line 2491
    iget v1, v0, Ll/֡᩶ۡ;->ۤ:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    :pswitch_4
    return-void

    :pswitch_5
    or-int/lit8 v2, v2, 0x2

    :pswitch_6
    xor-int/lit8 v2, v2, 0x4

    .line 2542
    iput v2, v0, Ll/֡᩶ۡ;->۫:I

    .line 2547
    :pswitch_7
    iget-wide v2, v1, Ll/֡᩶ۡ;->᩹:D

    .line 2548
    iget-wide v4, v1, Ll/֡᩶ۡ;->ۙ:D

    .line 2550
    iget-wide v6, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2551
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v8, v8, v2

    iput-wide v8, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v6, v6, v4

    .line 2552
    iput-wide v6, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2554
    iget-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2555
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v8, v8, v2

    iput-wide v8, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v6, v6, v4

    .line 2556
    iput-wide v6, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2558
    iget-wide v6, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2559
    iget-wide v8, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v8, v8, v2

    iput-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    mul-double v6, v6, v4

    .line 2560
    iput-wide v6, v0, Ll/֡᩶ۡ;->۬:D

    const/4 v1, -0x1

    .line 2561
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 2577
    :pswitch_8
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    move-wide/from16 v16, v14

    .line 2578
    iget-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v18, v1, v4

    mul-double v20, v14, v6

    add-double v20, v20, v18

    add-double v8, v20, v8

    mul-double v1, v1, v10

    mul-double v14, v14, v12

    add-double/2addr v14, v1

    add-double v14, v16, v14

    goto :goto_1

    :pswitch_9
    move-wide/from16 v16, v14

    .line 2584
    :goto_1
    iput-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2585
    iput-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    .line 2587
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2588
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v14, v1, v4

    mul-double v16, v8, v6

    add-double v14, v16, v14

    .line 2589
    iput-wide v14, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v1, v1, v10

    mul-double v8, v8, v12

    add-double/2addr v8, v1

    .line 2590
    iput-wide v8, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2592
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2593
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v4, v4, v1

    mul-double v6, v6, v8

    add-double/2addr v6, v4

    .line 2594
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v1, v1, v10

    mul-double v8, v8, v12

    add-double/2addr v8, v1

    .line 2595
    iput-wide v8, v0, Ll/֡᩶ۡ;->ۗ:D

    goto :goto_4

    :pswitch_a
    move-wide/from16 v16, v14

    .line 2599
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2600
    iget-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v18, v1, v4

    mul-double v20, v14, v6

    add-double v20, v20, v18

    add-double v8, v20, v8

    mul-double v1, v1, v10

    mul-double v14, v14, v12

    add-double/2addr v14, v1

    add-double v14, v16, v14

    goto :goto_2

    :pswitch_b
    move-wide/from16 v16, v14

    .line 2606
    :goto_2
    iput-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2607
    iput-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    .line 2609
    iget-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    mul-double v6, v6, v1

    .line 2610
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v1, v1, v12

    .line 2611
    iput-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2613
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v4, v4, v1

    .line 2614
    iput-wide v4, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v1, v1, v10

    .line 2615
    iput-wide v1, v0, Ll/֡᩶ۡ;->ۗ:D

    goto :goto_4

    :pswitch_c
    move-wide/from16 v16, v14

    .line 2619
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2620
    iget-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v18, v1, v4

    mul-double v20, v14, v6

    add-double v20, v20, v18

    add-double v8, v20, v8

    mul-double v1, v1, v10

    mul-double v14, v14, v12

    add-double/2addr v14, v1

    add-double v14, v16, v14

    goto :goto_3

    :pswitch_d
    move-wide/from16 v16, v14

    .line 2626
    :goto_3
    iput-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2627
    iput-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    .line 2629
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v4, v4, v1

    .line 2630
    iput-wide v4, v0, Ll/֡᩶ۡ;->᩸:D

    mul-double v1, v1, v10

    .line 2631
    iput-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2633
    iget-wide v1, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v6, v6, v1

    .line 2634
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v1, v1, v12

    .line 2635
    iput-wide v1, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2659
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ll/֡᩶ۡ;->ܳ()V

    return-void

    :pswitch_e
    move-wide/from16 v16, v14

    .line 2639
    iget-wide v14, v0, Ll/֡᩶ۡ;->᩶:D

    move/from16 v18, v2

    .line 2640
    iget-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v19, v14, v4

    mul-double v21, v1, v6

    add-double v21, v21, v19

    add-double v8, v21, v8

    mul-double v14, v14, v10

    mul-double v1, v1, v12

    add-double/2addr v1, v14

    add-double v14, v1, v16

    goto :goto_5

    :pswitch_f
    move/from16 v18, v2

    move-wide/from16 v16, v14

    .line 2646
    :goto_5
    iput-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2647
    iput-wide v14, v0, Ll/֡᩶ۡ;->۬:D

    .line 2649
    iput-wide v4, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2650
    iput-wide v10, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2652
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2653
    iput-wide v12, v0, Ll/֡᩶ۡ;->ۗ:D

    or-int v1, v18, v3

    .line 2655
    iput v1, v0, Ll/֡᩶ۡ;->۫:I

    const/4 v1, -0x1

    .line 2656
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_7
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final ۧ([D[DI)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 3218
    iget v3, v0, Ll/֡᩶ۡ;->۫:I

    packed-switch v3, :pswitch_data_0

    .line 3220
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v1, 0x0

    throw v1

    .line 3224
    :pswitch_0
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3225
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3226
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3227
    iget-wide v9, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 3228
    iget-wide v11, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 3229
    iget-wide v13, v0, Ll/֡᩶ۡ;->۬:D

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v15, p3

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    add-int/lit8 v15, v15, -0x1

    if-ltz v15, :cond_0

    add-int/lit8 v18, v16, 0x1

    .line 3231
    aget-wide v19, v1, v16

    add-int/lit8 v16, v16, 0x2

    .line 3232
    aget-wide v21, v1, v18

    add-int/lit8 v18, v17, 0x1

    mul-double v23, v3, v19

    mul-double v25, v5, v21

    add-double v25, v25, v23

    add-double v25, v25, v7

    .line 3233
    aput-wide v25, v2, v17

    add-int/lit8 v17, v17, 0x2

    mul-double v19, v19, v9

    mul-double v21, v21, v11

    add-double v21, v21, v19

    add-double v21, v21, v13

    .line 3234
    aput-wide v21, v2, v18

    goto :goto_0

    .line 3238
    :pswitch_1
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3239
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3240
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 3241
    iget-wide v9, v0, Ll/֡᩶ۡ;->ۗ:D

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v11, p3

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    add-int/lit8 v11, v11, -0x1

    if-ltz v11, :cond_0

    add-int/lit8 v14, v12, 0x1

    .line 3243
    aget-wide v15, v1, v12

    add-int/lit8 v12, v12, 0x2

    .line 3244
    aget-wide v17, v1, v14

    add-int/lit8 v14, v13, 0x1

    mul-double v19, v3, v15

    mul-double v21, v5, v17

    add-double v21, v21, v19

    .line 3245
    aput-wide v21, v2, v13

    add-int/lit8 v13, v13, 0x2

    mul-double v15, v15, v7

    mul-double v17, v17, v9

    add-double v17, v17, v15

    .line 3246
    aput-wide v17, v2, v14

    goto :goto_1

    .line 3250
    :pswitch_2
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3251
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3252
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 3253
    iget-wide v9, v0, Ll/֡᩶ۡ;->۬:D

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v11, p3

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_2
    add-int/lit8 v11, v11, -0x1

    if-ltz v11, :cond_0

    add-int/lit8 v14, v12, 0x1

    .line 3255
    aget-wide v15, v1, v12

    add-int/lit8 v17, v13, 0x1

    add-int/lit8 v12, v12, 0x2

    .line 3256
    aget-wide v18, v1, v14

    mul-double v18, v18, v3

    add-double v18, v18, v5

    aput-wide v18, v2, v13

    add-int/lit8 v13, v13, 0x2

    mul-double v15, v15, v7

    add-double/2addr v15, v9

    .line 3257
    aput-wide v15, v2, v17

    goto :goto_2

    .line 3261
    :pswitch_3
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩹:D

    .line 3262
    iget-wide v5, v0, Ll/֡᩶ۡ;->ۙ:D

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v7, p3

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_3
    add-int/lit8 v7, v7, -0x1

    if-ltz v7, :cond_0

    add-int/lit8 v10, v8, 0x1

    .line 3264
    aget-wide v11, v1, v8

    add-int/lit8 v13, v9, 0x1

    add-int/lit8 v8, v8, 0x2

    .line 3265
    aget-wide v14, v1, v10

    mul-double v14, v14, v3

    aput-wide v14, v2, v9

    add-int/lit8 v9, v9, 0x2

    mul-double v11, v11, v5

    .line 3266
    aput-wide v11, v2, v13

    goto :goto_3

    .line 3270
    :pswitch_4
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3271
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3272
    iget-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 3273
    iget-wide v9, v0, Ll/֡᩶ۡ;->۬:D

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v11, p3

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_4
    add-int/lit8 v11, v11, -0x1

    if-ltz v11, :cond_0

    add-int/lit8 v14, v12, 0x1

    add-int/lit8 v15, v13, 0x1

    .line 3275
    aget-wide v16, v1, v13

    mul-double v16, v16, v3

    add-double v16, v16, v5

    aput-wide v16, v2, v12

    add-int/lit8 v12, v12, 0x2

    add-int/lit8 v13, v13, 0x2

    .line 3276
    aget-wide v15, v1, v15

    mul-double v15, v15, v7

    add-double/2addr v15, v9

    aput-wide v15, v2, v14

    goto :goto_4

    .line 3280
    :pswitch_5
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    .line 3281
    iget-wide v5, v0, Ll/֡᩶ۡ;->ۗ:D

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v7, p3

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_5
    add-int/lit8 v7, v7, -0x1

    if-ltz v7, :cond_0

    add-int/lit8 v10, v8, 0x1

    add-int/lit8 v11, v9, 0x1

    .line 3283
    aget-wide v12, v1, v9

    mul-double v12, v12, v3

    aput-wide v12, v2, v8

    add-int/lit8 v8, v8, 0x2

    add-int/lit8 v9, v9, 0x2

    .line 3284
    aget-wide v11, v1, v11

    mul-double v11, v11, v5

    aput-wide v11, v2, v10

    goto :goto_5

    .line 3288
    :pswitch_6
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩶:D

    .line 3289
    iget-wide v5, v0, Ll/֡᩶ۡ;->۬:D

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v7, p3

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_6
    add-int/lit8 v7, v7, -0x1

    if-ltz v7, :cond_0

    add-int/lit8 v10, v8, 0x1

    add-int/lit8 v11, v9, 0x1

    .line 3291
    aget-wide v12, v1, v9

    add-double/2addr v12, v3

    aput-wide v12, v2, v8

    add-int/lit8 v8, v8, 0x2

    add-int/lit8 v9, v9, 0x2

    .line 3292
    aget-wide v11, v1, v11

    add-double/2addr v11, v5

    aput-wide v11, v2, v10

    goto :goto_6

    :pswitch_7
    if-ne v1, v2, :cond_1

    :cond_0
    return-void

    :cond_1
    mul-int/lit8 v3, p3, 0x2

    const/4 v4, 0x0

    .line 3297
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܳ()V
    .locals 8

    .line 1086
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩹:D

    const/4 v2, -0x1

    const-wide/16 v3, 0x0

    cmpl-double v5, v0, v3

    if-nez v5, :cond_3

    iget-wide v0, p0, Ll/֡᩶ۡ;->ۙ:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_3

    .line 1087
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    cmpl-double v7, v0, v5

    if-nez v7, :cond_1

    iget-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double v7, v0, v5

    if-nez v7, :cond_1

    .line 1088
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    cmpl-double v2, v0, v3

    if-nez v2, :cond_0

    iget-wide v0, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v2, v0, v3

    if-nez v2, :cond_0

    const/4 v0, 0x0

    .line 1089
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1090
    iput v0, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1092
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1093
    iput v0, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1096
    :cond_1
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_2

    iget-wide v0, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_2

    const/4 v0, 0x2

    .line 1097
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1098
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :cond_2
    const/4 v0, 0x3

    .line 1100
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1101
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1105
    :cond_3
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_5

    iget-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_5

    .line 1106
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_4

    iget-wide v0, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_4

    const/4 v0, 0x4

    .line 1107
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1108
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :cond_4
    const/4 v0, 0x5

    .line 1110
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1111
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1114
    :cond_5
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_6

    iget-wide v0, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v5, v0, v3

    if-nez v5, :cond_6

    const/4 v0, 0x6

    .line 1115
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1116
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    :cond_6
    const/4 v0, 0x7

    .line 1118
    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 1119
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void
.end method

.method public final ܽ()I
    .locals 17

    move-object/from16 v0, p0

    .line 867
    iget v1, v0, Ll/֡᩶ۡ;->ۤ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_19

    .line 884
    invoke-virtual/range {p0 .. p0}, Ll/֡᩶ۡ;->ܳ()V

    .line 885
    iget v1, v0, Ll/֡᩶ۡ;->۫:I

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    packed-switch v1, :pswitch_data_0

    .line 887
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v1, 0x0

    throw v1

    :pswitch_0
    const/4 v1, 0x1

    goto :goto_0

    :pswitch_1
    const/4 v1, 0x0

    .line 893
    :goto_0
    iget-wide v2, v0, Ll/֡᩶ۡ;->᩸:D

    iget-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    mul-double v9, v2, v7

    iget-wide v11, v0, Ll/֡᩶ۡ;->ۙ:D

    iget-wide v13, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v15, v11, v13

    add-double/2addr v15, v9

    cmpl-double v9, v15, v4

    if-eqz v9, :cond_0

    const/16 v1, 0x20

    .line 895
    iput v1, v0, Ll/֡᩶ۡ;->ۤ:I

    goto/16 :goto_f

    :cond_0
    cmpl-double v9, v2, v4

    if-ltz v9, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    cmpl-double v10, v13, v4

    if-ltz v10, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-ne v9, v6, :cond_6

    cmpl-double v4, v2, v13

    if-nez v4, :cond_5

    neg-double v4, v11

    cmpl-double v6, v7, v4

    if-eqz v6, :cond_3

    goto :goto_3

    :cond_3
    mul-double v2, v2, v13

    mul-double v7, v7, v11

    sub-double/2addr v2, v7

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v6, v2, v4

    if-eqz v6, :cond_4

    or-int/lit8 v6, v1, 0x12

    goto/16 :goto_e

    :cond_4
    or-int/lit8 v6, v1, 0x10

    goto/16 :goto_e

    :cond_5
    :goto_3
    or-int/lit8 v6, v1, 0x14

    goto/16 :goto_e

    :cond_6
    neg-double v4, v13

    cmpl-double v6, v2, v4

    if-nez v6, :cond_9

    cmpl-double v4, v7, v11

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    mul-double v2, v2, v13

    mul-double v7, v7, v11

    sub-double/2addr v2, v7

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v6, v2, v4

    if-eqz v6, :cond_8

    or-int/lit8 v6, v1, 0x52

    goto/16 :goto_e

    :cond_8
    or-int/lit8 v6, v1, 0x50

    goto/16 :goto_e

    :cond_9
    :goto_4
    or-int/lit8 v6, v1, 0x54

    goto/16 :goto_e

    :pswitch_2
    const/4 v1, 0x1

    goto :goto_5

    :pswitch_3
    const/4 v1, 0x0

    :goto_5
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 930
    iget-wide v9, v0, Ll/֡᩶ۡ;->᩹:D

    cmpl-double v11, v9, v4

    if-ltz v11, :cond_a

    const/4 v11, 0x1

    goto :goto_6

    :cond_a
    const/4 v11, 0x0

    .line 931
    :goto_6
    iget-wide v12, v0, Ll/֡᩶ۡ;->ۙ:D

    cmpl-double v14, v12, v4

    if-ltz v14, :cond_b

    goto :goto_7

    :cond_b
    const/4 v6, 0x0

    :goto_7
    if-eq v11, v6, :cond_d

    neg-double v4, v12

    cmpl-double v6, v9, v4

    if-eqz v6, :cond_c

    goto :goto_b

    :cond_c
    cmpl-double v4, v9, v7

    if-eqz v4, :cond_14

    cmpl-double v4, v9, v2

    if-eqz v4, :cond_14

    goto :goto_c

    :cond_d
    cmpl-double v2, v9, v12

    if-nez v2, :cond_e

    or-int/lit8 v6, v1, 0x4a

    goto :goto_e

    :cond_e
    or-int/lit8 v6, v1, 0x4c

    goto :goto_e

    :pswitch_4
    const/4 v1, 0x1

    goto :goto_8

    :pswitch_5
    const/4 v1, 0x0

    :goto_8
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 958
    iget-wide v9, v0, Ll/֡᩶ۡ;->᩸:D

    cmpl-double v11, v9, v4

    if-ltz v11, :cond_f

    const/4 v11, 0x1

    goto :goto_9

    :cond_f
    const/4 v11, 0x0

    .line 959
    :goto_9
    iget-wide v12, v0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double v14, v12, v4

    if-ltz v14, :cond_10

    goto :goto_a

    :cond_10
    const/4 v6, 0x0

    :goto_a
    if-ne v11, v6, :cond_15

    if-eqz v11, :cond_12

    cmpl-double v2, v9, v12

    if-nez v2, :cond_11

    or-int/lit8 v6, v1, 0x2

    goto :goto_e

    :cond_11
    or-int/lit8 v6, v1, 0x4

    goto :goto_e

    :cond_12
    cmpl-double v4, v9, v12

    if-eqz v4, :cond_13

    :goto_b
    or-int/lit8 v6, v1, 0xc

    goto :goto_e

    :cond_13
    cmpl-double v4, v9, v2

    if-eqz v4, :cond_14

    :goto_c
    or-int/lit8 v6, v1, 0xa

    goto :goto_e

    :cond_14
    or-int/lit8 v6, v1, 0x8

    goto :goto_e

    :cond_15
    neg-double v4, v12

    cmpl-double v6, v9, v4

    if-nez v6, :cond_18

    cmpl-double v4, v9, v7

    if-eqz v4, :cond_17

    cmpl-double v4, v9, v2

    if-nez v4, :cond_16

    goto :goto_d

    :cond_16
    or-int/lit8 v6, v1, 0x42

    goto :goto_e

    :cond_17
    :goto_d
    or-int/lit8 v6, v1, 0x40

    goto :goto_e

    :cond_18
    or-int/lit8 v6, v1, 0x44

    goto :goto_e

    :pswitch_6
    const/4 v6, 0x0

    .line 998
    :goto_e
    :pswitch_7
    iput v6, v0, Ll/֡᩶ۡ;->ۤ:I

    .line 870
    :cond_19
    :goto_f
    iget v1, v0, Ll/֡᩶ۡ;->ۤ:I

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܽ(DD)V
    .locals 9

    .line 1259
    iget v0, p0, Ll/֡᩶ۡ;->۫:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    packed-switch v0, :pswitch_data_0

    .line 1261
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 1265
    :pswitch_0
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v5, v5, p1

    iget-wide v7, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v7, v7, p3

    add-double/2addr v7, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr v7, v5

    iput-wide v7, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1266
    iget-wide v5, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double p1, p1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double p3, p3, v5

    add-double/2addr p3, p1

    iget-wide p1, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr p3, p1

    iput-wide p3, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double p1, v7, v3

    if-nez p1, :cond_3

    cmpl-double p1, p3, v3

    if-nez p1, :cond_3

    const/4 p1, 0x6

    .line 1268
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1269
    iget p1, p0, Ll/֡᩶ۡ;->ۤ:I

    if-eq p1, v1, :cond_3

    sub-int/2addr p1, v2

    .line 1270
    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1275
    :pswitch_1
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double v0, v0, p1

    iget-wide v5, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double v5, v5, p3

    add-double/2addr v5, v0

    iput-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1276
    iget-wide v0, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double p1, p1, v0

    iget-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double p3, p3, v0

    add-double/2addr p3, p1

    iput-wide p3, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double p1, v5, v3

    if-nez p1, :cond_0

    cmpl-double p1, p3, v3

    if-eqz p1, :cond_3

    :cond_0
    const/4 p1, 0x7

    .line 1278
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1279
    iget p1, p0, Ll/֡᩶ۡ;->ۤ:I

    or-int/2addr p1, v2

    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1283
    :pswitch_2
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double p3, p3, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr p3, v5

    iput-wide p3, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1284
    iget-wide v5, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double p1, p1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr p1, v5

    iput-wide p1, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v0, p3, v3

    if-nez v0, :cond_3

    cmpl-double p3, p1, v3

    if-nez p3, :cond_3

    const/4 p1, 0x4

    .line 1286
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1287
    iget p1, p0, Ll/֡᩶ۡ;->ۤ:I

    if-eq p1, v1, :cond_3

    sub-int/2addr p1, v2

    .line 1288
    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1293
    :pswitch_3
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩹:D

    mul-double p3, p3, v0

    iput-wide p3, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1294
    iget-wide v0, p0, Ll/֡᩶ۡ;->ۙ:D

    mul-double p1, p1, v0

    iput-wide p1, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v0, p3, v3

    if-nez v0, :cond_1

    cmpl-double p3, p1, v3

    if-eqz p3, :cond_3

    :cond_1
    const/4 p1, 0x5

    .line 1296
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1297
    iget p1, p0, Ll/֡᩶ۡ;->ۤ:I

    or-int/2addr p1, v2

    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1301
    :pswitch_4
    iget-wide v5, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double p1, p1, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr p1, v5

    iput-wide p1, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1302
    iget-wide v5, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double p3, p3, v5

    iget-wide v5, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr p3, v5

    iput-wide p3, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v0, p1, v3

    if-nez v0, :cond_3

    cmpl-double p1, p3, v3

    if-nez p1, :cond_3

    const/4 p1, 0x2

    .line 1304
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1305
    iget p1, p0, Ll/֡᩶ۡ;->ۤ:I

    if-eq p1, v1, :cond_3

    sub-int/2addr p1, v2

    .line 1306
    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1311
    :pswitch_5
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    mul-double p1, p1, v0

    iput-wide p1, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1312
    iget-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    mul-double p3, p3, v0

    iput-wide p3, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v0, p1, v3

    if-nez v0, :cond_2

    cmpl-double p1, p3, v3

    if-eqz p1, :cond_3

    :cond_2
    const/4 p1, 0x3

    .line 1314
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1315
    iget p1, p0, Ll/֡᩶ۡ;->ۤ:I

    or-int/2addr p1, v2

    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1319
    :pswitch_6
    iget-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    add-double/2addr p1, v0

    iput-wide p1, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1320
    iget-wide v0, p0, Ll/֡᩶ۡ;->۬:D

    add-double/2addr p3, v0

    iput-wide p3, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v0, p1, v3

    if-nez v0, :cond_3

    cmpl-double p1, p3, v3

    if-nez p1, :cond_3

    const/4 p1, 0x0

    .line 1322
    iput p1, p0, Ll/֡᩶ۡ;->۫:I

    .line 1323
    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    .line 1327
    :pswitch_7
    iput-wide p1, p0, Ll/֡᩶ۡ;->᩶:D

    .line 1328
    iput-wide p3, p0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v0, p1, v3

    if-nez v0, :cond_4

    cmpl-double p1, p3, v3

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    return-void

    .line 1330
    :cond_4
    :goto_0
    iput v2, p0, Ll/֡᩶ۡ;->۫:I

    .line 1331
    iput v2, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܽ(Ll/֡᩶ۡ;)V
    .locals 2

    .line 2193
    iget-wide v0, p1, Ll/֡᩶ۡ;->᩸:D

    iput-wide v0, p0, Ll/֡᩶ۡ;->᩸:D

    .line 2194
    iget-wide v0, p1, Ll/֡᩶ۡ;->ۙ:D

    iput-wide v0, p0, Ll/֡᩶ۡ;->ۙ:D

    .line 2195
    iget-wide v0, p1, Ll/֡᩶ۡ;->᩹:D

    iput-wide v0, p0, Ll/֡᩶ۡ;->᩹:D

    .line 2196
    iget-wide v0, p1, Ll/֡᩶ۡ;->ۗ:D

    iput-wide v0, p0, Ll/֡᩶ۡ;->ۗ:D

    .line 2197
    iget-wide v0, p1, Ll/֡᩶ۡ;->᩶:D

    iput-wide v0, p0, Ll/֡᩶ۡ;->᩶:D

    .line 2198
    iget-wide v0, p1, Ll/֡᩶ۡ;->۬:D

    iput-wide v0, p0, Ll/֡᩶ۡ;->۬:D

    .line 2199
    iget v0, p1, Ll/֡᩶ۡ;->۫:I

    iput v0, p0, Ll/֡᩶ۡ;->۫:I

    .line 2200
    iget p1, p1, Ll/֡᩶ۡ;->ۤ:I

    iput p1, p0, Ll/֡᩶ۡ;->ۤ:I

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 3974
    iget v0, p0, Ll/֡᩶ۡ;->۫:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/֡᩶ۡ;->ܽ()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()V
    .locals 22

    move-object/from16 v0, p0

    .line 2783
    iget v1, v0, Ll/֡᩶ۡ;->۫:I

    const-string v2, "Determinant is "

    const-string v3, "Determinant is 0"

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/16 v6, 0x0

    packed-switch v1, :pswitch_data_0

    .line 2785
    invoke-static {}, Ll/֡᩶ۡ;->ۜ()V

    const/4 v1, 0x0

    throw v1

    .line 2789
    :pswitch_0
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2790
    iget-wide v5, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2791
    iget-wide v7, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2792
    iget-wide v9, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2793
    iget-wide v11, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2794
    iget-wide v13, v0, Ll/֡᩶ۡ;->۬:D

    mul-double v17, v3, v11

    mul-double v19, v5, v9

    move-object/from16 v21, v2

    sub-double v1, v17, v19

    .line 2796
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v17

    const-wide/16 v15, 0x1

    cmpg-double v19, v17, v15

    if-lez v19, :cond_0

    move-wide v15, v7

    div-double v7, v11, v1

    .line 2800
    iput-wide v7, v0, Ll/֡᩶ۡ;->᩸:D

    neg-double v7, v9

    div-double/2addr v7, v1

    .line 2801
    iput-wide v7, v0, Ll/֡᩶ۡ;->ۙ:D

    neg-double v7, v5

    div-double/2addr v7, v1

    .line 2802
    iput-wide v7, v0, Ll/֡᩶ۡ;->᩹:D

    div-double v7, v3, v1

    .line 2803
    iput-wide v7, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v5, v5, v13

    mul-double v11, v11, v15

    sub-double/2addr v5, v11

    div-double/2addr v5, v1

    .line 2804
    iput-wide v5, v0, Ll/֡᩶ۡ;->᩶:D

    mul-double v9, v9, v15

    mul-double v3, v3, v13

    sub-double/2addr v9, v3

    div-double/2addr v9, v1

    .line 2805
    iput-wide v9, v0, Ll/֡᩶ۡ;->۬:D

    return-void

    .line 2797
    :cond_0
    new-instance v3, Ll/֨᩶ۡ;

    new-instance v4, Ljava/lang/StringBuilder;

    move-object/from16 v5, v21

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 45
    invoke-direct {v3, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2797
    throw v3

    :pswitch_1
    move-object v5, v2

    const-wide/16 v1, 0x1

    .line 2808
    iget-wide v3, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2809
    iget-wide v6, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2810
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2811
    iget-wide v10, v0, Ll/֡᩶ۡ;->ۗ:D

    mul-double v12, v3, v10

    mul-double v14, v6, v8

    sub-double/2addr v12, v14

    .line 2813
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    move-result-wide v14

    cmpg-double v16, v14, v1

    if-lez v16, :cond_1

    div-double/2addr v10, v12

    .line 2817
    iput-wide v10, v0, Ll/֡᩶ۡ;->᩸:D

    neg-double v1, v8

    div-double/2addr v1, v12

    .line 2818
    iput-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    neg-double v1, v6

    div-double/2addr v1, v12

    .line 2819
    iput-wide v1, v0, Ll/֡᩶ۡ;->᩹:D

    div-double/2addr v3, v12

    .line 2820
    iput-wide v3, v0, Ll/֡᩶ۡ;->ۗ:D

    return-void

    .line 2814
    :cond_1
    new-instance v1, Ll/֨᩶ۡ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2814
    throw v1

    .line 2825
    :pswitch_2
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2826
    iget-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2827
    iget-wide v10, v0, Ll/֡᩶ۡ;->ۙ:D

    .line 2828
    iget-wide v12, v0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v14, v1, v6

    if-eqz v14, :cond_2

    cmpl-double v14, v10, v6

    if-eqz v14, :cond_2

    div-double v6, v4, v1

    .line 2833
    iput-wide v6, v0, Ll/֡᩶ۡ;->ۙ:D

    div-double/2addr v4, v10

    .line 2834
    iput-wide v4, v0, Ll/֡᩶ۡ;->᩹:D

    neg-double v3, v12

    div-double/2addr v3, v10

    .line 2836
    iput-wide v3, v0, Ll/֡᩶ۡ;->᩶:D

    neg-double v3, v8

    div-double/2addr v3, v1

    .line 2837
    iput-wide v3, v0, Ll/֡᩶ۡ;->۬:D

    return-void

    .line 2830
    :cond_2
    new-instance v1, Ll/֨᩶ۡ;

    .line 45
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2830
    throw v1

    .line 2840
    :pswitch_3
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩹:D

    .line 2841
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۙ:D

    cmpl-double v10, v1, v6

    if-eqz v10, :cond_3

    cmpl-double v10, v8, v6

    if-eqz v10, :cond_3

    div-double v1, v4, v1

    .line 2846
    iput-wide v1, v0, Ll/֡᩶ۡ;->ۙ:D

    div-double/2addr v4, v8

    .line 2847
    iput-wide v4, v0, Ll/֡᩶ۡ;->᩹:D

    return-void

    .line 2843
    :cond_3
    new-instance v1, Ll/֨᩶ۡ;

    .line 45
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2843
    throw v1

    .line 2853
    :pswitch_4
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2854
    iget-wide v8, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2855
    iget-wide v10, v0, Ll/֡᩶ۡ;->ۗ:D

    .line 2856
    iget-wide v12, v0, Ll/֡᩶ۡ;->۬:D

    cmpl-double v14, v1, v6

    if-eqz v14, :cond_4

    cmpl-double v14, v10, v6

    if-eqz v14, :cond_4

    div-double v6, v4, v1

    .line 2860
    iput-wide v6, v0, Ll/֡᩶ۡ;->᩸:D

    div-double/2addr v4, v10

    .line 2863
    iput-wide v4, v0, Ll/֡᩶ۡ;->ۗ:D

    neg-double v3, v8

    div-double/2addr v3, v1

    .line 2864
    iput-wide v3, v0, Ll/֡᩶ۡ;->᩶:D

    neg-double v1, v12

    div-double/2addr v1, v10

    .line 2865
    iput-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    return-void

    .line 2858
    :cond_4
    new-instance v1, Ll/֨᩶ۡ;

    .line 45
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2858
    throw v1

    .line 2868
    :pswitch_5
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩸:D

    .line 2869
    iget-wide v8, v0, Ll/֡᩶ۡ;->ۗ:D

    cmpl-double v10, v1, v6

    if-eqz v10, :cond_5

    cmpl-double v10, v8, v6

    if-eqz v10, :cond_5

    div-double v1, v4, v1

    .line 2873
    iput-wide v1, v0, Ll/֡᩶ۡ;->᩸:D

    div-double/2addr v4, v8

    .line 2876
    iput-wide v4, v0, Ll/֡᩶ۡ;->ۗ:D

    return-void

    .line 2871
    :cond_5
    new-instance v1, Ll/֨᩶ۡ;

    .line 45
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2871
    throw v1

    .line 2885
    :pswitch_6
    iget-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    neg-double v1, v1

    iput-wide v1, v0, Ll/֡᩶ۡ;->᩶:D

    .line 2886
    iget-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    neg-double v1, v1

    iput-wide v1, v0, Ll/֡᩶ۡ;->۬:D

    :pswitch_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
