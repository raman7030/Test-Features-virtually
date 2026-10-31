.class public final Ll/۫ᩳۧ;
.super Ll/ᩳܿۧ;
.source "18UV"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ֫֫:I

.field public final ۗ:Z

.field public final ۛ:Z

.field public final ۜ֫:I

.field public final ۟:Ljava/lang/String;

.field public final ۡ֫:Z

.field public final ۢ֫:Z

.field public final ۤ:Z

.field public final ۧ֫:I

.field public final ۨ:Z

.field public final ۫:I

.field public final ۬:I

.field public final ܰ:Z

.field public final ܳ֫:I

.field public final ܽ֫:Ll/᩺ᩳۧ;

.field public final ܿ֫:I

.field public final ᩳ֫:I

.field public final ᩷֫:I

.field public final ᩺:Z

.field public final ᩻֫:I


# direct methods
.method public constructor <init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;IZLl/۬ᩳۧ;I)V
    .locals 6

    .line 3883
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳܿۧ;-><init>(ILl/۬᩵֫;I)V

    .line 3884
    iput-object p4, p0, Ll/۫ᩳۧ;->ܽ֫:Ll/᩺ᩳۧ;

    .line 3887
    iget-boolean p1, p4, Ll/᩺ᩳۧ;->ۧ֫:Z

    iget-object p2, p4, Ll/ۨ᩵֫;->۠:Ll/ܳ۬ܺ;

    iget-object p3, p4, Ll/ۨ᩵֫;->֨:Ll/ܳ۬ܺ;

    if-eqz p1, :cond_0

    const/16 p1, 0x18

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    .line 3891
    :goto_0
    iget-boolean v0, p4, Ll/᩺ᩳۧ;->۟:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    and-int/2addr p8, p1

    if-eqz p8, :cond_1

    const/4 p8, 0x1

    goto :goto_1

    :cond_1
    const/4 p8, 0x0

    :goto_1
    iput-boolean p8, p0, Ll/۫ᩳۧ;->ۗ:Z

    .line 3894
    iget-object p8, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget-object p8, p8, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    invoke-static {p8}, Ll/ۜܿۧ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p8

    iput-object p8, p0, Ll/۫ᩳۧ;->۟:Ljava/lang/String;

    .line 3896
    invoke-static {p5, v2}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p8

    iput-boolean p8, p0, Ll/۫ᩳۧ;->ܰ:Z

    const/4 p8, 0x0

    .line 3899
    :goto_2
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const v3, 0x7fffffff

    if-ge p8, v0, :cond_3

    .line 3900
    iget-object v0, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    .line 3903
    invoke-interface {p3, p8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 3901
    invoke-static {v0, v4, v2}, Ll/ۜܿۧ;->֫(Ll/۠ᩴ֫;Ljava/lang/String;Z)I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 p8, p8, 0x1

    goto :goto_2

    :cond_3
    const p8, 0x7fffffff

    const/4 v0, 0x0

    .line 3911
    :goto_3
    iput p8, p0, Ll/۫ᩳۧ;->ᩳ֫:I

    .line 3912
    iput v0, p0, Ll/۫ᩳۧ;->ܿ֫:I

    .line 3913
    iget-object p3, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p3, p3, Ll/۠ᩴ֫;->۟:I

    iget p8, p4, Ll/ۨ᩵֫;->ܶ:I

    if-eqz p3, :cond_4

    if-ne p3, p8, :cond_4

    const p3, 0x7fffffff

    goto :goto_4

    :cond_4
    and-int/2addr p3, p8

    .line 3460
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    move-result p3

    .line 3914
    :goto_4
    iput p3, p0, Ll/۫ᩳۧ;->᩻֫:I

    .line 3915
    iget-object p3, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p8, p3, Ll/۠ᩴ֫;->۟:I

    if-eqz p8, :cond_6

    and-int/2addr p8, v1

    if-eqz p8, :cond_5

    goto :goto_5

    :cond_5
    const/4 p8, 0x0

    goto :goto_6

    :cond_6
    :goto_5
    const/4 p8, 0x1

    :goto_6
    iput-boolean p8, p0, Ll/۫ᩳۧ;->ۤ:Z

    .line 3916
    iget p8, p3, Ll/۠ᩴ֫;->ᩳ֫:I

    and-int/2addr p8, v1

    if-eqz p8, :cond_7

    const/4 p8, 0x1

    goto :goto_7

    :cond_7
    const/4 p8, 0x0

    :goto_7
    iput-boolean p8, p0, Ll/۫ᩳۧ;->ۛ:Z

    .line 3488
    iget-object p8, p3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const/4 v0, -0x1

    if-nez p8, :cond_8

    goto :goto_a

    .line 3491
    :cond_8
    invoke-virtual {p8}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_8

    :sswitch_0
    const-string v4, "audio/iamf"

    invoke-virtual {p8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p8

    if-nez p8, :cond_9

    goto :goto_8

    :cond_9
    const/4 p8, 0x2

    goto :goto_9

    :sswitch_1
    const-string v4, "audio/ac4"

    invoke-virtual {p8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p8

    if-nez p8, :cond_a

    goto :goto_8

    :cond_a
    const/4 p8, 0x1

    goto :goto_9

    :sswitch_2
    const-string v4, "audio/eac3-joc"

    invoke-virtual {p8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p8

    if-nez p8, :cond_b

    goto :goto_8

    :cond_b
    const/4 p8, 0x0

    goto :goto_9

    :goto_8
    const/4 p8, -0x1

    :goto_9
    packed-switch p8, :pswitch_data_0

    goto :goto_a

    :pswitch_0
    const/4 p8, 0x1

    goto :goto_b

    :goto_a
    const/4 p8, 0x0

    .line 3917
    :goto_b
    iput-boolean p8, p0, Ll/۫ᩳۧ;->ۨ:Z

    .line 3918
    iget p8, p3, Ll/۠ᩴ֫;->ܿ:I

    iput p8, p0, Ll/۫ᩳۧ;->۫:I

    .line 3919
    iget v4, p3, Ll/۠ᩴ֫;->ܽ֫:I

    iput v4, p0, Ll/۫ᩳۧ;->ۜ֫:I

    .line 3920
    iget v4, p3, Ll/۠ᩴ֫;->ᩳ:I

    iput v4, p0, Ll/۫ᩳۧ;->۬:I

    if-eq v4, v0, :cond_c

    .line 3921
    iget v5, p4, Ll/ۨ᩵֫;->ۜ:I

    if-gt v4, v5, :cond_e

    :cond_c
    if-eq p8, v0, :cond_d

    iget p4, p4, Ll/ۨ᩵֫;->᩷:I

    if-gt p8, p4, :cond_e

    .line 3925
    :cond_d
    invoke-virtual {p7, p3}, Ll/۬ᩳۧ;->apply(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    const/4 p3, 0x1

    goto :goto_c

    :cond_e
    const/4 p3, 0x0

    :goto_c
    iput-boolean p3, p0, Ll/۫ᩳۧ;->᩺:Z

    .line 3926
    invoke-static {}, Ll/ۘ֨֫;->ۧ()[Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x0

    .line 3929
    :goto_d
    array-length p7, p3

    if-ge p4, p7, :cond_10

    .line 3930
    iget-object p7, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    aget-object p8, p3, p4

    .line 3931
    invoke-static {p7, p8, v2}, Ll/ۜܿۧ;->֫(Ll/۠ᩴ֫;Ljava/lang/String;Z)I

    move-result p7

    if-lez p7, :cond_f

    goto :goto_e

    :cond_f
    add-int/lit8 p4, p4, 0x1

    goto :goto_d

    :cond_10
    const p4, 0x7fffffff

    const/4 p7, 0x0

    .line 3939
    :goto_e
    iput p4, p0, Ll/۫ᩳۧ;->֫֫:I

    .line 3940
    iput p7, p0, Ll/۫ᩳۧ;->ۧ֫:I

    const/4 p3, 0x0

    .line 3942
    :goto_f
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p4

    if-ge p3, p4, :cond_12

    .line 3943
    iget-object p4, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget-object p4, p4, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-eqz p4, :cond_11

    .line 3944
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    invoke-virtual {p4, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_11

    move v3, p3

    goto :goto_10

    :cond_11
    add-int/lit8 p3, p3, 0x1

    goto :goto_f

    .line 3949
    :cond_12
    :goto_10
    iput v3, p0, Ll/۫ᩳۧ;->ܳ֫:I

    and-int/lit16 p2, p5, 0x180

    const/16 p3, 0x80

    if-ne p2, p3, :cond_13

    const/4 p2, 0x1

    goto :goto_11

    :cond_13
    const/4 p2, 0x0

    .line 3951
    :goto_11
    iput-boolean p2, p0, Ll/۫ᩳۧ;->ۡ֫:Z

    and-int/lit8 p2, p5, 0x40

    const/16 p3, 0x40

    if-ne p2, p3, :cond_14

    const/4 p2, 0x1

    goto :goto_12

    :cond_14
    const/4 p2, 0x0

    .line 3954
    :goto_12
    iput-boolean p2, p0, Ll/۫ᩳۧ;->ۢ֫:Z

    .line 4039
    iget-boolean p2, p0, Ll/۫ᩳۧ;->᩺:Z

    iget-object p3, p0, Ll/۫ᩳۧ;->ܽ֫:Ll/᩺ᩳۧ;

    iget-boolean p4, p3, Ll/᩺ᩳۧ;->ۢ֫:Z

    iget-object p7, p3, Ll/ۨ᩵֫;->֫:Ll/ۤ᩵֫;

    invoke-static {p5, p4}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p4

    if-nez p4, :cond_15

    goto :goto_13

    :cond_15
    if-nez p2, :cond_16

    .line 4042
    iget-boolean p4, p3, Ll/᩺ᩳۧ;->᩷֫:Z

    if-nez p4, :cond_16

    :goto_13
    const/4 v1, 0x0

    goto :goto_14

    .line 4045
    :cond_16
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4049
    invoke-static {p5, v2}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p4

    if-eqz p4, :cond_18

    if-eqz p2, :cond_18

    iget-object p2, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p2, p2, Ll/۠ᩴ֫;->ᩳ:I

    if-eq p2, v0, :cond_18

    iget-boolean p2, p3, Ll/ۨ᩵֫;->ܽ:Z

    if-nez p2, :cond_18

    iget-boolean p2, p3, Ll/ۨ᩵֫;->ᩳ:Z

    if-nez p2, :cond_18

    iget-boolean p2, p3, Ll/᩺ᩳۧ;->ᩳ֫:Z

    if-nez p2, :cond_17

    if-nez p6, :cond_18

    :cond_17
    and-int/2addr p1, p5

    if-eqz p1, :cond_18

    const/4 v1, 0x2

    .line 3957
    :cond_18
    :goto_14
    iput v1, p0, Ll/۫ᩳۧ;->᩷֫:I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59afdf4a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 3826
    check-cast p1, Ll/۫ᩳۧ;

    invoke-virtual {p0, p1}, Ll/۫ᩳۧ;->֫(Ll/۫ᩳۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 3963
    iget v0, p0, Ll/۫ᩳۧ;->᩷֫:I

    return v0
.end method

.method public final ֫(Ll/۫ᩳۧ;)I
    .locals 7

    .line 3987
    iget-boolean v0, p0, Ll/۫ᩳۧ;->ܰ:Z

    iget-boolean v1, p0, Ll/۫ᩳۧ;->᩺:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 3988
    invoke-static {}, Ll/ۜܿۧ;->ܳ()Ll/ۤۤܺ;

    move-result-object v2

    goto :goto_0

    .line 3989
    :cond_0
    invoke-static {}, Ll/ۜܿۧ;->ܳ()Ll/ۤۤܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v2

    .line 3991
    :goto_0
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v3

    iget-boolean v4, p1, Ll/۫ᩳۧ;->ܰ:Z

    iget v5, p1, Ll/۫ᩳۧ;->۬:I

    .line 3992
    invoke-virtual {v3, v0, v4}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v3, p0, Ll/۫ᩳۧ;->ᩳ֫:I

    .line 3996
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p1, Ll/۫ᩳۧ;->ᩳ֫:I

    .line 3997
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 3998
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v6

    .line 3995
    invoke-virtual {v0, v3, v4, v6}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget v3, p0, Ll/۫ᩳۧ;->ܿ֫:I

    iget v4, p1, Ll/۫ᩳۧ;->ܿ֫:I

    .line 3999
    invoke-virtual {v0, v3, v4}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget v3, p0, Ll/۫ᩳۧ;->᩻֫:I

    iget v4, p1, Ll/۫ᩳۧ;->᩻֫:I

    .line 4000
    invoke-virtual {v0, v3, v4}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v3, p0, Ll/۫ᩳۧ;->ۛ:Z

    iget-boolean v4, p1, Ll/۫ᩳۧ;->ۛ:Z

    .line 4002
    invoke-virtual {v0, v3, v4}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v3, p0, Ll/۫ᩳۧ;->ۤ:Z

    iget-boolean v4, p1, Ll/۫ᩳۧ;->ۤ:Z

    .line 4003
    invoke-virtual {v0, v3, v4}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v3, p0, Ll/۫ᩳۧ;->֫֫:I

    .line 4005
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p1, Ll/۫ᩳۧ;->֫֫:I

    .line 4006
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 4007
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v6

    .line 4004
    invoke-virtual {v0, v3, v4, v6}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget v3, p0, Ll/۫ᩳۧ;->ۧ֫:I

    iget v4, p1, Ll/۫ᩳۧ;->ۧ֫:I

    .line 4008
    invoke-virtual {v0, v3, v4}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v3, p1, Ll/۫ᩳۧ;->᩺:Z

    .line 4010
    invoke-virtual {v0, v1, v3}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/۫ᩳۧ;->ܳ֫:I

    .line 4012
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p1, Ll/۫ᩳۧ;->ܳ֫:I

    .line 4013
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 4014
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v4

    .line 4011
    invoke-virtual {v0, v1, v3, v4}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    .line 4015
    iget-object v1, p0, Ll/۫ᩳۧ;->ܽ֫:Ll/᩺ᩳۧ;

    iget-boolean v1, v1, Ll/ۨ᩵֫;->ᩳ:Z

    iget v3, p0, Ll/۫ᩳۧ;->۬:I

    if-eqz v1, :cond_1

    .line 4017
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {}, Ll/ۜܿۧ;->ܳ()Ll/ۤۤܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v6

    invoke-virtual {v0, v1, v4, v6}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    .line 4020
    :cond_1
    iget-boolean v1, p0, Ll/۫ᩳۧ;->ۡ֫:Z

    iget-boolean v4, p1, Ll/۫ᩳۧ;->ۡ֫:Z

    .line 4022
    invoke-virtual {v0, v1, v4}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/۫ᩳۧ;->ۢ֫:Z

    iget-boolean v4, p1, Ll/۫ᩳۧ;->ۢ֫:Z

    .line 4023
    invoke-virtual {v0, v1, v4}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/۫ᩳۧ;->ۨ:Z

    iget-boolean v4, p1, Ll/۫ᩳۧ;->ۨ:Z

    .line 4025
    invoke-virtual {v0, v1, v4}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/۫ᩳۧ;->۫:I

    .line 4026
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v4, p1, Ll/۫ᩳۧ;->۫:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v1, v4, v2}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/۫ᩳۧ;->ۜ֫:I

    .line 4027
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v4, p1, Ll/۫ᩳۧ;->ۜ֫:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v1, v4, v2}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    .line 4028
    iget-object v1, p0, Ll/۫ᩳۧ;->۟:Ljava/lang/String;

    iget-object p1, p1, Ll/۫ᩳۧ;->۟:Ljava/lang/String;

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 4030
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1, v2}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    .line 4032
    :cond_2
    invoke-virtual {v0}, Ll/ۜۗܺ;->֫()I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩳܿۧ;)Z
    .locals 6

    .line 3826
    check-cast p1, Ll/۫ᩳۧ;

    iget-object v0, p1, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    .line 3968
    iget-object v1, p0, Ll/۫ᩳۧ;->ܽ֫:Ll/᩺ᩳۧ;

    iget-boolean v2, v1, Ll/᩺ᩳۧ;->᩺:Z

    const/4 v3, -0x1

    iget-object v4, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    if-nez v2, :cond_0

    iget v2, v4, Ll/۠ᩴ֫;->ܿ:I

    if-eq v2, v3, :cond_3

    iget v5, v0, Ll/۠ᩴ֫;->ܿ:I

    if-ne v2, v5, :cond_3

    :cond_0
    iget-boolean v2, p0, Ll/۫ᩳۧ;->ۗ:Z

    if-nez v2, :cond_1

    iget-object v2, v4, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v5, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 3973
    invoke-static {v2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    iget-boolean v2, v1, Ll/᩺ᩳۧ;->֫֫:Z

    if-nez v2, :cond_2

    iget v2, v4, Ll/۠ᩴ֫;->ܽ֫:I

    if-eq v2, v3, :cond_3

    iget v0, v0, Ll/۠ᩴ֫;->ܽ֫:I

    if-ne v2, v0, :cond_3

    :cond_2
    iget-boolean v0, v1, Ll/᩺ᩳۧ;->ܰ:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/۫ᩳۧ;->ۡ֫:Z

    iget-boolean v1, p1, Ll/۫ᩳۧ;->ۡ֫:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Ll/۫ᩳۧ;->ۢ֫:Z

    iget-boolean p1, p1, Ll/۫ᩳۧ;->ۢ֫:Z

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
