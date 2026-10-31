.class public final Ll/᩷᩸ᩳ;
.super Ll/۟ܶۡ;
.source "Q92M"


# instance fields
.field public final synthetic ۖ:Ll/۫ۨᩳ;

.field public final synthetic ۘ:I

.field public ۜ:Ljava/lang/CharSequence;

.field public final synthetic ۡ:Ll/ۗܺ᩷;

.field public final ۢ:Ll/ۡ᩹ۡ;

.field public volatile ܳ:Z

.field public final synthetic ܺ:Ljava/nio/charset/Charset;

.field public final synthetic ᩴ:Ll/ۨ᩵ᩳ;

.field public final synthetic ᩵:[I

.field public ᩷:Ll/᩺ۘᩳ;

.field public ᩻:Ll/۟᩸ᩳ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/ۨ᩵ᩳ;[ILl/ܽ֨ᩳ;Ljava/nio/charset/Charset;I)V
    .locals 0

    .line 29
    iput-object p1, p0, Ll/᩷᩸ᩳ;->ۖ:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/᩷᩸ᩳ;->ᩴ:Ll/ۨ᩵ᩳ;

    iput-object p3, p0, Ll/᩷᩸ᩳ;->᩵:[I

    iput-object p4, p0, Ll/᩷᩸ᩳ;->ۡ:Ll/ۗܺ᩷;

    iput-object p5, p0, Ll/᩷᩸ᩳ;->ܺ:Ljava/nio/charset/Charset;

    iput p6, p0, Ll/᩷᩸ᩳ;->ۘ:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 32
    invoke-static {p1}, Ll/ۡ᩹ۡ;->֫(Ll/۫ۨᩳ;)Ll/ۡ᩹ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩸ᩳ;->ۢ:Ll/ۡ᩹ۡ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩷᩸ᩳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Ll/᩷᩸ᩳ;->ܳ:Z

    .line 45
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 104
    iget-boolean v0, p0, Ll/᩷᩸ᩳ;->ܳ:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/᩷᩸ᩳ;->ۢ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 105
    :cond_0
    iget-object v0, p0, Ll/᩷᩸ᩳ;->ۡ:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 106
    iget-object v1, p0, Ll/᩷᩸ᩳ;->᩵:[I

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    if-eq v2, v1, :cond_1

    const v1, 0x7f1209da

    goto :goto_0

    :cond_1
    const v1, 0x7f12060e

    :goto_0
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, p0, Ll/᩷᩸ᩳ;->ۜ:Ljava/lang/CharSequence;

    .line 107
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const v1, 0x7f120189

    const/4 v2, 0x0

    .line 108
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 109
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 110
    invoke-static {v0}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 115
    iget-boolean v0, p0, Ll/᩷᩸ᩳ;->ܳ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩷᩸ᩳ;->ۢ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    iget-object v0, p0, Ll/᩷᩸ᩳ;->ۡ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 38
    iget-object v0, p0, Ll/᩷᩸ᩳ;->ۖ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩷᩸ᩳ;->᩻:Ll/۟᩸ᩳ;

    .line 39
    iget-object v0, p0, Ll/᩷᩸ᩳ;->ᩴ:Ll/ۨ᩵ᩳ;

    if-eqz v0, :cond_0

    iget-object v1, v0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܰۘᩳ;->ܽ()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    const/4 v1, 0x0

    iget-object v3, p0, Ll/᩷᩸ᩳ;->᩵:[I

    aget v1, v3, v1

    aget v2, v3, v2

    if-ne v1, v2, :cond_0

    .line 40
    iget-object v1, v0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    iget v2, v0, Ll/ۨ᩵ᩳ;->᩷:I

    iget-object v3, p0, Ll/᩷᩸ᩳ;->᩻:Ll/۟᩸ᩳ;

    iget-object v0, v0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    iget-object v0, v0, Ll/᩻ᩴᩳ;->ۖ:Ll/ۜ֡ᩳ;

    invoke-virtual {v1, v2, v3, v0}, Ll/ܰۘᩳ;->֫(ILjava/lang/CharSequence;Ll/ۜ֡ᩳ;)Ll/᩺ۘᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩷᩸ᩳ;->᩷:Ll/᩺ۘᩳ;

    .line 42
    :cond_0
    iget-object v0, p0, Ll/᩷᩸ᩳ;->ۡ:Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    .line 43
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v1, Ll/᩻᩸ᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/᩻᩸ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 37

    move-object/from16 v1, p0

    .line 56
    iget-object v0, v1, Ll/᩷᩸ᩳ;->ܺ:Ljava/nio/charset/Charset;

    const-string v2, "\n"

    iget-object v12, v1, Ll/᩷᩸ᩳ;->᩻:Ll/۟᩸ᩳ;

    .line 51
    :try_start_0
    iget-boolean v3, v1, Ll/᩷᩸ᩳ;->ܳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const-string v13, "Text statistics canceled"

    if-nez v3, :cond_7

    .line 58
    :try_start_1
    new-instance v3, Ll/ۜ᩸ᩳ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1}, Ll/ۜ᩸ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v12, v3}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 59
    iget-object v3, v1, Ll/᩷᩸ᩳ;->᩵:[I

    const/4 v4, 0x0

    aget v4, v3, v4

    const/4 v5, 0x1

    aget v3, v3, v5

    if-eq v4, v3, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v5, :cond_2

    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->length()I

    move-result v3

    :goto_2
    move v5, v3

    .line 63
    iget-object v3, v1, Ll/᩷᩸ᩳ;->᩷:Ll/᩺ۘᩳ;

    if-nez v3, :cond_3

    .line 64
    iget-object v6, v1, Ll/᩷᩸ᩳ;->ܺ:Ljava/nio/charset/Charset;

    iget v7, v1, Ll/᩷᩸ᩳ;->ۘ:I

    new-instance v8, Ll/ۜ᩸ᩳ;

    const/4 v0, 0x0

    invoke-direct {v8, v0, v1}, Ll/ۜ᩸ᩳ;-><init>(ILjava/lang/Object;)V

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v9, 0x0

    move-object v3, v12

    invoke-static/range {v3 .. v11}, Ll/ܺ᩸ᩳ;->֫(Ll/۟᩸ᩳ;IILjava/nio/charset/Charset;ILjava/lang/Runnable;Ll/ۖ᩸ᩳ;Ljava/io/OutputStreamWriter;Z)Ll/ۡ᩸ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ᩸ᩳ;->֫()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ll/᩷᩸ᩳ;->ۜ:Ljava/lang/CharSequence;

    goto/16 :goto_6

    .line 66
    :cond_3
    new-instance v3, Ll/ۡ᩸ᩳ;

    const-wide/16 v23, 0x1

    const/16 v25, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    move-object v14, v3

    invoke-direct/range {v14 .. v25}, Ll/ۡ᩸ᩳ;-><init>(JJJJJI)V

    .line 67
    new-instance v14, Ll/ۖ᩸ᩳ;

    .line 6
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v15, Ll/ۢ᩸ᩳ;

    .line 136
    invoke-direct {v15}, Ljava/io/OutputStream;-><init>()V

    .line 70
    new-instance v11, Ljava/io/OutputStreamWriter;

    invoke-direct {v11, v15, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    const/4 v4, 0x0

    move-object v10, v3

    const/4 v9, 0x0

    .line 71
    :goto_3
    :try_start_2
    iget-object v3, v1, Ll/᩷᩸ᩳ;->᩷:Ll/᩺ۘᩳ;

    .line 198
    iget-object v3, v3, Ll/᩺ۘᩳ;->ۗ:Ll/ܰۘᩳ;

    invoke-virtual {v3}, Ll/ܰۘᩳ;->ܽ()I

    move-result v3

    if-ge v9, v3, :cond_6

    .line 51
    iget-boolean v3, v1, Ll/᩷᩸ᩳ;->ܳ:Z

    if-nez v3, :cond_5

    .line 73
    iget-object v3, v1, Ll/᩷᩸ᩳ;->᩷:Ll/᩺ۘᩳ;

    invoke-virtual {v3}, Ll/᩺ۘᩳ;->֫()I

    move-result v3

    if-ne v9, v3, :cond_4

    .line 74
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->length()I

    move-result v5

    iget-object v6, v1, Ll/᩷᩸ᩳ;->ܺ:Ljava/nio/charset/Charset;

    iget v7, v1, Ll/᩷᩸ᩳ;->ۘ:I

    new-instance v8, Ll/ۜ᩸ᩳ;

    const/4 v3, 0x0

    invoke-direct {v8, v3, v1}, Ll/ۜ᩸ᩳ;-><init>(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    const/16 v16, 0x1

    const/4 v4, 0x0

    move-object v3, v12

    move/from16 v35, v9

    move-object v9, v14

    move-object/from16 v36, v10

    move-object v10, v11

    move-object/from16 v17, v11

    move/from16 v11, v16

    :try_start_3
    invoke-static/range {v3 .. v11}, Ll/ܺ᩸ᩳ;->֫(Ll/۟᩸ᩳ;IILjava/nio/charset/Charset;ILjava/lang/Runnable;Ll/ۖ᩸ᩳ;Ljava/io/OutputStreamWriter;Z)Ll/ۡ᩸ᩳ;

    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ll/ۡ᩸ᩳ;->֫()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Ll/᩷᩸ᩳ;->ۜ:Ljava/lang/CharSequence;

    move-object/from16 v4, v36

    .line 77
    invoke-virtual {v4, v3}, Ll/ۡ᩸ᩳ;->֫(Ll/ۡ᩸ᩳ;)Ll/ۡ᩸ᩳ;

    move-result-object v3

    move-object v10, v3

    move/from16 v5, v35

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_4
    move/from16 v35, v9

    move-object v4, v10

    move-object/from16 v17, v11

    .line 79
    iget-object v3, v1, Ll/᩷᩸ᩳ;->᩷:Ll/᩺ۘᩳ;

    move/from16 v5, v35

    invoke-virtual {v3, v5}, Ll/᩺ۘᩳ;->֫(I)Ll/۟᩸ᩳ;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 80
    :try_start_4
    new-instance v6, Ll/ۜ᩸ᩳ;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v1}, Ll/ۜ᩸ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v6}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 81
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->length()I

    move-result v28

    iget-object v6, v1, Ll/᩷᩸ᩳ;->ܺ:Ljava/nio/charset/Charset;

    iget v7, v1, Ll/᩷᩸ᩳ;->ۘ:I

    new-instance v8, Ll/ۜ᩸ᩳ;

    const/4 v9, 0x0

    invoke-direct {v8, v9, v1}, Ll/ۜ᩸ᩳ;-><init>(ILjava/lang/Object;)V

    const/16 v34, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v3

    move-object/from16 v29, v6

    move/from16 v30, v7

    move-object/from16 v31, v8

    move-object/from16 v32, v14

    move-object/from16 v33, v17

    invoke-static/range {v26 .. v34}, Ll/ܺ᩸ᩳ;->֫(Ll/۟᩸ᩳ;IILjava/nio/charset/Charset;ILjava/lang/Runnable;Ll/ۖ᩸ᩳ;Ljava/io/OutputStreamWriter;Z)Ll/ۡ᩸ᩳ;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/ۡ᩸ᩳ;->֫(Ll/ۡ᩸ᩳ;)Ll/ۡ᩸ᩳ;

    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 83
    :try_start_5
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object v10, v4

    :goto_4
    add-int/lit8 v9, v5, 0x1

    move-object/from16 v11, v17

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 79
    :try_start_6
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_7
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2

    :cond_5
    move-object/from16 v17, v11

    .line 51
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0, v13}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_6
    move-object v4, v10

    move-object/from16 v17, v11

    .line 86
    :try_start_8
    invoke-virtual/range {v17 .. v17}, Ljava/io/Writer;->close()V

    .line 87
    iget v3, v1, Ll/᩷᩸ᩳ;->ۘ:I

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    sub-int/2addr v3, v0

    .line 88
    new-instance v0, Ll/ۡ᩸ᩳ;

    iget-wide v5, v15, Ll/ۢ᩸ᩳ;->᩸:J

    invoke-static {v4}, Ll/ۡ᩸ᩳ;->ᩳ(Ll/ۡ᩸ᩳ;)J

    move-result-wide v7

    const-wide/16 v9, 0x1

    sub-long/2addr v7, v9

    int-to-long v9, v3

    mul-long v7, v7, v9

    add-long v17, v7, v5

    invoke-static {v4}, Ll/ۡ᩸ᩳ;->ۧ(Ll/ۡ᩸ᩳ;)J

    move-result-wide v19

    .line 89
    invoke-virtual {v14}, Ll/ۖ᩸ᩳ;->֫()J

    move-result-wide v21

    invoke-static {v4}, Ll/ۡ᩸ᩳ;->ܽ(Ll/ۡ᩸ᩳ;)J

    move-result-wide v23

    invoke-static {v4}, Ll/ۡ᩸ᩳ;->ᩳ(Ll/ۡ᩸ᩳ;)J

    move-result-wide v25

    const/16 v27, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v27}, Ll/ۡ᩸ᩳ;-><init>(JJJJJI)V

    .line 90
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    const v4, 0x7f1209dc

    .line 91
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Landroid/text/style/StyleSpan;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    new-instance v6, Landroid/text/style/RelativeSizeSpan;

    const v7, 0x3f866666    # 1.05f

    invoke-direct {v6, v7}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 96
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    .line 97
    invoke-virtual {v3, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 98
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    const/16 v9, 0x11

    invoke-virtual {v3, v5, v8, v4, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 99
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v3, v6, v8, v4, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 93
    invoke-virtual {v3, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v4

    iget-object v5, v1, Ll/᩷᩸ᩳ;->ۜ:Ljava/lang/CharSequence;

    invoke-virtual {v4, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const-string v4, "\n \n"

    .line 94
    new-instance v5, Landroid/text/style/AbsoluteSizeSpan;

    const/4 v6, 0x4

    const/4 v8, 0x1

    invoke-direct {v5, v6, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 90
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    .line 91
    invoke-virtual {v3, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 92
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v3, v5, v6, v4, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const v4, 0x7f1209db

    .line 95
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Landroid/text/style/StyleSpan;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    new-instance v6, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {v6, v7}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 96
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v7

    .line 97
    invoke-virtual {v3, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 98
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v3, v5, v7, v4, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 99
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v3, v6, v7, v4, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 97
    invoke-virtual {v3, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۡ᩸ᩳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    iput-object v3, v1, Ll/᩷᩸ᩳ;->ۜ:Ljava/lang/CharSequence;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 99
    :goto_6
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_3
    move-exception v0

    move-object/from16 v17, v11

    :goto_7
    move-object v2, v0

    .line 70
    :try_start_9
    invoke-virtual/range {v17 .. v17}, Ljava/io/Writer;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2

    .line 51
    :cond_7
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0, v13}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception v0

    move-object v2, v0

    if-eqz v12, :cond_8

    .line 56
    :try_start_b
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_9
    throw v2
.end method

.method public final ᩳ()V
    .locals 1

    .line 121
    iget-object v0, p0, Ll/᩷᩸ᩳ;->᩻:Ll/۟᩸ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    .line 122
    :cond_0
    iget-object v0, p0, Ll/᩷᩸ᩳ;->᩷:Ll/᩺ۘᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩺ۘᩳ;->close()V

    .line 123
    :cond_1
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
