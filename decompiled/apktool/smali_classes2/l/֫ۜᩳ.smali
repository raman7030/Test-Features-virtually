.class public final Ll/֫ۜᩳ;
.super Ll/ܿ۬ܿ;
.source "K5R1"


# instance fields
.field public final synthetic ᩳ:Ll/ۜۜᩳ;


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;Ll/ۜۜᩳ;Z)V
    .locals 0

    .line 185
    iput-object p1, p0, Ll/֫ۜᩳ;->ᩳ:Ll/ۜۜᩳ;

    invoke-direct {p0, p2, p3}, Ll/ܿ۬ܿ;-><init>(Ll/ۗܺ᩷;Z)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 265
    sget-object v0, Ll/ۨ᩻ᩳ;->֫:[I

    iget-object v1, p0, Ll/֫ۜᩳ;->ᩳ:Ll/ۜۜᩳ;

    iget-object v2, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    invoke-virtual {v2}, Ll/᩻ۜᩳ;->ᩳ()Ll/ۙۜᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v2, 0x5

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 271
    :cond_0
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-boolean v3, v0, Ll/᩻ۜᩳ;->᩻֫:Z

    .line 272
    iget-object v0, v0, Ll/᩻ۜᩳ;->ۙ:Ll/ۖܿܽ;

    invoke-virtual {v0}, Ll/ۜᩳܽ;->ۧۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 267
    :cond_1
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-boolean v3, v0, Ll/᩻ۜᩳ;->᩻֫:Z

    const v0, 0x7f120a00

    .line 268
    invoke-virtual {v1, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    goto :goto_0

    .line 277
    :cond_2
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-boolean v3, v0, Ll/᩻ۜᩳ;->ܳ֫:Z

    .line 278
    iget-object v0, v0, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {v0}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 281
    :goto_0
    iget-object v0, v1, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ll/ᩳ۬ܿ;Ljava/lang/String;)V
    .locals 10

    .line 189
    sget-object v0, Ll/ۨ᩻ᩳ;->֫:[I

    iget-object v1, p0, Ll/֫ۜᩳ;->ᩳ:Ll/ۜۜᩳ;

    iget-object v2, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    invoke-virtual {v2}, Ll/᩻ۜᩳ;->ᩳ()Ll/ۙۜᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_a

    const/4 v5, 0x2

    if-eq v0, v5, :cond_a

    const/4 v5, 0x3

    if-eq v0, v5, :cond_a

    const/4 v5, 0x4

    if-eq v0, v5, :cond_7

    const/4 v5, 0x5

    if-eq v0, v5, :cond_0

    goto/16 :goto_6

    .line 202
    :cond_0
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-object p2, v0, Ll/᩻ۜᩳ;->ܿ֫:Ljava/lang/String;

    .line 203
    iput-boolean v4, v0, Ll/᩻ۜᩳ;->᩻֫:Z

    .line 204
    iget-object v5, v0, Ll/᩻ۜᩳ;->ܽ֫:[I

    array-length v5, v5

    iget-object v0, v0, Ll/᩻ۜᩳ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 205
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v5, v0, Ll/᩻ۜᩳ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v5, v5, [I

    iput-object v5, v0, Ll/᩻ۜᩳ;->ܽ֫:[I

    .line 206
    :cond_1
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput v3, v0, Ll/᩻ۜᩳ;->ᩳ֫:I

    const/4 v0, 0x0

    .line 207
    :goto_0
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v5, v5, Ll/᩻ۜᩳ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_e

    .line 208
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v5, v5, Ll/᩻ۜᩳ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴܿܽ;

    .line 209
    invoke-virtual {v5}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 210
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v5, Ll/᩻ۜᩳ;->ܽ֫:[I

    iget v7, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    aput v0, v6, v7

    goto/16 :goto_2

    .line 211
    :cond_2
    invoke-virtual {v5}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v4, [Ljava/lang/Object;

    aput-object v6, v7, v3

    const-string v6, "%04X"

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 212
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v5, Ll/᩻ۜᩳ;->ܽ֫:[I

    iget v7, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    aput v0, v6, v7

    goto/16 :goto_2

    .line 213
    :cond_3
    iget-object v6, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v6, Ll/᩻ۜᩳ;->ۤ:Ll/᩶ܿܽ;

    invoke-virtual {v6}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "id"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 214
    invoke-virtual {v5}, Ll/ᩴܿܽ;->᩻֫()Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v6, Ll/᩻ۜᩳ;->ۤ:Ll/᩶ܿܽ;

    invoke-virtual {v6}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "style"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Ll/᩷ᩳܽ;->getParent()I

    move-result v6

    if-eqz v6, :cond_4

    .line 215
    iget-object v6, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v6, Ll/᩻ۜᩳ;->ۛ:Ll/۫ܽܽ;

    invoke-virtual {v5}, Ll/᩷ᩳܽ;->getParent()I

    move-result v7

    invoke-virtual {v6, v7}, Ll/۫ܽܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    .line 216
    invoke-virtual {p1, v6}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 217
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v5, Ll/᩻ۜᩳ;->ܽ֫:[I

    iget v7, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    aput v0, v6, v7

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    .line 221
    :goto_1
    invoke-virtual {v5}, Ll/ᩴܿܽ;->ܽ֫()I

    move-result v7

    if-ge v6, v7, :cond_6

    .line 222
    invoke-virtual {v5, v6}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object v7

    .line 223
    invoke-virtual {v7}, Ll/ۛᩳܽ;->ۖ()I

    move-result v8

    .line 224
    invoke-virtual {v7}, Ll/ۙܿܽ;->getValue()I

    move-result v7

    .line 225
    iget-object v9, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v9, v9, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-static {v9, v8, v7, v2}, Ll/ᩴ᩻ᩳ;->֫(Ll/۫᩻ܽ;IILandroid/widget/TextView;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    .line 226
    invoke-virtual {p1, v7}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 227
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v5, Ll/᩻ۜᩳ;->ܽ֫:[I

    iget v7, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    aput v0, v6, v7

    goto :goto_2

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 191
    :cond_7
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-object p2, v0, Ll/᩻ۜᩳ;->ܿ֫:Ljava/lang/String;

    .line 192
    iput-boolean v4, v0, Ll/᩻ۜᩳ;->᩻֫:Z

    .line 193
    iget-object v2, v0, Ll/᩻ۜᩳ;->ܽ֫:[I

    array-length v2, v2

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-virtual {v0}, Ll/۬ܿܽ;->size()I

    move-result v0

    if-ge v2, v0, :cond_8

    .line 194
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v2, v0, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-virtual {v2}, Ll/۬ܿܽ;->size()I

    move-result v2

    new-array v2, v2, [I

    iput-object v2, v0, Ll/᩻ۜᩳ;->ܽ֫:[I

    .line 195
    :cond_8
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput v3, v0, Ll/᩻ۜᩳ;->ᩳ֫:I

    .line 196
    iget-object v0, v0, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-virtual {v0}, Ll/۬ܿܽ;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v0, :cond_e

    .line 197
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v5, v5, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-virtual {v5, v2}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 198
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v5, Ll/᩻ۜᩳ;->ܽ֫:[I

    iget v7, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v5, Ll/᩻ۜᩳ;->ᩳ֫:I

    aput v2, v6, v7

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 237
    :cond_a
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-boolean v4, v0, Ll/᩻ۜᩳ;->ܳ֫:Z

    .line 239
    iget-object v5, v0, Ll/᩻ۜᩳ;->۟:[I

    array-length v5, v5

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {v0}, Ll/ᩴܿܽ;->ܽ֫()I

    move-result v0

    if-ge v5, v0, :cond_b

    .line 240
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v5, v0, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {v5}, Ll/ᩴܿܽ;->ܽ֫()I

    move-result v5

    new-array v5, v5, [I

    iput-object v5, v0, Ll/᩻ۜᩳ;->۟:[I

    .line 241
    :cond_b
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput v3, v0, Ll/᩻ۜᩳ;->֫֫:I

    const/4 v0, 0x0

    .line 242
    :goto_4
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v5, v5, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {v5}, Ll/ᩴܿܽ;->ܽ֫()I

    move-result v5

    if-ge v0, v5, :cond_e

    .line 243
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v5, v5, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {v5, v0}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object v5

    .line 244
    invoke-virtual {v5}, Ll/ۛᩳܽ;->ۖ()I

    move-result v6

    .line 245
    invoke-virtual {v5}, Ll/ۙܿܽ;->getValue()I

    move-result v7

    .line 246
    iget-object v8, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v8, v8, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-static {v8, v6, v7, v2}, Ll/ᩴ᩻ᩳ;->֫(Ll/۫᩻ܽ;IILandroid/widget/TextView;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_c

    .line 247
    invoke-virtual {p1, v6}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 248
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v5, Ll/᩻ۜᩳ;->۟:[I

    iget v7, v5, Ll/᩻ۜᩳ;->֫֫:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v5, Ll/᩻ۜᩳ;->֫֫:I

    aput v0, v6, v7

    goto :goto_5

    .line 250
    :cond_c
    iget-object v6, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v6, Ll/᩻ۜᩳ;->ۛ:Ll/۫ܽܽ;

    invoke-virtual {v5}, Ll/ۛᩳܽ;->ۡ֫()I

    move-result v5

    invoke-virtual {v6, v5}, Ll/۫ܽܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    .line 251
    invoke-virtual {p1, v5}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 252
    iget-object v5, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v6, v5, Ll/᩻ۜᩳ;->۟:[I

    iget v7, v5, Ll/᩻ۜᩳ;->֫֫:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v5, Ll/᩻ۜᩳ;->֫֫:I

    aput v0, v6, v7

    :cond_d
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_e
    :goto_6
    new-array p1, v4, [Ljava/lang/Object;

    aput-object p2, p1, v3

    const p2, 0x7f1203de

    .line 259
    invoke-virtual {v1, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 260
    iget-object p1, v1, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p1}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void
.end method
