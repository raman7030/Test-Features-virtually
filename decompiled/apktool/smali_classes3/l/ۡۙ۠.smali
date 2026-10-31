.class public final Ll/ۡۙ۠;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "T5PO"


# instance fields
.field public final synthetic ᩸:Ll/ᩴۙ۠;


# direct methods
.method public constructor <init>(Ll/ᩴۙ۠;)V
    .locals 0

    .line 165
    iput-object p1, p0, Ll/ۡۙ۠;->᩸:Ll/ᩴۙ۠;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 178
    iget-object p1, p0, Ll/ۡۙ۠;->᩸:Ll/ᩴۙ۠;

    invoke-virtual {p1}, Ll/ᩴۙ۠;->᩻()F

    move-result p2

    const/high16 p3, 0x3f800000    # 1.0f

    const/4 p4, 0x0

    cmpl-float p2, p2, p3

    if-lez p2, :cond_0

    return p4

    .line 181
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p4
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .line 170
    iget-object p1, p0, Ll/ۡۙ۠;->᩸:Ll/ᩴۙ۠;

    invoke-static {p1}, Ll/ᩴۙ۠;->֫(Ll/ᩴۙ۠;)Landroid/view/View$OnLongClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 171
    invoke-static {p1}, Ll/ᩴۙ۠;->֫(Ll/ᩴۙ۠;)Landroid/view/View$OnLongClickListener;

    move-result-object v0

    invoke-virtual {p1}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    :cond_0
    return-void
.end method
