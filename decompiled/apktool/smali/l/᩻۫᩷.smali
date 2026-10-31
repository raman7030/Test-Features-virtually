.class public final synthetic Ll/᩻۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻۫᩷;->᩸:I

    iput-object p2, p0, Ll/᩻۫᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩻۫᩷;->᩸:I

    .line 4
    iget-object v1, p0, Ll/᩻۫᩷;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ܺۤ᩷;

    .line 2297
    iget-object v0, v1, Ll/ܺۤ᩷;->᩸:Ll/ۖۤ᩷;

    iget-object v1, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    const-string v2, "resources.arsc"

    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->ۧ(Ljava/lang/CharSequence;)V

    .line 2298
    iget-object v1, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    const v2, 0x7f1201da

    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->֫(I)V

    .line 2299
    iget-object v0, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/ܿۛ᩷;

    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    sget v0, Ll/ۛ᩷ۢ;->ۚ֫:I

    const v0, 0x7f0d0048

    invoke-virtual {v1, v0}, Ll/ܿۛ᩷;->ܿ(I)V

    const v0, 0x7f0d0049

    .line 323
    invoke-virtual {v1, v0}, Ll/ܿۛ᩷;->ܿ(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
