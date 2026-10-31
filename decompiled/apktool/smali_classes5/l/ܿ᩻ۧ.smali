.class public final Ll/ܿ᩻ۧ;
.super Ll/ܺ۟֫;
.source "Z8VY"


# static fields
.field public static ֡ᩳ:Z

.field public static final ᩴᩳ:[I

.field public static ᩵ᩳ:Z


# instance fields
.field public final ֡ܽ:Ljava/util/PriorityQueue;

.field public ֨ܽ:I

.field public ֫ᩳ:I

.field public final ۖܽ:Landroid/content/Context;

.field public final ۖᩳ:Ll/᩶᩻ۧ;

.field public ۗܽ:J

.field public ۘܽ:Ll/ۜ֡֫;

.field public ۘᩳ:Ll/ۜۜۧ;

.field public ۙܽ:Z

.field public ۚܽ:J

.field public ۛܽ:Ll/ܿ֨֫;

.field public ۜܽ:Z

.field public ۜᩳ:I

.field public ۟ܽ:Ll/᩻᩻ۧ;

.field public final ۠ܽ:Z

.field public ۡܽ:I

.field public ۡᩳ:I

.field public ۢܽ:Z

.field public ۢᩳ:Ljava/util/List;

.field public ۤܽ:I

.field public ۧᩳ:Ll/ۜ֡֫;

.field public final ۨܽ:Z

.field public final ۫ܽ:J

.field public final ۬ܽ:I

.field public ܰܽ:J

.field public ܳܽ:I

.field public ܳᩳ:J

.field public final ܶܽ:Ll/ۧۜۧ;

.field public ܺܽ:I

.field public final ܺᩳ:Ll/ۙ᩻ۧ;

.field public ܽᩳ:I

.field public ܿᩳ:J

.field public ᩳᩳ:Ll/᩷۬֫;

.field public final ᩴܽ:Z

.field public ᩵ܽ:Landroid/view/Surface;

.field public ᩶ܽ:Z

.field public ᩷ܽ:Ll/ܽ᩻ۧ;

.field public ᩷ᩳ:Ll/ᩳ᩻ۧ;

.field public ᩸ܽ:Ll/᩹᩻ۧ;

.field public ᩹ܽ:Z

.field public ᩺ܽ:Z

.field public ᩻ܽ:I

.field public ᩻ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    .line 131
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ᩻ۧ;->ᩴᩳ:[I

    return-void

    :array_0
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
    .end array-data
.end method

.method public constructor <init>(Ll/ۧ᩻ۧ;)V
    .locals 7

    .line 564
    invoke-static {p1}, Ll/ۧ᩻ۧ;->ۧ(Ll/ۧ᩻ۧ;)Ll/ܰܰ֫;

    move-result-object v2

    const/4 v4, 0x0

    const/high16 v5, 0x41f00000    # 30.0f

    const/4 v1, 0x2

    sget-object v3, Ll/ۖ۟֫;->ᩳ:Ll/ᩴۖܽ;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ܺ۟֫;-><init>(ILl/ܰܰ֫;Ll/ۖ۟֫;ZF)V

    .line 570
    invoke-static {p1}, Ll/ۧ᩻ۧ;->ܽ(Ll/ۧ᩻ۧ;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ᩻ۧ;->ۖܽ:Landroid/content/Context;

    .line 571
    invoke-static {p1}, Ll/ۧ᩻ۧ;->ܳ(Ll/ۧ᩻ۧ;)I

    move-result v1

    iput v1, p0, Ll/ܿ᩻ۧ;->۬ܽ:I

    const/4 v1, 0x0

    .line 572
    iput-object v1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    .line 573
    new-instance v2, Ll/ۧۜۧ;

    invoke-static {p1}, Ll/ۧ᩻ۧ;->ᩳ(Ll/ۧ᩻ۧ;)Landroid/os/Handler;

    move-result-object v3

    invoke-static {p1}, Ll/ۧ᩻ۧ;->ܿ(Ll/ۧ᩻ۧ;)Ll/ܽۜۧ;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ll/ۧۜۧ;-><init>(Landroid/os/Handler;Ll/ܽۜۧ;)V

    iput-object v2, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    .line 574
    iget-object v2, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Ll/ܿ᩻ۧ;->ۨܽ:Z

    .line 577
    new-instance v2, Ll/ۙ᩻ۧ;

    invoke-static {p1}, Ll/ۧ᩻ۧ;->֫(Ll/ۧ᩻ۧ;)J

    move-result-wide v5

    invoke-direct {v2, v0, p0, v5, v6}, Ll/ۙ᩻ۧ;-><init>(Landroid/content/Context;Ll/ܿ᩻ۧ;J)V

    iput-object v2, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    .line 580
    new-instance p1, Ll/᩶᩻ۧ;

    invoke-direct {p1}, Ll/᩶᩻ۧ;-><init>()V

    iput-object p1, p0, Ll/ܿ᩻ۧ;->ۖᩳ:Ll/᩶᩻ۧ;

    const-string p1, "NVIDIA"

    .line 2545
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    .line 581
    iput-boolean p1, p0, Ll/ܿ᩻ۧ;->ᩴܽ:Z

    .line 582
    sget-object p1, Ll/ܿ֨֫;->ܽ:Ll/ܿ֨֫;

    iput-object p1, p0, Ll/ܿ᩻ۧ;->ۛܽ:Ll/ܿ֨֫;

    .line 583
    iput v3, p0, Ll/ܿ᩻ۧ;->ܽᩳ:I

    .line 584
    iput v4, p0, Ll/ܿ᩻ۧ;->᩻ܽ:I

    .line 585
    sget-object p1, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    iput-object p1, p0, Ll/ܿ᩻ۧ;->ۘܽ:Ll/ۜ֡֫;

    .line 586
    iput v4, p0, Ll/ܿ᩻ۧ;->ۜᩳ:I

    .line 587
    iput-object v1, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    const/16 p1, -0x3e8

    .line 588
    iput p1, p0, Ll/ܿ᩻ۧ;->֫ᩳ:I

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 589
    iput-wide v2, p0, Ll/ܿ᩻ۧ;->ܿᩳ:J

    .line 590
    iput-wide v2, p0, Ll/ܿ᩻ۧ;->ܰܽ:J

    .line 593
    new-instance p1, Ljava/util/PriorityQueue;

    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    iput-object p1, p0, Ll/ܿ᩻ۧ;->֡ܽ:Ljava/util/PriorityQueue;

    .line 599
    iput-wide v2, p0, Ll/ܿ᩻ۧ;->۫ܽ:J

    .line 602
    iput-boolean v4, p0, Ll/ܿ᩻ۧ;->۠ܽ:Z

    .line 603
    iput-object v1, p0, Ll/ܿ᩻ۧ;->ᩳᩳ:Ll/᩷۬֫;

    return-void
.end method

.method public static ֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I
    .locals 10

    .line 1353
    iget v0, p1, Ll/۠ᩴ֫;->᩷֫:I

    .line 1354
    iget v1, p1, Ll/۠ᩴ֫;->۠:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_d

    if-ne v1, v2, :cond_0

    goto/16 :goto_4

    .line 1360
    :cond_0
    iget-object v3, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "video/dolby-vision"

    .line 1361
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "video/avc"

    const-string v6, "video/av01"

    const/4 v7, 0x1

    const-string v8, "video/hevc"

    const/4 v9, 0x2

    if-eqz v4, :cond_4

    .line 1369
    sget v3, Ll/᩹۟֫;->֫:I

    .line 347
    invoke-static {p1}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 1371
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v3, 0x200

    if-eq p1, v3, :cond_2

    if-eq p1, v7, :cond_2

    if-ne p1, v9, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0x400

    if-ne p1, v3, :cond_3

    move-object v3, v6

    goto :goto_1

    :cond_2
    :goto_0
    move-object v3, v5

    goto :goto_1

    :cond_3
    move-object v3, v8

    .line 1383
    :cond_4
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string p1, "video/x-vnd.on2.vp9"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v7, 0x6

    goto :goto_3

    :sswitch_1
    const-string p1, "video/x-vnd.on2.vp8"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v7, 0x5

    goto :goto_3

    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v7, 0x4

    goto :goto_3

    :sswitch_3
    const-string p1, "video/mp4v-es"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v7, 0x3

    goto :goto_3

    :sswitch_4
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_2

    :cond_9
    const/4 v7, 0x2

    goto :goto_3

    :sswitch_5
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_2

    :sswitch_6
    const-string p1, "video/3gpp"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    const/4 v7, 0x0

    goto :goto_3

    :goto_2
    const/4 v7, -0x1

    :cond_b
    :goto_3
    packed-switch v7, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x3

    .line 2612
    div-int/lit8 v0, v0, 0x8

    return v0

    .line 1398
    :pswitch_1
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v3, "BRAVIA 4K 2015"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "Amazon"

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1399
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    const-string v3, "KFSOWI"

    .line 1400
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "AFTS"

    .line 1401
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-boolean p0, p0, Ll/ܿ۟֫;->ܺ:Z

    if-eqz p0, :cond_c

    goto :goto_4

    :cond_c
    const/16 p0, 0x10

    .line 1407
    invoke-static {v0, p0}, Ll/ۘ֨֫;->֫(II)I

    move-result p1

    invoke-static {v1, p0}, Ll/ۘ֨֫;->֫(II)I

    move-result p0

    mul-int p0, p0, p1

    mul-int/lit16 p0, p0, 0x300

    .line 2612
    div-int/lit8 p0, p0, 0x4

    return p0

    :pswitch_2
    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x4

    const/high16 p0, 0x200000

    .line 1394
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    :pswitch_3
    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x3

    .line 2612
    div-int/lit8 v0, v0, 0x4

    return v0

    :cond_d
    :goto_4
    return v2

    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_6
        -0x631b55f6 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ֫(Ll/ܿ᩻ۧ;)Landroid/view/Surface;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;
    .locals 3

    .line 797
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 798
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0

    .line 800
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_2

    const-string v1, "video/dolby-vision"

    .line 801
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 802
    invoke-static {p0}, Ll/֫᩻ۧ;->֫(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 245
    invoke-static {p2}, Ll/᩹۟֫;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    .line 247
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p0

    goto :goto_0

    .line 249
    :cond_1
    invoke-interface {p1, p0, p3, p4}, Ll/ۖ۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    .line 806
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    return-object p0

    .line 810
    :cond_2
    invoke-static {p1, p2, p3, p4}, Ll/᩹۟֫;->֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/lang/Object;)V
    .locals 9

    .line 1189
    instance-of v0, p1, Landroid/view/Surface;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/Surface;

    goto :goto_0

    :cond_0
    move-object p1, v1

    .line 1191
    :goto_0
    iget-object v0, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    iget-object v2, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    if-eq v0, p1, :cond_a

    .line 1192
    iput-object p1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    .line 1193
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    iget-object v3, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    if-nez v0, :cond_1

    .line 1194
    invoke-virtual {v3, p1}, Ll/ۙ᩻ۧ;->֫(Landroid/view/Surface;)V

    :cond_1
    const/4 v0, 0x0

    .line 1196
    iput-boolean v0, p0, Ll/ܿ᩻ۧ;->᩶ܽ:Z

    .line 1198
    invoke-virtual {p0}, Ll/ۙ᩹֫;->getState()I

    move-result v0

    .line 1199
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 1200
    iget-object v5, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-nez v5, :cond_5

    .line 1201
    invoke-virtual {p0}, Ll/ܺ۟֫;->ᩳ֫()Ll/ܿ۟֫;

    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1202
    invoke-direct {p0, v5}, Ll/ܿ᩻ۧ;->ᩳ(Ll/ܿ۟֫;)Z

    move-result v6

    .line 1203
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x17

    if-lt v7, v8, :cond_4

    if-eqz v6, :cond_4

    iget-boolean v6, p0, Ll/ܿ᩻ۧ;->ۢܽ:Z

    if-nez v6, :cond_4

    .line 1204
    invoke-direct {p0, v5}, Ll/ܿ᩻ۧ;->ܽ(Ll/ܿ۟֫;)Landroid/view/Surface;

    move-result-object v5

    if-lt v7, v8, :cond_2

    if-eqz v5, :cond_2

    .line 2327
    invoke-interface {v4, v5}, Ll/ۧ۟֫;->֫(Landroid/view/Surface;)V

    goto :goto_1

    :cond_2
    const/16 v5, 0x23

    if-lt v7, v5, :cond_3

    .line 2332
    invoke-interface {v4}, Ll/ۧ۟֫;->ܽ()V

    goto :goto_1

    .line 2321
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 1206
    :cond_4
    invoke-virtual {p0}, Ll/ܺ۟֫;->֡֫()V

    .line 1207
    invoke-virtual {p0}, Ll/ܺ۟֫;->ᩴ֫()V

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    .line 2284
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    if-eqz p1, :cond_7

    .line 2285
    invoke-virtual {v2, p1}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    goto :goto_2

    .line 1215
    :cond_6
    iput-object v1, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    .line 1216
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_7

    .line 1217
    invoke-interface {p1}, Ll/ۜۜۧ;->ۡ()V

    :cond_7
    :goto_2
    const/4 p1, 0x2

    if-ne v0, p1, :cond_9

    .line 1225
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    const/4 v0, 0x1

    if-eqz p1, :cond_8

    .line 1226
    invoke-interface {p1, v0}, Ll/ۜۜۧ;->ܽ(Z)V

    goto :goto_3

    .line 1228
    :cond_8
    invoke-virtual {v3, v0}, Ll/ۙ᩻ۧ;->ۧ(Z)V

    .line 1231
    :cond_9
    :goto_3
    invoke-direct {p0}, Ll/ܿ᩻ۧ;->ۙ֫()V

    return-void

    :cond_a
    if-eqz p1, :cond_c

    .line 2284
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    if-eqz p1, :cond_b

    .line 2285
    invoke-virtual {v2, p1}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    .line 2270
    :cond_b
    iget-object p1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    if-eqz p1, :cond_c

    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩶ܽ:Z

    if-eqz v0, :cond_c

    .line 2271
    invoke-virtual {v2, p1}, Ll/ۧۜۧ;->֫(Ljava/lang/Object;)V

    :cond_c
    return-void
.end method

.method public static synthetic ֫(Ll/ܿ᩻ۧ;Ll/ᩳ᩶֫;)V
    .locals 0

    .line 121
    invoke-virtual {p0, p1}, Ll/ܺ۟֫;->֫(Ll/ᩳ᩶֫;)V

    return-void
.end method

.method private ۙ֫()V
    .locals 4

    .line 2223
    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2228
    :cond_0
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 2233
    :cond_1
    new-instance v2, Ll/ᩳ᩻ۧ;

    invoke-direct {v2, p0, v1}, Ll/ᩳ᩻ۧ;-><init>(Ll/ܿ᩻ۧ;Ll/ۧ۟֫;)V

    iput-object v2, p0, Ll/ܿ᩻ۧ;->᩷ᩳ:Ll/ᩳ᩻ۧ;

    const/16 v2, 0x21

    if-lt v0, v2, :cond_2

    .line 2238
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "tunnel-peek"

    const/4 v3, 0x1

    .line 2239
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 2240
    invoke-interface {v1, v0}, Ll/ۧ۟֫;->֫(Landroid/os/Bundle;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ۧ(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I
    .locals 4

    .line 2516
    iget v0, p1, Ll/۠ᩴ֫;->ۗ:I

    iget-object v1, p1, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    .line 2520
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v0, p0, :cond_0

    .line 2522
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    array-length v3, v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2524
    :cond_0
    iget p0, p1, Ll/۠ᩴ֫;->ۗ:I

    add-int/2addr p0, v2

    return p0

    .line 2526
    :cond_1
    invoke-static {p0, p1}, Ll/ܿ᩻ۧ;->֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/ܿ᩻ۧ;)V
    .locals 2

    .line 2265
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    iget-object v1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Ll/ۧۜۧ;->֫(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 2266
    iput-boolean v0, p0, Ll/ܿ᩻ۧ;->᩶ܽ:Z

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 6

    const-string v0, "OMX.google"

    .line 2571
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    return v1

    .line 2575
    :cond_0
    const-class p0, Ll/ܿ᩻ۧ;

    move-object v0, p0

    monitor-enter v0

    .line 2576
    :try_start_0
    sget-boolean p0, Ll/ܿ᩻ۧ;->֡ᩳ:Z

    if-nez p0, :cond_a2

    .line 2616
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, 0x1

    if-gt p0, v2, :cond_9

    .line 2623
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "machuca"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x7

    goto :goto_1

    :sswitch_1
    const-string v5, "once"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x6

    goto :goto_1

    :sswitch_2
    const-string v5, "magnolia"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x5

    goto :goto_1

    :sswitch_3
    const-string v5, "aquaman"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x4

    goto :goto_1

    :sswitch_4
    const-string v5, "oneday"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x3

    goto :goto_1

    :sswitch_5
    const-string v5, "dangalUHD"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_6
    const-string v5, "dangalFHD"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_7
    const-string v5, "dangal"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_0

    :cond_8
    const/4 v4, 0x0

    goto :goto_1

    :goto_0
    const/4 v4, -0x1

    :goto_1
    packed-switch v4, :pswitch_data_0

    :cond_9
    const/16 v4, 0x1b

    if-gt p0, v4, :cond_a

    :try_start_1
    const-string v4, "HWEML"

    .line 2637
    sget-object v5, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto/16 :goto_6

    .line 2642
    :cond_a
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_1

    goto/16 :goto_2

    :sswitch_8
    const-string v5, "AFTEUFF014"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_2

    :cond_b
    const/16 v5, 0x8

    goto/16 :goto_3

    :sswitch_9
    const-string v5, "AFTSO001"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_2

    :cond_c
    const/4 v5, 0x7

    goto :goto_3

    :sswitch_a
    const-string v5, "AFTEU014"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto :goto_2

    :cond_d
    const/4 v5, 0x6

    goto :goto_3

    :sswitch_b
    const-string v5, "AFTEU011"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_2

    :cond_e
    const/4 v5, 0x5

    goto :goto_3

    :sswitch_c
    const-string v5, "AFTR"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    goto :goto_2

    :cond_f
    const/4 v5, 0x4

    goto :goto_3

    :sswitch_d
    const-string v5, "AFTN"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    goto :goto_2

    :cond_10
    const/4 v5, 0x3

    goto :goto_3

    :sswitch_e
    const-string v5, "AFTA"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_2

    :cond_11
    const/4 v5, 0x2

    goto :goto_3

    :sswitch_f
    const-string v5, "AFTKMST12"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_2

    :cond_12
    const/4 v5, 0x1

    goto :goto_3

    :sswitch_10
    const-string v5, "AFTJMST12"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_2

    :cond_13
    const/4 v5, 0x0

    goto :goto_3

    :goto_2
    const/4 v5, -0x1

    :goto_3
    packed-switch v5, :pswitch_data_1

    const/16 v5, 0x1a

    if-gt p0, v5, :cond_a1

    .line 2677
    :try_start_2
    sget-object p0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_2

    goto/16 :goto_4

    :sswitch_11
    const-string v2, "HWWAS-H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_4

    :cond_14
    const/16 v2, 0x8b

    goto/16 :goto_5

    :sswitch_12
    const-string v2, "HWVNS-H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_4

    :cond_15
    const/16 v2, 0x8a

    goto/16 :goto_5

    :sswitch_13
    const-string v2, "ELUGA_Prim"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_4

    :cond_16
    const/16 v2, 0x89

    goto/16 :goto_5

    :sswitch_14
    const-string v2, "ELUGA_Note"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_4

    :cond_17
    const/16 v2, 0x88

    goto/16 :goto_5

    :sswitch_15
    const-string v2, "ASUS_X00AD_2"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_4

    :cond_18
    const/16 v2, 0x87

    goto/16 :goto_5

    :sswitch_16
    const-string v2, "HWCAM-H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto/16 :goto_4

    :cond_19
    const/16 v2, 0x86

    goto/16 :goto_5

    :sswitch_17
    const-string v2, "HWBLN-H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto/16 :goto_4

    :cond_1a
    const/16 v2, 0x85

    goto/16 :goto_5

    :sswitch_18
    const-string v2, "DM-01K"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto/16 :goto_4

    :cond_1b
    const/16 v2, 0x84

    goto/16 :goto_5

    :sswitch_19
    const-string v2, "BRAVIA_ATV3_4K"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto/16 :goto_4

    :cond_1c
    const/16 v2, 0x83

    goto/16 :goto_5

    :sswitch_1a
    const-string v2, "Infinix-X572"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto/16 :goto_4

    :cond_1d
    const/16 v2, 0x82

    goto/16 :goto_5

    :sswitch_1b
    const-string v2, "PB2-670M"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto/16 :goto_4

    :cond_1e
    const/16 v2, 0x81

    goto/16 :goto_5

    :sswitch_1c
    const-string v2, "santoni"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto/16 :goto_4

    :cond_1f
    const/16 v2, 0x80

    goto/16 :goto_5

    :sswitch_1d
    const-string v2, "iball8735_9806"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto/16 :goto_4

    :cond_20
    const/16 v2, 0x7f

    goto/16 :goto_5

    :sswitch_1e
    const-string v2, "CPH1715"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto/16 :goto_4

    :cond_21
    const/16 v2, 0x7e

    goto/16 :goto_5

    :sswitch_1f
    const-string v2, "CPH1609"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto/16 :goto_4

    :cond_22
    const/16 v2, 0x7d

    goto/16 :goto_5

    :sswitch_20
    const-string v2, "woods_f"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto/16 :goto_4

    :cond_23
    const/16 v2, 0x7c

    goto/16 :goto_5

    :sswitch_21
    const-string v2, "htc_e56ml_dtul"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_24

    goto/16 :goto_4

    :cond_24
    const/16 v2, 0x7b

    goto/16 :goto_5

    :sswitch_22
    const-string v2, "EverStar_S"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto/16 :goto_4

    :cond_25
    const/16 v2, 0x7a

    goto/16 :goto_5

    :sswitch_23
    const-string v2, "hwALE-H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto/16 :goto_4

    :cond_26
    const/16 v2, 0x79

    goto/16 :goto_5

    :sswitch_24
    const-string v2, "itel_S41"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_27

    goto/16 :goto_4

    :cond_27
    const/16 v2, 0x78

    goto/16 :goto_5

    :sswitch_25
    const-string v2, "LS-5017"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_28

    goto/16 :goto_4

    :cond_28
    const/16 v2, 0x77

    goto/16 :goto_5

    :sswitch_26
    const-string v2, "panell_d"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    goto/16 :goto_4

    :cond_29
    const/16 v2, 0x76

    goto/16 :goto_5

    :sswitch_27
    const-string v2, "j2xlteins"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2a

    goto/16 :goto_4

    :cond_2a
    const/16 v2, 0x75

    goto/16 :goto_5

    :sswitch_28
    const-string v2, "A7000plus"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2b

    goto/16 :goto_4

    :cond_2b
    const/16 v2, 0x74

    goto/16 :goto_5

    :sswitch_29
    const-string v2, "manning"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2c

    goto/16 :goto_4

    :cond_2c
    const/16 v2, 0x73

    goto/16 :goto_5

    :sswitch_2a
    const-string v2, "GIONEE_WBL7519"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2d

    goto/16 :goto_4

    :cond_2d
    const/16 v2, 0x72

    goto/16 :goto_5

    :sswitch_2b
    const-string v2, "GIONEE_WBL7365"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2e

    goto/16 :goto_4

    :cond_2e
    const/16 v2, 0x71

    goto/16 :goto_5

    :sswitch_2c
    const-string v2, "GIONEE_WBL5708"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2f

    goto/16 :goto_4

    :cond_2f
    const/16 v2, 0x70

    goto/16 :goto_5

    :sswitch_2d
    const-string v2, "QM16XE_U"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_4

    :cond_30
    const/16 v2, 0x6f

    goto/16 :goto_5

    :sswitch_2e
    const-string v2, "Pixi5-10_4G"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_31

    goto/16 :goto_4

    :cond_31
    const/16 v2, 0x6e

    goto/16 :goto_5

    :sswitch_2f
    const-string v2, "TB3-850M"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_32

    goto/16 :goto_4

    :cond_32
    const/16 v2, 0x6d

    goto/16 :goto_5

    :sswitch_30
    const-string v2, "TB3-850F"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_33

    goto/16 :goto_4

    :cond_33
    const/16 v2, 0x6c

    goto/16 :goto_5

    :sswitch_31
    const-string v2, "TB3-730X"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_34

    goto/16 :goto_4

    :cond_34
    const/16 v2, 0x6b

    goto/16 :goto_5

    :sswitch_32
    const-string v2, "TB3-730F"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_35

    goto/16 :goto_4

    :cond_35
    const/16 v2, 0x6a

    goto/16 :goto_5

    :sswitch_33
    const-string v2, "A7020a48"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_36

    goto/16 :goto_4

    :cond_36
    const/16 v2, 0x69

    goto/16 :goto_5

    :sswitch_34
    const-string v2, "A7010a48"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_37

    goto/16 :goto_4

    :cond_37
    const/16 v2, 0x68

    goto/16 :goto_5

    :sswitch_35
    const-string v2, "griffin"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_38

    goto/16 :goto_4

    :cond_38
    const/16 v2, 0x67

    goto/16 :goto_5

    :sswitch_36
    const-string v2, "marino_f"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_39

    goto/16 :goto_4

    :cond_39
    const/16 v2, 0x66

    goto/16 :goto_5

    :sswitch_37
    const-string v2, "CPY83_I00"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3a

    goto/16 :goto_4

    :cond_3a
    const/16 v2, 0x65

    goto/16 :goto_5

    :sswitch_38
    const-string v2, "A2016a40"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3b

    goto/16 :goto_4

    :cond_3b
    const/16 v2, 0x64

    goto/16 :goto_5

    :sswitch_39
    const-string v2, "le_x6"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3c

    goto/16 :goto_4

    :cond_3c
    const/16 v2, 0x63

    goto/16 :goto_5

    :sswitch_3a
    const-string v2, "l5460"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3d

    goto/16 :goto_4

    :cond_3d
    const/16 v2, 0x62

    goto/16 :goto_5

    :sswitch_3b
    const-string v2, "i9031"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3e

    goto/16 :goto_4

    :cond_3e
    const/16 v2, 0x61

    goto/16 :goto_5

    :sswitch_3c
    const-string v2, "X3_HK"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3f

    goto/16 :goto_4

    :cond_3f
    const/16 v2, 0x60

    goto/16 :goto_5

    :sswitch_3d
    const-string v2, "V23GB"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_40

    goto/16 :goto_4

    :cond_40
    const/16 v2, 0x5f

    goto/16 :goto_5

    :sswitch_3e
    const-string v2, "Q4310"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_41

    goto/16 :goto_4

    :cond_41
    const/16 v2, 0x5e

    goto/16 :goto_5

    :sswitch_3f
    const-string v2, "Q4260"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_42

    goto/16 :goto_4

    :cond_42
    const/16 v2, 0x5d

    goto/16 :goto_5

    :sswitch_40
    const-string v2, "PRO7S"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_43

    goto/16 :goto_4

    :cond_43
    const/16 v2, 0x5c

    goto/16 :goto_5

    :sswitch_41
    const-string v2, "F3311"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_44

    goto/16 :goto_4

    :cond_44
    const/16 v2, 0x5b

    goto/16 :goto_5

    :sswitch_42
    const-string v2, "F3215"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_45

    goto/16 :goto_4

    :cond_45
    const/16 v2, 0x5a

    goto/16 :goto_5

    :sswitch_43
    const-string v2, "F3213"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_46

    goto/16 :goto_4

    :cond_46
    const/16 v2, 0x59

    goto/16 :goto_5

    :sswitch_44
    const-string v2, "F3211"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_47

    goto/16 :goto_4

    :cond_47
    const/16 v2, 0x58

    goto/16 :goto_5

    :sswitch_45
    const-string v2, "F3116"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_48

    goto/16 :goto_4

    :cond_48
    const/16 v2, 0x57

    goto/16 :goto_5

    :sswitch_46
    const-string v2, "F3113"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_49

    goto/16 :goto_4

    :cond_49
    const/16 v2, 0x56

    goto/16 :goto_5

    :sswitch_47
    const-string v2, "F3111"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4a

    goto/16 :goto_4

    :cond_4a
    const/16 v2, 0x55

    goto/16 :goto_5

    :sswitch_48
    const-string v2, "E5643"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4b

    goto/16 :goto_4

    :cond_4b
    const/16 v2, 0x54

    goto/16 :goto_5

    :sswitch_49
    const-string v2, "A1601"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4c

    goto/16 :goto_4

    :cond_4c
    const/16 v2, 0x53

    goto/16 :goto_5

    :sswitch_4a
    const-string v2, "Aura_Note_2"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4d

    goto/16 :goto_4

    :cond_4d
    const/16 v2, 0x52

    goto/16 :goto_5

    :sswitch_4b
    const-string v2, "602LV"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4e

    goto/16 :goto_4

    :cond_4e
    const/16 v2, 0x51

    goto/16 :goto_5

    :sswitch_4c
    const-string v2, "601LV"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4f

    goto/16 :goto_4

    :cond_4f
    const/16 v2, 0x50

    goto/16 :goto_5

    :sswitch_4d
    const-string v2, "MEIZU_M5"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_50

    goto/16 :goto_4

    :cond_50
    const/16 v2, 0x4f

    goto/16 :goto_5

    :sswitch_4e
    const-string v2, "p212"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_51

    goto/16 :goto_4

    :cond_51
    const/16 v2, 0x4e

    goto/16 :goto_5

    :sswitch_4f
    const-string v2, "mido"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_52

    goto/16 :goto_4

    :cond_52
    const/16 v2, 0x4d

    goto/16 :goto_5

    :sswitch_50
    const-string v2, "kate"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_53

    goto/16 :goto_4

    :cond_53
    const/16 v2, 0x4c

    goto/16 :goto_5

    :sswitch_51
    const-string v2, "fugu"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_54

    goto/16 :goto_4

    :cond_54
    const/16 v2, 0x4b

    goto/16 :goto_5

    :sswitch_52
    const-string v2, "XE2X"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_55

    goto/16 :goto_4

    :cond_55
    const/16 v2, 0x4a

    goto/16 :goto_5

    :sswitch_53
    const-string v2, "Q427"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_56

    goto/16 :goto_4

    :cond_56
    const/16 v2, 0x49

    goto/16 :goto_5

    :sswitch_54
    const-string v2, "Q350"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_57

    goto/16 :goto_4

    :cond_57
    const/16 v2, 0x48

    goto/16 :goto_5

    :sswitch_55
    const-string v2, "P681"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_58

    goto/16 :goto_4

    :cond_58
    const/16 v2, 0x47

    goto/16 :goto_5

    :sswitch_56
    const-string v2, "F04J"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_59

    goto/16 :goto_4

    :cond_59
    const/16 v2, 0x46

    goto/16 :goto_5

    :sswitch_57
    const-string v2, "F04H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5a

    goto/16 :goto_4

    :cond_5a
    const/16 v2, 0x45

    goto/16 :goto_5

    :sswitch_58
    const-string v2, "F03H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5b

    goto/16 :goto_4

    :cond_5b
    const/16 v2, 0x44

    goto/16 :goto_5

    :sswitch_59
    const-string v2, "F02H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5c

    goto/16 :goto_4

    :cond_5c
    const/16 v2, 0x43

    goto/16 :goto_5

    :sswitch_5a
    const-string v2, "F01J"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5d

    goto/16 :goto_4

    :cond_5d
    const/16 v2, 0x42

    goto/16 :goto_5

    :sswitch_5b
    const-string v2, "F01H"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5e

    goto/16 :goto_4

    :cond_5e
    const/16 v2, 0x41

    goto/16 :goto_5

    :sswitch_5c
    const-string v2, "1714"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5f

    goto/16 :goto_4

    :cond_5f
    const/16 v2, 0x40

    goto/16 :goto_5

    :sswitch_5d
    const-string v2, "1713"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_60

    goto/16 :goto_4

    :cond_60
    const/16 v2, 0x3f

    goto/16 :goto_5

    :sswitch_5e
    const-string v2, "1601"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_61

    goto/16 :goto_4

    :cond_61
    const/16 v2, 0x3e

    goto/16 :goto_5

    :sswitch_5f
    const-string v2, "flo"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_62

    goto/16 :goto_4

    :cond_62
    const/16 v2, 0x3d

    goto/16 :goto_5

    :sswitch_60
    const-string v2, "deb"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_63

    goto/16 :goto_4

    :cond_63
    const/16 v2, 0x3c

    goto/16 :goto_5

    :sswitch_61
    const-string v2, "cv3"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_64

    goto/16 :goto_4

    :cond_64
    const/16 v2, 0x3b

    goto/16 :goto_5

    :sswitch_62
    const-string v2, "cv1"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_65

    goto/16 :goto_4

    :cond_65
    const/16 v2, 0x3a

    goto/16 :goto_5

    :sswitch_63
    const-string v2, "Z80"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_66

    goto/16 :goto_4

    :cond_66
    const/16 v2, 0x39

    goto/16 :goto_5

    :sswitch_64
    const-string v2, "QX1"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_67

    goto/16 :goto_4

    :cond_67
    const/16 v2, 0x38

    goto/16 :goto_5

    :sswitch_65
    const-string v2, "PLE"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_68

    goto/16 :goto_4

    :cond_68
    const/16 v2, 0x37

    goto/16 :goto_5

    :sswitch_66
    const-string v2, "P85"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_69

    goto/16 :goto_4

    :cond_69
    const/16 v2, 0x36

    goto/16 :goto_5

    :sswitch_67
    const-string v2, "MX6"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6a

    goto/16 :goto_4

    :cond_6a
    const/16 v2, 0x35

    goto/16 :goto_5

    :sswitch_68
    const-string v2, "M5c"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6b

    goto/16 :goto_4

    :cond_6b
    const/16 v2, 0x34

    goto/16 :goto_5

    :sswitch_69
    const-string v2, "M04"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6c

    goto/16 :goto_4

    :cond_6c
    const/16 v2, 0x33

    goto/16 :goto_5

    :sswitch_6a
    const-string v2, "JGZ"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6d

    goto/16 :goto_4

    :cond_6d
    const/16 v2, 0x32

    goto/16 :goto_5

    :sswitch_6b
    const-string v2, "mh"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6e

    goto/16 :goto_4

    :cond_6e
    const/16 v2, 0x31

    goto/16 :goto_5

    :sswitch_6c
    const-string v2, "b5"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6f

    goto/16 :goto_4

    :cond_6f
    const/16 v2, 0x30

    goto/16 :goto_5

    :sswitch_6d
    const-string v2, "V5"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_70

    goto/16 :goto_4

    :cond_70
    const/16 v2, 0x2f

    goto/16 :goto_5

    :sswitch_6e
    const-string v2, "V1"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_71

    goto/16 :goto_4

    :cond_71
    const/16 v2, 0x2e

    goto/16 :goto_5

    :sswitch_6f
    const-string v2, "Q5"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_72

    goto/16 :goto_4

    :cond_72
    const/16 v2, 0x2d

    goto/16 :goto_5

    :sswitch_70
    const-string v2, "C1"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_73

    goto/16 :goto_4

    :cond_73
    const/16 v2, 0x2c

    goto/16 :goto_5

    :sswitch_71
    const-string v2, "woods_fn"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_74

    goto/16 :goto_4

    :cond_74
    const/16 v2, 0x2b

    goto/16 :goto_5

    :sswitch_72
    const-string v2, "ELUGA_A3_Pro"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_75

    goto/16 :goto_4

    :cond_75
    const/16 v2, 0x2a

    goto/16 :goto_5

    :sswitch_73
    const-string v2, "Z12_PRO"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_76

    goto/16 :goto_4

    :cond_76
    const/16 v2, 0x29

    goto/16 :goto_5

    :sswitch_74
    const-string v2, "BLACK-1X"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_77

    goto/16 :goto_4

    :cond_77
    const/16 v2, 0x28

    goto/16 :goto_5

    :sswitch_75
    const-string v2, "taido_row"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_78

    goto/16 :goto_4

    :cond_78
    const/16 v2, 0x27

    goto/16 :goto_5

    :sswitch_76
    const-string v2, "Pixi4-7_3G"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_79

    goto/16 :goto_4

    :cond_79
    const/16 v2, 0x26

    goto/16 :goto_5

    :sswitch_77
    const-string v2, "GIONEE_GBL7360"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7a

    goto/16 :goto_4

    :cond_7a
    const/16 v2, 0x25

    goto/16 :goto_5

    :sswitch_78
    const-string v2, "GiONEE_CBL7513"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7b

    goto/16 :goto_4

    :cond_7b
    const/16 v2, 0x24

    goto/16 :goto_5

    :sswitch_79
    const-string v2, "OnePlus5T"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7c

    goto/16 :goto_4

    :cond_7c
    const/16 v2, 0x23

    goto/16 :goto_5

    :sswitch_7a
    const-string v2, "whyred"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7d

    goto/16 :goto_4

    :cond_7d
    const/16 v2, 0x22

    goto/16 :goto_5

    :sswitch_7b
    const-string v2, "watson"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7e

    goto/16 :goto_4

    :cond_7e
    const/16 v2, 0x21

    goto/16 :goto_5

    :sswitch_7c
    const-string v2, "SVP-DTV15"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7f

    goto/16 :goto_4

    :cond_7f
    const/16 v2, 0x20

    goto/16 :goto_5

    :sswitch_7d
    const-string v2, "A7000-a"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_80

    goto/16 :goto_4

    :cond_80
    const/16 v2, 0x1f

    goto/16 :goto_5

    :sswitch_7e
    const-string v2, "nicklaus_f"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_81

    goto/16 :goto_4

    :cond_81
    const/16 v2, 0x1e

    goto/16 :goto_5

    :sswitch_7f
    const-string v2, "tcl_eu"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_82

    goto/16 :goto_4

    :cond_82
    const/16 v2, 0x1d

    goto/16 :goto_5

    :sswitch_80
    const-string v5, "ELUGA_Ray_X"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9f

    goto/16 :goto_4

    :sswitch_81
    const-string v2, "s905x018"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_83

    goto/16 :goto_4

    :cond_83
    const/16 v2, 0x1b

    goto/16 :goto_5

    :sswitch_82
    const-string v2, "A10-70L"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_84

    goto/16 :goto_4

    :cond_84
    const/16 v2, 0x1a

    goto/16 :goto_5

    :sswitch_83
    const-string v2, "A10-70F"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_85

    goto/16 :goto_4

    :cond_85
    const/16 v2, 0x19

    goto/16 :goto_5

    :sswitch_84
    const-string v2, "namath"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_86

    goto/16 :goto_4

    :cond_86
    const/16 v2, 0x18

    goto/16 :goto_5

    :sswitch_85
    const-string v2, "Slate_Pro"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_87

    goto/16 :goto_4

    :cond_87
    const/16 v2, 0x17

    goto/16 :goto_5

    :sswitch_86
    const-string v2, "iris60"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_88

    goto/16 :goto_4

    :cond_88
    const/16 v2, 0x16

    goto/16 :goto_5

    :sswitch_87
    const-string v2, "BRAVIA_ATV2"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_89

    goto/16 :goto_4

    :cond_89
    const/16 v2, 0x15

    goto/16 :goto_5

    :sswitch_88
    const-string v2, "GiONEE_GBL7319"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8a

    goto/16 :goto_4

    :cond_8a
    const/16 v2, 0x14

    goto/16 :goto_5

    :sswitch_89
    const-string v2, "panell_dt"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8b

    goto/16 :goto_4

    :cond_8b
    const/16 v2, 0x13

    goto/16 :goto_5

    :sswitch_8a
    const-string v2, "panell_ds"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8c

    goto/16 :goto_4

    :cond_8c
    const/16 v2, 0x12

    goto/16 :goto_5

    :sswitch_8b
    const-string v2, "panell_dl"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8d

    goto/16 :goto_4

    :cond_8d
    const/16 v2, 0x11

    goto/16 :goto_5

    :sswitch_8c
    const-string v2, "vernee_M5"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8e

    goto/16 :goto_4

    :cond_8e
    const/16 v2, 0x10

    goto/16 :goto_5

    :sswitch_8d
    const-string v2, "pacificrim"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8f

    goto/16 :goto_4

    :cond_8f
    const/16 v2, 0xf

    goto/16 :goto_5

    :sswitch_8e
    const-string v2, "Phantom6"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_90

    goto/16 :goto_4

    :cond_90
    const/16 v2, 0xe

    goto/16 :goto_5

    :sswitch_8f
    const-string v2, "ComioS1"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_91

    goto/16 :goto_4

    :cond_91
    const/16 v2, 0xd

    goto/16 :goto_5

    :sswitch_90
    const-string v2, "XT1663"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_92

    goto/16 :goto_4

    :cond_92
    const/16 v2, 0xc

    goto/16 :goto_5

    :sswitch_91
    const-string v2, "RAIJIN"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_93

    goto/16 :goto_4

    :cond_93
    const/16 v2, 0xb

    goto/16 :goto_5

    :sswitch_92
    const-string v2, "AquaPowerM"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_94

    goto/16 :goto_4

    :cond_94
    const/16 v2, 0xa

    goto/16 :goto_5

    :sswitch_93
    const-string v2, "PGN611"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_95

    goto/16 :goto_4

    :cond_95
    const/16 v2, 0x9

    goto/16 :goto_5

    :sswitch_94
    const-string v2, "PGN610"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_96

    goto/16 :goto_4

    :cond_96
    const/16 v2, 0x8

    goto/16 :goto_5

    :sswitch_95
    const-string v2, "PGN528"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_97

    goto :goto_4

    :cond_97
    const/4 v2, 0x7

    goto :goto_5

    :sswitch_96
    const-string v2, "NX573J"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_98

    goto :goto_4

    :cond_98
    const/4 v2, 0x6

    goto :goto_5

    :sswitch_97
    const-string v2, "NX541J"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_99

    goto :goto_4

    :cond_99
    const/4 v2, 0x5

    goto :goto_5

    :sswitch_98
    const-string v2, "CP8676_I02"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9a

    goto :goto_4

    :cond_9a
    const/4 v2, 0x4

    goto :goto_5

    :sswitch_99
    const-string v2, "K50a40"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9b

    goto :goto_4

    :cond_9b
    const/4 v2, 0x3

    goto :goto_5

    :sswitch_9a
    const-string v2, "GIONEE_SWW1631"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9c

    goto :goto_4

    :cond_9c
    const/4 v2, 0x2

    goto :goto_5

    :sswitch_9b
    const-string v2, "GIONEE_SWW1627"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9d

    goto :goto_4

    :cond_9d
    const/4 v2, 0x1

    goto :goto_5

    :sswitch_9c
    const-string v2, "GIONEE_SWW1609"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9e

    goto :goto_4

    :cond_9e
    const/4 v2, 0x0

    goto :goto_5

    :goto_4
    const/4 v2, -0x1

    :cond_9f
    :goto_5
    packed-switch v2, :pswitch_data_2

    const-string p0, "JSN-L21"

    .line 2822
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a0

    goto :goto_7

    :cond_a0
    :goto_6
    :pswitch_0
    const/4 v1, 0x1

    .line 2577
    :cond_a1
    :goto_7
    :try_start_3
    sput-boolean v1, Ll/ܿ᩻ۧ;->᩵ᩳ:Z

    .line 2578
    sput-boolean v3, Ll/ܿ᩻ۧ;->֡ᩳ:Z

    .line 2580
    :cond_a2
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2581
    sget-boolean p0, Ll/ܿ᩻ۧ;->᩵ᩳ:Z

    return p0

    :catchall_0
    move-exception p0

    .line 2580
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0

    :sswitch_data_0
    .sparse-switch
        -0x4fd0ea5f -> :sswitch_7
        -0x48b8f57f -> :sswitch_6
        -0x48b8bd30 -> :sswitch_5
        -0x3c588c8a -> :sswitch_4
        -0x2d5172e2 -> :sswitch_3
        -0x3de1850 -> :sswitch_2
        0x341e81 -> :sswitch_1
        0x31316ffa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x14d76e6c -> :sswitch_10
        -0x132295cd -> :sswitch_f
        0x1e9d52 -> :sswitch_e
        0x1e9d5f -> :sswitch_d
        0x1e9d63 -> :sswitch_c
        0x6a6b6031 -> :sswitch_b
        0x6a6b6034 -> :sswitch_a
        0x6b2deee6 -> :sswitch_9
        0x7e53ab34 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x7fd6c3bd -> :sswitch_9c
        -0x7fd6c381 -> :sswitch_9b
        -0x7fd6c368 -> :sswitch_9a
        -0x7d026749 -> :sswitch_99
        -0x78929d6a -> :sswitch_98
        -0x75f50a1e -> :sswitch_97
        -0x75f4fe9d -> :sswitch_96
        -0x736f875c -> :sswitch_95
        -0x736f83c2 -> :sswitch_94
        -0x736f83c1 -> :sswitch_93
        -0x7327ce1c -> :sswitch_92
        -0x705c574b -> :sswitch_91
        -0x651ebb62 -> :sswitch_90
        -0x6423293b -> :sswitch_8f
        -0x604f5117 -> :sswitch_8e
        -0x5f691e13 -> :sswitch_8d
        -0x5ca40cc4 -> :sswitch_8c
        -0x58520ec1 -> :sswitch_8b
        -0x58520eba -> :sswitch_8a
        -0x58520eb9 -> :sswitch_89
        -0x4eaed329 -> :sswitch_88
        -0x4892fb4f -> :sswitch_87
        -0x465b3df3 -> :sswitch_86
        -0x43e6c939 -> :sswitch_85
        -0x3ec0fcc5 -> :sswitch_84
        -0x3b33cca0 -> :sswitch_83
        -0x3b33cc9a -> :sswitch_82
        -0x398ae3f6 -> :sswitch_81
        -0x391f0fb4 -> :sswitch_80
        -0x346837ae -> :sswitch_7f
        -0x323788e3 -> :sswitch_7e
        -0x30f57652 -> :sswitch_7d
        -0x2f88a116 -> :sswitch_7c
        -0x2f61ed98 -> :sswitch_7b
        -0x2efd0837 -> :sswitch_7a
        -0x2e9e9441 -> :sswitch_79
        -0x2247b8b1 -> :sswitch_78
        -0x1f0fa2b7 -> :sswitch_77
        -0x19af3b41 -> :sswitch_76
        -0x114fad3e -> :sswitch_75
        -0x10dae90b -> :sswitch_74
        -0x1084b7b7 -> :sswitch_73
        -0xa5988e9 -> :sswitch_72
        -0x35f9fbf -> :sswitch_71
        0x84e -> :sswitch_70
        0xa04 -> :sswitch_6f
        0xa9b -> :sswitch_6e
        0xa9f -> :sswitch_6d
        0xc13 -> :sswitch_6c
        0xd9b -> :sswitch_6b
        0x11ebd -> :sswitch_6a
        0x12711 -> :sswitch_69
        0x127db -> :sswitch_68
        0x12beb -> :sswitch_67
        0x1334d -> :sswitch_66
        0x135c9 -> :sswitch_65
        0x13aea -> :sswitch_64
        0x158d2 -> :sswitch_63
        0x1821e -> :sswitch_62
        0x18220 -> :sswitch_61
        0x18401 -> :sswitch_60
        0x18c69 -> :sswitch_5f
        0x1716e6 -> :sswitch_5e
        0x171ac8 -> :sswitch_5d
        0x171ac9 -> :sswitch_5c
        0x208c61 -> :sswitch_5b
        0x208c63 -> :sswitch_5a
        0x208c80 -> :sswitch_59
        0x208c9f -> :sswitch_58
        0x208cbe -> :sswitch_57
        0x208cc0 -> :sswitch_56
        0x252f5f -> :sswitch_55
        0x25981d -> :sswitch_54
        0x259b88 -> :sswitch_53
        0x290a13 -> :sswitch_52
        0x3021fd -> :sswitch_51
        0x321e47 -> :sswitch_50
        0x332327 -> :sswitch_4f
        0x33ab63 -> :sswitch_4e
        0x27691fb -> :sswitch_4d
        0x30f8881 -> :sswitch_4c
        0x30f8c42 -> :sswitch_4b
        0x349f581 -> :sswitch_4a
        0x3ab0ea7 -> :sswitch_49
        0x3e53ea5 -> :sswitch_48
        0x3f25a44 -> :sswitch_47
        0x3f25a46 -> :sswitch_46
        0x3f25a49 -> :sswitch_45
        0x3f25e05 -> :sswitch_44
        0x3f25e07 -> :sswitch_43
        0x3f25e09 -> :sswitch_42
        0x3f261c6 -> :sswitch_41
        0x48dce49 -> :sswitch_40
        0x48dd589 -> :sswitch_3f
        0x48dd8af -> :sswitch_3e
        0x4d36832 -> :sswitch_3d
        0x4f0b0e7 -> :sswitch_3c
        0x5e2479e -> :sswitch_3b
        0x60acc05 -> :sswitch_3a
        0x6214744 -> :sswitch_39
        0x9d91379 -> :sswitch_38
        0xadc0551 -> :sswitch_37
        0xea056b3 -> :sswitch_36
        0x1121dbc3 -> :sswitch_35
        0x1255818c -> :sswitch_34
        0x1263990d -> :sswitch_33
        0x12d90f3a -> :sswitch_32
        0x12d90f4c -> :sswitch_31
        0x12d98b1b -> :sswitch_30
        0x12d98b22 -> :sswitch_2f
        0x1844c711 -> :sswitch_2e
        0x1e3e8044 -> :sswitch_2d
        0x2f5336ed -> :sswitch_2c
        0x2f54115e -> :sswitch_2b
        0x2f541849 -> :sswitch_2a
        0x31cf010e -> :sswitch_29
        0x36ad82f4 -> :sswitch_28
        0x391a0b61 -> :sswitch_27
        0x3f3728cd -> :sswitch_26
        0x448ec687 -> :sswitch_25
        0x46260f63 -> :sswitch_24
        0x4c505106 -> :sswitch_23
        0x4de67084 -> :sswitch_22
        0x506ac5a9 -> :sswitch_21
        0x5abad9cd -> :sswitch_20
        0x64d2e6e9 -> :sswitch_1f
        0x64d2eac5 -> :sswitch_1e
        0x65e4085b -> :sswitch_1d
        0x6f373556 -> :sswitch_1c
        0x719f1dcb -> :sswitch_1b
        0x75d9a0f0 -> :sswitch_1a
        0x7796d144 -> :sswitch_19
        0x785bcb26 -> :sswitch_18
        0x78fc0e50 -> :sswitch_17
        0x790521fb -> :sswitch_16
        0x7933207f -> :sswitch_15
        0x7a05a409 -> :sswitch_14
        0x7a0696bd -> :sswitch_13
        0x7a16dfe7 -> :sswitch_12
        0x7a1f0e95 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ܽ(Ll/ܿ۟֫;)Landroid/view/Surface;
    .locals 4

    .line 2185
    iget-boolean v0, p1, Ll/ܿ۟֫;->ܺ:Z

    iget-object v1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v1, :cond_0

    .line 2186
    invoke-interface {v1}, Ll/ۜۜۧ;->ܿ()Landroid/view/Surface;

    move-result-object p1

    return-object p1

    .line 2187
    :cond_0
    iget-object v1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    if-eqz v1, :cond_1

    return-object v1

    .line 2205
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x23

    const/4 v3, 0x0

    if-lt v1, v2, :cond_2

    iget-boolean v1, p1, Ll/ܿ۟֫;->ᩳ:Z

    if-eqz v1, :cond_2

    return-object v3

    .line 2192
    :cond_2
    invoke-virtual {p0, p1}, Ll/ܿ᩻ۧ;->ۧ(Ll/ܿ۟֫;)Z

    move-result p1

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 2193
    iget-object p1, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    if-eqz p1, :cond_3

    iget-boolean v1, p1, Ll/᩻᩻ۧ;->᩸:Z

    if-eq v1, v0, :cond_3

    if-eqz p1, :cond_3

    .line 2217
    invoke-virtual {p1}, Ll/᩻᩻ۧ;->release()V

    .line 2218
    iput-object v3, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    .line 2197
    :cond_3
    iget-object p1, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    if-nez p1, :cond_4

    .line 2198
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۖܽ:Landroid/content/Context;

    invoke-static {p1, v0}, Ll/᩻᩻ۧ;->֫(Landroid/content/Context;Z)Ll/᩻᩻ۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    .line 2200
    :cond_4
    iget-object p1, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    return-object p1
.end method

.method public static ܽ(Ll/ܿ᩻ۧ;)V
    .locals 0

    .line 1924
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܶ֫()V

    return-void
.end method

.method public static synthetic ܿ(Ll/ܿ᩻ۧ;)Ll/ۧ۟֫;
    .locals 0

    .line 121
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object p0

    return-object p0
.end method

.method private ܿ(Ll/᩸᩸֫;)Z
    .locals 5

    .line 1649
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩻()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ll/ۘ᩸֫;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1654
    :cond_0
    iget-wide v0, p0, Ll/ܿ᩻ۧ;->ܰܽ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    goto :goto_0

    .line 1658
    :cond_1
    iget-wide v0, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {p0}, Ll/ܺ۟֫;->᩷֫()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 1659
    iget-wide v2, p0, Ll/ܿ᩻ۧ;->ܰܽ:J

    sub-long/2addr v2, v0

    const-wide/32 v0, 0x186a0

    cmp-long p1, v2, v0

    if-gtz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic ᩳ(Ll/ܿ᩻ۧ;)Ll/۟ۗ֫;
    .locals 0

    .line 121
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܺ֫()Ll/۟ۗ֫;

    move-result-object p0

    return-object p0
.end method

.method private ᩳ(Ll/ܿ۟֫;)Z
    .locals 2

    .line 2172
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    if-eqz v0, :cond_0

    .line 2173
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2205
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_1

    iget-boolean v0, p1, Ll/ܿ۟֫;->ᩳ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 2175
    :cond_1
    invoke-virtual {p0, p1}, Ll/ܿ᩻ۧ;->ۧ(Ll/ܿ۟֫;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecVideoRenderer"

    return-object v0
.end method

.method public final ֨֫()V
    .locals 1

    .line 1320
    invoke-super {p0}, Ll/ܺ۟֫;->֨֫()V

    .line 1321
    iget-object v0, p0, Ll/ܿ᩻ۧ;->֡ܽ:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    const/4 v0, 0x0

    .line 1322
    iput v0, p0, Ll/ܿ᩻ۧ;->ܳܽ:I

    .line 1323
    iput v0, p0, Ll/ܿ᩻ۧ;->ܺܽ:I

    .line 1324
    iput-boolean v0, p0, Ll/ܿ᩻ۧ;->ۙܽ:Z

    return-void
.end method

.method public final ֫(FLl/۠ᩴ֫;[Ll/۠ᩴ֫;)F
    .locals 6

    .line 1423
    array-length v0, p3

    const/high16 v1, -0x40800000    # -1.0f

    const/4 v2, 0x0

    const/high16 v3, -0x40800000    # -1.0f

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p3, v2

    .line 1424
    iget v4, v4, Ll/۠ᩴ֫;->֡:F

    cmpl-float v5, v4, v1

    if-eqz v5, :cond_0

    .line 1426
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    cmpl-float p3, v3, v1

    if-nez p3, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_1

    :cond_2
    mul-float p1, p1, v3

    .line 1431
    :goto_1
    iget-object p3, p0, Ll/ܿ᩻ۧ;->ᩳᩳ:Ll/᩷۬֫;

    if-eqz p3, :cond_4

    .line 1432
    invoke-virtual {p0}, Ll/ܺ۟֫;->ᩳ֫()Ll/ܿ۟֫;

    move-result-object p3

    if-eqz p3, :cond_4

    .line 1434
    iget v0, p2, Ll/۠ᩴ֫;->᩷֫:I

    iget p2, p2, Ll/۠ᩴ֫;->۠:I

    .line 1435
    invoke-virtual {p3, v0, p2}, Ll/ܿ۟֫;->֫(II)F

    move-result p2

    cmpl-float p3, p1, v1

    if-eqz p3, :cond_3

    .line 1437
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    :cond_3
    return p2

    :cond_4
    return p1
.end method

.method public final ֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;)I
    .locals 11

    .line 667
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 668
    invoke-static {v0}, Ll/ۢ᩵֫;->ۢ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 245
    invoke-static {v1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    .line 671
    :cond_0
    iget-object v0, p2, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 675
    :goto_0
    iget-object v3, p0, Ll/ܿ᩻ۧ;->ۖܽ:Landroid/content/Context;

    invoke-static {v3, p1, p2, v0, v1}, Ll/ܿ᩻ۧ;->֫(Landroid/content/Context;Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;

    move-result-object v4

    if-eqz v0, :cond_2

    .line 681
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 684
    invoke-static {v3, p1, p2, v1, v1}, Ll/ܿ᩻ۧ;->֫(Landroid/content/Context;Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;

    move-result-object v4

    .line 691
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 245
    invoke-static {v2, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    .line 2362
    :cond_3
    iget v5, p2, Ll/۠ᩴ֫;->᩷:I

    if-eqz v5, :cond_5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_4

    goto :goto_1

    .line 245
    :cond_4
    invoke-static {v6, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    .line 699
    :cond_5
    :goto_1
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿ۟֫;

    .line 700
    invoke-virtual {v5, p2}, Ll/ܿ۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v6

    if-nez v6, :cond_7

    const/4 v7, 0x1

    .line 704
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_7

    .line 705
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿ۟֫;

    .line 706
    invoke-virtual {v8, p2}, Ll/ܿ۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v5, v8

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    const/4 v4, 0x1

    :goto_3
    if-eqz v6, :cond_8

    const/4 v7, 0x4

    goto :goto_4

    :cond_8
    const/4 v7, 0x3

    .line 718
    :goto_4
    invoke-virtual {v5, p2}, Ll/ܿ۟֫;->ܽ(Ll/۠ᩴ֫;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x10

    goto :goto_5

    :cond_9
    const/16 v8, 0x8

    .line 723
    :goto_5
    iget-boolean v5, v5, Ll/ܿ۟֫;->ܿ:Z

    if-eqz v5, :cond_a

    const/16 v5, 0x40

    goto :goto_6

    :cond_a
    const/4 v5, 0x0

    :goto_6
    if-eqz v4, :cond_b

    const/16 v4, 0x80

    goto :goto_7

    :cond_b
    const/4 v4, 0x0

    .line 729
    :goto_7
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1a

    if-lt v9, v10, :cond_c

    const-string v9, "video/dolby-vision"

    iget-object v10, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 730
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    .line 731
    invoke-static {v3}, Ll/֫᩻ۧ;->֫(Landroid/content/Context;)Z

    move-result v9

    if-nez v9, :cond_c

    const/16 v4, 0x100

    :cond_c
    if-eqz v6, :cond_d

    .line 738
    invoke-static {v3, p1, p2, v0, v2}, Ll/ܿ᩻ۧ;->֫(Landroid/content/Context;Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;

    move-result-object p1

    .line 744
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 746
    invoke-static {p1, p2}, Ll/᩹۟֫;->֫(Ljava/util/List;Ll/۠ᩴ֫;)Ljava/util/ArrayList;

    move-result-object p1

    .line 747
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿ۟֫;

    .line 748
    invoke-virtual {p1, p2}, Ll/ܿ۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 749
    invoke-virtual {p1, p2}, Ll/ܿ۟֫;->ܽ(Ll/۠ᩴ֫;)Z

    move-result p1

    if-eqz p1, :cond_d

    const/16 v1, 0x20

    :cond_d
    or-int p1, v7, v8

    or-int/2addr p1, v1

    or-int/2addr p1, v5

    or-int/2addr p1, v4

    return p1
.end method

.method public final ֫(Ll/᩸᩸֫;)I
    .locals 5

    .line 1573
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->۠ܽ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܿ᩻ۧ;->ᩳᩳ:Ll/᩷۬֫;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ll/᩷۬֫;->ܿ:Z

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eqz v0, :cond_2

    .line 1663
    :cond_1
    iget-wide v0, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    .line 1578
    invoke-direct {p0, p1}, Ll/ܿ᩻ۧ;->ܿ(Ll/᩸᩸֫;)Z

    move-result p1

    if-nez p1, :cond_2

    const/16 p1, 0x20

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۖ۟֫;Ll/۠ᩴ֫;Z)Ljava/util/ArrayList;
    .locals 2

    .line 767
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۖܽ:Landroid/content/Context;

    iget-boolean v1, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    .line 768
    invoke-static {v0, p1, p2, p3, v1}, Ll/ܿ᩻ۧ;->֫(Landroid/content/Context;Ll/ۖ۟֫;Ll/۠ᩴ֫;ZZ)Ljava/util/List;

    move-result-object p1

    .line 767
    invoke-static {p1, p2}, Ll/᩹۟֫;->֫(Ljava/util/List;Ll/۠ᩴ֫;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗۙ֫;)Ll/۬᩹֫;
    .locals 2

    .line 1530
    invoke-super {p0, p1}, Ll/ܺ۟֫;->֫(Ll/ۗۙ֫;)Ll/۬᩹֫;

    move-result-object v0

    .line 1531
    iget-object p1, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1531
    iget-object v1, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    invoke-virtual {v1, p1, v0}, Ll/ۧۜۧ;->֫(Ll/۠ᩴ֫;Ll/۬᩹֫;)V

    return-object v0
.end method

.method public final ֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;
    .locals 8

    .line 1283
    invoke-virtual {p1, p2, p3}, Ll/ܿ۟֫;->֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;

    move-result-object v0

    .line 1285
    iget v1, v0, Ll/۬᩹֫;->ۧ:I

    .line 1286
    iget-object v2, p0, Ll/ܿ᩻ۧ;->᩷ܽ:Ll/ܽ᩻ۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1287
    iget v3, p3, Ll/۠ᩴ֫;->᩷֫:I

    iget v4, v2, Ll/ܽ᩻ۧ;->ܽ:I

    if-gt v3, v4, :cond_0

    iget v3, p3, Ll/۠ᩴ֫;->۠:I

    iget v4, v2, Ll/ܽ᩻ۧ;->֫:I

    if-le v3, v4, :cond_1

    :cond_0
    or-int/lit16 v1, v1, 0x100

    .line 1290
    :cond_1
    invoke-static {p1, p3}, Ll/ܿ᩻ۧ;->ۧ(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v3

    iget v2, v2, Ll/ܽ᩻ۧ;->ۧ:I

    if-le v3, v2, :cond_2

    or-int/lit8 v1, v1, 0x40

    :cond_2
    move v7, v1

    .line 1294
    new-instance v1, Ll/۬᩹֫;

    iget-object v3, p1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    if-eqz v7, :cond_3

    const/4 p1, 0x0

    const/4 v6, 0x0

    goto :goto_0

    .line 1298
    :cond_3
    iget p1, v0, Ll/۬᩹֫;->ܿ:I

    move v6, p1

    :goto_0
    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Ll/۬᩹֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V

    return-object v1
.end method

.method public final ֫(Ljava/lang/IllegalStateException;Ll/ܿ۟֫;)Ll/ᩳ۟֫;
    .locals 2

    .line 2468
    new-instance v0, Ll/᩺ܳۧ;

    iget-object v1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    .line 37
    invoke-direct {v0, p1, p2}, Ll/ᩳ۟֫;-><init>(Ljava/lang/IllegalStateException;Ll/ܿ۟֫;)V

    .line 38
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    if-eqz v1, :cond_0

    .line 39
    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;Landroid/media/MediaCrypto;F)Ll/᩺ܰ֫;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    .line 1257
    iget-object v4, v1, Ll/ܿ۟֫;->ܽ:Ljava/lang/String;

    .line 1258
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->ۙ()[Ll/۠ᩴ֫;

    move-result-object v5

    .line 2413
    iget v6, v2, Ll/۠ᩴ֫;->᩷֫:I

    iget v7, v2, Ll/۠ᩴ֫;->֡:F

    iget-object v8, v2, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    .line 2414
    iget v9, v2, Ll/۠ᩴ֫;->۠:I

    .line 2415
    invoke-static/range {p1 .. p2}, Ll/ܿ᩻ۧ;->ۧ(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v10

    .line 2416
    array-length v11, v5

    const/4 v12, -0x1

    const/4 v13, 0x1

    if-ne v11, v13, :cond_1

    if-eq v10, v12, :cond_0

    .line 2420
    invoke-static/range {p1 .. p2}, Ll/ܿ᩻ۧ;->֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v5

    if-eq v5, v12, :cond_0

    int-to-float v10, v10

    const/high16 v11, 0x3fc00000    # 1.5f

    mul-float v10, v10, v11

    float-to-int v10, v10

    .line 2428
    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 2431
    :cond_0
    new-instance v5, Ll/ܽ᩻ۧ;

    invoke-direct {v5, v6, v9, v10}, Ll/ܽ᩻ۧ;-><init>(III)V

    move-object/from16 v18, v8

    move/from16 v17, v9

    goto/16 :goto_d

    .line 2434
    :cond_1
    array-length v11, v5

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v14, v6

    move v15, v9

    :goto_0
    if-ge v12, v11, :cond_6

    move/from16 v16, v11

    aget-object v11, v5, v12

    move-object/from16 v17, v5

    if-eqz v8, :cond_2

    .line 2435
    iget-object v5, v11, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    if-nez v5, :cond_2

    .line 2438
    invoke-virtual {v11}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v5

    invoke-virtual {v5, v8}, Ll/֨ᩴ֫;->֫(Ll/᩷ᩴ֫;)V

    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v11

    .line 2440
    :cond_2
    invoke-virtual {v1, v2, v11}, Ll/ܿ۟֫;->֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;)Ll/۬᩹֫;

    move-result-object v5

    iget v3, v11, Ll/۠ᩴ֫;->۠:I

    iget v5, v5, Ll/۬᩹֫;->ܿ:I

    if-eqz v5, :cond_5

    .line 2441
    iget v5, v11, Ll/۠ᩴ֫;->᩷֫:I

    move-object/from16 v18, v8

    const/4 v8, -0x1

    if-eq v5, v8, :cond_4

    if-ne v3, v8, :cond_3

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v8, 0x1

    :goto_2
    or-int/2addr v8, v13

    .line 2443
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 2444
    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    move-result v15

    .line 2445
    invoke-static {v1, v11}, Ll/ܿ᩻ۧ;->ۧ(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v3

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v10, v3

    move v13, v8

    goto :goto_3

    :cond_5
    move-object/from16 v18, v8

    :goto_3
    add-int/lit8 v12, v12, 0x1

    move/from16 v3, p4

    move/from16 v11, v16

    move-object/from16 v5, v17

    move-object/from16 v8, v18

    goto :goto_0

    :cond_6
    move-object/from16 v18, v8

    if-eqz v13, :cond_12

    .line 2449
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Resolutions unknown. Codec max resolution: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "x"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    if-le v9, v6, :cond_7

    const/4 v3, 0x1

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_8

    move v8, v9

    goto :goto_5

    :cond_8
    move v8, v6

    :goto_5
    if-eqz v3, :cond_9

    move v11, v6

    goto :goto_6

    :cond_9
    move v11, v9

    :goto_6
    int-to-float v12, v11

    int-to-float v13, v8

    div-float/2addr v12, v13

    const/4 v13, 0x0

    :goto_7
    const/16 v16, 0x0

    const/16 v2, 0x9

    if-ge v13, v2, :cond_10

    .line 2487
    sget-object v2, Ll/ܿ᩻ۧ;->ᩴᩳ:[I

    aget v2, v2, v13

    move/from16 v17, v9

    int-to-float v9, v2

    mul-float v9, v9, v12

    float-to-int v9, v9

    if-le v2, v8, :cond_11

    if-gt v9, v11, :cond_a

    goto :goto_a

    :cond_a
    move/from16 v19, v2

    if-eqz v3, :cond_b

    move v2, v9

    :cond_b
    if-eqz v3, :cond_c

    move/from16 v9, v19

    :cond_c
    move/from16 v19, v3

    .line 632
    iget-object v3, v1, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-nez v3, :cond_d

    goto :goto_8

    .line 635
    :cond_d
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v3

    if-nez v3, :cond_e

    :goto_8
    move/from16 v20, v8

    move/from16 v21, v11

    move-object/from16 v11, v16

    goto :goto_9

    :cond_e
    move/from16 v20, v8

    .line 810
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    move-result v8

    .line 811
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    move-result v3

    move/from16 v21, v11

    .line 812
    new-instance v11, Landroid/graphics/Point;

    .line 813
    invoke-static {v2, v8}, Ll/ۘ֨֫;->֫(II)I

    move-result v2

    mul-int v2, v2, v8

    .line 814
    invoke-static {v9, v3}, Ll/ۘ֨֫;->֫(II)I

    move-result v8

    mul-int v8, v8, v3

    invoke-direct {v11, v2, v8}, Landroid/graphics/Point;-><init>(II)V

    :goto_9
    if-eqz v11, :cond_f

    .line 2498
    iget v2, v11, Landroid/graphics/Point;->x:I

    iget v3, v11, Landroid/graphics/Point;->y:I

    float-to-double v8, v7

    .line 2499
    invoke-virtual {v1, v2, v3, v8, v9}, Ll/ܿ۟֫;->֫(IID)Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_b

    :cond_f
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, p2

    move/from16 v9, v17

    move/from16 v3, v19

    move/from16 v8, v20

    move/from16 v11, v21

    goto :goto_7

    :cond_10
    move/from16 v17, v9

    :cond_11
    :goto_a
    move-object/from16 v11, v16

    :goto_b
    if-eqz v11, :cond_13

    .line 2452
    iget v2, v11, Landroid/graphics/Point;->x:I

    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 2453
    iget v2, v11, Landroid/graphics/Point;->y:I

    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v15

    .line 2458
    invoke-virtual/range {p2 .. p2}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v2

    invoke-virtual {v2, v14}, Ll/֨ᩴ֫;->ۙ(I)V

    invoke-virtual {v2, v15}, Ll/֨ᩴ֫;->ۡ(I)V

    invoke-virtual {v2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v2

    .line 2457
    invoke-static {v1, v2}, Ll/ܿ᩻ۧ;->֫(Ll/ܿ۟֫;Ll/۠ᩴ֫;)I

    move-result v2

    .line 2455
    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 2459
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Codec max resolution adjusted to: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_c

    :cond_12
    move/from16 v17, v9

    .line 2462
    :cond_13
    :goto_c
    new-instance v5, Ll/ܽ᩻ۧ;

    invoke-direct {v5, v14, v15, v10}, Ll/ܽ᩻ۧ;-><init>(III)V

    .line 1258
    :goto_d
    iput-object v5, v0, Ll/ܿ᩻ۧ;->᩷ܽ:Ll/ܽ᩻ۧ;

    .line 1266
    iget-boolean v2, v0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eqz v2, :cond_14

    iget v2, v0, Ll/ܿ᩻ۧ;->ۜᩳ:I

    goto :goto_e

    :cond_14
    const/4 v2, 0x0

    .line 2357
    :goto_e
    new-instance v3, Landroid/media/MediaFormat;

    invoke-direct {v3}, Landroid/media/MediaFormat;-><init>()V

    const-string v8, "mime"

    .line 2359
    invoke-virtual {v3, v8, v4}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "width"

    .line 2360
    invoke-virtual {v3, v4, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v4, "height"

    move/from16 v6, v17

    .line 2361
    invoke-virtual {v3, v4, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    move-object/from16 v4, p2

    .line 2362
    iget-object v6, v4, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    invoke-static {v3, v6}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/util/List;)V

    const/high16 v6, -0x40800000    # -1.0f

    cmpl-float v8, v7, v6

    if-eqz v8, :cond_15

    const-string v8, "frame-rate"

    .line 242
    invoke-virtual {v3, v8, v7}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_15
    const-string v7, "rotation-degrees"

    .line 2365
    iget v8, v4, Ll/۠ᩴ֫;->֫֫:I

    invoke-static {v3, v7, v8}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    move-object/from16 v7, v18

    .line 2366
    invoke-static {v3, v7}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ll/᩷ᩴ֫;)V

    const-string v7, "video/dolby-vision"

    .line 2367
    iget-object v8, v4, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    .line 2370
    sget v7, Ll/᩹۟֫;->֫:I

    .line 347
    invoke-static/range {p2 .. p2}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_16

    .line 2372
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    .line 2373
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const-string v8, "profile"

    .line 2372
    invoke-static {v3, v8, v7}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    :cond_16
    const-string v7, "max-width"

    .line 2377
    iget v8, v5, Ll/ܽ᩻ۧ;->ܽ:I

    invoke-virtual {v3, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v7, "max-height"

    .line 2378
    iget v8, v5, Ll/ܽ᩻ۧ;->֫:I

    invoke-virtual {v3, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v7, "max-input-size"

    .line 2379
    iget v5, v5, Ll/ܽ᩻ۧ;->ۧ:I

    invoke-static {v3, v7, v5}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 2382
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x17

    if-lt v5, v7, :cond_17

    const-string v7, "priority"

    const/4 v8, 0x0

    .line 2383
    invoke-virtual {v3, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    move/from16 v7, p4

    cmpl-float v6, v7, v6

    if-eqz v6, :cond_17

    const-string v6, "operating-rate"

    .line 2385
    invoke-virtual {v3, v6, v7}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 2388
    :cond_17
    iget-boolean v6, v0, Ll/ܿ᩻ۧ;->ᩴܽ:Z

    if-eqz v6, :cond_18

    const-string v6, "no-post-process"

    const/4 v7, 0x1

    .line 2389
    invoke-virtual {v3, v6, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v6, "auto-frc"

    const/4 v8, 0x0

    .line 2390
    invoke-virtual {v3, v6, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_f

    :cond_18
    const/4 v7, 0x1

    :goto_f
    if-eqz v2, :cond_19

    const-string v6, "tunneled-playback"

    .line 2393
    invoke-virtual {v3, v6, v7}, Landroid/media/MediaFormat;->setFeatureEnabled(Ljava/lang/String;Z)V

    const-string v6, "audio-session-id"

    .line 2394
    invoke-virtual {v3, v6, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_19
    const/16 v2, 0x23

    if-lt v5, v2, :cond_1a

    .line 2397
    iget v2, v0, Ll/ܿ᩻ۧ;->֫ᩳ:I

    neg-int v2, v2

    const/4 v5, 0x0

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const-string v5, "importance"

    invoke-virtual {v3, v5, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 1267
    :cond_1a
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩻ۧ;->ܽ(Ll/ܿ۟֫;)Landroid/view/Surface;

    move-result-object v2

    .line 1275
    iget-object v5, v0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v5, :cond_1b

    iget-object v5, v0, Ll/ܿ᩻ۧ;->ۖܽ:Landroid/content/Context;

    invoke-static {v5}, Ll/ۘ֨֫;->ۧ(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_1b

    const-string v5, "allow-frame-drop"

    const/4 v6, 0x0

    .line 1276
    invoke-virtual {v3, v5, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1b
    move-object/from16 v5, p3

    .line 1269
    invoke-static {v1, v3, v4, v2, v5}, Ll/᩺ܰ֫;->֫(Ll/ܿ۟֫;Landroid/media/MediaFormat;Ll/۠ᩴ֫;Landroid/view/Surface;Landroid/media/MediaCrypto;)Ll/᩺ܰ֫;

    move-result-object v1

    return-object v1
.end method

.method public final ֫(FF)V
    .locals 0

    .line 1333
    invoke-super {p0, p1, p2}, Ll/ܺ۟֫;->֫(FF)V

    .line 1334
    iget-object p2, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p2, :cond_0

    .line 1335
    invoke-interface {p2, p1}, Ll/ۜۜۧ;->֫(F)V

    goto :goto_0

    .line 1337
    :cond_0
    iget-object p2, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {p2, p1}, Ll/ۙ᩻ۧ;->ۧ(F)V

    :goto_0
    return-void
.end method

.method public final ֫(II)V
    .locals 4

    .line 2079
    iget-object v0, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget v1, v0, Ll/ۗ᩹֫;->ᩳ:I

    add-int/2addr v1, p1

    iput v1, v0, Ll/ۗ᩹֫;->ᩳ:I

    add-int/2addr p1, p2

    .line 2081
    iget p2, v0, Ll/ۗ᩹֫;->ܽ:I

    add-int/2addr p2, p1

    iput p2, v0, Ll/ۗ᩹֫;->ܽ:I

    .line 2082
    iget p2, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    .line 2083
    iget p2, p0, Ll/ܿ᩻ۧ;->ۡܽ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܿ᩻ۧ;->ۡܽ:I

    .line 2084
    iget p1, v0, Ll/ۗ᩹֫;->ܳ:I

    .line 2085
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v0, Ll/ۗ᩹֫;->ܳ:I

    .line 2086
    iget p1, p0, Ll/ܿ᩻ۧ;->۬ܽ:I

    if-lez p1, :cond_0

    iget p2, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    if-lt p2, p1, :cond_0

    if-lez p2, :cond_0

    .line 2291
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object p1

    invoke-interface {p1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide p1

    .line 2292
    iget-wide v0, p0, Ll/ܿ᩻ۧ;->ۚܽ:J

    sub-long v0, p1, v0

    .line 2293
    iget-object v2, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    iget v3, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    invoke-virtual {v2, v3, v0, v1}, Ll/ۧۜۧ;->֫(IJ)V

    const/4 v0, 0x0

    .line 2294
    iput v0, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    .line 2295
    iput-wide p1, p0, Ll/ܿ᩻ۧ;->ۚܽ:J

    :cond_0
    return-void
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_d

    const/4 v1, 0x7

    if-eq p1, v1, :cond_b

    const/16 v1, 0xa

    if-eq p1, v1, :cond_a

    const/4 v1, 0x4

    if-eq p1, v1, :cond_9

    const/4 v1, 0x5

    if-eq p1, v1, :cond_7

    const/16 v1, 0xd

    if-eq p1, v1, :cond_4

    const/16 v1, 0xe

    if-eq p1, v1, :cond_3

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    .line 1183
    invoke-super {p0, p1, p2}, Ll/ܺ۟֫;->֫(ILjava/lang/Object;)V

    return-void

    .line 1171
    :pswitch_0
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ᩳᩳ:Ll/᩷۬֫;

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Ll/᩷۬֫;->ᩳ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1174
    :goto_0
    check-cast p2, Ll/᩷۬֫;

    iput-object p2, p0, Ll/ܿ᩻ۧ;->ᩳᩳ:Ll/᩷۬֫;

    if-eqz p2, :cond_1

    .line 1175
    iget-boolean p2, p2, Ll/᩷۬֫;->ᩳ:Z

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eq p1, v0, :cond_c

    .line 1179
    invoke-virtual {p0}, Ll/ܺ۟֫;->᩶֫()V

    return-void

    .line 1164
    :pswitch_1
    iget-object p1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    const/4 v1, 0x0

    .line 1165
    invoke-direct {p0, v1}, Ll/ܿ᩻ۧ;->֫(Ljava/lang/Object;)V

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    check-cast p2, Ll/ܿ᩻ۧ;

    .line 1167
    invoke-virtual {p2, v0, p1}, Ll/ܿ᩻ۧ;->֫(ILjava/lang/Object;)V

    return-void

    .line 155
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ܿ᩻ۧ;->֫ᩳ:I

    .line 2245
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object p1

    if-nez p1, :cond_2

    goto/16 :goto_2

    .line 2250
    :cond_2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x23

    if-lt p2, v0, :cond_c

    .line 2251
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 2252
    iget v0, p0, Ll/ܿ᩻ۧ;->֫ᩳ:I

    neg-int v0, v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v1, "importance"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 2253
    invoke-interface {p1, p2}, Ll/ۧ۟֫;->֫(Landroid/os/Bundle;)V

    return-void

    .line 155
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1150
    check-cast p2, Ll/ܿ֨֫;

    .line 1151
    invoke-virtual {p2}, Ll/ܿ֨֫;->ۧ()I

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p2}, Ll/ܿ֨֫;->֫()I

    move-result p1

    if-eqz p1, :cond_c

    .line 1152
    iput-object p2, p0, Ll/ܿ᩻ۧ;->ۛܽ:Ll/ܿ֨֫;

    .line 1153
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_c

    .line 1154
    iget-object v0, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-interface {p1, v0, p2}, Ll/ۜۜۧ;->֫(Landroid/view/Surface;Ll/ܿ֨֫;)V

    return-void

    .line 155
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1146
    check-cast p2, Ljava/util/List;

    .line 1460
    sget-object p1, Ll/ܿ֡֫;->֫:Ll/ܳ۬ܺ;

    invoke-interface {p2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1461
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_c

    invoke-interface {p1}, Ll/ۜۜۧ;->isInitialized()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    .line 1464
    :cond_5
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    invoke-interface {p1}, Ll/ۜۜۧ;->ᩳ()V

    return-void

    .line 1468
    :cond_6
    iput-object p2, p0, Ll/ܿ᩻ۧ;->ۢᩳ:Ljava/util/List;

    .line 1469
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_c

    .line 1470
    invoke-interface {p1, p2}, Ll/ۜۜۧ;->֫(Ljava/util/List;)V

    return-void

    .line 155
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ܿ᩻ۧ;->᩻ܽ:I

    .line 1123
    iget-object p2, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p2, :cond_8

    .line 1124
    invoke-interface {p2, p1}, Ll/ۜۜۧ;->֫(I)V

    return-void

    .line 1126
    :cond_8
    iget-object p2, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {p2, p1}, Ll/ۙ᩻ۧ;->ۧ(I)V

    return-void

    .line 155
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ܿ᩻ۧ;->ܽᩳ:I

    .line 1116
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 1118
    iget p2, p0, Ll/ܿ᩻ۧ;->ܽᩳ:I

    invoke-interface {p1, p2}, Ll/ۧ۟֫;->֫(I)V

    return-void

    .line 155
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 1137
    iget p2, p0, Ll/ܿ᩻ۧ;->ۜᩳ:I

    if-eq p2, p1, :cond_c

    .line 1138
    iput p1, p0, Ll/ܿ᩻ۧ;->ۜᩳ:I

    .line 1139
    iget-boolean p1, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eqz p1, :cond_c

    .line 1140
    invoke-virtual {p0}, Ll/ܺ۟֫;->֡֫()V

    return-void

    .line 155
    :cond_b
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1130
    check-cast p2, Ll/᩹᩻ۧ;

    iput-object p2, p0, Ll/ܿ᩻ۧ;->᩸ܽ:Ll/᩹᩻ۧ;

    .line 1131
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_c

    .line 1132
    invoke-interface {p1, p2}, Ll/ۜۜۧ;->֫(Ll/᩹᩻ۧ;)V

    :cond_c
    :goto_2
    return-void

    .line 1112
    :cond_d
    invoke-direct {p0, p2}, Ll/ܿ᩻ۧ;->֫(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 1305
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    .line 1308
    :try_start_0
    invoke-interface {v0, p1, p2, p3, p4}, Ll/ۜۜۧ;->֫(JJ)V
    :try_end_0
    .catch Ll/᩻ۜۧ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 1310
    iget-object p2, p1, Ll/᩻ۜۧ;->᩸:Ll/۠ᩴ֫;

    const/16 p3, 0x1b59

    invoke-virtual {p0, p1, p2, p3}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    .line 1314
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܺ۟֫;->֫(JJ)V

    return-void
.end method

.method public final ֫(JZ)V
    .locals 2

    .line 995
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    const/4 v1, 0x1

    .line 999
    invoke-interface {v0, v1}, Ll/ۜۜۧ;->ۧ(Z)V

    .line 1002
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/ܺ۟֫;->֫(JZ)V

    .line 1003
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    iget-object p2, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    if-nez p1, :cond_1

    .line 1004
    invoke-virtual {p2}, Ll/ۙ᩻ۧ;->ܿ()V

    :cond_1
    const/4 p1, 0x0

    if-eqz p3, :cond_3

    .line 1013
    iget-object p3, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p3, :cond_2

    .line 1014
    invoke-interface {p3, p1}, Ll/ۜۜۧ;->ܽ(Z)V

    goto :goto_0

    .line 1016
    :cond_2
    invoke-virtual {p2, p1}, Ll/ۙ᩻ۧ;->ۧ(Z)V

    .line 1020
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ܿ᩻ۧ;->ۙ֫()V

    .line 1021
    iput p1, p0, Ll/ܿ᩻ۧ;->ۡܽ:I

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "Video codec error"

    .line 1494
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1495
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    invoke-virtual {v0, p1}, Ll/ۧۜۧ;->֫(Ljava/lang/Exception;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 1489
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    invoke-virtual {v0, p1}, Ll/ۧۜۧ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;JJ)V
    .locals 6

    .line 1480
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Ll/ۧۜۧ;->֫(Ljava/lang/String;JJ)V

    .line 1481
    invoke-static {p1}, Ll/ܿ᩻ۧ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܿ᩻ۧ;->ۢܽ:Z

    .line 1483
    invoke-virtual {p0}, Ll/ܺ۟֫;->ᩳ֫()Ll/ܿ۟֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1d

    const/4 p4, 0x0

    if-lt p2, p3, :cond_3

    const-string p2, "video/x-vnd.on2.vp9"

    iget-object p3, p1, Ll/ܿ۟֫;->ۢ:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 246
    iget-object p1, p1, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    if-nez p1, :cond_1

    :cond_0
    new-array p1, p4, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 398
    :cond_1
    array-length p2, p1

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_3

    aget-object p5, p1, p3

    .line 399
    iget p5, p5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    const/16 v0, 0x4000

    if-ne p5, v0, :cond_2

    const/4 p4, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 1483
    :cond_3
    :goto_1
    iput-boolean p4, p0, Ll/ܿ᩻ۧ;->ۜܽ:Z

    .line 1484
    invoke-direct {p0}, Ll/ܿ᩻ۧ;->ۙ֫()V

    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;Landroid/media/MediaFormat;)V
    .locals 11

    .line 1668
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1671
    iget v1, p0, Ll/ܿ᩻ۧ;->ܽᩳ:I

    invoke-interface {v0, v1}, Ll/ۧ۟֫;->֫(I)V

    .line 1677
    :cond_0
    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 1678
    iget p2, p1, Ll/۠ᩴ֫;->᩷֫:I

    .line 1679
    iget v0, p1, Ll/۠ᩴ֫;->۠:I

    goto :goto_3

    .line 155
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "crop-right"

    .line 1683
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "crop-top"

    const-string v4, "crop-bottom"

    const-string v5, "crop-left"

    if-eqz v2, :cond_2

    .line 1684
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1685
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1686
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_3

    .line 1689
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v5

    sub-int/2addr v0, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const-string v0, "width"

    .line 1690
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_1
    if-eqz v2, :cond_4

    .line 1693
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    sub-int/2addr v2, p2

    add-int/lit8 v2, v2, 0x1

    move p2, v2

    goto :goto_2

    :cond_4
    const-string v2, "height"

    .line 1694
    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    :goto_2
    move v10, v0

    move v0, p2

    move p2, v10

    .line 1696
    :goto_3
    iget v2, p1, Ll/۠ᩴ֫;->᩺:F

    .line 1700
    iget v3, p1, Ll/۠ᩴ֫;->֫֫:I

    const/16 v4, 0x5a

    if-eq v3, v4, :cond_5

    const/16 v4, 0x10e

    if-ne v3, v4, :cond_6

    :cond_5
    const/high16 v3, 0x3f800000    # 1.0f

    div-float v2, v3, v2

    move v10, v0

    move v0, p2

    move p2, v10

    .line 1706
    :cond_6
    new-instance v3, Ll/ۜ֡֫;

    invoke-direct {v3, p2, v0, v2}, Ll/ۜ֡֫;-><init>(IIF)V

    iput-object v3, p0, Ll/ܿ᩻ۧ;->ۘܽ:Ll/ۜ֡֫;

    .line 1708
    iget-object v4, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v4, :cond_8

    iget-boolean v3, p0, Ll/ܿ᩻ۧ;->᩺ܽ:Z

    if-eqz v3, :cond_8

    .line 1713
    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object p1

    .line 1714
    invoke-virtual {p1, p2}, Ll/֨ᩴ֫;->ۙ(I)V

    .line 1715
    invoke-virtual {p1, v0}, Ll/֨ᩴ֫;->ۡ(I)V

    .line 1716
    invoke-virtual {p1, v2}, Ll/֨ᩴ֫;->ۧ(F)V

    .line 1717
    invoke-virtual {p1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    iget v8, p0, Ll/ܿ᩻ۧ;->ۤܽ:I

    .line 1738
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۢᩳ:Ljava/util/List;

    if-eqz p1, :cond_7

    :goto_4
    move-object v9, p1

    goto :goto_5

    :cond_7
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    goto :goto_4

    .line 1742
    :goto_5
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۢ֫()J

    move-result-wide v6

    .line 1739
    invoke-interface/range {v4 .. v9}, Ll/ۜۜۧ;->֫(Ll/۠ᩴ֫;JILjava/util/List;)V

    const/4 p1, 0x2

    .line 1719
    iput p1, p0, Ll/ܿ᩻ۧ;->ۤܽ:I

    goto :goto_6

    .line 1722
    :cond_8
    iget-object p2, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    iget p1, p1, Ll/۠ᩴ֫;->֡:F

    invoke-virtual {p2, p1}, Ll/ۙ᩻ۧ;->֫(F)V

    .line 1724
    :goto_6
    iput-boolean v1, p0, Ll/ܿ᩻ۧ;->᩺ܽ:Z

    return-void
.end method

.method public final ֫(Ll/ۧ۟֫;I)V
    .locals 1

    const-string v0, "skipVideoBuffer"

    .line 38
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2012
    invoke-interface {p1, p2}, Ll/ۧ۟֫;->ܽ(I)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2014
    iget-object p1, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget p2, p1, Ll/ۗ᩹֫;->ۢ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Ll/ۗ᩹֫;->ۢ:I

    return-void
.end method

.method public final ֫(Ll/ۧ۟֫;IJ)V
    .locals 1

    const-string v0, "releaseOutputBuffer"

    .line 38
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2161
    invoke-interface {p1, p2, p3, p4}, Ll/ۧ۟֫;->֫(IJ)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2163
    iget-object p1, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget p2, p1, Ll/ۗ᩹֫;->ۜ:I

    const/4 p3, 0x1

    add-int/2addr p2, p3

    iput p2, p1, Ll/ۗ᩹֫;->ۜ:I

    const/4 p1, 0x0

    .line 2164
    iput p1, p0, Ll/ܿ᩻ۧ;->ۡܽ:I

    .line 2165
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-nez p1, :cond_1

    .line 2166
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘܽ:Ll/ۜ֡֫;

    .line 2277
    sget-object p2, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    invoke-virtual {p1, p2}, Ll/ۜ֡֫;->equals(Ljava/lang/Object;)Z

    move-result p2

    iget-object p4, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    if-nez p2, :cond_0

    iget-object p2, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    invoke-virtual {p1, p2}, Ll/ۜ֡֫;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 2278
    iput-object p1, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    .line 2279
    invoke-virtual {p4, p1}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    .line 2258
    :cond_0
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {p1}, Ll/ۙ᩻ۧ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    if-eqz p1, :cond_1

    .line 2265
    invoke-virtual {p4, p1}, Ll/ۧۜۧ;->֫(Ljava/lang/Object;)V

    .line 2266
    iput-boolean p3, p0, Ll/ܿ᩻ۧ;->᩶ܽ:Z

    :cond_1
    return-void
.end method

.method public final ֫(ZZ)V
    .locals 3

    .line 843
    invoke-super {p0, p1, p2}, Ll/ܺ۟֫;->֫(ZZ)V

    .line 844
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܶ()Ll/ܿ۬֫;

    move-result-object p1

    iget-boolean p1, p1, Ll/ܿ۬֫;->ۧ:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 845
    iget v1, p0, Ll/ܿ᩻ۧ;->ۜᩳ:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 846
    iget-boolean v1, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eq v1, p1, :cond_2

    .line 847
    iput-boolean p1, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    .line 848
    invoke-virtual {p0}, Ll/ܺ۟֫;->֡֫()V

    .line 850
    :cond_2
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    iget-object v1, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {p1, v1}, Ll/ۧۜۧ;->ۧ(Ll/ۗ᩹֫;)V

    .line 853
    iget-boolean p1, p0, Ll/ܿ᩻ۧ;->᩹ܽ:Z

    iget-object v1, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    if-nez p1, :cond_4

    .line 854
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۢᩳ:Ljava/util/List;

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-nez p1, :cond_3

    .line 946
    new-instance p1, Ll/᩷᩻ۧ;

    iget-object v2, p0, Ll/ܿ᩻ۧ;->ۖܽ:Landroid/content/Context;

    invoke-direct {p1, v2, v1}, Ll/᩷᩻ۧ;-><init>(Landroid/content/Context;Ll/ۙ᩻ۧ;)V

    .line 947
    invoke-virtual {p1}, Ll/᩷᩻ۧ;->ۧ()V

    .line 948
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/᩷᩻ۧ;->֫(Ll/ܽۚ֫;)V

    .line 949
    invoke-virtual {p1}, Ll/᩷᩻ۧ;->֫()Ll/֨᩻ۧ;

    move-result-object p1

    .line 857
    invoke-virtual {p1}, Ll/֨᩻ۧ;->ᩳ()V

    .line 858
    invoke-virtual {p1}, Ll/֨᩻ۧ;->ۧ()Ll/ۜۜۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    .line 860
    :cond_3
    iput-boolean v0, p0, Ll/ܿ᩻ۧ;->᩹ܽ:Z

    .line 862
    :cond_4
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_8

    .line 884
    new-instance v0, Ll/ܰܳۧ;

    invoke-direct {v0, p0}, Ll/ܰܳۧ;-><init>(Ll/ܿ᩻ۧ;)V

    .line 928
    invoke-static {}, Ll/۫ܰܺ;->֫()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 884
    invoke-interface {p1, v0, v1}, Ll/ۜۜۧ;->֫(Ll/ܿۜۧ;Ljava/util/concurrent/Executor;)V

    .line 929
    iget-object p1, p0, Ll/ܿ᩻ۧ;->᩸ܽ:Ll/᩹᩻ۧ;

    if-eqz p1, :cond_5

    .line 930
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    invoke-interface {v0, p1}, Ll/ۜۜۧ;->֫(Ll/᩹᩻ۧ;)V

    .line 932
    :cond_5
    iget-object p1, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۛܽ:Ll/ܿ֨֫;

    sget-object v0, Ll/ܿ֨֫;->ܽ:Ll/ܿ֨֫;

    invoke-virtual {p1, v0}, Ll/ܿ֨֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 933
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    iget-object v0, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    iget-object v1, p0, Ll/ܿ᩻ۧ;->ۛܽ:Ll/ܿ֨֫;

    invoke-interface {p1, v0, v1}, Ll/ۜۜۧ;->֫(Landroid/view/Surface;Ll/ܿ֨֫;)V

    .line 935
    :cond_6
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    iget v0, p0, Ll/ܿ᩻ۧ;->᩻ܽ:I

    invoke-interface {p1, v0}, Ll/ۜۜۧ;->֫(I)V

    .line 936
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    invoke-virtual {p0}, Ll/ܺ۟֫;->ۡ֫()F

    move-result v0

    invoke-interface {p1, v0}, Ll/ۜۜۧ;->֫(F)V

    .line 937
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۢᩳ:Ljava/util/List;

    if-eqz p1, :cond_7

    .line 938
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    invoke-interface {v0, p1}, Ll/ۜۜۧ;->֫(Ljava/util/List;)V

    :cond_7
    xor-int/lit8 p1, p2, 0x1

    .line 870
    iput p1, p0, Ll/ܿ᩻ۧ;->ۤܽ:I

    .line 871
    invoke-virtual {p0}, Ll/ܺ۟֫;->֫֫()V

    return-void

    .line 873
    :cond_8
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۙ᩻ۧ;->֫(Ll/ܽۚ֫;)V

    xor-int/lit8 p1, p2, 0x1

    .line 878
    invoke-virtual {v1, p1}, Ll/ۙ᩻ۧ;->֫(I)V

    return-void
.end method

.method public final ֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V
    .locals 0

    .line 974
    invoke-super/range {p0 .. p6}, Ll/ܺ۟֫;->֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V

    .line 982
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۬()Ll/ۙ᩵֫;

    move-result-object p1

    .line 983
    invoke-virtual {p1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 984
    iput-wide p1, p0, Ll/ܿ᩻ۧ;->ܰܽ:J

    goto :goto_0

    .line 155
    :cond_0
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 989
    iget-object p2, p6, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    new-instance p3, Ll/᩹᩵֫;

    invoke-direct {p3}, Ll/᩹᩵֫;-><init>()V

    invoke-virtual {p1, p2, p3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object p1

    .line 675
    iget-wide p1, p1, Ll/᩹᩵֫;->ۧ:J

    .line 990
    iput-wide p1, p0, Ll/ܿ᩻ۧ;->ܰܽ:J

    :goto_0
    return-void
.end method

.method public final ֫(JJLl/ۧ۟֫;Ljava/nio/ByteBuffer;IIIJZZLl/۠ᩴ֫;)Z
    .locals 20

    move-object/from16 v6, p0

    move-object/from16 v2, p5

    move/from16 v3, p7

    move-wide/from16 v8, p10

    .line 155
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1796
    invoke-virtual/range {p0 .. p0}, Ll/ܺ۟֫;->᩷֫()J

    move-result-wide v0

    sub-long v4, v8, v0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2100
    :goto_0
    iget-object v7, v6, Ll/ܿ᩻ۧ;->֡ܽ:Ljava/util/PriorityQueue;

    invoke-virtual {v7}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    if-eqz v10, :cond_0

    .line 2101
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    cmp-long v12, v10, v8

    if-gez v12, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 2103
    invoke-virtual {v7}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    goto :goto_0

    .line 2105
    :cond_0
    invoke-virtual {v6, v1, v0}, Ll/ܿ᩻ۧ;->֫(II)V

    .line 1800
    iget-object v7, v6, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    const/4 v0, 0x1

    if-eqz v7, :cond_2

    if-eqz p12, :cond_1

    if-nez p13, :cond_1

    .line 1803
    invoke-virtual {v6, v2, v3}, Ll/ܿ᩻ۧ;->֫(Ll/ۧ۟֫;I)V

    return v0

    .line 1806
    :cond_1
    new-instance v10, Ll/۟ܳۧ;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p5

    move/from16 v3, p7

    invoke-direct/range {v0 .. v5}, Ll/۟ܳۧ;-><init>(Ll/ܿ᩻ۧ;Ll/ۧ۟֫;IJ)V

    invoke-interface {v7, v8, v9, v10}, Ll/ۜۜۧ;->֫(JLl/ܳۜۧ;)Z

    move-result v0

    return v0

    .line 1827
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ll/ܺ۟֫;->ۢ֫()J

    move-result-wide v14

    iget-object v1, v6, Ll/ܿ᩻ۧ;->ۖᩳ:Ll/᩶᩻ۧ;

    .line 1823
    iget-object v7, v6, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    const/16 v19, 0x0

    move-wide/from16 v8, p10

    move-wide/from16 v10, p1

    move-wide/from16 v12, p3

    move/from16 v16, p12

    move/from16 v17, p13

    move-object/from16 v18, v1

    invoke-virtual/range {v7 .. v18}, Ll/ۙ᩻ۧ;->֫(JJJJZZLl/᩶᩻ۧ;)I

    move-result v1

    .line 1837
    iget-object v14, v6, Ll/ܿ᩻ۧ;->ۖᩳ:Ll/᩶᩻ۧ;

    if-eqz v1, :cond_a

    if-eq v1, v0, :cond_7

    const/4 v4, 0x2

    if-eq v1, v4, :cond_6

    const/4 v4, 0x3

    if-eq v1, v4, :cond_5

    const/4 v0, 0x4

    if-eq v1, v0, :cond_4

    const/4 v0, 0x5

    if-ne v1, v0, :cond_3

    goto :goto_1

    .line 1859
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    return v19

    .line 1845
    :cond_5
    invoke-virtual {v6, v2, v3}, Ll/ܿ᩻ۧ;->֫(Ll/ۧ۟֫;I)V

    .line 1846
    invoke-virtual {v14}, Ll/᩶᩻ۧ;->֫()J

    move-result-wide v1

    invoke-virtual {v6, v1, v2}, Ll/ܿ᩻ۧ;->᩻(J)V

    return v0

    :cond_6
    const-string v1, "dropVideoBuffer"

    .line 38
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2026
    invoke-interface {v2, v3}, Ll/ۧ۟֫;->ܽ(I)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 v1, 0x0

    .line 2028
    invoke-virtual {v6, v1, v0}, Ll/ܿ᩻ۧ;->֫(II)V

    .line 1850
    invoke-virtual {v14}, Ll/᩶᩻ۧ;->֫()J

    move-result-wide v1

    invoke-virtual {v6, v1, v2}, Ll/ܿ᩻ۧ;->᩻(J)V

    return v0

    .line 1889
    :cond_7
    invoke-virtual {v14}, Ll/᩶᩻ۧ;->ۧ()J

    move-result-wide v12

    .line 1890
    invoke-virtual {v14}, Ll/᩶᩻ۧ;->֫()J

    move-result-wide v14

    .line 1891
    iget-wide v7, v6, Ll/ܿ᩻ۧ;->ۗܽ:J

    cmp-long v1, v12, v7

    if-nez v1, :cond_8

    .line 1896
    invoke-virtual {v6, v2, v3}, Ll/ܿ᩻ۧ;->֫(Ll/ۧ۟֫;I)V

    move-wide v4, v12

    goto :goto_3

    .line 1907
    :cond_8
    iget-object v7, v6, Ll/ܿ᩻ۧ;->᩸ܽ:Ll/᩹᩻ۧ;

    if-eqz v7, :cond_9

    .line 1909
    invoke-virtual/range {p0 .. p0}, Ll/ܺ۟֫;->᩻֫()Landroid/media/MediaFormat;

    move-result-object v1

    move-wide v8, v4

    move-wide v10, v12

    move-wide v4, v12

    move-object/from16 v12, p14

    move-object v13, v1

    .line 1908
    invoke-interface/range {v7 .. v13}, Ll/᩹᩻ۧ;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    goto :goto_2

    :cond_9
    move-wide v4, v12

    .line 1899
    :goto_2
    invoke-virtual {v6, v2, v3, v4, v5}, Ll/ܿ᩻ۧ;->֫(Ll/ۧ۟֫;IJ)V

    .line 1901
    :goto_3
    invoke-virtual {v6, v14, v15}, Ll/ܿ᩻ۧ;->᩻(J)V

    .line 1902
    iput-wide v4, v6, Ll/ܿ᩻ۧ;->ۗܽ:J

    return v0

    .line 1839
    :cond_a
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object v1

    invoke-interface {v1}, Ll/ܽۚ֫;->ᩳ()J

    move-result-wide v12

    .line 1907
    iget-object v7, v6, Ll/ܿ᩻ۧ;->᩸ܽ:Ll/᩹᩻ۧ;

    if-eqz v7, :cond_b

    .line 1909
    invoke-virtual/range {p0 .. p0}, Ll/ܺ۟֫;->᩻֫()Landroid/media/MediaFormat;

    move-result-object v1

    move-wide v8, v4

    move-wide v10, v12

    move-wide v4, v12

    move-object/from16 v12, p14

    move-object v13, v1

    .line 1908
    invoke-interface/range {v7 .. v13}, Ll/᩹᩻ۧ;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    goto :goto_4

    :cond_b
    move-wide v4, v12

    .line 2130
    :goto_4
    invoke-virtual {v6, v2, v3, v4, v5}, Ll/ܿ᩻ۧ;->֫(Ll/ۧ۟֫;IJ)V

    .line 1842
    invoke-virtual {v14}, Ll/᩶᩻ۧ;->֫()J

    move-result-wide v1

    invoke-virtual {v6, v1, v2}, Ll/ܿ᩻ۧ;->᩻(J)V

    return v0
.end method

.method public final ֫(JJZZ)Z
    .locals 4

    .line 626
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->ۨܽ:Z

    if-eqz v0, :cond_0

    .line 1884
    iget-wide v0, p0, Ll/ܿ᩻ۧ;->ܿᩳ:J

    neg-long v0, v0

    sub-long/2addr p3, v0

    :cond_0
    const-wide/32 v0, -0x7a120

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-gez v3, :cond_4

    if-nez p5, :cond_4

    .line 2045
    invoke-virtual {p0, p3, p4}, Ll/ۙ᩹֫;->ۧ(J)I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    .line 2051
    iget-object p3, p0, Ll/ܿ᩻ۧ;->֡ܽ:Ljava/util/PriorityQueue;

    if-eqz p6, :cond_2

    .line 2052
    iget-object p4, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget p5, p4, Ll/ۗ᩹֫;->᩷:I

    add-int/2addr p5, p1

    iput p5, p4, Ll/ۗ᩹֫;->᩷:I

    .line 2053
    iget p1, p4, Ll/ۗ᩹֫;->ۢ:I

    iget p6, p0, Ll/ܿ᩻ۧ;->ܳܽ:I

    add-int/2addr p1, p6

    iput p1, p4, Ll/ۗ᩹֫;->ۢ:I

    .line 2054
    invoke-virtual {p3}, Ljava/util/PriorityQueue;->size()I

    move-result p1

    add-int/2addr p1, p5

    iput p1, p4, Ll/ۗ᩹֫;->᩷:I

    goto :goto_0

    .line 2056
    :cond_2
    iget-object p4, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget p5, p4, Ll/ۗ᩹֫;->ܿ:I

    add-int/2addr p5, p2

    iput p5, p4, Ll/ۗ᩹֫;->ܿ:I

    .line 2059
    invoke-virtual {p3}, Ljava/util/PriorityQueue;->size()I

    move-result p3

    add-int/2addr p3, p1

    iget p1, p0, Ll/ܿ᩻ۧ;->ܳܽ:I

    .line 2057
    invoke-virtual {p0, p3, p1}, Ll/ܿ᩻ۧ;->֫(II)V

    .line 2062
    :goto_0
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۧ֫()V

    .line 2063
    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_3

    .line 2064
    invoke-interface {p1, v2}, Ll/ۜۜۧ;->ۧ(Z)V

    :cond_3
    return p2

    :cond_4
    :goto_1
    return v2
.end method

.method public final ֫(Ll/ܿ۟֫;)Z
    .locals 0

    .line 1242
    invoke-direct {p0, p1}, Ll/ܿ᩻ۧ;->ᩳ(Ll/ܿ۟֫;)Z

    move-result p1

    return p1
.end method

.method public final ۚ֫()V
    .locals 1

    .line 1865
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    .line 1866
    invoke-interface {v0}, Ll/ۜۜۧ;->᩻()V

    :cond_0
    return-void
.end method

.method public final ۛ()V
    .locals 2

    .line 1102
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Ll/ܿ᩻ۧ;->ۨܽ:Z

    if-eqz v1, :cond_0

    .line 1103
    invoke-interface {v0}, Ll/ۜۜۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final ۜ()V
    .locals 3

    .line 954
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_2

    .line 955
    iget v1, p0, Ll/ܿ᩻ۧ;->ۤܽ:I

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 960
    :cond_0
    invoke-interface {v0}, Ll/ۜۜۧ;->ۜ()V

    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 958
    iput v0, p0, Ll/ܿ᩻ۧ;->ۤܽ:I

    return-void

    .line 963
    :cond_2
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0}, Ll/ۙ᩻ۧ;->֫()V

    return-void
.end method

.method public final ۟()V
    .locals 7

    .line 2290
    iget v0, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    if-lez v0, :cond_0

    .line 2291
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v3

    .line 2292
    iget-wide v5, p0, Ll/ܿ᩻ۧ;->ۚܽ:J

    sub-long v5, v3, v5

    .line 2293
    iget v0, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    invoke-virtual {v2, v0, v5, v6}, Ll/ۧۜۧ;->֫(IJ)V

    .line 2294
    iput v1, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    .line 2295
    iput-wide v3, p0, Ll/ܿ᩻ۧ;->ۚܽ:J

    .line 2300
    :cond_0
    iget v0, p0, Ll/ܿ᩻ۧ;->ۡᩳ:I

    if-eqz v0, :cond_1

    .line 2301
    iget-wide v3, p0, Ll/ܿ᩻ۧ;->ܳᩳ:J

    invoke-virtual {v2, v0, v3, v4}, Ll/ۧۜۧ;->ۧ(IJ)V

    const-wide/16 v2, 0x0

    .line 2303
    iput-wide v2, p0, Ll/ܿ᩻ۧ;->ܳᩳ:J

    .line 2304
    iput v1, p0, Ll/ܿ᩻ۧ;->ۡᩳ:I

    .line 1061
    :cond_1
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_2

    .line 1062
    invoke-interface {v0}, Ll/ۜۜۧ;->᩷()V

    goto :goto_0

    .line 1064
    :cond_2
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0}, Ll/ۙ᩻ۧ;->ᩳ()V

    :goto_0
    return-void
.end method

.method public final ۤ()V
    .locals 4

    .line 1074
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 1075
    iput-wide v2, p0, Ll/ܿ᩻ۧ;->ܰܽ:J

    .line 1076
    invoke-direct {p0}, Ll/ܿ᩻ۧ;->ۙ֫()V

    const/4 v2, 0x0

    .line 1077
    iput-boolean v2, p0, Ll/ܿ᩻ۧ;->᩶ܽ:Z

    .line 1078
    iput-object v1, p0, Ll/ܿ᩻ۧ;->᩷ᩳ:Ll/ᩳ᩻ۧ;

    const/4 v1, 0x1

    .line 1079
    iput-boolean v1, p0, Ll/ܿ᩻ۧ;->ۙܽ:Z

    .line 1081
    :try_start_0
    invoke-super {p0}, Ll/ܺ۟֫;->ۤ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1083
    iget-object v1, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {v0, v1}, Ll/ۧۜۧ;->֫(Ll/ۗ᩹֫;)V

    .line 1084
    sget-object v1, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    invoke-virtual {v0, v1}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    return-void

    :catchall_0
    move-exception v1

    .line 1083
    iget-object v2, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    invoke-virtual {v0, v2}, Ll/ۧۜۧ;->֫(Ll/ۗ᩹֫;)V

    .line 1084
    sget-object v2, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    invoke-virtual {v0, v2}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    .line 1085
    throw v1
.end method

.method public final ۧ(Ll/᩸᩸֫;)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    .line 1753
    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->ۜܽ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 1756
    :cond_0
    iget-object p1, p1, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1757
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    .line 1759
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 1760
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    .line 1761
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    .line 1762
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    .line 1763
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    const/4 v5, 0x0

    .line 1764
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v6, -0x4b

    if-ne v0, v6, :cond_2

    const/16 v0, 0x3c

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    const/4 v1, 0x4

    if-ne v3, v1, :cond_2

    if-eqz v4, :cond_1

    if-ne v4, v0, :cond_2

    .line 1772
    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    .line 1773
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 1774
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1775
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2310
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "hdr10-plus-info"

    .line 2311
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 2312
    invoke-interface {p1, v1}, Ll/ۧ۟֫;->֫(Landroid/os/Bundle;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 1026
    invoke-super {p0}, Ll/ܺ۟֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۜۜۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ll/ܿ۟֫;)Z
    .locals 2

    .line 2209
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    .line 2211
    invoke-static {v0}, Ll/ܿ᩻ۧ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p1, p1, Ll/ܿ۟֫;->ܺ:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ܿ᩻ۧ;->ۖܽ:Landroid/content/Context;

    .line 2212
    invoke-static {p1}, Ll/᩻᩻ۧ;->֫(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܰ()V
    .locals 3

    const/4 v0, 0x0

    .line 1045
    iput v0, p0, Ll/ܿ᩻ۧ;->֨ܽ:I

    .line 1046
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۠()Ll/ܽۚ֫;

    move-result-object v1

    invoke-interface {v1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v1

    .line 1047
    iput-wide v1, p0, Ll/ܿ᩻ۧ;->ۚܽ:J

    const-wide/16 v1, 0x0

    .line 1048
    iput-wide v1, p0, Ll/ܿ᩻ۧ;->ܳᩳ:J

    .line 1049
    iput v0, p0, Ll/ܿ᩻ۧ;->ۡᩳ:I

    .line 1050
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    .line 1051
    invoke-interface {v0}, Ll/ۜۜۧ;->ۢ()V

    return-void

    .line 1053
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0}, Ll/ۙ᩻ۧ;->ܽ()V

    return-void
.end method

.method public final ܳ(J)V
    .locals 4

    .line 1915
    invoke-virtual {p0, p1, p2}, Ll/ܺ۟֫;->ܿ(J)V

    .line 1916
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘܽ:Ll/ۜ֡֫;

    .line 2277
    sget-object v1, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    invoke-virtual {v0, v1}, Ll/ۜ֡֫;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/ܿ᩻ۧ;->ܶܽ:Ll/ۧۜۧ;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    invoke-virtual {v0, v1}, Ll/ۜ֡֫;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2278
    iput-object v0, p0, Ll/ܿ᩻ۧ;->ۧᩳ:Ll/ۜ֡֫;

    .line 2279
    invoke-virtual {v2, v0}, Ll/ۧۜۧ;->֫(Ll/ۜ֡֫;)V

    .line 1917
    :cond_0
    iget-object v0, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget v1, v0, Ll/ۗ᩹֫;->ۜ:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iput v1, v0, Ll/ۗ᩹֫;->ۜ:I

    .line 2258
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0}, Ll/ۙ᩻ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܿ᩻ۧ;->᩵ܽ:Landroid/view/Surface;

    if-eqz v0, :cond_1

    .line 2265
    invoke-virtual {v2, v0}, Ll/ۧۜۧ;->֫(Ljava/lang/Object;)V

    .line 2266
    iput-boolean v3, p0, Ll/ܿ᩻ۧ;->᩶ܽ:Z

    .line 1919
    :cond_1
    invoke-virtual {p0, p1, p2}, Ll/ܿ᩻ۧ;->ᩳ(J)V

    return-void
.end method

.method public final ܳ֫()Z
    .locals 2

    .line 1248
    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(Ll/᩸᩸֫;)V
    .locals 3

    const/4 v0, 0x0

    .line 1557
    iput v0, p0, Ll/ܿ᩻ۧ;->ܺܽ:I

    .line 1560
    invoke-virtual {p0, p1}, Ll/ܿ᩻ۧ;->֫(Ll/᩸᩸֫;)I

    move-result v0

    .line 1561
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_0

    and-int/lit8 v0, v0, 0x20

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-nez v0, :cond_1

    .line 1562
    iget v0, p0, Ll/ܿ᩻ۧ;->ܳܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܿ᩻ۧ;->ܳܽ:I

    :cond_1
    const/16 v0, 0x17

    if-ge v1, v0, :cond_2

    .line 1564
    iget-boolean v0, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eqz v0, :cond_2

    .line 1567
    iget-wide v0, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {p0, v0, v1}, Ll/ܿ᩻ۧ;->ܳ(J)V

    :cond_2
    return-void
.end method

.method public final ܽ(Ll/۠ᩴ֫;)Z
    .locals 2

    .line 1447
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۜۜۧ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1449
    :try_start_0
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    invoke-interface {v0, p1}, Ll/ۜۜۧ;->֫(Ll/۠ᩴ֫;)Z

    move-result p1
    :try_end_0
    .catch Ll/᩻ۜۧ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/16 v1, 0x1b58

    .line 1451
    invoke-virtual {p0, v0, p1, v1}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ܿ()Z
    .locals 2

    .line 1031
    invoke-super {p0}, Ll/ܺ۟֫;->ܿ()Z

    move-result v0

    .line 1032
    iget-object v1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v1, :cond_0

    .line 1033
    invoke-interface {v1, v0}, Ll/ۜۜۧ;->֫(Z)Z

    move-result v0

    return v0

    :cond_0
    if-eqz v0, :cond_2

    .line 1035
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܽ֫()Ll/ۧ۟֫;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-eqz v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    .line 1039
    :cond_2
    iget-object v1, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    invoke-virtual {v1, v0}, Ll/ۙ᩻ۧ;->֫(Z)Z

    move-result v0

    return v0
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 1930
    invoke-super {p0, p1, p2}, Ll/ܺ۟֫;->ᩳ(J)V

    .line 1931
    iget-boolean p1, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-nez p1, :cond_0

    .line 1932
    iget p1, p0, Ll/ܿ᩻ۧ;->ܳܽ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܿ᩻ۧ;->ܳܽ:I

    :cond_0
    return-void
.end method

.method public final ᩳ(Ll/᩸᩸֫;)Z
    .locals 6

    .line 1590
    invoke-direct {p0, p1}, Ll/ܿ᩻ۧ;->ܿ(Ll/᩸᩸֫;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1663
    :cond_0
    iget-wide v2, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    .line 1604
    :cond_2
    invoke-virtual {p1}, Ll/ۘ᩸֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    return v1

    .line 1608
    :cond_3
    invoke-virtual {p1}, Ll/ۘ᩸֫;->ܺ()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1610
    invoke-virtual {p1}, Ll/᩸᩸֫;->ۧ()V

    const/4 v1, 0x1

    :cond_4
    if-eqz v1, :cond_6

    if-eqz v0, :cond_5

    .line 1639
    iget-object p1, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    iget v0, p1, Ll/ۗ᩹֫;->᩷:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Ll/ۗ᩹֫;->᩷:I

    return v1

    .line 1641
    :cond_5
    iget-wide v2, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object v0, p0, Ll/ܿ᩻ۧ;->֡ܽ:Ljava/util/PriorityQueue;

    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 1642
    iget p1, p0, Ll/ܿ᩻ۧ;->ܺܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܿ᩻ۧ;->ܺܽ:I

    :cond_6
    return v1
.end method

.method public final ᩵֫()V
    .locals 5

    .line 1939
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v0, :cond_1

    .line 1941
    invoke-interface {v0}, Ll/ۜۜۧ;->᩻()V

    .line 1942
    iget-wide v0, p0, Ll/ܿ᩻ۧ;->ܿᩳ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 1943
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۢ֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܿ᩻ۧ;->ܿᩳ:J

    .line 1945
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    .line 1884
    iget-wide v1, p0, Ll/ܿ᩻ۧ;->ܿᩳ:J

    neg-long v1, v1

    .line 1945
    invoke-interface {v0, v1, v2}, Ll/ۜۜۧ;->֫(J)V

    goto :goto_0

    .line 1947
    :cond_1
    iget-object v0, p0, Ll/ܿ᩻ۧ;->ܺᩳ:Ll/ۙ᩻ۧ;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ll/ۙ᩻ۧ;->֫(I)V

    :goto_0
    const/4 v0, 0x1

    .line 1949
    iput-boolean v0, p0, Ll/ܿ᩻ۧ;->᩺ܽ:Z

    .line 1950
    invoke-direct {p0}, Ll/ܿ᩻ۧ;->ۙ֫()V

    return-void
.end method

.method public final ᩸֫()Z
    .locals 5

    .line 1515
    invoke-virtual {p0}, Ll/ܺ۟֫;->ܿ֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 1516
    iget-object v1, p0, Ll/ܿ᩻ۧ;->ᩳᩳ:Ll/᩷۬֫;

    if-nez v1, :cond_0

    goto :goto_0

    .line 1523
    :cond_0
    iget-boolean v1, v1, Ll/᩷۬֫;->֫:Z

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Ll/ܿ᩻ۧ;->ۙܽ:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/ܿ᩻ۧ;->᩻ᩳ:Z

    if-nez v1, :cond_3

    if-eqz v0, :cond_1

    iget v0, v0, Ll/۠ᩴ֫;->۬:I

    if-gtz v0, :cond_3

    .line 1522
    :cond_1
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۖ֫()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1523
    invoke-virtual {p0}, Ll/ܺ۟֫;->ۜ֫()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩹֫()Z
    .locals 2

    .line 1500
    invoke-virtual {p0}, Ll/ܺ۟֫;->ᩳ֫()Ll/ܿ۟֫;

    move-result-object v0

    .line 1501
    iget-object v1, p0, Ll/ܿ᩻ۧ;->ۘᩳ:Ll/ۜۜۧ;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    const-string v1, "c2.mtk.avc.decoder"

    .line 1503
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "c2.mtk.hevc.decoder"

    .line 1504
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1510
    :cond_1
    invoke-super {p0}, Ll/ܺ۟֫;->᩹֫()Z

    move-result v0

    return v0
.end method

.method public final ᩺()V
    .locals 5

    const/4 v0, 0x0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x0

    .line 1091
    :try_start_0
    invoke-super {p0}, Ll/ܺ۟֫;->᩺()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1093
    iput-boolean v3, p0, Ll/ܿ᩻ۧ;->᩹ܽ:Z

    .line 1094
    iput-wide v1, p0, Ll/ܿ᩻ۧ;->ܿᩳ:J

    .line 2216
    iget-object v1, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    if-eqz v1, :cond_0

    .line 2217
    invoke-virtual {v1}, Ll/᩻᩻ۧ;->release()V

    .line 2218
    iput-object v0, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    :cond_0
    return-void

    :catchall_0
    move-exception v4

    .line 1093
    iput-boolean v3, p0, Ll/ܿ᩻ۧ;->᩹ܽ:Z

    .line 1094
    iput-wide v1, p0, Ll/ܿ᩻ۧ;->ܿᩳ:J

    .line 2216
    iget-object v1, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    if-eqz v1, :cond_1

    .line 2217
    invoke-virtual {v1}, Ll/᩻᩻ۧ;->release()V

    .line 2218
    iput-object v0, p0, Ll/ܿ᩻ۧ;->۟ܽ:Ll/᩻᩻ۧ;

    .line 1096
    :cond_1
    throw v4
.end method

.method public final ᩻(J)V
    .locals 3

    .line 2114
    iget-object v0, p0, Ll/ܺ۟֫;->ܽۧ:Ll/ۗ᩹֫;

    .line 169
    iget-wide v1, v0, Ll/ۗ᩹֫;->ۡ:J

    add-long/2addr v1, p1

    iput-wide v1, v0, Ll/ۗ᩹֫;->ۡ:J

    .line 170
    iget v1, v0, Ll/ۗ᩹֫;->ܺ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/ۗ᩹֫;->ܺ:I

    .line 2115
    iget-wide v0, p0, Ll/ܿ᩻ۧ;->ܳᩳ:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ܿ᩻ۧ;->ܳᩳ:J

    .line 2116
    iget p1, p0, Ll/ܿ᩻ۧ;->ۡᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܿ᩻ۧ;->ۡᩳ:I

    return-void
.end method
