.class public final Ll/ܿ᩹֫;
.super Ljava/lang/Object;
.source "K8DD"

# interfaces
.implements Ll/֨᩷ۧ;
.implements Ll/ۢۢۧ;


# instance fields
.field public ֫:I

.field public ۜ:Ll/ᩳ᩹֫;

.field public ۧ:J

.field public ܳ:I

.field public final ܽ:Ll/ᩳ֨֫;

.field public ܿ:I

.field public ᩳ:J

.field public final ᩷:Ljava/util/PriorityQueue;

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 108
    iput v0, p0, Ll/ܿ᩹֫;->ܿ:I

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹֫;->᩻:Ljava/util/ArrayList;

    .line 110
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹֫;->᩷:Ljava/util/PriorityQueue;

    .line 111
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܿ᩹֫;->ܽ:Ll/ᩳ֨֫;

    return-void
.end method

.method public static ֫(Ll/ܿ᩹֫;IJ)V
    .locals 1

    .line 336
    iget-object p0, p0, Ll/ܿ᩹֫;->᩻:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩹֫;

    .line 337
    invoke-virtual {v0, p1, p2, p3}, Ll/ۖ᩹֫;->ۧ(IJ)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 13

    .line 159
    iget p2, p0, Ll/ܿ᩹֫;->ܿ:I

    const/4 v0, 0x3

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܿ᩹֫;->᩻:Ljava/util/ArrayList;

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq p2, v5, :cond_8

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    iget-object p1, p0, Ll/ܿ᩹֫;->᩷:Ljava/util/PriorityQueue;

    if-eq p2, v1, :cond_3

    if-ne p2, v0, :cond_2

    .line 210
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖ᩹֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    invoke-virtual {p2}, Ll/ۖ᩹֫;->֫()J

    move-result-wide v0

    cmp-long v2, v0, v6

    if-eqz v2, :cond_1

    .line 215
    iget-wide v2, p0, Ll/ܿ᩹֫;->ۧ:J

    const-wide/32 v5, 0x186a0

    add-long/2addr v2, v5

    cmp-long v5, v2, v0

    if-gez v5, :cond_0

    .line 216
    iput-wide v2, p0, Ll/ܿ᩹֫;->ۧ:J

    .line 342
    iget-object v6, p0, Ll/ܿ᩹֫;->ۜ:Ll/ᩳ᩹֫;

    invoke-static {v6}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-wide v7, p0, Ll/ܿ᩹֫;->ۧ:J

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 343
    invoke-virtual/range {v6 .. v12}, Ll/ᩳ᩹֫;->֫(JIIILl/ᩴۢۧ;)V

    goto :goto_0

    .line 219
    :cond_0
    iput-wide v0, p0, Ll/ܿ᩹֫;->ۧ:J

    .line 220
    iget-object v0, p0, Ll/ܿ᩹֫;->ۜ:Ll/ᩳ᩹֫;

    .line 221
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 220
    invoke-virtual {p2, v0, v4}, Ll/ۖ᩹֫;->֫(Ll/᩵ۢۧ;Z)V

    .line 222
    invoke-virtual {p2}, Ll/ۖ᩹֫;->ۧ()V

    :goto_0
    const/4 v3, 0x0

    .line 228
    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    return v3

    .line 234
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 193
    :cond_3
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->clear()V

    .line 194
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩹֫;

    .line 195
    invoke-virtual {v1}, Ll/ۖ᩹֫;->ܿ()V

    .line 196
    invoke-virtual {v1}, Ll/ۖ᩹֫;->ۧ()V

    goto :goto_1

    .line 198
    :cond_4
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 200
    iget-wide v8, p0, Ll/ܿ᩹֫;->ᩳ:J

    .line 352
    :cond_5
    :goto_2
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_6

    .line 353
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖ᩹֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    invoke-virtual {p2}, Ll/ۖ᩹֫;->֫()J

    move-result-wide v10

    cmp-long v1, v10, v6

    if-eqz v1, :cond_5

    cmp-long v1, v10, v8

    if-gez v1, :cond_5

    .line 357
    iget-object v1, p0, Ll/ܿ᩹֫;->ۜ:Ll/ᩳ᩹֫;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {p2, v1, v5}, Ll/ۖ᩹֫;->֫(Ll/᩵ۢۧ;Z)V

    .line 358
    invoke-virtual {p2}, Ll/ۖ᩹֫;->ۧ()V

    .line 359
    invoke-virtual {p1, p2}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 362
    :cond_6
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 201
    iget-wide v1, p0, Ll/ܿ᩹֫;->ᩳ:J

    iput-wide v1, p0, Ll/ܿ᩹֫;->ۧ:J

    .line 203
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩹֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    invoke-virtual {p1}, Ll/ۖ᩹֫;->֫()J

    move-result-wide p1

    .line 204
    iget-wide v1, p0, Ll/ܿ᩹֫;->ۧ:J

    cmp-long v3, p1, v1

    if-lez v3, :cond_7

    .line 342
    iget-object v5, p0, Ll/ܿ᩹֫;->ۜ:Ll/ᩳ᩹֫;

    invoke-static {v5}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-wide v6, p0, Ll/ܿ᩹֫;->ۧ:J

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 343
    invoke-virtual/range {v5 .. v11}, Ll/ᩳ᩹֫;->֫(JIIILl/ᩴۢۧ;)V

    .line 207
    :cond_7
    iput v0, p0, Ll/ܿ᩹֫;->ܿ:I

    return v4

    .line 161
    :cond_8
    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll/۬᩺ܺ;->֫(J)I

    move-result p2

    .line 162
    iget-object v0, p0, Ll/ܿ᩹֫;->ܽ:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    array-length v5, v5

    .line 165
    iget v6, p0, Ll/ܿ᩹֫;->֫:I

    if-ne v6, v5, :cond_a

    if-eq p2, v3, :cond_9

    move v5, p2

    :cond_9
    mul-int/lit8 v5, v5, 0x3

    .line 169
    div-int/2addr v5, v1

    .line 168
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->֫(I)V

    .line 174
    :cond_a
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    iget v6, p0, Ll/ܿ᩹֫;->֫:I

    .line 176
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۧ()I

    move-result v7

    iget v8, p0, Ll/ܿ᩹֫;->֫:I

    sub-int/2addr v7, v8

    .line 173
    invoke-interface {p1, v5, v6, v7}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    if-eq p1, v3, :cond_c

    .line 179
    iget v5, p0, Ll/ܿ᩹֫;->֫:I

    add-int/2addr v5, p1

    iput v5, p0, Ll/ܿ᩹֫;->֫:I

    if-eq p2, v3, :cond_b

    if-eq v5, p2, :cond_c

    :cond_b
    return v4

    .line 187
    :cond_c
    iget p1, p0, Ll/ܿ᩹֫;->֫:I

    invoke-virtual {v0, p1}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 269
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    const/16 p2, 0xe

    const/4 v3, 0x0

    if-lt p1, p2, :cond_14

    .line 329
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    const p2, 0x4d546864

    if-ne p1, p2, :cond_13

    const/4 p1, 0x4

    .line 277
    invoke-virtual {v0, p1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 278
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֡()S

    move-result p1

    .line 279
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֡()S

    move-result p2

    if-lez p2, :cond_12

    .line 285
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֡()S

    move-result v5

    iput v5, p0, Ll/ܿ᩹֫;->ܳ:I

    const/4 v5, 0x0

    :goto_3
    if-ge v5, p2, :cond_11

    .line 309
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result v6

    const/16 v7, 0x8

    if-lt v6, v7, :cond_10

    .line 313
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    const v7, 0x4d54726b    # 2.22766768E8f

    if-ne v6, v7, :cond_f

    .line 319
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    if-lez v6, :cond_e

    .line 289
    new-array v7, v6, [B

    .line 291
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result v8

    if-lt v8, v6, :cond_d

    .line 295
    invoke-virtual {v0, v4, v6, v7}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 300
    new-instance v6, Ll/ᩳ֨֫;

    invoke-direct {v6, v7}, Ll/ᩳ֨֫;-><init>([B)V

    .line 302
    new-instance v7, Ll/ۖ᩹֫;

    iget v8, p0, Ll/ܿ᩹֫;->ܳ:I

    new-instance v9, Ll/ۛۤᩳ;

    const/4 v10, 0x1

    invoke-direct {v9, v10, p0}, Ll/ۛۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v7, p1, v8, v6, v9}, Ll/ۖ᩹֫;-><init>(IILl/ᩳ֨֫;Ll/ۛۤᩳ;)V

    .line 304
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 292
    :cond_d
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 322
    :cond_e
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 316
    :cond_f
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 310
    :cond_10
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 190
    :cond_11
    iput v1, p0, Ll/ܿ᩹֫;->ܿ:I

    return v4

    .line 282
    :cond_12
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 274
    :cond_13
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 270
    :cond_14
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method

.method public final ֫(J)Ll/ۜۢۧ;
    .locals 4

    .line 260
    iget v0, p0, Ll/ܿ᩹֫;->ܿ:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 263
    :cond_0
    new-instance p1, Ll/ۜۢۧ;

    sget-object p2, Ll/ۡۢۧ;->ܽ:Ll/ۡۢۧ;

    .line 83
    invoke-direct {p1, p2, p2}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1

    .line 261
    :cond_1
    :goto_0
    new-instance v0, Ll/ۜۢۧ;

    new-instance v1, Ll/ۡۢۧ;

    const-wide/16 v2, 0xe

    invoke-direct {v1, p1, p2, v2, v3}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {v0, v1, v1}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v0
.end method

.method public final ֫()V
    .locals 3

    .line 240
    iget-object v0, p0, Ll/ܿ᩹֫;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 241
    iget-object v0, p0, Ll/ܿ᩹֫;->᩷:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 242
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iget-object v1, p0, Ll/ܿ᩹֫;->ܽ:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    const/4 v0, 0x4

    .line 243
    iput v0, p0, Ll/ܿ᩹֫;->ܿ:I

    return-void
.end method

.method public final ֫(JJ)V
    .locals 2

    .line 144
    iget p1, p0, Ll/ܿ᩹֫;->ܿ:I

    const/4 p2, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 145
    iput-wide p3, p0, Ll/ܿ᩹֫;->ᩳ:J

    .line 146
    iget-object p1, p0, Ll/ܿ᩹֫;->ۜ:Ll/ᩳ᩹֫;

    if-eqz p1, :cond_1

    .line 147
    invoke-virtual {p1}, Ll/ᩳ᩹֫;->֫()V

    .line 149
    :cond_1
    iget p1, p0, Ll/ܿ᩹֫;->ܿ:I

    if-ne p1, v0, :cond_2

    .line 150
    iget-object p1, p0, Ll/ܿ᩹֫;->ܽ:Ll/ᩳ֨֫;

    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 151
    iput v1, p0, Ll/ܿ᩹֫;->֫:I

    return-void

    :cond_2
    const/4 p1, 0x2

    .line 153
    iput p1, p0, Ll/ܿ᩹֫;->ܿ:I

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 4

    .line 118
    iget v0, p0, Ll/ܿ᩹֫;->ܿ:I

    if-nez v0, :cond_0

    .line 122
    new-instance v0, Ll/ᩳ᩹֫;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v1, v2}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v1

    .line 376
    invoke-direct {v0, v1}, Ll/ܰ᩷ۧ;-><init>(Ll/᩵ۢۧ;)V

    .line 122
    iput-object v0, p0, Ll/ܿ᩹֫;->ۜ:Ll/ᩳ᩹֫;

    .line 123
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    const-string v3, "audio/midi"

    .line 125
    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v3, "audio/x-exoplayer-midi"

    .line 127
    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 128
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Ll/ܰ᩷ۧ;->֫(Ll/۠ᩴ֫;)V

    .line 129
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 130
    invoke-interface {p1, p0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 131
    iput v2, p0, Ll/ܿ᩹֫;->ܿ:I

    return-void

    .line 119
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 4

    .line 136
    new-instance v0, Ll/ᩳ֨֫;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    .line 137
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v3, 0x0

    .line 157
    invoke-virtual {p1, v3, v3, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 329
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    const v0, 0x4d546864

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v3
.end method

.method public final ۜ()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
