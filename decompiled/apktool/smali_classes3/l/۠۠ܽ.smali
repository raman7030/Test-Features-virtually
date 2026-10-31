.class public final Ll/۠۠ܽ;
.super Ljava/lang/Object;
.source "X6RA"

# interfaces
.implements Ll/᩺ۘܽ;
.implements Ll/ۙ۠ܽ;


# instance fields
.field public ֡:Z

.field public ֨:[Ll/᩺ۤۡ;

.field public ֫:I

.field public ֫֫:I

.field public ۖ:I

.field public final ۗ:Ll/ᩴ۠ܽ;

.field public ۘ:I

.field public ۙ:I

.field public ۚ:[I

.field public ۛ:Z

.field public ۜ:I

.field public ۟:Z

.field public ۠:I

.field public ۡ:Z

.field public ۢ:[I

.field public ۤ:Z

.field public ۧ:I

.field public ۧ֫:Z

.field public ۨ:Ljava/lang/CharSequence;

.field public ۫:Z

.field public ۬:Ll/ۨۘܽ;

.field public ܰ:J

.field public final ܳ:Ll/ۚ۠ܽ;

.field public ܶ:I

.field public ܺ:Z

.field public ܽ:Z

.field public ܽ֫:I

.field public ܿ:Ll/֫֡ܽ;

.field public ᩳ:Ljava/lang/Runnable;

.field public ᩳ֫:Z

.field public ᩴ:Z

.field public ᩵:Z

.field public ᩶:Z

.field public ᩷:I

.field public ᩸:I

.field public ᩹:Ljava/util/Map;

.field public ᩺:Z

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۨۘܽ;Ll/֫֡ܽ;Ljava/lang/CharSequence;)V
    .locals 3

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ll/ۚ۠ܽ;

    invoke-direct {v0, p0}, Ll/ۚ۠ܽ;-><init>(Ll/۠۠ܽ;)V

    iput-object v0, p0, Ll/۠۠ܽ;->ܳ:Ll/ۚ۠ܽ;

    const/16 v0, 0x7d0

    .line 77
    iput v0, p0, Ll/۠۠ܽ;->֫֫:I

    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Ll/۠۠ܽ;->۟:Z

    const/16 v1, 0x400

    .line 84
    iput v1, p0, Ll/۠۠ܽ;->᩸:I

    const/4 v1, 0x0

    .line 97
    iput v1, p0, Ll/۠۠ܽ;->֫:I

    const/4 v2, -0x1

    .line 99
    iput v2, p0, Ll/۠۠ܽ;->᩻:I

    iput v1, p0, Ll/۠۠ܽ;->ۖ:I

    .line 101
    iput v2, p0, Ll/۠۠ܽ;->ۙ:I

    .line 155
    iput v1, p0, Ll/۠۠ܽ;->ۘ:I

    .line 165
    iput-boolean v1, p0, Ll/۠۠ܽ;->ᩳ֫:Z

    .line 167
    iput-boolean v0, p0, Ll/۠۠ܽ;->ܽ:Z

    .line 1004
    iput-boolean v1, p0, Ll/۠۠ܽ;->۫:Z

    .line 1006
    new-instance v0, Ll/ᩴ۠ܽ;

    invoke-direct {v0}, Ll/ᩴ۠ܽ;-><init>()V

    iput-object v0, p0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    .line 174
    iput-object p2, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    .line 175
    iput-object p1, p0, Ll/۠۠ܽ;->۬:Ll/ۨۘܽ;

    .line 176
    iput-object p3, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    .line 179
    iget p1, p2, Ll/֫֡ܽ;->֫:I

    const/16 p2, 0xa

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    .line 180
    new-array p1, p1, [I

    iput-object p1, p0, Ll/۠۠ܽ;->ۢ:[I

    .line 181
    iget-object p1, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    iget p2, p1, Ll/֫֡ܽ;->֫:I

    mul-int/lit8 p2, p2, 0x2

    iput p2, p0, Ll/۠۠ܽ;->᩷:I

    .line 182
    iget p2, p1, Ll/֫֡ܽ;->ᩳ:I

    new-array p2, p2, [I

    iput-object p2, p0, Ll/۠۠ܽ;->ۚ:[I

    .line 183
    iget p1, p1, Ll/֫֡ܽ;->ܿ:I

    new-array p1, p1, [Ll/᩺ۤۡ;

    iput-object p1, p0, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    .line 186
    invoke-virtual {p0}, Ll/۠۠ܽ;->᩹()V

    return-void
.end method

.method private ۛ()V
    .locals 4

    const/4 v0, 0x0

    .line 758
    iput-boolean v0, p0, Ll/۠۠ܽ;->֡:Z

    .line 759
    iget v1, p0, Ll/۠۠ܽ;->֫֫:I

    iput v1, p0, Ll/۠۠ܽ;->ۧ:I

    .line 760
    iget-boolean v2, p0, Ll/۠۠ܽ;->۟:Z

    if-eqz v2, :cond_0

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ll/۠۠ܽ;->ۡ:Z

    const/16 v3, 0x400

    .line 761
    iput v3, p0, Ll/۠۠ܽ;->᩸:I

    .line 762
    iput-boolean v0, p0, Ll/۠۠ܽ;->ۧ֫:Z

    .line 763
    iput-boolean v2, p0, Ll/۠۠ܽ;->᩺:Z

    if-eqz v1, :cond_1

    .line 764
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Regex matching timeout: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۠۠ܽ;->۬:Ll/ۨۘܽ;

    invoke-virtual {v1}, Ll/ۨۘܽ;->pattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private ۨ()V
    .locals 2

    .line 1001
    iget v0, p0, Ll/۠۠ܽ;->᩻:I

    if-ltz v0, :cond_0

    return-void

    .line 988
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No match found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܰ()V
    .locals 13

    const/4 v0, -0x1

    .line 353
    iput v0, p0, Ll/۠۠ܽ;->᩻:I

    const/4 v1, 0x0

    .line 354
    iput v1, p0, Ll/۠۠ܽ;->ۖ:I

    .line 355
    iput v0, p0, Ll/۠۠ܽ;->ۙ:I

    .line 356
    iget-object v2, p0, Ll/۠۠ܽ;->ۢ:[I

    array-length v3, v2

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    packed-switch v3, :pswitch_data_0

    const/4 v11, 0x0

    goto :goto_0

    .line 1072
    :pswitch_0
    aput v0, v2, v1

    .line 1073
    aput v0, v2, v10

    .line 1074
    aput v0, v2, v9

    .line 1075
    aput v0, v2, v8

    .line 1076
    aput v0, v2, v7

    .line 1077
    aput v0, v2, v6

    .line 1078
    aput v0, v2, v5

    .line 1079
    aput v0, v2, v4

    goto/16 :goto_2

    .line 1063
    :pswitch_1
    aput v0, v2, v1

    .line 1064
    aput v0, v2, v10

    .line 1065
    aput v0, v2, v9

    .line 1066
    aput v0, v2, v8

    .line 1067
    aput v0, v2, v7

    .line 1068
    aput v0, v2, v6

    .line 1069
    aput v0, v2, v5

    goto :goto_2

    .line 1055
    :pswitch_2
    aput v0, v2, v1

    .line 1056
    aput v0, v2, v10

    .line 1057
    aput v0, v2, v9

    .line 1058
    aput v0, v2, v8

    .line 1059
    aput v0, v2, v7

    .line 1060
    aput v0, v2, v6

    goto :goto_2

    .line 1048
    :pswitch_3
    aput v0, v2, v1

    .line 1049
    aput v0, v2, v10

    .line 1050
    aput v0, v2, v9

    .line 1051
    aput v0, v2, v8

    .line 1052
    aput v0, v2, v7

    goto :goto_2

    .line 1042
    :pswitch_4
    aput v0, v2, v1

    .line 1043
    aput v0, v2, v10

    .line 1044
    aput v0, v2, v9

    .line 1045
    aput v0, v2, v8

    goto :goto_2

    .line 1037
    :pswitch_5
    aput v0, v2, v1

    .line 1038
    aput v0, v2, v10

    .line 1039
    aput v0, v2, v9

    goto :goto_2

    .line 1033
    :pswitch_6
    aput v0, v2, v1

    .line 1034
    aput v0, v2, v10

    goto :goto_2

    .line 1030
    :pswitch_7
    aput v0, v2, v1

    goto :goto_2

    :goto_0
    add-int/lit8 v12, v3, -0x7

    if-ge v11, v12, :cond_0

    .line 1084
    aput v0, v2, v11

    add-int/lit8 v12, v11, 0x1

    .line 1085
    aput v0, v2, v12

    add-int/lit8 v12, v11, 0x2

    .line 1086
    aput v0, v2, v12

    add-int/lit8 v12, v11, 0x3

    .line 1087
    aput v0, v2, v12

    add-int/lit8 v12, v11, 0x4

    .line 1088
    aput v0, v2, v12

    add-int/lit8 v12, v11, 0x5

    .line 1089
    aput v0, v2, v12

    add-int/lit8 v12, v11, 0x6

    .line 1090
    aput v0, v2, v12

    add-int/lit8 v12, v11, 0x7

    .line 1091
    aput v0, v2, v12

    add-int/lit8 v11, v11, 0x8

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v11, v3, :cond_1

    .line 1095
    aput v0, v2, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 357
    :cond_1
    :goto_2
    :pswitch_8
    iget-object v2, p0, Ll/۠۠ܽ;->ۚ:[I

    array-length v3, v2

    packed-switch v3, :pswitch_data_1

    const/4 v4, 0x0

    goto :goto_3

    .line 1072
    :pswitch_9
    aput v0, v2, v1

    .line 1073
    aput v0, v2, v10

    .line 1074
    aput v0, v2, v9

    .line 1075
    aput v0, v2, v8

    .line 1076
    aput v0, v2, v7

    .line 1077
    aput v0, v2, v6

    .line 1078
    aput v0, v2, v5

    .line 1079
    aput v0, v2, v4

    goto/16 :goto_5

    .line 1063
    :pswitch_a
    aput v0, v2, v1

    .line 1064
    aput v0, v2, v10

    .line 1065
    aput v0, v2, v9

    .line 1066
    aput v0, v2, v8

    .line 1067
    aput v0, v2, v7

    .line 1068
    aput v0, v2, v6

    .line 1069
    aput v0, v2, v5

    goto :goto_5

    .line 1055
    :pswitch_b
    aput v0, v2, v1

    .line 1056
    aput v0, v2, v10

    .line 1057
    aput v0, v2, v9

    .line 1058
    aput v0, v2, v8

    .line 1059
    aput v0, v2, v7

    .line 1060
    aput v0, v2, v6

    goto :goto_5

    .line 1048
    :pswitch_c
    aput v0, v2, v1

    .line 1049
    aput v0, v2, v10

    .line 1050
    aput v0, v2, v9

    .line 1051
    aput v0, v2, v8

    .line 1052
    aput v0, v2, v7

    goto :goto_5

    .line 1042
    :pswitch_d
    aput v0, v2, v1

    .line 1043
    aput v0, v2, v10

    .line 1044
    aput v0, v2, v9

    .line 1045
    aput v0, v2, v8

    goto :goto_5

    .line 1037
    :pswitch_e
    aput v0, v2, v1

    .line 1038
    aput v0, v2, v10

    .line 1039
    aput v0, v2, v9

    goto :goto_5

    .line 1033
    :pswitch_f
    aput v0, v2, v1

    .line 1034
    aput v0, v2, v10

    goto :goto_5

    .line 1030
    :pswitch_10
    aput v0, v2, v1

    goto :goto_5

    :goto_3
    add-int/lit8 v5, v3, -0x7

    if-ge v4, v5, :cond_2

    .line 1084
    aput v0, v2, v4

    add-int/lit8 v5, v4, 0x1

    .line 1085
    aput v0, v2, v5

    add-int/lit8 v5, v4, 0x2

    .line 1086
    aput v0, v2, v5

    add-int/lit8 v5, v4, 0x3

    .line 1087
    aput v0, v2, v5

    add-int/lit8 v5, v4, 0x4

    .line 1088
    aput v0, v2, v5

    add-int/lit8 v5, v4, 0x5

    .line 1089
    aput v0, v2, v5

    add-int/lit8 v5, v4, 0x6

    .line 1090
    aput v0, v2, v5

    add-int/lit8 v5, v4, 0x7

    .line 1091
    aput v0, v2, v5

    add-int/lit8 v4, v4, 0x8

    goto :goto_3

    :cond_2
    :goto_4
    if-ge v4, v3, :cond_3

    .line 1095
    aput v0, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 358
    :cond_3
    :goto_5
    :pswitch_11
    iget-object v0, p0, Ll/۠۠ܽ;->ܳ:Ll/ۚ۠ܽ;

    invoke-virtual {v0}, Ll/ۚ۠ܽ;->֫()V

    .line 359
    iget-object v0, p0, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v2, :cond_4

    aget-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 363
    :cond_4
    iget-object v0, p0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    .line 35
    iget-object v0, v0, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 364
    iput v1, p0, Ll/۠۠ܽ;->ۘ:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method private ᩺()V
    .locals 1

    .line 801
    iget-boolean v0, p0, Ll/۠۠ܽ;->ۧ֫:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/۠۠ܽ;->ۧ()Z

    move-result v0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Ll/۠۠ܽ;->ۡ:Z

    :goto_0
    iput-boolean v0, p0, Ll/۠۠ܽ;->֡:Z

    const/4 v0, 0x0

    .line 802
    iput-boolean v0, p0, Ll/۠۠ܽ;->᩺:Z

    .line 803
    iput-boolean v0, p0, Ll/۠۠ܽ;->ۧ֫:Z

    return-void
.end method

.method private ᩻(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 982
    invoke-virtual {p0}, Ll/۠۠ܽ;->groupCount()I

    move-result v0

    if-gt p1, v0, :cond_0

    return-void

    .line 983
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "No group "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 983
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final end(I)I
    .locals 1

    .line 397
    invoke-direct {p0}, Ll/۠۠ܽ;->ۨ()V

    .line 398
    invoke-direct {p0, p1}, Ll/۠۠ܽ;->᩻(I)V

    .line 399
    iget-object v0, p0, Ll/۠۠ܽ;->ۢ:[I

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 342
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final group(I)Ljava/lang/String;
    .locals 3

    .line 413
    invoke-direct {p0}, Ll/۠۠ܽ;->ۨ()V

    .line 414
    invoke-direct {p0, p1}, Ll/۠۠ܽ;->᩻(I)V

    .line 415
    iget-object v0, p0, Ll/۠۠ܽ;->ۢ:[I

    mul-int/lit8 p1, p1, 0x2

    aget v1, v0, p1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    if-ne p1, v2, :cond_0

    goto :goto_0

    .line 965
    :cond_0
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 417
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final groupCount()I
    .locals 1

    .line 429
    iget-object v0, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    iget v0, v0, Ll/֫֡ܽ;->֫:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final pattern()Ll/ۨۘܽ;
    .locals 1

    .line 190
    iget-object v0, p0, Ll/۠۠ܽ;->۬:Ll/ۨۘܽ;

    return-object v0
.end method

.method public final start(I)I
    .locals 1

    .line 380
    invoke-direct {p0}, Ll/۠۠ܽ;->ۨ()V

    .line 381
    invoke-direct {p0, p1}, Ll/۠۠ܽ;->᩻(I)V

    .line 382
    iget-object v0, p0, Ll/۠۠ܽ;->ۢ:[I

    mul-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 670
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RegexMatcher[pattern="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    iget-object v1, p0, Ll/۠۠ܽ;->۬:Ll/ۨۘܽ;

    .line 672
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " region="

    .line 673
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    iget v1, p0, Ll/۠۠ܽ;->ۜ:I

    .line 674
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 647
    iget v1, p0, Ll/۠۠ܽ;->ܽ֫:I

    .line 674
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " lastmatch="

    .line 675
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    iget v1, p0, Ll/۠۠ܽ;->᩻:I

    if-ltz v1, :cond_0

    const/4 v1, 0x0

    .line 408
    invoke-virtual {p0, v1}, Ll/۠۠ܽ;->group(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ll/۠۠ܽ;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 677
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v1, 0x5d

    .line 679
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 680
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 2

    .line 443
    iget v0, p0, Ll/۠۠ܽ;->ۜ:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ll/۠۠ܽ;->֫(II)Z

    move-result v0

    return v0
.end method

.method public final ֨()I
    .locals 1

    .line 138
    iget-boolean v0, p0, Ll/۠۠ܽ;->᩶:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/۠۠ܽ;->ܶ:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۠۠ܽ;->ܶ:I

    .line 139
    :cond_0
    iget v0, p0, Ll/۠۠ܽ;->ۙ:I

    return v0
.end method

.method public final ֫(Ljava/lang/String;)I
    .locals 3

    .line 974
    invoke-direct {p0}, Ll/۠۠ܽ;->ۨ()V

    .line 993
    iget-object v0, p0, Ll/۠۠ܽ;->᩹:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 994
    iget-object v0, p0, Ll/۠۠ܽ;->۬:Ll/ۨۘܽ;

    invoke-virtual {v0}, Ll/ۨۘܽ;->ᩳ()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/۠۠ܽ;->᩹:Ljava/util/Map;

    .line 975
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 978
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 977
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No group with name <"

    const-string v2, ">"

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 977
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    .line 532
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    iget v1, p0, Ll/۠۠ܽ;->ۘ:I

    .line 961
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 532
    invoke-virtual {p1, v0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 714
    iget-object v0, p0, Ll/۠۠ܽ;->ᩳ:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 2

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v1, v0

    long-to-int p2, p1

    const/4 p1, -0x1

    if-lt v1, p1, :cond_0

    .line 130
    iget-object p1, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-gt v1, p1, :cond_0

    if-ltz p2, :cond_0

    iget-object p1, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-gt p2, p1, :cond_0

    .line 133
    iput v1, p0, Ll/۠۠ܽ;->ۙ:I

    .line 134
    iput p2, p0, Ll/۠۠ܽ;->ۖ:I

    return-void

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid regex match history"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 0

    .line 369
    iput-object p1, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    .line 370
    invoke-virtual {p0}, Ll/۠۠ܽ;->᩹()V

    return-void
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 0

    .line 703
    iput-object p1, p0, Ll/۠۠ܽ;->ᩳ:Ljava/lang/Runnable;

    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 4

    .line 515
    invoke-direct {p0}, Ll/۠۠ܽ;->ۨ()V

    .line 516
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    .line 519
    :try_start_0
    iget-object v1, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    iget v2, p0, Ll/۠۠ܽ;->ۘ:I

    iget v3, p0, Ll/۠۠ܽ;->᩻:I

    invoke-virtual {p1, v1, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 521
    invoke-static {p0, p1, p2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    :try_end_0
    .catch Ll/۬ۘܽ; {:try_start_0 .. :try_end_0} :catch_0

    .line 526
    iget p1, p0, Ll/۠۠ܽ;->ۖ:I

    iput p1, p0, Ll/۠۠ܽ;->ۘ:I

    return-void

    :catch_0
    move-exception p2

    .line 523
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 524
    throw p2
.end method

.method public final ֫(Ll/ۨۘܽ;Ll/֫֡ܽ;)V
    .locals 11

    .line 322
    iput-object p2, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    .line 323
    iput-object p1, p0, Ll/۠۠ܽ;->۬:Ll/ۨۘܽ;

    const/4 p1, 0x0

    .line 324
    iput-object p1, p0, Ll/۠۠ܽ;->᩹:Ljava/util/Map;

    .line 327
    iget p1, p2, Ll/֫֡ܽ;->֫:I

    const/16 p2, 0xa

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/4 p2, 0x2

    mul-int/lit8 p1, p1, 0x2

    .line 328
    new-array v0, p1, [I

    iput-object v0, p0, Ll/۠۠ܽ;->ۢ:[I

    .line 329
    iput p1, p0, Ll/۠۠ܽ;->᩷:I

    .line 330
    iget-object v1, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    iget v1, v1, Ll/֫֡ܽ;->ᩳ:I

    new-array v1, v1, [I

    iput-object v1, p0, Ll/۠۠ܽ;->ۚ:[I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x6

    const/4 v7, 0x7

    const/4 v8, 0x1

    packed-switch p1, :pswitch_data_0

    const/4 v9, 0x0

    goto :goto_0

    .line 1072
    :pswitch_0
    aput v1, v0, v2

    .line 1073
    aput v1, v0, v8

    .line 1074
    aput v1, v0, p2

    .line 1075
    aput v1, v0, v3

    .line 1076
    aput v1, v0, v4

    .line 1077
    aput v1, v0, v5

    .line 1078
    aput v1, v0, v6

    .line 1079
    aput v1, v0, v7

    goto/16 :goto_2

    .line 1063
    :pswitch_1
    aput v1, v0, v2

    .line 1064
    aput v1, v0, v8

    .line 1065
    aput v1, v0, p2

    .line 1066
    aput v1, v0, v3

    .line 1067
    aput v1, v0, v4

    .line 1068
    aput v1, v0, v5

    .line 1069
    aput v1, v0, v6

    goto :goto_2

    .line 1055
    :pswitch_2
    aput v1, v0, v2

    .line 1056
    aput v1, v0, v8

    .line 1057
    aput v1, v0, p2

    .line 1058
    aput v1, v0, v3

    .line 1059
    aput v1, v0, v4

    .line 1060
    aput v1, v0, v5

    goto :goto_2

    .line 1048
    :pswitch_3
    aput v1, v0, v2

    .line 1049
    aput v1, v0, v8

    .line 1050
    aput v1, v0, p2

    .line 1051
    aput v1, v0, v3

    .line 1052
    aput v1, v0, v4

    goto :goto_2

    .line 1042
    :pswitch_4
    aput v1, v0, v2

    .line 1043
    aput v1, v0, v8

    .line 1044
    aput v1, v0, p2

    .line 1045
    aput v1, v0, v3

    goto :goto_2

    .line 1037
    :pswitch_5
    aput v1, v0, v2

    .line 1038
    aput v1, v0, v8

    .line 1039
    aput v1, v0, p2

    goto :goto_2

    .line 1033
    :pswitch_6
    aput v1, v0, v2

    .line 1034
    aput v1, v0, v8

    goto :goto_2

    .line 1030
    :pswitch_7
    aput v1, v0, v2

    goto :goto_2

    :goto_0
    add-int/lit8 v10, p1, -0x7

    if-ge v9, v10, :cond_0

    .line 1084
    aput v1, v0, v9

    add-int/lit8 v10, v9, 0x1

    .line 1085
    aput v1, v0, v10

    add-int/lit8 v10, v9, 0x2

    .line 1086
    aput v1, v0, v10

    add-int/lit8 v10, v9, 0x3

    .line 1087
    aput v1, v0, v10

    add-int/lit8 v10, v9, 0x4

    .line 1088
    aput v1, v0, v10

    add-int/lit8 v10, v9, 0x5

    .line 1089
    aput v1, v0, v10

    add-int/lit8 v10, v9, 0x6

    .line 1090
    aput v1, v0, v10

    add-int/lit8 v10, v9, 0x7

    .line 1091
    aput v1, v0, v10

    add-int/lit8 v9, v9, 0x8

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v9, p1, :cond_1

    .line 1095
    aput v1, v0, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 332
    :cond_1
    :goto_2
    :pswitch_8
    iget-object p1, p0, Ll/۠۠ܽ;->ۚ:[I

    array-length v0, p1

    packed-switch v0, :pswitch_data_1

    goto :goto_3

    .line 1072
    :pswitch_9
    aput v1, p1, v2

    .line 1073
    aput v1, p1, v8

    .line 1074
    aput v1, p1, p2

    .line 1075
    aput v1, p1, v3

    .line 1076
    aput v1, p1, v4

    .line 1077
    aput v1, p1, v5

    .line 1078
    aput v1, p1, v6

    .line 1079
    aput v1, p1, v7

    goto/16 :goto_5

    .line 1063
    :pswitch_a
    aput v1, p1, v2

    .line 1064
    aput v1, p1, v8

    .line 1065
    aput v1, p1, p2

    .line 1066
    aput v1, p1, v3

    .line 1067
    aput v1, p1, v4

    .line 1068
    aput v1, p1, v5

    .line 1069
    aput v1, p1, v6

    goto :goto_5

    .line 1055
    :pswitch_b
    aput v1, p1, v2

    .line 1056
    aput v1, p1, v8

    .line 1057
    aput v1, p1, p2

    .line 1058
    aput v1, p1, v3

    .line 1059
    aput v1, p1, v4

    .line 1060
    aput v1, p1, v5

    goto :goto_5

    .line 1048
    :pswitch_c
    aput v1, p1, v2

    .line 1049
    aput v1, p1, v8

    .line 1050
    aput v1, p1, p2

    .line 1051
    aput v1, p1, v3

    .line 1052
    aput v1, p1, v4

    goto :goto_5

    .line 1042
    :pswitch_d
    aput v1, p1, v2

    .line 1043
    aput v1, p1, v8

    .line 1044
    aput v1, p1, p2

    .line 1045
    aput v1, p1, v3

    goto :goto_5

    .line 1037
    :pswitch_e
    aput v1, p1, v2

    .line 1038
    aput v1, p1, v8

    .line 1039
    aput v1, p1, p2

    goto :goto_5

    .line 1033
    :pswitch_f
    aput v1, p1, v2

    .line 1034
    aput v1, p1, v8

    goto :goto_5

    .line 1030
    :pswitch_10
    aput v1, p1, v2

    goto :goto_5

    :goto_3
    add-int/lit8 p2, v0, -0x7

    if-ge v2, p2, :cond_2

    .line 1084
    aput v1, p1, v2

    add-int/lit8 p2, v2, 0x1

    .line 1085
    aput v1, p1, p2

    add-int/lit8 p2, v2, 0x2

    .line 1086
    aput v1, p1, p2

    add-int/lit8 p2, v2, 0x3

    .line 1087
    aput v1, p1, p2

    add-int/lit8 p2, v2, 0x4

    .line 1088
    aput v1, p1, p2

    add-int/lit8 p2, v2, 0x5

    .line 1089
    aput v1, p1, p2

    add-int/lit8 p2, v2, 0x6

    .line 1090
    aput v1, p1, p2

    add-int/lit8 p2, v2, 0x7

    .line 1091
    aput v1, p1, p2

    add-int/lit8 v2, v2, 0x8

    goto :goto_3

    :cond_2
    :goto_4
    if-ge v2, v0, :cond_3

    .line 1095
    aput v1, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 333
    :cond_3
    :goto_5
    :pswitch_11
    iget-object p1, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    iget p1, p1, Ll/֫֡ܽ;->ܿ:I

    new-array p1, p1, [Ll/᩺ۤۡ;

    iput-object p1, p0, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    .line 334
    iget-object p1, p0, Ll/۠۠ܽ;->ܳ:Ll/ۚ۠ܽ;

    invoke-virtual {p1}, Ll/ۚ۠ܽ;->֫()V

    .line 335
    iget-object p1, p0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    .line 35
    iget-object p1, p1, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public final ֫(Z)V
    .locals 0

    .line 1009
    iput-boolean p1, p0, Ll/۠۠ܽ;->۫:Z

    return-void
.end method

.method public final ֫(I)Z
    .locals 6

    const/4 v0, 0x0

    .line 926
    iput v0, p0, Ll/۠۠ܽ;->ܶ:I

    .line 927
    iput-boolean v0, p0, Ll/۠۠ܽ;->᩵:Z

    .line 928
    iput-boolean v0, p0, Ll/۠۠ܽ;->ᩴ:Z

    .line 929
    iput-boolean v0, p0, Ll/۠۠ܽ;->ܺ:Z

    .line 930
    iput-boolean v0, p0, Ll/۠۠ܽ;->ۤ:Z

    .line 931
    iput p1, p0, Ll/۠۠ܽ;->᩻:I

    .line 932
    iput p1, p0, Ll/۠۠ܽ;->ۙ:I

    .line 933
    iget-object v1, p0, Ll/۠۠ܽ;->ܳ:Ll/ۚ۠ܽ;

    invoke-virtual {v1}, Ll/ۚ۠ܽ;->֫()V

    .line 934
    iget-object v2, p0, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 938
    :cond_0
    iput v0, p0, Ll/۠۠ܽ;->֫:I

    .line 939
    invoke-direct {p0}, Ll/۠۠ܽ;->ۛ()V

    .line 942
    :try_start_0
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    .line 944
    :try_start_1
    iget-boolean v3, p0, Ll/۠۠ܽ;->ۡ:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-virtual {v1, p1, v3}, Ll/ۚ۠ܽ;->֫(ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_1
    .catch Ll/֡۠ܽ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    .line 946
    :catch_0
    :try_start_2
    iput-boolean v2, p0, Ll/۠۠ܽ;->᩵:Z

    :cond_1
    const/4 p1, 0x0

    .line 950
    :goto_1
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 955
    invoke-direct {p0}, Ll/۠۠ܽ;->᩺()V

    if-eqz p1, :cond_2

    .line 957
    iget-boolean p1, p0, Ll/۠۠ܽ;->֡:Z

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    const/4 v0, -0x1

    .line 952
    :try_start_3
    iput v0, p0, Ll/۠۠ܽ;->᩻:I

    .line 953
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 955
    :goto_2
    invoke-direct {p0}, Ll/۠۠ܽ;->᩺()V

    .line 956
    throw p1
.end method

.method public final ֫(II)Z
    .locals 10

    const/4 v0, 0x0

    .line 864
    iput v0, p0, Ll/۠۠ܽ;->ܶ:I

    .line 866
    iput-boolean v0, p0, Ll/۠۠ܽ;->᩵:Z

    .line 867
    iput-boolean v0, p0, Ll/۠۠ܽ;->ᩴ:Z

    .line 872
    iput-boolean v0, p0, Ll/۠۠ܽ;->ܺ:Z

    .line 873
    iput-boolean v0, p0, Ll/۠۠ܽ;->ۤ:Z

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 875
    :cond_0
    iput p1, p0, Ll/۠۠ܽ;->᩻:I

    .line 876
    iget v1, p0, Ll/۠۠ܽ;->ۙ:I

    if-gez v1, :cond_1

    move v1, p1

    :cond_1
    iput v1, p0, Ll/۠۠ܽ;->ۙ:I

    .line 878
    iget-object v1, p0, Ll/۠۠ܽ;->ۢ:[I

    iget v2, p0, Ll/۠۠ܽ;->᩷:I

    const/4 v3, 0x2

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x3

    packed-switch v2, :pswitch_data_0

    const/4 v3, 0x0

    goto :goto_0

    .line 1072
    :pswitch_0
    aput v4, v1, v0

    .line 1073
    aput v4, v1, v5

    .line 1074
    aput v4, v1, v3

    .line 1075
    aput v4, v1, v9

    .line 1076
    aput v4, v1, v8

    .line 1077
    aput v4, v1, v7

    .line 1078
    aput v4, v1, v6

    const/4 v2, 0x7

    .line 1079
    aput v4, v1, v2

    goto/16 :goto_2

    .line 1063
    :pswitch_1
    aput v4, v1, v0

    .line 1064
    aput v4, v1, v5

    .line 1065
    aput v4, v1, v3

    .line 1066
    aput v4, v1, v9

    .line 1067
    aput v4, v1, v8

    .line 1068
    aput v4, v1, v7

    .line 1069
    aput v4, v1, v6

    goto :goto_2

    .line 1055
    :pswitch_2
    aput v4, v1, v0

    .line 1056
    aput v4, v1, v5

    .line 1057
    aput v4, v1, v3

    .line 1058
    aput v4, v1, v9

    .line 1059
    aput v4, v1, v8

    .line 1060
    aput v4, v1, v7

    goto :goto_2

    .line 1048
    :pswitch_3
    aput v4, v1, v0

    .line 1049
    aput v4, v1, v5

    .line 1050
    aput v4, v1, v3

    .line 1051
    aput v4, v1, v9

    .line 1052
    aput v4, v1, v8

    goto :goto_2

    .line 1042
    :pswitch_4
    aput v4, v1, v0

    .line 1043
    aput v4, v1, v5

    .line 1044
    aput v4, v1, v3

    .line 1045
    aput v4, v1, v9

    goto :goto_2

    .line 1037
    :pswitch_5
    aput v4, v1, v0

    .line 1038
    aput v4, v1, v5

    .line 1039
    aput v4, v1, v3

    goto :goto_2

    .line 1033
    :pswitch_6
    aput v4, v1, v0

    .line 1034
    aput v4, v1, v5

    goto :goto_2

    .line 1030
    :pswitch_7
    aput v4, v1, v0

    goto :goto_2

    :goto_0
    add-int/lit8 v6, v2, -0x7

    if-ge v3, v6, :cond_2

    .line 1084
    aput v4, v1, v3

    add-int/lit8 v6, v3, 0x1

    .line 1085
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x2

    .line 1086
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x3

    .line 1087
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x4

    .line 1088
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x5

    .line 1089
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x6

    .line 1090
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x7

    .line 1091
    aput v4, v1, v6

    add-int/lit8 v3, v3, 0x8

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v3, v2, :cond_3

    .line 1095
    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 879
    :cond_3
    :goto_2
    :pswitch_8
    iget-object v1, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    iget v1, v1, Ll/֫֡ܽ;->֫:I

    mul-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/۠۠ܽ;->᩷:I

    .line 880
    iget-object v1, p0, Ll/۠۠ܽ;->ܳ:Ll/ۚ۠ܽ;

    invoke-virtual {v1}, Ll/ۚ۠ܽ;->֫()V

    .line 881
    iget-object v2, p0, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    array-length v3, v2

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v3, :cond_4

    aget-object v7, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 35
    :cond_4
    iget-object v2, p0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    iget-object v3, v2, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 886
    iput p2, p0, Ll/۠۠ܽ;->֫:I

    .line 887
    invoke-direct {p0}, Ll/۠۠ܽ;->ۛ()V

    .line 890
    :try_start_0
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 892
    :try_start_1
    iget-boolean p2, p0, Ll/۠۠ܽ;->ۡ:Z

    if-nez p2, :cond_5

    iget-object p2, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-virtual {v1, p1, p2}, Ll/ۚ۠ܽ;->֫(ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_1
    .catch Ll/֡۠ܽ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    .line 894
    :catch_0
    :try_start_2
    iput-boolean v5, p0, Ll/۠۠ܽ;->᩵:Z

    .line 898
    :cond_5
    :goto_4
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 904
    invoke-direct {p0}, Ll/۠۠ܽ;->᩺()V

    .line 906
    iget-boolean p1, p0, Ll/۠۠ܽ;->֡:Z

    xor-int/2addr p1, v5

    and-int/2addr p1, v0

    if-nez p1, :cond_6

    .line 908
    iput v4, p0, Ll/۠۠ܽ;->᩻:I

    .line 909
    :cond_6
    iget p2, p0, Ll/۠۠ܽ;->ۖ:I

    iput p2, p0, Ll/۠۠ܽ;->ۙ:I

    if-eqz p1, :cond_7

    .line 914
    iget-boolean p2, p0, Ll/۠۠ܽ;->۫:Z

    if-eqz p2, :cond_7

    .line 39
    iget-object p2, v2, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :cond_7
    return p1

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 900
    :try_start_3
    iput v4, p0, Ll/۠۠ܽ;->᩻:I

    .line 901
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 904
    :goto_5
    invoke-direct {p0}, Ll/۠۠ܽ;->᩺()V

    .line 905
    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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

.method public final ֫(Ljava/lang/Thread;)Z
    .locals 0

    .line 749
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V

    .line 750
    invoke-virtual {p1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 751
    iput-boolean p1, p0, Ll/۠۠ܽ;->ᩴ:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۖ()Z
    .locals 1

    .line 725
    iget-boolean v0, p0, Ll/۠۠ܽ;->֡:Z

    return v0
.end method

.method public final ۗ()V
    .locals 1

    const/4 v0, 0x0

    .line 698
    iput-boolean v0, p0, Ll/۠۠ܽ;->۟:Z

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 651
    iget-boolean v0, p0, Ll/۠۠ܽ;->ᩳ֫:Z

    return v0
.end method

.method public final ۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 744
    iput-boolean v0, p0, Ll/۠۠ܽ;->ۛ:Z

    return-void
.end method

.method public final ۚ()I
    .locals 2

    .line 144
    iget-boolean v0, p0, Ll/۠۠ܽ;->᩶:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/۠۠ܽ;->ܶ:I

    and-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_0

    or-int/lit8 v0, v0, 0x2

    .line 145
    iput v0, p0, Ll/۠۠ܽ;->ܶ:I

    .line 147
    :cond_0
    iget v0, p0, Ll/۠۠ܽ;->ۖ:I

    return v0
.end method

.method public final ۜ()Ljava/util/ArrayList;
    .locals 1

    .line 1020
    iget-object v0, p0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    iget-object v0, v0, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۠()I
    .locals 1

    .line 647
    iget v0, p0, Ll/۠۠ܽ;->ܽ֫:I

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 735
    iget-boolean v0, p0, Ll/۠۠ܽ;->ᩴ:Z

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 660
    iget-boolean v0, p0, Ll/۠۠ܽ;->ܽ:Z

    return v0
.end method

.method public final ۤ()Z
    .locals 4

    .line 769
    iget v0, p0, Ll/۠۠ܽ;->᩸:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/۠۠ܽ;->᩸:I

    const/4 v2, 0x0

    if-gtz v0, :cond_3

    .line 774
    invoke-virtual {p0}, Ll/۠۠ܽ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۠۠ܽ;->֫(Ljava/lang/Thread;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    const/16 v3, 0x400

    .line 775
    :goto_2
    iput v3, p0, Ll/۠۠ܽ;->᩸:I

    if-eqz v0, :cond_3

    return v1

    :cond_3
    return v2
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 421
    invoke-virtual {p0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/String;)I

    move-result p1

    .line 422
    iget-object v0, p0, Ll/۠۠ܽ;->ۢ:[I

    mul-int/lit8 p1, p1, 0x2

    aget v1, v0, p1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    if-ne p1, v2, :cond_0

    goto :goto_0

    .line 965
    :cond_0
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 424
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(II)V
    .locals 1

    if-ltz p1, :cond_2

    .line 961
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p1, v0, :cond_2

    if-ltz p2, :cond_1

    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_1

    if-gt p1, p2, :cond_0

    .line 636
    invoke-direct {p0}, Ll/۠۠ܽ;->ܰ()V

    .line 637
    iput p1, p0, Ll/۠۠ܽ;->ۜ:I

    .line 638
    iput p2, p0, Ll/۠۠ܽ;->ܽ֫:I

    return-void

    .line 635
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "start > end"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 633
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "end"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 631
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "start"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 664
    iput-boolean p1, p0, Ll/۠۠ܽ;->ܽ:Z

    return-void
.end method

.method public final ۧ()Z
    .locals 6

    .line 781
    iget-boolean v0, p0, Ll/۠۠ܽ;->ۡ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/۠۠ܽ;->᩺:Z

    if-eqz v0, :cond_1

    .line 782
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 783
    iget-boolean v2, p0, Ll/۠۠ܽ;->ۧ֫:Z

    const/4 v3, 0x1

    if-nez v2, :cond_0

    .line 784
    iget v2, p0, Ll/۠۠ܽ;->ۧ:I

    int-to-long v4, v2

    add-long/2addr v0, v4

    iput-wide v0, p0, Ll/۠۠ܽ;->ܰ:J

    .line 785
    iput-boolean v3, p0, Ll/۠۠ܽ;->ۧ֫:Z

    goto :goto_0

    .line 786
    :cond_0
    iget-wide v4, p0, Ll/۠۠ܽ;->ܰ:J

    cmp-long v2, v0, v4

    if-ltz v2, :cond_1

    .line 787
    iput-boolean v3, p0, Ll/۠۠ܽ;->ۡ:Z

    .line 788
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Regex matching timeout: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۠۠ܽ;->۬:Ll/ۨۘܽ;

    invoke-virtual {v1}, Ll/ۨۘܽ;->pattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V

    .line 791
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/۠۠ܽ;->ۡ:Z

    return v0
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 961
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    .line 486
    invoke-direct {p0}, Ll/۠۠ܽ;->ܰ()V

    .line 487
    invoke-virtual {p0, p1}, Ll/۠۠ܽ;->ᩳ(I)Z

    move-result p1

    return p1

    .line 485
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Illegal start index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۫()V
    .locals 1

    .line 796
    iget-boolean v0, p0, Ll/۠۠ܽ;->ۧ֫:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/۠۠ܽ;->ۧ()Z

    :cond_0
    return-void
.end method

.method public final ۬()I
    .locals 1

    .line 374
    invoke-direct {p0}, Ll/۠۠ܽ;->ۨ()V

    .line 375
    iget v0, p0, Ll/۠۠ܽ;->᩻:I

    return v0
.end method

.method public final ܳ()J
    .locals 6

    .line 123
    iget v0, p0, Ll/۠۠ܽ;->ۙ:I

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    iget v2, p0, Ll/۠۠ܽ;->ۖ:I

    int-to-long v2, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܳ(I)V
    .locals 1

    .line 151
    iget-boolean v0, p0, Ll/۠۠ܽ;->᩶:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/۠۠ܽ;->ܶ:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/۠۠ܽ;->ܶ:I

    .line 152
    :cond_0
    iput p1, p0, Ll/۠۠ܽ;->ۖ:I

    return-void
.end method

.method public final ܶ()I
    .locals 1

    .line 643
    iget v0, p0, Ll/۠۠ܽ;->ۜ:I

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 730
    iget-boolean v0, p0, Ll/۠۠ܽ;->᩵:Z

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 391
    invoke-direct {p0}, Ll/۠۠ܽ;->ۨ()V

    .line 392
    iget v0, p0, Ll/۠۠ܽ;->ۖ:I

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 537
    invoke-direct {p0}, Ll/۠۠ܽ;->ܰ()V

    .line 538
    invoke-virtual {p0}, Ll/۠۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 542
    :cond_0
    invoke-virtual {p0, v0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 543
    invoke-virtual {p0}, Ll/۠۠ܽ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 545
    invoke-virtual {p0, v0}, Ll/۠۠ܽ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 546
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 548
    :cond_1
    iget-object p1, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Z)V
    .locals 0

    .line 655
    iput-boolean p1, p0, Ll/۠۠ܽ;->ᩳ֫:Z

    return-void
.end method

.method public final ܽ(I)Z
    .locals 1

    if-ltz p1, :cond_0

    .line 961
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    .line 497
    invoke-virtual {p0, p1, v0}, Ll/۠۠ܽ;->֫(II)Z

    move-result p1

    return p1

    .line 496
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ܿ(Ljava/lang/String;)I
    .locals 1

    .line 386
    iget-object v0, p0, Ll/۠۠ܽ;->ۢ:[I

    invoke-virtual {p0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/String;)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final ܿ()Ljava/lang/Runnable;
    .locals 1

    .line 709
    iget-object v0, p0, Ll/۠۠ܽ;->ᩳ:Ljava/lang/Runnable;

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 692
    iput p1, p0, Ll/۠۠ܽ;->֫֫:I

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_1

    .line 620
    invoke-direct {p0}, Ll/۠۠ܽ;->ܰ()V

    .line 621
    invoke-virtual {p0}, Ll/۠۠ܽ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 622
    iget-object p1, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 623
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 624
    invoke-virtual {p0, v0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 625
    invoke-virtual {p0, v0}, Ll/۠۠ܽ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 626
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 619
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "replacement"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()Z
    .locals 10

    .line 463
    iget v0, p0, Ll/۠۠ܽ;->ۖ:I

    .line 464
    iget v1, p0, Ll/۠۠ܽ;->᩻:I

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 468
    :cond_0
    iget v1, p0, Ll/۠۠ܽ;->ۜ:I

    if-ge v0, v1, :cond_1

    move v0, v1

    .line 472
    :cond_1
    iget v1, p0, Ll/۠۠ܽ;->ܽ֫:I

    if-le v0, v1, :cond_4

    .line 473
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V

    const/4 v0, 0x0

    .line 474
    iput-boolean v0, p0, Ll/۠۠ܽ;->֡:Z

    .line 475
    iget-object v1, p0, Ll/۠۠ܽ;->ۢ:[I

    array-length v2, v1

    const/4 v3, 0x1

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, -0x1

    packed-switch v2, :pswitch_data_0

    const/4 v3, 0x0

    goto :goto_0

    .line 1072
    :pswitch_0
    aput v9, v1, v0

    .line 1073
    aput v9, v1, v3

    .line 1074
    aput v9, v1, v8

    .line 1075
    aput v9, v1, v7

    .line 1076
    aput v9, v1, v6

    .line 1077
    aput v9, v1, v5

    .line 1078
    aput v9, v1, v4

    const/4 v2, 0x7

    .line 1079
    aput v9, v1, v2

    goto/16 :goto_2

    .line 1063
    :pswitch_1
    aput v9, v1, v0

    .line 1064
    aput v9, v1, v3

    .line 1065
    aput v9, v1, v8

    .line 1066
    aput v9, v1, v7

    .line 1067
    aput v9, v1, v6

    .line 1068
    aput v9, v1, v5

    .line 1069
    aput v9, v1, v4

    goto :goto_2

    .line 1055
    :pswitch_2
    aput v9, v1, v0

    .line 1056
    aput v9, v1, v3

    .line 1057
    aput v9, v1, v8

    .line 1058
    aput v9, v1, v7

    .line 1059
    aput v9, v1, v6

    .line 1060
    aput v9, v1, v5

    goto :goto_2

    .line 1048
    :pswitch_3
    aput v9, v1, v0

    .line 1049
    aput v9, v1, v3

    .line 1050
    aput v9, v1, v8

    .line 1051
    aput v9, v1, v7

    .line 1052
    aput v9, v1, v6

    goto :goto_2

    .line 1042
    :pswitch_4
    aput v9, v1, v0

    .line 1043
    aput v9, v1, v3

    .line 1044
    aput v9, v1, v8

    .line 1045
    aput v9, v1, v7

    goto :goto_2

    .line 1037
    :pswitch_5
    aput v9, v1, v0

    .line 1038
    aput v9, v1, v3

    .line 1039
    aput v9, v1, v8

    goto :goto_2

    .line 1033
    :pswitch_6
    aput v9, v1, v0

    .line 1034
    aput v9, v1, v3

    goto :goto_2

    .line 1030
    :pswitch_7
    aput v9, v1, v0

    goto :goto_2

    :goto_0
    add-int/lit8 v4, v2, -0x7

    if-ge v3, v4, :cond_2

    .line 1084
    aput v9, v1, v3

    add-int/lit8 v4, v3, 0x1

    .line 1085
    aput v9, v1, v4

    add-int/lit8 v4, v3, 0x2

    .line 1086
    aput v9, v1, v4

    add-int/lit8 v4, v3, 0x3

    .line 1087
    aput v9, v1, v4

    add-int/lit8 v4, v3, 0x4

    .line 1088
    aput v9, v1, v4

    add-int/lit8 v4, v3, 0x5

    .line 1089
    aput v9, v1, v4

    add-int/lit8 v4, v3, 0x6

    .line 1090
    aput v9, v1, v4

    add-int/lit8 v4, v3, 0x7

    .line 1091
    aput v9, v1, v4

    add-int/lit8 v3, v3, 0x8

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v3, v2, :cond_3

    .line 1095
    aput v9, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 476
    :cond_3
    :goto_2
    :pswitch_8
    iget-object v1, p0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    .line 35
    iget-object v1, v1, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return v0

    .line 479
    :cond_4
    invoke-virtual {p0, v0}, Ll/۠۠ܽ;->ᩳ(I)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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

.method public final ᩳ(I)Z
    .locals 10

    const/4 v0, 0x0

    .line 807
    iput v0, p0, Ll/۠۠ܽ;->ܶ:I

    .line 809
    iput-boolean v0, p0, Ll/۠۠ܽ;->᩵:Z

    .line 810
    iput-boolean v0, p0, Ll/۠۠ܽ;->ᩴ:Z

    .line 815
    iput-boolean v0, p0, Ll/۠۠ܽ;->ܺ:Z

    .line 816
    iput-boolean v0, p0, Ll/۠۠ܽ;->ۤ:Z

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 818
    :cond_0
    iput p1, p0, Ll/۠۠ܽ;->᩻:I

    .line 819
    iget v1, p0, Ll/۠۠ܽ;->ۙ:I

    if-gez v1, :cond_1

    move v1, p1

    :cond_1
    iput v1, p0, Ll/۠۠ܽ;->ۙ:I

    .line 821
    iget-object v1, p0, Ll/۠۠ܽ;->ۢ:[I

    iget v2, p0, Ll/۠۠ܽ;->᩷:I

    const/4 v3, 0x2

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x3

    packed-switch v2, :pswitch_data_0

    const/4 v3, 0x0

    goto :goto_0

    .line 1072
    :pswitch_0
    aput v4, v1, v0

    .line 1073
    aput v4, v1, v5

    .line 1074
    aput v4, v1, v3

    .line 1075
    aput v4, v1, v9

    .line 1076
    aput v4, v1, v8

    .line 1077
    aput v4, v1, v7

    .line 1078
    aput v4, v1, v6

    const/4 v2, 0x7

    .line 1079
    aput v4, v1, v2

    goto/16 :goto_2

    .line 1063
    :pswitch_1
    aput v4, v1, v0

    .line 1064
    aput v4, v1, v5

    .line 1065
    aput v4, v1, v3

    .line 1066
    aput v4, v1, v9

    .line 1067
    aput v4, v1, v8

    .line 1068
    aput v4, v1, v7

    .line 1069
    aput v4, v1, v6

    goto :goto_2

    .line 1055
    :pswitch_2
    aput v4, v1, v0

    .line 1056
    aput v4, v1, v5

    .line 1057
    aput v4, v1, v3

    .line 1058
    aput v4, v1, v9

    .line 1059
    aput v4, v1, v8

    .line 1060
    aput v4, v1, v7

    goto :goto_2

    .line 1048
    :pswitch_3
    aput v4, v1, v0

    .line 1049
    aput v4, v1, v5

    .line 1050
    aput v4, v1, v3

    .line 1051
    aput v4, v1, v9

    .line 1052
    aput v4, v1, v8

    goto :goto_2

    .line 1042
    :pswitch_4
    aput v4, v1, v0

    .line 1043
    aput v4, v1, v5

    .line 1044
    aput v4, v1, v3

    .line 1045
    aput v4, v1, v9

    goto :goto_2

    .line 1037
    :pswitch_5
    aput v4, v1, v0

    .line 1038
    aput v4, v1, v5

    .line 1039
    aput v4, v1, v3

    goto :goto_2

    .line 1033
    :pswitch_6
    aput v4, v1, v0

    .line 1034
    aput v4, v1, v5

    goto :goto_2

    .line 1030
    :pswitch_7
    aput v4, v1, v0

    goto :goto_2

    :goto_0
    add-int/lit8 v6, v2, -0x7

    if-ge v3, v6, :cond_2

    .line 1084
    aput v4, v1, v3

    add-int/lit8 v6, v3, 0x1

    .line 1085
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x2

    .line 1086
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x3

    .line 1087
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x4

    .line 1088
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x5

    .line 1089
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x6

    .line 1090
    aput v4, v1, v6

    add-int/lit8 v6, v3, 0x7

    .line 1091
    aput v4, v1, v6

    add-int/lit8 v3, v3, 0x8

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v3, v2, :cond_3

    .line 1095
    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 822
    :cond_3
    :goto_2
    :pswitch_8
    iget-object v1, p0, Ll/۠۠ܽ;->ܿ:Ll/֫֡ܽ;

    iget v1, v1, Ll/֫֡ܽ;->֫:I

    mul-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/۠۠ܽ;->᩷:I

    .line 823
    iget-object v1, p0, Ll/۠۠ܽ;->ܳ:Ll/ۚ۠ܽ;

    invoke-virtual {v1}, Ll/ۚ۠ܽ;->֫()V

    .line 824
    iget-object v2, p0, Ll/۠۠ܽ;->֨:[Ll/᩺ۤۡ;

    array-length v3, v2

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v3, :cond_4

    aget-object v7, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 35
    :cond_4
    iget-object v2, p0, Ll/۠۠ܽ;->ۗ:Ll/ᩴ۠ܽ;

    iget-object v3, v2, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 829
    iput v0, p0, Ll/۠۠ܽ;->֫:I

    .line 830
    invoke-direct {p0}, Ll/۠۠ܽ;->ۛ()V

    .line 833
    :try_start_0
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 835
    :try_start_1
    iget-boolean v3, p0, Ll/۠۠ܽ;->ۡ:Z

    if-nez v3, :cond_5

    iget-object v3, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-virtual {v1, p1, v3}, Ll/ۚ۠ܽ;->ۧ(ILjava/lang/CharSequence;)Z

    move-result p1
    :try_end_1
    .catch Ll/֡۠ܽ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    .line 837
    :catch_0
    :try_start_2
    iput-boolean v5, p0, Ll/۠۠ܽ;->᩵:Z

    .line 841
    :cond_5
    :goto_4
    invoke-virtual {p0}, Ll/۠۠ܽ;->֫()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 846
    invoke-direct {p0}, Ll/۠۠ܽ;->᩺()V

    .line 848
    iget-boolean p1, p0, Ll/۠۠ܽ;->֡:Z

    xor-int/2addr p1, v5

    and-int/2addr p1, v0

    if-nez p1, :cond_6

    .line 850
    iput v4, p0, Ll/۠۠ܽ;->᩻:I

    .line 851
    :cond_6
    iget v0, p0, Ll/۠۠ܽ;->ۖ:I

    iput v0, p0, Ll/۠۠ܽ;->ۙ:I

    if-eqz p1, :cond_7

    .line 856
    iget-boolean v0, p0, Ll/۠۠ܽ;->۫:Z

    if-eqz v0, :cond_7

    .line 39
    iget-object v0, v2, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :cond_7
    return p1

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 843
    :try_start_3
    iput v4, p0, Ll/۠۠ܽ;->᩻:I

    .line 844
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 846
    :goto_5
    invoke-direct {p0}, Ll/۠۠ܽ;->᩺()V

    .line 847
    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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

.method public final ᩴ()Z
    .locals 1

    .line 684
    iget-boolean v0, p0, Ll/۠۠ܽ;->ܺ:Z

    return v0
.end method

.method public final ᩵()Z
    .locals 2

    .line 491
    iget v0, p0, Ll/۠۠ܽ;->ۜ:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll/۠۠ܽ;->֫(II)Z

    move-result v0

    return v0
.end method

.method public final ᩶()V
    .locals 1

    const/4 v0, 0x1

    .line 112
    iput-boolean v0, p0, Ll/۠۠ܽ;->᩶:Z

    const/4 v0, 0x0

    .line 113
    iput v0, p0, Ll/۠۠ܽ;->ܶ:I

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 718
    iget v0, p0, Ll/۠۠ܽ;->֫֫:I

    return v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 688
    iget-boolean v0, p0, Ll/۠۠ܽ;->ۤ:Z

    return v0
.end method

.method public final ᩹()V
    .locals 1

    .line 346
    invoke-direct {p0}, Ll/۠۠ܽ;->ܰ()V

    const/4 v0, 0x0

    .line 347
    iput v0, p0, Ll/۠۠ܽ;->ۜ:I

    .line 961
    iget-object v0, p0, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 348
    iput v0, p0, Ll/۠۠ܽ;->ܽ֫:I

    return-void
.end method

.method public final ᩻()I
    .locals 1

    .line 118
    iget v0, p0, Ll/۠۠ܽ;->ܶ:I

    return v0
.end method
