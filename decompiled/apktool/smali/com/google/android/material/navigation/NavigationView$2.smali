.class public Lcom/google/android/material/navigation/NavigationView$2;
.super Ljava/lang/Object;
.source "NavigationView.java"

# interfaces
.implements Ll/᩶ۜ;


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView$2;->this$0:Lcom/google/android/material/navigation/NavigationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 0

    .line 344
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView$2;->this$0:Lcom/google/android/material/navigation/NavigationView;

    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView;->listener:Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;->onNavigationItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuModeChange(Ll/ۗۜ;)V
    .locals 0

    return-void
.end method
