.class public final Ll/ܽۜ;
.super Ljava/lang/Object;
.source "P54R"


# direct methods
.method public static ֫(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 0

    .line 205
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z
    .locals 0

    .line 199
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onSearchRequested(Landroid/view/SearchEvent;)Z

    move-result p0

    return p0
.end method
