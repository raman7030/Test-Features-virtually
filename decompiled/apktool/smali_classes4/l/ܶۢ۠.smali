.class public final Ll/ܶۢ۠;
.super Ljava/lang/Object;
.source "27L2"

# interfaces
.implements Ll/᩸ۢ۠;


# instance fields
.field public final ᩸:Ll/ۤܶ۠;

.field public final ᩹:Ll/ۙ֨֨;


# direct methods
.method public constructor <init>(Ll/ۤܶ۠;Ll/ۙ֨֨;)V
    .locals 0

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    iput-object p1, p0, Ll/ܶۢ۠;->᩸:Ll/ۤܶ۠;

    .line 207
    iput-object p2, p0, Ll/ܶۢ۠;->᩹:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ᩸֨;)Ljava/lang/Object;
    .locals 3

    .line 217
    new-instance v0, Ll/᩺ܶ۠;

    new-instance v1, Ll/ۤ᩸֨;

    iget-object v2, p0, Ll/ܶۢ۠;->᩹:Ll/ۙ֨֨;

    invoke-direct {v1, v2, p1}, Ll/ۤ᩸֨;-><init>(Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    iget-object p1, p0, Ll/ܶۢ۠;->᩸:Ll/ۤܶ۠;

    invoke-direct {v0, p1, v1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ۘ()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
