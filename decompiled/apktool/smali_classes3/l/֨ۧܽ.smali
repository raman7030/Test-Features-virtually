.class public final Ll/֨ۧܽ;
.super Ll/ܽ᩶᩵;
.source "YAN2"

# interfaces
.implements Ll/ܺ᩹᩵;


# static fields
.field public static final ᩹:Ll/֨ۧܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/֨ۧܽ;

    const/4 v1, 0x1

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/֨ۧܽ;->᩹:Ll/֨ۧܽ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 171
    check-cast p1, Landroidx/window/sidecar/SidecarDisplayFeature;

    invoke-virtual {p0, p1}, Ll/֨ۧܽ;->֫(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$this$require"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->left:I

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Rect;->top:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
