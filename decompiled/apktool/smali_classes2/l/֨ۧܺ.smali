.class public Ll/֨ۧܺ;
.super Ljava/lang/Object;
.source "BAK8"

# interfaces
.implements Ll/᩸᩺;


# direct methods
.method public static ֫(J)I
    .locals 4

    const/4 v0, 0x0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x7

    shr-long/2addr p0, v1

    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-nez v3, :cond_0

    return v0
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 2

    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_0

    const-string p0, "not-attempted"

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    const-string p0, "enabled"

    return-object p0

    :cond_1
    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    const-string p0, "disabled-by-user"

    return-object p0

    :cond_2
    const/4 v0, -0x1

    if-ne p0, v0, :cond_3

    const-string p0, "unsupported-kernel"

    return-object p0

    :cond_3
    const/4 v0, -0x2

    if-ne p0, v0, :cond_4

    const-string p0, "unsupported-tsync"

    return-object p0

    :cond_4
    const v0, -0x30d40

    if-gt p0, v0, :cond_5

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fatal-tsync-thread-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    neg-int p0, p0

    const v1, 0x30d40

    sub-int/2addr p0, v1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const/16 v0, -0x3e8

    if-gt p0, v0, :cond_6

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fatal-errno-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    neg-int p0, p0

    add-int/lit16 p0, p0, -0x3e8

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    const-string v0, "unknown-"

    .line 0
    invoke-static {p0, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;[CII)V
    .locals 2

    .line 61
    instance-of v0, p0, Ll/ܿ᩻ۘ;

    if-eqz v0, :cond_0

    .line 62
    check-cast p0, Ll/ܿ᩻ۘ;

    add-int/2addr p3, p2

    invoke-virtual {p0, p1, p2, p3}, Ll/ܿ᩻ۘ;->֫([CII)V

    return-void

    :cond_0
    const/16 v0, 0xa

    const/4 v1, 0x0

    if-lt p3, v0, :cond_5

    .line 67
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 68
    check-cast p0, Ljava/lang/String;

    add-int/2addr p3, p2

    invoke-virtual {p0, p2, p3, p1, v1}, Ljava/lang/String;->getChars(II[CI)V

    return-void

    .line 70
    :cond_1
    instance-of v0, p0, Ljava/nio/CharBuffer;

    if-eqz v0, :cond_2

    .line 71
    check-cast p0, Ljava/nio/CharBuffer;

    .line 72
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr p2, v0

    .line 73
    invoke-virtual {p0, p2}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    .line 74
    invoke-virtual {p0, p1, v1, p3}, Ljava/nio/CharBuffer;->get([CII)Ljava/nio/CharBuffer;

    .line 75
    invoke-virtual {p0, v0}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    .line 77
    :cond_2
    instance-of v0, p0, Ll/ᩳ᩻ۘ;

    if-eqz v0, :cond_3

    add-int/2addr p3, p2

    .line 78
    invoke-interface {p0, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ll/ᩳ᩻ۘ;

    invoke-interface {p0}, Ll/ᩳ᩻ۘ;->ۡۧ()V

    return-void

    .line 80
    :cond_3
    instance-of v0, p0, Ljava/lang/StringBuffer;

    if-eqz v0, :cond_4

    .line 81
    check-cast p0, Ljava/lang/StringBuffer;

    add-int/2addr p3, p2

    invoke-virtual {p0, p2, p3, p1, v1}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    return-void

    .line 83
    :cond_4
    instance-of v0, p0, Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    .line 84
    check-cast p0, Ljava/lang/StringBuilder;

    add-int/2addr p3, p2

    invoke-virtual {p0, p2, p3, p1, v1}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    return-void

    :cond_5
    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_6

    .line 89
    array-length v0, p1

    if-ge v1, v0, :cond_6

    .line 90
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    aput-char v0, p1, v1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public static ۧ(I)I
    .locals 1

    shr-int/lit8 p0, p0, 0x7

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    shr-int/lit8 p0, p0, 0x7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public onAnimationCancel()V
    .locals 0

    return-void
.end method

.method public ֫()V
    .locals 0

    return-void
.end method
