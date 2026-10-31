.class public final Ll/۫۫᩻;
.super Ll/ۨ᩺ۧ;
.source "Y6Y9"


# instance fields
.field public final synthetic ܽ:Ll/ۗܺ᩷;

.field public final synthetic ܿ:[I

.field public final synthetic ᩳ:[Landroid/view/View;


# direct methods
.method public constructor <init>([Landroid/view/View;Ll/ۗܺ᩷;[I)V
    .locals 0

    .line 282
    iput-object p1, p0, Ll/۫۫᩻;->ᩳ:[Landroid/view/View;

    iput-object p2, p0, Ll/۫۫᩻;->ܽ:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/۫۫᩻;->ܿ:[I

    invoke-direct {p0}, Ll/ۨ᩺ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/CharSequence;
    .locals 1

    .line 309
    iget-object v0, p0, Ll/۫۫᩻;->ܿ:[I

    aget p1, v0, p1

    iget-object v0, p0, Ll/۫۫᩻;->ܽ:Ll/ۗܺ᩷;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֡ܰۧ;I)Ljava/lang/Object;
    .locals 1

    .line 296
    iget-object v0, p0, Ll/۫۫᩻;->ᩳ:[Landroid/view/View;

    aget-object p2, v0, p2

    .line 297
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    return-object p2
.end method

.method public final ֫(Ll/֡ܰۧ;ILjava/lang/Object;)V
    .locals 0

    .line 303
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Ll/֡ܰۧ;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 285
    iget-object v0, p0, Ll/۫۫᩻;->ᩳ:[Landroid/view/View;

    array-length v0, v0

    return v0
.end method
