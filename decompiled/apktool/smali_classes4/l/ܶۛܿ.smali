.class public final synthetic Ll/ܶۛܿ;
.super Ljava/lang/Object;
.source "C4QU"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 138
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 139
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 140
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
