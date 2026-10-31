.class public final synthetic Ll/ۚ۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚ۫ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/ۚ۫ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-static {}, Ll/ۡᩴܳ;->֫()V

    return-void

    .line 11
    :pswitch_0
    sget v0, Ll/֫ۚۢ;->ۤ:I

    .line 115
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    .line 116
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/֫ۚۢ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 117
    invoke-static {v0, v1}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
