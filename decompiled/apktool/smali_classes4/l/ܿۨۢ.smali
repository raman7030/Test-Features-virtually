.class public final Ll/ܿۨۢ;
.super Ljava/lang/Object;
.source "H6OO"


# instance fields
.field public final ֫:[Ll/ᩳۨۢ;

.field public final ۜ:Ll/ᩴ᩷ܿ;

.field public final ۡ:Ljava/util/List;

.field public final ۢ:I

.field public ۧ:I

.field public final ܳ:Ljava/lang/String;

.field public final ܺ:[I

.field public final ܽ:[I

.field public final ܿ:[Z

.field public final ᩳ:Ljava/lang/String;

.field public final ᩷:[Z

.field public final ᩻:[Ll/ᩳۨۢ;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/util/ArrayList;ZILl/ᩴ᩷ܿ;)V
    .locals 3

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p2, p0, Ll/ܿۨۢ;->ۡ:Ljava/util/List;

    const/4 v0, 0x1

    .line 92
    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Ll/ܿۨۢ;->ۢ:I

    if-eqz p3, :cond_0

    const-string p3, "\t"

    goto :goto_0

    :cond_0
    const/16 p3, 0x20

    .line 93
    invoke-static {p3, p4}, Ll/ۢܺ֡;->֫(CI)Ljava/lang/String;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Ll/ܿۨۢ;->ᩳ:Ljava/lang/String;

    const/4 p3, 0x0

    .line 330
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    const-string v1, "\n"

    if-ge p3, p4, :cond_4

    .line 331
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p4

    const/16 v2, 0xa

    if-ne p4, v2, :cond_1

    goto :goto_2

    :cond_1
    const/16 v1, 0xd

    if-ne p4, v1, :cond_3

    add-int/2addr p3, v0

    .line 333
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ge p3, p4, :cond_2

    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-ne p1, v2, :cond_2

    const-string v1, "\r\n"

    goto :goto_2

    :cond_2
    const-string v1, "\r"

    goto :goto_2

    :cond_3
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 94
    :cond_4
    :goto_2
    iput-object v1, p0, Ll/ܿۨۢ;->ܳ:Ljava/lang/String;

    .line 95
    iput-object p5, p0, Ll/ܿۨۢ;->ۜ:Ll/ᩴ᩷ܿ;

    .line 96
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/ᩳۨۢ;

    iput-object p1, p0, Ll/ܿۨۢ;->᩻:[Ll/ᩳۨۢ;

    .line 97
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/ᩳۨۢ;

    iput-object p1, p0, Ll/ܿۨۢ;->֫:[Ll/ᩳۨۢ;

    .line 98
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ܿۨۢ;->ܿ:[Z

    .line 99
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ܿۨۢ;->᩷:[Z

    .line 100
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܿۨۢ;->ܽ:[I

    .line 101
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/2addr p1, v0

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܿۨۢ;->ܺ:[I

    return-void
.end method

.method public static ֫()V
    .locals 1

    .line 352
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

    move-object/from16 v6, p0

    .line 55
    invoke-static {}, Ll/ܿۨۢ;->֫()V

    .line 58
    :try_start_0
    new-instance v0, Ll/ۨܿ֡;

    new-instance v1, Ll/۟ۛۡ;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ll/۟ۛۡ;-><init>(I)V

    invoke-direct {v0, v6, v1}, Ll/ۨܿ֡;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ll/ۜۤۢ; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    new-instance v1, Ll/ܳۨۢ;

    invoke-direct {v1, v0}, Ll/ܳۨۢ;-><init>(Ll/ۨܿ֡;)V

    .line 63
    new-instance v7, Ll/ܽۨۢ;

    .line 20
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-virtual {v1}, Ll/ᩴܳ֡;->ۢ()V

    .line 71
    invoke-virtual {v1, v7}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 72
    new-instance v8, Ll/֫ܳ֡;

    invoke-direct {v8, v1}, Ll/֫ܳ֡;-><init>(Ll/᩻ܳ֡;)V

    .line 73
    invoke-virtual {v8}, Ll/֫ܳ֡;->ܽ()V

    const/4 v0, 0x1

    .line 74
    invoke-virtual {v8, v0}, Ll/֫ܳ֡;->ۧ(I)I

    move-result v0

    const/4 v9, -0x1

    if-ne v0, v9, :cond_0

    move-object/from16 v5, p3

    invoke-virtual {v5, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    :cond_0
    move-object/from16 v5, p3

    .line 75
    new-instance v10, Ll/ܿۨۢ;

    invoke-virtual {v8}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object v11

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v11

    move/from16 v3, p1

    move/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Ll/ܿۨۢ;-><init>(Ljava/lang/CharSequence;Ljava/util/ArrayList;ZILl/ᩴ᩷ܿ;)V

    .line 106
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 108
    :goto_0
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/16 v4, 0x41

    const/16 v5, 0x35

    const/16 v12, 0x40

    iget-object v13, v10, Ll/ܿۨۢ;->֫:[Ll/ᩳۨۢ;

    iget-object v14, v10, Ll/ܿۨۢ;->᩻:[Ll/ᩳۨۢ;

    if-ge v1, v3, :cond_e

    .line 109
    invoke-static {}, Ll/ܿۨۢ;->֫()V

    .line 110
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳ֡;

    .line 111
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v15

    if-eq v15, v12, :cond_d

    if-eq v15, v5, :cond_d

    if-ne v15, v9, :cond_1

    goto/16 :goto_3

    :cond_1
    if-ne v15, v4, :cond_2

    .line 114
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۨۢ;

    const/4 v3, 0x1

    iput-boolean v3, v2, Ll/ᩳۨۢ;->ۧ:Z

    goto/16 :goto_2

    .line 115
    :cond_2
    invoke-static {v15}, Ll/ܿۨۢ;->֫(I)Z

    move-result v4

    const/16 v5, 0x37

    if-eqz v4, :cond_5

    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v2

    const/16 v4, 0x80

    if-ge v2, v4, :cond_4

    .line 117
    new-instance v2, Ll/ᩳۨۢ;

    invoke-direct {v2, v1}, Ll/ᩳۨۢ;-><init>(I)V

    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    if-eq v15, v5, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۨۢ;

    const/4 v4, 0x1

    iput-boolean v4, v3, Ll/ᩳۨۢ;->ۧ:Z

    .line 119
    :cond_3
    aput-object v2, v14, v1

    .line 120
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_2

    .line 348
    :cond_4
    new-instance v0, Ll/ۧۨۢ;

    invoke-interface {v3}, Ll/֡ܳ֡;->getLine()I

    move-result v1

    invoke-interface {v3}, Ll/֡ܳ֡;->֫()I

    move-result v2

    const-string v3, "Formatting nesting limit exceeded"

    invoke-direct {v0, v1, v2, v3}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 116
    throw v0

    :cond_5
    const/16 v4, 0x38

    const/16 v9, 0x3a

    const/16 v12, 0x3c

    if-eq v15, v12, :cond_6

    if-eq v15, v9, :cond_6

    if-ne v15, v4, :cond_b

    .line 122
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۨۢ;

    iget v4, v4, Ll/ᩳۨۢ;->ܳ:I

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳ֡;

    invoke-interface {v4}, Ll/֡ܳ֡;->getType()I

    move-result v4

    const/16 v14, 0x3b

    if-ne v4, v14, :cond_7

    if-eq v15, v12, :cond_9

    :cond_7
    const/16 v12, 0x39

    if-ne v4, v12, :cond_8

    if-eq v15, v9, :cond_9

    :cond_8
    if-ne v4, v5, :cond_c

    const/16 v4, 0x38

    if-ne v15, v4, :cond_c

    .line 125
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۨۢ;

    .line 126
    iput v1, v3, Ll/ᩳۨۢ;->֫:I

    .line 127
    iget v4, v3, Ll/ᩳۨۢ;->ܳ:I

    if-eq v2, v4, :cond_a

    const/4 v2, 0x1

    goto :goto_1

    :cond_a
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, v3, Ll/ᩳۨۢ;->ܽ:Z

    .line 128
    aput-object v3, v13, v1

    :cond_b
    :goto_2
    move v2, v1

    goto :goto_3

    .line 348
    :cond_c
    new-instance v0, Ll/ۧۨۢ;

    invoke-interface {v3}, Ll/֡ܳ֡;->getLine()I

    move-result v1

    invoke-interface {v3}, Ll/֡ܳ֡;->֫()I

    move-result v2

    const-string v3, "Mismatched closing delimiter"

    invoke-direct {v0, v1, v2, v3}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 123
    throw v0

    :cond_d
    :goto_3
    add-int/lit8 v1, v1, 0x1

    const/4 v9, -0x1

    goto/16 :goto_0

    .line 132
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_43

    .line 78
    new-instance v0, Ll/ܳܰۢ;

    invoke-direct {v0, v8}, Ll/ܳܰۢ;-><init>(Ll/֫ܳ֡;)V

    .line 79
    invoke-virtual {v0}, Ll/ᩴܳ֡;->ۢ()V

    .line 80
    invoke-virtual {v0, v7}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 81
    invoke-virtual {v0}, Ll/ܳܰۢ;->ۜ֫()Ll/۫ۨۢ;

    move-result-object v0

    const/4 v1, 0x1

    .line 82
    invoke-virtual {v8, v1}, Ll/֫ܳ֡;->ۧ(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_42

    .line 137
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 138
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 139
    :cond_f
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/16 v2, 0x36

    iget-object v3, v10, Ll/ܿۨۢ;->ܽ:[I

    iget-object v4, v10, Ll/ܿۨۢ;->ܿ:[Z

    if-nez v0, :cond_1c

    .line 140
    invoke-static {}, Ll/ܿۨۢ;->֫()V

    .line 141
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ᩷֡;

    .line 142
    instance-of v5, v0, Ll/ۡܳ֡;

    if-eqz v5, :cond_f

    check-cast v0, Ll/ۡܳ֡;

    .line 143
    invoke-virtual {v0}, Ll/᩵ܳ֡;->ۧ()I

    move-result v5

    .line 144
    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_10

    invoke-virtual {v0, v8}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v7

    const/4 v8, 0x1

    instance-of v9, v7, Ll/ۘ᩷֡;

    if-eqz v9, :cond_10

    check-cast v7, Ll/ۘ᩷֡;

    .line 145
    invoke-interface {v7}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v7

    invoke-interface {v7}, Ll/֡ܳ֡;->getType()I

    move-result v7

    if-ne v7, v2, :cond_10

    .line 146
    iget-object v2, v0, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v2}, Ll/֡ܳ֡;->ܽ()I

    move-result v2

    aput-boolean v8, v4, v2

    :cond_10
    const/16 v2, 0x14

    if-ne v5, v2, :cond_13

    const/4 v7, 0x0

    .line 150
    :goto_4
    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result v8

    if-ge v7, v8, :cond_13

    .line 151
    invoke-virtual {v0, v7}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v8

    instance-of v9, v8, Ll/ۘ᩷֡;

    if-eqz v9, :cond_12

    check-cast v8, Ll/ۘ᩷֡;

    .line 152
    invoke-interface {v8}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v9

    invoke-interface {v9}, Ll/֡ܳ֡;->getType()I

    move-result v9

    const/16 v15, 0x31

    if-eq v9, v15, :cond_11

    .line 153
    invoke-interface {v8}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v9

    invoke-interface {v9}, Ll/֡ܳ֡;->getType()I

    move-result v9

    const/16 v15, 0x33

    if-ne v9, v15, :cond_12

    .line 154
    :cond_11
    invoke-interface {v8}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v8

    invoke-interface {v8}, Ll/֡ܳ֡;->ܽ()I

    move-result v8

    iget-object v9, v10, Ll/ܿۨۢ;->᩷:[Z

    const/4 v15, 0x1

    aput-boolean v15, v9, v8

    :cond_12
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_13
    if-eqz v5, :cond_19

    const/4 v7, 0x5

    if-eq v5, v7, :cond_18

    const/16 v7, 0x9

    if-eq v5, v7, :cond_19

    if-eq v5, v2, :cond_18

    const/16 v2, 0x2f

    if-eq v5, v2, :cond_19

    const/16 v2, 0x32

    if-eq v5, v2, :cond_18

    if-eq v5, v12, :cond_17

    const/16 v2, 0x3d

    if-eq v5, v2, :cond_14

    const/16 v2, 0x3e

    if-eq v5, v2, :cond_14

    packed-switch v5, :pswitch_data_0

    packed-switch v5, :pswitch_data_1

    goto/16 :goto_8

    :cond_14
    :pswitch_0
    const/4 v2, 0x0

    .line 176
    :goto_5
    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_1b

    .line 177
    invoke-virtual {v0, v2}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v3

    instance-of v5, v3, Ll/ۘ᩷֡;

    if-eqz v5, :cond_16

    check-cast v3, Ll/ۘ᩷֡;

    .line 178
    invoke-interface {v3}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v5

    invoke-interface {v5}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/16 v7, 0x2e

    if-eq v5, v7, :cond_15

    .line 179
    invoke-interface {v3}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v5

    invoke-interface {v5}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/16 v7, 0x3d

    if-ne v5, v7, :cond_16

    .line 180
    :cond_15
    invoke-interface {v3}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v3

    invoke-interface {v3}, Ll/֡ܳ֡;->ܽ()I

    move-result v3

    const/4 v5, 0x1

    aput-boolean v5, v4, v3

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_17
    const/4 v2, 0x1

    :goto_6
    add-int/lit8 v4, v2, 0x1

    .line 185
    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result v5

    if-ge v4, v5, :cond_1b

    .line 186
    invoke-virtual {v0, v2}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v5

    check-cast v5, Ll/ۘ᩷֡;

    .line 187
    invoke-virtual {v0, v4}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v4

    check-cast v4, Ll/ۡܳ֡;

    .line 188
    invoke-interface {v5}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v5

    invoke-interface {v5}, Ll/֡ܳ֡;->ܽ()I

    move-result v5

    iget-object v4, v4, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    invoke-interface {v4}, Ll/֡ܳ֡;->ܽ()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    aput v4, v3, v5

    add-int/lit8 v2, v2, 0x2

    goto :goto_6

    .line 162
    :cond_18
    :pswitch_1
    iget-object v2, v0, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v2}, Ll/֡ܳ֡;->ܽ()I

    move-result v2

    const/4 v3, 0x1

    aput-boolean v3, v4, v2

    goto :goto_8

    :cond_19
    :pswitch_2
    const/4 v2, 0x0

    .line 167
    :goto_7
    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_1b

    .line 168
    invoke-virtual {v0, v2}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v3

    instance-of v4, v3, Ll/ۘ᩷֡;

    if-eqz v4, :cond_1a

    check-cast v3, Ll/ۘ᩷֡;

    .line 169
    invoke-interface {v3}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v3

    invoke-interface {v3}, Ll/֡ܳ֡;->ܽ()I

    move-result v3

    aget-object v3, v14, v3

    if-eqz v3, :cond_1a

    const/4 v4, 0x1

    .line 170
    iput-boolean v4, v3, Ll/ᩳۨۢ;->ۧ:Z

    :cond_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 192
    :cond_1b
    :goto_8
    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_9
    if-ltz v2, :cond_f

    invoke-virtual {v0, v2}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_9

    .line 195
    :cond_1c
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 196
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v1

    :cond_1d
    :goto_a
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1f

    .line 197
    aget-object v2, v13, v1

    if-eqz v2, :cond_1e

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 198
    :cond_1e
    aget-object v2, v14, v1

    if-eqz v2, :cond_1d

    .line 199
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۨۢ;

    .line 200
    iget-boolean v5, v2, Ll/ᩳۨۢ;->ۧ:Z

    iget-boolean v7, v2, Ll/ᩳۨۢ;->ܽ:Z

    and-int/2addr v5, v7

    iput-boolean v5, v2, Ll/ᩳۨۢ;->ۧ:Z

    if-eqz v5, :cond_1d

    .line 201
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1d

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۨۢ;

    const/4 v5, 0x1

    iput-boolean v5, v2, Ll/ᩳۨۢ;->ۧ:Z

    goto :goto_a

    :cond_1f
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 209
    :goto_b
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    iget-object v5, v10, Ll/ܿۨۢ;->ܺ:[I

    if-ge v0, v2, :cond_22

    .line 210
    invoke-static {}, Ll/ܿۨۢ;->֫()V

    .line 211
    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܳ֡;

    .line 212
    invoke-interface {v2}, Ll/֡ܳ֡;->getType()I

    move-result v7

    add-int/lit8 v8, v0, 0x1

    .line 213
    aget v9, v5, v0

    aput v9, v5, v8

    if-eq v7, v12, :cond_21

    const/16 v15, 0x35

    if-eq v7, v15, :cond_21

    const/4 v15, -0x1

    if-ne v7, v15, :cond_20

    goto :goto_c

    .line 215
    :cond_20
    invoke-interface {v2}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v7}, Ll/ܿۨۢ;->ۧ(II)Z

    move-result v15

    add-int/2addr v2, v15

    .line 216
    invoke-direct {v10, v1, v0}, Ll/ܿۨۢ;->֫(II)Z

    move-result v0

    add-int/2addr v2, v0

    add-int/2addr v2, v9

    aput v2, v5, v8

    move v1, v7

    :cond_21
    :goto_c
    move v0, v8

    goto :goto_b

    .line 231
    :cond_22
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    .line 237
    :goto_d
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v15

    move/from16 p1, v12

    iget-object v12, v10, Ll/ܿۨۢ;->ܳ:Ljava/lang/String;

    iget-object v6, v10, Ll/ܿۨۢ;->ۜ:Ll/ᩴ᩷ܿ;

    if-ge v1, v15, :cond_3f

    .line 238
    invoke-static {}, Ll/ܿۨۢ;->֫()V

    .line 239
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/֡ܳ֡;

    move-object/from16 v16, v11

    .line 240
    invoke-interface {v15}, Ll/֡ܳ֡;->getType()I

    move-result v11

    move-object/from16 p2, v14

    const/4 v14, -0x1

    if-ne v11, v14, :cond_23

    goto/16 :goto_1f

    :cond_23
    const/16 v14, 0x35

    if-ne v11, v14, :cond_24

    goto :goto_f

    :cond_24
    const/16 v14, 0x40

    if-ne v11, v14, :cond_28

    .line 245
    invoke-interface {v15}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 340
    :goto_e
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v11, v14, :cond_27

    .line 341
    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v15, 0xa

    if-eq v14, v15, :cond_25

    const/16 v15, 0xd

    if-ne v14, v15, :cond_26

    add-int/lit8 v14, v11, 0x1

    .line 342
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v15

    if-eq v14, v15, :cond_25

    invoke-virtual {v6, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v15, 0xa

    if-eq v14, v15, :cond_26

    :cond_25
    add-int/lit8 v12, v12, 0x1

    :cond_26
    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    :cond_27
    add-int/2addr v2, v12

    :goto_f
    move/from16 v12, p1

    move-object/from16 p1, v4

    move-object/from16 p3, v13

    goto/16 :goto_1e

    .line 248
    :cond_28
    aget-object v14, v13, v1

    if-eqz v14, :cond_29

    .line 250
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-object/from16 p3, v13

    .line 251
    iget v13, v14, Ll/ᩳۨۢ;->ᩳ:I

    goto :goto_10

    :cond_29
    move-object/from16 p3, v13

    move/from16 v13, p1

    .line 253
    :goto_10
    aget-boolean v17, v4, v1

    if-eqz v17, :cond_2a

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v17

    if-nez v17, :cond_2a

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 p1, v4

    move-object/from16 v4, v17

    check-cast v4, Ll/ᩳۨۢ;

    iget-boolean v4, v4, Ll/ᩳۨۢ;->ܿ:Z

    if-eqz v4, :cond_2b

    const/16 v4, 0x36

    if-eq v7, v4, :cond_2b

    const/16 v4, 0x3d

    if-eq v7, v4, :cond_2b

    const/4 v4, 0x1

    goto :goto_11

    :cond_2a
    move-object/from16 p1, v4

    :cond_2b
    const/4 v4, 0x0

    :goto_11
    if-nez v8, :cond_2d

    if-nez v9, :cond_2d

    if-nez v4, :cond_2d

    if-eqz v14, :cond_2c

    .line 255
    iget-boolean v4, v14, Ll/ᩳۨۢ;->ܿ:Z

    if-eqz v4, :cond_2c

    goto :goto_12

    :cond_2c
    const/4 v4, 0x0

    goto :goto_13

    :cond_2d
    :goto_12
    const/4 v4, 0x1

    :goto_13
    const/16 v9, 0x41

    if-ne v11, v9, :cond_30

    if-nez v8, :cond_2f

    if-lez v2, :cond_2e

    goto :goto_14

    :cond_2e
    const/4 v4, 0x0

    goto :goto_15

    :cond_2f
    :goto_14
    const/4 v4, 0x1

    :cond_30
    :goto_15
    const/16 v8, 0x78

    if-nez v4, :cond_31

    .line 261
    aget v9, v3, v1

    if-eqz v9, :cond_31

    iget v14, v10, Ll/ܿۨۢ;->ۧ:I

    aget v9, v5, v9

    add-int/2addr v14, v9

    aget v9, v5, v1

    sub-int/2addr v14, v9

    if-le v14, v8, :cond_31

    add-int/lit8 v4, v13, 0x1

    const/4 v9, 0x1

    move v9, v4

    const/4 v4, 0x1

    goto :goto_16

    :cond_31
    move v9, v13

    :goto_16
    if-eqz v4, :cond_35

    const/4 v4, 0x2

    if-lt v2, v4, :cond_32

    goto :goto_17

    :cond_32
    const/4 v4, 0x1

    .line 304
    :goto_17
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_33

    goto :goto_19

    :cond_33
    const/4 v2, 0x0

    :goto_18
    if-ge v2, v4, :cond_34

    .line 305
    invoke-virtual {v6, v12}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    add-int/lit8 v2, v2, 0x1

    goto :goto_18

    :cond_34
    const/4 v2, 0x0

    .line 306
    iput v2, v10, Ll/ܿۨۢ;->ۧ:I

    goto :goto_19

    .line 268
    :cond_35
    iget v2, v10, Ll/ܿۨۢ;->ۧ:I

    if-lez v2, :cond_38

    .line 269
    invoke-direct {v10, v7, v1}, Ll/ܿۨۢ;->֫(II)Z

    move-result v2

    if-eqz v2, :cond_36

    const/16 v2, 0x2c

    .line 270
    invoke-virtual {v6, v2}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    .line 271
    iget v2, v10, Ll/ܿۨۢ;->ۧ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v10, Ll/ܿۨۢ;->ۧ:I

    :cond_36
    const/16 v2, 0x41

    if-eq v11, v2, :cond_37

    .line 273
    invoke-static {v7, v11}, Ll/ܿۨۢ;->ۧ(II)Z

    move-result v2

    if-eqz v2, :cond_38

    :cond_37
    const/16 v2, 0x20

    .line 274
    invoke-virtual {v6, v2}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    .line 275
    iget v2, v10, Ll/ܿۨۢ;->ۧ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v10, Ll/ܿۨۢ;->ۧ:I

    .line 278
    :cond_38
    :goto_19
    iget v2, v10, Ll/ܿۨۢ;->ۧ:I

    if-nez v2, :cond_3a

    const/4 v2, 0x0

    :goto_1a
    if-ge v2, v9, :cond_39

    .line 279
    iget-object v4, v10, Ll/ܿۨۢ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    .line 280
    :cond_39
    iget v2, v10, Ll/ܿۨۢ;->ۢ:I

    mul-int v9, v9, v2

    iput v9, v10, Ll/ܿۨۢ;->ۧ:I

    .line 282
    :cond_3a
    invoke-interface {v15}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 283
    iget v2, v10, Ll/ܿۨۢ;->ۧ:I

    invoke-interface {v15}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v2

    iput v4, v10, Ll/ܿۨۢ;->ۧ:I

    .line 284
    aget-object v2, p2, v1

    if-eqz v2, :cond_3d

    .line 287
    iput v13, v2, Ll/ᩳۨۢ;->ᩳ:I

    .line 288
    iget-boolean v6, v2, Ll/ᩳۨۢ;->ܽ:Z

    if-eqz v6, :cond_3c

    iget-boolean v6, v2, Ll/ᩳۨۢ;->ۧ:Z

    if-nez v6, :cond_3b

    iget v6, v2, Ll/ᩳۨۢ;->֫:I

    add-int/lit8 v6, v6, 0x1

    aget v6, v5, v6

    add-int/2addr v4, v6

    add-int/lit8 v6, v1, 0x1

    aget v6, v5, v6

    sub-int/2addr v4, v6

    if-le v4, v8, :cond_3c

    :cond_3b
    const/4 v4, 0x1

    goto :goto_1b

    :cond_3c
    const/4 v4, 0x0

    :goto_1b
    iput-boolean v4, v2, Ll/ᩳۨۢ;->ܿ:Z

    .line 290
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 291
    iget-boolean v2, v2, Ll/ᩳۨۢ;->ܿ:Z

    if-eqz v2, :cond_3d

    add-int/lit8 v13, v13, 0x1

    const/4 v2, 0x1

    goto :goto_1c

    :cond_3d
    const/4 v2, 0x0

    :goto_1c
    const/16 v4, 0x41

    if-ne v11, v4, :cond_3e

    const/4 v4, 0x1

    goto :goto_1d

    :cond_3e
    const/4 v4, 0x0

    :goto_1d
    const/4 v6, 0x0

    move v9, v2

    move v8, v4

    move v7, v11

    move v12, v13

    const/4 v2, 0x0

    :goto_1e
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v6, p0

    move-object/from16 v4, p1

    move-object/from16 v14, p2

    move-object/from16 v13, p3

    move-object/from16 v11, v16

    goto/16 :goto_d

    .line 300
    :cond_3f
    :goto_1f
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_41

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p0

    move-object v2, v6

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v3, 0xa

    if-eq v0, v3, :cond_40

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_41

    :cond_40
    invoke-virtual {v2, v12}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    :cond_41
    return-void

    :cond_42
    const/4 v0, 0x1

    .line 83
    invoke-virtual {v8, v0}, Ll/֫ܳ֡;->ᩳ(I)Ll/֡ܳ֡;

    move-result-object v0

    .line 348
    new-instance v1, Ll/ۧۨۢ;

    invoke-interface {v0}, Ll/֡ܳ֡;->getLine()I

    move-result v2

    invoke-interface {v0}, Ll/֡ܳ֡;->֫()I

    move-result v0

    const-string v3, "Unexpected trailing content"

    invoke-direct {v1, v2, v0, v3}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 83
    throw v1

    :cond_43
    move-object/from16 v16, v11

    .line 132
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۨۢ;

    iget v0, v0, Ll/ᩳۨۢ;->ܳ:I

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳ֡;

    .line 348
    new-instance v1, Ll/ۧۨۢ;

    invoke-interface {v0}, Ll/֡ܳ֡;->getLine()I

    move-result v2

    invoke-interface {v0}, Ll/֡ܳ֡;->֫()I

    move-result v0

    const-string v3, "Unclosed delimiter"

    invoke-direct {v1, v2, v0, v3}, Ll/ۧۨۢ;-><init>(IILjava/lang/String;)V

    .line 132
    throw v1

    .line 60
    :catch_0
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1a
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0x3b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x39

    if-eq p0, v0, :cond_1

    const/16 v0, 0x37

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ֫(II)Z
    .locals 2

    .line 223
    iget-object v0, p0, Ll/ܿۨۢ;->ܿ:[Z

    aget-boolean v0, v0, p2

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܿۨۢ;->᩷:[Z

    aget-boolean v0, v0, p2

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p1, :cond_1

    const/16 v0, 0x41

    if-eq p1, v0, :cond_1

    .line 225
    invoke-static {p1}, Ll/ܿۨۢ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x36

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_1

    const/16 v1, 0x3e

    if-eq p1, v1, :cond_1

    const/16 v1, 0x3f

    if-eq p1, v1, :cond_1

    iget-object p1, p0, Ll/ܿۨۢ;->ۡ:Ljava/util/List;

    .line 227
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳ֡;

    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result p1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static ۧ(Ljava/lang/CharSequence;ZILl/ᩴ᩷ܿ;)V
    .locals 0

    .line 50
    invoke-static {p0, p1, p2, p3}, Ll/֫ۨۢ;->֫(Ljava/lang/CharSequence;ZILl/ᩴ᩷ܿ;)V

    return-void
.end method

.method public static ۧ(II)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 310
    invoke-static {p0}, Ll/ܿۨۢ;->֫(I)Z

    move-result p0

    if-nez p0, :cond_1

    const/16 p0, 0x36

    if-eq p1, p0, :cond_1

    const/16 p0, 0x35

    if-eq p1, p0, :cond_1

    const/16 p0, 0x37

    if-eq p1, p0, :cond_1

    const/16 p0, 0x3c

    if-eq p1, p0, :cond_1

    const/16 p0, 0x3a

    if-eq p1, p0, :cond_1

    const/16 p0, 0x38

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
