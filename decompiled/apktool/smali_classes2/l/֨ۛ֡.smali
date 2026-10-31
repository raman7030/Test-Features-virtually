.class public final Ll/֨ۛ֡;
.super Ljava/lang/Object;
.source "M605"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:I

.field public ܿ:I

.field public final synthetic ᩳ:Ll/۠ۛ֡;


# direct methods
.method public constructor <init>(Ll/۠ۛ֡;I)V
    .locals 0

    .line 626
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    .line 627
    iput p2, p0, Ll/֨ۛ֡;->ܽ:I

    return-void
.end method

.method private ֫()I
    .locals 4

    .line 678
    iget v0, p0, Ll/֨ۛ֡;->֫:I

    if-nez v0, :cond_1

    .line 679
    iget-object v0, p0, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    iget-object v1, v0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/֨ۛ֡;->ۧ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v1

    const/4 v2, 0x0

    .line 680
    :goto_0
    invoke-static {v0}, Ll/۠ۛ֡;->ۧ(Ll/۠ۛ֡;)I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 681
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ܺ()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 683
    :cond_0
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v0

    iput v0, p0, Ll/֨ۛ֡;->֫:I

    .line 685
    :cond_1
    iget v0, p0, Ll/֨ۛ֡;->֫:I

    return v0
.end method

.method public static ֫(Ll/֨ۛ֡;)Ljava/util/Iterator;
    .locals 4

    .line 689
    new-instance v0, Ll/֡ۛ֡;

    iget-object v1, p0, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    iget-object v2, v1, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    .line 690
    invoke-direct {p0}, Ll/֨ۛ֡;->֫()I

    move-result v3

    invoke-static {v1}, Ll/۠ۛ֡;->֫(Ll/۠ۛ֡;)I

    move-result v1

    invoke-direct {v0, p0, v2, v3, v1}, Ll/֡ۛ֡;-><init>(Ll/֨ۛ֡;Ll/۬ۛ֡;II)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/֨ۛ֡;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨ۛ֡;->֫:I

    return-void
.end method

.method private ۧ()I
    .locals 4

    .line 649
    iget v0, p0, Ll/֨ۛ֡;->ۧ:I

    if-nez v0, :cond_1

    .line 650
    iget-object v0, p0, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    iget-object v1, v0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/֨ۛ֡;->ܽ:I

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v1

    const/4 v2, 0x0

    .line 651
    :goto_0
    invoke-static {v0}, Ll/۠ۛ֡;->ܽ(Ll/۠ۛ֡;)I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 652
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ܺ()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 654
    :cond_0
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v0

    iput v0, p0, Ll/֨ۛ֡;->ۧ:I

    .line 656
    :cond_1
    iget v0, p0, Ll/֨ۛ֡;->ۧ:I

    return v0
.end method

.method public static ۧ(Ll/֨ۛ֡;)Ljava/util/Iterator;
    .locals 4

    .line 660
    new-instance v0, Ll/᩵ۛ֡;

    iget-object v1, p0, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    iget-object v2, v1, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    .line 661
    invoke-direct {p0}, Ll/֨ۛ֡;->ۧ()I

    move-result v3

    invoke-static {v1}, Ll/۠ۛ֡;->ۧ(Ll/۠ۛ֡;)I

    move-result v1

    invoke-direct {v0, p0, v2, v3, v1}, Ll/᩵ۛ֡;-><init>(Ll/֨ۛ֡;Ll/۬ۛ֡;II)V

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/֨ۛ֡;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨ۛ֡;->ۧ:I

    return-void
.end method

.method public static ܽ(Ll/֨ۛ֡;)Ll/᩸۟֡;
    .locals 4

    .line 631
    new-instance v0, Ll/ᩴۛ֡;

    iget-object v1, p0, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    iget-object v2, v1, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    iget v3, p0, Ll/֨ۛ֡;->ܽ:I

    invoke-static {v1}, Ll/۠ۛ֡;->ܽ(Ll/۠ۛ֡;)I

    move-result v1

    invoke-direct {v0, p0, v2, v3, v1}, Ll/ᩴۛ֡;-><init>(Ll/֨ۛ֡;Ll/۬ۛ֡;II)V

    return-object v0
.end method

.method public static bridge synthetic ܽ(Ll/֨ۛ֡;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨ۛ֡;->ܿ:I

    return-void
.end method

.method public static ᩳ(Ll/֨ۛ֡;)Ljava/util/Iterator;
    .locals 6

    .line 718
    new-instance v0, Ll/ۚۛ֡;

    iget-object v1, p0, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    iget-object v2, v1, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    .line 707
    iget v3, p0, Ll/֨ۛ֡;->ܿ:I

    if-nez v3, :cond_1

    .line 708
    invoke-virtual {v2}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v3

    invoke-direct {p0}, Ll/֨ۛ֡;->֫()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v3

    const/4 v4, 0x0

    .line 709
    :goto_0
    invoke-static {v1}, Ll/۠ۛ֡;->֫(Ll/۠ۛ֡;)I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 710
    invoke-virtual {v3}, Ll/ᩴۨ֡;->ܺ()I

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 712
    :cond_0
    invoke-virtual {v3}, Ll/ᩴۨ֡;->ۧ()I

    move-result v3

    iput v3, p0, Ll/֨ۛ֡;->ܿ:I

    .line 714
    :cond_1
    iget p0, p0, Ll/֨ۛ֡;->ܿ:I

    .line 719
    invoke-static {v1}, Ll/۠ۛ֡;->ܿ(Ll/۠ۛ֡;)I

    move-result v1

    invoke-direct {v0, v2, p0, v1}, Ll/ۚۛ֡;-><init>(Ll/۬ۛ֡;II)V

    return-object v0
.end method
