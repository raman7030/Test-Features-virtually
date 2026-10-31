.class public final Ll/ᩳ᩻;
.super Ll/ۗ᩻;
.source "45OX"

# interfaces
.implements Ll/᩶ۜ;


# instance fields
.field public ۗ:Ljava/lang/ref/WeakReference;

.field public ۙ:Ll/ۙ᩻;

.field public final synthetic ۫:Ll/ܿ᩻;

.field public final ۬:Ll/ۗۜ;

.field public final ᩶:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ll/ܿ᩻;Landroid/content/Context;Ll/ۙ᩻;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 986
    iput-object p1, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    .line 987
    iput-object p2, p0, Ll/ᩳ᩻;->᩶:Landroid/content/Context;

    .line 988
    iput-object p3, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    .line 989
    new-instance p1, Ll/ۗۜ;

    invoke-direct {p1, p2}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    .line 990
    invoke-virtual {p1, p2}, Ll/ۗۜ;->setDefaultShowAsAction(I)Ll/ۗۜ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ᩻;->۬:Ll/ۗۜ;

    .line 991
    invoke-virtual {p1, p0}, Ll/ۗۜ;->setCallback(Ll/᩶ۜ;)V

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1113
    iget-object p1, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    if-eqz p1, :cond_0

    .line 1114
    check-cast p1, Ll/ᩳܳ;

    invoke-virtual {p1, p0, p2}, Ll/ᩳܳ;->֫(Ll/ۗ᩻;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onMenuModeChange(Ll/ۗۜ;)V
    .locals 0

    .line 1141
    iget-object p1, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    if-nez p1, :cond_0

    return-void

    .line 1144
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ᩻;->᩷()V

    .line 1145
    iget-object p1, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object p1, p1, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {p1}, Ll/᩹᩷;->ܳ()V

    return-void
.end method

.method public final ֫()V
    .locals 4

    .line 1006
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v1, v0, Ll/ܿ᩻;->֫:Ll/ᩳ᩻;

    if-eq v1, p0, :cond_0

    return-void

    .line 1015
    :cond_0
    iget-boolean v1, v0, Ll/ܿ᩻;->ۖ:Z

    if-eqz v1, :cond_1

    .line 1018
    iput-object p0, v0, Ll/ܿ᩻;->ۢ:Ll/ᩳ᩻;

    .line 1019
    iget-object v1, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    iput-object v1, v0, Ll/ܿ᩻;->ۡ:Ll/ۙ᩻;

    goto :goto_0

    .line 1021
    :cond_1
    iget-object v1, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    check-cast v1, Ll/ᩳܳ;

    invoke-virtual {v1, p0}, Ll/ᩳܳ;->֫(Ll/ۗ᩻;)V

    :goto_0
    const/4 v1, 0x0

    .line 1023
    iput-object v1, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    const/4 v2, 0x0

    .line 1024
    invoke-virtual {v0, v2}, Ll/ܿ᩻;->ܿ(Z)V

    .line 1027
    iget-object v2, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v2}, Ll/᩹᩷;->֫()V

    .line 1028
    iget-object v2, v0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    iget-boolean v3, v0, Ll/ܿ᩻;->ᩴ:Z

    invoke-virtual {v2, v3}, Ll/ۤ᩷;->ۧ(Z)V

    .line 1030
    iput-object v1, v0, Ll/ܿ᩻;->֫:Ll/ᩳ᩻;

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 1082
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ᩳ᩻;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 1061
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->֫(Landroid/view/View;)V

    .line 1062
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩳ᩻;->ۗ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1067
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 1097
    invoke-super {p0, p1}, Ll/ۗ᩻;->֫(Z)V

    .line 1098
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->֫(Z)V

    return-void
.end method

.method public final ۡ()Z
    .locals 2

    .line 1051
    iget-object v0, p0, Ll/ᩳ᩻;->۬:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 1053
    :try_start_0
    iget-object v1, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    check-cast v1, Ll/ᩳܳ;

    invoke-virtual {v1, p0, v0}, Ll/ᩳܳ;->ۧ(Ll/ۗ᩻;Landroid/view/Menu;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1055
    invoke-virtual {v0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    return v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    .line 1056
    throw v1
.end method

.method public final ۢ()Z
    .locals 1

    .line 1103
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0}, Ll/᩹᩷;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ۧ()Landroid/view/View;
    .locals 1

    .line 1108
    iget-object v0, p0, Ll/ᩳ᩻;->ۗ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 1077
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ᩳ᩻;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1072
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܽ()Ll/ۗۜ;
    .locals 1

    .line 1001
    iget-object v0, p0, Ll/ᩳ᩻;->۬:Ll/ۗۜ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/CharSequence;
    .locals 1

    .line 1092
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0}, Ll/᩹᩷;->ۧ()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Landroid/view/MenuInflater;
    .locals 2

    .line 996
    new-instance v0, Ll/۟᩻;

    iget-object v1, p0, Ll/ᩳ᩻;->᩶:Landroid/content/Context;

    invoke-direct {v0, v1}, Ll/۟᩻;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    .line 1035
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->֫:Ll/ᩳ᩻;

    if-eq v0, p0, :cond_0

    return-void

    .line 1042
    :cond_0
    iget-object v0, p0, Ll/ᩳ᩻;->۬:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 1044
    :try_start_0
    iget-object v1, p0, Ll/ᩳ᩻;->ۙ:Ll/ۙ᩻;

    invoke-interface {v1, p0, v0}, Ll/ۙ᩻;->֫(Ll/ۗ᩻;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1046
    invoke-virtual {v0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    .line 1047
    throw v1
.end method

.method public final ᩻()Ljava/lang/CharSequence;
    .locals 1

    .line 1087
    iget-object v0, p0, Ll/ᩳ᩻;->۫:Ll/ܿ᩻;

    iget-object v0, v0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0}, Ll/᩹᩷;->ܽ()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method
