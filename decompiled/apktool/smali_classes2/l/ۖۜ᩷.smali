.class public final synthetic Ll/ۖۜ᩷;
.super Ljava/lang/Object;
.source "57RA"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic ֫:Ll/ᩴۜ᩷;

.field public final synthetic ۧ:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۜ᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۜ᩷;->֫:Ll/ᩴۜ᩷;

    iput-object p2, p0, Ll/ۖۜ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ۖۜ᩷;->֫:Ll/ᩴۜ᩷;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    iget-object v0, p0, Ll/ۖۜ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;->onShow(Lbin/mt/plugin/api/ui/dialog/PluginDialog;)V

    return-void
.end method
