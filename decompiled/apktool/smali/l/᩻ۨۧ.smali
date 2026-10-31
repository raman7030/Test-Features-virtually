.class public final Ll/᩻ۨۧ;
.super Ljava/lang/Object;
.source "K5ZM"


# static fields
.field public static ֫:Ll/ۨۤۧ;

.field public static ۧ:Ljava/util/ArrayList;

.field public static ܽ:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 84
    new-instance v0, Ll/ۨۤۧ;

    invoke-direct {v0}, Ll/ۨۤۧ;-><init>()V

    sput-object v0, Ll/᩻ۨۧ;->֫:Ll/ۨۤۧ;

    .line 89
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/᩻ۨۧ;->ܽ:Ljava/lang/ThreadLocal;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/᩻ۨۧ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫()Ll/ۖ᩵;
    .locals 3

    .line 200
    sget-object v0, Ll/᩻ۨۧ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 202
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩵;

    if-eqz v1, :cond_0

    return-object v1

    .line 207
    :cond_0
    new-instance v1, Ll/ۖ᩵;

    invoke-direct {v1}, Ll/ۖ᩵;-><init>()V

    .line 208
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v1
.end method

.method public static ֫(Landroid/view/ViewGroup;Ll/ܽۨۧ;)V
    .locals 3

    .line 460
    sget-object v0, Ll/᩻ۨۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 465
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_0

    .line 467
    sget-object p1, Ll/᩻ۨۧ;->֫:Ll/ۨۤۧ;

    .line 469
    :cond_0
    invoke-virtual {p1}, Ll/ܽۨۧ;->clone()Ll/ܽۨۧ;

    move-result-object p1

    .line 308
    invoke-static {}, Ll/᩻ۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v0

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p0, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 308
    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 310
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 311
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    .line 312
    invoke-virtual {v2, p0}, Ll/ܽۨۧ;->pause(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    .line 317
    invoke-virtual {p1, p0, v0}, Ll/ܽۨۧ;->captureValues(Landroid/view/ViewGroup;Z)V

    :cond_2
    const v0, 0x7f0a0647

    .line 209
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ۛۧ;

    if-nez v2, :cond_3

    .line 196
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz p1, :cond_4

    .line 216
    new-instance v0, Ll/ܳۨۧ;

    .line 237
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 238
    iput-object p1, v0, Ll/ܳۨۧ;->᩹:Ll/ܽۨۧ;

    .line 239
    iput-object p0, v0, Ll/ܳۨۧ;->᩸:Landroid/view/ViewGroup;

    .line 217
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 218
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void

    .line 209
    :cond_3
    throw v1

    :cond_4
    return-void
.end method
