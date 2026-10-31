.class public final synthetic Ll/᩺ۜ᩷;
.super Ljava/lang/Object;
.source "A7OH"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۟ۜ᩷;

.field public final synthetic ᩹:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۜ᩷;Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۜ᩷;->᩸:Ll/۟ۜ᩷;

    iput-object p2, p0, Ll/᩺ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 2
    iget-object p1, p0, Ll/᩺ۜ᩷;->᩸:Ll/۟ۜ᩷;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    iget-object v0, p0, Ll/᩺ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;->onLongClick(Lbin/mt/plugin/api/ui/PluginView;)Z

    move-result p1

    return p1
.end method
