.class public final Ll/᩺ۢܿ;
.super Ljava/lang/Object;
.source "P708"


# static fields
.field public static final ܽ:Ll/᩺ۢܿ;


# instance fields
.field public final ֫:Ll/ܶۜܿ;

.field public final ۧ:Ll/᩺ܺܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 17
    new-instance v0, Ll/᩺ۢܿ;

    sget-object v1, Ll/ۨۢܿ;->ۙ:Ll/ۨۢܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/᩺ۢܿ;-><init>(Ll/ܶۜܿ;Ll/᩺ܺܿ;)V

    sput-object v0, Ll/᩺ۢܿ;->ܽ:Ll/᩺ۢܿ;

    return-void
.end method

.method public constructor <init>(Ll/ܶۜܿ;Ll/᩺ܺܿ;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/᩺ۢܿ;->֫:Ll/ܶۜܿ;

    .line 34
    iput-object p2, p0, Ll/᩺ۢܿ;->ۧ:Ll/᩺ܺܿ;

    return-void
.end method

.method public static ֫(Ll/ܶۜܿ;)Ll/᩺ۢܿ;
    .locals 3

    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 44
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/᩺ܺܿ;->ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    .line 47
    :cond_1
    sget v1, Ll/ۙ᩷ܿ;->ۧ:I

    invoke-virtual {p0, v1}, Ll/ܶۜܿ;->֫(I)Ll/᩸᩷ܿ;

    .line 48
    :goto_1
    new-instance v1, Ll/᩺ۢܿ;

    .line 49
    sget-object v2, Ll/ۨۢܿ;->ۙ:Ll/ۨۢܿ;

    invoke-direct {v1, p0, v0}, Ll/᩺ۢܿ;-><init>(Ll/ܶۜܿ;Ll/᩺ܺܿ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 52
    :catch_0
    sget-object p0, Ll/᩺ۢܿ;->ܽ:Ll/᩺ۢܿ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ܶۜܿ;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩺ۢܿ;->֫:Ll/ܶۜܿ;

    return-object v0
.end method

.method public final ۧ()Ll/᩺ܺܿ;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/᩺ۢܿ;->ۧ:Ll/᩺ܺܿ;

    return-object v0
.end method
