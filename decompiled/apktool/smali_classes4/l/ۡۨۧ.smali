.class public final Ll/ۡۨۧ;
.super Ll/ᩳۨۧ;
.source "A5H1"


# instance fields
.field public final synthetic ֫:Ll/ۖۨۧ;


# direct methods
.method public constructor <init>(Ll/ۖۨۧ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 532
    iput-object p1, p0, Ll/ۡۨۧ;->֫:Ll/ۖۨۧ;

    return-void
.end method


# virtual methods
.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 2

    .line 535
    iget-object v0, p0, Ll/ۡۨۧ;->֫:Ll/ۖۨۧ;

    iget-object v1, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 536
    invoke-virtual {v0}, Ll/ۖۨۧ;->hasAnimators()Z

    move-result p1

    if-nez p1, :cond_0

    .line 537
    sget-object p1, Ll/ۧۨۧ;->֫:Ll/ܰۛۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    const/4 p1, 0x1

    .line 538
    iput-boolean p1, v0, Ll/ܽۨۧ;->mEnded:Z

    .line 539
    sget-object p1, Ll/ۧۨۧ;->ۧ:Ll/᩺ۛۧ;

    invoke-virtual {v0, p1, v1}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    :cond_0
    return-void
.end method
