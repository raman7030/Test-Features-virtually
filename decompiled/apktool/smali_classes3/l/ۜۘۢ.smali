.class public Ll/ۜۘۢ;
.super Ll/᩸ۘۢ;
.source "NANA"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 8
    iput-object p2, p0, Ll/ۜۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 13
    iget-object v0, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    iget-object v1, p0, Ll/ۜۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v1}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 16
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    const-string v1, "550 Restart position must be non-negative\r\n"

    .line 22
    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 25
    :cond_0
    invoke-virtual {v0}, Ll/᩶ۘۢ;->ܺ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 26
    iput-wide v1, v0, Ll/᩶ۘۢ;->ܰ:J

    const-wide/16 v3, -0x1

    .line 28
    iput-wide v3, v0, Ll/᩶ۘۢ;->ۤ:J

    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "350 Restart position accepted ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")\r\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v1, "550 Restart position not accepted in ASCII mode\r\n"

    .line 33
    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :catch_0
    const-string v1, "550 No valid restart position\r\n"

    .line 18
    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
