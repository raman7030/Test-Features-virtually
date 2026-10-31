.class public final synthetic Ll/᩶۫ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ll/ۛۢᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۤۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶۫ۜ;->᩸:Ll/ۤۤۜ;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩶۫ۜ;->᩸:Ll/ۤۤۜ;

    invoke-static {v0, p1}, Ll/ۤۤۜ;->֫(Ll/ۤۤۜ;I)V

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
