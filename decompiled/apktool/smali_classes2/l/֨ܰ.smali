.class public Ll/֨ܰ;
.super Ljava/lang/Object;
.source "M4Z7"


# static fields
.field public static final ۧ:Ll/᩸ܰ;


# instance fields
.field public final ֫:Ll/᩸ܰ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 747
    new-instance v0, Ll/᩻ܰ;

    invoke-direct {v0}, Ll/᩻ܰ;-><init>()V

    .line 748
    invoke-virtual {v0}, Ll/᩻ܰ;->֫()Ll/᩸ܰ;

    move-result-object v0

    .line 749
    invoke-virtual {v0}, Ll/᩸ܰ;->֫()Ll/᩸ܰ;

    move-result-object v0

    .line 750
    invoke-virtual {v0}, Ll/᩸ܰ;->ۧ()Ll/᩸ܰ;

    move-result-object v0

    .line 751
    invoke-virtual {v0}, Ll/᩸ܰ;->ܽ()Ll/᩸ܰ;

    move-result-object v0

    sput-object v0, Ll/֨ܰ;->ۧ:Ll/᩸ܰ;

    return-void
.end method

.method public constructor <init>(Ll/᩸ܰ;)V
    .locals 0

    .line 755
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 756
    iput-object p1, p0, Ll/֨ܰ;->֫:Ll/᩸ܰ;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 841
    :cond_0
    instance-of v1, p1, Ll/֨ܰ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 842
    :cond_1
    check-cast p1, Ll/֨ܰ;

    .line 843
    invoke-virtual {p0}, Ll/֨ܰ;->ۡ()Z

    move-result v1

    invoke-virtual {p1}, Ll/֨ܰ;->ۡ()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 844
    invoke-virtual {p0}, Ll/֨ܰ;->ۢ()Z

    move-result v1

    invoke-virtual {p1}, Ll/֨ܰ;->ۢ()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 845
    invoke-virtual {p0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v1

    invoke-virtual {p1}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v3

    .line 50
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 846
    invoke-virtual {p0}, Ll/֨ܰ;->ܳ()Ll/ۧ۬;

    move-result-object v1

    invoke-virtual {p1}, Ll/֨ܰ;->ܳ()Ll/ۧ۬;

    move-result-object v3

    .line 50
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 847
    invoke-virtual {p0}, Ll/֨ܰ;->ᩳ()Ll/ۚۛ;

    move-result-object v1

    invoke-virtual {p1}, Ll/֨ܰ;->ᩳ()Ll/ۚۛ;

    move-result-object p1

    .line 50
    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 7

    .line 853
    invoke-virtual {p0}, Ll/֨ܰ;->ۡ()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, Ll/֨ܰ;->ۢ()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v2

    .line 854
    invoke-virtual {p0}, Ll/֨ܰ;->ܳ()Ll/ۧ۬;

    move-result-object v3

    invoke-virtual {p0}, Ll/֨ܰ;->ᩳ()Ll/ۚۛ;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    .line 88
    invoke-static {v5}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public ֫(I)Ll/ۧ۬;
    .locals 0

    .line 822
    sget-object p1, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    return-object p1
.end method

.method public ֫()Ll/᩸ܰ;
    .locals 1

    .line 784
    iget-object v0, p0, Ll/֨ܰ;->֫:Ll/᩸ܰ;

    return-object v0
.end method

.method public ֫(IIII)Ll/᩸ܰ;
    .locals 0

    .line 817
    sget-object p1, Ll/֨ܰ;->ۧ:Ll/᩸ܰ;

    return-object p1
.end method

.method public ֫(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/ۧ۬;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/᩸ܰ;)V
    .locals 0

    return-void
.end method

.method public ֫([Ll/ۧ۬;)V
    .locals 0

    return-void
.end method

.method public ۜ()Ll/ۧ۬;
    .locals 1

    .line 789
    sget-object v0, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    return-object v0
.end method

.method public ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۢ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۧ(I)Ll/ۧ۬;
    .locals 1

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_0

    .line 830
    sget-object p1, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    return-object p1

    .line 828
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unable to query the maximum insets for IME"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۧ()Ll/᩸ܰ;
    .locals 1

    .line 774
    iget-object v0, p0, Ll/֨ܰ;->֫:Ll/᩸ܰ;

    return-object v0
.end method

.method public ܳ()Ll/ۧ۬;
    .locals 1

    .line 794
    sget-object v0, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    return-object v0
.end method

.method public ܽ()Ll/᩸ܰ;
    .locals 1

    .line 769
    iget-object v0, p0, Ll/֨ܰ;->֫:Ll/᩸ܰ;

    return-object v0
.end method

.method public ܽ(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ܿ()Ll/ۧ۬;
    .locals 1

    .line 806
    invoke-virtual {p0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    return-object v0
.end method

.method public ᩳ()Ll/ۚۛ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ᩷()Ll/ۧ۬;
    .locals 1

    .line 812
    invoke-virtual {p0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    return-object v0
.end method

.method public ᩻()Ll/ۧ۬;
    .locals 1

    .line 800
    invoke-virtual {p0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    return-object v0
.end method
