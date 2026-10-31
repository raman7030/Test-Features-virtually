.class public Ll/ᩴܽܿ;
.super Ll/᩸ܽܿ;
.source "469I"


# instance fields
.field public ֡:Ll/ܺᩳܿ;

.field public ۖ:Ll/ܶܽܿ;

.field public ۘ:I

.field public final ۚ:Ll/ۖᩳܿ;

.field public ۜ:Ll/ۖܽܿ;

.field public ۡ:Landroid/text/style/ForegroundColorSpan;

.field public ۢ:Landroid/text/style/ForegroundColorSpan;

.field public ܺ:Ljava/util/Map;

.field public ᩴ:I

.field public ᩵:I

.field public ᩷:Ll/ۘܽܿ;

.field public ᩻:Ll/۫ܽܽ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8c

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public native constructor <init>(Landroid/content/Context;Ll/۫ܽܽ;Ljava/util/Map;)V
.end method

.method public static bridge synthetic ֫(Ll/ᩴܽܿ;)Ll/۫ܽܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->᩻:Ll/۫ܽܽ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ᩴܽܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴܽܿ;->ۘ:I

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ᩴܽܿ;)Ll/ܺᩳܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->֡:Ll/ܺᩳܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴܽܿ;)Ll/ۖܽܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->ۜ:Ll/ۖܽܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴܽܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴܽܿ;->ᩴ:I

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ᩴܽܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->ܺ:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴܽܿ;)Ll/ۘܽܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->᩷:Ll/ۘܽܿ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴܽܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴܽܿ;->᩵:I

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ᩴܽܿ;)Landroid/text/style/ForegroundColorSpan;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->ۡ:Landroid/text/style/ForegroundColorSpan;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴܽܿ;)Landroid/text/style/ForegroundColorSpan;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->ۢ:Landroid/text/style/ForegroundColorSpan;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܽܿ;->ۖ:Ll/ܶܽܿ;

    return-object p0
.end method


# virtual methods
.method public final ֫(ILjava/lang/CharSequence;)Ll/ܶܽܿ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ᩴܽܿ;->ۚ:Ll/ۖᩳܿ;

    invoke-static {p2, p1, v0}, Ll/ᩴᩳܿ;->ۧ(Ljava/lang/CharSequence;ILl/ۖᩳܿ;)V

    .line 64
    iget-object p1, p0, Ll/ᩴܽܿ;->ۖ:Ll/ܶܽܿ;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 67
    :cond_0
    iget p2, p0, Ll/ᩴܽܿ;->ᩴ:I

    invoke-virtual {p1, p2}, Ll/ܶܽܿ;->֫(I)V

    return-object p1
.end method

.method public final ֫(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)V
    .locals 5

    .line 31
    check-cast p2, Landroid/text/SpannableString;

    .line 125
    invoke-virtual {p2}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object p2

    .line 126
    iget v0, p0, Ll/ᩴܽܿ;->᩵:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, ":"

    .line 136
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iget v1, p0, Ll/ᩴܽܿ;->ᩴ:I

    iget v2, p0, Ll/ᩴܽܿ;->ۘ:I

    invoke-interface {v0, v1, v2, p2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 139
    iget v0, p0, Ll/ᩴܽܿ;->ᩴ:I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ᩴ(I)V

    goto :goto_0

    .line 142
    :cond_1
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iget v2, p0, Ll/ᩴܽܿ;->ᩴ:I

    iget v3, p0, Ll/ᩴܽܿ;->ۘ:I

    const-string v4, "=\"\""

    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 143
    iget v0, p0, Ll/ᩴܽܿ;->ᩴ:I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v0

    add-int/2addr p2, v1

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 263
    :goto_0
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܽ()V

    .line 264
    new-instance p1, Ll/֨ܽܿ;

    invoke-direct {p1, p0}, Ll/֨ܽܿ;-><init>(Ll/ᩴܽܿ;)V

    :goto_1
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 128
    :cond_2
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iget v3, p0, Ll/ᩴܽܿ;->ᩴ:I

    iget v4, p0, Ll/ᩴܽܿ;->ۘ:I

    invoke-interface {v0, v3, v4, p2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 129
    iget v0, p0, Ll/ᩴܽܿ;->ᩴ:I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 131
    iget-object p1, p0, Ll/ᩴܽܿ;->᩷:Ll/ۘܽܿ;

    iget p1, p1, Ll/ۘܽܿ;->ܿ:I

    if-eq p1, v2, :cond_4

    if-ne p1, v1, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    return-void

    .line 263
    :cond_4
    :goto_3
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܽ()V

    .line 264
    new-instance p1, Ll/֨ܽܿ;

    invoke-direct {p1, p0}, Ll/֨ܽܿ;-><init>(Ll/ᩴܽܿ;)V

    goto :goto_1
.end method
