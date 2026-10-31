.class public Ll/ۡܳ֡;
.super Ll/᩵ܳ֡;
.source "8AT0"


# static fields
.field public static final ܳ:Ll/ۡܳ֡;


# instance fields
.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:Ll/֡ܳ֡;

.field public ᩳ:Ll/֡ܳ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Ll/ۡܳ֡;

    invoke-direct {v0}, Ll/ۡܳ֡;-><init>()V

    sput-object v0, Ll/ۡܳ֡;->ܳ:Ll/ۡܳ֡;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 77
    iput v0, p0, Ll/᩵ܳ֡;->֫:I

    return-void
.end method

.method public constructor <init>(ILl/ۡܳ֡;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p2, p0, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    .line 84
    iput p1, p0, Ll/᩵ܳ֡;->֫:I

    return-void
.end method


# virtual methods
.method public final getChildCount()I
    .locals 1

    .line 304
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ljava/lang/Class;)Ljava/util/List;
    .locals 4

    .line 281
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 282
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 286
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ᩷֡;

    .line 287
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v1, :cond_2

    .line 289
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 292
    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡܳ֡;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    .line 297
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_4
    return-object v1
.end method

.method public final ֫(II)Ll/ۘ᩷֡;
    .locals 4

    .line 229
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    if-ltz p2, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p2, v0, :cond_0

    goto :goto_0

    .line 234
    :cond_0
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, -0x1

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ᩷֡;

    .line 235
    instance-of v3, v2, Ll/ۘ᩷֡;

    if-eqz v3, :cond_1

    .line 236
    check-cast v2, Ll/ۘ᩷֡;

    .line 237
    invoke-interface {v2}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v3

    .line 238
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v3

    if-ne v3, p1, :cond_1

    add-int/lit8 v1, v1, 0x1

    if-ne v1, p2, :cond_1

    return-object v2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/Class;I)Ll/ۡܳ֡;
    .locals 5

    .line 212
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-ltz p2, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p2, v0, :cond_0

    goto :goto_0

    .line 217
    :cond_0
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, -0x1

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺ᩷֡;

    .line 218
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    if-ne v2, p2, :cond_1

    .line 221
    invoke-virtual {p1, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ll/ܺ᩷֡;

    .line 277
    :cond_2
    :goto_0
    check-cast v1, Ll/ۡܳ֡;

    return-object v1
.end method

.method public final ֫(I)Ll/ܺ᩷֡;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺ᩷֡;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܺ᩷֡;)V
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    .line 136
    :cond_0
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(I)Ljava/util/List;
    .locals 4

    .line 251
    iget-object v0, p0, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 252
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 256
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ᩷֡;

    .line 257
    instance-of v3, v2, Ll/ۘ᩷֡;

    if-eqz v3, :cond_1

    .line 258
    check-cast v2, Ll/ۘ᩷֡;

    .line 259
    invoke-interface {v2}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v3

    .line 260
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v3

    if-ne v3, p1, :cond_1

    if-nez v1, :cond_2

    .line 262
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 264
    :cond_2
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    .line 270
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_4
    return-object v1
.end method
