.class public final Ll/ܿܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Lcom/tencent/connect/common/AssistActivity;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/common/AssistActivity;)V
    .locals 0

    .line 434
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܶۘ;->᩸:Lcom/tencent/connect/common/AssistActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 437
    iget-object v0, p0, Ll/ܿܶۘ;->᩸:Lcom/tencent/connect/common/AssistActivity;

    invoke-static {v0}, Lcom/tencent/connect/common/AssistActivity;->֫(Lcom/tencent/connect/common/AssistActivity;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onActivityResult finish delay"

    invoke-static {v1, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
