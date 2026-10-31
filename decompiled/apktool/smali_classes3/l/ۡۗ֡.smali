.class public final Ll/ۡۗ֡;
.super Ljava/lang/Object;
.source "Y5SH"


# instance fields
.field public ֫:Ll/ۢۗ֡;

.field public ۧ:Ll/ۢۗ֡;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ll/ۢۗ֡;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    iput-object v0, p0, Ll/ۡۗ֡;->֫:Ll/ۢۗ֡;

    .line 46
    new-instance v2, Ll/ۢۗ֡;

    invoke-direct {v2, p0, v1, v1}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    iput-object v2, p0, Ll/ۡۗ֡;->ۧ:Ll/ۢۗ֡;

    .line 49
    iput-object v2, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 50
    iput-object v0, v2, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܿۗ֡;
    .locals 11

    .line 135
    iget-object v0, p0, Ll/ۡۗ֡;->֫:Ll/ۢۗ֡;

    iget-object v1, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    iget-object v2, p0, Ll/ۡۗ֡;->ۧ:Ll/ۢۗ֡;

    if-ne v1, v2, :cond_0

    .line 136
    new-instance v0, Ll/ܿۗ֡;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ܿۗ֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 139
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 140
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 142
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 145
    iget-object v0, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    :goto_0
    if-eq v0, v2, :cond_3

    .line 148
    iget-object v5, v0, Ll/ۢۗ֡;->ܽ:Ljava/util/LinkedList;

    .line 149
    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result v5

    new-array v5, v5, [Ll/ܺ᩶֡;

    .line 152
    iget-object v6, v0, Ll/ۢۗ֡;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۗ֡;

    .line 153
    new-instance v9, Ll/ܺ᩶֡;

    iget-object v10, v8, Ll/᩷ۗ֡;->ۧ:Ll/᩺ۙ֡;

    iget v8, v8, Ll/᩷ۗ֡;->֫:I

    invoke-direct {v9, v10, v8}, Ll/ܺ᩶֡;-><init>(Ll/᩺ۙ֡;I)V

    add-int/lit8 v8, v7, 0x1

    .line 156
    aput-object v9, v5, v7

    move v7, v8

    goto :goto_1

    .line 159
    :cond_1
    new-instance v6, Ll/ۡ᩶֡;

    iget v7, v0, Ll/ۢۗ֡;->֫:I

    invoke-direct {v6, v5, v7}, Ll/ۡ᩶֡;-><init>([Ll/ܺ᩶֡;I)V

    .line 162
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡ᩶֡;

    if-nez v5, :cond_2

    .line 164
    invoke-virtual {v4, v6, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    move-object v6, v5

    .line 170
    :goto_2
    new-instance v5, Ll/ۖ᩶֡;

    iget v7, v0, Ll/ۢۗ֡;->ܳ:I

    iget v8, v0, Ll/ۢۗ֡;->ۧ:I

    sub-int/2addr v8, v7

    invoke-direct {v5, v7, v8, v6}, Ll/ۖ᩶֡;-><init>(IILl/ۡ᩶֡;)V

    .line 174
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    iget-object v0, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    goto :goto_0

    .line 179
    :cond_3
    new-instance v0, Ll/ܿۗ֡;

    invoke-direct {v0, v1, v3}, Ll/ܿۗ֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ֫(II)Ll/ܿۗ֡;
    .locals 5

    .line 218
    iget-object v0, p0, Ll/ۡۗ֡;->֫:Ll/ۢۗ֡;

    iget-object v0, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 219
    :goto_0
    iget-object v1, p0, Ll/ۡۗ֡;->ۧ:Ll/ۢۗ֡;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    .line 220
    iget v3, v0, Ll/ۢۗ֡;->ܳ:I

    if-ne p1, v3, :cond_0

    goto :goto_1

    :cond_0
    if-le p1, v3, :cond_1

    .line 226
    iget v4, v0, Ll/ۢۗ֡;->ۧ:I

    if-ge p1, v4, :cond_1

    .line 232
    invoke-virtual {v0, p1}, Ll/ۢۗ֡;->֫(I)Ll/ۢۗ֡;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-ge p1, v3, :cond_3

    if-gt p2, v3, :cond_2

    .line 240
    new-instance v1, Ll/ۢۗ֡;

    invoke-direct {v1, p0, p1, p2}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 241
    invoke-virtual {v0, v1}, Ll/ۢۗ֡;->֫(Ll/ۢۗ֡;)V

    .line 242
    new-instance p1, Ll/ܿۗ֡;

    invoke-direct {p1, v1, v1}, Ll/ܿۗ֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 249
    :cond_2
    new-instance v4, Ll/ۢۗ֡;

    invoke-direct {v4, p0, p1, v3}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 250
    invoke-virtual {v0, v4}, Ll/ۢۗ֡;->֫(Ll/ۢۗ֡;)V

    move-object v0, v4

    goto :goto_1

    .line 255
    :cond_3
    iget-object v0, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    goto :goto_0

    :cond_4
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_5

    .line 264
    new-instance v0, Ll/ۢۗ֡;

    invoke-direct {v0, p0, p1, p2}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 265
    invoke-virtual {v1, v0}, Ll/ۢۗ֡;->֫(Ll/ۢۗ֡;)V

    .line 266
    new-instance p1, Ll/ܿۗ֡;

    invoke-direct {p1, v0, v0}, Ll/ܿۗ֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_5
    move-object p1, v0

    :goto_2
    if-eq p1, v1, :cond_9

    .line 271
    iget v3, p1, Ll/ۢۗ֡;->ۧ:I

    if-ne v3, p2, :cond_6

    goto :goto_3

    .line 277
    :cond_6
    iget v4, p1, Ll/ۢۗ֡;->ܳ:I

    if-ge v4, p2, :cond_7

    if-le v3, p2, :cond_7

    .line 283
    invoke-virtual {p1, p2}, Ll/ۢۗ֡;->֫(I)Ll/ۢۗ֡;

    :goto_3
    move-object v2, p1

    goto :goto_4

    :cond_7
    if-lt v4, p2, :cond_8

    .line 292
    new-instance v2, Ll/ۢۗ֡;

    iget-object v3, p1, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    iget v3, v3, Ll/ۢۗ֡;->ۧ:I

    invoke-direct {v2, p0, v3, p2}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 293
    invoke-virtual {p1, v2}, Ll/ۢۗ֡;->֫(Ll/ۢۗ֡;)V

    goto :goto_4

    .line 296
    :cond_8
    iget-object p1, p1, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    goto :goto_2

    :cond_9
    :goto_4
    if-nez v2, :cond_a

    .line 305
    new-instance v2, Ll/ۢۗ֡;

    iget-object p1, v1, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    iget p1, p1, Ll/ۢۗ֡;->ۧ:I

    invoke-direct {v2, p0, p1, p2}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 306
    invoke-virtual {v1, v2}, Ll/ۢۗ֡;->֫(Ll/ۢۗ֡;)V

    .line 309
    :cond_a
    new-instance p1, Ll/ܿۗ֡;

    invoke-direct {p1, v0, v2}, Ll/ܿۗ֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final ֫(III)V
    .locals 3

    .line 186
    invoke-virtual {p0, p1, p2}, Ll/ۡۗ֡;->֫(II)Ll/ܿۗ֡;

    move-result-object p2

    .line 187
    iget-object v0, p2, Ll/ܿۗ֡;->֫:Ljava/lang/Object;

    check-cast v0, Ll/ۢۗ֡;

    .line 188
    iget-object p2, p2, Ll/ܿۗ֡;->ۧ:Ljava/lang/Object;

    check-cast p2, Ll/ۢۗ֡;

    .line 199
    :cond_0
    iget v1, v0, Ll/ۢۗ֡;->ܳ:I

    if-le v1, p1, :cond_1

    .line 200
    new-instance v2, Ll/ۢۗ֡;

    invoke-direct {v2, p0, p1, v1}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 201
    invoke-virtual {v0, v2}, Ll/ۢۗ֡;->֫(Ll/ۢۗ֡;)V

    move-object v0, v2

    .line 205
    :cond_1
    iget p1, v0, Ll/ۢۗ֡;->֫:I

    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    .line 206
    iput p3, v0, Ll/ۢۗ֡;->֫:I

    .line 209
    :cond_2
    iget p1, v0, Ll/ۢۗ֡;->ۧ:I

    .line 210
    iget-object v0, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 211
    iget-object v1, v0, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    if-ne v1, p2, :cond_0

    return-void
.end method

.method public final ֫(Ll/᩺ۙ֡;III)V
    .locals 2

    .line 318
    invoke-virtual {p0, p2, p3}, Ll/ۡۗ֡;->֫(II)Ll/ܿۗ֡;

    move-result-object p3

    .line 319
    iget-object v0, p3, Ll/ܿۗ֡;->֫:Ljava/lang/Object;

    check-cast v0, Ll/ۢۗ֡;

    .line 320
    iget-object p3, p3, Ll/ܿۗ֡;->ۧ:Ljava/lang/Object;

    check-cast p3, Ll/ۢۗ֡;

    .line 321
    new-instance v1, Ll/᩷ۗ֡;

    invoke-direct {v1, p1, p4}, Ll/᩷ۗ֡;-><init>(Ll/᩺ۙ֡;I)V

    .line 332
    :cond_0
    iget p1, v0, Ll/ۢۗ֡;->ܳ:I

    if-le p1, p2, :cond_1

    .line 333
    new-instance p4, Ll/ۢۗ֡;

    invoke-direct {p4, p0, p2, p1}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 334
    invoke-virtual {v0, p4}, Ll/ۢۗ֡;->֫(Ll/ۢۗ֡;)V

    move-object v0, p4

    .line 116
    :cond_1
    iget-object p1, v0, Ll/ۢۗ֡;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 339
    iget p2, v0, Ll/ۢۗ֡;->ۧ:I

    .line 340
    iget-object v0, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 341
    iget-object p1, v0, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    if-ne p1, p3, :cond_0

    return-void
.end method
