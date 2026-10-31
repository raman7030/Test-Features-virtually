.class public final Ll/᩹᩸ᩳ;
.super Ljava/lang/Object;
.source "EB2A"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Landroid/text/GetChars;


# instance fields
.field public final ᩶:I

.field public final ᩸:[C

.field public final ᩹:I


# direct methods
.method public constructor <init>([CII)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/᩹᩸ᩳ;->᩸:[C

    .line 18
    iput p2, p0, Ll/᩹᩸ᩳ;->᩶:I

    sub-int/2addr p3, p2

    .line 20
    iput p3, p0, Ll/᩹᩸ᩳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 4

    .line 30
    iget v0, p0, Ll/᩹᩸ᩳ;->᩹:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 33
    iget v0, p0, Ll/᩹᩸ᩳ;->᩶:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/᩹᩸ᩳ;->᩸:[C

    aget-char p1, p1, v0

    return p1

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index = "

    const-string v3, ", length = "

    .line 0
    invoke-static {v2, p1, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final getChars(II[CI)V
    .locals 3

    .line 62
    iget v0, p0, Ll/᩹᩸ᩳ;->᩹:I

    if-ltz p1, :cond_0

    if-gt p2, v0, :cond_0

    if-gt p1, p2, :cond_0

    .line 66
    iget v0, p0, Ll/᩹᩸ᩳ;->᩶:I

    add-int/2addr v0, p1

    sub-int/2addr p2, p1

    iget-object p1, p0, Ll/᩹᩸ᩳ;->᩸:[C

    invoke-static {p1, v0, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 63
    :cond_0
    new-instance p3, Ljava/lang/IndexOutOfBoundsException;

    const-string p4, ", end = "

    const-string v1, ", length = "

    const-string v2, "start = "

    .line 0
    invoke-static {v2, p1, p4, v1, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public final length()I
    .locals 1

    .line 25
    iget v0, p0, Ll/᩹᩸ᩳ;->᩹:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 5

    .line 39
    iget v0, p0, Ll/᩹᩸ᩳ;->᩹:I

    if-nez p1, :cond_0

    if-ne p2, v0, :cond_0

    return-object p0

    :cond_0
    sub-int v1, p2, p1

    if-ltz v1, :cond_2

    if-ltz p1, :cond_2

    if-gt p2, v0, :cond_2

    if-nez v1, :cond_1

    const-string p1, ""

    return-object p1

    .line 49
    :cond_1
    iget v0, p0, Ll/᩹᩸ᩳ;->᩶:I

    add-int/2addr p1, v0

    add-int/2addr v0, p2

    .line 51
    new-instance p2, Ll/᩹᩸ᩳ;

    iget-object v1, p0, Ll/᩹᩸ᩳ;->᩸:[C

    invoke-direct {p2, v1, p1, v0}, Ll/᩹᩸ᩳ;-><init>([CII)V

    return-object p2

    .line 44
    :cond_2
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ", end = "

    const-string v3, ", length = "

    const-string v4, "start = "

    .line 0
    invoke-static {v4, p1, v2, v3, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 57
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/᩹᩸ᩳ;->᩶:I

    iget v2, p0, Ll/᩹᩸ᩳ;->᩹:I

    iget-object v3, p0, Ll/᩹᩸ᩳ;->᩸:[C

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method
