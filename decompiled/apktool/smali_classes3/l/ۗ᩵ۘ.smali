.class public abstract Ll/ۗ᩵ۘ;
.super Ll/ۙ᩵ۘ;
.source "859N"


# instance fields
.field public ۗ:Z

.field public ۙ:I

.field public ۤ:J

.field public ۫:Ll/۬᩵ۘ;

.field public ۬:Z

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/widget/BaseAdapter;)V
    .locals 2

    .line 77
    invoke-direct {p0, p1}, Ll/ۙ᩵ۘ;-><init>(Landroid/widget/BaseAdapter;)V

    const/4 v0, 0x1

    .line 153
    iput-boolean v0, p0, Ll/ۗ᩵ۘ;->᩶:Z

    .line 79
    iput-boolean v0, p0, Ll/ۗ᩵ۘ;->ۗ:Z

    const/4 v1, -0x1

    .line 80
    iput v1, p0, Ll/ۗ᩵ۘ;->ۙ:I

    .line 81
    iput-boolean v0, p0, Ll/ۗ᩵ۘ;->۬:Z

    .line 83
    instance-of v0, p1, Ll/ۗ᩵ۘ;

    if-eqz v0, :cond_0

    .line 84
    check-cast p1, Ll/ۗ᩵ۘ;

    const/4 v0, 0x0

    .line 99
    iput-boolean v0, p1, Ll/ۗ᩵ۘ;->۬:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 134
    iget-boolean v0, p0, Ll/ۗ᩵ۘ;->۬:Z

    if-eqz v0, :cond_1

    .line 135
    invoke-virtual {p0}, Ll/ۙ᩵ۘ;->ۧ()Ll/ۤ᩵ۘ;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz p2, :cond_1

    .line 141
    iget-object v1, p0, Ll/ۗ᩵ۘ;->۫:Ll/۬᩵ۘ;

    invoke-virtual {v1, p2}, Ll/۬᩵ۘ;->֫(Landroid/view/View;)V

    goto :goto_0

    .line 136
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Call setAbsListView() on this AnimationAdapter first!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 145
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Ll/ۙ᩵ۘ;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    if-eqz v0, :cond_8

    .line 147
    iget-boolean p3, p0, Ll/ۗ᩵ۘ;->᩶:Z

    if-eqz p3, :cond_8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۗ᩵ۘ;->ۤ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1f4

    cmp-long p3, v0, v2

    if-gez p3, :cond_8

    .line 172
    iget-boolean p3, p0, Ll/ۗ᩵ۘ;->ۗ:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p3, :cond_3

    iget p3, p0, Ll/ۗ᩵ۘ;->ۙ:I

    const/4 v2, -0x1

    if-eq p3, v2, :cond_2

    if-ne p3, p1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_1

    :cond_3
    const/4 p3, 0x0

    :goto_1
    iput-boolean p3, p0, Ll/ۗ᩵ۘ;->ۗ:Z

    if-eqz p3, :cond_4

    .line 175
    iput p1, p0, Ll/ۗ᩵ۘ;->ۙ:I

    .line 180
    :cond_4
    invoke-virtual {p0}, Ll/ۙ᩵ۘ;->֫()Landroid/widget/BaseAdapter;

    move-result-object p3

    instance-of p3, p3, Ll/ۗ᩵ۘ;

    if-eqz p3, :cond_5

    .line 181
    invoke-virtual {p0}, Ll/ۙ᩵ۘ;->֫()Landroid/widget/BaseAdapter;

    move-result-object p3

    check-cast p3, Ll/ۗ᩵ۘ;

    invoke-virtual {p3}, Ll/ۗ᩵ۘ;->ܽ()[Landroid/animation/Animator;

    move-result-object p3

    goto :goto_2

    :cond_5
    new-array p3, v0, [Landroid/animation/Animator;

    .line 185
    :goto_2
    invoke-virtual {p0}, Ll/ۗ᩵ۘ;->ܽ()[Landroid/animation/Animator;

    move-result-object v2

    .line 186
    invoke-virtual {p2}, Landroid/view/View;->getAlpha()F

    move-result v3

    const/4 v4, 0x2

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v5, v4, v0

    aput v3, v4, v1

    const-string v3, "alpha"

    invoke-static {p2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 33
    array-length v4, p3

    array-length v5, v2

    add-int/2addr v4, v5

    add-int/lit8 v5, v4, 0x1

    new-array v5, v5, [Landroid/animation/Animator;

    const/4 v6, 0x0

    .line 36
    :goto_3
    array-length v7, p3

    if-ge v6, v7, :cond_6

    .line 37
    aget-object v7, p3, v6

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 40
    :cond_6
    array-length p3, v2

    :goto_4
    if-ge v0, p3, :cond_7

    aget-object v7, v2, v0

    .line 41
    aput-object v7, v5, v6

    add-int/2addr v6, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 45
    :cond_7
    aput-object v3, v5, v4

    .line 189
    iget-object p3, p0, Ll/ۗ᩵ۘ;->۫:Ll/۬᩵ۘ;

    invoke-virtual {p3, p1, p2, v5}, Ll/۬᩵ۘ;->֫(ILandroid/view/View;[Landroid/animation/Animator;)V

    :cond_8
    return-object p2
.end method

.method public final ֫(Ll/ۤ᩵ۘ;)V
    .locals 1

    .line 90
    invoke-super {p0, p1}, Ll/ۙ᩵ۘ;->֫(Ll/ۤ᩵ۘ;)V

    .line 91
    new-instance v0, Ll/۬᩵ۘ;

    invoke-direct {v0, p1}, Ll/۬᩵ۘ;-><init>(Ll/ۤ᩵ۘ;)V

    iput-object v0, p0, Ll/ۗ᩵ۘ;->۫:Ll/۬᩵ۘ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 156
    iput-boolean p1, p0, Ll/ۗ᩵ۘ;->᩶:Z

    return-void
.end method

.method public abstract ܽ()[Landroid/animation/Animator;
.end method

.method public final ᩳ()V
    .locals 2

    .line 106
    invoke-virtual {p0}, Ll/ۙ᩵ۘ;->ۧ()Ll/ۤ᩵ۘ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 111
    iget-object v0, p0, Ll/ۗ᩵ۘ;->۫:Ll/۬᩵ۘ;

    invoke-virtual {v0}, Ll/۬᩵ۘ;->֫()V

    const/4 v0, 0x1

    .line 113
    iput-boolean v0, p0, Ll/ۗ᩵ۘ;->ۗ:Z

    const/4 v0, -0x1

    .line 114
    iput v0, p0, Ll/ۗ᩵ۘ;->ۙ:I

    .line 115
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗ᩵ۘ;->ۤ:J

    .line 116
    invoke-virtual {p0}, Ll/ۙ᩵ۘ;->֫()Landroid/widget/BaseAdapter;

    move-result-object v0

    instance-of v0, v0, Ll/ۗ᩵ۘ;

    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {p0}, Ll/ۙ᩵ۘ;->֫()Landroid/widget/BaseAdapter;

    move-result-object v0

    check-cast v0, Ll/ۗ᩵ۘ;

    invoke-virtual {v0}, Ll/ۗ᩵ۘ;->ᩳ()V

    :cond_0
    return-void

    .line 107
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call setAbsListView() on this AnimationAdapter first!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
