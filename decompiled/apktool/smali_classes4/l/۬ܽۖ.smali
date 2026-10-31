.class public Ll/۬ܽۖ;
.super Ll/֨ܳۖ;
.source "688Y"


# instance fields
.field public ֫:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1494
    invoke-direct {p0}, Ll/֨ܳۖ;-><init>()V

    const/4 v0, 0x0

    .line 1495
    iput-object v0, p0, Ll/۬ܽۖ;->֫:Ll/۠ᩳۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 1

    .line 1505
    iget-object v0, p0, Ll/۬ܽۖ;->֫:Ll/۠ᩳۖ;

    if-eqz v0, :cond_0

    .line 1524
    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1510
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۠ᩳۖ;)V
    .locals 1

    .line 1498
    iget-object v0, p0, Ll/۬ܽۖ;->֫:Ll/۠ᩳۖ;

    if-nez v0, :cond_0

    .line 1501
    iput-object p1, p0, Ll/۬ܽۖ;->֫:Ll/۠ᩳۖ;

    return-void

    .line 1499
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Delegate is already set"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 1

    .line 1505
    iget-object v0, p0, Ll/۬ܽۖ;->֫:Ll/۠ᩳۖ;

    if-eqz v0, :cond_0

    .line 1529
    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void

    .line 1510
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ll/۠ᩳۖ;
    .locals 2

    .line 1505
    iget-object v0, p0, Ll/۬ܽۖ;->֫:Ll/۠ᩳۖ;

    if-eqz v0, :cond_0

    return-object v0

    .line 1510
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
