.class public final synthetic Ll/۫᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫᩶ܳ;->᩸:I

    iput-object p2, p0, Ll/۫᩶ܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 2
    iget p1, p0, Ll/۫᩶ܳ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/۫᩶ܳ;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/۟ۡۢ;

    .line 11
    sget p1, Ll/۟ۡۢ;->ᩴۧ:I

    .line 118
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ll/ܳۙܳ;

    invoke-static {v0}, Ll/ܳۙܳ;->ۧ(Ll/ܳۙܳ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
