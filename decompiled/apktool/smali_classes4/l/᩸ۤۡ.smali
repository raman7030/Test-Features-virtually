.class public Ll/᩸ۤۡ;
.super Ljava/lang/Object;
.source "TATF"


# instance fields
.field public ֫:Ll/ܶۤۡ;

.field public final ۧ:Ll/᩶۫᩷;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    sget-object v0, Ll/᩸᩷ܿ;->᩷:Ll/᩶۫᩷;

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v1, Ll/ܶۤۡ;

    const/4 v2, 0x0

    new-array v2, v2, [Ll/۠ۤۡ;

    invoke-direct {v1, v2}, Ll/ܶۤۡ;-><init>([Ljava/lang/Object;)V

    iput-object v1, p0, Ll/᩸ۤۡ;->֫:Ll/ܶۤۡ;

    .line 23
    iput-object v0, p0, Ll/᩸ۤۡ;->ۧ:Ll/᩶۫᩷;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 234
    iget-object v0, p0, Ll/᩸ۤۡ;->֫:Ll/ܶۤۡ;

    invoke-virtual {v0}, Ll/᩵֡ᩴ;->clear()V

    return-void
.end method

.method public final ֫(IILl/᩸᩷ܿ;)V
    .locals 7

    if-lt p2, p1, :cond_14

    if-ne p1, p2, :cond_0

    return-void

    .line 60
    :cond_0
    iget-object v0, p0, Ll/᩸ۤۡ;->֫:Ll/ܶۤۡ;

    invoke-virtual {v0}, Ll/᩵֡ᩴ;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 61
    new-instance v1, Ll/۠ۤۡ;

    invoke-direct {v1, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    return-void

    .line 66
    :cond_1
    invoke-virtual {v0}, Ll/᩵֡ᩴ;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۤۡ;

    .line 67
    iget v2, v1, Ll/۠ۤۡ;->֫:I

    if-ne v2, p1, :cond_3

    .line 68
    iget-object v2, v1, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 69
    iput p2, v1, Ll/۠ۤۡ;->֫:I

    return-void

    .line 71
    :cond_2
    new-instance v1, Ll/۠ۤۡ;

    invoke-direct {v1, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    if-lt p1, v2, :cond_4

    .line 79
    new-instance v1, Ll/۠ۤۡ;

    invoke-direct {v1, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    return-void

    .line 32
    :cond_4
    invoke-virtual {v0}, Ll/᩵֡ᩴ;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    .line 36
    invoke-virtual {v0}, Ll/᩵֡ᩴ;->᩷()[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ll/۠ۤۡ;

    const/4 v4, 0x0

    :goto_0
    if-gt v4, v2, :cond_6

    const/4 v5, 0x2

    .line 38
    invoke-static {v2, v4, v5, v4}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v5

    .line 39
    aget-object v6, v3, v5

    iget v6, v6, Ll/۠ۤۡ;->֫:I

    if-le v6, p1, :cond_5

    add-int/lit8 v2, v5, -0x1

    move v1, v5

    goto :goto_0

    :cond_5
    add-int/lit8 v4, v5, 0x1

    goto :goto_0

    .line 88
    :cond_6
    invoke-virtual {v0}, Ll/᩵֡ᩴ;->size()I

    move-result v2

    if-eq v1, v2, :cond_13

    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ۤۡ;

    iget v2, v2, Ll/۠ۤۡ;->ۧ:I

    if-gt p2, v2, :cond_7

    goto/16 :goto_3

    .line 95
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ll/᩵֡ᩴ;->size()I

    move-result v2

    if-ge v1, v2, :cond_12

    .line 96
    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ۤۡ;

    .line 101
    iget v3, v2, Ll/۠ۤۡ;->ۧ:I

    if-gt p2, v3, :cond_8

    .line 102
    new-instance v2, Ll/۠ۤۡ;

    invoke-direct {v2, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    return-void

    .line 110
    :cond_8
    iget v4, v2, Ll/۠ۤۡ;->֫:I

    if-lt p1, v4, :cond_9

    goto/16 :goto_2

    .line 115
    :cond_9
    iget-object v5, p0, Ll/᩸ۤۡ;->ۧ:Ll/᩶۫᩷;

    if-ge p1, v3, :cond_c

    if-ge p2, v4, :cond_a

    .line 119
    iget-object v3, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Ll/᩸᩷ܿ;

    invoke-virtual {v3, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v3

    .line 120
    new-instance v4, Ll/۠ۤۡ;

    iget v5, v2, Ll/۠ۤۡ;->ۧ:I

    invoke-direct {v4, p1, v5, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    .line 121
    new-instance p1, Ll/۠ۤۡ;

    invoke-direct {p1, v5, p2, v3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    .line 122
    iput p2, v2, Ll/۠ۤۡ;->ۧ:I

    .line 123
    invoke-virtual {v0, v1, v4, p1}, Ll/ܶۤۡ;->֫(ILl/۠ۤۡ;Ll/۠ۤۡ;)V

    return-void

    :cond_a
    if-ne p2, v4, :cond_b

    .line 130
    new-instance p2, Ll/۠ۤۡ;

    invoke-direct {p2, p1, v3, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, p2}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    .line 131
    iget-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ll/᩸᩷ܿ;

    invoke-virtual {p1, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p1

    iput-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    return-void

    .line 138
    :cond_b
    new-instance v4, Ll/۠ۤۡ;

    invoke-direct {v4, p1, v3, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v4}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    .line 139
    iget-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ll/᩸᩷ܿ;

    invoke-virtual {p1, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p1

    iput-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    .line 140
    iget p1, v2, Ll/۠ۤۡ;->֫:I

    goto/16 :goto_2

    :cond_c
    if-ne p1, v3, :cond_f

    if-ge p2, v4, :cond_d

    .line 146
    new-instance v3, Ll/۠ۤۡ;

    iget-object v4, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, Ll/᩸᩷ܿ;

    invoke-virtual {v4, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p3

    invoke-direct {v3, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v3}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    .line 147
    iput p2, v2, Ll/۠ۤۡ;->ۧ:I

    return-void

    :cond_d
    if-ne p2, v4, :cond_e

    .line 154
    iget-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ll/᩸᩷ܿ;

    invoke-virtual {p1, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p1

    iput-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    return-void

    .line 161
    :cond_e
    iget-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ll/᩸᩷ܿ;

    invoke-virtual {p1, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p1

    iput-object p1, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    .line 162
    iget p1, v2, Ll/۠ۤۡ;->֫:I

    goto :goto_2

    :cond_f
    if-ge p2, v4, :cond_10

    .line 168
    iget-object v3, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Ll/᩸᩷ܿ;

    invoke-virtual {v3, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p3

    .line 169
    new-instance v3, Ll/۠ۤۡ;

    iget v4, v2, Ll/۠ۤۡ;->ۧ:I

    iget-object v5, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-direct {v3, v4, p1, v5}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    .line 170
    new-instance v4, Ll/۠ۤۡ;

    invoke-direct {v4, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    .line 171
    iput p2, v2, Ll/۠ۤۡ;->ۧ:I

    .line 172
    invoke-virtual {v0, v1, v3, v4}, Ll/ܶۤۡ;->֫(ILl/۠ۤۡ;Ll/۠ۤۡ;)V

    return-void

    :cond_10
    if-ne p2, v4, :cond_11

    .line 179
    new-instance p2, Ll/۠ۤۡ;

    iget-object v4, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-direct {p2, v3, p1, v4}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, p2}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    .line 180
    iget-object p2, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ll/᩸᩷ܿ;

    invoke-virtual {p2, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p2

    iput-object p2, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    .line 181
    iput p1, v2, Ll/۠ۤۡ;->ۧ:I

    return-void

    .line 188
    :cond_11
    new-instance v4, Ll/۠ۤۡ;

    iget-object v6, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-direct {v4, v3, p1, v6}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v4}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    .line 189
    iget-object v3, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Ll/᩸᩷ܿ;

    invoke-virtual {v3, p3}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v3

    iput-object v3, v2, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    .line 190
    iput p1, v2, Ll/۠ۤۡ;->ۧ:I

    .line 191
    iget p1, v2, Ll/۠ۤۡ;->֫:I

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    .line 195
    :cond_12
    new-instance v1, Ll/۠ۤۡ;

    invoke-direct {v1, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    return-void

    .line 89
    :cond_13
    :goto_3
    new-instance v2, Ll/۠ۤۡ;

    invoke-direct {v2, p1, p2, p3}, Ll/۠ۤۡ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    return-void

    .line 52
    :cond_14
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 230
    iget-object v0, p0, Ll/᩸ۤۡ;->֫:Ll/ܶۤۡ;

    return-object v0
.end method

.method public final ܽ()V
    .locals 9

    .line 202
    iget-object v0, p0, Ll/᩸ۤۡ;->֫:Ll/ܶۤۡ;

    invoke-virtual {v0}, Ll/᩵֡ᩴ;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_0

    goto :goto_2

    .line 207
    :cond_0
    invoke-virtual {v0}, Ll/᩵֡ᩴ;->᩷()[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ll/۠ۤۡ;

    const/4 v4, 0x0

    .line 209
    aget-object v5, v3, v4

    :goto_0
    if-ge v2, v1, :cond_2

    .line 211
    aget-object v6, v3, v2

    .line 212
    iget v7, v5, Ll/۠ۤۡ;->֫:I

    iget v8, v6, Ll/۠ۤۡ;->ۧ:I

    if-ne v7, v8, :cond_1

    iget-object v7, v5, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    iget-object v8, v6, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-static {v7, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 214
    iget v5, v5, Ll/۠ۤۡ;->ۧ:I

    iput v5, v6, Ll/۠ۤۡ;->ۧ:I

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v4, 0x1

    .line 216
    aput-object v5, v3, v4

    move v4, v7

    :goto_1
    add-int/lit8 v2, v2, 0x1

    move-object v5, v6

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v4, 0x1

    .line 220
    aput-object v5, v3, v4

    if-ge v2, v1, :cond_3

    .line 223
    invoke-virtual {v0, v2}, Ll/᩵֡ᩴ;->ܿ(I)V

    :cond_3
    :goto_2
    return-void
.end method
