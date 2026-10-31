.class public final Ll/ۖۖܺ;
.super Ljava/lang/Object;
.source "SBDM"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:[Ll/ۡۖܺ;

.field public final ܽ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;[Ll/᩷ۖܺ;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۖܺ;->֫:Ljava/util/ArrayList;

    .line 78
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x2

    new-array p1, p1, [Ll/ۡۖܺ;

    iput-object p1, p0, Ll/ۖۖܺ;->ۧ:[Ll/ۡۖܺ;

    .line 79
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۖۖܺ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ll/ܽۘܺ;)Ll/ܽۘܺ;
    .locals 8

    .line 158
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/ۖۖܺ;->ۧ:[Ll/ۡۖܺ;

    aget-object v0, v1, v0

    .line 160
    iget-object v2, v0, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    if-nez v2, :cond_0

    return-object p1

    .line 120
    :cond_0
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۧ()I

    move-result v2

    aget-object v2, v1, v2

    .line 121
    iget-object v2, v2, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v2}, Ll/ܽۘܺ;->ۧ()I

    move-result v2

    aget-object v2, v1, v2

    .line 123
    iget-object v2, v2, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    if-eqz v2, :cond_4

    .line 124
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 126
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 129
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    .line 130
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۘܺ;

    .line 131
    invoke-virtual {v4}, Ll/ܽۘܺ;->ۧ()I

    move-result v4

    aget-object v4, v1, v4

    .line 132
    iget-object v5, v4, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    .line 133
    invoke-virtual {v5}, Ll/ܽۘܺ;->ۧ()I

    move-result v6

    aget-object v6, v1, v6

    .line 136
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, v6, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    if-eqz v7, :cond_1

    .line 137
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 140
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 143
    iget-object p1, v6, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    if-nez p1, :cond_2

    goto :goto_0

    .line 146
    :cond_2
    iget-object p1, v6, Ll/ۡۖܺ;->ᩳ:Ll/ܽۘܺ;

    .line 147
    iget-object v5, v4, Ll/ۡۖܺ;->ᩳ:Ll/ܽۘܺ;

    .line 148
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۧ()I

    move-result v7

    aget-object v7, v1, v7

    iget v7, v7, Ll/ۡۖܺ;->ܿ:I

    .line 149
    invoke-virtual {v5}, Ll/ܽۘܺ;->ۧ()I

    move-result v5

    aget-object v5, v1, v5

    iget v5, v5, Ll/ۡۖܺ;->ܿ:I

    if-ge v7, v5, :cond_3

    .line 150
    iput-object p1, v4, Ll/ۡۖܺ;->ᩳ:Ll/ܽۘܺ;

    .line 152
    :cond_3
    iget-object p1, v6, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    iput-object p1, v4, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    goto :goto_0

    .line 165
    :cond_4
    iget-object p1, v0, Ll/ۡۖܺ;->ᩳ:Ll/ܽۘܺ;

    return-object p1
.end method

.method public static ֫(Ll/᩷ۘܺ;[Ll/᩷ۖܺ;)V
    .locals 11

    .line 92
    new-instance v0, Ll/ۖۖܺ;

    invoke-direct {v0, p0, p1}, Ll/ۖۖܺ;-><init>(Ll/᩷ۘܺ;[Ll/᩷ۖܺ;)V

    .line 176
    invoke-virtual {p0}, Ll/᩷ۘܺ;->ܽ()Ll/ܽۘܺ;

    move-result-object v1

    .line 178
    iget-object v2, v0, Ll/ۖۖܺ;->ܽ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 179
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    invoke-virtual {v1}, Ll/ܽۘܺ;->ۧ()I

    move-result v3

    aget-object v3, p1, v3

    invoke-virtual {v1}, Ll/ܽۘܺ;->ۧ()I

    move-result v1

    iput v1, v3, Ll/᩷ۖܺ;->ۧ:I

    .line 188
    :cond_0
    new-instance v1, Ll/ܺۖܺ;

    invoke-direct {v1, v0}, Ll/ܺۖܺ;-><init>(Ll/ۖۖܺ;)V

    .line 189
    invoke-virtual {p0, v1}, Ll/᩷ۘܺ;->֫(Ll/ۧۘܺ;)V

    .line 192
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 v1, 0x1

    sub-int/2addr p0, v1

    move v3, p0

    :goto_0
    const/4 v4, 0x2

    .line 195
    iget-object v5, v0, Ll/ۖۖܺ;->ۧ:[Ll/ۡۖܺ;

    if-lt v3, v4, :cond_5

    .line 196
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۘܺ;

    .line 197
    invoke-virtual {v4}, Ll/ܽۘܺ;->ۧ()I

    move-result v6

    aget-object v6, v5, v6

    .line 110
    invoke-virtual {v4}, Ll/ܽۘܺ;->᩻()Ljava/util/BitSet;

    move-result-object v7

    const/4 v8, 0x0

    .line 200
    invoke-virtual {v7, v8}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v8

    :goto_1
    if-ltz v8, :cond_2

    .line 203
    iget-object v9, v0, Ll/ۖۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܽۘܺ;

    .line 204
    invoke-virtual {v9}, Ll/ܽۘܺ;->ۧ()I

    move-result v10

    aget-object v10, v5, v10

    if-eqz v10, :cond_1

    .line 211
    invoke-direct {v0, v9}, Ll/ۖۖܺ;->֫(Ll/ܽۘܺ;)Ll/ܽۘܺ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܽۘܺ;->ۧ()I

    move-result v9

    aget-object v9, v5, v9

    iget v9, v9, Ll/ۡۖܺ;->ܿ:I

    .line 212
    iget v10, v6, Ll/ۡۖܺ;->ܿ:I

    if-ge v9, v10, :cond_1

    .line 213
    iput v9, v6, Ll/ۡۖܺ;->ܿ:I

    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 202
    invoke-virtual {v7, v8}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v8

    goto :goto_1

    .line 217
    :cond_2
    iget v7, v6, Ll/ۡۖܺ;->ܿ:I

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽۘܺ;

    invoke-virtual {v7}, Ll/ܽۘܺ;->ۧ()I

    move-result v7

    aget-object v7, v5, v7

    iget-object v7, v7, Ll/ۡۖܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    iget-object v4, v6, Ll/ۡۖܺ;->ܽ:Ll/ܽۘܺ;

    iput-object v4, v6, Ll/ۡۖܺ;->֫:Ll/ܽۘܺ;

    .line 228
    invoke-virtual {v4}, Ll/ܽۘܺ;->ۧ()I

    move-result v4

    aget-object v4, v5, v4

    iget-object v4, v4, Ll/ۡۖܺ;->ۧ:Ljava/util/ArrayList;

    .line 230
    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_4

    .line 0
    invoke-static {v4, v1}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v7

    .line 232
    check-cast v7, Ll/ܽۘܺ;

    .line 233
    invoke-direct {v0, v7}, Ll/ۖۖܺ;->֫(Ll/ܽۘܺ;)Ll/ܽۘܺ;

    move-result-object v8

    .line 234
    invoke-virtual {v8}, Ll/ܽۘܺ;->ۧ()I

    move-result v9

    aget-object v9, v5, v9

    iget v9, v9, Ll/ۡۖܺ;->ܿ:I

    .line 235
    invoke-virtual {v7}, Ll/ܽۘܺ;->ۧ()I

    move-result v10

    aget-object v10, v5, v10

    iget v10, v10, Ll/ۡۖܺ;->ܿ:I

    if-ge v9, v10, :cond_3

    .line 236
    invoke-virtual {v7}, Ll/ܽۘܺ;->ۧ()I

    move-result v7

    aget-object v7, p1, v7

    invoke-virtual {v8}, Ll/ܽۘܺ;->ۧ()I

    move-result v8

    iput v8, v7, Ll/᩷ۖܺ;->ۧ:I

    goto :goto_2

    .line 238
    :cond_3
    invoke-virtual {v7}, Ll/ܽۘܺ;->ۧ()I

    move-result v7

    aget-object v7, p1, v7

    iget-object v8, v6, Ll/ۡۖܺ;->ܽ:Ll/ܽۘܺ;

    invoke-virtual {v8}, Ll/ܽۘܺ;->ۧ()I

    move-result v8

    iput v8, v7, Ll/᩷ۖܺ;->ۧ:I

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, -0x1

    goto/16 :goto_0

    :cond_5
    :goto_3
    if-gt v4, p0, :cond_7

    .line 245
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۘܺ;

    .line 246
    invoke-virtual {v0}, Ll/ܽۘܺ;->ۧ()I

    move-result v1

    aget-object v1, p1, v1

    iget v1, v1, Ll/᩷ۖܺ;->ۧ:I

    .line 247
    invoke-virtual {v0}, Ll/ܽۘܺ;->ۧ()I

    move-result v3

    aget-object v3, v5, v3

    iget v3, v3, Ll/ۡۖܺ;->ܿ:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۘܺ;

    invoke-virtual {v3}, Ll/ܽۘܺ;->ۧ()I

    move-result v3

    if-eq v1, v3, :cond_6

    .line 248
    invoke-virtual {v0}, Ll/ܽۘܺ;->ۧ()I

    move-result v1

    aget-object v1, p1, v1

    .line 249
    invoke-virtual {v0}, Ll/ܽۘܺ;->ۧ()I

    move-result v0

    aget-object v0, p1, v0

    iget v0, v0, Ll/᩷ۖܺ;->ۧ:I

    aget-object v0, p1, v0

    iget v0, v0, Ll/᩷ۖܺ;->ۧ:I

    iput v0, v1, Ll/᩷ۖܺ;->ۧ:I

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖۖܺ;)[Ll/ۡۖܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۖܺ;->ۧ:[Ll/ۡۖܺ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۖۖܺ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۖܺ;->ܽ:Ljava/util/ArrayList;

    return-object p0
.end method
