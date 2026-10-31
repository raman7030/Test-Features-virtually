.class public final Ll/ۢ֨ۚ;
.super Ll/ۡ֨ۚ;
.source "U4HR"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 294
    invoke-direct {p0}, Ll/ۡ֨ۚ;-><init>()V

    .line 295
    sget-object v0, Ll/ܺ֨ۚ;->۫:Ll/ܺ֨ۚ;

    iput-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 314
    invoke-virtual {p0}, Ll/ۡ֨ۚ;->ۢ()Z

    move-result v0

    const-string v1, "[unset]"

    const-string v2, ">"

    const-string v3, "<"

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    invoke-virtual {v0}, Ll/ܺ֡ۚ;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 198
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v1, v0

    .line 315
    :cond_0
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    .line 402
    invoke-virtual {v0}, Ll/ܺ֡ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v4, " "

    .line 0
    invoke-static {v3, v1, v4, v0, v2}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 198
    :cond_1
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_2

    move-object v1, v0

    .line 0
    :cond_2
    invoke-static {v3, v1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ll/ۡ֨ۚ;
    .locals 1

    .line 300
    invoke-super {p0}, Ll/ۡ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    const/4 v0, 0x0

    .line 301
    iput-object v0, p0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    return-object p0
.end method

.method public final bridge synthetic ᩻()V
    .locals 0

    .line 292
    invoke-virtual {p0}, Ll/ۢ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    return-void
.end method
