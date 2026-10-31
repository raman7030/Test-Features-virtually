.class public final Ll/ܰ᩷۠;
.super Ll/۟᩷۠;
.source "O44L"


# instance fields
.field public final synthetic ܽ:Ll/ܳۢ۠;


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;Ll/ۙ֨֨;)V
    .locals 0

    .line 321
    iput-object p1, p0, Ll/ܰ᩷۠;->ܽ:Ll/ܳۢ۠;

    .line 322
    invoke-static {p2}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result p2

    invoke-direct {p0, p1, p2}, Ll/۟᩷۠;-><init>(Ll/ܳۢ۠;I)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "indexed("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ll/᩺ܳ۠;->֫:[Ljava/lang/String;

    iget v2, p0, Ll/۟᩷۠;->ۧ:I

    aget-object v1, v1, v2

    const-string v2, ")"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 2

    .line 339
    iget-object v0, p0, Ll/ܰ᩷۠;->ܽ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 335
    iget-object v0, p0, Ll/ܰ᩷۠;->ܽ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    const/16 v1, 0x5c

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ܰ᩷۠;->ܽ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-static {p1}, Ll/֨᩷۠;->᩵(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    mul-int/lit8 p1, p1, 0x3

    add-int/lit8 p1, p1, 0x5b

    invoke-virtual {v0, p1}, Ll/֨᩷۠;->ܽ(I)V

    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 331
    iget-object v0, p0, Ll/ܰ᩷۠;->ܽ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    add-int/lit8 v1, v1, 0x4f

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    return-void
.end method

.method public final ᩳ()Ll/۟᩷۠;
    .locals 4

    .line 326
    iget-object v0, p0, Ll/ܰ᩷۠;->ܽ:Ll/ܳۢ۠;

    iget-object v1, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    iget v2, p0, Ll/۟᩷۠;->ۧ:I

    add-int/lit8 v3, v2, 0x2e

    invoke-virtual {v1, v3}, Ll/֨᩷۠;->ܽ(I)V

    .line 327
    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object v0, v0, v2

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
