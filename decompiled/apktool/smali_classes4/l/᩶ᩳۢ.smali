.class public final Ll/᩶ᩳۢ;
.super Ljava/lang/Object;
.source "D4IW"


# static fields
.field public static final ᩳ:Ll/ۨۘܽ;


# instance fields
.field public ֫:Ll/۫ۨᩳ;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ljava/lang/CharSequence;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\n *\\.(end +)?([afm][a-z]+)"

    .line 24
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/᩶ᩳۢ;->ᩳ:Ll/ۨۘܽ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 7

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    .line 36
    sget-object v0, Ll/᩶ᩳۢ;->ᩳ:Ll/ۨۘܽ;

    invoke-virtual {v0, p1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    .line 37
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 38
    :goto_0
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v1, :cond_6

    .line 39
    invoke-virtual {p1, v4}, Ll/۫ۘܽ;->start(I)I

    move-result v1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 40
    :goto_1
    invoke-virtual {p1, v5}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v3, "field"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    const/4 v3, 0x2

    goto :goto_3

    :sswitch_1
    const-string v3, "method"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x1

    goto :goto_3

    :sswitch_2
    const-string v6, "annotation"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :goto_2
    const/4 v3, -0x1

    :cond_3
    :goto_3
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 45
    :pswitch_0
    new-instance v3, Ll/᩹ᩳۢ;

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    const/4 v2, 0x2

    :goto_4
    invoke-virtual {p1, v5}, Ll/۫ۘܽ;->start(I)I

    move-result v1

    invoke-direct {v3, v2, v1}, Ll/᩹ᩳۢ;-><init>(II)V

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    .line 48
    :pswitch_1
    new-instance v2, Ll/᩹ᩳۢ;

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    goto :goto_5

    :cond_5
    const/4 v1, 0x4

    :goto_5
    invoke-virtual {p1, v5}, Ll/۫ۘܽ;->start(I)I

    move-result v3

    invoke-direct {v2, v1, v3}, Ll/᩹ᩳۢ;-><init>(II)V

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    .line 42
    :pswitch_2
    new-instance v2, Ll/᩹ᩳۢ;

    invoke-virtual {p1, v5}, Ll/۫ۘܽ;->start(I)I

    move-result v3

    invoke-direct {v2, v1, v3}, Ll/᩹ᩳۢ;-><init>(II)V

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    .line 52
    :cond_6
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 54
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ᩳۢ;

    .line 55
    iget v4, v3, Ll/᩹ᩳۢ;->ۧ:I

    if-eq v4, v5, :cond_8

    if-eq v4, v2, :cond_7

    .line 69
    invoke-virtual {p1, v3}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_6

    .line 65
    :cond_7
    invoke-virtual {p1, v3}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_6

    :cond_8
    if-eqz v1, :cond_9

    const/4 v1, 0x0

    goto :goto_7

    .line 60
    :cond_9
    new-instance v4, Ll/᩹ᩳۢ;

    iget v6, v3, Ll/᩹ᩳۢ;->֫:I

    invoke-direct {v4, v2, v6}, Ll/᩹ᩳۢ;-><init>(II)V

    invoke-virtual {p1, v4}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 62
    :goto_7
    invoke-virtual {p1, v3}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_6

    .line 73
    :cond_a
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5cb014d1 -> :sswitch_2
        -0x403a2f1f -> :sswitch_1
        0x5cea0fa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;
    .locals 1

    .line 31
    new-instance v0, Ll/᩶ᩳۢ;

    invoke-direct {v0, p0}, Ll/᩶ᩳۢ;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private ֫(I)V
    .locals 2

    .line 228
    iget-object v0, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 229
    iget-object v0, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 230
    iget-object v0, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩺ܽ()V

    .line 231
    iget-object v0, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->ۧ(IZ)V

    return-void
.end method

.method private ֫(III)V
    .locals 4

    .line 242
    new-instance v0, Ll/ۤᩳۢ;

    iget-object v1, p0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-direct {v0, p2, p3, v1}, Ll/ۤᩳۢ;-><init>(IILjava/lang/CharSequence;)V

    const/16 p2, 0x3d

    .line 246
    invoke-virtual {v0, p2}, Ll/ۤᩳۢ;->֫(C)Z

    move-result p3

    if-eqz p3, :cond_0

    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_5

    :cond_0
    :goto_0
    add-int/lit8 p3, p1, -0x1

    if-ltz p1, :cond_5

    .line 249
    :cond_1
    invoke-virtual {v0}, Ll/ۤᩳۢ;->ܿ()Z

    move-result p1

    if-nez p1, :cond_4

    .line 250
    invoke-virtual {v0}, Ll/ۤᩳۢ;->ܳ()C

    move-result p1

    if-ne p1, p2, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x22

    const/4 v3, 0x0

    if-ne p1, v2, :cond_3

    .line 255
    invoke-virtual {v0}, Ll/ۤᩳۢ;->ۢ()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_3
    const/16 v2, 0x27

    if-ne p1, v2, :cond_1

    .line 260
    invoke-virtual {v0}, Ll/ۤᩳۢ;->᩷()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_4
    :goto_1
    move p1, p3

    goto :goto_0

    :cond_5
    const/4 v3, 0x1

    .line 269
    :goto_2
    invoke-virtual {v0}, Ll/ۤᩳۢ;->ۜ()V

    if-eqz v3, :cond_6

    .line 271
    invoke-virtual {v0}, Ll/ۤᩳۢ;->ۧ()I

    move-result p1

    invoke-virtual {v0}, Ll/ۤᩳۢ;->ۧ()I

    move-result p2

    .line 278
    new-instance p3, Ll/ۤᩳۢ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-direct {p3, p2, v0, v1}, Ll/ۤᩳۢ;-><init>(IILjava/lang/CharSequence;)V

    invoke-virtual {p3}, Ll/ۤᩳۢ;->֫()I

    move-result p2

    .line 271
    invoke-direct {p0, p1, p2}, Ll/᩶ᩳۢ;->ۧ(II)V

    return-void

    .line 273
    :cond_6
    invoke-virtual {v0}, Ll/ۤᩳۢ;->ۧ()I

    move-result p1

    invoke-direct {p0, p1}, Ll/᩶ᩳۢ;->֫(I)V

    return-void
.end method

.method private ۧ(II)V
    .locals 1

    .line 235
    iget-object v0, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, p2}, Ll/۫ۨᩳ;->᩷(II)V

    .line 236
    iget-object p2, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 237
    iget-object p2, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->᩺ܽ()V

    .line 238
    iget-object p2, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Ll/۫ۨᩳ;->ۧ(IZ)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩸ᩳۢ;
    .locals 5

    .line 415
    sget-object v0, Ll/ۚᩳۢ;->ᩳ:Ll/ۨۘܽ;

    iget-object v1, p0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 416
    iget-object v1, p0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ᩳۢ;

    .line 417
    iget v3, v2, Ll/᩹ᩳۢ;->ۧ:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    .line 418
    iget v2, v2, Ll/᩹ᩳۢ;->֫:I

    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "name"

    .line 419
    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "type"

    .line 420
    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 421
    new-instance p1, Ll/᩸ᩳۢ;

    invoke-direct {p1, v0}, Ll/᩸ᩳۢ;-><init>(Ll/۫ۘܽ;)V

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ᩳۢ;
    .locals 5

    .line 284
    sget-object v0, Ll/ۚᩳۢ;->᩻:Ll/ۨۘܽ;

    iget-object v1, p0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 285
    iget-object v1, p0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ᩳۢ;

    .line 286
    iget v3, v2, Ll/᩹ᩳۢ;->ۧ:I

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    .line 287
    iget v2, v2, Ll/᩹ᩳۢ;->֫:I

    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "name"

    .line 288
    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "parameters"

    .line 289
    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "type"

    .line 290
    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 291
    new-instance p1, Ll/᩸ᩳۢ;

    invoke-direct {p1, v0}, Ll/᩸ᩳۢ;-><init>(Ll/۫ۘܽ;)V

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(II)V
    .locals 8

    .line 196
    iget-object v0, p0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ᩳۢ;

    .line 197
    iget v6, v5, Ll/᩹ᩳۢ;->ۧ:I

    iget v5, v5, Ll/᩹ᩳۢ;->֫:I

    const/4 v7, 0x1

    if-eqz v6, :cond_4

    if-eq v6, v7, :cond_2

    const/4 v5, 0x2

    if-eq v6, v5, :cond_1

    const/4 v5, 0x3

    if-eq v6, v5, :cond_3

    const/4 v5, 0x4

    if-eq v6, v5, :cond_1

    const/4 v5, 0x5

    if-eq v6, v5, :cond_3

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    if-ne v2, v7, :cond_3

    .line 209
    invoke-direct {p0, p2, v1, v5}, Ll/᩶ᩳۢ;->֫(III)V

    return-void

    :cond_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    if-nez v3, :cond_0

    if-ne v2, v7, :cond_0

    add-int/lit8 v4, v4, 0x1

    if-ne v4, p1, :cond_5

    const/4 v3, 0x1

    :cond_5
    move v1, v5

    goto :goto_0

    .line 224
    :cond_6
    invoke-direct {p0, v1}, Ll/᩶ᩳۢ;->֫(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;IILjava/lang/String;)V
    .locals 11

    .line 90
    sget-object v0, Ll/ۚᩳۢ;->ᩳ:Ll/ۨۘܽ;

    iget-object v1, p0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 91
    iget-object v1, p0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩹ᩳۢ;

    .line 92
    iget v8, v7, Ll/᩹ᩳۢ;->ۧ:I

    iget v7, v7, Ll/᩹ᩳۢ;->֫:I

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v8, :cond_6

    if-eq v8, v10, :cond_4

    if-eq v8, v9, :cond_3

    const/4 v7, 0x3

    if-eq v8, v7, :cond_2

    const/4 v7, 0x4

    if-eq v8, v7, :cond_1

    const/4 v7, 0x5

    if-eq v8, v7, :cond_5

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 95
    invoke-virtual {v0, v7}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "name"

    .line 96
    invoke-virtual {v0, v7}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "type"

    invoke-virtual {v0, v7}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 97
    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v3

    const/4 v5, 0x1

    goto :goto_0

    :cond_4
    if-eqz v5, :cond_5

    if-eqz v6, :cond_5

    if-ne v4, v9, :cond_5

    .line 118
    invoke-direct {p0, p3, v3, v7}, Ll/᩶ᩳۢ;->֫(III)V

    return-void

    :cond_5
    :goto_1
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_6
    add-int/lit8 v4, v4, 0x1

    if-eqz v5, :cond_0

    if-nez v6, :cond_0

    if-ne v4, v9, :cond_0

    add-int/lit8 v2, v2, 0x1

    if-ne v2, p2, :cond_7

    const/4 v6, 0x1

    :cond_7
    move v3, v7

    goto :goto_0

    .line 131
    :cond_8
    invoke-direct {p0, v3}, Ll/᩶ᩳۢ;->֫(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    .locals 14

    move-object v0, p0

    .line 143
    sget-object v1, Ll/ۚᩳۢ;->᩻:Ll/ۨۘܽ;

    iget-object v2, v0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v1

    .line 144
    iget-object v2, v0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹ᩳۢ;

    .line 145
    iget v9, v8, Ll/᩹ᩳۢ;->ۧ:I

    iget v8, v8, Ll/᩹ᩳۢ;->֫:I

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v9, :cond_b

    if-eq v9, v11, :cond_9

    if-eq v9, v10, :cond_8

    const/4 v10, 0x3

    if-eq v9, v10, :cond_7

    const/4 v10, 0x4

    if-eq v9, v10, :cond_3

    const/4 v8, 0x5

    if-eq v9, v8, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    const/4 v6, 0x0

    :cond_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 148
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v8

    if-eqz v8, :cond_4

    const-string v8, "name"

    .line 149
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v9, p1

    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const-string v8, "parameters"

    .line 150
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v11, p3

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const-string v8, "type"

    .line 151
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v12, p4

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 152
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v4

    const/4 v6, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    move-object v9, p1

    :cond_5
    move-object/from16 v11, p3

    :cond_6
    move-object/from16 v12, p4

    goto :goto_0

    :cond_7
    move-object v9, p1

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_8
    move-object v9, p1

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_9
    move-object v9, p1

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    if-eqz v6, :cond_a

    if-eqz v7, :cond_a

    if-ne v5, v10, :cond_a

    move/from16 v13, p5

    .line 173
    invoke-direct {p0, v13, v4, v8}, Ll/᩶ᩳۢ;->֫(III)V

    return-void

    :cond_a
    move/from16 v13, p5

    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_b
    move-object v9, p1

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move/from16 v13, p5

    add-int/lit8 v5, v5, 0x1

    if-eqz v6, :cond_d

    if-nez v7, :cond_d

    if-ne v5, v10, :cond_d

    add-int/lit8 v3, v3, 0x1

    move/from16 v10, p2

    if-ne v3, v10, :cond_c

    const/4 v7, 0x1

    :cond_c
    move v4, v8

    goto/16 :goto_0

    :cond_d
    :goto_2
    move/from16 v10, p2

    goto/16 :goto_0

    .line 186
    :cond_e
    invoke-direct {p0, v4}, Ll/᩶ᩳۢ;->֫(I)V

    return-void
.end method

.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 0

    .line 77
    iput-object p1, p0, Ll/᩶ᩳۢ;->֫:Ll/۫ۨᩳ;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    .locals 15

    move-object v0, p0

    .line 380
    sget-object v1, Ll/ۚᩳۢ;->᩻:Ll/ۨۘܽ;

    iget-object v2, v0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v1

    .line 381
    iget-object v3, v0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹ᩳۢ;

    .line 382
    iget v10, v8, Ll/᩹ᩳۢ;->ۧ:I

    iget v8, v8, Ll/᩹ᩳۢ;->֫:I

    const/4 v11, 0x4

    if-ne v10, v11, :cond_4

    .line 383
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "name"

    .line 384
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v11, p1

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v8, "parameters"

    .line 385
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v12, p3

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string v8, "type"

    .line 386
    invoke-virtual {v1, v8}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v13, p4

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 388
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v6

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    move-object/from16 v11, p1

    :cond_2
    move-object/from16 v12, p3

    :cond_3
    move-object/from16 v13, p4

    goto :goto_0

    :cond_4
    move-object/from16 v11, p1

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    if-eqz v7, :cond_0

    const/4 v14, 0x5

    if-ne v10, v14, :cond_8

    :goto_1
    add-int/lit8 v1, v6, 0x1

    .line 393
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v1, v3, :cond_7

    .line 394
    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v7, 0xa

    const/16 v8, 0xd

    if-eq v3, v8, :cond_5

    if-ne v3, v7, :cond_6

    :cond_5
    add-int/lit8 v6, v6, 0x2

    .line 396
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v6, v3, :cond_6

    .line 397
    invoke-interface {v2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v3, v8, :cond_a

    if-ne v3, v7, :cond_6

    goto :goto_2

    :cond_6
    move v6, v1

    goto :goto_1

    :cond_7
    move v6, v1

    goto :goto_2

    :cond_8
    if-eqz v10, :cond_9

    if-ne v10, v9, :cond_0

    :cond_9
    move v6, v8

    goto/16 :goto_0

    :cond_a
    :goto_2
    if-ne v6, v5, :cond_b

    return-void

    .line 326
    :cond_b
    new-instance v1, Ll/ۤᩳۢ;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-direct {v1, v6, v3, v2}, Ll/ۤᩳۢ;-><init>(IILjava/lang/CharSequence;)V

    move/from16 v3, p2

    .line 328
    :cond_c
    :goto_3
    invoke-virtual {v1}, Ll/ۤᩳۢ;->ܿ()Z

    move-result v5

    if-nez v5, :cond_12

    .line 329
    invoke-virtual {v1}, Ll/ۤᩳۢ;->᩻()Ljava/lang/String;

    move-result-object v5

    .line 330
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_c

    const-string v6, ":"

    .line 331
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_c

    const-string v6, "#"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_c

    const-string v6, "nop"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_3

    .line 335
    :cond_d
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x61

    if-gt v7, v6, :cond_f

    const/16 v7, 0x7a

    if-gt v6, v7, :cond_f

    add-int/lit8 v5, v3, -0x1

    if-gtz v3, :cond_e

    goto :goto_5

    :cond_e
    move v3, v5

    goto :goto_3

    :cond_f
    const/16 v7, 0x2e

    if-ne v6, v7, :cond_c

    const-string v6, ".array-data"

    .line 341
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_4

    :cond_10
    const-string v6, ".packed-switch"

    .line 343
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_4

    :cond_11
    const-string v6, ".sparse-switch"

    .line 345
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    :goto_4
    add-int/lit8 v5, v3, -0x1

    if-nez v3, :cond_e

    :cond_12
    :goto_5
    move/from16 v3, p5

    .line 356
    :cond_13
    :goto_6
    invoke-virtual {v1}, Ll/ۤᩳۢ;->ܿ()Z

    move-result v4

    if-nez v4, :cond_14

    if-ltz v3, :cond_14

    .line 357
    invoke-virtual {v1}, Ll/ۤᩳۢ;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_13

    add-int/lit8 v3, v3, -0x1

    goto :goto_6

    .line 361
    :cond_14
    invoke-virtual {v1}, Ll/ۤᩳۢ;->ᩳ()I

    move-result v3

    .line 362
    invoke-virtual {v1}, Ll/ۤᩳۢ;->ܽ()I

    move-result v1

    .line 364
    new-instance v4, Ll/ۤᩳۢ;

    invoke-direct {v4, v3, v1, v2}, Ll/ۤᩳۢ;-><init>(IILjava/lang/CharSequence;)V

    const/16 v2, 0x22

    .line 365
    invoke-virtual {v4, v2}, Ll/ۤᩳۢ;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 366
    invoke-virtual {v4}, Ll/ۤᩳۢ;->ۧ()I

    move-result v2

    .line 367
    invoke-virtual {v4}, Ll/ۤᩳۢ;->ۢ()Z

    move-result v5

    if-eqz v5, :cond_15

    .line 368
    invoke-virtual {v4}, Ll/ۤᩳۢ;->ۧ()I

    move-result v1

    sub-int/2addr v1, v9

    invoke-direct {p0, v2, v1}, Ll/᩶ᩳۢ;->ۧ(II)V

    return-void

    .line 373
    :cond_15
    invoke-direct {p0, v3, v1}, Ll/᩶ᩳۢ;->ۧ(II)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[I
    .locals 8

    .line 300
    sget-object v0, Ll/ۚᩳۢ;->᩻:Ll/ۨۘܽ;

    iget-object v1, p0, Ll/᩶ᩳۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 303
    iget-object v2, p0, Ll/᩶ᩳۢ;->ۧ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ᩳۢ;

    if-eqz v3, :cond_1

    .line 305
    iget v6, v5, Ll/᩹ᩳۢ;->ۧ:I

    const/4 v7, 0x4

    if-ne v6, v7, :cond_0

    .line 306
    iget v5, v5, Ll/᩹ᩳۢ;->֫:I

    invoke-virtual {v0, v5}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "name"

    .line 307
    invoke-virtual {v0, v5}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "parameters"

    .line 308
    invoke-virtual {v0, v5}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "type"

    .line 309
    invoke-virtual {v0, v5}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 310
    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v4

    const/4 v3, 0x0

    goto :goto_0

    .line 315
    :cond_1
    iget v6, v5, Ll/᩹ᩳۢ;->ۧ:I

    const/4 v7, 0x5

    if-ne v6, v7, :cond_0

    add-int/lit8 v4, v4, 0x1

    const/16 p1, 0xa

    .line 316
    iget p2, v5, Ll/᩹ᩳۢ;->֫:I

    invoke-static {v1, p1, p2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result p1

    filled-new-array {v4, p1}, [I

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
