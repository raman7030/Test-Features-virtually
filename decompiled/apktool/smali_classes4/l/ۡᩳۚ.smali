.class public final Ll/ۡᩳۚ;
.super Ll/ۢᩳۚ;
.source "F62V"

# interfaces
.implements Ll/ܶ֫ۚ;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final ᩶:I

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p2}, Ll/ۢᩳۚ;-><init>(I)V

    .line 64
    iput p5, p0, Ll/ۡᩳۚ;->᩶:I

    .line 65
    iput-object p1, p0, Ll/ۡᩳۚ;->᩹:Ljava/lang/String;

    .line 66
    iput-object p3, p0, Ll/ۡᩳۚ;->ۗ:Ljava/lang/String;

    .line 67
    iput-object p4, p0, Ll/ۡᩳۚ;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۡᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۡᩳۚ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۡᩳۚ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 85
    iget v0, p0, Ll/ۡᩳۚ;->᩶:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method
