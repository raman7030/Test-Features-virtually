.class public Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;
.super Ljava/lang/Object;
.source "NavigationMenuPresenter.java"

# interfaces
.implements Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuItem;


# instance fields
.field public final menuItem:Ll/ۛۜ;

.field public needsEmptyIcon:Z


# direct methods
.method public constructor <init>(Ll/ۛۜ;)V
    .locals 0

    .line 882
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 883
    iput-object p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->menuItem:Ll/ۛۜ;

    return-void
.end method


# virtual methods
.method public getMenuItem()Ll/ۛۜ;
    .locals 1

    .line 887
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->menuItem:Ll/ۛۜ;

    return-object v0
.end method
