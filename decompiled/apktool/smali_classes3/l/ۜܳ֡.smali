.class public final Ll/ۜܳ֡;
.super Ll/ۖܳ֡;
.source "OARH"


# instance fields
.field public final ۬:I


# direct methods
.method public constructor <init>(Ll/᩻ܳ֡;Ll/᩺ܿ֡;I)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, p2, v0}, Ll/ۖܳ֡;-><init>(Ll/ᩴܳ֡;Ll/ܳܳ֡;Ll/ۡܳ֡;)V

    .line 27
    iput p3, p0, Ll/ۜܳ֡;->۬:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 48
    iget v0, p0, Ll/ۜܳ֡;->۬:I

    if-ltz v0, :cond_4

    .line 42
    invoke-virtual {p0}, Ll/ۖܳ֡;->ۧ()Ll/ܳܳ֡;

    move-result-object v1

    check-cast v1, Ll/᩺ܿ֡;

    .line 48
    invoke-interface {v1}, Ll/ܳܳ֡;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 42
    invoke-virtual {p0}, Ll/ۖܳ֡;->ۧ()Ll/ܳܳ֡;

    move-result-object v1

    check-cast v1, Ll/᩺ܿ֡;

    .line 49
    invoke-static {v0, v0}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/᩺ܿ֡;->֫(Ll/ܳ᩷֡;)Ljava/lang/String;

    move-result-object v0

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-char v4, v0, v3

    const/16 v5, 0x9

    if-ne v4, v5, :cond_0

    const-string v4, "\\t"

    .line 65
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/16 v5, 0xa

    if-ne v4, v5, :cond_1

    const-string v4, "\\n"

    .line 66
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v5, 0xd

    if-ne v4, v5, :cond_2

    const-string v4, "\\r"

    .line 67
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v0, ""

    .line 53
    :goto_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LexerNoViableAltException(\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\')"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
