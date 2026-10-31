.class public final synthetic Ll/۠᩵᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/۠᩵᩷;->᩸:I

    iput-object p1, p0, Ll/۠᩵᩷;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/۠᩵᩷;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/۠᩵᩷;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/۠᩵᩷;->᩸:I

    .line 4
    iget-object v1, p0, Ll/۠᩵᩷;->ۙ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/۠᩵᩷;->᩶:Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Ll/۠᩵᩷;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 13
    check-cast v3, Ll/֡ۚۢ;

    .line 15
    check-cast v2, Ll/۫ۚۡ;

    .line 17
    check-cast v1, Ll/᩷᩵ۡ;

    .line 34
    invoke-virtual {v3}, Ll/֡ۚۢ;->dismiss()V

    .line 35
    invoke-virtual {v2, v1}, Ll/۫ۚۡ;->accept(Ljava/lang/Object;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v3, Ll/۬۬ܿ;

    check-cast v2, Ll/᩵֡᩷;

    check-cast v1, Landroid/os/Bundle;

    sget v0, Ll/᩵֡᩷;->۟ۧ:I

    .line 350
    :try_start_0
    invoke-static {}, Ll/ۢ֨ۢ;->ۘ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 354
    new-instance v0, Ll/ܳۛᩳ;

    const/4 v4, 0x2

    invoke-direct {v0, v3, v2, v1, v4}, Ll/ܳۛᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catch_0
    move-exception v0

    .line 352
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
