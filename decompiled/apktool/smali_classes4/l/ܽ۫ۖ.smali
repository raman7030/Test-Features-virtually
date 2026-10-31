.class public final Ll/ܽ۫ۖ;
.super Ll/ᩴ۬ۖ;
.source "R9DK"


# direct methods
.method private ֫(Ll/ᩳ۫ۖ;)V
    .locals 4

    .line 88
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 89
    new-instance v1, Ll/ܺ۬ۖ;

    iget-object v2, p0, Ll/ᩴ۬ۖ;->֫:Ll/۠᩵ۚ;

    invoke-direct {v1, v2, v0}, Ll/ܺ۬ۖ;-><init>(Ll/۠᩵ۚ;Ljava/io/ByteArrayOutputStream;)V

    .line 90
    invoke-virtual {p1}, Ll/ᩳ۫ۖ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ۬ۖ;

    .line 91
    invoke-virtual {v1, v3}, Ll/ܺ۬ۖ;->֫(Ll/ۚ۬ۖ;)V

    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {p1, v0}, Ll/ᩳ۫ۖ;->֫(Ll/ᩳ۫ۖ;[B)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ۬ۖ;)I
    .locals 1

    .line 74
    check-cast p1, Ll/ᩳ۫ۖ;

    .line 81
    invoke-static {p1}, Ll/ᩳ۫ۖ;->֫(Ll/ᩳ۫ۖ;)[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 82
    invoke-direct {p0, p1}, Ll/ܽ۫ۖ;->֫(Ll/ᩳ۫ۖ;)V

    .line 84
    :cond_0
    invoke-static {p1}, Ll/ᩳ۫ۖ;->֫(Ll/ᩳ۫ۖ;)[B

    move-result-object p1

    array-length p1, p1

    return p1
.end method

.method public final ֫(Ll/ۚ۬ۖ;Ll/ܺ۬ۖ;)V
    .locals 1

    .line 74
    check-cast p1, Ll/ᩳ۫ۖ;

    .line 98
    invoke-static {p1}, Ll/ᩳ۫ۖ;->֫(Ll/ᩳ۫ۖ;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 99
    invoke-static {p1}, Ll/ᩳ۫ۖ;->֫(Ll/ᩳ۫ۖ;)[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-void

    .line 101
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ۫ۖ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۬ۖ;

    .line 102
    invoke-virtual {p2, v0}, Ll/ܺ۬ۖ;->֫(Ll/ۚ۬ۖ;)V

    goto :goto_0

    :cond_1
    return-void
.end method
