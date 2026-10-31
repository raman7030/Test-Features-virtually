.class public final Ll/ۖۙܿ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "L9CC"


# instance fields
.field public final synthetic ֫:Ll/ۗۙܿ;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;)V
    .locals 0

    .line 261
    iput-object p1, p0, Ll/ۖۙܿ;->֫:Ll/ۗۙܿ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 265
    iget-object p1, p0, Ll/ۖۙܿ;->֫:Ll/ۗۙܿ;

    :try_start_0
    invoke-static {p1}, Ll/ۗۙܿ;->ۖ(Ll/ۗۙܿ;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    :catch_0
    invoke-static {p1}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    return-void
.end method
