.class public final Ll/᩸֨ܽ;
.super Ll/֡֨ܽ;
.source "Z6QT"


# instance fields
.field public final ܽ:Ll/ۛۚܽ;

.field public final ܿ:Ll/ܿ֨ܽ;

.field public final ᩳ:Ll/ۛۚܽ;


# direct methods
.method public constructor <init>(Ll/ۛۚܽ;Ll/ܿ֨ܽ;Ll/ۛۚܽ;)V
    .locals 0

    .line 944
    invoke-direct {p0, p1}, Ll/֡֨ܽ;-><init>(Ll/ۛۚܽ;)V

    .line 945
    iput-object p1, p0, Ll/᩸֨ܽ;->ᩳ:Ll/ۛۚܽ;

    .line 946
    iput-object p2, p0, Ll/᩸֨ܽ;->ܿ:Ll/ܿ֨ܽ;

    .line 947
    invoke-static {p2}, Ll/ܿ֨ܽ;->ܽ(Ll/ܿ֨ܽ;)I

    .line 948
    iput-object p3, p0, Ll/᩸֨ܽ;->ܽ:Ll/ۛۚܽ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸֨ܽ;)Ll/ۛۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸֨ܽ;->ܽ:Ll/ۛۚܽ;

    return-object p0
.end method

.method public static ֫(Ll/ۛۚܽ;Ll/֡֨ܽ;)Ll/᩸֨ܽ;
    .locals 2

    .line 955
    invoke-static {p0}, Ll/ܿ֨ܽ;->ۧ(Ll/ۛۚܽ;)Ll/ܿ֨ܽ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 956
    invoke-static {v0}, Ll/ܿ֨ܽ;->ܽ(Ll/ܿ֨ܽ;)I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ll/ܿ֨ܽ;->ۧ(Ll/ܿ֨ܽ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 959
    :cond_0
    new-instance v1, Ll/᩸֨ܽ;

    invoke-direct {v1, p0, v0, p1}, Ll/᩸֨ܽ;-><init>(Ll/ۛۚܽ;Ll/ܿ֨ܽ;Ll/ۛۚܽ;)V

    return-object v1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩸֨ܽ;)Ll/ۛۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸֨ܽ;->ᩳ:Ll/ۛۚܽ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩸֨ܽ;)Ll/ܿ֨ܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸֨ܽ;->ܿ:Ll/ܿ֨ܽ;

    return-object p0
.end method
