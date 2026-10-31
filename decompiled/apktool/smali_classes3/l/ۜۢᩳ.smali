.class public final synthetic Ll/ۜۢᩳ;
.super Ljava/lang/Object;
.source "U8VQ"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Landroid/view/MenuItem;

.field public final synthetic ᩹:Landroid/view/MenuItem;


# direct methods
.method public synthetic constructor <init>(Landroid/view/MenuItem;Landroid/view/MenuItem;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۢᩳ;->᩸:Landroid/view/MenuItem;

    iput-object p2, p0, Ll/ۜۢᩳ;->᩹:Landroid/view/MenuItem;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 162
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Ll/ۜۢᩳ;->᩸:Landroid/view/MenuItem;

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 163
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Ll/ۜۢᩳ;->᩹:Landroid/view/MenuItem;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void
.end method
