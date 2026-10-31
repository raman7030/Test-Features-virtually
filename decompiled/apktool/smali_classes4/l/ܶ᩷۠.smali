.class public final Ll/ܶ᩷۠;
.super Ll/ۗ᩷۠;
.source "N44J"


# instance fields
.field public final synthetic ֫:Ll/۬᩷۠;

.field public final synthetic ۧ:Ll/֫ۢ۠;

.field public final synthetic ܽ:Ll/֫ۤ֨;


# direct methods
.method public constructor <init>(Ll/۬᩷۠;Ll/֫ۤ֨;Ll/֫ۢ۠;)V
    .locals 0

    .line 2452
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1459
    iput-object p1, p0, Ll/ܶ᩷۠;->֫:Ll/۬᩷۠;

    iput-object p2, p0, Ll/ܶ᩷۠;->ܽ:Ll/֫ۤ֨;

    iput-object p3, p0, Ll/ܶ᩷۠;->ۧ:Ll/֫ۢ۠;

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 2

    .line 1461
    invoke-virtual {p0}, Ll/ܶ᩷۠;->ܽ()V

    .line 1462
    iget-object v0, p0, Ll/ܶ᩷۠;->ܽ:Ll/֫ۤ֨;

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

    .line 1463
    check-cast v0, Ll/ۙ᩷۠;

    iget-object v0, v0, Ll/ۙ᩷۠;->ᩳ:Ll/ᩴܶ۠;

    iget-object v1, p0, Ll/ܶ᩷۠;->֫:Ll/۬᩷۠;

    invoke-static {v1}, Ll/۬᩷۠;->֫(Ll/۬᩷۠;)Ll/֨᩷۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨᩷۠;->ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ()V
    .locals 5

    .line 1466
    iget-object v0, p0, Ll/ܶ᩷۠;->֫:Ll/۬᩷۠;

    invoke-static {v0}, Ll/۬᩷۠;->֫(Ll/۬᩷۠;)Ll/֨᩷۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨᩷۠;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1467
    iget-object v1, p0, Ll/ܶ᩷۠;->ۧ:Ll/֫ۢ۠;

    invoke-virtual {v1}, Ll/֫ۢ۠;->ᩳ()Ll/۟᩷۠;

    .line 1468
    invoke-static {v0}, Ll/۬᩷۠;->֫(Ll/۬᩷۠;)Ll/֨᩷۠;

    move-result-object v2

    const/16 v3, 0xc3

    invoke-virtual {v2, v3}, Ll/֨᩷۠;->ܽ(I)V

    .line 1469
    invoke-static {v0}, Ll/۬᩷۠;->֫(Ll/۬᩷۠;)Ll/֨᩷۠;

    move-result-object v0

    iget-object v0, v0, Ll/֨᩷۠;->ۛ:Ll/ۚ᩷۠;

    iget v1, v1, Ll/֫ۢ۠;->ܽ:I

    .line 1698
    iget v2, v0, Ll/ۚ᩷۠;->᩶:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iput v2, v0, Ll/ۚ᩷۠;->᩶:I

    .line 1699
    iget-object v4, v0, Ll/ۚ᩷۠;->᩹:[I

    aget v2, v4, v2

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Ll/۫ۙ;->֫(Z)V

    .line 1700
    iget-object v1, v0, Ll/ۚ᩷۠;->᩹:[I

    iget v0, v0, Ll/ۚ᩷۠;->᩶:I

    const/4 v2, -0x1

    aput v2, v1, v0

    :cond_1
    return-void
.end method
