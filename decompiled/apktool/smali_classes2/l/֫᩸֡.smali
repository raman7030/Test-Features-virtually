.class public final Ll/֫᩸֡;
.super Ljava/lang/Object;
.source "M4YN"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ll/֡ۙ֡;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/֡ۙ֡;)V
    .locals 3

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֫᩸֡;->ᩳ:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 345
    iput v0, p0, Ll/֫᩸֡;->֫:I

    .line 349
    iput-object p1, p0, Ll/֫᩸֡;->ܽ:Ll/֡ۙ֡;

    .line 351
    iget-object p1, p1, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩸֡;

    .line 352
    invoke-static {v0}, Ll/ۧ᩸֡;->֫(Ll/ۧ᩸֡;)Ll/᩺ۙ֡;

    move-result-object v1

    .line 353
    iget-object v2, p0, Ll/֫᩸֡;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Ll/ۧ᩸֡;)V
    .locals 4

    .line 202
    iget v0, p1, Ll/ۚۙ֡;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 388
    iget-object v0, p1, Ll/ۧ᩸֡;->᩺:Ll/᩺ۙ֡;

    .line 389
    iget-object v1, p0, Ll/֫᩸֡;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩸֡;

    if-eqz v0, :cond_0

    .line 392
    invoke-direct {p0, v0}, Ll/֫᩸֡;->֫(Ll/ۧ᩸֡;)V

    .line 395
    :cond_0
    iget-object v0, p1, Ll/ۧ᩸֡;->ۤ:Ll/ܰۙ֡;

    if-eqz v0, :cond_2

    .line 256
    new-instance v2, Ll/ܳۗ֡;

    iget-object v0, v0, Ll/ܰۙ֡;->ۗ:[Ll/᩺ۙ֡;

    invoke-direct {v2, v0}, Ll/ܳۗ֡;-><init>([Ljava/lang/Object;)V

    .line 398
    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙ֡;

    .line 399
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩸֡;

    if-eqz v2, :cond_1

    .line 401
    invoke-direct {p0, v2}, Ll/֫᩸֡;->֫(Ll/ۧ᩸֡;)V

    goto :goto_0

    .line 406
    :cond_2
    iget v0, p0, Ll/֫᩸֡;->ۧ:I

    iget v2, p0, Ll/֫᩸֡;->֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/֫᩸֡;->֫:I

    invoke-virtual {p1, v0, v2}, Ll/ۚۙ֡;->ۧ(II)I

    move-result v0

    iput v0, p0, Ll/֫᩸֡;->ۧ:I

    .line 407
    invoke-static {p1}, Ll/ۧ᩸֡;->֫(Ll/ۧ᩸֡;)Ll/᩺ۙ֡;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 3

    .line 358
    iput p1, p0, Ll/֫᩸֡;->ۧ:I

    .line 360
    iget-object p1, p0, Ll/֫᩸֡;->ܽ:Ll/֡ۙ֡;

    iget-object v0, p1, Ll/ۤۙ֡;->֫:Ll/ۗ᩶֡;

    .line 371
    iget-object p1, p1, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ᩸֡;

    const/4 v2, -0x1

    .line 372
    iput v2, v1, Ll/ۚۙ֡;->᩶:I

    goto :goto_0

    .line 375
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ᩸֡;

    .line 376
    invoke-direct {p0, v1}, Ll/֫᩸֡;->֫(Ll/ۧ᩸֡;)V

    goto :goto_1

    .line 379
    :cond_1
    iget-object v0, p0, Ll/֫᩸֡;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ᩸֡;

    .line 209
    iget v2, v1, Ll/ۚۙ֡;->᩹:I

    .line 380
    invoke-virtual {p1, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 383
    :cond_2
    iget p1, p0, Ll/֫᩸֡;->ۧ:I

    return p1
.end method
