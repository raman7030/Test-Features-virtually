.class public final Ll/ܶۤᩳ;
.super Ljava/lang/Object;
.source "B6QQ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ljava/lang/CharSequence;

.field public ᩸:Z

.field public final ᩹:Ll/۟᩸ᩳ;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/۟᩸ᩳ;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ܶۤᩳ;->᩶:Ljava/lang/CharSequence;

    .line 17
    iput-object p2, p0, Ll/ܶۤᩳ;->᩹:Ll/۟᩸ᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۤᩳ;)Ljava/lang/CharSequence;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۤᩳ;->᩶:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ll/ܶۤᩳ;
    .locals 2

    .line 22
    instance-of v0, p0, Ll/᩶᩸ᩳ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩶᩸ᩳ;

    .line 23
    invoke-interface {p0}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object p0

    .line 24
    new-instance v0, Ll/ܶۤᩳ;

    invoke-direct {v0, p0, p0}, Ll/ܶۤᩳ;-><init>(Ljava/lang/CharSequence;Ll/۟᩸ᩳ;)V

    return-object v0

    .line 26
    :cond_0
    new-instance v0, Ll/ܶۤᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ܶۤᩳ;-><init>(Ljava/lang/CharSequence;Ll/۟᩸ᩳ;)V

    return-object v0
.end method

.method public static ֫(III)V
    .locals 0

    if-ltz p0, :cond_0

    if-lt p1, p0, :cond_0

    if-gt p1, p2, :cond_0

    return-void

    .line 60
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "Invalid diff text range"

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/ܶۤᩳ;)V
    .locals 1

    .line 55
    iget-boolean p0, p0, Ll/ܶۤᩳ;->᩸:Z

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Diff reader is closed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 66
    iget-boolean v0, p0, Ll/ܶۤᩳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p0, Ll/ܶۤᩳ;->᩸:Z

    .line 68
    iget-object v0, p0, Ll/ܶۤᩳ;->᩹:Ll/۟᩸ᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final length()I
    .locals 2

    .line 55
    iget-boolean v0, p0, Ll/ܶۤᩳ;->᩸:Z

    if-nez v0, :cond_0

    .line 31
    iget-object v0, p0, Ll/ܶۤᩳ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Diff reader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final range(II)Ljava/lang/CharSequence;
    .locals 1

    .line 35
    invoke-virtual {p0}, Ll/ܶۤᩳ;->length()I

    move-result v0

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    if-gt p2, v0, :cond_0

    .line 36
    new-instance v0, Ll/۠ۤᩳ;

    invoke-direct {v0, p0, p1, p2}, Ll/۠ۤᩳ;-><init>(Ll/ܶۤᩳ;II)V

    return-object v0

    .line 60
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid diff text range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
