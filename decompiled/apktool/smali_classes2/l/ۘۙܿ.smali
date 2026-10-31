.class public final Ll/ۘۙܿ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "L9CC"


# instance fields
.field public final synthetic ֫:Ll/ۗۙܿ;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;)V
    .locals 0

    .line 275
    iput-object p1, p0, Ll/ۘۙܿ;->֫:Ll/ۗۙܿ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 279
    :try_start_0
    iget-object p1, p0, Ll/ۘۙܿ;->֫:Ll/ۗۙܿ;

    invoke-static {p1}, Ll/ۗۙܿ;->ۖ(Ll/ۗۙܿ;)Landroid/widget/PopupWindow;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
