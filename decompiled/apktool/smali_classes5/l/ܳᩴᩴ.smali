.class public abstract Ll/ܳᩴᩴ;
.super Ll/ܿᩴᩴ;
.source "TBU5"

# interfaces
.implements Ll/֨ۚᩴ;
.implements Ll/ܺ۫ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1088
    invoke-interface {p0}, Ll/֨ۚᩴ;->iterator()Ll/ܶ֡ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 1088
    invoke-interface {p0}, Ll/֨ۚᩴ;->iterator()Ll/ܶ֡ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܳᩴᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/۠ۚᩴ;
    .locals 5

    .line 118
    invoke-interface {p0}, Ll/֨ۚᩴ;->iterator()Ll/ܶ֡ᩴ;

    move-result-object v0

    invoke-static {p0}, Ll/ۘ᩺ۘ;->֫(Ljava/util/Collection;)J

    move-result-wide v1

    invoke-interface {p0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v3

    .line 1310
    new-instance v4, Ll/۫ۚᩴ;

    invoke-direct {v4, v0, v1, v2, v3}, Ll/۫ۚᩴ;-><init>(Ll/ܶ֡ᩴ;JLjava/util/Comparator;)V

    return-object v4
.end method

.method public bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 34
    invoke-interface {p0}, Ll/֨ۚᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method
