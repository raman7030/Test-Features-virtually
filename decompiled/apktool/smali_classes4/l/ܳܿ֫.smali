.class public final Ll/ܳܿ֫;
.super Ljava/lang/Object;
.source "1AMY"

# interfaces
.implements Landroid/text/Spannable;


# instance fields
.field public ᩸:Landroid/text/Spannable;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Landroid/text/Spannable;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Ll/ܳܿ֫;->᩹:Z

    .line 49
    iput-object p1, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Ll/ܳܿ֫;->᩹:Z

    .line 57
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    return-void
.end method

.method private ۧ()V
    .locals 3

    .line 61
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    .line 62
    iget-boolean v1, p0, Ll/ܳܿ֫;->᩹:Z

    if-nez v1, :cond_1

    .line 161
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-ge v1, v2, :cond_0

    .line 162
    new-instance v1, Ll/ᩳܿ֫;

    .line 165
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 162
    :cond_0
    new-instance v1, Ll/ܿܿ֫;

    .line 165
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 62
    :goto_0
    invoke-virtual {v1, v0}, Ll/ᩳܿ֫;->֫(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 63
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v1, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    :cond_1
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Ll/ܳܿ֫;->᩹:Z

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public synthetic chars()Ljava/util/stream/IntStream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܳܿ֫;->chars()Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object v0

    return-object v0
.end method

.method public final chars()Ll/ۧ᩺ᩴ;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-static {v0}, Ll/ܽܿ֫;->֫(Ljava/lang/CharSequence;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic codePoints()Ljava/util/stream/IntStream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܳܿ֫;->codePoints()Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object v0

    return-object v0
.end method

.method public final codePoints()Ll/ۧ᩺ᩴ;
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-static {v0}, Ll/ܽܿ֫;->ۧ(Ljava/lang/CharSequence;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final getSpanEnd(Ljava/lang/Object;)I
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanFlags(Ljava/lang/Object;)I
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanStart(Ljava/lang/Object;)I
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpans(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final length()I
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public final nextSpanTransition(IILjava/lang/Class;)I
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result p1

    return p1
.end method

.method public final removeSpan(Ljava/lang/Object;)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ll/ܳܿ֫;->ۧ()V

    .line 81
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSpan(Ljava/lang/Object;III)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ll/ܳܿ֫;->ۧ()V

    .line 75
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/text/Spannable;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܳܿ֫;->᩸:Landroid/text/Spannable;

    return-object v0
.end method
