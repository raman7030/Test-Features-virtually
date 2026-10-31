.class public final Ll/֨֨ܽ;
.super Ll/֡֨ܽ;
.source "Z6QT"


# instance fields
.field public final ܽ:Ll/ۙ֡ܽ;

.field public final ᩳ:Ll/ۧۚܽ;


# direct methods
.method public constructor <init>(Ll/ۙ֡ܽ;)V
    .locals 0

    .line 917
    invoke-direct {p0, p1}, Ll/֡֨ܽ;-><init>(Ll/ۛۚܽ;)V

    .line 918
    iput-object p1, p0, Ll/֨֨ܽ;->ܽ:Ll/ۙ֡ܽ;

    .line 919
    iget-object p1, p1, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    iput-object p1, p0, Ll/֨֨ܽ;->ᩳ:Ll/ۧۚܽ;

    return-void
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/֨֨ܽ;
    .locals 1

    .line 926
    instance-of v0, p0, Ll/ۙ֡ܽ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۙ֡ܽ;

    iget v0, p0, Ll/ۜۚܽ;->ۧ:I

    if-lez v0, :cond_0

    .line 927
    new-instance v0, Ll/֨֨ܽ;

    invoke-direct {v0, p0}, Ll/֨֨ܽ;-><init>(Ll/ۙ֡ܽ;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/֨֨ܽ;)Ll/ۙ֡ܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨֨ܽ;->ܽ:Ll/ۙ֡ܽ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/֨֨ܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨֨ܽ;->ᩳ:Ll/ۧۚܽ;

    return-object p0
.end method
