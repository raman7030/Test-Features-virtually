.class public final Ll/᩵ۧܽ;
.super Ll/ܽ᩶᩵;
.source "YAN2"

# interfaces
.implements Ll/ܺ᩹᩵;


# static fields
.field public static final ᩹:Ll/᩵ۧܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/᩵ۧܽ;

    const/4 v1, 0x1

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/᩵ۧܽ;->᩹:Ll/᩵ۧܽ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 160
    check-cast p1, Landroidx/window/sidecar/SidecarDisplayFeature;

    invoke-virtual {p0, p1}, Ll/᩵ۧܽ;->֫(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "$this$require"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
