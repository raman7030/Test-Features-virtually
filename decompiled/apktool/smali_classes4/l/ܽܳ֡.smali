.class public Ll/ܽܳ֡;
.super Ljava/lang/Object;
.source "MASO"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܽ:Ll/᩻᩷֡;

.field public ܿ:I

.field public ᩳ:Ll/ۡܳ֡;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/ܽܳ֡;->ۧ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\n"

    const-string v1, "\\n"

    .line 643
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\r"

    const-string v1, "\\r"

    .line 644
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\t"

    const-string v1, "\\t"

    .line 645
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\'"

    .line 0
    invoke-static {v0, p0, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֡ܳ֡;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, "<no token>"

    return-object p0

    .line 633
    :cond_0
    invoke-interface {p0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 637
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const-string v0, "<EOF>"

    goto :goto_0

    .line 626
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 637
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result p0

    .line 626
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ">"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 629
    :cond_2
    :goto_0
    invoke-static {v0}, Ll/ܽܳ֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(Ll/ۢܳ֡;)Ll/᩻᩷֡;
    .locals 5

    .line 150
    iget-object v0, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 742
    check-cast v0, Ll/᩺᩻֡;

    iget-object v0, v0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    .line 743
    iget-object p0, p0, Ll/ۢܳ֡;->ܿ:Ll/ۡܳ֡;

    .line 744
    new-instance v1, Ll/᩻᩷֡;

    const/4 v2, 0x0

    new-array v3, v2, [I

    invoke-direct {v1, v3}, Ll/᩻᩷֡;-><init>([I)V

    :goto_0
    if-eqz p0, :cond_0

    .line 745
    iget v3, p0, Ll/᩵ܳ֡;->֫:I

    if-ltz v3, :cond_0

    .line 747
    iget-object v4, v0, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ܳ֡;

    .line 748
    invoke-virtual {v3, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v3

    check-cast v3, Ll/ۡۜ֡;

    .line 749
    iget-object v3, v3, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    invoke-virtual {v0, v3}, Ll/᩸ܳ֡;->֫(Ll/᩺ܳ֡;)Ll/᩻᩷֡;

    move-result-object v3

    .line 750
    invoke-virtual {v1, v3}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    .line 751
    iget-object p0, p0, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    goto :goto_0

    .line 753
    :cond_0
    invoke-virtual {v1}, Ll/᩻᩷֡;->ܽ()V

    return-object v1
.end method


# virtual methods
.method public ֫(Ll/ۢܳ֡;)Ll/֡ܳ֡;
    .locals 11

    .line 467
    invoke-virtual {p0, p1}, Ll/ܽܳ֡;->ܽ(Ll/ۢܳ֡;)Ll/֡ܳ֡;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 471
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۡ()Ll/֡ܳ֡;

    return-object v0

    .line 512
    :cond_0
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    const/4 v1, 0x1

    .line 509
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    .line 150
    iget-object v2, p1, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 513
    check-cast v2, Ll/᩺᩻֡;

    iget-object v2, v2, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget-object v2, v2, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩻()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ܳ֡;

    const/4 v3, 0x0

    .line 514
    invoke-virtual {v2, v3}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v2

    iget-object v2, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    .line 150
    iget-object v3, p1, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 515
    check-cast v3, Ll/᩺᩻֡;

    iget-object v3, v3, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    .line 516
    iget-object v4, p1, Ll/ۢܳ֡;->ܿ:Ll/ۡܳ֡;

    invoke-virtual {v3, v2, v4}, Ll/᩸ܳ֡;->֫(Ll/᩺ܳ֡;Ll/᩵ܳ֡;)Ll/᩻᩷֡;

    move-result-object v2

    .line 518
    invoke-virtual {v2, v0}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 80
    iget-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 72
    :cond_1
    iput-boolean v1, p0, Ll/ܽܳ֡;->֫:Z

    .line 404
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۘ()Ll/֡ܳ֡;

    move-result-object v0

    .line 607
    invoke-virtual {p1}, Ll/ۢܳ֡;->ᩴ()Ll/᩻᩷֡;

    move-result-object v1

    .line 406
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "missing "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩷()Ll/ܶܳ֡;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/᩻᩷֡;->֫(Ll/۠ܳ֡;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " at "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    invoke-static {v0}, Ll/ܽܳ֡;->֫(Ll/֡ܳ֡;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 409
    invoke-virtual {p1, v0, v1, v2}, Ll/ۢܳ֡;->֫(Ll/֡ܳ֡;Ljava/lang/String;Ll/ۖܳ֡;)V

    .line 584
    :goto_0
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۘ()Ll/֡ܳ֡;

    move-result-object v0

    .line 607
    invoke-virtual {p1}, Ll/ۢܳ֡;->ᩴ()Ll/᩻᩷֡;

    move-result-object v1

    .line 587
    invoke-virtual {v1}, Ll/᩻᩷֡;->ۧ()Z

    move-result v2

    if-nez v2, :cond_2

    .line 588
    invoke-virtual {v1}, Ll/᩻᩷֡;->֫()I

    move-result v1

    move v4, v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_1
    const/4 v1, -0x1

    if-ne v4, v1, :cond_3

    const-string v2, "<missing EOF>"

    goto :goto_2

    .line 592
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "<missing "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩷()Ll/ܶܳ֡;

    move-result-object v3

    invoke-virtual {v3, v4}, Ll/ܶܳ֡;->֫(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ">"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    move-object v5, v2

    .line 512
    iget-object v2, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 594
    invoke-virtual {v2, v1}, Ll/֫ܳ֡;->ᩳ(I)Ll/֡ܳ֡;

    move-result-object v2

    .line 595
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v3

    if-ne v3, v1, :cond_4

    if-eqz v2, :cond_4

    move-object v0, v2

    .line 427
    :cond_4
    iget-object p1, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 77
    iget-object p1, p1, Ll/֫ܳ֡;->ܽ:Ll/᩻ܳ֡;

    .line 427
    invoke-interface {p1}, Ll/֨ܳ֡;->ۧ()Ll/ۚܳ֡;

    move-result-object v2

    .line 599
    new-instance v3, Ll/᩷᩷֡;

    invoke-interface {v0}, Ll/֡ܳ֡;->ܳ()Ll/֨ܳ֡;

    move-result-object p1

    invoke-interface {v0}, Ll/֡ܳ֡;->ܳ()Ll/֨ܳ֡;

    move-result-object v1

    invoke-interface {v1}, Ll/֨ܳ֡;->getInputStream()Ll/᩺ܿ֡;

    move-result-object v1

    invoke-direct {v3, p1, v1}, Ll/᩷᩷֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 602
    invoke-interface {v0}, Ll/֡ܳ֡;->getLine()I

    move-result v9

    invoke-interface {v0}, Ll/֡ܳ֡;->֫()I

    move-result v10

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, -0x1

    .line 599
    invoke-interface/range {v2 .. v10}, Ll/ۚܳ֡;->֫(Ll/᩷᩷֡;ILjava/lang/String;IIIII)Ll/֡ܳ֡;

    move-result-object p1

    return-object p1

    .line 482
    :cond_5
    iget-object v0, p0, Ll/ܽܳ֡;->ᩳ:Ll/ۡܳ֡;

    if-nez v0, :cond_6

    .line 483
    new-instance v0, Ll/ܿܳ֡;

    invoke-direct {v0, p1}, Ll/ܿܳ֡;-><init>(Ll/ۢܳ֡;)V

    goto :goto_3

    .line 485
    :cond_6
    new-instance v0, Ll/ܿܳ֡;

    iget v1, p0, Ll/ܽܳ֡;->ܿ:I

    iget-object v2, p0, Ll/ܽܳ֡;->ᩳ:Ll/ۡܳ֡;

    .line 512
    iget-object v3, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 18
    invoke-direct {v0, p1, v3, v2}, Ll/ۖܳ֡;-><init>(Ll/ᩴܳ֡;Ll/ܳܳ֡;Ll/ۡܳ֡;)V

    .line 19
    invoke-virtual {v0, v1}, Ll/ۖܳ֡;->֫(I)V

    .line 20
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۘ()Ll/֡ܳ֡;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۖܳ֡;->֫(Ll/֡ܳ֡;)V

    .line 488
    :goto_3
    throw v0
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 90
    iput-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    const/4 v0, 0x0

    .line 91
    iput-object v0, p0, Ll/ܽܳ֡;->ܽ:Ll/᩻᩷֡;

    const/4 v0, -0x1

    .line 92
    iput v0, p0, Ll/ܽܳ֡;->ۧ:I

    return-void
.end method

.method public ֫(Ll/ۢܳ֡;Ll/ۖܳ֡;)V
    .locals 3

    .line 164
    iget p2, p0, Ll/ܽܳ֡;->ۧ:I

    .line 512
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 164
    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v0

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Ll/ܽܳ֡;->ܽ:Ll/᩻᩷֡;

    if-eqz p2, :cond_0

    .line 166
    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩻()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 174
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۡ()Ll/֡ܳ֡;

    .line 512
    :cond_0
    iget-object p2, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 176
    invoke-interface {p2}, Ll/ܳܳ֡;->index()I

    move-result p2

    iput p2, p0, Ll/ܽܳ֡;->ۧ:I

    .line 177
    iget-object p2, p0, Ll/ܽܳ֡;->ܽ:Ll/᩻᩷֡;

    if-nez p2, :cond_1

    new-instance p2, Ll/᩻᩷֡;

    const/4 v0, 0x0

    new-array v0, v0, [I

    invoke-direct {p2, v0}, Ll/᩻᩷֡;-><init>([I)V

    iput-object p2, p0, Ll/ܽܳ֡;->ܽ:Ll/᩻᩷֡;

    .line 178
    :cond_1
    iget-object p2, p0, Ll/ܽܳ֡;->ܽ:Ll/᩻᩷֡;

    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩻()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/᩻᩷֡;->֫(I)V

    .line 179
    invoke-static {p1}, Ll/ܽܳ֡;->ܿ(Ll/ۢܳ֡;)Ll/᩻᩷֡;

    move-result-object p2

    .line 512
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    const/4 v1, 0x1

    .line 761
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    .line 762
    invoke-virtual {p2, v0}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 765
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۡ()Ll/֡ܳ֡;

    .line 512
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 766
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۧ(Ll/ۢܳ֡;)V
    .locals 5

    .line 80
    iget-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    .line 372
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۘ()Ll/֡ܳ֡;

    move-result-object v0

    .line 373
    invoke-static {v0}, Ll/ܽܳ֡;->֫(Ll/֡ܳ֡;)Ljava/lang/String;

    move-result-object v1

    .line 607
    invoke-virtual {p1}, Ll/ۢܳ֡;->ᩴ()Ll/᩻᩷֡;

    move-result-object v2

    const-string v3, "extraneous input "

    const-string v4, " expecting "

    .line 0
    invoke-static {v3, v1, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 376
    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩷()Ll/ܶܳ֡;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩻᩷֡;->֫(Ll/۠ܳ֡;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 377
    invoke-virtual {p1, v0, v1, v2}, Ll/ۢܳ֡;->֫(Ll/֡ܳ֡;Ljava/lang/String;Ll/ۖܳ֡;)V

    return-void
.end method

.method public final ۧ(Ll/ۢܳ֡;Ll/ۖܳ֡;)V
    .locals 7

    .line 80
    iget-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    .line 135
    instance-of v0, p2, Ll/᩷ܳ֡;

    if-eqz v0, :cond_8

    .line 136
    check-cast p2, Ll/᩷ܳ֡;

    .line 512
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    if-eqz v0, :cond_7

    .line 303
    invoke-virtual {p2}, Ll/᩷ܳ֡;->ᩳ()Ll/֡ܳ֡;

    move-result-object v1

    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const-string v0, "<EOF>"

    goto :goto_3

    .line 304
    :cond_1
    invoke-virtual {p2}, Ll/᩷ܳ֡;->ᩳ()Ll/֡ܳ֡;

    move-result-object v1

    invoke-virtual {p2}, Ll/ۖܳ֡;->ܽ()Ll/֡ܳ֡;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, ""

    if-eqz v1, :cond_6

    if-eqz v2, :cond_6

    .line 474
    invoke-interface {v1}, Ll/֡ܳ֡;->ܽ()I

    move-result v1

    invoke-interface {v2}, Ll/֡ܳ֡;->ܽ()I

    move-result v2

    invoke-static {v1, v2}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object v1

    .line 449
    iget-object v2, v0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    iget v4, v1, Ll/ܳ᩷֡;->֫:I

    .line 450
    iget v1, v1, Ll/ܳ᩷֡;->ۧ:I

    if-ltz v4, :cond_6

    if-gez v1, :cond_2

    goto :goto_2

    .line 452
    :cond_2
    invoke-virtual {v0, v1}, Ll/֫ܳ֡;->᩷(I)Z

    .line 453
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_3

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 455
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    if-gt v4, v1, :cond_5

    .line 457
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳ֡;

    .line 458
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_4

    goto :goto_1

    .line 459
    :cond_4
    invoke-interface {v3}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 461
    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    :goto_2
    move-object v0, v3

    goto :goto_3

    :cond_7
    const-string v0, "<unknown input>"

    .line 309
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no viable alternative at input "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܽܳ֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 310
    invoke-virtual {p2}, Ll/ۖܳ֡;->ܽ()Ll/֡ܳ֡;

    move-result-object v1

    invoke-virtual {p1, v1, v0, p2}, Ll/ۢܳ֡;->֫(Ll/֡ܳ֡;Ljava/lang/String;Ll/ۖܳ֡;)V

    return-void

    .line 138
    :cond_8
    instance-of v0, p2, Ll/ܿܳ֡;

    if-eqz v0, :cond_9

    .line 139
    check-cast p2, Ll/ܿܳ֡;

    .line 325
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mismatched input "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۖܳ֡;->ܽ()Ll/֡ܳ֡;

    move-result-object v1

    invoke-static {v1}, Ll/ܽܳ֡;->֫(Ll/֡ܳ֡;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " expecting "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    invoke-virtual {p2}, Ll/ۖܳ֡;->֫()Ll/᩻᩷֡;

    move-result-object v1

    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩷()Ll/ܶܳ֡;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩻᩷֡;->֫(Ll/۠ܳ֡;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 327
    invoke-virtual {p2}, Ll/ۖܳ֡;->ܽ()Ll/֡ܳ֡;

    move-result-object v1

    invoke-virtual {p1, v1, v0, p2}, Ll/ۢܳ֡;->֫(Ll/֡ܳ֡;Ljava/lang/String;Ll/ۖܳ֡;)V

    return-void

    .line 141
    :cond_9
    instance-of v0, p2, Ll/ᩳܳ֡;

    if-eqz v0, :cond_a

    .line 142
    check-cast p2, Ll/ᩳܳ֡;

    .line 342
    invoke-virtual {p1}, Ll/ᩴܳ֡;->ܳ()[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Ll/ۢܳ֡;->ܿ:Ll/ۡܳ֡;

    invoke-virtual {v1}, Ll/᩵ܳ֡;->ۧ()I

    move-result v1

    aget-object v0, v0, v1

    const-string v1, "rule "

    const-string v2, " "

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 343
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 344
    invoke-virtual {p2}, Ll/ۖܳ֡;->ܽ()Ll/֡ܳ֡;

    move-result-object v1

    invoke-virtual {p1, v1, v0, p2}, Ll/ۢܳ֡;->֫(Ll/֡ܳ֡;Ljava/lang/String;Ll/ۖܳ֡;)V

    return-void

    .line 145
    :cond_a
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "unknown recognition error type: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 146
    invoke-virtual {p2}, Ll/ۖܳ֡;->ܽ()Ll/֡ܳ֡;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1, p2}, Ll/ۢܳ֡;->֫(Ll/֡ܳ֡;Ljava/lang/String;Ll/ۖܳ֡;)V

    return-void
.end method

.method public final ܽ(Ll/ۢܳ֡;)Ll/֡ܳ֡;
    .locals 2

    .line 512
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    const/4 v1, 0x2

    .line 545
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    .line 607
    invoke-virtual {p1}, Ll/ۢܳ֡;->ᩴ()Ll/᩻᩷֡;

    move-result-object v1

    .line 547
    invoke-virtual {v1, v0}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 548
    invoke-virtual {p0, p1}, Ll/ܽܳ֡;->ۧ(Ll/ۢܳ֡;)V

    .line 555
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۡ()Ll/֡ܳ֡;

    .line 557
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۘ()Ll/֡ܳ֡;

    move-result-object p1

    const/4 v0, 0x0

    .line 90
    iput-boolean v0, p0, Ll/ܽܳ֡;->֫:Z

    .line 91
    iput-object v1, p0, Ll/ܽܳ֡;->ܽ:Ll/᩻᩷֡;

    const/4 v0, -0x1

    .line 92
    iput v0, p0, Ll/ܽܳ֡;->ۧ:I

    return-object p1

    :cond_0
    return-object v1
.end method

.method public ᩳ(Ll/ۢܳ֡;)V
    .locals 6

    .line 150
    iget-object v0, p1, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 231
    check-cast v0, Ll/᩺᩻֡;

    iget-object v0, v0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    iget-object v0, v0, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩻()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܳ֡;

    .line 80
    iget-boolean v1, p0, Ll/ܽܳ֡;->֫:Z

    if-eqz v1, :cond_0

    goto/16 :goto_1

    .line 512
    :cond_0
    iget-object v1, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    const/4 v2, 0x1

    .line 239
    invoke-interface {v1, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v1

    .line 242
    invoke-virtual {p1}, Ll/ᩴܳ֡;->ܽ()Ll/᩸ܳ֡;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll/᩸ܳ֡;->֫(Ll/᩺ܳ֡;)Ll/᩻᩷֡;

    move-result-object v3

    .line 243
    invoke-virtual {v3, v1}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v1

    const/4 v4, -0x1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    .line 245
    iput-object p1, p0, Ll/ܽܳ֡;->ᩳ:Ll/ۡܳ֡;

    .line 246
    iput v4, p0, Ll/ܽܳ֡;->ܿ:I

    return-void

    :cond_1
    const/4 v1, -0x2

    .line 250
    invoke-virtual {v3, v1}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 251
    iget-object v0, p0, Ll/ܽܳ֡;->ᩳ:Ll/ۡܳ֡;

    if-nez v0, :cond_4

    .line 749
    iget-object v0, p1, Ll/ۢܳ֡;->ܿ:Ll/ۡܳ֡;

    .line 254
    iput-object v0, p0, Ll/ܽܳ֡;->ᩳ:Ll/ۡܳ֡;

    .line 255
    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩻()I

    move-result p1

    iput p1, p0, Ll/ܽܳ֡;->ܿ:I

    return-void

    .line 260
    :cond_2
    invoke-virtual {v0}, Ll/᩺ܳ֡;->ۧ()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 275
    :pswitch_0
    invoke-virtual {p0, p1}, Ll/ܽܳ֡;->ۧ(Ll/ۢܳ֡;)V

    .line 276
    invoke-virtual {p1}, Ll/ۢܳ֡;->ᩴ()Ll/᩻᩷֡;

    move-result-object v0

    .line 278
    invoke-static {p1}, Ll/ܽܳ֡;->ܿ(Ll/ۢܳ֡;)Ll/᩻᩷֡;

    move-result-object v1

    .line 307
    new-instance v3, Ll/᩻᩷֡;

    const/4 v5, 0x0

    new-array v5, v5, [I

    invoke-direct {v3, v5}, Ll/᩻᩷֡;-><init>([I)V

    .line 308
    invoke-virtual {v3, v0}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    .line 309
    invoke-virtual {v3, v1}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    .line 512
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 761
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    :goto_0
    if-eq v0, v4, :cond_4

    .line 762
    invoke-virtual {v3, v0}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 765
    invoke-virtual {p1}, Ll/ۢܳ֡;->ۡ()Ll/֡ܳ֡;

    .line 512
    iget-object v0, p1, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    .line 766
    invoke-interface {v0, v2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    goto :goto_0

    .line 266
    :cond_3
    :pswitch_1
    invoke-virtual {p0, p1}, Ll/ܽܳ֡;->ܽ(Ll/ۢܳ֡;)Ll/֡ܳ֡;

    move-result-object v0

    if-eqz v0, :cond_5

    :cond_4
    :goto_1
    return-void

    .line 270
    :cond_5
    new-instance v0, Ll/ܿܳ֡;

    invoke-direct {v0, p1}, Ll/ܿܳ֡;-><init>(Ll/ۢܳ֡;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
