.class public abstract Ll/ۨܿᩴ;
.super Ll/ۛܿᩴ;
.source "W6Y"

# interfaces
.implements Ll/֫ܺᩴ;
.implements Ll/ܺ۫ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final first()Ljava/lang/Object;
    .locals 1

    .line 211
    invoke-interface {p0}, Ll/֫ܺᩴ;->֡()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 189
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/֫ܺᩴ;->ᩴ(I)Ll/֫ܺᩴ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1196
    invoke-interface {p0}, Ll/֫ܺᩴ;->ۗ()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ll/ۜۡᩴ;
    .locals 1

    .line 1196
    invoke-interface {p0}, Ll/֫ܺᩴ;->ۗ()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 222
    invoke-interface {p0}, Ll/֫ܺᩴ;->᩻֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۨܿᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 34
    invoke-interface {p0}, Ll/֫ܺᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/ܽܺᩴ;
    .locals 5

    .line 118
    invoke-interface {p0}, Ll/֫ܺᩴ;->ۗ()Ll/ܶۡᩴ;

    move-result-object v0

    invoke-static {p0}, Ll/ۘ᩺ۘ;->֫(Ljava/util/Collection;)J

    move-result-wide v1

    invoke-interface {p0}, Ll/֫ܺᩴ;->comparator()Ll/ۙۢᩴ;

    move-result-object v3

    .line 1487
    new-instance v4, Ll/ܺܺᩴ;

    invoke-direct {v4, v0, v1, v2, v3}, Ll/ܺܺᩴ;-><init>(Ll/ܶۡᩴ;JLl/ۙۢᩴ;)V

    return-object v4
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 34
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    .line 178
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p0, p1, p2}, Ll/֫ܺᩴ;->ܽ(II)Ll/֫ܺᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 200
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/֫ܺᩴ;->ܳ(I)Ll/֫ܺᩴ;

    move-result-object p1

    return-object p1
.end method
