.class public final Ll/ۚܽܺ;
.super Ll/ܺᩴܺ;
.source "DBGI"


# virtual methods
.method public final ܿ(I)Ll/֡ܽܺ;
    .locals 2

    .line 55
    invoke-virtual {p0, p1}, Ll/ܺᩴܺ;->ᩳ(I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 45
    invoke-virtual {p0, v0}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܽܺ;

    return-object p1

    .line 58
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 59
    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "no such label: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
