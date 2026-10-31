.class public final Ll/ᩴ᩷;
.super Ljava/lang/Object;
.source "L7M3"


# direct methods
.method public static ֫(Ljava/lang/Object;)V
    .locals 2

    .line 27
    check-cast p0, Ll/ۖ᩷;

    .line 28
    iget-object v0, p0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    .line 29
    invoke-static {v0}, Ll/᩶ۖ;->֫(Ll/֡ۖ;)Landroid/widget/ListView;

    move-result-object v0

    .line 30
    new-instance v1, Ll/ۘ᩷;

    invoke-direct {v1, p0}, Ll/ۘ᩷;-><init>(Ll/ۖ᩷;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public static ֫(Ll/ᩳ᩷;)V
    .locals 1

    .line 17
    invoke-virtual {p0}, Ll/ᩳ᩷;->ܽ()Ll/ۧ᩷;

    move-result-object p0

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Ll/ۧ᩷;->ۧ(Z)V

    .line 19
    invoke-interface {p0}, Ll/ۢ᩷;->show()V

    return-void
.end method
