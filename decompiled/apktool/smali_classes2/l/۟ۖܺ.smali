.class public final Ll/۟ۖܺ;
.super Ljava/lang/Object;
.source "LAJX"


# instance fields
.field public final ֫:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۜ()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/۟ۖܺ;->֫:Ljava/util/BitSet;

    return-void
.end method

.method public static ֫(Ll/᩷ۘܺ;)V
    .locals 14

    .line 58
    new-instance v0, Ll/۟ۖܺ;

    invoke-direct {v0, p0}, Ll/۟ۖܺ;-><init>(Ll/᩷ۘܺ;)V

    .line 71
    invoke-virtual {p0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 73
    :goto_0
    iget-object v4, v0, Ll/۟ۖܺ;->֫:Ljava/util/BitSet;

    if-ge v3, v1, :cond_1

    .line 74
    invoke-virtual {p0, v3}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 77
    invoke-virtual {v5}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ܿ()I

    move-result v5

    if-nez v5, :cond_0

    .line 78
    invoke-virtual {v4, v3}, Ljava/util/BitSet;->set(I)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 83
    :cond_1
    :goto_1
    invoke-virtual {v4, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    if-ltz v0, :cond_f

    .line 84
    invoke-virtual {v4, v0}, Ljava/util/BitSet;->clear(I)V

    .line 90
    invoke-virtual {p0, v0}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v1

    check-cast v1, Ll/ܰۖܺ;

    .line 132
    invoke-virtual {v1, p0}, Ll/ܰۖܺ;->֫(Ll/᩷ۘܺ;)V

    .line 134
    invoke-virtual {v1}, Ll/ܰۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v3

    .line 140
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    move-object v9, v6

    :goto_2
    if-ge v8, v5, :cond_3

    .line 142
    invoke-virtual {v3, v8}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v10

    .line 144
    invoke-virtual {v10}, Ll/᩸ۡܺ;->ܿ()I

    move-result v11

    if-eqz v11, :cond_2

    move v7, v8

    move-object v9, v10

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    if-nez v9, :cond_4

    goto :goto_1

    .line 155
    :cond_4
    invoke-virtual {v9}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v8

    .line 156
    invoke-virtual {v9}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    :goto_3
    if-ge v10, v5, :cond_9

    if-ne v10, v7, :cond_5

    goto :goto_5

    .line 163
    :cond_5
    invoke-virtual {v3, v10}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v12

    .line 166
    invoke-virtual {v12}, Ll/᩸ۡܺ;->ܿ()I

    move-result v13

    if-nez v13, :cond_6

    goto :goto_5

    :cond_6
    if-eqz v11, :cond_8

    .line 171
    invoke-virtual {v12}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v11

    if-eq v8, v11, :cond_7

    if-eqz v8, :cond_8

    .line 121
    invoke-virtual {v8, v11}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    :cond_7
    const/4 v11, 0x1

    goto :goto_4

    :cond_8
    const/4 v11, 0x0

    .line 173
    :goto_4
    invoke-virtual {v12}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v12

    invoke-static {v9, v12}, Ll/᩺ۤۡ;->ۧ(Ll/֫ۖܺ;Ll/֫ۖܺ;)Ll/֫ۖܺ;

    move-result-object v9

    :goto_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_9
    if-eqz v9, :cond_d

    if-eqz v11, :cond_a

    move-object v6, v8

    .line 193
    :cond_a
    invoke-virtual {v1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v3

    .line 195
    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v5

    if-ne v5, v9, :cond_b

    .line 196
    invoke-virtual {v3}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v3

    if-eq v6, v3, :cond_1

    if-eqz v6, :cond_b

    .line 121
    invoke-virtual {v6, v3}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_1

    .line 119
    :cond_b
    invoke-virtual {v1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    .line 118
    invoke-static {v3, v9, v6}, Ll/᩸ۡܺ;->ܽ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ܳۘܺ;->֫(Ll/᩸ۡܺ;)V

    .line 98
    invoke-virtual {p0, v0}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object v0

    .line 100
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v1, :cond_1

    .line 102
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۘܺ;

    .line 103
    invoke-virtual {v5}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v6

    if-eqz v6, :cond_c

    .line 104
    instance-of v5, v5, Ll/ܰۖܺ;

    if-eqz v5, :cond_c

    .line 105
    invoke-virtual {v6}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/util/BitSet;->set(I)V

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 181
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_7
    if-ge v2, v5, :cond_e

    .line 184
    invoke-virtual {v3, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    .line 185
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 188
    :cond_e
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t map types in phi insn:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    return-void
.end method
