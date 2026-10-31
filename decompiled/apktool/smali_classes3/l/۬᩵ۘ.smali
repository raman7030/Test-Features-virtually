.class public final Ll/۬᩵ۘ;
.super Ljava/lang/Object;
.source "64W8"


# instance fields
.field public ֫:I

.field public ۜ:Z

.field public ۧ:I

.field public ܳ:I

.field public ܽ:J

.field public ܿ:I

.field public final ᩳ:Landroid/util/SparseArray;

.field public final ᩻:Ll/ۤ᩵ۘ;


# direct methods
.method public constructor <init>(Ll/ۤ᩵ۘ;)V
    .locals 2

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/۬᩵ۘ;->ᩳ:Landroid/util/SparseArray;

    const/16 v0, 0x32

    .line 79
    iput v0, p0, Ll/۬᩵ۘ;->ܳ:I

    const/16 v0, 0xa

    .line 84
    iput v0, p0, Ll/۬᩵ۘ;->֫:I

    const/16 v0, 0xc8

    .line 89
    iput v0, p0, Ll/۬᩵ۘ;->ۧ:I

    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Ll/۬᩵ۘ;->ۜ:Z

    .line 117
    iput-object p1, p0, Ll/۬᩵ۘ;->᩻:Ll/ۤ᩵ۘ;

    const-wide/16 v0, -0x1

    .line 118
    iput-wide v0, p0, Ll/۬᩵ۘ;->ܽ:J

    const/4 p1, -0x1

    .line 119
    iput p1, p0, Ll/۬᩵ۘ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 127
    :goto_0
    iget-object v1, p0, Ll/۬᩵ۘ;->ᩳ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 128
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    invoke-virtual {v1}, Landroid/animation/Animator;->end()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 130
    :cond_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    const/4 v0, -0x1

    .line 131
    iput v0, p0, Ll/۬᩵ۘ;->ܿ:I

    const-wide/16 v0, -0x1

    .line 133
    iput-wide v0, p0, Ll/۬᩵ۘ;->ܽ:J

    const/4 v0, 0x1

    .line 134
    iput-boolean v0, p0, Ll/۬᩵ۘ;->ۜ:Z

    return-void
.end method

.method public final ֫(ILandroid/view/View;[Landroid/animation/Animator;)V
    .locals 5

    .line 226
    iget-boolean v0, p0, Ll/۬᩵ۘ;->ۜ:Z

    if-eqz v0, :cond_4

    .line 227
    iget v0, p0, Ll/۬᩵ۘ;->ܿ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 228
    iput p1, p0, Ll/۬᩵ۘ;->ܿ:I

    .line 240
    :cond_0
    iget-wide v0, p0, Ll/۬᩵ۘ;->ܽ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 241
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬᩵ۘ;->ܽ:J

    :cond_1
    const/4 v0, 0x0

    .line 244
    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 246
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 247
    invoke-virtual {v0, p3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 262
    iget-object p3, p0, Ll/۬᩵ۘ;->᩻:Ll/ۤ᩵ۘ;

    invoke-virtual {p3}, Ll/ۤ᩵ۘ;->ۧ()I

    move-result v1

    .line 263
    invoke-virtual {p3}, Ll/ۤ᩵ۘ;->֫()I

    move-result v2

    sub-int/2addr v1, v2

    add-int/lit8 v2, p1, -0x1

    .line 266
    iget v3, p0, Ll/۬᩵ۘ;->ܿ:I

    sub-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    .line 268
    iget v4, p0, Ll/۬᩵ۘ;->֫:I

    if-ge v1, v2, :cond_2

    .line 271
    invoke-virtual {p3}, Ll/ۤ᩵ۘ;->ܽ()Landroid/widget/AbsListView;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/GridView;

    if-eqz v1, :cond_3

    .line 272
    invoke-virtual {p3}, Ll/ۤ᩵ۘ;->ܽ()Landroid/widget/AbsListView;

    move-result-object p3

    check-cast p3, Landroid/widget/GridView;

    invoke-virtual {p3}, Landroid/widget/GridView;->getNumColumns()I

    move-result p3

    .line 273
    rem-int/2addr p1, p3

    mul-int p1, p1, v4

    add-int/2addr v4, p1

    goto :goto_0

    :cond_2
    sub-int/2addr p1, v3

    mul-int p1, p1, v4

    .line 277
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    neg-long v1, v1

    iget-wide v3, p0, Ll/۬᩵ۘ;->ܽ:J

    add-long/2addr v1, v3

    iget p3, p0, Ll/۬᩵ۘ;->ܳ:I

    int-to-long v3, p3

    add-long/2addr v1, v3

    int-to-long v3, p1

    add-long/2addr v1, v3

    long-to-int p1, v1

    const/4 p3, 0x0

    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_3
    :goto_0
    int-to-long v1, v4

    .line 248
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    .line 249
    iget p1, p0, Ll/۬᩵ۘ;->ۧ:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 250
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 252
    iget-object p1, p0, Ll/۬᩵ۘ;->ᩳ:Landroid/util/SparseArray;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 2

    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    .line 212
    iget-object v0, p0, Ll/۬᩵ۘ;->ᩳ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    if-eqz v1, :cond_0

    .line 214
    invoke-virtual {v1}, Landroid/animation/Animator;->end()V

    .line 215
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    :cond_0
    return-void
.end method
