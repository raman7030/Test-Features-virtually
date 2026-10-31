.class public final Ll/۬ۤ᩷;
.super Landroid/animation/AnimatorListenerAdapter;
.source "31K1"


# instance fields
.field public final synthetic ֫:Ll/ܿۛ᩷;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;)V
    .locals 0

    .line 847
    iput-object p1, p0, Ll/۬ۤ᩷;->֫:Ll/ܿۛ᩷;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 850
    iget-object p1, p0, Ll/۬ۤ᩷;->֫:Ll/ܿۛ᩷;

    invoke-static {p1}, Ll/ܿۛ᩷;->֨(Ll/ܿۛ᩷;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    return-void
.end method
