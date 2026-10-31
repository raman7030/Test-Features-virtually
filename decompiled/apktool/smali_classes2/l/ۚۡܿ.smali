.class public final synthetic Ll/ۚۡܿ;
.super Ljava/lang/Object;
.source "R704"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚۡܿ;->᩸:I

    iput-object p2, p0, Ll/ۚۡܿ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۚۡܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۚۡܿ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/util/List;

    .line 94
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۚۡܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    .line 753
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    .line 94
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵᩶ܿ;

    .line 95
    invoke-virtual {v1}, Ll/᩵᩶ܿ;->֫()V

    goto :goto_0

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
