.class public final Ll/ܶۨ᩻;
.super Ljava/lang/Object;
.source "Z76C"


# instance fields
.field public ֫:Ll/ۨۖܽ;

.field public ۧ:Z


# virtual methods
.method public final ֫()V
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ܶۨ᩻;->֫:Ll/ۨۖܽ;

    if-eqz v0, :cond_1

    .line 72
    iget-boolean v1, p0, Ll/ܶۨ᩻;->ۧ:Z

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    .line 73
    invoke-virtual {v0, v1}, Ll/ۨۖܽ;->append(C)V

    const/4 v0, 0x0

    .line 74
    iput-boolean v0, p0, Ll/ܶۨ᩻;->ۧ:Z

    :cond_0
    return-void

    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Output builder is not set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(C)V
    .locals 2

    .line 24
    iget-object v0, p0, Ll/ܶۨ᩻;->֫:Ll/ۨۖܽ;

    if-eqz v0, :cond_2

    .line 27
    iget-boolean v1, p0, Ll/ܶۨ᩻;->ۧ:Z

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    .line 28
    invoke-virtual {v0, v1}, Ll/ۨۖܽ;->append(C)V

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Ll/ܶۨ᩻;->ۧ:Z

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    const/16 v0, 0xd

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Ll/ܶۨ᩻;->ۧ:Z

    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Ll/ܶۨ᩻;->֫:Ll/ۨۖܽ;

    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->append(C)V

    return-void

    .line 25
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Output builder is not set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/CharSequence;II)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    :goto_0
    if-ge p2, p3, :cond_1

    .line 60
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܶۨ᩻;->֫(C)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۨۖܽ;)V
    .locals 0

    .line 16
    iput-object p1, p0, Ll/ܶۨ᩻;->֫:Ll/ۨۖܽ;

    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Ll/ܶۨ᩻;->ۧ:Z

    return-void
.end method
