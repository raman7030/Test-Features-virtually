.class public final Ll/᩵ۗۘ;
.super Ljava/lang/Object;
.source "V91O"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩵ۗۘ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static ֫(Landroid/text/Spanned;)Landroid/widget/TextView;
    .locals 3

    .line 29
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ll/᩵ۗۘ;

    const/4 v2, 0x0

    invoke-interface {p0, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩵ۗۘ;

    if-eqz p0, :cond_0

    .line 30
    array-length v0, p0

    if-lez v0, :cond_0

    .line 31
    aget-object p0, p0, v2

    .line 62
    iget-object p0, p0, Ll/᩵ۗۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
