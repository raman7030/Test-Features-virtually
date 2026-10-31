.class public final synthetic Ll/ܿۚᩳ;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Z

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֨ᩳ;Landroid/content/Intent;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/ܿۚᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۚᩳ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܿۚᩳ;->᩶:Ljava/lang/Object;

    iput-boolean p3, p0, Ll/ܿۚᩳ;->ۙ:Z

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܿۛ᩷;Ll/ۛ᩷ۢ;Z)V
    .locals 1

    const/4 v0, 0x2

    .line 0
    iput v0, p0, Ll/ܿۚᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܿۚᩳ;->᩹:Ljava/lang/Object;

    iput-boolean p3, p0, Ll/ܿۚᩳ;->ۙ:Z

    iput-object p1, p0, Ll/ܿۚᩳ;->᩶:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLl/᩵֡᩷;Ll/ܶ᩵ܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/ܿۚᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ܿۚᩳ;->ۙ:Z

    iput-object p2, p0, Ll/ܿۚᩳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܿۚᩳ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget v0, p0, Ll/ܿۚᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܿۚᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۛ᩷ۢ;

    iget-object v1, p0, Ll/ܿۚᩳ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ܿۛ᩷;

    iget-boolean v2, p0, Ll/ܿۚᩳ;->ۙ:Z

    invoke-static {v1, v0, v2}, Ll/ۛ᩷ۢ;->֫(Ll/ܿۛ᩷;Ll/ۛ᩷ۢ;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ܿۚᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩵֡᩷;

    iget-object v1, p0, Ll/ܿۚᩳ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ܶ᩵ܿ;

    iget-boolean v2, p0, Ll/ܿۚᩳ;->ۙ:Z

    invoke-static {v2, v0, v1}, Ll/᩵֡᩷;->֫(ZLl/᩵֡᩷;Ll/ܶ᩵ܿ;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll/ܿۚᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܽ֨ᩳ;

    iget-object v1, p0, Ll/ܿۚᩳ;->᩶:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    iget-boolean v2, p0, Ll/ܿۚᩳ;->ۙ:Z

    invoke-static {v0, v1, v2}, Ll/ܽ֨ᩳ;->֫(Ll/ܽ֨ᩳ;Landroid/content/Intent;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
