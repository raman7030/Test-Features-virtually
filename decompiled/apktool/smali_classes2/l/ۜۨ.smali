.class public final Ll/ۜۨ;
.super Ljava/lang/Object;
.source "14IM"


# instance fields
.field public final ֫:Landroid/view/PointerIcon;


# direct methods
.method public constructor <init>(Landroid/view/PointerIcon;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Ll/ۜۨ;->֫:Landroid/view/PointerIcon;

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ll/ۜۨ;
    .locals 2

    .line 132
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 133
    new-instance v0, Ll/ۜۨ;

    const/16 v1, 0x3ea

    invoke-static {p0, v1}, Ll/᩻ۨ;->֫(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۜۨ;-><init>(Landroid/view/PointerIcon;)V

    return-object v0

    .line 135
    :cond_0
    new-instance p0, Ll/ۜۨ;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll/ۜۨ;-><init>(Landroid/view/PointerIcon;)V

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۜۨ;->֫:Landroid/view/PointerIcon;

    return-object v0
.end method
