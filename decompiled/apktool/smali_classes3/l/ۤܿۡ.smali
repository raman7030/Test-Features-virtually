.class public final synthetic Ll/ۤܿۡ;
.super Ljava/lang/Object;
.source "TBJG"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ᩸:Ll/᩷ܳۡ;

.field public final synthetic ᩹:Ljava/lang/StringBuilder;


# direct methods
.method public synthetic constructor <init>(Ll/᩷ܳۡ;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܿۡ;->᩸:Ll/᩷ܳۡ;

    iput-object p2, p0, Ll/ۤܿۡ;->᩹:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 1

    .line 0
    iget-object p1, p0, Ll/ۤܿۡ;->᩸:Ll/᩷ܳۡ;

    iget-object v0, p0, Ll/ۤܿۡ;->᩹:Ljava/lang/StringBuilder;

    invoke-static {p1, v0}, Ll/᩷ܳۡ;->֫(Ll/᩷ܳۡ;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
