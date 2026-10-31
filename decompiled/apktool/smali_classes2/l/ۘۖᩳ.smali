.class public final synthetic Ll/ۘۖᩳ;
.super Ljava/lang/Object;
.source "Q649"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۘۖᩳ;->᩸:I

    iput-object p1, p0, Ll/ۘۖᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۘۖᩳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۘۖᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Lcom/google/android/material/search/SearchView;

    .line 12
    invoke-static {v1, p1}, Lcom/google/android/material/search/SearchView;->$r8$lambda$-fNNeett_Cm8kBqRqI1578N7AFg(Lcom/google/android/material/search/SearchView;Landroid/view/View;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/ܶۖᩳ;

    .line 17
    sget p1, Ll/ܶۖᩳ;->ᩴۧ:I

    .line 90
    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    invoke-virtual {v1}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    const v0, 0x102000b

    .line 55
    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 56
    invoke-static {p1}, Ll/᩶ۖ᩷;->ۧ(Landroid/view/View;)V

    .line 57
    new-instance v0, Ll/᩷ܶۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
