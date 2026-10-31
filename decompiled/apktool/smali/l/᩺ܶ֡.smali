.class public final Ll/᩺ܶ֡;
.super Ljava/lang/Object;
.source "E5GV"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:I

.field public final ᩹:Ll/ᩴۙ֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;Ll/᩺ܶ֡;)V
    .locals 1

    .line 796
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 798
    :cond_0
    iget-object p3, p3, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 209
    iget p3, p3, Ll/ۚۙ֡;->᩹:I

    .line 799
    :goto_0
    iget-object p1, p1, Ll/ۗ᩶֡;->ۢ:Ll/֡ۙ֡;

    .line 800
    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result v0

    add-int/2addr v0, p3

    .line 799
    invoke-virtual {p1, v0}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/ᩴۙ֡;

    iput-object p1, p0, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 801
    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result p1

    iput p1, p0, Ll/᩺ܶ֡;->᩸:I

    return-void
.end method

.method public constructor <init>(Ll/ᩴۙ֡;I)V
    .locals 0

    .line 780
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    iput-object p1, p0, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 782
    iput p2, p0, Ll/᩺ܶ֡;->᩸:I

    return-void
.end method

.method public static ֫(Ll/᩺ܶ֡;ILl/᩺ܶ֡;)I
    .locals 1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    iget-object p2, p2, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    .line 844
    :goto_0
    iget-object v0, p0, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    sub-int/2addr v0, p2

    .line 844
    invoke-static {v0}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p2

    add-int/2addr p2, p1

    .line 846
    iget p0, p0, Ll/᩺ܶ֡;->᩸:I

    invoke-static {p0}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p0

    add-int/2addr p0, p2

    return p0
.end method

.method public static ֫(Ll/᩺ܶ֡;Ll/֫ۗ֡;Ll/᩺ܶ֡;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 815
    :cond_0
    iget-object p2, p2, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    .line 824
    :goto_0
    iget-object v0, p0, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    sub-int/2addr v0, p2

    .line 824
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܳ(I)I

    .line 825
    iget p0, p0, Ll/᩺ܶ֡;->᩸:I

    invoke-virtual {p1, p0}, Ll/֫ۗ֡;->ܳ(I)I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 3

    .line 761
    check-cast p1, Ll/᩺ܶ֡;

    .line 860
    iget-object p1, p1, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 169
    iget-object v0, p0, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    iget-object v1, v0, Ll/ᩴۙ֡;->ۗ:Ll/᩺ۙ֡;

    iget-object v2, p1, Ll/ᩴۙ֡;->ۗ:Ll/᩺ۙ֡;

    invoke-virtual {v1, v2}, Ll/᩺ۙ֡;->֫(Ll/᩺ۙ֡;)I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    .line 174
    :cond_0
    iget-object v1, v0, Ll/ᩴۙ֡;->۬:Ll/ۨۙ֡;

    iget-object v2, p1, Ll/ᩴۙ֡;->۬:Ll/ۨۙ֡;

    invoke-virtual {v1, v2}, Ll/ۨۙ֡;->֫(Ll/ۨۙ֡;)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    .line 179
    :cond_1
    iget-object v0, v0, Ll/ᩴۙ֡;->۫:Ll/᩺ۙ֡;

    iget-object p1, p1, Ll/ᩴۙ֡;->۫:Ll/᩺ۙ֡;

    invoke-virtual {v0, p1}, Ll/᩺ۙ֡;->֫(Ll/᩺ۙ֡;)I

    move-result p1

    return p1
.end method

.method public final ֫()Z
    .locals 2

    .line 871
    sget-object v0, Ll/۟ۙ֡;->۟:Ll/۟ۙ֡;

    invoke-virtual {v0}, Ll/۟ۙ֡;->getValue()I

    move-result v0

    iget v1, p0, Ll/᩺ܶ֡;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 867
    sget-object v0, Ll/۟ۙ֡;->ܳ֫:Ll/۟ۙ֡;

    invoke-virtual {v0}, Ll/۟ۙ֡;->getValue()I

    move-result v0

    iget v1, p0, Ll/᩺ܶ֡;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
