.class public final Ll/ۨܽ;
.super Ljava/lang/Object;
.source "K234"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/lang/Runnable;

.field public ܳ:Landroid/window/OnBackInvokedCallback;

.field public ܽ:Z

.field public ܿ:Landroid/window/OnBackInvokedDispatcher;

.field public ᩳ:Ll/֡ܽ;

.field public final ᩻:Ll/ۨ۠᩵;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 75
    invoke-direct {p0, v0}, Ll/ۨܽ;-><init>(Ljava/lang/Runnable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Ll/ۨܽ;->ۧ:Ljava/lang/Runnable;

    .line 67
    new-instance p1, Ll/ۨ۠᩵;

    invoke-direct {p1}, Ll/ۨ۠᩵;-><init>()V

    iput-object p1, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    .line 125
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    .line 127
    new-instance p1, Ll/ۚܽ;

    invoke-direct {p1, p0}, Ll/ۚܽ;-><init>(Ll/ۨܽ;)V

    new-instance v0, Ll/֨ܽ;

    invoke-direct {v0, p0}, Ll/֨ܽ;-><init>(Ll/ۨܽ;)V

    new-instance v1, Ll/۠ܽ;

    invoke-direct {v1, p0}, Ll/۠ܽ;-><init>(Ll/ۨܽ;)V

    new-instance v2, Ll/ܶܽ;

    invoke-direct {v2, p0}, Ll/ܶܽ;-><init>(Ll/ۨܽ;)V

    sget-object v3, Ll/ۗܽ;->֫:Ll/ۗܽ;

    invoke-virtual {v3, p1, v0, v1, v2}, Ll/ۗܽ;->֫(Ll/ܺ᩹᩵;Ll/ܺ᩹᩵;Ll/֫᩹᩵;Ll/֫᩹᩵;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    .line 134
    :cond_0
    new-instance p1, Ll/᩸ܽ;

    invoke-direct {p1, p0}, Ll/᩸ܽ;-><init>(Ll/ۨܽ;)V

    sget-object v0, Ll/᩶ܽ;->֫:Ll/᩶ܽ;

    invoke-virtual {v0, p1}, Ll/᩶ܽ;->֫(Ll/֫᩹᩵;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    .line 126
    :goto_0
    iput-object p1, p0, Ll/ۨܽ;->ܳ:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method

.method public static final synthetic ֫(Ll/ۨܽ;)Ll/֡ܽ;
    .locals 0

    .line 63
    iget-object p0, p0, Ll/ۨܽ;->ᩳ:Ll/֡ܽ;

    return-object p0
.end method

.method public static final ֫(Ll/ۨܽ;Ll/᩶ۧ;)V
    .locals 2

    .line 251
    iget-object p0, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    .line 15
    invoke-virtual {p0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v0

    .line 533
    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    .line 534
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 442
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    .line 443
    move-object v1, v0

    check-cast v1, Ll/֡ܽ;

    .line 252
    invoke-virtual {v1}, Ll/֡ܽ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 251
    :goto_0
    check-cast v0, Ll/֡ܽ;

    if-eqz v0, :cond_2

    const-string p0, "backEvent"

    .line 0
    invoke-static {p1, p0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private final ֫(Z)V
    .locals 5

    .line 92
    iget-object v0, p0, Ll/ۨܽ;->ܿ:Landroid/window/OnBackInvokedDispatcher;

    .line 93
    iget-object v1, p0, Ll/ۨܽ;->ܳ:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 95
    sget-object v3, Ll/᩶ܽ;->֫:Ll/᩶ܽ;

    if-eqz p1, :cond_0

    iget-boolean v4, p0, Ll/ۨܽ;->֫:Z

    if-nez v4, :cond_0

    .line 96
    invoke-virtual {v3, v0, v2, v1}, Ll/᩶ܽ;->֫(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    .line 101
    iput-boolean p1, p0, Ll/ۨܽ;->֫:Z

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 102
    iget-boolean p1, p0, Ll/ۨܽ;->֫:Z

    if-eqz p1, :cond_1

    .line 103
    invoke-virtual {v3, v0, v1}, Ll/᩶ܽ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    iput-boolean v2, p0, Ll/ۨܽ;->֫:Z

    :cond_1
    return-void
.end method

.method public static final synthetic ۧ(Ll/ۨܽ;)Ll/ۨ۠᩵;
    .locals 0

    .line 63
    iget-object p0, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    return-object p0
.end method

.method private final ۧ()V
    .locals 4

    .line 113
    iget-boolean v0, p0, Ll/ۨܽ;->ܽ:Z

    const/4 v1, 0x0

    .line 431
    iget-object v2, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ll/ۨ۠᩵;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 432
    :cond_0
    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܽ;

    .line 114
    invoke-virtual {v3}, Ll/֡ܽ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    .line 115
    :cond_2
    :goto_0
    iput-boolean v1, p0, Ll/ۨܽ;->ܽ:Z

    if-eq v1, v0, :cond_3

    .line 118
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v0, v2, :cond_3

    .line 119
    invoke-direct {p0, v1}, Ll/ۨܽ;->֫(Z)V

    :cond_3
    return-void
.end method

.method public static final ۧ(Ll/ۨܽ;Ll/᩶ۧ;)V
    .locals 3

    .line 233
    iget-object v0, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    .line 15
    invoke-virtual {v0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v1

    .line 533
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    .line 534
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 436
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    .line 437
    move-object v2, v1

    check-cast v2, Ll/֡ܽ;

    .line 234
    invoke-virtual {v2}, Ll/֡ܽ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 233
    :goto_0
    check-cast v1, Ll/֡ܽ;

    .line 236
    iput-object v1, p0, Ll/ۨܽ;->ᩳ:Ll/֡ܽ;

    if-eqz v1, :cond_2

    const-string p0, "backEvent"

    .line 0
    invoke-static {p1, p0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static final ܽ(Ll/ۨܽ;)V
    .locals 4

    .line 290
    iget-object v0, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    .line 15
    invoke-virtual {v0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v1

    .line 533
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    .line 534
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 454
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    .line 455
    move-object v3, v1

    check-cast v3, Ll/֡ܽ;

    .line 291
    invoke-virtual {v3}, Ll/֡ܽ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 290
    :goto_0
    check-cast v1, Ll/֡ܽ;

    .line 293
    iput-object v2, p0, Ll/ۨܽ;->ᩳ:Ll/֡ܽ;

    return-void
.end method

.method public static final synthetic ܿ(Ll/ۨܽ;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ll/ۨܽ;->ۧ()V

    return-void
.end method

.method public static final synthetic ᩳ(Ll/ۨܽ;)V
    .locals 1

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Ll/ۨܽ;->ᩳ:Ll/֡ܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ܽ;)Ll/ۙۧ;
    .locals 8

    const-string v0, "onBackPressedCallback"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    .line 187
    invoke-virtual {v0, p1}, Ll/ۨ۠᩵;->addLast(Ljava/lang/Object;)V

    .line 171
    new-instance v0, Ll/۫ܽ;

    invoke-direct {v0, p0, p1}, Ll/۫ܽ;-><init>(Ll/ۨܽ;Ll/֡ܽ;)V

    .line 172
    invoke-virtual {p1, v0}, Ll/֡ܽ;->֫(Ll/ۙۧ;)V

    .line 173
    invoke-direct {p0}, Ll/ۨܽ;->ۧ()V

    .line 174
    new-instance v7, Ll/ۛܽ;

    const-string v5, "updateEnabledCallbacks"

    const-string v6, "updateEnabledCallbacks()V"

    const/4 v2, 0x0

    .line 29
    const-class v4, Ll/ۨܽ;

    move-object v1, v7

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Ll/֫᩶᩵;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    invoke-virtual {p1, v7}, Ll/֡ܽ;->֫(Ll/֫᩹᩵;)V

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 15
    iget-object v0, p0, Ll/ۨܽ;->᩻:Ll/ۨ۠᩵;

    invoke-virtual {v0}, Ll/ۨ۠᩵;->ۧ()I

    move-result v1

    .line 533
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    .line 534
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 448
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    .line 449
    move-object v3, v1

    check-cast v3, Ll/֡ܽ;

    .line 272
    invoke-virtual {v3}, Ll/֡ܽ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 271
    :goto_0
    check-cast v1, Ll/֡ܽ;

    .line 274
    iput-object v2, p0, Ll/ۨܽ;->ᩳ:Ll/֡ܽ;

    if-eqz v1, :cond_2

    .line 276
    invoke-virtual {v1}, Ll/֡ܽ;->ۧ()V

    return-void

    .line 279
    :cond_2
    iget-object v0, p0, Ll/ۨܽ;->ۧ:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method

.method public final ֫(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 1

    const-string v0, "invoker"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    iput-object p1, p0, Ll/ۨܽ;->ܿ:Landroid/window/OnBackInvokedDispatcher;

    .line 87
    iget-boolean p1, p0, Ll/ۨܽ;->ܽ:Z

    invoke-direct {p0, p1}, Ll/ۨܽ;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/֡ܽ;)V
    .locals 7

    const-string v0, "owner"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    return-void

    .line 210
    :cond_0
    new-instance v0, Ll/۬ܽ;

    invoke-direct {v0, p0, p1, p2}, Ll/۬ܽ;-><init>(Ll/ۨܽ;Ll/۟ۢ֫;Ll/֡ܽ;)V

    .line 209
    invoke-virtual {p2, v0}, Ll/֡ܽ;->֫(Ll/ۙۧ;)V

    .line 212
    invoke-direct {p0}, Ll/ۨܽ;->ۧ()V

    .line 213
    new-instance p1, Ll/ۤܽ;

    const-string v5, "updateEnabledCallbacks"

    const-string v6, "updateEnabledCallbacks()V"

    const/4 v2, 0x0

    .line 29
    const-class v4, Ll/ۨܽ;

    move-object v1, p1

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Ll/֫᩶᩵;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    invoke-virtual {p2, p1}, Ll/֡ܽ;->֫(Ll/֫᩹᩵;)V

    return-void
.end method
