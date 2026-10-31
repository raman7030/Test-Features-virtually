.class public final Ll/ܰܶ֡;
.super Ljava/lang/Object;
.source "E5GV"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:Ll/᩹ۙ֡;

.field public final ᩸:I

.field public final ᩹:Ll/ۘ᩶֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;Ll/۫ۙ֡;Ll/ۧۗ֡;Ll/ܰܶ֡;)V
    .locals 1

    .line 927
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p4, :cond_0

    const/4 p4, 0x0

    goto :goto_0

    .line 929
    :cond_0
    iget-object p4, p4, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 209
    iget p4, p4, Ll/ۚۙ֡;->᩹:I

    .line 930
    :goto_0
    iget-object p1, p1, Ll/ۗ᩶֡;->ۖ:Ll/֡ۙ֡;

    .line 931
    invoke-virtual {p3}, Ll/ۧۗ֡;->ܳ()I

    move-result v0

    add-int/2addr v0, p4

    .line 930
    invoke-virtual {p1, v0}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/᩹ۙ֡;

    iput-object p1, p0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 932
    invoke-virtual {p3}, Ll/ۧۗ֡;->ܳ()I

    move-result p1

    iput p1, p0, Ll/ܰܶ֡;->᩸:I

    .line 937
    sget-object p1, Ll/ܶۙ֡;->ܰ:Ll/ܶۙ֡;

    .line 940
    invoke-virtual {p3}, Ll/ۧۗ֡;->ܳ()I

    move-result p3

    .line 938
    invoke-virtual {p2, p1, p3}, Ll/۫ۙ֡;->ۧ(Ll/ܶۙ֡;I)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/ۘ᩶֡;

    iput-object p1, p0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    if-eqz p1, :cond_1

    .line 943
    invoke-virtual {p1, p0}, Ll/ۘ᩶֡;->֫(Ll/ܰܶ֡;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Ll/᩹ۙ֡;ILl/ۘ᩶֡;)V
    .locals 0

    .line 905
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 906
    iput-object p1, p0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 907
    iput p2, p0, Ll/ܰܶ֡;->᩸:I

    .line 908
    iput-object p3, p0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    if-eqz p3, :cond_0

    .line 910
    invoke-virtual {p3, p0}, Ll/ۘ᩶֡;->֫(Ll/ܰܶ֡;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܰܶ֡;ILl/ܰܶ֡;)I
    .locals 1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 995
    iget-object p2, p2, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    .line 997
    :goto_0
    iget-object v0, p0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    sub-int/2addr v0, p2

    .line 997
    invoke-static {v0}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p2

    add-int/2addr p2, p1

    .line 999
    iget p1, p0, Ll/ܰܶ֡;->᩸:I

    invoke-static {p1}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p1

    add-int/2addr p1, p2

    .line 1000
    iget-object p0, p0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    .line 202
    :cond_1
    iget p0, p0, Ll/ۚۙ֡;->᩶:I

    .line 1001
    invoke-static {p0}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p0

    :goto_1
    add-int/2addr p1, p0

    return p1
.end method

.method public static ֫(Ll/ܰܶ֡;Ll/֫ۗ֡;Ll/ܰܶ֡;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 958
    :cond_0
    iget-object p2, p2, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    .line 975
    :goto_0
    iget-object v1, p0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 209
    iget v1, v1, Ll/ۚۙ֡;->᩹:I

    sub-int/2addr v1, p2

    .line 975
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܳ(I)I

    .line 976
    iget p2, p0, Ll/ܰܶ֡;->᩸:I

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ܳ(I)I

    .line 977
    iget-object p0, p0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    if-nez p0, :cond_1

    goto :goto_1

    .line 202
    :cond_1
    iget v0, p0, Ll/ۚۙ֡;->᩶:I

    .line 977
    :goto_1
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܳ(I)I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 876
    check-cast p1, Ll/ܰܶ֡;

    .line 1015
    iget-object v0, p0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    iget-object p1, p1, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    invoke-virtual {v0, p1}, Ll/᩹ۙ֡;->֫(Ll/᩹ۙ֡;)I

    move-result p1

    return p1
.end method

.method public final ֫()Z
    .locals 2

    .line 1022
    sget-object v0, Ll/۟ۙ֡;->ܳ֫:Ll/۟ۙ֡;

    invoke-virtual {v0}, Ll/۟ۙ֡;->getValue()I

    move-result v0

    sget-object v1, Ll/۟ۙ֡;->ܽ֫:Ll/۟ۙ֡;

    .line 1023
    invoke-virtual {v1}, Ll/۟ۙ֡;->getValue()I

    move-result v1

    or-int/2addr v0, v1

    sget-object v1, Ll/۟ۙ֡;->ۨ:Ll/۟ۙ֡;

    .line 1024
    invoke-virtual {v1}, Ll/۟ۙ֡;->getValue()I

    move-result v1

    or-int/2addr v0, v1

    iget v1, p0, Ll/ܰܶ֡;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
