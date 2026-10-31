.class public final synthetic Ll/᩻ۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ۚܿ;->᩸:I

    iput-object p2, p0, Ll/᩻ۚܿ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩻ۚܿ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩻ۚܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩻ۚܿ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩸᩻ۢ;

    .line 11
    iget-object v1, p0, Ll/᩻ۚܿ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/lang/String;

    .line 16
    invoke-static {v0, v1}, Ll/᩸᩻ۢ;->֫(Ll/᩸᩻ۢ;Ljava/lang/String;)V

    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll/᩻ۚܿ;->᩹:Ljava/lang/Object;

    .line 21
    check-cast v0, Ll/ۧܶܿ;

    .line 23
    iget-object v1, p0, Ll/᩻ۚܿ;->᩶:Ljava/lang/Object;

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 132
    invoke-virtual {v0, v1}, Ll/ۧܶܿ;->֫(Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/᩻ۚܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/content/pm/PackageInstaller$Session;

    iget-object v1, p0, Ll/᩻ۚܿ;->᩶:Ljava/lang/Object;

    check-cast v1, Landroid/app/PendingIntent;

    .line 345
    invoke-virtual {v1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageInstaller$Session;->commit(Landroid/content/IntentSender;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
