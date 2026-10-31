.class public final synthetic Ll/ܿ֨ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۢ۠ᩴ;
.implements Ljava/nio/file/DirectoryStream$Filter;
.implements Ll/᩹۠ᩴ;
.implements Ljava/util/function/BiPredicate;
.implements Ljava/util/function/IntPredicate;
.implements Ljava/util/function/LongPredicate;
.implements Ljava/util/function/Predicate;
.implements Ljava/util/function/DoubleFunction;
.implements Ljava/util/function/Function;
.implements Ljava/util/function/LongFunction;
.implements Ljava/util/function/Consumer;
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Ll/ܿ֨ᩴ;->a:I

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    sget-object v0, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    iput-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll/ܿ֨ᩴ;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ll/ܿ֨ᩴ;->a:I

    iput-object p2, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ll/᩹۟ᩴ;)V
    .locals 2

    const/4 v0, 0x1

    .line 400
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 395
    iget-object v1, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    check-cast v1, Ljava/util/EnumMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ll/ܿ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/֡ᩳ᩵;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Ll/ܿ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 62
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/file/DirectoryStream$Filter;

    invoke-static {p1}, Ll/᩺ۚᩴ;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/DirectoryStream$Filter;->accept(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 532
    :pswitch_0
    check-cast p1, Ll/᩷۠ᩴ;

    .line 535
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/ۢ۠ᩴ;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ۢ۠ᩴ;->matches(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic and(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$and(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic and(Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۛᩴ;->$default$and(Ljava/util/function/IntPredicate;Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic and(Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۛᩴ;->$default$and(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 1

    iget v0, p0, Ll/ܿ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public apply(D)Ljava/lang/Object;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/DoubleFunction;

    invoke-interface {v0, p1, p2}, Ljava/util/function/DoubleFunction;->apply(D)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 125
    :cond_0
    instance-of v0, p1, Ll/֡ܰᩴ;

    if-eqz v0, :cond_1

    .line 126
    check-cast p1, Ll/֡ܰᩴ;

    .line 127
    invoke-static {p1}, Ll/ܳܰᩴ;->b(Ll/֡ܰᩴ;)Ljava/util/stream/DoubleStream;

    move-result-object p1

    return-object p1

    .line 129
    :cond_1
    instance-of v0, p1, Ljava/util/stream/DoubleStream;

    if-eqz v0, :cond_2

    .line 130
    check-cast p1, Ljava/util/stream/DoubleStream;

    .line 131
    invoke-static {p1}, Ll/ۤ᩺ᩴ;->b(Ljava/util/stream/DoubleStream;)Ll/֡ܰᩴ;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "java.util.stream.DoubleStream"

    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ܽۛᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2
.end method

.method public apply(J)Ljava/lang/Object;
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/LongFunction;

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongFunction;->apply(J)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 154
    :cond_0
    instance-of v0, p1, Ll/ᩴۧ᩵;

    if-eqz v0, :cond_1

    .line 155
    check-cast p1, Ll/ᩴۧ᩵;

    .line 156
    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1

    .line 158
    :cond_1
    instance-of v0, p1, Ljava/util/stream/LongStream;

    if-eqz v0, :cond_2

    .line 159
    check-cast p1, Ljava/util/stream/LongStream;

    invoke-static {p1}, Ll/۬֫᩵;->b(Ljava/util/stream/LongStream;)Ll/ᩴۧ᩵;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "java.util.stream.LongStream"

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ܽۛᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    throw p2
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 81
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/Function;

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 46
    :cond_0
    instance-of v1, p1, Ll/ܿ᩺ᩴ;

    if-eqz v1, :cond_1

    .line 47
    check-cast p1, Ll/ܿ᩺ᩴ;

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1

    .line 49
    :cond_1
    instance-of v1, p1, Ljava/util/stream/Stream;

    if-eqz v1, :cond_2

    .line 50
    check-cast p1, Ljava/util/stream/Stream;

    invoke-static {p1}, Ll/֫۟ᩴ;->b(Ljava/util/stream/Stream;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    return-object p1

    .line 53
    :cond_2
    instance-of v1, p1, Ll/ۧ᩺ᩴ;

    if-eqz v1, :cond_3

    .line 54
    check-cast p1, Ll/ۧ᩺ᩴ;

    invoke-static {p1}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object p1

    return-object p1

    .line 56
    :cond_3
    instance-of v1, p1, Ljava/util/stream/IntStream;

    if-eqz v1, :cond_4

    .line 57
    check-cast p1, Ljava/util/stream/IntStream;

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1

    .line 60
    :cond_4
    instance-of v1, p1, Ll/֡ܰᩴ;

    if-eqz v1, :cond_5

    .line 61
    check-cast p1, Ll/֡ܰᩴ;

    .line 62
    invoke-static {p1}, Ll/ܳܰᩴ;->b(Ll/֡ܰᩴ;)Ljava/util/stream/DoubleStream;

    move-result-object p1

    return-object p1

    .line 64
    :cond_5
    instance-of v1, p1, Ljava/util/stream/DoubleStream;

    if-eqz v1, :cond_6

    .line 65
    check-cast p1, Ljava/util/stream/DoubleStream;

    .line 66
    invoke-static {p1}, Ll/ۤ᩺ᩴ;->b(Ljava/util/stream/DoubleStream;)Ll/֡ܰᩴ;

    move-result-object p1

    return-object p1

    .line 69
    :cond_6
    instance-of v1, p1, Ll/ᩴۧ᩵;

    if-eqz v1, :cond_7

    .line 70
    check-cast p1, Ll/ᩴۧ᩵;

    .line 71
    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1

    .line 73
    :cond_7
    instance-of v1, p1, Ljava/util/stream/LongStream;

    if-eqz v1, :cond_8

    .line 74
    check-cast p1, Ljava/util/stream/LongStream;

    invoke-static {p1}, Ll/۬֫᩵;->b(Ljava/util/stream/LongStream;)Ll/ᩴۧ᩵;

    move-result-object p1

    return-object p1

    :cond_8
    const-string v1, "java.util.stream.*Stream"

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ܽۛᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    throw v0
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public getAsBoolean()Z
    .locals 2

    iget v0, p0, Ll/ܿ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/ۡۧ᩵;

    .line 294
    iget-object v1, v0, Ll/᩸֫᩵;->d:Ll/ܶ۫ᩴ;

    iget-object v0, v0, Ll/᩸֫᩵;->e:Ll/֡ᩳ᩵;

    invoke-interface {v1, v0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    return v0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/ۤܿ᩵;

    .line 405
    iget-object v1, v0, Ll/᩸֫᩵;->d:Ll/ܶ۫ᩴ;

    iget-object v0, v0, Ll/᩸֫᩵;->e:Ll/֡ᩳ᩵;

    invoke-interface {v1, v0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    return v0

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/᩻ܿ᩵;

    .line 347
    iget-object v1, v0, Ll/᩸֫᩵;->d:Ll/ܶ۫ᩴ;

    iget-object v0, v0, Ll/᩸֫᩵;->e:Ll/֡ᩳ᩵;

    invoke-interface {v1, v0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    return v0

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/֨ᩳ᩵;

    .line 463
    iget-object v1, v0, Ll/᩸֫᩵;->d:Ll/ܶ۫ᩴ;

    iget-object v0, v0, Ll/᩸֫᩵;->e:Ll/֡ᩳ᩵;

    invoke-interface {v1, v0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public matches(Ll/᩷۠ᩴ;)Z
    .locals 1

    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/regex/Pattern;

    .line 152
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public name()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ll/ܿ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "posix:permissions"

    return-object v0

    :pswitch_0
    const-string v0, "posix:permissions"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic negate()Ljava/util/function/BiPredicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ܳۛᩴ;->$default$negate(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic negate()Ljava/util/function/IntPredicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۡۛᩴ;->$default$negate(Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic negate()Ljava/util/function/LongPredicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۘۛᩴ;->$default$negate(Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$or(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic or(Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۛᩴ;->$default$or(Ljava/util/function/IntPredicate;Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic or(Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۛᩴ;->$default$or(Ljava/util/function/LongPredicate;Ljava/util/function/LongPredicate;)Ljava/util/function/LongPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public test(I)Z
    .locals 1

    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntPredicate;

    .line 81
    invoke-interface {v0, p1}, Ljava/util/function/IntPredicate;->test(I)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public test(J)Z
    .locals 1

    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/LongPredicate;

    .line 81
    invoke-interface {v0, p1, p2}, Ljava/util/function/LongPredicate;->test(J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/Predicate;

    .line 80
    invoke-interface {v0, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/BiPredicate;

    .line 84
    invoke-interface {v0, p1, p2}, Ljava/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public value()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/ܿ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 176
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 40
    :pswitch_0
    iget-object v0, p0, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/file/attribute/FileAttribute;

    .line 41
    invoke-interface {v0}, Ljava/nio/file/attribute/FileAttribute;->value()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ll/᩺ۚᩴ;->v(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 40
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
