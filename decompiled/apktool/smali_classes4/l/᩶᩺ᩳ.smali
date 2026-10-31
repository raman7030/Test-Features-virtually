.class public final Ll/᩶᩺ᩳ;
.super Ljava/lang/Object;
.source "S5XV"

# interfaces
.implements Landroid/text/Editable;


# instance fields
.field public final ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩶:Ljava/lang/ref/WeakReference;

.field public final ᩸:Ll/۟᩺ᩳ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;I)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩶᩺ᩳ;->᩶:Ljava/lang/ref/WeakReference;

    .line 24
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    .line 25
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۢۧ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    iput p2, p0, Ll/᩶᩺ᩳ;->᩹:I

    return-void
.end method

.method private ֫()Z
    .locals 2

    .line 276
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩶:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨᩳ;

    if-eqz v0, :cond_0

    .line 277
    iget v1, p0, Ll/᩶᩺ᩳ;->᩹:I

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final append(C)Landroid/text/Editable;
    .locals 2

    .line 158
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 161
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 163
    :try_start_0
    iget-object v1, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v1, p1}, Landroid/text/Editable;->append(C)Landroid/text/Editable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 167
    throw p1
.end method

.method public final append(Ljava/lang/CharSequence;)Landroid/text/Editable;
    .locals 2

    .line 123
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 126
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 128
    :try_start_0
    invoke-static {p1}, Ll/᩺֫ܿ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    .line 129
    iget-object v1, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v1, p1}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 133
    throw p1
.end method

.method public final append(Ljava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 3

    .line 139
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 142
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/16 v1, 0xd

    .line 268
    :try_start_0
    invoke-static {p1, v1, p2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-ge v1, p3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 144
    :goto_0
    iget-object v2, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    if-eqz v1, :cond_2

    .line 145
    :try_start_1
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ll/᩺֫ܿ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {v2, p1}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    .line 148
    :cond_2
    :try_start_2
    invoke-interface {v2, p1, p2, p3}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;II)Landroid/text/Editable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 152
    throw p1
.end method

.method public final bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ll/᩶᩺ᩳ;->append(C)Landroid/text/Editable;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ll/᩶᩺ᩳ;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2, p3}, Ll/᩶᩺ᩳ;->append(Ljava/lang/CharSequence;II)Landroid/text/Editable;

    return-object p0
.end method

.method public final charAt(I)C
    .locals 1

    .line 258
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 172
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 175
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 177
    :try_start_0
    iget-object v1, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v1}, Landroid/text/Editable;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 180
    throw v1
.end method

.method public final clearSpans()V
    .locals 1

    .line 185
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 188
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Landroid/text/Editable;->clearSpans()V

    return-void
.end method

.method public final delete(II)Landroid/text/Editable;
    .locals 2

    .line 108
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 111
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 113
    :try_start_0
    iget-object v1, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v1, p1, p2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 117
    throw p1
.end method

.method public final getChars(II[CI)V
    .locals 1

    .line 206
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/GetChars;->getChars(II[CI)V

    return-void
.end method

.method public final getFilters()[Landroid/text/InputFilter;
    .locals 1

    .line 201
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Landroid/text/Editable;->getFilters()[Landroid/text/InputFilter;

    move-result-object v0

    return-object v0
.end method

.method public final getSpanEnd(Ljava/lang/Object;)I
    .locals 1

    .line 238
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanFlags(Ljava/lang/Object;)I
    .locals 1

    .line 243
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanStart(Ljava/lang/Object;)I
    .locals 1

    .line 233
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpans(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 1

    .line 228
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insert(ILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 2

    .line 93
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 96
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 98
    :try_start_0
    invoke-static {p2}, Ll/᩺֫ܿ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    .line 99
    iget-object v1, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v1, p1, p2}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 103
    throw p1
.end method

.method public final insert(ILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 3

    .line 75
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 78
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/16 v1, 0xd

    .line 268
    :try_start_0
    invoke-static {p2, v1, p3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-ge v1, p4, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 80
    :goto_0
    iget-object v2, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    if-eqz v1, :cond_2

    .line 81
    :try_start_1
    invoke-interface {p2, p3, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p2}, Ll/᩺֫ܿ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {v2, p1, p2}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    .line 84
    :cond_2
    :try_start_2
    invoke-interface {v2, p1, p2, p3, p4}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;II)Landroid/text/Editable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 88
    throw p1
.end method

.method public final length()I
    .locals 1

    .line 253
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public final nextSpanTransition(IILjava/lang/Class;)I
    .locals 1

    .line 248
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result p1

    return p1
.end method

.method public final removeSpan(Ljava/lang/Object;)V
    .locals 2

    .line 281
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩶:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨᩳ;

    if-eqz v0, :cond_0

    .line 282
    iget v1, p0, Ll/᩶᩺ᩳ;->᩹:I

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final replace(IILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 3

    .line 49
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 52
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    if-nez p3, :cond_1

    :try_start_0
    const-string p3, ""

    .line 58
    :cond_1
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const/4 v1, 0x0

    invoke-interface {p3, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_2

    .line 59
    iget-object v1, p0, Ll/᩶᩺ᩳ;->᩶:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ۨᩳ;

    if-eqz v1, :cond_2

    .line 61
    invoke-virtual {v1, p1, p2}, Ll/۫ۨᩳ;->ᩳ(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    .line 65
    :cond_2
    :try_start_1
    invoke-static {p3}, Ll/᩺֫ܿ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p3

    .line 66
    iget-object v1, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v1, p1, p2, p3}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 70
    throw p1
.end method

.method public final replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 8

    .line 31
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 34
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/16 v1, 0xd

    .line 268
    :try_start_0
    invoke-static {p3, v1, p4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-ge v1, p5, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 36
    :goto_0
    iget-object v2, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    if-eqz v1, :cond_2

    .line 37
    :try_start_1
    invoke-interface {p3, p4, p5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-static {p3}, Ll/᩺֫ܿ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-interface {v2, p1, p2, p3}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :cond_2
    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    .line 40
    :try_start_2
    invoke-interface/range {v2 .. v7}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 44
    throw p1
.end method

.method public final setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 193
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 196
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public final setSpan(Ljava/lang/Object;III)V
    .locals 1

    .line 211
    invoke-direct {p0}, Ll/᩶᩺ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 214
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 264
    iget-object v0, p0, Ll/᩶᩺ᩳ;->᩸:Ll/۟᩺ᩳ;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
