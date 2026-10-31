.class public final Ll/ۜ᩹ܺ;
.super Ll/ۢ᩹ܺ;
.source "E3QI"

# interfaces
.implements Ll/֡᩸ܺ;


# static fields
.field public static final serialVersionUID:J = 0x1L


# direct methods
.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 4811
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use LoadingSerializationProxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4780
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۜ᩹ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4782
    new-instance v0, Ll/ۛܰܺ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 91
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 4782
    throw v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 3896
    iget-object v0, p0, Ll/ۢ᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    iget-object v1, v0, Ll/ܳ᩶ܺ;->᩹:Ll/ᩴ᩸ܺ;

    invoke-virtual {v0, p1, v1}, Ll/ܳ᩶ܺ;->֫(Ljava/lang/Object;Ll/ᩴ᩸ܺ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 4807
    new-instance v0, Ll/ܿ᩹ܺ;

    iget-object v1, p0, Ll/ۢ᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    .line 4621
    invoke-direct {v0, v1}, Ll/ۡ᩹ܺ;-><init>(Ll/ܳ᩶ܺ;)V

    return-object v0
.end method
