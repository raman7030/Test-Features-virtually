.class public final Ll/ᩳۙۘ;
.super Ljava/lang/Object;
.source "UB2A"

# interfaces
.implements Ljava/lang/Appendable;
.implements Ljava/lang/CharSequence;


# instance fields
.field public final ᩸:Ljava/lang/StringBuilder;

.field public final ᩹:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/util/ArrayDeque;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Ll/ᩳۙۘ;->᩹:Ljava/util/ArrayDeque;

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 71
    invoke-direct {p0, v0, v1}, Ll/ᩳۙۘ;->֫(ILjava/lang/CharSequence;)V

    return-void
.end method

.method private ֫(ILjava/lang/CharSequence;)V
    .locals 7

    .line 345
    instance-of v0, p2, Landroid/text/Spanned;

    if-eqz v0, :cond_2

    .line 347
    check-cast p2, Landroid/text/Spanned;

    .line 348
    instance-of v0, p2, Ll/ܽۙۘ;

    .line 350
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-interface {p2, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 352
    array-length v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-lez v2, :cond_2

    if-eqz v0, :cond_1

    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    .line 359
    aget-object v0, v1, v2

    .line 362
    invoke-interface {p2, v0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, p1

    .line 363
    invoke-interface {p2, v0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, p1

    .line 364
    invoke-interface {p2, v0}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v5

    .line 360
    invoke-virtual {p0, v0, v3, v4, v5}, Ll/ᩳۙۘ;->setSpan(Ljava/lang/Object;III)V

    goto :goto_1

    :cond_1
    :goto_2
    if-ge v3, v2, :cond_2

    .line 370
    aget-object v0, v1, v3

    .line 373
    invoke-interface {p2, v0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, p1

    .line 374
    invoke-interface {p2, v0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, p1

    .line 375
    invoke-interface {p2, v0}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v6

    .line 371
    invoke-virtual {p0, v0, v4, v5, v6}, Ll/ᩳۙۘ;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ᩳۙۘ;Ljava/lang/Object;II)V
    .locals 1

    if-eqz p1, :cond_0

    .line 153
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-le p3, p2, :cond_0

    if-ltz p2, :cond_0

    if-gt p3, v0, :cond_0

    .line 47
    invoke-static {p0, p1, p2, p3}, Ll/ᩳۙۘ;->ۧ(Ll/ᩳۙۘ;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/ᩳۙۘ;Ljava/lang/Object;II)V
    .locals 3

    if-eqz p1, :cond_1

    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    check-cast p1, [Ljava/lang/Object;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 430
    invoke-static {p0, v2, p2, p3}, Ll/ᩳۙۘ;->ۧ(Ll/ᩳۙۘ;Ljava/lang/Object;II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x21

    .line 433
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ᩳۙۘ;->setSpan(Ljava/lang/Object;III)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final append(C)Ljava/lang/Appendable;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 30
    invoke-virtual {p0, p1}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 111
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 153
    iget-object p2, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p3

    .line 112
    invoke-direct {p0, p3, p1}, Ll/ᩳۙۘ;->֫(ILjava/lang/CharSequence;)V

    .line 114
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(C)V
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final append(Ljava/lang/CharSequence;)V
    .locals 2

    .line 153
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 97
    invoke-direct {p0, v1, p1}, Ll/ᩳۙۘ;->֫(ILjava/lang/CharSequence;)V

    .line 99
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final charAt(I)C
    .locals 1

    .line 158
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    return v0
.end method

.method public final setSpan(Ljava/lang/Object;III)V
    .locals 1

    .line 147
    new-instance v0, Ll/ۧۙۘ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ۧۙۘ;-><init>(Ljava/lang/Object;III)V

    iget-object p1, p0, Ll/ᩳۙۘ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 7

    .line 170
    invoke-virtual {p0, p1, p2}, Ll/ᩳۙۘ;->֫(II)Ljava/util/List;

    move-result-object v0

    .line 171
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    .line 172
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 176
    :cond_0
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-direct {v1, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 178
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p2

    .line 183
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧۙۘ;

    .line 192
    iget v3, v2, Ll/ۧۙۘ;->ܽ:I

    sub-int/2addr v3, p1

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 193
    iget v4, v2, Ll/ۧۙۘ;->֫:I

    iget v5, v2, Ll/ۧۙۘ;->ܽ:I

    sub-int/2addr v4, v5

    add-int/2addr v4, v3

    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 195
    iget-object v5, v2, Ll/ۧۙۘ;->ᩳ:Ljava/lang/Object;

    .line 402
    iget v2, v2, Ll/ۧۙۘ;->ۧ:I

    instance-of v6, v5, Ll/ۡۗۘ;

    if-eqz v6, :cond_1

    const/high16 v6, 0xff0000

    or-int/2addr v2, v6

    .line 195
    :cond_1
    invoke-virtual {v1, v5, v3, v4, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 293
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()C
    .locals 2

    .line 153
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    return v0
.end method

.method public final ֫(II)Ljava/util/List;
    .locals 5

    .line 153
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-le p2, p1, :cond_6

    if-ltz p1, :cond_6

    if-gt p2, v0, :cond_6

    .line 230
    iget-object v1, p0, Ll/ᩳۙۘ;->᩹:Ljava/util/ArrayDeque;

    if-nez p1, :cond_0

    if-ne v0, p2, :cond_0

    .line 233
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 234
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 235
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 238
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->descendingIterator()Ljava/util/Iterator;

    move-result-object v1

    .line 243
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 244
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧۙۘ;

    .line 248
    iget v3, v2, Ll/ۧۙۘ;->ܽ:I

    if-lt v3, p1, :cond_2

    if-lt v3, p2, :cond_4

    :cond_2
    iget v4, v2, Ll/ۧۙۘ;->֫:I

    if-gt v4, p2, :cond_3

    if-gt v4, p1, :cond_4

    :cond_3
    if-ge v3, p1, :cond_1

    if-le v4, p2, :cond_1

    .line 252
    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 256
    :cond_5
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 226
    :cond_6
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ۧ()Landroid/text/SpannableStringBuilder;
    .locals 7

    .line 321
    new-instance v0, Ll/ܽۙۘ;

    iget-object v1, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    .line 414
    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v1, p0, Ll/ᩳۙۘ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧۙۘ;

    .line 326
    iget-object v3, v2, Ll/ۧۙۘ;->ᩳ:Ljava/lang/Object;

    iget v4, v2, Ll/ۧۙۘ;->ܽ:I

    iget v5, v2, Ll/ۧۙۘ;->֫:I

    .line 402
    iget v2, v2, Ll/ۧۙۘ;->ۧ:I

    instance-of v6, v3, Ll/ۡۗۘ;

    if-eqz v6, :cond_0

    const/high16 v6, 0xff0000

    or-int/2addr v2, v6

    .line 326
    :cond_0
    invoke-virtual {v0, v3, v4, v5, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ۧ(I)Ljava/lang/CharSequence;
    .locals 8

    .line 153
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 272
    new-instance v2, Ll/ܽۙۘ;

    invoke-virtual {v0, p1, v1}, Ljava/lang/StringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    .line 414
    invoke-direct {v2, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 274
    iget-object v3, p0, Ll/ᩳۙۘ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 278
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧۙۘ;

    if-eqz v4, :cond_1

    .line 279
    iget v5, v4, Ll/ۧۙۘ;->ܽ:I

    if-lt v5, p1, :cond_0

    iget v6, v4, Ll/ۧۙۘ;->֫:I

    if-gt v6, v1, :cond_0

    .line 280
    iget-object v4, v4, Ll/ۧۙۘ;->ᩳ:Ljava/lang/Object;

    sub-int/2addr v5, p1

    sub-int/2addr v6, p1

    const/16 v7, 0x21

    invoke-virtual {v2, v4, v5, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 281
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    const-string v3, ""

    .line 285
    invoke-virtual {v0, p1, v1, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    return-object v2
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ᩳۙۘ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
