.class public final synthetic Ll/᩻᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻᩷ᩳ;->᩸:I

    iput-object p2, p0, Ll/᩻᩷ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩻᩷ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩻᩷ᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/۬۬ܿ;

    .line 12
    invoke-static {v0}, Ll/᩶֨ۢ;->֫(Ll/۬۬ܿ;)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/᩻᩷ᩳ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/۟۫ᩳ;

    .line 20
    invoke-static {v0}, Ll/۟۫ᩳ;->ۧ(Ll/۟۫ᩳ;)V

    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, Ll/᩻᩷ᩳ;->᩹:Ljava/lang/Object;

    .line 25
    check-cast v0, Ll/ܽ֨ᩳ;

    const/4 v1, 0x0

    .line 2671
    invoke-virtual {v0, v1}, Ll/ܽ֨ᩳ;->֫(Z)V

    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/᩻᩷ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֫ۢᩳ;

    invoke-virtual {v0}, Ll/֫ۢᩳ;->finish()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
