.class public final synthetic Ll/ܰۗ;
.super Ljava/lang/Object;
.source "G55Z"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܶܺ;
.implements Ll/֫۠ܳ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/᩷ܿۖ;


# direct methods
.method public static ֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;
    .locals 0

    .line 0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    check-cast p1, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-virtual {p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->dismiss()V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    check-cast p1, Ll/۬ۘۧ;

    .line 51
    iget-wide v0, p1, Ll/۬ۘۧ;->ᩳ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 750
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 153
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 1

    .line 341
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method
