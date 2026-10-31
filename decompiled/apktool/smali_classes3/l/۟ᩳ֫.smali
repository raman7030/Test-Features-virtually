.class public final Ll/۟ᩳ֫;
.super Landroid/text/SpannableStringBuilder;
.source "UB2A"


# instance fields
.field public final ᩸:Ljava/lang/Class;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/CharSequence;)V
    .locals 0

    .line 75
    invoke-direct {p0, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 59
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    const-string p2, "watcherClass cannot be null"

    .line 76
    invoke-static {p1, p2}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iput-object p1, p0, Ll/۟ᩳ֫;->᩸:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ll/۟ᩳ֫;II)V
    .locals 0

    .line 86
    invoke-direct {p0, p2, p3, p4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;II)V

    .line 59
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    const-string p2, "watcherClass cannot be null"

    .line 87
    invoke-static {p1, p2}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iput-object p1, p0, Ll/۟ᩳ֫;->᩸:Ljava/lang/Class;

    return-void
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/CharSequence;)Ll/۟ᩳ֫;
    .locals 1

    .line 97
    new-instance v0, Ll/۟ᩳ֫;

    invoke-direct {v0, p0, p1}, Ll/۟ᩳ֫;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private ֫(Ljava/lang/Object;)Ll/ܰᩳ֫;
    .locals 3

    const/4 v0, 0x0

    .line 247
    :goto_0
    iget-object v1, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 248
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰᩳ֫;

    .line 249
    iget-object v2, v1, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۧ(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 119
    iget-object v0, p0, Ll/۟ᩳ֫;->᩸:Ljava/lang/Class;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ܿ()V
    .locals 3

    const/4 v0, 0x0

    .line 286
    :goto_0
    iget-object v1, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 287
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰᩳ֫;

    invoke-virtual {v1}, Ll/ܰᩳ֫;->ۧ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩳ()V
    .locals 3

    const/4 v0, 0x0

    .line 277
    :goto_0
    iget-object v1, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 278
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰᩳ֫;

    invoke-virtual {v1}, Ll/ܰᩳ֫;->֫()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final append(C)Landroid/text/Editable;
    .locals 0

    .line 351
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 344
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 360
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(C)Landroid/text/SpannableStringBuilder;
    .locals 0

    .line 351
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 344
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 360
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;Ljava/lang/Object;I)Landroid/text/SpannableStringBuilder;
    .locals 0

    .line 367
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;Ljava/lang/Object;I)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 0

    .line 351
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 344
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 360
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final delete(II)Landroid/text/Editable;
    .locals 0

    .line 337
    invoke-super {p0, p1, p2}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final delete(II)Landroid/text/SpannableStringBuilder;
    .locals 0

    .line 337
    invoke-super {p0, p1, p2}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final getSpanEnd(Ljava/lang/Object;)I
    .locals 1

    .line 205
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->֫(Ljava/lang/Object;)Ll/ܰᩳ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 211
    :cond_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanFlags(Ljava/lang/Object;)I
    .locals 1

    .line 219
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->֫(Ljava/lang/Object;)Ll/ܰᩳ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 225
    :cond_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->getSpanFlags(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanStart(Ljava/lang/Object;)I
    .locals 1

    .line 191
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->֫(Ljava/lang/Object;)Ll/ܰᩳ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 197
    :cond_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpans(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/۟ᩳ֫;->᩸:Ljava/lang/Class;

    if-ne v0, p3, :cond_1

    .line 152
    const-class v0, Ll/ܰᩳ֫;

    invoke-super {p0, p1, p2, v0}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ܰᩳ֫;

    .line 154
    array-length p2, p1

    invoke-static {p3, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    .line 155
    :goto_0
    array-length v0, p1

    if-ge p3, v0, :cond_0

    .line 156
    aget-object v0, p1, p3

    iget-object v0, v0, Ll/ܰᩳ֫;->᩹:Ljava/lang/Object;

    aput-object v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-object p2

    .line 160
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insert(ILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0

    .line 323
    invoke-super {p0, p1, p2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final insert(ILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0

    .line 330
    invoke-super {p0, p1, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 0

    .line 323
    invoke-super {p0, p1, p2}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final insert(ILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 0

    .line 330
    invoke-super {p0, p1, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final nextSpanTransition(IILjava/lang/Class;)I
    .locals 1

    if-eqz p3, :cond_0

    .line 119
    iget-object v0, p0, Ll/۟ᩳ֫;->᩸:Ljava/lang/Class;

    if-ne v0, p3, :cond_1

    .line 234
    :cond_0
    const-class p3, Ll/ܰᩳ֫;

    .line 236
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->nextSpanTransition(IILjava/lang/Class;)I

    move-result p1

    return p1
.end method

.method public final removeSpan(Ljava/lang/Object;)V
    .locals 1

    .line 170
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->֫(Ljava/lang/Object;)Ll/ܰᩳ֫;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 179
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    .line 182
    iget-object p1, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final bridge synthetic replace(IILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0

    .line 49
    invoke-virtual {p0, p1, p2, p3}, Ll/۟ᩳ֫;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final bridge synthetic replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0

    .line 49
    invoke-virtual/range {p0 .. p5}, Ll/۟ᩳ֫;->replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public final replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 0

    .line 304
    invoke-direct {p0}, Ll/۟ᩳ֫;->ᩳ()V

    .line 305
    invoke-super {p0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 306
    invoke-direct {p0}, Ll/۟ᩳ֫;->ܿ()V

    return-object p0
.end method

.method public final replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 0

    .line 314
    invoke-direct {p0}, Ll/۟ᩳ֫;->ᩳ()V

    .line 315
    invoke-super/range {p0 .. p5}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;

    .line 316
    invoke-direct {p0}, Ll/۟ᩳ֫;->ܿ()V

    return-object p0
.end method

.method public final setSpan(Ljava/lang/Object;III)V
    .locals 1

    .line 135
    invoke-direct {p0, p1}, Ll/۟ᩳ֫;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    new-instance v0, Ll/ܰᩳ֫;

    invoke-direct {v0, p1}, Ll/ܰᩳ֫;-><init>(Ljava/lang/Object;)V

    .line 137
    iget-object p1, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p1, v0

    .line 140
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    .line 125
    new-instance v0, Ll/۟ᩳ֫;

    iget-object v1, p0, Ll/۟ᩳ֫;->᩸:Ljava/lang/Class;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/۟ᩳ֫;-><init>(Ljava/lang/Class;Ll/۟ᩳ֫;II)V

    return-object v0
.end method

.method public final ֫()V
    .locals 0

    .line 261
    invoke-direct {p0}, Ll/۟ᩳ֫;->ᩳ()V

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 269
    invoke-direct {p0}, Ll/۟ᩳ֫;->ܿ()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 296
    :goto_0
    iget-object v2, p0, Ll/۟ᩳ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 297
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰᩳ֫;

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v2, p0, v0, v3, v4}, Ll/ܰᩳ֫;->onTextChanged(Ljava/lang/CharSequence;III)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
