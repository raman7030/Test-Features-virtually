.class public final Ll/֡ۗۧ;
.super Ljava/lang/Object;
.source "Y6A7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;)V
    .locals 0

    .line 650
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۗۧ;->᩸:Ll/۬۬ۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 653
    iget-object v0, p0, Ll/֡ۗۧ;->᩸:Ll/۬۬ۧ;

    iget-object v1, v0, Ll/۬۬ۧ;->mItemAnimator:Ll/᩺ۗۧ;

    if-eqz v1, :cond_0

    .line 654
    invoke-virtual {v1}, Ll/᩺ۗۧ;->ۜ()V

    :cond_0
    const/4 v1, 0x0

    .line 656
    iput-boolean v1, v0, Ll/۬۬ۧ;->mPostedAnimatorRunner:Z

    return-void
.end method
