.class public final synthetic Ll/᩷ۜ᩷;
.super Ljava/lang/Object;
.source "57RA"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ᩴۜ᩷;

.field public final synthetic ᩹:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۜ᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۜ᩷;->᩸:Ll/ᩴۜ᩷;

    iput-object p2, p0, Ll/᩷ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/᩷ۜ᩷;->᩸:Ll/ᩴۜ᩷;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    iget-object v0, p0, Ll/᩷ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;

    invoke-interface {v0, p1, p2}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;->onClick(Lbin/mt/plugin/api/ui/dialog/PluginDialog;I)V

    return-void
.end method
