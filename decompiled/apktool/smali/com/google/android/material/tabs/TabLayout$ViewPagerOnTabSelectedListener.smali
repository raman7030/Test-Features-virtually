.class public Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;
.super Ljava/lang/Object;
.source "TabLayout.java"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# instance fields
.field public final viewPager:Ll/֡ܰۧ;


# direct methods
.method public constructor <init>(Ll/֡ܰۧ;)V
    .locals 0

    .line 3620
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3621
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;->viewPager:Ll/֡ܰۧ;

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1

    .line 3626
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;->viewPager:Ll/֡ܰۧ;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/֡ܰۧ;->ᩳ(I)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
