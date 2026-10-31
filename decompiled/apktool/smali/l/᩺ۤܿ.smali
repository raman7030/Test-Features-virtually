.class public Ll/᩺ۤܿ;
.super Ljava/lang/Object;
.source "I4HH"


# static fields
.field public static final ֡:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ᩵:Landroid/os/Handler;


# instance fields
.field public final ֫:Landroid/widget/Button;

.field public ۖ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۜ:Landroid/widget/ProgressBar;

.field public final ۡ:Landroid/widget/TextView;

.field public final ۢ:Landroid/widget/TextView;

.field public ۧ:Z

.field public final ܳ:Ljava/lang/ref/WeakReference;

.field public ܺ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ܽ:Ll/֡ۚۢ;

.field public final ܿ:Landroid/widget/TextView;

.field public final ᩳ:I

.field public ᩴ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ᩷:Landroid/widget/ProgressBar;

.field public ᩻:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 272
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/᩺ۤܿ;->֡:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 273
    new-instance v0, Ll/ۨۤܿ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/᩺ۤܿ;->᩵:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 4

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 285
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/᩺ۤܿ;->ᩴ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 286
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/᩺ۤܿ;->ܺ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 287
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩺ۤܿ;->ۖ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 288
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩺ۤܿ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 290
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩺ۤܿ;->ܳ:Ljava/lang/ref/WeakReference;

    .line 291
    sget-object v0, Ll/᩺ۤܿ;->֡:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, p0, Ll/᩺ۤܿ;->ᩳ:I

    const v0, 0x7f0d00e0

    .line 47
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setKeepScreenOn(Z)V

    const v1, 0x7f0a0631

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/᩺ۤܿ;->ۡ:Landroid/widget/TextView;

    const v1, 0x7f0a03b2

    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/᩺ۤܿ;->ܿ:Landroid/widget/TextView;

    const v2, 0x7f0a0459

    .line 51
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iput-object v2, p0, Ll/᩺ۤܿ;->ۜ:Landroid/widget/ProgressBar;

    const v2, 0x7f0a045a

    .line 52
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iput-object v2, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    const v2, 0x7f0a05e2

    .line 53
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/᩺ۤܿ;->ۢ:Landroid/widget/TextView;

    const v2, 0x7f0a00a2

    .line 54
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Ll/᩺ۤܿ;->֫:Landroid/widget/Button;

    .line 0
    instance-of v2, p0, Ll/᩹ۗܿ;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 56
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 58
    :cond_0
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 59
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 60
    invoke-virtual {v1, v3}, Ll/᩵ۚۢ;->֫(Z)V

    .line 61
    invoke-virtual {v1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩺ۤܿ;)V
    .locals 2

    .line 217
    iget-object v0, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    invoke-direct {p0}, Ll/᩺ۤܿ;->ܺ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 218
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ll/᩷۠᩷;

    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0x32

    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 220
    :cond_0
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩺ۤܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺ۤܿ;->ܺ()Z

    return-void
.end method

.method private ܺ()Z
    .locals 8

    .line 301
    iget-object v0, p0, Ll/᩺ۤܿ;->ᩴ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 302
    iget-object v2, p0, Ll/᩺ۤܿ;->ܺ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 303
    iget-object v2, p0, Ll/᩺ۤܿ;->ۖ:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v2

    .line 304
    iget-object v4, p0, Ll/᩺ۤܿ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    .line 306
    iget-object v7, p0, Ll/᩺ۤܿ;->ۡ:Landroid/widget/TextView;

    invoke-static {v0}, Ll/᩺ۤܿ;->ܽ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 310
    invoke-static {v1}, Ll/᩺ۤܿ;->ܽ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v7, p0, Ll/᩺ۤܿ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 0
    instance-of v0, p0, Ll/᩹ۗܿ;

    if-nez v0, :cond_1

    .line 311
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v6, 0x8

    .line 312
    :cond_1
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v6, :cond_2

    .line 313
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    const/4 v0, 0x1

    :cond_3
    if-eq v2, v3, :cond_4

    .line 318
    iget-object v0, p0, Ll/᩺ۤܿ;->ۜ:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    const/4 v0, 0x1

    :cond_4
    if-eq v4, v3, :cond_5

    .line 322
    iget-object v0, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    return v5

    :cond_5
    return v0
.end method

.method public static ܽ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-eqz p0, :cond_1

    .line 333
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1f4

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 336
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/۬ۧᩳ;
    .locals 1

    .line 249
    new-instance v0, Ll/ۛۤܿ;

    invoke-direct {v0, p0}, Ll/ۛۤܿ;-><init>(Ll/᩺ۤܿ;)V

    return-object v0
.end method

.method public ֫(Landroid/view/View$OnClickListener;)Ll/᩺ۤܿ;
    .locals 2

    const/4 v0, 0x0

    .line 188
    iget-object v1, p0, Ll/᩺ۤܿ;->֫:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f12044a

    .line 189
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 190
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public ֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;
    .locals 1

    const/4 v0, 0x0

    .line 69
    iput-boolean v0, p0, Ll/᩺ۤܿ;->ۧ:Z

    .line 70
    iput-object p1, p0, Ll/᩺ۤܿ;->᩻:Ljava/lang/Runnable;

    .line 71
    new-instance p1, Ll/۫ۤܿ;

    invoke-direct {p1, p0}, Ll/۫ۤܿ;-><init>(Ll/᩺ۤܿ;)V

    iget-object v0, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    return-object p0
.end method

.method public ֫(I)V
    .locals 0

    .line 137
    invoke-static {p1}, Ll/ۙ᩸᩷;->ܽ(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ֫(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    .line 167
    invoke-virtual {p0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void

    :cond_0
    const-wide/16 v0, 0x64

    mul-long p1, p1, v0

    .line 169
    div-long/2addr p1, p3

    long-to-int p2, p1

    invoke-virtual {p0, p2}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public ֫(Ljava/lang/CharSequence;)V
    .locals 2

    .line 142
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    iget-object v1, p0, Ll/᩺ۤܿ;->ܺ:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 143
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 144
    invoke-static {p1}, Ll/᩺ۤܿ;->ܽ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ۤܿ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 0
    instance-of v0, p0, Ll/᩹ۗܿ;

    if-nez v0, :cond_0

    .line 145
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 146
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 147
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    :cond_2
    if-nez p1, :cond_3

    const-string p1, ""

    .line 150
    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 151
    invoke-virtual {p0}, Ll/᩺ۤܿ;->᩷()V

    return-void
.end method

.method public ֫(Z)V
    .locals 1

    .line 195
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Ll/᩺ۤܿ;->ۜ:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    return-void

    .line 198
    :cond_0
    new-instance v0, Ll/۬ۤܿ;

    invoke-direct {v0, p0, p1}, Ll/۬ۤܿ;-><init>(Ll/᩺ۤܿ;Z)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 110
    iget-object v0, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    return v0
.end method

.method public ۡ()Ll/᩺ۤܿ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    return-object p0
.end method

.method public final ۢ()Ll/ۡۛۡ;
    .locals 1

    .line 235
    new-instance v0, Ll/ۤۤܿ;

    invoke-direct {v0, p0}, Ll/ۤۤܿ;-><init>(Ll/᩺ۤܿ;)V

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 97
    iget-boolean v0, p0, Ll/᩺ۤܿ;->ۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 98
    iput-boolean v0, p0, Ll/᩺ۤܿ;->ۧ:Z

    .line 99
    iget-object v0, p0, Ll/᩺ۤܿ;->᩻:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 100
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public ۧ(I)V
    .locals 3

    .line 175
    iget-object v0, p0, Ll/᩺ۤܿ;->ۜ:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v1

    if-eq v1, p1, :cond_1

    .line 176
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v1

    iget-object v2, p0, Ll/᩺ۤܿ;->ۖ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    .line 177
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 178
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void

    .line 180
    :cond_0
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 181
    invoke-virtual {p0}, Ll/᩺ۤܿ;->᩷()V

    :cond_1
    return-void
.end method

.method public ۧ(Ljava/lang/CharSequence;)V
    .locals 2

    .line 126
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    iget-object v1, p0, Ll/᩺ۤܿ;->ᩴ:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 127
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Ll/᩺ۤܿ;->ۡ:Landroid/widget/TextView;

    invoke-static {p1}, Ll/᩺ۤܿ;->ܽ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 130
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p0}, Ll/᩺ۤܿ;->᩷()V

    return-void
.end method

.method public final ܳ()Landroid/widget/TextView;
    .locals 1

    .line 227
    iget-object v0, p0, Ll/᩺ۤܿ;->ܿ:Landroid/widget/TextView;

    return-object v0
.end method

.method public final ܽ()V
    .locals 2

    .line 93
    iget-object v0, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public ܽ(I)V
    .locals 0

    .line 121
    invoke-static {p1}, Ll/ۙ᩸᩷;->ܽ(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩺ۤܿ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܿ()Ll/֡ۚۢ;
    .locals 1

    .line 231
    iget-object v0, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    return-object v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 208
    sget-object v0, Ll/᩺ۤܿ;->᩵:Landroid/os/Handler;

    iget v1, p0, Ll/᩺ۤܿ;->ᩳ:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 209
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    invoke-direct {p0}, Ll/᩺ۤܿ;->ܺ()Z

    move-result v0

    iget-object v1, p0, Ll/᩺ۤܿ;->ܽ:Ll/֡ۚۢ;

    if-eqz v0, :cond_0

    .line 211
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/᩷۠᩷;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x32

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 213
    :cond_0
    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 216
    :cond_1
    new-instance v0, Ll/᩹۫ܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩹۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩷()V
    .locals 4

    .line 294
    sget-object v0, Ll/᩺ۤܿ;->᩵:Landroid/os/Handler;

    iget v1, p0, Ll/᩺ۤܿ;->ᩳ:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 295
    iget-object v2, p0, Ll/᩺ۤܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0xf

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Ll/᩺ۤܿ;->ۧ:Z

    return v0
.end method
