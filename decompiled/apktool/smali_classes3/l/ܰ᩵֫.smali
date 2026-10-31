.class public final Ll/ܰ᩵֫;
.super Ljava/lang/Object;
.source "28U3"


# static fields
.field public static final ۧ:Ll/ܰ᩵֫;


# instance fields
.field public final ֫:Ll/ܳ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 262
    new-instance v0, Ll/ܰ᩵֫;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܰ᩵֫;-><init>(Ljava/util/List;)V

    sput-object v0, Ll/ܰ᩵֫;->ۧ:Ll/ܰ᩵֫;

    const/4 v0, 0x0

    .line 374
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 273
    invoke-static {p1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 362
    const-class v0, Ll/ܰ᩵֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 365
    :cond_1
    check-cast p1, Ll/ܰ᩵֫;

    .line 366
    iget-object v0, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    iget-object p1, p1, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 371
    iget-object v0, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/ܳ۬ܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/ܳ۬ܺ;
    .locals 1

    .line 278
    iget-object v0, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ֫(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 288
    :goto_0
    iget-object v2, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 289
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩵֫;

    invoke-virtual {v2}, Ll/᩺᩵֫;->ۧ()I

    move-result v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 283
    iget-object v0, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ۧ(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 348
    :goto_0
    iget-object v2, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 349
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩵֫;

    .line 350
    invoke-virtual {v2}, Ll/᩺᩵֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ll/᩺᩵֫;->ۧ()I

    move-result v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ܽ()Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 316
    :goto_0
    iget-object v2, p0, Ll/ܰ᩵֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 317
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺᩵֫;

    invoke-virtual {v3}, Ll/᩺᩵֫;->ۧ()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    .line 318
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩵֫;

    invoke-virtual {v2}, Ll/᩺᩵֫;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
