.class public Lcom/google/android/material/tabs/TabLayout$AdapterChangeListener;
.super Ljava/lang/Object;
.source "TabLayout.java"

# interfaces
.implements Ll/ܺܰۧ;


# instance fields
.field public autoRefresh:Z

.field public final synthetic this$0:Lcom/google/android/material/tabs/TabLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;)V
    .locals 0

    .line 3657
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$AdapterChangeListener;->this$0:Lcom/google/android/material/tabs/TabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterChanged(Ll/֡ܰۧ;Ll/ۨ᩺ۧ;Ll/ۨ᩺ۧ;)V
    .locals 1

    .line 3664
    iget-object p2, p0, Lcom/google/android/material/tabs/TabLayout$AdapterChangeListener;->this$0:Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p2, Lcom/google/android/material/tabs/TabLayout;->viewPager:Ll/֡ܰۧ;

    if-ne v0, p1, :cond_0

    .line 3665
    iget-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout$AdapterChangeListener;->autoRefresh:Z

    invoke-virtual {p2, p3, p1}, Lcom/google/android/material/tabs/TabLayout;->setPagerAdapter(Ll/ۨ᩺ۧ;Z)V

    :cond_0
    return-void
.end method

.method public setAutoRefresh(Z)V
    .locals 0

    .line 3670
    iput-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout$AdapterChangeListener;->autoRefresh:Z

    return-void
.end method
