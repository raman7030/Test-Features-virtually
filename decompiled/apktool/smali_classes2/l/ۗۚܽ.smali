.class public final Ll/ۗۚܽ;
.super Ll/ۛۚܽ;
.source "Z6QT"


# instance fields
.field public final ۧ:Ll/ܳ֨ܽ;


# direct methods
.method public constructor <init>(Ll/ۛۚܽ;Ll/ܳ֨ܽ;)V
    .locals 0

    .line 1383
    invoke-direct {p0}, Ll/ۛۚܽ;-><init>()V

    .line 1384
    iput-object p1, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 1385
    iput-object p2, p0, Ll/ۗۚܽ;->ۧ:Ll/ܳ֨ܽ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗۚܽ;)Ll/ۙۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۚܽ;->ۧ:Ll/ܳ֨ܽ;

    return-object p0
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;
    .locals 2

    .line 1371
    invoke-static {p0}, Ll/ܿ֨ܽ;->֫(Ll/ۛۚܽ;)Ll/ܿ֨ܽ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1373
    invoke-static {v0}, Ll/ܿ֨ܽ;->ۧ(Ll/ܿ֨ܽ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ܳ֨ܽ;

    invoke-direct {v1, v0}, Ll/ܳ֨ܽ;-><init>(Ll/ܿ֨ܽ;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_2

    return-object p0

    .line 1390
    :cond_2
    new-instance v0, Ll/ۗۚܽ;

    invoke-direct {v0, p0, v1}, Ll/ۗۚܽ;-><init>(Ll/ۛۚܽ;Ll/ܳ֨ܽ;)V

    return-object v0
.end method
