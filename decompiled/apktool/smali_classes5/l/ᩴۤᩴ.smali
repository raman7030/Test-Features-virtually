.class public final Ll/ᩴۤᩴ;
.super Ll/ܶۤᩴ;
.source "N673"

# interfaces
.implements Ll/ܶ۫ᩴ;


# instance fields
.field public final synthetic i:I

.field public j:J


# direct methods
.method public synthetic constructor <init>([Ll/֡ۤᩴ;IIIJI)V
    .locals 0

    iput p7, p0, Ll/ᩴۤᩴ;->i:I

    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    iput-wide p5, p0, Ll/ᩴۤᩴ;->j:J

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x1100

    return v0

    :pswitch_0
    const/16 v0, 0x1101

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final estimateSize()J
    .locals 2

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    .line 3620
    iget-wide v0, p0, Ll/ᩴۤᩴ;->j:J

    return-wide v0

    .line 3581
    :pswitch_0
    iget-wide v0, p0, Ll/ᩴۤᩴ;->j:J

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    .line 3606
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    .line 3567
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3568
    :goto_0
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3569
    iget-object v0, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    .line 3607
    :goto_1
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3608
    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic getExactSizeIfKnown()J
    .locals 2

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 1

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 1

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    .line 3612
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3614
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    .line 3573
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3575
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3577
    :cond_0
    iget-object v0, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    :goto_0
    return p1

    .line 3616
    :cond_1
    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 9

    iget v0, p0, Ll/ᩴۤᩴ;->i:I

    packed-switch v0, :pswitch_data_0

    .line 3600
    iget v0, p0, Ll/ܶۤᩴ;->f:I

    iget v5, p0, Ll/ܶۤᩴ;->g:I

    add-int v1, v0, v5

    ushr-int/lit8 v4, v1, 0x1

    if-gt v4, v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 3561
    :pswitch_0
    iget v0, p0, Ll/ܶۤᩴ;->f:I

    iget v5, p0, Ll/ܶۤᩴ;->g:I

    add-int v1, v0, v5

    ushr-int/lit8 v4, v1, 0x1

    if-gt v4, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 3562
    :cond_0
    new-instance v0, Ll/ᩴۤᩴ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܶۤᩴ;->a:[Ll/֡ۤᩴ;

    iput v4, p0, Ll/ܶۤᩴ;->g:I

    iget-wide v6, p0, Ll/ᩴۤᩴ;->j:J

    ushr-long/2addr v6, v1

    iput-wide v6, p0, Ll/ᩴۤᩴ;->j:J

    const/4 v8, 0x0

    iget v3, p0, Ll/ܶۤᩴ;->h:I

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ll/ᩴۤᩴ;-><init>([Ll/֡ۤᩴ;IIIJI)V

    :goto_0
    return-object v0

    .line 3601
    :cond_1
    new-instance v0, Ll/ᩴۤᩴ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܶۤᩴ;->a:[Ll/֡ۤᩴ;

    iput v4, p0, Ll/ܶۤᩴ;->g:I

    iget-wide v6, p0, Ll/ᩴۤᩴ;->j:J

    ushr-long/2addr v6, v1

    iput-wide v6, p0, Ll/ᩴۤᩴ;->j:J

    const/4 v8, 0x1

    iget v3, p0, Ll/ܶۤᩴ;->h:I

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ll/ᩴۤᩴ;-><init>([Ll/֡ۤᩴ;IIIJI)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
