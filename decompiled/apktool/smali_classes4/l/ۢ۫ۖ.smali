.class public final Ll/ۢ۫ۖ;
.super Ll/᩹۫ۖ;
.source "Y9J1"


# instance fields
.field public ᩶:Z


# direct methods
.method public constructor <init>([BZ)V
    .locals 1

    .line 37
    sget-object v0, Ll/ۨ۬ۖ;->ܿ:Ll/ۨ۬ۖ;

    invoke-direct {p0, v0, p1}, Ll/᩹۫ۖ;-><init>(Ll/ۨ۬ۖ;[B)V

    .line 38
    iput-boolean p2, p0, Ll/ۢ۫ۖ;->᩶:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۢ۫ۖ;)Z
    .locals 0

    .line 27
    iget-boolean p0, p0, Ll/ۢ۫ۖ;->᩶:Z

    return p0
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 43
    iget-boolean v0, p0, Ll/ۢ۫ۖ;->᩶:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
