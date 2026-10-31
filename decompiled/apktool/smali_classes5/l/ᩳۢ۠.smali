.class public final Ll/ᩳۢ۠;
.super Ll/۟᩷۠;
.source "O44L"


# instance fields
.field public final synthetic ܽ:Ll/ܳۢ۠;


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;I)V
    .locals 0

    .line 287
    iput-object p1, p0, Ll/ᩳۢ۠;->ܽ:Ll/ܳۢ۠;

    .line 288
    invoke-direct {p0, p1, p2}, Ll/۟᩷۠;-><init>(Ll/ܳۢ۠;I)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "stack("

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
    .locals 3

    .line 300
    iget-object v0, p0, Ll/ᩳۢ۠;->ܽ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    .line 309
    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    invoke-static {v1}, Ll/֨᩷۠;->᩵(I)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/16 v1, 0x58

    goto :goto_0

    :cond_0
    const/16 v1, 0x57

    .line 300
    :goto_0
    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 296
    iget-object v0, p0, Ll/ᩳۢ۠;->ܽ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    .line 309
    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    invoke-static {v1}, Ll/֨᩷۠;->᩵(I)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/16 v1, 0x5c

    goto :goto_0

    :cond_0
    const/16 v1, 0x59

    .line 296
    :goto_0
    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 304
    iget-object v0, p0, Ll/ᩳۢ۠;->ܽ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    .line 309
    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    invoke-static {v1}, Ll/֨᩷۠;->᩵(I)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/16 v1, 0x5b

    goto :goto_0

    :cond_0
    const/16 v1, 0x5a

    .line 305
    :goto_0
    invoke-static {p1}, Ll/֨᩷۠;->᩵(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    mul-int/lit8 p1, p1, 0x3

    add-int/2addr p1, v1

    .line 304
    invoke-virtual {v0, p1}, Ll/֨᩷۠;->ܽ(I)V

    return-void
.end method

.method public final ᩳ()Ll/۟᩷۠;
    .locals 0

    return-object p0
.end method

.method public final ᩻()I
    .locals 1

    .line 309
    iget v0, p0, Ll/۟᩷۠;->ۧ:I

    invoke-static {v0}, Ll/֨᩷۠;->᩵(I)I

    move-result v0

    return v0
.end method
