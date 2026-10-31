.class public final synthetic Ll/᩸֡ᩳ;
.super Ljava/lang/Object;
.source "1AOV"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩸֡ᩳ;->᩸:I

    iput-object p2, p0, Ll/᩸֡ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩸֡ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩸֡ᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩹ܶᩳ;

    .line 11
    check-cast p1, Ll/ܰۚۡ;

    .line 232
    invoke-virtual {p1}, Ll/ܰۚۡ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۢ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const/4 v1, 0x0

    .line 413
    invoke-virtual {v0, p1, v1, v1}, Ll/᩹ܶᩳ;->֫(IZZ)V

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/᩸֡ᩳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۙ֡ᩳ;

    invoke-static {p1}, Ll/ۙ֡ᩳ;->֫(Ll/ۙ֡ᩳ;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
