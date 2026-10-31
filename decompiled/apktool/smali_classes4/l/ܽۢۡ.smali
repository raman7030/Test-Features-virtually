.class public final Ll/ܽۢۡ;
.super Ljava/lang/Object;
.source "V7F9"


# instance fields
.field public ֫:Ll/᩶ۗۧ;

.field public ۧ:Ll/֫ۗۧ;

.field public final ܳ:Ll/ۢᩴ;

.field public final ܽ:[I

.field public ܿ:J

.field public ᩳ:Z


# direct methods
.method public varargs constructor <init>(Ll/ۢᩴ;[I)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ܽۢۡ;->ܳ:Ll/ۢᩴ;

    .line 39
    iput-object p2, p0, Ll/ܽۢۡ;->ܽ:[I

    .line 40
    invoke-virtual {p1}, Ll/ۢᩴ;->getMenu()Landroid/view/Menu;

    move-result-object p1

    const p2, 0x7f0a016c

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    const p2, 0x7f0801c9

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 p1, 0x0

    .line 41
    invoke-direct {p0, p1, p1}, Ll/ܽۢۡ;->֫(ZZ)V

    return-void
.end method

.method public static ֫(Ll/ܽۢۡ;[Landroid/view/MenuItem;)V
    .locals 5

    .line 218
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    const/4 v3, 0x1

    .line 219
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 220
    iget-object v3, p0, Ll/ܽۢۡ;->ܳ:Ll/ۢᩴ;

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 222
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const/4 v3, 0x0

    .line 223
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 224
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v3, 0x64

    invoke-virtual {v2, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ܽۢۡ;[Landroid/view/MenuItem;Ll/ۧ۠᩷;)V
    .locals 5

    .line 204
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    .line 205
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 206
    iget-object v4, p0, Ll/ܽۢۡ;->ܳ:Ll/ۢᩴ;

    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    const/high16 v4, 0x3f800000    # 1.0f

    .line 208
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 211
    :cond_1
    invoke-virtual {p2}, Ll/ۧ۠᩷;->run()V

    return-void
.end method

.method private ֫(ZZ)V
    .locals 9

    .line 136
    iget-object v0, p0, Ll/ܽۢۡ;->ܳ:Ll/ۢᩴ;

    invoke-virtual {v0}, Ll/ۢᩴ;->getMenu()Landroid/view/Menu;

    move-result-object v1

    const v2, 0x7f0a016c

    .line 137
    invoke-interface {v1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    if-nez v2, :cond_0

    goto/16 :goto_9

    .line 141
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 142
    iget-object v4, p0, Ll/ܽۢۡ;->ܽ:[I

    array-length v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_2

    aget v8, v4, v7

    .line 143
    invoke-interface {v1, v8}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 145
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    if-nez p2, :cond_6

    .line 170
    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_3

    .line 172
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 173
    invoke-virtual {p2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 150
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/MenuItem;

    .line 170
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 172
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 173
    invoke-virtual {v4, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_4
    xor-int/lit8 v4, p1, 0x1

    .line 152
    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_1

    .line 154
    :cond_5
    invoke-interface {v2, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void

    :cond_6
    const/4 p2, 0x1

    if-eqz p1, :cond_7

    new-array v1, v6, [Landroid/view/MenuItem;

    .line 158
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/view/MenuItem;

    goto :goto_2

    :cond_7
    new-array v1, p2, [Landroid/view/MenuItem;

    aput-object v2, v1, v6

    :goto_2
    if-eqz p1, :cond_8

    new-array p1, p2, [Landroid/view/MenuItem;

    aput-object v2, p1, v6

    goto :goto_3

    :cond_8
    new-array p1, v6, [Landroid/view/MenuItem;

    .line 162
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/view/MenuItem;

    .line 163
    :goto_3
    new-instance v2, Ll/ۧ۠᩷;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p0, p1}, Ll/ۧ۠᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 178
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 179
    array-length v3, v1

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v3, :cond_b

    aget-object v5, v1, v4

    .line 180
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_5

    .line 183
    :cond_9
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    move-result v7

    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_a

    .line 185
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 187
    :cond_a
    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 190
    :cond_b
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 191
    array-length p1, v1

    const/4 p2, 0x0

    :goto_6
    if-ge p2, p1, :cond_c

    aget-object v0, v1, p2

    .line 192
    invoke-interface {v0, v6}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    .line 194
    :cond_c
    invoke-virtual {v2}, Ll/ۧ۠᩷;->run()V

    return-void

    :cond_d
    const/4 v0, 0x0

    .line 197
    :goto_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_10

    .line 198
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 199
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, p2

    if-ne v0, v4, :cond_e

    const/4 v4, 0x1

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    .line 200
    :goto_8
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 201
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    const-wide/16 v5, 0x64

    invoke-virtual {v3, v5, v6}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    if-eqz v4, :cond_f

    .line 203
    new-instance v4, Ll/ۧۢۡ;

    invoke-direct {v4, p0, v1, v2}, Ll/ۧۢۡ;-><init>(Ll/ܽۢۡ;[Landroid/view/MenuItem;Ll/ۧ۠᩷;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_10
    :goto_9
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 65
    iget-boolean v0, p0, Ll/ܽۢۡ;->ᩳ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 68
    iput-boolean v0, p0, Ll/ܽۢۡ;->ᩳ:Z

    .line 69
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܽۢۡ;->ܿ:J

    .line 70
    iget-object v1, p0, Ll/ܽۢۡ;->֫:Ll/᩶ۗۧ;

    if-eqz v1, :cond_1

    .line 71
    invoke-virtual {v1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 73
    :cond_1
    invoke-direct {p0, v0, v0}, Ll/ܽۢۡ;->֫(ZZ)V

    return-void
.end method

.method public final ֫(Landroid/widget/ImageView;Z)V
    .locals 7

    .line 104
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const/16 v0, 0x8

    const/high16 v1, 0x3f800000    # 1.0f

    if-nez p2, :cond_0

    .line 106
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 107
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 110
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Ll/ܽۢۡ;->ܿ:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x64

    const/4 p2, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_2

    .line 111
    iget-boolean p2, p0, Ll/ܽۢۡ;->ᩳ:Z

    if-eqz p2, :cond_1

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 112
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 115
    :cond_2
    iget-boolean v0, p0, Ll/ܽۢۡ;->ᩳ:Z

    const-wide/16 v2, 0xc8

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    .line 116
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 117
    invoke-virtual {p1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 118
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    return-void

    .line 120
    :cond_3
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 121
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    invoke-virtual {p2, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    new-instance v0, Ll/ۛ᩷ᩳ;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p1}, Ll/ۛ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    .line 122
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public final ֫(Ll/֫ۗۧ;)V
    .locals 0

    .line 49
    iput-object p1, p0, Ll/ܽۢۡ;->ۧ:Ll/֫ۗۧ;

    return-void
.end method

.method public final ֫(Ll/ۗ۬ۧ;)V
    .locals 1

    .line 129
    iget-boolean v0, p0, Ll/ܽۢۡ;->ᩳ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽۢۡ;->ۧ:Ll/֫ۗۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/᩶ۗۧ;)V
    .locals 0

    .line 45
    iput-object p1, p0, Ll/ܽۢۡ;->֫:Ll/᩶ۗۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 82
    iget-boolean v0, p0, Ll/ܽۢۡ;->ᩳ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Ll/ܽۢۡ;->ᩳ:Z

    .line 86
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܽۢۡ;->ܿ:J

    .line 87
    iget-object v1, p0, Ll/ܽۢۡ;->֫:Ll/᩶ۗۧ;

    if-eqz v1, :cond_1

    .line 88
    invoke-virtual {v1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 90
    :cond_1
    invoke-direct {p0, v0, p1}, Ll/ܽۢۡ;->֫(ZZ)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Ll/ܽۢۡ;->ᩳ:Z

    return v0
.end method

.method public final ܽ()V
    .locals 2

    const/4 v0, 0x0

    .line 60
    iget-boolean v1, p0, Ll/ܽۢۡ;->ᩳ:Z

    invoke-direct {p0, v1, v0}, Ll/ܽۢۡ;->֫(ZZ)V

    return-void
.end method
