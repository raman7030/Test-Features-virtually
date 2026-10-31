.class public abstract Ll/ᩴܿۘ;
.super Ljava/lang/Object;
.source "L1LP"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ll/ۜܳۘ;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ll/ۜܳۘ;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ᩴܿۘ;->֫:Ljava/util/List;

    .line 50
    iput-object p2, p0, Ll/ᩴܿۘ;->ۧ:Ljava/util/List;

    .line 51
    iput-object p3, p0, Ll/ᩴܿۘ;->ܽ:Ll/ۜܳۘ;

    .line 53
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩴܿۘ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method

.method private ۧ()V
    .locals 23

    move-object/from16 v6, p0

    .line 67
    iget-object v7, v6, Ll/ᩴܿۘ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto/16 :goto_5

    .line 0
    :cond_0
    invoke-static {v7, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 69
    move-object v4, v0

    check-cast v4, Ll/᩹ܳۘ;

    const/4 v0, 0x1

    .line 0
    invoke-static {v7, v0}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 70
    move-object v5, v0

    check-cast v5, Ll/᩹ܳۘ;

    .line 71
    iget v8, v4, Ll/᩹ܳۘ;->֫:I

    iget v9, v4, Ll/᩹ܳۘ;->ᩳ:I

    iget v10, v4, Ll/᩹ܳۘ;->ܽ:I

    iget v11, v4, Ll/᩹ܳۘ;->ۧ:I

    iget v12, v5, Ll/᩹ܳۘ;->ܽ:I

    iget v13, v5, Ll/᩹ܳۘ;->ۧ:I

    iget v14, v5, Ll/᩹ܳۘ;->֫:I

    iget v15, v5, Ll/᩹ܳۘ;->ᩳ:I

    if-eq v8, v12, :cond_1

    if-eq v11, v15, :cond_1

    goto/16 :goto_5

    :cond_1
    sub-int v0, v8, v10

    sub-int v1, v14, v12

    add-int v2, v8, v1

    add-int v3, v11, v1

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v16, v5

    move v11, v8

    .line 215
    :goto_0
    iget-object v4, v6, Ll/ᩴܿۘ;->ۧ:Ljava/util/List;

    move/from16 v19, v13

    iget-object v13, v6, Ll/ᩴܿۘ;->֫:Ljava/util/List;

    if-ge v11, v2, :cond_3

    if-ge v5, v3, :cond_3

    move/from16 v20, v2

    .line 86
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 50
    invoke-static {v2, v6}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v6, p0

    move/from16 v13, v19

    move/from16 v2, v20

    goto :goto_0

    :cond_3
    :goto_1
    sub-int v2, v11, v8

    sub-int v5, v12, v0

    sub-int v6, v15, v0

    move v11, v12

    move/from16 v20, v15

    :goto_2
    if-ge v5, v11, :cond_5

    if-ge v6, v15, :cond_5

    move/from16 v21, v5

    add-int/lit8 v5, v11, -0x1

    move/from16 v22, v6

    add-int/lit8 v6, v15, -0x1

    .line 92
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 50
    invoke-static {v5, v6}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v11, v11, -0x1

    add-int/lit8 v15, v15, -0x1

    move/from16 v5, v21

    move/from16 v6, v22

    goto :goto_2

    :cond_5
    move/from16 v21, v5

    move/from16 v22, v6

    :goto_3
    sub-int v4, v12, v11

    if-nez v2, :cond_6

    if-nez v4, :cond_6

    goto/16 :goto_5

    :cond_6
    if-ne v2, v1, :cond_7

    .line 88
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 89
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 90
    new-instance v0, Ll/᩹ܳۘ;

    add-int/2addr v8, v1

    invoke-direct {v0, v10, v8, v9, v3}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    invoke-direct/range {p0 .. p0}, Ll/ᩴܿۘ;->ۧ()V

    return-void

    :cond_7
    if-ne v4, v0, :cond_8

    .line 97
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 98
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 99
    new-instance v0, Ll/᩹ܳۘ;

    move/from16 v6, v19

    move/from16 v12, v21

    move/from16 v15, v22

    invoke-direct {v0, v12, v14, v15, v6}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    invoke-direct/range {p0 .. p0}, Ll/ᩴܿۘ;->ۧ()V

    return-void

    :cond_8
    move/from16 v6, v19

    if-ne v8, v12, :cond_9

    const/4 v0, 0x1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    .line 105
    :goto_4
    invoke-static {v0}, Ll/᩶ܳۘ;->ۧ(Z)Ll/᩶ܳۘ;

    move-result-object v1

    move-object/from16 v0, p0

    move v3, v4

    move-object/from16 v4, v18

    move-object/from16 v5, v17

    .line 107
    invoke-virtual/range {v0 .. v5}, Ll/ᩴܿۘ;->֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;Ll/᩹ܳۘ;)I

    move-result v0

    if-eqz v0, :cond_a

    .line 109
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 110
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 111
    new-instance v1, Ll/᩹ܳۘ;

    add-int/2addr v8, v0

    add-int v11, v16, v0

    invoke-direct {v1, v10, v8, v9, v11}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    new-instance v1, Ll/᩹ܳۘ;

    add-int/2addr v12, v0

    add-int v15, v20, v0

    invoke-direct {v1, v12, v14, v15, v6}, Ll/᩹ܳۘ;-><init>(IIII)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_5
    return-void
.end method


# virtual methods
.method public abstract ֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;Ll/᩹ܳۘ;)I
.end method

.method public ֫()Ll/ۜܳۘ;
    .locals 3

    .line 58
    iget-object v0, p0, Ll/ᩴܿۘ;->ܽ:Ll/ۜܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ᩴܿۘ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    .line 59
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-direct {p0}, Ll/ᩴܿۘ;->ۧ()V

    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Ll/ᩴܿۘ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Ll/ᩴܿۘ;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1, v2}, Ll/᩻ܳۘ;->֫(IILjava/util/List;)Ll/֫ܳۘ;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object v0

    return-object v0
.end method
