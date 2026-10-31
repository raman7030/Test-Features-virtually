.class public final Ll/ۤܽۢ;
.super Ljava/lang/ThreadLocal;
.source "R1EE"


# virtual methods
.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1713
    invoke-virtual {p0}, Ll/ۤܽۢ;->get()Ll/᩺ۖܽ;

    move-result-object v0

    return-object v0
.end method

.method public final get()Ll/᩺ۖܽ;
    .locals 1

    .line 1722
    invoke-super {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۖܽ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/᩺ۖܽ;->ܽ()V

    return-object v0
.end method

.method public final initialValue()Ljava/lang/Object;
    .locals 1

    .line 1716
    new-instance v0, Ll/᩺ۖܽ;

    invoke-direct {v0}, Ll/᩺ۖܽ;-><init>()V

    return-object v0
.end method
