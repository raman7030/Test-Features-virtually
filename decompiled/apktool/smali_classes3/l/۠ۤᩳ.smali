.class public final Ll/۠ۤᩳ;
.super Ljava/lang/Object;
.source "B6QQ"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Landroid/text/GetChars;


# instance fields
.field public final synthetic ᩶:Ll/ܶۤᩳ;

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ܶۤᩳ;II)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۤᩳ;->᩶:Ll/ܶۤᩳ;

    .line 77
    iput p2, p0, Ll/۠ۤᩳ;->᩹:I

    .line 78
    iput p3, p0, Ll/۠ۤᩳ;->᩸:I

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 2

    if-ltz p1, :cond_0

    .line 86
    invoke-virtual {p0}, Ll/۠ۤᩳ;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 87
    iget-object v0, p0, Ll/۠ۤᩳ;->᩶:Ll/ܶۤᩳ;

    invoke-static {v0}, Ll/ܶۤᩳ;->֫(Ll/ܶۤᩳ;)Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Ll/۠ۤᩳ;->᩹:I

    add-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid diff text index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getChars(II[CI)V
    .locals 5

    .line 98
    invoke-virtual {p0}, Ll/۠ۤᩳ;->length()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ܶۤᩳ;->֫(III)V

    if-ltz p4, :cond_2

    .line 99
    array-length v0, p3

    sub-int v1, p2, p1

    sub-int/2addr v0, v1

    if-gt p4, v0, :cond_2

    .line 102
    iget-object v0, p0, Ll/۠ۤᩳ;->᩶:Ll/ܶۤᩳ;

    invoke-static {v0}, Ll/ܶۤᩳ;->֫(Ll/ܶۤᩳ;)Ljava/lang/CharSequence;

    move-result-object v1

    instance-of v2, v1, Landroid/text/GetChars;

    iget v3, p0, Ll/۠ۤᩳ;->᩹:I

    if-eqz v2, :cond_0

    check-cast v1, Landroid/text/GetChars;

    add-int/2addr p1, v3

    add-int/2addr v3, p2

    invoke-interface {v1, p1, v3, p3, p4}, Landroid/text/GetChars;->getChars(II[CI)V

    return-void

    :cond_0
    :goto_0
    if-ge p1, p2, :cond_1

    add-int/lit8 v1, p4, 0x1

    .line 103
    invoke-static {v0}, Ll/ܶۤᩳ;->֫(Ll/ܶۤᩳ;)Ljava/lang/CharSequence;

    move-result-object v2

    add-int v4, v3, p1

    invoke-interface {v2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    aput-char v2, p3, p4

    add-int/lit8 p1, p1, 0x1

    move p4, v1

    goto :goto_0

    :cond_1
    return-void

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid diff text destination"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final length()I
    .locals 2

    .line 82
    iget-object v0, p0, Ll/۠ۤᩳ;->᩶:Ll/ܶۤᩳ;

    invoke-static {v0}, Ll/ܶۤᩳ;->ۧ(Ll/ܶۤᩳ;)V

    iget v0, p0, Ll/۠ۤᩳ;->᩸:I

    iget v1, p0, Ll/۠ۤᩳ;->᩹:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    .line 92
    invoke-virtual {p0}, Ll/۠ۤᩳ;->length()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ܶۤᩳ;->֫(III)V

    .line 93
    new-instance v0, Ll/۠ۤᩳ;

    iget v1, p0, Ll/۠ۤᩳ;->᩹:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Ll/۠ۤᩳ;->᩶:Ll/ܶۤᩳ;

    invoke-direct {v0, p2, p1, v1}, Ll/۠ۤᩳ;-><init>(Ll/ܶۤᩳ;II)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 108
    invoke-virtual {p0}, Ll/۠ۤᩳ;->length()I

    move-result v0

    new-array v1, v0, [C

    const/4 v2, 0x0

    .line 109
    invoke-virtual {p0, v2, v0, v1, v2}, Ll/۠ۤᩳ;->getChars(II[CI)V

    .line 110
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
