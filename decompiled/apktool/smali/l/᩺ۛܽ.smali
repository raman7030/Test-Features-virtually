.class public final Ll/᩺ۛܽ;
.super Ljava/lang/Object;
.source "H5BW"

# interfaces
.implements Ll/ۜۨܽ;


# instance fields
.field public final synthetic ֫:Ll/ۗۘ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Z

.field public final synthetic ᩳ:Ll/᩻ۨܽ;


# direct methods
.method public constructor <init>(Ll/᩻ۨܽ;ZLl/ۗۘ;Ljava/lang/String;)V
    .locals 0

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    iput-boolean p2, p0, Ll/᩺ۛܽ;->ܽ:Z

    iput-object p3, p0, Ll/᩺ۛܽ;->֫:Ll/ۗۘ;

    iput-object p4, p0, Ll/᩺ۛܽ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܽ᩺ܽ;
    .locals 1

    .line 257
    iget-object v0, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    invoke-interface {v0}, Ll/᩻ۨܽ;->֫()Ll/ܽ᩺ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 283
    iget-object v0, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    invoke-virtual {v0, p1}, Ll/۫ۛܽ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Ll/ܽ᩺ܽ;)V
    .locals 3

    .line 225
    iget-boolean v0, p0, Ll/᩺ۛܽ;->ܽ:Z

    if-eqz v0, :cond_1

    .line 226
    iget-object v0, p0, Ll/᩺ۛܽ;->֫:Ll/ۗۘ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    iget-object v1, p0, Ll/᩺ۛܽ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 227
    invoke-static {v1, p1}, Ll/ᩳ᩺ܽ;->֫(Ljava/lang/String;Ll/ܽ᩺ܽ;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 230
    invoke-static {v1, v0}, Ll/ᩳ᩺ܽ;->֫(Ljava/lang/String;Ll/ܽ᩺ܽ;)V

    .line 234
    :cond_1
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "auto_signature_key"

    .line 235
    invoke-virtual {p1}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 236
    invoke-virtual {p1}, Ll/ܽ᩺ܽ;->ᩳ()Ll/۠ۧᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const-string v2, "auto_signature_scheme"

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "kv1sd"

    .line 237
    invoke-virtual {p1}, Ll/ܽ᩺ܽ;->֫()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    .line 238
    invoke-virtual {p1}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "v1_signature_filename"

    if-nez v1, :cond_2

    .line 239
    invoke-interface {v0, v2}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    goto :goto_0

    .line 241
    :cond_2
    invoke-virtual {p1}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    .line 243
    :goto_0
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public final ۧ()Ll/ۨۧᩳ;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    invoke-interface {v0}, Ll/᩻ۨܽ;->֫()Ll/ܽ᩺ܽ;

    move-result-object v0

    .line 218
    invoke-virtual {p0, v0}, Ll/᩺ۛܽ;->֫(Ll/ܽ᩺ܽ;)V

    .line 219
    invoke-static {v0}, Ll/ۡۨܽ;->֫(Ll/ܽ᩺ܽ;)Ll/ۨۧᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()V
    .locals 3

    .line 249
    iget-object v0, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    invoke-interface {v0}, Ll/᩻ۨܽ;->֫()Ll/ܽ᩺ܽ;

    move-result-object v0

    .line 554
    invoke-virtual {v0}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۡۨܽ;->֫(Ljava/lang/String;)Ll/۬ܿᩳ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 558
    :cond_0
    invoke-virtual {v1}, Ll/۬ܿᩳ;->᩵()V

    .line 559
    instance-of v2, v1, Ll/᩹ܿᩳ;

    if-eqz v2, :cond_2

    check-cast v1, Ll/᩹ܿᩳ;

    .line 560
    invoke-virtual {v1}, Ll/᩹ܿᩳ;->ۚ()Ll/᩸ܿᩳ;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 251
    :cond_2
    :goto_1
    invoke-virtual {p0, v0}, Ll/᩺ۛܽ;->֫(Ll/ܽ᩺ܽ;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 262
    iget-object v0, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    .line 455
    iget-object v0, v0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->֫(Ll/ۢۨܽ;)Z

    move-result v0

    return v0
.end method

.method public final ܿ()Ll/᩸ܿᩳ;
    .locals 1

    .line 273
    iget-object v0, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    .line 466
    iget-object v0, v0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->ۧ(Ll/ۢۨܽ;)Ll/᩸ܿᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 267
    iget-object v0, p0, Ll/᩺ۛܽ;->ᩳ:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    .line 460
    iget-object v0, v0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->ܽ(Ll/ۢۨܽ;)Z

    move-result v0

    return v0
.end method
