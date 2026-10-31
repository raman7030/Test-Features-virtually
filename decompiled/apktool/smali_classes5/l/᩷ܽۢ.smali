.class public final synthetic Ll/᩷ܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ۙ:Ll/ܶۛ᩷;

.field public final synthetic ᩶:Ll/ۧۤᩴ;

.field public final synthetic ᩸:Ll/ۨ֫ۢ;

.field public final synthetic ᩹:Ll/ᩴ᩵;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ֫ۢ;Ll/ᩴ᩵;Ll/ۧۤᩴ;Ll/ܶۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܽۢ;->᩸:Ll/ۨ֫ۢ;

    iput-object p2, p0, Ll/᩷ܽۢ;->᩹:Ll/ᩴ᩵;

    iput-object p3, p0, Ll/᩷ܽۢ;->᩶:Ll/ۧۤᩴ;

    iput-object p4, p0, Ll/᩷ܽۢ;->ۙ:Ll/ܶۛ᩷;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/᩷ܽۢ;->᩸:Ll/ۨ֫ۢ;

    .line 4
    iget-object v1, p0, Ll/᩷ܽۢ;->᩹:Ll/ᩴ᩵;

    .line 6
    iget-object v2, p0, Ll/᩷ܽۢ;->᩶:Ll/ۧۤᩴ;

    .line 8
    iget-object v3, p0, Ll/᩷ܽۢ;->ۙ:Ll/ܶۛ᩷;

    .line 10
    check-cast p1, Ll/ܰ֫ۢ;

    .line 505
    :try_start_0
    invoke-interface {p1}, Ll/ܰ֫ۢ;->ܿ()Ll/۠ۛ֡;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 506
    invoke-virtual {p1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v4, v2}, Ll/ۛܽۢ;->֫(Ll/ۨ֫ۢ;Ll/ᩴ᩵;Ljava/lang/String;Ll/ۧۤᩴ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 507
    invoke-virtual {p1}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ֫ۚ;

    .line 508
    invoke-interface {v0}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v1

    .line 509
    sget-object v2, Ll/ܺۗ֡;->ܽ֫:Ll/ܺۗ֡;

    invoke-virtual {v2, v1}, Ll/ܺۗ֡;->֫(I)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v2, v1}, Ll/ܺۗ֡;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 512
    invoke-static {v0, v1}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object v1

    .line 513
    invoke-virtual {v3}, Ll/ܶۛ᩷;->get()Ll/۫ۘܽ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Ll/۫ۘܽ;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 514
    new-instance p1, Ll/᩵ۛ᩷;

    const/4 v1, 0x3

    invoke-direct {p1, v1}, Ll/᩵ۛ᩷;-><init>(I)V

    const/4 v1, 0x0

    .line 515
    iput v1, p1, Ll/᩵ۛ᩷;->᩸:I

    .line 516
    invoke-interface {v0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, p1, Ll/᩵ۛ᩷;->᩹:I

    .line 517
    invoke-interface {v0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    .line 518
    invoke-interface {v0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    .line 519
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 520
    invoke-interface {v0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    .line 521
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 523
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    .line 524
    iget v1, p1, Ll/᩵ۛ᩷;->᩸:I

    iget v2, p1, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {p1, v0, v1, v2}, Ll/᩵ۛ᩷;->֫(Ll/ᩴ֫ۚ;II)V

    .line 525
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
