.class public final Ll/᩻ܰ;
.super Ljava/lang/Object;
.source "M4Z7"


# instance fields
.field public final ֫:Ll/ۖܰ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1400
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 1401
    new-instance v0, Ll/ܺܰ;

    invoke-direct {v0}, Ll/ܺܰ;-><init>()V

    iput-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    return-void

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 1403
    new-instance v0, Ll/ۡܰ;

    invoke-direct {v0}, Ll/ۡܰ;-><init>()V

    iput-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    return-void

    .line 1405
    :cond_1
    new-instance v0, Ll/ۜܰ;

    invoke-direct {v0}, Ll/ۜܰ;-><init>()V

    iput-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    return-void
.end method

.method public constructor <init>(Ll/᩸ܰ;)V
    .locals 2

    .line 1416
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1417
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 1418
    new-instance v0, Ll/ܺܰ;

    invoke-direct {v0, p1}, Ll/ܺܰ;-><init>(Ll/᩸ܰ;)V

    iput-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    return-void

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 1420
    new-instance v0, Ll/ۡܰ;

    invoke-direct {v0, p1}, Ll/ۡܰ;-><init>(Ll/᩸ܰ;)V

    iput-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    return-void

    .line 1422
    :cond_1
    new-instance v0, Ll/ۜܰ;

    invoke-direct {v0, p1}, Ll/ۜܰ;-><init>(Ll/᩸ܰ;)V

    iput-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩸ܰ;
    .locals 1

    .line 1613
    iget-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    invoke-virtual {v0}, Ll/ۖܰ;->ۧ()Ll/᩸ܰ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILl/ۧ۬;)V
    .locals 1

    .line 1524
    iget-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    invoke-virtual {v0, p1, p2}, Ll/ۖܰ;->֫(ILl/ۧ۬;)V

    return-void
.end method

.method public final ֫(Ll/ۧ۬;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1587
    iget-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    invoke-virtual {v0, p1}, Ll/ۖܰ;->ۧ(Ll/ۧ۬;)V

    return-void
.end method

.method public final ۧ(Ll/ۧ۬;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1442
    iget-object v0, p0, Ll/᩻ܰ;->֫:Ll/ۖܰ;

    invoke-virtual {v0, p1}, Ll/ۖܰ;->ᩳ(Ll/ۧ۬;)V

    return-void
.end method
