.class public final synthetic Ll/֫ܰ᩷;
.super Ljava/lang/Object;
.source "B1E0"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/ܿۛ᩷;

    const v0, 0x7f1200e9

    .line 71
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTitle(I)V

    const/4 v0, 0x0

    .line 72
    invoke-virtual {p1, v0}, Ll/ܿۛ᩷;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
