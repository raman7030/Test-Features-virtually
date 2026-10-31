.class public final synthetic Ll/۠֫ܳ;
.super Ljava/lang/Object;
.source "1599"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Ll/ۜܰܿ;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/۠֫ܳ;->᩸:Ll/ۜܰܿ;

    iput-object p1, p0, Ll/۠֫ܳ;->᩹:Landroid/widget/EditText;

    iput-object p2, p0, Ll/۠֫ܳ;->᩶:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 0
    iget-object v0, p0, Ll/۠֫ܳ;->᩹:Landroid/widget/EditText;

    iget-object v1, p0, Ll/۠֫ܳ;->᩶:Landroid/widget/EditText;

    iget-object v2, p0, Ll/۠֫ܳ;->᩸:Ll/ۜܰܿ;

    invoke-static {v2, v0, v1, p1}, Ll/᩸֫ܳ;->֫(Ll/ۜܰܿ;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method
