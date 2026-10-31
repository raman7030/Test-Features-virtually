.class public final Ll/ۘۨ;
.super Ljava/lang/Object;
.source "E9O4"

# interfaces
.implements Ljava/util/Iterator;


# static fields
.field public static ۫᩸۠:I


# instance fields
.field public final ᩶:Ljava/util/ArrayList;

.field public final ᩸:Ll/ܺ᩹᩵;

.field public ᩹:Ljava/util/Iterator;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Ll/ۘ᩺;)V
    .locals 1

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    sget-object v0, Ll/ۖ᩺;->᩹:Ll/ۖ᩺;

    iput-object v0, p0, Ll/ۘۨ;->᩸:Ll/ܺ᩹᩵;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘۨ;->᩶:Ljava/util/ArrayList;

    .line 145
    iput-object p1, p0, Ll/ۘۨ;->᩹:Ljava/util/Iterator;

    return-void
.end method

.method public static ֨ᩳۜ(Ljava/lang/Object;)Ll/۬ۛ֡;
    .locals 0

    check-cast p0, [B

    invoke-static {p0}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object p0

    return-object p0
.end method

.method public static ۖۙۗ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/۬ۖۡ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/۬ۖۡ;->֫(Ljava/lang/String;I)V

    return-void
.end method

.method public static ۖܿۤ([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۙ᩻۠(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۬۬ܿ;

    invoke-virtual {p0}, Ll/۬۬ܿ;->֫()V

    return-void
.end method

.method public static ۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;
    .locals 0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static ۡ۠ۨ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ܽۢܳ;

    invoke-virtual {p0}, Ll/ܽۢܳ;->ܰ()Z

    move-result p0

    return p0
.end method

.method public static ۡ᩵ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;
    .locals 0

    check-cast p0, Ll/ᩳۗ᩻;

    check-cast p1, Ll/ᩳۗ᩻;

    invoke-virtual {p0, p1}, Ll/ᩳۗ᩻;->ۢ(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۢۖ᩸()I
    .locals 1

    const v0, 0x5779c695

    return v0
.end method

.method public static ۬ۙۘ(Ljava/lang/Object;)Ll/۟۫ᩳ;
    .locals 0

    check-cast p0, Ll/֫ۢᩳ;

    invoke-static {p0}, Ll/֫ۢᩳ;->᩷(Ll/֫ۢᩳ;)Ll/۟۫ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ܰۛ᩵(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Runnable;

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ܺܿ᩺(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۟ܶۡ;

    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method

.method public static ᩳܽ۟(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    return p0
.end method

.method public static ᩵᩶᩵(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩵ۛۡ;

    check-cast p1, Ll/ۖۛۡ;

    invoke-virtual {p0, p1}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    return-void
.end method

.method public static ᩶֫᩵(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Ll/֨۠ۢ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public static ᩶᩸ܶ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    return p0
.end method

.method public static ᩺۬֨(II)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ۘۨ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 152
    iget-object v0, p0, Ll/ۘۨ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 127
    move-object v1, v0

    check-cast v1, Landroid/view/View;

    .line 128
    instance-of v2, v1, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 87
    new-instance v3, Ll/ۘ᩺;

    invoke-direct {v3, v1}, Ll/ۘ᩺;-><init>(Landroid/view/ViewGroup;)V

    .line 165
    :cond_1
    iget-object v1, p0, Ll/ۘۨ;->᩶:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 166
    iget-object v2, p0, Ll/ۘۨ;->᩹:Ljava/util/Iterator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    iput-object v3, p0, Ll/ۘۨ;->᩹:Ljava/util/Iterator;

    return-object v0

    .line 169
    :cond_2
    :goto_1
    iget-object v2, p0, Ll/ۘۨ;->᩹:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 430
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const-string v3, "List is empty."

    if-nez v2, :cond_4

    .line 432
    invoke-static {v1}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 170
    check-cast v2, Ljava/util/Iterator;

    iput-object v2, p0, Ll/ۘۨ;->᩹:Ljava/util/Iterator;

    .line 275
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v1}, Ll/֫ܶ᩵;->֫(Ljava/util/List;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
