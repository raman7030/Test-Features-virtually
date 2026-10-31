.class public final Ll/ᩴۗۘ;
.super Ljava/lang/Object;
.source "88XH"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/text/StaticLayout;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩴۗۘ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static ֫(Landroid/text/Spanned;)Landroid/text/Layout;
    .locals 3

    .line 32
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ll/ᩴۗۘ;

    const/4 v2, 0x0

    .line 30
    invoke-interface {p0, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/ᩴۗۘ;

    if-eqz p0, :cond_0

    .line 35
    array-length v0, p0

    if-lez v0, :cond_0

    .line 36
    aget-object p0, p0, v2

    .line 68
    iget-object p0, p0, Ll/ᩴۗۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/text/Layout;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/text/Spannable;Landroid/text/StaticLayout;)V
    .locals 5

    .line 43
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ll/ᩴۗۘ;

    const/4 v2, 0x0

    invoke-interface {p0, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴۗۘ;

    if-eqz v0, :cond_0

    .line 45
    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 46
    invoke-interface {p0, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 50
    :cond_0
    new-instance v0, Ll/ᩴۗۘ;

    invoke-direct {v0, p1}, Ll/ᩴۗۘ;-><init>(Landroid/text/StaticLayout;)V

    .line 54
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/16 v1, 0x12

    .line 51
    invoke-interface {p0, v0, v2, p1, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method
