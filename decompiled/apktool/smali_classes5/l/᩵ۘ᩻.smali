.class public Ll/᩵ۘ᩻;
.super Ll/᩸ۢ;
.source "U7J7"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public ᩸:Ll/ۖۘ᩻;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Ll/᩸ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 46
    invoke-virtual {p0, p1}, Ll/᩸ۢ;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Ll/᩸ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 46
    invoke-virtual {p0, p1}, Ll/᩸ۢ;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method private ۧ()Ll/᩻ۡ֫;
    .locals 2

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 127
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    .line 128
    instance-of v1, v0, Ll/᩻ۡ֫;

    if-eqz v1, :cond_0

    .line 129
    check-cast v0, Ll/᩻ۡ֫;

    return-object v0

    .line 131
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    .line 133
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "View is not attached to a LifecycleOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final convertSelectionToString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 65
    check-cast p1, Ljava/lang/CharSequence;

    return-object p1
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 108
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->onAttachedToWindow()V

    .line 109
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 112
    :cond_0
    invoke-direct {p0}, Ll/᩵ۘ᩻;->ۧ()Ll/᩻ۡ֫;

    move-result-object v0

    invoke-interface {v0}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 117
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->onDetachedFromWindow()V

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 122
    :cond_0
    invoke-direct {p0}, Ll/᩵ۘ᩻;->ۧ()Ll/᩻ۡ֫;

    move-result-object v0

    invoke-interface {v0}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void
.end method

.method public final replaceText(Ljava/lang/CharSequence;)V
    .locals 3

    .line 70
    instance-of v0, p1, Ll/ۘۘ᩻;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll/ۘۘ᩻;

    .line 71
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->replaceText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object p1, v0, Ll/ۘۘ᩻;->᩹:Ll/ۖۘ᩻;

    iput-object p1, p0, Ll/᩵ۘ᩻;->᩸:Ll/ۖۘ᩻;

    return-void

    .line 73
    :cond_0
    instance-of p1, p1, Ll/ᩴۘ᩻;

    if-eqz p1, :cond_1

    const-string p1, ""

    .line 74
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->replaceText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 75
    iput-object p1, p0, Ll/᩵ۘ᩻;->᩸:Ll/ۖۘ᩻;

    return-void

    .line 77
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Ll/᩶ۘ᩻;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final showDropDown()V
    .locals 7

    .line 83
    invoke-static {}, Ll/۫᩻᩻;->ܿ()Ljava/util/List;

    move-result-object v0

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    new-instance v2, Ll/ᩴۘ᩻;

    const v3, 0x7f1204ca

    .line 139
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 140
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    sget v4, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0x11

    invoke-virtual {v2, v3, v5, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 85
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۘ᩻;

    .line 87
    new-instance v3, Ll/ۘۘ᩻;

    invoke-direct {v3, v2}, Ll/ۘۘ᩻;-><init>(Ll/ۖۘ᩻;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 89
    :cond_0
    new-instance v0, Landroid/text/SpannableString;

    const v2, 0x7f1202dd

    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 90
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    sget v3, Ll/᩹֡᩷;->֫:I

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    invoke-virtual {v0, v2, v5, v3, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 91
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    new-instance v0, Ll/᩶ۡۡ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 93
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void
.end method

.method public final ֫()Ll/ۖۘ᩻;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/᩵ۘ᩻;->᩸:Ll/ۖۘ᩻;

    return-object v0
.end method

.method public final ֫(Ll/ۖۘ᩻;)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/᩵ۘ᩻;->᩸:Ll/ۖۘ᩻;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 52
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 54
    :cond_0
    iget-object p1, p1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 98
    sget-object p1, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_0

    .line 60
    iget-object p1, p0, Ll/᩵ۘ᩻;->᩸:Ll/ۖۘ᩻;

    if-eqz p1, :cond_0

    .line 101
    iget p1, p1, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {p1}, Ll/۫᩻᩻;->ᩳ(I)Ll/ۖۘ᩻;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩵ۘ᩻;->֫(Ll/ۖۘ᩻;)V

    :cond_0
    return-void
.end method
