.class public final Ll/ۧۜ۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 917
    iput-object p1, p0, Ll/ۧۜ۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 4

    .line 919
    check-cast p2, Ll/ܳ֡֨;

    .line 920
    iget-object p1, p0, Ll/ۧۜ۠;->ܿ:Ll/᩶ۜ۠;

    iget-object v0, p1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p1

    .line 921
    new-instance v0, Ll/۠ۜ۠;

    invoke-direct {v0, p1}, Ll/۠ۜ۠;-><init>(Ll/ۤܶ۠;)V

    iput-object v0, p2, Ll/ܳ֡֨;->ᩳ֫:Ll/ᩳ᩶۠;

    .line 925
    invoke-virtual {p1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p1

    .line 926
    iget-object v0, p2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_0

    const-string v0, ".java"

    .line 927
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 928
    invoke-virtual {v1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 929
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x100000000000L

    or-long/2addr v0, v2

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    :cond_0
    return-void
.end method
