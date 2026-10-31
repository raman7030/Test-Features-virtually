.class public final synthetic Ll/ۧ۫ܳ;
.super Ljava/lang/Object;
.source "A940"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۧ۫ܳ;->᩸:I

    iput-object p1, p0, Ll/ۧ۫ܳ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۧ۫ܳ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۧ۫ܳ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    iget p1, p0, Ll/ۧ۫ܳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۧ۫ܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ۧۗ᩷;

    .line 11
    iget-object p2, p0, Ll/ۧ۫ܳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast p2, Ll/ۗܺ᩷;

    .line 15
    iget-object v0, p0, Ll/ۧ۫ܳ;->ۙ:Ljava/lang/Object;

    .line 17
    check-cast v0, [I

    .line 102
    invoke-virtual {p2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p2

    const v1, 0x7f120a76

    .line 103
    invoke-virtual {p2, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f120162

    .line 104
    invoke-virtual {p2, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/ܰۙ᩷;

    invoke-direct {v1, p1, v0}, Ll/ܰۙ᩷;-><init>(Ll/ۧۗ᩷;[I)V

    const p1, 0x7f12070a

    .line 105
    invoke-virtual {p2, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 108
    invoke-virtual {p2, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 109
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۧ۫ܳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    iget-object p2, p0, Ll/ۧ۫ܳ;->᩶:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۧ۫ܳ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    .line 84
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 85
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    invoke-virtual {p1, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 88
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
