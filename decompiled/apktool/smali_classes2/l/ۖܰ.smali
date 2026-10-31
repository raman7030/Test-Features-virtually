.class public Ll/ۖܰ;
.super Ljava/lang/Object;
.source "M4Z7"


# instance fields
.field public final ֫:Ll/᩸ܰ;

.field public ۧ:[Ll/ۧ۬;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1623
    new-instance v0, Ll/᩸ܰ;

    invoke-direct {v0}, Ll/᩸ܰ;-><init>()V

    invoke-direct {p0, v0}, Ll/ۖܰ;-><init>(Ll/᩸ܰ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩸ܰ;)V
    .locals 0

    .line 1626
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1627
    iput-object p1, p0, Ll/ۖܰ;->֫:Ll/᩸ܰ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 1672
    iget-object v0, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 1673
    aget-object v1, v0, v1

    const/4 v2, 0x1

    .line 1674
    aget-object v0, v0, v2

    .line 1678
    iget-object v3, p0, Ll/ۖܰ;->֫:Ll/᩸ܰ;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    .line 1679
    invoke-virtual {v3, v0}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v0

    :cond_0
    if-nez v1, :cond_1

    .line 1682
    invoke-virtual {v3, v2}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v1

    .line 1685
    :cond_1
    invoke-static {v1, v0}, Ll/ۧ۬;->֫(Ll/ۧ۬;Ll/ۧ۬;)Ll/ۧ۬;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۖܰ;->ᩳ(Ll/ۧ۬;)V

    .line 1687
    iget-object v0, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    const/16 v1, 0x10

    invoke-static {v1}, Ll/۠ܰ;->֫(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    .line 1688
    invoke-virtual {p0, v0}, Ll/ۖܰ;->ܽ(Ll/ۧ۬;)V

    .line 1690
    :cond_2
    iget-object v0, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    const/16 v1, 0x20

    invoke-static {v1}, Ll/۠ܰ;->֫(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    .line 1691
    invoke-virtual {p0, v0}, Ll/ۖܰ;->֫(Ll/ۧ۬;)V

    .line 1693
    :cond_3
    iget-object v0, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    const/16 v1, 0x40

    invoke-static {v1}, Ll/۠ܰ;->֫(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    .line 1694
    invoke-virtual {p0, v0}, Ll/ۖܰ;->ܿ(Ll/ۧ۬;)V

    :cond_4
    return-void
.end method

.method public ֫(ILl/ۧ۬;)V
    .locals 3

    .line 1644
    iget-object v0, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [Ll/ۧ۬;

    .line 1645
    iput-object v0, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    and-int v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_1

    .line 1651
    :cond_1
    iget-object v1, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    invoke-static {v0}, Ll/۠ܰ;->֫(I)I

    move-result v2

    aput-object p2, v1, v2

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public ֫(Ll/ۧ۬;)V
    .locals 0

    return-void
.end method

.method public ۧ()Ll/᩸ܰ;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public ۧ(Ll/ۧ۬;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ܽ(Ll/ۧ۬;)V
    .locals 0

    return-void
.end method

.method public ܿ(Ll/ۧ۬;)V
    .locals 0

    return-void
.end method

.method public ᩳ(Ll/ۧ۬;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
