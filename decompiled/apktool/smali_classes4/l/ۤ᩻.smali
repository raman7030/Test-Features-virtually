.class public final Ll/ۤ᩻;
.super Ll/ۗ᩻;
.source "U5VL"

# interfaces
.implements Ll/᩶ۜ;


# instance fields
.field public ۗ:Ll/᩹᩷;

.field public ۙ:Landroid/content/Context;

.field public ۤ:Ll/ۗۜ;

.field public ۫:Z

.field public ۬:Ljava/lang/ref/WeakReference;

.field public ᩶:Ll/ۙ᩻;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/᩹᩷;Ll/ۙ᩻;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ۤ᩻;->ۙ:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    .line 52
    iput-object p3, p0, Ll/ۤ᩻;->᩶:Ll/ۙ᩻;

    .line 54
    new-instance p1, Ll/ۗۜ;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ll/ۗۜ;->setDefaultShowAsAction(I)Ll/ۗۜ;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩻;->ۤ:Ll/ۗۜ;

    .line 56
    invoke-virtual {p1, p0}, Ll/ۗۜ;->setCallback(Ll/᩶ۜ;)V

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 0

    .line 139
    iget-object p1, p0, Ll/ۤ᩻;->᩶:Ll/ۙ᩻;

    invoke-interface {p1, p0, p2}, Ll/ۙ᩻;->֫(Ll/ۗ᩻;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final onMenuModeChange(Ll/ۗۜ;)V
    .locals 0

    .line 159
    invoke-virtual {p0}, Ll/ۤ᩻;->᩷()V

    .line 160
    iget-object p1, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {p1}, Ll/᩹᩷;->ܳ()V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 104
    iget-boolean v0, p0, Ll/ۤ᩻;->۫:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 107
    iput-boolean v0, p0, Ll/ۤ᩻;->۫:Z

    .line 109
    iget-object v0, p0, Ll/ۤ᩻;->᩶:Ll/ۙ᩻;

    invoke-interface {v0, p0}, Ll/ۙ᩻;->֫(Ll/ۗ᩻;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۤ᩻;->ۙ:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۤ᩻;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->֫(Landroid/view/View;)V

    if-eqz p1, :cond_0

    .line 94
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ll/ۤ᩻;->۬:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 82
    invoke-super {p0, p1}, Ll/ۗ᩻;->֫(Z)V

    .line 83
    iget-object v0, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->֫(Z)V

    return-void
.end method

.method public final ۢ()Z
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v0}, Ll/᩹᩷;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ۧ()Landroid/view/View;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۤ᩻;->۬:Ljava/lang/ref/WeakReference;

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

    .line 72
    iget-object v0, p0, Ll/ۤ᩻;->ۙ:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۤ᩻;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v0, p1}, Ll/᩹᩷;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܽ()Ll/ۗۜ;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۤ᩻;->ۤ:Ll/ۗۜ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/CharSequence;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v0}, Ll/᩹᩷;->ۧ()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Landroid/view/MenuInflater;
    .locals 2

    .line 134
    new-instance v0, Ll/۟᩻;

    iget-object v1, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۟᩻;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/ۤ᩻;->᩶:Ll/ۙ᩻;

    iget-object v1, p0, Ll/ۤ᩻;->ۤ:Ll/ۗۜ;

    invoke-interface {v0, p0, v1}, Ll/ۙ᩻;->֫(Ll/ۗ᩻;Landroid/view/Menu;)Z

    return-void
.end method

.method public final ᩻()Ljava/lang/CharSequence;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۤ᩻;->ۗ:Ll/᩹᩷;

    invoke-virtual {v0}, Ll/᩹᩷;->ܽ()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method
