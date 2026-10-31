.class public final Ll/ۧ᩶֫;
.super Ljava/lang/Object;
.source "97U0"


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 87
    new-instance v0, Landroid/media/RouteDiscoveryPreference$Builder;

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    new-instance v1, Landroid/media/RouteDiscoveryPreference$Builder;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Landroid/media/RouteDiscoveryPreference$Builder;-><init>(Ljava/util/List;Z)V

    .line 90
    invoke-virtual {v1}, Landroid/media/RouteDiscoveryPreference$Builder;->build()Landroid/media/RouteDiscoveryPreference;

    return-void
.end method
