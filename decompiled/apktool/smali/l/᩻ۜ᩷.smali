.class public final synthetic Ll/᩻ۜ᩷;
.super Ljava/lang/Object;
.source "T7RP"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/ۜۜ᩷;

.field public final synthetic ᩹:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۜ᩷;Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۜ᩷;->᩸:Ll/ۜۜ᩷;

    iput-object p2, p0, Ll/᩻ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/᩻ۜ᩷;->᩸:Ll/ۜۜ᩷;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iget-object v0, p0, Ll/᩻ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    invoke-interface {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;->onCheckedChanged(Lbin/mt/plugin/api/ui/PluginCompoundButton;Z)V

    return-void
.end method
