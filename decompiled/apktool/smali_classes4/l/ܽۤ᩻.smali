.class public final synthetic Ll/ܽۤ᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    sget v0, Ll/᩵ۛ᩻;->۬:I

    .line 116
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    .line 117
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩵ۛ᩻;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v0, v1}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
