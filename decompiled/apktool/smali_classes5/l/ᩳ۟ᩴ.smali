.class public final synthetic Ll/ᩳ۟ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/۫ۨᩴ;


# instance fields
.field public final synthetic a:Ljava/util/stream/BaseStream;


# direct methods
.method public synthetic constructor <init>(Ljava/util/stream/BaseStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    return-void
.end method

.method public static synthetic b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/ᩴ۟ᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ᩴ۟ᩴ;

    iget-object p0, p0, Ll/ᩴ۟ᩴ;->a:Ll/۫ۨᩴ;

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/util/stream/DoubleStream;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/stream/DoubleStream;

    invoke-static {p0}, Ll/ۤ᩺ᩴ;->b(Ljava/util/stream/DoubleStream;)Ll/֡ܰᩴ;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Ljava/util/stream/IntStream;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/util/stream/IntStream;

    invoke-static {p0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/util/stream/LongStream;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/util/stream/LongStream;

    invoke-static {p0}, Ll/۬֫᩵;->b(Ljava/util/stream/LongStream;)Ll/ᩴۧ᩵;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Ljava/util/stream/Stream;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/util/stream/Stream;

    invoke-static {p0}, Ll/֫۟ᩴ;->b(Ljava/util/stream/Stream;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance v0, Ll/ᩳ۟ᩴ;

    invoke-direct {v0, p0}, Ll/ᩳ۟ᩴ;-><init>(Ljava/util/stream/BaseStream;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->close()V

    return-void
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    instance-of v1, p1, Ll/ᩳ۟ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ᩳ۟ᩴ;

    iget-object p1, p1, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->isParallel()Z

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0, p1}, Ljava/util/stream/BaseStream;->onClose(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic parallel()Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->parallel()Ljava/util/stream/BaseStream;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sequential()Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->sequential()Ljava/util/stream/BaseStream;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->spliterator()Ljava/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۗܳ᩵;->a(Ljava/util/Spliterator;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unordered()Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/ᩳ۟ᩴ;->a:Ljava/util/stream/BaseStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->unordered()Ljava/util/stream/BaseStream;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object v0

    return-object v0
.end method
