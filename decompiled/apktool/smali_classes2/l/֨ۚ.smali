.class public final Ll/֨ۚ;
.super Ljava/lang/Object;
.source "L1CU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 2497
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۚ;->᩸:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2500
    iget-object v0, p0, Ll/֨ۚ;->᩸:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    return-void
.end method
