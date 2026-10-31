.class public final Ll/ܰۜܿ;
.super Ljava/lang/Object;
.source "B4S2"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/ܶۜܿ;


# direct methods
.method public constructor <init>(Ll/ܶۜܿ;Ljava/lang/String;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Ll/ܰۜܿ;->ۧ:Ll/ܶۜܿ;

    .line 91
    iput-object p2, p0, Ll/ܰۜܿ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܰۜܿ;
    .locals 2

    .line 101
    new-instance v0, Ll/ܰۜܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ܰۜܿ;-><init>(Ll/ܶۜܿ;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ll/ܶۜܿ;)Ll/ܰۜܿ;
    .locals 2

    .line 96
    new-instance v0, Ll/ܰۜܿ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ܰۜܿ;-><init>(Ll/ܶۜܿ;Ljava/lang/String;)V

    return-object v0
.end method
