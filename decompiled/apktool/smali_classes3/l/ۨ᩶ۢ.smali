.class public final Ll/ۨ᩶ۢ;
.super Ljava/lang/Object;
.source "L6P4"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۖ:[Z

.field public final ۘ:Ljava/util/ArrayList;

.field public final ۜ:[Z

.field public final ۡ:Ll/ᩴ᩷ܿ;

.field public final ۢ:[Z

.field public final ۧ:Z

.field public final ܳ:I

.field public final ܺ:Ljava/lang/CharSequence;

.field public final ܽ:[I

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:[I

.field public final ᩷:[I

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/֫ܳ֡;Ll/ۡܳ֡;Ll/ۗ᩶ۢ;Ll/۫᩶ۢ;ZLl/ᩴ᩷ܿ;)V
    .locals 7

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    .line 39
    iput-object p1, p0, Ll/ۨ᩶ۢ;->ܺ:Ljava/lang/CharSequence;

    .line 40
    iput-boolean p6, p0, Ll/ۨ᩶ۢ;->ۧ:Z

    .line 41
    invoke-virtual {p4}, Ll/ۗ᩶ۢ;->ۧ()Z

    move-result p6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p6, :cond_0

    const-string p4, "\t"

    goto :goto_1

    :cond_0
    invoke-virtual {p4}, Ll/ۗ᩶ۢ;->֫()I

    move-result p4

    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    if-ltz p4, :cond_16

    if-eqz p4, :cond_4

    const-string p6, " "

    if-ne p4, v1, :cond_1

    move-object p4, p6

    goto :goto_1

    :cond_1
    const v2, 0x7fffffff

    .line 0
    div-int/2addr v2, p4

    if-gt v1, v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p4, :cond_2

    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    const-string p2, "Repeating 1 bytes String "

    const-string p3, " times will produce a String exceeding maximum size."

    invoke-static {p4, p2, p3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p4, ""

    .line 41
    :goto_1
    iput-object p4, p0, Ll/ۨ᩶ۢ;->ܿ:Ljava/lang/String;

    .line 42
    invoke-virtual {p5}, Ll/۫᩶ۢ;->֫()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Ll/ۨ᩶ۢ;->֫:Ljava/lang/String;

    .line 43
    invoke-virtual {p5}, Ll/۫᩶ۢ;->ۧ()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-static {p1}, Ll/᩷ۤۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p5}, Ll/۫᩶ۢ;->ۧ()Ljava/lang/String;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Ll/ۨ᩶ۢ;->᩻:Ljava/lang/String;

    .line 44
    invoke-virtual {p5}, Ll/۫᩶ۢ;->ܽ()I

    move-result p1

    iput p1, p0, Ll/ۨ᩶ۢ;->ܳ:I

    .line 45
    iput-object p7, p0, Ll/ۨ᩶ۢ;->ۡ:Ll/ᩴ᩷ܿ;

    .line 46
    invoke-virtual {p2}, Ll/֫ܳ֡;->size()I

    move-result p1

    new-array p1, p1, [I

    const/4 p4, -0x1

    .line 47
    invoke-static {p1, p4}, Ljava/util/Arrays;->fill([II)V

    .line 48
    invoke-virtual {p2}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ll/֡ܳ֡;

    .line 49
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 50
    invoke-interface {p5}, Ll/֡ܳ֡;->ۧ()I

    move-result p6

    if-nez p6, :cond_6

    invoke-interface {p5}, Ll/֡ܳ֡;->getType()I

    move-result p6

    if-eq p6, p4, :cond_6

    .line 51
    invoke-interface {p5}, Ll/֡ܳ֡;->ܽ()I

    move-result p6

    iget-object p7, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p7}, Ljava/util/ArrayList;->size()I

    move-result p7

    aput p7, p1, p6

    .line 52
    iget-object p6, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p6, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 55
    :cond_7
    iget-object p2, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [I

    iput-object p2, p0, Ll/ۨ᩶ۢ;->᩷:[I

    .line 56
    invoke-static {p2, p4}, Ljava/util/Arrays;->fill([II)V

    .line 57
    iget-object p2, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/2addr p2, v1

    new-array p4, p2, [I

    iput-object p4, p0, Ll/ۨ᩶ۢ;->ᩳ:[I

    .line 58
    new-array p4, p2, [I

    iput-object p4, p0, Ll/ۨ᩶ۢ;->ܽ:[I

    .line 59
    new-array p2, p2, [Z

    iput-object p2, p0, Ll/ۨ᩶ۢ;->ۢ:[Z

    .line 60
    iget-object p2, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Z

    iput-object p2, p0, Ll/ۨ᩶ۢ;->ۜ:[Z

    .line 61
    iget-object p2, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Z

    iput-object p2, p0, Ll/ۨ᩶ۢ;->ۖ:[Z

    .line 63
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 64
    invoke-virtual {p2, p3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 65
    :cond_8
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p3

    const/16 p4, 0x14

    const/16 p5, 0x12

    const/16 p6, 0x10

    const/4 p7, 0x7

    if-nez p3, :cond_f

    .line 66
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 67
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܺ᩷֡;

    .line 68
    instance-of v2, p3, Ll/ۡܳ֡;

    if-eqz v2, :cond_8

    check-cast p3, Ll/ۡܳ֡;

    .line 69
    invoke-virtual {p3}, Ll/᩵ܳ֡;->ۧ()I

    move-result v2

    const/4 v3, 0x5

    const/16 v4, 0x8

    if-eq v2, v3, :cond_9

    const/4 v3, 0x6

    if-eq v2, v3, :cond_9

    if-eq v2, p7, :cond_9

    if-ne v2, v4, :cond_e

    .line 322
    :cond_9
    iget-object p7, p3, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    .line 328
    iget-object v2, p3, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    if-eqz p7, :cond_e

    if-eqz v2, :cond_e

    .line 74
    invoke-interface {p7}, Ll/֡ܳ֡;->ܽ()I

    move-result v3

    if-ltz v3, :cond_e

    invoke-interface {v2}, Ll/֡ܳ֡;->ܽ()I

    move-result v3

    if-ltz v3, :cond_e

    .line 75
    invoke-interface {p7}, Ll/֡ܳ֡;->ܽ()I

    move-result p7

    aget p7, p1, p7

    invoke-interface {v2}, Ll/֡ܳ֡;->ܽ()I

    move-result v2

    aget v2, p1, v2

    if-ltz p7, :cond_e

    if-le v2, p7, :cond_e

    .line 76
    invoke-direct {p0, p7}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v3

    invoke-direct {p0, v2}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v5

    const/16 v6, 0xf

    if-ne v3, v6, :cond_a

    if-eq v5, p6, :cond_d

    :cond_a
    const/16 p6, 0x11

    if-ne v3, p6, :cond_b

    if-eq v5, p5, :cond_d

    :cond_b
    if-eq v3, v4, :cond_c

    const/16 p5, 0x13

    if-ne v3, p5, :cond_e

    :cond_c
    if-ne v5, p4, :cond_e

    .line 77
    :cond_d
    iget-object p4, p0, Ll/ۨ᩶ۢ;->᩷:[I

    aput v2, p4, p7

    .line 78
    aput p7, p4, v2

    .line 82
    :cond_e
    invoke-virtual {p3}, Ll/ۡܳ֡;->getChildCount()I

    move-result p4

    sub-int/2addr p4, v1

    :goto_4
    if-ltz p4, :cond_8

    invoke-virtual {p3, p4}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object p5

    invoke-virtual {p2, p5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 p4, p4, -0x1

    goto :goto_4

    .line 84
    :cond_f
    :goto_5
    iget-object p1, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_15

    .line 85
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 86
    invoke-direct {p0, v0}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result p1

    invoke-static {p1}, Ll/ۨ᩶ۢ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_10

    iget-object p1, p0, Ll/ۨ᩶ۢ;->᩷:[I

    aget p1, p1, v0

    if-gez p1, :cond_10

    .line 87
    iget-object p1, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/2addr p1, v1

    invoke-direct {p0, v0, p1}, Ll/ۨ᩶ۢ;->֫(II)V

    return-void

    .line 90
    :cond_10
    invoke-direct {p0, v0}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result p1

    if-ne p1, p7, :cond_11

    iget-object p1, p0, Ll/ۨ᩶ۢ;->ۢ:[Z

    add-int/lit8 p2, v0, 0x1

    aput-boolean v1, p1, p2

    .line 92
    :cond_11
    invoke-direct {p0, v0}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result p1

    const/16 p2, 0x18

    if-ne p1, p2, :cond_12

    iget-object p1, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳ֡;

    invoke-interface {p1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    iget-object p1, p0, Ll/ۨ᩶ۢ;->ۢ:[Z

    add-int/lit8 p2, v0, 0x1

    aput-boolean v1, p1, p2

    .line 93
    :cond_12
    invoke-direct {p0, v0}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result p1

    if-eq p1, p6, :cond_13

    if-eq p1, p4, :cond_13

    if-ne p1, p5, :cond_14

    :cond_13
    iget-object p1, p0, Ll/ۨ᩶ۢ;->᩷:[I

    aget p1, p1, v0

    if-gez p1, :cond_14

    .line 94
    iget-object p1, p0, Ll/ۨ᩶ۢ;->ۢ:[Z

    add-int/lit8 p2, v0, 0x1

    aput-boolean v1, p1, p2

    aput-boolean v1, p1, v0

    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_15
    return-void

    .line 0
    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "count is negative: "

    invoke-static {p4, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(II)V
    .locals 2

    .line 344
    iget-object v0, p0, Ll/ۨ᩶ۢ;->ۢ:[Z

    array-length v1, v0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void
.end method

.method private ֫(IIIZ)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    .line 106
    iget-object v3, v0, Ll/ۨ᩶ۢ;->ܽ:[I

    move/from16 v4, p1

    invoke-static {v3, v4, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    :cond_0
    :goto_0
    if-ge v4, v1, :cond_52

    .line 109
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 110
    invoke-direct {v0, v4}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v5

    const/16 v6, 0x16

    const/4 v7, 0x3

    iget-object v8, v0, Ll/ۨ᩶ۢ;->ᩳ:[I

    const/4 v9, 0x1

    if-ne v5, v6, :cond_1

    .line 111
    aput v9, v8, v4

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v1, :cond_0

    .line 112
    aput v7, v8, v4

    goto :goto_0

    :cond_1
    const/16 v5, 0x15

    const/16 v7, 0xe

    .line 116
    iget-object v9, v0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    if-eqz p4, :cond_2

    add-int/lit8 v10, v4, 0x1

    if-ge v10, v1, :cond_2

    .line 226
    invoke-direct {v0, v4}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v11

    if-ne v11, v7, :cond_2

    invoke-direct {v0, v10}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v7

    if-ne v7, v5, :cond_2

    .line 348
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳ֡;

    invoke-interface {v5}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ܰ᩶ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "--"

    .line 116
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    move v7, v4

    :goto_2
    const/16 v11, 0x14

    const/16 v12, 0xf

    const/16 v14, 0x10

    .line 119
    iget-object v15, v0, Ll/ۨ᩶ۢ;->᩷:[I

    if-ge v7, v1, :cond_a

    .line 120
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    const/16 v16, 0x1

    .line 121
    invoke-direct {v0, v7}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v13

    .line 122
    invoke-static {v13}, Ll/ۨ᩶ۢ;->֫(I)Z

    move-result v17

    if-eqz v17, :cond_6

    .line 123
    aget v11, v15, v7

    if-ltz v11, :cond_5

    if-lt v11, v1, :cond_3

    goto :goto_3

    :cond_3
    if-ne v13, v12, :cond_4

    if-nez v5, :cond_4

    move v6, v7

    goto :goto_6

    :cond_4
    add-int/lit8 v11, v11, 0x1

    move v7, v11

    goto :goto_2

    .line 124
    :cond_5
    :goto_3
    invoke-direct {v0, v4, v1}, Ll/ۨ᩶ۢ;->֫(II)V

    return-void

    :cond_6
    if-ne v13, v6, :cond_7

    goto :goto_5

    :cond_7
    if-eq v13, v14, :cond_9

    if-eq v13, v11, :cond_9

    const/16 v11, 0x12

    if-ne v13, v11, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_9
    :goto_4
    add-int/lit8 v6, v7, 0x1

    .line 136
    invoke-direct {v0, v4, v6}, Ll/ۨ᩶ۢ;->֫(II)V

    goto :goto_5

    :cond_a
    const/16 v16, 0x1

    :goto_5
    const/4 v6, -0x1

    :goto_6
    const/4 v11, 0x5

    const/4 v12, 0x4

    const/16 v14, 0x9

    .line 141
    iget-boolean v13, v0, Ll/ۨ᩶ۢ;->ۧ:Z

    const/16 v18, 0x2

    if-ltz v6, :cond_44

    .line 142
    aget v5, v15, v6

    .line 143
    invoke-direct {v0, v4}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v7

    if-ne v7, v14, :cond_34

    .line 348
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܳ֡;

    invoke-interface {v7}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/ܰ᩶ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 230
    invoke-static {v7}, Ll/ܰ᩶ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_7

    :sswitch_0
    const-string v11, "@stylistic"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_7

    :cond_b
    const/16 v7, 0x28

    goto/16 :goto_8

    :sswitch_1
    const-string v11, "@left-top"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto/16 :goto_7

    :cond_c
    const/16 v7, 0x27

    goto/16 :goto_8

    :sswitch_2
    const-string v11, "@swash"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    goto/16 :goto_7

    :cond_d
    const/16 v7, 0x26

    goto/16 :goto_8

    :sswitch_3
    const-string v11, "@scope"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    goto/16 :goto_7

    :cond_e
    const/16 v7, 0x25

    goto/16 :goto_8

    :sswitch_4
    const-string v11, "@media"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    goto/16 :goto_7

    :cond_f
    const/16 v7, 0x24

    goto/16 :goto_8

    :sswitch_5
    const-string v11, "@layer"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    goto/16 :goto_7

    :cond_10
    const/16 v7, 0x23

    goto/16 :goto_8

    :sswitch_6
    const-string v11, "@left-middle"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto/16 :goto_7

    :cond_11
    const/16 v7, 0x22

    goto/16 :goto_8

    :sswitch_7
    const-string v11, "@document"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    goto/16 :goto_7

    :cond_12
    const/16 v7, 0x21

    goto/16 :goto_8

    :sswitch_8
    const-string v11, "@left-bottom"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    goto/16 :goto_7

    :cond_13
    const/16 v7, 0x20

    goto/16 :goto_8

    :sswitch_9
    const-string v11, "@top-right-corner"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    goto/16 :goto_7

    :cond_14
    const/16 v7, 0x1f

    goto/16 :goto_8

    :sswitch_a
    const-string v11, "@character-variant"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    goto/16 :goto_7

    :cond_15
    const/16 v7, 0x1e

    goto/16 :goto_8

    :sswitch_b
    const-string v11, "@counter-style"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    goto/16 :goto_7

    :cond_16
    const/16 v7, 0x1d

    goto/16 :goto_8

    :sswitch_c
    const-string v11, "@top-left-corner"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto/16 :goto_7

    :cond_17
    const/16 v7, 0x1c

    goto/16 :goto_8

    :sswitch_d
    const-string v11, "@ornaments"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    goto/16 :goto_7

    :cond_18
    const/16 v7, 0x1b

    goto/16 :goto_8

    :sswitch_e
    const-string v11, "@page"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_19

    goto/16 :goto_7

    :cond_19
    const/16 v7, 0x1a

    goto/16 :goto_8

    :sswitch_f
    const-string v11, "@-webkit-keyframes"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    goto/16 :goto_7

    :cond_1a
    const/16 v7, 0x19

    goto/16 :goto_8

    :sswitch_10
    const-string v11, "@font-feature-values"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    goto/16 :goto_7

    :cond_1b
    const/16 v7, 0x18

    goto/16 :goto_8

    :sswitch_11
    const-string v11, "@container"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1c

    goto/16 :goto_7

    :cond_1c
    const/16 v7, 0x17

    goto/16 :goto_8

    :sswitch_12
    const-string v11, "@starting-style"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1d

    goto/16 :goto_7

    :cond_1d
    const/16 v7, 0x16

    goto/16 :goto_8

    :sswitch_13
    const-string v11, "@-moz-document"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    goto/16 :goto_7

    :cond_1e
    const/16 v7, 0x15

    goto/16 :goto_8

    :sswitch_14
    const-string v11, "@view-transition"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1f

    goto/16 :goto_7

    :cond_1f
    const/16 v7, 0x14

    goto/16 :goto_8

    :sswitch_15
    const-string v11, "@bottom-right"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_20

    goto/16 :goto_7

    :cond_20
    const/16 v7, 0x13

    goto/16 :goto_8

    :sswitch_16
    const-string v11, "@font-palette-values"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    goto/16 :goto_7

    :cond_21
    const/16 v7, 0x12

    goto/16 :goto_8

    :sswitch_17
    const-string v11, "@annotation"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_22

    goto/16 :goto_7

    :cond_22
    const/16 v7, 0x11

    goto/16 :goto_8

    :sswitch_18
    const-string v11, "@property"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_23

    goto/16 :goto_7

    :cond_23
    const/16 v7, 0x10

    goto/16 :goto_8

    :sswitch_19
    const-string v11, "@top-left"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_24

    goto/16 :goto_7

    :cond_24
    const/16 v7, 0xf

    goto/16 :goto_8

    :sswitch_1a
    const-string v11, "@bottom-left"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    goto/16 :goto_7

    :cond_25
    const/16 v7, 0xe

    goto/16 :goto_8

    :sswitch_1b
    const-string v11, "@bottom-center"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_26

    goto/16 :goto_7

    :cond_26
    const/16 v7, 0xd

    goto/16 :goto_8

    :sswitch_1c
    const-string v11, "@top-right"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_27

    goto/16 :goto_7

    :cond_27
    const/16 v7, 0xc

    goto/16 :goto_8

    :sswitch_1d
    const-string v11, "@right-middle"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    goto/16 :goto_7

    :cond_28
    const/16 v7, 0xb

    goto/16 :goto_8

    :sswitch_1e
    const-string v11, "@bottom-right-corner"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_29

    goto/16 :goto_7

    :cond_29
    const/16 v7, 0xa

    goto/16 :goto_8

    :sswitch_1f
    const-string v11, "@keyframes"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2a

    goto/16 :goto_7

    :cond_2a
    const/16 v7, 0x9

    goto/16 :goto_8

    :sswitch_20
    const-string v11, "@bottom-left-corner"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2b

    goto/16 :goto_7

    :cond_2b
    const/16 v7, 0x8

    goto/16 :goto_8

    :sswitch_21
    const-string v11, "@right-top"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2c

    goto :goto_7

    :cond_2c
    const/4 v7, 0x7

    goto :goto_8

    :sswitch_22
    const-string v11, "@font-face"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2d

    goto :goto_7

    :cond_2d
    const/4 v7, 0x6

    goto :goto_8

    :sswitch_23
    const-string v11, "@right-bottom"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2e

    goto :goto_7

    :cond_2e
    const/4 v7, 0x5

    goto :goto_8

    :sswitch_24
    const-string v11, "@supports"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2f

    goto :goto_7

    :cond_2f
    const/4 v7, 0x4

    goto :goto_8

    :sswitch_25
    const-string v11, "@position-try"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_30

    goto :goto_7

    :cond_30
    const/4 v7, 0x3

    goto :goto_8

    :sswitch_26
    const-string v11, "@top-center"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_31

    goto :goto_7

    :cond_31
    const/4 v7, 0x2

    goto :goto_8

    :sswitch_27
    const-string v11, "@-moz-keyframes"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_32

    goto :goto_7

    :cond_32
    const/4 v7, 0x1

    goto :goto_8

    :sswitch_28
    const-string v11, "@styleset"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_33

    goto :goto_7

    :cond_33
    const/4 v7, 0x0

    goto :goto_8

    :goto_7
    const/4 v7, -0x1

    :goto_8
    packed-switch v7, :pswitch_data_0

    add-int/lit8 v6, v5, 0x1

    .line 144
    invoke-direct {v0, v4, v6}, Ll/ۨ᩶ۢ;->֫(II)V

    const/4 v4, 0x3

    goto/16 :goto_12

    .line 197
    :cond_34
    :pswitch_0
    iget-object v7, v0, Ll/ۨ᩶ۢ;->֫:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    iget-object v11, v0, Ll/ۨ᩶ۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    mul-int v11, v11, v2

    add-int/2addr v11, v7

    move v12, v4

    const/16 v7, 0x17

    :goto_9
    if-ge v12, v6, :cond_3b

    .line 199
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 200
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/֡ܳ֡;

    invoke-interface {v14}, Ll/֡ܳ֡;->ܿ()I

    move-result v14

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ll/֡ܳ֡;

    invoke-interface/range {v17 .. v17}, Ll/֡ܳ֡;->ᩳ()I

    move-result v17

    sub-int v14, v14, v17

    add-int/lit8 v14, v14, 0x1

    add-int/2addr v14, v11

    if-le v12, v4, :cond_39

    add-int/lit8 v11, v12, -0x1

    .line 201
    invoke-direct {v0, v11}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v10

    if-eq v10, v7, :cond_38

    invoke-direct {v0, v12}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v10

    if-eq v10, v7, :cond_39

    .line 202
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܳ֡;

    invoke-interface {v7}, Ll/֡ܳ֡;->ܿ()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֡ܳ֡;

    invoke-interface {v10}, Ll/֡ܳ֡;->ᩳ()I

    move-result v10

    :goto_a
    if-ge v7, v10, :cond_39

    .line 334
    iget-object v11, v0, Ll/ۨ᩶ۢ;->ܺ:Ljava/lang/CharSequence;

    move-object/from16 v17, v9

    invoke-interface {v11, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    move/from16 v19, v4

    const/16 v4, 0x2f

    if-ne v9, v4, :cond_36

    add-int/lit8 v4, v7, 0x1

    if-ge v4, v10, :cond_36

    invoke-interface {v11, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v9, 0x2a

    if-ne v4, v9, :cond_36

    add-int/lit8 v7, v7, 0x2

    const-string v4, "*/"

    .line 335
    invoke-static {v4, v11, v7}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v4

    if-ltz v4, :cond_3a

    if-lt v4, v10, :cond_35

    goto :goto_d

    :cond_35
    add-int/lit8 v7, v4, 0x1

    goto :goto_b

    .line 338
    :cond_36
    invoke-interface {v11, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ܰ᩶ۢ;->֫(C)Z

    move-result v4

    if-eqz v4, :cond_37

    goto :goto_c

    :cond_37
    :goto_b
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v9, v17

    move/from16 v4, v19

    goto :goto_a

    :cond_38
    move/from16 v19, v4

    move-object/from16 v17, v9

    :goto_c
    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    :cond_39
    move/from16 v19, v4

    move-object/from16 v17, v9

    :cond_3a
    :goto_d
    move v11, v14

    add-int/lit8 v12, v12, 0x1

    const/16 v7, 0x17

    move-object/from16 v9, v17

    move/from16 v4, v19

    goto/16 :goto_9

    :cond_3b
    move/from16 v19, v4

    if-nez v13, :cond_3c

    .line 204
    iget v4, v0, Ll/ۨ᩶ۢ;->ܳ:I

    if-le v11, v4, :cond_3c

    const/4 v4, 0x1

    move/from16 v4, v19

    const/4 v7, 0x1

    goto :goto_e

    :cond_3c
    const/4 v4, 0x0

    move/from16 v4, v19

    const/4 v7, 0x0

    :goto_e
    if-ge v4, v6, :cond_40

    .line 206
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 207
    invoke-direct {v0, v4}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v9

    invoke-static {v9}, Ll/ۨ᩶ۢ;->֫(I)Z

    move-result v9

    if-eqz v9, :cond_3d

    aget v9, v15, v4

    if-ltz v9, :cond_3d

    move v4, v9

    goto :goto_10

    .line 208
    :cond_3d
    invoke-direct {v0, v4}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v9

    const/16 v10, 0x17

    if-ne v9, v10, :cond_3f

    .line 209
    aput v16, v8, v4

    add-int/lit8 v9, v4, 0x1

    if-ge v9, v6, :cond_3f

    if-eqz v7, :cond_3e

    const/4 v10, 0x3

    goto :goto_f

    :cond_3e
    const/4 v10, 0x2

    .line 210
    :goto_f
    aput v10, v8, v9

    :cond_3f
    :goto_10
    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    .line 147
    :cond_40
    aput v18, v8, v6

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v5, :cond_41

    const/4 v4, 0x1

    goto :goto_11

    :cond_41
    const/4 v4, 0x3

    .line 148
    :goto_11
    aput v4, v8, v5

    .line 149
    aput v2, v3, v5

    const/4 v4, 0x3

    if-ge v6, v5, :cond_42

    .line 151
    aput v4, v8, v6

    add-int/lit8 v7, v2, 0x1

    const/4 v9, 0x1

    .line 152
    invoke-direct {v0, v6, v5, v7, v9}, Ll/ۨ᩶ۢ;->֫(IIIZ)V

    :cond_42
    :goto_12
    add-int/lit8 v5, v5, 0x1

    if-ge v5, v1, :cond_43

    .line 156
    aput v4, v8, v5

    :cond_43
    move v4, v5

    goto/16 :goto_0

    :cond_44
    move/from16 v19, v4

    move-object/from16 v17, v9

    if-eqz p4, :cond_45

    add-int/lit8 v4, v19, 0x1

    if-ge v4, v7, :cond_45

    move/from16 v6, v19

    .line 226
    invoke-direct {v0, v6}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v9

    const/16 v10, 0xe

    if-ne v9, v10, :cond_46

    invoke-direct {v0, v4}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v4

    const/16 v9, 0x15

    if-ne v4, v9, :cond_46

    const/4 v4, 0x1

    goto :goto_13

    :cond_45
    move/from16 v6, v19

    :cond_46
    const/4 v4, 0x0

    :goto_13
    if-eqz v4, :cond_49

    add-int/lit8 v9, v6, 0x1

    const/4 v10, 0x1

    .line 161
    aput v10, v8, v9

    if-eqz v5, :cond_47

    add-int/lit8 v9, v6, 0x2

    .line 164
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v11, v7, 0x1

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    invoke-direct {v0, v9, v10}, Ll/ۨ᩶ۢ;->֫(II)V

    goto :goto_15

    :cond_47
    add-int/lit8 v9, v6, 0x2

    if-ge v9, v7, :cond_4a

    .line 166
    aput v18, v8, v9

    :goto_14
    if-ge v9, v7, :cond_4a

    .line 217
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 218
    invoke-direct {v0, v9}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v10

    const/16 v11, 0x17

    if-ne v10, v11, :cond_48

    const/4 v10, 0x1

    .line 219
    aput v10, v8, v9

    add-int/lit8 v10, v9, 0x1

    if-ge v10, v7, :cond_48

    .line 220
    aput v18, v8, v10

    :cond_48
    add-int/lit8 v9, v9, 0x1

    goto :goto_14

    .line 169
    :cond_49
    invoke-direct {v0, v6}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v9

    if-eq v9, v14, :cond_4a

    invoke-direct {v0, v6}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v9

    if-eq v9, v12, :cond_4a

    invoke-direct {v0, v6}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v9

    if-eq v9, v11, :cond_4a

    .line 171
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    move-result v9

    add-int/lit8 v10, v7, 0x1

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-direct {v0, v6, v9}, Ll/ۨ᩶ۢ;->֫(II)V

    :cond_4a
    :goto_15
    if-ge v7, v1, :cond_4d

    .line 173
    invoke-direct {v0, v7}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v9

    const/16 v10, 0x16

    if-ne v9, v10, :cond_4d

    if-nez v5, :cond_4b

    const/4 v6, 0x1

    .line 174
    aput v6, v8, v7

    :cond_4b
    if-eqz v13, :cond_4c

    if-eqz v4, :cond_4c

    if-nez v5, :cond_4c

    add-int/lit8 v4, v7, 0x1

    if-ne v4, v1, :cond_4c

    .line 175
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_4c

    invoke-direct {v0, v1}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v4

    const/16 v5, 0x10

    if-ne v4, v5, :cond_4c

    .line 176
    iget-object v4, v0, Ll/ۨ᩶ۢ;->ۜ:[Z

    const/4 v5, 0x1

    aput-boolean v5, v4, v7

    :cond_4c
    add-int/lit8 v7, v7, 0x1

    if-ge v7, v1, :cond_51

    const/4 v4, 0x3

    .line 178
    aput v4, v8, v7

    goto :goto_18

    :cond_4d
    if-nez v13, :cond_50

    if-eqz v4, :cond_50

    if-nez v5, :cond_50

    add-int/lit8 v4, v6, 0x2

    if-ge v4, v7, :cond_50

    if-ne v7, v1, :cond_50

    .line 183
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_50

    invoke-direct {v0, v1}, Ll/ۨ᩶ۢ;->ۧ(I)I

    move-result v4

    const/16 v5, 0x10

    if-ne v4, v5, :cond_50

    move v4, v6

    :goto_16
    if-gt v4, v7, :cond_4f

    .line 186
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 187
    iget-object v5, v0, Ll/ۨ᩶ۢ;->ۢ:[Z

    aget-boolean v5, v5, v4

    if-eqz v5, :cond_4e

    goto :goto_17

    :cond_4e
    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :cond_4f
    add-int/lit8 v4, v7, -0x1

    .line 189
    iget-object v5, v0, Ll/ۨ᩶ۢ;->ۖ:[Z

    const/4 v8, 0x1

    aput-boolean v8, v5, v4

    :cond_50
    :goto_17
    if-ne v7, v6, :cond_51

    add-int/lit8 v7, v7, 0x1

    :cond_51
    :goto_18
    move v4, v7

    goto/16 :goto_0

    :cond_52
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77ce4aaf -> :sswitch_28
        -0x61acd37d -> :sswitch_27
        -0x5e3113f3 -> :sswitch_26
        -0x5d484ca9 -> :sswitch_25
        -0x5206c53c -> :sswitch_24
        -0x4eed74c4 -> :sswitch_23
        -0x4c337325 -> :sswitch_22
        -0x4b3c2e1c -> :sswitch_21
        -0x44b95587 -> :sswitch_20
        -0x43de187b -> :sswitch_1f
        -0x3d5ffcb8 -> :sswitch_1e
        -0x3c84355a -> :sswitch_1d
        -0x3c03349c -> :sswitch_1c
        -0x3bbeb209 -> :sswitch_1b
        -0x3aa6ddd7 -> :sswitch_1a
        -0x2b3cb241 -> :sswitch_19
        -0x2a1661eb -> :sswitch_18
        -0x23836491 -> :sswitch_17
        -0x1a668e4e -> :sswitch_16
        -0x19de7bc6 -> :sswitch_15
        -0x19b992c3 -> :sswitch_14
        -0x17544b63 -> :sswitch_13
        -0x6ec8ddc -> :sswitch_12
        -0x6226bbf -> :sswitch_11
        -0x27f6329 -> :sswitch_10
        0x28ad8a7 -> :sswitch_f
        0x3ba42cf -> :sswitch_e
        0x4f1857f -> :sswitch_d
        0x11166a23 -> :sswitch_c
        0x1aed8260 -> :sswitch_b
        0x2370fda1 -> :sswitch_a
        0x26c838de -> :sswitch_9
        0x3d30f671 -> :sswitch_8
        0x4478915b -> :sswitch_7
        0x4f9a35db -> :sswitch_6
        0x7355fd11 -> :sswitch_5
        0x736597a4 -> :sswitch_4
        0x73b96614 -> :sswitch_3
        0x73c24952 -> :sswitch_2
        0x77773acf -> :sswitch_1
        0x7e3d8a30 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ֫(Ljava/lang/String;ILl/֡ܳ֡;Ll/֡ܳ֡;)V
    .locals 10

    .line 266
    iget-object v0, p0, Ll/ۨ᩶ۢ;->ۢ:[Z

    aget-boolean v0, v0, p2

    iget-object v1, p0, Ll/ۨ᩶ۢ;->ۡ:Ll/ᩴ᩷ܿ;

    if-eqz v0, :cond_0

    .line 267
    invoke-virtual {v1, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    .line 273
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 274
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    iget-boolean v8, p0, Ll/ۨ᩶ۢ;->ۧ:Z

    if-ge v3, v7, :cond_9

    and-int/lit16 v7, v3, 0x3ff

    if-nez v7, :cond_1

    .line 275
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 276
    :cond_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 277
    invoke-static {v7}, Ll/ܰ᩶ۢ;->֫(C)Z

    move-result v9

    if-eqz v9, :cond_2

    add-int/lit8 v3, v3, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/16 v4, 0x2f

    if-ne v7, v4, :cond_8

    add-int/lit8 v4, v3, 0x1

    .line 278
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v4, v7, :cond_8

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v7, 0x2a

    if-ne v4, v7, :cond_8

    add-int/lit8 v4, v3, 0x2

    const-string v7, "*/"

    .line 280
    invoke-virtual {p1, v7, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v7

    if-gez v7, :cond_3

    const/4 v9, 0x1

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    if-eqz v9, :cond_4

    .line 282
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    goto :goto_2

    :cond_4
    add-int/lit8 v7, v7, 0x2

    :goto_2
    if-eqz v8, :cond_6

    if-nez v9, :cond_6

    if-ge v4, v7, :cond_5

    .line 327
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v8, 0x21

    if-ne v4, v8, :cond_5

    goto :goto_3

    .line 328
    :cond_5
    invoke-virtual {p1, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܰ᩶ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v8, "@license"

    .line 329
    invoke-virtual {v4, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_6

    const-string v8, "@preserve"

    invoke-virtual {v4, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 284
    :cond_6
    :goto_3
    invoke-virtual {v0, p1, v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    const/4 v5, 0x1

    :cond_7
    const/4 v4, 0x1

    move v3, v7

    goto :goto_0

    .line 290
    :cond_8
    invoke-virtual {v1, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    :cond_9
    if-nez v8, :cond_a

    if-eqz v4, :cond_a

    .line 296
    invoke-virtual {v1, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    .line 299
    :cond_a
    iget-object v3, p0, Ll/ۨ᩶ۢ;->ᩳ:[I

    aget v3, v3, p2

    const-string v4, "/**/"

    const-string v7, " "

    const/16 v9, 0x20

    if-eqz v8, :cond_f

    if-eqz v5, :cond_b

    .line 301
    invoke-virtual {v1, v0}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    :cond_b
    if-eqz v6, :cond_c

    if-nez v3, :cond_c

    if-eqz p3, :cond_c

    if-eqz p4, :cond_c

    .line 303
    invoke-virtual {v1, v9}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    return-void

    :cond_c
    if-nez v5, :cond_16

    .line 304
    invoke-direct {p0, p4}, Ll/ۨ᩶ۢ;->֫(Ll/֡ܳ֡;)Z

    move-result p2

    if-nez p2, :cond_d

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_16

    invoke-static {p3, p4}, Ll/ۘۙۢ;->֫(Ll/֡ܳ֡;Ll/֡ܳ֡;)Z

    move-result p1

    if-eqz p1, :cond_16

    :cond_d
    if-eqz v6, :cond_e

    move-object v4, v7

    .line 305
    :cond_e
    invoke-virtual {v1, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    :cond_f
    if-eqz p4, :cond_16

    if-nez p3, :cond_10

    goto :goto_6

    :cond_10
    const/4 v0, 0x3

    if-ne v3, v0, :cond_11

    .line 310
    iget-object p1, p0, Ll/ۨ᩶ۢ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    move-result-object p1

    iget-object p3, p0, Ll/ۨ᩶ۢ;->֫:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 311
    :goto_4
    iget-object p1, p0, Ll/ۨ᩶ۢ;->ܽ:[I

    aget p1, p1, p2

    if-ge v2, p1, :cond_16

    iget-object p1, p0, Ll/ۨ᩶ۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_11
    const/4 p2, 0x2

    if-eq v3, p2, :cond_15

    if-nez v3, :cond_12

    if-eqz v6, :cond_12

    goto :goto_5

    .line 314
    :cond_12
    invoke-direct {p0, p4}, Ll/ۨ᩶ۢ;->֫(Ll/֡ܳ֡;)Z

    move-result p2

    if-nez p2, :cond_13

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_16

    invoke-static {p3, p4}, Ll/ۘۙۢ;->֫(Ll/֡ܳ֡;Ll/֡ܳ֡;)Z

    move-result p1

    if-eqz p1, :cond_16

    :cond_13
    if-eqz v6, :cond_14

    move-object v4, v7

    .line 315
    :cond_14
    invoke-virtual {v1, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    .line 313
    :cond_15
    :goto_5
    invoke-virtual {v1, v9}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    :cond_16
    :goto_6
    return-void
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0xf

    if-eq p0, v0, :cond_1

    const/16 v0, 0x13

    if-eq p0, v0, :cond_1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_1

    const/16 v0, 0x11

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

.method private ֫(Ll/֡ܳ֡;)Z
    .locals 4

    .line 321
    iget-object v0, p0, Ll/ۨ᩶ۢ;->ۡ:Ll/ᩴ᩷ܿ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eqz p1, :cond_0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    add-int/lit8 v2, v1, -0x2

    .line 322
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x21

    if-ne v0, v1, :cond_0

    .line 323
    invoke-interface {p1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object p1

    const-string v0, "--"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ(I)I
    .locals 1

    .line 347
    iget-object v0, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳ֡;

    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result p1

    return p1
.end method


# virtual methods
.method public final ֫()V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v0

    .line 246
    :goto_0
    iget-object v4, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, p0, Ll/ۨ᩶ۢ;->ܺ:Ljava/lang/CharSequence;

    if-ge v1, v5, :cond_3

    .line 247
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 248
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳ֡;

    .line 249
    iget-object v5, p0, Ll/ۨ᩶ۢ;->ۜ:[Z

    aget-boolean v5, v5, v1

    if-eqz v5, :cond_0

    .line 250
    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v5

    invoke-static {v2, v5, v6}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v1, v3, v0}, Ll/ۨ᩶ۢ;->֫(Ljava/lang/String;ILl/֡ܳ֡;Ll/֡ܳ֡;)V

    .line 251
    invoke-interface {v4}, Ll/֡ܳ֡;->ܿ()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 254
    :cond_0
    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v5

    invoke-static {v2, v5, v6}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 255
    invoke-direct {p0, v2, v1, v3, v4}, Ll/ۨ᩶ۢ;->֫(Ljava/lang/String;ILl/֡ܳ֡;Ll/֡ܳ֡;)V

    .line 256
    iget-object v2, p0, Ll/ۨ᩶ۢ;->ۡ:Ll/ᩴ᩷ܿ;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    iget-boolean v3, p0, Ll/ۨ᩶ۢ;->ۧ:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Ll/ۨ᩶ۢ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 257
    :cond_1
    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v3

    invoke-interface {v4}, Ll/֡ܳ֡;->ܿ()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v2, v3, v5, v6}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 258
    iget-object v3, p0, Ll/ۨ᩶ۢ;->ۖ:[Z

    aget-boolean v3, v3, v1

    if-eqz v3, :cond_2

    const/16 v3, 0x3b

    invoke-virtual {v2, v3}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    .line 259
    :cond_2
    invoke-interface {v4}, Ll/֡ܳ֡;->ܿ()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    move-object v3, v4

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 8
    :cond_3
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v2, v1, v6}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 262
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {p0, v1, v2, v3, v0}, Ll/ۨ᩶ۢ;->֫(Ljava/lang/String;ILl/֡ܳ֡;Ll/֡ܳ֡;)V

    return-void
.end method

.method public final ֫(Ll/۬᩶ۢ;)V
    .locals 4

    .line 100
    iget-object v0, p0, Ll/ۨ᩶ۢ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 101
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Ll/ۨ᩶ۢ;->ᩳ:[I

    const/4 v3, 0x1

    aput v3, v2, v1

    const/4 v1, 0x0

    aput v3, v2, v1

    .line 102
    sget-object v2, Ll/۬᩶ۢ;->᩹:Ll/۬᩶ۢ;

    if-eq p1, v2, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sget-object v2, Ll/۬᩶ۢ;->᩶:Ll/۬᩶ۢ;

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-direct {p0, v1, v0, v1, v3}, Ll/ۨ᩶ۢ;->֫(IIIZ)V

    :cond_2
    :goto_1
    return-void
.end method
