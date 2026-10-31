.class public final Ll/۟۠᩷;
.super Ljava/lang/Object;
.source "09LR"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# instance fields
.field public final synthetic ֫:Ll/ܺܶ᩷;

.field public final synthetic ۧ:Lcom/google/android/material/tabs/TabLayout$Tab;

.field public final synthetic ܽ:Lcom/google/android/material/tabs/TabLayout$Tab;

.field public final synthetic ᩳ:Lcom/google/android/material/tabs/TabLayout$Tab;


# direct methods
.method public constructor <init>(Ll/ܺܶ᩷;Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۠᩷;->֫:Ll/ܺܶ᩷;

    iput-object p2, p0, Ll/۟۠᩷;->ۧ:Lcom/google/android/material/tabs/TabLayout$Tab;

    iput-object p3, p0, Ll/۟۠᩷;->ܽ:Lcom/google/android/material/tabs/TabLayout$Tab;

    iput-object p4, p0, Ll/۟۠᩷;->ᩳ:Lcom/google/android/material/tabs/TabLayout$Tab;

    return-void
.end method


# virtual methods
.method public final onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1

    .line 107
    iget-object p1, p0, Ll/۟۠᩷;->֫:Ll/ܺܶ᩷;

    invoke-static {p1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object v0

    invoke-static {p1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰ۟ۜ;->᩷()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ll/ܰ۟ۜ;->ܽ(Z)V

    return-void
.end method

.method public final onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 2

    .line 83
    iget-object v0, p0, Ll/۟۠᩷;->ۧ:Lcom/google/android/material/tabs/TabLayout$Tab;

    iget-object v1, p0, Ll/۟۠᩷;->֫:Ll/ܺܶ᩷;

    if-ne p1, v0, :cond_0

    .line 84
    invoke-static {v1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܰ۟ۜ;->֫(I)V

    .line 85
    invoke-static {v1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰ۟ۜ;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    .line 86
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    return-void

    .line 88
    :cond_0
    iget-object v0, p0, Ll/۟۠᩷;->ܽ:Lcom/google/android/material/tabs/TabLayout$Tab;

    if-ne p1, v0, :cond_1

    .line 89
    invoke-static {v1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/ܰ۟ۜ;->֫(I)V

    .line 90
    invoke-static {v1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰ۟ۜ;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    const p1, 0x7f1201f0

    .line 91
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 93
    :cond_1
    iget-object v0, p0, Ll/۟۠᩷;->ᩳ:Lcom/google/android/material/tabs/TabLayout$Tab;

    if-ne p1, v0, :cond_2

    .line 94
    invoke-static {v1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ll/ܰ۟ۜ;->֫(I)V

    .line 95
    invoke-static {v1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰ۟ۜ;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    .line 96
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    :cond_2
    return-void
.end method

.method public final onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
