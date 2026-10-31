.class public final synthetic Ll/ۤ۬᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ۗ۬᩻;

.field public final synthetic ᩸:Lcom/google/android/material/tabs/TabLayout;

.field public final synthetic ᩹:Ll/ܶۤ᩻;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/tabs/TabLayout;Ll/ܶۤ᩻;Ll/ۗ۬᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ۬᩻;->᩸:Lcom/google/android/material/tabs/TabLayout;

    iput-object p2, p0, Ll/ۤ۬᩻;->᩹:Ll/ܶۤ᩻;

    iput-object p3, p0, Ll/ۤ۬᩻;->᩶:Ll/ۗ۬᩻;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 464
    iget-object p1, p0, Ll/ۤ۬᩻;->᩸:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 465
    iget-object p1, p0, Ll/ۤ۬᩻;->᩹:Ll/ܶۤ᩻;

    invoke-virtual {p1}, Ll/ܶۤ᩻;->֫()V

    return-void

    :cond_0
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 466
    iget-object p1, p0, Ll/ۤ۬᩻;->᩶:Ll/ۗ۬᩻;

    invoke-virtual {p1}, Ll/ۗ۬᩻;->֫()V

    :cond_1
    return-void
.end method
