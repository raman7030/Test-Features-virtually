.class public final Ll/᩶ۜ᩷;
.super Ljava/lang/Object;
.source "K7RF"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ֫:Ll/ۙۜ᩷;


# direct methods
.method public constructor <init>(Ll/ۙۜ᩷;)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۜ᩷;->֫:Ll/ۙۜ᩷;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Lbin/mt/plugin/api/ui/PluginCompoundButton;Z)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 125
    :cond_0
    iget-object p2, p0, Ll/᩶ۜ᩷;->֫:Ll/ۙۜ᩷;

    invoke-static {p2}, Ll/ۙۜ᩷;->֫(Ll/ۙۜ᩷;)Ll/᩹ۜ᩷;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 126
    invoke-static {p2}, Ll/ۙۜ᩷;->֫(Ll/ۙۜ᩷;)Ll/᩹ۜ᩷;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۜۜ᩷;->setChecked(Z)V

    .line 128
    :cond_1
    check-cast p1, Ll/᩹ۜ᩷;

    invoke-static {p2, p1}, Ll/ۙۜ᩷;->֫(Ll/ۙۜ᩷;Ll/᩹ۜ᩷;)V

    return-void
.end method
