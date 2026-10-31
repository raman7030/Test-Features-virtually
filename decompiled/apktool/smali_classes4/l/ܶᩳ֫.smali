.class public final Ll/ܶᩳ֫;
.super Ljava/lang/Object;
.source "RB0P"


# instance fields
.field public ֫:I

.field public ۧ:Ll/ۨᩳ֫;

.field public ܳ:I

.field public ܽ:Ll/ۨᩳ֫;

.field public final ܿ:Ll/ۨᩳ֫;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۨᩳ֫;)V
    .locals 1

    .line 646
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 607
    iput v0, p0, Ll/ܶᩳ֫;->ܳ:I

    .line 647
    iput-object p1, p0, Ll/ܶᩳ֫;->ܿ:Ll/ۨᩳ֫;

    .line 648
    iput-object p1, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    return-void
.end method

.method private ܿ()Z
    .locals 3

    .line 739
    iget-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    invoke-virtual {v0}, Ll/ۨᩳ֫;->֫()Ll/֫ܿ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ܿ֫;->᩻()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 743
    :cond_0
    iget v0, p0, Ll/ܶᩳ֫;->ᩳ:I

    const v2, 0xfe0f

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 706
    iput v0, p0, Ll/ܶᩳ֫;->ܳ:I

    .line 707
    iget-object v0, p0, Ll/ܶᩳ֫;->ܿ:Ll/ۨᩳ֫;

    iput-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    const/4 v0, 0x0

    .line 708
    iput v0, p0, Ll/ܶᩳ֫;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 4

    .line 656
    iget-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    invoke-virtual {v0, p1}, Ll/ۨᩳ֫;->֫(I)Ll/ۨᩳ֫;

    move-result-object v0

    .line 657
    iget v1, p0, Ll/ܶᩳ֫;->ܳ:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    if-nez v0, :cond_0

    .line 690
    invoke-direct {p0}, Ll/ܶᩳ֫;->ᩳ()V

    goto :goto_2

    .line 692
    :cond_0
    iput v3, p0, Ll/ܶᩳ֫;->ܳ:I

    .line 693
    iput-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    .line 694
    iput v2, p0, Ll/ܶᩳ֫;->֫:I

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 660
    iput-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    .line 661
    iget v0, p0, Ll/ܶᩳ֫;->֫:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܶᩳ֫;->֫:I

    goto :goto_0

    :cond_2
    const v0, 0xfe0e

    if-ne p1, v0, :cond_3

    .line 665
    invoke-direct {p0}, Ll/ܶᩳ֫;->ᩳ()V

    goto :goto_2

    :cond_3
    const v0, 0xfe0f

    if-ne p1, v0, :cond_4

    :goto_0
    const/4 v2, 0x2

    goto :goto_2

    .line 668
    :cond_4
    iget-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    invoke-virtual {v0}, Ll/ۨᩳ֫;->֫()Ll/֫ܿ֫;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 669
    iget v0, p0, Ll/ܶᩳ֫;->֫:I

    if-ne v0, v2, :cond_6

    .line 670
    invoke-direct {p0}, Ll/ܶᩳ֫;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 671
    iget-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    iput-object v0, p0, Ll/ܶᩳ֫;->ܽ:Ll/ۨᩳ֫;

    .line 673
    invoke-direct {p0}, Ll/ܶᩳ֫;->ᩳ()V

    goto :goto_1

    .line 675
    :cond_5
    invoke-direct {p0}, Ll/ܶᩳ֫;->ᩳ()V

    goto :goto_2

    .line 678
    :cond_6
    iget-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    iput-object v0, p0, Ll/ܶᩳ֫;->ܽ:Ll/ۨᩳ֫;

    .line 680
    invoke-direct {p0}, Ll/ܶᩳ֫;->ᩳ()V

    :goto_1
    const/4 v2, 0x3

    goto :goto_2

    .line 683
    :cond_7
    invoke-direct {p0}, Ll/ܶᩳ֫;->ᩳ()V

    .line 700
    :goto_2
    iput p1, p0, Ll/ܶᩳ֫;->ᩳ:I

    return v2
.end method

.method public final ֫()Ll/֫ܿ֫;
    .locals 1

    .line 723
    iget-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    invoke-virtual {v0}, Ll/ۨᩳ֫;->֫()Ll/֫ܿ֫;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/֫ܿ֫;
    .locals 1

    .line 716
    iget-object v0, p0, Ll/ܶᩳ֫;->ܽ:Ll/ۨᩳ֫;

    invoke-virtual {v0}, Ll/ۨᩳ֫;->֫()Ll/֫ܿ֫;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 734
    iget v0, p0, Ll/ܶᩳ֫;->ܳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll/ܶᩳ֫;->ۧ:Ll/ۨᩳ֫;

    invoke-virtual {v0}, Ll/ۨᩳ֫;->֫()Ll/֫ܿ֫;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ܶᩳ֫;->֫:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 735
    invoke-direct {p0}, Ll/ܶᩳ֫;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
