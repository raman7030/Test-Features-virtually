.class public final Ll/ᩳ۟֡;
.super Ljava/lang/Object;
.source "J55P"

# interfaces
.implements Ll/᩹֫ۚ;


# instance fields
.field public final synthetic ᩸:Ll/᩻۟֡;


# direct methods
.method public constructor <init>(Ll/᩻۟֡;)V
    .locals 0

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ۟֡;->᩸:Ll/᩻۟֡;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "this"

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 191
    iget-object v0, p0, Ll/ᩳ۟֡;->᩸:Ll/᩻۟֡;

    invoke-static {v0}, Ll/᩻۟֡;->֫(Ll/᩻۟֡;)Ll/᩷ۨ֡;

    move-result-object v0

    iget-object v0, v0, Ll/᩷ۨ֡;->ᩳ:Ll/ܽۨ֡;

    .line 183
    iget-object v0, v0, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {v0}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
