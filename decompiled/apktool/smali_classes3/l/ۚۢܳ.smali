.class public final synthetic Ll/ۚۢܳ;
.super Ljava/lang/Object;
.source "I29D"

# interfaces
.implements Ljava/util/function/LongConsumer;


# instance fields
.field public final synthetic ᩸:Ll/۫ۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۢܳ;->᩸:Ll/۫ۢܳ;

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۚۢܳ;->᩸:Ll/۫ۢܳ;

    invoke-static {v0, p1, p2}, Ll/۫ۢܳ;->֫(Ll/۫ۢܳ;J)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖۛᩴ;->$default$andThen(Ljava/util/function/LongConsumer;Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method
