.class public final Ll/۬ܰᩳ;
.super Ljava/lang/Object;
.source "E6SN"


# instance fields
.field public final ֡:F

.field public final ֨:I

.field public final ֫:Z

.field public final ۖ:F

.field public final ۘ:Ljava/lang/String;

.field public final ۚ:Z

.field public final ۜ:Ljava/lang/String;

.field public final ۡ:Z

.field public final ۢ:F

.field public final ۧ:Z

.field public final ܳ:Z

.field public final ܺ:Z

.field public final ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:I

.field public final ᩴ:I

.field public final ᩵:Ljava/lang/Integer;

.field public final ᩷:Z

.field public final ᩻:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIFFFZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    move-object v0, p0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 23
    iput-object v1, v0, Ll/۬ܰᩳ;->ۜ:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Ll/۬ܰᩳ;->ۘ:Ljava/lang/String;

    move v1, p3

    iput v1, v0, Ll/۬ܰᩳ;->ᩳ:I

    move v1, p4

    iput v1, v0, Ll/۬ܰᩳ;->ᩴ:I

    move v1, p5

    .line 24
    iput v1, v0, Ll/۬ܰᩳ;->֨:I

    move v1, p6

    iput v1, v0, Ll/۬ܰᩳ;->֡:F

    move v1, p9

    iput-boolean v1, v0, Ll/۬ܰᩳ;->᩷:Z

    move v1, p7

    .line 25
    iput v1, v0, Ll/۬ܰᩳ;->ۢ:F

    move v1, p8

    iput v1, v0, Ll/۬ܰᩳ;->ۖ:F

    move v1, p10

    .line 26
    iput-boolean v1, v0, Ll/۬ܰᩳ;->ܽ:Z

    move v1, p11

    iput-boolean v1, v0, Ll/۬ܰᩳ;->ܿ:Z

    move v1, p12

    iput-boolean v1, v0, Ll/۬ܰᩳ;->ۡ:Z

    move v1, p13

    .line 27
    iput-boolean v1, v0, Ll/۬ܰᩳ;->ܺ:Z

    move/from16 v1, p14

    iput-boolean v1, v0, Ll/۬ܰᩳ;->ܳ:Z

    move/from16 v1, p15

    iput-boolean v1, v0, Ll/۬ܰᩳ;->ۧ:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Ll/۬ܰᩳ;->ۚ:Z

    move/from16 v1, p17

    .line 28
    iput-boolean v1, v0, Ll/۬ܰᩳ;->֫:Z

    move-object/from16 v1, p18

    iput-object v1, v0, Ll/۬ܰᩳ;->᩵:Ljava/lang/Integer;

    move-object/from16 v1, p19

    iput-object v1, v0, Ll/۬ܰᩳ;->᩻:Ljava/lang/Integer;

    return-void
.end method

.method public static ֫(Ljava/io/ByteArrayInputStream;JI)Ll/۬ܰᩳ;
    .locals 27

    move-wide/from16 v0, p1

    move-object/from16 v2, p0

    move/from16 v3, p3

    .line 33
    invoke-static {v0, v1, v2}, Ll/᩻᩶ᩳ;->֫(JLjava/io/InputStream;)Ll/᩻᩶ᩳ;

    move-result-object v2

    if-ltz v3, :cond_a

    int-to-long v4, v3

    cmp-long v6, v0, v4

    if-gtz v6, :cond_a

    .line 35
    :try_start_0
    invoke-virtual {v2, v3}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v8

    .line 36
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v16

    .line 37
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v0

    int-to-byte v10, v0

    .line 49
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 39
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->ۛۧ()I

    move-result v11

    .line 40
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v17

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v18

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v19

    .line 41
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v20

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v21

    const/4 v0, 0x0

    if-eqz v21, :cond_0

    .line 42
    invoke-virtual {v2, v3}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object v9, v0

    .line 43
    :goto_0
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->ܽ()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v1, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_1

    const/4 v3, 0x0

    const/4 v12, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v3

    move v12, v3

    :goto_1
    const v3, 0x23456223

    const/4 v4, 0x0

    if-lt v12, v3, :cond_9

    const v3, 0x23456228

    if-gt v12, v3, :cond_8

    .line 49
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v5

    const v6, 0x23456225

    if-lt v12, v6, :cond_2

    .line 50
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    const v7, 0x23456224

    if-lt v12, v7, :cond_3

    .line 51
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v1

    :cond_3
    const v7, 0x23456226

    if-lt v12, v7, :cond_4

    .line 52
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_3

    :cond_4
    move-object v7, v0

    :goto_3
    const v14, 0x23456227

    if-lt v12, v14, :cond_5

    .line 53
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_5
    if-lt v12, v3, :cond_7

    .line 49
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    const v15, 0x3f4ccccd    # 0.8f

    cmpl-float v15, v3, v15

    if-ltz v15, :cond_6

    const/high16 v15, 0x40000000    # 2.0f

    cmpg-float v15, v3, v15

    if-gtz v15, :cond_6

    cmpl-float v4, v14, v4

    if-ltz v4, :cond_6

    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v4, v14, v4

    if-gez v4, :cond_6

    move-object/from16 v26, v0

    move/from16 v24, v1

    move/from16 v22, v5

    move/from16 v23, v6

    move-object/from16 v25, v7

    move v15, v14

    move v14, v3

    goto :goto_4

    .line 58
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid line metrics"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    move-object/from16 v26, v0

    move/from16 v24, v1

    move/from16 v22, v5

    move/from16 v23, v6

    move-object/from16 v25, v7

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    goto :goto_4

    .line 48
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported legacy text config version"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_9
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->ܳ()V

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v25, v0

    move-object/from16 v26, v25

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 64
    :goto_4
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->ᩳ()V

    .line 65
    new-instance v0, Ll/۬ܰᩳ;

    move-object v7, v0

    invoke-direct/range {v7 .. v26}, Ll/۬ܰᩳ;-><init>(Ljava/lang/String;Ljava/lang/String;IIIFFFZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->close()V

    return-object v0

    .line 34
    :cond_a
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy text config exceeds app state limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 33
    :try_start_2
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v1
.end method


# virtual methods
.method public final ֫(Ll/᩺֫ܿ;)V
    .locals 2

    .line 72
    iget-object v0, p0, Ll/۬ܰᩳ;->ۜ:Ljava/lang/String;

    iput-object v0, p1, Ll/᩺֫ܿ;->᩸ۧ:Ljava/lang/String;

    iget-boolean v0, p0, Ll/۬ܰᩳ;->᩷:Z

    iput-boolean v0, p1, Ll/᩺֫ܿ;->۫ۧ:Z

    .line 73
    iget v0, p0, Ll/۬ܰᩳ;->ᩳ:I

    iget v1, p0, Ll/۬ܰᩳ;->֡:F

    invoke-virtual {p1, v1, v0}, Ll/᩺֫ܿ;->֫(FI)V

    iget v0, p0, Ll/۬ܰᩳ;->ᩴ:I

    invoke-virtual {p1, v0}, Ll/ۢ۫ۡ;->֫(I)V

    .line 74
    iget v0, p0, Ll/۬ܰᩳ;->ۢ:F

    invoke-virtual {p1, v0}, Ll/᩺֫ܿ;->֫(F)V

    .line 75
    iget-boolean v0, p0, Ll/۬ܰᩳ;->ܽ:Z

    invoke-virtual {p1, v0}, Ll/ۢ۫ۡ;->֫(Z)V

    iget-boolean v0, p0, Ll/۬ܰᩳ;->ܿ:Z

    invoke-virtual {p1, v0}, Ll/ۢ۫ۡ;->ۧ(Z)V

    .line 76
    iget-boolean v0, p0, Ll/۬ܰᩳ;->ۡ:Z

    iput-boolean v0, p1, Ll/᩺֫ܿ;->֡ۧ:Z

    iget-boolean v0, p0, Ll/۬ܰᩳ;->ܺ:Z

    iput-boolean v0, p1, Ll/᩺֫ܿ;->ܶۧ:Z

    iget-boolean v0, p0, Ll/۬ܰᩳ;->ܳ:Z

    iput-boolean v0, p1, Ll/᩺֫ܿ;->ܰۧ:Z

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Ll/۬ܰᩳ;->ۘ:Ljava/lang/String;

    iput-object v0, p1, Ll/᩺֫ܿ;->᩺ۧ:Ljava/lang/String;

    :cond_0
    const v0, 0x23456223

    .line 78
    iget v1, p0, Ll/۬ܰᩳ;->֨:I

    if-ge v1, v0, :cond_1

    return-void

    .line 79
    :cond_1
    iget-boolean v0, p0, Ll/۬ܰᩳ;->ۧ:Z

    invoke-virtual {p1, v0}, Ll/ۢ۫ۡ;->ܽ(Z)V

    const v0, 0x23456225

    if-lt v1, v0, :cond_2

    .line 80
    iget-boolean v0, p0, Ll/۬ܰᩳ;->ۚ:Z

    invoke-virtual {p1, v0}, Ll/ۢ۫ۡ;->ᩳ(Z)V

    :cond_2
    const v0, 0x23456224

    if-lt v1, v0, :cond_3

    .line 81
    iget-boolean v0, p0, Ll/۬ܰᩳ;->֫:Z

    iput-boolean v0, p1, Ll/᩺֫ܿ;->ۨۧ:Z

    .line 82
    :cond_3
    iget-object v0, p0, Ll/۬ܰᩳ;->᩵:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Ll/᩺֫ܿ;->ۧ(Ljava/lang/Integer;)V

    iget-object v0, p0, Ll/۬ܰᩳ;->᩻:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Ll/᩺֫ܿ;->֫(Ljava/lang/Integer;)V

    return-void
.end method
