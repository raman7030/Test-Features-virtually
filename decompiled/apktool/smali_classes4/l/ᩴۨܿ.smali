.class public final synthetic Ll/ᩴۨܿ;
.super Ljava/lang/Object;
.source "PAKQ"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ᩴۨܿ;->᩸:I

    iput-object p1, p0, Ll/ᩴۨܿ;->᩹:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 2
    iget p1, p0, Ll/ᩴۨܿ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/ᩴۨܿ;->᩹:Landroid/content/Context;

    packed-switch p1, :pswitch_data_0

    .line 10
    invoke-static {v0}, Ll/᩸ᩴܺ;->֫(Landroid/content/Context;)V

    return-void

    .line 13
    :pswitch_0
    check-cast v0, Ll/ۗܺ᩷;

    .line 15
    sget p1, Ll/ۗۨܿ;->ܳ֫:I

    .line 138
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
