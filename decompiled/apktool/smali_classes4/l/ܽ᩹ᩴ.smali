.class public final Ll/ܽ᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ll/ۙ֨ᩴ;


# instance fields
.field public final a:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Ll/ܽ᩹ᩴ;->a:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 3

    .line 81
    iget-object v0, p0, Ll/ܽ᩹ᩴ;->a:Ljava/lang/Iterable;

    new-instance v1, Ll/֫᩹ᩴ;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Ll/֫᩹ᩴ;-><init>(Ljava/util/function/Consumer;I)V

    invoke-static {v0, v1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 76
    new-instance v0, Ll/֨۠ᩴ;

    iget-object v1, p0, Ll/ܽ᩹ᩴ;->a:Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֨۠ᩴ;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Ll/ܽ᩹ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 2

    .line 101
    invoke-virtual {p0}, Ll/ܽ᩹ᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/᩹۫ᩴ;->b(Ljava/util/Iterator;I)Ll/ܳۨᩴ;

    move-result-object v0

    return-object v0
.end method
