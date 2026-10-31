.class public final Ll/֫ۢ۠;
.super Ll/۟᩷۠;
.source "O44L"


# instance fields
.field public ܽ:I

.field public ܿ:Ll/ۙ֨֨;

.field public final synthetic ᩳ:Ll/ܳۢ۠;


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;Ll/ۙ֨֨;I)V
    .locals 1

    .line 390
    iput-object p1, p0, Ll/֫ۢ۠;->ᩳ:Ll/ܳۢ۠;

    .line 391
    invoke-static {p2}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Ll/۟᩷۠;-><init>(Ll/ܳۢ۠;I)V

    if-ltz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 392
    :goto_0
    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    .line 393
    iput-object p2, p0, Ll/֫ۢ۠;->ܿ:Ll/ۙ֨֨;

    .line 394
    iput p3, p0, Ll/֫ۢ۠;->ܽ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "localItem(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֫ۢ۠;->ܿ:Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; reg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֫ۢ۠;->ܽ:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()V
    .locals 4

    const/4 v0, 0x3

    .line 406
    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    iget-object v2, p0, Ll/֫ۢ۠;->ᩳ:Ll/ܳۢ۠;

    iget v3, p0, Ll/֫ۢ۠;->ܽ:I

    if-gt v3, v0, :cond_0

    .line 407
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-static {v1}, Ll/֨᩷۠;->ᩴ(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    add-int/lit8 v1, v1, 0x3b

    add-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    goto :goto_0

    .line 409
    :cond_0
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-static {v1}, Ll/֨᩷۠;->ᩴ(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x36

    invoke-virtual {v0, v1, v3}, Ll/֨᩷۠;->֫(II)V

    .line 410
    :goto_0
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-virtual {v0, v3}, Ll/֨᩷۠;->᩻(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 4

    .line 414
    iget-object v0, p0, Ll/֫ۢ۠;->ᩳ:Ll/ܳۢ۠;

    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    if-nez v1, :cond_0

    const/16 v2, -0x8000

    if-lt p1, v2, :cond_0

    const/16 v2, 0x7fff

    if-gt p1, v2, :cond_0

    .line 415
    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    iget v1, p0, Ll/֫ۢ۠;->ܽ:I

    invoke-virtual {v0, v1, p1}, Ll/֨᩷۠;->ۧ(II)V

    return-void

    .line 417
    :cond_0
    invoke-virtual {p0}, Ll/֫ۢ۠;->ᩳ()Ll/۟᩷۠;

    if-ltz p1, :cond_1

    .line 419
    iget-object v2, v0, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 165
    new-instance v3, Ll/᩺᩷۠;

    invoke-direct {v3, v0, v2, p1}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    .line 419
    invoke-virtual {v3}, Ll/᩺᩷۠;->ᩳ()Ll/۟᩷۠;

    .line 420
    iget-object p1, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    const/16 v2, 0x60

    invoke-virtual {p1, v2}, Ll/֨᩷۠;->ܽ(I)V

    goto :goto_0

    .line 422
    :cond_1
    iget-object v2, v0, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    neg-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 165
    new-instance v3, Ll/᩺᩷۠;

    invoke-direct {v3, v0, v2, p1}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    .line 422
    invoke-virtual {v3}, Ll/᩺᩷۠;->ᩳ()Ll/۟᩷۠;

    .line 423
    iget-object p1, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    const/16 v2, 0x64

    invoke-virtual {p1, v2}, Ll/֨᩷۠;->ܽ(I)V

    .line 425
    :goto_0
    iget-object p1, v0, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object p1, p1, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {v0, p1}, Ll/ܳۢ۠;->֫(Ll/ۙ֨֨;)Ll/۟᩷۠;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/۟᩷۠;->֫(I)Ll/۟᩷۠;

    .line 426
    invoke-virtual {p0}, Ll/֫ۢ۠;->ܳ()V

    return-void
.end method

.method public final ᩳ()Ll/۟᩷۠;
    .locals 5

    const/4 v0, 0x3

    .line 398
    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    iget-object v2, p0, Ll/֫ۢ۠;->ᩳ:Ll/ܳۢ۠;

    iget v3, p0, Ll/֫ۢ۠;->ܽ:I

    if-gt v3, v0, :cond_0

    .line 399
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-static {v1}, Ll/֨᩷۠;->ᩴ(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x4

    add-int/lit8 v4, v4, 0x1a

    add-int/2addr v4, v3

    invoke-virtual {v0, v4}, Ll/֨᩷۠;->ܽ(I)V

    goto :goto_0

    .line 401
    :cond_0
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-static {v1}, Ll/֨᩷۠;->ᩴ(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x15

    invoke-virtual {v0, v4, v3}, Ll/֨᩷۠;->֫(II)V

    .line 402
    :goto_0
    invoke-static {v2}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object v0, v0, v1

    return-object v0
.end method
