.class public final synthetic Ll/ܺۚᩳ;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/widget/CheckBox;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;ILandroid/widget/CheckBox;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ܺۚᩳ;->᩸:I

    iput-object p1, p0, Ll/ܺۚᩳ;->᩹:Ll/ۗܺ᩷;

    iput p2, p0, Ll/ܺۚᩳ;->᩶:I

    iput-object p3, p0, Ll/ܺۚᩳ;->ۙ:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 0
    iget p1, p0, Ll/ܺۚᩳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ll/ܺۚᩳ;->᩹:Ll/ۗܺ᩷;

    check-cast p1, Ll/ܿۛ᩷;

    iget p2, p0, Ll/ܺۚᩳ;->᩶:I

    iget-object v0, p0, Ll/ܺۚᩳ;->ۙ:Landroid/widget/CheckBox;

    invoke-static {p1, p2, v0}, Ll/ܿۛ᩷;->ܽ(Ll/ܿۛ᩷;ILandroid/widget/CheckBox;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ll/ܺۚᩳ;->᩹:Ll/ۗܺ᩷;

    check-cast p1, Ll/ܽ֨ᩳ;

    iget p2, p0, Ll/ܺۚᩳ;->᩶:I

    iget-object v0, p0, Ll/ܺۚᩳ;->ۙ:Landroid/widget/CheckBox;

    invoke-static {p1, p2, v0}, Ll/ܽ֨ᩳ;->ۧ(Ll/ܽ֨ᩳ;ILandroid/widget/CheckBox;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
