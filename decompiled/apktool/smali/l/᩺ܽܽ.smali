.class public final Ll/᩺ܽܽ;
.super Ljava/lang/Object;
.source "56JZ"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۧ:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ܽܽ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺ܽܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨܽܽ;)Z
    .locals 12

    .line 115
    iget-object v0, p0, Ll/᩺ܽܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 116
    :cond_0
    iget-object v1, p0, Ll/᩺ܽܽ;->ۧ:[I

    const/4 v3, 0x0

    if-nez v1, :cond_1

    goto :goto_1

    .line 117
    :cond_1
    array-length v4, v1

    new-array v4, v4, [Ll/ۛܽܽ;

    .line 118
    array-length v5, v1

    new-array v5, v5, [I

    .line 119
    array-length v1, v1

    new-array v1, v1, [I

    .line 120
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛܽܽ;

    const/4 v7, 0x0

    .line 121
    :goto_0
    iget v8, v6, Ll/ۛܽܽ;->ۧ:I

    if-ge v7, v8, :cond_2

    .line 122
    iget-object v8, v6, Ll/ۛܽܽ;->ܽ:[I

    aget v8, v8, v7

    .line 123
    iget-object v9, p0, Ll/᩺ܽܽ;->ۧ:[I

    array-length v9, v9

    if-lt v8, v9, :cond_3

    :goto_1
    return v3

    .line 124
    :cond_3
    aget-object v9, v4, v8

    if-nez v9, :cond_4

    aput-object v6, v4, v8

    goto :goto_2

    .line 126
    :cond_4
    aget v10, v5, v8

    iget-object v9, v9, Ll/ۛܽܽ;->ᩳ:Ll/᩸ܽܽ;

    iget-object v11, v6, Ll/ۛܽܽ;->ᩳ:Ll/᩸ܽܽ;

    invoke-virtual {v9, v11}, Ll/᩸ܽܽ;->ۧ(Ll/᩸ܽܽ;)I

    move-result v9

    or-int/2addr v9, v10

    aput v9, v5, v8

    .line 127
    aget v9, v1, v8

    aget-object v10, v4, v8

    iget-object v10, v10, Ll/ۛܽܽ;->֫:Ll/᩸ܽܽ;

    iget-object v11, v6, Ll/ۛܽܽ;->֫:Ll/᩸ܽܽ;

    invoke-virtual {v10, v11}, Ll/᩸ܽܽ;->ۧ(Ll/᩸ܽܽ;)I

    move-result v10

    or-int/2addr v9, v10

    aput v9, v1, v8

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 131
    :cond_5
    :goto_3
    iget-object v0, p0, Ll/᩺ܽܽ;->ۧ:[I

    array-length v6, v0

    if-ge v3, v6, :cond_9

    .line 132
    aget-object v6, v4, v3

    if-nez v6, :cond_6

    goto :goto_4

    .line 133
    :cond_6
    aget v6, v5, v3

    const/high16 v7, 0x1c0000

    and-int v8, v6, v7

    if-eqz v8, :cond_7

    .line 134
    aget v9, v0, v3

    and-int/2addr v9, v7

    if-ne v8, v9, :cond_7

    iget v9, p1, Ll/ۨܽܽ;->ᩳ:I

    add-int/2addr v9, v2

    iput v9, p1, Ll/ۨܽܽ;->ᩳ:I

    .line 135
    :cond_7
    aget v0, v0, v3

    and-int/2addr v7, v0

    if-eq v8, v7, :cond_8

    iget v7, p1, Ll/ۨܽܽ;->ܽ:I

    add-int/2addr v7, v2

    iput v7, p1, Ll/ۨܽܽ;->ܽ:I

    .line 136
    :cond_8
    iget v7, p1, Ll/ۨܽܽ;->ۧ:I

    xor-int/2addr v0, v6

    const v6, 0x3ffff

    and-int/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    add-int/2addr v0, v7

    iput v0, p1, Ll/ۨܽܽ;->ۧ:I

    .line 137
    iget v0, p1, Ll/ۨܽܽ;->֫:I

    aget v7, v1, v3

    iget-object v8, p0, Ll/᩺ܽܽ;->ۧ:[I

    aget v8, v8, v3

    xor-int/2addr v7, v8

    and-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    move-result v6

    add-int/2addr v6, v0

    iput v6, p1, Ll/ۨܽܽ;->֫:I

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_9
    :goto_5
    return v2
.end method
