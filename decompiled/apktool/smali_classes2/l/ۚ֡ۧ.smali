.class public final Ll/ۚ֡ۧ;
.super Ljava/lang/Object;
.source "O8V0"


# instance fields
.field public ֫:Z

.field public ۖ:I

.field public ۘ:I

.field public ۜ:Z

.field public ۡ:Z

.field public ۢ:I

.field public ۧ:Z

.field public ܳ:Z

.field public ܺ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:Ll/ۧ۠֫;

.field public ᩷:Z

.field public ᩻:I


# direct methods
.method public static ֫(Ll/ۚ֡ۧ;Ll/ۚ֡ۧ;)Z
    .locals 5

    .line 615
    iget-boolean v0, p0, Ll/ۚ֡ۧ;->ۡ:Z

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 618
    :cond_0
    iget-boolean v0, p1, Ll/ۚ֡ۧ;->ۡ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 622
    :cond_1
    iget-object v0, p0, Ll/ۚ֡ۧ;->᩵:Ll/ۧ۠֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 623
    iget-object v2, p1, Ll/ۚ֡ۧ;->᩵:Ll/ۧ۠֫;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v2, v2, Ll/ۧ۠֫;->ۘ:I

    .line 624
    iget v3, p0, Ll/ۚ֡ۧ;->᩻:I

    iget v4, p1, Ll/ۚ֡ۧ;->᩻:I

    if-ne v3, v4, :cond_7

    iget v3, p0, Ll/ۚ֡ۧ;->ۘ:I

    iget v4, p1, Ll/ۚ֡ۧ;->ۘ:I

    if-ne v3, v4, :cond_7

    iget-boolean v3, p0, Ll/ۚ֡ۧ;->ܳ:Z

    iget-boolean v4, p1, Ll/ۚ֡ۧ;->ܳ:Z

    if-ne v3, v4, :cond_7

    iget-boolean v3, p0, Ll/ۚ֡ۧ;->ۧ:Z

    if-eqz v3, :cond_2

    iget-boolean v3, p1, Ll/ۚ֡ۧ;->ۧ:Z

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Ll/ۚ֡ۧ;->֫:Z

    iget-boolean v4, p1, Ll/ۚ֡ۧ;->֫:Z

    if-ne v3, v4, :cond_7

    :cond_2
    iget v3, p0, Ll/ۚ֡ۧ;->ܺ:I

    iget v4, p1, Ll/ۚ֡ۧ;->ܺ:I

    if-eq v3, v4, :cond_3

    if-eqz v3, :cond_7

    if-eqz v4, :cond_7

    :cond_3
    iget v0, v0, Ll/ۧ۠֫;->ۘ:I

    if-nez v0, :cond_4

    if-nez v2, :cond_4

    iget v3, p0, Ll/ۚ֡ۧ;->ۖ:I

    iget v4, p1, Ll/ۚ֡ۧ;->ۖ:I

    if-ne v3, v4, :cond_7

    iget v3, p0, Ll/ۚ֡ۧ;->ܿ:I

    iget v4, p1, Ll/ۚ֡ۧ;->ܿ:I

    if-ne v3, v4, :cond_7

    :cond_4
    if-ne v0, v1, :cond_5

    if-ne v2, v1, :cond_5

    iget v0, p0, Ll/ۚ֡ۧ;->ܽ:I

    iget v2, p1, Ll/ۚ֡ۧ;->ܽ:I

    if-ne v0, v2, :cond_7

    iget v0, p0, Ll/ۚ֡ۧ;->ᩳ:I

    iget v2, p1, Ll/ۚ֡ۧ;->ᩳ:I

    if-ne v0, v2, :cond_7

    :cond_5
    iget-boolean v0, p0, Ll/ۚ֡ۧ;->᩷:Z

    iget-boolean v2, p1, Ll/ۚ֡ۧ;->᩷:Z

    if-ne v0, v2, :cond_7

    if-eqz v0, :cond_6

    iget p0, p0, Ll/ۚ֡ۧ;->ۢ:I

    iget p1, p1, Ll/ۚ֡ۧ;->ۢ:I

    if-eq p0, p1, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_7
    :goto_1
    return v1
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 568
    iput-boolean v0, p0, Ll/ۚ֡ۧ;->ۜ:Z

    .line 569
    iput-boolean v0, p0, Ll/ۚ֡ۧ;->ۡ:Z

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 573
    iput p1, p0, Ll/ۚ֡ۧ;->ᩴ:I

    const/4 p1, 0x1

    .line 574
    iput-boolean p1, p0, Ll/ۚ֡ۧ;->ۜ:Z

    return-void
.end method

.method public final ֫(Ll/ۧ۠֫;IIIIZZZZIIIII)V
    .locals 0

    .line 592
    iput-object p1, p0, Ll/ۚ֡ۧ;->᩵:Ll/ۧ۠֫;

    .line 593
    iput p2, p0, Ll/ۚ֡ۧ;->ܺ:I

    .line 594
    iput p3, p0, Ll/ۚ֡ۧ;->ᩴ:I

    .line 595
    iput p4, p0, Ll/ۚ֡ۧ;->᩻:I

    .line 596
    iput p5, p0, Ll/ۚ֡ۧ;->ۘ:I

    .line 597
    iput-boolean p6, p0, Ll/ۚ֡ۧ;->ܳ:Z

    .line 598
    iput-boolean p7, p0, Ll/ۚ֡ۧ;->ۧ:Z

    .line 599
    iput-boolean p8, p0, Ll/ۚ֡ۧ;->֫:Z

    .line 600
    iput-boolean p9, p0, Ll/ۚ֡ۧ;->᩷:Z

    .line 601
    iput p10, p0, Ll/ۚ֡ۧ;->ۢ:I

    .line 602
    iput p11, p0, Ll/ۚ֡ۧ;->ۖ:I

    .line 603
    iput p12, p0, Ll/ۚ֡ۧ;->ܿ:I

    .line 604
    iput p13, p0, Ll/ۚ֡ۧ;->ܽ:I

    .line 605
    iput p14, p0, Ll/ۚ֡ۧ;->ᩳ:I

    const/4 p1, 0x1

    .line 606
    iput-boolean p1, p0, Ll/ۚ֡ۧ;->ۡ:Z

    .line 607
    iput-boolean p1, p0, Ll/ۚ֡ۧ;->ۜ:Z

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 611
    iget-boolean v0, p0, Ll/ۚ֡ۧ;->ۜ:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۚ֡ۧ;->ᩴ:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
