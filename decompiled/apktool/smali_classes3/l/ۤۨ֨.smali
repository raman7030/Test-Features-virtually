.class public final Ll/ۤۨ֨;
.super Ll/ۖ᩸֨;
.source "Y7SB"


# instance fields
.field public ۧ:Z

.field public ܽ:Ljava/lang/StringBuilder;

.field public final synthetic ᩳ:Ll/ۡ᩺֨;


# direct methods
.method public constructor <init>(Ll/ۡ᩺֨;Z)V
    .locals 0

    .line 2435
    iput-object p1, p0, Ll/ۤۨ֨;->ᩳ:Ll/ۡ᩺֨;

    .line 2436
    invoke-static {p1}, Ll/ۡ᩺֨;->ۘ(Ll/ۡ᩺֨;)Ll/ۛ᩸֨;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۖ᩸֨;-><init>(Ll/ۛ᩸֨;)V

    .line 2427
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ll/ۤۨ֨;->ܽ:Ljava/lang/StringBuilder;

    .line 2437
    iput-boolean p2, p0, Ll/ۤۨ֨;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 2465
    iget-object v0, p0, Ll/ۤۨ֨;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(C)V
    .locals 1

    .line 2449
    iget-object v0, p0, Ll/ۤۨ֨;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ۤܶ۠;)V
    .locals 1

    .line 2460
    iget-object v0, p0, Ll/ۤۨ֨;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫([B)V
    .locals 1

    .line 2454
    iget-object v0, p0, Ll/ۤۨ֨;->ᩳ:Ll/ۡ᩺֨;

    invoke-static {v0}, Ll/ۡ᩺֨;->ۢ(Ll/ۡ᩺֨;)Ll/ۛܶ۠;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۛܶ۠;->֫([B)Ll/ۤܶ۠;

    move-result-object p1

    .line 2455
    iget-object v0, p0, Ll/ۤۨ֨;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܽ(Ll/ۙ֨֨;)V
    .locals 1

    .line 2442
    iget-boolean v0, p0, Ll/ۤۨ֨;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    .line 2443
    :cond_0
    invoke-super {p0, p1}, Ll/ۖ᩸֨;->ܽ(Ll/ۙ֨֨;)V

    const/4 p1, 0x0

    throw p1
.end method
