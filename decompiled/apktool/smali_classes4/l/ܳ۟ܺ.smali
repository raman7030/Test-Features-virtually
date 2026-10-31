.class public final Ll/ܳ۟ܺ;
.super Ll/ۘ۟ܺ;
.source "57R8"

# interfaces
.implements Ll/۫۟ܺ;


# static fields
.field public static final synthetic ܰ:I


# instance fields
.field public ۛ:I

.field public final ۤ:Ljava/lang/String;

.field public final ۨ:Ll/ܽ۫ᩴ;

.field public final ۫:Ll/᩻۟ܺ;

.field public ۬:Z

.field public final ᩺:Ll/۠۟ܺ;


# direct methods
.method public constructor <init>(Ll/᩻۟ܺ;Ljava/lang/String;Ll/۠۟ܺ;Ll/ܽ۫ᩴ;)V
    .locals 0

    .line 591
    invoke-direct {p0}, Ll/ۘ۟ܺ;-><init>()V

    .line 592
    iput-object p1, p0, Ll/ܳ۟ܺ;->۫:Ll/᩻۟ܺ;

    .line 593
    iput-object p2, p0, Ll/ܳ۟ܺ;->ۤ:Ljava/lang/String;

    .line 594
    iput-object p3, p0, Ll/ܳ۟ܺ;->᩺:Ll/۠۟ܺ;

    .line 595
    iput-object p4, p0, Ll/ܳ۟ܺ;->ۨ:Ll/ܽ۫ᩴ;

    return-void
.end method

.method public static ֫(Ll/᩻۟ܺ;Ljava/lang/String;Ll/۠۟ܺ;Ll/ܽ۫ᩴ;)Ll/ܳ۟ܺ;
    .locals 1

    .line 621
    new-instance v0, Ll/ܳ۟ܺ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܳ۟ܺ;-><init>(Ll/᩻۟ܺ;Ljava/lang/String;Ll/۠۟ܺ;Ll/ܽ۫ᩴ;)V

    return-object v0
.end method

.method public static ֫(Ll/᩻۟ܺ;Ll/۠۟ܺ;)Ll/ܳ۟ܺ;
    .locals 3

    .line 607
    new-instance v0, Ll/ܳ۟ܺ;

    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object v1

    const-string v2, ""

    invoke-direct {v0, p0, v2, p1, v1}, Ll/ܳ۟ܺ;-><init>(Ll/᩻۟ܺ;Ljava/lang/String;Ll/۠۟ܺ;Ll/ܽ۫ᩴ;)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ܳ۟ܺ;)Ll/᩻۟ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ۟ܺ;->۫:Ll/᩻۟ܺ;

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 718
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "fillMode"

    iget-object v2, p0, Ll/ܳ۟ܺ;->۫:Ll/᩻۟ܺ;

    .line 719
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "flat"

    iget-object v2, p0, Ll/ܳ۟ܺ;->ۤ:Ljava/lang/String;

    .line 720
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "plusIndent"

    iget-object v2, p0, Ll/ܳ۟ܺ;->᩺:Ll/۠۟ܺ;

    .line 721
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "optTag"

    iget-object v2, p0, Ll/ܳ۟ܺ;->ۨ:Ll/ܽ۫ᩴ;

    .line 722
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 723
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 663
    iget-object v0, p0, Ll/ܳ۟ܺ;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ۢ۟ܺ;IZ)Ll/ۢ۟ܺ;
    .locals 2

    .line 682
    iget-object v0, p0, Ll/ܳ۟ܺ;->ۨ:Ll/ܽ۫ᩴ;

    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 683
    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟۟ܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v1

    iput-object v1, v0, Ll/۟۟ܺ;->֫:Ll/ܽ۫ᩴ;

    :cond_0
    const/4 v0, 0x0

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    .line 687
    iput-boolean p3, p0, Ll/ܳ۟ܺ;->۬:Z

    .line 688
    iget-object p3, p0, Ll/ܳ۟ܺ;->᩺:Ll/۠۟ܺ;

    invoke-virtual {p3}, Ll/۠۟ܺ;->֫()I

    move-result p3

    add-int/2addr p2, p3

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, p0, Ll/ܳ۟ܺ;->ۛ:I

    .line 689
    invoke-virtual {p1, p2}, Ll/ۢ۟ܺ;->֫(I)Ll/ۢ۟ܺ;

    move-result-object p1

    return-object p1

    .line 691
    :cond_1
    iput-boolean v0, p0, Ll/ܳ۟ܺ;->۬:Z

    const/4 p2, -0x1

    .line 692
    iput p2, p0, Ll/ܳ۟ܺ;->ۛ:I

    .line 693
    iget p2, p1, Ll/ۢ۟ܺ;->֫:I

    iget-object p3, p0, Ll/ܳ۟ܺ;->ۤ:Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ll/ۢ۟ܺ;->֫(I)Ll/ۢ۟ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;)Ll/ۢ۟ܺ;
    .locals 0

    .line 703
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Did you mean computeBreaks(State, int, boolean)?"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ᩴ۟ܺ;)V
    .locals 0

    .line 653
    invoke-virtual {p1, p0}, Ll/ᩴ۟ܺ;->֫(Ll/ܳ۟ܺ;)V

    return-void
.end method

.method public final ֫(Ll/ᩴۧۖ;)V
    .locals 2

    .line 708
    iget-boolean v0, p0, Ll/ܳ۟ܺ;->۬:Z

    if-eqz v0, :cond_0

    const-string v0, "\n"

    .line 709
    invoke-static {}, Ll/ۘ۟ܺ;->᩻()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ll/ᩴۧۖ;->֫(Ll/ܰۤܺ;Ljava/lang/String;)V

    .line 710
    iget v0, p0, Ll/ܳ۟ܺ;->ۛ:I

    invoke-virtual {p1, v0}, Ll/ᩴۧۖ;->ܽ(I)V

    return-void

    .line 712
    :cond_0
    iget-object v0, p0, Ll/ܳ۟ܺ;->ۤ:Ljava/lang/String;

    invoke-virtual {p0}, Ll/ۘ۟ܺ;->ܳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ll/ᩴۧۖ;->֫(Ll/ܰۤܺ;Ljava/lang/String;)V

    return-void
.end method

.method public final ۢ()Z
    .locals 2

    .line 648
    iget-object v0, p0, Ll/ܳ۟ܺ;->۫:Ll/᩻۟ܺ;

    sget-object v1, Ll/᩻۟ܺ;->᩹:Ll/᩻۟ܺ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ll/ܰۤܺ;
    .locals 1

    .line 668
    invoke-static {}, Ll/ۘ۟ܺ;->᩻()Ll/ܰۤܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 658
    invoke-virtual {p0}, Ll/ܳ۟ܺ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x3e8

    return v0

    :cond_0
    iget-object v0, p0, Ll/ܳ۟ܺ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 639
    iget-object v0, p0, Ll/ܳ۟ܺ;->᩺:Ll/۠۟ܺ;

    invoke-virtual {v0}, Ll/۠۟ܺ;->֫()I

    move-result v0

    return v0
.end method
