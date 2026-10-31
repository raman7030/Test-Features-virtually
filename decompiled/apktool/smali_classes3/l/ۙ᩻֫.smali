.class public abstract Ll/ۙ᩻֫;
.super Ll/ܶ᩻֫;
.source "64YJ"


# instance fields
.field public final ۙ:Landroid/os/Handler;

.field public final ᩶:Ll/ۚۜ֫;

.field public final ᩸:Ll/֡᩻֫;

.field public final ᩹:Ll/֡᩻֫;


# direct methods
.method public constructor <init>(Ll/֡᩻֫;)V
    .locals 2

    .line 92
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    new-instance v1, Ll/֨ۜ֫;

    .line 30
    invoke-direct {v1}, Ll/ۚۜ֫;-><init>()V

    .line 82
    iput-object v1, p0, Ll/ۙ᩻֫;->᩶:Ll/ۚۜ֫;

    .line 97
    iput-object p1, p0, Ll/ۙ᩻֫;->᩸:Ll/֡᩻֫;

    .line 98
    iput-object p1, p0, Ll/ۙ᩻֫;->᩹:Ll/֡᩻֫;

    .line 99
    iput-object v0, p0, Ll/ۙ᩻֫;->ۙ:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 167
    iget-object p2, p0, Ll/ۙ᩻֫;->᩹:Ll/֡᩻֫;

    .line 295
    invoke-virtual {p2, p1, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    .line 164
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 9
    .param p1    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    move v3, p2

    if-ne v3, v0, :cond_0

    move-object v0, p0

    .line 189
    iget-object v1, v0, Ll/ۙ᩻֫;->᩸:Ll/֡᩻֫;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move-object/from16 v8, p7

    .line 277
    invoke-virtual/range {v1 .. v8}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    :cond_0
    move-object v0, p0

    .line 186
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Starting intent sender with a requestCode requires a FragmentActivity host"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public abstract ֫(Ljava/io/PrintWriter;[Ljava/lang/String;)V
.end method

.method public abstract ۜ()Landroid/view/LayoutInflater;
.end method

.method public abstract ۧ(Ljava/lang/String;)Z
.end method

.method public abstract ܳ()Ll/֡᩻֫;
.end method

.method public final ܽ()Landroid/app/Activity;
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ۙ᩻֫;->᩸:Ll/֡᩻֫;

    return-object v0
.end method

.method public final ܿ()Landroid/os/Handler;
    .locals 1

    .line 255
    iget-object v0, p0, Ll/ۙ᩻֫;->ۙ:Landroid/os/Handler;

    return-object v0
.end method

.method public final ᩳ()Landroid/content/Context;
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ۙ᩻֫;->᩹:Ll/֡᩻֫;

    return-object v0
.end method

.method public abstract ᩷()V
.end method
