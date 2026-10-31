.class public final Ll/ܽ۫ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final b:Ll/ܽ۫ᩴ;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 64
    new-instance v0, Ll/ܽ۫ᩴ;

    invoke-direct {v0}, Ll/ܽ۫ᩴ;-><init>()V

    sput-object v0, Ll/ܽ۫ᩴ;->b:Ll/ܽ۫ᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    return-void
.end method

.method public static empty()Ll/ܽ۫ᩴ;
    .locals 1

    .line 96
    sget-object v0, Ll/ܽ۫ᩴ;->b:Ll/ܽ۫ᩴ;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;
    .locals 1

    .line 120
    new-instance v0, Ll/ܽ۫ᩴ;

    invoke-direct {v0, p0}, Ll/ܽ۫ᩴ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ofNullable(Ljava/lang/Object;)Ll/ܽ۫ᩴ;
    .locals 0

    if-nez p0, :cond_0

    .line 133
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 431
    :cond_0
    instance-of v0, p1, Ll/ܽ۫ᩴ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 435
    :cond_1
    check-cast p1, Ll/ܽ۫ᩴ;

    .line 436
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    iget-object p1, p1, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public flatMap(Ljava/util/function/Function;)Ll/ܽ۫ᩴ;
    .locals 1

    .line 289
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    invoke-virtual {p0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v0

    if-nez v0, :cond_0

    .line 291
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 294
    :cond_0
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ۫ᩴ;

    .line 295
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ۫ᩴ;

    return-object p1
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    .line 147
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 148
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "No value present"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 1

    .line 448
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public ifPresent(Ljava/util/function/Consumer;)V
    .locals 1

    .line 182
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 183
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isPresent()Z
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public map(Ljava/util/function/Function;)Ll/ܽ۫ᩴ;
    .locals 1

    .line 261
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    invoke-virtual {p0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 265
    :cond_0
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ܽ۫ᩴ;->ofNullable(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public orElse(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 355
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public orElseGet(Ljava/util/function/Supplier;)Ljava/lang/Object;
    .locals 1

    .line 369
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public orElseThrow()Ljava/lang/Object;
    .locals 2

    .line 381
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 382
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "No value present"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;
    .locals 1

    .line 405
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 408
    :cond_0
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 465
    iget-object v0, p0, Ll/ܽ۫ᩴ;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "Optional[%s]"

    .line 466
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Optional.empty"

    return-object v0
.end method
