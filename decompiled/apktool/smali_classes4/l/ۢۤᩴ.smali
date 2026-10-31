.class public final Ll/ۢۤᩴ;
.super Ll/᩻ۤᩴ;
.source "N673"

# interfaces
.implements Ljava/util/Iterator;


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    .line 3495
    iget-object v0, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    .line 3497
    iget-object v1, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 3498
    iget-object v2, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    .line 3499
    iput-object v0, p0, Ll/᩻ۤᩴ;->j:Ll/֡ۤᩴ;

    .line 3500
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    .line 3501
    new-instance v0, Ll/᩵ۤᩴ;

    iget-object v3, p0, Ll/᩻ۤᩴ;->i:Ll/ۧۤᩴ;

    invoke-direct {v0, v1, v2, v3}, Ll/᩵ۤᩴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll/ۧۤᩴ;)V

    return-object v0

    .line 3496
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
