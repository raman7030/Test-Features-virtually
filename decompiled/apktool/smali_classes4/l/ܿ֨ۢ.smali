.class public final synthetic Ll/ܿ֨ۢ;
.super Ljava/lang/Object;
.source "E68Y"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ܿ֨ۢ;->᩸:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 2
    iget-wide v0, p0, Ll/ܿ֨ۢ;->᩸:J

    const-string v2, "Shell.prewarm error, generation="

    const-string v3, "Shell.prewarm shizuku, generation="

    .line 350
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 351
    new-instance v3, Ll/ܳ֨ۢ;

    invoke-direct {v3, v0, v1}, Ll/ܳ֨ۢ;-><init>(J)V

    invoke-static {v3}, Ll/᩶֨ۢ;->֫(Ll/ܳ֨ۢ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    .line 370
    invoke-static {v0, v1, v2}, Ll/ۢ֨ۢ;->֫(JZ)V

    return-void

    :catchall_0
    move-exception v3

    const/4 v4, 0x0

    .line 368
    :try_start_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 370
    invoke-static {v0, v1, v4}, Ll/ۢ֨ۢ;->֫(JZ)V

    return-void

    :catchall_1
    move-exception v2

    invoke-static {v0, v1, v4}, Ll/ۢ֨ۢ;->֫(JZ)V

    .line 371
    throw v2
.end method
