.class public final Ll/ܶۗۘ;
.super Ljava/lang/Object;
.source "B916"

# interfaces
.implements Landroid/text/method/MovementMethod;


# instance fields
.field public final ֫:Landroid/text/method/MovementMethod;


# direct methods
.method public constructor <init>(Landroid/text/method/MovementMethod;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    return-void
.end method


# virtual methods
.method public final canSelectArbitrarily()Z
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0}, Landroid/text/method/MovementMethod;->canSelectArbitrarily()Z

    move-result v0

    return v0
.end method

.method public final initialize(Landroid/widget/TextView;Landroid/text/Spannable;)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2}, Landroid/text/method/MovementMethod;->initialize(Landroid/widget/TextView;Landroid/text/Spannable;)V

    return-void
.end method

.method public final onGenericMotionEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/MovementMethod;->onGenericMotionEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyDown(Landroid/widget/TextView;Landroid/text/Spannable;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/MovementMethod;->onKeyDown(Landroid/widget/TextView;Landroid/text/Spannable;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyOther(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/KeyEvent;)Z
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/MovementMethod;->onKeyOther(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyUp(Landroid/widget/TextView;Landroid/text/Spannable;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/MovementMethod;->onKeyUp(Landroid/widget/TextView;Landroid/text/Spannable;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onTakeFocus(Landroid/widget/TextView;Landroid/text/Spannable;I)V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/MovementMethod;->onTakeFocus(Landroid/widget/TextView;Landroid/text/Spannable;I)V

    return-void
.end method

.method public final onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 118
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/MovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    .line 39
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 44
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result p3

    float-to-int p3, p3

    .line 45
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v3

    sub-int/2addr v0, v3

    .line 46
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v3

    sub-int/2addr p3, v3

    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v3

    add-int/2addr v3, v0

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v0

    add-int/2addr v0, p3

    .line 50
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p3

    .line 51
    invoke-virtual {p3, v0}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v4

    int-to-float v5, v3

    .line 52
    invoke-virtual {p3, v4, v5}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v5

    .line 54
    const-class v6, Ll/֫۬ۘ;

    invoke-interface {p2, v5, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/֫۬ۘ;

    .line 55
    array-length v5, p2

    if-nez v5, :cond_1

    goto :goto_0

    .line 59
    :cond_1
    aget-object p2, p2, v2

    .line 62
    invoke-virtual {p2, v3}, Ll/֫۬ۘ;->ۧ(I)Landroid/text/Layout;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 65
    invoke-virtual {p3, v4}, Landroid/text/Layout;->getLineTop(I)I

    move-result p3

    sub-int/2addr v0, p3

    .line 66
    invoke-virtual {v5, v0}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p3

    .line 67
    invoke-virtual {p2}, Ll/֫۬ۘ;->֫()I

    move-result p2

    rem-int/2addr v3, p2

    int-to-float p2, v3

    invoke-virtual {v5, p3, p2}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result p2

    .line 68
    invoke-virtual {v5}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p3

    check-cast p3, Landroid/text/Spanned;

    const-class v0, Landroid/text/style/ClickableSpan;

    .line 69
    invoke-interface {p3, p2, p2, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Landroid/text/style/ClickableSpan;

    .line 70
    array-length p3, p2

    if-lez p3, :cond_2

    .line 71
    aget-object p2, p2, v2

    invoke-virtual {p2, p1}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    return v1

    :cond_2
    :goto_0
    return v2

    :cond_3
    return v1
.end method

.method public final onTrackballEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ܶۗۘ;->֫:Landroid/text/method/MovementMethod;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/MovementMethod;->onTrackballEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
