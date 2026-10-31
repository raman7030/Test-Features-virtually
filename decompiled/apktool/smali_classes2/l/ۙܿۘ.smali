.class public final Ll/ۙܿۘ;
.super Ljava/lang/Object;
.source "O1MI"


# instance fields
.field public ֫:I

.field public final ۜ:Ljava/util/ArrayList;

.field public ۧ:I

.field public final ܳ:Ljava/lang/CharSequence;

.field public final ܽ:Ll/ۜܳۘ;

.field public final ܿ:Ljava/lang/CharSequence;

.field public final ᩳ:Ljava/util/ArrayList;

.field public ᩷:Ll/᩹ܿۘ;

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙܿۘ;->ᩳ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Ll/ۙܿۘ;->֫:I

    .line 48
    iput v0, p0, Ll/ۙܿۘ;->ۧ:I

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Ll/ۙܿۘ;->᩷:Ll/᩹ܿۘ;

    .line 56
    iput-object p2, p0, Ll/ۙܿۘ;->ܿ:Ljava/lang/CharSequence;

    .line 57
    iput-object p3, p0, Ll/ۙܿۘ;->ܳ:Ljava/lang/CharSequence;

    .line 58
    iput-object p4, p0, Ll/ۙܿۘ;->᩻:Ljava/util/ArrayList;

    .line 59
    iput-object p5, p0, Ll/ۙܿۘ;->ۜ:Ljava/util/ArrayList;

    .line 60
    iput-object p1, p0, Ll/ۙܿۘ;->ܽ:Ll/ۜܳۘ;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)I
    .locals 1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 88
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p2, v0, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0

    .line 89
    :cond_1
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳܿۘ;

    .line 91
    invoke-interface {p0}, Ll/ᩳܿۘ;->֫()I

    move-result p0

    return p0
.end method

.method private ֫(IIZ)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    .line 133
    iget v4, v0, Ll/ۙܿۘ;->֫:I

    if-gt v4, v1, :cond_10

    iget v5, v0, Ll/ۙܿۘ;->ۧ:I

    if-le v5, v2, :cond_0

    goto/16 :goto_b

    .line 151
    :cond_0
    iget-object v6, v0, Ll/ۙܿۘ;->᩻:Ljava/util/ArrayList;

    iget-object v7, v0, Ll/ۙܿۘ;->ܿ:Ljava/lang/CharSequence;

    invoke-static {v6, v7, v4}, Ll/ۙܿۘ;->֫(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)I

    move-result v8

    .line 152
    iget-object v9, v0, Ll/ۙܿۘ;->ۜ:Ljava/util/ArrayList;

    iget-object v10, v0, Ll/ۙܿۘ;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v9, v10, v5}, Ll/ۙܿۘ;->֫(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)I

    move-result v11

    .line 153
    invoke-static {v6, v7, v1}, Ll/ۙܿۘ;->֫(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)I

    move-result v12

    .line 154
    invoke-static {v9, v10, v2}, Ll/ۙܿۘ;->֫(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)I

    move-result v13

    add-int/lit8 v4, v4, 0x1

    const/4 v14, 0x0

    .line 156
    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    add-int/lit8 v5, v5, 0x1

    .line 157
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v14, v1, 0x1

    .line 158
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v15

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v14

    add-int/lit8 v15, v2, 0x1

    .line 159
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v15, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 161
    new-instance v15, Ll/᩶ܿۘ;

    new-instance v1, Ll/᩹ܳۘ;

    invoke-direct {v1, v4, v14, v5, v2}, Ll/᩹ܳۘ;-><init>(IIII)V

    new-instance v2, Ll/᩹ܳۘ;

    invoke-direct {v2, v8, v12, v11, v13}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-direct {v15, v1, v2}, Ll/᩶ܿۘ;-><init>(Ll/᩹ܳۘ;Ll/᩹ܳۘ;)V

    .line 163
    new-instance v5, Ll/᩹ܿۘ;

    .line 173
    :goto_0
    iget v8, v1, Ll/᩹ܳۘ;->֫:I

    if-ge v4, v8, :cond_2

    .line 174
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    instance-of v8, v8, Ll/ܳܿۘ;

    if-nez v8, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 176
    :cond_2
    iget v4, v1, Ll/᩹ܳۘ;->ᩳ:I

    :goto_1
    iget v6, v1, Ll/᩹ܳۘ;->ۧ:I

    if-ge v4, v6, :cond_4

    .line 177
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v6, v6, Ll/ܳܿۘ;

    if-nez v6, :cond_3

    :goto_2
    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    .line 167
    :goto_3
    iget v4, v2, Ll/᩹ܳۘ;->ܽ:I

    iget v6, v2, Ll/᩹ܳۘ;->֫:I

    invoke-interface {v7, v4, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    .line 168
    iget v7, v2, Ll/᩹ܳۘ;->ᩳ:I

    iget v8, v2, Ll/᩹ܳۘ;->ۧ:I

    invoke-interface {v10, v7, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    .line 169
    invoke-static {v4, v7}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    .line 163
    invoke-direct {v5, v15, v3, v1, v4}, Ll/᩹ܿۘ;-><init>(Ll/᩶ܿۘ;ZZZ)V

    .line 136
    invoke-virtual {v2}, Ll/᩹ܳۘ;->֫()Z

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_b

    .line 138
    :cond_5
    iget-object v2, v0, Ll/ۙܿۘ;->᩷:Ll/᩹ܿۘ;

    if-eqz v2, :cond_e

    iget-boolean v7, v2, Ll/᩹ܿۘ;->ܽ:Z

    iget-boolean v9, v2, Ll/᩹ܿۘ;->ᩳ:Z

    .line 67
    iget-boolean v10, v2, Ll/᩹ܿۘ;->ۧ:Z

    if-nez v10, :cond_6

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    if-eqz v9, :cond_7

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    if-eqz v7, :cond_8

    if-nez v1, :cond_e

    .line 76
    :cond_8
    :goto_4
    iget-object v2, v2, Ll/᩹ܿۘ;->֫:Ll/᩶ܿۘ;

    .line 78
    new-instance v5, Ll/᩶ܿۘ;

    new-instance v11, Ll/᩹ܳۘ;

    iget-object v12, v2, Ll/᩶ܿۘ;->ۧ:Ll/᩹ܳۘ;

    iget v13, v12, Ll/᩹ܳۘ;->ܽ:I

    iget-object v14, v15, Ll/᩶ܿۘ;->ۧ:Ll/᩹ܳۘ;

    iget v15, v14, Ll/᩹ܳۘ;->֫:I

    iget v12, v12, Ll/᩹ܳۘ;->ᩳ:I

    iget v14, v14, Ll/᩹ܳۘ;->ۧ:I

    invoke-direct {v11, v13, v15, v12, v14}, Ll/᩹ܳۘ;-><init>(IIII)V

    new-instance v12, Ll/᩹ܳۘ;

    iget-object v2, v2, Ll/᩶ܿۘ;->֫:Ll/᩹ܳۘ;

    iget v13, v2, Ll/᩹ܳۘ;->ܽ:I

    iget v2, v2, Ll/᩹ܳۘ;->ᩳ:I

    invoke-direct {v12, v13, v6, v2, v8}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-direct {v5, v11, v12}, Ll/᩶ܿۘ;-><init>(Ll/᩹ܳۘ;Ll/᩹ܳۘ;)V

    .line 80
    new-instance v2, Ll/᩹ܿۘ;

    if-nez v10, :cond_a

    if-eqz v3, :cond_9

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v3, 0x1

    :goto_6
    if-nez v7, :cond_c

    if-eqz v1, :cond_b

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v1, 0x1

    :goto_8
    if-eqz v9, :cond_d

    if-eqz v4, :cond_d

    const/4 v4, 0x1

    goto :goto_9

    :cond_d
    const/4 v4, 0x0

    :goto_9
    invoke-direct {v2, v5, v3, v1, v4}, Ll/᩹ܿۘ;-><init>(Ll/᩶ܿۘ;ZZZ)V

    .line 139
    iput-object v2, v0, Ll/ۙܿۘ;->᩷:Ll/᩹ܿۘ;

    goto :goto_a

    :cond_e
    if-eqz v2, :cond_f

    .line 141
    iget-object v1, v0, Ll/ۙܿۘ;->ᩳ:Ljava/util/ArrayList;

    iget-object v2, v2, Ll/᩹ܿۘ;->֫:Ll/᩶ܿۘ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    :cond_f
    iput-object v5, v0, Ll/ۙܿۘ;->᩷:Ll/᩹ܿۘ;

    :goto_a
    move/from16 v1, p1

    .line 145
    iput v1, v0, Ll/ۙܿۘ;->֫:I

    move/from16 v1, p2

    .line 146
    iput v1, v0, Ll/ۙܿۘ;->ۧ:I

    :cond_10
    :goto_b
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 11

    .line 106
    iget-object v0, p0, Ll/ۙܿۘ;->ܽ:Ll/ۜܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/ۙܿۘ;->ۜ:Ljava/util/ArrayList;

    iget-object v4, p0, Ll/ۙܿۘ;->᩻:Ljava/util/ArrayList;

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳۘ;

    .line 107
    iget v5, v2, Ll/᩹ܳۘ;->֫:I

    iget v6, v2, Ll/᩹ܳۘ;->ܽ:I

    sub-int/2addr v5, v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_0

    add-int v8, v6, v7

    .line 110
    iget v9, v2, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v9, v7

    .line 95
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    instance-of v10, v10, Ll/ܳܿۘ;

    if-eqz v10, :cond_1

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    instance-of v10, v10, Ll/ܳܿۘ;

    if-eqz v10, :cond_1

    .line 113
    invoke-direct {p0, v8, v9, v1}, Ll/ۙܿۘ;->֫(IIZ)V

    const/4 v1, 0x0

    goto :goto_3

    :cond_1
    if-nez v8, :cond_2

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v10, v8, -0x1

    .line 100
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    instance-of v10, v10, Ll/ܳܿۘ;

    :goto_1
    if-eqz v10, :cond_4

    if-nez v9, :cond_3

    const/4 v10, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v10, v9, -0x1

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    instance-of v10, v10, Ll/ܳܿۘ;

    :goto_2
    if-eqz v10, :cond_4

    add-int/lit8 v8, v8, -0x1

    add-int/lit8 v9, v9, -0x1

    .line 117
    invoke-direct {p0, v8, v9, v1}, Ll/ۙܿۘ;->֫(IIZ)V

    :cond_4
    const/4 v1, 0x1

    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 125
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {p0, v0, v2, v1}, Ll/ۙܿۘ;->֫(IIZ)V

    .line 127
    iget-object v0, p0, Ll/ۙܿۘ;->᩷:Ll/᩹ܿۘ;

    iget-object v1, p0, Ll/ۙܿۘ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    iget-object v0, v0, Ll/᩹ܿۘ;->֫:Ll/᩶ܿۘ;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v1
.end method
