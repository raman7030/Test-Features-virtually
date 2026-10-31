.class public Ll/᩸ۢᩴ;
.super Ljava/lang/Object;
.source "J1FL"

# interfaces
.implements Ll/֨ۢᩴ;
.implements Ljava/io/Serializable;
.implements Ll/֨۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final ᩸:Ll/֨ۢᩴ;


# direct methods
.method public constructor <init>(Ll/֨ۡᩴ;)V
    .locals 0

    .line 467
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 468
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 463
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Ll/᩸ۢᩴ;->֫(Ljava/lang/Integer;)Z

    const/4 p1, 0x0

    throw p1
.end method

.method public clear()V
    .locals 1

    .line 520
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۡᩴ;->֫(Ll/֨ۢᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public forEach(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 535
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0, p1}, Ll/ܳۡᩴ;->forEach(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚۢᩴ;->֫(Ll/֨ۢᩴ;Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩸ۢᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 463
    invoke-virtual {p0}, Ll/᩸ۢᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/ܽܺᩴ;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/Integer;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method
