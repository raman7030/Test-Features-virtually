.class public final Ll/᩹᩺ۖ;
.super Ljava/lang/Object;
.source "J9FZ"


# instance fields
.field public ֫:Ll/᩶᩺ۖ;


# direct methods
.method public constructor <init>(Ljava/util/Random;)V
    .locals 5

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    new-instance v0, Ll/᩶᩺ۖ;

    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object v0, p0, Ll/᩹᩺ۖ;->֫:Ll/᩶᩺ۖ;

    .line 81
    new-instance v1, Ll/᩵ܰۖ;

    sget-object v2, Ll/ۘܰۖ;->ۗ:Ll/ۘܰۖ;

    sget-object v3, Ll/ᩴܰۖ;->ۙ:Ll/ᩴܰۖ;

    sget-object v4, Ll/ۖܰۖ;->᩶:Ll/ۖܰۖ;

    invoke-direct {v1, v2, v3, v4}, Ll/᩵ܰۖ;-><init>(Ll/ۘܰۖ;Ll/ᩴܰۖ;Ll/ۖܰۖ;)V

    invoke-static {v0, v1}, Ll/᩶᩺ۖ;->֫(Ll/᩶᩺ۖ;Ll/᩵ܰۖ;)V

    .line 83
    invoke-static {v0}, Ll/᩶᩺ۖ;->ۧ(Ll/᩶᩺ۖ;)V

    const/16 v1, 0x20

    new-array v1, v1, [B

    .line 85
    invoke-static {v0, v1}, Ll/᩶᩺ۖ;->֫(Ll/᩶᩺ۖ;[B)V

    .line 86
    invoke-static {v0}, Ll/᩶᩺ۖ;->֫(Ll/᩶᩺ۖ;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextBytes([B)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩶᩺ۖ;
    .locals 2

    .line 125
    new-instance v0, Ll/᩶᩺ۖ;

    iget-object v1, p0, Ll/᩹᩺ۖ;->֫:Ll/᩶᩺ۖ;

    invoke-direct {v0, v1}, Ll/᩶᩺ۖ;-><init>(Ll/᩶᩺ۖ;)V

    return-object v0
.end method
