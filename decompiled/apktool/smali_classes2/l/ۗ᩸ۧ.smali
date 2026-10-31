.class public abstract Ll/ۗ᩸ۧ;
.super Ll/֫᩸ۧ;
.source "O51Z"


# instance fields
.field public final ۛ֫:Ll/ۗ᩵;

.field public ۤ֫:I

.field public ۨ֫:I

.field public ۫֫:Z

.field public final ܰ֫:Ljava/util/ArrayList;

.field public ᩺֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, p1, p2, v0}, Ll/ۗ᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۗ᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 84
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 59
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    iput-object v0, p0, Ll/ۗ᩸ۧ;->ۛ֫:Ll/ۗ᩵;

    .line 61
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p0, Ll/ۗ᩸ۧ;->᩺֫:Z

    const/4 v1, 0x0

    .line 68
    iput v1, p0, Ll/ۗ᩸ۧ;->ۤ֫:I

    .line 69
    iput-boolean v1, p0, Ll/ۗ᩸ۧ;->۫֫:Z

    const v1, 0x7fffffff

    .line 70
    iput v1, p0, Ll/ۗ᩸ۧ;->ۨ֫:I

    .line 86
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    .line 88
    sget-object v2, Ll/ۢ᩹ۧ;->ۢ:[I

    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x2

    .line 263
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    .line 264
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 92
    iput-boolean p2, p0, Ll/ۗ᩸ۧ;->᩺֫:Z

    .line 95
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 287
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 288
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 96
    invoke-virtual {p0, p2}, Ll/ۗ᩸ۧ;->᩻(I)V

    .line 100
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/os/Bundle;)V
    .locals 3

    .line 506
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/os/Bundle;)V

    .line 182
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 511
    invoke-virtual {p0, v1}, Ll/ۗ᩸ۧ;->ܳ(I)Ll/֫᩸ۧ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/֫᩸ۧ;->֫(Landroid/os/Bundle;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/os/Parcelable;)V
    .locals 2

    .line 524
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ۙ᩸ۧ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 526
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    return-void

    .line 529
    :cond_0
    check-cast p1, Ll/ۙ᩸ۧ;

    .line 530
    iget v0, p1, Ll/ۙ᩸ۧ;->᩸:I

    iput v0, p0, Ll/ۗ᩸ۧ;->ۨ֫:I

    .line 531
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final ֫(Ll/֫᩸ۧ;)V
    .locals 5

    .line 203
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 206
    :cond_0
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v0, p0

    .line 208
    :goto_0
    invoke-virtual {v0}, Ll/֫᩸ۧ;->getParent()Ll/ۗ᩸ۧ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 209
    invoke-virtual {v0}, Ll/֫᩸ۧ;->getParent()Ll/ۗ᩸ۧ;

    move-result-object v0

    goto :goto_0

    .line 211
    :cond_1
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 212
    invoke-virtual {v0, v1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    .line 219
    :cond_2
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ܺ()I

    move-result v0

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_4

    .line 220
    iget-boolean v0, p0, Ll/ۗ᩸ۧ;->᩺֫:Z

    if-eqz v0, :cond_3

    .line 221
    iget v0, p0, Ll/ۗ᩸ۧ;->ۤ֫:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۗ᩸ۧ;->ۤ֫:I

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ᩳ(I)V

    .line 224
    :cond_3
    instance-of v0, p1, Ll/ۗ᩸ۧ;

    if-eqz v0, :cond_4

    .line 227
    move-object v0, p1

    check-cast v0, Ll/ۗ᩸ۧ;

    iget-boolean v1, p0, Ll/ۗ᩸ۧ;->᩺֫:Z

    .line 124
    iput-boolean v1, v0, Ll/ۗ᩸ۧ;->᩺֫:Z

    .line 231
    :cond_4
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_5

    mul-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x1

    :cond_5
    move v1, v0

    .line 354
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ܿ֫()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܽ(Z)V

    move-object v0, p0

    .line 240
    monitor-enter v0

    .line 241
    :try_start_0
    iget-object v2, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 242
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 244
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ᩴ()Ll/ܿ᩹ۧ;

    move-result-object v0

    .line 245
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 247
    iget-object v2, p0, Ll/ۗ᩸ۧ;->ۛ֫:Ll/ۗ᩵;

    invoke-virtual {v2, v1}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 248
    iget-object v2, p0, Ll/ۗ᩸ۧ;->ۛ֫:Ll/ۗ᩵;

    const/4 v3, 0x0

    .line 369
    invoke-virtual {v2, v1, v3}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 248
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 249
    iget-object v4, p0, Ll/ۗ᩸ۧ;->ۛ֫:Ll/ۗ᩵;

    invoke-virtual {v4, v1}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 251
    :cond_6
    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ۧ()J

    move-result-wide v2

    .line 253
    :goto_1
    invoke-virtual {p1, v0, v2, v3}, Ll/֫᩸ۧ;->֫(Ll/ܿ᩹ۧ;J)V

    .line 254
    invoke-virtual {p1, p0}, Ll/֫᩸ۧ;->֫(Ll/ۗ᩸ۧ;)V

    .line 256
    iget-boolean v0, p0, Ll/ۗ᩸ۧ;->۫֫:Z

    if-eqz v0, :cond_7

    .line 257
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۤ()V

    .line 260
    :cond_7
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۫()V

    return-void

    :catchall_0
    move-exception p1

    .line 242
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۜ֫()I
    .locals 1

    .line 166
    iget v0, p0, Ll/ۗ᩸ۧ;->ۨ֫:I

    return v0
.end method

.method public final ۡ֫()V
    .locals 2

    move-object v0, p0

    .line 488
    monitor-enter v0

    .line 489
    :try_start_0
    iget-object v1, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 490
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۢ֫()I
    .locals 1

    .line 182
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۤ()V
    .locals 3

    .line 448
    invoke-super {p0}, Ll/֫᩸ۧ;->ۤ()V

    const/4 v0, 0x1

    .line 452
    iput-boolean v0, p0, Ll/ۗ᩸ۧ;->۫֫:Z

    .line 182
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 457
    invoke-virtual {p0, v1}, Ll/ۗ᩸ۧ;->ܳ(I)Ll/֫᩸ۧ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֫᩸ۧ;->ۤ()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;
    .locals 4

    if-eqz p1, :cond_4

    .line 374
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 182
    :cond_0
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 379
    invoke-virtual {p0, v1}, Ll/ۗ᩸ۧ;->ܳ(I)Ll/֫᩸ۧ;

    move-result-object v2

    .line 380
    invoke-virtual {v2}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v3

    .line 382
    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    .line 386
    :cond_1
    instance-of v3, v2, Ll/ۗ᩸ۧ;

    if-eqz v3, :cond_2

    .line 387
    check-cast v2, Ll/ۗ᩸ۧ;

    invoke-virtual {v2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object v2

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1

    .line 372
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Key cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Landroid/os/Bundle;)V
    .locals 3

    .line 495
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->ۧ(Landroid/os/Bundle;)V

    .line 182
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 500
    invoke-virtual {p0, v1}, Ll/ۗ᩸ۧ;->ܳ(I)Ll/֫᩸ۧ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/֫᩸ۧ;->ۧ(Landroid/os/Bundle;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Z)V
    .locals 3

    .line 477
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->ۧ(Z)V

    .line 182
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 483
    invoke-virtual {p0, v1}, Ll/ۗ᩸ۧ;->ܳ(I)Ll/֫᩸ۧ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/֫᩸ۧ;->ܽ(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۨ()V
    .locals 3

    .line 463
    invoke-super {p0}, Ll/֫᩸ۧ;->ۨ()V

    const/4 v0, 0x0

    .line 466
    iput-boolean v0, p0, Ll/ۗ᩸ۧ;->۫֫:Z

    .line 182
    iget-object v1, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 471
    invoke-virtual {p0, v0}, Ll/ۗ᩸ۧ;->ܳ(I)Ll/֫᩸ۧ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֫᩸ۧ;->ۨ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ(I)Ll/֫᩸ۧ;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۗ᩸ۧ;->ܰ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫᩸ۧ;

    return-object p1
.end method

.method public final ᩺()Landroid/os/Parcelable;
    .locals 2

    .line 518
    invoke-super {p0}, Ll/֫᩸ۧ;->᩺()Landroid/os/Parcelable;

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 519
    new-instance v0, Ll/ۙ᩸ۧ;

    iget v1, p0, Ll/ۗ᩸ۧ;->ۨ֫:I

    invoke-direct {v0, v1}, Ll/ۙ᩸ۧ;-><init>(I)V

    return-object v0
.end method

.method public final ᩻(I)V
    .locals 1

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_0

    .line 152
    invoke-virtual {p0}, Ll/֫᩸ۧ;->᩸()Z

    .line 156
    :cond_0
    iput p1, p0, Ll/ۗ᩸ۧ;->ۨ֫:I

    return-void
.end method
