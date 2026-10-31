.class public final Ll/᩻ܿۧ;
.super Ll/ᩳܿۧ;
.source "18UV"


# instance fields
.field public final ֫֫:I

.field public final ۗ:Z

.field public final ۛ:Z

.field public final ۜ֫:Z

.field public final ۟:Ll/᩺ᩳۧ;

.field public final ۤ:Z

.field public final ۧ֫:I

.field public final ۨ:Z

.field public final ۫:I

.field public final ۬:I

.field public final ܰ:Z

.field public final ܳ֫:I

.field public final ܽ֫:I

.field public final ܿ֫:I

.field public final ᩳ֫:I

.field public final ᩷֫:Z

.field public final ᩺:Z

.field public final ᩻֫:I


# direct methods
.method public constructor <init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;ILjava/lang/String;IZ)V
    .locals 6

    .line 3638
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳܿۧ;-><init>(ILl/۬᩵֫;I)V

    .line 3639
    iput-object p4, p0, Ll/᩻ܿۧ;->۟:Ll/᩺ᩳۧ;

    .line 3642
    iget-boolean p1, p4, Ll/᩺ᩳۧ;->᩻֫:Z

    iget-object p2, p4, Ll/ۨ᩵֫;->ۙ:Ll/ܳ۬ܺ;

    iget-object p3, p4, Ll/ۨ᩵֫;->᩶:Ll/ܳ۬ܺ;

    if-eqz p1, :cond_0

    const/16 p1, 0x18

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    .line 3646
    :goto_0
    iget-boolean v0, p4, Ll/᩺ᩳۧ;->ܳ֫:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    and-int/2addr p7, p1

    if-eqz p7, :cond_1

    const/4 p7, 0x1

    goto :goto_1

    :cond_1
    const/4 p7, 0x0

    :goto_1
    iput-boolean p7, p0, Ll/᩻ܿۧ;->ۗ:Z

    const/high16 p7, -0x40800000    # -1.0f

    const/4 v0, -0x1

    if-eqz p8, :cond_6

    .line 3649
    iget-object v3, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget v4, v3, Ll/۠ᩴ֫;->᩷֫:I

    if-eq v4, v0, :cond_2

    iget v5, p4, Ll/ۨ᩵֫;->ۖ:I

    if-gt v4, v5, :cond_6

    :cond_2
    iget v4, v3, Ll/۠ᩴ֫;->۠:I

    if-eq v4, v0, :cond_3

    iget v5, p4, Ll/ۨ᩵֫;->ܺ:I

    if-gt v4, v5, :cond_6

    :cond_3
    iget v4, v3, Ll/۠ᩴ֫;->֡:F

    cmpl-float v5, v4, p7

    if-eqz v5, :cond_4

    iget v5, p4, Ll/ۨ᩵֫;->ۡ:I

    int-to-float v5, v5

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_6

    :cond_4
    iget v3, v3, Ll/۠ᩴ֫;->ᩳ:I

    if-eq v3, v0, :cond_5

    iget v4, p4, Ll/ۨ᩵֫;->ۢ:I

    if-gt v3, v4, :cond_6

    :cond_5
    const/4 v3, 0x1

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    iput-boolean v3, p0, Ll/᩻ܿۧ;->ۨ:Z

    if-eqz p8, :cond_b

    .line 3657
    iget-object p8, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget v3, p8, Ll/۠ᩴ֫;->᩷֫:I

    if-eq v3, v0, :cond_7

    iget v4, p4, Ll/ۨ᩵֫;->֡:I

    if-lt v3, v4, :cond_b

    :cond_7
    iget v3, p8, Ll/۠ᩴ֫;->۠:I

    if-eq v3, v0, :cond_8

    iget v4, p4, Ll/ۨ᩵֫;->᩵:I

    if-lt v3, v4, :cond_b

    :cond_8
    iget v3, p8, Ll/۠ᩴ֫;->֡:F

    cmpl-float v4, v3, p7

    if-eqz v4, :cond_9

    iget v4, p4, Ll/ۨ᩵֫;->ᩴ:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_b

    :cond_9
    iget p8, p8, Ll/۠ᩴ֫;->ᩳ:I

    if-eq p8, v0, :cond_a

    iget v3, p4, Ll/ۨ᩵֫;->ۘ:I

    if-lt p8, v3, :cond_b

    :cond_a
    const/4 p8, 0x1

    goto :goto_3

    :cond_b
    const/4 p8, 0x0

    :goto_3
    iput-boolean p8, p0, Ll/᩻ܿۧ;->᩺:Z

    .line 3666
    invoke-static {p5, v2}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p8

    iput-boolean p8, p0, Ll/᩻ܿۧ;->ܰ:Z

    .line 3667
    iget-object p8, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget v3, p8, Ll/۠ᩴ֫;->֡:F

    cmpl-float p7, v3, p7

    if-eqz p7, :cond_c

    const/high16 p7, 0x41200000    # 10.0f

    cmpl-float p7, v3, p7

    if-ltz p7, :cond_c

    const/4 p7, 0x1

    goto :goto_4

    :cond_c
    const/4 p7, 0x0

    :goto_4
    iput-boolean p7, p0, Ll/᩻ܿۧ;->ۛ:Z

    .line 3669
    iget p7, p8, Ll/۠ᩴ֫;->ᩳ:I

    iput p7, p0, Ll/᩻ܿۧ;->۬:I

    .line 1319
    iget p7, p8, Ll/۠ᩴ֫;->᩷֫:I

    if-eq p7, v0, :cond_e

    iget p8, p8, Ll/۠ᩴ֫;->۠:I

    if-ne p8, v0, :cond_d

    goto :goto_5

    :cond_d
    mul-int p7, p7, p8

    goto :goto_6

    :cond_e
    :goto_5
    const/4 p7, -0x1

    .line 3670
    :goto_6
    iput p7, p0, Ll/᩻ܿۧ;->֫֫:I

    const/4 p7, 0x0

    .line 3673
    :goto_7
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p8

    const v3, 0x7fffffff

    if-ge p7, p8, :cond_10

    .line 3674
    iget-object p8, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    .line 3677
    invoke-interface {p3, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 3675
    invoke-static {p8, v4, v2}, Ll/ۜܿۧ;->֫(Ll/۠ᩴ֫;Ljava/lang/String;Z)I

    move-result p8

    if-lez p8, :cond_f

    goto :goto_8

    :cond_f
    add-int/lit8 p7, p7, 0x1

    goto :goto_7

    :cond_10
    const p7, 0x7fffffff

    const/4 p8, 0x0

    .line 3685
    :goto_8
    iput p7, p0, Ll/᩻ܿۧ;->ۧ֫:I

    .line 3686
    iput p8, p0, Ll/᩻ܿۧ;->ܽ֫:I

    .line 3687
    iget-object p3, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p3, p3, Ll/۠ᩴ֫;->۟:I

    iget p4, p4, Ll/ۨ᩵֫;->ۗ:I

    .line 3688
    sget p7, Ll/ۜܿۧ;->ۡ:I

    if-eqz p3, :cond_11

    if-ne p3, p4, :cond_11

    const p3, 0x7fffffff

    goto :goto_9

    :cond_11
    and-int/2addr p3, p4

    .line 3460
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    move-result p3

    .line 3688
    :goto_9
    iput p3, p0, Ll/᩻ܿۧ;->ܿ֫:I

    .line 3689
    iget-object p3, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p3, p3, Ll/۠ᩴ֫;->۟:I

    if-eqz p3, :cond_13

    and-int/2addr p3, v1

    if-eqz p3, :cond_12

    goto :goto_a

    :cond_12
    const/4 p3, 0x0

    goto :goto_b

    :cond_13
    :goto_a
    const/4 p3, 0x1

    :goto_b
    iput-boolean p3, p0, Ll/᩻ܿۧ;->ۤ:Z

    .line 3691
    invoke-static {p6}, Ll/ۜܿۧ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_14

    const/4 p3, 0x1

    goto :goto_c

    :cond_14
    const/4 p3, 0x0

    .line 3692
    :goto_c
    iget-object p4, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    .line 3693
    invoke-static {p4, p6, p3}, Ll/ۜܿۧ;->֫(Ll/۠ᩴ֫;Ljava/lang/String;Z)I

    move-result p3

    iput p3, p0, Ll/᩻ܿۧ;->ܳ֫:I

    const/4 p3, 0x0

    .line 3695
    :goto_d
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p4

    if-ge p3, p4, :cond_16

    .line 3696
    iget-object p4, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget-object p4, p4, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-eqz p4, :cond_15

    .line 3697
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_15

    move v3, p3

    goto :goto_e

    :cond_15
    add-int/lit8 p3, p3, 0x1

    goto :goto_d

    .line 3702
    :cond_16
    :goto_e
    iput v3, p0, Ll/᩻ܿۧ;->ᩳ֫:I

    and-int/lit16 p2, p5, 0x180

    const/16 p3, 0x80

    if-ne p2, p3, :cond_17

    const/4 p2, 0x1

    goto :goto_f

    :cond_17
    const/4 p2, 0x0

    .line 3704
    :goto_f
    iput-boolean p2, p0, Ll/᩻ܿۧ;->᩷֫:Z

    and-int/lit8 p2, p5, 0x40

    const/16 p3, 0x40

    if-ne p2, p3, :cond_18

    const/4 p2, 0x1

    goto :goto_10

    :cond_18
    const/4 p2, 0x0

    .line 3707
    :goto_10
    iput-boolean p2, p0, Ll/᩻ܿۧ;->ۜ֫:Z

    .line 3709
    iget-object p2, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget-object p3, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-nez p3, :cond_19

    goto :goto_13

    .line 3471
    :cond_19
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p4

    const/4 p6, 0x4

    sparse-switch p4, :sswitch_data_0

    goto :goto_11

    :sswitch_0
    const-string p4, "video/x-vnd.on2.vp9"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1a

    goto :goto_11

    :cond_1a
    const/4 p3, 0x4

    goto :goto_12

    :sswitch_1
    const-string p4, "video/avc"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1b

    goto :goto_11

    :cond_1b
    const/4 p3, 0x3

    goto :goto_12

    :sswitch_2
    const-string p4, "video/hevc"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1c

    goto :goto_11

    :cond_1c
    const/4 p3, 0x2

    goto :goto_12

    :sswitch_3
    const-string p4, "video/av01"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1d

    goto :goto_11

    :cond_1d
    const/4 p3, 0x1

    goto :goto_12

    :sswitch_4
    const-string p4, "video/dolby-vision"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1e

    goto :goto_11

    :cond_1e
    const/4 p3, 0x0

    goto :goto_12

    :goto_11
    const/4 p3, -0x1

    :goto_12
    packed-switch p3, :pswitch_data_0

    goto :goto_13

    :pswitch_0
    const/4 p6, 0x2

    goto :goto_14

    :pswitch_1
    const/4 p6, 0x1

    goto :goto_14

    :pswitch_2
    const/4 p6, 0x3

    goto :goto_14

    :pswitch_3
    const/4 p6, 0x5

    goto :goto_14

    :goto_13
    const/4 p6, 0x0

    .line 3709
    :goto_14
    :pswitch_4
    iput p6, p0, Ll/᩻ܿۧ;->۫:I

    .line 3729
    iget-boolean p3, p0, Ll/᩻ܿۧ;->ۨ:Z

    iget-object p4, p0, Ll/᩻ܿۧ;->۟:Ll/᩺ᩳۧ;

    iget p6, p2, Ll/۠ᩴ֫;->۟:I

    and-int/lit16 p6, p6, 0x4000

    if-eqz p6, :cond_1f

    goto :goto_15

    .line 3733
    :cond_1f
    iget-boolean p6, p4, Ll/᩺ᩳۧ;->ۢ֫:Z

    invoke-static {p5, p6}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p6

    if-nez p6, :cond_20

    goto :goto_15

    :cond_20
    if-nez p3, :cond_21

    .line 3736
    iget-boolean p6, p4, Ll/᩺ᩳۧ;->ۡ֫:Z

    if-nez p6, :cond_21

    :goto_15
    const/4 v1, 0x0

    goto :goto_16

    .line 3739
    :cond_21
    invoke-static {p5, v2}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p6

    if-eqz p6, :cond_22

    iget-boolean p6, p0, Ll/᩻ܿۧ;->᩺:Z

    if-eqz p6, :cond_22

    if-eqz p3, :cond_22

    iget p2, p2, Ll/۠ᩴ֫;->ᩳ:I

    if-eq p2, v0, :cond_22

    iget-boolean p2, p4, Ll/ۨ᩵֫;->ܽ:Z

    if-nez p2, :cond_22

    iget-boolean p2, p4, Ll/ۨ᩵֫;->ᩳ:Z

    if-nez p2, :cond_22

    and-int/2addr p1, p5

    if-eqz p1, :cond_22

    const/4 v1, 0x2

    .line 3710
    :cond_22
    :goto_16
    iput v1, p0, Ll/᩻ܿۧ;->᩻֫:I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/᩻ܿۧ;Ll/᩻ܿۧ;)I
    .locals 6

    .line 3794
    iget-boolean v0, p0, Ll/᩻ܿۧ;->ۨ:Z

    iget v1, p0, Ll/᩻ܿۧ;->۬:I

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/᩻ܿۧ;->ܰ:Z

    if-eqz v0, :cond_0

    .line 3795
    invoke-static {}, Ll/ۜܿۧ;->ܳ()Ll/ۤۤܺ;

    move-result-object v0

    goto :goto_0

    .line 3796
    :cond_0
    invoke-static {}, Ll/ۜܿۧ;->ܳ()Ll/ۤۤܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v0

    .line 3797
    :goto_0
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v2

    .line 3798
    iget-object v3, p0, Ll/᩻ܿۧ;->۟:Ll/᩺ᩳۧ;

    iget-boolean v3, v3, Ll/ۨ᩵֫;->ᩳ:Z

    if-eqz v3, :cond_1

    .line 3800
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p1, Ll/᩻ܿۧ;->۬:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {}, Ll/ۜܿۧ;->ܳ()Ll/ۤۤܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v2

    .line 3802
    :cond_1
    iget p0, p0, Ll/᩻ܿۧ;->֫֫:I

    .line 3803
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iget v3, p1, Ll/᩻ܿۧ;->֫֫:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, p0, v3, v0}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object p0

    .line 3804
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget p1, p1, Ll/᩻ܿۧ;->۬:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v0}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object p0

    .line 3805
    invoke-virtual {p0}, Ll/ۜۗܺ;->֫()I

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/᩻ܿۧ;Ll/᩻ܿۧ;)I
    .locals 4

    .line 3752
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩻ܿۧ;->ܰ:Z

    iget-boolean v2, p1, Ll/᩻ܿۧ;->ܰ:Z

    .line 3753
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/᩻ܿۧ;->ۧ֫:I

    .line 3757
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ll/᩻ܿۧ;->ۧ֫:I

    .line 3758
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 3759
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v3

    .line 3756
    invoke-virtual {v0, v1, v2, v3}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/᩻ܿۧ;->ܽ֫:I

    iget v2, p1, Ll/᩻ܿۧ;->ܽ֫:I

    .line 3760
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/᩻ܿۧ;->ܿ֫:I

    iget v2, p1, Ll/᩻ܿۧ;->ܿ֫:I

    .line 3761
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩻ܿۧ;->ۤ:Z

    iget-boolean v2, p1, Ll/᩻ܿۧ;->ۤ:Z

    .line 3763
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/᩻ܿۧ;->ܳ֫:I

    iget v2, p1, Ll/᩻ܿۧ;->ܳ֫:I

    .line 3764
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩻ܿۧ;->ۛ:Z

    iget-boolean v2, p1, Ll/᩻ܿۧ;->ۛ:Z

    .line 3766
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩻ܿۧ;->ۨ:Z

    iget-boolean v2, p1, Ll/᩻ܿۧ;->ۨ:Z

    .line 3768
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩻ܿۧ;->᩺:Z

    iget-boolean v2, p1, Ll/᩻ܿۧ;->᩺:Z

    .line 3769
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/᩻ܿۧ;->ᩳ֫:I

    .line 3771
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ll/᩻ܿۧ;->ᩳ֫:I

    .line 3772
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 3773
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v3

    .line 3770
    invoke-virtual {v0, v1, v2, v3}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩻ܿۧ;->᩷֫:Z

    iget-boolean v2, p1, Ll/᩻ܿۧ;->᩷֫:Z

    .line 3775
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v2, p0, Ll/᩻ܿۧ;->ۜ֫:Z

    iget-boolean v3, p1, Ll/᩻ܿۧ;->ۜ֫:Z

    .line 3776
    invoke-virtual {v0, v2, v3}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 3779
    iget p0, p0, Ll/᩻ܿۧ;->۫:I

    iget p1, p1, Ll/᩻ܿۧ;->۫:I

    invoke-virtual {v0, p0, p1}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    .line 3781
    :cond_0
    invoke-virtual {v0}, Ll/ۜۗܺ;->֫()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 3715
    iget v0, p0, Ll/᩻ܿۧ;->᩻֫:I

    return v0
.end method

.method public final ֫(Ll/ᩳܿۧ;)Z
    .locals 2

    .line 3562
    check-cast p1, Ll/᩻ܿۧ;

    .line 3720
    iget-boolean v0, p0, Ll/᩻ܿۧ;->ۗ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object v1, p1, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget-object v1, v1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 3721
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll/᩻ܿۧ;->۟:Ll/᩺ᩳۧ;

    iget-boolean v0, v0, Ll/᩺ᩳۧ;->ܿ֫:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/᩻ܿۧ;->᩷֫:Z

    iget-boolean v1, p1, Ll/᩻ܿۧ;->᩷֫:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Ll/᩻ܿۧ;->ۜ֫:Z

    iget-boolean p1, p1, Ll/᩻ܿۧ;->ۜ֫:Z

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
