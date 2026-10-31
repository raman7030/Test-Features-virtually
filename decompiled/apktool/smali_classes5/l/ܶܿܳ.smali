.class public final Ll/ܶܿܳ;
.super Ll/ܺ֨֡;
.source "56MU"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:[Ljava/lang/String;

.field public ܽ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶܿܳ;->֫:Ljava/util/HashMap;

    const-string v0, "\n"

    const/4 v1, -0x1

    .line 200
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶܿܳ;->ۧ:[Ljava/lang/String;

    .line 201
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    mul-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/ܶܿܳ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 13

    .line 205
    invoke-interface {p2}, Ll/ᩴ֨֡;->֫()Ll/ۖ֨֡;

    move-result-object p2

    .line 206
    invoke-interface {p2}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v0

    instance-of v0, v0, Ll/᩺֡֡;

    iget-object v1, p0, Ll/ܶܿܳ;->֫:Ljava/util/HashMap;

    if-nez v0, :cond_0

    invoke-interface {p2}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v0

    instance-of v0, v0, Ll/᩵ۚ֡;

    if-eqz v0, :cond_1

    .line 207
    :cond_0
    invoke-interface {p2}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v0

    invoke-virtual {v1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    :cond_1
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܽ()I

    move-result v0

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-lt v0, v2, :cond_2

    goto/16 :goto_7

    .line 209
    :cond_2
    invoke-virtual {p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 210
    invoke-virtual {p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܽ֨֡;->ۧ()Ll/᩶ۚ֡;

    move-result-object v4

    if-nez v4, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v5, "$$"

    .line 212
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    const-string v7, "\\["

    if-eqz v6, :cond_4

    move-object v6, v5

    goto :goto_0

    :cond_4
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    const-string v6, "\\]"

    goto :goto_0

    :cond_5
    move-object v6, v3

    :goto_0
    if-nez v6, :cond_6

    goto/16 :goto_7

    .line 214
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-le v8, v2, :cond_9

    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    const/4 v8, 0x0

    :goto_1
    if-lez v2, :cond_7

    add-int/lit8 v2, v2, -0x1

    .line 174
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0x5c

    if-ne v11, v12, :cond_7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 175
    :cond_7
    rem-int/lit8 v8, v8, 0x2

    if-eqz v8, :cond_8

    goto :goto_2

    :cond_8
    const/4 v2, 0x1

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v2, 0x0

    :goto_3
    if-nez v2, :cond_a

    .line 215
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto/16 :goto_7

    :cond_a
    if-nez v2, :cond_14

    .line 216
    invoke-virtual {v4}, Ll/᩶ۚ֡;->ᩳ()I

    move-result v4

    .line 237
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 238
    invoke-interface {p2}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v7

    :goto_4
    if-eqz v7, :cond_e

    .line 239
    instance-of v8, v7, Ll/᩺֡֡;

    if-nez v8, :cond_b

    instance-of v8, v7, Ll/᩵ۚ֡;

    if-eqz v8, :cond_d

    .line 240
    :cond_b
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۖ֨֡;

    if-nez v8, :cond_c

    goto :goto_7

    .line 242
    :cond_c
    invoke-virtual {v5, v9, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 238
    :cond_d
    invoke-virtual {v7}, Ll/֡ۚ֡;->ᩳ()Ll/֡ۚ֡;

    move-result-object v7

    goto :goto_4

    :cond_e
    add-int/2addr v4, v10

    .line 245
    :goto_5
    iget-object v1, p0, Ll/ܶܿܳ;->ۧ:[Ljava/lang/String;

    array-length v7, v1

    if-ge v4, v7, :cond_13

    .line 246
    iget v7, p0, Ll/ܶܿܳ;->ܽ:I

    aget-object v8, v1, v4

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v8, v10

    sub-int/2addr v7, v8

    iput v7, p0, Ll/ܶܿܳ;->ܽ:I

    if-gez v7, :cond_f

    goto :goto_7

    .line 247
    :cond_f
    new-instance v7, Ll/᩸ܿܳ;

    aget-object v8, v1, v4

    invoke-direct {v7, v8, p2}, Ll/᩸ܿܳ;-><init>(Ljava/lang/String;Ll/ۖ֨֡;)V

    .line 248
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖ֨֡;

    .line 250
    invoke-interface {v11}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v12

    instance-of v12, v12, Ll/᩵ۚ֡;

    if-eqz v12, :cond_10

    invoke-virtual {v7}, Ll/᩸ܿܳ;->֫()Z

    move-result v12

    if-eqz v12, :cond_10

    goto :goto_6

    .line 251
    :cond_10
    invoke-interface {v11, v7}, Ll/ۖ֨֡;->֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;

    move-result-object v11

    .line 252
    invoke-static {v11}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_13

    .line 253
    invoke-virtual {v7, v11}, Ll/᩸ܿܳ;->֫(Ll/ܳ᩵֡;)V

    goto :goto_6

    .line 255
    :cond_11
    aget-object v1, v1, v4

    invoke-virtual {v7}, Ll/᩸ܿܳ;->getIndex()I

    move-result v7

    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_8

    :cond_12
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_13
    :goto_7
    return-object v3

    .line 217
    :cond_14
    :goto_8
    new-instance p2, Ll/۠ܿܳ;

    invoke-direct {p2, v6, v0, v2}, Ll/۠ܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-array v0, v10, [Ll/ۖ֨֡;

    aput-object p2, v0, v9

    .line 17
    new-instance p2, Ll/᩷᩵֡;

    invoke-direct {p2, v0}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 232
    invoke-virtual {p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/᩷᩵֡;->ۧ(I)Ll/᩷᩵֡;

    return-object p2
.end method
