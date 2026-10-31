.class public final Ll/ۢ᩻ۡ;
.super Ll/ۢ᩶ۘ;
.source "88W4"


# instance fields
.field public final synthetic ֫:Ll/ۡ᩻ۡ;


# direct methods
.method public constructor <init>(Ll/ۡ᩻ۡ;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۢ᩻ۡ;->֫:Ll/ۡ᩻ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;Ljava/lang/String;)V
    .locals 4

    .line 48
    iget-object v0, p0, Ll/ۢ᩻ۡ;->֫:Ll/ۡ᩻ۡ;

    invoke-static {v0}, Ll/ۡ᩻ۡ;->֫(Ll/ۡ᩻ۡ;)Ll/᩷᩻ۡ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۡ᩻ۡ;->֫(Ll/ۡ᩻ۡ;)Ll/᩷᩻ۡ;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ll/᩷᩻ۡ;->֫(Landroid/view/View;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "#"

    .line 51
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 52
    instance-of v1, p1, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v2, p1, Landroid/widget/ScrollView;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/widget/ScrollView;

    const/4 v2, 0x1

    .line 53
    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 72
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    const-string v2, "[^\\p{L}\\p{N}]+"

    const-string v3, "-"

    invoke-virtual {p2, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 54
    invoke-static {v0}, Ll/ۡ᩻ۡ;->ۧ(Ll/ۡ᩻ۡ;)Ll/۠ᩴᩴ;

    move-result-object v0

    const/4 v2, -0x1

    invoke-virtual {v0, v2, p2}, Ll/۫ۘᩴ;->֫(ILjava/lang/String;)I

    move-result p2

    if-ltz p2, :cond_1

    .line 56
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p2

    .line 57
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/text/Layout;->getLineTop(I)I

    move-result p2

    const/4 v0, 0x0

    .line 58
    invoke-virtual {p1, v0, p2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    :cond_1
    :goto_0
    return-void

    .line 63
    :cond_2
    invoke-super {p0, p1, p2}, Ll/ۢ᩶ۘ;->֫(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method
