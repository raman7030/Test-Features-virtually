.class public final Ll/ܺᩴܿ;
.super Ll/۟ܶۡ;
.source "N15M"


# instance fields
.field public final ۖ:Ljava/lang/ref/WeakReference;

.field public final ۘ:Ljava/lang/ref/WeakReference;

.field public final ۜ:Ljava/lang/ref/WeakReference;

.field public final ۡ:Ljava/lang/ref/WeakReference;

.field public final ۢ:Ljava/lang/ref/WeakReference;

.field public final ܳ:Ljava/lang/ref/WeakReference;

.field public ܺ:Ljava/lang/String;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩵:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩷:I

.field public final ᩻:Ll/۬ᩴܿ;


# direct methods
.method public constructor <init>(Ll/۬ᩴܿ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/String;Ll/ۗܺ᩷;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/Button;)V
    .locals 1

    const-string v0, "context"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translateTaskMark"

    .line 11
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    .line 17
    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    .line 22
    invoke-static {p4, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "srcTextView"

    .line 28
    invoke-static {p5, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tarTextView"

    .line 34
    invoke-static {p6, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fixTranslate"

    .line 39
    invoke-static {p7, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressBar"

    .line 44
    invoke-static {p8, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 230
    iput-object p1, p0, Ll/ܺᩴܿ;->᩻:Ll/۬ᩴܿ;

    .line 231
    iput-object p2, p0, Ll/ܺᩴܿ;->᩵:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 232
    iput-object p3, p0, Ll/ܺᩴܿ;->ᩴ:Ljava/lang/String;

    .line 241
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܺᩴܿ;->ܳ:Ljava/lang/ref/WeakReference;

    .line 242
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܺᩴܿ;->ۖ:Ljava/lang/ref/WeakReference;

    .line 243
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܺᩴܿ;->ۘ:Ljava/lang/ref/WeakReference;

    .line 244
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܺᩴܿ;->ۜ:Ljava/lang/ref/WeakReference;

    .line 245
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܺᩴܿ;->ۢ:Ljava/lang/ref/WeakReference;

    .line 246
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܺᩴܿ;->ۡ:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x0

    .line 250
    invoke-virtual {p8, p1}, Landroid/view/View;->setVisibility(I)V

    .line 251
    invoke-virtual {p9, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 252
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    iput p1, p0, Ll/ܺᩴܿ;->᩷:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 266
    iget-object v0, p0, Ll/ܺᩴܿ;->᩻:Ll/۬ᩴܿ;

    invoke-interface {v0}, Ll/۬ᩴܿ;->afterFinish()V

    .line 267
    iget-object v0, p0, Ll/ܺᩴܿ;->᩵:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, Ll/ܺᩴܿ;->᩷:I

    if-ne v1, v0, :cond_6

    .line 268
    iget-object v0, p0, Ll/ܺᩴܿ;->ۖ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/ܺᩴܿ;->ᩴ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    :cond_0
    iget-object v0, p0, Ll/ܺᩴܿ;->ۘ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_1

    iget-object v3, p0, Ll/ܺᩴܿ;->ܺ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    :cond_1
    iget-object v2, p0, Ll/ܺᩴܿ;->ܺ:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x64

    if-lt v2, v3, :cond_2

    .line 271
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_3

    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    goto :goto_0

    .line 273
    :cond_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_3

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 275
    :cond_3
    :goto_0
    iget-object v0, p0, Ll/ܺᩴܿ;->ۜ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_6

    .line 305
    new-instance v2, Ll/ۙۙ᩵;

    const-string v3, "[a-zA-Z0-9_]+"

    invoke-direct {v2, v3}, Ll/ۙۙ᩵;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ll/ۙۙ᩵;->֫(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    move-object v2, v1

    goto :goto_1

    :cond_4
    const-string v2, "_"

    const-string v3, " "

    .line 308
    invoke-static {v1, v2, v3}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 309
    new-instance v3, Ll/ۙۙ᩵;

    const-string v4, "([a-z])([A-Z])"

    invoke-direct {v3, v4}, Ll/ۙۙ᩵;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ll/ۙۙ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 310
    new-instance v3, Ll/ۙۙ᩵;

    const-string v4, "([a-zA-Z])([0-9])"

    invoke-direct {v3, v4}, Ll/ۙۙ᩵;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ll/ۙۙ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 311
    new-instance v3, Ll/ۙۙ᩵;

    const-string v4, "([0-9])([a-zA-Z])"

    invoke-direct {v3, v4}, Ll/ۙۙ᩵;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ll/ۙۙ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 169
    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 279
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const v5, 0x7f1202c3

    invoke-virtual {v1, v5, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 278
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 281
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_5
    const/16 v1, 0x8

    .line 283
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 290
    iget-object v0, p0, Ll/ܺᩴܿ;->᩵:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, Ll/ܺᩴܿ;->᩷:I

    if-ne v1, v0, :cond_0

    .line 291
    iget-object v0, p0, Ll/ܺᩴܿ;->᩻:Ll/۬ᩴܿ;

    invoke-interface {v0, p1}, Ll/۬ᩴܿ;->onError(Ljava/lang/Exception;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    iget-object v0, p0, Ll/ܺᩴܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 256
    iget-object v0, p0, Ll/ܺᩴܿ;->᩻:Ll/۬ᩴܿ;

    invoke-interface {v0}, Ll/۬ᩴܿ;->beforeStart()V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 260
    iget-object v0, p0, Ll/ܺᩴܿ;->᩻:Ll/۬ᩴܿ;

    invoke-interface {v0}, Ll/۬ᩴܿ;->onStart()V

    .line 261
    iget-object v1, p0, Ll/ܺᩴܿ;->ᩴ:Ljava/lang/String;

    invoke-interface {v0, v1}, Ll/۬ᩴܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܺᩴܿ;->ܺ:Ljava/lang/String;

    .line 262
    invoke-interface {v0}, Ll/۬ᩴܿ;->onFinish()V

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 298
    iget-object v0, p0, Ll/ܺᩴܿ;->᩵:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, Ll/ܺᩴܿ;->᩷:I

    if-ne v1, v0, :cond_1

    .line 299
    iget-object v0, p0, Ll/ܺᩴܿ;->ۡ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 300
    :cond_0
    iget-object v0, p0, Ll/ܺᩴܿ;->ۢ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method
