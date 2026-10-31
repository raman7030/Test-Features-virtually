.class public final synthetic Ll/ۛۖᩴ;
.super Ljava/lang/Object;
.source "EBUA"

# interfaces
.implements Ljava/util/function/LongPredicate;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/Predicate;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Predicate;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۖᩴ;->᩸:Ljava/util/function/Predicate;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۛᩴ;->$default$and(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/LongPredicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۘۛᩴ;->$default$negate(Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۛᩴ;->$default$or(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(J)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۛۖᩴ;->᩸:Ljava/util/function/Predicate;

    .line 256
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
