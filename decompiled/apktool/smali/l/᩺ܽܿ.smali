.class public final Ll/᩺ܽܿ;
.super Ljava/lang/Object;
.source "V7S3"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final ᩸:I

.field public final ᩹:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p2, p0, Ll/᩺ܽܿ;->᩹:Ljava/lang/CharSequence;

    .line 50
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/᩺ܽܿ;->᩸:I

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 4

    .line 60
    iget v0, p0, Ll/᩺ܽܿ;->᩸:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 63
    iget-object v0, p0, Ll/᩺ܽܿ;->᩹:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    .line 61
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Index: "

    const-string v3, ", Length: "

    .line 0
    invoke-static {v2, p1, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 61
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final length()I
    .locals 1

    .line 55
    iget v0, p0, Ll/᩺ܽܿ;->᩸:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 5

    .line 68
    iget v0, p0, Ll/᩺ܽܿ;->᩸:I

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    if-gt p1, p2, :cond_0

    if-gt p2, v0, :cond_0

    .line 72
    iget-object v0, p0, Ll/᩺ܽܿ;->᩹:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 69
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ", end: "

    const-string v3, ", length: "

    const-string v4, "start: "

    .line 0
    invoke-static {v4, p1, v2, v3, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
