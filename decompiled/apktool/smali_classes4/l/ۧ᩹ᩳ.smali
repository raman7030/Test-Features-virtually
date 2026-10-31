.class public final Ll/ۧ᩹ᩳ;
.super Ll/۬᩹ᩳ;
.source "Z6TX"


# instance fields
.field public final ᩶:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۨ᩹ᩳ;II)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Ll/۬᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;)V

    .line 10
    iput p2, p0, Ll/ۧ᩹ᩳ;->᩶:I

    .line 11
    iput p3, p0, Ll/ۧ᩹ᩳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 3

    .line 24
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    if-ltz p1, :cond_0

    .line 25
    iget v1, p0, Ll/ۧ᩹ᩳ;->᩹:I

    iget v2, p0, Ll/ۧ᩹ᩳ;->᩶:I

    sub-int/2addr v1, v2

    if-ge p1, v1, :cond_0

    add-int/2addr v2, p1

    .line 26
    invoke-virtual {v0, v2}, Ll/ۨ᩹ᩳ;->֫(I)C

    move-result p1

    return p1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid character index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getChars(II[CI)V
    .locals 4

    .line 38
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 39
    iget v1, p0, Ll/ۧ᩹ᩳ;->᩹:I

    iget v2, p0, Ll/ۧ᩹ᩳ;->᩶:I

    sub-int v3, v1, v2

    invoke-static {p1, p2, v3}, Ll/ۨ᩹ᩳ;->֫(III)V

    sub-int/2addr p2, p1

    .line 40
    invoke-static {p3, p4, p2}, Ll/۬᩹ᩳ;->֫([CII)V

    .line 41
    new-instance v3, Ll/᩷᩹ᩳ;

    invoke-direct {v3, v0, v2, v1, p1}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;III)V

    .line 42
    :try_start_0
    invoke-virtual {v3, p3, p4, p2}, Ll/᩷᩹ᩳ;->֫([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-virtual {v3}, Ll/᩷᩹ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    invoke-virtual {v3}, Ll/᩷᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final length()I
    .locals 2

    .line 18
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    .line 19
    iget v0, p0, Ll/ۧ᩹ᩳ;->᩹:I

    iget v1, p0, Ll/ۧ᩹ᩳ;->᩶:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final bridge synthetic subSequence(II)Ljava/lang/CharSequence;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Ll/ۧ᩹ᩳ;->subSequence(II)Ll/۬᩹ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final subSequence(II)Ll/۬᩹ᩳ;
    .locals 3

    .line 31
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 32
    iget v1, p0, Ll/ۧ᩹ᩳ;->᩹:I

    iget v2, p0, Ll/ۧ᩹ᩳ;->᩶:I

    sub-int/2addr v1, v2

    invoke-static {p1, p2, v1}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 33
    new-instance v1, Ll/ۧ᩹ᩳ;

    add-int/2addr p1, v2

    add-int/2addr v2, p2

    invoke-direct {v1, v0, p1, v2}, Ll/ۧ᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;II)V

    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 75
    invoke-virtual {p0}, Ll/ۧ᩹ᩳ;->length()I

    move-result v0

    new-array v1, v0, [C

    const/4 v2, 0x0

    .line 76
    invoke-virtual {p0, v2, v0, v1, v2}, Ll/ۧ᩹ᩳ;->getChars(II[CI)V

    .line 77
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 14
    iget v0, p0, Ll/ۧ᩹ᩳ;->᩶:I

    return v0
.end method

.method public final ۧ(I)Ll/᩷᩹ᩳ;
    .locals 4

    .line 48
    new-instance v0, Ll/᩷᩹ᩳ;

    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    iget v2, p0, Ll/ۧ᩹ᩳ;->᩶:I

    iget v3, p0, Ll/ۧ᩹ᩳ;->᩹:I

    invoke-direct {v0, v1, v2, v3, p1}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;III)V

    return-object v0
.end method
