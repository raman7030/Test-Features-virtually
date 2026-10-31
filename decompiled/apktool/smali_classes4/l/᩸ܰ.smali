.class public final Ll/᩸ܰ;
.super Ljava/lang/Object;
.source "M4Z7"


# static fields
.field public static final ۧ:Ll/᩸ܰ;


# instance fields
.field public final ֫:Ll/֨ܰ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 79
    sget-object v0, Ll/ۚܰ;->֡:Ll/᩸ܰ;

    sput-object v0, Ll/᩸ܰ;->ۧ:Ll/᩸ܰ;

    return-void

    .line 81
    :cond_0
    sget-object v0, Ll/֨ܰ;->ۧ:Ll/᩸ܰ;

    sput-object v0, Ll/᩸ܰ;->ۧ:Ll/᩸ܰ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    new-instance v0, Ll/֨ܰ;

    invoke-direct {v0, p0}, Ll/֨ܰ;-><init>(Ll/᩸ܰ;)V

    iput-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 90
    new-instance v0, Ll/ۚܰ;

    invoke-direct {v0, p0, p1}, Ll/ۚܰ;-><init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    return-void

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 92
    new-instance v0, Ll/֡ܰ;

    invoke-direct {v0, p0, p1}, Ll/֡ܰ;-><init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    return-void

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 94
    new-instance v0, Ll/᩵ܰ;

    invoke-direct {v0, p0, p1}, Ll/᩵ܰ;-><init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    return-void

    .line 96
    :cond_2
    new-instance v0, Ll/ᩴܰ;

    invoke-direct {v0, p0, p1}, Ll/ᩴܰ;-><init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    return-void
.end method

.method public static ֫(Ll/ۧ۬;IIII)Ll/ۧ۬;
    .locals 5

    .line 1337
    iget v0, p0, Ll/ۧ۬;->ۧ:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1338
    iget v2, p0, Ll/ۧ۬;->ᩳ:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1339
    iget v3, p0, Ll/ۧ۬;->ܽ:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1340
    iget v4, p0, Ll/ۧ۬;->֫:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    .line 1344
    :cond_0
    invoke-static {v0, v2, v3, v1}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;
    .locals 1

    .line 168
    new-instance v0, Ll/᩸ܰ;

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    invoke-direct {v0, p1}, Ll/᩸ܰ;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p0, :cond_0

    .line 169
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 171
    invoke-static {p0}, Ll/ܿ᩺;->᩷(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩸ܰ;->֫(Ll/᩸ܰ;)V

    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/᩸ܰ;->֫(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 721
    :cond_0
    instance-of v0, p1, Ll/᩸ܰ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 724
    :cond_1
    check-cast p1, Ll/᩸ܰ;

    .line 725
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    iget-object p1, p1, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    .line 50
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 730
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/֨ܰ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/ۧ۬;
    .locals 1

    .line 668
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0, p1}, Ll/֨ܰ;->֫(I)Ll/ۧ۬;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/᩸ܰ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 506
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->֫()Ll/᩸ܰ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(IIII)Ll/᩸ܰ;
    .locals 1

    .line 651
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/֨ܰ;->֫(IIII)Ll/᩸ܰ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 2112
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0, p1}, Ll/֨ܰ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Ll/ۧ۬;)V
    .locals 1

    .line 1804
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0, p1}, Ll/֨ܰ;->֫(Ll/ۧ۬;)V

    return-void
.end method

.method public final ֫(Ll/᩸ܰ;)V
    .locals 1

    .line 2104
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0, p1}, Ll/֨ܰ;->֫(Ll/᩸ܰ;)V

    return-void
.end method

.method public final ֫([Ll/ۧ۬;)V
    .locals 1

    .line 1706
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0, p1}, Ll/֨ܰ;->֫([Ll/ۧ۬;)V

    return-void
.end method

.method public final ۖ()Z
    .locals 2

    const/16 v0, 0x8

    .line 713
    iget-object v1, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v1, v0}, Ll/֨ܰ;->ܽ(I)Z

    move-result v0

    return v0
.end method

.method public final ۘ()Landroid/view/WindowInsets;
    .locals 2

    .line 741
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    instance-of v1, v0, Ll/ۘܰ;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۘܰ;

    iget-object v0, v0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۜ()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 191
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    iget v0, v0, Ll/ۧ۬;->ۧ:I

    return v0
.end method

.method public final ۡ()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 256
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    sget-object v1, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    invoke-virtual {v0, v1}, Ll/ۧ۬;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۢ()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 207
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    iget v0, v0, Ll/ۧ۬;->ᩳ:I

    return v0
.end method

.method public final ۧ(I)Ll/ۧ۬;
    .locals 1

    .line 696
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0, p1}, Ll/֨ܰ;->ۧ(I)Ll/ۧ۬;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/᩸ܰ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 477
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ۧ()Ll/᩸ܰ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/ۧ۬;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 606
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->᩻()Ll/ۧ۬;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 286
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ۢ()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/᩸ܰ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 318
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ܽ()Ll/᩸ܰ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ll/ۧ۬;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 549
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ܳ()Ll/ۧ۬;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/ۚۛ;
    .locals 1

    .line 490
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ᩳ()Ll/ۚۛ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 223
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    iget v0, v0, Ll/ۧ۬;->ܽ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 239
    iget-object v0, p0, Ll/᩸ܰ;->֫:Ll/֨ܰ;

    invoke-virtual {v0}, Ll/֨ܰ;->ۜ()Ll/ۧ۬;

    move-result-object v0

    iget v0, v0, Ll/ۧ۬;->֫:I

    return v0
.end method
