.class public final enum Ll/᩻ᩳۖ;
.super Ll/᩷ᩳۖ;
.source "3858"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Ll/᩷ᩳۖ;-><init>(Ljava/lang/String;ILl/᩻ᩳۖ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/Long;)Ll/᩺ܽۖ;
    .locals 1

    if-nez p1, :cond_0

    .line 38
    sget-object p1, Ll/۟ܽۖ;->֫:Ll/۟ܽۖ;

    return-object p1

    .line 40
    :cond_0
    new-instance v0, Ll/ᩳᩳۖ;

    invoke-direct {v0, p1}, Ll/ᩳᩳۖ;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method
