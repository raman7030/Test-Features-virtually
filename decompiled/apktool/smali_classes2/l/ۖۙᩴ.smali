.class public Ll/ۖۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܳۙᩴ;


# static fields
.field public static final f:[J


# instance fields
.field public final a:Ll/ۤۗᩴ;

.field public final b:I

.field public final c:I

.field public final d:Ll/᩻ۙᩴ;

.field public final e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [J

    .line 2638
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖۙᩴ;->f:[J

    return-void

    :array_0
    .array-data 8
        0x0
        0xa
        0x64
        0x3e8
        0x2710
        0x186a0
        0xf4240
        0x989680
        0x5f5e100
        0x3b9aca00
        0x2540be400L
    .end array-data
.end method

.method public constructor <init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V
    .locals 0

    .line 2666
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2668
    iput-object p1, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    .line 2669
    iput p2, p0, Ll/ۖۙᩴ;->b:I

    .line 2670
    iput p3, p0, Ll/ۖۙᩴ;->c:I

    .line 2671
    iput-object p4, p0, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    const/4 p1, 0x0

    .line 2672
    iput p1, p0, Ll/ۖۙᩴ;->e:I

    return-void
.end method

.method public constructor <init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;I)V
    .locals 0

    .line 2685
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2687
    iput-object p1, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    .line 2688
    iput p2, p0, Ll/ۖۙᩴ;->b:I

    .line 2689
    iput p3, p0, Ll/ۖۙᩴ;->c:I

    .line 2690
    iput-object p4, p0, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    .line 2691
    iput p5, p0, Ll/ۖۙᩴ;->e:I

    return-void
.end method


# virtual methods
.method public a(Ll/ۤۙᩴ;J)J
    .locals 0

    return-wide p2
.end method

.method public b(Ll/ۗۙᩴ;)Z
    .locals 1

    const/4 p1, -0x1

    .line 2782
    iget v0, p0, Ll/ۖۙᩴ;->e:I

    if-eq v0, p1, :cond_1

    if-lez v0, :cond_0

    iget p1, p0, Ll/ۖۙᩴ;->b:I

    iget v0, p0, Ll/ۖۙᩴ;->c:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    sget-object v0, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public c(Ll/ۗۙᩴ;JII)I
    .locals 6

    .line 2898
    iget-object v1, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    move-object v0, p1

    move-wide v2, p2

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result p1

    return p1
.end method

.method public d()Ll/ۖۙᩴ;
    .locals 8

    .line 2700
    iget v0, p0, Ll/ۖۙᩴ;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p0

    .line 2703
    :cond_0
    new-instance v0, Ll/ۖۙᩴ;

    iget-object v6, p0, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    const/4 v7, -0x1

    iget-object v3, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    iget v4, p0, Ll/ۖۙᩴ;->b:I

    iget v5, p0, Ll/ۖۙᩴ;->c:I

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;I)V

    return-object v0
.end method

.method public e(I)Ll/ۖۙᩴ;
    .locals 7

    .line 2713
    new-instance v6, Ll/ۖۙᩴ;

    iget v0, p0, Ll/ۖۙᩴ;->e:I

    add-int v5, v0, p1

    iget-object v1, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    iget v2, p0, Ll/ۖۙᩴ;->b:I

    iget v3, p0, Ll/ۖۙᩴ;->c:I

    iget-object v4, p0, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;I)V

    return-object v6
.end method

.method public l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z
    .locals 13

    .line 2718
    iget-object v0, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-virtual {p1, v0}, Ll/ۤۙᩴ;->a(Ll/ۤۗᩴ;)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 2722
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {p0, p1, v3, v4}, Ll/ۖۙᩴ;->a(Ll/ۤۙᩴ;J)J

    move-result-wide v3

    .line 261
    iget-object p1, p1, Ll/ۤۙᩴ;->b:Ll/ۛ᩶ᩴ;

    .line 1472
    iget-object p1, p1, Ll/ۛ᩶ᩴ;->c:Ll/֫ۙᩴ;

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    const-string v1, "9223372036854775808"

    goto :goto_0

    .line 2724
    :cond_1
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    .line 2725
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, " cannot be printed as the value "

    const-string v7, "Field "

    iget v8, p0, Ll/ۖۙᩴ;->c:I

    if-gt v5, v8, :cond_9

    .line 2730
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v8, 0x0

    .line 2732
    iget p1, p0, Ll/ۖۙᩴ;->b:I

    const/4 v5, 0x2

    iget-object v10, p0, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    const/4 v11, 0x1

    cmp-long v12, v3, v8

    if-ltz v12, :cond_4

    .line 2733
    sget-object v0, Ll/۟᩶ᩴ;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v0, v0, v6

    const/16 v6, 0x2b

    if-eq v0, v11, :cond_3

    if-eq v0, v5, :cond_2

    goto :goto_1

    .line 2740
    :cond_2
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const/16 v0, 0x13

    if-ge p1, v0, :cond_7

    .line 2735
    sget-object v0, Ll/ۖۙᩴ;->f:[J

    aget-wide v7, v0, p1

    cmp-long v0, v3, v7

    if-ltz v0, :cond_7

    .line 2736
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 2744
    :cond_4
    sget-object v8, Ll/۟᩶ᩴ;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    if-eq v8, v11, :cond_6

    if-eq v8, v5, :cond_6

    const/4 v5, 0x3

    if-eq v8, v5, :cond_6

    const/4 v5, 0x4

    if-eq v8, v5, :cond_5

    goto :goto_1

    .line 2751
    :cond_5
    new-instance p1, Ll/ܺ᩹ᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " cannot be negative according to the SignStyle"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/16 v0, 0x2d

    .line 2748
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2756
    :cond_7
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int v0, p1, v0

    if-ge v2, v0, :cond_8

    const/16 v0, 0x30

    .line 2757
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 2759
    :cond_8
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v11

    .line 2726
    :cond_9
    new-instance p1, Ll/ܺ᩹ᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " exceeds the maximum print width of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I
    .locals 22

    move-object/from16 v6, p0

    move-object/from16 v1, p1

    move/from16 v0, p3

    .line 2788
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ne v0, v2, :cond_0

    not-int v0, v0

    return v0

    .line 2792
    :cond_0
    invoke-interface/range {p2 .. p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 158
    iget-object v4, v1, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    .line 1472
    iget-object v5, v4, Ll/ۛ᩶ᩴ;->c:Ll/֫ۙᩴ;

    .line 240
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x2b

    const/4 v7, 0x4

    .line 2795
    iget v8, v6, Ll/ۖۙᩴ;->c:I

    iget-object v9, v6, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    iget v10, v6, Ll/ۖۙᩴ;->b:I

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-ne v3, v5, :cond_5

    .line 270
    iget-boolean v3, v1, Ll/ۗۙᩴ;->c:Z

    if-ne v10, v8, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 126
    :goto_0
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_2

    if-eq v13, v12, :cond_3

    if-eq v13, v7, :cond_3

    if-nez v3, :cond_4

    if-nez v5, :cond_4

    goto :goto_1

    :cond_2
    if-nez v3, :cond_4

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x1

    move v5, v0

    const/4 v0, 0x1

    goto :goto_5

    :cond_4
    not-int v0, v0

    return v0

    .line 1472
    :cond_5
    iget-object v5, v4, Ll/ۛ᩶ᩴ;->c:Ll/֫ۙᩴ;

    .line 269
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x2d

    if-ne v3, v5, :cond_9

    .line 270
    iget-boolean v3, v1, Ll/ۗۙᩴ;->c:Z

    if-ne v10, v8, :cond_6

    const/4 v5, 0x1

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    .line 126
    :goto_2
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_8

    if-eq v13, v12, :cond_8

    if-eq v13, v7, :cond_8

    if-nez v3, :cond_7

    if-nez v5, :cond_7

    goto :goto_3

    :cond_7
    not-int v0, v0

    return v0

    :cond_8
    :goto_3
    add-int/lit8 v0, v0, 0x1

    const/4 v3, 0x1

    goto :goto_4

    .line 2808
    :cond_9
    sget-object v3, Ll/᩻ۙᩴ;->ALWAYS:Ll/᩻ۙᩴ;

    if-ne v9, v3, :cond_a

    .line 270
    iget-boolean v3, v1, Ll/ۗۙᩴ;->c:Z

    if-eqz v3, :cond_a

    not-int v0, v0

    return v0

    :cond_a
    const/4 v3, 0x0

    :goto_4
    const/4 v5, 0x0

    move v5, v0

    const/4 v0, 0x0

    :goto_5
    iget-boolean v7, v1, Ll/ۗۙᩴ;->c:Z

    if-nez v7, :cond_c

    .line 2812
    invoke-virtual/range {p0 .. p1}, Ll/ۖۙᩴ;->b(Ll/ۗۙᩴ;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_6

    :cond_b
    const/4 v7, 0x1

    goto :goto_7

    :cond_c
    :goto_6
    move v7, v10

    :goto_7
    add-int v12, v5, v7

    if-le v12, v2, :cond_d

    not-int v0, v5

    return v0

    .line 270
    :cond_d
    iget-boolean v13, v1, Ll/ۗۙᩴ;->c:Z

    if-nez v13, :cond_f

    .line 2817
    invoke-virtual/range {p0 .. p1}, Ll/ۖۙᩴ;->b(Ll/ۗۙᩴ;)Z

    move-result v13

    if-eqz v13, :cond_e

    goto :goto_8

    :cond_e
    const/16 v8, 0x9

    :cond_f
    :goto_8
    iget v13, v6, Ll/ۖۙᩴ;->e:I

    invoke-static {v13, v11}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int/2addr v14, v8

    :goto_9
    const/4 v8, 0x2

    const/16 v17, 0x0

    if-ge v11, v8, :cond_17

    add-int/2addr v14, v5

    .line 2822
    invoke-static {v14, v2}, Ljava/lang/Math;->min(II)I

    move-result v8

    move v14, v5

    const-wide/16 v18, 0x0

    :goto_a
    if-ge v14, v8, :cond_14

    add-int/lit8 v20, v14, 0x1

    move-object/from16 v15, p2

    .line 2824
    invoke-interface {v15, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v16

    move/from16 v21, v2

    .line 1472
    iget-object v2, v4, Ll/ۛ᩶ᩴ;->c:Ll/֫ۙᩴ;

    .line 2825
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v16, -0x30

    move-object/from16 v16, v4

    const/16 v4, 0x9

    if-ltz v2, :cond_10

    if-gt v2, v4, :cond_10

    goto :goto_b

    :cond_10
    const/4 v2, -0x1

    :goto_b
    if-gez v2, :cond_11

    if-ge v14, v12, :cond_15

    not-int v0, v5

    return v0

    :cond_11
    sub-int v4, v20, v5

    const/16 v14, 0x12

    if-le v4, v14, :cond_13

    if-nez v17, :cond_12

    .line 2835
    invoke-static/range {v18 .. v19}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v17

    :cond_12
    move-object/from16 v4, v17

    .line 2837
    sget-object v14, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    invoke-virtual {v4, v14}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    int-to-long v14, v2

    invoke-static {v14, v15}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v17

    goto :goto_c

    :cond_13
    const-wide/16 v14, 0xa

    mul-long v18, v18, v14

    int-to-long v14, v2

    add-long v18, v18, v14

    :goto_c
    move-object/from16 v4, v16

    move/from16 v14, v20

    move/from16 v2, v21

    goto :goto_a

    :cond_14
    move/from16 v21, v2

    move-object/from16 v16, v4

    :cond_15
    if-lez v13, :cond_16

    if-nez v11, :cond_16

    sub-int/2addr v14, v5

    sub-int/2addr v14, v13

    .line 2845
    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v4, v16

    move/from16 v2, v21

    goto :goto_9

    :cond_16
    move-object/from16 v2, v17

    move-wide/from16 v7, v18

    goto :goto_d

    :cond_17
    move v14, v5

    move-object/from16 v2, v17

    const-wide/16 v7, 0x0

    :goto_d
    if-eqz v3, :cond_1b

    if-eqz v2, :cond_19

    .line 2855
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 270
    iget-boolean v0, v1, Ll/ۗۙᩴ;->c:Z

    if-eqz v0, :cond_18

    goto :goto_e

    .line 2858
    :cond_18
    invoke-virtual {v2}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v2

    goto :goto_f

    :cond_19
    const-wide/16 v3, 0x0

    cmp-long v0, v7, v3

    if-nez v0, :cond_1a

    .line 270
    iget-boolean v0, v1, Ll/ۗۙᩴ;->c:Z

    if-eqz v0, :cond_1a

    goto :goto_e

    :cond_1a
    neg-long v3, v7

    move-wide v7, v3

    goto :goto_f

    .line 2865
    :cond_1b
    sget-object v3, Ll/᩻ۙᩴ;->EXCEEDS_PAD:Ll/᩻ۙᩴ;

    if-ne v9, v3, :cond_1d

    .line 270
    iget-boolean v3, v1, Ll/ۗۙᩴ;->c:Z

    if-eqz v3, :cond_1d

    sub-int v3, v14, v5

    if-eqz v0, :cond_1c

    if-gt v3, v10, :cond_1d

    :goto_e
    add-int/lit8 v5, v5, -0x1

    not-int v0, v5

    return v0

    :cond_1c
    if-le v3, v10, :cond_1d

    not-int v0, v5

    return v0

    :cond_1d
    :goto_f
    if-eqz v2, :cond_1f

    .line 2878
    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v3, 0x3f

    if-le v0, v3, :cond_1e

    .line 2880
    sget-object v0, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    add-int/lit8 v14, v14, -0x1

    .line 2883
    :cond_1e
    invoke-virtual {v2}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v4, v5

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Ll/ۖۙᩴ;->c(Ll/ۗۙᩴ;JII)I

    move-result v0

    return v0

    :cond_1f
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v7

    move v4, v5

    move v5, v14

    .line 2885
    invoke-virtual/range {v0 .. v5}, Ll/ۖۙᩴ;->c(Ll/ۗۙᩴ;JII)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x1

    .line 2903
    iget v1, p0, Ll/ۖۙᩴ;->c:I

    const-string v2, ")"

    const-string v3, "Value("

    iget-object v4, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    iget-object v5, p0, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    iget v6, p0, Ll/ۖۙᩴ;->b:I

    if-ne v6, v0, :cond_0

    const/16 v0, 0x13

    if-ne v1, v0, :cond_0

    sget-object v0, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    if-ne v5, v0, :cond_0

    .line 2904
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ","

    if-ne v6, v1, :cond_1

    .line 2906
    sget-object v7, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    if-ne v5, v7, :cond_1

    .line 2907
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2909
    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
