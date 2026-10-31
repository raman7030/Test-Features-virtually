.class public final synthetic Ll/ܽ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/ۖۛۡ;
.implements Ll/ܶۖ;
.implements Ll/ܽۨ;
.implements Ll/᩻ᩴ;
.implements Ll/ۨ᩵᩷;
.implements Ll/᩶ۤۡ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽ۫᩷;->᩸:I

    iput-object p2, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 1

    .line 0
    iget v0, p0, Ll/ܽ۫᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/search/SearchView;

    invoke-static {v0, p1, p2}, Lcom/google/android/material/search/SearchView;->$r8$lambda$lg1Kf9luTqvuNNQuLqehlYyGOi8(Lcom/google/android/material/search/SearchView;Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object p1, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܺܶۜ;

    invoke-static {p1, p2}, Ll/ܺܶۜ;->֫(Ll/ܺܶۜ;Ll/᩸ܰ;)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public onGetPath(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۟ܳۢ;

    invoke-static {v0, p2, p1}, Ll/۟ܳۢ;->֫(Ll/۟ܳۢ;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget v0, p0, Ll/ܽ۫᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܳۨܿ;

    invoke-static {v0, p1}, Ll/ܳۨܿ;->֫(Ll/ܳۨܿ;Landroid/view/MenuItem;)V

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܿۛ᩷;

    invoke-virtual {v0, p1}, Ll/ܿۛ᩷;->֫(Landroid/view/MenuItem;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ܽ۫᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۜᩳ᩻;

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ᩴۤܽ;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۘ۬ܽ;

    :goto_0
    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ܽ۫᩷;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܶۜۢ;

    invoke-static {p1}, Ll/ܶۜۢ;->֫(Ll/ܶۜۢ;)V

    return-void
.end method
