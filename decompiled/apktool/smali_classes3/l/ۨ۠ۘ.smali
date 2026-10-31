.class public final Ll/ۨ۠ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Lcom/tencent/connect/auth/a;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V
    .locals 0

    .line 463
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ۠ۘ;->᩹:Lcom/tencent/connect/auth/a;

    .line 464
    iput-object p2, p0, Ll/ۨ۠ۘ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 469
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->timeoutUrl: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۨ۠ۘ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " | mRetryUrl: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۨ۠ۘ;->᩹:Lcom/tencent/connect/auth/a;

    invoke-static {v2}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "openSDK_LOG.AuthDialog"

    invoke-static {v3, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 471
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;

    move-result-object v0

    new-instance v1, Ll/᩵᩹ۘ;

    const-string v3, "\u8bf7\u6c42\u9875\u9762\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\uff01"

    invoke-static {v2}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x232a

    invoke-direct {v1, v5, v3, v4}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/ۤ۠ۘ;->֫(Ll/᩵᩹ۘ;)V

    .line 472
    invoke-virtual {v2}, Lcom/tencent/connect/auth/a;->dismiss()V

    :cond_0
    return-void
.end method
