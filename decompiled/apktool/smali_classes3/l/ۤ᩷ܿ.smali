.class public final Ll/ۤ᩷ܿ;
.super Ljava/lang/Object;
.source "P70C"


# static fields
.field public static final ۖ:[Ll/᩶ۘܿ;

.field public static final ۘ:[I

.field public static final ᩴ:Ll/۫᩷ܿ;


# instance fields
.field public final ֫:[I

.field public final ۜ:Ll/᩺ܺܿ;

.field public final ۡ:Ll/۫᩷ܿ;

.field public final ۢ:[I

.field public final ۧ:[I

.field public final ܳ:[I

.field public final ܺ:I

.field public final ܽ:[I

.field public final ܿ:I

.field public final ᩳ:[Ll/᩶ۘܿ;

.field public final ᩷:Z

.field public final ᩻:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 36

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 13
    sput-object v1, Ll/ۤ᩷ܿ;->ۘ:[I

    new-array v1, v0, [Ll/᩶ۘܿ;

    .line 14
    sput-object v1, Ll/ۤ᩷ܿ;->ۖ:[Ll/᩶ۘܿ;

    new-array v0, v0, [I

    move-object v4, v0

    move-object v5, v0

    move-object v9, v0

    move-object/from16 v17, v0

    move-object/from16 v18, v0

    move-object v10, v0

    move-object/from16 v19, v0

    move-object/from16 v20, v0

    move-object v6, v0

    move-object v11, v0

    move-object/from16 v22, v0

    move-object v12, v0

    move-object v7, v0

    move-object v13, v0

    move-object v14, v0

    move-object v8, v0

    move-object v15, v0

    move-object/from16 v16, v0

    .line 640
    new-instance v0, Ll/۫᩷ܿ;

    move-object v2, v0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/4 v3, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    .line 546
    invoke-direct/range {v2 .. v35}, Ll/۫᩷ܿ;-><init>(I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[Ll/᩶ۘܿ;[I[I[I[I[I[I[I[I[I[I[I[I)V

    .line 15
    sput-object v0, Ll/ۤ᩷ܿ;->ᩴ:Ll/۫᩷ܿ;

    return-void
.end method

.method public constructor <init>(Ll/᩺ܺܿ;II[I[I[I[I[I[I[Ll/᩶ۘܿ;Ll/۫᩷ܿ;Z)V
    .locals 3

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_14

    .line 57
    array-length v0, p4

    if-ltz p3, :cond_13

    if-gt p3, v0, :cond_13

    .line 58
    array-length v1, p5

    if-ne v1, v0, :cond_13

    array-length v1, p6

    if-ne v1, v0, :cond_13

    array-length v1, p7

    if-ne v1, v0, :cond_13

    array-length v1, p10

    if-ne v1, v0, :cond_13

    const-string v1, "program"

    .line 63
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۤ᩷ܿ;->ۜ:Ll/᩺ܺܿ;

    .line 64
    iput p2, p0, Ll/ۤ᩷ܿ;->ܺ:I

    .line 65
    iput p3, p0, Ll/ۤ᩷ܿ;->ܿ:I

    .line 66
    iput-object p4, p0, Ll/ۤ᩷ܿ;->᩻:[I

    .line 67
    iput-object p5, p0, Ll/ۤ᩷ܿ;->ܳ:[I

    .line 68
    iput-object p6, p0, Ll/ۤ᩷ܿ;->ܽ:[I

    .line 69
    iput-object p7, p0, Ll/ۤ᩷ܿ;->ۢ:[I

    .line 70
    iput-object p8, p0, Ll/ۤ᩷ܿ;->ۧ:[I

    .line 71
    iput-object p9, p0, Ll/ۤ᩷ܿ;->֫:[I

    .line 72
    iput-object p10, p0, Ll/ۤ᩷ܿ;->ᩳ:[Ll/᩶ۘܿ;

    const-string v1, "states"

    .line 73
    invoke-static {p11, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget v1, p11, Ll/۫᩷ܿ;->ܰ:I

    iput-object p11, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    .line 74
    iput-boolean p12, p0, Ll/ۤ᩷ܿ;->᩷:Z

    if-eqz v1, :cond_1

    .line 76
    invoke-virtual {p11}, Ll/۫᩷ܿ;->ۧ()Z

    move-result p12

    invoke-virtual {p1}, Ll/᩺ܺܿ;->ܿ()Z

    move-result v2

    if-ne p12, v2, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint end-proof sidecar differs from program"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz v1, :cond_3

    .line 80
    invoke-virtual {p11}, Ll/۫᩷ܿ;->֫()Z

    move-result p12

    invoke-virtual {p1}, Ll/᩺ܺܿ;->ۧ()Z

    move-result p1

    if-ne p12, p1, :cond_2

    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint embedded sidecar differs from program"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    if-nez p8, :cond_5

    if-eqz p9, :cond_4

    goto :goto_2

    :cond_4
    const/4 p12, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p12, 0x1

    :goto_3
    if-eqz p12, :cond_6

    if-eqz p8, :cond_7

    if-eqz p9, :cond_7

    .line 84
    array-length v2, p8

    if-ne v2, v0, :cond_7

    array-length v2, p9

    if-ne v2, v0, :cond_7

    :cond_6
    if-eqz p3, :cond_8

    .line 86
    invoke-virtual {p11}, Ll/۫᩷ܿ;->֫()Z

    move-result v0

    if-ne v0, p12, :cond_7

    goto :goto_4

    .line 87
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint context columns differ from program"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :cond_8
    :goto_4
    invoke-virtual {p11}, Ll/۫᩷ܿ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v1, :cond_c

    .line 669
    iget-object v2, p11, Ll/۫᩷ܿ;->ᩴ:[Ll/᩶ۘܿ;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_6

    :cond_9
    aget-object v2, v2, v0

    :goto_6
    if-eqz v2, :cond_b

    .line 92
    invoke-virtual {v2}, Ll/᩶ۘܿ;->᩻()I

    move-result v2

    if-ne v2, p2, :cond_a

    goto :goto_7

    .line 93
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint end proof length differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_c
    const/4 p11, 0x0

    const/4 v0, -0x1

    :goto_8
    if-ge p11, p3, :cond_12

    .line 99
    aget v2, p4, p11

    if-le v2, v0, :cond_11

    if-ltz v2, :cond_11

    if-ge v2, p2, :cond_11

    .line 100
    aget v0, p5, p11

    if-ltz v0, :cond_11

    if-gt v0, v2, :cond_11

    aget v0, p6, p11

    if-ltz v0, :cond_11

    if-gt v0, v2, :cond_11

    .line 105
    aget-object v0, p10, p11

    if-eqz v0, :cond_10

    .line 108
    invoke-virtual {v0}, Ll/᩶ۘܿ;->᩻()I

    move-result v0

    if-ne v0, p2, :cond_f

    .line 111
    aget v0, p7, p11

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    if-eqz p12, :cond_e

    .line 112
    aget v0, p8, p11

    if-lt v0, p1, :cond_d

    aget v0, p9, p11

    if-ltz v0, :cond_d

    goto :goto_9

    .line 113
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax checkpoint context state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_9
    add-int/lit8 p11, p11, 0x1

    move v0, v2

    goto :goto_8

    .line 109
    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint dependency length differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 106
    :cond_10
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "dependencies["

    const-string p3, "]"

    .line 0
    invoke-static {p11, p2, p3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 106
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax checkpoint entry"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    return-void

    .line 61
    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint columns have different sizes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_14
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative text length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(I[I)I
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤ᩷ܿ;->ۧ(I[I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/᩶ۘܿ;)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۤ᩷ܿ;->ۧ(Ll/᩶ۘܿ;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/᩺ܺܿ;IZ)Ll/ۤ᩷ܿ;
    .locals 14

    .line 127
    new-instance v13, Ll/ۤ᩷ܿ;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    .line 45
    sget-object v7, Ll/ۤ᩷ܿ;->ۘ:[I

    sget-object v10, Ll/ۤ᩷ܿ;->ۖ:[Ll/᩶ۘܿ;

    sget-object v11, Ll/ۤ᩷ܿ;->ᩴ:Ll/۫᩷ܿ;

    move-object v0, v13

    move-object v1, p0

    move v2, p1

    move-object v4, v7

    move-object v5, v7

    move-object v6, v7

    move/from16 v12, p2

    invoke-direct/range {v0 .. v12}, Ll/ۤ᩷ܿ;-><init>(Ll/᩺ܺܿ;II[I[I[I[I[I[I[Ll/᩶ۘܿ;Ll/۫᩷ܿ;Z)V

    return-object v13
.end method

.method public static bridge synthetic ֫(I[I[I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۤ᩷ܿ;->ۧ(I[I[I)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/᩶ۘܿ;Ll/᩶ۘܿ;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤ᩷ܿ;->ۧ(Ll/᩶ۘܿ;Ll/᩶ۘܿ;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(I[I)I
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    .line 455
    aget v2, p1, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static ۧ(Ll/᩶ۘܿ;)I
    .locals 2

    .line 480
    invoke-virtual {p0}, Ll/᩶ۘܿ;->᩻()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 481
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ܳ()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 482
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ܿ()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 483
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ۧ()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 484
    invoke-virtual {p0}, Ll/᩶ۘܿ;->֫()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 485
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 486
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static ۧ(I[I[I)Z
    .locals 4

    .line 446
    array-length v0, p1

    const/4 v1, 0x0

    if-gt p0, v0, :cond_3

    array-length v0, p2

    if-le p0, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_2

    .line 448
    aget v2, p1, v0

    aget v3, p2, v0

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v1
.end method

.method public static ۧ(Ll/᩶ۘܿ;Ll/᩶ۘܿ;)Z
    .locals 2

    .line 470
    invoke-virtual {p0}, Ll/᩶ۘܿ;->᩻()I

    move-result v0

    invoke-virtual {p1}, Ll/᩶ۘܿ;->᩻()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 471
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ܳ()I

    move-result v0

    invoke-virtual {p1}, Ll/᩶ۘܿ;->ܳ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 472
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ܿ()I

    move-result v0

    invoke-virtual {p1}, Ll/᩶ۘܿ;->ܿ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 473
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ۧ()I

    move-result v0

    invoke-virtual {p1}, Ll/᩶ۘܿ;->ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 474
    invoke-virtual {p0}, Ll/᩶ۘܿ;->֫()I

    move-result v0

    invoke-virtual {p1}, Ll/᩶ۘܿ;->֫()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 475
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ᩳ()Z

    move-result v0

    invoke-virtual {p1}, Ll/᩶ۘܿ;->ᩳ()Z

    move-result v1

    if-ne v0, v1, :cond_0

    .line 476
    invoke-virtual {p0}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object p0

    invoke-virtual {p1}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_5

    .line 407
    :cond_0
    instance-of v1, p1, Ll/ۤ᩷ܿ;

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    check-cast p1, Ll/ۤ᩷ܿ;

    iget-object v1, p1, Ll/ۤ᩷ܿ;->ᩳ:[Ll/᩶ۘܿ;

    iget-object v3, p0, Ll/ۤ᩷ܿ;->ۜ:Ll/᩺ܺܿ;

    iget-object v4, p1, Ll/ۤ᩷ܿ;->ۜ:Ll/᩺ܺܿ;

    if-ne v3, v4, :cond_a

    iget v3, p0, Ll/ۤ᩷ܿ;->ܺ:I

    iget v4, p1, Ll/ۤ᩷ܿ;->ܺ:I

    if-ne v3, v4, :cond_a

    iget v3, p1, Ll/ۤ᩷ܿ;->ܿ:I

    iget v4, p0, Ll/ۤ᩷ܿ;->ܿ:I

    if-ne v4, v3, :cond_a

    iget-boolean v3, p0, Ll/ۤ᩷ܿ;->᩷:Z

    iget-boolean v5, p1, Ll/ۤ᩷ܿ;->᩷:Z

    if-ne v3, v5, :cond_a

    iget-object v3, p0, Ll/ۤ᩷ܿ;->᩻:[I

    iget-object v5, p1, Ll/ۤ᩷ܿ;->᩻:[I

    .line 411
    invoke-static {v4, v3, v5}, Ll/ۤ᩷ܿ;->ۧ(I[I[I)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, p0, Ll/ۤ᩷ܿ;->ܳ:[I

    iget-object v5, p1, Ll/ۤ᩷ܿ;->ܳ:[I

    .line 412
    invoke-static {v4, v3, v5}, Ll/ۤ᩷ܿ;->ۧ(I[I[I)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, p0, Ll/ۤ᩷ܿ;->ܽ:[I

    iget-object v5, p1, Ll/ۤ᩷ܿ;->ܽ:[I

    .line 413
    invoke-static {v4, v3, v5}, Ll/ۤ᩷ܿ;->ۧ(I[I[I)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, p0, Ll/ۤ᩷ܿ;->ۢ:[I

    iget-object v5, p1, Ll/ۤ᩷ܿ;->ۢ:[I

    .line 414
    invoke-static {v4, v3, v5}, Ll/ۤ᩷ܿ;->ۧ(I[I[I)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, p1, Ll/ۤ᩷ܿ;->ۧ:[I

    .line 460
    iget-object v5, p0, Ll/ۤ᩷ܿ;->ۧ:[I

    if-eqz v5, :cond_2

    if-nez v3, :cond_1

    goto :goto_0

    .line 461
    :cond_1
    invoke-static {v4, v5, v3}, Ll/ۤ᩷ܿ;->ۧ(I[I[I)Z

    move-result v3

    goto :goto_1

    :cond_2
    :goto_0
    if-ne v5, v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_a

    .line 415
    iget-object v3, p1, Ll/ۤ᩷ܿ;->֫:[I

    .line 460
    iget-object v5, p0, Ll/ۤ᩷ܿ;->֫:[I

    if-eqz v5, :cond_5

    if-nez v3, :cond_4

    goto :goto_2

    .line 461
    :cond_4
    invoke-static {v4, v5, v3}, Ll/ۤ᩷ܿ;->ۧ(I[I[I)Z

    move-result v3

    goto :goto_3

    :cond_5
    :goto_2
    if-ne v5, v3, :cond_6

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_a

    .line 416
    iget-object v3, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object p1, p1, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    .line 417
    invoke-virtual {v3, p1}, Ll/۫᩷ܿ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    array-length p1, v1

    if-le v4, p1, :cond_7

    goto :goto_6

    :cond_7
    const/4 p1, 0x0

    :goto_4
    if-ge p1, v4, :cond_9

    .line 422
    iget-object v3, p0, Ll/ۤ᩷ܿ;->ᩳ:[Ll/᩶ۘܿ;

    aget-object v3, v3, p1

    aget-object v5, v1, p1

    invoke-static {v3, v5}, Ll/ۤ᩷ܿ;->ۧ(Ll/᩶ۘܿ;Ll/᩶ۘܿ;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_9
    :goto_5
    return v0

    :cond_a
    :goto_6
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 429
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۜ:Ll/᩺ܺܿ;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۤ᩷ܿ;->ܺ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 430
    iget-boolean v1, p0, Ll/ۤ᩷ܿ;->᩷:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 431
    iget v1, p0, Ll/ۤ᩷ܿ;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 432
    iget-object v2, p0, Ll/ۤ᩷ܿ;->᩻:[I

    invoke-static {v1, v2}, Ll/ۤ᩷ܿ;->ۧ(I[I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 433
    iget-object v2, p0, Ll/ۤ᩷ܿ;->ܳ:[I

    invoke-static {v1, v2}, Ll/ۤ᩷ܿ;->ۧ(I[I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 434
    iget-object v2, p0, Ll/ۤ᩷ܿ;->ܽ:[I

    invoke-static {v1, v2}, Ll/ۤ᩷ܿ;->ۧ(I[I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 435
    iget-object v2, p0, Ll/ۤ᩷ܿ;->ۢ:[I

    invoke-static {v1, v2}, Ll/ۤ᩷ܿ;->ۧ(I[I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    const/4 v2, 0x0

    .line 465
    iget-object v3, p0, Ll/ۤ᩷ܿ;->ۧ:[I

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-static {v1, v3}, Ll/ۤ᩷ܿ;->ۧ(I[I)I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, Ll/ۤ᩷ܿ;->֫:[I

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-static {v1, v3}, Ll/ۤ᩷ܿ;->ۧ(I[I)I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 438
    iget-object v3, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    invoke-virtual {v3}, Ll/۫᩷ܿ;->hashCode()I

    move-result v3

    add-int/2addr v0, v3

    :goto_3
    if-ge v2, v1, :cond_3

    mul-int/lit8 v0, v0, 0x1f

    .line 440
    iget-object v3, p0, Ll/ۤ᩷ܿ;->ᩳ:[Ll/᩶ۘܿ;

    aget-object v3, v3, v2

    invoke-static {v3}, Ll/ۤ᩷ܿ;->ۧ(Ll/᩶ۘܿ;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    return v0
.end method

.method public final ֡(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 377
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 693
    iget-object v0, v0, Ll/۫᩷ܿ;->ۡ:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ֨(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 369
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 685
    iget-object v0, v0, Ll/۫᩷ܿ;->ۖ:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۤ᩷ܿ;->᩻:[I

    array-length v0, v0

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 278
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 279
    iget-object v0, p0, Ll/ۤ᩷ܿ;->֫:[I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ֫(Ll/ܶۘܿ;I)I
    .locals 5

    const-string v0, "changes"

    .line 177
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 178
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܿ()I

    move-result v0

    iget v1, p0, Ll/ۤ᩷ܿ;->ܺ:I

    if-ne v0, v1, :cond_7

    .line 181
    iget-boolean v0, p0, Ll/ۤ᩷ܿ;->᩷:Z

    if-nez v0, :cond_6

    invoke-virtual {p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 183
    :cond_0
    invoke-virtual {p1}, Ll/ܶۘܿ;->ۧ()I

    move-result v0

    .line 185
    iget v1, p0, Ll/ۤ᩷ܿ;->ܿ:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    .line 186
    :goto_0
    iget-object v3, p0, Ll/ۤ᩷ܿ;->᩻:[I

    if-gt v2, v1, :cond_2

    add-int v4, v2, v1

    ushr-int/lit8 v4, v4, 0x1

    .line 189
    aget v3, v3, v4

    if-ge v3, v0, :cond_1

    add-int/lit8 v2, v4, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v4, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ltz v1, :cond_6

    .line 196
    aget v0, v3, v1

    if-le v0, p2, :cond_6

    .line 253
    invoke-virtual {p0, v1}, Ll/ۤ᩷ܿ;->᩶(I)I

    move-result v0

    .line 705
    iget-object v2, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v2, v2, Ll/۫᩷ܿ;->ۜ:[I

    if-nez v2, :cond_3

    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    aget v0, v2, v0

    :goto_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_4

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_4

    goto :goto_3

    .line 198
    :cond_4
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ᩳ:[Ll/᩶ۘܿ;

    aget-object v0, v0, v1

    .line 199
    iget-object v2, p0, Ll/ۤ᩷ܿ;->ܳ:[I

    aget v2, v2, v1

    if-ne v2, p2, :cond_5

    .line 200
    invoke-virtual {v0}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v2

    sget-object v4, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-ne v2, v4, :cond_5

    .line 201
    invoke-virtual {v0, p1}, Ll/᩶ۘܿ;->֫(Ll/ܶۘܿ;)Z

    move-result v0

    if-nez v0, :cond_5

    return v1

    :cond_5
    :goto_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_6
    :goto_4
    const/4 p1, -0x1

    return p1

    .line 179
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Checkpoint index and change set lengths differ"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩺ܺܿ;I)I
    .locals 3

    const-string v0, "expectedProgram"

    .line 210
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۜ:Ll/᩺ܺܿ;

    if-eq v0, p1, :cond_0

    goto :goto_4

    .line 212
    :cond_0
    iget p1, p0, Ll/ۤ᩷ܿ;->ܺ:I

    invoke-static {p2, p2, p1}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 214
    iget p1, p0, Ll/ۤ᩷ܿ;->ܿ:I

    add-int/lit8 p1, p1, -0x1

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p1, :cond_2

    add-int v1, v0, p1

    ushr-int/lit8 v1, v1, 0x1

    .line 217
    iget-object v2, p0, Ll/ۤ᩷ܿ;->᩻:[I

    aget v2, v2, v1

    if-gt v2, p2, :cond_1

    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p1, v1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ltz p1, :cond_6

    .line 253
    invoke-virtual {p0, p1}, Ll/ۤ᩷ܿ;->᩶(I)I

    move-result p2

    .line 705
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v0, v0, Ll/۫᩷ܿ;->ۜ:[I

    if-nez v0, :cond_3

    const/4 p2, 0x0

    goto :goto_2

    :cond_3
    aget p2, v0, p2

    :goto_2
    and-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_4

    and-int/lit8 p2, p2, 0x10

    if-nez p2, :cond_4

    goto :goto_3

    .line 225
    :cond_4
    iget-object p2, p0, Ll/ۤ᩷ܿ;->ᩳ:[Ll/᩶ۘܿ;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object p2

    sget-object v0, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-ne p2, v0, :cond_5

    return p1

    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_6
    :goto_4
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫֫(I)I
    .locals 2

    .line 299
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->۫:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 299
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ۖ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 401
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 717
    iget-object v0, v0, Ll/۫᩷ܿ;->᩻:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۗ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 357
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 673
    iget-object v0, v0, Ll/۫᩷ܿ;->֨:[I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۘ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 389
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 705
    iget-object v0, v0, Ll/۫᩷ܿ;->ۜ:[I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۙ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 361
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 677
    iget-object v0, v0, Ll/۫᩷ܿ;->ۚ:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۚ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 373
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 689
    iget-object v0, v0, Ll/۫᩷ܿ;->ܺ:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۛ(I)I
    .locals 2

    .line 319
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->᩹:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 319
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ۜ()I
    .locals 1

    .line 133
    iget v0, p0, Ll/ۤ᩷ܿ;->ܺ:I

    return v0
.end method

.method public final ۜ(I)J
    .locals 7

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 343
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 344
    iget-object v1, v0, Ll/۫᩷ܿ;->֫:[I

    aget v1, v1, p1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const/16 v5, 0x20

    shl-long/2addr v1, v5

    iget-object v0, v0, Ll/۫᩷ܿ;->ۧ:[I

    aget p1, v0, p1

    int-to-long v5, p1

    and-long/2addr v3, v5

    or-long v0, v1, v3

    return-wide v0
.end method

.method public final ۟(I)I
    .locals 2

    .line 291
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->۬:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 291
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ۠(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 349
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 665
    iget-object v0, v0, Ll/۫᩷ܿ;->ۘ:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۡ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 397
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 713
    iget-object v0, v0, Ll/۫᩷ܿ;->ܿ:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۢ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 393
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 709
    iget-object v0, v0, Ll/۫᩷ܿ;->ᩳ:[I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۤ(I)I
    .locals 2

    .line 295
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->᩸:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 295
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 272
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 273
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۧ:[I

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 243
    iget-boolean v0, p0, Ll/ۤ᩷ܿ;->᩷:Z

    return v0
.end method

.method public final ۧ֫(I)I
    .locals 2

    .line 311
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ۤ:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 311
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ۨ(I)I
    .locals 2

    .line 335
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->᩶:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 335
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ۫(I)I
    .locals 2

    .line 315
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ܶ:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 315
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ۬(I)I
    .locals 2

    .line 287
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->۠:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 287
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ܰ(I)I
    .locals 2

    .line 283
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ۗ:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 283
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ܳ()I
    .locals 6

    .line 649
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ۗ:[I

    array-length v1, v1

    .line 661
    invoke-virtual {v0}, Ll/۫᩷ܿ;->ۧ()Z

    move-result v2

    invoke-virtual {v0}, Ll/۫᩷ܿ;->֫()Z

    move-result v0

    invoke-static {v2, v0}, Ll/۫᩷ܿ;->֫(ZZ)I

    move-result v0

    int-to-long v1, v1

    int-to-long v3, v0

    mul-long v1, v1, v3

    long-to-int v0, v1

    int-to-long v3, v0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    return v0

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method public final ܳ(I)Z
    .locals 2

    .line 248
    invoke-virtual {p0, p1}, Ll/ۤ᩷ܿ;->᩶(I)I

    move-result p1

    .line 705
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v0, v0, Ll/۫᩷ܿ;->ۜ:[I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    aget p1, v0, p1

    :goto_0
    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final ܶ(I)Ll/᩶ۘܿ;
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 353
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 669
    iget-object v0, v0, Ll/۫᩷ܿ;->ᩴ:[Ll/᩶ۘܿ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܺ(I)I
    .locals 1

    .line 148
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۢ:[I

    aget p1, v0, p1

    .line 149
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v0, v0, Ll/۫᩷ܿ;->ܳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ(I)I
    .locals 1

    .line 259
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    iget-object v0, p0, Ll/ۤ᩷ܿ;->ܽ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ()Ll/᩺ܺܿ;
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۜ:Ll/᩺ܺܿ;

    return-object v0
.end method

.method public final ܽ֫(I)I
    .locals 2

    .line 307
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ۛ:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 307
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ܿ()I
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    return v0
.end method

.method public final ܿ(I)I
    .locals 1

    .line 234
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    iget-object v0, p0, Ll/ۤ᩷ܿ;->ܳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܿ֫(I)I
    .locals 2

    .line 327
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->᩺:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 327
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 138
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    return v0
.end method

.method public final ᩳ(I)Ll/᩶ۘܿ;
    .locals 1

    .line 263
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    iget-object v0, p0, Ll/ۤ᩷ܿ;->ᩳ:[Ll/᩶ۘܿ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ᩳ֫(I)I
    .locals 2

    .line 323
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ۨ:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 323
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ᩴ(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 381
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 697
    iget-object v0, v0, Ll/۫᩷ܿ;->᩷:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ᩵(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 385
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 701
    iget-object v0, v0, Ll/۫᩷ܿ;->ۢ:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ᩶(I)I
    .locals 1

    .line 267
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۢ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ᩷(I)I
    .locals 2

    .line 331
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ܽ:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 331
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ᩸(I)I
    .locals 2

    .line 645
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget v1, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 365
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 681
    iget-object v0, v0, Ll/۫᩷ܿ;->᩵:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ᩹(I)I
    .locals 2

    .line 303
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->֡:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 303
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ᩺(I)I
    .locals 2

    .line 339
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    iget-object v1, v0, Ll/۫᩷ܿ;->ۙ:[I

    .line 645
    iget v0, v0, Ll/۫᩷ܿ;->ܰ:I

    .line 339
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    return p1
.end method

.method public final ᩻()I
    .locals 2

    .line 164
    iget-object v0, p0, Ll/ۤ᩷ܿ;->ۡ:Ll/۫᩷ܿ;

    invoke-virtual {v0}, Ll/۫᩷ܿ;->ۧ()Z

    move-result v1

    invoke-virtual {v0}, Ll/۫᩷ܿ;->֫()Z

    move-result v0

    invoke-static {v1, v0}, Ll/۫᩷ܿ;->֫(ZZ)I

    move-result v0

    return v0
.end method

.method public final ᩻(I)I
    .locals 1

    .line 143
    iget v0, p0, Ll/ۤ᩷ܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    iget-object v0, p0, Ll/ۤ᩷ܿ;->᩻:[I

    aget p1, v0, p1

    return p1
.end method
