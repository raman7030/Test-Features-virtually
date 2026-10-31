.class public final enum Ll/ܿܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 351
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.arg.release"

    const-string v5, "opt.release"

    const-string v1, "RELEASE"

    const/16 v2, 0x26

    const-string v3, "--release"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/ܿܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩺ۘ۠;)Ll/ܿ᩺ᩴ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܿܺ۠;->ۧ(Ll/᩺ۘ۠;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩺ۘ۠;)Ll/ܿ᩺ᩴ;
    .locals 1

    .line 357
    invoke-interface {p0}, Ll/᩺ۘ۠;->ۧ()Ljava/lang/Iterable;

    move-result-object p0

    .line 358
    invoke-static {p0}, Ll/᩶֨ᩴ;->spliterator(Ljava/lang/Iterable;)Ll/ܶ۫ᩴ;

    move-result-object p0

    const/4 v0, 0x0

    .line 357
    invoke-static {p0, v0}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫(Ll/᩹ܶ۠;)V
    .locals 5

    .line 354
    const-class v0, Ll/ܺۡ۠;

    .line 355
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-class v1, Ll/᩺ۘ۠;

    invoke-static {v1, v0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    .line 356
    invoke-static {v0}, Ll/᩶֨ᩴ;->spliterator(Ljava/lang/Iterable;)Ll/ܶ۫ᩴ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ᩳܺ۠;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 357
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->flatMap(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۨ֫ܿ;

    invoke-direct {v2}, Ll/ۨ֫ܿ;-><init>()V

    .line 360
    invoke-static {v2}, Ll/᩺ۨᩴ;->toCollection(Ljava/util/function/Supplier;)Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 362
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v3, ""

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 365
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    goto :goto_0

    .line 370
    :cond_0
    sget-object v0, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    iget-object v3, p0, Ll/֡ۖ۠;->ۗ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v1

    invoke-virtual {p1, v0, v3, v4}, Ll/᩹ܶ۠;->֫(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, p1, v0}, Ll/֡ۖ۠;->֫(Ll/᩹ܶ۠;Ljava/lang/String;)V

    return-void
.end method
