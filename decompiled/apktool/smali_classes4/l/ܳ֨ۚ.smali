.class public final Ll/ܳ֨ۚ;
.super Ll/ۖ֨ۚ;
.source "U4HR"


# instance fields
.field public ܳ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/StringBuilder;

.field public ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 347
    invoke-direct {p0}, Ll/ۖ֨ۚ;-><init>()V

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ܳ֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 336
    iput-boolean v0, p0, Ll/ܳ֨ۚ;->ᩳ:Z

    .line 348
    sget-object v0, Ll/ܺ֨ۚ;->᩶:Ll/ܺ֨ۚ;

    iput-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 381
    invoke-virtual {p0}, Ll/ܳ֨ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<!--"

    const-string v2, "-->"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(C)V
    .locals 2

    .line 373
    iget-object v0, p0, Ll/ܳ֨ۚ;->ܳ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܳ֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 374
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 375
    iput-object v0, p0, Ll/ܳ֨ۚ;->ܳ:Ljava/lang/String;

    .line 367
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 373
    iget-object v0, p0, Ll/ܳ֨ۚ;->ܳ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܳ֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 374
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 375
    iput-object v0, p0, Ll/ܳ֨ۚ;->ܳ:Ljava/lang/String;

    .line 357
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 358
    iput-object p1, p0, Ll/ܳ֨ۚ;->ܳ:Ljava/lang/String;

    return-void

    .line 360
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 352
    iget-object v0, p0, Ll/ܳ֨ۚ;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ܳ֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()V
    .locals 1

    .line 340
    invoke-super {p0}, Ll/ۖ֨ۚ;->᩻()V

    .line 341
    iget-object v0, p0, Ll/ܳ֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x0

    .line 342
    iput-object v0, p0, Ll/ܳ֨ۚ;->ܳ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 343
    iput-boolean v0, p0, Ll/ܳ֨ۚ;->ᩳ:Z

    return-void
.end method
