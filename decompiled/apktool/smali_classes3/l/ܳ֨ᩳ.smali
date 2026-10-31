.class public final synthetic Ll/ܳ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Ll/᩷۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ֨ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ܳ֨ᩳ;->᩹:Ll/᩷۠ᩴ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ܳ֨ᩳ;->᩹:Ll/᩷۠ᩴ;

    .line 604
    :try_start_0
    invoke-static {v0}, Ll/᩻۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 606
    iget-object v0, p0, Ll/ܳ֨ᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ܳ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 164
    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ᩳۚᩳ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 606
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 172
    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ᩳۚᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 606
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 198
    iget-object v1, v0, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    const-string v2, "pageMode"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 152
    invoke-virtual {v0}, Ll/֫ۘᩳ;->ᩳ()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 168
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ᩳۚᩳ;->ۧ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 154
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۬()Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 605
    new-instance v1, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 605
    throw v1
.end method
