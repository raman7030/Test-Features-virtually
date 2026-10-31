.class public final Ll/ܶ᩺ۖ;
.super Ll/֨᩺ۖ;
.source "D9I5"


# instance fields
.field public ۧ:Ljava/lang/String;


# virtual methods
.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 1

    .line 46
    sget-object v0, Ll/۠ܰۖ;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩺ۖ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ(Ll/֡֫ۘ;)I
    .locals 2

    .line 40
    iget-object v0, p0, Ll/ܶ᩺ۖ;->ۧ:Ljava/lang/String;

    sget-object v1, Ll/۠ܰۖ;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 41
    iget-object p1, p0, Ll/ܶ᩺ۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x2

    return p1
.end method
