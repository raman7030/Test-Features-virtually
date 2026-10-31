.class public final Ll/֡ۨ;
.super Ljava/lang/Object;
.source "X960"


# static fields
.field public static ܽܶۖ:Z


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:[J

.field public final ܿ:[F

.field public ᩳ:F


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>()V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    new-array v1, v0, [F

    .line 44
    iput-object v1, p0, Ll/֡ۨ;->ܿ:[F

    new-array v0, v0, [J

    .line 45
    iput-object v0, p0, Ll/֡ۨ;->ܽ:[J

    const/4 v0, 0x0

    .line 48
    iput v0, p0, Ll/֡ۨ;->ᩳ:F

    const/4 v0, 0x0

    .line 51
    iput v0, p0, Ll/֡ۨ;->ۧ:I

    .line 56
    iput v0, p0, Ll/֡ۨ;->֫:I

    return-void
.end method

.method public static ֫ᩴۗ(JJ)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۖ᩷ᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۙ᩺ܶ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    check-cast p0, Ll/ܺ֫ۚ;

    invoke-interface {p0}, Ll/ܺ֫ۚ;->ۧ()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۜܿ᩵(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ۟ᩳ۬(Ljava/lang/Object;CLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Ll/۬۟ۘ;

    invoke-interface {p0, p1, p2}, Ll/۬۟ۘ;->֫(CLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۠֫᩶(Ljava/lang/Object;I)I
    .locals 0

    check-cast p0, Landroid/content/res/Resources$Theme;

    invoke-static {p0, p1}, Ll/᩸֡᩷;->ۧ(Landroid/content/res/Resources$Theme;I)I

    move-result p0

    return p0
.end method

.method public static ۡܺ֡([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۧۘܺ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    check-cast p0, Ljava/util/IdentityHashMap;

    invoke-virtual {p0}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۫۠ܿ()Landroid/app/Application;
    .locals 1

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public static ۬ܿܶ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۤ᩸ᩳ;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ll/ۤ᩸ᩳ;->append(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ܳܽ᩶(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܺ֡ۚ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, [Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴ᩺᩵(IILjava/lang/Object;)V
    .locals 0

    check-cast p2, [B

    invoke-static {p0, p1, p2}, Ll/ܺܰۡ;->֫(II[B)V

    return-void
.end method

.method public static ᩸ۧۧ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method

.method public static ᩹᩹ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ᩺۠ۧ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    return-void
.end method


# virtual methods
.method public final ֫(I)F
    .locals 1

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 104
    :cond_0
    iget p1, p0, Ll/֡ۨ;->ᩳ:F

    return p1
.end method

.method public final ֫()V
    .locals 17

    move-object/from16 v0, p0

    .line 114
    iget v1, v0, Ll/֡ۨ;->ۧ:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ge v1, v3, :cond_0

    goto/16 :goto_3

    .line 120
    :cond_0
    iget v4, v0, Ll/֡ۨ;->֫:I

    add-int/lit8 v5, v4, 0x14

    const/4 v6, 0x1

    sub-int/2addr v1, v6

    sub-int/2addr v5, v1

    rem-int/lit8 v5, v5, 0x14

    .line 123
    iget-object v1, v0, Ll/֡ۨ;->ܽ:[J

    aget-wide v7, v1, v4

    .line 124
    :goto_0
    aget-wide v9, v1, v5

    sub-long v11, v7, v9

    const-wide/16 v13, 0x64

    cmp-long v4, v11, v13

    if-lez v4, :cond_1

    .line 126
    iget v4, v0, Ll/֡ۨ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v0, Ll/֡ۨ;->ۧ:I

    add-int/lit8 v5, v5, 0x1

    .line 129
    rem-int/lit8 v5, v5, 0x14

    goto :goto_0

    .line 133
    :cond_1
    iget v4, v0, Ll/֡ۨ;->ۧ:I

    if-ge v4, v3, :cond_2

    goto/16 :goto_3

    .line 137
    :cond_2
    iget-object v7, v0, Ll/֡ۨ;->ܿ:[F

    if-ne v4, v3, :cond_4

    add-int/2addr v5, v6

    .line 138
    rem-int/lit8 v5, v5, 0x14

    .line 139
    aget-wide v3, v1, v5

    cmp-long v1, v9, v3

    if-nez v1, :cond_3

    goto :goto_3

    .line 142
    :cond_3
    aget v1, v7, v5

    sub-long/2addr v3, v9

    long-to-float v2, v3

    div-float v2, v1, v2

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    .line 150
    :goto_1
    iget v9, v0, Ll/֡ۨ;->ۧ:I

    sub-int/2addr v9, v6

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x3f800000    # 1.0f

    if-ge v3, v9, :cond_8

    add-int v9, v3, v5

    .line 152
    rem-int/lit8 v12, v9, 0x14

    aget-wide v12, v1, v12

    add-int/2addr v9, v6

    .line 153
    rem-int/lit8 v9, v9, 0x14

    .line 156
    aget-wide v14, v1, v9

    cmp-long v16, v14, v12

    if-nez v16, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v4, 0x1

    cmpg-float v2, v8, v2

    if-gez v2, :cond_6

    const/high16 v11, -0x40800000    # -1.0f

    .line 180
    :cond_6
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v2

    mul-float v2, v2, v10

    float-to-double v14, v2

    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v14

    double-to-float v2, v14

    mul-float v11, v11, v2

    .line 162
    aget v2, v7, v9

    .line 163
    aget-wide v9, v1, v9

    sub-long/2addr v9, v12

    long-to-float v9, v9

    div-float/2addr v2, v9

    sub-float v9, v2, v11

    .line 165
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    mul-float v2, v2, v9

    add-float/2addr v8, v2

    if-ne v4, v6, :cond_7

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v8, v8, v2

    :cond_7
    :goto_2
    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x0

    goto :goto_1

    :cond_8
    const/4 v1, 0x0

    cmpg-float v1, v8, v1

    if-gez v1, :cond_9

    const/high16 v11, -0x40800000    # -1.0f

    .line 180
    :cond_9
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float v1, v1, v10

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v2, v11, v1

    :goto_3
    const/16 v1, 0x3e8

    int-to-float v1, v1

    mul-float v2, v2, v1

    .line 88
    iput v2, v0, Ll/֡ۨ;->ᩳ:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 92
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    neg-float v3, v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_a

    .line 93
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    neg-float v1, v1

    iput v1, v0, Ll/֡ۨ;->ᩳ:F

    return-void

    .line 94
    :cond_a
    iget v2, v0, Ll/֡ۨ;->ᩳ:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_b

    .line 95
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iput v1, v0, Ll/֡ۨ;->ᩳ:F

    :cond_b
    return-void
.end method

.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 8

    .line 60
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    .line 61
    iget v2, p0, Ll/֡ۨ;->ۧ:I

    iget-object v3, p0, Ll/֡ۨ;->ܽ:[J

    if-eqz v2, :cond_0

    iget v2, p0, Ll/֡ۨ;->֫:I

    aget-wide v4, v3, v2

    sub-long v4, v0, v4

    const-wide/16 v6, 0x28

    cmp-long v2, v4, v6

    if-lez v2, :cond_0

    const/4 v2, 0x0

    .line 108
    iput v2, p0, Ll/֡ۨ;->ۧ:I

    const/4 v2, 0x0

    .line 109
    iput v2, p0, Ll/֡ۨ;->ᩳ:F

    .line 70
    :cond_0
    iget v2, p0, Ll/֡ۨ;->֫:I

    add-int/lit8 v2, v2, 0x1

    const/16 v4, 0x14

    rem-int/2addr v2, v4

    iput v2, p0, Ll/֡ۨ;->֫:I

    .line 73
    iget v5, p0, Ll/֡ۨ;->ۧ:I

    if-eq v5, v4, :cond_1

    add-int/lit8 v5, v5, 0x1

    .line 74
    iput v5, p0, Ll/֡ۨ;->ۧ:I

    :cond_1
    const/16 v4, 0x1a

    .line 77
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result p1

    iget-object v4, p0, Ll/֡ۨ;->ܿ:[F

    aput p1, v4, v2

    .line 78
    iget p1, p0, Ll/֡ۨ;->֫:I

    aput-wide v0, v3, p1

    return-void
.end method
