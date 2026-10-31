.class public final Ll/᩹۠ᩳ;
.super Ll/۟ܶۡ;
.source "3B3L"


# instance fields
.field public final ۜ:Ll/ۡ᩹ۡ;

.field public final synthetic ۢ:Ll/ܽ֨ᩳ;

.field public ܳ:Ll/۟᩸ᩳ;

.field public final synthetic ᩷:Ll/᩹ܶᩳ;

.field public ᩻:Ll/ᩳ᩵ۡ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 1257
    iput-object p1, p0, Ll/᩹۠ᩳ;->᩷:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/᩹۠ᩳ;->ۢ:Ll/ܽ֨ᩳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 1259
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getViewLifecycleOwner()Ll/᩻ۡ֫;

    move-result-object p1

    invoke-static {p1}, Ll/ۡ᩹ۡ;->֫(Ll/᩻ۡ֫;)Ll/ۡ᩹ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۠ᩳ;->ۜ:Ll/ۡ᩹ۡ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 1279
    iget-object v0, p0, Ll/᩹۠ᩳ;->ۜ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1306
    :cond_0
    iget-object v0, p0, Ll/᩹۠ᩳ;->᩷:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ܿ(Ll/᩹ܶᩳ;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ۡ᩻֫;->isDetached()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۢ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 1283
    iget-object v1, p0, Ll/᩹۠ᩳ;->᩻:Ll/ᩳ᩵ۡ;

    .line 33
    iget-object v1, v1, Ll/ᩳ᩵ۡ;->᩶:Ll/᩻ᩴۡ;

    invoke-virtual {v1}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1284
    invoke-static {v0}, Ll/᩹ܶᩳ;->᩻(Ll/᩹ܶᩳ;)Ll/ۚ᩹᩷;

    move-result-object v1

    iget-object v2, p0, Ll/᩹۠ᩳ;->᩻:Ll/ᩳ᩵ۡ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܶᩳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".java"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Ll/ܶۖᩳ;->֫(Ll/ۚ᩹᩷;Ll/ᩳ᩵ۡ;Ljava/lang/String;)V

    return-void

    .line 1286
    :cond_1
    iget-object v0, p0, Ll/᩹۠ᩳ;->᩻:Ll/ᩳ᩵ۡ;

    .line 41
    iget-object v0, v0, Ll/ᩳ᩵ۡ;->᩶:Ll/᩻ᩴۡ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x7f120230

    .line 185
    invoke-static {v0, v1}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 516
    iget-object v2, p0, Ll/᩹۠ᩳ;->ۢ:Ll/ܽ֨ᩳ;

    invoke-virtual {v2, v0, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    :cond_2
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 1292
    iget-object v0, p0, Ll/᩹۠ᩳ;->ۜ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1306
    :cond_0
    iget-object v0, p0, Ll/᩹۠ᩳ;->᩷:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ܿ(Ll/᩹ܶᩳ;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/ۡ᩻֫;->isDetached()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۢ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1296
    iget-object v1, p0, Ll/᩹۠ᩳ;->ۢ:Ll/ܽ֨ᩳ;

    invoke-static {v0, p1, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Ljava/lang/Exception;Ll/ܽ֨ᩳ;)V

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 1265
    iget-object v0, p0, Ll/᩹۠ᩳ;->᩷:Ll/᩹ܶᩳ;

    iget-object v0, v0, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۠ᩳ;->ܳ:Ll/۟᩸ᩳ;

    .line 1266
    iget-object v0, p0, Ll/᩹۠ᩳ;->ۢ:Ll/ܽ֨ᩳ;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 1271
    iget-object v0, p0, Ll/᩹۠ᩳ;->ܳ:Ll/۟᩸ᩳ;

    .line 1272
    :try_start_0
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 44
    new-instance v2, Ll/᩵ܺۚ;

    invoke-direct {v2}, Ll/᩵ܺۚ;-><init>()V

    const/16 v3, 0x1c

    .line 45
    iput v3, v2, Ll/᩵ܺۚ;->ۧ:I

    .line 46
    new-instance v4, Ll/᩵ۡۚ;

    invoke-static {v3}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object v3

    invoke-direct {v4, v3}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 47
    invoke-static {v1, v4, v2}, Ll/ۢܺۚ;->֫(Ljava/lang/String;Ll/᩵ۡۚ;Ll/᩵ܺۚ;)Ll/֡᩷ۚ;

    .line 48
    new-instance v1, Ll/᩸ۡۚ;

    invoke-direct {v1}, Ll/᩸ۡۚ;-><init>()V

    .line 49
    invoke-virtual {v4, v1}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V

    .line 50
    invoke-virtual {v1}, Ll/᩸ۡۚ;->ܽ()[B

    move-result-object v1

    const-string v2, ""

    .line 1273
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "dex_decompile_engine"

    const/4 v5, 0x0

    invoke-interface {v3, v5, v4}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v3

    invoke-static {v2, v1, v3}, Ll/ۖ۠ۡ;->֫(Ljava/lang/String;[BI)Ll/ᩳ᩵ۡ;

    move-result-object v1

    iput-object v1, p0, Ll/᩹۠ᩳ;->᩻:Ll/ᩳ᩵ۡ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1274
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_0

    .line 1271
    :try_start_1
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1
.end method

.method public final ᩳ()V
    .locals 1

    .line 1301
    iget-object v0, p0, Ll/᩹۠ᩳ;->ܳ:Ll/۟᩸ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    .line 1302
    :cond_0
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
