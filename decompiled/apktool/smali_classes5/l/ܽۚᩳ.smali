.class public Ll/ܽۚᩳ;
.super Ll/֨֡ᩳ;
.source "I94M"


# instance fields
.field public ᩴۧ:Ll/ܶ᩵ܿ;

.field public ᩵ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ll/֨֡ᩳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public final ֫֫()Ljava/lang/String;
    .locals 1

    const-string v0, "null"

    return-object v0
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "SyntaxPreviewActivity"

    return-object v0
.end method

.method public final ۨ()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ܽۚᩳ;->ᩴۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܰ()Ljava/lang/String;
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TEMPORARY:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܽۚᩳ;->᩵ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܽۚᩳ;->ᩴۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ֫()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ܽۚᩳ;->᩵ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ֫()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܽۚᩳ;->ᩴۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Ll/ܽۚᩳ;->ᩴۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const v0, 0x7f120304

    .line 61
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ֫()Z
    .locals 2

    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "syntaxName"

    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܽۚᩳ;->᩵ۧ:Ljava/lang/String;

    .line 25
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۚᩳ;->ᩴۧ:Ll/ܶ᩵ܿ;

    .line 26
    iget-object v0, p0, Ll/ܽۚᩳ;->᩵ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩺()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ܽۚᩳ;->ᩴۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
