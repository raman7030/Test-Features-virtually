.class public final Ll/ۛ۟֫;
.super Ll/ۙ᩹֫;
.source "Z8K9"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public ۖ֫:J

.field public ۘ֫:Ll/᩻᩵֫;

.field public final ۜ֫:Ll/۫۟֫;

.field public final ۡ֫:Landroid/os/Handler;

.field public final ۢ֫:Ll/ۤ۟֫;

.field public final ܳ֫:Ll/۠ۡۧ;

.field public ܺ֫:Z

.field public ᩴ֫:J

.field public ᩷֫:Z

.field public ᩻֫:Ll/ܶۡۧ;


# direct methods
.method public constructor <init>(Ll/ۤ۟֫;Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x5

    .line 118
    invoke-direct {p0, v0}, Ll/ۙ᩹֫;-><init>(I)V

    .line 119
    iput-object p1, p0, Ll/ۛ۟֫;->ۢ֫:Ll/ۤ۟֫;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 783
    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 121
    :goto_0
    iput-object p1, p0, Ll/ۛ۟֫;->ۡ֫:Landroid/os/Handler;

    .line 122
    sget-object p1, Ll/۫۟֫;->֫:Ll/۫۟֫;

    iput-object p1, p0, Ll/ۛ۟֫;->ۜ֫:Ll/۫۟֫;

    .line 124
    new-instance p1, Ll/۠ۡۧ;

    const/4 p2, 0x1

    const/4 v0, 0x0

    .line 132
    invoke-direct {p1, p2, v0}, Ll/᩸᩸֫;-><init>(II)V

    .line 124
    iput-object p1, p0, Ll/ۛ۟֫;->ܳ֫:Ll/۠ۡۧ;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 125
    iput-wide p1, p0, Ll/ۛ۟֫;->ۖ֫:J

    return-void
.end method

.method private ֫(Ll/᩻᩵֫;Ljava/util/ArrayList;)V
    .locals 6

    const/4 v0, 0x0

    .line 180
    :goto_0
    invoke-virtual {p1}, Ll/᩻᩵֫;->֫()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 181
    invoke-virtual {p1, v0}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v1

    invoke-interface {v1}, Ll/ܳ᩵֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 182
    iget-object v2, p0, Ll/ۛ۟֫;->ۜ֫:Ll/۫۟֫;

    check-cast v2, Ll/۬۟֫;

    invoke-virtual {v2, v1}, Ll/۬۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 184
    invoke-virtual {v2, v1}, Ll/۬۟֫;->֫(Ll/۠ᩴ֫;)Ll/ܶۡۧ;

    move-result-object v1

    .line 187
    invoke-virtual {p1, v0}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v2

    invoke-interface {v2}, Ll/ܳ᩵֫;->ۧ()[B

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    iget-object v3, p0, Ll/ۛ۟֫;->ܳ֫:Ll/۠ۡۧ;

    invoke-virtual {v3}, Ll/᩸᩸֫;->ۧ()V

    .line 189
    array-length v4, v2

    invoke-virtual {v3, v4}, Ll/᩸᩸֫;->ܳ(I)V

    .line 190
    iget-object v4, v3, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    sget-object v5, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 191
    invoke-virtual {v3}, Ll/᩸᩸֫;->ᩴ()V

    .line 192
    invoke-virtual {v1, v3}, Ll/ܶۡۧ;->֫(Ll/۠ۡۧ;)Ll/᩻᩵֫;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 195
    invoke-direct {p0, v1, p2}, Ll/ۛ۟֫;->֫(Ll/᩻᩵֫;Ljava/util/ArrayList;)V

    goto :goto_1

    .line 199
    :cond_0
    invoke-virtual {p1, v0}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private ܽ(J)J
    .locals 6
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    const/4 v0, 0x0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p1, v1

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 291
    :goto_0
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 292
    iget-wide v3, p0, Ll/ۛ۟֫;->ۖ֫:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 294
    iget-wide v0, p0, Ll/ۛ۟֫;->ۖ֫:J

    sub-long/2addr p1, v0

    return-wide p1
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 223
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 225
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll/᩻᩵֫;

    .line 286
    iget-object v0, p0, Ll/ۛ۟֫;->ۢ֫:Ll/ۤ۟֫;

    invoke-interface {v0, p1}, Ll/ۤ۟֫;->֫(Ll/᩻᩵֫;)V

    return v1

    .line 229
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 2

    .line 135
    iget-object v0, p0, Ll/ۛ۟֫;->ۜ֫:Ll/۫۟֫;

    check-cast v0, Ll/۬۟֫;

    invoke-virtual {v0, p1}, Ll/۬۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 137
    iget p1, p1, Ll/۠ᩴ֫;->᩷:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 245
    :goto_0
    invoke-static {p1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    :cond_1
    invoke-static {v1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1
.end method

.method public final ֫(JJ)V
    .locals 6

    const/4 p3, 0x1

    const/4 p4, 0x1

    :cond_0
    :goto_0
    if-eqz p4, :cond_6

    .line 234
    iget-boolean p4, p0, Ll/ۛ۟֫;->᩷֫:Z

    const/4 v0, 0x0

    if-nez p4, :cond_3

    iget-object p4, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    if-nez p4, :cond_3

    .line 235
    iget-object p4, p0, Ll/ۛ۟֫;->ܳ֫:Ll/۠ۡۧ;

    invoke-virtual {p4}, Ll/᩸᩸֫;->ۧ()V

    .line 236
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object v1

    .line 237
    invoke-virtual {p0, v1, p4, v0}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result v2

    const/4 v3, -0x4

    if-ne v2, v3, :cond_2

    .line 239
    invoke-virtual {p4}, Ll/ۘ᩸֫;->᩻()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 240
    iput-boolean p3, p0, Ll/ۛ۟֫;->᩷֫:Z

    goto :goto_1

    .line 241
    :cond_1
    iget-wide v1, p4, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-ltz v5, :cond_3

    .line 243
    iget-wide v1, p0, Ll/ۛ۟֫;->ᩴ֫:J

    iput-wide v1, p4, Ll/۠ۡۧ;->ۨ:J

    .line 244
    invoke-virtual {p4}, Ll/᩸᩸֫;->ᩴ()V

    .line 245
    iget-object v1, p0, Ll/ۛ۟֫;->᩻֫:Ll/ܶۡۧ;

    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, p4}, Ll/ܶۡۧ;->֫(Ll/۠ۡۧ;)Ll/᩻᩵֫;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 247
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ll/᩻᩵֫;->֫()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 248
    invoke-direct {p0, v1, v2}, Ll/ۛ۟֫;->֫(Ll/᩻᩵֫;Ljava/util/ArrayList;)V

    .line 249
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 250
    new-instance v1, Ll/᩻᩵֫;

    iget-wide v3, p4, Ll/᩸᩸֫;->ۤ:J

    .line 251
    invoke-direct {p0, v3, v4}, Ll/ۛ۟֫;->ܽ(J)J

    move-result-wide v3

    new-array p4, v0, [Ll/ܳ᩵֫;

    .line 98
    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Ll/ܳ᩵֫;

    invoke-direct {v1, v3, v4, p4}, Ll/᩻᩵֫;-><init>(J[Ll/ܳ᩵֫;)V

    .line 252
    iput-object v1, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    goto :goto_1

    :cond_2
    const/4 p4, -0x5

    if-ne v2, p4, :cond_3

    .line 257
    iget-object p4, v1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    iget-wide v0, p4, Ll/۠ᩴ֫;->ܳ֫:J

    iput-wide v0, p0, Ll/ۛ۟֫;->ᩴ֫:J

    .line 264
    :cond_3
    :goto_1
    iget-object p4, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    if-eqz p4, :cond_5

    iget-wide v0, p4, Ll/᩻᩵֫;->ۧ:J

    .line 266
    invoke-direct {p0, p1, p2}, Ll/ۛ۟֫;->ܽ(J)J

    move-result-wide v2

    cmp-long p4, v0, v2

    if-gtz p4, :cond_5

    .line 267
    iget-object p4, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    .line 278
    iget-object v0, p0, Ll/ۛ۟֫;->ۡ֫:Landroid/os/Handler;

    if-eqz v0, :cond_4

    .line 279
    invoke-virtual {v0, p3, p4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p4

    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    goto :goto_2

    .line 286
    :cond_4
    iget-object v0, p0, Ll/ۛ۟֫;->ۢ֫:Ll/ۤ۟֫;

    invoke-interface {v0, p4}, Ll/ۤ۟֫;->֫(Ll/᩻᩵֫;)V

    :goto_2
    const/4 p4, 0x0

    .line 268
    iput-object p4, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    const/4 p4, 0x1

    goto :goto_3

    :cond_5
    const/4 p4, 0x0

    .line 271
    :goto_3
    iget-boolean v0, p0, Ll/ۛ۟֫;->᩷֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    if-nez v0, :cond_0

    .line 272
    iput-boolean p3, p0, Ll/ۛ۟֫;->ܺ֫:Z

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final ֫(JZ)V
    .locals 0

    const/4 p1, 0x0

    .line 160
    iput-object p1, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    const/4 p1, 0x0

    .line 161
    iput-boolean p1, p0, Ll/ۛ۟֫;->᩷֫:Z

    .line 162
    iput-boolean p1, p0, Ll/ۛ۟֫;->ܺ֫:Z

    return-void
.end method

.method public final ֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V
    .locals 2

    const/4 p2, 0x0

    .line 149
    aget-object p1, p1, p2

    iget-object p2, p0, Ll/ۛ۟֫;->ۜ֫:Ll/۫۟֫;

    check-cast p2, Ll/۬۟֫;

    invoke-virtual {p2, p1}, Ll/۬۟֫;->֫(Ll/۠ᩴ֫;)Ll/ܶۡۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ۟֫;->᩻֫:Ll/ܶۡۧ;

    .line 150
    iget-object p1, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    if-eqz p1, :cond_0

    .line 151
    iget-wide p2, p1, Ll/᩻᩵֫;->ۧ:J

    iget-wide v0, p0, Ll/ۛ۟֫;->ۖ֫:J

    add-long/2addr p2, v0

    sub-long/2addr p2, p4

    .line 152
    invoke-virtual {p1, p2, p3}, Ll/᩻᩵֫;->֫(J)Ll/᩻᩵֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    .line 155
    :cond_0
    iput-wide p4, p0, Ll/ۛ۟֫;->ۖ֫:J

    return-void
.end method

.method public final ۤ()V
    .locals 2

    const/4 v0, 0x0

    .line 206
    iput-object v0, p0, Ll/ۛ۟֫;->ۘ֫:Ll/᩻᩵֫;

    .line 207
    iput-object v0, p0, Ll/ۛ۟֫;->᩻֫:Ll/ܶۡۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 208
    iput-wide v0, p0, Ll/ۛ۟֫;->ۖ֫:J

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 213
    iget-boolean v0, p0, Ll/ۛ۟֫;->ܺ֫:Z

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
