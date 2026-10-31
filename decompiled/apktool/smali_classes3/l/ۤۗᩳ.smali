.class public final synthetic Ll/ۤۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ۙ:Ll/ۚۙᩳ;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/֡ۗᩳ;

.field public final synthetic ᩹:[C


# direct methods
.method public synthetic constructor <init>(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۗᩳ;->᩸:Ll/֡ۗᩳ;

    iput-object p2, p0, Ll/ۤۗᩳ;->᩹:[C

    iput p3, p0, Ll/ۤۗᩳ;->᩶:I

    iput-object p4, p0, Ll/ۤۗᩳ;->ۙ:Ll/ۚۙᩳ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 2
    iget-object v0, p0, Ll/ۤۗᩳ;->᩸:Ll/֡ۗᩳ;

    .line 4
    iget-object v1, p0, Ll/ۤۗᩳ;->᩹:[C

    .line 6
    iget v2, p0, Ll/ۤۗᩳ;->᩶:I

    .line 8
    iget-object v3, p0, Ll/ۤۗᩳ;->ۙ:Ll/ۚۙᩳ;

    .line 10
    check-cast p1, Ll/ܺ᩹ᩳ;

    .line 316
    :try_start_0
    invoke-virtual {v0}, Ll/֡ۗᩳ;->֫()V

    .line 317
    invoke-virtual {p1}, Ll/ܺ᩹ᩳ;->ۧ()I

    move-result v4

    invoke-virtual {p1}, Ll/ܺ᩹ᩳ;->ۧ()I

    move-result v5

    const/4 v6, 0x0

    invoke-static {v1, v6, v2}, Ljava/nio/CharBuffer;->wrap([CII)Ljava/nio/CharBuffer;

    move-result-object v1

    invoke-virtual {p1, v4, v5, v1}, Ll/ܺ᩹ᩳ;->֫(IILjava/nio/CharBuffer;)V

    .line 319
    invoke-virtual {v3}, Ll/ۚۙᩳ;->ܿ()Z

    move-result p1

    invoke-virtual {v0, p1}, Ll/֡ۗᩳ;->֫(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 320
    new-instance v0, Ljava/io/UncheckedIOException;

    invoke-direct {v0, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v0
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
