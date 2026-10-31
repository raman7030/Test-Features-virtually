.class public Ll/ܿܰۘ;
.super Ljava/lang/Object;
.source "J1DS"

# interfaces
.implements Ll/ۨ۟ۘ;


# instance fields
.field public ᩸:C

.field public ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(CLjava/lang/Object;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-char p1, p0, Ll/ܿܰۘ;->᩸:C

    .line 115
    iput-object p2, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 619
    invoke-virtual {p0}, Ll/ܿܰۘ;->ܿ()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    return-object v0
.end method

.method public final ܿ()C
    .locals 1

    .line 120
    iget-char v0, p0, Ll/ܿܰۘ;->᩸:C

    return v0
.end method
