.class public final Ll/ۢ᩹;
.super Ljava/lang/Object;
.source "U5Z7"


# direct methods
.method public static ֫(Landroid/app/Activity;[Ljava/lang/String;I)V
    .locals 0

    .line 904
    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)V
    .locals 0

    .line 914
    check-cast p0, Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;

    .line 915
    invoke-interface {p0}, Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;->onSharedElementsReady()V

    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 0

    .line 909
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
