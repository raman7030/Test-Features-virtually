.class public final synthetic Ll/ᩳۜۡ;
.super Ljava/lang/Object;
.source "98W2"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳۜۡ;->᩸:I

    iput-object p2, p0, Ll/ᩳۜۡ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ᩳۜۡ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 0
    iget p1, p0, Ll/ᩳۜۡ;->᩸:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ll/ᩳۜۡ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/᩸᩷᩷;

    iget-object v0, p0, Ll/ᩳۜۡ;->᩶:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;

    invoke-static {p1, v0, p2}, Ll/᩸᩷᩷;->ܽ(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ll/ᩳۜۡ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܳۜۡ;

    iget-object p2, p0, Ll/ᩳۜۡ;->᩶:Ljava/lang/Object;

    check-cast p2, Ll/ۗܺ᩷;

    invoke-static {p1, p2}, Ll/ܳۜۡ;->֫(Ll/ܳۜۡ;Ll/ۗܺ᩷;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
