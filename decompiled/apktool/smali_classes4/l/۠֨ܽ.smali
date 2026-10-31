.class public final Ll/۠֨ܽ;
.super Ll/֡֨ܽ;
.source "Z6QT"


# instance fields
.field public final ܽ:Ll/ۗ֡ܽ;

.field public final ᩳ:Ll/ۛۚܽ;


# direct methods
.method public constructor <init>(Ll/ۛۚܽ;Ll/ۗ֡ܽ;)V
    .locals 0

    .line 824
    invoke-direct {p0, p1}, Ll/֡֨ܽ;-><init>(Ll/ۛۚܽ;)V

    .line 825
    iput-object p1, p0, Ll/۠֨ܽ;->ᩳ:Ll/ۛۚܽ;

    .line 826
    iput-object p2, p0, Ll/۠֨ܽ;->ܽ:Ll/ۗ֡ܽ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠֨ܽ;)Ll/ۗ֡ܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠֨ܽ;->ܽ:Ll/ۗ֡ܽ;

    return-object p0
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/۠֨ܽ;
    .locals 2

    .line 833
    invoke-static {p0}, Ll/ۗ֡ܽ;->֫(Ll/ۛۚܽ;)Ll/ۗ֡ܽ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 834
    :cond_0
    new-instance v1, Ll/۠֨ܽ;

    invoke-direct {v1, p0, v0}, Ll/۠֨ܽ;-><init>(Ll/ۛۚܽ;Ll/ۗ֡ܽ;)V

    return-object v1
.end method

.method public static bridge synthetic ۧ(Ll/۠֨ܽ;)Ll/ۛۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠֨ܽ;->ᩳ:Ll/ۛۚܽ;

    return-object p0
.end method
