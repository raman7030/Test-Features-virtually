.class public final synthetic Ll/ܺᩳۢ;
.super Ljava/lang/Object;
.source "Q1K7"

# interfaces
.implements Ll/ۛۢᩴ;


# instance fields
.field public final synthetic ۗ:Ll/᩷ۡ֫;

.field public final synthetic ۙ:I

.field public final synthetic ۫:Ll/᩵ۛۡ;

.field public final synthetic ۬:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/֡ᩳۢ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public synthetic constructor <init>(Ll/֡ᩳۢ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/ArrayList;ILl/᩷ۡ֫;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩵ۛۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺᩳۢ;->᩸:Ll/֡ᩳۢ;

    iput-object p2, p0, Ll/ܺᩳۢ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p3, p0, Ll/ܺᩳۢ;->᩶:Ljava/util/ArrayList;

    iput p4, p0, Ll/ܺᩳۢ;->ۙ:I

    iput-object p5, p0, Ll/ܺᩳۢ;->ۗ:Ll/᩷ۡ֫;

    iput-object p6, p0, Ll/ܺᩳۢ;->۬:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p7, p0, Ll/ܺᩳۢ;->۫:Ll/᩵ۛۡ;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 8

    .line 0
    iget-object v5, p0, Ll/ܺᩳۢ;->۬:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v6, p0, Ll/ܺᩳۢ;->۫:Ll/᩵ۛۡ;

    iget-object v0, p0, Ll/ܺᩳۢ;->᩸:Ll/֡ᩳۢ;

    iget-object v1, p0, Ll/ܺᩳۢ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, Ll/ܺᩳۢ;->᩶:Ljava/util/ArrayList;

    iget v3, p0, Ll/ܺᩳۢ;->ۙ:I

    iget-object v4, p0, Ll/ܺᩳۢ;->ۗ:Ll/᩷ۡ֫;

    move v7, p1

    invoke-static/range {v0 .. v7}, Ll/֡ᩳۢ;->֫(Ll/֡ᩳۢ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/ArrayList;ILl/᩷ۡ֫;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩵ۛۡ;I)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤۢᩴ;->֫(Ll/ۛۢᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 102
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 35
    invoke-static {p0, p1}, Ll/ۤۢᩴ;->֫(Ll/ۛۢᩴ;Ljava/util/function/IntConsumer;)Ll/۫ۢᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ܽ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤۢᩴ;->֫(Ll/ۛۢᩴ;Ljava/lang/Integer;)V

    return-void
.end method
