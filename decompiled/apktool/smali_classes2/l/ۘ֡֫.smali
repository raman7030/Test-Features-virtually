.class public final Ll/ۘ֡֫;
.super Ljava/lang/Object;
.source "C8P3"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/ܳ۬ܺ;

.field public ܽ:Z

.field public ᩳ:[Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ll/ܳ۬ܺ;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, Ll/ۘ֡֫;->ۧ:Ll/ܳ۬ܺ;

    .line 103
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۘ֡֫;->֫:Ljava/util/ArrayList;

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/nio/ByteBuffer;

    .line 104
    iput-object v0, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    .line 105
    sget-object v0, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    .line 107
    iput-boolean p1, p0, Ll/ۘ֡֫;->ܽ:Z

    return-void
.end method

.method private ۧ(Ljava/nio/ByteBuffer;)V
    .locals 7

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_8

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 317
    :goto_0
    invoke-direct {p0}, Ll/ۘ֡֫;->᩻()I

    move-result v2

    if-gt v1, v2, :cond_0

    .line 318
    iget-object v2, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_4

    .line 323
    :cond_1
    iget-object v2, p0, Ll/ۘ֡֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡֡֫;

    .line 325
    invoke-interface {v3}, Ll/֡֡֫;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 326
    iget-object v3, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-direct {p0}, Ll/ۘ֡֫;->᩻()I

    move-result v3

    if-ge v1, v3, :cond_7

    add-int/lit8 v3, v1, 0x1

    .line 327
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֡֫;

    invoke-interface {v2}, Ll/֡֡֫;->ܿ()V

    goto :goto_4

    :cond_2
    if-lez v1, :cond_3

    .line 334
    iget-object v2, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    add-int/lit8 v4, v1, -0x1

    aget-object v2, v2, v4

    goto :goto_1

    .line 335
    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v2, p1

    goto :goto_1

    :cond_4
    sget-object v2, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    .line 336
    :goto_1
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    int-to-long v4, v4

    .line 337
    invoke-interface {v3, v2}, Ll/֡֡֫;->֫(Ljava/nio/ByteBuffer;)V

    .line 338
    iget-object v6, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    invoke-interface {v3}, Ll/֡֡֫;->ᩳ()Ljava/nio/ByteBuffer;

    move-result-object v3

    aput-object v3, v6, v1

    .line 340
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v4, v2

    const-wide/16 v2, 0x0

    cmp-long v6, v4, v2

    if-gtz v6, :cond_6

    iget-object v2, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v2, 0x1

    :goto_3
    or-int/2addr v0, v2

    :cond_7
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_8
    return-void
.end method

.method private ᩻()I
    .locals 1

    .line 346
    iget-object v0, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 292
    :cond_0
    instance-of v1, p1, Ll/ۘ֡֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 295
    :cond_1
    check-cast p1, Ll/ۘ֡֫;

    iget-object p1, p1, Ll/ۘ֡֫;->ۧ:Ll/ܳ۬ܺ;

    .line 296
    iget-object v1, p0, Ll/ۘ֡֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    const/4 v3, 0x0

    .line 299
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 300
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-eq v4, v5, :cond_3

    return v2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 310
    iget-object v0, p0, Ll/ۘ֡֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/ܳ۬ܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
    .locals 3

    .line 128
    sget-object v0, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    invoke-virtual {p1, v0}, Ll/ᩴ֡֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 134
    :goto_0
    iget-object v1, p0, Ll/ۘ֡֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 135
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡֡֫;

    .line 136
    invoke-interface {v1, p1}, Ll/֡֡֫;->֫(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;

    move-result-object v2

    .line 137
    invoke-interface {v1}, Ll/֡֡֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 138
    sget-object p1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    invoke-virtual {v2, p1}, Ll/ᩴ֡֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    move-object p1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object p1

    .line 129
    :cond_2
    new-instance v0, Ll/᩵֡֫;

    invoke-direct {v0, p1}, Ll/᩵֡֫;-><init>(Ll/ᩴ֡֫;)V

    throw v0
.end method

.method public final ֫()V
    .locals 5

    .line 155
    iget-object v0, p0, Ll/ۘ֡֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v1, 0x0

    .line 157
    iput-boolean v1, p0, Ll/ۘ֡֫;->ܽ:Z

    const/4 v2, 0x0

    .line 159
    :goto_0
    iget-object v3, p0, Ll/ۘ֡֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v2, v4, :cond_1

    .line 160
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡֡֫;

    .line 161
    invoke-interface {v3}, Ll/֡֡֫;->flush()V

    .line 162
    invoke-interface {v3}, Ll/֡֡֫;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 163
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 167
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/nio/ByteBuffer;

    iput-object v2, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    .line 168
    :goto_1
    invoke-direct {p0}, Ll/ۘ֡֫;->᩻()I

    move-result v2

    if-gt v1, v2, :cond_2

    .line 169
    iget-object v2, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡֡֫;

    invoke-interface {v3}, Ll/֡֡֫;->ᩳ()Ljava/nio/ByteBuffer;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 205
    invoke-virtual {p0}, Ll/ۘ֡֫;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ۘ֡֫;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    invoke-direct {p0, p1}, Ll/ۘ֡֫;->ۧ(Ljava/nio/ByteBuffer;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()Ljava/nio/ByteBuffer;
    .locals 2

    .line 221
    invoke-virtual {p0}, Ll/ۘ֡֫;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    return-object v0

    .line 224
    :cond_0
    iget-object v0, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ll/ۘ֡֫;->᩻()I

    move-result v1

    aget-object v0, v0, v1

    .line 225
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 229
    :cond_1
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0}, Ll/ۘ֡֫;->ۧ(Ljava/nio/ByteBuffer;)V

    .line 230
    iget-object v0, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ll/ۘ֡֫;->᩻()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final ܳ()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 270
    :goto_0
    iget-object v2, p0, Ll/ۘ֡֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 271
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֡֫;

    .line 272
    invoke-interface {v2}, Ll/֡֡֫;->flush()V

    .line 273
    invoke-interface {v2}, Ll/֡֡֫;->reset()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-array v1, v0, [Ljava/nio/ByteBuffer;

    .line 275
    iput-object v1, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    .line 276
    sget-object v1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    .line 278
    iput-boolean v0, p0, Ll/ۘ֡֫;->ܽ:Z

    return-void
.end method

.method public final ܽ()Z
    .locals 2

    .line 260
    iget-boolean v0, p0, Ll/ۘ֡֫;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۘ֡֫;->֫:Ljava/util/ArrayList;

    .line 261
    invoke-direct {p0}, Ll/ۘ֡֫;->᩻()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡֡֫;

    invoke-interface {v0}, Ll/֡֡֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۘ֡֫;->ᩳ:[Ljava/nio/ByteBuffer;

    .line 262
    invoke-direct {p0}, Ll/ۘ֡֫;->᩻()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 241
    invoke-virtual {p0}, Ll/ۘ֡֫;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ۘ֡֫;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 244
    iput-boolean v0, p0, Ll/ۘ֡֫;->ܽ:Z

    .line 245
    iget-object v0, p0, Ll/ۘ֡֫;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡֡֫;

    invoke-interface {v0}, Ll/֡֡֫;->ܿ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 192
    iget-object v0, p0, Ll/ۘ֡֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
