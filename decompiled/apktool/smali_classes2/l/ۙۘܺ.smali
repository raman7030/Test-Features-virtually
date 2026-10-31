.class public final Ll/ۙۘܺ;
.super Ljava/lang/Object;
.source "WBA0"


# instance fields
.field public ֫:Ll/ܽۘܺ;

.field public final ۜ:Ljava/util/BitSet;

.field public final ۧ:Ll/᩹ۘܺ;

.field public final ܳ:Ll/᩷ۘܺ;

.field public final ܽ:Ljava/util/BitSet;

.field public final ܿ:I

.field public ᩳ:Ll/᩶ۘܺ;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;ILl/᩹ۘܺ;)V
    .locals 1

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 127
    iput-object p1, p0, Ll/ۙۘܺ;->ܳ:Ll/᩷ۘܺ;

    .line 128
    iput p2, p0, Ll/ۙۘܺ;->ܿ:I

    .line 129
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Ll/ۙۘܺ;->ۜ:Ljava/util/BitSet;

    .line 130
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Ll/ۙۘܺ;->ܽ:Ljava/util/BitSet;

    .line 131
    iput-object p3, p0, Ll/ۙۘܺ;->ۧ:Ll/᩹ۘܺ;

    return-void
.end method

.method public static ֫(Ll/᩷ۘܺ;)Ll/᩹ۘܺ;
    .locals 11

    .line 103
    invoke-virtual {p0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v0

    .line 104
    new-instance v1, Ll/᩹ۘܺ;

    invoke-direct {v1, v0}, Ll/᩹ۘܺ;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    .line 107
    new-instance v4, Ll/ۙۘܺ;

    invoke-direct {v4, p0, v3, v1}, Ll/ۙۘܺ;-><init>(Ll/᩷ۘܺ;ILl/᩹ۘܺ;)V

    .line 166
    iget-object v5, v4, Ll/ۙۘܺ;->ܳ:Ll/᩷ۘܺ;

    iget v6, v4, Ll/ۙۘܺ;->ܿ:I

    invoke-virtual {v5, v6}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object v7

    .line 168
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܳۘܺ;

    .line 169
    sget-object v9, Ll/᩶ۘܺ;->᩹:Ll/᩶ۘܺ;

    iput-object v9, v4, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    .line 171
    instance-of v9, v8, Ll/ܰۖܺ;

    if-eqz v9, :cond_1

    .line 173
    check-cast v8, Ll/ܰۖܺ;

    .line 176
    invoke-virtual {v8, v6, v5}, Ll/ܰۖܺ;->֫(ILl/᩷ۘܺ;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܽۘܺ;

    .line 177
    iput-object v9, v4, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    .line 179
    sget-object v9, Ll/᩶ۘܺ;->ۙ:Ll/᩶ۘܺ;

    iput-object v9, v4, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    .line 180
    invoke-direct {v4}, Ll/ۙۘܺ;->֫()V

    goto :goto_2

    .line 183
    :cond_1
    invoke-virtual {v8}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v9

    iput-object v9, v4, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    .line 184
    invoke-virtual {v9}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v8

    iput v8, v4, Ll/ۙۘܺ;->᩻:I

    if-ltz v8, :cond_2

    .line 191
    sget-object v8, Ll/᩶ۘܺ;->᩶:Ll/᩶ۘܺ;

    iput-object v8, v4, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    .line 192
    invoke-direct {v4}, Ll/ۙۘܺ;->֫()V

    goto :goto_1

    .line 187
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "insn not found in it\'s own block"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 197
    :cond_3
    :goto_3
    iget-object v6, v4, Ll/ۙۘܺ;->ܽ:Ljava/util/BitSet;

    invoke-virtual {v6, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v7

    if-ltz v7, :cond_4

    .line 198
    invoke-virtual {v5}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܽۘܺ;

    iput-object v8, v4, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    .line 199
    invoke-virtual {v6, v7}, Ljava/util/BitSet;->clear(I)V

    .line 200
    sget-object v6, Ll/᩶ۘܺ;->ۙ:Ll/᩶ۘܺ;

    iput-object v6, v4, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    .line 201
    invoke-direct {v4}, Ll/ۙۘܺ;->֫()V

    goto :goto_3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 273
    :cond_5
    invoke-virtual {p0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۘܺ;

    .line 274
    invoke-virtual {v0}, Ll/ܽۘܺ;->ܳ()Ljava/util/List;

    move-result-object v0

    .line 276
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_6

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v2, :cond_a

    if-ne v3, v4, :cond_7

    goto :goto_8

    .line 284
    :cond_7
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۘܺ;

    .line 285
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳۘܺ;

    .line 286
    invoke-virtual {v5}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v7

    invoke-virtual {v6}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v8

    .line 296
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v7

    const/4 v9, 0x0

    .line 297
    :goto_6
    invoke-virtual {v8}, Ll/ܿᩴܺ;->size()I

    move-result v10

    if-ge v9, v10, :cond_8

    .line 298
    invoke-virtual {v8, v9}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v10

    invoke-virtual {v10}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v10

    invoke-virtual {v1, v7, v10}, Ll/᩹ۘܺ;->֫(II)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 287
    :cond_8
    invoke-virtual {v6}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v7

    invoke-virtual {v5}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v8

    .line 296
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v7

    const/4 v9, 0x0

    .line 297
    :goto_7
    invoke-virtual {v8}, Ll/ܿᩴܺ;->size()I

    move-result v10

    if-ge v9, v10, :cond_9

    .line 298
    invoke-virtual {v8, v9}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v10

    invoke-virtual {v10}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v10

    invoke-virtual {v1, v7, v10}, Ll/᩹ۘܺ;->֫(II)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    .line 288
    :cond_9
    invoke-virtual {v5}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    invoke-virtual {v6}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v6

    invoke-virtual {v1, v5, v6}, Ll/᩹ۘܺ;->֫(II)V

    :goto_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    return-object v1
.end method

.method private ֫()V
    .locals 5

    .line 140
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    sget-object v1, Ll/᩶ۘܺ;->᩹:Ll/᩶ۘܺ;

    if-eq v0, v1, :cond_6

    .line 141
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v2, p0, Ll/ۙۘܺ;->ܿ:I

    if-eqz v0, :cond_4

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    goto :goto_0

    .line 153
    :cond_1
    iput-object v1, p0, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    .line 209
    iget-object v0, p0, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0}, Ll/ܽۘܺ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/ۙۘܺ;->ۜ:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    iget-object v0, p0, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0}, Ll/ܽۘܺ;->ۧ()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    .line 212
    iget-object v0, p0, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0, v2}, Ll/ܽۘܺ;->ۧ(I)V

    .line 216
    iget-object v0, p0, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    .line 219
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v3

    iput v0, p0, Ll/ۙۘܺ;->᩻:I

    .line 220
    sget-object v0, Ll/᩶ۘܺ;->ۗ:Ll/᩶ۘܺ;

    iput-object v0, p0, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    goto :goto_0

    .line 148
    :cond_2
    iput-object v1, p0, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    .line 247
    iget-object v0, p0, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Ll/ۙۘܺ;->᩻:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۘܺ;

    .line 248
    invoke-virtual {v0}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    .line 250
    invoke-virtual {v0, v2}, Ll/ܳۘܺ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_3

    .line 252
    iget-object v0, p0, Ll/ۙۘܺ;->ۧ:Ll/᩹ۘܺ;

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Ll/᩹ۘܺ;->֫(II)V

    .line 254
    :cond_3
    sget-object v0, Ll/᩶ۘܺ;->᩶:Ll/᩶ۘܺ;

    iput-object v0, p0, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    goto :goto_0

    .line 143
    :cond_4
    iput-object v1, p0, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    .line 229
    iget v0, p0, Ll/ۙۘܺ;->᩻:I

    if-nez v0, :cond_5

    .line 231
    iget-object v0, p0, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0, v2}, Ll/ܽۘܺ;->֫(I)V

    .line 233
    iget-object v0, p0, Ll/ۙۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0}, Ll/ܽۘܺ;->᩻()Ljava/util/BitSet;

    move-result-object v0

    .line 235
    iget-object v1, p0, Ll/ۙۘܺ;->ܽ:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto/16 :goto_0

    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 238
    iput v0, p0, Ll/ۙۘܺ;->᩻:I

    .line 239
    sget-object v0, Ll/᩶ۘܺ;->ۗ:Ll/᩶ۘܺ;

    iput-object v0, p0, Ll/ۙۘܺ;->ᩳ:Ll/᩶ۘܺ;

    goto/16 :goto_0

    :cond_6
    return-void
.end method
