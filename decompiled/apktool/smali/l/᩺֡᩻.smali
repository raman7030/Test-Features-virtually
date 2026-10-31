.class public final synthetic Ll/᩺֡᩻;
.super Ljava/lang/Object;
.source "P50D"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ۗ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ۙ:Ljava/io/OutputStream;

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/۟֡᩻;

.field public final synthetic ᩹:[Ll/ܿ᩹ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۟֡᩻;[Ll/ܿ᩹ۡ;JLjava/io/OutputStream;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺֡᩻;->᩸:Ll/۟֡᩻;

    iput-object p2, p0, Ll/᩺֡᩻;->᩹:[Ll/ܿ᩹ۡ;

    iput-wide p3, p0, Ll/᩺֡᩻;->᩶:J

    iput-object p5, p0, Ll/᩺֡᩻;->ۙ:Ljava/io/OutputStream;

    iput-object p6, p0, Ll/᩺֡᩻;->ۗ:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 7

    .line 0
    iget-object v4, p0, Ll/᩺֡᩻;->ۙ:Ljava/io/OutputStream;

    iget-object v5, p0, Ll/᩺֡᩻;->ۗ:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v0, p0, Ll/᩺֡᩻;->᩸:Ll/۟֡᩻;

    iget-object v1, p0, Ll/᩺֡᩻;->᩹:[Ll/ܿ᩹ۡ;

    iget-wide v2, p0, Ll/᩺֡᩻;->᩶:J

    move v6, p1

    invoke-static/range {v0 .. v6}, Ll/۟֡᩻;->֫(Ll/۟֡᩻;[Ll/ܿ᩹ۡ;JLjava/io/OutputStream;Ljava/util/concurrent/atomic/AtomicReference;I)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
