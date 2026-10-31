.class public final synthetic Ll/֨᩷᩷;
.super Ljava/lang/Object;
.source "U7QN"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic ᩸:Ll/᩸᩷᩷;

.field public final synthetic ᩹:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;


# direct methods
.method public synthetic constructor <init>(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩷᩷;->᩸:Ll/᩸᩷᩷;

    iput-object p2, p0, Ll/֨᩷᩷;->᩹:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 0
    iget-object p1, p0, Ll/֨᩷᩷;->᩸:Ll/᩸᩷᩷;

    iget-object v0, p0, Ll/֨᩷᩷;->᩹:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;

    invoke-static {p1, v0, p2, p3}, Ll/᩸᩷᩷;->֫(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
