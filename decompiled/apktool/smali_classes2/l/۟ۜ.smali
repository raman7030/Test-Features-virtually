.class public final Ll/۟ۜ;
.super Ljava/lang/Object;
.source "E5GW"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final ᩸:Landroid/view/MenuItem$OnMenuItemClickListener;

.field public final synthetic ᩹:Ll/֫᩷;


# direct methods
.method public constructor <init>(Ll/֫᩷;Landroid/view/MenuItem$OnMenuItemClickListener;)V
    .locals 0

    .line 395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۜ;->᩹:Ll/֫᩷;

    .line 396
    iput-object p2, p0, Ll/۟ۜ;->᩸:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 401
    iget-object v0, p0, Ll/۟ۜ;->᩹:Ll/֫᩷;

    invoke-virtual {v0, p1}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v0, p0, Ll/۟ۜ;->᩸:Landroid/view/MenuItem$OnMenuItemClickListener;

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
