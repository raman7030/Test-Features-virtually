.class public final synthetic Ll/᩹᩸ۜ;
.super Ljava/lang/Object;
.source "O8UQ"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹᩸ۜ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 2
    iget p1, p0, Ll/᩹᩸ۜ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 78
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "dfrwn"

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void

    :pswitch_0
    sget p1, Ll/ۗۨܿ;->ܳ֫:I

    .line 99
    invoke-static {p2}, Ll/۬ۨܿ;->ۧ(Z)V

    return-void

    .line 112
    :pswitch_1
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "mbp"

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
