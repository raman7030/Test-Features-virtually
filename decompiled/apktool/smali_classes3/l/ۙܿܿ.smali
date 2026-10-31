.class public final Ll/ۙܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# instance fields
.field public final synthetic ֫:Ll/֡ܳܿ;


# direct methods
.method public constructor <init>(Ll/֡ܳܿ;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙܿܿ;->֫:Ll/֡ܳܿ;

    return-void
.end method


# virtual methods
.method public final onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public final onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1

    .line 126
    iget-object v0, p0, Ll/ۙܿܿ;->֫:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ܿ(Ll/֡ܳܿ;)Ll/ۚۡ֫;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public final onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
