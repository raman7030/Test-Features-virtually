.class public abstract Ll/ᩳ۠۠;
.super Ljava/lang/Object;
.source "G3L1"


# static fields
.field public static final ᩸:Ll/ۙ֨۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 63
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ᩳ۠۠;->᩸:Ll/ۙ֨۠;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ᩳ۠۠;
    .locals 2

    .line 66
    sget-object v0, Ll/ᩳ۠۠;->᩸:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ۠۠;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Ll/ۤ֨۠;

    .line 74
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 75
    sget-object v1, Ll/ᩳ۠۠;->᩸:Ll/ۙ֨۠;

    invoke-virtual {p0, v1, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public abstract ֫()V
.end method

.method public abstract ֫(Ll/ܳ֡֨;Ll/۫֨۠;)V
.end method
