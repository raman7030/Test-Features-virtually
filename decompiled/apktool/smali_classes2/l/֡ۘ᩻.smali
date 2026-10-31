.class public final synthetic Ll/֡ۘ᩻;
.super Ljava/lang/Object;
.source "J7J5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡ۘ᩻;->᩸:I

    iput-object p2, p0, Ll/֡ۘ᩻;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/֡ۘ᩻;->᩸:I

    .line 4
    iget-object v1, p0, Ll/֡ۘ᩻;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۘ᩻ܿ;

    .line 12
    invoke-virtual {v1, p1}, Ll/ۘ᩻ܿ;->֫(Landroid/view/View;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/᩶ۘ᩻;

    .line 17
    sget p1, Ll/᩶ۘ᩻;->ۢۧ:I

    .line 55
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
