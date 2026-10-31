.class public final Ll/ۚۢۢ;
.super Ll/᩶ۗۧ;
.source "K1PX"


# instance fields
.field public ֫:Ljava/util/List;

.field public ۧ:Ljava/lang/String;

.field public final synthetic ܳ:Ll/۠ۢۢ;

.field public ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ܿ:Ljava/lang/String;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/۠ۢۢ;)V
    .locals 2

    .line 176
    iput-object p1, p0, Ll/ۚۢۢ;->ܳ:Ll/۠ۢۢ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 170
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۢۢ;->ܿ:Ljava/lang/String;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۢۢ;->֫:Ljava/util/List;

    .line 174
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۚۢۢ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 177
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "apk_selector_path"

    invoke-interface {v0, v1, p1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 179
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۢۢ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ֫(Ll/ۚۢۢ;Ljava/util/List;Ljava/lang/String;)V
    .locals 3

    .line 236
    iget-object v0, p0, Ll/ۚۢۢ;->ܳ:Ll/۠ۢۢ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۚۢۢ;->ᩳ:J

    .line 237
    iput-object p1, p0, Ll/ۚۢۢ;->֫:Ljava/util/List;

    .line 238
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    const/4 p0, 0x0

    if-eqz p2, :cond_1

    const/4 v1, 0x0

    .line 241
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 242
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۢۢ;

    iget-object v2, v2, Ll/ܺۢۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 244
    invoke-static {v0}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object p0

    iget-object p0, p0, Ll/ۖۢۢ;->ܽ:Ll/۬۬ۧ;

    invoke-virtual {p0, v1}, Ll/۬۬ۧ;->scrollToPosition(I)V

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 250
    :cond_1
    invoke-static {v0}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object p1

    iget-object p1, p1, Ll/ۖۢۢ;->ܽ:Ll/۬۬ۧ;

    invoke-virtual {p1, p0}, Ll/۬۬ۧ;->scrollToPosition(I)V

    return-void
.end method

.method public static ֫(Ll/ۚۢۢ;Ljava/util/List;Ljava/lang/String;I)V
    .locals 11

    .line 214
    iget-object v0, p0, Ll/ۚۢۢ;->ܳ:Ll/۠ۢۢ;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 215
    iget-object v1, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۚۢۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 216
    new-instance v1, Ll/ܺۢۢ;

    invoke-direct {v1, v2}, Ll/ܺۢۢ;-><init>(I)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    :cond_0
    iget-object v1, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const/4 v3, 0x1

    .line 413
    invoke-virtual {v1, v3}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v1

    .line 219
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩵ܿ;

    .line 220
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    const-string v6, ".apk"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 221
    :cond_2
    new-instance v5, Ll/ܺۢۢ;

    invoke-direct {v5, v4}, Ll/ܺۢۢ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 223
    :cond_3
    new-instance v1, Ll/ᩴۢۢ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 234
    invoke-static {p1, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 235
    new-instance v1, Ll/᩵ۢۢ;

    invoke-direct {v1, p0, p1, p2}, Ll/᩵ۢۢ;-><init>(Ll/ۚۢۢ;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const-wide/16 v4, 0x64

    .line 254
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    const/4 p2, 0x0

    .line 255
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_6

    .line 256
    iget-object v1, p0, Ll/ۚۢۢ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-eq p3, v1, :cond_4

    goto :goto_2

    .line 260
    :cond_4
    :try_start_0
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۢۢ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    iget-boolean v4, v1, Ll/ܺۢۢ;->ܿ:Z

    if-nez v4, :cond_5

    .line 265
    iget-object v4, v1, Ll/ܺۢۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 266
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v6

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v8

    sget v10, Ll/۬۫ۡ;->֫:I

    .line 51
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 52
    invoke-static {v5}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 267
    sget-object v6, Ll/᩶ۖܳ;->ۢ:Ll/᩶ۖܳ;

    new-instance v7, Ll/ܳۧ᩻;

    invoke-direct {v7, v4, v3}, Ll/ܳۧ᩻;-><init>(Ll/ܶ᩵ܿ;I)V

    invoke-static {v5, v6, v2, v7}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object v4

    .line 270
    invoke-virtual {v4}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 271
    new-instance v5, Ll/֡ۢۢ;

    invoke-direct {v5, v1, v4}, Ll/֡ۢۢ;-><init>(Ll/ܺۢۢ;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :catch_0
    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ۚۢۢ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 4

    .line 169
    check-cast p1, Ll/֨ۢۢ;

    .line 190
    iget-object v0, p0, Ll/ۚۢۢ;->֫:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۢۢ;

    .line 191
    iget-object v0, p1, Ll/֨ۢۢ;->ۙ:Landroid/widget/TextView;

    iget-object v1, p2, Ll/ܺۢۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    iget-object v0, p1, Ll/֨ۢۢ;->᩶:Landroid/widget/TextView;

    iget-object v1, p2, Ll/ܺۢۢ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    iget-object v0, p1, Ll/֨ۢۢ;->᩹:Landroid/widget/ImageView;

    iget-object v1, p2, Ll/ܺۢۢ;->ܽ:Ll/֡᩻;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 194
    iput-object p2, p1, Ll/֨ۢۢ;->᩸:Ll/ܺۢۢ;

    const/4 v0, 0x1

    .line 195
    iput-boolean v0, p2, Ll/ܺۢۢ;->֫:Z

    .line 196
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۚۢۢ;->ᩳ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    .line 197
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 198
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const/4 p2, 0x2

    new-array p2, p2, [F

    fill-array-data p2, :array_0

    const-string v0, "alpha"

    invoke-static {p1, v0, p2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    :cond_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 1

    .line 185
    new-instance p2, Ll/֨ۢۢ;

    iget-object v0, p0, Ll/ۚۢۢ;->ܳ:Ll/۠ۢۢ;

    invoke-direct {p2, v0, p1}, Ll/֨ۢۢ;-><init>(Ll/۠ۢۢ;Landroid/view/ViewGroup;)V

    return-object p2
.end method

.method public final ֫()Z
    .locals 3

    .line 290
    iget-object v0, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۚۢۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return v2

    .line 292
    :cond_0
    iget-object v0, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 293
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 295
    iput-object v1, p0, Ll/ۚۢۢ;->ۧ:Ljava/lang/String;

    .line 296
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۚۢۢ;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 4

    .line 208
    iget-object v0, p0, Ll/ۚۢۢ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 209
    iget-object v1, p0, Ll/ۚۢۢ;->֫:Ljava/util/List;

    .line 210
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Ll/ۚۢۢ;->֫:Ljava/util/List;

    .line 211
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 213
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ۘۢۢ;

    invoke-direct {v3, p0, v1, p1, v0}, Ll/ۘۢۢ;-><init>(Ll/ۚۢۢ;Ljava/util/List;Ljava/lang/String;I)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
