.class public final synthetic Ll/ۢܰܿ;
.super Ljava/lang/Object;
.source "C5GL"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۢܰܿ;->᩸:I

    iput-object p1, p0, Ll/ۢܰܿ;->᩹:Ll/ۗܺ᩷;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۢܰܿ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۢܰܿ;->᩹:Ll/ۗܺ᩷;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/۟᩸ۢ;

    .line 12
    invoke-static {v1, p1, p2}, Ll/۟᩸ۢ;->֫(Ll/۟᩸ۢ;Landroid/content/DialogInterface;I)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/ܿۛ᩷;

    .line 2101
    invoke-virtual {v1}, Ll/ܿۛ᩷;->finish()V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ۚܰܿ;

    sget p1, Ll/ۚܰܿ;->ۖܽ:I

    .line 758
    invoke-virtual {v1}, Ll/ۚܰܿ;->finish()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
