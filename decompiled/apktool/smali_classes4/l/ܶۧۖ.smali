.class public final synthetic Ll/ܶۧۖ;
.super Ljava/lang/Object;
.source "C7P7"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۨܺ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۨܺ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۧۖ;->᩸:Ll/᩹ۨܺ;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    check-cast p1, Ll/᩸۟ܺ;

    .line 138
    invoke-interface {p1}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object p1

    check-cast p1, Ll/᩸֫ۖ;

    invoke-virtual {p1}, Ll/᩸֫ۖ;->getIndex()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Ll/ܶۧۖ;->᩸:Ll/᩹ۨܺ;

    invoke-virtual {v0, p1}, Ll/᩹ۨܺ;->ۧ(Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method
