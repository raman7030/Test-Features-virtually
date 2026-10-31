.class public final synthetic Ll/ᩴܳܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩵ܳܿ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩵ܳܿ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܳܿ;->᩸:Ll/᩵ܳܿ;

    iput p2, p0, Ll/ᩴܳܿ;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 467
    iget-object v0, p0, Ll/ᩴܳܿ;->᩸:Ll/᩵ܳܿ;

    iget-object v0, v0, Ll/᩵ܳܿ;->ܽ:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ܳ(Ll/֡ܳܿ;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    iget v1, p0, Ll/ᩴܳܿ;->᩹:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7f0802b3

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->setIcon(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    return-void
.end method
