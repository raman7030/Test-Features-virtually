.class public final Ll/ܿۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ll/ۚۖۖ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ۚۖۖ;)V
    .locals 1

    const/4 v0, 0x0

    .line 3181
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 3182
    iput-object p3, p0, Ll/ܿۖۖ;->᩶:Ll/ۚۖۖ;

    .line 3183
    iput-object p2, p0, Ll/ܿۖۖ;->ۙ:Ljava/lang/String;

    .line 3184
    iput-object p1, p0, Ll/ܿۖۖ;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 3168
    iget-object v0, p0, Ll/ܿۖۖ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 3163
    iget-object v0, p0, Ll/ܿۖۖ;->᩶:Ll/ۚۖۖ;

    invoke-virtual {v0}, Ll/ۚۖۖ;->ۢ()Ll/ۤۡۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 3178
    iget-object v0, p0, Ll/ܿۖۖ;->᩶:Ll/ۚۖۖ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 3173
    iget-object v0, p0, Ll/ܿۖۖ;->ۙ:Ljava/lang/String;

    return-object v0
.end method
