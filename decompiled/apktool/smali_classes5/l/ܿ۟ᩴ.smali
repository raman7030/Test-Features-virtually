.class public final Ll/ܿ۟ᩴ;
.super Ll/ᩴ֫᩵;
.source "N673"

# interfaces
.implements Ll/ۚܽ᩵;


# static fields
.field public static final c:Ll/۫ܰᩴ;

.field public static final d:Ll/۫ܰᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 264
    new-instance v6, Ll/۫ܰᩴ;

    sget-object v7, Ll/ۡ֫᩵;->DOUBLE_VALUE:Ll/ۡ֫᩵;

    .line 265
    new-instance v4, Ll/ۧۧ᩵;

    const/16 v0, 0xf

    .line 0
    invoke-direct {v4, v0}, Ll/ۧۧ᩵;-><init>(I)V

    .line 265
    new-instance v5, Ll/ۘ֫᩵;

    const/16 v0, 0xa

    .line 0
    invoke-direct {v5, v0}, Ll/ۘ֫᩵;-><init>(I)V

    const/4 v1, 0x1

    .line 265
    sget-object v8, Ll/ۙ۫ᩴ;->c:Ll/ۙ۫ᩴ;

    move-object v0, v6

    move-object v2, v7

    move-object v3, v8

    invoke-direct/range {v0 .. v5}, Ll/۫ܰᩴ;-><init>(ZLl/ۡ֫᩵;Ljava/lang/Object;Ljava/util/function/Predicate;Ljava/util/function/Supplier;)V

    sput-object v6, Ll/ܿ۟ᩴ;->c:Ll/۫ܰᩴ;

    .line 267
    new-instance v6, Ll/۫ܰᩴ;

    .line 268
    new-instance v4, Ll/ۧۧ᩵;

    const/16 v0, 0xf

    .line 0
    invoke-direct {v4, v0}, Ll/ۧۧ᩵;-><init>(I)V

    .line 268
    new-instance v5, Ll/ۘ֫᩵;

    const/16 v0, 0xa

    .line 0
    invoke-direct {v5, v0}, Ll/ۘ֫᩵;-><init>(I)V

    const/4 v1, 0x0

    move-object v0, v6

    .line 268
    invoke-direct/range {v0 .. v5}, Ll/۫ܰᩴ;-><init>(ZLl/ۡ֫᩵;Ljava/lang/Object;Ljava/util/function/Predicate;Ljava/util/function/Supplier;)V

    sput-object v6, Ll/ܿ۟ᩴ;->d:Ll/۫ܰᩴ;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 0

    .line 256
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ᩴ֫᩵;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/DoubleConsumer;)Ljava/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->a(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)Ll/۠ۛᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 3

    .line 261
    iget-boolean v0, p0, Ll/ᩴ֫᩵;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴ֫᩵;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    .line 113
    new-instance v2, Ll/ۙ۫ᩴ;

    invoke-direct {v2, v0, v1}, Ll/ۙ۫ᩴ;-><init>(D)V

    return-object v2

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
