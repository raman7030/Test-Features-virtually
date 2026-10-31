.class public final synthetic Ll/᩹֡ᩳ;
.super Ljava/lang/Object;
.source "1AOV"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 3

    .line 75
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    .line 76
    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    invoke-static {}, Ll/ۙ֡ᩳ;->ܽ()I

    move-result v1

    const-string v2, "tfcgi"

    .line 77
    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 78
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
