.class public final Ll/ۡ᩻ۡ;
.super Ll/᩻᩶ۘ;
.source "88W4"


# instance fields
.field public final ֫:Ll/᩶᩻ۡ;

.field public final ۧ:Ll/۠ᩴᩴ;


# direct methods
.method public constructor <init>(Ll/᩶᩻ۡ;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ll/۠ᩴᩴ;

    invoke-direct {v0}, Ll/۠ᩴᩴ;-><init>()V

    iput-object v0, p0, Ll/ۡ᩻ۡ;->ۧ:Ll/۠ᩴᩴ;

    .line 26
    iput-object p1, p0, Ll/ۡ᩻ۡ;->֫:Ll/᩶᩻ۡ;

    return-void
.end method

.method public static ֫(Ll/᩶᩻ۡ;)Ll/ۡ᩻ۡ;
    .locals 1

    .line 19
    new-instance v0, Ll/ۡ᩻ۡ;

    invoke-direct {v0, p0}, Ll/ۡ᩻ۡ;-><init>(Ll/᩶᩻ۡ;)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ۡ᩻ۡ;)Ll/᩷᩻ۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ᩻ۡ;->֫:Ll/᩶᩻ۡ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡ᩻ۡ;)Ll/۠ᩴᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ᩻ۡ;->ۧ:Ll/۠ᩴᩴ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;)V
    .locals 8

    .line 31
    iget-object v0, p0, Ll/ۡ᩻ۡ;->ۧ:Ll/۠ᩴᩴ;

    invoke-virtual {v0}, Ll/۠ᩴᩴ;->clear()V

    .line 32
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Landroid/text/Spannable;

    .line 33
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, Ll/᩷ۗۘ;

    const/4 v3, 0x0

    invoke-interface {p1, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩷ۗۘ;

    if-eqz v1, :cond_2

    .line 35
    array-length v2, v1

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 36
    invoke-interface {p1, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    .line 37
    invoke-interface {p1, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    .line 38
    invoke-interface {p1, v5, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    .line 72
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v6, "[^\\p{L}\\p{N}]+"

    const-string v7, "-"

    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 324
    invoke-virtual {v0, v4}, Ll/۠ᩴᩴ;->ۧ(Ljava/lang/Object;)I

    move-result v6

    if-nez v6, :cond_1

    .line 325
    invoke-virtual {v0, v4}, Ll/۠ᩴᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 326
    :cond_0
    invoke-virtual {v0, v5, v4}, Ll/۠ᩴᩴ;->֫(ILjava/lang/Object;)I

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۘ᩶ۘ;)V
    .locals 1

    .line 45
    new-instance v0, Ll/ۢ᩻ۡ;

    invoke-direct {v0, p0}, Ll/ۢ᩻ۡ;-><init>(Ll/ۡ᩻ۡ;)V

    invoke-virtual {p1, v0}, Ll/ۘ᩶ۘ;->֫(Ll/᩷᩶ۘ;)V

    return-void
.end method
