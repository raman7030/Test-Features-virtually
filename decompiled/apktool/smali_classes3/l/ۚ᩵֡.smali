.class public final Ll/ۚ᩵֡;
.super Ll/ۡ֨֡;
.source "F925"


# instance fields
.field public final ֫:Ll/ܳۚ֡;

.field public final ۧ:C

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/StringBuilder;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(CII)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ll/ܳۚ֡;

    invoke-direct {v0}, Ll/ܳۚ֡;-><init>()V

    iput-object v0, p0, Ll/ۚ᩵֡;->֫:Ll/ܳۚ֡;

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v1, p0, Ll/ۚ᩵֡;->ܿ:Ljava/lang/StringBuilder;

    .line 22
    iput-char p1, p0, Ll/ۚ᩵֡;->ۧ:C

    .line 23
    iput p2, p0, Ll/ۚ᩵֡;->ᩳ:I

    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚ֡;->ۧ(Ljava/lang/Integer;)V

    .line 26
    invoke-virtual {v0, p3}, Ll/ܳۚ֡;->֫(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚ᩵֡;)Ll/ܳۚ֡;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵֡;->֫:Ll/ܳۚ֡;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 7

    .line 36
    invoke-interface {p1}, Ll/᩵֨֡;->ᩳ()I

    move-result v0

    .line 37
    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result v1

    .line 38
    invoke-interface {p1}, Ll/᩵֨֡;->getLine()Ll/ܽ֨֡;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v2

    .line 39
    invoke-interface {p1}, Ll/᩵֨֡;->ܽ()I

    move-result p1

    const/4 v3, 0x4

    iget-object v4, p0, Ll/ۚ᩵֡;->֫:Ll/ܳۚ֡;

    if-ge p1, v3, :cond_3

    .line 40
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ge v0, p1, :cond_3

    .line 133
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    move v3, v0

    :goto_0
    if-ge v3, p1, :cond_1

    .line 117
    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    iget-char v6, p0, Ll/ۚ᩵֡;->ۧ:C

    if-eq v5, v6, :cond_0

    move p1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr p1, v0

    .line 134
    iget v3, p0, Ll/ۚ᩵֡;->ᩳ:I

    if-ge p1, v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v0, p1

    .line 138
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-static {v0, v3, v2}, Ll/ۡ۠ۘ;->֫(IILjava/lang/CharSequence;)I

    move-result v0

    .line 139
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne v0, v3, :cond_3

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v4, p1}, Ll/ܳۚ֡;->֫(Ljava/lang/Integer;)V

    .line 23
    new-instance p1, Ll/ܳ᩵֡;

    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p1, v0, v0, v1}, Ll/ܳ᩵֡;-><init>(IIZ)V

    return-object p1

    .line 46
    :cond_3
    :goto_2
    invoke-virtual {v4}, Ll/ܳۚ֡;->᩷()I

    move-result p1

    .line 47
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_3
    if-lez p1, :cond_4

    if-ge v1, v0, :cond_4

    .line 48
    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, -0x1

    goto :goto_3

    .line 53
    :cond_4
    invoke-static {v1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ֨֡;)V
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۚ᩵֡;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 59
    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۚ᩵֡;->ܽ:Ljava/lang/String;

    return-void

    .line 61
    :cond_0
    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    iget-object v0, p0, Ll/ۚ᩵֡;->ܿ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۜ()V
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ۚ᩵֡;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۫֡֡;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۚ᩵֡;->֫:Ll/ܳۚ֡;

    invoke-virtual {v1, v0}, Ll/ܳۚ֡;->֫(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Ll/ۚ᩵֡;->ܿ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܳۚ֡;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ۚ᩵֡;->֫:Ll/ܳۚ֡;

    return-object v0
.end method
