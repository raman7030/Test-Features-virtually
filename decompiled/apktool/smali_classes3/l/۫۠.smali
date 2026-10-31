.class public final Ll/۫۠;
.super Ljava/lang/Object;
.source "D1JP"


# static fields
.field public static ֫:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    .line 52
    sput-object v0, Ll/۫۠;->֫:[Z

    return-void
.end method

.method public static ֫(Ll/᩸۠;Ll/ܿ۠;Ll/ܶ۠;)V
    .locals 10

    const/4 v0, -0x1

    .line 65
    iput v0, p2, Ll/ܶ۠;->᩹:I

    iget-object v1, p2, Ll/ܶ۠;->ۜ:Ll/ۚ۠;

    iget-object v2, p2, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v3, p2, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v4, p2, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v5, p2, Ll/ܶ۠;->۫:Ll/ۚ۠;

    .line 66
    iput v0, p2, Ll/ܶ۠;->۠֫:I

    .line 67
    iget-object v0, p0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v6, 0x0

    aget-object v0, v0, v6

    sget-object v7, Ll/۠۠;->ۗ:Ll/۠۠;

    const/4 v8, 0x2

    if-eq v0, v7, :cond_0

    iget-object v0, p2, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v0, v0, v6

    sget-object v6, Ll/۠۠;->ۙ:Ll/۠۠;

    if-ne v0, v6, :cond_0

    .line 70
    iget v0, v5, Ll/ۚ۠;->ܿ:I

    .line 71
    invoke-virtual {p0}, Ll/ܶ۠;->ܶ()I

    move-result v6

    iget v9, v4, Ll/ۚ۠;->ܿ:I

    sub-int/2addr v6, v9

    .line 73
    invoke-virtual {p1, v5}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v9

    iput-object v9, v5, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    .line 74
    invoke-virtual {p1, v4}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v9

    iput-object v9, v4, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    .line 75
    iget-object v5, v5, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, v5, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 76
    iget-object v4, v4, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, v4, v6}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 77
    iput v8, p2, Ll/ܶ۠;->᩹:I

    .line 1443
    iput v0, p2, Ll/ܶ۠;->᩶֫:I

    sub-int/2addr v6, v0

    .line 1444
    iput v6, p2, Ll/ܶ۠;->᩹֫:I

    .line 1445
    iget v0, p2, Ll/ܶ۠;->᩷֫:I

    if-ge v6, v0, :cond_0

    .line 1446
    iput v0, p2, Ll/ܶ۠;->᩹֫:I

    .line 80
    :cond_0
    iget-object v0, p0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v4, 0x1

    aget-object v0, v0, v4

    if-eq v0, v7, :cond_3

    iget-object v0, p2, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v0, v0, v4

    sget-object v4, Ll/۠۠;->ۙ:Ll/۠۠;

    if-ne v0, v4, :cond_3

    .line 83
    iget v0, v3, Ll/ۚ۠;->ܿ:I

    .line 84
    invoke-virtual {p0}, Ll/ܶ۠;->ۜ()I

    move-result p0

    iget v4, v2, Ll/ۚ۠;->ܿ:I

    sub-int/2addr p0, v4

    .line 86
    invoke-virtual {p1, v3}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v4

    iput-object v4, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    .line 87
    invoke-virtual {p1, v2}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v4

    iput-object v4, v2, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    .line 88
    iget-object v3, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, v3, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 89
    iget-object v2, v2, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, v2, p0}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 90
    iget v2, p2, Ll/ܶ۠;->᩷:I

    if-gtz v2, :cond_1

    invoke-virtual {p2}, Ll/ܶ۠;->۠()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_2

    .line 91
    :cond_1
    invoke-virtual {p1, v1}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v2

    iput-object v2, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    .line 92
    iget v1, p2, Ll/ܶ۠;->᩷:I

    add-int/2addr v1, v0

    invoke-virtual {p1, v2, v1}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 94
    :cond_2
    iput v8, p2, Ll/ܶ۠;->۠֫:I

    .line 1457
    iput v0, p2, Ll/ܶ۠;->ۙ֫:I

    sub-int/2addr p0, v0

    .line 1458
    iput p0, p2, Ll/ܶ۠;->֨:I

    .line 1459
    iget p1, p2, Ll/ܶ۠;->ۜ֫:I

    if-ge p0, p1, :cond_3

    .line 1460
    iput p1, p2, Ll/ܶ۠;->֨:I

    :cond_3
    return-void
.end method

.method public static final ֫(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
