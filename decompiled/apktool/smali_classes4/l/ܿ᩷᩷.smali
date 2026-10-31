.class public final Ll/ܿ᩷᩷;
.super Ljava/lang/Object;
.source "P7RC"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Ll/ܿ᩷᩷;->֫:Z

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩷᩷;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫()I
    .locals 7

    .line 198
    iget-object v0, p0, Ll/ܿ᩷᩷;->ۧ:Ljava/util/ArrayList;

    .line 199
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 203
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩷᩷;

    .line 204
    invoke-virtual {v3}, Ll/ᩳ᩷᩷;->ۧ()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 206
    new-instance v4, Ll/ۧ᩷᩷;

    invoke-direct {v4, v3}, Ll/ۧ᩷᩷;-><init>(Landroid/view/View;)V

    .line 207
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 v4, -0x2

    .line 212
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    .line 219
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳ᩷᩷;

    .line 220
    invoke-virtual {v4}, Ll/ᩳ᩷᩷;->ۧ()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 224
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 225
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 223
    invoke-virtual {v4, v5, v6}, Landroid/view/View;->measure(II)V

    .line 228
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 229
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 235
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ᩷᩷;

    .line 236
    invoke-virtual {v1}, Ll/ۧ᩷᩷;->֫()V

    goto :goto_2

    :cond_4
    return v3

    :catchall_0
    move-exception v0

    .line 235
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩷᩷;

    .line 236
    invoke-virtual {v2}, Ll/ۧ᩷᩷;->֫()V

    goto :goto_3

    .line 238
    :cond_5
    throw v0
.end method

.method public static ֫(Ll/ܿ᩷᩷;)V
    .locals 6

    .line 152
    iget-object v0, p0, Ll/ܿ᩷᩷;->ۧ:Ljava/util/ArrayList;

    iget-boolean v1, p0, Ll/ܿ᩷᩷;->֫:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 156
    iput-boolean v1, p0, Ll/ܿ᩷᩷;->֫:Z

    const/4 v1, 0x0

    .line 183
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 184
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 185
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩷᩷;

    .line 186
    invoke-virtual {v3}, Ll/ᩳ᩷᩷;->ܽ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 187
    invoke-virtual {v3}, Ll/ᩳ᩷᩷;->֫()V

    .line 188
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 162
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 175
    iput-boolean v1, p0, Ll/ܿ᩷᩷;->֫:Z

    return-void

    .line 167
    :cond_3
    :try_start_1
    invoke-direct {p0}, Ll/ܿ᩷᩷;->֫()I

    move-result v2

    if-lez v2, :cond_5

    .line 273
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩷᩷;

    .line 274
    invoke-virtual {v3}, Ll/ᩳ᩷᩷;->ۧ()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 276
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 277
    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-eq v5, v2, :cond_4

    .line 278
    iput v2, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 279
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 175
    :cond_5
    iput-boolean v1, p0, Ll/ܿ᩷᩷;->֫:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Ll/ܿ᩷᩷;->֫:Z

    .line 176
    throw v0
.end method

.method public static varargs ֫([Landroid/view/View;)V
    .locals 9

    .line 117
    new-instance v0, Ll/ܿ᩷᩷;

    invoke-direct {v0}, Ll/ܿ᩷᩷;-><init>()V

    .line 128
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_1

    .line 132
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget-object v4, v0, Ll/ܿ᩷᩷;->ۧ:Ljava/util/ArrayList;

    if-ge v3, v1, :cond_2

    aget-object v5, p0, v3

    if-eqz v5, :cond_1

    .line 134
    new-instance v6, Ll/ᩳ᩷᩷;

    new-instance v7, Ll/ۖ۫᩻;

    const/4 v8, 0x2

    invoke-direct {v7, v8, v0}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-direct {v6, v5, v7}, Ll/ᩳ᩷᩷;-><init>(Landroid/view/View;Ll/ۖ۫᩻;)V

    .line 135
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 140
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    .line 141
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳ᩷᩷;

    invoke-virtual {p0}, Ll/ᩳ᩷᩷;->ۧ()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 143
    new-instance v1, Ll/ۖ۫᩻;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_3
    :goto_1
    return-void
.end method
