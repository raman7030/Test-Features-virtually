.class public final Ll/֫ۨۢ;
.super Ljava/lang/Object;
.source "E6PC"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۜ:Ljava/lang/CharSequence;

.field public final ۢ:Z

.field public ۧ:Ll/ᩴ᩷ܿ;

.field public final ܳ:Ljava/lang/String;

.field public ܽ:J

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/util/ArrayList;

.field public final ᩷:I

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;Z)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۨۢ;->᩻:Ljava/util/ArrayList;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۨۢ;->ᩳ:Ljava/util/ArrayList;

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۨۢ;->֫:Ljava/util/ArrayList;

    const-string v0, "//__MTSX_FORMAT_DIRECTIVE_"

    .line 22
    iput-object v0, p0, Ll/֫ۨۢ;->ܿ:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Ll/֫ۨۢ;->ۜ:Ljava/lang/CharSequence;

    .line 28
    iput-boolean p3, p0, Ll/֫ۨۢ;->ۢ:Z

    .line 29
    iput p1, p0, Ll/֫ۨۢ;->᩷:I

    const/4 p1, 0x0

    .line 31
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const/16 v0, 0xa

    const/16 v1, 0xd

    if-ge p1, p3, :cond_0

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    if-eq p3, v1, :cond_0

    .line 32
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    if-eq p3, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ge p1, p3, :cond_2

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    if-ne p3, v1, :cond_2

    add-int/lit8 p1, p1, 0x1

    .line 34
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ge p1, p3, :cond_1

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-ne p1, v0, :cond_1

    const-string p1, "\r\n"

    goto :goto_1

    :cond_1
    const-string p1, "\r"

    goto :goto_1

    :cond_2
    const-string p1, "\n"

    :goto_1
    iput-object p1, p0, Ll/֫ۨۢ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public static ֫()V
    .locals 1

    .line 251
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public static ֫(Ljava/lang/CharSequence;ZILl/ᩴ᩷ܿ;)V
    .locals 18

    .line 38
    new-instance v0, Ll/֫ۨۢ;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct {v0, v3, v1, v2}, Ll/֫ۨۢ;-><init>(ILjava/lang/CharSequence;Z)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 56
    :goto_0
    iget-object v8, v0, Ll/֫ۨۢ;->ۜ:Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v9

    iget-object v10, v0, Ll/֫ۨۢ;->᩻:Ljava/util/ArrayList;

    if-ge v4, v9, :cond_1b

    .line 57
    invoke-static {}, Ll/֫ۨۢ;->֫()V

    move v9, v4

    .line 59
    :goto_1
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v11

    const/16 v12, 0xa

    const/16 v13, 0xd

    if-ge v9, v11, :cond_2

    invoke-interface {v8, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-eq v11, v13, :cond_2

    invoke-interface {v8, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-eq v11, v12, :cond_2

    and-int/lit16 v11, v9, 0xfff

    if-nez v11, :cond_0

    .line 60
    invoke-static {}, Ll/֫ۨۢ;->֫()V

    .line 61
    :cond_0
    invoke-interface {v8, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    .line 62
    invoke-static {v11}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v12

    if-nez v12, :cond_1

    const/16 v12, 0x2c

    if-eq v11, v12, :cond_1

    iget-wide v11, v0, Ll/֫ۨۢ;->ܽ:J

    const-wide/16 v13, 0x1

    add-long/2addr v11, v13

    iput-wide v11, v0, Ll/֫ۨۢ;->ܽ:J

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 66
    :cond_2
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v9, v11, :cond_3

    add-int/lit8 v11, v9, 0x1

    invoke-interface {v8, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    if-ne v14, v13, :cond_4

    .line 67
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-ge v11, v13, :cond_4

    invoke-interface {v8, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-ne v13, v12, :cond_4

    add-int/lit8 v11, v9, 0x2

    goto :goto_2

    :cond_3
    move v11, v9

    :cond_4
    :goto_2
    move v12, v4

    :goto_3
    if-ge v12, v9, :cond_6

    .line 69
    invoke-interface {v8, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    const/16 v14, 0x20

    if-eq v13, v14, :cond_5

    const/16 v14, 0x9

    if-eq v13, v14, :cond_5

    const/16 v14, 0xc

    if-ne v13, v14, :cond_6

    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_6
    const-string v13, "elif"

    const-string v14, "if"

    const-string v15, "endif"

    const-string v1, "else"

    if-eq v12, v9, :cond_e

    .line 112
    invoke-interface {v8, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x23

    if-eq v2, v3, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v2, v12, 0x1

    move v3, v2

    :goto_4
    if-ge v3, v9, :cond_8

    .line 114
    invoke-interface {v8, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v16

    if-nez v16, :cond_8

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 115
    :cond_8
    invoke-static {v2, v3, v8}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_5

    :sswitch_0
    const-string v3, "error"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_5

    :cond_9
    const/4 v3, 0x4

    goto :goto_6

    :sswitch_1
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_5

    :cond_a
    const/4 v3, 0x3

    goto :goto_6

    :sswitch_2
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_5

    :cond_b
    const/4 v3, 0x2

    goto :goto_6

    :sswitch_3
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_5

    :cond_c
    const/4 v3, 0x1

    goto :goto_6

    :sswitch_4
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_5

    :cond_d
    const/4 v3, 0x0

    goto :goto_6

    :goto_5
    const/4 v3, -0x1

    :goto_6
    packed-switch v3, :pswitch_data_0

    :cond_e
    :goto_7
    const/4 v2, 0x0

    :pswitch_0
    if-eqz v2, :cond_1a

    .line 72
    new-instance v3, Ll/۟ۛۢ;

    move/from16 v16, v9

    new-instance v9, Ll/۬۬ۡ;

    invoke-direct {v9, v6, v4, v8}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    const/4 v6, 0x0

    invoke-direct {v3, v9, v5, v6}, Ll/۟ۛۢ;-><init>(Ll/۬۬ۡ;Ll/᩺ۛۢ;Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v5, :cond_f

    const/4 v3, 0x0

    goto :goto_8

    .line 73
    :cond_f
    iget-object v3, v5, Ll/᩺ۛۢ;->ܽ:Ll/ܰۛۢ;

    .line 75
    :goto_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_1

    goto :goto_9

    :sswitch_5
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_9

    :cond_10
    const/4 v6, 0x3

    goto :goto_a

    :sswitch_6
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    goto :goto_9

    :cond_11
    const/4 v6, 0x2

    goto :goto_a

    :sswitch_7
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    goto :goto_9

    :cond_12
    const/4 v6, 0x1

    goto :goto_a

    :sswitch_8
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    goto :goto_9

    :cond_13
    const/4 v6, 0x0

    goto :goto_a

    :goto_9
    const/4 v6, -0x1

    :goto_a
    packed-switch v6, :pswitch_data_1

    const/4 v3, 0x0

    move-object v6, v5

    goto/16 :goto_c

    :pswitch_1
    const-string v5, "Unexpected #"

    if-eqz v3, :cond_17

    .line 83
    iget-object v6, v3, Ll/ܰۛۢ;->ܿ:Ll/᩺ۛۢ;

    .line 85
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    .line 88
    iget-boolean v1, v3, Ll/ܰۛۢ;->ۧ:Z

    if-nez v1, :cond_14

    iget v1, v3, Ll/ܰۛۢ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v3, Ll/ܰۛۢ;->֫:I

    :cond_14
    move-object v5, v6

    goto :goto_c

    .line 90
    :cond_15
    iget-boolean v9, v3, Ll/ܰۛۢ;->ۧ:Z

    if-nez v9, :cond_16

    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, v3, Ll/ܰۛۢ;->ۧ:Z

    .line 92
    new-instance v5, Ll/᩺ۛۢ;

    iget v1, v3, Ll/ܰۛۢ;->֫:I

    add-int/lit8 v9, v1, 0x1

    iput v9, v3, Ll/ܰۛۢ;->֫:I

    invoke-direct {v5, v3, v1}, Ll/᩺ۛۢ;-><init>(Ll/ܰۛۢ;I)V

    move-object/from16 v17, v6

    move-object v6, v5

    move-object/from16 v5, v17

    goto :goto_c

    :cond_16
    const-string v0, " after #else"

    .line 0
    invoke-static {v5, v2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 247
    new-instance v1, Ll/ۧۨۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v7, v2, v0}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 90
    throw v1

    :cond_17
    const/4 v0, 0x0

    .line 83
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 247
    new-instance v2, Ll/ۧۨۢ;

    invoke-direct {v2, v7, v0, v1}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 83
    throw v2

    :pswitch_2
    const/4 v1, 0x0

    if-eqz v5, :cond_19

    .line 77
    iget v3, v5, Ll/᩺ۛۢ;->ۧ:I

    const/16 v6, 0x80

    if-ge v3, v6, :cond_18

    goto :goto_b

    .line 247
    :cond_18
    new-instance v0, Ll/ۧۨۢ;

    const-string v2, "Directive nesting limit exceeded"

    invoke-direct {v0, v7, v1, v2}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 77
    throw v0

    .line 78
    :cond_19
    :goto_b
    new-instance v3, Ll/ܰۛۢ;

    iget-object v6, v0, Ll/֫ۨۢ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-direct {v3, v9, v5}, Ll/ܰۛۢ;-><init>(ILl/᩺ۛۢ;)V

    .line 79
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    new-instance v6, Ll/᩺ۛۢ;

    invoke-direct {v6, v3, v1}, Ll/᩺ۛۢ;-><init>(Ll/ܰۛۢ;I)V

    .line 97
    :goto_c
    new-instance v1, Ll/۟ۛۢ;

    new-instance v9, Ll/۬۬ۡ;

    invoke-direct {v9, v4, v11, v8}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    invoke-direct {v1, v9, v5, v2}, Ll/۟ۛۢ;-><init>(Ll/۬۬ۡ;Ll/᩺ۛۢ;Ljava/lang/String;)V

    move/from16 v4, v16

    .line 98
    invoke-static {v12, v4, v8}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/۟ۛۢ;->ܽ:Ljava/lang/String;

    .line 99
    iput-object v3, v1, Ll/۟ۛۢ;->ܿ:Ll/ܰۛۢ;

    .line 100
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v5, v6

    move v6, v11

    :cond_1a
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move v4, v11

    goto/16 :goto_0

    :cond_1b
    if-nez v5, :cond_1e

    .line 106
    new-instance v1, Ll/۟ۛۢ;

    new-instance v2, Ll/۬۬ۡ;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-direct {v2, v6, v3, v8}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Ll/۟ۛۢ;-><init>(Ll/۬۬ۡ;Ll/᩺ۛۢ;Ljava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    :goto_d
    iget-object v1, v0, Ll/֫ۨۢ;->ܿ:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1, v8, v2}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v1

    if-ltz v1, :cond_1c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, Ll/֫ۨۢ;->ܿ:Ljava/lang/String;

    const-string v3, "_"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 108
    iput-object v1, v0, Ll/֫ۨۢ;->ܿ:Ljava/lang/String;

    goto :goto_d

    .line 40
    :cond_1c
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1d

    .line 41
    invoke-static/range {p0 .. p3}, Ll/ܿۨۢ;->֫(Ljava/lang/CharSequence;ZILl/ᩴ᩷ܿ;)V

    return-void

    .line 45
    :cond_1d
    invoke-virtual/range {p3 .. p3}, Ll/ᩴ᩷ܿ;->֫()Ll/ᩴ᩷ܿ;

    move-result-object v1

    .line 46
    :try_start_0
    iput-object v1, v0, Ll/֫ۨۢ;->ۧ:Ll/ᩴ᩷ܿ;

    move-object/from16 v2, p3

    .line 47
    invoke-direct {v0, v2}, Ll/֫ۨۢ;->֫(Ll/ᩴ᩷ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    invoke-virtual {v1}, Ll/ᩴ᩷ܿ;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 45
    :try_start_1
    invoke-virtual {v1}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_e

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v2

    .line 247
    :cond_1e
    new-instance v0, Ll/ۧۨۢ;

    const-string v1, "Unclosed #if block"

    const/4 v2, 0x0

    invoke-direct {v0, v7, v2, v1}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 105
    throw v0

    :sswitch_data_0
    .sparse-switch
        0xd1d -> :sswitch_4
        0x2f8c04 -> :sswitch_3
        0x2f8d39 -> :sswitch_2
        0x5c2cb38 -> :sswitch_1
        0x5c4d208 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0xd1d -> :sswitch_8
        0x2f8c04 -> :sswitch_7
        0x2f8d39 -> :sswitch_6
        0x5c2cb38 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private ֫(Ll/۟ۛۢ;[ILl/ᩴ᩷ܿ;II)V
    .locals 1

    .line 202
    iget-object v0, p1, Ll/۟ۛۢ;->ᩳ:Ll/۬۬ۡ;

    if-nez v0, :cond_0

    iget-object v0, p1, Ll/۟ۛۢ;->֫:Ll/᩺ۛۢ;

    invoke-static {v0, p2}, Ll/֫ۨۢ;->֫(Ll/᩺ۛۢ;[I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 203
    iget-object p2, p0, Ll/֫ۨۢ;->ۧ:Ll/ᩴ᩷ܿ;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    .line 204
    iget-object v0, p0, Ll/֫ۨۢ;->ۧ:Ll/ᩴ᩷ܿ;

    invoke-virtual {v0, p4, p5, p3}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 205
    new-instance p3, Ll/۬۬ۡ;

    iget-object p4, p0, Ll/֫ۨۢ;->ۧ:Ll/ᩴ᩷ܿ;

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p5

    invoke-direct {p3, p2, p5, p4}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    iput-object p3, p1, Ll/۟ۛۢ;->ᩳ:Ll/۬۬ۡ;

    :cond_0
    return-void
.end method

.method private ֫(Ll/ᩴ᩷ܿ;)V
    .locals 10

    .line 123
    iget-object v0, p0, Ll/֫ۨۢ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [I

    .line 124
    invoke-direct {p0, v2}, Ll/֫ۨۢ;->֫([I)V

    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۛۢ;

    const/4 v6, 0x0

    .line 127
    :goto_0
    iget v7, v4, Ll/ܰۛۢ;->֫:I

    if-ge v6, v7, :cond_2

    invoke-direct {p0}, Ll/֫ۨۢ;->ۧ()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 128
    invoke-static {v2, v5}, Ljava/util/Arrays;->fill([II)V

    .line 129
    iget v7, v4, Ll/ܰۛۢ;->ᩳ:I

    aput v6, v2, v7

    .line 130
    iget-object v7, v4, Ll/ܰۛۢ;->ܿ:Ll/᩺ۛۢ;

    :goto_1
    if-eqz v7, :cond_1

    .line 131
    iget-object v8, v7, Ll/᩺ۛۢ;->ܽ:Ll/ܰۛۢ;

    iget v9, v8, Ll/ܰۛۢ;->ᩳ:I

    iget v7, v7, Ll/᩺ۛۢ;->֫:I

    aput v7, v2, v9

    .line 130
    iget-object v7, v8, Ll/ܰۛۢ;->ܿ:Ll/᩺ۛۢ;

    goto :goto_1

    .line 133
    :cond_1
    invoke-direct {p0, v2}, Ll/֫ۨۢ;->֫([I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 135
    :cond_2
    invoke-direct {p0}, Ll/֫ۨۢ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 138
    :cond_3
    invoke-static {v2, v5}, Ljava/util/Arrays;->fill([II)V

    .line 139
    :goto_2
    invoke-direct {p0}, Ll/֫ۨۢ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_5

    add-int/lit8 v3, v1, -0x1

    :goto_3
    if-ltz v3, :cond_5

    .line 217
    aget v4, v2, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v2, v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۛۢ;

    iget v6, v6, Ll/ܰۛۢ;->֫:I

    if-ge v4, v6, :cond_4

    .line 139
    invoke-direct {p0, v2}, Ll/֫ۨۢ;->֫([I)V

    goto :goto_2

    .line 218
    :cond_4
    aput v5, v2, v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 140
    :cond_5
    iget-object v0, p0, Ll/֫ۨۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۛۢ;

    .line 141
    iget-object v2, v1, Ll/۟ۛۢ;->ۧ:Ljava/lang/String;

    iget-object v3, v1, Ll/۟ۛۢ;->᩻:Ll/۬۬ۡ;

    if-nez v2, :cond_8

    .line 142
    iget-object v1, v1, Ll/۟ۛۢ;->ᩳ:Ll/۬۬ۡ;

    if-nez v1, :cond_7

    goto :goto_5

    :cond_7
    move-object v3, v1

    :goto_5
    invoke-virtual {p1, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_4

    .line 144
    :cond_8
    iget-object v2, v1, Ll/۟ۛۢ;->ܿ:Ll/ܰۛۢ;

    if-nez v2, :cond_9

    iget-object v2, v1, Ll/۟ۛۢ;->ܳ:Ljava/lang/String;

    goto :goto_6

    :cond_9
    iget-object v2, v2, Ll/ܰۛۢ;->ܽ:Ljava/lang/String;

    :goto_6
    if-nez v2, :cond_a

    .line 146
    invoke-virtual {p1, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_4

    .line 148
    :cond_a
    invoke-virtual {p1, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    move-result-object v2

    iget-object v1, v1, Ll/۟ۛۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 243
    invoke-virtual {v3}, Ll/۬۬ۡ;->length()I

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v3}, Ll/۬۬ۡ;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v3, v1}, Ll/۬۬ۡ;->charAt(I)C

    move-result v1

    const/16 v2, 0xd

    if-eq v1, v2, :cond_b

    const/16 v2, 0xa

    if-ne v1, v2, :cond_6

    .line 149
    :cond_b
    iget-object v1, p0, Ll/֫ۨۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_4

    :cond_c
    return-void
.end method

.method private ֫([I)V
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    .line 157
    iget-object v8, v7, Ll/֫ۨۢ;->᩻:Ljava/util/ArrayList;

    invoke-static {}, Ll/֫ۨۢ;->֫()V

    .line 158
    invoke-direct/range {p0 .. p0}, Ll/֫ۨۢ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 159
    :cond_0
    iget-object v1, v7, Ll/֫ۨۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    invoke-static {v3, v0}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_0
    return-void

    .line 160
    :cond_2
    invoke-virtual/range {p1 .. p1}, [I->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    iget-object v1, v7, Ll/֫ۨۢ;->ۧ:Ll/ᩴ᩷ܿ;

    invoke-virtual {v1}, Ll/ᩴ᩷ܿ;->֫()Ll/ᩴ᩷ܿ;

    move-result-object v9

    :try_start_0
    iget-object v1, v7, Ll/֫ۨۢ;->ۧ:Ll/ᩴ᩷ܿ;

    invoke-virtual {v1}, Ll/ᩴ᩷ܿ;->֫()Ll/ᩴ᩷ܿ;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v1, 0x0

    .line 162
    :goto_1
    :try_start_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v11, "__"

    const/16 v12, 0xa

    const/16 v13, 0xd

    const/4 v14, 0x1

    if-ge v1, v2, :cond_7

    .line 163
    :try_start_2
    invoke-static {}, Ll/֫ۨۢ;->֫()V

    .line 164
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۛۢ;

    .line 165
    iget-object v3, v2, Ll/۟ۛۢ;->ۧ:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v4, v2, Ll/۟ۛۢ;->᩻:Ll/۬۬ۡ;

    if-eqz v3, :cond_5

    .line 224
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v7, Ll/֫ۨۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 166
    invoke-virtual {v9, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 243
    invoke-virtual {v4}, Ll/۬۬ۡ;->length()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v4}, Ll/۬۬ۡ;->length()I

    move-result v2

    sub-int/2addr v2, v14

    invoke-virtual {v4, v2}, Ll/۬۬ۡ;->charAt(I)C

    move-result v2

    if-eq v2, v13, :cond_4

    if-ne v2, v12, :cond_3

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    :cond_4
    :goto_2
    if-eqz v14, :cond_6

    .line 167
    iget-object v2, v7, Ll/֫ۨۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v9, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_3

    .line 168
    :cond_5
    iget-object v2, v2, Ll/۟ۛۢ;->֫:Ll/᩺ۛۢ;

    invoke-static {v2, v0}, Ll/֫ۨۢ;->֫(Ll/᩺ۛۢ;[I)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 169
    invoke-virtual {v9, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_6
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 173
    :cond_7
    :try_start_4
    iget-boolean v1, v7, Ll/֫ۨۢ;->ۢ:Z

    iget v2, v7, Ll/֫ۨۢ;->᩷:I

    invoke-static {v9, v1, v2, v10}, Ll/ܿۨۢ;->֫(Ljava/lang/CharSequence;ZILl/ᩴ᩷ܿ;)V
    :try_end_4
    .catch Ll/ۧۨۢ; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/4 v15, 0x1

    .line 179
    :goto_4
    :try_start_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v15, v1, :cond_f

    .line 180
    invoke-static {}, Ll/֫ۨۢ;->֫()V

    .line 181
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ll/۟ۛۢ;

    .line 224
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v7, Ll/֫ۨۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 183
    invoke-static {v4, v10, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v3

    move v2, v3

    :goto_5
    if-le v2, v5, :cond_a

    add-int/lit8 v1, v2, -0x1

    .line 185
    invoke-interface {v10, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-eq v1, v13, :cond_9

    if-ne v1, v12, :cond_8

    goto :goto_6

    :cond_8
    const/4 v1, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v1, 0x1

    :goto_7
    if-nez v1, :cond_a

    add-int/lit8 v2, v2, -0x1

    goto :goto_5

    :cond_a
    add-int/lit8 v1, v15, -0x1

    .line 186
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ll/۟ۛۢ;

    move-object/from16 v1, p0

    move/from16 v17, v2

    move-object/from16 v2, v16

    move v14, v3

    move-object/from16 v3, p1

    move-object/from16 v18, v4

    move-object v4, v10

    move-object v12, v6

    move/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Ll/֫ۨۢ;->֫(Ll/۟ۛۢ;[ILl/ᩴ᩷ܿ;II)V

    .line 187
    iget-object v1, v12, Ll/۟ۛۢ;->֫:Ll/᩺ۛۢ;

    invoke-static {v1, v0}, Ll/֫ۨۢ;->֫(Ll/᩺ۛۢ;[I)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v12, Ll/۟ۛۢ;->ܳ:Ljava/lang/String;

    if-nez v1, :cond_b

    move/from16 v2, v17

    .line 188
    invoke-static {v2, v14, v10}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v12, Ll/۟ۛۢ;->ܳ:Ljava/lang/String;

    .line 189
    iget-object v1, v12, Ll/۟ۛۢ;->ۧ:Ljava/lang/String;

    const-string v2, "if"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v12, Ll/۟ۛۢ;->ܿ:Ll/ܰۛۢ;

    iget-object v2, v1, Ll/ܰۛۢ;->ܽ:Ljava/lang/String;

    if-nez v2, :cond_b

    .line 190
    iget-object v2, v12, Ll/۟ۛۢ;->ܳ:Ljava/lang/String;

    iput-object v2, v1, Ll/ܰۛۢ;->ܽ:Ljava/lang/String;

    .line 193
    :cond_b
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    add-int v3, v14, v1

    .line 194
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v3, v1, :cond_c

    invoke-interface {v10, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v13, :cond_c

    add-int/lit8 v3, v3, 0x1

    .line 195
    :cond_c
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v3, v1, :cond_d

    invoke-interface {v10, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_e

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_d
    const/16 v2, 0xa

    :cond_e
    :goto_8
    move v5, v3

    add-int/lit8 v15, v15, 0x2

    const/16 v12, 0xa

    const/4 v14, 0x1

    goto/16 :goto_4

    .line 197
    :cond_f
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/۟ۛۢ;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v6

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object v4, v10

    invoke-direct/range {v1 .. v6}, Ll/֫ۨۢ;->֫(Ll/۟ۛۢ;[ILl/ᩴ᩷ܿ;II)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 198
    :try_start_6
    invoke-virtual {v10}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-virtual {v9}, Ll/ᩴ᩷ܿ;->close()V

    return-void

    :catch_0
    :try_start_7
    invoke-virtual {v10}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-virtual {v9}, Ll/ᩴ᩷ܿ;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 161
    :try_start_8
    invoke-virtual {v10}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_9
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    :try_start_a
    invoke-virtual {v9}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v1
.end method

.method public static ֫(Ll/᩺ۛۢ;[I)Z
    .locals 2

    :goto_0
    if-eqz p0, :cond_1

    .line 229
    iget-object v0, p0, Ll/᩺ۛۢ;->ܽ:Ll/ܰۛۢ;

    iget v1, v0, Ll/ܰۛۢ;->ᩳ:I

    aget v1, p1, v1

    iget p0, p0, Ll/᩺ۛۢ;->֫:I

    if-eq v1, p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 228
    :cond_0
    iget-object p0, v0, Ll/ܰۛۢ;->ܿ:Ll/᩺ۛۢ;

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private ۧ()Z
    .locals 8

    .line 211
    iget-object v0, p0, Ll/֫ۨۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Ll/֫ۨۢ;->ܽ:J

    const-wide/16 v4, 0x1

    .line 212
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const-wide/32 v6, 0x800000

    div-long/2addr v6, v2

    const-wide/16 v2, 0x40

    .line 211
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
