.class public final Ll/᩸᩷۠;
.super Ll/ۗ᩷۠;
.source "N44J"


# instance fields
.field public final synthetic ֫:Ll/۬᩷۠;

.field public final synthetic ۧ:Ll/֫ۤ֨;

.field public final synthetic ܽ:Ll/ۧۚ۠;

.field public final synthetic ᩳ:Ll/֫ۤ֨;


# direct methods
.method public constructor <init>(Ll/۬᩷۠;Ll/֫ۤ֨;Ll/ۧۚ۠;Ll/֫ۤ֨;)V
    .locals 0

    .line 2452
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1483
    iput-object p1, p0, Ll/᩸᩷۠;->֫:Ll/۬᩷۠;

    iput-object p2, p0, Ll/᩸᩷۠;->ᩳ:Ll/֫ۤ֨;

    iput-object p3, p0, Ll/᩸᩷۠;->ܽ:Ll/ۧۚ۠;

    iput-object p4, p0, Ll/᩸᩷۠;->ۧ:Ll/֫ۤ֨;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 1499
    iget-object v0, p0, Ll/᩸᩷۠;->ܽ:Ll/ۧۚ۠;

    iget-object v0, v0, Ll/ۧۚ۠;->۫:Ll/ۖ᩵۠;

    if-eqz v0, :cond_0

    iget-wide v0, v0, Ll/ۖ᩵۠;->۬:J

    const-wide/32 v2, 0x20000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 1502
    iget-object v0, p0, Ll/᩸᩷۠;->ᩳ:Ll/֫ۤ֨;

    iget-object v0, v0, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/ۙ᩷۠;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/ۙ᩷۠;->ܽ:Ll/ۗ᩷۠;

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 1485
    iget-object v0, p0, Ll/᩸᩷۠;->ᩳ:Ll/֫ۤ֨;

    iget-object v0, v0, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll/ۙ᩷۠;

    iget-object v1, v1, Ll/ۙ᩷۠;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v1}, Ll/ᩴܶ۠;->ۧ()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 1486
    check-cast v0, Ll/ۙ᩷۠;

    iget-object v0, v0, Ll/ۙ᩷۠;->ᩳ:Ll/ᩴܶ۠;

    iget-object v1, p0, Ll/᩸᩷۠;->֫:Ll/۬᩷۠;

    invoke-static {v1}, Ll/۬᩷۠;->֫(Ll/۬᩷۠;)Ll/֨᩷۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨᩷۠;->ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1487
    invoke-virtual {p0}, Ll/᩸᩷۠;->ܽ()V

    return-void
.end method

.method public final ܽ()V
    .locals 4

    .line 1490
    iget-object v0, p0, Ll/᩸᩷۠;->ܽ:Ll/ۧۚ۠;

    iget-object v0, v0, Ll/ۧۚ۠;->۫:Ll/ۖ᩵۠;

    if-eqz v0, :cond_0

    .line 1491
    iget-object v1, p0, Ll/᩸᩷۠;->ۧ:Ll/֫ۤ֨;

    const/4 v2, 0x2

    iget-object v3, p0, Ll/᩸᩷۠;->֫:Ll/۬᩷۠;

    invoke-virtual {v3, v0, v1, v2}, Ll/۬᩷۠;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;I)V

    :cond_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 1494
    iget-object v0, p0, Ll/᩸᩷۠;->ܽ:Ll/ۧۚ۠;

    iget-object v0, v0, Ll/ۧۚ۠;->۫:Ll/ۖ᩵۠;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
