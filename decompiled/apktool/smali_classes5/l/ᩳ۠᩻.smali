.class public Ll/ᩳ۠᩻;
.super Ll/ᩴۜۖ;
.source "C9PC"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6467
    invoke-direct {p0}, Ll/ᩴۜۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;
    .locals 0

    .line 6467
    invoke-virtual {p0, p1, p2}, Ll/ᩳ۠᩻;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۜ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۜ۠᩻;
    .locals 2

    .line 6473
    invoke-static {}, Ll/ۜ۠᩻;->newBuilder()Ll/ܿ۠᩻;

    move-result-object v0

    .line 6475
    :try_start_0
    invoke-virtual {v0, p1, p2}, Ll/ܿ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿ۠᩻;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ᩳ֨ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6484
    invoke-virtual {v0}, Ll/ܿ۠᩻;->buildPartial()Ll/ۜ۠᩻;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 6481
    new-instance p2, Ll/֫᩵ۖ;

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6482
    invoke-virtual {v0}, Ll/ܿ۠᩻;->buildPartial()Ll/ۜ۠᩻;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p2

    :catch_1
    move-exception p1

    .line 6479
    invoke-virtual {p1}, Ll/ᩳ֨ۖ;->֫()Ll/֫᩵ۖ;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܿ۠᩻;->buildPartial()Ll/ۜ۠᩻;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p1

    :catch_2
    move-exception p1

    .line 6477
    invoke-virtual {v0}, Ll/ܿ۠᩻;->buildPartial()Ll/ۜ۠᩻;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p1
.end method
