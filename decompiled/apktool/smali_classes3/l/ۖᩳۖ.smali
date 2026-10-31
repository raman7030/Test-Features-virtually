.class public final enum Ll/ۖᩳۖ;
.super Ll/֡ᩳۖ;
.source "Q86R"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, p2, v0}, Ll/֡ᩳۖ;-><init>(Ljava/lang/String;ILl/ۖᩳۖ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܿۜۖ;)Ljava/lang/Double;
    .locals 2

    .line 43
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩸()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ֫(Ll/ܿۜۖ;)Ljava/lang/Number;
    .locals 0

    .line 40
    invoke-virtual {p0, p1}, Ll/ۖᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
