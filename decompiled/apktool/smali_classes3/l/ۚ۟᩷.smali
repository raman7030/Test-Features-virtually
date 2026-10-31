.class public final synthetic Ll/ۚ۟᩷;
.super Ljava/lang/Object;
.source "O1JS"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ۛ۟᩷;

.field public final synthetic ᩹:Ll/ܽ᩻ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛ۟᩷;Ll/ܽ᩻ۡ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ۟᩷;->᩸:Ll/ۛ۟᩷;

    iput-object p2, p0, Ll/ۚ۟᩷;->᩹:Ll/ܽ᩻ۡ;

    iput-boolean p3, p0, Ll/ۚ۟᩷;->᩶:Z

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ۚ۟᩷;->᩹:Ll/ܽ᩻ۡ;

    iget-boolean v1, p0, Ll/ۚ۟᩷;->᩶:Z

    iget-object v2, p0, Ll/ۚ۟᩷;->᩸:Ll/ۛ۟᩷;

    invoke-static {v2, v0, v1, p1}, Ll/ۛ۟᩷;->֫(Ll/ۛ۟᩷;Ll/ܽ᩻ۡ;ZLandroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method
