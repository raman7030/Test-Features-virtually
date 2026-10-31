.class public final Ll/ܽۢۜ;
.super Ljava/lang/Object;
.source "F70I"


# static fields
.field public static final ܽ:Ll/ܽۢۜ;

.field public static final ᩳ:Ll/ܽۢۜ;


# instance fields
.field public final ֫:Ll/ۧۢۜ;

.field public final ۧ:Ll/ᩳۢۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 40
    new-instance v0, Ll/ܽۢۜ;

    sget-object v1, Ll/ᩳۢۜ;->᩶:Ll/ᩳۢۜ;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܽۢۜ;-><init>(Ll/ᩳۢۜ;Ll/ۧۢۜ;)V

    sput-object v0, Ll/ܽۢۜ;->ܽ:Ll/ܽۢۜ;

    .line 41
    new-instance v0, Ll/ܽۢۜ;

    sget-object v1, Ll/ᩳۢۜ;->ۙ:Ll/ᩳۢۜ;

    invoke-direct {v0, v1, v2}, Ll/ܽۢۜ;-><init>(Ll/ᩳۢۜ;Ll/ۧۢۜ;)V

    sput-object v0, Ll/ܽۢۜ;->ᩳ:Ll/ܽۢۜ;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۢۜ;Ll/ۧۢۜ;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/ܽۢۜ;->ۧ:Ll/ᩳۢۜ;

    .line 48
    iput-object p2, p0, Ll/ܽۢۜ;->֫:Ll/ۧۢۜ;

    return-void
.end method

.method public static ֫(Ll/ۧۢۜ;)Ll/ܽۢۜ;
    .locals 2

    .line 56
    new-instance v0, Ll/ܽۢۜ;

    sget-object v1, Ll/ᩳۢۜ;->᩹:Ll/ᩳۢۜ;

    invoke-direct {v0, v1, p0}, Ll/ܽۢۜ;-><init>(Ll/ᩳۢۜ;Ll/ۧۢۜ;)V

    return-object v0
.end method
