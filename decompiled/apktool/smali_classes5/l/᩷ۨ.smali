.class public Ll/᩷ۨ;
.super Ll/ܺۨ;
.source "A9BS"


# instance fields
.field public final ֫:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, Ll/᩷ۨ;->֫:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 3

    .line 143
    iget-object v0, p0, Ll/᩷ۨ;->֫:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    .line 145
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 146
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method public ۧ()V
    .locals 3

    .line 111
    iget-object v0, p0, Ll/᩷ۨ;->֫:Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_2

    .line 115
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 121
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    goto :goto_1

    .line 119
    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-object v1, v0

    :goto_1
    if-nez v1, :cond_3

    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    .line 129
    invoke-virtual {v1}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 131
    new-instance v0, Ll/᩵᩺ᩳ;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_2
    return-void
.end method
