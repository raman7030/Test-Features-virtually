.class public final Ll/᩵ۜ᩷;
.super Ljava/lang/Object;
.source "Q7R7"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/֡ۜ᩷;

.field public final synthetic ᩹:Lbin/mt/plugin/api/ui/PluginEditTextWatcher;


# direct methods
.method public constructor <init>(Ll/֡ۜ᩷;Lbin/mt/plugin/api/ui/PluginEditTextWatcher;)V
    .locals 0

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۜ᩷;->᩸:Ll/֡ۜ᩷;

    iput-object p2, p0, Ll/᩵ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginEditTextWatcher;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 306
    iget-object v0, p0, Ll/᩵ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginEditTextWatcher;

    iget-object v1, p0, Ll/᩵ۜ᩷;->᩸:Ll/֡ۜ᩷;

    invoke-interface {v0, v1, p1}, Lbin/mt/plugin/api/ui/PluginEditTextWatcher;->afterTextChanged(Lbin/mt/plugin/api/ui/PluginEditText;Landroid/text/Editable;)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 6

    .line 296
    iget-object v0, p0, Ll/᩵ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginEditTextWatcher;

    iget-object v1, p0, Ll/᩵ۜ᩷;->᩸:Ll/֡ۜ᩷;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lbin/mt/plugin/api/ui/PluginEditTextWatcher;->beforeTextChanged(Lbin/mt/plugin/api/ui/PluginEditText;Ljava/lang/CharSequence;III)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 6

    .line 301
    iget-object v0, p0, Ll/᩵ۜ᩷;->᩹:Lbin/mt/plugin/api/ui/PluginEditTextWatcher;

    iget-object v1, p0, Ll/᩵ۜ᩷;->᩸:Ll/֡ۜ᩷;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lbin/mt/plugin/api/ui/PluginEditTextWatcher;->onTextChanged(Lbin/mt/plugin/api/ui/PluginEditText;Ljava/lang/CharSequence;III)V

    return-void
.end method
