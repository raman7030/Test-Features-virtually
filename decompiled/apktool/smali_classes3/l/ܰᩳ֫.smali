.class public final Ll/ܰᩳ֫;
.super Ljava/lang/Object;
.source "UB2A"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/text/SpanWatcher;


# instance fields
.field public final ᩸:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 379
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 377
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/ܰᩳ֫;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 380
    iput-object p1, p0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 395
    iget-object v0, p0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/text/TextWatcher;

    invoke-interface {v0, p1}, Landroid/text/TextWatcher;->afterTextChanged(Landroid/text/Editable;)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 385
    iget-object v0, p0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/text/TextWatcher;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/TextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V

    return-void
.end method

.method public final onSpanAdded(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 1

    .line 404
    iget-object v0, p0, Ll/ܰᩳ֫;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    .line 457
    instance-of v0, p2, Ll/᩹ᩳ֫;

    if-eqz v0, :cond_0

    return-void

    .line 407
    :cond_0
    iget-object v0, p0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/text/SpanWatcher;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/SpanWatcher;->onSpanAdded(Landroid/text/Spannable;Ljava/lang/Object;II)V

    return-void
.end method

.method public final onSpanChanged(Landroid/text/Spannable;Ljava/lang/Object;IIII)V
    .locals 7

    .line 429
    iget-object v0, p0, Ll/ܰᩳ֫;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    .line 457
    instance-of v0, p2, Ll/᩹ᩳ֫;

    if-eqz v0, :cond_0

    return-void

    .line 433
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_2

    if-le p3, p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    if-le p5, p6, :cond_2

    const/4 p5, 0x0

    move v3, p3

    const/4 v5, 0x0

    goto :goto_0

    :cond_2
    move v3, p3

    move v5, p5

    .line 445
    :goto_0
    iget-object p3, p0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    move-object v0, p3

    check-cast v0, Landroid/text/SpanWatcher;

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move v6, p6

    invoke-interface/range {v0 .. v6}, Landroid/text/SpanWatcher;->onSpanChanged(Landroid/text/Spannable;Ljava/lang/Object;IIII)V

    return-void
.end method

.method public final onSpanRemoved(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 1

    .line 416
    iget-object v0, p0, Ll/ܰᩳ֫;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    .line 457
    instance-of v0, p2, Ll/᩹ᩳ֫;

    if-eqz v0, :cond_0

    return-void

    .line 419
    :cond_0
    iget-object v0, p0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/text/SpanWatcher;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/SpanWatcher;->onSpanRemoved(Landroid/text/Spannable;Ljava/lang/Object;II)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 390
    iget-object v0, p0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/text/TextWatcher;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 449
    iget-object v0, p0, Ll/ܰᩳ֫;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 453
    iget-object v0, p0, Ll/ܰᩳ֫;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void
.end method
