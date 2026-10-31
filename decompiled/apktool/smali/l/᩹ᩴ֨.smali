.class public final Ll/᩹ᩴ֨;
.super Ljava/lang/Object;
.source "041R"

# interfaces
.implements Ll/ۢۘ֨;


# instance fields
.field public ۙ:Ll/᩷ۚ֨;

.field public ᩶:Ll/ۙᩴ֨;

.field public final ᩸:Ll/ۗ֨۠;

.field public ᩹:Ll/ۙᩴ֨;


# direct methods
.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 0

    .line 367
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 370
    iput-object p1, p0, Ll/᩹ᩴ֨;->᩸:Ll/ۗ֨۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۙᩴ֨;Ll/ۖܶ۠;)Ll/ۙᩴ֨;
    .locals 1

    .line 392
    iget-object v0, p0, Ll/᩹ᩴ֨;->ۙ:Ll/᩷ۚ֨;

    if-nez v0, :cond_0

    .line 393
    iget-object v0, p0, Ll/᩹ᩴ֨;->᩸:Ll/ۗ֨۠;

    invoke-static {v0}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ᩴ֨;->ۙ:Ll/᩷ۚ֨;

    .line 383
    :cond_0
    iput-object p1, p0, Ll/᩹ᩴ֨;->᩶:Ll/ۙᩴ֨;

    const/4 v0, 0x0

    .line 384
    iput-object v0, p0, Ll/᩹ᩴ֨;->᩹:Ll/ۙᩴ֨;

    .line 385
    invoke-virtual {p2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۘ֨;

    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    invoke-virtual {p0, v0}, Ll/᩹ᩴ֨;->֫(Ll/ܽۘ֨;)V

    goto :goto_0

    .line 388
    :cond_1
    iget-object p2, p0, Ll/᩹ᩴ֨;->᩹:Ll/ۙᩴ֨;

    if-nez p2, :cond_2

    return-object p1

    :cond_2
    return-object p2
.end method

.method public final ֫(Ll/֫ۘ֨;)V
    .locals 3

    .line 430
    iget-object p1, p1, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 431
    invoke-virtual {v2, p0}, Ll/ۡۘ֨;->֫(Ll/ۢۘ֨;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧۘ֨;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܳۘ֨;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܽۘ֨;)V
    .locals 3

    .line 418
    iget-object v0, p1, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, p0, Ll/᩹ᩴ֨;->ۙ:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->ۜۧ:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v0, v1, :cond_1

    .line 419
    iget-object p1, p1, Ll/ܽۘ֨;->ᩳ:Ll/ۖܶ۠;

    .line 420
    :goto_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    iget-object v0, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩺ܶ۠;

    .line 422
    iget-object v1, v0, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v1, Ll/ۘ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "value"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 423
    iget-object v0, v0, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۡۘ֨;

    invoke-virtual {v0, p0}, Ll/ۡۘ֨;->֫(Ll/ۢۘ֨;)V

    .line 420
    :cond_0
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܿۘ֨;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ᩳۘ֨;)V
    .locals 2

    .line 404
    iget-object v0, p1, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, p0, Ll/᩹ᩴ֨;->ۙ:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v0, v1, :cond_1

    .line 405
    iget-object p1, p1, Ll/ᩳۘ֨;->ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/᩶ᩴ֨;->֫(Ljava/lang/String;)Ll/᩶ᩴ֨;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 397
    iget-object v0, p0, Ll/᩹ᩴ֨;->᩹:Ll/ۙᩴ֨;

    if-nez v0, :cond_0

    .line 398
    new-instance v0, Ll/ۙᩴ֨;

    iget-object v1, p0, Ll/᩹ᩴ֨;->᩶:Ll/ۙᩴ֨;

    invoke-direct {v0, v1}, Ll/ۙᩴ֨;-><init>(Ll/ۙᩴ֨;)V

    iput-object v0, p0, Ll/᩹ᩴ֨;->᩹:Ll/ۙᩴ֨;

    .line 399
    :cond_0
    iget-object v0, p0, Ll/᩹ᩴ֨;->᩹:Ll/ۙᩴ֨;

    invoke-static {v0}, Ll/ۙᩴ֨;->֫(Ll/ۙᩴ֨;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 400
    iget-object v0, p0, Ll/᩹ᩴ֨;->᩹:Ll/ۙᩴ֨;

    invoke-static {v0}, Ll/ۙᩴ֨;->ۧ(Ll/ۙᩴ֨;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
