.class public abstract Ll/۟᩵֨;
.super Ljava/lang/Object;
.source "R450"


# instance fields
.field public ֫:Ll/ۨ᩵֨;

.field public final ۧ:Ll/ۛ֡֨;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    new-instance v0, Ll/ۨ᩵֨;

    .line 180
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 182
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    .line 168
    iput-object v0, p0, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    .line 63
    iput-object p1, p0, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
.end method

.method public final ֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;
    .locals 2

    .line 93
    sget-object v0, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    const/4 v1, 0x0

    .line 107
    invoke-virtual {p0, p1, v1, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
.end method

.method public ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;
    .locals 1

    .line 100
    sget-object v0, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {p0, p1, p2, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    .line 127
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֡֨;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract ֫(Ll/ۛ֡֨;)Ll/۟᩵֨;
.end method

.method public final ֫()Z
    .locals 2

    .line 153
    sget-object v0, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v1, 0x0

    .line 82
    invoke-virtual {p0, v1, v0}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 153
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public abstract ֫(Ll/ᩴۧ֨;)Z
.end method

.method public ۧ(Ll/ۛ֡֨;)Z
    .locals 3

    .line 141
    sget-object v0, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    .line 147
    iget-object v1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    new-instance v2, Ll/۟ᩴ֨;

    invoke-direct {v2, p1}, Ll/۟ᩴ֨;-><init>(Ll/ۛ֡֨;)V

    invoke-virtual {p0, v1, v2, v0}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    return p1
.end method
