.class public final Ll/ܿ᩸֫;
.super Ljava/lang/Object;
.source "Z754"


# instance fields
.field public final ֫:Landroid/util/SparseArray;

.field public final ۧ:Ljava/util/HashMap;

.field public ܳ:Ll/ᩳ᩸֫;

.field public final ܽ:Landroid/util/SparseBooleanArray;

.field public final ܿ:Landroid/util/SparseBooleanArray;

.field public ᩳ:Ll/ᩳ᩸֫;


# direct methods
.method public constructor <init>(Ll/᩷۠֫;Ljava/io/File;)V
    .locals 3

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    .line 166
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸֫;->֫:Landroid/util/SparseArray;

    .line 167
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸֫;->ܿ:Landroid/util/SparseBooleanArray;

    .line 168
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸֫;->ܽ:Landroid/util/SparseBooleanArray;

    .line 171
    new-instance v0, Ll/ۧ᩸֫;

    invoke-direct {v0, p1}, Ll/ۧ᩸֫;-><init>(Ll/᩷۠֫;)V

    .line 175
    new-instance p1, Ll/ܽ᩸֫;

    new-instance v1, Ljava/io/File;

    const-string v2, "cached_content_index.exi"

    invoke-direct {v1, p2, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Ll/ܽ᩸֫;-><init>(Ljava/io/File;)V

    .line 184
    iput-object v0, p0, Ll/ܿ᩸֫;->ܳ:Ll/ᩳ᩸֫;

    .line 185
    iput-object p1, p0, Ll/ܿ᩸֫;->ᩳ:Ll/ᩳ᩸֫;

    return-void
.end method

.method public static ֫(Ljava/io/DataInputStream;)Ll/ۜ᩸֫;
    .locals 10

    .line 378
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 379
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 381
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v3

    .line 382
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    if-ltz v4, :cond_1

    const/high16 v5, 0xa00000

    .line 390
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 391
    sget-object v7, Ll/ۘ֨֫;->ܿ:[B

    const/4 v8, 0x0

    :goto_1
    if-eq v8, v4, :cond_0

    add-int v9, v8, v6

    .line 393
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    .line 394
    invoke-virtual {p0, v7, v8, v6}, Ljava/io/DataInputStream;->readFully([BII)V

    sub-int v6, v4, v9

    .line 396
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    move v8, v9

    goto :goto_1

    .line 398
    :cond_0
    invoke-virtual {v1, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 384
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid value size: "

    .line 0
    invoke-static {v4, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 384
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 400
    :cond_2
    new-instance p0, Ll/ۜ᩸֫;

    invoke-direct {p0, v1}, Ll/ۜ᩸֫;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method public static ֫(Ll/ۜ᩸֫;Ljava/io/DataOutputStream;)V
    .locals 2

    .line 411
    invoke-virtual {p0}, Ll/ۜ᩸֫;->֫()Ljava/util/Set;

    move-result-object p0

    .line 412
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 413
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 414
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 415
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 416
    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 417
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/String;
    .locals 1

    .line 276
    iget-object v0, p0, Ll/ܿ᩸֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 1

    .line 265
    iget-object v0, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/֫᩸֫;
    .locals 1

    .line 255
    iget-object v0, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫᩸֫;

    return-object p1
.end method

.method public final ֫(J)V
    .locals 2

    .line 199
    iget-object v0, p0, Ll/ܿ᩸֫;->ܳ:Ll/ᩳ᩸֫;

    invoke-interface {v0, p1, p2}, Ll/ᩳ᩸֫;->֫(J)V

    .line 200
    iget-object v1, p0, Ll/ܿ᩸֫;->ᩳ:Ll/ᩳ᩸֫;

    if-eqz v1, :cond_0

    .line 201
    invoke-interface {v1, p1, p2}, Ll/ᩳ᩸֫;->֫(J)V

    .line 203
    :cond_0
    invoke-interface {v0}, Ll/ᩳ᩸֫;->֫()Z

    move-result p1

    iget-object p2, p0, Ll/ܿ᩸֫;->֫:Landroid/util/SparseArray;

    iget-object v1, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ܿ᩸֫;->ᩳ:Ll/ᩳ᩸֫;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ll/ᩳ᩸֫;->֫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 205
    iget-object p1, p0, Ll/ܿ᩸֫;->ᩳ:Ll/ᩳ᩸֫;

    invoke-interface {p1, v1, p2}, Ll/ᩳ᩸֫;->֫(Ljava/util/HashMap;Landroid/util/SparseArray;)V

    .line 206
    invoke-interface {v0, v1}, Ll/ᩳ᩸֫;->ۧ(Ljava/util/HashMap;)V

    goto :goto_0

    .line 209
    :cond_1
    invoke-interface {v0, v1, p2}, Ll/ᩳ᩸֫;->֫(Ljava/util/HashMap;Landroid/util/SparseArray;)V

    .line 211
    :goto_0
    iget-object p1, p0, Ll/ܿ᩸֫;->ᩳ:Ll/ᩳ᩸֫;

    if-eqz p1, :cond_2

    .line 212
    invoke-interface {p1}, Ll/ᩳ᩸֫;->delete()V

    const/4 p1, 0x0

    .line 213
    iput-object p1, p0, Ll/ܿ᩸֫;->ᩳ:Ll/ᩳ᩸֫;

    :cond_2
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/᩻᩸֫;)V
    .locals 0

    .line 327
    invoke-virtual {p0, p1}, Ll/ܿ᩸֫;->ۧ(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p1

    .line 328
    invoke-virtual {p1, p2}, Ll/֫᩸֫;->֫(Ll/᩻᩸֫;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 329
    iget-object p2, p0, Ll/ܿ᩸֫;->ܳ:Ll/ᩳ᩸֫;

    invoke-interface {p2, p1}, Ll/ᩳ᩸֫;->֫(Ll/֫᩸֫;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ll/֫᩸֫;
    .locals 6

    .line 243
    iget-object v0, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫᩸֫;

    if-nez v1, :cond_4

    .line 356
    iget-object v1, p0, Ll/ܿ᩸֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v5, v2, -0x1

    .line 357
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    add-int/2addr v5, v4

    :goto_0
    if-gez v5, :cond_3

    :goto_1
    if-ge v3, v2, :cond_2

    .line 361
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    if-eq v3, v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    move v5, v3

    .line 341
    :cond_3
    new-instance v2, Ll/֫᩸֫;

    .line 58
    sget-object v3, Ll/ۜ᩸֫;->ܽ:Ll/ۜ᩸֫;

    invoke-direct {v2, v5, p1, v3}, Ll/֫᩸֫;-><init>(ILjava/lang/String;Ll/ۜ᩸֫;)V

    .line 342
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    invoke-virtual {v1, v5, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 344
    iget-object p1, p0, Ll/ܿ᩸֫;->ܽ:Landroid/util/SparseBooleanArray;

    invoke-virtual {p1, v5, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 345
    iget-object p1, p0, Ll/ܿ᩸֫;->ܳ:Ll/ᩳ᩸֫;

    invoke-interface {p1, v2}, Ll/ᩳ᩸֫;->֫(Ll/֫᩸֫;)V

    return-object v2

    :cond_4
    return-object v1
.end method

.method public final ۧ()V
    .locals 2

    .line 307
    iget-object v0, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۛ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 308
    invoke-virtual {p0, v1}, Ll/ܿ᩸֫;->ܽ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 5

    .line 226
    iget-object v0, p0, Ll/ܿ᩸֫;->ܳ:Ll/ᩳ᩸֫;

    iget-object v1, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    invoke-interface {v0, v1}, Ll/ᩳ᩸֫;->֫(Ljava/util/HashMap;)V

    .line 228
    iget-object v0, p0, Ll/ܿ᩸֫;->ܿ:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 230
    iget-object v3, p0, Ll/ܿ᩸֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->remove(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    .line 233
    iget-object v0, p0, Ll/ܿ᩸֫;->ܽ:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 4

    .line 285
    iget-object v0, p0, Ll/ܿ᩸֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫᩸֫;

    if-eqz v1, :cond_1

    .line 286
    invoke-virtual {v1}, Ll/֫᩸֫;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ll/֫᩸֫;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 287
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    iget p1, v1, Ll/֫᩸֫;->ۧ:I

    .line 289
    iget-object v0, p0, Ll/ܿ᩸֫;->ܽ:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v2

    .line 290
    iget-object v3, p0, Ll/ܿ᩸֫;->ܳ:Ll/ᩳ᩸֫;

    invoke-interface {v3, v1, v2}, Ll/ᩳ᩸֫;->֫(Ll/֫᩸֫;Z)V

    .line 291
    iget-object v1, p0, Ll/ܿ᩸֫;->֫:Landroid/util/SparseArray;

    if-eqz v2, :cond_0

    .line 293
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 294
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 298
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 299
    iget-object v0, p0, Ll/ܿ᩸֫;->ܿ:Landroid/util/SparseBooleanArray;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :cond_1
    return-void
.end method
