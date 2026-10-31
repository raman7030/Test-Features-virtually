.class public final Ll/ۛܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩺ܶۘ;

.field public final synthetic ᩹:Ll/ۨܶۘ;


# direct methods
.method public constructor <init>(Ll/ۨܶۘ;Ll/᩺ܶۘ;)V
    .locals 0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛܶۘ;->᩹:Ll/ۨܶۘ;

    iput-object p2, p0, Ll/ۛܶۘ;->᩸:Ll/᩺ܶۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 128
    iget-object v0, p0, Ll/ۛܶۘ;->᩹:Ll/ۨܶۘ;

    invoke-static {v0}, Ll/ۨܶۘ;->֫(Ll/ۨܶۘ;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Ll/ۛܶۘ;->᩸:Ll/᩺ܶۘ;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;)Z

    move-result v1

    const-string v3, "AttaReporter"

    if-nez v1, :cond_0

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "attaReport net disconnect, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 136
    :cond_0
    :try_start_0
    invoke-static {v0}, Ll/ۨܶۘ;->ۧ(Ll/ۨܶۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Exception"

    .line 138
    invoke-static {v3, v1, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
