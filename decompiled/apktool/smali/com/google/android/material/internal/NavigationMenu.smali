.class public Lcom/google/android/material/internal/NavigationMenu;
.super Ll/ۗۜ;
.source "NavigationMenu.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 45
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۗۜ;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    check-cast p1, Ll/ۛۜ;

    .line 46
    new-instance p2, Lcom/google/android/material/internal/NavigationSubMenu;

    invoke-virtual {p0}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p0, p1}, Lcom/google/android/material/internal/NavigationSubMenu;-><init>(Landroid/content/Context;Lcom/google/android/material/internal/NavigationMenu;Ll/ۛۜ;)V

    .line 47
    invoke-virtual {p1, p2}, Ll/ۛۜ;->֫(Ll/᩵᩷;)V

    return-object p2
.end method
