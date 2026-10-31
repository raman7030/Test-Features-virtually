.class public final synthetic Ll/ܺۘ֡;
.super Ljava/lang/Object;
.source "6AIE"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/TreeMap;


# direct methods
.method public synthetic constructor <init>(Ljava/util/TreeMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۘ֡;->᩸:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܺۘ֡;->᩸:Ljava/util/TreeMap;

    check-cast p2, Ll/ᩴۘ֡;

    invoke-static {v0, p1, p2}, Ll/᩵ۘ֡;->֫(Ljava/util/TreeMap;Ljava/lang/Object;Ll/ᩴۘ֡;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
