.class public final Ll/᩶᩹ۢ;
.super Ll/ۚ᩶ۢ;
.source "Q1R8"


# instance fields
.field public ֫:Landroid/view/inputmethod/InputMethodManager;

.field public final synthetic ۧ:Ll/ۤ᩹ۢ;


# direct methods
.method public constructor <init>(Ll/ۤ᩹ۢ;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-object p1, p0, Ll/᩶᩹ۢ;->ۧ:Ll/ۤ᩹ۢ;

    const-string v0, "input_method"

    .line 139
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iput-object p1, p0, Ll/᩶᩹ۢ;->֫:Landroid/view/inputmethod/InputMethodManager;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 143
    iget-object v0, p0, Ll/᩶᩹ۢ;->֫:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    .line 144
    iget-object v1, p0, Ll/᩶᩹ۢ;->ۧ:Ll/ۤ᩹ۢ;

    invoke-static {v1}, Ll/ۤ᩹ۢ;->ۧ(Ll/ۤ᩹ۢ;)Ll/֡᩶ۢ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܿ᩶ۢ;)Z
    .locals 1

    const/16 v0, 0x42

    if-ne p1, v0, :cond_0

    .line 150
    invoke-virtual {p2}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 151
    iget-object p1, p0, Ll/᩶᩹ۢ;->ۧ:Ll/ۤ᩹ۢ;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 173
    iget-object v0, p0, Ll/᩶᩹ۢ;->ۧ:Ll/ۤ᩹ۢ;

    invoke-static {v0}, Ll/ۤ᩹ۢ;->ܽ(Ll/ۤ᩹ۢ;)Ll/ܺ᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ᩹ۢ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ۧ(ILl/ܿ᩶ۢ;)Z
    .locals 1

    const/16 v0, 0x6d

    if-ne p1, v0, :cond_0

    .line 159
    invoke-virtual {p2}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 160
    iget-object p1, p0, Ll/᩶᩹ۢ;->ۧ:Ll/ۤ᩹ۢ;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 168
    iget-object v0, p0, Ll/᩶᩹ۢ;->ۧ:Ll/ۤ᩹ۢ;

    invoke-static {v0}, Ll/ۤ᩹ۢ;->ܽ(Ll/ۤ᩹ۢ;)Ll/ܺ᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ᩹ۢ;->ۧ()Z

    move-result v0

    return v0
.end method
