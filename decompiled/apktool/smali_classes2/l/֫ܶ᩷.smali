.class public final Ll/֫ܶ᩷;
.super Ljava/lang/Object;
.source "09LR"

# interfaces
.implements Ll/ۤ۟ۜ;


# instance fields
.field public final synthetic ֫:Ll/ܺܶ᩷;

.field public final synthetic ۧ:Lcom/google/android/material/tabs/TabLayout$Tab;

.field public final synthetic ܽ:Lcom/google/android/material/tabs/TabLayout$Tab;

.field public final synthetic ܿ:Lcom/google/android/material/tabs/TabLayout;

.field public final synthetic ᩳ:Lcom/google/android/material/tabs/TabLayout$Tab;


# direct methods
.method public constructor <init>(Ll/ܺܶ᩷;Lcom/google/android/material/tabs/TabLayout;Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܶ᩷;->֫:Ll/ܺܶ᩷;

    iput-object p2, p0, Ll/֫ܶ᩷;->ܿ:Lcom/google/android/material/tabs/TabLayout;

    iput-object p3, p0, Ll/֫ܶ᩷;->ۧ:Lcom/google/android/material/tabs/TabLayout$Tab;

    iput-object p4, p0, Ll/֫ܶ᩷;->ܽ:Lcom/google/android/material/tabs/TabLayout$Tab;

    iput-object p5, p0, Ll/֫ܶ᩷;->ᩳ:Lcom/google/android/material/tabs/TabLayout$Tab;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 135
    iget-object v0, p0, Ll/֫ܶ᩷;->ܿ:Lcom/google/android/material/tabs/TabLayout;

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    return-void

    .line 143
    :cond_0
    iget-object p1, p0, Ll/֫ܶ᩷;->ᩳ:Lcom/google/android/material/tabs/TabLayout$Tab;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void

    .line 140
    :cond_1
    iget-object p1, p0, Ll/֫ܶ᩷;->ܽ:Lcom/google/android/material/tabs/TabLayout$Tab;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void

    .line 137
    :cond_2
    iget-object p1, p0, Ll/֫ܶ᩷;->ۧ:Lcom/google/android/material/tabs/TabLayout$Tab;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method

.method public final ֫(Ll/ۙ۟ۜ;)V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/֫ܶ᩷;->֫:Ll/ܺܶ᩷;

    invoke-static {v0, p1}, Ll/ܺܶ᩷;->֫(Ll/ܺܶ᩷;Ll/ۙ۟ۜ;)V

    .line 120
    invoke-static {v0}, Ll/ܺܶ᩷;->ܺ(Ll/ܺܶ᩷;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 150
    iget-object v0, p0, Ll/֫ܶ᩷;->֫:Ll/ܺܶ᩷;

    iget-object v1, v0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    if-eqz p1, :cond_0

    invoke-static {v0}, Ll/ܺܶ᩷;->֫(Ll/ܺܶ᩷;)Landroid/text/SpannableString;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/ܺܶ᩷;->ܿ(Ll/ܺܶ᩷;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 151
    invoke-static {v0}, Ll/ܺܶ᩷;->᩻(Ll/ܺܶ᩷;)Landroid/view/MenuItem;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 152
    invoke-static {v0}, Ll/ܺܶ᩷;->᩻(Ll/ܺܶ᩷;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    :cond_1
    return-void
.end method

.method public final ֫(ZZ)V
    .locals 2

    .line 125
    iget-object v0, p0, Ll/֫ܶ᩷;->֫:Ll/ܺܶ᩷;

    invoke-static {v0}, Ll/ܺܶ᩷;->᩷(Ll/ܺܶ᩷;)Landroid/view/MenuItem;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 126
    invoke-static {v0}, Ll/ܺܶ᩷;->᩷(Ll/ܺܶ᩷;)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 128
    :cond_0
    invoke-static {v0}, Ll/ܺܶ᩷;->ܳ(Ll/ܺܶ᩷;)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 129
    invoke-static {v0}, Ll/ܺܶ᩷;->ܳ(Ll/ܺܶ᩷;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ۙ۟ۜ;)V
    .locals 0

    .line 114
    invoke-virtual {p0, p1}, Ll/֫ܶ᩷;->֫(Ll/ۙ۟ۜ;)V

    return-void
.end method
